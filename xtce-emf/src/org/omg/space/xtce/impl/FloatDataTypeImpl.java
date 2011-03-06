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

import org.omg.space.xtce.FloatDataType;
import org.omg.space.xtce.SizeInBitsType1;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.FloatDataTypeImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.FloatDataTypeImpl#getSizeInBits <em>Size In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FloatDataTypeImpl extends NumericDataTypeImpl implements FloatDataType {
	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal INITIAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal initialValue = INITIAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeInBits() <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBits()
	 * @generated
	 * @ordered
	 */
	protected static final SizeInBitsType1 SIZE_IN_BITS_EDEFAULT = SizeInBitsType1._32;

	/**
	 * The cached value of the '{@link #getSizeInBits() <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBits()
	 * @generated
	 * @ordered
	 */
	protected SizeInBitsType1 sizeInBits = SIZE_IN_BITS_EDEFAULT;

	/**
	 * This is true if the Size In Bits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeInBitsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getFloatDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(BigDecimal newInitialValue) {
		BigDecimal oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FLOAT_DATA_TYPE__INITIAL_VALUE, oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeInBitsType1 getSizeInBits() {
		return sizeInBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInBits(SizeInBitsType1 newSizeInBits) {
		SizeInBitsType1 oldSizeInBits = sizeInBits;
		sizeInBits = newSizeInBits == null ? SIZE_IN_BITS_EDEFAULT : newSizeInBits;
		boolean oldSizeInBitsESet = sizeInBitsESet;
		sizeInBitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FLOAT_DATA_TYPE__SIZE_IN_BITS, oldSizeInBits, sizeInBits, !oldSizeInBitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSizeInBits() {
		SizeInBitsType1 oldSizeInBits = sizeInBits;
		boolean oldSizeInBitsESet = sizeInBitsESet;
		sizeInBits = SIZE_IN_BITS_EDEFAULT;
		sizeInBitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.FLOAT_DATA_TYPE__SIZE_IN_BITS, oldSizeInBits, SIZE_IN_BITS_EDEFAULT, oldSizeInBitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSizeInBits() {
		return sizeInBitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.FLOAT_DATA_TYPE__INITIAL_VALUE:
				return getInitialValue();
			case XtcePackage.FLOAT_DATA_TYPE__SIZE_IN_BITS:
				return getSizeInBits();
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
			case XtcePackage.FLOAT_DATA_TYPE__INITIAL_VALUE:
				setInitialValue((BigDecimal)newValue);
				return;
			case XtcePackage.FLOAT_DATA_TYPE__SIZE_IN_BITS:
				setSizeInBits((SizeInBitsType1)newValue);
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
			case XtcePackage.FLOAT_DATA_TYPE__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
			case XtcePackage.FLOAT_DATA_TYPE__SIZE_IN_BITS:
				unsetSizeInBits();
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
			case XtcePackage.FLOAT_DATA_TYPE__INITIAL_VALUE:
				return INITIAL_VALUE_EDEFAULT == null ? initialValue != null : !INITIAL_VALUE_EDEFAULT.equals(initialValue);
			case XtcePackage.FLOAT_DATA_TYPE__SIZE_IN_BITS:
				return isSetSizeInBits();
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
		result.append(" (initialValue: ");
		result.append(initialValue);
		result.append(", sizeInBits: ");
		if (sizeInBitsESet) result.append(sizeInBits); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FloatDataTypeImpl
