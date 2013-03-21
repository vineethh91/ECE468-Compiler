// $ANTLR 3.4 MicroParser.g 2012-12-07 18:08:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MicroParserLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MicroParserLexer() {} 
    public MicroParserLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MicroParserLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "MicroParser.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:7:7: ( '!=' )
            // MicroParser.g:7:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:8:7: ( '(' )
            // MicroParser.g:8:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:9:7: ( ')' )
            // MicroParser.g:9:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:10:7: ( '*' )
            // MicroParser.g:10:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:11:7: ( '+' )
            // MicroParser.g:11:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:12:7: ( ',' )
            // MicroParser.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:13:7: ( '-' )
            // MicroParser.g:13:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:14:7: ( '/' )
            // MicroParser.g:14:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:15:7: ( ':=' )
            // MicroParser.g:15:9: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:16:7: ( ';' )
            // MicroParser.g:16:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:17:7: ( '<' )
            // MicroParser.g:17:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:18:7: ( '=' )
            // MicroParser.g:18:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:19:7: ( '>' )
            // MicroParser.g:19:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:20:7: ( 'BEGIN' )
            // MicroParser.g:20:9: 'BEGIN'
            {
            match("BEGIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:21:7: ( 'ELSE' )
            // MicroParser.g:21:9: 'ELSE'
            {
            match("ELSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:22:7: ( 'END' )
            // MicroParser.g:22:9: 'END'
            {
            match("END"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:23:7: ( 'ENDIF' )
            // MicroParser.g:23:9: 'ENDIF'
            {
            match("ENDIF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:24:7: ( 'FLOAT' )
            // MicroParser.g:24:9: 'FLOAT'
            {
            match("FLOAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:25:7: ( 'FUNCTION' )
            // MicroParser.g:25:9: 'FUNCTION'
            {
            match("FUNCTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:26:7: ( 'IF' )
            // MicroParser.g:26:9: 'IF'
            {
            match("IF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:27:7: ( 'INT' )
            // MicroParser.g:27:9: 'INT'
            {
            match("INT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:28:7: ( 'PROGRAM' )
            // MicroParser.g:28:9: 'PROGRAM'
            {
            match("PROGRAM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:29:7: ( 'READ' )
            // MicroParser.g:29:9: 'READ'
            {
            match("READ"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:30:7: ( 'REPEAT' )
            // MicroParser.g:30:9: 'REPEAT'
            {
            match("REPEAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:31:7: ( 'RETURN' )
            // MicroParser.g:31:9: 'RETURN'
            {
            match("RETURN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:32:7: ( 'STRING' )
            // MicroParser.g:32:9: 'STRING'
            {
            match("STRING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:33:7: ( 'THEN' )
            // MicroParser.g:33:9: 'THEN'
            {
            match("THEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:34:7: ( 'UNTIL' )
            // MicroParser.g:34:9: 'UNTIL'
            {
            match("UNTIL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:35:7: ( 'VOID' )
            // MicroParser.g:35:9: 'VOID'
            {
            match("VOID"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:36:7: ( 'WRITE' )
            // MicroParser.g:36:9: 'WRITE'
            {
            match("WRITE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "KEYWORD"
    public final void mKEYWORD() throws RecognitionException {
        try {
            int _type = KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MicroParser.g:192:9: ( ( 'PROGRAM' ) | ( 'BEGIN' ) | ( 'FUNCTION' ) | ( 'END' ) | ( 'READ' ) | ( 'WRITE' ) | ( 'IF' ) | ( 'THEN' ) | ( 'ELSE' ) | ( 'ENDIF' ) | ( 'REPEAT' ) | ( 'UNTIL' ) | ( 'CONTINUE' ) | ( 'BREAK' ) | ( 'RETURN' ) | ( 'INT' ) | ( 'VOID' ) | ( 'STRING' ) | ( 'FLOAT' ) )
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
            case 'F':
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3=='U') ) {
                    alt1=3;
                }
                else if ( (LA1_3=='L') ) {
                    alt1=19;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;

                }
                }
                break;
            case 'E':
                {
                int LA1_4 = input.LA(2);

                if ( (LA1_4=='N') ) {
                    int LA1_17 = input.LA(3);

                    if ( (LA1_17=='D') ) {
                        int LA1_22 = input.LA(4);

                        if ( (LA1_22=='I') ) {
                            alt1=10;
                        }
                        else {
                            alt1=4;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 17, input);

                        throw nvae;

                    }
                }
                else if ( (LA1_4=='L') ) {
                    alt1=9;
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
                    // MicroParser.g:192:11: ( 'PROGRAM' )
                    {
                    // MicroParser.g:192:11: ( 'PROGRAM' )
                    // MicroParser.g:192:12: 'PROGRAM'
                    {
                    match("PROGRAM"); 



                    }


                    }
                    break;
                case 2 :
                    // MicroParser.g:192:25: ( 'BEGIN' )
                    {
                    // MicroParser.g:192:25: ( 'BEGIN' )
                    // MicroParser.g:192:26: 'BEGIN'
                    {
                    match("BEGIN"); 



                    }


                    }
                    break;
                case 3 :
                    // MicroParser.g:192:37: ( 'FUNCTION' )
                    {
                    // MicroParser.g:192:37: ( 'FUNCTION' )
                    // MicroParser.g:192:38: 'FUNCTION'
                    {
                    match("FUNCTION"); 



                    }


                    }
                    break;
                case 4 :
                    // MicroParser.g:192:52: ( 'END' )
                    {
                    // MicroParser.g:192:52: ( 'END' )
                    // MicroParser.g:192:53: 'END'
                    {
                    match("END"); 



                    }


                    }
                    break;
                case 5 :
                    // MicroParser.g:192:62: ( 'READ' )
                    {
                    // MicroParser.g:192:62: ( 'READ' )
                    // MicroParser.g:192:63: 'READ'
                    {
                    match("READ"); 



                    }


                    }
                    break;
                case 6 :
                    // MicroParser.g:192:73: ( 'WRITE' )
                    {
                    // MicroParser.g:192:73: ( 'WRITE' )
                    // MicroParser.g:192:74: 'WRITE'
                    {
                    match("WRITE"); 



                    }


                    }
                    break;
                case 7 :
                    // MicroParser.g:193:4: ( 'IF' )
                    {
                    // MicroParser.g:193:4: ( 'IF' )
                    // MicroParser.g:193:5: 'IF'
                    {
                    match("IF"); 



                    }


                    }
                    break;
                case 8 :
                    // MicroParser.g:193:13: ( 'THEN' )
                    {
                    // MicroParser.g:193:13: ( 'THEN' )
                    // MicroParser.g:193:14: 'THEN'
                    {
                    match("THEN"); 



                    }


                    }
                    break;
                case 9 :
                    // MicroParser.g:193:24: ( 'ELSE' )
                    {
                    // MicroParser.g:193:24: ( 'ELSE' )
                    // MicroParser.g:193:25: 'ELSE'
                    {
                    match("ELSE"); 



                    }


                    }
                    break;
                case 10 :
                    // MicroParser.g:193:35: ( 'ENDIF' )
                    {
                    // MicroParser.g:193:35: ( 'ENDIF' )
                    // MicroParser.g:193:36: 'ENDIF'
                    {
                    match("ENDIF"); 



                    }


                    }
                    break;
                case 11 :
                    // MicroParser.g:193:47: ( 'REPEAT' )
                    {
                    // MicroParser.g:193:47: ( 'REPEAT' )
                    // MicroParser.g:193:48: 'REPEAT'
                    {
                    match("REPEAT"); 



                    }


                    }
                    break;
                case 12 :
                    // MicroParser.g:193:60: ( 'UNTIL' )
                    {
                    // MicroParser.g:193:60: ( 'UNTIL' )
                    // MicroParser.g:193:61: 'UNTIL'
                    {
                    match("UNTIL"); 



                    }


                    }
                    break;
                case 13 :
                    // MicroParser.g:194:4: ( 'CONTINUE' )
                    {
                    // MicroParser.g:194:4: ( 'CONTINUE' )
                    // MicroParser.g:194:5: 'CONTINUE'
                    {
                    match("CONTINUE"); 



                    }


                    }
                    break;
                case 14 :
                    // MicroParser.g:194:19: ( 'BREAK' )
                    {
                    // MicroParser.g:194:19: ( 'BREAK' )
                    // MicroParser.g:194:20: 'BREAK'
                    {
                    match("BREAK"); 



                    }


                    }
                    break;
                case 15 :
                    // MicroParser.g:194:31: ( 'RETURN' )
                    {
                    // MicroParser.g:194:31: ( 'RETURN' )
                    // MicroParser.g:194:32: 'RETURN'
                    {
                    match("RETURN"); 



                    }


                    }
                    break;
                case 16 :
                    // MicroParser.g:194:44: ( 'INT' )
                    {
                    // MicroParser.g:194:44: ( 'INT' )
                    // MicroParser.g:194:45: 'INT'
                    {
                    match("INT"); 



                    }


                    }
                    break;
                case 17 :
                    // MicroParser.g:194:54: ( 'VOID' )
                    {
                    // MicroParser.g:194:54: ( 'VOID' )
                    // MicroParser.g:194:55: 'VOID'
                    {
                    match("VOID"); 



                    }


                    }
                    break;
                case 18 :
                    // MicroParser.g:194:65: ( 'STRING' )
                    {
                    // MicroParser.g:194:65: ( 'STRING' )
                    // MicroParser.g:194:66: 'STRING'
                    {
                    match("STRING"); 



                    }


                    }
                    break;
                case 19 :
                    // MicroParser.g:194:78: ( 'FLOAT' )
                    {
                    // MicroParser.g:194:78: ( 'FLOAT' )
                    // MicroParser.g:194:79: 'FLOAT'
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
            // MicroParser.g:197:13: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // MicroParser.g:197:15: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // MicroParser.g:197:39: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // MicroParser.g:200:12: ( ( '0' .. '9' )+ )
            // MicroParser.g:200:14: ( '0' .. '9' )+
            {
            // MicroParser.g:200:14: ( '0' .. '9' )+
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
            // MicroParser.g:204:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // MicroParser.g:204:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // MicroParser.g:204:9: ( '0' .. '9' )+
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

                    // MicroParser.g:204:25: ( '0' .. '9' )*
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


                    // MicroParser.g:204:37: ( EXPONENT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // MicroParser.g:204:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // MicroParser.g:205:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // MicroParser.g:205:13: ( '0' .. '9' )+
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


                    // MicroParser.g:205:25: ( EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // MicroParser.g:205:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // MicroParser.g:206:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // MicroParser.g:206:9: ( '0' .. '9' )+
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
            // MicroParser.g:210:5: ( '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // MicroParser.g:210:9: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("--"); 



                    // MicroParser.g:210:15: (~ ( '\\n' | '\\r' ) )*
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


                    // MicroParser.g:210:29: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // MicroParser.g:210:29: '\\r'
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
                    // MicroParser.g:211:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // MicroParser.g:211:14: ( options {greedy=false; } : . )*
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
                    	    // MicroParser.g:211:42: .
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
            // MicroParser.g:215:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // MicroParser.g:215:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // MicroParser.g:215:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // MicroParser.g:215:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // MicroParser.g:215:24: ~ ( '\\\\' | '\"' )
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
            // MicroParser.g:219:11: ( ( ':=' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '=' ) | ( '!=' ) | ( '<' ) | ( '>' ) | ( '(' ) | ( ')' ) | ( ';' ) | ( ',' ) )
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
                    // MicroParser.g:219:13: ( ':=' )
                    {
                    // MicroParser.g:219:13: ( ':=' )
                    // MicroParser.g:219:14: ':='
                    {
                    match(":="); 



                    }


                    }
                    break;
                case 2 :
                    // MicroParser.g:219:22: ( '+' )
                    {
                    // MicroParser.g:219:22: ( '+' )
                    // MicroParser.g:219:23: '+'
                    {
                    match('+'); 

                    }


                    }
                    break;
                case 3 :
                    // MicroParser.g:219:30: ( '-' )
                    {
                    // MicroParser.g:219:30: ( '-' )
                    // MicroParser.g:219:31: '-'
                    {
                    match('-'); 

                    }


                    }
                    break;
                case 4 :
                    // MicroParser.g:219:38: ( '*' )
                    {
                    // MicroParser.g:219:38: ( '*' )
                    // MicroParser.g:219:39: '*'
                    {
                    match('*'); 

                    }


                    }
                    break;
                case 5 :
                    // MicroParser.g:219:46: ( '/' )
                    {
                    // MicroParser.g:219:46: ( '/' )
                    // MicroParser.g:219:47: '/'
                    {
                    match('/'); 

                    }


                    }
                    break;
                case 6 :
                    // MicroParser.g:219:54: ( '=' )
                    {
                    // MicroParser.g:219:54: ( '=' )
                    // MicroParser.g:219:55: '='
                    {
                    match('='); 

                    }


                    }
                    break;
                case 7 :
                    // MicroParser.g:219:62: ( '!=' )
                    {
                    // MicroParser.g:219:62: ( '!=' )
                    // MicroParser.g:219:63: '!='
                    {
                    match("!="); 



                    }


                    }
                    break;
                case 8 :
                    // MicroParser.g:219:71: ( '<' )
                    {
                    // MicroParser.g:219:71: ( '<' )
                    // MicroParser.g:219:72: '<'
                    {
                    match('<'); 

                    }


                    }
                    break;
                case 9 :
                    // MicroParser.g:219:79: ( '>' )
                    {
                    // MicroParser.g:219:79: ( '>' )
                    // MicroParser.g:219:80: '>'
                    {
                    match('>'); 

                    }


                    }
                    break;
                case 10 :
                    // MicroParser.g:219:87: ( '(' )
                    {
                    // MicroParser.g:219:87: ( '(' )
                    // MicroParser.g:219:88: '('
                    {
                    match('('); 

                    }


                    }
                    break;
                case 11 :
                    // MicroParser.g:219:95: ( ')' )
                    {
                    // MicroParser.g:219:95: ( ')' )
                    // MicroParser.g:219:96: ')'
                    {
                    match(')'); 

                    }


                    }
                    break;
                case 12 :
                    // MicroParser.g:219:103: ( ';' )
                    {
                    // MicroParser.g:219:103: ( ';' )
                    // MicroParser.g:219:104: ';'
                    {
                    match(';'); 

                    }


                    }
                    break;
                case 13 :
                    // MicroParser.g:219:111: ( ',' )
                    {
                    // MicroParser.g:219:111: ( ',' )
                    // MicroParser.g:219:112: ','
                    {
                    match(','); 

                    }


                    }
                    break;

            }

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
            // MicroParser.g:221:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // MicroParser.g:221:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // MicroParser.g:221:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
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
            // MicroParser.g:225:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // MicroParser.g:225:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // MicroParser.g:225:22: ( '+' | '-' )?
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


            // MicroParser.g:225:33: ( '0' .. '9' )+
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
            // MicroParser.g:228:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
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
            // MicroParser.g:232:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
                    // MicroParser.g:232:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // MicroParser.g:233:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // MicroParser.g:234:9: OCTAL_ESC
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
            // MicroParser.g:239:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // MicroParser.g:239:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
                    // MicroParser.g:240:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
                    // MicroParser.g:241:9: '\\\\' ( '0' .. '7' )
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
            // MicroParser.g:246:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // MicroParser.g:246:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // MicroParser.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | KEYWORD | IDENTIFIER | INTLITERAL | FLOATLITERAL | COMMENT | STRINGLIETRAL | WHITESPACE )
        int alt22=37;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // MicroParser.g:1:10: T__17
                {
                mT__17(); 


                }
                break;
            case 2 :
                // MicroParser.g:1:16: T__18
                {
                mT__18(); 


                }
                break;
            case 3 :
                // MicroParser.g:1:22: T__19
                {
                mT__19(); 


                }
                break;
            case 4 :
                // MicroParser.g:1:28: T__20
                {
                mT__20(); 


                }
                break;
            case 5 :
                // MicroParser.g:1:34: T__21
                {
                mT__21(); 


                }
                break;
            case 6 :
                // MicroParser.g:1:40: T__22
                {
                mT__22(); 


                }
                break;
            case 7 :
                // MicroParser.g:1:46: T__23
                {
                mT__23(); 


                }
                break;
            case 8 :
                // MicroParser.g:1:52: T__24
                {
                mT__24(); 


                }
                break;
            case 9 :
                // MicroParser.g:1:58: T__25
                {
                mT__25(); 


                }
                break;
            case 10 :
                // MicroParser.g:1:64: T__26
                {
                mT__26(); 


                }
                break;
            case 11 :
                // MicroParser.g:1:70: T__27
                {
                mT__27(); 


                }
                break;
            case 12 :
                // MicroParser.g:1:76: T__28
                {
                mT__28(); 


                }
                break;
            case 13 :
                // MicroParser.g:1:82: T__29
                {
                mT__29(); 


                }
                break;
            case 14 :
                // MicroParser.g:1:88: T__30
                {
                mT__30(); 


                }
                break;
            case 15 :
                // MicroParser.g:1:94: T__31
                {
                mT__31(); 


                }
                break;
            case 16 :
                // MicroParser.g:1:100: T__32
                {
                mT__32(); 


                }
                break;
            case 17 :
                // MicroParser.g:1:106: T__33
                {
                mT__33(); 


                }
                break;
            case 18 :
                // MicroParser.g:1:112: T__34
                {
                mT__34(); 


                }
                break;
            case 19 :
                // MicroParser.g:1:118: T__35
                {
                mT__35(); 


                }
                break;
            case 20 :
                // MicroParser.g:1:124: T__36
                {
                mT__36(); 


                }
                break;
            case 21 :
                // MicroParser.g:1:130: T__37
                {
                mT__37(); 


                }
                break;
            case 22 :
                // MicroParser.g:1:136: T__38
                {
                mT__38(); 


                }
                break;
            case 23 :
                // MicroParser.g:1:142: T__39
                {
                mT__39(); 


                }
                break;
            case 24 :
                // MicroParser.g:1:148: T__40
                {
                mT__40(); 


                }
                break;
            case 25 :
                // MicroParser.g:1:154: T__41
                {
                mT__41(); 


                }
                break;
            case 26 :
                // MicroParser.g:1:160: T__42
                {
                mT__42(); 


                }
                break;
            case 27 :
                // MicroParser.g:1:166: T__43
                {
                mT__43(); 


                }
                break;
            case 28 :
                // MicroParser.g:1:172: T__44
                {
                mT__44(); 


                }
                break;
            case 29 :
                // MicroParser.g:1:178: T__45
                {
                mT__45(); 


                }
                break;
            case 30 :
                // MicroParser.g:1:184: T__46
                {
                mT__46(); 


                }
                break;
            case 31 :
                // MicroParser.g:1:190: KEYWORD
                {
                mKEYWORD(); 


                }
                break;
            case 32 :
                // MicroParser.g:1:198: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 33 :
                // MicroParser.g:1:209: INTLITERAL
                {
                mINTLITERAL(); 


                }
                break;
            case 34 :
                // MicroParser.g:1:220: FLOATLITERAL
                {
                mFLOATLITERAL(); 


                }
                break;
            case 35 :
                // MicroParser.g:1:233: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 36 :
                // MicroParser.g:1:241: STRINGLIETRAL
                {
                mSTRINGLIETRAL(); 


                }
                break;
            case 37 :
                // MicroParser.g:1:255: WHITESPACE
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
            return "203:1: FLOATLITERAL : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA22_eotS =
        "\7\uffff\1\40\1\41\5\uffff\14\32\1\uffff\1\62\6\uffff\6\32\1\71"+
        "\11\32\1\uffff\3\32\1\111\2\32\1\uffff\1\114\14\32\1\131\1\32\1"+
        "\uffff\2\32\1\uffff\1\32\1\136\3\32\1\142\1\32\1\144\2\32\1\147"+
        "\1\150\1\uffff\1\151\1\152\2\32\1\uffff\3\32\1\uffff\1\160\1\uffff"+
        "\1\161\1\32\4\uffff\2\32\1\165\1\166\1\167\2\uffff\2\32\1\172\3"+
        "\uffff\1\32\1\174\1\uffff\1\150\1\uffff";
    static final String DFA22_eofS =
        "\175\uffff";
    static final String DFA22_minS =
        "\1\11\6\uffff\1\55\1\52\5\uffff\1\105\2\114\1\106\1\122\1\105\1"+
        "\124\1\110\1\116\1\117\1\122\1\117\1\uffff\1\56\6\uffff\1\107\1"+
        "\105\1\123\1\104\1\117\1\116\1\60\1\124\1\117\1\101\1\122\1\105"+
        "\1\124\2\111\1\116\1\uffff\1\111\1\101\1\105\1\60\1\101\1\103\1"+
        "\uffff\1\60\1\107\1\104\1\105\1\125\1\111\1\116\1\111\1\104\2\124"+
        "\1\116\1\113\1\60\1\106\1\uffff\2\124\1\uffff\1\122\1\60\1\101\1"+
        "\122\1\116\1\60\1\114\1\60\1\105\1\111\2\60\1\uffff\2\60\1\111\1"+
        "\101\1\uffff\1\124\1\116\1\107\1\uffff\1\60\1\uffff\1\60\1\116\4"+
        "\uffff\1\117\1\115\3\60\2\uffff\1\125\1\116\1\60\3\uffff\1\105\1"+
        "\60\1\uffff\1\60\1\uffff";
    static final String DFA22_maxS =
        "\1\172\6\uffff\1\55\1\52\5\uffff\1\122\1\116\1\125\1\116\1\122\1"+
        "\105\1\124\1\110\1\116\1\117\1\122\1\117\1\uffff\1\145\6\uffff\1"+
        "\107\1\105\1\123\1\104\1\117\1\116\1\172\1\124\1\117\1\124\1\122"+
        "\1\105\1\124\2\111\1\116\1\uffff\1\111\1\101\1\105\1\172\1\101\1"+
        "\103\1\uffff\1\172\1\107\1\104\1\105\1\125\1\111\1\116\1\111\1\104"+
        "\2\124\1\116\1\113\1\172\1\106\1\uffff\2\124\1\uffff\1\122\1\172"+
        "\1\101\1\122\1\116\1\172\1\114\1\172\1\105\1\111\2\172\1\uffff\2"+
        "\172\1\111\1\101\1\uffff\1\124\1\116\1\107\1\uffff\1\172\1\uffff"+
        "\1\172\1\116\4\uffff\1\117\1\115\3\172\2\uffff\1\125\1\116\1\172"+
        "\3\uffff\1\105\1\172\1\uffff\1\172\1\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\11\1\12\1\13\1\14\1\15"+
        "\14\uffff\1\40\1\uffff\1\42\1\44\1\45\1\43\1\7\1\10\20\uffff\1\41"+
        "\6\uffff\1\24\17\uffff\1\20\2\uffff\1\25\14\uffff\1\17\4\uffff\1"+
        "\27\3\uffff\1\33\1\uffff\1\35\2\uffff\1\16\1\37\1\21\1\22\5\uffff"+
        "\1\34\1\36\3\uffff\1\30\1\31\1\32\2\uffff\1\26\1\uffff\1\23";
    static final String DFA22_specialS =
        "\175\uffff}>";
    static final String[] DFA22_transitionS = {
            "\2\36\1\uffff\2\36\22\uffff\1\36\1\1\1\35\5\uffff\1\2\1\3\1"+
            "\4\1\5\1\6\1\7\1\34\1\10\12\33\1\11\1\12\1\13\1\14\1\15\2\uffff"+
            "\1\32\1\16\1\31\1\32\1\17\1\20\2\32\1\21\6\32\1\22\1\32\1\23"+
            "\1\24\1\25\1\26\1\27\1\30\3\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37",
            "\1\37",
            "",
            "",
            "",
            "",
            "",
            "\1\42\14\uffff\1\43",
            "\1\44\1\uffff\1\45",
            "\1\46\10\uffff\1\47",
            "\1\50\7\uffff\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "\1\34\1\uffff\12\33\13\uffff\1\34\37\uffff\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\72",
            "\1\73",
            "\1\74\16\uffff\1\75\3\uffff\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\32\7\uffff\10\32\1\110\21\32\4\uffff\1\32\1\uffff\32\32",
            "\1\112",
            "\1\113",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "",
            "\1\135",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\143",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\145",
            "\1\146",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\153",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\162",
            "",
            "",
            "",
            "",
            "\1\163",
            "\1\164",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\1\170",
            "\1\171",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "\1\173",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            ""
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
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | KEYWORD | IDENTIFIER | INTLITERAL | FLOATLITERAL | COMMENT | STRINGLIETRAL | WHITESPACE );";
        }
    }
 

}