grammar Sudoku;

sudoku
    : puzzle '&' solution WS*
    ;

puzzle
    : PUZZLE
    ;

solution
    : answer '=' logic
    ;

answer
    : ANS
    ;

logic
    : single_target ('-' pointer)*
    | double_target (double_clue)*
    ;
    
double_clue
    : '-' double_pointer
    | '+' double_filler
    ;

single_target
    : simple_target
    | simple_target ('+' filler)*
    ;
    
simple_target
    : BOX
    | COL
    | ROW
    ;

double_target
    : '('
            '(' simple_target '+' simple_target ')'
            ('+' filler)*
            ('-' pointer)*
       ')'
    | '(' simple_target '+' simple_target ')'
            ('+' filler)*
            ('-' pointer)*
    ;

filler
    : single_filler
    | multi_filler
    | unit_filler
    | '(' unit_filler ')'
    ;

single_filler
    : CELL
    | '(' CELL ')'
    ;

multi_filler
    : '(' filler ('+' filler)+ ')'
    ;

unit_filler
    : '(' single_target ('-' pointer)* ')'
    | '(' single_target ('+' filler)* ')'
    ;

double_filler
    : '(' single_target ('+' filler '+' filler)* ')'
    ;

pointer
    : simple_pointer
    | unit_pointer
    ;

simple_pointer
    : CELL
    ;

unit_pointer
    : simple_target
    | '(' single_target ('-' pointer)* ')'
    ;

double_pointer
    : '(' single_target ('-' pointer)* ')'
    ;
    
NUM : [1-9] ;
BOX : 'b' NUM ;
COL : 'c' NUM ;
ROW : 'r' NUM ;
CELL : NUM NUM ;
ANS : CELL NUM ;
PUZZLE : [a-j0-9]+ ;
WS : [ \t\r\n]+ -> skip ;