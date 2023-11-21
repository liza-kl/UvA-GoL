/**
 * generated by Xtext 2.32.0
 */
package cps.gameoflife.lsjatl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cps.gameoflife.lsjatl.Game#getGrid <em>Grid</em>}</li>
 *   <li>{@link cps.gameoflife.lsjatl.Game#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see cps.gameoflife.lsjatl.LsjatlPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject
{
  /**
   * Returns the value of the '<em><b>Grid</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grid</em>' containment reference.
   * @see #setGrid(Grid)
   * @see cps.gameoflife.lsjatl.LsjatlPackage#getGame_Grid()
   * @model containment="true"
   * @generated
   */
  Grid getGrid();

  /**
   * Sets the value of the '{@link cps.gameoflife.lsjatl.Game#getGrid <em>Grid</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Grid</em>' containment reference.
   * @see #getGrid()
   * @generated
   */
  void setGrid(Grid value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference.
   * @see #setRules(Rules)
   * @see cps.gameoflife.lsjatl.LsjatlPackage#getGame_Rules()
   * @model containment="true"
   * @generated
   */
  Rules getRules();

  /**
   * Sets the value of the '{@link cps.gameoflife.lsjatl.Game#getRules <em>Rules</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rules</em>' containment reference.
   * @see #getRules()
   * @generated
   */
  void setRules(Rules value);

} // Game
