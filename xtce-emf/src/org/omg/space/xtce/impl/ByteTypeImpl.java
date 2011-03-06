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

import org.omg.space.xtce.ByteType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Byte Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ByteTypeImpl#getByteSignificance <em>Byte Significance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ByteTypeImpl extends EObjectImpl implements ByteType {
	/**
	 * The default value of the '{@link #getByteSignificance() <em>Byte Significance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteSignificance()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BYTE_SIGNIFICANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByteSignificance() <em>Byte Significance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteSignificance()
	 * @generated
	 * @ordered
	 */
	protected BigInteger byteSignificance = BYTE_SIGNIFICANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ByteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getByteType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getByteSignificance() {
		return byteSignificance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteSignificance(BigInteger newByteSignificance) {
		BigInteger oldByteSignificance = byteSignificance;
		byteSignificance = newByteSignificance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BYTE_TYPE__BYTE_SIGNIFICANCE, oldByteSignificance, byteSignificance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.BYTE_TYPE__BYTE_SIGNIFICANCE:
				return getByteSignificance();
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
			case XtcePackage.BYTE_TYPE__BYTE_SIGNIFICANCE:
				setByteSignificance((BigInteger)newValue);
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
			case XtcePackage.BYTE_TYPE__BYTE_SIGNIFICANCE:
				setByteSignificance(BYTE_SIGNIFICANCE_EDEFAULT);
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
			case XtcePackage.BYTE_TYPE__BYTE_SIGNIFICANCE:
				return BYTE_SIGNIFICANCE_EDEFAULT == null ? byteSignificance != null : !BYTE_SIGNIFICANCE_EDEFAULT.equals(byteSignificance);
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
		result.append(" (byteSignificance: ");
		result.append(byteSignificance);
		result.append(')');
		return result.toString();
	}

} //ByteTypeImpl
