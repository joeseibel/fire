package fire.llvm;

public class Function {
	static {
		System.loadLibrary("fireLLVM");
	}
	
	private final long pointerAddress;
	
	private Function(long pointerAddress) {
		this.pointerAddress = pointerAddress;
	}
	
	public static native Function create(FunctionType ty, LinkageTypes linkage, String n, Module m);
}