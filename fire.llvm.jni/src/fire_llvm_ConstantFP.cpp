#include <fire_llvm_ConstantFP.h>
#include <llvm/IR/Constants.h>
#include "FireUtil.h"

//Java method: public static native ConstantFP get(LLVMContext context, double v);
JNIEXPORT jobject JNICALL Java_fire_llvm_ConstantFP_get(JNIEnv *env, jclass cls, jobject context, jdouble v) {
	llvm::LLVMContext *contextNative = toNative<llvm::LLVMContext>(env, context);
	return toJava(env, cls, llvm::ConstantFP::get(*contextNative, llvm::APFloat(v)));
}
