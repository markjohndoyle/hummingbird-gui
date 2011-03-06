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

import org.omg.space.xtce.BaseTimeDataType;
import org.omg.space.xtce.EncodingType1;
import org.omg.space.xtce.ReferenceTimeType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Time Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.BaseTimeDataTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.BaseTimeDataTypeImpl#getReferenceTime <em>Reference Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BaseTimeDataTypeImpl extends NameDescriptionTypeImpl implements BaseTimeDataType {
	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected EncodingType1 encoding;

	/**
	 * The cached value of the '{@link #getReferenceTime() <em>Reference Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceTime()
	 * @generated
	 * @ordered
	 */
	protected ReferenceTimeType referenceTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseTimeDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getBaseTimeDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodingType1 getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncoding(EncodingType1 newEncoding, NotificationChain msgs) {
		EncodingType1 oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_TIME_DATA_TYPE__ENCODING, oldEncoding, newEncoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(EncodingType1 newEncoding) {
		if (newEncoding != encoding) {
			NotificationChain msgs = null;
			if (encoding != null)
				msgs = ((InternalEObject)encoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_TIME_DATA_TYPE__ENCODING, null, msgs);
			if (newEncoding != null)
				msgs = ((InternalEObject)newEncoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_TIME_DATA_TYPE__ENCODING, null, msgs);
			msgs = basicSetEncoding(newEncoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_TIME_DATA_TYPE__ENCODING, newEncoding, newEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceTimeType getReferenceTime() {
		return referenceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceTime(ReferenceTimeType newReferenceTime, NotificationChain msgs) {
		ReferenceTimeType oldReferenceTime = referenceTime;
		referenceTime = newReferenceTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_TIME_DATA_TYPE__REFERENCE_TIME, oldReferenceTime, newReferenceTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceTime(ReferenceTimeType newReferenceTime) {
		if (newReferenceTime != referenceTime) {
			NotificationChain msgs = null;
			if (referenceTime != null)
				msgs = ((InternalEObject)referenceTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_TIME_DATA_TYPE__REFERENCE_TIME, null, msgs);
			if (newReferenceTime != null)
				msgs = ((InternalEObject)newReferenceTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_TIME_DATA_TYPE__REFERENCE_TIME, null, msgs);
			msgs = basicSetReferenceTime(newReferenceTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_TIME_DATA_TYPE__REFERENCE_TIME, newReferenceTime, newReferenceTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.BASE_TIME_DATA_TYPE__ENCODING:
				return basicSetEncoding(null, msgs);
			case XtcePackage.BASE_TIME_DATA_TYPE__REFERENCE_TIME:
				return basicSetReferenceTime(null, msgs);
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
			case XtcePackage.BASE_TIME_DATA_TYPE__ENCODING:
				return getEncoding();
			case XtcePackage.BASE_TIME_DATA_TYPE__REFERENCE_TIME:
				return getReferenceTime();
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
			case XtcePackage.BASE_TIME_DATA_TYPE__ENCODING:
				setEncoding((EncodingType1)newValue);
				return;
			case XtcePackage.BASE_TIME_DATA_TYPE__REFERENCE_TIME:
				setReferenceTime((ReferenceTimeType)newValue);
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
			case XtcePackage.BASE_TIME_DATA_TYPE__ENCODING:
				setEncoding((EncodingType1)null);
				return;
			case XtcePackage.BASE_TIME_DATA_TYPE__REFERENCE_TIME:
				setReferenceTime((ReferenceTimeType)null);
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
			case XtcePackage.BASE_TIME_DATA_TYPE__ENCODING:
				return encoding != null;
			case XtcePackage.BASE_TIME_DATA_TYPE__REFERENCE_TIME:
				return referenceTime != null;
		}
		return super.eIsSet(featureID);
	}

} //BaseTimeDataTypeImpl
