#include <fire_llvm_IRBuilderBase.h>
#include <llvm/IR/IRBuilder.h>
#include "FireUtil.h"

//Java method: public native BasicBlock getInsertBlock();
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilderBase_getInsertBlock(JNIEnv *env, jobject obj) {
	return toJava(env, "fire/llvm/BasicBlock", toNative<llvm::IRBuilderBase>(env, obj)->GetInsertBlock());
}

//Java method: public native void setInsertPoint(BasicBlock theBB);
JNIEXPORT void JNICALL Java_fire_llvm_IRBuilderBase_setInsertPoint(JNIEnv *env, jobject obj, jobject theBB) {
	toNative<llvm::IRBuilderBase>(env, obj)->SetInsertPoint(toNative<llvm::BasicBlock>(env, theBB));
}

//Java method: public native ConstantInt getTrue();
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilderBase_getTrue(JNIEnv *env, jobject obj) {
	return toJava(env, "fire/llvm/ConstantInt", toNative<llvm::IRBuilderBase>(env, obj)->getTrue());
}

//Java method: public native ConstantInt getFalse();
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilderBase_getFalse(JNIEnv *env, jobject obj) {
	return toJava(env, "fire/llvm/ConstantInt", toNative<llvm::IRBuilderBase>(env, obj)->getFalse());
}

//Java method: public native ConstantInt getInt32(int c);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilderBase_getInt32(JNIEnv *env, jobject obj, jint c) {
	return toJava(env, "fire/llvm/ConstantInt", toNative<llvm::IRBuilderBase>(env, obj)->getInt32(c));
}

//Java method: public native ConstantInt getInt64(long c);
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilderBase_getInt64(JNIEnv *env, jobject obj, jlong c) {
	return toJava(env, "fire/llvm/ConstantInt", toNative<llvm::IRBuilderBase>(env, obj)->getInt64(c));
}

//Java method: public native IntegerType getInt1Ty();
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilderBase_getInt1Ty(JNIEnv *env, jobject obj) {
	return toJava(env, "fire/llvm/IntegerType", toNative<llvm::IRBuilderBase>(env, obj)->getInt1Ty());
}

//Java method: public native IntegerType getInt8Ty();
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilderBase_getInt8Ty(JNIEnv *env, jobject obj) {
	return toJava(env, "fire/llvm/IntegerType", toNative<llvm::IRBuilderBase>(env, obj)->getInt8Ty());
}

//Java method: public native IntegerType getInt32Ty();
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilderBase_getInt32Ty(JNIEnv *env, jobject obj) {
	return toJava(env, "fire/llvm/IntegerType", toNative<llvm::IRBuilderBase>(env, obj)->getInt32Ty());
}

//Java method: public native Type getVoidTy();
JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilderBase_getVoidTy(JNIEnv *env, jobject obj) {
	return toJava(env, "fire/llvm/Type", toNative<llvm::IRBuilderBase>(env, obj)->getVoidTy());
}
