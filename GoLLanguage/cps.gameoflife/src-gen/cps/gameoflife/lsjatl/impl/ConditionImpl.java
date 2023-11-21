/**
 * generated by Xtext 2.32.0
 */
package cps.gameoflife.lsjatl.impl;

import cps.gameoflife.lsjatl.Condition;
import cps.gameoflife.lsjatl.LsjatlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cps.gameoflife.lsjatl.impl.ConditionImpl#getBoolOp <em>Bool Op</em>}</li>
 *   <li>{@link cps.gameoflife.lsjatl.impl.ConditionImpl#getNCount <em>NCount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition
{
  /**
   * The default value of the '{@link #getBoolOp() <em>Bool Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolOp()
   * @generated
   * @ordered
   */
  protected static final String BOOL_OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoolOp() <em>Bool Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolOp()
   * @generated
   * @ordered
   */
  protected String boolOp = BOOL_OP_EDEFAULT;

  /**
   * The default value of the '{@link #getNCount() <em>NCount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNCount()
   * @generated
   * @ordered
   */
  protected static final int NCOUNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNCount() <em>NCount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNCount()
   * @generated
   * @ordered
   */
  protected int nCount = NCOUNT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LsjatlPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBoolOp()
  {
    return boolOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBoolOp(String newBoolOp)
  {
    String oldBoolOp = boolOp;
    boolOp = newBoolOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LsjatlPackage.CONDITION__BOOL_OP, oldBoolOp, boolOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNCount()
  {
    return nCount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNCount(int newNCount)
  {
    int oldNCount = nCount;
    nCount = newNCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LsjatlPackage.CONDITION__NCOUNT, oldNCount, nCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LsjatlPackage.CONDITION__BOOL_OP:
        return getBoolOp();
      case LsjatlPackage.CONDITION__NCOUNT:
        return getNCount();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LsjatlPackage.CONDITION__BOOL_OP:
        setBoolOp((String)newValue);
        return;
      case LsjatlPackage.CONDITION__NCOUNT:
        setNCount((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LsjatlPackage.CONDITION__BOOL_OP:
        setBoolOp(BOOL_OP_EDEFAULT);
        return;
      case LsjatlPackage.CONDITION__NCOUNT:
        setNCount(NCOUNT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LsjatlPackage.CONDITION__BOOL_OP:
        return BOOL_OP_EDEFAULT == null ? boolOp != null : !BOOL_OP_EDEFAULT.equals(boolOp);
      case LsjatlPackage.CONDITION__NCOUNT:
        return nCount != NCOUNT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (boolOp: ");
    result.append(boolOp);
    result.append(", NCount: ");
    result.append(nCount);
    result.append(')');
    return result.toString();
  }

} //ConditionImpl
