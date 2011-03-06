/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.CRCType;
import org.omg.space.xtce.PolynomialType;
import org.omg.space.xtce.ReferenceType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CRC Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.CRCTypeImpl#getPolynomial <em>Polynomial</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CRCTypeImpl#getBitsFromReference <em>Bits From Reference</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CRCTypeImpl#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CRCTypeImpl extends EObjectImpl implements CRCType {
	/**
	 * The cached value of the '{@link #getPolynomial() <em>Polynomial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolynomial()
	 * @generated
	 * @ordered
	 */
	protected PolynomialType polynomial;

	/**
	 * The default value of the '{@link #getBitsFromReference() <em>Bits From Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitsFromReference()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BITS_FROM_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBitsFromReference() <em>Bits From Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitsFromReference()
	 * @generated
	 * @ordered
	 */
	protected BigInteger bitsFromReference = BITS_FROM_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final ReferenceType REFERENCE_EDEFAULT = ReferenceType.START;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType reference = REFERENCE_EDEFAULT;

	/**
	 * This is true if the Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referenceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CRCTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getCRCType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolynomialType getPolynomial() {
		return polynomial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolynomial(PolynomialType newPolynomial, NotificationChain msgs) {
		PolynomialType oldPolynomial = polynomial;
		polynomial = newPolynomial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CRC_TYPE__POLYNOMIAL, oldPolynomial, newPolynomial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolynomial(PolynomialType newPolynomial) {
		if (newPolynomial != polynomial) {
			NotificationChain msgs = null;
			if (polynomial != null)
				msgs = ((InternalEObject)polynomial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CRC_TYPE__POLYNOMIAL, null, msgs);
			if (newPolynomial != null)
				msgs = ((InternalEObject)newPolynomial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CRC_TYPE__POLYNOMIAL, null, msgs);
			msgs = basicSetPolynomial(newPolynomial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CRC_TYPE__POLYNOMIAL, newPolynomial, newPolynomial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBitsFromReference() {
		return bitsFromReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitsFromReference(BigInteger newBitsFromReference) {
		BigInteger oldBitsFromReference = bitsFromReference;
		bitsFromReference = newBitsFromReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CRC_TYPE__BITS_FROM_REFERENCE, oldBitsFromReference, bitsFromReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(ReferenceType newReference) {
		ReferenceType oldReference = reference;
		reference = newReference == null ? REFERENCE_EDEFAULT : newReference;
		boolean oldReferenceESet = referenceESet;
		referenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CRC_TYPE__REFERENCE, oldReference, reference, !oldReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReference() {
		ReferenceType oldReference = reference;
		boolean oldReferenceESet = referenceESet;
		reference = REFERENCE_EDEFAULT;
		referenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.CRC_TYPE__REFERENCE, oldReference, REFERENCE_EDEFAULT, oldReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReference() {
		return referenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.CRC_TYPE__POLYNOMIAL:
				return basicSetPolynomial(null, msgs);
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
			case XtcePackage.CRC_TYPE__POLYNOMIAL:
				return getPolynomial();
			case XtcePackage.CRC_TYPE__BITS_FROM_REFERENCE:
				return getBitsFromReference();
			case XtcePackage.CRC_TYPE__REFERENCE:
				return getReference();
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
			case XtcePackage.CRC_TYPE__POLYNOMIAL:
				setPolynomial((PolynomialType)newValue);
				return;
			case XtcePackage.CRC_TYPE__BITS_FROM_REFERENCE:
				setBitsFromReference((BigInteger)newValue);
				return;
			case XtcePackage.CRC_TYPE__REFERENCE:
				setReference((ReferenceType)newValue);
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
			case XtcePackage.CRC_TYPE__POLYNOMIAL:
				setPolynomial((PolynomialType)null);
				return;
			case XtcePackage.CRC_TYPE__BITS_FROM_REFERENCE:
				setBitsFromReference(BITS_FROM_REFERENCE_EDEFAULT);
				return;
			case XtcePackage.CRC_TYPE__REFERENCE:
				unsetReference();
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
			case XtcePackage.CRC_TYPE__POLYNOMIAL:
				return polynomial != null;
			case XtcePackage.CRC_TYPE__BITS_FROM_REFERENCE:
				return BITS_FROM_REFERENCE_EDEFAULT == null ? bitsFromReference != null : !BITS_FROM_REFERENCE_EDEFAULT.equals(bitsFromReference);
			case XtcePackage.CRC_TYPE__REFERENCE:
				return isSetReference();
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
		result.append(" (bitsFromReference: ");
		result.append(bitsFromReference);
		result.append(", reference: ");
		if (referenceESet) result.append(reference); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CRCTypeImpl
