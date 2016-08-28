#include "fire_llvm_LLVMContext.h"
#include <iostream>

JNIEXPORT void JNICALL Java_fire_llvm_LLVMContext_delete(JNIEnv *env, jobject obj) {
	std::cout << "In JNI Delete" << std::endl;
}


JNIEXPORT jlong JNICALL Java_fire_llvm_LLVMContext_newLLVMContext(JNIEnv *env, jclass cls) {
	std::cout << "In JNI NEW LLVMContext" << std::endl;
	return 0;
}
