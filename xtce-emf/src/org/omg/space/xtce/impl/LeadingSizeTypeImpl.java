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

import org.omg.space.xtce.LeadingSizeType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leading Size Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.LeadingSizeTypeImpl#getSizeInBitsOfSizeTag <em>Size In Bits Of Size Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeadingSizeTypeImpl extends EObjectImpl implements LeadingSizeType {
	/**
	 * The default value of the '{@link #getSizeInBitsOfSizeTag() <em>Size In Bits Of Size Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBitsOfSizeTag()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SIZE_IN_BITS_OF_SIZE_TAG_EDEFAULT = new BigInteger("16");

	/**
	 * The cached value of the '{@link #getSizeInBitsOfSizeTag() <em>Size In Bits Of Size Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBitsOfSizeTag()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sizeInBitsOfSizeTag = SIZE_IN_BITS_OF_SIZE_TAG_EDEFAULT;

	/**
	 * This is true if the Size In Bits Of Size Tag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeInBitsOfSizeTagESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeadingSizeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getLeadingSizeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSizeInBitsOfSizeTag() {
		return sizeInBitsOfSizeTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInBitsOfSizeTag(BigInteger newSizeInBitsOfSizeTag) {
		BigInteger oldSizeInBitsOfSizeTag = sizeInBitsOfSizeTag;
		sizeInBitsOfSizeTag = newSizeInBitsOfSizeTag;
		boolean oldSizeInBitsOfSizeTagESet = sizeInBitsOfSizeTagESet;
		sizeInBitsOfSizeTagESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.LEADING_SIZE_TYPE__SIZE_IN_BITS_OF_SIZE_TAG, oldSizeInBitsOfSizeTag, sizeInBitsOfSizeTag, !oldSizeInBitsOfSizeTagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSizeInBitsOfSizeTag() {
		BigInteger oldSizeInBitsOfSizeTag = sizeInBitsOfSizeTag;
		boolean oldSizeInBitsOfSizeTagESet = sizeInBitsOfSizeTagESet;
		sizeInBitsOfSizeTag = SIZE_IN_BITS_OF_SIZE_TAG_EDEFAULT;
		sizeInBitsOfSizeTagESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.LEADING_SIZE_TYPE__SIZE_IN_BITS_OF_SIZE_TAG, oldSizeInBitsOfSizeTag, SIZE_IN_BITS_OF_SIZE_TAG_EDEFAULT, oldSizeInBitsOfSizeTagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSizeInBitsOfSizeTag() {
		return sizeInBitsOfSizeTagESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.LEADING_SIZE_TYPE__SIZE_IN_BITS_OF_SIZE_TAG:
				return getSizeInBitsOfSizeTag();
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
			case XtcePackage.LEADING_SIZE_TYPE__SIZE_IN_BITS_OF_SIZE_TAG:
				setSizeInBitsOfSizeTag((BigInteger)newValue);
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
			case XtcePackage.LEADING_SIZE_TYPE__SIZE_IN_BITS_OF_SIZE_TAG:
				unsetSizeInBitsOfSizeTag();
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
			case XtcePackage.LEADING_SIZE_TYPE__SIZE_IN_BITS_OF_SIZE_TAG:
				return isSetSizeInBitsOfSizeTag();
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
		result.append(" (sizeInBitsOfSizeTag: ");
		if (sizeInBitsOfSizeTagESet) result.append(sizeInBitsOfSizeTag); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LeadingSizeTypeImpl
