package fire.generator

import fire.fire.BooleanLiteral
import fire.fire.IntegerLiteral
import fire.fire.NotExpression
import fire.fire.Program
import fire.fire.RealLiteral
import fire.fire.StringLiteral
import fire.fire.WritelnStatement
import fire.llvm.BasicBlock
import fire.llvm.ConstantFP
import fire.llvm.Function
import fire.llvm.FunctionType
import fire.llvm.IRBuilder
import fire.llvm.LLVMContext
import fire.llvm.LinkageTypes
import fire.llvm.Module
import fire.llvm.Value
import java.io.ByteArrayInputStream
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import static extension fire.FireUtil.getType

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
		val printfFunction = module.getFunction("printf") ?: {
			val functionType = FunctionType.get(builder.int32Ty, #[builder.int8Ty.pointerTo], true)
			Function.create(functionType, LinkageTypes.EXTERNAL_LINKAGE, "printf", module)
		}
		val argumentValue = statement.argument.generateExpression
		switch statement.argument.type {
			case STRING: builder.createCall(printfFunction, #[builder.createGlobalStringPtr("%s\n"), argumentValue])
			case BOOLEAN: {
				val function = builder.insertBlock.parent
				val thenBlock = BasicBlock.create(llvmContext, "then", function)
				val elseBlock = BasicBlock.create(llvmContext, "else")
				val afterIfBlock = BasicBlock.create(llvmContext, "afterIf")
				builder.createCondBr(argumentValue, thenBlock, elseBlock)
				builder.insertPoint = thenBlock
				builder.createCall(printfFunction, #[builder.createGlobalStringPtr("true\n")])
				builder.createBr(afterIfBlock)
				function.addBasicBlock(elseBlock)
				builder.insertPoint = elseBlock
				builder.createCall(printfFunction, #[builder.createGlobalStringPtr("false\n")])
				builder.createBr(afterIfBlock)
				function.addBasicBlock(afterIfBlock)
				builder.insertPoint = afterIfBlock
			}
			case INTEGER: builder.createCall(printfFunction, #[builder.createGlobalStringPtr("%ld\n"), argumentValue])
			case REAL: builder.createCall(printfFunction, #[builder.createGlobalStringPtr("%f\n"), argumentValue])
		}
	}
	
	def private dispatch Value generateExpression(StringLiteral literal) {
		builder.createGlobalStringPtr(literal.value)
	}
	
	def private dispatch Value generateExpression(BooleanLiteral literal) {
		if (literal.value) {
			builder.^true
		} else {
			builder.^false
		}
	}
	
	def private dispatch Value generateExpression(IntegerLiteral literal) {
		builder.getInt64(literal.value)
	}
	
	def private dispatch Value generateExpression(RealLiteral literal) {
		ConstantFP.get(llvmContext, literal.value)
	}
	
	def private dispatch Value generateExpression(NotExpression expression) {
		builder.createNot(expression.operand.generateExpression)
	}
}