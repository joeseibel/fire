package fire.generator

import com.google.inject.Inject
import fire.fire.AdditiveExpression
import fire.fire.AndExpression
import fire.fire.AssignmentStatement
import fire.fire.BooleanLiteral
import fire.fire.ComparisonExpression
import fire.fire.ElseIfStatement
import fire.fire.EqualityExpression
import fire.fire.Expression
import fire.fire.IdExpression
import fire.fire.IfStatement
import fire.fire.IntegerLiteral
import fire.fire.MultiplicativeExpression
import fire.fire.NegationExpression
import fire.fire.NotExpression
import fire.fire.OrExpression
import fire.fire.Program
import fire.fire.RealLiteral
import fire.fire.StringLiteral
import fire.fire.VariableDeclaration
import fire.fire.WhileLoop
import fire.fire.WritelnStatement
import fire.fire.XorExpression
import fire.llvm.BasicBlock
import fire.llvm.ConstantFP
import fire.llvm.Function
import fire.llvm.FunctionType
import fire.llvm.IRBuilder
import fire.llvm.LLVMContext
import fire.llvm.LinkageTypes
import fire.llvm.Module
import fire.llvm.StructType
import fire.llvm.Type
import fire.llvm.Value
import fire.services.FireGrammarAccess
import java.io.ByteArrayInputStream
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.EnumLiteralDeclaration
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import static extension fire.FireUtil.getType
import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.getNode

class FireGenerator extends AbstractGenerator {
	@Inject
	FireGrammarAccess grammarAccess
	
	LLVMContext llvmContext
	Module module
	IRBuilder builder
	
	val generatedVariableDeclarations = <VariableDeclaration, Value>newHashMap
	
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
			
			generatedVariableDeclarations.clear
		}
	}
	
	def private void generate(Program program) {
		val functionType = FunctionType.get(builder.voidTy, false)
		val mainFunction = Function.create(functionType, LinkageTypes.EXTERNAL_LINKAGE, "main", module)
		builder.insertPoint = BasicBlock.create(llvmContext, "entry", mainFunction)
		program.statements.forEach[generateStatement]
		builder.createRetVoid
	}
	
	def private dispatch void generateStatement(VariableDeclaration variable) {
		if (variable.constant) {
			generatedVariableDeclarations.put(variable, variable.value.generateExpression)
		} else {
			val alloca = builder.createEntryBlockAlloca(switch variable.type {
				case STRING: builder.int8Ty.pointerTo
				case BOOLEAN: builder.int1Ty
				case INTEGER: builder.int64Ty
				case REAL: builder.doubleTy
			})
			generatedVariableDeclarations.put(variable, alloca)
			builder.createStore(variable.value.generateExpression, alloca)
		}
	}
	
	def private dispatch void generateStatement(AssignmentStatement assignment) {
		builder.createStore(assignment.value.generateExpression, generatedVariableDeclarations.get(assignment.variable))
	}
	
	def private dispatch void generateStatement(WhileLoop whileLoop) {
		val function = builder.insertBlock.parent
		val conditionBlock = BasicBlock.create(llvmContext, "condition", function)
		val bodyBlock = BasicBlock.create(llvmContext, "body", function)
		val afterLoopBlock = BasicBlock.create(llvmContext, "afterLoop", function)
		builder.createBr(conditionBlock)
		builder.insertPoint = conditionBlock
		builder.createCondBr(whileLoop.condition.generateExpression, bodyBlock, afterLoopBlock)
		builder.insertPoint = bodyBlock
		whileLoop.statements.forEach[generateStatement]
		builder.createBr(conditionBlock)
		builder.insertPoint = afterLoopBlock
	}
	
	def private dispatch void generateStatement(IfStatement ifStatement) {
		val function = builder.insertBlock.parent
		val thenBlock = BasicBlock.create(llvmContext, "then", function)
		val elseIfStatementAndBlocks = ifStatement.elseIfs.indexed.map[
			val conditionBlock = BasicBlock.create(llvmContext, "elseIfCondition_" + key, function)
			val statementBlock = BasicBlock.create(llvmContext, "elseIfThen_" + key, function)
			new ElseIfStatementAndBlock(value, conditionBlock, statementBlock)
		].toList
		val elseBlock = if (ifStatement.^else != null) {
			BasicBlock.create(llvmContext, "else", function)
		}
		val afterIfBlock = BasicBlock.create(llvmContext, "afterIf", function)
		val conditionFalseBlock = elseIfStatementAndBlocks.head?.conditionBlock ?: elseBlock ?: afterIfBlock
		builder.createCondBr(ifStatement.condition.generateExpression, thenBlock, conditionFalseBlock)
		elseIfStatementAndBlocks.forEach[statementAndBlock, index |
			builder.insertPoint = statementAndBlock.conditionBlock
			val conditionValue = statementAndBlock.elseIfStatement.condition.generateExpression
			val falseBlock = if (index < elseIfStatementAndBlocks.size - 1) {
				elseIfStatementAndBlocks.get(index + 1).conditionBlock
			} else {
				elseBlock ?: afterIfBlock
			}
			builder.createCondBr(conditionValue, statementAndBlock.statementBlock, falseBlock)
		]
		builder.insertPoint = thenBlock
		ifStatement.thenStatements.forEach[generateStatement]
		builder.createBr(afterIfBlock)
		elseIfStatementAndBlocks.forEach[statementAndBlock |
			builder.insertPoint = statementAndBlock.statementBlock
			statementAndBlock.elseIfStatement.thenStatements.forEach[generateStatement]
			builder.createBr(afterIfBlock)
		]
		if (elseBlock != null) {
			builder.insertPoint = elseBlock
			ifStatement.^else.elseStatements.forEach[generateStatement]
			builder.createBr(afterIfBlock)
		}
		builder.insertPoint = afterIfBlock
	}
	
	def private dispatch void generateStatement(WritelnStatement statement) {
		val argumentValue = statement.argument.generateExpression
		switch statement.argument.type {
			case STRING: builder.createCall(printfFunction, #[builder.createGlobalStringPtr("%s\n"), argumentValue])
			case BOOLEAN: {
				val trueString = builder.createGlobalStringPtr("true\n")
				val falseString = builder.createGlobalStringPtr("false\n")
				val selectResult = builder.createSelect(argumentValue, trueString, falseString)
				builder.createCall(printfFunction, #[selectResult])
			}
			case INTEGER: builder.createCall(printfFunction, #[builder.createGlobalStringPtr("%ld\n"), argumentValue])
			case REAL: builder.createCall(printfFunction, #[builder.createGlobalStringPtr("%f\n"), argumentValue])
		}
	}
	
	def private dispatch Value generateExpression(OrExpression expression) {
		val leftValue = expression.left.generateExpression
		val startingBlock = builder.insertBlock
		val function = startingBlock.parent
		val elseBlock = BasicBlock.create(llvmContext, "else", function)
		val afterIfBlock = BasicBlock.create(llvmContext, "afterIf", function)
		builder.createCondBr(leftValue, afterIfBlock, elseBlock)
		builder.insertPoint = elseBlock
		val rightValue = expression.right.generateExpression
		builder.createBr(afterIfBlock)
		builder.insertPoint = afterIfBlock
		builder.createPHI(builder.int1Ty, 2) => [
			addIncoming(builder.^true, startingBlock)
			addIncoming(rightValue, elseBlock)
		]
	}
	
	def private dispatch Value generateExpression(AndExpression expression) {
		val leftValue = expression.left.generateExpression
		val startingBlock = builder.insertBlock
		val function = startingBlock.parent
		val thenBlock = BasicBlock.create(llvmContext, "then", function)
		val afterIfBlock = BasicBlock.create(llvmContext, "afterIf", function)
		builder.createCondBr(leftValue, thenBlock, afterIfBlock)
		builder.insertPoint = thenBlock
		val rightValue = expression.right.generateExpression
		builder.createBr(afterIfBlock)
		builder.insertPoint = afterIfBlock
		builder.createPHI(builder.int1Ty, 2) => [
			addIncoming(rightValue, thenBlock)
			addIncoming(builder.^false, startingBlock)
		]
	}
	
	def private dispatch Value generateExpression(XorExpression expression) {
		builder.createXor(expression.left.generateExpression, expression.right.generateExpression)
	}
	
	def private dispatch Value generateExpression(EqualityExpression expression) {
		switch expression.operator {
			case EQUALS: switch expression.left.type {
				case BOOLEAN,
				case INTEGER: builder.createICmpEQ(expression.left.generateExpression, expression.right.generateExpression)
				case REAL: builder.createFCmpUEQ(expression.left.generateExpression, expression.right.generateExpression)
				default: null
			}
			case NOT_EQUALS: switch expression.left.type {
				case BOOLEAN,
				case INTEGER: builder.createICmpNE(expression.left.generateExpression, expression.right.generateExpression)
				case REAL: builder.createFCmpUNE(expression.left.generateExpression, expression.right.generateExpression)
				default: null
			}
		}
	}
	
	def private dispatch Value generateExpression(ComparisonExpression expression) {
		switch expression.operator {
			case LESS: switch expression.left.type {
				case INTEGER: builder.createICmpSLT(expression.left.generateExpression, expression.right.generateExpression)
				case REAL: builder.createFCmpULT(expression.left.generateExpression, expression.right.generateExpression)
				default: null
			}
			case LESS_EQUAL: switch expression.left.type {
				case INTEGER: builder.createICmpSLE(expression.left.generateExpression, expression.right.generateExpression)
				case REAL: builder.createFCmpULE(expression.left.generateExpression, expression.right.generateExpression)
				default: null
			}
			case GREATER: switch expression.left.type {
				case INTEGER: builder.createICmpSGT(expression.left.generateExpression, expression.right.generateExpression)
				case REAL: builder.createFCmpUGT(expression.left.generateExpression, expression.right.generateExpression)
				default: null
			} 
			case GREATER_EQUAL: switch expression.left.type {
				case INTEGER: builder.createICmpSGE(expression.left.generateExpression, expression.right.generateExpression)
				case REAL: builder.createFCmpUGE(expression.left.generateExpression, expression.right.generateExpression)
				default: null
			}
		}
	}
	
	def private dispatch Value generateExpression(AdditiveExpression expression) {
		switch expression.operator {
			case ADD: switch expression.left.type {
				case INTEGER: {
					val operator = grammarAccess.additiveOperatorAccess.ADDEnumLiteralDeclaration_0
					overflowCheck(expression, expression.left, expression.right, operator, saddWithOverflowFunction)
				}
				case REAL: builder.createFAdd(expression.left.generateExpression, expression.right.generateExpression)
				default: null
			}
			case SUBTRACT: switch expression.left.type {
				case INTEGER: {
					val operator = grammarAccess.additiveOperatorAccess.SUBTRACTEnumLiteralDeclaration_1
					overflowCheck(expression, expression.left, expression.right, operator, ssubWithOverflowFunction)
				}
				case REAL: builder.createFSub(expression.left.generateExpression, expression.right.generateExpression)
				default: null
			}
		}
	}
	
	def private Value overflowCheck(Expression expression, Expression left, Expression right, EnumLiteralDeclaration operator, Function operation) {
		val result = builder.createCall(operation, #[left.generateExpression, right.generateExpression])
		val isOverflow = builder.createExtractValue(result, 1)
		val function = builder.insertBlock.parent
		val thenBlock = BasicBlock.create(llvmContext, "then", function)
		val afterIfBlock = BasicBlock.create(llvmContext, "afterIf", function)
		builder.createCondBr(isOverflow, thenBlock, afterIfBlock)
		builder.insertPoint = thenBlock
		val line = expression.node.leafNodes.findFirst[grammarElement == operator].startLine
		val message = '''Integer overflow at "«expression.eResource.URI.lastSegment»:«line»"'''
		builder.createCall(printfFunction, #[builder.createGlobalStringPtr(message)])
		builder.createCall(exitFunction, #[builder.getInt32(1)])
		builder.createUnreachable
		builder.insertPoint = afterIfBlock
		builder.createExtractValue(result, 0)
	}
	
	def private dispatch Value generateExpression(MultiplicativeExpression expression) {
		switch expression.operator {
			case MULTIPLY: switch expression.left.type {
				case INTEGER: {
					val operator = grammarAccess.multiplicativeOperatorAccess.MULTIPLYEnumLiteralDeclaration_0
					overflowCheck(expression, expression.left, expression.right, operator, smulWithOverflowFunction)
				}
				case REAL: builder.createFMul(expression.left.generateExpression, expression.right.generateExpression)
				default: null
			}
			case REAL_DIVIDE: builder.createFDiv(expression.left.generateExpression, expression.right.generateExpression)
			case INTEGER_DIVIDE: {
				val divOperator = grammarAccess.multiplicativeOperatorAccess.INTEGER_DIVIDEEnumLiteralDeclaration_2
				checkZeroAndDivide(expression, divOperator, "Integer divide", [left, right | builder.createSDiv(left, right)])
			}
			case MODULUS: {
				val modOperator = grammarAccess.multiplicativeOperatorAccess.MODULUSEnumLiteralDeclaration_3
				checkZeroAndDivide(expression, modOperator, "Modulus", [left, right | builder.createSRem(left, right)])
			}
		}
	}
	
	def private Value checkZeroAndDivide(MultiplicativeExpression expression, EnumLiteralDeclaration operator, String operationName, (Value, Value)=>Value operation) {
		val rightValue = expression.right.generateExpression
		val function = builder.insertBlock.parent
		val thenBlock = BasicBlock.create(llvmContext, "then", function)
		val afterIfBlock = BasicBlock.create(llvmContext, "afterIf", function)
		val isZero = builder.createICmpEQ(rightValue, builder.getInt64(0))
		builder.createCondBr(isZero, thenBlock, afterIfBlock)
		builder.insertPoint = thenBlock
		val line = expression.node.leafNodes.findFirst[grammarElement == operator].startLine
		val message = '''«operationName» by zero at "«expression.eResource.URI.lastSegment»:«line»"'''
		builder.createCall(printfFunction, #[builder.createGlobalStringPtr(message)])
		builder.createCall(exitFunction, #[builder.getInt32(1)])
		builder.createUnreachable
		builder.insertPoint = afterIfBlock
		operation.apply(expression.left.generateExpression, rightValue)
	}
	
	def private dispatch Value generateExpression(IdExpression literal) {
		if (literal.value.constant) {
			generatedVariableDeclarations.get(literal.value)
		} else {
			builder.createLoad(generatedVariableDeclarations.get(literal.value))
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
	
	def private dispatch Value generateExpression(NegationExpression expression) {
		switch expression.operand.type {
			case INTEGER: builder.createNeg(expression.operand.generateExpression)
			case REAL: builder.createFNeg(expression.operand.generateExpression)
			default: null
		}
	}
	
	def private Function getPrintfFunction() {
		getFunction("printf", builder.int32Ty, #[builder.int8Ty.pointerTo], true)
	}
	
	def private Function getExitFunction() {
		getFunction("exit", builder.voidTy, #[builder.int32Ty], false)
	}
	
	def private Function getSaddWithOverflowFunction() {
		getFunction("llvm.sadd.with.overflow.i64", StructType.get(llvmContext, #[builder.int64Ty, builder.int1Ty]), #[builder.int64Ty, builder.int64Ty], false)
	}
	
	def private Function getSsubWithOverflowFunction() {
		getFunction("llvm.ssub.with.overflow.i64", StructType.get(llvmContext, #[builder.int64Ty, builder.int1Ty]), #[builder.int64Ty, builder.int64Ty], false)
	}
	
	def private Function getSmulWithOverflowFunction() {
		getFunction("llvm.smul.with.overflow.i64", StructType.get(llvmContext, #[builder.int64Ty, builder.int1Ty]), #[builder.int64Ty, builder.int64Ty], false)
	}
	
	def private Function getFunction(String name, Type result, Type[] params, boolean isVarArg) {
		module.getFunction(name) ?: {
			val functionType = FunctionType.get(result, params, isVarArg)
			Function.create(functionType, LinkageTypes.EXTERNAL_LINKAGE, name, module)
		}
	}
	
	@FinalFieldsConstructor
	private static class ElseIfStatementAndBlock {
		val ElseIfStatement elseIfStatement
		val BasicBlock conditionBlock
		val BasicBlock statementBlock
	}
}