package fire.llvm;

public class IRBuilderBase extends PointerWrapper {
	protected IRBuilderBase(long pointerAddress) {
		super(pointerAddress);
	}
	
	public native void setInsertPoint(BasicBlock theBB);
	public native IntegerType getInt8Ty();
	public native IntegerType getInt32Ty();
	public native Type getVoidTy();
}