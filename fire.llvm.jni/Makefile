JNI_HEADERS = jni_headers/fire_llvm_BasicBlock.h\
	jni_headers/fire_llvm_Function.h\
	jni_headers/fire_llvm_FunctionType.h\
	jni_headers/fire_llvm_IRBuilder.h\
	jni_headers/fire_llvm_LLVMContext.h\
	jni_headers/fire_llvm_Module.h\
	jni_headers/fire_llvm_Type.h
OBJS = bin/fire_llvm_BasicBlock.o\
	bin/fire_llvm_Function.o\
	bin/fire_llvm_FunctionType.o\
	bin/fire_llvm_IRBuilder.o\
	bin/fire_llvm_LLVMContext.o\
	bin/fire_llvm_Module.o\
	bin/fire_llvm_Type.o

JAVA_PROJECT = ../fire.llvm
JAVA_BIN_DIR = $(JAVA_PROJECT)/bin
LIB = $(JAVA_PROJECT)/libfireLLVM.jnilib

jni_headers/fire_llvm_BasicBlock.h: $(JAVA_BIN_DIR)/fire/llvm/BasicBlock.class
	javah -classpath $(JAVA_BIN_DIR) -d jni_headers fire.llvm.BasicBlock

jni_headers/fire_llvm_Function.h: $(JAVA_BIN_DIR)/fire/llvm/Function.class
	javah -classpath $(JAVA_BIN_DIR) -d jni_headers fire.llvm.Function

jni_headers/fire_llvm_FunctionType.h: $(JAVA_BIN_DIR)/fire/llvm/FunctionType.class
	javah -classpath $(JAVA_BIN_DIR) -d jni_headers fire.llvm.FunctionType

jni_headers/fire_llvm_IRBuilder.h: $(JAVA_BIN_DIR)/fire/llvm/IRBuilder.class
	javah -classpath $(JAVA_BIN_DIR) -d jni_headers fire.llvm.IRBuilder

jni_headers/fire_llvm_LLVMContext.h: $(JAVA_BIN_DIR)/fire/llvm/LLVMContext.class
	javah -classpath $(JAVA_BIN_DIR) -d jni_headers fire.llvm.LLVMContext

jni_headers/fire_llvm_Module.h: $(JAVA_BIN_DIR)/fire/llvm/Module.class
	javah -classpath $(JAVA_BIN_DIR) -d jni_headers fire.llvm.Module

jni_headers/fire_llvm_Type.h: $(JAVA_BIN_DIR)/fire/llvm/Type.class
	javah -classpath $(JAVA_BIN_DIR) -d jni_headers fire.llvm.Type

bin:
	mkdir bin

$(OBJS): bin/%.o: src/%.cpp bin
	clang++ $(shell llvm-config --cxxflags) -Ijni_headers -I/System/Library/Frameworks/JavaVM.framework/Headers -c -o $@ $<

$(LIB): $(OBJS)
	clang++ $(shell llvm-config --ldflags --libs --system-libs) -dynamiclib -o $@ -framework JavaVM $(OBJS)

all: $(JNI_HEADERS) $(OBJS) $(LIB)

clean:
	rm -f $(JNI_HEADERS) $(OBJS) $(LIB)