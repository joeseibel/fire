#include <fire_llvm_StructType.h>
#include <llvm/IR/DerivedTypes.h>
#include "FireUtil.h"

//Java method: public static native StructType get(LLVMContext context, Type[] elements);
JNIEXPORT jobject JNICALL Java_fire_llvm_StructType_get(JNIEnv *env, jclass cls, jobject context, jobjectArray elements) {
	llvm::LLVMContext *contextNative = toNative<llvm::LLVMContext>(env, context);
	std::vector<llvm::Type*> elementsNative = toVector<llvm::Type>(env, elements);
	return toJava(env, cls, llvm::StructType::get(*contextNative, elementsNative));
}
