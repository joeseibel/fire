#include "llvm/IR/DerivedTypes.h"

#include <vector>

#include "fire_llvm_FunctionType.h"

JNIEXPORT jobject JNICALL Java_fire_llvm_FunctionType_get__Lfire_llvm_Type_2_3Lfire_llvm_Type_2Z(JNIEnv *env, jclass cls, jobject result, jobjectArray params, jboolean isVarArg) {
	jlong resultPointerAddress = env->GetLongField(result, env->GetFieldID(env->GetObjectClass(result), "pointerAddress", "J"));
	llvm::Type *resultType = (llvm::Type*)resultPointerAddress;

	std::vector<llvm::Type*> paramsVector;
	jsize paramsSize = env->GetArrayLength(params);
	for (jsize i = 0; i < paramsSize; i++) {
		jobject obj = env->GetObjectArrayElement(params, i);
		jlong pointerAddress = env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
		llvm::Type *param = (llvm::Type*)pointerAddress;
		paramsVector.push_back(param);
	}

	llvm::FunctionType *functionType = llvm::FunctionType::get(resultType, paramsVector, isVarArg);
	jclass functionTypeClass = env->FindClass("fire/llvm/FunctionType");
	jmethodID constructorId = env->GetMethodID(functionTypeClass, "<init>", "(J)V");
	return env->NewObject(functionTypeClass, constructorId, (jlong)functionType);
}

JNIEXPORT jobject JNICALL Java_fire_llvm_FunctionType_get__Lfire_llvm_Type_2Z(JNIEnv *env, jclass cls, jobject result, jboolean isVarArg) {
	jlong resultPointerAddress = env->GetLongField(result, env->GetFieldID(env->GetObjectClass(result), "pointerAddress", "J"));
	llvm::Type *resultType = (llvm::Type*)resultPointerAddress;

	llvm::FunctionType *functionType = llvm::FunctionType::get(resultType, isVarArg);
	jclass functionTypeClass = env->FindClass("fire/llvm/FunctionType");
	jmethodID constructorId = env->GetMethodID(functionTypeClass, "<init>", "(J)V");
	return env->NewObject(functionTypeClass, constructorId, (jlong)functionType);
}
