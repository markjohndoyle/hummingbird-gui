/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.BasisType;
import org.omg.space.xtce.RateInStreamType1;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rate In Stream Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.RateInStreamType1Impl#getBasis <em>Basis</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.RateInStreamType1Impl#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.RateInStreamType1Impl#getMinimumValue <em>Minimum Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RateInStreamType1Impl extends EObjectImpl implements RateInStreamType1 {
	/**
	 * The default value of the '{@link #getBasis() <em>Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasis()
	 * @generated
	 * @ordered
	 */
	protected static final BasisType BASIS_EDEFAULT = BasisType.PER_SECOND;

	/**
	 * The cached value of the '{@link #getBasis() <em>Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasis()
	 * @generated
	 * @ordered
	 */
	protected BasisType basis = BASIS_EDEFAULT;

	/**
	 * This is true if the Basis attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean basisESet;

	/**
	 * The default value of the '{@link #getMaximumValue() <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumValue() <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumValue()
	 * @generated
	 * @ordered
	 */
	protected double maximumValue = MAXIMUM_VALUE_EDEFAULT;

	/**
	 * This is true if the Maximum Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumValueESet;

	/**
	 * The default value of the '{@link #getMinimumValue() <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumValue() <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValue()
	 * @generated
	 * @ordered
	 */
	protected double minimumValue = MINIMUM_VALUE_EDEFAULT;

	/**
	 * This is true if the Minimum Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RateInStreamType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getRateInStreamType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisType getBasis() {
		return basis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasis(BasisType newBasis) {
		BasisType oldBasis = basis;
		basis = newBasis == null ? BASIS_EDEFAULT : newBasis;
		boolean oldBasisESet = basisESet;
		basisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.RATE_IN_STREAM_TYPE1__BASIS, oldBasis, basis, !oldBasisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBasis() {
		BasisType oldBasis = basis;
		boolean oldBasisESet = basisESet;
		basis = BASIS_EDEFAULT;
		basisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.RATE_IN_STREAM_TYPE1__BASIS, oldBasis, BASIS_EDEFAULT, oldBasisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBasis() {
		return basisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumValue() {
		return maximumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumValue(double newMaximumValue) {
		double oldMaximumValue = maximumValue;
		maximumValue = newMaximumValue;
		boolean oldMaximumValueESet = maximumValueESet;
		maximumValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.RATE_IN_STREAM_TYPE1__MAXIMUM_VALUE, oldMaximumValue, maximumValue, !oldMaximumValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumValue() {
		double oldMaximumValue = maximumValue;
		boolean oldMaximumValueESet = maximumValueESet;
		maximumValue = MAXIMUM_VALUE_EDEFAULT;
		maximumValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.RATE_IN_STREAM_TYPE1__MAXIMUM_VALUE, oldMaximumValue, MAXIMUM_VALUE_EDEFAULT, oldMaximumValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumValue() {
		return maximumValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumValue() {
		return minimumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumValue(double newMinimumValue) {
		double oldMinimumValue = minimumValue;
		minimumValue = newMinimumValue;
		boolean oldMinimumValueESet = minimumValueESet;
		minimumValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.RATE_IN_STREAM_TYPE1__MINIMUM_VALUE, oldMinimumValue, minimumValue, !oldMinimumValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumValue() {
		double oldMinimumValue = minimumValue;
		boolean oldMinimumValueESet = minimumValueESet;
		minimumValue = MINIMUM_VALUE_EDEFAULT;
		minimumValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.RATE_IN_STREAM_TYPE1__MINIMUM_VALUE, oldMinimumValue, MINIMUM_VALUE_EDEFAULT, oldMinimumValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumValue() {
		return minimumValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.RATE_IN_STREAM_TYPE1__BASIS:
				return getBasis();
			case XtcePackage.RATE_IN_STREAM_TYPE1__MAXIMUM_VALUE:
				return getMaximumValue();
			case XtcePackage.RATE_IN_STREAM_TYPE1__MINIMUM_VALUE:
				return getMinimumValue();
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
			case XtcePackage.RATE_IN_STREAM_TYPE1__BASIS:
				setBasis((BasisType)newValue);
				return;
			case XtcePackage.RATE_IN_STREAM_TYPE1__MAXIMUM_VALUE:
				setMaximumValue((Double)newValue);
				return;
			case XtcePackage.RATE_IN_STREAM_TYPE1__MINIMUM_VALUE:
				setMinimumValue((Double)newValue);
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
			case XtcePackage.RATE_IN_STREAM_TYPE1__BASIS:
				unsetBasis();
				return;
			case XtcePackage.RATE_IN_STREAM_TYPE1__MAXIMUM_VALUE:
				unsetMaximumValue();
				return;
			case XtcePackage.RATE_IN_STREAM_TYPE1__MINIMUM_VALUE:
				unsetMinimumValue();
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
			case XtcePackage.RATE_IN_STREAM_TYPE1__BASIS:
				return isSetBasis();
			case XtcePackage.RATE_IN_STREAM_TYPE1__MAXIMUM_VALUE:
				return isSetMaximumValue();
			case XtcePackage.RATE_IN_STREAM_TYPE1__MINIMUM_VALUE:
				return isSetMinimumValue();
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
		result.append(" (basis: ");
		if (basisESet) result.append(basis); else result.append("<unset>");
		result.append(", maximumValue: ");
		if (maximumValueESet) result.append(maximumValue); else result.append("<unset>");
		result.append(", minimumValue: ");
		if (minimumValueESet) result.append(minimumValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RateInStreamType1Impl
