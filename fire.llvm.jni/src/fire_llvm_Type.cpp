#include "llvm/IR/Type.h"

#include "fire_llvm_Type.H"

JNIEXPORT jobject JNICALL Java_fire_llvm_Type_getPointerTo(JNIEnv *env, jobject obj) {
	jlong pointerAddress = env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
	llvm::Type *type = (llvm::Type*)pointerAddress;
	llvm::PointerType *pointerType = type->getPointerTo();

	jclass pointerTypeClass = env->FindClass("fire/llvm/PointerType");
	jmethodID constructorId = env->GetMethodID(pointerTypeClass, "<init>", "(J)V");
	return env->NewObject(pointerTypeClass, constructorId, (jlong)pointerType);
}
