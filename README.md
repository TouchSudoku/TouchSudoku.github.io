# Touch Sudoku Records

This branch stores community touch records for [Touch Sudoku](https://touchsudoku.github.io).

Each file in the `records/` folder is named after the puzzle string (81 digits).
Up to 3 best records per puzzle are kept, sorted by fewest touches.

## Format

Each record block:
```
<github_login> <avatar_url>
<history content>
```

Blocks are separated by `===`.
