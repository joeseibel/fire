package fire.generator

import fire.fire.Program
import fire.llvm.BasicBlock
import fire.llvm.Function
import fire.llvm.FunctionType
import fire.llvm.IRBuilder
import fire.llvm.LLVMContext
import fire.llvm.LinkageTypes
import fire.llvm.Module
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class FireGenerator extends AbstractGenerator {
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val outputMessage = (resource.contents.head as Program).value
		fsa.generateFile(resource.URI.trimFileExtension.lastSegment + ".ll", '''
			@0 = private unnamed_addr constant [«outputMessage.length + 1» x i8] c"«outputMessage»\00"
			
			declare i32 @puts(i8*)
			
			define void @main() {
			entry:
				%0 = call i32 @puts(i8* getelementptr inbounds ([«outputMessage.length + 1» x i8], [«outputMessage.length + 1» x i8]* @0, i32 0, i32 0))
				ret void
			}
		''')
		
		val llvmContext = new LLVMContext
		val module = new Module(resource.URI.lastSegment, llvmContext)
		val builder = new IRBuilder(llvmContext)
		
		val functionType = FunctionType.get(builder.int32Ty, #[builder.int8Ty.pointerTo], false)
		val putsFunction = Function.create(functionType, LinkageTypes.EXTERNAL_LINKAGE, "puts", module)
		
		val mainFunctionType = FunctionType.get(builder.voidTy, false)
		val mainFunction = Function.create(mainFunctionType, LinkageTypes.EXTERNAL_LINKAGE, "main", module)
		val entry = BasicBlock.create(llvmContext, "entry", mainFunction)
		builder.insertPoint = entry
		
		val globalString = builder.createGlobalStringPtr(outputMessage)
		builder.createCall(putsFunction, #[globalString])
		builder.createRetVoid
		
		module.dump
		
		builder.delete
		module.delete
		llvmContext.delete
	}
}
