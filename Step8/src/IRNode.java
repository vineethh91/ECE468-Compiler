import java.util.LinkedList;


public class IRNode {
	private String opcode;
	private String oper1;
	private String oper2;
	private String res;
	public String functionName;
	public LinkedList<String> liveVariables = new LinkedList<String>();
	
	public IRNode(String opcode, String oper1, String oper2, String res) {
		this.opcode = opcode;
		this.oper1 = oper1;
		this.oper2 = oper2;
		this.res = res;
	}
	
	public String getOpcode() {
		return opcode;
	}
	
	public String getOper1() {
		return oper1;
	}
	
	public String getOper2() {
		return oper2;
	}
	
	public String getRes() {
		return res;
	}
	
	public void storeRes(String res) {
		this.res = res;
	}
	public void printNode() {
		System.out.print(';');
		if((oper1 == null) && (oper2 == null) && (res == null)) {
			System.out.println(opcode);
		}
		else if((oper2 == null) && (res == null)) {
			System.out.println(opcode + " " + oper1);
		}
		else if((res == null) && (oper2 != null) && (oper1 != null)) {
			System.out.println(opcode + " " + oper1 + " " + oper2);
		}
		else if((oper2 == null) && (oper1 != null) && (res != null)){
			System.out.println(opcode + " " + oper1 + " " + res);
		}
		else if((oper1 == null) && (oper2 == null) && (res != null)) {
			System.out.println(opcode + " " + res);
		}
		else {
			System.out.println(opcode + " " + oper1 + " " + oper2 + " " + res);
		}
	}
}
