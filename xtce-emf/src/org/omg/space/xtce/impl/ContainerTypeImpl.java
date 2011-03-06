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

import org.omg.space.xtce.BinaryDataEncodingType;
import org.omg.space.xtce.ContainerType;
import org.omg.space.xtce.RateInStreamSetType;
import org.omg.space.xtce.RateInStreamType1;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ContainerTypeImpl#getDefaultRateInStream <em>Default Rate In Stream</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ContainerTypeImpl#getRateInStreamSet <em>Rate In Stream Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ContainerTypeImpl#getBinaryEncoding <em>Binary Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContainerTypeImpl extends NameDescriptionTypeImpl implements ContainerType {
	/**
	 * The cached value of the '{@link #getDefaultRateInStream() <em>Default Rate In Stream</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRateInStream()
	 * @generated
	 * @ordered
	 */
	protected RateInStreamType1 defaultRateInStream;

	/**
	 * The cached value of the '{@link #getRateInStreamSet() <em>Rate In Stream Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateInStreamSet()
	 * @generated
	 * @ordered
	 */
	protected RateInStreamSetType rateInStreamSet;

	/**
	 * The cached value of the '{@link #getBinaryEncoding() <em>Binary Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryEncoding()
	 * @generated
	 * @ordered
	 */
	protected BinaryDataEncodingType binaryEncoding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getContainerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateInStreamType1 getDefaultRateInStream() {
		return defaultRateInStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultRateInStream(RateInStreamType1 newDefaultRateInStream, NotificationChain msgs) {
		RateInStreamType1 oldDefaultRateInStream = defaultRateInStream;
		defaultRateInStream = newDefaultRateInStream;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CONTAINER_TYPE__DEFAULT_RATE_IN_STREAM, oldDefaultRateInStream, newDefaultRateInStream);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultRateInStream(RateInStreamType1 newDefaultRateInStream) {
		if (newDefaultRateInStream != defaultRateInStream) {
			NotificationChain msgs = null;
			if (defaultRateInStream != null)
				msgs = ((InternalEObject)defaultRateInStream).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTAINER_TYPE__DEFAULT_RATE_IN_STREAM, null, msgs);
			if (newDefaultRateInStream != null)
				msgs = ((InternalEObject)newDefaultRateInStream).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTAINER_TYPE__DEFAULT_RATE_IN_STREAM, null, msgs);
			msgs = basicSetDefaultRateInStream(newDefaultRateInStream, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CONTAINER_TYPE__DEFAULT_RATE_IN_STREAM, newDefaultRateInStream, newDefaultRateInStream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateInStreamSetType getRateInStreamSet() {
		return rateInStreamSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateInStreamSet(RateInStreamSetType newRateInStreamSet, NotificationChain msgs) {
		RateInStreamSetType oldRateInStreamSet = rateInStreamSet;
		rateInStreamSet = newRateInStreamSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CONTAINER_TYPE__RATE_IN_STREAM_SET, oldRateInStreamSet, newRateInStreamSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateInStreamSet(RateInStreamSetType newRateInStreamSet) {
		if (newRateInStreamSet != rateInStreamSet) {
			NotificationChain msgs = null;
			if (rateInStreamSet != null)
				msgs = ((InternalEObject)rateInStreamSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTAINER_TYPE__RATE_IN_STREAM_SET, null, msgs);
			if (newRateInStreamSet != null)
				msgs = ((InternalEObject)newRateInStreamSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTAINER_TYPE__RATE_IN_STREAM_SET, null, msgs);
			msgs = basicSetRateInStreamSet(newRateInStreamSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CONTAINER_TYPE__RATE_IN_STREAM_SET, newRateInStreamSet, newRateInStreamSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryDataEncodingType getBinaryEncoding() {
		return binaryEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryEncoding(BinaryDataEncodingType newBinaryEncoding, NotificationChain msgs) {
		BinaryDataEncodingType oldBinaryEncoding = binaryEncoding;
		binaryEncoding = newBinaryEncoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CONTAINER_TYPE__BINARY_ENCODING, oldBinaryEncoding, newBinaryEncoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryEncoding(BinaryDataEncodingType newBinaryEncoding) {
		if (newBinaryEncoding != binaryEncoding) {
			NotificationChain msgs = null;
			if (binaryEncoding != null)
				msgs = ((InternalEObject)binaryEncoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTAINER_TYPE__BINARY_ENCODING, null, msgs);
			if (newBinaryEncoding != null)
				msgs = ((InternalEObject)newBinaryEncoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTAINER_TYPE__BINARY_ENCODING, null, msgs);
			msgs = basicSetBinaryEncoding(newBinaryEncoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CONTAINER_TYPE__BINARY_ENCODING, newBinaryEncoding, newBinaryEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.CONTAINER_TYPE__DEFAULT_RATE_IN_STREAM:
				return basicSetDefaultRateInStream(null, msgs);
			case XtcePackage.CONTAINER_TYPE__RATE_IN_STREAM_SET:
				return basicSetRateInStreamSet(null, msgs);
			case XtcePackage.CONTAINER_TYPE__BINARY_ENCODING:
				return basicSetBinaryEncoding(null, msgs);
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
			case XtcePackage.CONTAINER_TYPE__DEFAULT_RATE_IN_STREAM:
				return getDefaultRateInStream();
			case XtcePackage.CONTAINER_TYPE__RATE_IN_STREAM_SET:
				return getRateInStreamSet();
			case XtcePackage.CONTAINER_TYPE__BINARY_ENCODING:
				return getBinaryEncoding();
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
			case XtcePackage.CONTAINER_TYPE__DEFAULT_RATE_IN_STREAM:
				setDefaultRateInStream((RateInStreamType1)newValue);
				return;
			case XtcePackage.CONTAINER_TYPE__RATE_IN_STREAM_SET:
				setRateInStreamSet((RateInStreamSetType)newValue);
				return;
			case XtcePackage.CONTAINER_TYPE__BINARY_ENCODING:
				setBinaryEncoding((BinaryDataEncodingType)newValue);
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
			case XtcePackage.CONTAINER_TYPE__DEFAULT_RATE_IN_STREAM:
				setDefaultRateInStream((RateInStreamType1)null);
				return;
			case XtcePackage.CONTAINER_TYPE__RATE_IN_STREAM_SET:
				setRateInStreamSet((RateInStreamSetType)null);
				return;
			case XtcePackage.CONTAINER_TYPE__BINARY_ENCODING:
				setBinaryEncoding((BinaryDataEncodingType)null);
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
			case XtcePackage.CONTAINER_TYPE__DEFAULT_RATE_IN_STREAM:
				return defaultRateInStream != null;
			case XtcePackage.CONTAINER_TYPE__RATE_IN_STREAM_SET:
				return rateInStreamSet != null;
			case XtcePackage.CONTAINER_TYPE__BINARY_ENCODING:
				return binaryEncoding != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainerTypeImpl
