/*
 * generated by Xtext 2.10.0
 */
package fire.serializer;

import com.google.inject.Inject;
import fire.fire.BooleanLiteral;
import fire.fire.FirePackage;
import fire.fire.Program;
import fire.fire.StringLiteral;
import fire.fire.WritelnStatement;
import fire.services.FireGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class FireSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FireGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FirePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FirePackage.BOOLEAN_LITERAL:
				sequence_Expression(context, (BooleanLiteral) semanticObject); 
				return; 
			case FirePackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case FirePackage.STRING_LITERAL:
				sequence_Expression(context, (StringLiteral) semanticObject); 
				return; 
			case FirePackage.WRITELN_STATEMENT:
				sequence_WritelnStatement(context, (WritelnStatement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expression returns BooleanLiteral
	 *
	 * Constraint:
	 *     value?='true'?
	 */
	protected void sequence_Expression(ISerializationContext context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns StringLiteral
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Expression(ISerializationContext context, StringLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FirePackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FirePackage.Literals.STRING_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     statements+=WritelnStatement*
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WritelnStatement returns WritelnStatement
	 *
	 * Constraint:
	 *     argument=Expression
	 */
	protected void sequence_WritelnStatement(ISerializationContext context, WritelnStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FirePackage.Literals.WRITELN_STATEMENT__ARGUMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FirePackage.Literals.WRITELN_STATEMENT__ARGUMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWritelnStatementAccess().getArgumentExpressionParserRuleCall_2_0(), semanticObject.getArgument());
		feeder.finish();
	}
	
	
}
