#include <fire_llvm_Module.h>
#include <llvm/IR/LegacyPassManager.h>
#include <llvm/IR/Module.h>
#include <llvm/Support/TargetRegistry.h>
#include <llvm/Support/TargetSelect.h>
#include <llvm/Target/TargetMachine.h>
#include "FireUtil.h"

//Java method: private static native long newModule(String moduleId, LLVMContext c);
JNIEXPORT jlong JNICALL Java_fire_llvm_Module_newModule(JNIEnv *env, jclass cls, jstring moduleId, jobject c) {
	const char *moduleIdNative = env->GetStringUTFChars(moduleId, nullptr);
	llvm::Module *module = new llvm::Module(moduleIdNative, *toNative<llvm::LLVMContext>(env, c));
	env->ReleaseStringUTFChars(moduleId, moduleIdNative);
	return (jlong)module;
}

//Java method: public native void delete();
JNIEXPORT void JNICALL Java_fire_llvm_Module_delete(JNIEnv *env, jobject obj) {
	delete toNative<llvm::Module>(env, obj);
}

//Java method: public native void dump();
JNIEXPORT void JNICALL Java_fire_llvm_Module_dump(JNIEnv *env, jobject obj) {
	toNative<llvm::Module>(env, obj)->dump();
}

//Java method: public native byte[] emitToByteBuffer();
JNIEXPORT jbyteArray JNICALL Java_fire_llvm_Module_emitToByteBuffer(JNIEnv *env, jobject obj) {
	llvm::Module *module = toNative<llvm::Module>(env, obj);

	llvm::InitializeAllTargetInfos();
	llvm::InitializeAllTargets();
	llvm::InitializeAllTargetMCs();
	llvm::InitializeAllAsmParsers();
	llvm::InitializeAllAsmPrinters();

	std::string targetTriple = llvm::sys::getDefaultTargetTriple();
	module->setTargetTriple(targetTriple);
	std::string errorMessage;
	const llvm::Target *target = llvm::TargetRegistry::lookupTarget(targetTriple, errorMessage);
	if (!target) {
		env->ThrowNew(env->FindClass("java/lang/RuntimeException"), errorMessage.c_str());
		return nullptr;
	} else {
		llvm::TargetMachine *targetMachine = target->createTargetMachine(targetTriple, "generic", "", llvm::TargetOptions(), llvm::Optional<llvm::Reloc::Model>());
		module->setDataLayout(targetMachine->createDataLayout());
		llvm::SmallString<0> codeString;
		llvm::raw_svector_ostream outputStream(codeString);
		llvm::legacy::PassManager pass;
		if (targetMachine->addPassesToEmitFile(pass, outputStream, llvm::TargetMachine::CGFT_ObjectFile)) {
			env->ThrowNew(env->FindClass("java/lang/RuntimeException"), "The target machine can't emit an object file");
			return nullptr;
		} else {
			pass.run(*module);
			llvm::StringRef data = outputStream.str();
			jbyteArray returnValue = env->NewByteArray(data.size());
			env->SetByteArrayRegion(returnValue, 0, data.size(), (jbyte*)data.data());
			return returnValue;
		}
	}
}
