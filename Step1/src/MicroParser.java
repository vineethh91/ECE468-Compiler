// $ANTLR 3.4 MicroParser.g 2012-08-26 19:30:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MicroParser extends Lexer {
    public static final int EOF=-1;
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MicroParser() {} 
    public MicroParser(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MicroParser(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "MicroParser.g"; }

    // $ANTLR start "KEYWORD"
    public final void mKEYWORD() throws RecognitionException {
        try {
            int _type = KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:3:9: ( ( 'PROGRAM' ) | ( 'BEGIN' ) | ( 'END' ) | ( 'FUNCTION' ) | ( 'READ' ) | ( 'WRITE' ) | ( 'IF' ) | ( 'THEN' ) | ( 'ELSE' ) | ( 'ENDIF' ) | ( 'REPEAT' ) | ( 'UNTIL' ) | ( 'CONTINUE' ) | ( 'BREAK' ) | ( 'RETURN' ) | ( 'INT' ) | ( 'VOID' ) | ( 'STRING' ) | ( 'FLOAT' ) )
            int alt1=19;
            switch ( input.LA(1) ) {
            case 'P':
                {
                alt1=1;
                }
                break;
            case 'B':
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='E') ) {
                    alt1=2;
                }
                else if ( (LA1_2=='R') ) {
                    alt1=14;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'E':
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3=='N') ) {
                    int LA1_15 = input.LA(3);

                    if ( (LA1_15=='D') ) {
                        int LA1_22 = input.LA(4);

                        if ( (LA1_22=='I') ) {
                            alt1=10;
                        }
                        else {
                            alt1=3;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 15, input);

                        throw nvae;

                    }
                }
                else if ( (LA1_3=='L') ) {
                    alt1=9;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;

                }
                }
                break;
            case 'F':
                {
                int LA1_4 = input.LA(2);

                if ( (LA1_4=='U') ) {
                    alt1=4;
                }
                else if ( (LA1_4=='L') ) {
                    alt1=19;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;

                }
                }
                break;
            case 'R':
                {
                int LA1_5 = input.LA(2);

                if ( (LA1_5=='E') ) {
                    switch ( input.LA(3) ) {
                    case 'A':
                        {
                        alt1=5;
                        }
                        break;
                    case 'P':
                        {
                        alt1=11;
                        }
                        break;
                    case 'T':
                        {
                        alt1=15;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 19, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;

                }
                }
                break;
            case 'W':
                {
                alt1=6;
                }
                break;
            case 'I':
                {
                int LA1_7 = input.LA(2);

                if ( (LA1_7=='F') ) {
                    alt1=7;
                }
                else if ( (LA1_7=='N') ) {
                    alt1=16;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 7, input);

                    throw nvae;

                }
                }
                break;
            case 'T':
                {
                alt1=8;
                }
                break;
            case 'U':
                {
                alt1=12;
                }
                break;
            case 'C':
                {
                alt1=13;
                }
                break;
            case 'V':
                {
                alt1=17;
                }
                break;
            case 'S':
                {
                alt1=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // MicroParser.g:3:11: ( 'PROGRAM' )
                    {
                    // MicroParser.g:3:11: ( 'PROGRAM' )
                    // MicroParser.g:3:12: 'PROGRAM'
                    {
                    match("PROGRAM"); 



                    }


                    }
                    break;
                case 2 :
                    // MicroParser.g:3:25: ( 'BEGIN' )
                    {
                    // MicroParser.g:3:25: ( 'BEGIN' )
                    // MicroParser.g:3:26: 'BEGIN'
                    {
                    match("BEGIN"); 



                    }


                    }
                    break;
                case 3 :
                    // MicroParser.g:3:37: ( 'END' )
                    {
                    // MicroParser.g:3:37: ( 'END' )
                    // MicroParser.g:3:38: 'END'
                    {
                    match("END"); 



                    }


                    }
                    break;
                case 4 :
                    // MicroParser.g:3:47: ( 'FUNCTION' )
                    {
                    // MicroParser.g:3:47: ( 'FUNCTION' )
                    // MicroParser.g:3:48: 'FUNCTION'
                    {
                    match("FUNCTION"); 



                    }


                    }
                    break;
                case 5 :
                    // MicroParser.g:3:62: ( 'READ' )
                    {
                    // MicroParser.g:3:62: ( 'READ' )
                    // MicroParser.g:3:63: 'READ'
                    {
                    match("READ"); 



                    }


                    }
                    break;
                case 6 :
                    // MicroParser.g:3:73: ( 'WRITE' )
                    {
                    // MicroParser.g:3:73: ( 'WRITE' )
                    // MicroParser.g:3:74: 'WRITE'
                    {
                    match("WRITE"); 



                    }


                    }
                    break;
                case 7 :
                    // MicroParser.g:4:4: ( 'IF' )
                    {
                    // MicroParser.g:4:4: ( 'IF' )
                    // MicroParser.g:4:5: 'IF'
                    {
                    match("IF"); 



                    }


                    }
                    break;
                case 8 :
                    // MicroParser.g:4:13: ( 'THEN' )
                    {
                    // MicroParser.g:4:13: ( 'THEN' )
                    // MicroParser.g:4:14: 'THEN'
                    {
                    match("THEN"); 



                    }


                    }
                    break;
                case 9 :
                    // MicroParser.g:4:24: ( 'ELSE' )
                    {
                    // MicroParser.g:4:24: ( 'ELSE' )
                    // MicroParser.g:4:25: 'ELSE'
                    {
                    match("ELSE"); 



                    }


                    }
                    break;
                case 10 :
                    // MicroParser.g:4:35: ( 'ENDIF' )
                    {
                    // MicroParser.g:4:35: ( 'ENDIF' )
                    // MicroParser.g:4:36: 'ENDIF'
                    {
                    match("ENDIF"); 



                    }


                    }
                    break;
                case 11 :
                    // MicroParser.g:4:47: ( 'REPEAT' )
                    {
                    // MicroParser.g:4:47: ( 'REPEAT' )
                    // MicroParser.g:4:48: 'REPEAT'
                    {
                    match("REPEAT"); 



                    }


                    }
                    break;
                case 12 :
                    // MicroParser.g:4:60: ( 'UNTIL' )
                    {
                    // MicroParser.g:4:60: ( 'UNTIL' )
                    // MicroParser.g:4:61: 'UNTIL'
                    {
                    match("UNTIL"); 



                    }


                    }
                    break;
                case 13 :
                    // MicroParser.g:5:4: ( 'CONTINUE' )
                    {
                    // MicroParser.g:5:4: ( 'CONTINUE' )
                    // MicroParser.g:5:5: 'CONTINUE'
                    {
                    match("CONTINUE"); 



                    }


                    }
                    break;
                case 14 :
                    // MicroParser.g:5:19: ( 'BREAK' )
                    {
                    // MicroParser.g:5:19: ( 'BREAK' )
                    // MicroParser.g:5:20: 'BREAK'
                    {
                    match("BREAK"); 



                    }


                    }
                    break;
                case 15 :
                    // MicroParser.g:5:31: ( 'RETURN' )
                    {
                    // MicroParser.g:5:31: ( 'RETURN' )
                    // MicroParser.g:5:32: 'RETURN'
                    {
                    match("RETURN"); 



                    }


                    }
                    break;
                case 16 :
                    // MicroParser.g:5:44: ( 'INT' )
                    {
                    // MicroParser.g:5:44: ( 'INT' )
                    // MicroParser.g:5:45: 'INT'
                    {
                    match("INT"); 



                    }


                    }
                    break;
                case 17 :
                    // MicroParser.g:5:54: ( 'VOID' )
                    {
                    // MicroParser.g:5:54: ( 'VOID' )
                    // MicroParser.g:5:55: 'VOID'
                    {
                    match("VOID"); 



                    }


                    }
                    break;
                case 18 :
                    // MicroParser.g:5:65: ( 'STRING' )
                    {
                    // MicroParser.g:5:65: ( 'STRING' )
                    // MicroParser.g:5:66: 'STRING'
                    {
                    match("STRING"); 



                    }


                    }
                    break;
                case 19 :
                    // MicroParser.g:5:78: ( 'FLOAT' )
                    {
                    // MicroParser.g:5:78: ( 'FLOAT' )
                    // MicroParser.g:5:79: 'FLOAT'
                    {
                    match("FLOAT"); 



                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:8:13: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // MicroParser.g:8:15: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // MicroParser.g:8:39: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // MicroParser.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "INTLITERAL"
    public final void mINTLITERAL() throws RecognitionException {
        try {
            int _type = INTLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:11:12: ( ( '0' .. '9' )+ )
            // MicroParser.g:11:14: ( '0' .. '9' )+
            {
            // MicroParser.g:11:14: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // MicroParser.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTLITERAL"

    // $ANTLR start "FLOATLITERAL"
    public final void mFLOATLITERAL() throws RecognitionException {
        try {
            int _type = FLOATLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:15:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // MicroParser.g:15:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // MicroParser.g:15:9: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // MicroParser.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    match('.'); 

                    // MicroParser.g:15:25: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // MicroParser.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    // MicroParser.g:15:37: ( EXPONENT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // MicroParser.g:15:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // MicroParser.g:16:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // MicroParser.g:16:13: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // MicroParser.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    // MicroParser.g:16:25: ( EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // MicroParser.g:16:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // MicroParser.g:17:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // MicroParser.g:17:9: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // MicroParser.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    mEXPONENT(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOATLITERAL"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:21:5: ( '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='-') ) {
                alt14=1;
            }
            else if ( (LA14_0=='/') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // MicroParser.g:21:9: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("--"); 



                    // MicroParser.g:21:15: (~ ( '\\n' | '\\r' ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '\u0000' && LA11_0 <= '\t')||(LA11_0 >= '\u000B' && LA11_0 <= '\f')||(LA11_0 >= '\u000E' && LA11_0 <= '\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // MicroParser.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    // MicroParser.g:21:29: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // MicroParser.g:21:29: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // MicroParser.g:22:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // MicroParser.g:22:14: ( options {greedy=false; } : . )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='*') ) {
                            int LA13_1 = input.LA(2);

                            if ( (LA13_1=='/') ) {
                                alt13=2;
                            }
                            else if ( ((LA13_1 >= '\u0000' && LA13_1 <= '.')||(LA13_1 >= '0' && LA13_1 <= '\uFFFF')) ) {
                                alt13=1;
                            }


                        }
                        else if ( ((LA13_0 >= '\u0000' && LA13_0 <= ')')||(LA13_0 >= '+' && LA13_0 <= '\uFFFF')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // MicroParser.g:22:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRINGLIETRAL"
    public final void mSTRINGLIETRAL() throws RecognitionException {
        try {
            int _type = STRINGLIETRAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:26:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // MicroParser.g:26:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // MicroParser.g:26:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\\') ) {
                    alt15=1;
                }
                else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '!')||(LA15_0 >= '#' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // MicroParser.g:26:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // MicroParser.g:26:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRINGLIETRAL"

    // $ANTLR start "OPERATORS"
    public final void mOPERATORS() throws RecognitionException {
        try {
            int _type = OPERATORS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:29:11: ( ( ':=' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '=' ) | ( '!=' ) | ( '<' ) | ( '>' ) | ( '(' ) | ( ')' ) | ( ';' ) | ( ',' ) )
            int alt16=13;
            switch ( input.LA(1) ) {
            case ':':
                {
                alt16=1;
                }
                break;
            case '+':
                {
                alt16=2;
                }
                break;
            case '-':
                {
                alt16=3;
                }
                break;
            case '*':
                {
                alt16=4;
                }
                break;
            case '/':
                {
                alt16=5;
                }
                break;
            case '=':
                {
                alt16=6;
                }
                break;
            case '!':
                {
                alt16=7;
                }
                break;
            case '<':
                {
                alt16=8;
                }
                break;
            case '>':
                {
                alt16=9;
                }
                break;
            case '(':
                {
                alt16=10;
                }
                break;
            case ')':
                {
                alt16=11;
                }
                break;
            case ';':
                {
                alt16=12;
                }
                break;
            case ',':
                {
                alt16=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // MicroParser.g:29:13: ( ':=' )
                    {
                    // MicroParser.g:29:13: ( ':=' )
                    // MicroParser.g:29:14: ':='
                    {
                    match(":="); 



                    }


                    }
                    break;
                case 2 :
                    // MicroParser.g:29:22: ( '+' )
                    {
                    // MicroParser.g:29:22: ( '+' )
                    // MicroParser.g:29:23: '+'
                    {
                    match('+'); 

                    }


                    }
                    break;
                case 3 :
                    // MicroParser.g:29:30: ( '-' )
                    {
                    // MicroParser.g:29:30: ( '-' )
                    // MicroParser.g:29:31: '-'
                    {
                    match('-'); 

                    }


                    }
                    break;
                case 4 :
                    // MicroParser.g:29:38: ( '*' )
                    {
                    // MicroParser.g:29:38: ( '*' )
                    // MicroParser.g:29:39: '*'
                    {
                    match('*'); 

                    }


                    }
                    break;
                case 5 :
                    // MicroParser.g:29:46: ( '/' )
                    {
                    // MicroParser.g:29:46: ( '/' )
                    // MicroParser.g:29:47: '/'
                    {
                    match('/'); 

                    }


                    }
                    break;
                case 6 :
                    // MicroParser.g:29:54: ( '=' )
                    {
                    // MicroParser.g:29:54: ( '=' )
                    // MicroParser.g:29:55: '='
                    {
                    match('='); 

                    }


                    }
                    break;
                case 7 :
                    // MicroParser.g:29:62: ( '!=' )
                    {
                    // MicroParser.g:29:62: ( '!=' )
                    // MicroParser.g:29:63: '!='
                    {
                    match("!="); 



                    }


                    }
                    break;
                case 8 :
                    // MicroParser.g:29:71: ( '<' )
                    {
                    // MicroParser.g:29:71: ( '<' )
                    // MicroParser.g:29:72: '<'
                    {
                    match('<'); 

                    }


                    }
                    break;
                case 9 :
                    // MicroParser.g:29:79: ( '>' )
                    {
                    // MicroParser.g:29:79: ( '>' )
                    // MicroParser.g:29:80: '>'
                    {
                    match('>'); 

                    }


                    }
                    break;
                case 10 :
                    // MicroParser.g:29:87: ( '(' )
                    {
                    // MicroParser.g:29:87: ( '(' )
                    // MicroParser.g:29:88: '('
                    {
                    match('('); 

                    }


                    }
                    break;
                case 11 :
                    // MicroParser.g:29:95: ( ')' )
                    {
                    // MicroParser.g:29:95: ( ')' )
                    // MicroParser.g:29:96: ')'
                    {
                    match(')'); 

                    }


                    }
                    break;
                case 12 :
                    // MicroParser.g:29:103: ( ';' )
                    {
                    // MicroParser.g:29:103: ( ';' )
                    // MicroParser.g:29:104: ';'
                    {
                    match(';'); 

                    }


                    }
                    break;
                case 13 :
                    // MicroParser.g:29:111: ( ',' )
                    {
                    // MicroParser.g:29:111: ( ',' )
                    // MicroParser.g:29:112: ','
                    {
                    match(','); 

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPERATORS"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:32:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // MicroParser.g:32:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // MicroParser.g:32:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= '\t' && LA17_0 <= '\n')||(LA17_0 >= '\f' && LA17_0 <= '\r')||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // MicroParser.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // MicroParser.g:35:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // MicroParser.g:35:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // MicroParser.g:35:22: ( '+' | '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='+'||LA18_0=='-') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // MicroParser.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // MicroParser.g:35:33: ( '0' .. '9' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // MicroParser.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // MicroParser.g:38:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // MicroParser.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // MicroParser.g:42:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt20=1;
                    }
                    break;
                case 'u':
                    {
                    alt20=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt20=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // MicroParser.g:42:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // MicroParser.g:43:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // MicroParser.g:44:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // MicroParser.g:49:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\\') ) {
                int LA21_1 = input.LA(2);

                if ( ((LA21_1 >= '0' && LA21_1 <= '3')) ) {
                    int LA21_2 = input.LA(3);

                    if ( ((LA21_2 >= '0' && LA21_2 <= '7')) ) {
                        int LA21_4 = input.LA(4);

                        if ( ((LA21_4 >= '0' && LA21_4 <= '7')) ) {
                            alt21=1;
                        }
                        else {
                            alt21=2;
                        }
                    }
                    else {
                        alt21=3;
                    }
                }
                else if ( ((LA21_1 >= '4' && LA21_1 <= '7')) ) {
                    int LA21_3 = input.LA(3);

                    if ( ((LA21_3 >= '0' && LA21_3 <= '7')) ) {
                        alt21=2;
                    }
                    else {
                        alt21=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // MicroParser.g:49:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // MicroParser.g:50:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // MicroParser.g:51:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // MicroParser.g:56:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // MicroParser.g:56:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // MicroParser.g:1:8: ( KEYWORD | IDENTIFIER | INTLITERAL | FLOATLITERAL | COMMENT | STRINGLIETRAL | OPERATORS | WHITESPACE )
        int alt22=8;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // MicroParser.g:1:10: KEYWORD
                {
                mKEYWORD(); 


                }
                break;
            case 2 :
                // MicroParser.g:1:18: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 3 :
                // MicroParser.g:1:29: INTLITERAL
                {
                mINTLITERAL(); 


                }
                break;
            case 4 :
                // MicroParser.g:1:40: FLOATLITERAL
                {
                mFLOATLITERAL(); 


                }
                break;
            case 5 :
                // MicroParser.g:1:53: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 6 :
                // MicroParser.g:1:61: STRINGLIETRAL
                {
                mSTRINGLIETRAL(); 


                }
                break;
            case 7 :
                // MicroParser.g:1:75: OPERATORS
                {
                mOPERATORS(); 


                }
                break;
            case 8 :
                // MicroParser.g:1:85: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA10_eotS =
        "\5\uffff";
    static final String DFA10_eofS =
        "\5\uffff";
    static final String DFA10_minS =
        "\2\56\3\uffff";
    static final String DFA10_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA10_specialS =
        "\5\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "14:1: FLOATLITERAL : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA22_eotS =
        "\1\uffff\14\15\1\uffff\1\45\1\uffff\2\23\3\uffff\11\15\1\62\6\15"+
        "\2\uffff\3\15\1\62\7\15\1\uffff\1\62\11\15\1\62\2\15\1\62\3\15\1"+
        "\62\2\15\1\62\2\15\3\62\1\15\1\62\2\15\2\62\4\15\2\62\1\15\2\62"+
        "\2\15\2\62";
    static final String DFA22_eofS =
        "\140\uffff";
    static final String DFA22_minS =
        "\1\11\1\122\1\105\2\114\1\105\1\122\1\106\1\110\1\116\2\117\1\124"+
        "\1\uffff\1\56\1\uffff\1\55\1\52\3\uffff\1\117\1\107\1\105\1\104"+
        "\1\123\1\116\1\117\1\101\1\111\1\60\1\124\1\105\1\124\1\116\1\111"+
        "\1\122\2\uffff\1\107\1\111\1\101\1\60\1\105\1\103\1\101\1\104\1"+
        "\105\1\125\1\124\1\uffff\1\60\1\116\1\111\1\124\1\104\1\111\1\122"+
        "\1\116\1\113\1\106\1\60\2\124\1\60\1\101\1\122\1\105\1\60\1\114"+
        "\1\111\1\60\1\116\1\101\3\60\1\111\1\60\1\124\1\116\2\60\1\116\1"+
        "\107\1\115\1\117\2\60\1\125\2\60\1\116\1\105\2\60";
    static final String DFA22_maxS =
        "\1\172\2\122\1\116\1\125\1\105\1\122\1\116\1\110\1\116\2\117\1\124"+
        "\1\uffff\1\145\1\uffff\1\55\1\52\3\uffff\1\117\1\107\1\105\1\104"+
        "\1\123\1\116\1\117\1\124\1\111\1\172\1\124\1\105\1\124\1\116\1\111"+
        "\1\122\2\uffff\1\107\1\111\1\101\1\172\1\105\1\103\1\101\1\104\1"+
        "\105\1\125\1\124\1\uffff\1\172\1\116\1\111\1\124\1\104\1\111\1\122"+
        "\1\116\1\113\1\106\1\172\2\124\1\172\1\101\1\122\1\105\1\172\1\114"+
        "\1\111\1\172\1\116\1\101\3\172\1\111\1\172\1\124\1\116\2\172\1\116"+
        "\1\107\1\115\1\117\2\172\1\125\2\172\1\116\1\105\2\172";
    static final String DFA22_acceptS =
        "\15\uffff\1\2\1\uffff\1\4\2\uffff\1\6\1\7\1\10\20\uffff\1\3\1\5"+
        "\13\uffff\1\1\55\uffff";
    static final String DFA22_specialS =
        "\140\uffff}>";
    static final String[] DFA22_transitionS = {
            "\2\24\1\uffff\2\24\22\uffff\1\24\1\23\1\22\5\uffff\5\23\1\20"+
            "\1\17\1\21\12\16\5\23\2\uffff\1\15\1\2\1\12\1\15\1\3\1\4\2\15"+
            "\1\7\6\15\1\1\1\15\1\5\1\14\1\10\1\11\1\13\1\6\3\15\4\uffff"+
            "\1\15\1\uffff\32\15",
            "\1\25",
            "\1\26\14\uffff\1\27",
            "\1\31\1\uffff\1\30",
            "\1\33\10\uffff\1\32",
            "\1\34",
            "\1\35",
            "\1\36\7\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "",
            "\1\17\1\uffff\12\16\13\uffff\1\17\37\uffff\1\17",
            "",
            "\1\46",
            "\1\46",
            "",
            "",
            "",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56\16\uffff\1\57\3\uffff\1\60",
            "\1\61",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\12\15\7\uffff\10\15\1\74\21\15\4\uffff\1\15\1\uffff\32\15",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\115",
            "\1\116",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\122",
            "\1\123",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\124",
            "\1\125",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\126",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\127",
            "\1\130",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\135",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\136",
            "\1\137",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD | IDENTIFIER | INTLITERAL | FLOATLITERAL | COMMENT | STRINGLIETRAL | OPERATORS | WHITESPACE );";
        }
    }
 

}