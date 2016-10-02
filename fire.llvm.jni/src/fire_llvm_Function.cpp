#include <fire_llvm_Function.h>
#include <llvm/IR/Function.h>
#include "FireUtil.h"

//Java method: public static native Function create(FunctionType ty, LinkageTypes linkage, String n, Module m);
JNIEXPORT jobject JNICALL Java_fire_llvm_Function_create(JNIEnv *env, jclass cls, jobject ty, jobject linkage, jstring n, jobject m) {
	llvm::FunctionType *tyNative = toNative<llvm::FunctionType>(env, ty);
	llvm::GlobalValue::LinkageTypes linkageNative = convertLinkageTypes(env, linkage);
	const char *nNative = env->GetStringUTFChars(n, nullptr);
	llvm::Module *mNative = toNative<llvm::Module>(env, m);
	llvm::Function *function = llvm::Function::Create(tyNative, linkageNative, nNative, mNative);
	env->ReleaseStringUTFChars(n, nNative);
	return toJava(env, cls, function);
}

//Java method: public native void addBasicBlock(BasicBlock block);
JNIEXPORT void JNICALL Java_fire_llvm_Function_addBasicBlock(JNIEnv *env, jobject obj, jobject block) {
	llvm::BasicBlock *blockNative = toNative<llvm::BasicBlock>(env, block);
	toNative<llvm::Function>(env, obj)->getBasicBlockList().push_back(blockNative);
}
