package fire.llvm;

public class FunctionType extends Type {
	private FunctionType(long pointerAddress) {
		super(pointerAddress);
	}
	
	public static native FunctionType get(Type result, Type[] params, boolean isVarArg);
	public static native FunctionType get(Type result, boolean isVarArg);
}