/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.IntegerValueType;
import org.omg.space.xtce.LeadingSizeType;
import org.omg.space.xtce.SizeInBitsType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Size In Bits Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.SizeInBitsTypeImpl#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SizeInBitsTypeImpl#getTerminationChar <em>Termination Char</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SizeInBitsTypeImpl#getLeadingSize <em>Leading Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SizeInBitsTypeImpl extends EObjectImpl implements SizeInBitsType {
	/**
	 * The cached value of the '{@link #getFixed() <em>Fixed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed()
	 * @generated
	 * @ordered
	 */
	protected IntegerValueType fixed;

	/**
	 * The default value of the '{@link #getTerminationChar() <em>Termination Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationChar()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] TERMINATION_CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminationChar() <em>Termination Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationChar()
	 * @generated
	 * @ordered
	 */
	protected byte[] terminationChar = TERMINATION_CHAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeadingSize() <em>Leading Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeadingSize()
	 * @generated
	 * @ordered
	 */
	protected LeadingSizeType leadingSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SizeInBitsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getSizeInBitsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueType getFixed() {
		return fixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixed(IntegerValueType newFixed, NotificationChain msgs) {
		IntegerValueType oldFixed = fixed;
		fixed = newFixed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SIZE_IN_BITS_TYPE__FIXED, oldFixed, newFixed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixed(IntegerValueType newFixed) {
		if (newFixed != fixed) {
			NotificationChain msgs = null;
			if (fixed != null)
				msgs = ((InternalEObject)fixed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SIZE_IN_BITS_TYPE__FIXED, null, msgs);
			if (newFixed != null)
				msgs = ((InternalEObject)newFixed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SIZE_IN_BITS_TYPE__FIXED, null, msgs);
			msgs = basicSetFixed(newFixed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SIZE_IN_BITS_TYPE__FIXED, newFixed, newFixed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getTerminationChar() {
		return terminationChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminationChar(byte[] newTerminationChar) {
		byte[] oldTerminationChar = terminationChar;
		terminationChar = newTerminationChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SIZE_IN_BITS_TYPE__TERMINATION_CHAR, oldTerminationChar, terminationChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeadingSizeType getLeadingSize() {
		return leadingSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeadingSize(LeadingSizeType newLeadingSize, NotificationChain msgs) {
		LeadingSizeType oldLeadingSize = leadingSize;
		leadingSize = newLeadingSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SIZE_IN_BITS_TYPE__LEADING_SIZE, oldLeadingSize, newLeadingSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeadingSize(LeadingSizeType newLeadingSize) {
		if (newLeadingSize != leadingSize) {
			NotificationChain msgs = null;
			if (leadingSize != null)
				msgs = ((InternalEObject)leadingSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SIZE_IN_BITS_TYPE__LEADING_SIZE, null, msgs);
			if (newLeadingSize != null)
				msgs = ((InternalEObject)newLeadingSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SIZE_IN_BITS_TYPE__LEADING_SIZE, null, msgs);
			msgs = basicSetLeadingSize(newLeadingSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SIZE_IN_BITS_TYPE__LEADING_SIZE, newLeadingSize, newLeadingSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.SIZE_IN_BITS_TYPE__FIXED:
				return basicSetFixed(null, msgs);
			case XtcePackage.SIZE_IN_BITS_TYPE__LEADING_SIZE:
				return basicSetLeadingSize(null, msgs);
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
			case XtcePackage.SIZE_IN_BITS_TYPE__FIXED:
				return getFixed();
			case XtcePackage.SIZE_IN_BITS_TYPE__TERMINATION_CHAR:
				return getTerminationChar();
			case XtcePackage.SIZE_IN_BITS_TYPE__LEADING_SIZE:
				return getLeadingSize();
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
			case XtcePackage.SIZE_IN_BITS_TYPE__FIXED:
				setFixed((IntegerValueType)newValue);
				return;
			case XtcePackage.SIZE_IN_BITS_TYPE__TERMINATION_CHAR:
				setTerminationChar((byte[])newValue);
				return;
			case XtcePackage.SIZE_IN_BITS_TYPE__LEADING_SIZE:
				setLeadingSize((LeadingSizeType)newValue);
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
			case XtcePackage.SIZE_IN_BITS_TYPE__FIXED:
				setFixed((IntegerValueType)null);
				return;
			case XtcePackage.SIZE_IN_BITS_TYPE__TERMINATION_CHAR:
				setTerminationChar(TERMINATION_CHAR_EDEFAULT);
				return;
			case XtcePackage.SIZE_IN_BITS_TYPE__LEADING_SIZE:
				setLeadingSize((LeadingSizeType)null);
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
			case XtcePackage.SIZE_IN_BITS_TYPE__FIXED:
				return fixed != null;
			case XtcePackage.SIZE_IN_BITS_TYPE__TERMINATION_CHAR:
				return TERMINATION_CHAR_EDEFAULT == null ? terminationChar != null : !TERMINATION_CHAR_EDEFAULT.equals(terminationChar);
			case XtcePackage.SIZE_IN_BITS_TYPE__LEADING_SIZE:
				return leadingSize != null;
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
		result.append(" (terminationChar: ");
		result.append(terminationChar);
		result.append(')');
		return result.toString();
	}

} //SizeInBitsTypeImpl
