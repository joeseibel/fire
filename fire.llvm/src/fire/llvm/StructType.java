package fire.llvm;

public class StructType extends Type {
	private StructType(long pointerAddress) {
		super(pointerAddress);
	}
	
	public static native StructType get(LLVMContext context, Type[] elements);
}