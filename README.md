# Touch Sudoku Records

This branch stores community touch records for [Touch Sudoku](https://touchsudoku.github.io).

Each file in the `records/` folder is named after the puzzle string (81 digits).
Up to 3 best records per puzzle are kept, sorted by fewest touches.

## Format

Each record block:
```
N numbers, T touches in M'SS"CC by LOGIN
<initial-puzzle>
1: <logic-string> # <t>T<sec>"<cc>: <gesture>
2: <logic-string> # <t>T<sec>"<cc>: <gesture>
...
<final-puzzle>
```

Where:
- `N` = count of empty cells (0s) in the initial puzzle
- `T` = total touches across all moves
- `M'SS"CC` = time (minutes'seconds"centiseconds)
- `LOGIN` = GitHub username
- `<initial-puzzle>` = 81-character puzzle string (0 = empty, no a-i; records show user-solved moves only)
- `<logic-string>` = Touch Sudoku Logic of the move
- `<t>` = touches for that move
- `<sec>"<cc>` = time elapsed for that move
- `<final-puzzle>` = completed 81-character puzzle (1-9a-i, no 0s)

Blocks are separated by `===`.
