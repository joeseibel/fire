#include <fire_llvm_FunctionType.h>
#include <llvm/IR/DerivedTypes.h>
#include "FireUtil.h"

//Java method: public static native FunctionType get(Type result, Type[] params, boolean isVarArg);
JNIEXPORT jobject JNICALL Java_fire_llvm_FunctionType_get__Lfire_llvm_Type_2_3Lfire_llvm_Type_2Z(JNIEnv *env, jclass cls, jobject result, jobjectArray params, jboolean isVarArg) {
	llvm::Type *resultNative = toNative<llvm::Type>(env, result);
	std::vector<llvm::Type*> paramsNative = toVector<llvm::Type>(env, params);
	return toJava(env, cls, llvm::FunctionType::get(resultNative, paramsNative, isVarArg));
}

//Java method: public static native FunctionType get(Type result, boolean isVarArg);
JNIEXPORT jobject JNICALL Java_fire_llvm_FunctionType_get__Lfire_llvm_Type_2Z(JNIEnv *env, jclass cls, jobject result, jboolean isVarArg) {
	return toJava(env, cls, llvm::FunctionType::get(toNative<llvm::Type>(env, result), isVarArg));
}
