#include "fire_llvm_BasicBlock.h"

#include "llvm/IR/BasicBlock.h"

JNIEXPORT jobject JNICALL Java_fire_llvm_BasicBlock_create(JNIEnv *env, jclass cls, jobject context, jstring name, jobject parent) {
	llvm::LLVMContext *llvmContext = (llvm::LLVMContext*)env->GetLongField(context, env->GetFieldID(env->GetObjectClass(context), "pointerAddress", "J"));
	const char *basicBlockName = env->GetStringUTFChars(name, NULL);
	llvm::Function *function = (llvm::Function*)env->GetLongField(parent, env->GetFieldID(env->GetObjectClass(parent), "pointerAddress", "J"));

	llvm::BasicBlock *basicBlock = llvm::BasicBlock::Create(*llvmContext, basicBlockName, function);

	env->ReleaseStringUTFChars(name, basicBlockName);

	jmethodID constructorId = env->GetMethodID(cls, "<init>", "(J)V");
	return env->NewObject(cls, constructorId, (jlong)basicBlock);
}
