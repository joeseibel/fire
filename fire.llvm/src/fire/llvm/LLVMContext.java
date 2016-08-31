package fire.llvm;

public class LLVMContext extends PointerWrapper {
	public LLVMContext() {
		super(newLLVMContext());
	}
	
	private static native long newLLVMContext();
	
	public native void delete();
}