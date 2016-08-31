#include <fire_llvm_LLVMContext.h>
#include <llvm/IR/LLVMContext.h>
#include "FireUtil.h"

//Java method: private static native long newLLVMContext();
JNIEXPORT jlong JNICALL Java_fire_llvm_LLVMContext_newLLVMContext(JNIEnv *env, jclass cls) {
	return (jlong)new llvm::LLVMContext;
}

//Java method: public native void delete();
JNIEXPORT void JNICALL Java_fire_llvm_LLVMContext_delete(JNIEnv *env, jobject obj) {
	delete toNative<llvm::LLVMContext>(env, obj);
}
