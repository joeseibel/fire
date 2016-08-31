package fire.llvm;

public class BasicBlock extends Value {
	private BasicBlock(long pointerAddress) {
		super(pointerAddress);
	}
	
	public static native BasicBlock create(LLVMContext context, String name, Function parent);
}