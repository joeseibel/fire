package fire.llvm;

public class Module extends PointerWrapper {
	public Module(String moduleId, LLVMContext c) {
		super(newModule(moduleId, c));
	}
	
	private static native long newModule(String moduleId, LLVMContext c);
	
	public native void delete();
	public native void dump();
}