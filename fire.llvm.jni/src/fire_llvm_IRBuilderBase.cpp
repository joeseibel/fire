#include "fire_llvm_IRBuilderBase.h"
#include "llvm/IR/IRBuilder.h"

JNIEXPORT void JNICALL Java_fire_llvm_IRBuilderBase_setInsertPoint(JNIEnv *env, jobject obj, jobject theBB) {
	llvm::IRBuilder<> *builder = (llvm::IRBuilder<>*)env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
	llvm::BasicBlock *basicBlock = (llvm::BasicBlock*)env->GetLongField(theBB, env->GetFieldID(env->GetObjectClass(theBB), "pointerAddress", "J"));
	builder->SetInsertPoint(basicBlock);
}

JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilderBase_getInt8Ty(JNIEnv *env, jobject obj) {
	jlong pointerAddress = env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
	llvm::IRBuilder<> *builder = (llvm::IRBuilder<>*)pointerAddress;
	llvm::IntegerType *int8Type = builder->getInt8Ty();

	jclass integerTypeClass = env->FindClass("fire/llvm/IntegerType");
	jmethodID constructorId = env->GetMethodID(integerTypeClass, "<init>", "(J)V");
	return env->NewObject(integerTypeClass, constructorId, (jlong)int8Type);
}

JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilderBase_getInt32Ty(JNIEnv *env, jobject obj) {
	jlong pointerAddress = env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
	llvm::IRBuilder<> *builder = (llvm::IRBuilder<>*)pointerAddress;
	llvm::IntegerType *int32Type = builder->getInt32Ty();

	jclass integerTypeClass = env->FindClass("fire/llvm/IntegerType");
	jmethodID constructorId = env->GetMethodID(integerTypeClass, "<init>", "(J)V");
	return env->NewObject(integerTypeClass, constructorId, (jlong)int32Type);
}

JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilderBase_getVoidTy(JNIEnv *env, jobject obj) {
	jlong pointerAddress = env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
	llvm::IRBuilder<> *builder = (llvm::IRBuilder<>*)pointerAddress;
	llvm::Type *voidType = builder->getVoidTy();

	jclass typeClass = env->FindClass("fire/llvm/Type");
	jmethodID constructorId = env->GetMethodID(typeClass, "<init>", "(J)V");
	return env->NewObject(typeClass, constructorId, (jlong)voidType);
}
