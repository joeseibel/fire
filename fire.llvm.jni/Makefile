JNI_HEADERS = jni_headers/fire_llvm_LLVMContext.h
OBJS = bin/fire_llvm_LLVMContext.o

JAVA_PROJECT = ../fire.llvm
JAVA_BIN_DIR = $(JAVA_PROJECT)/bin
LIB = $(JAVA_PROJECT)/libfireLLVM.jnilib

jni_headers/fire_llvm_LLVMContext.h: $(JAVA_BIN_DIR)/fire/llvm/LLVMContext.class
	javah -classpath $(JAVA_BIN_DIR) -d jni_headers fire.llvm.LLVMContext

bin:
	mkdir bin

$(OBJS): bin/%.o: src/%.cpp bin
	clang++ $(shell llvm-config --cxxflags) -Ijni_headers -I/System/Library/Frameworks/JavaVM.framework/Headers -c -o $@ $<

$(LIB): $(OBJS)
	clang++ $(shell llvm-config --ldflags --libs --system-libs) -dynamiclib -o $@ -framework JavaVM $(OBJS)

all: $(JNI_HEADERS) $(OBJS) $(LIB)

clean:
	rm -f $(JNI_HEADERS) $(OBJS) $(LIB)