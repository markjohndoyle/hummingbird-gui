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

import org.omg.space.xtce.OffsetType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offset Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.OffsetTypeImpl#getOffsetSizeInBits <em>Offset Size In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OffsetTypeImpl extends IntegerValueTypeImpl implements OffsetType {
	/**
	 * The default value of the '{@link #getOffsetSizeInBits() <em>Offset Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetSizeInBits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OFFSET_SIZE_IN_BITS_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getOffsetSizeInBits() <em>Offset Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetSizeInBits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger offsetSizeInBits = OFFSET_SIZE_IN_BITS_EDEFAULT;

	/**
	 * This is true if the Offset Size In Bits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean offsetSizeInBitsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OffsetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getOffsetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOffsetSizeInBits() {
		return offsetSizeInBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetSizeInBits(BigInteger newOffsetSizeInBits) {
		BigInteger oldOffsetSizeInBits = offsetSizeInBits;
		offsetSizeInBits = newOffsetSizeInBits;
		boolean oldOffsetSizeInBitsESet = offsetSizeInBitsESet;
		offsetSizeInBitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.OFFSET_TYPE__OFFSET_SIZE_IN_BITS, oldOffsetSizeInBits, offsetSizeInBits, !oldOffsetSizeInBitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOffsetSizeInBits() {
		BigInteger oldOffsetSizeInBits = offsetSizeInBits;
		boolean oldOffsetSizeInBitsESet = offsetSizeInBitsESet;
		offsetSizeInBits = OFFSET_SIZE_IN_BITS_EDEFAULT;
		offsetSizeInBitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.OFFSET_TYPE__OFFSET_SIZE_IN_BITS, oldOffsetSizeInBits, OFFSET_SIZE_IN_BITS_EDEFAULT, oldOffsetSizeInBitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOffsetSizeInBits() {
		return offsetSizeInBitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.OFFSET_TYPE__OFFSET_SIZE_IN_BITS:
				return getOffsetSizeInBits();
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
			case XtcePackage.OFFSET_TYPE__OFFSET_SIZE_IN_BITS:
				setOffsetSizeInBits((BigInteger)newValue);
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
			case XtcePackage.OFFSET_TYPE__OFFSET_SIZE_IN_BITS:
				unsetOffsetSizeInBits();
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
			case XtcePackage.OFFSET_TYPE__OFFSET_SIZE_IN_BITS:
				return isSetOffsetSizeInBits();
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
		result.append(" (offsetSizeInBits: ");
		if (offsetSizeInBitsESet) result.append(offsetSizeInBits); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OffsetTypeImpl
