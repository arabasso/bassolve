grammar Exp;

@header {
package sk.host.arabasso.bassolve.core.parser;
}

compileUnit
    : expression EOF
    ;

expression
    : op=(PLUS|MINUS) expression                                # unaryExpression
    | left=multiplyingExpr op=(PLUS|MINUS) right=expression     # plusMinusExpression
    | multiplyingExpr                                           # multiplyingExpressionNext
    ;

multiplyingExpr
    : left=powExpr op=(TIMES|DIV) right=multiplyingExpr         # timesDivExpression
    | powExpr                                                   # powExpressionNext
    ;

powExpr
    : left=atom op=POW right=powExpr                            # powExpression
    | atom                                                      # atomExpressionNext
    ;

atom
    : value=number                                              # numberExpression
    | value=identifier                                          # identfierExpression
    | func                                                      # funcExpressionNext
    | LPAREN expression RPAREN                                  # parensExpression
    ;

//expression
//    : LPAREN expression RPAREN                         # parensExpression
//    | op=(PLUS|MINUS) expression                       # unaryExpression
//    | left=expression op=POW right=expression          # infixExpression
//    | left=expression op=(TIMES|DIV) right=expression  # infixExpression
//    | left=expression op=(PLUS|MINUS) right=expression # infixExpression
//    | id=identifier LPAREN expression RPAREN           # funcExpression
//    | value=number                                     # numberExpr
//    ;

number
    : DIGIT+ (POINT DIGIT+)? (E (PLUS|MINUS) DIGIT+)?
    ;

func
    : id=identifier LPAREN expression RPAREN
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
    : [a-zA-Z]
    ;

DIGIT
    : [0-9]
    ;

WS
    : [ \r\n\t] + -> skip
    ;
