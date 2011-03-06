/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.SplinePointType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spline Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.SplinePointTypeImpl#getCalibrated <em>Calibrated</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SplinePointTypeImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SplinePointTypeImpl#getRaw <em>Raw</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SplinePointTypeImpl extends EObjectImpl implements SplinePointType {
	/**
	 * The default value of the '{@link #getCalibrated() <em>Calibrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibrated()
	 * @generated
	 * @ordered
	 */
	protected static final double CALIBRATED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCalibrated() <em>Calibrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibrated()
	 * @generated
	 * @ordered
	 */
	protected double calibrated = CALIBRATED_EDEFAULT;

	/**
	 * This is true if the Calibrated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean calibratedESet;

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
	 * The default value of the '{@link #getRaw() <em>Raw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaw()
	 * @generated
	 * @ordered
	 */
	protected static final double RAW_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRaw() <em>Raw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaw()
	 * @generated
	 * @ordered
	 */
	protected double raw = RAW_EDEFAULT;

	/**
	 * This is true if the Raw attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rawESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplinePointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getSplinePointType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCalibrated() {
		return calibrated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalibrated(double newCalibrated) {
		double oldCalibrated = calibrated;
		calibrated = newCalibrated;
		boolean oldCalibratedESet = calibratedESet;
		calibratedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SPLINE_POINT_TYPE__CALIBRATED, oldCalibrated, calibrated, !oldCalibratedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCalibrated() {
		double oldCalibrated = calibrated;
		boolean oldCalibratedESet = calibratedESet;
		calibrated = CALIBRATED_EDEFAULT;
		calibratedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.SPLINE_POINT_TYPE__CALIBRATED, oldCalibrated, CALIBRATED_EDEFAULT, oldCalibratedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCalibrated() {
		return calibratedESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SPLINE_POINT_TYPE__ORDER, oldOrder, order, !oldOrderESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.SPLINE_POINT_TYPE__ORDER, oldOrder, ORDER_EDEFAULT, oldOrderESet));
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
	public double getRaw() {
		return raw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaw(double newRaw) {
		double oldRaw = raw;
		raw = newRaw;
		boolean oldRawESet = rawESet;
		rawESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SPLINE_POINT_TYPE__RAW, oldRaw, raw, !oldRawESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRaw() {
		double oldRaw = raw;
		boolean oldRawESet = rawESet;
		raw = RAW_EDEFAULT;
		rawESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.SPLINE_POINT_TYPE__RAW, oldRaw, RAW_EDEFAULT, oldRawESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRaw() {
		return rawESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.SPLINE_POINT_TYPE__CALIBRATED:
				return getCalibrated();
			case XtcePackage.SPLINE_POINT_TYPE__ORDER:
				return getOrder();
			case XtcePackage.SPLINE_POINT_TYPE__RAW:
				return getRaw();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XtcePackage.SPLINE_POINT_TYPE__CALIBRATED:
				setCalibrated((Double)newValue);
				return;
			case XtcePackage.SPLINE_POINT_TYPE__ORDER:
				setOrder((BigInteger)newValue);
				return;
			case XtcePackage.SPLINE_POINT_TYPE__RAW:
				setRaw((Double)newValue);
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
			case XtcePackage.SPLINE_POINT_TYPE__CALIBRATED:
				unsetCalibrated();
				return;
			case XtcePackage.SPLINE_POINT_TYPE__ORDER:
				unsetOrder();
				return;
			case XtcePackage.SPLINE_POINT_TYPE__RAW:
				unsetRaw();
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
			case XtcePackage.SPLINE_POINT_TYPE__CALIBRATED:
				return isSetCalibrated();
			case XtcePackage.SPLINE_POINT_TYPE__ORDER:
				return isSetOrder();
			case XtcePackage.SPLINE_POINT_TYPE__RAW:
				return isSetRaw();
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
		result.append(" (calibrated: ");
		if (calibratedESet) result.append(calibrated); else result.append("<unset>");
		result.append(", order: ");
		if (orderESet) result.append(order); else result.append("<unset>");
		result.append(", raw: ");
		if (rawESet) result.append(raw); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SplinePointTypeImpl
