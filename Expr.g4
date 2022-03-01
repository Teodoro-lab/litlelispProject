grammar Expr;
prog: operation;

operation: '(' operator expr* ')';
expr: empty* operation empty* | empty* number empty*;

numberlist: (number empty)*;
number: INT+ | (INT+) '.' (INT+);
operator: '+' | '-' | '*' | '/';

INT: [0-9]+;
empty: ' ';
WS: [\t\n] -> skip;