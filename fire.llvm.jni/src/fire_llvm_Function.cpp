#include <fire_llvm_Function.h>
#include <llvm/IR/Function.h>
#include "FireUtil.h"

//Java method: public static native Function create(FunctionType ty, LinkageTypes linkage, String n, Module m);
JNIEXPORT jobject JNICALL Java_fire_llvm_Function_create(JNIEnv *env, jclass cls, jobject ty, jobject linkage, jstring n, jobject m) {
	llvm::FunctionType *tyNative = toNative<llvm::FunctionType>(env, ty);
	llvm::GlobalValue::LinkageTypes linkageNative = convertLinkageTypes(env, linkage);
	const char *nNative = env->GetStringUTFChars(n, NULL);
	llvm::Module *mNative = toNative<llvm::Module>(env, m);
	llvm::Function *function = llvm::Function::Create(tyNative, linkageNative, nNative, mNative);
	env->ReleaseStringUTFChars(n, nNative);
	return toJava(env, cls, function);
}
