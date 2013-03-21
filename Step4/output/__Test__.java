import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        MicroParserLexer lex = new MicroParserLexer(new ANTLRFileStream("/home/ther81isbak/Documents/Course documents/Fall2012/468ECE/Fall12 Projects/Step4/step4_testcase3.micro", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        MicroParserParser g = new MicroParserParser(tokens, 49100, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}