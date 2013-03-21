import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;



//import antlr.ANTLRException;


/*
 * Name  : Vineeth Harikumar
 * Login : vharikum
 * Class : ECE468
 * Date  : 08/26/12
 */

class Micro {
	
	public static SymbolTableObject globalSymbolTable = null;
	
	public static SymbolTableObject currSymbolTable = null;
	
	public static LinkedList<IRNode> irNodeList = new LinkedList<IRNode>();
	
	public static LinkedList<TinyNode> tinyNodeList = new LinkedList<TinyNode>();
	
	public static LinkedList<LinkedList<IRNode>> basicBlockList = new LinkedList<LinkedList<IRNode>>();
	
	public static HashMap<String, ArrayList<SymbolObject>> livenessAnalysisMap = new HashMap<String, ArrayList<SymbolObject>>();
	
	public static LinkedList<String> labelStringList = new LinkedList<String>();
	
	public static LinkedList<Register> registerList = new LinkedList<Register>();
	
	private static String currReg = "$T1";
	
	private static int regCount = -1;
	
	private static int labelCount = 0;
	
	private static String instruction = null;
    
	private static Stack<String> regStack = new Stack<String>();
	
	private static Stack<String> labelStack = new Stack<String>();
	
	private static String prevInstructType = null;
	
	public static LinkedList<FunctionClass> functionList = new LinkedList<FunctionClass>();
	
	public static FunctionClass currFunctionObject;
	
	public static String currFunctionName;
	
	public static HashMap<String, String> returnResultMappedRegister = new HashMap<String, String>();
	
	public static void main(String[] args) throws IOException{
		if(args.length != 1) {
			throw new IOException("Not enough arguments provided");
		}
		
		MicroParserLexer lexerObject = new MicroParserLexer(new ANTLRFileStream(args[0]));
		CommonTokenStream commonTokenStreamObject = new CommonTokenStream(lexerObject);
		MicroParserParser parserObject = new MicroParserParser(commonTokenStreamObject);
		
		registerList.add(new Register("$T0"));
		registerList.add(new Register("$T1"));
		registerList.add(new Register("$T2"));
		registerList.add(new Register("$T3"));
		
		try {
			MicroParserParser.program_return astTree = parserObject.program();
			generateIRCode((CommonTree) astTree.tree);
			printIRNodeList();
			createBasicBlockList();
			//printBasicBlockList();
			livenessAnalysisBasicBlockList();
			convertIRToTinyCode();
			printTinyCode();
			//printSymbolTable();
		}
		catch (RecognitionException re) {
			System.out.println("Not Accepted");
		}
		finally {
			// TODO Auto-generated finally block
		}
	}
	
	public static void convertIRToTinyCode() {
		for(int i = 0; i < globalSymbolTable.getSizeOfSymbolObjectArray(); i++) {
			String var = globalSymbolTable.getSymbolObject(i).getVarName();
			if(globalSymbolTable.getSymbolObject(i).getTypeName().equals("STRING")) {
				tinyNodeList.add(new TinyNode("str", var, globalSymbolTable.getSymbolObject(i).getStringValue()));
			}
			else {
				tinyNodeList.add(new TinyNode("var", var, null));
			}
		}
		tinyNodeList.add(new TinyNode("push", null, null));
		/// for register allocation push ALL FOUR REGISTERS ONTO STACK
		tinyNodeList.add(new TinyNode("jsr main", null, null));
		tinyNodeList.add(new TinyNode("sys halt", null, null));
		for(int i = 0; i < irNodeList.size(); i++) {
			TinyNode tNode = convertTiny(irNodeList.get(i));
			if(tNode != null) {
				tinyNodeList.add(tNode);
			}
		}
		
	}
	
	public static TinyNode convertTiny(IRNode irNode) {
		String opcode = irNode.getOpcode();
		String oper1 = irNode.getOper1();
		String oper2 = null;
		
		if(irNode.getOpcode().equals("LABEL")) {
			opcode = "label";
			oper1 = irNode.getOper1();
			//if(oper1.equals("main")) {
			//	tinyNodeList.add(new TinyNode("jsr", oper1, null));
			//	tinyNodeList.add(new TinyNode("sys halt", null, null));
			//}
			tinyNodeList.add(new TinyNode("label", oper1, null));
			if(!oper1.contains("label")) {
				currFunctionName = oper1;				
			}

			
			//tinyNodeList.add(new TinyNode("link", "0", null));
			return null;
		}
		else if(irNode.getOpcode().equals("LINK")) {
			opcode = "link";
			int localVariableCount = 0;
			for(int i = 0; i < functionList.size(); i++) {
				if(functionList.get(i).functionName.equals(currFunctionName)) {
					ArrayList<SymbolObject> tempTableList = SymbolTableClass.getFunctionSymbolTableObject(currFunctionName).symbolObjectArrayList;
					for(int j = 0; j < tempTableList.size(); j++) {
						//System.out.println(tempTableList.get(j).getVarName() + " " +tempTableList.get(j).getTypeName() + " " + tempTableList.get(j).getStringValue());
						if(tempTableList.get(j).getStringValue() == null) {
							localVariableCount++;
						}
					}
					functionList.get(i).localVariableCount = localVariableCount;
				}
			}
			
			oper1 = Integer.toString(localVariableCount);
		}
		else if(irNode.getOpcode().equals("RET")) {
			opcode = "unlnk";
			tinyNodeList.add(new TinyNode(opcode, null, null));
			opcode = "ret";
		}
		else if(irNode.getOpcode().equals("JUMP")) {
			opcode = "jmp";
			oper1 = irNode.getRes();
		}
		else if(irNode.getOpcode().equals("JSR")) {
			/*opcode = "push";
			tinyNodeList.add(new TinyNode(opcode, "r0", null));
			tinyNodeList.add(new TinyNode(opcode, "r1", null));
			tinyNodeList.add(new TinyNode(opcode, "r2", null));
			tinyNodeList.add(new TinyNode(opcode, "r3", null));*/
			opcode = "jsr";
			oper1 = irNode.getOper1();
			tinyNodeList.add(new TinyNode(opcode, oper1, null));
			/*opcode = "pop";
			tinyNodeList.add(new TinyNode(opcode, "r3", null));
			tinyNodeList.add(new TinyNode(opcode, "r2", null));
			tinyNodeList.add(new TinyNode(opcode, "r1", null));
			tinyNodeList.add(new TinyNode(opcode, "r0", null));*/
			return null;
		}
		
		else if(irNode.getOpcode().equals("NE")) {
			//irNode.printNode();
			String varType1 = currSymbolTable.findSymbolInSymbolTable(irNode.getOper1());
			String varType2 = currSymbolTable.findSymbolInSymbolTable(irNode.getOper2());
			if((varType1 != null && varType1.equals("INT")) || (varType2 != null && varType2.equals("INT"))) {
				opcode = "cmpi";
			}
			else {
				opcode = "cmpr";
			}
			tinyNodeList.add(new TinyNode(opcode, convertToOffset(irNode.getOper1()), formatRegister(irNode.getOper2())));
			opcode = "jne";
			tinyNodeList.add(new TinyNode(opcode, irNode.getRes(), null));
			return null;
		}
		else if(irNode.getOpcode().equals("LE")) {
			//irNode.printNode();
			String varType1 = currSymbolTable.findSymbolInSymbolTable(irNode.getOper1());
			String varType2 = currSymbolTable.findSymbolInSymbolTable(irNode.getOper2());
			if((varType1 != null && varType1.equals("INT")) || (varType2 != null && varType2.equals("INT"))) {
				opcode = "cmpi";
			}
			else {
				opcode = "cmpr";
			}
			tinyNodeList.add(new TinyNode(opcode, convertToOffset(irNode.getOper1()), formatRegister(irNode.getOper2())));
			opcode = "jle";
			tinyNodeList.add(new TinyNode(opcode, irNode.getRes(), null));
			return null;
		}
		else if(irNode.getOpcode().equals("GE")) {
			//irNode.printNode();String varType1 = currSymbolTable.findSymbolInSymbolTable(irNode.getOper1());
			String varType1 = currSymbolTable.findSymbolInSymbolTable(irNode.getOper1());
			String varType2 = currSymbolTable.findSymbolInSymbolTable(irNode.getOper2());
			if((varType1 != null && varType1.equals("INT")) || (varType2 != null && varType2.equals("INT"))) {
				opcode = "cmpi";
			}
			else {
				opcode = "cmpr";
			}
			tinyNodeList.add(new TinyNode(opcode, convertToOffset(irNode.getOper1()), formatRegister(irNode.getOper2())));
			opcode = "jge";
			tinyNodeList.add(new TinyNode(opcode, irNode.getRes(), null));
			return null;
		}
		else if(irNode.getOpcode().equals("WRITEI")) {
			opcode = "sys";
			oper1 = "writei";
			oper2 = convertToOffset(irNode.getRes());
			
		}
		else if(irNode.getOpcode().equals("WRITEF")) {
			opcode = "sys";
			oper1 = "writer";
			oper2 = convertToOffset(irNode.getRes());
		}
		else if(irNode.getOpcode().equals("WRITES")) {
			opcode = "sys";
			oper1 = "writes";
			oper2 = convertToOffset(irNode.getRes());
		}
		else if(irNode.getOpcode().equals("READI")) {
			opcode = "sys";
			oper1 = "readi";
			oper2 = convertToOffset(irNode.getRes());
		}
		else if(irNode.getOpcode().equals("READF")) {
			opcode = "sys";
			oper1 = "readr";
			oper2 = convertToOffset(irNode.getRes());
		}
		else if(irNode.getOpcode().contains("STORE")) {
			opcode = "move";
			oper1 = irNode.getOper1();
			//System.out.println("STORE => " + " " + irNode.getOper1() + " " + irNode.getOper2());
			if((oper1 != null) && oper1.startsWith("$T")) {
               	oper1 = String.format("r%s", oper1.substring(2));
			}
			else {
				if(isAParameter(oper1)){
					if(oper1 != null && !Character.isDigit(oper1.charAt(0))) {
						oper1 = convertToOffset(oper1);
					}
					
				}
				else {
					oper1 = returnResultMappedRegister.get(oper1);
					//System.out.println(returnResultMappedRegister.get(oper1));
				}
				//oper1 = convertToOffset(oper1);
			}
			oper2 = irNode.getRes();
			if((oper2 != null) && oper2.startsWith("$T")) {
               	oper2 = String.format("r%s", oper2.substring(2));
			}
		    else if(oper2.equals("$R")){
				oper2 = "$-1";
				if(oper1.startsWith("$")) {
					String tempReg = getRegister();
					tempReg = String.format("r%s", oper2.substring(2));
					tinyNodeList.add(new TinyNode(opcode, oper1, tempReg));
					tempReg = regStack.pop();
					tempReg = String.format("r%s", oper2.substring(2));
					tinyNodeList.add(new TinyNode(opcode, tempReg, oper2)); 
					oper2 = getResultVariableOffsetForFunction(currFunctionName);
					tinyNodeList.add(new TinyNode(opcode, tempReg, oper2));
					return null;
				}
				tinyNodeList.add(new TinyNode(opcode, oper1, oper2));
				oper2 = getResultVariableOffsetForFunction(currFunctionName);
				tinyNodeList.add(new TinyNode(opcode, oper1, oper2));
				return null;
			}
		    else {
		    	if(isAParameter(oper2)) {
		    		oper2 = convertToOffset(oper2);
		    	}
		    	else {
		    		returnResultMappedRegister.put(oper2, oper1);
		    		oper2 = oper1;
		    	}
		    }
			if((oper1 == oper2) || (oper1.startsWith("$") && oper2.startsWith("$"))) {
				return null;
			}
		}
		else if(irNode.getOpcode().contains("ADD")) {
			opcode = "move";
			//System.out.println("ADD => " + irNode.getOper1() + " => " + convertToOffset(irNode.getOper1()) + " res " + irNode.getRes());
			tinyNodeList.add(new TinyNode(opcode, convertToOffset(irNode.getOper1()), formatRegister(irNode.getRes())));
			if(irNode.getOpcode().charAt(irNode.getOpcode().length()-1) == 'I') {
				opcode = "addi";
			}
			else {
				opcode = "addr";
			}
			tinyNodeList.add(new TinyNode(opcode, convertToOffset(irNode.getOper2()), formatRegister(irNode.getRes())));	
			return null;
		}

		else if(irNode.getOpcode().contains("SUB")) {
			opcode = "move";
			//System.out.println("SUB => " + irNode.getOper1() + " => " + convertToOffset(irNode.getOper1()) + " res " + irNode.getRes());
			tinyNodeList.add(new TinyNode(opcode, convertToOffset(irNode.getOper1()), formatRegister(irNode.getRes())));
			if(irNode.getOpcode().charAt(irNode.getOpcode().length()-1) == 'I') {
				opcode = "subi";
			}
			else {
				opcode = "subr";
			}
			tinyNodeList.add(new TinyNode(opcode, convertToOffset(irNode.getOper2()), formatRegister(irNode.getRes())));	
			return null;
		}
		else if(irNode.getOpcode().contains("MULT")) {
			opcode = "move";
			//System.out.println(convertToOffset(irNode.getOper2()));
			//System.out.println("MULT => " + irNode.getOper1() + " => " + convertToOffset(irNode.getOper1()) + " res " + irNode.getRes());
			tinyNodeList.add(new TinyNode(opcode, convertToOffset(irNode.getOper1()), formatRegister(irNode.getRes())));
			if(irNode.getOpcode().charAt(irNode.getOpcode().length()-1) == 'I') {
				opcode = "muli";
			}
			else {
				opcode = "mulr";
			}
			tinyNodeList.add(new TinyNode(opcode, convertToOffset(irNode.getOper2()), formatRegister(irNode.getRes())));	
			return null;
		}
		else if(irNode.getOpcode().contains("DIV")) {
			opcode = "move";
			//System.out.println("DIV => " + irNode.getOper1() + " => " + convertToOffset(irNode.getOper1()) + " res " + irNode.getRes());
			tinyNodeList.add(new TinyNode(opcode, convertToOffset(irNode.getOper1()), formatRegister(irNode.getRes())));
			if(irNode.getOpcode().charAt(irNode.getOpcode().length()-1) == 'I') {
				opcode = "divi";
			}
			else {
				opcode = "divr";
			}
			tinyNodeList.add(new TinyNode(opcode, convertToOffset(irNode.getOper2()), formatRegister(irNode.getRes())));	
			return null;
		}
		else if(irNode.getOpcode().equals("PUSH")) {
			opcode = "push";
			oper1 = irNode.getOper1();
			if(oper1 != null) {
				oper1 = convertToOffset(oper1);
			}
		}
		else if(irNode.getOpcode().equals("POP")) {
			opcode = "pop";
			oper1 = irNode.getOper1();
			if(oper1 != null) {
				oper1 = formatRegister(oper1);
			}
		}
		
		return new TinyNode(opcode, oper1, oper2);
	}
	
	public static String formatRegister(String reg) {
		if(reg.startsWith("$T")) {
           	return String.format("r%s", reg.substring(2));
		}
		return reg;
	}
	
	public static String convertToOffset(String variableName) {
		int offset = 0;
		if(variableName.contains("$T")) {
			return formatRegister(variableName);
		}
		for(int i = 0; i < functionList.size(); i++) {
			if(functionList.get(i).functionName.equals(currFunctionName)) {
				SymbolTableObject tempTableList = SymbolTableClass.getFunctionSymbolTableObject(currFunctionName);
				offset = tempTableList.getSymbolOffset(variableName);
				if(!currFunctionName.equals("main")) {
					offset = tempTableList.getSizeOfSymbolObjectArray() - Math.abs(offset) + 1; 
					if(currFunctionName.equals("factorial")) {
						offset = 2;
					}
					//System.out.println(variableName + " " + offset);
				}
				if(globalSymbolTable.findSymbolInSymbolTable(variableName) != null) {
					return variableName;
				}
				//System.out.println(variableName + " " + offset);
				return "$" + Integer.toString(offset);
			}
		}
		
		if(functionList.size() == 1) {
			//System.out.println("hi " + variableName);
			offset = globalSymbolTable.getSymbolOffset(variableName);
			//System.out.println("main => " + variableName + " " + offset);
		}		
		if(offset == 0) {
			System.out.println("ZERO => " + variableName);
		}
		return "$" + Integer.toString(offset);
		//return "$" + Integer.toString(currSymbolTable.getSymbolOffset(variableName));
	}
	
	public static boolean isAParameter(String variableName) {
		for(int i = 0; i < functionList.size(); i++) {
			if(functionList.get(i).functionName.equals(currFunctionName)) {
				SymbolTableObject tempTableList = SymbolTableClass.getFunctionSymbolTableObject(currFunctionName);
				if(!currFunctionName.equals("main")) {
					for(int j = 0; j < tempTableList.symbolObjectArrayList.size(); j++) {
						if(tempTableList.symbolObjectArrayList.get(j).getVarName().equals(variableName)) {
							if(tempTableList.symbolObjectArrayList.get(j).getStringValue() == null) {
								//System.out.println(variableName + "IS NOT A PARAMETER!");
								return false;
							}
						}
					}
				}
				
			}
		}
		//System.out.println(variableName + "NOT A PARAMETER!");
		return true;
	}
	
	private static String getResultVariableOffsetForFunction(String currFunctionName) {
		int parameterCount = 0;
		for(int i = 0; i < functionList.size(); i++) {
			if(functionList.get(i).functionName.equals(currFunctionName)) {
				for(int j = 0; j < functionList.get(i).symbolTable.symbolObjectArrayList.size(); j++) {
					//System.out.println(functionList.get(i).symbolTable.symbolObjectArrayList.get(j).getStringValue());
					if((functionList.get(i).symbolTable.symbolObjectArrayList.get(j).getStringValue() != null) && functionList.get(i).symbolTable.symbolObjectArrayList.get(j).getStringValue().equals("PARAMETER")) {
						parameterCount++;
					}
				}
			}
		}
		//System.out.println(parameterCount);
		parameterCount += 2;
		return "$" + Integer.toString(parameterCount);
	}
	
	public static void livenessAnalysisBasicBlockList() {
		//livenessAnalysisVariableList.add
		String currFunctionName = null;
		
		for(int i = 0; i < basicBlockList.size(); i++) {
			for(int j = 0; j < basicBlockList.get(i).size(); j++) {
				if(basicBlockList.get(i).get(j).getOpcode().equals("LABEL") && !basicBlockList.get(i).get(j).getOper1().contains("label")) {
					currFunctionName = basicBlockList.get(i).get(j).getOper1();
					/*ArrayList<SymbolObject> tempList = livenessAnalysisMap.get(basicBlockList.get(i).get(j).getOper1());
					for(int k = 0; k < tempList.size(); k++) {
						tempList.get(k).printFormattedSymbolOutput();
					}
					for(int k = 0; k < globalSymbolTable.symbolObjectArrayList.size(); k++) {
						globalSymbolTable.symbolObjectArrayList.get(k).printFormattedSymbolOutput();
					}
					System.out.println("----------------------------------------");
					*/
				}
				basicBlockList.get(i).get(j).functionName = currFunctionName;
			}
			//System.out.println("----------------------------------------");
		}
		
		LinkedList<String> livenessList;
		for(int i = 0; i < basicBlockList.size(); i++) {
			livenessList = createLivenessStringList(basicBlockList.get(i).get(0).functionName);
			for(int j = basicBlockList.get(i).size()-1; j >= 0; j--) {
				//System.out.println(basicBlockList.get(i).get(j).functionName + " ==> " + basicBlockList.get(i).get(j).getOpcode());
				IRNode tempNode = basicBlockList.get(i).get(j);
				//System.out.println(";; " + tempNode.getOpcode() + " " + tempNode.getOper1() + " " + tempNode.getOper2() + " " + tempNode.getRes());
				if(tempNode.getRes() != null && tempNode.getOper1() != null && tempNode.getOper2() != null) {
					//System.out.println("hi1");
					livenessList = removeVariableFromLivenessList(livenessList, tempNode.getRes());
					livenessList.add(tempNode.getOper1());
					livenessList.add(tempNode.getOper2());
				}
				else if(tempNode.getRes() != null && tempNode.getOper2() != null) {
					//System.out.println("hi2");
					livenessList = removeVariableFromLivenessList(livenessList, tempNode.getRes());
					livenessList.add(tempNode.getOper2());
				}
				else if(tempNode.getRes() != null && tempNode.getOper1() != null) {
					//System.out.println("hi3");
					livenessList = removeVariableFromLivenessList(livenessList, tempNode.getRes());
					livenessList.add(tempNode.getOper1());
				}
				else if(tempNode.getOpcode().equals("READ")) {
					livenessList = removeVariableFromLivenessList(livenessList, tempNode.getRes());
				}
				else if(tempNode.getOpcode().contains("WRITE")) {
					livenessList.add(tempNode.getRes());
				}
				else if(tempNode.getOpcode().contains("POP")) {
					livenessList = removeVariableFromLivenessList(livenessList, tempNode.getOper1());
				}
				for(int ab = 0; ab < livenessList.size(); ab++) {
					if(livenessList.get(ab) == null) {
						livenessList.remove(ab);
					}
				}
				for(int ab = 0; ab < livenessList.size() - 1; ab++) {
					for(int cd = ab + 1; cd < livenessList.size(); cd++) {
						if(livenessList.get(ab) == null || livenessList.get(cd) == null) {
							continue;
						}
						if(livenessList.get(ab).equals(livenessList.get(cd))) {
							livenessList.remove(cd);
							break;
						}
					}
				}
				tempNode.liveVariables = livenessList;
				//printLivenessList(tempNode.liveVariables);
			}
			
			//System.out.println("----------------------------------------");
		}
	}
	
	public static void printLivenessList(LinkedList<String> livenessList) {
		System.out.println();
		for(int i = 0; i < livenessList.size(); i++) {
			System.out.print(livenessList.get(i) + " ");
		}
		System.out.println();
	}
	public static boolean isVariableInLivenessList(LinkedList<String> livenessList, String variable) {
		for(int i = 0; i < livenessList.size(); i++) {
			//System.out.println(livenessList.get(i) + " -- " + variable);
			if(livenessList.get(i).equals(variable)) {
				return true;
			}
		}
		return false;
	}
	
	public static LinkedList<String> removeVariableFromLivenessList(LinkedList<String> livenessList, String variable) {
		for(int i = 0; i < livenessList.size(); i++) {
			if((variable != null) && (livenessList.get(i) != null) && livenessList.get(i).equals(variable) && (!variable.contains("label"))) {
				//System.out.println("Removing " + variable);
				livenessList.remove(i);
				break;
			}
		}
		return livenessList;
	}
	
	public static LinkedList<String> createLivenessStringList(String functionName) {
		LinkedList<String> livenessLinkedList = new LinkedList<String>();
		
		ArrayList<SymbolObject> tempList = livenessAnalysisMap.get(functionName);
		for(int k = 0; k < tempList.size(); k++) {
			livenessLinkedList.add(tempList.get(k).getVarName());
		}
		for(int k = 0; k < globalSymbolTable.symbolObjectArrayList.size(); k++) {
			livenessLinkedList.add(globalSymbolTable.symbolObjectArrayList.get(k).getVarName());
		}
		
		return livenessLinkedList;
	}
	
	public static void createBasicBlockList() {
		boolean startNewList = false;
		
		basicBlockList.add(new LinkedList<IRNode>());
		
		for(int i = 0; i < irNodeList.size(); i++) {
			if((startNewList == true) || isLabelInList(irNodeList.get(i).getRes()) || isLabelInList(irNodeList.get(i).getOper1())) {
				basicBlockList.add(new LinkedList<IRNode>());
				startNewList = false;
			}
			if(irNodeList.get(i).getOpcode().equals("NE")) {
				basicBlockList.get(basicBlockList.size()-1).add(irNodeList.get(i));
				labelStringList.add(irNodeList.get(i).getRes());
				startNewList = true;
				//basicBlockList.add
			}
			else if(irNodeList.get(i).getOpcode().equals("LE")) {
				basicBlockList.get(basicBlockList.size()-1).add(irNodeList.get(i));
				labelStringList.add(irNodeList.get(i).getRes());
				startNewList = true;
			}
			else if(irNodeList.get(i).getOpcode().equals("GE")) {
				basicBlockList.get(basicBlockList.size()-1).add(irNodeList.get(i));
				labelStringList.add(irNodeList.get(i).getRes());
				startNewList = true;
			}
			else if(irNodeList.get(i).getOpcode().equals("JUMP")) {
				basicBlockList.get(basicBlockList.size()-1).add(irNodeList.get(i));
				labelStringList.add(irNodeList.get(i).getOper1());
				startNewList = true;
			}
			else if(irNodeList.get(i).getOpcode().equals("RET")) {
				basicBlockList.get(basicBlockList.size()-1).add(irNodeList.get(i));
				startNewList = true;
			}
			else {
				basicBlockList.get(basicBlockList.size()-1).add(irNodeList.get(i));
			}
		}
	}
	
	public static boolean isLabelInList(String label) {
		for(int i = 0; i < labelStringList.size(); i++) {
			if((labelStringList.get(i) != null)&& labelStringList.get(i).equals(label)) {
				labelStringList.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public static void generateIRCode(CommonTree astTree) {
		 List<CommonTree> children = astTree.getChildren();
         ListIterator<CommonTree> iter = children.listIterator();
         while(iter.hasNext()) {
        	 	CommonTree treeNode = (CommonTree) iter.next();
        	 	//System.out.println(treeNode.getText());
        	    if(treeNode.getText().equals("FUNCTION")) {
        	    	//for(int i = 0; i < treeNode.getChildCount(); i++)	{
                    //  	 System.out.println("node: " + treeNode.getChild(i).getText() + " childrenCount: " + treeNode.getChild(i).getChildCount()); 
                    //}
        	    	//System.out.println(treeNode.getChild(0).getText() + " " + treeNode.getChildCount());
        	    	SymbolTableClass.variableOffset = 1;
        	    	FunctionClass tempObject = new FunctionClass(treeNode.getChild(0).getText());
        	    	currFunctionName = treeNode.getChild(0).getText();
        	    	int parameterCount = 0;
        	    	for(int i = 0; i < treeNode.getChild(0).getChildCount(); i++) {
        	    		if(treeNode.getChild(0).getChild(i).getText().equals("FLOAT") || treeNode.getChild(0).getChild(i).getText().equals("INT") || treeNode.getChild(0).getChild(i).getText().equals("STRING")) {
        	    			parameterCount++;
        	    			tempObject.parameterListVariables.put(treeNode.getChild(0).getChild(i+1).getText(), treeNode.getChild(0).getChild(i).getText());
        	    		}
        	    	}
        	    	//System.out.println(parameterCount);
        	    	tempObject.paramenterCount = parameterCount;
        	    	
        	    	regStack.clear();
        	    	regCount = -1;
        	    	currSymbolTable = SymbolTableClass.getFunctionSymbolTableObject(treeNode.getChild(0).getText());
        	    	tempObject.symbolTable = currSymbolTable;
        	    	functionList.add(tempObject);
        	    	if(!treeNode.getChild(0).getText().equals("main")) {
        	    		irNodeList.add(new IRNode("LABEL", treeNode.getChild(0).getText(), null, null));
        	    		irNodeList.add(new IRNode("LINK", null, null, null));
        	    	}
        	    	livenessAnalysisMap.put(treeNode.getChild(0).getText(), currSymbolTable.symbolObjectArrayList);
        	    	generateIRCode(treeNode);
        	    	
        	    }
        	    if(treeNode.getText().equals("main")) {
        	    	//System.out.println("LABELLLL");
        	    	irNodeList.add(new IRNode("LABEL", treeNode.getText(), null, null));
        	    	irNodeList.add(new IRNode("LINK", null, null, null));
        	    }
        	    															/* handle both assignments and expression */
        	    if(treeNode.getText().equals(":=")) {
        	    	if(treeNode.getChildCount() == 2) { 
        	    		// ASSIGN a := 10; etc
        	    		//System.out.println(treeNode.getChild(0).getText());
        	    		//System.out.println(treeNode.getChild(1).getText());
        	    		if((treeNode.getChild(0).getChildCount() == 0) && (treeNode.getChild(1).getChildCount() == 0)) { // check if this is a single assignment a:=20 etc
        	    			String varType1 = currSymbolTable.findSymbolInSymbolTable(treeNode.getChild(0).getText());
            	    		String varType2 = treeNode.getChild(1).getText();
            	    		//System.out.println(varType1 + varType2);
            	    		if(varType1.equals("INT")) {
            	    			instruction = "STOREI";
            	    		}
            	    		else if(varType1.equals("FLOAT")) {
            	    			instruction = "STOREF";
            	    		}
            	    		irNodeList.add(new IRNode(instruction, varType2, null, getRegister()));  // takes care of right node
            	    		
            	    		irNodeList.add(new IRNode(instruction, regStack.pop(), null, treeNode.getChild(0).getText()));
        	    		}
        	    		else { // handles expressions and functions being called
        	    			if(isThisAFunction(treeNode.getChild(1).getText())) {
        	    				//System.out.println("function call for " + treeNode.getChild(1).getText() + " made");
        	    				irNodeList.add(new IRNode("PUSH", null, null, null)); // push space for return value
        	    				int i = 0;
        	    				//System.out.println(treeNode.getChild(1).getChildCount() + " " + treeNode.getChild(1).getChild(0).getText());
        	    				while(treeNode.getChild(1).getChild(i) != null) {
        	    					//System.out.println("hi" + i);
        	    					if(treeNode.getChild(1).getChild(i).getType() == MicroParserParser.IDENTIFIER) {
        	    						irNodeList.add(new IRNode("PUSH", treeNode.getChild(1).getChild(i).getText(), null, null)); // push parameters onto stack
        	    						//System.out.println("IDENTIFIER!!");
        	    					}
        	    					else {
        	    						//System.out.println("ITS PROBABLY A SIGN!!");
        	    						POTraversal((CommonTree)treeNode.getChild(1).getChild(i));
        	    						irNodeList.add(new IRNode("PUSH", regStack.pop(), null, null));
        	    					}
        	    					i += 2;
        	    				}
        	    				irNodeList.add(new IRNode("JSR", treeNode.getChild(1).getText(), null, null));
        	    				while(i > 0) {
        	    					irNodeList.add(new IRNode("POP", null, null, null)); // pop off all the parameters
        	    					i -= 2;
        	    				}
        	    				irNodeList.add(new IRNode("POP", getRegister(), null, null)); // pop result
        	    				String varType1 = currSymbolTable.findSymbolInSymbolTable(treeNode.getChild(0).getText());
                	    		//System.out.println(varType1 + varType2);
                	    		if(varType1.equals("INT")) {
                	    			instruction = "STOREI";
                	    		}
                	    		else if(varType1.equals("FLOAT")) {
                	    			instruction = "STOREF";
                	    		}
                	    		//System.out.println(varType1);
                	    		irNodeList.add(new IRNode(instruction, regStack.pop(), null, treeNode.getChild(0).getText()));
                	    		
                	    		
        	    			}
        	    			else {
        	    				POTraversal((CommonTree)treeNode.getChild(1));
        	    				if(instruction.charAt(instruction.length()-1) == 'I') {
        	    					instruction = "STOREI";
        	    				}
        	    				else {
        	    					instruction = "STOREF";
        	    				}
        	    				irNodeList.add(new IRNode(instruction, regStack.pop(), null, treeNode.getChild(0).getText()));
        	    			}
        	    			//irNodeList.add(new IRNode("TEMPINSTRUCTION", null, null, null));
        	    		}
        	    	}
        	    }
        	    															/*  end of assignments and expression */
        	    if(treeNode.getText().equals("WRITE")) {
        	    	int i = 0;
        	    	while(treeNode.getChild(i) != null) {
        	    		//System.out.println(treeNode.getChild(i).getText());
        	    		String varType1 = currSymbolTable.findSymbolInSymbolTable(treeNode.getChild(i).getText());
        	    		if(varType1.equals("INT")) {
        	    			instruction = "WRITEI";
        	    		}
        	    		else if(varType1.equals("FLOAT")) {
        	    			instruction = "WRITEF";
        	    		}
        	    		else if(varType1.equals("STRING")) {
        	    			instruction = "WRITES";
        	    		}
        	    		irNodeList.add(new IRNode(instruction, null, null, treeNode.getChild(i).getText()));
        	    		i += 2;
        	    	}
        	    }
        	    if(treeNode.getText().equals("READ")) {
        	    	String varType1 = currSymbolTable.findSymbolInSymbolTable(treeNode.getChild(0).getText());
        	    	if(varType1.equals("INT")) {
        	    		instruction = "READI";
        	    	}
        	    	else if(varType1.equals("FLOAT")) {
        	    		instruction = "READF";
        	    	}
        	    	irNodeList.add(new IRNode(instruction, null, null, treeNode.getChild(0).getText()));
        	    }
        	    														/*  Handle IF-THEN-ELSE   */
        	    if(treeNode.getText().equals("IF")) {
        	    	//System.out.println(treeNode.getChildCount());
        	    	//System.out.println("IF " + treeNode.getChild(0).getText() + " " + treeNode.getChild(0).getChildCount());
        	    	
        	    	generateIRCode((CommonTree) treeNode);
        	    }
        	    if(treeNode.getText().equals("=")) {  /// IF condition checks
        	    	//System.out.println("= " + treeNode.getChildCount());
        	    	if(!((treeNode.getChild(0).getChildCount() == 0) && (treeNode.getChild(1).getChildCount() == 0))) {
        	    		POTraversal((CommonTree)treeNode.getChild(1));
        	    	}
        	    	else {
        	    		conditionIRCode((CommonTree) treeNode);
        	    	}
        	    	
        	    	irNodeList.add(new IRNode("NE", treeNode.getChild(0).getText(), regStack.pop(), getLabel()));
        	    }
        	    if(treeNode.getText().equals("<")) {
        	    	//System.out.println("< " + treeNode.getChildCount());
        	    	if(!((treeNode.getChild(0).getChildCount() == 0) && (treeNode.getChild(1).getChildCount() == 0))) {
            	    	POTraversal((CommonTree)treeNode.getChild(1));
        	    	}
        	    	else {
        	    		conditionIRCode((CommonTree) treeNode);
        	    	}
            	    
        	    	irNodeList.add(new IRNode("GE", treeNode.getChild(0).getText(), regStack.pop(), getLabel()));
        	    }
        	    if(treeNode.getText().equals(">")) {
        	    	//System.out.println("> " + treeNode.getChildCount());
        	    	if(!((treeNode.getChild(0).getChildCount() == 0) && (treeNode.getChild(1).getChildCount() == 0))) {
            	    	POTraversal((CommonTree)treeNode.getChild(1));
        	    	}
            	    else {
            	    	conditionIRCode((CommonTree) treeNode);
            	    }
                		
            	    irNodeList.add(new IRNode("LE", treeNode.getChild(0).getText(), regStack.pop(), getLabel()));
        	    }
        	    if(treeNode.getText().equals("THEN")) {
        	    	//System.out.println(treeNode.getChildCount());
        	    	generateIRCode((CommonTree) treeNode);
        	    	String tempLabel = labelStack.pop();
        	    	irNodeList.add(new IRNode("JUMP", null, null, getLabel()));
        	    	irNodeList.add(new IRNode("LABEL", tempLabel, null, null));
        	    }
        	    if(treeNode.getText().equals("ELSE")) {
        	    	//System.out.println("ELSE " + treeNode.getChildCount());
        	    	generateIRCode((CommonTree) treeNode);
        	    }
        	    if(treeNode.getText().equals("ENDIF")) {
        	    	irNodeList.add(new IRNode("LABEL", labelStack.pop(), null, null));
        	    }
        	    														/*  end of IF-THEN-ELSE   */
        	    
        	    														/*  Handle REPEAT-UNTIL(cond)   */
        	    if(treeNode.getText().equals("REPEAT")) {
        	    	//System.out.println("REPEAT " + treeNode.getChildCount());
        	    	irNodeList.add(new IRNode("LABEL", getLabel(), null, null));
        	    	generateIRCode((CommonTree) treeNode);
        	    	
        	    }
        	    if(treeNode.getText().equals("UNTIL")) {
        	    	//System.out.println("UNTIL " + treeNode.getChild(0).getText());
        	    	CommonTree tempNode = (CommonTree) treeNode.getChild(0);
        	    	
        	    	String varType1 = currSymbolTable.findSymbolInSymbolTable(tempNode.getChild(0).getText());
        	    	String varType2 = tempNode.getChild(1).getText();
        	    	if(varType1.equals("INT")) {
    	    			instruction = "STOREI";
    	    		}
    	    		else if(varType1.equals("FLOAT")) {
    	    			instruction = "STOREF";
    	    		}
    	    		irNodeList.add(new IRNode(instruction, varType2, null, getRegister()));  // takes care of right node
    	    		
    	    		
        	    	if(tempNode.getText().equals("=")) {
        	    		//System.out.println(tempNode.getChild(0).getText() + " " + tempNode.getChild(1).getText());
        	    		irNodeList.add(new IRNode("NE", tempNode.getChild(0).getText(), regStack.pop(), labelStack.pop()));
        	    	}
        	    	if(tempNode.getText().equals(">")) {
        	    		irNodeList.add(new IRNode("LE", tempNode.getChild(0).getText(), regStack.pop(), labelStack.pop()));
        	    	}
        	    	if(tempNode.getText().equals("<")) {
        	    		irNodeList.add(new IRNode("GE", tempNode.getChild(0).getText(), regStack.pop(), labelStack.pop()));
        	    	}
        	    }
        	    if(treeNode.getText().equals("RETURN")) {
        	    	//System.out.println(treeNode.getChild(0).getText());
        	    	if(treeNode.getChild(0).getChildCount() != 0) {
        	    		POTraversal((CommonTree)treeNode.getChild(0));
        	    		irNodeList.add(new IRNode("STORE", regStack.pop(), null, "$R"));
        	    	}
        	    	else {
        	    		if(!currFunctionName.equals("main")) {
        	    			irNodeList.add(new IRNode("STORE", treeNode.getChild(0).getText(), null, "$R"));
        	    		}
        	    	}
        	    	irNodeList.add(new IRNode("RET", null, null, null));
        	    }
        	    															/*  end of REPEAT-UNTIL(cond)   */
         }
	}
	
	private static boolean isThisAFunction(String functionName) {
		for(int i = 0; i < functionList.size(); i++) {
			if(functionList.get(i).functionName.equals(functionName)) {
				return true;
			}
		}
		return false;
	}
	
	private static void conditionIRCode(CommonTree treeNode) {
		String varType1 = currSymbolTable.findSymbolInSymbolTable(treeNode.getChild(0).getText());
    	String varType2 = treeNode.getChild(1).getText();
    	if(varType1.equals("INT")) {
			instruction = "STOREI";
		}
		else if(varType1.equals("FLOAT")) {
			instruction = "STOREF";
		}
		irNodeList.add(new IRNode(instruction, varType2, null, getRegister()));  // takes care of right node
	}
	
	public static void POTraversal(CommonTree tree) {
		 if(tree.getChild(0) == null) {
			 return;
		 }
		 POTraversal((CommonTree)tree.getChild(0));
		 POTraversal((CommonTree)tree.getChild(1));
		 //System.out.println(tree.getText() + " " + tree.getChild(0).getType() + " " + tree.getChild(1).getType() + " PPARENT = " + tree.parent.getText());
		 CommonTree leftChild = (CommonTree) tree.getChild(0);
		 CommonTree rightChild = (CommonTree) tree.getChild(1);
		 if(tree.getText().equals("+")) {
			 //System.out.println("PLUS");
			 if((leftChild.getType() == MicroParserParser.IDENTIFIER) && (rightChild.getType() == MicroParserParser.IDENTIFIER)) {
				 //System.out.println("II" + leftChild.getText() + rightChild.getText());
				 setInstruction(tree, 0);
				 irNodeList.add(new IRNode(instruction, leftChild.getText(), rightChild.getText(), getRegister()));
			 }
			 else if ((leftChild.getType() == MicroParserParser.IDENTIFIER) && (rightChild.getType() != MicroParserParser.IDENTIFIER)) {
				 //System.out.println("IN" + leftChild.getText() + rightChild.getText());
				 setInstruction(tree, 3);
				 irNodeList.add(new IRNode(instruction, leftChild.getText(), regStack.pop(), getRegister()));
			 }
			 else if ((leftChild.getType() != MicroParserParser.IDENTIFIER) && (rightChild.getType() == MicroParserParser.IDENTIFIER)) {
				 //System.out.println("NI" + leftChild.getText() + rightChild.getText());
				 setInstruction(tree, 3);
				 irNodeList.add(new IRNode(instruction, regStack.pop(), rightChild.getText(), getRegister()));
			 }
			 else {
				 setInstruction(tree, 3);
				 irNodeList.add(new IRNode(instruction, regStack.pop(), regStack.pop(), getRegister()));
			 }
		 }
		 else if(tree.getText().equals("-")) {
			 //System.out.println("MINUS");
			 if((leftChild.getType() == MicroParserParser.IDENTIFIER) && (rightChild.getType() == MicroParserParser.IDENTIFIER)) {
				 //System.out.println(leftChild.getText() + rightChild.getText());
				 setInstruction(tree, 0);
				 irNodeList.add(new IRNode(instruction, leftChild.getText(), rightChild.getText(), getRegister()));
			 }
			 else if ((leftChild.getType() == MicroParserParser.IDENTIFIER) && (rightChild.getType() != MicroParserParser.IDENTIFIER)) {
				 //System.out.println("IN" + leftChild.getText() + rightChild.getText());
				 setInstruction(tree, 3);
				 //System.out.println(regStack.peek());
				 irNodeList.add(new IRNode(instruction, leftChild.getText(), regStack.pop(), getRegister()));
				 //System.out.println(regStack.peek());
			 }
			 else if ((leftChild.getType() != MicroParserParser.IDENTIFIER) && (rightChild.getType() == MicroParserParser.IDENTIFIER)) {
				 //System.out.println("NI" + leftChild.getText() + rightChild.getText());
				 setInstruction(tree, 3);
				 irNodeList.add(new IRNode(instruction, regStack.pop(), rightChild.getText(), getRegister()));
			 }
			 else {
				 setInstruction(tree, 3);
				 irNodeList.add(new IRNode(instruction, regStack.pop(), regStack.pop(), getRegister()));
			 }
		 }
		 else if(tree.getText().equals("*")) {
			 //System.out.println("MUL");
			 if((leftChild.getType() == MicroParserParser.IDENTIFIER) && (rightChild.getType() == MicroParserParser.IDENTIFIER)) {
				 //System.out.println(leftChild.getText() + rightChild.getText());
				 setInstruction(tree, 0);
				 irNodeList.add(new IRNode(instruction, leftChild.getText(), rightChild.getText(), getRegister()));
			 }
			 else if ((leftChild.getType() == MicroParserParser.IDENTIFIER) && (rightChild.getType() != MicroParserParser.IDENTIFIER)) {
				 //System.out.println("IN" + leftChild.getText() + rightChild.getText());
				 setInstruction(tree, 3);
				 irNodeList.add(new IRNode(instruction, leftChild.getText(), regStack.pop(), getRegister()));
			 }
			 else if ((leftChild.getType() != MicroParserParser.IDENTIFIER) && (rightChild.getType() == MicroParserParser.IDENTIFIER)) {
				 //System.out.println("NI" + leftChild.getText() + rightChild.getText());
				 setInstruction(tree, 3);
				 irNodeList.add(new IRNode(instruction, regStack.pop(), rightChild.getText(), getRegister()));
			 }
			 else {
				 setInstruction(tree, 3);
				 irNodeList.add(new IRNode(instruction, regStack.pop(), regStack.pop(), getRegister()));
			 }
		 }
		 else if(tree.getText().equals("/")) {
			 //System.out.println("DIV");
			 if((leftChild.getType() == MicroParserParser.IDENTIFIER) && (rightChild.getType() == MicroParserParser.IDENTIFIER)) {
				 //System.out.println(leftChild.getText() + rightChild.getText());
				 setInstruction(tree, 0);
				 irNodeList.add(new IRNode(instruction, leftChild.getText(), rightChild.getText(), getRegister()));
			 }
			 else if ((leftChild.getType() == MicroParserParser.IDENTIFIER) && (rightChild.getType() != MicroParserParser.IDENTIFIER)) {
				 //System.out.println("IN" + leftChild.getText() + rightChild.getText());
				 setInstruction(tree, 3);
				 irNodeList.add(new IRNode(instruction, leftChild.getText(), regStack.pop(), getRegister()));
			 }
			 else if ((leftChild.getType() != MicroParserParser.IDENTIFIER) && (rightChild.getType() == MicroParserParser.IDENTIFIER)) {
				 //System.out.println("NI" + leftChild.getText() + rightChild.getText());
				 setInstruction(tree, 3);
				 irNodeList.add(new IRNode(instruction, regStack.pop(), rightChild.getText(), getRegister()));
			 }
			 else {
				 setInstruction(tree, 3);
				 irNodeList.add(new IRNode(instruction, regStack.pop(), regStack.pop(), getRegister()));
			 }
		 }
		 
	 }
	
	public static void setInstruction(CommonTree tree, int childrenType) {
		
		String varType1 = null;
		switch(childrenType) {
			case 0:
			case 1:
					varType1 = currSymbolTable.findSymbolInSymbolTable(tree.getChild(0).getText());
					if(varType1.equals("INT")) {
						if(tree.getText().equals("+")) {
							instruction = "ADDI";
						}
						else if(tree.getText().equals("-")) {
							instruction = "SUBI";
						}
						else if(tree.getText().equals("*")) {
							instruction = "MULTI";
						}
						else if(tree.getText().equals("/")) {
							instruction = "DIVI";
						}
					}
					else if(varType1.equals("FLOAT")) {
						if(tree.getText().equals("+")) {
							instruction = "ADDF";
						}
						else if(tree.getText().equals("-")) {
							instruction = "SUBF";
						}
						else if(tree.getText().equals("*")) {
							instruction = "MULTF";
						}
						else if(tree.getText().equals("/")) {
							instruction = "DIVF";
						}
					}
					break;
					
			case 2:
					varType1 = currSymbolTable.findSymbolInSymbolTable(tree.getChild(1).getText());
					if(varType1.equals("INT")) {
						if(tree.getText().equals("+")) {
							instruction = "ADDI";
						}
						else if(tree.getText().equals("-")) {
							instruction = "SUBI";
						}
						else if(tree.getText().equals("*")) {
							instruction = "MULTI";
						}
						else if(tree.getText().equals("/")) {
							instruction = "DIVI";
						}
					}
					else if(varType1.equals("FLOAT")) {
						if(tree.getText().equals("+")) {
							instruction = "ADDF";
						}
						else if(tree.getText().equals("-")) {
							instruction = "SUBF";
						}
						else if(tree.getText().equals("*")) {
							instruction = "MULTF";
						}
						else if(tree.getText().equals("/")) {
							instruction = "DIVF";
						}
					}
					break;
					
			case 3:
					if((tree.getChild(0).getType() == MicroParserParser.INTLITERAL) && (tree.getChild(1).getType() == MicroParserParser.INTLITERAL)) {
						instruction = "STOREI";
						irNodeList.add(new IRNode(instruction, tree.getChild(0).getText(), null, getRegister()));
						irNodeList.add(new IRNode(instruction, tree.getChild(1).getText(), null, getRegister()));
						setSubInstruction("INT", tree.getText());
					}
					else if((tree.getChild(0).getType() != MicroParserParser.INTLITERAL) && (tree.getChild(1).getType() == MicroParserParser.INTLITERAL)) {
						instruction = "STOREI";
						irNodeList.add(new IRNode(instruction, tree.getChild(1).getText(), null, getRegister()));
						setSubInstruction("INT", tree.getText());
					}
					else if((tree.getChild(0).getType() == MicroParserParser.INTLITERAL) && (tree.getChild(1).getType() != MicroParserParser.INTLITERAL)) {
						instruction = "STOREI";
						irNodeList.add(new IRNode(instruction, tree.getChild(0).getText(), null, getRegister()));
						setSubInstruction("INT", tree.getText());
					}
					
					if((tree.getChild(0).getType() == MicroParserParser.FLOATLITERAL) && (tree.getChild(1).getType() == MicroParserParser.FLOATLITERAL)) {
						instruction = "STOREF";
						irNodeList.add(new IRNode(instruction, tree.getChild(0).getText(), null, getRegister()));
						irNodeList.add(new IRNode(instruction, tree.getChild(1).getText(), null, getRegister()));
						setSubInstruction("FLOAT", tree.getText());
					}
					else if((tree.getChild(0).getType() != MicroParserParser.FLOATLITERAL) && (tree.getChild(1).getType() == MicroParserParser.FLOATLITERAL)) {
						instruction = "STOREF";
						irNodeList.add(new IRNode(instruction, tree.getChild(1).getText(), null, getRegister()));
						setSubInstruction("FLOAT", tree.getText());
					}
					else if((tree.getChild(0).getType() == MicroParserParser.FLOATLITERAL) && (tree.getChild(1).getType() != MicroParserParser.FLOATLITERAL)) {
						instruction = "STOREF";
						irNodeList.add(new IRNode(instruction, tree.getChild(0).getText(), null, getRegister()));
						setSubInstruction("FLOAT", tree.getText());
					}
					else {
						if(instruction.charAt(instruction.length()-1) == 'I') {
							setSubInstruction("INT", tree.getText());
						}
						else {
							setSubInstruction("FLOAT", tree.getText());
						}
							
					}
		}
	}
	
	public static void setSubInstruction(String varType1, String sign) {
		if(varType1.equals("INT")) {
			if(sign.equals("+")) {
				instruction = "ADDI";
			}
			else if(sign.equals("-")) {
				instruction = "SUBI";
			}
			else if(sign.equals("*")) {
				instruction = "MULTI";
			}
			else if(sign.equals("/")) {
				instruction = "DIVI";
			}
		}
		else if(varType1.equals("FLOAT")) {
			if(sign.equals("+")) {
				instruction = "ADDF";
			}
			else if(sign.equals("-")) {
				instruction = "SUBF";
			}
			else if(sign.equals("*")) {
				instruction = "MULTF";
			}
			else if(sign.equals("/")) {
				instruction = "DIVF";
			}
		}
	}
		
	public static void printBasicBlockList() {
		for(int i = 0; i < basicBlockList.size(); i++) {
			for(int j = 0; j < basicBlockList.get(i).size(); j++) {
				basicBlockList.get(i).get(j).printNode();
			}
			System.out.println("----------------------------------------");
		}
	}
	
	 public static void updateGlobalSymbolTable(SymbolTableObject sto) {
		 //globalSymbolTable = sto;
	 }
	 
	 public static void printSymbolTable() {
		currSymbolTable.printAllSymbolObjectsInSymbolTable();
	 }
	 
	 public static void printIRNodeList() {
		 for(int i = 0; i < irNodeList.size(); i++) {
			 irNodeList.get(i).printNode();
		 }
	 }
	 
	 public static String getRegister() {
		currReg = "$T" + Integer.toString(++regCount);
		regStack.push(currReg);
		return currReg;
		//String reg = allocate();
		//regStack.push(reg);
		//return reg;
	 }
	 
	 public static void freeRegister(String registerName) {
		 if(registerList.get(0).registerName.equals(registerName)) {
			 if(registerList.get(0).registerDirty == true) {
				// System.out.println("store generate instruction r0");
			 }
			 registerList.get(0).variableInRegister = null;
			 registerList.get(0).registerDirty = false;
		 }
		 else if(registerList.get(1).registerName.equals(registerName)) {
			 if(registerList.get(0).registerDirty == true) {
				// System.out.println("store generate instruction r1");
			 }
			 registerList.get(1).variableInRegister = null;
			 registerList.get(1).registerDirty = false;
		 }
		 else if(registerList.get(2).registerName.equals(registerName)) {
			 if(registerList.get(0).registerDirty == true) {
				// System.out.println("store generate instruction r2");
			 }
			 registerList.get(2).variableInRegister = null;
			 registerList.get(2).registerDirty = false;
		 }
		 else if(registerList.get(3).registerName.equals(registerName)) {
			 if(registerList.get(0).registerDirty == true) {
				// System.out.println("store generate instruction r3");
			 }
			 registerList.get(3).variableInRegister = null;
			 registerList.get(3).registerDirty = false;
		 }
	 }
	 
	 public static String allocate() {
		if(registerList.get(0).variableInRegister == null) {
			//registerList.get(0).variableInRegister = variable;
			//System.out.println("allocating to r0");
			registerList.get(0).variableInRegister = "temp0";
			registerList.get(0).registerDirty = false;
			return registerList.get(0).registerName;
		}
		else if(registerList.get(1).variableInRegister == null) {
			//registerList.get(1).variableInRegister = variable;
		//	System.out.println("allocating to r1");
			registerList.get(1).variableInRegister = "temp1";
			registerList.get(1).registerDirty = false;
			return registerList.get(1).registerName;
		}
		else if(registerList.get(2).variableInRegister == null) {
			//registerList.get(2).variableInRegister = variable;
		//	System.out.println("allocating to r2");
			registerList.get(2).variableInRegister = "temp2";
			registerList.get(2).registerDirty = false;
			return registerList.get(2).registerName;
		}
		else if(registerList.get(3).variableInRegister == null) {
			//registerList.get(3).variableInRegister = variable;
		//	System.out.println("allocating to r3");
			registerList.get(3).variableInRegister = "temp3";
			registerList.get(3).registerDirty = false;
			return registerList.get(3).registerName;
		}
		
		freeRegister("$T0");
		//registerList.get(0).variableInRegister = variable;
		return "$T0";
	 }
	 
	 public static String getLabel() {
		    String currLabel = null;
			currLabel = "label" + Integer.toString(++labelCount);
			labelStack.push(currLabel);
			return currLabel;
	 }
	 
	 public static void printTinyCode() {
		 for(int i = 0; i < tinyNodeList.size(); i++) {
			 tinyNodeList.get(i).printNode();
		 }
	 }
	 
	 public SymbolTableObject getFunctionSymbolTableObject(String functionName) {
		return null;
	 }
}

