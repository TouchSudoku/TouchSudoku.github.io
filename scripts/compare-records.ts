#!/usr/bin/env npx ts-node

// compare-records.ts
//
// Merges a new record block into an existing record file.
// Usage: npx ts-node scripts/compare-records.ts <record-file> <new-block-file>
//
// Rules:
// - New block must beat the submitter's current best (fewer touches) to be accepted
// - If accepted: replace all of the submitter's existing blocks with the new one
// - Other users' blocks are kept (best one per user), sorted ASC by touch count
// - Max 3 blocks total; if over, drop the worst
//
// Exit codes: 0 = merged (file updated), 1 = rejected (existing is better or equal)

import { readFileSync, writeFileSync, existsSync } from 'fs'

const HEADER_RE = /^(\d+) numbers, (\d+) touches in .+ by (\S+)$/

interface Block {
  content: string
  touches: number
  login: string
}

function parseBlock(raw: string): Block | null {
  const firstLine = raw.split('\n')[0]
  const m = HEADER_RE.exec(firstLine)
  if (!m) return null
  return { content: raw, touches: parseInt(m[2], 10), login: m[3] }
}

function readBlocks(filePath: string): Block[] {
  if (!existsSync(filePath)) return []
  const raw = readFileSync(filePath, 'utf-8')
  return raw.trimEnd().split('\n===\n')
    .map(b => b.trim())
    .filter(Boolean)
    .map(parseBlock)
    .filter((b): b is Block => b !== null)
}

const [recordFile, newBlockFile] = process.argv.slice(2)

if (!recordFile || !newBlockFile) {
  console.error('Usage: compare-records.ts <record-file> <new-block-file>')
  process.exit(1)
}

if (!existsSync(newBlockFile)) {
  console.error(`New block file not found: ${newBlockFile}`)
  process.exit(1)
}

const newBlock = parseBlock(readFileSync(newBlockFile, 'utf-8').trim())
if (!newBlock) {
  console.error('Could not parse new block header')
  process.exit(1)
}

const existing = readBlocks(recordFile)

// Find submitter's current best
const submitterBest = existing.filter(b => b.login === newBlock.login)
  .sort((a, b) => a.touches - b.touches)[0] ?? null

if (submitterBest && newBlock.touches >= submitterBest.touches) {
  console.error(`Rejected: existing best for ${newBlock.login} is ${submitterBest.touches} touches, new is ${newBlock.touches}`)
  process.exit(1)
}

console.error(`Accepted: ${newBlock.login} improved from ${submitterBest?.touches ?? 'none'} to ${newBlock.touches} touches`)

// Keep only best block per other user, then add new block
const others = Object.values(
  existing
    .filter(b => b.login !== newBlock.login)
    .reduce<Record<string, Block>>((acc, b) => {
      if (!acc[b.login] || b.touches < acc[b.login].touches) acc[b.login] = b
      return acc
    }, {})
)

// Sort ASC, cap at 3 (new block counts as 1)
const merged = [newBlock, ...others]
  .sort((a, b) => a.touches - b.touches)
  .slice(0, 3)

const output = merged.map(b => b.content).join('\n===\n') + '\n'
writeFileSync(recordFile, output)
console.error(`Written ${merged.length} block(s) to ${recordFile}`)
process.exit(0)
