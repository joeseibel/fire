package fire.llvm;

public class ConstantFP extends Constant {
	private ConstantFP(long pointerAddress) {
		super(pointerAddress);
	}
	
	//Custom method which does not correspond directly to a method in the LLVM api.
	public static native ConstantFP get(LLVMContext context, double v);
}