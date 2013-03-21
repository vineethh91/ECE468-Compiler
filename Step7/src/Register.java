
public class Register {
		public String registerName;
		public String variableInRegister;
		public boolean registerDirty;
		
		Register(String name) {
			registerName = name;
			variableInRegister = null;
			registerDirty = false;
		}
}
