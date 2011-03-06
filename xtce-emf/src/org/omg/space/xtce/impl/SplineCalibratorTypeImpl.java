/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.space.xtce.SplineCalibratorType;
import org.omg.space.xtce.SplinePointType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spline Calibrator Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.SplineCalibratorTypeImpl#getSplinePoint <em>Spline Point</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SplineCalibratorTypeImpl#isExtrapolate <em>Extrapolate</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SplineCalibratorTypeImpl#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SplineCalibratorTypeImpl extends EObjectImpl implements SplineCalibratorType {
	/**
	 * The cached value of the '{@link #getSplinePoint() <em>Spline Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplinePoint()
	 * @generated
	 * @ordered
	 */
	protected EList<SplinePointType> splinePoint;

	/**
	 * The default value of the '{@link #isExtrapolate() <em>Extrapolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtrapolate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTRAPOLATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExtrapolate() <em>Extrapolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtrapolate()
	 * @generated
	 * @ordered
	 */
	protected boolean extrapolate = EXTRAPOLATE_EDEFAULT;

	/**
	 * This is true if the Extrapolate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrapolateESet;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ORDER_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected BigInteger order = ORDER_EDEFAULT;

	/**
	 * This is true if the Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orderESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplineCalibratorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getSplineCalibratorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SplinePointType> getSplinePoint() {
		if (splinePoint == null) {
			splinePoint = new EObjectContainmentEList<SplinePointType>(SplinePointType.class, this, XtcePackage.SPLINE_CALIBRATOR_TYPE__SPLINE_POINT);
		}
		return splinePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExtrapolate() {
		return extrapolate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrapolate(boolean newExtrapolate) {
		boolean oldExtrapolate = extrapolate;
		extrapolate = newExtrapolate;
		boolean oldExtrapolateESet = extrapolateESet;
		extrapolateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SPLINE_CALIBRATOR_TYPE__EXTRAPOLATE, oldExtrapolate, extrapolate, !oldExtrapolateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrapolate() {
		boolean oldExtrapolate = extrapolate;
		boolean oldExtrapolateESet = extrapolateESet;
		extrapolate = EXTRAPOLATE_EDEFAULT;
		extrapolateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.SPLINE_CALIBRATOR_TYPE__EXTRAPOLATE, oldExtrapolate, EXTRAPOLATE_EDEFAULT, oldExtrapolateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrapolate() {
		return extrapolateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(BigInteger newOrder) {
		BigInteger oldOrder = order;
		order = newOrder;
		boolean oldOrderESet = orderESet;
		orderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SPLINE_CALIBRATOR_TYPE__ORDER, oldOrder, order, !oldOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrder() {
		BigInteger oldOrder = order;
		boolean oldOrderESet = orderESet;
		order = ORDER_EDEFAULT;
		orderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.SPLINE_CALIBRATOR_TYPE__ORDER, oldOrder, ORDER_EDEFAULT, oldOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrder() {
		return orderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.SPLINE_CALIBRATOR_TYPE__SPLINE_POINT:
				return ((InternalEList<?>)getSplinePoint()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.SPLINE_CALIBRATOR_TYPE__SPLINE_POINT:
				return getSplinePoint();
			case XtcePackage.SPLINE_CALIBRATOR_TYPE__EXTRAPOLATE:
				return isExtrapolate();
			case XtcePackage.SPLINE_CALIBRATOR_TYPE__ORDER:
				return getOrder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XtcePackage.SPLINE_CALIBRATOR_TYPE__SPLINE_POINT:
				getSplinePoint().clear();
				getSplinePoint().addAll((Collection<? extends SplinePointType>)newValue);
				return;
			case XtcePackage.SPLINE_CALIBRATOR_TYPE__EXTRAPOLATE:
				setExtrapolate((Boolean)newValue);
				return;
			case XtcePackage.SPLINE_CALIBRATOR_TYPE__ORDER:
				setOrder((BigInteger)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case XtcePackage.SPLINE_CALIBRATOR_TYPE__SPLINE_POINT:
				getSplinePoint().clear();
				return;
			case XtcePackage.SPLINE_CALIBRATOR_TYPE__EXTRAPOLATE:
				unsetExtrapolate();
				return;
			case XtcePackage.SPLINE_CALIBRATOR_TYPE__ORDER:
				unsetOrder();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XtcePackage.SPLINE_CALIBRATOR_TYPE__SPLINE_POINT:
				return splinePoint != null && !splinePoint.isEmpty();
			case XtcePackage.SPLINE_CALIBRATOR_TYPE__EXTRAPOLATE:
				return isSetExtrapolate();
			case XtcePackage.SPLINE_CALIBRATOR_TYPE__ORDER:
				return isSetOrder();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (extrapolate: ");
		if (extrapolateESet) result.append(extrapolate); else result.append("<unset>");
		result.append(", order: ");
		if (orderESet) result.append(order); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SplineCalibratorTypeImpl
