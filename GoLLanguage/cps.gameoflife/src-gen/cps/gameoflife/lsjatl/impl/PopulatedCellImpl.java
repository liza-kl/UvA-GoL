/**
 * generated by Xtext 2.32.0
 */
package cps.gameoflife.lsjatl.impl;

import cps.gameoflife.lsjatl.LsjatlPackage;
import cps.gameoflife.lsjatl.Point;
import cps.gameoflife.lsjatl.PopulatedCell;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Populated Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cps.gameoflife.lsjatl.impl.PopulatedCellImpl#getPoi <em>Poi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PopulatedCellImpl extends MinimalEObjectImpl.Container implements PopulatedCell
{
  /**
   * The cached value of the '{@link #getPoi() <em>Poi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoi()
   * @generated
   * @ordered
   */
  protected Point poi;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PopulatedCellImpl()
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
    return LsjatlPackage.Literals.POPULATED_CELL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Point getPoi()
  {
    return poi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPoi(Point newPoi, NotificationChain msgs)
  {
    Point oldPoi = poi;
    poi = newPoi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LsjatlPackage.POPULATED_CELL__POI, oldPoi, newPoi);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPoi(Point newPoi)
  {
    if (newPoi != poi)
    {
      NotificationChain msgs = null;
      if (poi != null)
        msgs = ((InternalEObject)poi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LsjatlPackage.POPULATED_CELL__POI, null, msgs);
      if (newPoi != null)
        msgs = ((InternalEObject)newPoi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LsjatlPackage.POPULATED_CELL__POI, null, msgs);
      msgs = basicSetPoi(newPoi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LsjatlPackage.POPULATED_CELL__POI, newPoi, newPoi));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LsjatlPackage.POPULATED_CELL__POI:
        return basicSetPoi(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LsjatlPackage.POPULATED_CELL__POI:
        return getPoi();
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
      case LsjatlPackage.POPULATED_CELL__POI:
        setPoi((Point)newValue);
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
      case LsjatlPackage.POPULATED_CELL__POI:
        setPoi((Point)null);
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
      case LsjatlPackage.POPULATED_CELL__POI:
        return poi != null;
    }
    return super.eIsSet(featureID);
  }

} //PopulatedCellImpl
