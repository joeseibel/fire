#include "FireUtil.h"

jobject toJava(JNIEnv *env, jclass cls, void *obj) {
	return env->NewObject(cls, env->GetMethodID(cls, "<init>", "(J)V"), (jlong)obj);
}

jobject toJava(JNIEnv *env, const char * className, void * obj) {
	return toJava(env, env->FindClass(className), obj);
}

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
