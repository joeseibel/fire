/**
 * generated by Xtext 2.12.0
 */
package fire.fire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fire.fire.Function#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link fire.fire.Function#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fire.fire.FirePackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Callable
{
  /**
   * Returns the value of the '<em><b>Return Type</b></em>' attribute.
   * The literals are from the enumeration {@link fire.fire.BuiltInType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' attribute.
   * @see fire.fire.BuiltInType
   * @see #setReturnType(BuiltInType)
   * @see fire.fire.FirePackage#getFunction_ReturnType()
   * @model
   * @generated
   */
  BuiltInType getReturnType();

  /**
   * Sets the value of the '{@link fire.fire.Function#getReturnType <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' attribute.
   * @see fire.fire.BuiltInType
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(BuiltInType value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see fire.fire.FirePackage#getFunction_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link fire.fire.Function#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // Function
