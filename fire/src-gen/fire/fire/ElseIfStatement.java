/**
 * generated by Xtext 2.12.0
 */
package fire.fire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Else If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fire.fire.ElseIfStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link fire.fire.ElseIfStatement#getThenStatements <em>Then Statements</em>}</li>
 * </ul>
 *
 * @see fire.fire.FirePackage#getElseIfStatement()
 * @model
 * @generated
 */
public interface ElseIfStatement extends EObject
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
   * @see fire.fire.FirePackage#getElseIfStatement_Condition()
   * @model containment="true"
   * @generated
   */
  Expression getCondition();

  /**
   * Sets the value of the '{@link fire.fire.ElseIfStatement#getCondition <em>Condition</em>}' containment reference.
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
   * @see fire.fire.FirePackage#getElseIfStatement_ThenStatements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getThenStatements();

} // ElseIfStatement
