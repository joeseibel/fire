#include <fire_llvm_BasicBlock.h>
#include <llvm/IR/BasicBlock.h>
#include "FireUtil.h"

//Java method: public native Function getParent();
JNIEXPORT jobject JNICALL Java_fire_llvm_BasicBlock_getParent(JNIEnv *env, jobject obj) {
	return toJava(env, "fire/llvm/Function", toNative<llvm::BasicBlock>(env, obj)->getParent());
}

//Java method: public static native BasicBlock create(LLVMContext context, String name, Function parent);
JNIEXPORT jobject JNICALL Java_fire_llvm_BasicBlock_create__Lfire_llvm_LLVMContext_2Ljava_lang_String_2Lfire_llvm_Function_2(JNIEnv *env, jclass cls, jobject context, jstring name, jobject parent) {
	llvm::LLVMContext *contextNative = toNative<llvm::LLVMContext>(env, context);
	const char *nameNative = env->GetStringUTFChars(name, nullptr);
	llvm::Function *parentNative = toNative<llvm::Function>(env, parent);
	llvm::BasicBlock *basicBlock = llvm::BasicBlock::Create(*contextNative, nameNative, parentNative);
	env->ReleaseStringUTFChars(name, nameNative);
	return toJava(env, cls, basicBlock);
}

//Java method: public static native BasicBlock create(LLVMContext context, String name);
JNIEXPORT jobject JNICALL Java_fire_llvm_BasicBlock_create__Lfire_llvm_LLVMContext_2Ljava_lang_String_2(JNIEnv *env, jclass cls, jobject context, jstring name) {
	llvm::LLVMContext *contextNative = toNative<llvm::LLVMContext>(env, context);
	const char *nameNative = env->GetStringUTFChars(name, nullptr);
	llvm::BasicBlock *basicBlock = llvm::BasicBlock::Create(*contextNative, nameNative);
	env->ReleaseStringUTFChars(name, nameNative);
	return toJava(env, cls, basicBlock);
}
