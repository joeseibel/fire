/**
 * generated by Xtext 2.12.0
 */
package fire.fire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicative Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fire.fire.MultiplicativeExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link fire.fire.MultiplicativeExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link fire.fire.MultiplicativeExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see fire.fire.FirePackage#getMultiplicativeExpression()
 * @model
 * @generated
 */
public interface MultiplicativeExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see fire.fire.FirePackage#getMultiplicativeExpression_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link fire.fire.MultiplicativeExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link fire.fire.MultiplicativeOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see fire.fire.MultiplicativeOperator
   * @see #setOperator(MultiplicativeOperator)
   * @see fire.fire.FirePackage#getMultiplicativeExpression_Operator()
   * @model
   * @generated
   */
  MultiplicativeOperator getOperator();

  /**
   * Sets the value of the '{@link fire.fire.MultiplicativeExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see fire.fire.MultiplicativeOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(MultiplicativeOperator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see fire.fire.FirePackage#getMultiplicativeExpression_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link fire.fire.MultiplicativeExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // MultiplicativeExpression
