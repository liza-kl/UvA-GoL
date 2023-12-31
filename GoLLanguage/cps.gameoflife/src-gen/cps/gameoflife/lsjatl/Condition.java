/**
 * generated by Xtext 2.32.0
 */
package cps.gameoflife.lsjatl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cps.gameoflife.lsjatl.Condition#getBoolOp <em>Bool Op</em>}</li>
 *   <li>{@link cps.gameoflife.lsjatl.Condition#getNCount <em>NCount</em>}</li>
 *   <li>{@link cps.gameoflife.lsjatl.Condition#getSeparator <em>Separator</em>}</li>
 * </ul>
 *
 * @see cps.gameoflife.lsjatl.LsjatlPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Bool Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool Op</em>' attribute.
   * @see #setBoolOp(String)
   * @see cps.gameoflife.lsjatl.LsjatlPackage#getCondition_BoolOp()
   * @model
   * @generated
   */
  String getBoolOp();

  /**
   * Sets the value of the '{@link cps.gameoflife.lsjatl.Condition#getBoolOp <em>Bool Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool Op</em>' attribute.
   * @see #getBoolOp()
   * @generated
   */
  void setBoolOp(String value);

  /**
   * Returns the value of the '<em><b>NCount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>NCount</em>' attribute.
   * @see #setNCount(int)
   * @see cps.gameoflife.lsjatl.LsjatlPackage#getCondition_NCount()
   * @model
   * @generated
   */
  int getNCount();

  /**
   * Sets the value of the '{@link cps.gameoflife.lsjatl.Condition#getNCount <em>NCount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>NCount</em>' attribute.
   * @see #getNCount()
   * @generated
   */
  void setNCount(int value);

  /**
   * Returns the value of the '<em><b>Separator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Separator</em>' attribute.
   * @see #setSeparator(String)
   * @see cps.gameoflife.lsjatl.LsjatlPackage#getCondition_Separator()
   * @model
   * @generated
   */
  String getSeparator();

  /**
   * Sets the value of the '{@link cps.gameoflife.lsjatl.Condition#getSeparator <em>Separator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Separator</em>' attribute.
   * @see #getSeparator()
   * @generated
   */
  void setSeparator(String value);

} // Condition
