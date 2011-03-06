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

import org.omg.space.xtce.IntegerDataType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.IntegerDataTypeImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.IntegerDataTypeImpl#isSigned <em>Signed</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.IntegerDataTypeImpl#getSizeInBits <em>Size In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerDataTypeImpl extends NumericDataTypeImpl implements IntegerDataType {
	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INITIAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger initialValue = INITIAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSigned() <em>Signed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSigned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIGNED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSigned() <em>Signed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSigned()
	 * @generated
	 * @ordered
	 */
	protected boolean signed = SIGNED_EDEFAULT;

	/**
	 * This is true if the Signed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signedESet;

	/**
	 * The default value of the '{@link #getSizeInBits() <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SIZE_IN_BITS_EDEFAULT = new BigInteger("32");

	/**
	 * The cached value of the '{@link #getSizeInBits() <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sizeInBits = SIZE_IN_BITS_EDEFAULT;

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
	protected IntegerDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getIntegerDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(BigInteger newInitialValue) {
		BigInteger oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INTEGER_DATA_TYPE__INITIAL_VALUE, oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSigned() {
		return signed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSigned(boolean newSigned) {
		boolean oldSigned = signed;
		signed = newSigned;
		boolean oldSignedESet = signedESet;
		signedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INTEGER_DATA_TYPE__SIGNED, oldSigned, signed, !oldSignedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSigned() {
		boolean oldSigned = signed;
		boolean oldSignedESet = signedESet;
		signed = SIGNED_EDEFAULT;
		signedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.INTEGER_DATA_TYPE__SIGNED, oldSigned, SIGNED_EDEFAULT, oldSignedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSigned() {
		return signedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSizeInBits() {
		return sizeInBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInBits(BigInteger newSizeInBits) {
		BigInteger oldSizeInBits = sizeInBits;
		sizeInBits = newSizeInBits;
		boolean oldSizeInBitsESet = sizeInBitsESet;
		sizeInBitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INTEGER_DATA_TYPE__SIZE_IN_BITS, oldSizeInBits, sizeInBits, !oldSizeInBitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSizeInBits() {
		BigInteger oldSizeInBits = sizeInBits;
		boolean oldSizeInBitsESet = sizeInBitsESet;
		sizeInBits = SIZE_IN_BITS_EDEFAULT;
		sizeInBitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.INTEGER_DATA_TYPE__SIZE_IN_BITS, oldSizeInBits, SIZE_IN_BITS_EDEFAULT, oldSizeInBitsESet));
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
			case XtcePackage.INTEGER_DATA_TYPE__INITIAL_VALUE:
				return getInitialValue();
			case XtcePackage.INTEGER_DATA_TYPE__SIGNED:
				return isSigned();
			case XtcePackage.INTEGER_DATA_TYPE__SIZE_IN_BITS:
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
			case XtcePackage.INTEGER_DATA_TYPE__INITIAL_VALUE:
				setInitialValue((BigInteger)newValue);
				return;
			case XtcePackage.INTEGER_DATA_TYPE__SIGNED:
				setSigned((Boolean)newValue);
				return;
			case XtcePackage.INTEGER_DATA_TYPE__SIZE_IN_BITS:
				setSizeInBits((BigInteger)newValue);
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
			case XtcePackage.INTEGER_DATA_TYPE__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
			case XtcePackage.INTEGER_DATA_TYPE__SIGNED:
				unsetSigned();
				return;
			case XtcePackage.INTEGER_DATA_TYPE__SIZE_IN_BITS:
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
			case XtcePackage.INTEGER_DATA_TYPE__INITIAL_VALUE:
				return INITIAL_VALUE_EDEFAULT == null ? initialValue != null : !INITIAL_VALUE_EDEFAULT.equals(initialValue);
			case XtcePackage.INTEGER_DATA_TYPE__SIGNED:
				return isSetSigned();
			case XtcePackage.INTEGER_DATA_TYPE__SIZE_IN_BITS:
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
		result.append(", signed: ");
		if (signedESet) result.append(signed); else result.append("<unset>");
		result.append(", sizeInBits: ");
		if (sizeInBitsESet) result.append(sizeInBits); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IntegerDataTypeImpl
