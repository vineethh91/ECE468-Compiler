import java.io.IOException;
import org.antlr.runtime.*;

//import antlr.ANTLRException;


/*
 * Name  : Vineeth Harikumar
 * Login : vharikum
 * Class : ECE468
 * Date  : 08/26/12
 */

class Micro {

	public static void main(String[] args) throws IOException{
		if(args.length != 1) {
			throw new IOException("Not enough arguments provided");
		}
		
		MicroParserLexer lexerObject = new MicroParserLexer(new ANTLRFileStream(args[0]));
		CommonTokenStream commonTokenStreamObject = new CommonTokenStream(lexerObject);
		MicroParserParser parserObject = new MicroParserParser(commonTokenStreamObject);
		
		try {
			parserObject.program();
			System.out.println("Accepted");
		}
		catch (RecognitionException re) {
			System.out.println("Not Accepted");
		}
		finally {
			// TODO Auto-generated finally block
		}
	}
	
}
