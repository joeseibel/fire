#include "llvm/IR/Function.h"

#include "fire_llvm_Function.h"

llvm::GlobalValue::LinkageTypes convertLinkageTypes(JNIEnv *env, jobject javaEnum) {
	jclass javaEnumClass = env->GetObjectClass(javaEnum);
	jmethodID equalsID = env->GetMethodID(javaEnumClass, "equals", "(Ljava/lang/Object;)Z");
	const char *fieldSignature = "Lfire/llvm/LinkageTypes;";

	if (env->CallBooleanMethod(javaEnum, equalsID, env->GetStaticObjectField(javaEnumClass, env->GetStaticFieldID(javaEnumClass, "EXTERNAL_LINKAGE", fieldSignature)))) {
		return llvm::GlobalValue::ExternalLinkage;
	} else if (env->CallBooleanMethod(javaEnum, equalsID, env->GetStaticObjectField(javaEnumClass, env->GetStaticFieldID(javaEnumClass, "AVAILABLE_EXTERNALLY_LINKAGE", fieldSignature)))) {
		return llvm::GlobalValue::AvailableExternallyLinkage;
	} else if (env->CallBooleanMethod(javaEnum, equalsID, env->GetStaticObjectField(javaEnumClass, env->GetStaticFieldID(javaEnumClass, "LINK_ONCE_ANY_LINKAGE", fieldSignature)))) {
		return llvm::GlobalValue::LinkOnceAnyLinkage;
	} else if (env->CallBooleanMethod(javaEnum, equalsID, env->GetStaticObjectField(javaEnumClass, env->GetStaticFieldID(javaEnumClass, "LINK_ONCE_ODR_LINKAGE", fieldSignature)))) {
		return llvm::GlobalValue::LinkOnceODRLinkage;
	} else if (env->CallBooleanMethod(javaEnum, equalsID, env->GetStaticObjectField(javaEnumClass, env->GetStaticFieldID(javaEnumClass, "WEAK_ANY_LINKAGE", fieldSignature)))) {
		return llvm::GlobalValue::WeakAnyLinkage;
	} else if (env->CallBooleanMethod(javaEnum, equalsID, env->GetStaticObjectField(javaEnumClass, env->GetStaticFieldID(javaEnumClass, "WEAK_ODR_LINKAGE", fieldSignature)))) {
		return llvm::GlobalValue::WeakODRLinkage;
	} else if (env->CallBooleanMethod(javaEnum, equalsID, env->GetStaticObjectField(javaEnumClass, env->GetStaticFieldID(javaEnumClass, "APPENDING_LINKAGE", fieldSignature)))) {
		return llvm::GlobalValue::AppendingLinkage;
	} else if (env->CallBooleanMethod(javaEnum, equalsID, env->GetStaticObjectField(javaEnumClass, env->GetStaticFieldID(javaEnumClass, "INTERNAL_LINKAGE", fieldSignature)))) {
		return llvm::GlobalValue::InternalLinkage;
	} else if (env->CallBooleanMethod(javaEnum, equalsID, env->GetStaticObjectField(javaEnumClass, env->GetStaticFieldID(javaEnumClass, "PRIVATE_LINKAGE", fieldSignature)))) {
		return llvm::GlobalValue::PrivateLinkage;
	} else if (env->CallBooleanMethod(javaEnum, equalsID, env->GetStaticObjectField(javaEnumClass, env->GetStaticFieldID(javaEnumClass, "EXTERNAL_WEAK_LINKAGE", fieldSignature)))) {
		return llvm::GlobalValue::ExternalWeakLinkage;
	} else if (env->CallBooleanMethod(javaEnum, equalsID, env->GetStaticObjectField(javaEnumClass, env->GetStaticFieldID(javaEnumClass, "COMMON_LINKAGE", fieldSignature)))) {
		return llvm::GlobalValue::CommonLinkage;
	} else {
		jstring nameString = (jstring)env->CallObjectMethod(javaEnum, env->GetMethodID(javaEnumClass, "name", "()Ljava/lang/String;"));
		const char *name = env->GetStringUTFChars(nameString, NULL);
		env->ThrowNew(env->FindClass("java/lang/AssertionError"), (std::string("Unrecognized enum literal: ") + name).c_str());
		env->ReleaseStringUTFChars(nameString, name);
		return llvm::GlobalValue::ExternalLinkage;
	}
}

JNIEXPORT jobject JNICALL Java_fire_llvm_Function_create(JNIEnv *env, jclass cls, jobject ty, jobject linkage, jstring n, jobject m) {
	jlong functionTypePointerAddress = env->GetLongField(ty, env->GetFieldID(env->GetObjectClass(ty), "pointerAddress", "J"));
	llvm::FunctionType *functionType = (llvm::FunctionType*)functionTypePointerAddress;

	llvm::GlobalValue::LinkageTypes linkageEnumLiteral = convertLinkageTypes(env, linkage);

	const char *functionName = env->GetStringUTFChars(n, NULL);

	jlong modulePointerAddress = env->GetLongField(m, env->GetFieldID(env->GetObjectClass(m), "pointerAddress", "J"));
	llvm::Module *module = (llvm::Module*)modulePointerAddress;

	llvm::Function *function = llvm::Function::Create(functionType, linkageEnumLiteral, functionName, module);

	env->ReleaseStringUTFChars(n, functionName);

	jmethodID constructorId = env->GetMethodID(cls, "<init>", "(J)V");
	return env->NewObject(cls, constructorId, (jlong)function);
}
