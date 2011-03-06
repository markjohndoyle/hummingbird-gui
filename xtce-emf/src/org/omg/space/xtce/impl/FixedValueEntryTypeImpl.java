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

import org.omg.space.xtce.FixedValueEntryType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Value Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.FixedValueEntryTypeImpl#getBinaryValue <em>Binary Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.FixedValueEntryTypeImpl#getSizeInBits <em>Size In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixedValueEntryTypeImpl extends SequenceEntryTypeImpl implements FixedValueEntryType {
	/**
	 * The default value of the '{@link #getBinaryValue() <em>Binary Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryValue()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BINARY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinaryValue() <em>Binary Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryValue()
	 * @generated
	 * @ordered
	 */
	protected byte[] binaryValue = BINARY_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeInBits() <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SIZE_IN_BITS_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedValueEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getFixedValueEntryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getBinaryValue() {
		return binaryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryValue(byte[] newBinaryValue) {
		byte[] oldBinaryValue = binaryValue;
		binaryValue = newBinaryValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FIXED_VALUE_ENTRY_TYPE__BINARY_VALUE, oldBinaryValue, binaryValue));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FIXED_VALUE_ENTRY_TYPE__SIZE_IN_BITS, oldSizeInBits, sizeInBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.FIXED_VALUE_ENTRY_TYPE__BINARY_VALUE:
				return getBinaryValue();
			case XtcePackage.FIXED_VALUE_ENTRY_TYPE__SIZE_IN_BITS:
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
			case XtcePackage.FIXED_VALUE_ENTRY_TYPE__BINARY_VALUE:
				setBinaryValue((byte[])newValue);
				return;
			case XtcePackage.FIXED_VALUE_ENTRY_TYPE__SIZE_IN_BITS:
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
			case XtcePackage.FIXED_VALUE_ENTRY_TYPE__BINARY_VALUE:
				setBinaryValue(BINARY_VALUE_EDEFAULT);
				return;
			case XtcePackage.FIXED_VALUE_ENTRY_TYPE__SIZE_IN_BITS:
				setSizeInBits(SIZE_IN_BITS_EDEFAULT);
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
			case XtcePackage.FIXED_VALUE_ENTRY_TYPE__BINARY_VALUE:
				return BINARY_VALUE_EDEFAULT == null ? binaryValue != null : !BINARY_VALUE_EDEFAULT.equals(binaryValue);
			case XtcePackage.FIXED_VALUE_ENTRY_TYPE__SIZE_IN_BITS:
				return SIZE_IN_BITS_EDEFAULT == null ? sizeInBits != null : !SIZE_IN_BITS_EDEFAULT.equals(sizeInBits);
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
		result.append(" (binaryValue: ");
		result.append(binaryValue);
		result.append(", sizeInBits: ");
		result.append(sizeInBits);
		result.append(')');
		return result.toString();
	}

} //FixedValueEntryTypeImpl
