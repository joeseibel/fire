#include <fire_llvm_Type.h>
#include <llvm/IR/Type.h>
#include "FireUtil.h"

//Java method: public native PointerType getPointerTo();
JNIEXPORT jobject JNICALL Java_fire_llvm_Type_getPointerTo(JNIEnv *env, jobject obj) {
	return toJava(env, "fire/llvm/PointerType", toNative<llvm::Type>(env, obj)->getPointerTo());
}
