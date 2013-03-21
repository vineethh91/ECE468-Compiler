grammar MicroParser;

options {
	backtrack=true;
	output=AST;
	ASTLabelType=CommonTree;
	language=Java;
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
	:	'PROGRAM' id 'BEGIN' pgm_body 'END' {SymbolTableClass.popSymbolTableOffTheStack();} EOF -> ^('PROGRAM' id pgm_body)
	;
	
id	
	:	IDENTIFIER
	;
	
pgm_body 
	:	{SymbolTableClass.createGlobalScopeTable(); } decl  {SymbolTableClass.printSymbolTable();} func_declarations
	;
	
decl 	
	:	(string_decl_list | var_decl_list)*
	;

// Global String Declaration //
string_decl_list
	:	string_decl+ 
	;
	
string_decl
	:	'STRING' id ':=' str ';' {SymbolTableClass.insertSymbolIntoTable("STRING", $id.text, $str.text);} -> ^('STRING' id str)
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
	:	var_type id_list ';' {SymbolTableClass.insertSymbolIntoTable($var_type.text, $id_list.text, null);} -> ^(var_type id_list)
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
	:	var_type id {SymbolTableClass.insertSymbolIntoTable($var_type.text, $id.text, null);}
	;

param_decl_tail
	:	(',' param_decl)*
	;
	
// function declarations //
func_declarations 
	:	func_decl*
	;

func_decl
	:	'FUNCTION' any_type id {SymbolTableClass.createFunctionScopeTable($id.text);} '(' param_decl_list? ')' 'BEGIN' func_body 'END' {SymbolTableClass.popSymbolTableOffTheStack();} -> ^('FUNCTION' id param_decl_list? func_body)
	;

func_decl_tail
	:	func_decl*
	;
func_body
	:	decl {SymbolTableClass.printSymbolTable();} stmt_list
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
	:	assign_expr ';'!
	;
assign_expr
	:	id ':=' expr -> ^(':=' id expr) 
	;
read_stmt
	:	'READ' '(' id_list ')' ';' -> ^('READ' id_list)
	;
write_stmt
	:	'WRITE' '(' id_list ')' ';' -> ^('WRITE' id_list)
	;
return_stmt
	:	'RETURN' expr ';' -> ^('RETURN' expr)
	;

/* Expressions */
expr	:	expr_tail // factor expr_tail 
	;
expr_tail
	:	factor (addop^ factor)*
	;
factor	:	postfix_expr (mulop^ postfix_expr)* //factor_tail
	;
factor_tail
	:	(mulop^ postfix_expr)*
	;
postfix_expr
	:	primary | call_expr
	;
call_expr
	:	id '(' expr_list? ')' -> ^( id expr_list?)
	;
expr_list
	:	expr expr_list_tail
	;
expr_list_tail
	:	(',' expr)*
	;
primary	:	('('! expr ')'!) | id | INTLITERAL | FLOATLITERAL
	;
addop	:	'+' | '-'
	;
mulop	:	'*' | '/'
	;
				
/* Complex Statements and Condition */ 
if_stmt	:	{SymbolTableClass.createBlockScopeTable();} 'IF' '(' cond ')' 'THEN' decl stmt_list {SymbolTableClass.printSymbolTable();} {SymbolTableClass.popSymbolTableOffTheStack();} else_part 'ENDIF' -> ^('IF' cond ^('THEN' decl? stmt_list) else_part? 'ENDIF')  
	;
else_part
	:	( {SymbolTableClass.createBlockScopeTable();}  'ELSE' decl {SymbolTableClass.printSymbolTable();} {SymbolTableClass.popSymbolTableOffTheStack();} stmt_list )? -> ^('ELSE' decl? stmt_list)?
	;
cond	:	expr compop^ expr
	;
compop	:	'<' | '>' | '=' | '!='
	;	

/* ECE 468 students use this version of repeat_stmt */
repeat_stmt
	:	{SymbolTableClass.createBlockScopeTable();} 'REPEAT' decl {SymbolTableClass.printSymbolTable();} stmt_list 'UNTIL' '(' cond ')' ';' {SymbolTableClass.popSymbolTableOffTheStack();} -> ^('REPEAT' decl? stmt_list ^('UNTIL' cond))
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
