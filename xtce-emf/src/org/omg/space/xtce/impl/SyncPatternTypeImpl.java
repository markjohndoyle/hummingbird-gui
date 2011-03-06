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

import org.omg.space.xtce.SyncPatternType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sync Pattern Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.SyncPatternTypeImpl#getBitLocation <em>Bit Location</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SyncPatternTypeImpl#getMask <em>Mask</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SyncPatternTypeImpl#getMaskLengthInBits <em>Mask Length In Bits</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SyncPatternTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SyncPatternTypeImpl#getPatternLengthInBits <em>Pattern Length In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SyncPatternTypeImpl extends EObjectImpl implements SyncPatternType {
	/**
	 * The default value of the '{@link #getBitLocation() <em>Bit Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitLocation()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BIT_LOCATION_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getBitLocation() <em>Bit Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitLocation()
	 * @generated
	 * @ordered
	 */
	protected BigInteger bitLocation = BIT_LOCATION_EDEFAULT;

	/**
	 * This is true if the Bit Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bitLocationESet;

	/**
	 * The default value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected byte[] mask = MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskLengthInBits() <em>Mask Length In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskLengthInBits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MASK_LENGTH_IN_BITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskLengthInBits() <em>Mask Length In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskLengthInBits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maskLengthInBits = MASK_LENGTH_IN_BITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected byte[] pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPatternLengthInBits() <em>Pattern Length In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternLengthInBits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PATTERN_LENGTH_IN_BITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatternLengthInBits() <em>Pattern Length In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternLengthInBits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger patternLengthInBits = PATTERN_LENGTH_IN_BITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyncPatternTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getSyncPatternType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBitLocation() {
		return bitLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitLocation(BigInteger newBitLocation) {
		BigInteger oldBitLocation = bitLocation;
		bitLocation = newBitLocation;
		boolean oldBitLocationESet = bitLocationESet;
		bitLocationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SYNC_PATTERN_TYPE__BIT_LOCATION, oldBitLocation, bitLocation, !oldBitLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBitLocation() {
		BigInteger oldBitLocation = bitLocation;
		boolean oldBitLocationESet = bitLocationESet;
		bitLocation = BIT_LOCATION_EDEFAULT;
		bitLocationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.SYNC_PATTERN_TYPE__BIT_LOCATION, oldBitLocation, BIT_LOCATION_EDEFAULT, oldBitLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBitLocation() {
		return bitLocationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getMask() {
		return mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMask(byte[] newMask) {
		byte[] oldMask = mask;
		mask = newMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SYNC_PATTERN_TYPE__MASK, oldMask, mask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaskLengthInBits() {
		return maskLengthInBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaskLengthInBits(BigInteger newMaskLengthInBits) {
		BigInteger oldMaskLengthInBits = maskLengthInBits;
		maskLengthInBits = newMaskLengthInBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SYNC_PATTERN_TYPE__MASK_LENGTH_IN_BITS, oldMaskLengthInBits, maskLengthInBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(byte[] newPattern) {
		byte[] oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SYNC_PATTERN_TYPE__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPatternLengthInBits() {
		return patternLengthInBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternLengthInBits(BigInteger newPatternLengthInBits) {
		BigInteger oldPatternLengthInBits = patternLengthInBits;
		patternLengthInBits = newPatternLengthInBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SYNC_PATTERN_TYPE__PATTERN_LENGTH_IN_BITS, oldPatternLengthInBits, patternLengthInBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.SYNC_PATTERN_TYPE__BIT_LOCATION:
				return getBitLocation();
			case XtcePackage.SYNC_PATTERN_TYPE__MASK:
				return getMask();
			case XtcePackage.SYNC_PATTERN_TYPE__MASK_LENGTH_IN_BITS:
				return getMaskLengthInBits();
			case XtcePackage.SYNC_PATTERN_TYPE__PATTERN:
				return getPattern();
			case XtcePackage.SYNC_PATTERN_TYPE__PATTERN_LENGTH_IN_BITS:
				return getPatternLengthInBits();
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
			case XtcePackage.SYNC_PATTERN_TYPE__BIT_LOCATION:
				setBitLocation((BigInteger)newValue);
				return;
			case XtcePackage.SYNC_PATTERN_TYPE__MASK:
				setMask((byte[])newValue);
				return;
			case XtcePackage.SYNC_PATTERN_TYPE__MASK_LENGTH_IN_BITS:
				setMaskLengthInBits((BigInteger)newValue);
				return;
			case XtcePackage.SYNC_PATTERN_TYPE__PATTERN:
				setPattern((byte[])newValue);
				return;
			case XtcePackage.SYNC_PATTERN_TYPE__PATTERN_LENGTH_IN_BITS:
				setPatternLengthInBits((BigInteger)newValue);
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
			case XtcePackage.SYNC_PATTERN_TYPE__BIT_LOCATION:
				unsetBitLocation();
				return;
			case XtcePackage.SYNC_PATTERN_TYPE__MASK:
				setMask(MASK_EDEFAULT);
				return;
			case XtcePackage.SYNC_PATTERN_TYPE__MASK_LENGTH_IN_BITS:
				setMaskLengthInBits(MASK_LENGTH_IN_BITS_EDEFAULT);
				return;
			case XtcePackage.SYNC_PATTERN_TYPE__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case XtcePackage.SYNC_PATTERN_TYPE__PATTERN_LENGTH_IN_BITS:
				setPatternLengthInBits(PATTERN_LENGTH_IN_BITS_EDEFAULT);
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
			case XtcePackage.SYNC_PATTERN_TYPE__BIT_LOCATION:
				return isSetBitLocation();
			case XtcePackage.SYNC_PATTERN_TYPE__MASK:
				return MASK_EDEFAULT == null ? mask != null : !MASK_EDEFAULT.equals(mask);
			case XtcePackage.SYNC_PATTERN_TYPE__MASK_LENGTH_IN_BITS:
				return MASK_LENGTH_IN_BITS_EDEFAULT == null ? maskLengthInBits != null : !MASK_LENGTH_IN_BITS_EDEFAULT.equals(maskLengthInBits);
			case XtcePackage.SYNC_PATTERN_TYPE__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case XtcePackage.SYNC_PATTERN_TYPE__PATTERN_LENGTH_IN_BITS:
				return PATTERN_LENGTH_IN_BITS_EDEFAULT == null ? patternLengthInBits != null : !PATTERN_LENGTH_IN_BITS_EDEFAULT.equals(patternLengthInBits);
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
		result.append(" (bitLocation: ");
		if (bitLocationESet) result.append(bitLocation); else result.append("<unset>");
		result.append(", mask: ");
		result.append(mask);
		result.append(", maskLengthInBits: ");
		result.append(maskLengthInBits);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", patternLengthInBits: ");
		result.append(patternLengthInBits);
		result.append(')');
		return result.toString();
	}

} //SyncPatternTypeImpl
