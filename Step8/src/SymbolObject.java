/**
 * 
 */

/**
 * @author Vineeth
 *
 */
public class SymbolObject {
	private String var_name;
	private String type_name;
	private String string_value;
	public int varOffset;
	public String registerMap;
	
	public SymbolObject(String var_name, String type_name, String string_value) {
		this.var_name = var_name;
		this.type_name = type_name;
		this.string_value = string_value;
		this.varOffset = --SymbolTableClass.variableOffset;
		//System.out.println(var_name + " " + this.varOffset);
		//printFormattedSymbolOutput();
	}
	
	public String getVarName() {
		return this.var_name;
	}
	
	public String getTypeName() {
		return this.type_name;
	}
	
	public String getStringValue() {
		return this.string_value;
	}
	
	public void printFormattedSymbolOutput() {
		if(this.type_name.equals("STRING")) {
			System.out.println("name " + this.var_name + " type " + this.type_name + " value " + this.string_value);
		}
		else {
			System.out.println("name " + this.var_name + " type " + this.type_name + " " + this.string_value);
		}
	}
}
