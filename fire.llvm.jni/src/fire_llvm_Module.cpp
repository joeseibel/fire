#include <fire_llvm_Module.h>
#include <llvm/IR/Module.h>
#include "FireUtil.h"

//Java method: private static native long newModule(String moduleId, LLVMContext c);
JNIEXPORT jlong JNICALL Java_fire_llvm_Module_newModule(JNIEnv *env, jclass cls, jstring moduleId, jobject c) {
	const char *moduleIdNative = env->GetStringUTFChars(moduleId, NULL);
	llvm::Module *module = new llvm::Module(moduleIdNative, *toNative<llvm::LLVMContext>(env, c));
	env->ReleaseStringUTFChars(moduleId, moduleIdNative);
	return (jlong)module;
}

//Java method: public native void delete();
JNIEXPORT void JNICALL Java_fire_llvm_Module_delete(JNIEnv *env, jobject obj) {
	delete toNative<llvm::Module>(env, obj);
}

//Java method: public native void dump();
JNIEXPORT void JNICALL Java_fire_llvm_Module_dump(JNIEnv *env, jobject obj) {
	toNative<llvm::Module>(env, obj)->dump();
}
