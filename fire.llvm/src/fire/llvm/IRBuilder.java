package fire.llvm;

public class IRBuilder extends IRBuilderBase {
	public IRBuilder(LLVMContext c) {
		super(newIRBuilder(c));
	}
	
	private static native long newIRBuilder(LLVMContext c);
	
	public native void delete();
	public native ReturnInst createRetVoid();
	public native Value createGlobalStringPtr(String str);
	public native CallInst createCall(Function callee, Value[] args);
}