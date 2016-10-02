package fire.llvm;

public class BasicBlock extends Value {
	private BasicBlock(long pointerAddress) {
		super(pointerAddress);
	}
	
	public native Function getParent();
	
	public static native BasicBlock create(LLVMContext context, String name, Function parent);
	public static native BasicBlock create(LLVMContext context, String name);
}