import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author Vineeth
 *
 */
public class SymbolTableObject {
	private String tableScope; 
	public ArrayList<SymbolObject> symbolObjectArrayList = new ArrayList<SymbolObject>();
	public HashMap<String, String> variableNameHashMap = new HashMap<String, String>();
	
	public SymbolTableObject(String tableScope) {
		this.tableScope = tableScope;
		//this.symbolObjectArrayList = null;
	}
	
	public String getSymbolTableScope() {
		return this.tableScope;
	}
	
	public void insertSymbol(String type_name, String var_name, String string_value) {
		String[] varNameArray = var_name.split(",");
		//System.out.println("INSERTING SHIT BRAH");
		for(int i = 0; i < varNameArray.length; i++) {
			//System.out.println(type_name + " " + varNameArray[i].trim());
			if(!variableNameHashMap.containsKey(varNameArray[i].trim())) {
				symbolObjectArrayList.add(new SymbolObject(varNameArray[i].trim(), type_name, string_value));
				variableNameHashMap.put(varNameArray[i].trim(), type_name);
			}
			else {
				System.out.println("DECLARATION ERROR " + var_name);
			}
		}
	}
	
	public void printAllSymbolObjectsInSymbolTable() {
		System.out.println("Symbol table " + tableScope);
		for(int i = 0; i < symbolObjectArrayList.size(); i++) {
			SymbolObject tempObject = symbolObjectArrayList.get(i);
			tempObject.printFormattedSymbolOutput();
		}
		System.out.println();
	}
	
	public String findSymbolInSymbolTable(String varName) {
		//System.out.println(varName + " " + variableNameHashMap.get(varName));
		for(int i = 0; i < symbolObjectArrayList.size(); i++) {
			SymbolObject tempObject = symbolObjectArrayList.get(i);
			//System.out.println(tempObject.getVarName());
			if(tempObject.getVarName().equals(varName)) {
				//System.out.println("found symbol " + varName + " in " + this.getSymbolTableScope());
				return tempObject.getTypeName();
			}
		}
		//System.out.println(SymbolTableClass.globalSymbolTable.getSymbolTableScope());
		
		for(int i = 0; i < SymbolTableClass.globalSymbolTable.symbolObjectArrayList.size(); i++) {
			SymbolObject tempObject = SymbolTableClass.globalSymbolTable.symbolObjectArrayList.get(i);
			//System.out.println(tempObject.getVarName());
			if(tempObject.getVarName().equals(varName)) {
				//System.out.println("found symbol " + varName + " in global");
				return tempObject.getTypeName();
			}
		}
		
		return null;
	}
	
	public int getSymbolOffset(String varName) {
		//System.out.println(varName + " " + variableNameHashMap.get(varName));
		for(int i = 0; i < symbolObjectArrayList.size(); i++) {
			SymbolObject tempObject = symbolObjectArrayList.get(i);
			//System.out.println(tempObject.getVarName());
			if(tempObject.getVarName().equals(varName)) {
				//System.out.println("found symbol " + varName + " in " + this.getSymbolTableScope());
				return tempObject.varOffset;
			}
		}
		//System.out.println(SymbolTableClass.globalSymbolTable.getSymbolTableScope());
		
		for(int i = 0; i < SymbolTableClass.globalSymbolTable.symbolObjectArrayList.size(); i++) {
			SymbolObject tempObject = SymbolTableClass.globalSymbolTable.symbolObjectArrayList.get(i);
			//System.out.println(tempObject.getVarName());
			if(tempObject.getVarName().equals(varName)) {
				//System.out.println("found symbol " + varName + " in global");
				return tempObject.varOffset;
			}
		}
		return 0;
	}
	
	public int getSizeOfSymbolObjectArray() {
		return symbolObjectArrayList.size();
	}
	
	public SymbolObject getSymbolObject(int index) {
		return symbolObjectArrayList.get(index);
	}
}
