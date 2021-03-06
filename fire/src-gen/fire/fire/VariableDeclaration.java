/**
 * generated by Xtext 2.12.0
 */
package fire.fire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fire.fire.VariableDeclaration#isConstant <em>Constant</em>}</li>
 *   <li>{@link fire.fire.VariableDeclaration#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fire.fire.FirePackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends IdElement, Statement
{
  /**
   * Returns the value of the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' attribute.
   * @see #setConstant(boolean)
   * @see fire.fire.FirePackage#getVariableDeclaration_Constant()
   * @model
   * @generated
   */
  boolean isConstant();

  /**
   * Sets the value of the '{@link fire.fire.VariableDeclaration#isConstant <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' attribute.
   * @see #isConstant()
   * @generated
   */
  void setConstant(boolean value);

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
   * @see fire.fire.FirePackage#getVariableDeclaration_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link fire.fire.VariableDeclaration#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // VariableDeclaration
