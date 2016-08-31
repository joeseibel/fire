#ifndef SRC_FIREUTIL_H_
#define SRC_FIREUTIL_H_

#include <jni.h>
#include <llvm/IR/GlobalValue.h>

template<class T>
T *toNative(JNIEnv *env, jobject obj) {
	return (T*)env->GetLongField(obj, env->GetFieldID(env->GetObjectClass(obj), "pointerAddress", "J"));
}

jobject toJava(JNIEnv *, jclass, void *);
jobject toJava(JNIEnv *, const char *, void *);

llvm::GlobalValue::LinkageTypes convertLinkageTypes(JNIEnv *env, jobject javaEnum);

template<class T>
std::vector<T*> toVector(JNIEnv *env, jobjectArray jArray) {
	std::vector<T*> result;
	jsize size = env->GetArrayLength(jArray);
	for (jsize i = 0; i < size; i++) {
		result.push_back(toNative<T>(env, env->GetObjectArrayElement(jArray, i)));
	}
	return result;
}

#endif /* SRC_FIREUTIL_H_ */
