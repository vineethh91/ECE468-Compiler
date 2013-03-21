grammar MicroParser;

// Disable automatic error recovery
@members {
	public void displayRecognitionError(String[] tokenNames, 
					RecognitionException e) {
		String hdr = getErrorHeader(e);
		String msg = getErrorMessage(e, tokenNames);
		// Now do something with hdr and msg...
	}
}
// Alter code generation so catch-clauses get replace with
// this action.
@rulecatch {
	catch (RecognitionException e) {
		throw e;
	}
}

// Program
program :	 'PROGRAM' id 'BEGIN' pgm_body 'END' EOF
	;

id : IDENTIFIER
	;

pgm_body : decl_list func_declarations
	;

decl_list 
	:	decl*
	;

decl : string_decl  | var_decl // | WS//string_decl_list decl? | var_decl_list decl? | WS
	;

string_decl : 'STRING' id ':=' str ';' //| WS
	;

str : STRINGLITERAL
	;

//string_decl_tail : string_decl string_decl_tail?
//    ;

var_decl : Var_type id_list ';' //| WS
	;

Var_type : 'FLOAT' | 'INT'
	;

any_type : Var_type | 'VOID'
    ;

id_list : id (',' id)*
    ;


//var_decl_tail : var_decl var_decl_tail?
//   ;

// Function Parameter List
param_decl_list : param_decl (',' param_decl)*
	;

param_decl : Var_type id
	;

// Function Declarations
func_declarations : (func_decl)*
	;

func_decl : 'FUNCTION' any_type id '('param_decl_list?')' 'BEGIN' func_body 'END'
	;
    
func_body : decl_list stmt_list
	;

// Statement List
stmt_list : (stmt)*
	;

stmt : assign_stmt | read_stmt | write_stmt | return_stmt | if_stmt | do_stmt
	;

// Basic Statements
assign_stmt : assign_expr ';'
	;

assign_expr : id ':=' expr
	;

read_stmt : 'READ' '(' id_list ')'';'
	;

write_stmt : 'WRITE' '(' id_list ')'';'
	;

return_stmt : 'RETURN' expr ';'
	;

// Expressions
expr : factor  (Addop factor)* 
	;

factor : postfix_expr (Mulop postfix_expr)*
	;

postfix_expr : primary | call_expr
	;

call_expr : id '('(expr_list)? ')'
	;

expr_list : expr (',' expr)*
	;

primary : '('expr')' | id | INTLITERAL | FLOATLITERAL
	;

Addop : '+' | '-'
	;

Mulop : '*' | '/'
	;

// Complex Statements and Condition
if_stmt : 'IF' '(' cond ')' 'THEN' stmt_list (else_part)?  'ENDIF'
	;

else_part : 'ELSE' stmt_list
	;

cond : expr Compop expr
	;

Compop : '<' | '>' | '=' | '!='
	;

do_stmt : 'DO' stmt_list 'WHILE' '(' cond ')'';'
	;

// Lexer tokens

//KEYWORD 
//   :  ('PROGRAM' | 'BEGIN' | 'END' | 'PROTO' | 'FUNCTION' | 'READ' | 'WRITE' | 
//   'IF' | 'THEN' | 'ELSE' | 'ENDIF' | 'RETURN' | 'CASE' | 'ENDCASE' | 'BREAK' | 
//   'DEFAULT' | 'DO' | 'WHILE' | 'FLOAT' | 'INT' | 'VOID' | 'STRING')	
//   ; 

IDENTIFIER  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	;

INTLITERAL :	'0'..'9'+
	;

FLOATLITERAL
    :   ('0'..'9')+ '.' ('0'..'9')*
    |   '.' ('0'..'9')+
	;

COMMENT
    :   '--' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;

//OPERATOR
 //  :  (':='|'+'|'-'|'*'|'/'|'='|'<'|'>'|'('|')'|';'|','|'!=')
 //  ;

STRINGLITERAL
    :  '"' ( ~('"') )* '"'
	;
    
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
	;

Program_start
	:
	;
