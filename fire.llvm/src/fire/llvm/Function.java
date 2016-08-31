package fire.llvm;

public class Function extends Value {
	private Function(long pointerAddress) {
		super(pointerAddress);
	}
	
	public static native Function create(FunctionType ty, LinkageTypes linkage, String n, Module m);
}