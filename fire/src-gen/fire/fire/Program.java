/**
 * generated by Xtext 2.12.0
 */
package fire.fire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fire.fire.Program#getCallables <em>Callables</em>}</li>
 *   <li>{@link fire.fire.Program#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see fire.fire.FirePackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Callables</b></em>' containment reference list.
   * The list contents are of type {@link fire.fire.Callable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Callables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Callables</em>' containment reference list.
   * @see fire.fire.FirePackage#getProgram_Callables()
   * @model containment="true"
   * @generated
   */
  EList<Callable> getCallables();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link fire.fire.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see fire.fire.FirePackage#getProgram_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // Program
