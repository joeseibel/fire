#include <fire_llvm_BasicBlock.h>
#include <llvm/IR/BasicBlock.h>
#include "FireUtil.h"

//Java method: public static native BasicBlock create(LLVMContext context, String name, Function parent);
JNIEXPORT jobject JNICALL Java_fire_llvm_BasicBlock_create(JNIEnv *env, jclass cls, jobject context, jstring name, jobject parent) {
	llvm::LLVMContext *contextNative = toNative<llvm::LLVMContext>(env, context);
	const char *nameNative = env->GetStringUTFChars(name, NULL);
	llvm::Function *parentNative = toNative<llvm::Function>(env, parent);
	llvm::BasicBlock *basicBlock = llvm::BasicBlock::Create(*contextNative, nameNative, parentNative);
	env->ReleaseStringUTFChars(name, nameNative);
	return toJava(env, cls, basicBlock);
}
