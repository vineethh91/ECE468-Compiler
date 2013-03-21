import java.util.Stack;

/**
 * 
 */

/**
 * @author Vineeth
 *
 */
public class SymbolTableClass {
	private static Stack<SymbolTableObject> symbolTableStack = new Stack<SymbolTableObject>();
	private static int blockScopeCount = 1;
	
	public static void createGlobalScopeTable() {
		//System.out.println("Creating symbolTableObject : Scope => GLOBAL");
		symbolTableStack.push(new SymbolTableObject("GLOBAL"));
	}
	
	public static void createFunctionScopeTable(String functionName) {
		//System.out.println("Creating symbolTableObject : Scope => " + functionName);
		symbolTableStack.push(new SymbolTableObject(functionName));
	}
	
	public static void createBlockScopeTable() {
		//System.out.println("Creating symbolTableObject : Scope => BLOCK " + Integer.toString(blockScopeCount));
		symbolTableStack.push(new SymbolTableObject("BLOCK " + Integer.toString(blockScopeCount++)));
	}
	
	public static void insertSymbolIntoTable(String type_name, String var_name, String string_value) {
		SymbolTableObject tempSymbolTableObject = symbolTableStack.pop();
		tempSymbolTableObject.insertSymbol(type_name, var_name, string_value);
		//tempSymbolTableObject.printAllSymbolObjectsInSymbolTable();
		symbolTableStack.push(tempSymbolTableObject);
	}
	
	public static void printSymbolTable() {
		SymbolTableObject tempSymbolTableObject = symbolTableStack.pop();
		tempSymbolTableObject.printAllSymbolObjectsInSymbolTable();
		symbolTableStack.push(tempSymbolTableObject);
	}
	
	public static void popSymbolTableOffTheStack() {
		SymbolTableObject tempSymbolObject = symbolTableStack.pop();
		//tempSymbolObject.printAllSymbolObjectsInSymbolTable();
	}
}
