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

//Java method: public native Value createNot(Value v);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createNot(JNIEnv *env, jobject obj, jobject v) {
	llvm::Value *vNative = toNative<llvm::Value>(env, v);
	return toJava(env, "fire/llvm/Value", toNative<llvm::IRBuilder<>>(env, obj)->CreateNot(vNative));
}

//Java method: public native Value createGlobalStringPtr(String str);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createGlobalStringPtr(JNIEnv *env, jobject obj, jstring str) {
	const char *strNative = env->GetStringUTFChars(str, nullptr);
	llvm::Value *value = toNative<llvm::IRBuilder<>>(env, obj)->CreateGlobalStringPtr(strNative);
	env->ReleaseStringUTFChars(str, strNative);
	return toJava(env, "fire/llvm/Value", value);
}

//Java method: public native CallInst createCall(Function callee, Value[] args);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createCall(JNIEnv *env, jobject obj, jobject callee, jobjectArray args) {
	llvm::Function *calleeNative = toNative<llvm::Function>(env, callee);
	std::vector<llvm::Value*> argsNative = toVector<llvm::Value>(env, args);
	return toJava(env, "fire/llvm/CallInst", toNative<llvm::IRBuilder<>>(env, obj)->CreateCall(calleeNative, argsNative));
}
