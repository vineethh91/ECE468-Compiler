import java.io.IOException;
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
	
	public static LinkedList<IRNode> irNodeList = new LinkedList<IRNode>();
	
	public static LinkedList<TinyNode> tinyNodeList = new LinkedList<TinyNode>();
	
	private static String currReg = "$T1";
	
	private static int regCount = 0;
	
	private static String instruction = null;
    
	private static Stack<String> regStack = new Stack<String>();
	
	private static String prevInstructType = null;
	
	public static void main(String[] args) throws IOException{
		if(args.length != 1) {
			throw new IOException("Not enough arguments provided");
		}
		
		MicroParserLexer lexerObject = new MicroParserLexer(new ANTLRFileStream(args[0]));
		CommonTokenStream commonTokenStreamObject = new CommonTokenStream(lexerObject);
		MicroParserParser parserObject = new MicroParserParser(commonTokenStreamObject);
		
		try {
			MicroParserParser.program_return astTree = parserObject.program();

		//	System.out.println(((CommonTree) astTree.tree).getChildCount());
		//	System.out.println(((CommonTree) astTree.tree).getChild(2).getText());
		//	System.out.println(((CommonTree) astTree.tree).getChild(2).getChildCount());
		//	buildSymTable((CommonTree) astTree.tree);
			generateIRCode((CommonTree) astTree.tree);
			printIRNodeList();
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
			tinyNodeList.add(new TinyNode("var", var, null));
		}
		
		tinyNodeList.add(new TinyNode("push", null, null));
		
		/// why do  both testcase.tiny outputs have these same four push commands???
		tinyNodeList.add(new TinyNode("push", "r0", null));
		tinyNodeList.add(new TinyNode("push", "r1", null));
		tinyNodeList.add(new TinyNode("push", "r2", null));
		tinyNodeList.add(new TinyNode("push", "r3", null));
		
		for(int i = 0; i < irNodeList.size(); i++) {
			TinyNode tNode = convertTiny(irNodeList.get(i));
			if(tNode != null) {
				tinyNodeList.add(tNode);
			}
		}
		tinyNodeList.add(new TinyNode("unlnk", null, null));
		tinyNodeList.add(new TinyNode("ret", null, null));
		tinyNodeList.add(new TinyNode("end", null, null));
	}
	
	public static TinyNode convertTiny(IRNode irNode) {
		String opcode = irNode.getOpcode();
		String oper1 = null;
		String oper2 = null;
		
		if(irNode.getOpcode().equals("LABEL")) {
			opcode = "label";
			oper1 = irNode.getOper1();
			tinyNodeList.add(new TinyNode("jsr", oper1, null));
			if(oper1.equals("main")) {
				tinyNodeList.add(new TinyNode("sys halt", null, null));
			}
			tinyNodeList.add(new TinyNode("label", oper1, null));
			tinyNodeList.add(new TinyNode("link", "0", null));
			return null;
		}
		else if(irNode.getOpcode().equals("WRITEI")) {
			opcode = "sys";
			oper1 = "writei";
			oper2 = irNode.getRes();
		}
		else if(irNode.getOpcode().equals("WRITEF")) {
			opcode = "sys";
			oper1 = "writer";
			oper2 = irNode.getRes();
		}
		else if(irNode.getOpcode().equals("READI")) {
			opcode = "sys";
			oper1 = "readi";
			oper2 = irNode.getRes();
		}
		else if(irNode.getOpcode().equals("READF")) {
			opcode = "sys";
			oper1 = "readf";
			oper2 = irNode.getRes();
		}
		else if(irNode.getOpcode().contains("STORE")) {
			opcode = "move";
			oper1 = irNode.getOper1();
			if(oper1.startsWith("$T")) {
               	oper1 = String.format("r%s", oper1.substring(2));
			}
			oper2 = irNode.getRes();
			if(oper2.startsWith("$T")) {
               	oper2 = String.format("r%s", oper2.substring(2));
			}
		}
		else if(irNode.getOpcode().contains("ADD")) {
			opcode = "move";
			tinyNodeList.add(new TinyNode(opcode, formatRegister(irNode.getOper1()), formatRegister(irNode.getRes())));
			if(irNode.getOpcode().charAt(irNode.getOpcode().length()-1) == 'I') {
				opcode = "addi";
			}
			else {
				opcode = "addr";
			}
			tinyNodeList.add(new TinyNode(opcode, formatRegister(irNode.getOper2()), formatRegister(irNode.getRes())));	
			return null;
		}

		else if(irNode.getOpcode().contains("SUB")) {
			opcode = "move";
			tinyNodeList.add(new TinyNode(opcode, formatRegister(irNode.getOper1()), formatRegister(irNode.getRes())));
			if(irNode.getOpcode().charAt(irNode.getOpcode().length()-1) == 'I') {
				opcode = "subi";
			}
			else {
				opcode = "subr";
			}
			tinyNodeList.add(new TinyNode(opcode, formatRegister(irNode.getOper2()), formatRegister(irNode.getRes())));	
			return null;
		}
		else if(irNode.getOpcode().contains("MULT")) {
			opcode = "move";
			tinyNodeList.add(new TinyNode(opcode, formatRegister(irNode.getOper1()), formatRegister(irNode.getRes())));
			if(irNode.getOpcode().charAt(irNode.getOpcode().length()-1) == 'I') {
				opcode = "muli";
			}
			else {
				opcode = "mulr";
			}
			tinyNodeList.add(new TinyNode(opcode, formatRegister(irNode.getOper2()), formatRegister(irNode.getRes())));	
			return null;
		}
		else if(irNode.getOpcode().contains("DIV")) {
			opcode = "move";
			tinyNodeList.add(new TinyNode(opcode, formatRegister(irNode.getOper1()), formatRegister(irNode.getRes())));
			if(irNode.getOpcode().charAt(irNode.getOpcode().length()-1) == 'I') {
				opcode = "divi";
			}
			else {
				opcode = "divr";
			}
			tinyNodeList.add(new TinyNode(opcode, formatRegister(irNode.getOper2()), formatRegister(irNode.getRes())));	
			return null;
		}
		return new TinyNode(opcode, oper1, oper2);
	}
	
	public static String formatRegister(String reg) {
		if(reg.startsWith("$T")) {
           	return String.format("r%s", reg.substring(2));
		}
		return reg;
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
        	    	generateIRCode(treeNode);
        	    	
        	    }
        	    if(treeNode.getText().equals("main")) {
        	    	//System.out.println("LABELLLL");
        	    	irNodeList.add(new IRNode("LABEL", treeNode.getText(), null, null));
        	    }
        	    if(treeNode.getText().equals(":=")) {
        	    	if(treeNode.getChildCount() == 2) {
        	    		// ASSIGN a := 10; etc
        	    		//System.out.println(treeNode.getChild(0).getText());
        	    		//System.out.println(treeNode.getChild(1).getText());
        	    		if((treeNode.getChild(0).getChildCount() == 0) && (treeNode.getChild(1).getChildCount() == 0)) { // check if this is a single assignment a:=20 etc
        	    			String varType1 = globalSymbolTable.findSymbolInSymbolTable(treeNode.getChild(0).getText());
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
        	    		else {//if((treeNode.getChild(0).getChildCount() == 2) && (treeNode.getChild(1).getChildCount() == 2)) {
        	    			POTraversal((CommonTree)treeNode.getChild(1));
        	    			if(instruction.charAt(instruction.length()-1) == 'I') {
        	    				instruction = "STOREI";
        	    			}
        	    			else {
        	    				instruction = "STOREF";
        	    			}
        	    			irNodeList.add(new IRNode(instruction, regStack.pop(), null, treeNode.getChild(0).getText()));
        	    			
        	    			//irNodeList.add(new IRNode("TEMPINSTRUCTION", null, null, null));
        	    		}
        	    	}
        	    }
        	    if(treeNode.getText().equals("WRITE")) {
        	    	String varType1 = globalSymbolTable.findSymbolInSymbolTable(treeNode.getChild(0).getText());
        	    	if(varType1.equals("INT")) {
        	    		instruction = "WRITEI";
        	    	}
        	    	else if(varType1.equals("FLOAT")) {
        	    		instruction = "WRITEF";
        	    	}
        	    	irNodeList.add(new IRNode(instruction, null, null, treeNode.getChild(0).getText()));
        	    }
        	    if(treeNode.getText().equals("READ")) {
        	    	String varType1 = globalSymbolTable.findSymbolInSymbolTable(treeNode.getChild(0).getText());
        	    	if(varType1.equals("INT")) {
        	    		instruction = "READI";
        	    	}
        	    	else if(varType1.equals("FLOAT")) {
        	    		instruction = "READF";
        	    	}
        	    	irNodeList.add(new IRNode(instruction, null, null, treeNode.getChild(0).getText()));
        	    }
        	    
         }
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
		 else if(tree.getText().equals("*")) {
			 //System.out.println("MUL");
			 if((leftChild.getType() == MicroParserParser.IDENTIFIER) && (rightChild.getType() == MicroParserParser.IDENTIFIER)) {
				 //System.out.println(leftChild.getText() + rightChild.getText());
				 setInstruction(tree, 0);
				 irNodeList.add(new IRNode(instruction, leftChild.getText(), rightChild.getText(), getRegister()));
			 }
			 else if ((leftChild.getType() == MicroParserParser.IDENTIFIER) && (rightChild.getType() != MicroParserParser.IDENTIFIER)) {
				 //System.out.println("IN" + leftChild.getText() + rightChild.getText());
				 setInstruction(tree, 1);
				 irNodeList.add(new IRNode(instruction, leftChild.getText(), regStack.pop(), getRegister()));
			 }
			 else if ((leftChild.getType() != MicroParserParser.IDENTIFIER) && (rightChild.getType() == MicroParserParser.IDENTIFIER)) {
				 //System.out.println("NI" + leftChild.getText() + rightChild.getText());
				 setInstruction(tree, 2);
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
					varType1 = globalSymbolTable.findSymbolInSymbolTable(tree.getChild(0).getText());
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
					varType1 = globalSymbolTable.findSymbolInSymbolTable(tree.getChild(1).getText());
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
		
	 public static void updateGlobalSymbolTable(SymbolTableObject sto) {
		 globalSymbolTable = sto;
	 }
	 
	 public static void printSymbolTable() {
		globalSymbolTable.printAllSymbolObjectsInSymbolTable();
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
	 }
	 
	 public static void printTinyCode() {
		 for(int i = 0; i < tinyNodeList.size(); i++) {
			 tinyNodeList.get(i).printNode();
		 }
	 }
}

