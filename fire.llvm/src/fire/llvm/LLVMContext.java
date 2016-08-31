package fire.llvm;

public class LLVMContext extends PointerWrapper {
	public LLVMContext() {
		super(newLLVMContext());
	}
	
	public native void delete();
	
	private static native long newLLVMContext();
}