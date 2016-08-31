package fire.llvm;

public class IRBuilder extends PointerWrapper {
	public IRBuilder(LLVMContext c) {
		super(newIRBuilder(c));
	}
	
	private static native long newIRBuilder(LLVMContext c);
	
	public native void delete();
	public native void setInsertPoint(BasicBlock theBB);
	public native IntegerType getInt8Ty();
	public native IntegerType getInt32Ty();
	public native Type getVoidTy();
	
	public native ReturnInst createRetVoid();
	public native Value createGlobalStringPtr(String str);
	public native CallInst createCall(Function callee, Value[] args);
}