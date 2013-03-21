lexer grammar MicroParser;

KEYWORD :	('PROGRAM') | ('BEGIN') | ('END') | ('FUNCTION') | ('READ') | ('WRITE')
	|	('IF') | ('THEN') | ('ELSE') | ('ENDIF') | ('REPEAT') | ('UNTIL')
	| ('CONTINUE') | ('BREAK') | ('RETURN') | ('INT') | ('VOID') | ('STRING') | ('FLOAT')
	;
	
IDENTIFIER  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INTLITERAL :	'0'..'9'+
    ;

FLOATLITERAL
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '--'  ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

STRINGLIETRAL
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

OPERATORS : (':=') | ('+') | ('-') | ('*') | ('/') | ('=') | ('!=') | ('<') | ('>') | ('(') | (')') | (';') | (',')
	;
	
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+    { $channel = HIDDEN; } ;
	
fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
