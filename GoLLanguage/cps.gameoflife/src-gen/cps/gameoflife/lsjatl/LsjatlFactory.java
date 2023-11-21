/**
 * generated by Xtext 2.32.0
 */
package cps.gameoflife.lsjatl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cps.gameoflife.lsjatl.LsjatlPackage
 * @generated
 */
public interface LsjatlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LsjatlFactory eINSTANCE = cps.gameoflife.lsjatl.impl.LsjatlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Game</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Game</em>'.
   * @generated
   */
  Game createGame();

  /**
   * Returns a new object of class '<em>Grid</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grid</em>'.
   * @generated
   */
  Grid createGrid();

  /**
   * Returns a new object of class '<em>Grid Size</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grid Size</em>'.
   * @generated
   */
  GridSize createGridSize();

  /**
   * Returns a new object of class '<em>Populated Cell</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Populated Cell</em>'.
   * @generated
   */
  PopulatedCell createPopulatedCell();

  /**
   * Returns a new object of class '<em>Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Point</em>'.
   * @generated
   */
  Point createPoint();

  /**
   * Returns a new object of class '<em>Rules</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rules</em>'.
   * @generated
   */
  Rules createRules();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LsjatlPackage getLsjatlPackage();

} //LsjatlFactory
