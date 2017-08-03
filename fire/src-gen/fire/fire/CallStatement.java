/**
 * generated by Xtext 2.12.0
 */
package fire.fire;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fire.fire.CallStatement#getCallable <em>Callable</em>}</li>
 *   <li>{@link fire.fire.CallStatement#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see fire.fire.FirePackage#getCallStatement()
 * @model
 * @generated
 */
public interface CallStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Callable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Callable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Callable</em>' reference.
   * @see #setCallable(Callable)
   * @see fire.fire.FirePackage#getCallStatement_Callable()
   * @model
   * @generated
   */
  Callable getCallable();

  /**
   * Sets the value of the '{@link fire.fire.CallStatement#getCallable <em>Callable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Callable</em>' reference.
   * @see #getCallable()
   * @generated
   */
  void setCallable(Callable value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link fire.fire.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see fire.fire.FirePackage#getCallStatement_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArguments();

} // CallStatement
