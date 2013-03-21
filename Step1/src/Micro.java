import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.*;


/*
 * Name  : Vineeth Harikumar
 * Login : vharikum
 * Class : ECE468
 * Date  : 08/26/12
 */

class Micro {

	public static void main(String[] args) throws IOException {
		MicroParser lexer = new MicroParser(new ANTLRFileStream(args[0]));
		while(true) {
			Token token = lexer.nextToken();
			if(token.getType() == MicroParser.EOF) {
				break;
			}
			if((token.getType() != MicroParser.WHITESPACE) && (token.getType() != MicroParser.COMMENT)) {
				System.out.println("Token Type: " + getTokenName(token.getType()));
				System.out.println("Value: " + token.getText());	
			}
		}
	}
	
	private static String getTokenName(int tokenNumber) {
		String tokenName = null;
	    
		switch(tokenNumber) {
	    	case MicroParser.FLOATLITERAL: 
	    		tokenName = "FLOATLITERAL";
	    		break;
	    	case MicroParser.IDENTIFIER: 
	    		tokenName = "IDENTIFIER";
	    		break;
	    	case MicroParser.INTLITERAL: 
	    		tokenName = "INTLITERAL";
	    		break;
	    	case MicroParser.KEYWORD: 
	    		tokenName = "KEYWORD";
	    		break;
	    	case MicroParser.OPERATORS: 
	    		tokenName = "OPERATOR";
	    		break;
	    	case MicroParser.STRINGLIETRAL: 
	    		tokenName = "STRINGLITERAL";
	    		break;
	    	default :
	    		tokenName = null;
	    }
	    return tokenName;
	}
}