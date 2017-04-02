grammar Exp;

@header {
package sk.host.arabasso.bassolve.core.parser;
}

compileUnit
    : equation EOF
    ;

equation
    : left=expression op=(EQ|NEQ|LT|GT|LTE|GTE) right=expression    # equationExpression
    | expression                                                    # expressionNext
    ;

expression
    : op=(PLUS|MINUS) expression                                # unaryExpression
    | left=expression op=(PLUS|MINUS) right=multiplyingExpr     # plusMinusExpression
    | multiplyingExpr                                           # multiplyingExpressionNext
    ;

multiplyingExpr
    : left=multiplyingExpr op=(TIMES|DIV) right=powExpr         # timesDivExpression
    | powExpr                                                   # powExpressionNext
    ;

powExpr
    : left=powExpr op=POW right=atom                            # powExpression
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

GTE
    : '>='
    ;

LT
    : '<'
    ;

LTE
    : '<='
    ;

EQ
    : '='
    ;

NEQ
    : '<>' | '!='
    ;

POINT
    : '.'
    ;

POW
    : '^'
    ;

LETTER
    : 'a'..'z' | 'A'..'Z'
    ;

DIGIT
    : '0'..'9'
    ;

E
    : 'e' | 'E'
    ;

WS
    : [ \r\n\t] + -> skip
    ;
