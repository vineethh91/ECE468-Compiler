// $ANTLR 3.4 MicroParser.g 2012-10-14 00:46:35

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MicroParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ESC_SEQ", "EXPONENT", "FLOATLITERAL", "HEX_DIGIT", "IDENTIFIER", "INTLITERAL", "KEYWORD", "OCTAL_ESC", "OPERATORS", "STRINGLIETRAL", "UNICODE_ESC", "WHITESPACE", "'!='", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "':='", "';'", "'<'", "'='", "'>'", "'BEGIN'", "'ELSE'", "'END'", "'ENDIF'", "'FLOAT'", "'FUNCTION'", "'IF'", "'INT'", "'PROGRAM'", "'READ'", "'REPEAT'", "'RETURN'", "'STRING'", "'THEN'", "'UNTIL'", "'VOID'", "'WRITE'"
    };

    public static final int EOF=-1;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int COMMENT=4;
    public static final int ESC_SEQ=5;
    public static final int EXPONENT=6;
    public static final int FLOATLITERAL=7;
    public static final int HEX_DIGIT=8;
    public static final int IDENTIFIER=9;
    public static final int INTLITERAL=10;
    public static final int KEYWORD=11;
    public static final int OCTAL_ESC=12;
    public static final int OPERATORS=13;
    public static final int STRINGLIETRAL=14;
    public static final int UNICODE_ESC=15;
    public static final int WHITESPACE=16;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MicroParserParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MicroParserParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return MicroParserParser.tokenNames; }
    public String getGrammarFileName() { return "MicroParser.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // MicroParser.g:24:1: program : 'PROGRAM' id 'BEGIN' pgm_body 'END' EOF -> ^( 'PROGRAM' id pgm_body ) ;
    public final MicroParserParser.program_return program() throws RecognitionException {
        MicroParserParser.program_return retval = new MicroParserParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal1=null;
        Token string_literal3=null;
        Token string_literal5=null;
        Token EOF6=null;
        MicroParserParser.id_return id2 =null;

        MicroParserParser.pgm_body_return pgm_body4 =null;


        CommonTree string_literal1_tree=null;
        CommonTree string_literal3_tree=null;
        CommonTree string_literal5_tree=null;
        CommonTree EOF6_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_pgm_body=new RewriteRuleSubtreeStream(adaptor,"rule pgm_body");
        try {
            // MicroParser.g:25:2: ( 'PROGRAM' id 'BEGIN' pgm_body 'END' EOF -> ^( 'PROGRAM' id pgm_body ) )
            // MicroParser.g:25:4: 'PROGRAM' id 'BEGIN' pgm_body 'END' EOF
            {
            string_literal1=(Token)match(input,38,FOLLOW_38_in_program55); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_38.add(string_literal1);


            pushFollow(FOLLOW_id_in_program57);
            id2=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id2.getTree());

            string_literal3=(Token)match(input,30,FOLLOW_30_in_program59); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(string_literal3);


            pushFollow(FOLLOW_pgm_body_in_program61);
            pgm_body4=pgm_body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pgm_body.add(pgm_body4.getTree());

            string_literal5=(Token)match(input,32,FOLLOW_32_in_program63); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_32.add(string_literal5);


            if ( state.backtracking==0 ) {SymbolTableClass.popSymbolTableOffTheStack();}

            EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_program67); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF6);


            // AST REWRITE
            // elements: id, pgm_body, 38
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 25:92: -> ^( 'PROGRAM' id pgm_body )
            {
                // MicroParser.g:25:95: ^( 'PROGRAM' id pgm_body )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_38.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_1, stream_pgm_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class id_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id"
    // MicroParser.g:28:1: id : IDENTIFIER ;
    public final MicroParserParser.id_return id() throws RecognitionException {
        MicroParserParser.id_return retval = new MicroParserParser.id_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER7=null;

        CommonTree IDENTIFIER7_tree=null;

        try {
            // MicroParser.g:29:2: ( IDENTIFIER )
            // MicroParser.g:29:4: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENTIFIER7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_id90); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER7_tree = 
            (CommonTree)adaptor.create(IDENTIFIER7)
            ;
            adaptor.addChild(root_0, IDENTIFIER7_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id"


    public static class pgm_body_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pgm_body"
    // MicroParser.g:32:1: pgm_body : decl func_declarations ;
    public final MicroParserParser.pgm_body_return pgm_body() throws RecognitionException {
        MicroParserParser.pgm_body_return retval = new MicroParserParser.pgm_body_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.decl_return decl8 =null;

        MicroParserParser.func_declarations_return func_declarations9 =null;



        try {
            // MicroParser.g:33:2: ( decl func_declarations )
            // MicroParser.g:33:4: decl func_declarations
            {
            root_0 = (CommonTree)adaptor.nil();


            if ( state.backtracking==0 ) {SymbolTableClass.createGlobalScopeTable(); }

            pushFollow(FOLLOW_decl_in_pgm_body105);
            decl8=decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, decl8.getTree());

            if ( state.backtracking==0 ) {SymbolTableClass.printSymbolTable();}

            pushFollow(FOLLOW_func_declarations_in_pgm_body110);
            func_declarations9=func_declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, func_declarations9.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pgm_body"


    public static class decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decl"
    // MicroParser.g:36:1: decl : ( string_decl_list | var_decl_list )* ;
    public final MicroParserParser.decl_return decl() throws RecognitionException {
        MicroParserParser.decl_return retval = new MicroParserParser.decl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.string_decl_list_return string_decl_list10 =null;

        MicroParserParser.var_decl_list_return var_decl_list11 =null;



        try {
            // MicroParser.g:37:2: ( ( string_decl_list | var_decl_list )* )
            // MicroParser.g:37:4: ( string_decl_list | var_decl_list )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:37:4: ( string_decl_list | var_decl_list )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==42) ) {
                    alt1=1;
                }
                else if ( (LA1_0==34||LA1_0==37) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // MicroParser.g:37:5: string_decl_list
            	    {
            	    pushFollow(FOLLOW_string_decl_list_in_decl125);
            	    string_decl_list10=string_decl_list();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, string_decl_list10.getTree());

            	    }
            	    break;
            	case 2 :
            	    // MicroParser.g:37:24: var_decl_list
            	    {
            	    pushFollow(FOLLOW_var_decl_list_in_decl129);
            	    var_decl_list11=var_decl_list();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_decl_list11.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decl"


    public static class string_decl_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string_decl_list"
    // MicroParser.g:41:1: string_decl_list : ( string_decl )+ ;
    public final MicroParserParser.string_decl_list_return string_decl_list() throws RecognitionException {
        MicroParserParser.string_decl_list_return retval = new MicroParserParser.string_decl_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.string_decl_return string_decl12 =null;



        try {
            // MicroParser.g:42:2: ( ( string_decl )+ )
            // MicroParser.g:42:4: ( string_decl )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:42:4: ( string_decl )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==42) ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred3_MicroParser()) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // MicroParser.g:42:4: string_decl
            	    {
            	    pushFollow(FOLLOW_string_decl_in_string_decl_list143);
            	    string_decl12=string_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, string_decl12.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "string_decl_list"


    public static class string_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string_decl"
    // MicroParser.g:45:1: string_decl : 'STRING' id ':=' str ';' -> ^( 'STRING' id str ) ;
    public final MicroParserParser.string_decl_return string_decl() throws RecognitionException {
        MicroParserParser.string_decl_return retval = new MicroParserParser.string_decl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal13=null;
        Token string_literal15=null;
        Token char_literal17=null;
        MicroParserParser.id_return id14 =null;

        MicroParserParser.str_return str16 =null;


        CommonTree string_literal13_tree=null;
        CommonTree string_literal15_tree=null;
        CommonTree char_literal17_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_str=new RewriteRuleSubtreeStream(adaptor,"rule str");
        try {
            // MicroParser.g:46:2: ( 'STRING' id ':=' str ';' -> ^( 'STRING' id str ) )
            // MicroParser.g:46:4: 'STRING' id ':=' str ';'
            {
            string_literal13=(Token)match(input,42,FOLLOW_42_in_string_decl157); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(string_literal13);


            pushFollow(FOLLOW_id_in_string_decl159);
            id14=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id14.getTree());

            string_literal15=(Token)match(input,25,FOLLOW_25_in_string_decl161); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_25.add(string_literal15);


            pushFollow(FOLLOW_str_in_string_decl163);
            str16=str();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_str.add(str16.getTree());

            char_literal17=(Token)match(input,26,FOLLOW_26_in_string_decl165); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal17);


            if ( state.backtracking==0 ) {SymbolTableClass.insertSymbolIntoTable("STRING", (id14!=null?input.toString(id14.start,id14.stop):null), (str16!=null?input.toString(str16.start,str16.stop):null));}

            // AST REWRITE
            // elements: 42, str, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 46:102: -> ^( 'STRING' id str )
            {
                // MicroParser.g:46:105: ^( 'STRING' id str )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_42.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_1, stream_str.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "string_decl"


    public static class str_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "str"
    // MicroParser.g:49:1: str : STRINGLIETRAL ;
    public final MicroParserParser.str_return str() throws RecognitionException {
        MicroParserParser.str_return retval = new MicroParserParser.str_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRINGLIETRAL18=null;

        CommonTree STRINGLIETRAL18_tree=null;

        try {
            // MicroParser.g:50:2: ( STRINGLIETRAL )
            // MicroParser.g:50:4: STRINGLIETRAL
            {
            root_0 = (CommonTree)adaptor.nil();


            STRINGLIETRAL18=(Token)match(input,STRINGLIETRAL,FOLLOW_STRINGLIETRAL_in_str189); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRINGLIETRAL18_tree = 
            (CommonTree)adaptor.create(STRINGLIETRAL18)
            ;
            adaptor.addChild(root_0, STRINGLIETRAL18_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "str"


    public static class var_decl_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_decl_list"
    // MicroParser.g:58:1: var_decl_list : ( var_decl )+ ;
    public final MicroParserParser.var_decl_list_return var_decl_list() throws RecognitionException {
        MicroParserParser.var_decl_list_return retval = new MicroParserParser.var_decl_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.var_decl_return var_decl19 =null;



        try {
            // MicroParser.g:59:2: ( ( var_decl )+ )
            // MicroParser.g:59:4: ( var_decl )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:59:4: ( var_decl )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==34) ) {
                    int LA3_2 = input.LA(2);

                    if ( (synpred4_MicroParser()) ) {
                        alt3=1;
                    }


                }
                else if ( (LA3_0==37) ) {
                    int LA3_3 = input.LA(2);

                    if ( (synpred4_MicroParser()) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // MicroParser.g:59:4: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_var_decl_list203);
            	    var_decl19=var_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_decl19.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var_decl_list"


    public static class var_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_decl"
    // MicroParser.g:62:1: var_decl : var_type id_list ';' ;
    public final MicroParserParser.var_decl_return var_decl() throws RecognitionException {
        MicroParserParser.var_decl_return retval = new MicroParserParser.var_decl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal22=null;
        MicroParserParser.var_type_return var_type20 =null;

        MicroParserParser.id_list_return id_list21 =null;


        CommonTree char_literal22_tree=null;

        try {
            // MicroParser.g:63:2: ( var_type id_list ';' )
            // MicroParser.g:63:4: var_type id_list ';'
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_var_type_in_var_decl215);
            var_type20=var_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_type20.getTree());

            pushFollow(FOLLOW_id_list_in_var_decl217);
            id_list21=id_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id_list21.getTree());

            char_literal22=(Token)match(input,26,FOLLOW_26_in_var_decl219); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal22_tree = 
            (CommonTree)adaptor.create(char_literal22)
            ;
            adaptor.addChild(root_0, char_literal22_tree);
            }

            if ( state.backtracking==0 ) {SymbolTableClass.insertSymbolIntoTable((var_type20!=null?input.toString(var_type20.start,var_type20.stop):null), (id_list21!=null?input.toString(id_list21.start,id_list21.stop):null), null);}

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var_decl"


    public static class var_type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_type"
    // MicroParser.g:66:1: var_type : ( 'FLOAT' | 'INT' ^);
    public final MicroParserParser.var_type_return var_type() throws RecognitionException {
        MicroParserParser.var_type_return retval = new MicroParserParser.var_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal23=null;
        Token string_literal24=null;

        CommonTree string_literal23_tree=null;
        CommonTree string_literal24_tree=null;

        try {
            // MicroParser.g:67:2: ( 'FLOAT' | 'INT' ^)
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                alt4=1;
            }
            else if ( (LA4_0==37) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // MicroParser.g:67:4: 'FLOAT'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal23=(Token)match(input,34,FOLLOW_34_in_var_type233); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal23_tree = 
                    (CommonTree)adaptor.create(string_literal23)
                    ;
                    adaptor.addChild(root_0, string_literal23_tree);
                    }

                    }
                    break;
                case 2 :
                    // MicroParser.g:67:14: 'INT' ^
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal24=(Token)match(input,37,FOLLOW_37_in_var_type237); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal24_tree = 
                    (CommonTree)adaptor.create(string_literal24)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal24_tree, root_0);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var_type"


    public static class any_type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "any_type"
    // MicroParser.g:70:1: any_type : ( var_type | 'VOID' );
    public final MicroParserParser.any_type_return any_type() throws RecognitionException {
        MicroParserParser.any_type_return retval = new MicroParserParser.any_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal26=null;
        MicroParserParser.var_type_return var_type25 =null;


        CommonTree string_literal26_tree=null;

        try {
            // MicroParser.g:71:2: ( var_type | 'VOID' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==34||LA5_0==37) ) {
                alt5=1;
            }
            else if ( (LA5_0==45) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // MicroParser.g:71:4: var_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_var_type_in_any_type249);
                    var_type25=var_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_type25.getTree());

                    }
                    break;
                case 2 :
                    // MicroParser.g:71:15: 'VOID'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal26=(Token)match(input,45,FOLLOW_45_in_any_type253); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal26_tree = 
                    (CommonTree)adaptor.create(string_literal26)
                    ;
                    adaptor.addChild(root_0, string_literal26_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "any_type"


    public static class id_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id_list"
    // MicroParser.g:74:1: id_list : id id_tail ;
    public final MicroParserParser.id_list_return id_list() throws RecognitionException {
        MicroParserParser.id_list_return retval = new MicroParserParser.id_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.id_return id27 =null;

        MicroParserParser.id_tail_return id_tail28 =null;



        try {
            // MicroParser.g:75:2: ( id id_tail )
            // MicroParser.g:75:4: id id_tail
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_id_in_id_list265);
            id27=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id27.getTree());

            pushFollow(FOLLOW_id_tail_in_id_list267);
            id_tail28=id_tail();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id_tail28.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id_list"


    public static class id_tail_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id_tail"
    // MicroParser.g:78:1: id_tail : ( ',' id )* ;
    public final MicroParserParser.id_tail_return id_tail() throws RecognitionException {
        MicroParserParser.id_tail_return retval = new MicroParserParser.id_tail_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal29=null;
        MicroParserParser.id_return id30 =null;


        CommonTree char_literal29_tree=null;

        try {
            // MicroParser.g:79:2: ( ( ',' id )* )
            // MicroParser.g:79:4: ( ',' id )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:79:4: ( ',' id )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // MicroParser.g:79:5: ',' id
            	    {
            	    char_literal29=(Token)match(input,22,FOLLOW_22_in_id_tail280); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal29_tree = 
            	    (CommonTree)adaptor.create(char_literal29)
            	    ;
            	    adaptor.addChild(root_0, char_literal29_tree);
            	    }

            	    pushFollow(FOLLOW_id_in_id_tail282);
            	    id30=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, id30.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id_tail"


    public static class param_decl_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param_decl_list"
    // MicroParser.g:87:1: param_decl_list : param_decl param_decl_tail ;
    public final MicroParserParser.param_decl_list_return param_decl_list() throws RecognitionException {
        MicroParserParser.param_decl_list_return retval = new MicroParserParser.param_decl_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.param_decl_return param_decl31 =null;

        MicroParserParser.param_decl_tail_return param_decl_tail32 =null;



        try {
            // MicroParser.g:88:2: ( param_decl param_decl_tail )
            // MicroParser.g:88:4: param_decl param_decl_tail
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_param_decl_in_param_decl_list300);
            param_decl31=param_decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param_decl31.getTree());

            pushFollow(FOLLOW_param_decl_tail_in_param_decl_list302);
            param_decl_tail32=param_decl_tail();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param_decl_tail32.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param_decl_list"


    public static class param_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param_decl"
    // MicroParser.g:91:1: param_decl : var_type id ;
    public final MicroParserParser.param_decl_return param_decl() throws RecognitionException {
        MicroParserParser.param_decl_return retval = new MicroParserParser.param_decl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.var_type_return var_type33 =null;

        MicroParserParser.id_return id34 =null;



        try {
            // MicroParser.g:92:2: ( var_type id )
            // MicroParser.g:92:4: var_type id
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_var_type_in_param_decl313);
            var_type33=var_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_type33.getTree());

            pushFollow(FOLLOW_id_in_param_decl315);
            id34=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id34.getTree());

            if ( state.backtracking==0 ) {SymbolTableClass.insertSymbolIntoTable((var_type33!=null?input.toString(var_type33.start,var_type33.stop):null), (id34!=null?input.toString(id34.start,id34.stop):null), null);}

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param_decl"


    public static class param_decl_tail_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param_decl_tail"
    // MicroParser.g:95:1: param_decl_tail : ( ',' param_decl )* ;
    public final MicroParserParser.param_decl_tail_return param_decl_tail() throws RecognitionException {
        MicroParserParser.param_decl_tail_return retval = new MicroParserParser.param_decl_tail_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal35=null;
        MicroParserParser.param_decl_return param_decl36 =null;


        CommonTree char_literal35_tree=null;

        try {
            // MicroParser.g:96:2: ( ( ',' param_decl )* )
            // MicroParser.g:96:4: ( ',' param_decl )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:96:4: ( ',' param_decl )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // MicroParser.g:96:5: ',' param_decl
            	    {
            	    char_literal35=(Token)match(input,22,FOLLOW_22_in_param_decl_tail329); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal35_tree = 
            	    (CommonTree)adaptor.create(char_literal35)
            	    ;
            	    adaptor.addChild(root_0, char_literal35_tree);
            	    }

            	    pushFollow(FOLLOW_param_decl_in_param_decl_tail331);
            	    param_decl36=param_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, param_decl36.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param_decl_tail"


    public static class func_declarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func_declarations"
    // MicroParser.g:100:1: func_declarations : ( func_decl )* ;
    public final MicroParserParser.func_declarations_return func_declarations() throws RecognitionException {
        MicroParserParser.func_declarations_return retval = new MicroParserParser.func_declarations_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.func_decl_return func_decl37 =null;



        try {
            // MicroParser.g:101:2: ( ( func_decl )* )
            // MicroParser.g:101:4: ( func_decl )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:101:4: ( func_decl )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // MicroParser.g:101:4: func_decl
            	    {
            	    pushFollow(FOLLOW_func_decl_in_func_declarations347);
            	    func_decl37=func_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, func_decl37.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func_declarations"


    public static class func_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func_decl"
    // MicroParser.g:104:1: func_decl : 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END' ;
    public final MicroParserParser.func_decl_return func_decl() throws RecognitionException {
        MicroParserParser.func_decl_return retval = new MicroParserParser.func_decl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal38=null;
        Token char_literal41=null;
        Token char_literal43=null;
        Token string_literal44=null;
        Token string_literal46=null;
        MicroParserParser.any_type_return any_type39 =null;

        MicroParserParser.id_return id40 =null;

        MicroParserParser.param_decl_list_return param_decl_list42 =null;

        MicroParserParser.func_body_return func_body45 =null;


        CommonTree string_literal38_tree=null;
        CommonTree char_literal41_tree=null;
        CommonTree char_literal43_tree=null;
        CommonTree string_literal44_tree=null;
        CommonTree string_literal46_tree=null;

        try {
            // MicroParser.g:105:2: ( 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END' )
            // MicroParser.g:105:4: 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal38=(Token)match(input,35,FOLLOW_35_in_func_decl359); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal38_tree = 
            (CommonTree)adaptor.create(string_literal38)
            ;
            adaptor.addChild(root_0, string_literal38_tree);
            }

            pushFollow(FOLLOW_any_type_in_func_decl361);
            any_type39=any_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, any_type39.getTree());

            pushFollow(FOLLOW_id_in_func_decl363);
            id40=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id40.getTree());

            if ( state.backtracking==0 ) {SymbolTableClass.createFunctionScopeTable((id40!=null?input.toString(id40.start,id40.stop):null));}

            char_literal41=(Token)match(input,18,FOLLOW_18_in_func_decl367); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal41_tree = 
            (CommonTree)adaptor.create(char_literal41)
            ;
            adaptor.addChild(root_0, char_literal41_tree);
            }

            // MicroParser.g:105:86: ( param_decl_list )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34||LA9_0==37) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // MicroParser.g:105:86: param_decl_list
                    {
                    pushFollow(FOLLOW_param_decl_list_in_func_decl369);
                    param_decl_list42=param_decl_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, param_decl_list42.getTree());

                    }
                    break;

            }


            char_literal43=(Token)match(input,19,FOLLOW_19_in_func_decl372); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal43_tree = 
            (CommonTree)adaptor.create(char_literal43)
            ;
            adaptor.addChild(root_0, char_literal43_tree);
            }

            string_literal44=(Token)match(input,30,FOLLOW_30_in_func_decl374); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal44_tree = 
            (CommonTree)adaptor.create(string_literal44)
            ;
            adaptor.addChild(root_0, string_literal44_tree);
            }

            pushFollow(FOLLOW_func_body_in_func_decl376);
            func_body45=func_body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, func_body45.getTree());

            string_literal46=(Token)match(input,32,FOLLOW_32_in_func_decl378); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal46_tree = 
            (CommonTree)adaptor.create(string_literal46)
            ;
            adaptor.addChild(root_0, string_literal46_tree);
            }

            if ( state.backtracking==0 ) {SymbolTableClass.popSymbolTableOffTheStack();}

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func_decl"


    public static class func_decl_tail_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func_decl_tail"
    // MicroParser.g:108:1: func_decl_tail : ( func_decl )* ;
    public final MicroParserParser.func_decl_tail_return func_decl_tail() throws RecognitionException {
        MicroParserParser.func_decl_tail_return retval = new MicroParserParser.func_decl_tail_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.func_decl_return func_decl47 =null;



        try {
            // MicroParser.g:109:2: ( ( func_decl )* )
            // MicroParser.g:109:4: ( func_decl )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:109:4: ( func_decl )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // MicroParser.g:109:4: func_decl
            	    {
            	    pushFollow(FOLLOW_func_decl_in_func_decl_tail391);
            	    func_decl47=func_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, func_decl47.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func_decl_tail"


    public static class func_body_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func_body"
    // MicroParser.g:111:1: func_body : decl stmt_list ;
    public final MicroParserParser.func_body_return func_body() throws RecognitionException {
        MicroParserParser.func_body_return retval = new MicroParserParser.func_body_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.decl_return decl48 =null;

        MicroParserParser.stmt_list_return stmt_list49 =null;



        try {
            // MicroParser.g:112:2: ( decl stmt_list )
            // MicroParser.g:112:4: decl stmt_list
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_decl_in_func_body402);
            decl48=decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, decl48.getTree());

            if ( state.backtracking==0 ) {SymbolTableClass.printSymbolTable();}

            pushFollow(FOLLOW_stmt_list_in_func_body406);
            stmt_list49=stmt_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt_list49.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func_body"


    public static class stmt_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt_list"
    // MicroParser.g:116:1: stmt_list : ( stmt )* ;
    public final MicroParserParser.stmt_list_return stmt_list() throws RecognitionException {
        MicroParserParser.stmt_list_return retval = new MicroParserParser.stmt_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.stmt_return stmt50 =null;



        try {
            // MicroParser.g:117:2: ( ( stmt )* )
            // MicroParser.g:117:4: ( stmt )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:117:4: ( stmt )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==IDENTIFIER||LA11_0==36||(LA11_0 >= 39 && LA11_0 <= 41)||LA11_0==46) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // MicroParser.g:117:4: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_stmt_list419);
            	    stmt50=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt50.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt_list"


    public static class stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // MicroParser.g:123:1: stmt : ( base_stmt | if_stmt | repeat_stmt );
    public final MicroParserParser.stmt_return stmt() throws RecognitionException {
        MicroParserParser.stmt_return retval = new MicroParserParser.stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.base_stmt_return base_stmt51 =null;

        MicroParserParser.if_stmt_return if_stmt52 =null;

        MicroParserParser.repeat_stmt_return repeat_stmt53 =null;



        try {
            // MicroParser.g:123:6: ( base_stmt | if_stmt | repeat_stmt )
            int alt12=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
            case 39:
            case 41:
            case 46:
                {
                alt12=1;
                }
                break;
            case 36:
                {
                alt12=2;
                }
                break;
            case 40:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // MicroParser.g:123:8: base_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_base_stmt_in_stmt431);
                    base_stmt51=base_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base_stmt51.getTree());

                    }
                    break;
                case 2 :
                    // MicroParser.g:123:20: if_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_stmt435);
                    if_stmt52=if_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_stmt52.getTree());

                    }
                    break;
                case 3 :
                    // MicroParser.g:123:30: repeat_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_repeat_stmt_in_stmt439);
                    repeat_stmt53=repeat_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, repeat_stmt53.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt"


    public static class base_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base_stmt"
    // MicroParser.g:125:1: base_stmt : ( assign_stmt | read_stmt | write_stmt | return_stmt );
    public final MicroParserParser.base_stmt_return base_stmt() throws RecognitionException {
        MicroParserParser.base_stmt_return retval = new MicroParserParser.base_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.assign_stmt_return assign_stmt54 =null;

        MicroParserParser.read_stmt_return read_stmt55 =null;

        MicroParserParser.write_stmt_return write_stmt56 =null;

        MicroParserParser.return_stmt_return return_stmt57 =null;



        try {
            // MicroParser.g:126:2: ( assign_stmt | read_stmt | write_stmt | return_stmt )
            int alt13=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt13=1;
                }
                break;
            case 39:
                {
                alt13=2;
                }
                break;
            case 46:
                {
                alt13=3;
                }
                break;
            case 41:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // MicroParser.g:126:4: assign_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_stmt_in_base_stmt449);
                    assign_stmt54=assign_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assign_stmt54.getTree());

                    }
                    break;
                case 2 :
                    // MicroParser.g:126:18: read_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_read_stmt_in_base_stmt453);
                    read_stmt55=read_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, read_stmt55.getTree());

                    }
                    break;
                case 3 :
                    // MicroParser.g:126:30: write_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_write_stmt_in_base_stmt457);
                    write_stmt56=write_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, write_stmt56.getTree());

                    }
                    break;
                case 4 :
                    // MicroParser.g:126:43: return_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_base_stmt461);
                    return_stmt57=return_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, return_stmt57.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "base_stmt"


    public static class assign_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign_stmt"
    // MicroParser.g:130:1: assign_stmt : assign_expr ';' ;
    public final MicroParserParser.assign_stmt_return assign_stmt() throws RecognitionException {
        MicroParserParser.assign_stmt_return retval = new MicroParserParser.assign_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal59=null;
        MicroParserParser.assign_expr_return assign_expr58 =null;


        CommonTree char_literal59_tree=null;

        try {
            // MicroParser.g:131:2: ( assign_expr ';' )
            // MicroParser.g:131:4: assign_expr ';'
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_assign_expr_in_assign_stmt473);
            assign_expr58=assign_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assign_expr58.getTree());

            char_literal59=(Token)match(input,26,FOLLOW_26_in_assign_stmt475); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal59_tree = 
            (CommonTree)adaptor.create(char_literal59)
            ;
            adaptor.addChild(root_0, char_literal59_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign_stmt"


    public static class assign_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign_expr"
    // MicroParser.g:133:1: assign_expr : id ':=' expr ;
    public final MicroParserParser.assign_expr_return assign_expr() throws RecognitionException {
        MicroParserParser.assign_expr_return retval = new MicroParserParser.assign_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal61=null;
        MicroParserParser.id_return id60 =null;

        MicroParserParser.expr_return expr62 =null;


        CommonTree string_literal61_tree=null;

        try {
            // MicroParser.g:134:2: ( id ':=' expr )
            // MicroParser.g:134:4: id ':=' expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_id_in_assign_expr485);
            id60=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id60.getTree());

            string_literal61=(Token)match(input,25,FOLLOW_25_in_assign_expr487); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal61_tree = 
            (CommonTree)adaptor.create(string_literal61)
            ;
            adaptor.addChild(root_0, string_literal61_tree);
            }

            pushFollow(FOLLOW_expr_in_assign_expr489);
            expr62=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr62.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign_expr"


    public static class read_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read_stmt"
    // MicroParser.g:136:1: read_stmt : 'READ' '(' id_list ')' ';' ;
    public final MicroParserParser.read_stmt_return read_stmt() throws RecognitionException {
        MicroParserParser.read_stmt_return retval = new MicroParserParser.read_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal63=null;
        Token char_literal64=null;
        Token char_literal66=null;
        Token char_literal67=null;
        MicroParserParser.id_list_return id_list65 =null;


        CommonTree string_literal63_tree=null;
        CommonTree char_literal64_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree char_literal67_tree=null;

        try {
            // MicroParser.g:137:2: ( 'READ' '(' id_list ')' ';' )
            // MicroParser.g:137:4: 'READ' '(' id_list ')' ';'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal63=(Token)match(input,39,FOLLOW_39_in_read_stmt499); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal63_tree = 
            (CommonTree)adaptor.create(string_literal63)
            ;
            adaptor.addChild(root_0, string_literal63_tree);
            }

            char_literal64=(Token)match(input,18,FOLLOW_18_in_read_stmt501); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal64_tree = 
            (CommonTree)adaptor.create(char_literal64)
            ;
            adaptor.addChild(root_0, char_literal64_tree);
            }

            pushFollow(FOLLOW_id_list_in_read_stmt503);
            id_list65=id_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id_list65.getTree());

            char_literal66=(Token)match(input,19,FOLLOW_19_in_read_stmt505); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal66_tree = 
            (CommonTree)adaptor.create(char_literal66)
            ;
            adaptor.addChild(root_0, char_literal66_tree);
            }

            char_literal67=(Token)match(input,26,FOLLOW_26_in_read_stmt507); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal67_tree = 
            (CommonTree)adaptor.create(char_literal67)
            ;
            adaptor.addChild(root_0, char_literal67_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "read_stmt"


    public static class write_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write_stmt"
    // MicroParser.g:139:1: write_stmt : 'WRITE' '(' id_list ')' ';' ;
    public final MicroParserParser.write_stmt_return write_stmt() throws RecognitionException {
        MicroParserParser.write_stmt_return retval = new MicroParserParser.write_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal68=null;
        Token char_literal69=null;
        Token char_literal71=null;
        Token char_literal72=null;
        MicroParserParser.id_list_return id_list70 =null;


        CommonTree string_literal68_tree=null;
        CommonTree char_literal69_tree=null;
        CommonTree char_literal71_tree=null;
        CommonTree char_literal72_tree=null;

        try {
            // MicroParser.g:140:2: ( 'WRITE' '(' id_list ')' ';' )
            // MicroParser.g:140:4: 'WRITE' '(' id_list ')' ';'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal68=(Token)match(input,46,FOLLOW_46_in_write_stmt517); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal68_tree = 
            (CommonTree)adaptor.create(string_literal68)
            ;
            adaptor.addChild(root_0, string_literal68_tree);
            }

            char_literal69=(Token)match(input,18,FOLLOW_18_in_write_stmt519); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal69_tree = 
            (CommonTree)adaptor.create(char_literal69)
            ;
            adaptor.addChild(root_0, char_literal69_tree);
            }

            pushFollow(FOLLOW_id_list_in_write_stmt521);
            id_list70=id_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id_list70.getTree());

            char_literal71=(Token)match(input,19,FOLLOW_19_in_write_stmt523); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal71_tree = 
            (CommonTree)adaptor.create(char_literal71)
            ;
            adaptor.addChild(root_0, char_literal71_tree);
            }

            char_literal72=(Token)match(input,26,FOLLOW_26_in_write_stmt525); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal72_tree = 
            (CommonTree)adaptor.create(char_literal72)
            ;
            adaptor.addChild(root_0, char_literal72_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "write_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // MicroParser.g:142:1: return_stmt : 'RETURN' expr ';' ;
    public final MicroParserParser.return_stmt_return return_stmt() throws RecognitionException {
        MicroParserParser.return_stmt_return retval = new MicroParserParser.return_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal73=null;
        Token char_literal75=null;
        MicroParserParser.expr_return expr74 =null;


        CommonTree string_literal73_tree=null;
        CommonTree char_literal75_tree=null;

        try {
            // MicroParser.g:143:2: ( 'RETURN' expr ';' )
            // MicroParser.g:143:4: 'RETURN' expr ';'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal73=(Token)match(input,41,FOLLOW_41_in_return_stmt535); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal73_tree = 
            (CommonTree)adaptor.create(string_literal73)
            ;
            adaptor.addChild(root_0, string_literal73_tree);
            }

            pushFollow(FOLLOW_expr_in_return_stmt537);
            expr74=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr74.getTree());

            char_literal75=(Token)match(input,26,FOLLOW_26_in_return_stmt539); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal75_tree = 
            (CommonTree)adaptor.create(char_literal75)
            ;
            adaptor.addChild(root_0, char_literal75_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // MicroParser.g:147:1: expr : factor expr_tail ;
    public final MicroParserParser.expr_return expr() throws RecognitionException {
        MicroParserParser.expr_return retval = new MicroParserParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.factor_return factor76 =null;

        MicroParserParser.expr_tail_return expr_tail77 =null;



        try {
            // MicroParser.g:147:6: ( factor expr_tail )
            // MicroParser.g:147:9: factor expr_tail
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_expr553);
            factor76=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor76.getTree());

            pushFollow(FOLLOW_expr_tail_in_expr555);
            expr_tail77=expr_tail();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_tail77.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class expr_tail_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_tail"
    // MicroParser.g:149:1: expr_tail : ( addop factor )* ;
    public final MicroParserParser.expr_tail_return expr_tail() throws RecognitionException {
        MicroParserParser.expr_tail_return retval = new MicroParserParser.expr_tail_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.addop_return addop78 =null;

        MicroParserParser.factor_return factor79 =null;



        try {
            // MicroParser.g:150:2: ( ( addop factor )* )
            // MicroParser.g:150:4: ( addop factor )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:150:4: ( addop factor )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21||LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // MicroParser.g:150:5: addop factor
            	    {
            	    pushFollow(FOLLOW_addop_in_expr_tail567);
            	    addop78=addop();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addop78.getTree());

            	    pushFollow(FOLLOW_factor_in_expr_tail569);
            	    factor79=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor79.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_tail"


    public static class factor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // MicroParser.g:152:1: factor : postfix_expr factor_tail ;
    public final MicroParserParser.factor_return factor() throws RecognitionException {
        MicroParserParser.factor_return retval = new MicroParserParser.factor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.postfix_expr_return postfix_expr80 =null;

        MicroParserParser.factor_tail_return factor_tail81 =null;



        try {
            // MicroParser.g:152:8: ( postfix_expr factor_tail )
            // MicroParser.g:152:10: postfix_expr factor_tail
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_postfix_expr_in_factor580);
            postfix_expr80=postfix_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expr80.getTree());

            pushFollow(FOLLOW_factor_tail_in_factor582);
            factor_tail81=factor_tail();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor_tail81.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class factor_tail_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor_tail"
    // MicroParser.g:154:1: factor_tail : ( mulop postfix_expr )* ;
    public final MicroParserParser.factor_tail_return factor_tail() throws RecognitionException {
        MicroParserParser.factor_tail_return retval = new MicroParserParser.factor_tail_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.mulop_return mulop82 =null;

        MicroParserParser.postfix_expr_return postfix_expr83 =null;



        try {
            // MicroParser.g:155:2: ( ( mulop postfix_expr )* )
            // MicroParser.g:155:4: ( mulop postfix_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:155:4: ( mulop postfix_expr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20||LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // MicroParser.g:155:5: mulop postfix_expr
            	    {
            	    pushFollow(FOLLOW_mulop_in_factor_tail593);
            	    mulop82=mulop();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mulop82.getTree());

            	    pushFollow(FOLLOW_postfix_expr_in_factor_tail595);
            	    postfix_expr83=postfix_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expr83.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor_tail"


    public static class postfix_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix_expr"
    // MicroParser.g:157:1: postfix_expr : ( primary | call_expr );
    public final MicroParserParser.postfix_expr_return postfix_expr() throws RecognitionException {
        MicroParserParser.postfix_expr_return retval = new MicroParserParser.postfix_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.primary_return primary84 =null;

        MicroParserParser.call_expr_return call_expr85 =null;



        try {
            // MicroParser.g:158:2: ( primary | call_expr )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==FLOATLITERAL||LA16_0==INTLITERAL||LA16_0==18) ) {
                alt16=1;
            }
            else if ( (LA16_0==IDENTIFIER) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==EOF||LA16_2==17||(LA16_2 >= 19 && LA16_2 <= 24)||(LA16_2 >= 26 && LA16_2 <= 29)) ) {
                    alt16=1;
                }
                else if ( (LA16_2==18) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // MicroParser.g:158:4: primary
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_primary_in_postfix_expr607);
                    primary84=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary84.getTree());

                    }
                    break;
                case 2 :
                    // MicroParser.g:158:14: call_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_call_expr_in_postfix_expr611);
                    call_expr85=call_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call_expr85.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "postfix_expr"


    public static class call_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "call_expr"
    // MicroParser.g:160:1: call_expr : id '(' ( expr_list )? ')' ;
    public final MicroParserParser.call_expr_return call_expr() throws RecognitionException {
        MicroParserParser.call_expr_return retval = new MicroParserParser.call_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal87=null;
        Token char_literal89=null;
        MicroParserParser.id_return id86 =null;

        MicroParserParser.expr_list_return expr_list88 =null;


        CommonTree char_literal87_tree=null;
        CommonTree char_literal89_tree=null;

        try {
            // MicroParser.g:161:2: ( id '(' ( expr_list )? ')' )
            // MicroParser.g:161:4: id '(' ( expr_list )? ')'
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_id_in_call_expr621);
            id86=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id86.getTree());

            char_literal87=(Token)match(input,18,FOLLOW_18_in_call_expr623); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal87_tree = 
            (CommonTree)adaptor.create(char_literal87)
            ;
            adaptor.addChild(root_0, char_literal87_tree);
            }

            // MicroParser.g:161:11: ( expr_list )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==FLOATLITERAL||(LA17_0 >= IDENTIFIER && LA17_0 <= INTLITERAL)||LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // MicroParser.g:161:11: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_call_expr625);
                    expr_list88=expr_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_list88.getTree());

                    }
                    break;

            }


            char_literal89=(Token)match(input,19,FOLLOW_19_in_call_expr628); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal89_tree = 
            (CommonTree)adaptor.create(char_literal89)
            ;
            adaptor.addChild(root_0, char_literal89_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "call_expr"


    public static class expr_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // MicroParser.g:163:1: expr_list : expr expr_list_tail ;
    public final MicroParserParser.expr_list_return expr_list() throws RecognitionException {
        MicroParserParser.expr_list_return retval = new MicroParserParser.expr_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.expr_return expr90 =null;

        MicroParserParser.expr_list_tail_return expr_list_tail91 =null;



        try {
            // MicroParser.g:164:2: ( expr expr_list_tail )
            // MicroParser.g:164:4: expr expr_list_tail
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list638);
            expr90=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr90.getTree());

            pushFollow(FOLLOW_expr_list_tail_in_expr_list640);
            expr_list_tail91=expr_list_tail();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_list_tail91.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"


    public static class expr_list_tail_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list_tail"
    // MicroParser.g:166:1: expr_list_tail : ( ',' expr )* ;
    public final MicroParserParser.expr_list_tail_return expr_list_tail() throws RecognitionException {
        MicroParserParser.expr_list_tail_return retval = new MicroParserParser.expr_list_tail_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal92=null;
        MicroParserParser.expr_return expr93 =null;


        CommonTree char_literal92_tree=null;

        try {
            // MicroParser.g:167:2: ( ( ',' expr )* )
            // MicroParser.g:167:4: ( ',' expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:167:4: ( ',' expr )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==22) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // MicroParser.g:167:5: ',' expr
            	    {
            	    char_literal92=(Token)match(input,22,FOLLOW_22_in_expr_list_tail651); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal92_tree = 
            	    (CommonTree)adaptor.create(char_literal92)
            	    ;
            	    adaptor.addChild(root_0, char_literal92_tree);
            	    }

            	    pushFollow(FOLLOW_expr_in_expr_list_tail653);
            	    expr93=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr93.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list_tail"


    public static class primary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // MicroParser.g:169:1: primary : ( ( '(' expr ')' ) | id | INTLITERAL | FLOATLITERAL );
    public final MicroParserParser.primary_return primary() throws RecognitionException {
        MicroParserParser.primary_return retval = new MicroParserParser.primary_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal94=null;
        Token char_literal96=null;
        Token INTLITERAL98=null;
        Token FLOATLITERAL99=null;
        MicroParserParser.expr_return expr95 =null;

        MicroParserParser.id_return id97 =null;


        CommonTree char_literal94_tree=null;
        CommonTree char_literal96_tree=null;
        CommonTree INTLITERAL98_tree=null;
        CommonTree FLOATLITERAL99_tree=null;

        try {
            // MicroParser.g:169:9: ( ( '(' expr ')' ) | id | INTLITERAL | FLOATLITERAL )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt19=1;
                }
                break;
            case IDENTIFIER:
                {
                alt19=2;
                }
                break;
            case INTLITERAL:
                {
                alt19=3;
                }
                break;
            case FLOATLITERAL:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // MicroParser.g:169:11: ( '(' expr ')' )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // MicroParser.g:169:11: ( '(' expr ')' )
                    // MicroParser.g:169:12: '(' expr ')'
                    {
                    char_literal94=(Token)match(input,18,FOLLOW_18_in_primary665); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal94_tree = 
                    (CommonTree)adaptor.create(char_literal94)
                    ;
                    adaptor.addChild(root_0, char_literal94_tree);
                    }

                    pushFollow(FOLLOW_expr_in_primary667);
                    expr95=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr95.getTree());

                    char_literal96=(Token)match(input,19,FOLLOW_19_in_primary669); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal96_tree = 
                    (CommonTree)adaptor.create(char_literal96)
                    ;
                    adaptor.addChild(root_0, char_literal96_tree);
                    }

                    }


                    }
                    break;
                case 2 :
                    // MicroParser.g:169:28: id
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_id_in_primary674);
                    id97=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id97.getTree());

                    }
                    break;
                case 3 :
                    // MicroParser.g:169:33: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INTLITERAL98=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_primary678); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTLITERAL98_tree = 
                    (CommonTree)adaptor.create(INTLITERAL98)
                    ;
                    adaptor.addChild(root_0, INTLITERAL98_tree);
                    }

                    }
                    break;
                case 4 :
                    // MicroParser.g:169:46: FLOATLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FLOATLITERAL99=(Token)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_primary682); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOATLITERAL99_tree = 
                    (CommonTree)adaptor.create(FLOATLITERAL99)
                    ;
                    adaptor.addChild(root_0, FLOATLITERAL99_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primary"


    public static class addop_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addop"
    // MicroParser.g:171:1: addop : ( '+' | '-' );
    public final MicroParserParser.addop_return addop() throws RecognitionException {
        MicroParserParser.addop_return retval = new MicroParserParser.addop_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set100=null;

        CommonTree set100_tree=null;

        try {
            // MicroParser.g:171:7: ( '+' | '-' )
            // MicroParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set100=(Token)input.LT(1);

            if ( input.LA(1)==21||input.LA(1)==23 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set100)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "addop"


    public static class mulop_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mulop"
    // MicroParser.g:173:1: mulop : ( '*' | '/' );
    public final MicroParserParser.mulop_return mulop() throws RecognitionException {
        MicroParserParser.mulop_return retval = new MicroParserParser.mulop_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set101=null;

        CommonTree set101_tree=null;

        try {
            // MicroParser.g:173:7: ( '*' | '/' )
            // MicroParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set101=(Token)input.LT(1);

            if ( input.LA(1)==20||input.LA(1)==24 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set101)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mulop"


    public static class if_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_stmt"
    // MicroParser.g:177:1: if_stmt : 'IF' '(' cond ')' 'THEN' decl stmt_list else_part 'ENDIF' ;
    public final MicroParserParser.if_stmt_return if_stmt() throws RecognitionException {
        MicroParserParser.if_stmt_return retval = new MicroParserParser.if_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal102=null;
        Token char_literal103=null;
        Token char_literal105=null;
        Token string_literal106=null;
        Token string_literal110=null;
        MicroParserParser.cond_return cond104 =null;

        MicroParserParser.decl_return decl107 =null;

        MicroParserParser.stmt_list_return stmt_list108 =null;

        MicroParserParser.else_part_return else_part109 =null;


        CommonTree string_literal102_tree=null;
        CommonTree char_literal103_tree=null;
        CommonTree char_literal105_tree=null;
        CommonTree string_literal106_tree=null;
        CommonTree string_literal110_tree=null;

        try {
            // MicroParser.g:177:9: ( 'IF' '(' cond ')' 'THEN' decl stmt_list else_part 'ENDIF' )
            // MicroParser.g:177:11: 'IF' '(' cond ')' 'THEN' decl stmt_list else_part 'ENDIF'
            {
            root_0 = (CommonTree)adaptor.nil();


            if ( state.backtracking==0 ) {SymbolTableClass.createBlockScopeTable();}

            string_literal102=(Token)match(input,36,FOLLOW_36_in_if_stmt727); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal102_tree = 
            (CommonTree)adaptor.create(string_literal102)
            ;
            adaptor.addChild(root_0, string_literal102_tree);
            }

            char_literal103=(Token)match(input,18,FOLLOW_18_in_if_stmt729); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal103_tree = 
            (CommonTree)adaptor.create(char_literal103)
            ;
            adaptor.addChild(root_0, char_literal103_tree);
            }

            pushFollow(FOLLOW_cond_in_if_stmt731);
            cond104=cond();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cond104.getTree());

            char_literal105=(Token)match(input,19,FOLLOW_19_in_if_stmt733); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal105_tree = 
            (CommonTree)adaptor.create(char_literal105)
            ;
            adaptor.addChild(root_0, char_literal105_tree);
            }

            string_literal106=(Token)match(input,43,FOLLOW_43_in_if_stmt735); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal106_tree = 
            (CommonTree)adaptor.create(string_literal106)
            ;
            adaptor.addChild(root_0, string_literal106_tree);
            }

            pushFollow(FOLLOW_decl_in_if_stmt737);
            decl107=decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, decl107.getTree());

            pushFollow(FOLLOW_stmt_list_in_if_stmt739);
            stmt_list108=stmt_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt_list108.getTree());

            if ( state.backtracking==0 ) {SymbolTableClass.printSymbolTable();}

            if ( state.backtracking==0 ) {SymbolTableClass.popSymbolTableOffTheStack();}

            pushFollow(FOLLOW_else_part_in_if_stmt745);
            else_part109=else_part();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, else_part109.getTree());

            string_literal110=(Token)match(input,33,FOLLOW_33_in_if_stmt747); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal110_tree = 
            (CommonTree)adaptor.create(string_literal110)
            ;
            adaptor.addChild(root_0, string_literal110_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_stmt"


    public static class else_part_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_part"
    // MicroParser.g:179:1: else_part : ( 'ELSE' decl stmt_list )? ;
    public final MicroParserParser.else_part_return else_part() throws RecognitionException {
        MicroParserParser.else_part_return retval = new MicroParserParser.else_part_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal111=null;
        MicroParserParser.decl_return decl112 =null;

        MicroParserParser.stmt_list_return stmt_list113 =null;


        CommonTree string_literal111_tree=null;

        try {
            // MicroParser.g:180:2: ( ( 'ELSE' decl stmt_list )? )
            // MicroParser.g:180:4: ( 'ELSE' decl stmt_list )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:180:4: ( 'ELSE' decl stmt_list )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // MicroParser.g:180:6: 'ELSE' decl stmt_list
                    {
                    if ( state.backtracking==0 ) {SymbolTableClass.createBlockScopeTable();}

                    string_literal111=(Token)match(input,31,FOLLOW_31_in_else_part762); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal111_tree = 
                    (CommonTree)adaptor.create(string_literal111)
                    ;
                    adaptor.addChild(root_0, string_literal111_tree);
                    }

                    pushFollow(FOLLOW_decl_in_else_part764);
                    decl112=decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl112.getTree());

                    if ( state.backtracking==0 ) {SymbolTableClass.printSymbolTable();}

                    if ( state.backtracking==0 ) {SymbolTableClass.popSymbolTableOffTheStack();}

                    pushFollow(FOLLOW_stmt_list_in_else_part770);
                    stmt_list113=stmt_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt_list113.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_part"


    public static class cond_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cond"
    // MicroParser.g:182:1: cond : expr compop expr ;
    public final MicroParserParser.cond_return cond() throws RecognitionException {
        MicroParserParser.cond_return retval = new MicroParserParser.cond_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.expr_return expr114 =null;

        MicroParserParser.compop_return compop115 =null;

        MicroParserParser.expr_return expr116 =null;



        try {
            // MicroParser.g:182:6: ( expr compop expr )
            // MicroParser.g:182:8: expr compop expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_cond782);
            expr114=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr114.getTree());

            pushFollow(FOLLOW_compop_in_cond784);
            compop115=compop();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, compop115.getTree());

            pushFollow(FOLLOW_expr_in_cond786);
            expr116=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr116.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cond"


    public static class compop_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compop"
    // MicroParser.g:184:1: compop : ( '<' | '>' | '=' | '!=' );
    public final MicroParserParser.compop_return compop() throws RecognitionException {
        MicroParserParser.compop_return retval = new MicroParserParser.compop_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set117=null;

        CommonTree set117_tree=null;

        try {
            // MicroParser.g:184:8: ( '<' | '>' | '=' | '!=' )
            // MicroParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set117=(Token)input.LT(1);

            if ( input.LA(1)==17||(input.LA(1) >= 27 && input.LA(1) <= 29) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set117)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compop"


    public static class repeat_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "repeat_stmt"
    // MicroParser.g:188:1: repeat_stmt : 'REPEAT' decl stmt_list 'UNTIL' '(' cond ')' ';' ;
    public final MicroParserParser.repeat_stmt_return repeat_stmt() throws RecognitionException {
        MicroParserParser.repeat_stmt_return retval = new MicroParserParser.repeat_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal118=null;
        Token string_literal121=null;
        Token char_literal122=null;
        Token char_literal124=null;
        Token char_literal125=null;
        MicroParserParser.decl_return decl119 =null;

        MicroParserParser.stmt_list_return stmt_list120 =null;

        MicroParserParser.cond_return cond123 =null;


        CommonTree string_literal118_tree=null;
        CommonTree string_literal121_tree=null;
        CommonTree char_literal122_tree=null;
        CommonTree char_literal124_tree=null;
        CommonTree char_literal125_tree=null;

        try {
            // MicroParser.g:189:2: ( 'REPEAT' decl stmt_list 'UNTIL' '(' cond ')' ';' )
            // MicroParser.g:189:4: 'REPEAT' decl stmt_list 'UNTIL' '(' cond ')' ';'
            {
            root_0 = (CommonTree)adaptor.nil();


            if ( state.backtracking==0 ) {SymbolTableClass.createBlockScopeTable();}

            string_literal118=(Token)match(input,40,FOLLOW_40_in_repeat_stmt823); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal118_tree = 
            (CommonTree)adaptor.create(string_literal118)
            ;
            adaptor.addChild(root_0, string_literal118_tree);
            }

            pushFollow(FOLLOW_decl_in_repeat_stmt825);
            decl119=decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, decl119.getTree());

            if ( state.backtracking==0 ) {SymbolTableClass.printSymbolTable();}

            pushFollow(FOLLOW_stmt_list_in_repeat_stmt829);
            stmt_list120=stmt_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt_list120.getTree());

            string_literal121=(Token)match(input,44,FOLLOW_44_in_repeat_stmt831); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal121_tree = 
            (CommonTree)adaptor.create(string_literal121)
            ;
            adaptor.addChild(root_0, string_literal121_tree);
            }

            char_literal122=(Token)match(input,18,FOLLOW_18_in_repeat_stmt833); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal122_tree = 
            (CommonTree)adaptor.create(char_literal122)
            ;
            adaptor.addChild(root_0, char_literal122_tree);
            }

            pushFollow(FOLLOW_cond_in_repeat_stmt835);
            cond123=cond();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cond123.getTree());

            char_literal124=(Token)match(input,19,FOLLOW_19_in_repeat_stmt837); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal124_tree = 
            (CommonTree)adaptor.create(char_literal124)
            ;
            adaptor.addChild(root_0, char_literal124_tree);
            }

            char_literal125=(Token)match(input,26,FOLLOW_26_in_repeat_stmt839); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal125_tree = 
            (CommonTree)adaptor.create(char_literal125)
            ;
            adaptor.addChild(root_0, char_literal125_tree);
            }

            if ( state.backtracking==0 ) {SymbolTableClass.popSymbolTableOffTheStack();}

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "repeat_stmt"

    // $ANTLR start synpred3_MicroParser
    public final void synpred3_MicroParser_fragment() throws RecognitionException {
        // MicroParser.g:42:4: ( string_decl )
        // MicroParser.g:42:4: string_decl
        {
        pushFollow(FOLLOW_string_decl_in_synpred3_MicroParser143);
        string_decl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_MicroParser

    // $ANTLR start synpred4_MicroParser
    public final void synpred4_MicroParser_fragment() throws RecognitionException {
        // MicroParser.g:59:4: ( var_decl )
        // MicroParser.g:59:4: var_decl
        {
        pushFollow(FOLLOW_var_decl_in_synpred4_MicroParser203);
        var_decl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_MicroParser

    // Delegated rules

    public final boolean synpred3_MicroParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_MicroParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_MicroParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_MicroParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_38_in_program55 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_id_in_program57 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_program59 = new BitSet(new long[]{0x0000042C00000000L});
    public static final BitSet FOLLOW_pgm_body_in_program61 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_program63 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_id90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_pgm_body105 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_func_declarations_in_pgm_body110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_decl_list_in_decl125 = new BitSet(new long[]{0x0000042400000002L});
    public static final BitSet FOLLOW_var_decl_list_in_decl129 = new BitSet(new long[]{0x0000042400000002L});
    public static final BitSet FOLLOW_string_decl_in_string_decl_list143 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_string_decl157 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_id_in_string_decl159 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_string_decl161 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_str_in_string_decl163 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_string_decl165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLIETRAL_in_str189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_var_decl_list203 = new BitSet(new long[]{0x0000002400000002L});
    public static final BitSet FOLLOW_var_type_in_var_decl215 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_id_list_in_var_decl217 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_var_decl219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_var_type233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_var_type237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_type_in_any_type249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_any_type253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_id_list265 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_id_tail_in_id_list267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_id_tail280 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_id_in_id_tail282 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_param_decl_in_param_decl_list300 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_param_decl_tail_in_param_decl_list302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_type_in_param_decl313 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_id_in_param_decl315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_param_decl_tail329 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_param_decl_in_param_decl_tail331 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_func_decl_in_func_declarations347 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_func_decl359 = new BitSet(new long[]{0x0000202400000000L});
    public static final BitSet FOLLOW_any_type_in_func_decl361 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_id_in_func_decl363 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_func_decl367 = new BitSet(new long[]{0x0000002400080000L});
    public static final BitSet FOLLOW_param_decl_list_in_func_decl369 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_func_decl372 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_func_decl374 = new BitSet(new long[]{0x000047B400000200L});
    public static final BitSet FOLLOW_func_body_in_func_decl376 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_func_decl378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_decl_in_func_decl_tail391 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_decl_in_func_body402 = new BitSet(new long[]{0x0000439000000200L});
    public static final BitSet FOLLOW_stmt_list_in_func_body406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmt_list419 = new BitSet(new long[]{0x0000439000000202L});
    public static final BitSet FOLLOW_base_stmt_in_stmt431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_stmt435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeat_stmt_in_stmt439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_stmt_in_base_stmt449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_stmt_in_base_stmt453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_stmt_in_base_stmt457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_base_stmt461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_expr_in_assign_stmt473 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_assign_stmt475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_assign_expr485 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_assign_expr487 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_expr_in_assign_expr489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_read_stmt499 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_read_stmt501 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_id_list_in_read_stmt503 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_read_stmt505 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_read_stmt507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_write_stmt517 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_write_stmt519 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_id_list_in_write_stmt521 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_write_stmt523 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_write_stmt525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_return_stmt535 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_expr_in_return_stmt537 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_return_stmt539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_expr553 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_expr_tail_in_expr555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addop_in_expr_tail567 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_factor_in_expr_tail569 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_postfix_expr_in_factor580 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_factor_tail_in_factor582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mulop_in_factor_tail593 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_postfix_expr_in_factor_tail595 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_primary_in_postfix_expr607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_expr_in_postfix_expr611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call_expr621 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_call_expr623 = new BitSet(new long[]{0x00000000000C0680L});
    public static final BitSet FOLLOW_expr_list_in_call_expr625 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_call_expr628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list638 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_expr_list_tail_in_expr_list640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_expr_list_tail651 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_expr_in_expr_list_tail653 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18_in_primary665 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_expr_in_primary667 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_primary669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_primary674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_primary678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_primary682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_if_stmt727 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_if_stmt729 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_cond_in_if_stmt731 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_if_stmt733 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_if_stmt735 = new BitSet(new long[]{0x000047B680000200L});
    public static final BitSet FOLLOW_decl_in_if_stmt737 = new BitSet(new long[]{0x0000439280000200L});
    public static final BitSet FOLLOW_stmt_list_in_if_stmt739 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_else_part_in_if_stmt745 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_if_stmt747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_else_part762 = new BitSet(new long[]{0x000047B400000200L});
    public static final BitSet FOLLOW_decl_in_else_part764 = new BitSet(new long[]{0x0000439000000200L});
    public static final BitSet FOLLOW_stmt_list_in_else_part770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_cond782 = new BitSet(new long[]{0x0000000038020000L});
    public static final BitSet FOLLOW_compop_in_cond784 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_expr_in_cond786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_repeat_stmt823 = new BitSet(new long[]{0x000057B400000200L});
    public static final BitSet FOLLOW_decl_in_repeat_stmt825 = new BitSet(new long[]{0x0000539000000200L});
    public static final BitSet FOLLOW_stmt_list_in_repeat_stmt829 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_repeat_stmt831 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_repeat_stmt833 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_cond_in_repeat_stmt835 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_repeat_stmt837 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_repeat_stmt839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_decl_in_synpred3_MicroParser143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_synpred4_MicroParser203 = new BitSet(new long[]{0x0000000000000002L});

}