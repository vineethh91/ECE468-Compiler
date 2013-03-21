import java.util.HashMap;
import java.util.LinkedList;


public class FunctionClass {
	public String functionName;
	public int localVariableCount;
	public int paramenterCount;
	public LinkedList<IRNode> irNodeList = new LinkedList<IRNode>();
	public SymbolTableObject symbolTable;
	public HashMap<String, String> parameterListVariables = new HashMap<String, String>();
	
	public FunctionClass(String functionName) {
		this.functionName = functionName;
	}
}
