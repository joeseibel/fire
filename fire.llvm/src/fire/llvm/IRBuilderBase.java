package fire.llvm;

public class IRBuilderBase extends PointerWrapper {
	protected IRBuilderBase(long pointerAddress) {
		super(pointerAddress);
	}
	
	public native BasicBlock getInsertBlock();
	public native void setInsertPoint(BasicBlock theBB);
	public native ConstantInt getTrue();
	public native ConstantInt getFalse();
	public native ConstantInt getInt64(long c);
	public native IntegerType getInt1Ty();
	public native IntegerType getInt8Ty();
	public native IntegerType getInt32Ty();
	public native Type getVoidTy();
}