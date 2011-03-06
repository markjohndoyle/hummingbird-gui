/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.DecimalValueType;
import org.omg.space.xtce.DynamicValueType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decimal Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.DecimalValueTypeImpl#getFixedValue <em>Fixed Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.DecimalValueTypeImpl#getDynamicValue <em>Dynamic Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecimalValueTypeImpl extends EObjectImpl implements DecimalValueType {
	/**
	 * The default value of the '{@link #getFixedValue() <em>Fixed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FIXED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixedValue() <em>Fixed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal fixedValue = FIXED_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDynamicValue() <em>Dynamic Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicValue()
	 * @generated
	 * @ordered
	 */
	protected DynamicValueType dynamicValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecimalValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getDecimalValueType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getFixedValue() {
		return fixedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedValue(BigDecimal newFixedValue) {
		BigDecimal oldFixedValue = fixedValue;
		fixedValue = newFixedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.DECIMAL_VALUE_TYPE__FIXED_VALUE, oldFixedValue, fixedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicValueType getDynamicValue() {
		return dynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicValue(DynamicValueType newDynamicValue, NotificationChain msgs) {
		DynamicValueType oldDynamicValue = dynamicValue;
		dynamicValue = newDynamicValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.DECIMAL_VALUE_TYPE__DYNAMIC_VALUE, oldDynamicValue, newDynamicValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicValue(DynamicValueType newDynamicValue) {
		if (newDynamicValue != dynamicValue) {
			NotificationChain msgs = null;
			if (dynamicValue != null)
				msgs = ((InternalEObject)dynamicValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DECIMAL_VALUE_TYPE__DYNAMIC_VALUE, null, msgs);
			if (newDynamicValue != null)
				msgs = ((InternalEObject)newDynamicValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DECIMAL_VALUE_TYPE__DYNAMIC_VALUE, null, msgs);
			msgs = basicSetDynamicValue(newDynamicValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.DECIMAL_VALUE_TYPE__DYNAMIC_VALUE, newDynamicValue, newDynamicValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.DECIMAL_VALUE_TYPE__DYNAMIC_VALUE:
				return basicSetDynamicValue(null, msgs);
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
			case XtcePackage.DECIMAL_VALUE_TYPE__FIXED_VALUE:
				return getFixedValue();
			case XtcePackage.DECIMAL_VALUE_TYPE__DYNAMIC_VALUE:
				return getDynamicValue();
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
			case XtcePackage.DECIMAL_VALUE_TYPE__FIXED_VALUE:
				setFixedValue((BigDecimal)newValue);
				return;
			case XtcePackage.DECIMAL_VALUE_TYPE__DYNAMIC_VALUE:
				setDynamicValue((DynamicValueType)newValue);
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
			case XtcePackage.DECIMAL_VALUE_TYPE__FIXED_VALUE:
				setFixedValue(FIXED_VALUE_EDEFAULT);
				return;
			case XtcePackage.DECIMAL_VALUE_TYPE__DYNAMIC_VALUE:
				setDynamicValue((DynamicValueType)null);
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
			case XtcePackage.DECIMAL_VALUE_TYPE__FIXED_VALUE:
				return FIXED_VALUE_EDEFAULT == null ? fixedValue != null : !FIXED_VALUE_EDEFAULT.equals(fixedValue);
			case XtcePackage.DECIMAL_VALUE_TYPE__DYNAMIC_VALUE:
				return dynamicValue != null;
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
		result.append(" (fixedValue: ");
		result.append(fixedValue);
		result.append(')');
		return result.toString();
	}

} //DecimalValueTypeImpl
