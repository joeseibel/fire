#include "llvm/IR/IRBuilder.h"

#include "fire_llvm_IRBuilder.h"

JNIEXPORT jlong JNICALL Java_fire_llvm_IRBuilder_newIRBuilder(JNIEnv *env, jclass cls, jobject c) {
	jlong cPointerAddress = env->GetLongField(c, env->GetFieldID(env->GetObjectClass(c), "pointerAddress", "J"));
	llvm::LLVMContext *context = (llvm::LLVMContext*)cPointerAddress;
	llvm::IRBuilder<> *builder = new llvm::IRBuilder<>(*context);
	return (jlong)builder;
}

JNIEXPORT void JNICALL Java_fire_llvm_IRBuilder_delete(JNIEnv *env, jobject obj) {
	jlong pointerAddress = env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
	llvm::IRBuilder<> *builder = (llvm::IRBuilder<>*)pointerAddress;
	delete builder;
}

JNIEXPORT void JNICALL Java_fire_llvm_IRBuilder_setInsertPoint(JNIEnv *env, jobject obj, jobject theBB) {
	llvm::IRBuilder<> *builder = (llvm::IRBuilder<>*)env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
	llvm::BasicBlock *basicBlock = (llvm::BasicBlock*)env->GetLongField(theBB, env->GetFieldID(env->GetObjectClass(theBB), "pointerAddress", "J"));
	builder->SetInsertPoint(basicBlock);
}

JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_getInt8Ty(JNIEnv *env, jobject obj) {
	jlong pointerAddress = env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
	llvm::IRBuilder<> *builder = (llvm::IRBuilder<>*)pointerAddress;
	llvm::IntegerType *int8Type = builder->getInt8Ty();

	jclass integerTypeClass = env->FindClass("fire/llvm/IntegerType");
	jmethodID constructorId = env->GetMethodID(integerTypeClass, "<init>", "(J)V");
	return env->NewObject(integerTypeClass, constructorId, (jlong)int8Type);
}

JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_getInt32Ty(JNIEnv *env, jobject obj) {
	jlong pointerAddress = env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
	llvm::IRBuilder<> *builder = (llvm::IRBuilder<>*)pointerAddress;
	llvm::IntegerType *int32Type = builder->getInt32Ty();

	jclass integerTypeClass = env->FindClass("fire/llvm/IntegerType");
	jmethodID constructorId = env->GetMethodID(integerTypeClass, "<init>", "(J)V");
	return env->NewObject(integerTypeClass, constructorId, (jlong)int32Type);
}

JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_getVoidTy(JNIEnv *env, jobject obj) {
	jlong pointerAddress = env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
	llvm::IRBuilder<> *builder = (llvm::IRBuilder<>*)pointerAddress;
	llvm::Type *voidType = builder->getVoidTy();

	jclass typeClass = env->FindClass("fire/llvm/Type");
	jmethodID constructorId = env->GetMethodID(typeClass, "<init>", "(J)V");
	return env->NewObject(typeClass, constructorId, (jlong)voidType);
}

JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createRetVoid(JNIEnv *env, jobject obj) {
	llvm::IRBuilder<> *builder = (llvm::IRBuilder<>*)env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
	llvm::ReturnInst *returnInst = builder->CreateRetVoid();

	jclass returnClass = env->FindClass("fire/llvm/ReturnInst");
	jmethodID constructorId = env->GetMethodID(returnClass, "<init>", "(J)V");
	return env->NewObject(returnClass, constructorId, (jlong)returnInst);
}

JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createGlobalStringPtr(JNIEnv *env, jobject obj, jstring str) {
	llvm::IRBuilder<> *builder = (llvm::IRBuilder<>*)env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
	const char *stringValue = env->GetStringUTFChars(str, NULL);
	llvm::Value *value = builder->CreateGlobalStringPtr(stringValue);
	env->ReleaseStringUTFChars(str, stringValue);

	jclass valueClass = env->FindClass("fire/llvm/Value");
	return env->NewObject(valueClass, env->GetMethodID(valueClass, "<init>", "(J)V"), (jlong)value);
}

JNIEXPORT jobject JNICALL Java_fire_llvm_IRBuilder_createCall(JNIEnv *env, jobject obj, jobject callee, jobjectArray args) {
	llvm::IRBuilder<> *builder = (llvm::IRBuilder<>*)env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
	llvm::Function *function = (llvm::Function*)env->GetLongField(callee, env->GetFieldID(env->GetObjectClass(callee), "pointerAddress", "J"));

	std::vector<llvm::Value*> argsVector;
	jsize argsSize = env->GetArrayLength(args);
	for (jsize i = 0; i < argsSize; i++) {
		jobject argJavaObject = env->GetObjectArrayElement(args, i);
		llvm::Value *arg = (llvm::Value*)env->GetLongField(argJavaObject, env->GetFieldID(env->GetObjectClass(argJavaObject), "pointerAddress", "J"));
		argsVector.push_back(arg);
	}

	llvm::CallInst *call = builder->CreateCall(function, argsVector);
	jclass callInstClass = env->FindClass("fire/llvm/CallInst");
	jmethodID constructorId = env->GetMethodID(callInstClass, "<init>", "(J)V");
	return env->NewObject(callInstClass, constructorId, (jlong)call);
}
