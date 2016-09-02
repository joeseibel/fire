package fire.generator

import fire.fire.Program
import fire.llvm.BasicBlock
import fire.llvm.Function
import fire.llvm.FunctionType
import fire.llvm.IRBuilder
import fire.llvm.LLVMContext
import fire.llvm.LinkageTypes
import fire.llvm.Module
import java.io.ByteArrayInputStream
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class FireGenerator extends AbstractGenerator {
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val outputMessage = (resource.contents.head as Program).value
		
		val llvmContext = new LLVMContext
		val module = new Module(resource.URI.lastSegment, llvmContext)
		val builder = new IRBuilder(llvmContext)
		try {
			val functionType = FunctionType.get(builder.int32Ty, #[builder.int8Ty.pointerTo], false)
			val putsFunction = Function.create(functionType, LinkageTypes.EXTERNAL_LINKAGE, "puts", module)
			
			val mainFunctionType = FunctionType.get(builder.voidTy, false)
			val mainFunction = Function.create(mainFunctionType, LinkageTypes.EXTERNAL_LINKAGE, "main", module)
			val entry = BasicBlock.create(llvmContext, "entry", mainFunction)
			builder.insertPoint = entry
			
			val globalString = builder.createGlobalStringPtr(outputMessage)
			builder.createCall(putsFunction, #[globalString])
			builder.createRetVoid
			
			val outputFileName = resource.URI.trimFileExtension.segmentsList.drop(2).join("/") + ".o"
			fsa.generateFile(outputFileName, new ByteArrayInputStream(module.emitToByteBuffer))
		} finally {
			builder.delete
			module.delete
			llvmContext.delete
		}
	}
}
