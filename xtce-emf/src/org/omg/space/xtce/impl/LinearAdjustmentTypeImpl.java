/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.LinearAdjustmentType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Adjustment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.LinearAdjustmentTypeImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.LinearAdjustmentTypeImpl#getSlope <em>Slope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinearAdjustmentTypeImpl extends EObjectImpl implements LinearAdjustmentType {
	/**
	 * The default value of the '{@link #getIntercept() <em>Intercept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntercept()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal INTERCEPT_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getIntercept() <em>Intercept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntercept()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal intercept = INTERCEPT_EDEFAULT;

	/**
	 * This is true if the Intercept attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interceptESet;

	/**
	 * The default value of the '{@link #getSlope() <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlope()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SLOPE_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getSlope() <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlope()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal slope = SLOPE_EDEFAULT;

	/**
	 * This is true if the Slope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean slopeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinearAdjustmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getLinearAdjustmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getIntercept() {
		return intercept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntercept(BigDecimal newIntercept) {
		BigDecimal oldIntercept = intercept;
		intercept = newIntercept;
		boolean oldInterceptESet = interceptESet;
		interceptESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.LINEAR_ADJUSTMENT_TYPE__INTERCEPT, oldIntercept, intercept, !oldInterceptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntercept() {
		BigDecimal oldIntercept = intercept;
		boolean oldInterceptESet = interceptESet;
		intercept = INTERCEPT_EDEFAULT;
		interceptESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.LINEAR_ADJUSTMENT_TYPE__INTERCEPT, oldIntercept, INTERCEPT_EDEFAULT, oldInterceptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntercept() {
		return interceptESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getSlope() {
		return slope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlope(BigDecimal newSlope) {
		BigDecimal oldSlope = slope;
		slope = newSlope;
		boolean oldSlopeESet = slopeESet;
		slopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.LINEAR_ADJUSTMENT_TYPE__SLOPE, oldSlope, slope, !oldSlopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSlope() {
		BigDecimal oldSlope = slope;
		boolean oldSlopeESet = slopeESet;
		slope = SLOPE_EDEFAULT;
		slopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.LINEAR_ADJUSTMENT_TYPE__SLOPE, oldSlope, SLOPE_EDEFAULT, oldSlopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSlope() {
		return slopeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.LINEAR_ADJUSTMENT_TYPE__INTERCEPT:
				return getIntercept();
			case XtcePackage.LINEAR_ADJUSTMENT_TYPE__SLOPE:
				return getSlope();
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
			case XtcePackage.LINEAR_ADJUSTMENT_TYPE__INTERCEPT:
				setIntercept((BigDecimal)newValue);
				return;
			case XtcePackage.LINEAR_ADJUSTMENT_TYPE__SLOPE:
				setSlope((BigDecimal)newValue);
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
			case XtcePackage.LINEAR_ADJUSTMENT_TYPE__INTERCEPT:
				unsetIntercept();
				return;
			case XtcePackage.LINEAR_ADJUSTMENT_TYPE__SLOPE:
				unsetSlope();
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
			case XtcePackage.LINEAR_ADJUSTMENT_TYPE__INTERCEPT:
				return isSetIntercept();
			case XtcePackage.LINEAR_ADJUSTMENT_TYPE__SLOPE:
				return isSetSlope();
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
		result.append(" (intercept: ");
		if (interceptESet) result.append(intercept); else result.append("<unset>");
		result.append(", slope: ");
		if (slopeESet) result.append(slope); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LinearAdjustmentTypeImpl
