#!/usr/bin/env bun
// check-record.ts
//
// Verifies the integrity of a TouchSudoku record file.
// Usage: bun run scripts/check-record.ts <path-to-record-file>
// Exit 0 = OK, Exit 1 = errors found.
//
// Record file format:
//   [block (\n===\n block)*]\n
//
// Each block:
//   N numbers, T touches in M'SS"CC by LOGIN\n
//   <initial-puzzle>\n
//   1: <annotation> # <t>T<sec>"<cc>: <gesture>\n
//   ...
//   <final-puzzle>\n
//
// Rules:
//   1. File name = initial puzzle (line 2) of first (best) block
//   2. For each block:
//      a. N = count of '0' in initial puzzle (cells solved from scratch)
//      b. initial puzzle matches [0-9]{81} (0 = empty, no a-i pre-fills)
//      c. T = sum of touch counts from move lines
//      d. TIME ≈ reconstructed from sum of move line times (centisecond precision)
//      e. Move indices are consecutive 1..M
//      f. final puzzle is 81 chars of [1-9a-i] (fully solved, no 0s)
//   3. Blocks sorted ASC by T
//   4. Max 3 blocks

import { readFileSync } from 'fs'
import { basename } from 'path'

const PUZZLE_RE    = /^[1-9a-i]{81}$/   // final puzzle: fully solved, no 0s
const INITIAL_RE   = /^[0-9]{81}$/      // initial puzzle: only 0-9 (no URL pre-fills)
const HEADER_RE = /^(\d+) numbers, (\d+) touches in (\d+)'(\d{2})"(\d{2}) by (\S+)$/
const MOVE_RE   = /^(\d+): .+ # (\d+)T(\d+)"(\d{2}): .*$/

function err(msg: string): void {
  process.stderr.write(`  ERROR: ${msg}\n`)
}

function warn(msg: string): void {
  process.stderr.write(`  WARN:  ${msg}\n`)
}

function verifyBlock(block: string, blockIdx: number): { ok: boolean; touchCount: number; fixedBlock?: string; timeFixed?: boolean } {
  const label = `Block ${blockIdx + 1}`
  let ok = true
  let timeFixed = false
  let fixedBlock: string | undefined = undefined
  const lines = block.split('\n')

  if (lines.length < 4) {
    err(`${label}: too few lines (${lines.length})`)
    return { ok: false, touchCount: 0 }
  }

  const headerLine  = lines[0]
  const initialLine = lines[1]
  const finalLine   = lines[lines.length - 1]
  const moveLines   = lines.slice(2, lines.length - 1)

  // ── Final puzzle ────────────────────────────────────────────────────────
  if (!PUZZLE_RE.test(finalLine)) {
    err(`${label}: final puzzle is not 81 chars of [1-9a-i] (got "${finalLine.slice(0, 20)}…")`)
    ok = false
  }

  // ── Initial puzzle ───────────────────────────────────────────────────────
  if (!INITIAL_RE.test(initialLine)) {
    err(`${label}: initial puzzle is not 81 chars of [0-9] (got "${initialLine.slice(0, 20)}…")`)
    ok = false
  }
  if (/[a-i]/.test(initialLine)) {
    err(`${label}: initial puzzle contains pre-filled cells [a-i] (records must show user-solved moves only)`)
    ok = false
  }
  // Every non-zero char in initial must match the final puzzle
  for (let i = 0; i < 81; i++) {
    const ic = initialLine[i], fc = finalLine[i]
    if (ic !== '0' && ic !== fc) {
      err(`${label}: initial/final mismatch at cell ${i}: initial='${ic}' final='${fc}'`)
      ok = false
      break
    }
  }

  // ── Header ───────────────────────────────────────────────────────────────
  const hm = HEADER_RE.exec(headerLine)
  if (!hm) {
    err(`${label}: header line does not match expected format: "${headerLine}"`)
    return { ok: false, touchCount: 0 }
  }
  const [, hN, hT, hMm, hSs, hCc] = hm
  const headerN   = parseInt(hN)
  const headerT   = parseInt(hT)
  const headerMm  = parseInt(hMm)
  const headerSs  = parseInt(hSs)
  const headerCc  = parseInt(hCc)

  // N = count of '0' in initial puzzle (cells the user solved from scratch)
  const actualN = (initialLine.match(/0/g) ?? []).length
  if (headerN !== actualN) {
    err(`${label}: N=${headerN} but initial puzzle has ${actualN} empty cells (0s)`)
    ok = false
  }

  // ── Move lines ───────────────────────────────────────────────────────────
  if (moveLines.length === 0) {
    err(`${label}: no move lines found`)
    ok = false
  }

  let sumTouches = 0
  let sumMs      = 0

  for (let i = 0; i < moveLines.length; i++) {
    const line = moveLines[i]
    const mm   = MOVE_RE.exec(line)
    if (!mm) {
      err(`${label}: move line ${i + 1} does not match expected format: "${line}"`)
      ok = false
      continue
    }
    const [, idx, t, sec, cc] = mm
    if (parseInt(idx) !== i + 1) {
      err(`${label}: move index mismatch at line ${i + 1}: got ${idx}`)
      ok = false
    }
    sumTouches += parseInt(t)
    sumMs      += parseInt(sec) * 1000 + parseInt(cc) * 10
  }

  // ── T ────────────────────────────────────────────────────────────────────
  if (headerT !== sumTouches) {
    err(`${label}: T=${headerT} but sum of move touch counts = ${sumTouches}`)
    ok = false
  }

  // ── TIME ─────────────────────────────────────────────────────────────────
  // Move lines store floor(ms/10) centiseconds, so sumMs may be up to
  // moveLines.length * 9 ms less than the original totalMs. Reconstruct
  // the expected TIME from sumMs the same way the app does.
  const totalSec    = Math.floor(sumMs / 1000)
  const recCc       = Math.floor((sumMs % 1000) / 10)
  const recMm       = Math.floor(totalSec / 60)
  const recSs       = totalSec % 60

  const timeMatch = recMm === headerMm && recSs === headerSs && recCc === headerCc
  if (!timeMatch) {
    // Allow ±1 centisecond tolerance per move due to truncation
    const toleranceMs = moveLines.length * 10
    const diff = Math.abs(
      (headerMm * 60 + headerSs) * 1000 + headerCc * 10 - sumMs
    )
    if (diff > toleranceMs) {
      err(`${label}: TIME=${headerMm}'${headerSs}"${headerCc} but move times sum to ${recMm}'${recSs}"${recCc} (diff ${diff}ms > tolerance ${toleranceMs}ms)`)
      // This is a fixable error — auto-correct the time in the block
      const login = headerLine.match(/\bby\s+(\S+)$/)?.[1] || 'unknown'
      const newHeaderLine = `${actualN} numbers, ${sumTouches} touches in ${recMm}'${String(recSs).padStart(2, '0')}"${String(recCc).padStart(2, '0')} by ${login}`
      const fixedLines = [newHeaderLine, ...lines.slice(1)]
      fixedBlock = fixedLines.join('\n')
      timeFixed = true
      warn(`${label}: Time auto-corrected from ${headerMm}'${headerSs}"${headerCc} to ${recMm}'${recSs}"${recCc}`)
    } else {
      warn(`${label}: TIME ${headerMm}'${headerSs}"${headerCc} vs reconstructed ${recMm}'${recSs}"${recCc} (within truncation tolerance)`)
    }
  }

  return { ok, touchCount: headerT, fixedBlock, timeFixed }
}

interface CheckResult {
  ok: boolean
  hasTimeFixedBlocks: boolean
  fixedBlocks?: Record<number, string>
}

function checkRecord(filePath: string): CheckResult {
  const fileName = basename(filePath)
  let raw: string
  try {
    raw = readFileSync(filePath, 'utf8')
  } catch (e) {
    console.error(`Cannot read file: ${filePath}`)
    return { ok: false, hasTimeFixedBlocks: false }
  }

  let allOk = true
  let hasTimeFixedBlocks = false
  const fixedBlocks: Record<number, string> = {}

  // Must end with a single newline (empty line at end)
  if (!raw.endsWith('\n')) {
    err('File does not end with a newline')
    allOk = false
  }

  const blocks = raw.trimEnd().split('\n===\n').map(b => b.trim()).filter(Boolean)

  if (blocks.length === 0) {
    err('File contains no record blocks')
    return { ok: false, hasTimeFixedBlocks: false }
  }
  if (blocks.length > 3) {
    err(`File contains ${blocks.length} blocks (max 3)`)
    allOk = false
  }

  // File name must equal the initial puzzle (line 2) of the first (best) block
  const firstLines = blocks[0].split('\n')
  const firstInitialLine = firstLines[1] ?? ''
  if (fileName !== firstInitialLine) {
    err(`File name does not match initial puzzle of first block\n  file:    ${fileName}\n  initial: ${firstInitialLine}`)
    allOk = false
  }

  // Verify each block
  const touchCounts: number[] = []
  for (let i = 0; i < blocks.length; i++) {
    const { ok, touchCount, fixedBlock, timeFixed } = verifyBlock(blocks[i], i)
    if (!ok) allOk = false
    if (fixedBlock) {
      fixedBlocks[i] = fixedBlock
      hasTimeFixedBlocks = true
    }
    if (timeFixed) {
      hasTimeFixedBlocks = true
    }
    touchCounts.push(touchCount)
  }

  // Blocks must be sorted ASC by touch count
  for (let i = 1; i < touchCounts.length; i++) {
    if (touchCounts[i] < touchCounts[i - 1]) {
      err(`Blocks not sorted by touch count ASC: block ${i} (T=${touchCounts[i]}) < block ${i - 1} (T=${touchCounts[i - 1]})`)
      allOk = false
    }
  }

  return { ok: allOk, hasTimeFixedBlocks, fixedBlocks }
}

// ── Main ──────────────────────────────────────────────────────────────────
const [, , filePath] = process.argv
if (!filePath) {
  console.error('Usage: bun run scripts/check-record.ts <record-file>')
  process.exit(1)
}

console.error(`Checking: ${filePath}`)
const { ok, hasTimeFixedBlocks, fixedBlocks } = checkRecord(filePath)

// Output result + any fixed blocks as JSON to stdout (only JSON, no other text)
const result = { ok, hasTimeFixedBlocks, fixedBlocks }
process.stdout.write(JSON.stringify(result, null, 2) + '\n')

if (ok) {
  process.exit(0)
} else if (hasTimeFixedBlocks) {
  // Exit with code 2 = has errors but can fix with time corrections
  process.exit(2)
} else {
  process.exit(1)
}
