/**
 * generated by Xtext 2.32.0
 */
package cps.gameoflife.lsjatl.impl;

import cps.gameoflife.lsjatl.LsjatlPackage;
import cps.gameoflife.lsjatl.Rule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cps.gameoflife.lsjatl.impl.RuleImpl#getState <em>State</em>}</li>
 *   <li>{@link cps.gameoflife.lsjatl.impl.RuleImpl#getOp <em>Op</em>}</li>
 *   <li>{@link cps.gameoflife.lsjatl.impl.RuleImpl#getNCount <em>NCount</em>}</li>
 *   <li>{@link cps.gameoflife.lsjatl.impl.RuleImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule
{
  /**
   * The default value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected static final String STATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected String state = STATE_EDEFAULT;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

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
   * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected static final String RESULT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected String result = RESULT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleImpl()
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
    return LsjatlPackage.Literals.RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setState(String newState)
  {
    String oldState = state;
    state = newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LsjatlPackage.RULE__STATE, oldState, state));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LsjatlPackage.RULE__OP, oldOp, op));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LsjatlPackage.RULE__NCOUNT, oldNCount, nCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getResult()
  {
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setResult(String newResult)
  {
    String oldResult = result;
    result = newResult;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LsjatlPackage.RULE__RESULT, oldResult, result));
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
      case LsjatlPackage.RULE__STATE:
        return getState();
      case LsjatlPackage.RULE__OP:
        return getOp();
      case LsjatlPackage.RULE__NCOUNT:
        return getNCount();
      case LsjatlPackage.RULE__RESULT:
        return getResult();
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
      case LsjatlPackage.RULE__STATE:
        setState((String)newValue);
        return;
      case LsjatlPackage.RULE__OP:
        setOp((String)newValue);
        return;
      case LsjatlPackage.RULE__NCOUNT:
        setNCount((Integer)newValue);
        return;
      case LsjatlPackage.RULE__RESULT:
        setResult((String)newValue);
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
      case LsjatlPackage.RULE__STATE:
        setState(STATE_EDEFAULT);
        return;
      case LsjatlPackage.RULE__OP:
        setOp(OP_EDEFAULT);
        return;
      case LsjatlPackage.RULE__NCOUNT:
        setNCount(NCOUNT_EDEFAULT);
        return;
      case LsjatlPackage.RULE__RESULT:
        setResult(RESULT_EDEFAULT);
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
      case LsjatlPackage.RULE__STATE:
        return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
      case LsjatlPackage.RULE__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case LsjatlPackage.RULE__NCOUNT:
        return nCount != NCOUNT_EDEFAULT;
      case LsjatlPackage.RULE__RESULT:
        return RESULT_EDEFAULT == null ? result != null : !RESULT_EDEFAULT.equals(result);
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
    result.append(" (state: ");
    result.append(state);
    result.append(", op: ");
    result.append(op);
    result.append(", nCount: ");
    result.append(nCount);
    result.append(", result: ");
    result.append(result);
    result.append(')');
    return result.toString();
  }

} //RuleImpl