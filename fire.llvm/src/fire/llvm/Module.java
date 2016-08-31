package fire.llvm;

public class Module {
	static {
		System.loadLibrary("fireLLVM");
	}
	
	private final long pointerAddress;
	
	public Module(String moduleId, LLVMContext c) {
		pointerAddress = newModule(moduleId, c);
	}
	
	private static native long newModule(String moduleId, LLVMContext c);
	
	public native void delete();
	public native void dump();
}