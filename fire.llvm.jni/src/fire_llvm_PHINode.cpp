#include <fire_llvm_PHINode.h>
#include <llvm/IR/Instructions.h>
#include "FireUtil.h"

//Java method: public native void addIncoming(Value v, BasicBlock bb);
JNIEXPORT void JNICALL Java_fire_llvm_PHINode_addIncoming(JNIEnv *env, jobject obj, jobject v, jobject bb) {
	llvm::Value *vNative = toNative<llvm::Value>(env, v);
	llvm::BasicBlock *bbNative = toNative<llvm::BasicBlock>(env, bb);
	toNative<llvm::PHINode>(env, obj)->addIncoming(vNative, bbNative);
}
