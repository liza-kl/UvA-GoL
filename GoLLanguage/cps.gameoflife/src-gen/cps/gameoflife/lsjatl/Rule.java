/**
 * generated by Xtext 2.32.0
 */
package cps.gameoflife.lsjatl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cps.gameoflife.lsjatl.Rule#getState <em>State</em>}</li>
 *   <li>{@link cps.gameoflife.lsjatl.Rule#getOp <em>Op</em>}</li>
 *   <li>{@link cps.gameoflife.lsjatl.Rule#getNCount <em>NCount</em>}</li>
 *   <li>{@link cps.gameoflife.lsjatl.Rule#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see cps.gameoflife.lsjatl.LsjatlPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' attribute.
   * @see #setState(String)
   * @see cps.gameoflife.lsjatl.LsjatlPackage#getRule_State()
   * @model
   * @generated
   */
  String getState();

  /**
   * Sets the value of the '{@link cps.gameoflife.lsjatl.Rule#getState <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' attribute.
   * @see #getState()
   * @generated
   */
  void setState(String value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see cps.gameoflife.lsjatl.LsjatlPackage#getRule_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link cps.gameoflife.lsjatl.Rule#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>NCount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>NCount</em>' attribute.
   * @see #setNCount(int)
   * @see cps.gameoflife.lsjatl.LsjatlPackage#getRule_NCount()
   * @model
   * @generated
   */
  int getNCount();

  /**
   * Sets the value of the '{@link cps.gameoflife.lsjatl.Rule#getNCount <em>NCount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>NCount</em>' attribute.
   * @see #getNCount()
   * @generated
   */
  void setNCount(int value);

  /**
   * Returns the value of the '<em><b>Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' attribute.
   * @see #setResult(String)
   * @see cps.gameoflife.lsjatl.LsjatlPackage#getRule_Result()
   * @model
   * @generated
   */
  String getResult();

  /**
   * Sets the value of the '{@link cps.gameoflife.lsjatl.Rule#getResult <em>Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' attribute.
   * @see #getResult()
   * @generated
   */
  void setResult(String value);

} // Rule
