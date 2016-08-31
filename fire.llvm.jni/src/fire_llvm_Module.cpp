#include "llvm/IR/Module.h"

#include "fire_llvm_Module.h"

JNIEXPORT jlong JNICALL Java_fire_llvm_Module_newModule(JNIEnv *env, jclass cls, jstring moduleId, jobject c) {
	const char *moduleIdCString = env->GetStringUTFChars(moduleId, NULL);
	jlong cPointerAddress = env->GetLongField(c, env->GetFieldID(env->GetObjectClass(c), "pointerAddress", "J"));
	llvm::LLVMContext *context = (llvm::LLVMContext*)cPointerAddress;
	llvm::Module *module = new llvm::Module(moduleIdCString, *context);
	env->ReleaseStringUTFChars(moduleId, moduleIdCString);
	return (jlong)module;
}

JNIEXPORT void JNICALL Java_fire_llvm_Module_delete(JNIEnv *env, jobject obj) {
	jlong pointerAddress = env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
	llvm::Module *module = (llvm::Module*)pointerAddress;
	delete module;
}

JNIEXPORT void JNICALL Java_fire_llvm_Module_dump(JNIEnv *env, jobject obj) {
	jlong pointerAddress = env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
	llvm::Module *module = (llvm::Module*)pointerAddress;
	module->dump();
}
