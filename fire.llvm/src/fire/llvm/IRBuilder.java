package fire.llvm;

public class IRBuilder extends IRBuilderBase {
	public IRBuilder(LLVMContext c) {
		super(newIRBuilder(c));
	}
	
	private static native long newIRBuilder(LLVMContext c);
	
	public native void delete();
	public native ReturnInst createRetVoid();
	public native BranchInst createBr(BasicBlock dest);
	public native BranchInst createCondBr(Value cond, BasicBlock trueBlock, BasicBlock falseBlock);
	public native UnreachableInst createUnreachable();
	public native Value createAdd(Value lhs, Value rhs);
	public native Value createFAdd(Value lhs, Value rhs);
	public native Value createSub(Value lhs, Value rhs);
	public native Value createFSub(Value lhs, Value rhs);
	public native Value createMul(Value lhs, Value rhs);
	public native Value createFMul(Value lhs, Value rhs);
	public native Value createSDiv(Value lhs, Value rhs);
	public native Value createFDiv(Value lhs, Value rhs);
	public native Value createSRem(Value lhs, Value rhs);
	public native Value createXor(Value lhs, Value rhs);
	public native Value createNeg(Value v);
	public native Value createFNeg(Value v);
	public native Value createNot(Value v);
	public native LoadInst createLoad(Value ptr);
	public native StoreInst createStore(Value val, Value ptr);
	public native Value createGlobalStringPtr(String str);
	public native Value createICmpEQ(Value lhs, Value rhs);
	public native Value createICmpNE(Value lhs, Value rhs);
	public native Value createICmpSGT(Value lhs, Value rhs);
	public native Value createICmpSGE(Value lhs, Value rhs);
	public native Value createICmpSLT(Value lhs, Value rhs);
	public native Value createICmpSLE(Value lhs, Value rhs);
	public native Value createFCmpUEQ(Value lhs, Value rhs);
	public native Value createFCmpUGT(Value lhs, Value rhs);
	public native Value createFCmpUGE(Value lhs, Value rhs);
	public native Value createFCmpULT(Value lhs, Value rhs);
	public native Value createFCmpULE(Value lhs, Value rhs);
	public native Value createFCmpUNE(Value lhs, Value rhs);
	
	public PHINode createPHI(Type ty, int numReservedValues) {
		if (numReservedValues < 0) {
			throw new IllegalArgumentException("numReservedValues cannot be negative");
		}
		return createPHINative(ty, numReservedValues);
	}
	
	private native PHINode createPHINative(Type ty, int numReservedValues);
	public native CallInst createCall(Function callee, Value[] args);
	public native Value createSelect(Value c, Value trueValue, Value falseValue);
	public native Value createExtractValue(Value agg, int idx);
	
	//Custom method which does not correspond directly to a method in the LLVM api.
	public native AllocaInst createEntryBlockAlloca(Type ty);
}