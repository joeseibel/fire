package fire.llvm;

public class Function extends Constant {
	private Function(long pointerAddress) {
		super(pointerAddress);
	}
	
	public static native Function create(FunctionType ty, LinkageTypes linkage, String n, Module m);
	
	//Custom method which does not correspond directly to a method in the LLVM api.
	public native void addBasicBlock(BasicBlock block);
}