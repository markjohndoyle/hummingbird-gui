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

import org.omg.space.xtce.CustomStreamType;
import org.omg.space.xtce.InputAlgorithmType;
import org.omg.space.xtce.InputOutputAlgorithmType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Stream Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.CustomStreamTypeImpl#getEncodingAlgorithm <em>Encoding Algorithm</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CustomStreamTypeImpl#getDecodingAlgorithm <em>Decoding Algorithm</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CustomStreamTypeImpl#getDecodedStreamRef <em>Decoded Stream Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CustomStreamTypeImpl#getEncodedStreamRef <em>Encoded Stream Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomStreamTypeImpl extends PCMStreamTypeImpl implements CustomStreamType {
	/**
	 * The cached value of the '{@link #getEncodingAlgorithm() <em>Encoding Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodingAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected InputAlgorithmType encodingAlgorithm;

	/**
	 * The cached value of the '{@link #getDecodingAlgorithm() <em>Decoding Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecodingAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected InputOutputAlgorithmType decodingAlgorithm;

	/**
	 * The default value of the '{@link #getDecodedStreamRef() <em>Decoded Stream Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecodedStreamRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DECODED_STREAM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecodedStreamRef() <em>Decoded Stream Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecodedStreamRef()
	 * @generated
	 * @ordered
	 */
	protected String decodedStreamRef = DECODED_STREAM_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncodedStreamRef() <em>Encoded Stream Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodedStreamRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODED_STREAM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncodedStreamRef() <em>Encoded Stream Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodedStreamRef()
	 * @generated
	 * @ordered
	 */
	protected String encodedStreamRef = ENCODED_STREAM_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomStreamTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getCustomStreamType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputAlgorithmType getEncodingAlgorithm() {
		return encodingAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncodingAlgorithm(InputAlgorithmType newEncodingAlgorithm, NotificationChain msgs) {
		InputAlgorithmType oldEncodingAlgorithm = encodingAlgorithm;
		encodingAlgorithm = newEncodingAlgorithm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CUSTOM_STREAM_TYPE__ENCODING_ALGORITHM, oldEncodingAlgorithm, newEncodingAlgorithm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncodingAlgorithm(InputAlgorithmType newEncodingAlgorithm) {
		if (newEncodingAlgorithm != encodingAlgorithm) {
			NotificationChain msgs = null;
			if (encodingAlgorithm != null)
				msgs = ((InternalEObject)encodingAlgorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CUSTOM_STREAM_TYPE__ENCODING_ALGORITHM, null, msgs);
			if (newEncodingAlgorithm != null)
				msgs = ((InternalEObject)newEncodingAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CUSTOM_STREAM_TYPE__ENCODING_ALGORITHM, null, msgs);
			msgs = basicSetEncodingAlgorithm(newEncodingAlgorithm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CUSTOM_STREAM_TYPE__ENCODING_ALGORITHM, newEncodingAlgorithm, newEncodingAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputAlgorithmType getDecodingAlgorithm() {
		return decodingAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecodingAlgorithm(InputOutputAlgorithmType newDecodingAlgorithm, NotificationChain msgs) {
		InputOutputAlgorithmType oldDecodingAlgorithm = decodingAlgorithm;
		decodingAlgorithm = newDecodingAlgorithm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CUSTOM_STREAM_TYPE__DECODING_ALGORITHM, oldDecodingAlgorithm, newDecodingAlgorithm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecodingAlgorithm(InputOutputAlgorithmType newDecodingAlgorithm) {
		if (newDecodingAlgorithm != decodingAlgorithm) {
			NotificationChain msgs = null;
			if (decodingAlgorithm != null)
				msgs = ((InternalEObject)decodingAlgorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CUSTOM_STREAM_TYPE__DECODING_ALGORITHM, null, msgs);
			if (newDecodingAlgorithm != null)
				msgs = ((InternalEObject)newDecodingAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CUSTOM_STREAM_TYPE__DECODING_ALGORITHM, null, msgs);
			msgs = basicSetDecodingAlgorithm(newDecodingAlgorithm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CUSTOM_STREAM_TYPE__DECODING_ALGORITHM, newDecodingAlgorithm, newDecodingAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecodedStreamRef() {
		return decodedStreamRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecodedStreamRef(String newDecodedStreamRef) {
		String oldDecodedStreamRef = decodedStreamRef;
		decodedStreamRef = newDecodedStreamRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CUSTOM_STREAM_TYPE__DECODED_STREAM_REF, oldDecodedStreamRef, decodedStreamRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncodedStreamRef() {
		return encodedStreamRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncodedStreamRef(String newEncodedStreamRef) {
		String oldEncodedStreamRef = encodedStreamRef;
		encodedStreamRef = newEncodedStreamRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CUSTOM_STREAM_TYPE__ENCODED_STREAM_REF, oldEncodedStreamRef, encodedStreamRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.CUSTOM_STREAM_TYPE__ENCODING_ALGORITHM:
				return basicSetEncodingAlgorithm(null, msgs);
			case XtcePackage.CUSTOM_STREAM_TYPE__DECODING_ALGORITHM:
				return basicSetDecodingAlgorithm(null, msgs);
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
			case XtcePackage.CUSTOM_STREAM_TYPE__ENCODING_ALGORITHM:
				return getEncodingAlgorithm();
			case XtcePackage.CUSTOM_STREAM_TYPE__DECODING_ALGORITHM:
				return getDecodingAlgorithm();
			case XtcePackage.CUSTOM_STREAM_TYPE__DECODED_STREAM_REF:
				return getDecodedStreamRef();
			case XtcePackage.CUSTOM_STREAM_TYPE__ENCODED_STREAM_REF:
				return getEncodedStreamRef();
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
			case XtcePackage.CUSTOM_STREAM_TYPE__ENCODING_ALGORITHM:
				setEncodingAlgorithm((InputAlgorithmType)newValue);
				return;
			case XtcePackage.CUSTOM_STREAM_TYPE__DECODING_ALGORITHM:
				setDecodingAlgorithm((InputOutputAlgorithmType)newValue);
				return;
			case XtcePackage.CUSTOM_STREAM_TYPE__DECODED_STREAM_REF:
				setDecodedStreamRef((String)newValue);
				return;
			case XtcePackage.CUSTOM_STREAM_TYPE__ENCODED_STREAM_REF:
				setEncodedStreamRef((String)newValue);
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
			case XtcePackage.CUSTOM_STREAM_TYPE__ENCODING_ALGORITHM:
				setEncodingAlgorithm((InputAlgorithmType)null);
				return;
			case XtcePackage.CUSTOM_STREAM_TYPE__DECODING_ALGORITHM:
				setDecodingAlgorithm((InputOutputAlgorithmType)null);
				return;
			case XtcePackage.CUSTOM_STREAM_TYPE__DECODED_STREAM_REF:
				setDecodedStreamRef(DECODED_STREAM_REF_EDEFAULT);
				return;
			case XtcePackage.CUSTOM_STREAM_TYPE__ENCODED_STREAM_REF:
				setEncodedStreamRef(ENCODED_STREAM_REF_EDEFAULT);
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
			case XtcePackage.CUSTOM_STREAM_TYPE__ENCODING_ALGORITHM:
				return encodingAlgorithm != null;
			case XtcePackage.CUSTOM_STREAM_TYPE__DECODING_ALGORITHM:
				return decodingAlgorithm != null;
			case XtcePackage.CUSTOM_STREAM_TYPE__DECODED_STREAM_REF:
				return DECODED_STREAM_REF_EDEFAULT == null ? decodedStreamRef != null : !DECODED_STREAM_REF_EDEFAULT.equals(decodedStreamRef);
			case XtcePackage.CUSTOM_STREAM_TYPE__ENCODED_STREAM_REF:
				return ENCODED_STREAM_REF_EDEFAULT == null ? encodedStreamRef != null : !ENCODED_STREAM_REF_EDEFAULT.equals(encodedStreamRef);
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
		result.append(" (decodedStreamRef: ");
		result.append(decodedStreamRef);
		result.append(", encodedStreamRef: ");
		result.append(encodedStreamRef);
		result.append(')');
		return result.toString();
	}

} //CustomStreamTypeImpl
