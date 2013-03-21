grammar MicroParser;

options {
	backtrack=true;
	}
	
@member {
	protected void mismatch(IntStream input, int ttype, BitSet follow)
	  throws RecognitionException
	{
	  throw new MismatchedTokenException(ttype, input);
	}
}
@rulecatch {
	catch (RecognitionException e) {
		throw e;
	}
}

// Program //
program 
	:	'PROGRAM' id 'BEGIN' pgm_body 'END' EOF
	;
	
id	
	:	IDENTIFIER {System.out.println($IDENTIFIER.getText());}
	;
	
pgm_body 
	:	decl func_declarations
	;
	
decl 	
	:	(string_decl_list | var_decl_list)*
	;

// Global String Declaration //
string_decl_list
	:	string_decl+
	;
	
string_decl
	:	'STRING' id ':=' str ';'		
	;

str	
	:	STRINGLIETRAL
	;

/*string_decl_tail
	:	string_decl+
	;
*/
// Variable Declaration //
var_decl_list
	:	var_decl+
	;

var_decl
	:	var_type id_list ';'
	;

var_type
	:	'FLOAT' | 'INT'
	;

any_type
	:	var_type | 'VOID'
	;

id_list	
	:	id id_tail
	;

id_tail	
	:	(',' id)*
	;
	
/*var_decl_tail
	:	var_decl+
	;	
*/	
// function parameter list //
param_decl_list
	:	param_decl param_decl_tail
	;

param_decl
	:	var_type id
	;

param_decl_tail
	:	(',' param_decl)*
	;
	
// function declarations //
func_declarations 
	:	func_decl*
	;

func_decl
	:	'FUNCTION' any_type id '(' param_decl_list? ')' 'BEGIN' func_body 'END'
	;

func_decl_tail
	:	func_decl*
	;
func_body
	:	decl stmt_list
	;
	
// statement list//
stmt_list
	:	stmt*
	;
/*stmt_tail
	:	stmt*
	;
*/
stmt	:	base_stmt | if_stmt | repeat_stmt
	;
base_stmt
	:	assign_stmt | read_stmt | write_stmt | return_stmt
	;

// basic statements //
assign_stmt
	:	assign_expr ';'
	;
assign_expr
	:	id ':=' expr
	;
read_stmt
	:	'READ' '(' id_list ')' ';'
	;
write_stmt
	:	'WRITE' '(' id_list ')' ';'
	;
return_stmt
	:	'RETURN' expr ';' 
	;

/* Expressions */
expr	:	 factor expr_tail 
	;
expr_tail
	:	(addop factor)*
	;
factor	:	postfix_expr factor_tail
	;
factor_tail
	:	(mulop postfix_expr)*
	;
postfix_expr
	:	primary | call_expr
	;
call_expr
	:	id '(' expr_list? ')'
	;
expr_list
	:	expr expr_list_tail
	;
expr_list_tail
	:	(',' expr)*
	;
primary	:	('(' expr ')') | id | INTLITERAL | FLOATLITERAL
	;
addop	:	'+' | '-'
	;
mulop	:	'*' | '/'
	;
				
/* Complex Statements and Condition */ 
if_stmt	:	'IF' '(' cond ')' 'THEN' decl stmt_list else_part 'ENDIF'
	;
else_part
	:	('ELSE' decl stmt_list)?
	;
cond	:	expr compop expr
	;
compop	:	'<' | '>' | '=' | '!='
	;	

/* ECE 468 students use this version of repeat_stmt */
repeat_stmt
	:	'REPEAT' decl stmt_list 'UNTIL' '(' cond ')' ';'
	;

KEYWORD :	('PROGRAM') | ('BEGIN') | ('FUNCTION') | ('END') | ('READ') | ('WRITE')
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
fragment
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
