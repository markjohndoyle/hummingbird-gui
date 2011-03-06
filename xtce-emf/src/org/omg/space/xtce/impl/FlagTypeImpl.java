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

import org.omg.space.xtce.FlagBitTypeType;
import org.omg.space.xtce.FlagType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flag Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.FlagTypeImpl#getFlagBitType <em>Flag Bit Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.FlagTypeImpl#getFlagSizeInBits <em>Flag Size In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlagTypeImpl extends EObjectImpl implements FlagType {
	/**
	 * The default value of the '{@link #getFlagBitType() <em>Flag Bit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlagBitType()
	 * @generated
	 * @ordered
	 */
	protected static final FlagBitTypeType FLAG_BIT_TYPE_EDEFAULT = FlagBitTypeType.ONES;

	/**
	 * The cached value of the '{@link #getFlagBitType() <em>Flag Bit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlagBitType()
	 * @generated
	 * @ordered
	 */
	protected FlagBitTypeType flagBitType = FLAG_BIT_TYPE_EDEFAULT;

	/**
	 * This is true if the Flag Bit Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flagBitTypeESet;

	/**
	 * The default value of the '{@link #getFlagSizeInBits() <em>Flag Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlagSizeInBits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FLAG_SIZE_IN_BITS_EDEFAULT = new BigInteger("6");

	/**
	 * The cached value of the '{@link #getFlagSizeInBits() <em>Flag Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlagSizeInBits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger flagSizeInBits = FLAG_SIZE_IN_BITS_EDEFAULT;

	/**
	 * This is true if the Flag Size In Bits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flagSizeInBitsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlagTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getFlagType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagBitTypeType getFlagBitType() {
		return flagBitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlagBitType(FlagBitTypeType newFlagBitType) {
		FlagBitTypeType oldFlagBitType = flagBitType;
		flagBitType = newFlagBitType == null ? FLAG_BIT_TYPE_EDEFAULT : newFlagBitType;
		boolean oldFlagBitTypeESet = flagBitTypeESet;
		flagBitTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FLAG_TYPE__FLAG_BIT_TYPE, oldFlagBitType, flagBitType, !oldFlagBitTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlagBitType() {
		FlagBitTypeType oldFlagBitType = flagBitType;
		boolean oldFlagBitTypeESet = flagBitTypeESet;
		flagBitType = FLAG_BIT_TYPE_EDEFAULT;
		flagBitTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.FLAG_TYPE__FLAG_BIT_TYPE, oldFlagBitType, FLAG_BIT_TYPE_EDEFAULT, oldFlagBitTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlagBitType() {
		return flagBitTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFlagSizeInBits() {
		return flagSizeInBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlagSizeInBits(BigInteger newFlagSizeInBits) {
		BigInteger oldFlagSizeInBits = flagSizeInBits;
		flagSizeInBits = newFlagSizeInBits;
		boolean oldFlagSizeInBitsESet = flagSizeInBitsESet;
		flagSizeInBitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FLAG_TYPE__FLAG_SIZE_IN_BITS, oldFlagSizeInBits, flagSizeInBits, !oldFlagSizeInBitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlagSizeInBits() {
		BigInteger oldFlagSizeInBits = flagSizeInBits;
		boolean oldFlagSizeInBitsESet = flagSizeInBitsESet;
		flagSizeInBits = FLAG_SIZE_IN_BITS_EDEFAULT;
		flagSizeInBitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.FLAG_TYPE__FLAG_SIZE_IN_BITS, oldFlagSizeInBits, FLAG_SIZE_IN_BITS_EDEFAULT, oldFlagSizeInBitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlagSizeInBits() {
		return flagSizeInBitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.FLAG_TYPE__FLAG_BIT_TYPE:
				return getFlagBitType();
			case XtcePackage.FLAG_TYPE__FLAG_SIZE_IN_BITS:
				return getFlagSizeInBits();
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
			case XtcePackage.FLAG_TYPE__FLAG_BIT_TYPE:
				setFlagBitType((FlagBitTypeType)newValue);
				return;
			case XtcePackage.FLAG_TYPE__FLAG_SIZE_IN_BITS:
				setFlagSizeInBits((BigInteger)newValue);
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
			case XtcePackage.FLAG_TYPE__FLAG_BIT_TYPE:
				unsetFlagBitType();
				return;
			case XtcePackage.FLAG_TYPE__FLAG_SIZE_IN_BITS:
				unsetFlagSizeInBits();
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
			case XtcePackage.FLAG_TYPE__FLAG_BIT_TYPE:
				return isSetFlagBitType();
			case XtcePackage.FLAG_TYPE__FLAG_SIZE_IN_BITS:
				return isSetFlagSizeInBits();
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
		result.append(" (flagBitType: ");
		if (flagBitTypeESet) result.append(flagBitType); else result.append("<unset>");
		result.append(", flagSizeInBits: ");
		if (flagSizeInBitsESet) result.append(flagSizeInBits); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FlagTypeImpl
