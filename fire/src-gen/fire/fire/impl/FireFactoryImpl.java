/**
 * generated by Xtext 2.10.0
 */
package fire.fire.impl;

import fire.fire.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FireFactoryImpl extends EFactoryImpl implements FireFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FireFactory init()
  {
    try
    {
      FireFactory theFireFactory = (FireFactory)EPackage.Registry.INSTANCE.getEFactory(FirePackage.eNS_URI);
      if (theFireFactory != null)
      {
        return theFireFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FireFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FireFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FirePackage.PROGRAM: return createProgram();
      case FirePackage.WRITELN_STATEMENT: return createWritelnStatement();
      case FirePackage.EXPRESSION: return createExpression();
      case FirePackage.STRING_LITERAL: return createStringLiteral();
      case FirePackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case FirePackage.INTEGER_LITERAL: return createIntegerLiteral();
      case FirePackage.REAL_LITERAL: return createRealLiteral();
      case FirePackage.NOT_EXPRESSION: return createNotExpression();
      case FirePackage.NEGATION_EXPRESSION: return createNegationExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WritelnStatement createWritelnStatement()
  {
    WritelnStatementImpl writelnStatement = new WritelnStatementImpl();
    return writelnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealLiteral createRealLiteral()
  {
    RealLiteralImpl realLiteral = new RealLiteralImpl();
    return realLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotExpression createNotExpression()
  {
    NotExpressionImpl notExpression = new NotExpressionImpl();
    return notExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegationExpression createNegationExpression()
  {
    NegationExpressionImpl negationExpression = new NegationExpressionImpl();
    return negationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FirePackage getFirePackage()
  {
    return (FirePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FirePackage getPackage()
  {
    return FirePackage.eINSTANCE;
  }

} //FireFactoryImpl
