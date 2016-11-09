/**
 * generated by Xtext 2.10.0
 */
package fire.fire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Else If Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fire.fire.ElseIfExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link fire.fire.ElseIfExpression#getThenStatements <em>Then Statements</em>}</li>
 *   <li>{@link fire.fire.ElseIfExpression#getThenValue <em>Then Value</em>}</li>
 * </ul>
 *
 * @see fire.fire.FirePackage#getElseIfExpression()
 * @model
 * @generated
 */
public interface ElseIfExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expression)
   * @see fire.fire.FirePackage#getElseIfExpression_Condition()
   * @model containment="true"
   * @generated
   */
  Expression getCondition();

  /**
   * Sets the value of the '{@link fire.fire.ElseIfExpression#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expression value);

  /**
   * Returns the value of the '<em><b>Then Statements</b></em>' containment reference list.
   * The list contents are of type {@link fire.fire.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Statements</em>' containment reference list.
   * @see fire.fire.FirePackage#getElseIfExpression_ThenStatements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getThenStatements();

  /**
   * Returns the value of the '<em><b>Then Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Value</em>' containment reference.
   * @see #setThenValue(Expression)
   * @see fire.fire.FirePackage#getElseIfExpression_ThenValue()
   * @model containment="true"
   * @generated
   */
  Expression getThenValue();

  /**
   * Sets the value of the '{@link fire.fire.ElseIfExpression#getThenValue <em>Then Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Value</em>' containment reference.
   * @see #getThenValue()
   * @generated
   */
  void setThenValue(Expression value);

} // ElseIfExpression
