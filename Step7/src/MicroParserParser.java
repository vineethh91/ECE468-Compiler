// $ANTLR 3.4 MicroParser.g 2012-12-07 19:16:02

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
            // elements: pgm_body, id, 38
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
            // elements: 42, id, str
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

                if ( (LA3_0==34||LA3_0==37) ) {
                    int LA3_2 = input.LA(2);

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
    // MicroParser.g:62:1: var_decl : var_type id_list ';' -> ^( var_type id_list ) ;
    public final MicroParserParser.var_decl_return var_decl() throws RecognitionException {
        MicroParserParser.var_decl_return retval = new MicroParserParser.var_decl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal22=null;
        MicroParserParser.var_type_return var_type20 =null;

        MicroParserParser.id_list_return id_list21 =null;


        CommonTree char_literal22_tree=null;
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_var_type=new RewriteRuleSubtreeStream(adaptor,"rule var_type");
        RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");
        try {
            // MicroParser.g:63:2: ( var_type id_list ';' -> ^( var_type id_list ) )
            // MicroParser.g:63:4: var_type id_list ';'
            {
            pushFollow(FOLLOW_var_type_in_var_decl215);
            var_type20=var_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_var_type.add(var_type20.getTree());

            pushFollow(FOLLOW_id_list_in_var_decl217);
            id_list21=id_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id_list.add(id_list21.getTree());

            char_literal22=(Token)match(input,26,FOLLOW_26_in_var_decl219); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal22);


            if ( state.backtracking==0 ) {SymbolTableClass.insertSymbolIntoTable((var_type20!=null?input.toString(var_type20.start,var_type20.stop):null), (id_list21!=null?input.toString(id_list21.start,id_list21.stop):null), null);}

            // AST REWRITE
            // elements: var_type, id_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 63:104: -> ^( var_type id_list )
            {
                // MicroParser.g:63:107: ^( var_type id_list )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_var_type.nextNode(), root_1);

                adaptor.addChild(root_1, stream_id_list.nextTree());

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
    // $ANTLR end "var_decl"


    public static class var_type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_type"
    // MicroParser.g:66:1: var_type : ( 'FLOAT' | 'INT' );
    public final MicroParserParser.var_type_return var_type() throws RecognitionException {
        MicroParserParser.var_type_return retval = new MicroParserParser.var_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set23=null;

        CommonTree set23_tree=null;

        try {
            // MicroParser.g:67:2: ( 'FLOAT' | 'INT' )
            // MicroParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set23=(Token)input.LT(1);

            if ( input.LA(1)==34||input.LA(1)==37 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set23)
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

        Token string_literal25=null;
        MicroParserParser.var_type_return var_type24 =null;


        CommonTree string_literal25_tree=null;

        try {
            // MicroParser.g:71:2: ( var_type | 'VOID' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34||LA4_0==37) ) {
                alt4=1;
            }
            else if ( (LA4_0==45) ) {
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
                    // MicroParser.g:71:4: var_type
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_var_type_in_any_type255);
                    var_type24=var_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, var_type24.getTree());

                    }
                    break;
                case 2 :
                    // MicroParser.g:71:15: 'VOID'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal25=(Token)match(input,45,FOLLOW_45_in_any_type259); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal25_tree = 
                    (CommonTree)adaptor.create(string_literal25)
                    ;
                    adaptor.addChild(root_0, string_literal25_tree);
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

        MicroParserParser.id_return id26 =null;

        MicroParserParser.id_tail_return id_tail27 =null;



        try {
            // MicroParser.g:75:2: ( id id_tail )
            // MicroParser.g:75:4: id id_tail
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_id_in_id_list271);
            id26=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id26.getTree());

            pushFollow(FOLLOW_id_tail_in_id_list273);
            id_tail27=id_tail();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id_tail27.getTree());

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

        Token char_literal28=null;
        MicroParserParser.id_return id29 =null;


        CommonTree char_literal28_tree=null;

        try {
            // MicroParser.g:79:2: ( ( ',' id )* )
            // MicroParser.g:79:4: ( ',' id )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:79:4: ( ',' id )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // MicroParser.g:79:5: ',' id
            	    {
            	    char_literal28=(Token)match(input,22,FOLLOW_22_in_id_tail286); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal28_tree = 
            	    (CommonTree)adaptor.create(char_literal28)
            	    ;
            	    adaptor.addChild(root_0, char_literal28_tree);
            	    }

            	    pushFollow(FOLLOW_id_in_id_tail288);
            	    id29=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, id29.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
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

        MicroParserParser.param_decl_return param_decl30 =null;

        MicroParserParser.param_decl_tail_return param_decl_tail31 =null;



        try {
            // MicroParser.g:88:2: ( param_decl param_decl_tail )
            // MicroParser.g:88:4: param_decl param_decl_tail
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_param_decl_in_param_decl_list306);
            param_decl30=param_decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param_decl30.getTree());

            pushFollow(FOLLOW_param_decl_tail_in_param_decl_list308);
            param_decl_tail31=param_decl_tail();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param_decl_tail31.getTree());

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

        MicroParserParser.var_type_return var_type32 =null;

        MicroParserParser.id_return id33 =null;



        try {
            // MicroParser.g:92:2: ( var_type id )
            // MicroParser.g:92:4: var_type id
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_var_type_in_param_decl319);
            var_type32=var_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_type32.getTree());

            pushFollow(FOLLOW_id_in_param_decl321);
            id33=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id33.getTree());

            if ( state.backtracking==0 ) {SymbolTableClass.insertSymbolIntoTable((var_type32!=null?input.toString(var_type32.start,var_type32.stop):null), (id33!=null?input.toString(id33.start,id33.stop):null), "PARAMETER");}

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

        Token char_literal34=null;
        MicroParserParser.param_decl_return param_decl35 =null;


        CommonTree char_literal34_tree=null;

        try {
            // MicroParser.g:96:2: ( ( ',' param_decl )* )
            // MicroParser.g:96:4: ( ',' param_decl )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:96:4: ( ',' param_decl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // MicroParser.g:96:5: ',' param_decl
            	    {
            	    char_literal34=(Token)match(input,22,FOLLOW_22_in_param_decl_tail335); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal34_tree = 
            	    (CommonTree)adaptor.create(char_literal34)
            	    ;
            	    adaptor.addChild(root_0, char_literal34_tree);
            	    }

            	    pushFollow(FOLLOW_param_decl_in_param_decl_tail337);
            	    param_decl35=param_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, param_decl35.getTree());

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

        MicroParserParser.func_decl_return func_decl36 =null;



        try {
            // MicroParser.g:101:2: ( ( func_decl )* )
            // MicroParser.g:101:4: ( func_decl )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:101:4: ( func_decl )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==35) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // MicroParser.g:101:4: func_decl
            	    {
            	    pushFollow(FOLLOW_func_decl_in_func_declarations353);
            	    func_decl36=func_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, func_decl36.getTree());

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
    // $ANTLR end "func_declarations"


    public static class func_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func_decl"
    // MicroParser.g:104:1: func_decl : 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END' -> ^( 'FUNCTION' ^( id ( param_decl_list )? ) func_body ) ;
    public final MicroParserParser.func_decl_return func_decl() throws RecognitionException {
        MicroParserParser.func_decl_return retval = new MicroParserParser.func_decl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal37=null;
        Token char_literal40=null;
        Token char_literal42=null;
        Token string_literal43=null;
        Token string_literal45=null;
        MicroParserParser.any_type_return any_type38 =null;

        MicroParserParser.id_return id39 =null;

        MicroParserParser.param_decl_list_return param_decl_list41 =null;

        MicroParserParser.func_body_return func_body44 =null;


        CommonTree string_literal37_tree=null;
        CommonTree char_literal40_tree=null;
        CommonTree char_literal42_tree=null;
        CommonTree string_literal43_tree=null;
        CommonTree string_literal45_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_param_decl_list=new RewriteRuleSubtreeStream(adaptor,"rule param_decl_list");
        RewriteRuleSubtreeStream stream_func_body=new RewriteRuleSubtreeStream(adaptor,"rule func_body");
        RewriteRuleSubtreeStream stream_any_type=new RewriteRuleSubtreeStream(adaptor,"rule any_type");
        try {
            // MicroParser.g:105:2: ( 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END' -> ^( 'FUNCTION' ^( id ( param_decl_list )? ) func_body ) )
            // MicroParser.g:105:4: 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END'
            {
            string_literal37=(Token)match(input,35,FOLLOW_35_in_func_decl365); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_35.add(string_literal37);


            pushFollow(FOLLOW_any_type_in_func_decl367);
            any_type38=any_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_any_type.add(any_type38.getTree());

            pushFollow(FOLLOW_id_in_func_decl369);
            id39=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id39.getTree());

            if ( state.backtracking==0 ) {SymbolTableClass.createFunctionScopeTable((id39!=null?input.toString(id39.start,id39.stop):null)); }

            char_literal40=(Token)match(input,18,FOLLOW_18_in_func_decl373); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_18.add(char_literal40);


            // MicroParser.g:105:87: ( param_decl_list )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34||LA8_0==37) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // MicroParser.g:105:87: param_decl_list
                    {
                    pushFollow(FOLLOW_param_decl_list_in_func_decl375);
                    param_decl_list41=param_decl_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param_decl_list.add(param_decl_list41.getTree());

                    }
                    break;

            }


            char_literal42=(Token)match(input,19,FOLLOW_19_in_func_decl378); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_19.add(char_literal42);


            string_literal43=(Token)match(input,30,FOLLOW_30_in_func_decl380); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(string_literal43);


            pushFollow(FOLLOW_func_body_in_func_decl382);
            func_body44=func_body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_func_body.add(func_body44.getTree());

            string_literal45=(Token)match(input,32,FOLLOW_32_in_func_decl384); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_32.add(string_literal45);


            if ( state.backtracking==0 ) {SymbolTableClass.popSymbolTableOffTheStack();}

            // AST REWRITE
            // elements: param_decl_list, 35, func_body, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 105:180: -> ^( 'FUNCTION' ^( id ( param_decl_list )? ) func_body )
            {
                // MicroParser.g:105:183: ^( 'FUNCTION' ^( id ( param_decl_list )? ) func_body )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_35.nextNode()
                , root_1);

                // MicroParser.g:105:196: ^( id ( param_decl_list )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_id.nextNode(), root_2);

                // MicroParser.g:105:201: ( param_decl_list )?
                if ( stream_param_decl_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_param_decl_list.nextTree());

                }
                stream_param_decl_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_func_body.nextTree());

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

        MicroParserParser.func_decl_return func_decl46 =null;



        try {
            // MicroParser.g:109:2: ( ( func_decl )* )
            // MicroParser.g:109:4: ( func_decl )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:109:4: ( func_decl )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // MicroParser.g:109:4: func_decl
            	    {
            	    pushFollow(FOLLOW_func_decl_in_func_decl_tail412);
            	    func_decl46=func_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, func_decl46.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
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

        MicroParserParser.decl_return decl47 =null;

        MicroParserParser.stmt_list_return stmt_list48 =null;



        try {
            // MicroParser.g:112:2: ( decl stmt_list )
            // MicroParser.g:112:4: decl stmt_list
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_decl_in_func_body423);
            decl47=decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, decl47.getTree());

            if ( state.backtracking==0 ) {SymbolTableClass.printSymbolTable();}

            pushFollow(FOLLOW_stmt_list_in_func_body427);
            stmt_list48=stmt_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt_list48.getTree());

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

        MicroParserParser.stmt_return stmt49 =null;



        try {
            // MicroParser.g:117:2: ( ( stmt )* )
            // MicroParser.g:117:4: ( stmt )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:117:4: ( stmt )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==IDENTIFIER||LA10_0==36||(LA10_0 >= 39 && LA10_0 <= 41)||LA10_0==46) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // MicroParser.g:117:4: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_stmt_list440);
            	    stmt49=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt49.getTree());

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

        MicroParserParser.base_stmt_return base_stmt50 =null;

        MicroParserParser.if_stmt_return if_stmt51 =null;

        MicroParserParser.repeat_stmt_return repeat_stmt52 =null;



        try {
            // MicroParser.g:123:6: ( base_stmt | if_stmt | repeat_stmt )
            int alt11=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
            case 39:
            case 41:
            case 46:
                {
                alt11=1;
                }
                break;
            case 36:
                {
                alt11=2;
                }
                break;
            case 40:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // MicroParser.g:123:8: base_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_base_stmt_in_stmt452);
                    base_stmt50=base_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base_stmt50.getTree());

                    }
                    break;
                case 2 :
                    // MicroParser.g:123:20: if_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_if_stmt_in_stmt456);
                    if_stmt51=if_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_stmt51.getTree());

                    }
                    break;
                case 3 :
                    // MicroParser.g:123:30: repeat_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_repeat_stmt_in_stmt460);
                    repeat_stmt52=repeat_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, repeat_stmt52.getTree());

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

        MicroParserParser.assign_stmt_return assign_stmt53 =null;

        MicroParserParser.read_stmt_return read_stmt54 =null;

        MicroParserParser.write_stmt_return write_stmt55 =null;

        MicroParserParser.return_stmt_return return_stmt56 =null;



        try {
            // MicroParser.g:126:2: ( assign_stmt | read_stmt | write_stmt | return_stmt )
            int alt12=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt12=1;
                }
                break;
            case 39:
                {
                alt12=2;
                }
                break;
            case 46:
                {
                alt12=3;
                }
                break;
            case 41:
                {
                alt12=4;
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
                    // MicroParser.g:126:4: assign_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_stmt_in_base_stmt470);
                    assign_stmt53=assign_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assign_stmt53.getTree());

                    }
                    break;
                case 2 :
                    // MicroParser.g:126:18: read_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_read_stmt_in_base_stmt474);
                    read_stmt54=read_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, read_stmt54.getTree());

                    }
                    break;
                case 3 :
                    // MicroParser.g:126:30: write_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_write_stmt_in_base_stmt478);
                    write_stmt55=write_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, write_stmt55.getTree());

                    }
                    break;
                case 4 :
                    // MicroParser.g:126:43: return_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_base_stmt482);
                    return_stmt56=return_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, return_stmt56.getTree());

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
    // MicroParser.g:130:1: assign_stmt : assign_expr ';' !;
    public final MicroParserParser.assign_stmt_return assign_stmt() throws RecognitionException {
        MicroParserParser.assign_stmt_return retval = new MicroParserParser.assign_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal58=null;
        MicroParserParser.assign_expr_return assign_expr57 =null;


        CommonTree char_literal58_tree=null;

        try {
            // MicroParser.g:131:2: ( assign_expr ';' !)
            // MicroParser.g:131:4: assign_expr ';' !
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_assign_expr_in_assign_stmt494);
            assign_expr57=assign_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assign_expr57.getTree());

            char_literal58=(Token)match(input,26,FOLLOW_26_in_assign_stmt496); if (state.failed) return retval;

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
    // MicroParser.g:133:1: assign_expr : id ':=' expr -> ^( ':=' id expr ) ;
    public final MicroParserParser.assign_expr_return assign_expr() throws RecognitionException {
        MicroParserParser.assign_expr_return retval = new MicroParserParser.assign_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal60=null;
        MicroParserParser.id_return id59 =null;

        MicroParserParser.expr_return expr61 =null;


        CommonTree string_literal60_tree=null;
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // MicroParser.g:134:2: ( id ':=' expr -> ^( ':=' id expr ) )
            // MicroParser.g:134:4: id ':=' expr
            {
            pushFollow(FOLLOW_id_in_assign_expr507);
            id59=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id59.getTree());

            string_literal60=(Token)match(input,25,FOLLOW_25_in_assign_expr509); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_25.add(string_literal60);


            pushFollow(FOLLOW_expr_in_assign_expr511);
            expr61=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr61.getTree());

            // AST REWRITE
            // elements: 25, expr, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 134:17: -> ^( ':=' id expr )
            {
                // MicroParser.g:134:20: ^( ':=' id expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_25.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_1, stream_expr.nextTree());

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
    // $ANTLR end "assign_expr"


    public static class read_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read_stmt"
    // MicroParser.g:136:1: read_stmt : 'READ' '(' id_list ')' ';' -> ^( 'READ' id_list ) ;
    public final MicroParserParser.read_stmt_return read_stmt() throws RecognitionException {
        MicroParserParser.read_stmt_return retval = new MicroParserParser.read_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal62=null;
        Token char_literal63=null;
        Token char_literal65=null;
        Token char_literal66=null;
        MicroParserParser.id_list_return id_list64 =null;


        CommonTree string_literal62_tree=null;
        CommonTree char_literal63_tree=null;
        CommonTree char_literal65_tree=null;
        CommonTree char_literal66_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");
        try {
            // MicroParser.g:137:2: ( 'READ' '(' id_list ')' ';' -> ^( 'READ' id_list ) )
            // MicroParser.g:137:4: 'READ' '(' id_list ')' ';'
            {
            string_literal62=(Token)match(input,39,FOLLOW_39_in_read_stmt532); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_39.add(string_literal62);


            char_literal63=(Token)match(input,18,FOLLOW_18_in_read_stmt534); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_18.add(char_literal63);


            pushFollow(FOLLOW_id_list_in_read_stmt536);
            id_list64=id_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id_list.add(id_list64.getTree());

            char_literal65=(Token)match(input,19,FOLLOW_19_in_read_stmt538); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_19.add(char_literal65);


            char_literal66=(Token)match(input,26,FOLLOW_26_in_read_stmt540); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal66);


            // AST REWRITE
            // elements: 39, id_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 137:31: -> ^( 'READ' id_list )
            {
                // MicroParser.g:137:34: ^( 'READ' id_list )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_39.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_id_list.nextTree());

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
    // $ANTLR end "read_stmt"


    public static class write_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write_stmt"
    // MicroParser.g:139:1: write_stmt : 'WRITE' '(' id_list ')' ';' -> ^( 'WRITE' id_list ) ;
    public final MicroParserParser.write_stmt_return write_stmt() throws RecognitionException {
        MicroParserParser.write_stmt_return retval = new MicroParserParser.write_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal67=null;
        Token char_literal68=null;
        Token char_literal70=null;
        Token char_literal71=null;
        MicroParserParser.id_list_return id_list69 =null;


        CommonTree string_literal67_tree=null;
        CommonTree char_literal68_tree=null;
        CommonTree char_literal70_tree=null;
        CommonTree char_literal71_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");
        try {
            // MicroParser.g:140:2: ( 'WRITE' '(' id_list ')' ';' -> ^( 'WRITE' id_list ) )
            // MicroParser.g:140:4: 'WRITE' '(' id_list ')' ';'
            {
            string_literal67=(Token)match(input,46,FOLLOW_46_in_write_stmt558); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(string_literal67);


            char_literal68=(Token)match(input,18,FOLLOW_18_in_write_stmt560); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_18.add(char_literal68);


            pushFollow(FOLLOW_id_list_in_write_stmt562);
            id_list69=id_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id_list.add(id_list69.getTree());

            char_literal70=(Token)match(input,19,FOLLOW_19_in_write_stmt564); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_19.add(char_literal70);


            char_literal71=(Token)match(input,26,FOLLOW_26_in_write_stmt566); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal71);


            // AST REWRITE
            // elements: id_list, 46
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 140:32: -> ^( 'WRITE' id_list )
            {
                // MicroParser.g:140:35: ^( 'WRITE' id_list )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_46.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_id_list.nextTree());

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
    // $ANTLR end "write_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // MicroParser.g:142:1: return_stmt : 'RETURN' expr ';' -> ^( 'RETURN' expr ) ;
    public final MicroParserParser.return_stmt_return return_stmt() throws RecognitionException {
        MicroParserParser.return_stmt_return retval = new MicroParserParser.return_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal72=null;
        Token char_literal74=null;
        MicroParserParser.expr_return expr73 =null;


        CommonTree string_literal72_tree=null;
        CommonTree char_literal74_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // MicroParser.g:143:2: ( 'RETURN' expr ';' -> ^( 'RETURN' expr ) )
            // MicroParser.g:143:4: 'RETURN' expr ';'
            {
            string_literal72=(Token)match(input,41,FOLLOW_41_in_return_stmt584); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(string_literal72);


            pushFollow(FOLLOW_expr_in_return_stmt586);
            expr73=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr73.getTree());

            char_literal74=(Token)match(input,26,FOLLOW_26_in_return_stmt588); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal74);


            // AST REWRITE
            // elements: expr, 41
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 143:22: -> ^( 'RETURN' expr )
            {
                // MicroParser.g:143:25: ^( 'RETURN' expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_41.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

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
    // $ANTLR end "return_stmt"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // MicroParser.g:147:1: expr : expr_tail ;
    public final MicroParserParser.expr_return expr() throws RecognitionException {
        MicroParserParser.expr_return retval = new MicroParserParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.expr_tail_return expr_tail75 =null;



        try {
            // MicroParser.g:147:6: ( expr_tail )
            // MicroParser.g:147:8: expr_tail
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_tail_in_expr608);
            expr_tail75=expr_tail();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_tail75.getTree());

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
    // MicroParser.g:149:1: expr_tail : factor ( addop ^ factor )* ;
    public final MicroParserParser.expr_tail_return expr_tail() throws RecognitionException {
        MicroParserParser.expr_tail_return retval = new MicroParserParser.expr_tail_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.factor_return factor76 =null;

        MicroParserParser.addop_return addop77 =null;

        MicroParserParser.factor_return factor78 =null;



        try {
            // MicroParser.g:150:2: ( factor ( addop ^ factor )* )
            // MicroParser.g:150:4: factor ( addop ^ factor )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_expr_tail619);
            factor76=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor76.getTree());

            // MicroParser.g:150:11: ( addop ^ factor )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21||LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // MicroParser.g:150:12: addop ^ factor
            	    {
            	    pushFollow(FOLLOW_addop_in_expr_tail622);
            	    addop77=addop();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(addop77.getTree(), root_0);

            	    pushFollow(FOLLOW_factor_in_expr_tail625);
            	    factor78=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor78.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // MicroParser.g:152:1: factor : postfix_expr ( mulop ^ postfix_expr )* ;
    public final MicroParserParser.factor_return factor() throws RecognitionException {
        MicroParserParser.factor_return retval = new MicroParserParser.factor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.postfix_expr_return postfix_expr79 =null;

        MicroParserParser.mulop_return mulop80 =null;

        MicroParserParser.postfix_expr_return postfix_expr81 =null;



        try {
            // MicroParser.g:152:8: ( postfix_expr ( mulop ^ postfix_expr )* )
            // MicroParser.g:152:10: postfix_expr ( mulop ^ postfix_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_postfix_expr_in_factor636);
            postfix_expr79=postfix_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expr79.getTree());

            // MicroParser.g:152:23: ( mulop ^ postfix_expr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20||LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // MicroParser.g:152:24: mulop ^ postfix_expr
            	    {
            	    pushFollow(FOLLOW_mulop_in_factor639);
            	    mulop80=mulop();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(mulop80.getTree(), root_0);

            	    pushFollow(FOLLOW_postfix_expr_in_factor642);
            	    postfix_expr81=postfix_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expr81.getTree());

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
    // $ANTLR end "factor"


    public static class factor_tail_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor_tail"
    // MicroParser.g:154:1: factor_tail : ( mulop ^ postfix_expr )* ;
    public final MicroParserParser.factor_tail_return factor_tail() throws RecognitionException {
        MicroParserParser.factor_tail_return retval = new MicroParserParser.factor_tail_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.mulop_return mulop82 =null;

        MicroParserParser.postfix_expr_return postfix_expr83 =null;



        try {
            // MicroParser.g:155:2: ( ( mulop ^ postfix_expr )* )
            // MicroParser.g:155:4: ( mulop ^ postfix_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // MicroParser.g:155:4: ( mulop ^ postfix_expr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20||LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // MicroParser.g:155:5: mulop ^ postfix_expr
            	    {
            	    pushFollow(FOLLOW_mulop_in_factor_tail656);
            	    mulop82=mulop();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(mulop82.getTree(), root_0);

            	    pushFollow(FOLLOW_postfix_expr_in_factor_tail659);
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


                    pushFollow(FOLLOW_primary_in_postfix_expr671);
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


                    pushFollow(FOLLOW_call_expr_in_postfix_expr675);
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
    // MicroParser.g:160:1: call_expr : id '(' ( expr_list )? ')' -> ^( id ( expr_list )? ) ;
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
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // MicroParser.g:161:2: ( id '(' ( expr_list )? ')' -> ^( id ( expr_list )? ) )
            // MicroParser.g:161:4: id '(' ( expr_list )? ')'
            {
            pushFollow(FOLLOW_id_in_call_expr685);
            id86=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id86.getTree());

            char_literal87=(Token)match(input,18,FOLLOW_18_in_call_expr687); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_18.add(char_literal87);


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
                    pushFollow(FOLLOW_expr_list_in_call_expr689);
                    expr_list88=expr_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr_list.add(expr_list88.getTree());

                    }
                    break;

            }


            char_literal89=(Token)match(input,19,FOLLOW_19_in_call_expr692); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_19.add(char_literal89);


            // AST REWRITE
            // elements: expr_list, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 161:26: -> ^( id ( expr_list )? )
            {
                // MicroParser.g:161:29: ^( id ( expr_list )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_id.nextNode(), root_1);

                // MicroParser.g:161:35: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

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


            pushFollow(FOLLOW_expr_in_expr_list712);
            expr90=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr90.getTree());

            pushFollow(FOLLOW_expr_list_tail_in_expr_list714);
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
            	    char_literal92=(Token)match(input,22,FOLLOW_22_in_expr_list_tail725); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal92_tree = 
            	    (CommonTree)adaptor.create(char_literal92)
            	    ;
            	    adaptor.addChild(root_0, char_literal92_tree);
            	    }

            	    pushFollow(FOLLOW_expr_in_expr_list_tail727);
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
    // MicroParser.g:169:1: primary : ( ( '(' ! expr ')' !) | id | INTLITERAL | FLOATLITERAL );
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
            // MicroParser.g:169:9: ( ( '(' ! expr ')' !) | id | INTLITERAL | FLOATLITERAL )
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
                    // MicroParser.g:169:11: ( '(' ! expr ')' !)
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // MicroParser.g:169:11: ( '(' ! expr ')' !)
                    // MicroParser.g:169:12: '(' ! expr ')' !
                    {
                    char_literal94=(Token)match(input,18,FOLLOW_18_in_primary739); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_primary742);
                    expr95=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr95.getTree());

                    char_literal96=(Token)match(input,19,FOLLOW_19_in_primary744); if (state.failed) return retval;

                    }


                    }
                    break;
                case 2 :
                    // MicroParser.g:169:30: id
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_id_in_primary750);
                    id97=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id97.getTree());

                    }
                    break;
                case 3 :
                    // MicroParser.g:169:35: INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INTLITERAL98=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_primary754); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTLITERAL98_tree = 
                    (CommonTree)adaptor.create(INTLITERAL98)
                    ;
                    adaptor.addChild(root_0, INTLITERAL98_tree);
                    }

                    }
                    break;
                case 4 :
                    // MicroParser.g:169:48: FLOATLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FLOATLITERAL99=(Token)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_primary758); if (state.failed) return retval;
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
    // MicroParser.g:177:1: if_stmt : 'IF' '(' cond ')' 'THEN' decl stmt_list else_part 'ENDIF' -> ^( 'IF' cond ^( 'THEN' ( decl )? stmt_list ) ( else_part )? 'ENDIF' ) ;
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
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_stmt_list=new RewriteRuleSubtreeStream(adaptor,"rule stmt_list");
        RewriteRuleSubtreeStream stream_else_part=new RewriteRuleSubtreeStream(adaptor,"rule else_part");
        RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond");
        RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");
        try {
            // MicroParser.g:177:9: ( 'IF' '(' cond ')' 'THEN' decl stmt_list else_part 'ENDIF' -> ^( 'IF' cond ^( 'THEN' ( decl )? stmt_list ) ( else_part )? 'ENDIF' ) )
            // MicroParser.g:177:11: 'IF' '(' cond ')' 'THEN' decl stmt_list else_part 'ENDIF'
            {
            if ( state.backtracking==0 ) {SymbolTableClass.createBlockScopeTable();}

            string_literal102=(Token)match(input,36,FOLLOW_36_in_if_stmt803); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_36.add(string_literal102);


            char_literal103=(Token)match(input,18,FOLLOW_18_in_if_stmt805); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_18.add(char_literal103);


            pushFollow(FOLLOW_cond_in_if_stmt807);
            cond104=cond();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_cond.add(cond104.getTree());

            char_literal105=(Token)match(input,19,FOLLOW_19_in_if_stmt809); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_19.add(char_literal105);


            string_literal106=(Token)match(input,43,FOLLOW_43_in_if_stmt811); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_43.add(string_literal106);


            pushFollow(FOLLOW_decl_in_if_stmt813);
            decl107=decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_decl.add(decl107.getTree());

            pushFollow(FOLLOW_stmt_list_in_if_stmt815);
            stmt_list108=stmt_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmt_list.add(stmt_list108.getTree());

            if ( state.backtracking==0 ) {SymbolTableClass.printSymbolTable();}

            if ( state.backtracking==0 ) {SymbolTableClass.popSymbolTableOffTheStack();}

            pushFollow(FOLLOW_else_part_in_if_stmt821);
            else_part109=else_part();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_else_part.add(else_part109.getTree());

            string_literal110=(Token)match(input,33,FOLLOW_33_in_if_stmt823); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_33.add(string_literal110);


            // AST REWRITE
            // elements: 33, 36, else_part, 43, decl, stmt_list, cond
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 177:200: -> ^( 'IF' cond ^( 'THEN' ( decl )? stmt_list ) ( else_part )? 'ENDIF' )
            {
                // MicroParser.g:177:203: ^( 'IF' cond ^( 'THEN' ( decl )? stmt_list ) ( else_part )? 'ENDIF' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_36.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_cond.nextTree());

                // MicroParser.g:177:215: ^( 'THEN' ( decl )? stmt_list )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_43.nextNode()
                , root_2);

                // MicroParser.g:177:224: ( decl )?
                if ( stream_decl.hasNext() ) {
                    adaptor.addChild(root_2, stream_decl.nextTree());

                }
                stream_decl.reset();

                adaptor.addChild(root_2, stream_stmt_list.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // MicroParser.g:177:241: ( else_part )?
                if ( stream_else_part.hasNext() ) {
                    adaptor.addChild(root_1, stream_else_part.nextTree());

                }
                stream_else_part.reset();

                adaptor.addChild(root_1, 
                stream_33.nextNode()
                );

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
    // $ANTLR end "if_stmt"


    public static class else_part_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_part"
    // MicroParser.g:179:1: else_part : ( 'ELSE' decl stmt_list )? -> ( ^( 'ELSE' ( decl )? stmt_list ) )? ;
    public final MicroParserParser.else_part_return else_part() throws RecognitionException {
        MicroParserParser.else_part_return retval = new MicroParserParser.else_part_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal111=null;
        MicroParserParser.decl_return decl112 =null;

        MicroParserParser.stmt_list_return stmt_list113 =null;


        CommonTree string_literal111_tree=null;
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_stmt_list=new RewriteRuleSubtreeStream(adaptor,"rule stmt_list");
        RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");
        try {
            // MicroParser.g:180:2: ( ( 'ELSE' decl stmt_list )? -> ( ^( 'ELSE' ( decl )? stmt_list ) )? )
            // MicroParser.g:180:4: ( 'ELSE' decl stmt_list )?
            {
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

                    string_literal111=(Token)match(input,31,FOLLOW_31_in_else_part862); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(string_literal111);


                    pushFollow(FOLLOW_decl_in_else_part864);
                    decl112=decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_decl.add(decl112.getTree());

                    if ( state.backtracking==0 ) {SymbolTableClass.printSymbolTable();}

                    if ( state.backtracking==0 ) {SymbolTableClass.popSymbolTableOffTheStack();}

                    pushFollow(FOLLOW_stmt_list_in_else_part870);
                    stmt_list113=stmt_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmt_list.add(stmt_list113.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: 31, stmt_list, decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 180:163: -> ( ^( 'ELSE' ( decl )? stmt_list ) )?
            {
                // MicroParser.g:180:166: ( ^( 'ELSE' ( decl )? stmt_list ) )?
                if ( stream_31.hasNext()||stream_stmt_list.hasNext()||stream_decl.hasNext() ) {
                    // MicroParser.g:180:166: ^( 'ELSE' ( decl )? stmt_list )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(
                    stream_31.nextNode()
                    , root_1);

                    // MicroParser.g:180:175: ( decl )?
                    if ( stream_decl.hasNext() ) {
                        adaptor.addChild(root_1, stream_decl.nextTree());

                    }
                    stream_decl.reset();

                    adaptor.addChild(root_1, stream_stmt_list.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_31.reset();
                stream_stmt_list.reset();
                stream_decl.reset();

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
    // $ANTLR end "else_part"


    public static class cond_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cond"
    // MicroParser.g:182:1: cond : expr compop ^ expr ;
    public final MicroParserParser.cond_return cond() throws RecognitionException {
        MicroParserParser.cond_return retval = new MicroParserParser.cond_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MicroParserParser.expr_return expr114 =null;

        MicroParserParser.compop_return compop115 =null;

        MicroParserParser.expr_return expr116 =null;



        try {
            // MicroParser.g:182:6: ( expr compop ^ expr )
            // MicroParser.g:182:8: expr compop ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_cond894);
            expr114=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr114.getTree());

            pushFollow(FOLLOW_compop_in_cond896);
            compop115=compop();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(compop115.getTree(), root_0);

            pushFollow(FOLLOW_expr_in_cond899);
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
    // MicroParser.g:188:1: repeat_stmt : 'REPEAT' decl stmt_list 'UNTIL' '(' cond ')' ';' -> ^( 'REPEAT' ( decl )? stmt_list ^( 'UNTIL' cond ) ) ;
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
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_stmt_list=new RewriteRuleSubtreeStream(adaptor,"rule stmt_list");
        RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond");
        RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");
        try {
            // MicroParser.g:189:2: ( 'REPEAT' decl stmt_list 'UNTIL' '(' cond ')' ';' -> ^( 'REPEAT' ( decl )? stmt_list ^( 'UNTIL' cond ) ) )
            // MicroParser.g:189:4: 'REPEAT' decl stmt_list 'UNTIL' '(' cond ')' ';'
            {
            if ( state.backtracking==0 ) {SymbolTableClass.createBlockScopeTable();}

            string_literal118=(Token)match(input,40,FOLLOW_40_in_repeat_stmt936); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_40.add(string_literal118);


            pushFollow(FOLLOW_decl_in_repeat_stmt938);
            decl119=decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_decl.add(decl119.getTree());

            if ( state.backtracking==0 ) {SymbolTableClass.printSymbolTable();}

            pushFollow(FOLLOW_stmt_list_in_repeat_stmt942);
            stmt_list120=stmt_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmt_list.add(stmt_list120.getTree());

            string_literal121=(Token)match(input,44,FOLLOW_44_in_repeat_stmt944); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_44.add(string_literal121);


            char_literal122=(Token)match(input,18,FOLLOW_18_in_repeat_stmt946); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_18.add(char_literal122);


            pushFollow(FOLLOW_cond_in_repeat_stmt948);
            cond123=cond();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_cond.add(cond123.getTree());

            char_literal124=(Token)match(input,19,FOLLOW_19_in_repeat_stmt950); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_19.add(char_literal124);


            char_literal125=(Token)match(input,26,FOLLOW_26_in_repeat_stmt952); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal125);


            if ( state.backtracking==0 ) {SymbolTableClass.popSymbolTableOffTheStack();}

            // AST REWRITE
            // elements: stmt_list, cond, decl, 40, 44
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 189:184: -> ^( 'REPEAT' ( decl )? stmt_list ^( 'UNTIL' cond ) )
            {
                // MicroParser.g:189:187: ^( 'REPEAT' ( decl )? stmt_list ^( 'UNTIL' cond ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_40.nextNode()
                , root_1);

                // MicroParser.g:189:198: ( decl )?
                if ( stream_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_decl.nextTree());

                }
                stream_decl.reset();

                adaptor.addChild(root_1, stream_stmt_list.nextTree());

                // MicroParser.g:189:214: ^( 'UNTIL' cond )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_44.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_cond.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
    public static final BitSet FOLLOW_var_type_in_any_type255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_any_type259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_id_list271 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_id_tail_in_id_list273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_id_tail286 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_id_in_id_tail288 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_param_decl_in_param_decl_list306 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_param_decl_tail_in_param_decl_list308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_type_in_param_decl319 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_id_in_param_decl321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_param_decl_tail335 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_param_decl_in_param_decl_tail337 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_func_decl_in_func_declarations353 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_func_decl365 = new BitSet(new long[]{0x0000202400000000L});
    public static final BitSet FOLLOW_any_type_in_func_decl367 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_id_in_func_decl369 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_func_decl373 = new BitSet(new long[]{0x0000002400080000L});
    public static final BitSet FOLLOW_param_decl_list_in_func_decl375 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_func_decl378 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_func_decl380 = new BitSet(new long[]{0x000047B400000200L});
    public static final BitSet FOLLOW_func_body_in_func_decl382 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_func_decl384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_decl_in_func_decl_tail412 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_decl_in_func_body423 = new BitSet(new long[]{0x0000439000000200L});
    public static final BitSet FOLLOW_stmt_list_in_func_body427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmt_list440 = new BitSet(new long[]{0x0000439000000202L});
    public static final BitSet FOLLOW_base_stmt_in_stmt452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_stmt456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeat_stmt_in_stmt460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_stmt_in_base_stmt470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_stmt_in_base_stmt474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_stmt_in_base_stmt478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_base_stmt482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_expr_in_assign_stmt494 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_assign_stmt496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_assign_expr507 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_assign_expr509 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_expr_in_assign_expr511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_read_stmt532 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_read_stmt534 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_id_list_in_read_stmt536 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_read_stmt538 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_read_stmt540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_write_stmt558 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_write_stmt560 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_id_list_in_write_stmt562 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_write_stmt564 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_write_stmt566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_return_stmt584 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_expr_in_return_stmt586 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_return_stmt588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_tail_in_expr608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_expr_tail619 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_addop_in_expr_tail622 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_factor_in_expr_tail625 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_postfix_expr_in_factor636 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_mulop_in_factor639 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_postfix_expr_in_factor642 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_mulop_in_factor_tail656 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_postfix_expr_in_factor_tail659 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_primary_in_postfix_expr671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_expr_in_postfix_expr675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call_expr685 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_call_expr687 = new BitSet(new long[]{0x00000000000C0680L});
    public static final BitSet FOLLOW_expr_list_in_call_expr689 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_call_expr692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list712 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_expr_list_tail_in_expr_list714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_expr_list_tail725 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_expr_in_expr_list_tail727 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18_in_primary739 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_expr_in_primary742 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_primary744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_primary750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_primary754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_primary758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_if_stmt803 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_if_stmt805 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_cond_in_if_stmt807 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_if_stmt809 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_if_stmt811 = new BitSet(new long[]{0x000047B680000200L});
    public static final BitSet FOLLOW_decl_in_if_stmt813 = new BitSet(new long[]{0x0000439280000200L});
    public static final BitSet FOLLOW_stmt_list_in_if_stmt815 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_else_part_in_if_stmt821 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_if_stmt823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_else_part862 = new BitSet(new long[]{0x000047B400000200L});
    public static final BitSet FOLLOW_decl_in_else_part864 = new BitSet(new long[]{0x0000439000000200L});
    public static final BitSet FOLLOW_stmt_list_in_else_part870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_cond894 = new BitSet(new long[]{0x0000000038020000L});
    public static final BitSet FOLLOW_compop_in_cond896 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_expr_in_cond899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_repeat_stmt936 = new BitSet(new long[]{0x000057B400000200L});
    public static final BitSet FOLLOW_decl_in_repeat_stmt938 = new BitSet(new long[]{0x0000539000000200L});
    public static final BitSet FOLLOW_stmt_list_in_repeat_stmt942 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_repeat_stmt944 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_repeat_stmt946 = new BitSet(new long[]{0x0000000000040680L});
    public static final BitSet FOLLOW_cond_in_repeat_stmt948 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_repeat_stmt950 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_repeat_stmt952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_decl_in_synpred3_MicroParser143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_synpred4_MicroParser203 = new BitSet(new long[]{0x0000000000000002L});

}