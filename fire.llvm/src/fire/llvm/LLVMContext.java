package fire.llvm;

public class LLVMContext {
	static {
		System.loadLibrary("fireLLVM");
	}
	
	private final long pointerAddress;
	
	public LLVMContext() {
		pointerAddress = newLLVMContext();
	}
	
	public native void delete();
	
	private static native long newLLVMContext();
}