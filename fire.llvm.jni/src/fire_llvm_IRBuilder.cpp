#include <fire_llvm_IRBuilder.h>
#include <llvm/IR/IRBuilder.h>
#include "FireUtil.h"

//Java method: private static native long newIRBuilder(LLVMContext c);
JNIEXPORT jlong JNICALL Java_fire_llvm_IRBuilder_newIRBuilder(JNIEnv *env, jclass cls, jobject c) {
	return (jlong)new llvm::IRBuilder<>(*toNative<llvm::LLVMContext>(env, c));
}

//Java method: public native void delete();
JNIEXPORT void JNICALL Java_fire_llvm_IRBuilder_delete(JNIEnv *env, jobject obj) {
	delete toNative<llvm::IRBuilder<>>(env, obj);
}

//Java method: public native ReturnInst createRetVoid();
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createRetVoid(JNIEnv *env, jobject obj) {
	return toJava(env, "fire/llvm/ReturnInst", toNative<llvm::IRBuilder<>>(env, obj)->CreateRetVoid());
}

//Java method: public native BranchInst createBr(BasicBlock dest);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createBr(JNIEnv *env, jobject obj, jobject dest) {
	llvm::BasicBlock *destNative = toNative<llvm::BasicBlock>(env, dest);
	return toJava(env, "fire/llvm/BranchInst", toNative<llvm::IRBuilder<>>(env, obj)->CreateBr(destNative));
}

//Java method: public native BranchInst createCondBr(Value cond, BasicBlock trueBlock, BasicBlock falseBlock);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createCondBr(JNIEnv *env, jobject obj, jobject cond, jobject trueBlock, jobject falseBlock) {
	llvm::Value *condNative = toNative<llvm::Value>(env, cond);
	llvm::BasicBlock *trueBlockNative = toNative<llvm::BasicBlock>(env, trueBlock);
	llvm::BasicBlock *falseBlockNative = toNative<llvm::BasicBlock>(env, falseBlock);
	return toJava(env, "fire/llvm/BranchInst", toNative<llvm::IRBuilder<>>(env, obj)->CreateCondBr(condNative, trueBlockNative, falseBlockNative));
}

//Java method: public native UnreachableInst createUnreachable();
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createUnreachable(JNIEnv *env, jobject obj) {
	return toJava(env, "fire/llvm/UnreachableInst", toNative<llvm::IRBuilder<>>(env, obj)->CreateUnreachable());
}

//Java method: public native Value createAdd(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createAdd(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateAdd(lhsNative, rhsNative));
}

//Java method: public native Value createFAdd(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createFAdd(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateFAdd(lhsNative, rhsNative));
}

//Java method: public native Value createSub(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createSub(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateSub(lhsNative, rhsNative));
}

//Java method: public native Value createFSub(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createFSub(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateFSub(lhsNative, rhsNative));
}

//Java method: public native Value createMul(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createMul(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateMul(lhsNative, rhsNative));
}

//Java method: public native Value createFMul(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createFMul(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateFMul(lhsNative, rhsNative));
}

//Java method: public native Value createSDiv(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createSDiv(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateSDiv(lhsNative, rhsNative));
}

//Java method: public native Value createFDiv(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createFDiv(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateFDiv(lhsNative, rhsNative));
}

//Java method: public native Value createSRem(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createSRem(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateSRem(lhsNative, rhsNative));
}

//Java method: public native Value createXor(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createXor(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateXor(lhsNative, rhsNative));
}

//Java method: public native Value createNeg(Value v);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createNeg(JNIEnv *env, jobject obj, jobject v) {
	llvm::Value *vNative = toNative<llvm::Value>(env, v);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateNeg(vNative));
}

//Java method: public native Value createFNeg(Value v);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createFNeg(JNIEnv *env, jobject obj, jobject v) {
	llvm::Value *vNative = toNative<llvm::Value>(env, v);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateFNeg(vNative));
}

//Java method: public native Value createNot(Value v);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createNot(JNIEnv *env, jobject obj, jobject v) {
	llvm::Value *vNative = toNative<llvm::Value>(env, v);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateNot(vNative));
}

//Java method: public native LoadInst createLoad(Value ptr);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createLoad(JNIEnv *env, jobject obj, jobject ptr) {
	llvm::Value *ptrNative = toNative<llvm::Value>(env, ptr);
	return toJava(env, "fire/llvm/LoadInst", toNative<llvm::IRBuilder<>>(env, obj)->CreateLoad(ptrNative));
}

//Java method: public native StoreInst createStore(Value val, Value ptr);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createStore(JNIEnv *env, jobject obj, jobject val, jobject ptr) {
	llvm::Value *valNative = toNative<llvm::Value>(env, val);
	llvm::Value *ptrNative = toNative<llvm::Value>(env, ptr);
	return toJava(env, "fire/llvm/StoreInst", toNative<llvm::IRBuilder<>>(env, obj)->CreateStore(valNative, ptrNative));
}

//Java method: public native Value createGlobalStringPtr(String str);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createGlobalStringPtr(JNIEnv *env, jobject obj, jstring str) {
	const char *strNative = env->GetStringUTFChars(str, nullptr);
	llvm::Value *value = toNative<llvm::IRBuilder<>>(env, obj)->CreateGlobalStringPtr(strNative);
	env->ReleaseStringUTFChars(str, strNative);
	return toJava(env, "fire/llvm/Value", value);
}

//Java method: public native Value createICmpEQ(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createICmpEQ(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateICmpEQ(lhsNative, rhsNative));
}

//Java method: public native Value createICmpNE(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createICmpNE(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateICmpNE(lhsNative, rhsNative));
}

//Java method: public native Value createICmpSGT(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createICmpSGT(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateICmpSGT(lhsNative, rhsNative));
}

//Java method: public native Value createICmpSGE(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createICmpSGE(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateICmpSGE(lhsNative, rhsNative));
}

//Java method: public native Value createICmpSLT(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createICmpSLT(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateICmpSLT(lhsNative, rhsNative));
}

//Java method: public native Value createICmpSLE(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createICmpSLE(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateICmpSLE(lhsNative, rhsNative));
}

//Java method: public native Value createFCmpUEQ(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createFCmpUEQ(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateFCmpUEQ(lhsNative, rhsNative));
}

//Java method: public native Value createFCmpUGT(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createFCmpUGT(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateFCmpUGT(lhsNative, rhsNative));
}

//Java method: public native Value createFCmpUGE(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createFCmpUGE(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateFCmpUGE(lhsNative, rhsNative));
}

//Java method: public native Value createFCmpULT(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createFCmpULT(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateFCmpULT(lhsNative, rhsNative));
}

//Java method: public native Value createFCmpULE(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createFCmpULE(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateFCmpULE(lhsNative, rhsNative));
}

//Java method: public native Value createFCmpUNE(Value lhs, Value rhs);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createFCmpUNE(JNIEnv *env, jobject obj, jobject lhs, jobject rhs) {
	llvm::Value *lhsNative = toNative<llvm::Value>(env, lhs);
	llvm::Value *rhsNative = toNative<llvm::Value>(env, rhs);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateFCmpUNE(lhsNative, rhsNative));
}
//Java method: public native PHINode createPHINative(Type ty, int numReservedValues);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createPHINative(JNIEnv *env, jobject obj, jobject ty, jint numReservedValues) {
	llvm::Type *tyNative = toNative<llvm::Type>(env, ty);
	return toJava(env, "fire/llvm/PHINode", toNative<llvm::IRBuilder<>>(env, obj)->CreatePHI(tyNative, numReservedValues));
}

//Java method: public native CallInst createCall(Function callee, Value[] args);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createCall(JNIEnv *env, jobject obj, jobject callee, jobjectArray args) {
	llvm::Function *calleeNative = toNative<llvm::Function>(env, callee);
	std::vector<llvm::Value*> argsNative = toVector<llvm::Value>(env, args);
	return toJava(env, "fire/llvm/CallInst", toNative<llvm::IRBuilder<>>(env, obj)->CreateCall(calleeNative, argsNative));
}

//Java method: public native Value createSelect(Value c, Value trueValue, Value falseValue);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createSelect(JNIEnv *env, jobject obj, jobject c, jobject trueValue, jobject falseValue) {
	llvm::Value *cNative = toNative<llvm::Value>(env, c);
	llvm::Value *trueValueNative = toNative<llvm::Value>(env, trueValue);
	llvm::Value *falseValueNative = toNative<llvm::Value>(env, falseValue);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateSelect(cNative, trueValueNative, falseValueNative));
}

//Java method: public native Value createExtractValue(Value agg, int idx);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createExtractValue(JNIEnv *env, jobject obj, jobject agg, jint idx) {
	llvm::Value *aggNative = toNative<llvm::Value>(env, agg);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateExtractValue(aggNative, idx));
}

//Java method: public native AllocaInst createEntryBlockAlloca(Type ty);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createEntryBlockAlloca(JNIEnv *env, jobject obj, jobject ty) {
	llvm::Type *tyNative = toNative<llvm::Type>(env, ty);
	llvm::BasicBlock &entryBlock = toNative<llvm::IRBuilder<>>(env, obj)->GetInsertBlock()->getParent()->getEntryBlock();
	return toJava(env, "fire/llvm/AllocaInst", llvm::IRBuilder<>(&entryBlock, entryBlock.begin()).CreateAlloca(tyNative));
}
