grammar Exp;

@header {
package sk.host.arabasso.bassolve.parser.antlr;
}

equation
    : expression
    | expression relop expression
    ;

expression
    : multiplyingExpression ((PLUS | MINUS) multiplyingExpression)*
    ;

multiplyingExpression
    : powExpression ((TIMES | DIV) powExpression)*
    ;

powExpression
    : atom (POW multiplyingExpression)?
    ;

atom
    : scientific
    | variable
    | LPAREN expression RPAREN
    | func
    ;

scientific
    : number (E number)?
    ;

func
    : identifier LPAREN expression RPAREN
    ;

relop
    : EQ
    | GT
    | LT
    ;

number
    : MINUS? DIGIT + (POINT DIGIT +)?
    | MINUS? DIGIT + (POINT DIGIT +)? variable
    ;

variable
    : MINUS? identifier
    ;

identifier
	: LETTER (LETTER | DIGIT)*
	;

LPAREN
    : '('
    ;

RPAREN
    : ')'
    ;

PLUS
    : '+'
    ;

MINUS
    : '-'
    ;

TIMES
    : '*'
    ;

DIV
    : '/'
    ;

GT
    : '>'
    ;

LT
    : '<'
    ;

EQ
    : '='
    ;

POINT
    : '.'
    ;

E
    : 'e' | 'E'
    ;

POW
    : '^'
    ;

LETTER
    : ('a' .. 'z') | ('A' .. 'Z')
    ;

DIGIT
    : ('0' .. '9')
    ;

WS
    : [ \r\n\t] + -> skip
    ;
