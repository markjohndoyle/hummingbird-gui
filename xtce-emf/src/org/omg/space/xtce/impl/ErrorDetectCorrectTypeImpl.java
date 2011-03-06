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

import org.omg.space.xtce.CRCType;
import org.omg.space.xtce.ErrorDetectCorrectType;
import org.omg.space.xtce.ParityType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Detect Correct Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ErrorDetectCorrectTypeImpl#getParity <em>Parity</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ErrorDetectCorrectTypeImpl#getCRC <em>CRC</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorDetectCorrectTypeImpl extends EObjectImpl implements ErrorDetectCorrectType {
	/**
	 * The cached value of the '{@link #getParity() <em>Parity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParity()
	 * @generated
	 * @ordered
	 */
	protected ParityType parity;

	/**
	 * The cached value of the '{@link #getCRC() <em>CRC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRC()
	 * @generated
	 * @ordered
	 */
	protected CRCType cRC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorDetectCorrectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getErrorDetectCorrectType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParityType getParity() {
		return parity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParity(ParityType newParity, NotificationChain msgs) {
		ParityType oldParity = parity;
		parity = newParity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ERROR_DETECT_CORRECT_TYPE__PARITY, oldParity, newParity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParity(ParityType newParity) {
		if (newParity != parity) {
			NotificationChain msgs = null;
			if (parity != null)
				msgs = ((InternalEObject)parity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ERROR_DETECT_CORRECT_TYPE__PARITY, null, msgs);
			if (newParity != null)
				msgs = ((InternalEObject)newParity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ERROR_DETECT_CORRECT_TYPE__PARITY, null, msgs);
			msgs = basicSetParity(newParity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ERROR_DETECT_CORRECT_TYPE__PARITY, newParity, newParity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRCType getCRC() {
		return cRC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCRC(CRCType newCRC, NotificationChain msgs) {
		CRCType oldCRC = cRC;
		cRC = newCRC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ERROR_DETECT_CORRECT_TYPE__CRC, oldCRC, newCRC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCRC(CRCType newCRC) {
		if (newCRC != cRC) {
			NotificationChain msgs = null;
			if (cRC != null)
				msgs = ((InternalEObject)cRC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ERROR_DETECT_CORRECT_TYPE__CRC, null, msgs);
			if (newCRC != null)
				msgs = ((InternalEObject)newCRC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ERROR_DETECT_CORRECT_TYPE__CRC, null, msgs);
			msgs = basicSetCRC(newCRC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ERROR_DETECT_CORRECT_TYPE__CRC, newCRC, newCRC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.ERROR_DETECT_CORRECT_TYPE__PARITY:
				return basicSetParity(null, msgs);
			case XtcePackage.ERROR_DETECT_CORRECT_TYPE__CRC:
				return basicSetCRC(null, msgs);
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
			case XtcePackage.ERROR_DETECT_CORRECT_TYPE__PARITY:
				return getParity();
			case XtcePackage.ERROR_DETECT_CORRECT_TYPE__CRC:
				return getCRC();
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
			case XtcePackage.ERROR_DETECT_CORRECT_TYPE__PARITY:
				setParity((ParityType)newValue);
				return;
			case XtcePackage.ERROR_DETECT_CORRECT_TYPE__CRC:
				setCRC((CRCType)newValue);
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
			case XtcePackage.ERROR_DETECT_CORRECT_TYPE__PARITY:
				setParity((ParityType)null);
				return;
			case XtcePackage.ERROR_DETECT_CORRECT_TYPE__CRC:
				setCRC((CRCType)null);
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
			case XtcePackage.ERROR_DETECT_CORRECT_TYPE__PARITY:
				return parity != null;
			case XtcePackage.ERROR_DETECT_CORRECT_TYPE__CRC:
				return cRC != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorDetectCorrectTypeImpl
