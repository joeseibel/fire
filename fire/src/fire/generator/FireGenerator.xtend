package fire.generator

import fire.fire.Program
import fire.fire.WritelnStatement
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
	LLVMContext llvmContext
	Module module
	IRBuilder builder
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		llvmContext = new LLVMContext
		module = new Module(resource.URI.lastSegment, llvmContext)
		builder = new IRBuilder(llvmContext)
		try {
			(resource.contents.head as Program).generate
			val outputFileName = resource.URI.trimFileExtension.segmentsList.drop(2).join("/") + ".o"
			fsa.generateFile(outputFileName, new ByteArrayInputStream(module.emitToByteBuffer))
		} finally {
			builder.delete
			builder = null
			module.delete
			module = null
			llvmContext.delete
			llvmContext = null
		}
	}
	
	def private void generate(Program program) {
		val functionType = FunctionType.get(builder.voidTy, false)
		val mainFunction = Function.create(functionType, LinkageTypes.EXTERNAL_LINKAGE, "main", module)
		builder.insertPoint = BasicBlock.create(llvmContext, "entry", mainFunction)
		program.statements.forEach[generate]
		builder.createRetVoid
	}
	
	def private void generate(WritelnStatement statement) {
		val putsFunction = module.getFunction("puts") ?: {
			val functionType = FunctionType.get(builder.int32Ty, #[builder.int8Ty.pointerTo], false)
			Function.create(functionType, LinkageTypes.EXTERNAL_LINKAGE, "puts", module)
		}
		builder.createCall(putsFunction, #[builder.createGlobalStringPtr(statement.value)])
	}
}