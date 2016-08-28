#include "llvm/IR/LLVMContext.h"
#include "fire_llvm_LLVMContext.h"

JNIEXPORT jlong JNICALL Java_fire_llvm_LLVMContext_newLLVMContext(JNIEnv *env, jclass cls) {
	llvm::LLVMContext *context = new llvm::LLVMContext();
	return (jlong)context;
}

JNIEXPORT void JNICALL Java_fire_llvm_LLVMContext_delete(JNIEnv *env, jobject obj) {
	jlong pointerAddress = env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
	llvm::LLVMContext *context = (llvm::LLVMContext*)pointerAddress;
	delete context;
}
