import java.util.LinkedList;
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
	public static SymbolTableObject globalSymbolTable;
	public static int variableOffset = 0;
	
	public static void createGlobalScopeTable() {
		//System.out.println("Creating symbolTableObject : Scope => GLOBAL");
		globalSymbolTable = new SymbolTableObject("GLOBAL");
		Micro.globalSymbolTable = globalSymbolTable;
		symbolTableStack.push(globalSymbolTable);
	}
	
	public static void createFunctionScopeTable(String functionName) {
		//System.out.println("Creating symbolTableObject : Scope => " + functionName);
		symbolTableStack.push(new SymbolTableObject(functionName));
		variableOffset = 0;
	}
	
	public static void createBlockScopeTable() {
		//System.out.println("Creating symbolTableObject : Scope => BLOCK " + Integer.toString(blockScopeCount));
		symbolTableStack.push(new SymbolTableObject("BLOCK " + Integer.toString(blockScopeCount++)));
	}
	
	public static void insertSymbolIntoTable(String type_name, String var_name, String string_value) {
		SymbolTableObject tempSymbolTableObject = symbolTableStack.pop();
		tempSymbolTableObject.insertSymbol(type_name, var_name, string_value);
		Micro.updateGlobalSymbolTable(tempSymbolTableObject);
		//tempSymbolTableObject.printAllSymbolObjectsInSymbolTable();
		symbolTableStack.push(tempSymbolTableObject);
	}
	
	public static void printSymbolTable() {
		SymbolTableObject tempSymbolTableObject = symbolTableStack.pop();
		//tempSymbolTableObject.printAllSymbolObjectsInSymbolTable();
		symbolTableStack.push(tempSymbolTableObject);
	}
	
	public static void popSymbolTableOffTheStack() {
		//SymbolTableObject tempSymbolObject = symbolTableStack.pop();
		//tempSymbolObject.printAllSymbolObjectsInSymbolTable();
	}
	
	public static SymbolTableObject getFunctionSymbolTableObject(String functionName) {
		Stack<SymbolTableObject> tempStack = new Stack<SymbolTableObject>();
		SymbolTableObject functionTableObject = null;
		//System.out.println(symbolTableStack.peek().getSymbolTableScope());
		while(!symbolTableStack.isEmpty()) {
			SymbolTableObject tempTableObject = symbolTableStack.pop();
			//System.out.println(tempTableObject.getSymbolTableScope());
			if(functionName.equals(tempTableObject.getSymbolTableScope())) {
				//System.out.println("match found " + functionName);
				functionTableObject = tempTableObject;
			}
			tempStack.push(tempTableObject);
		}
		while(!tempStack.isEmpty()) {
			symbolTableStack.push(tempStack.pop());
		}
		return functionTableObject;
	}
}
