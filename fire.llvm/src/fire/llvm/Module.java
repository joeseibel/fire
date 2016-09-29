package fire.llvm;

public class Module extends PointerWrapper {
	public Module(String moduleId, LLVMContext c) {
		super(newModule(moduleId, c));
	}
	
	private static native long newModule(String moduleId, LLVMContext c);
	
	public native void delete();
	public native Function getFunction(String name);
	public native void dump();
	
	//Custom method which does not correspond directly to a method in the LLVM api.
	public native byte[] emitToByteBuffer();
}