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
import org.omg.space.xtce.InputAlgorithmType;
import org.omg.space.xtce.IntegerValueType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Data Encoding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.BinaryDataEncodingTypeImpl#getSizeInBits <em>Size In Bits</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.BinaryDataEncodingTypeImpl#getFromBinaryTransformAlgorithm <em>From Binary Transform Algorithm</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.BinaryDataEncodingTypeImpl#getToBinaryTransformAlgorithm <em>To Binary Transform Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryDataEncodingTypeImpl extends DataEncodingTypeImpl implements BinaryDataEncodingType {
	/**
	 * The cached value of the '{@link #getSizeInBits() <em>Size In Bits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBits()
	 * @generated
	 * @ordered
	 */
	protected IntegerValueType sizeInBits;

	/**
	 * The cached value of the '{@link #getFromBinaryTransformAlgorithm() <em>From Binary Transform Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromBinaryTransformAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected InputAlgorithmType fromBinaryTransformAlgorithm;

	/**
	 * The cached value of the '{@link #getToBinaryTransformAlgorithm() <em>To Binary Transform Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBinaryTransformAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected InputAlgorithmType toBinaryTransformAlgorithm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryDataEncodingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getBinaryDataEncodingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueType getSizeInBits() {
		return sizeInBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSizeInBits(IntegerValueType newSizeInBits, NotificationChain msgs) {
		IntegerValueType oldSizeInBits = sizeInBits;
		sizeInBits = newSizeInBits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.BINARY_DATA_ENCODING_TYPE__SIZE_IN_BITS, oldSizeInBits, newSizeInBits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInBits(IntegerValueType newSizeInBits) {
		if (newSizeInBits != sizeInBits) {
			NotificationChain msgs = null;
			if (sizeInBits != null)
				msgs = ((InternalEObject)sizeInBits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BINARY_DATA_ENCODING_TYPE__SIZE_IN_BITS, null, msgs);
			if (newSizeInBits != null)
				msgs = ((InternalEObject)newSizeInBits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BINARY_DATA_ENCODING_TYPE__SIZE_IN_BITS, null, msgs);
			msgs = basicSetSizeInBits(newSizeInBits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BINARY_DATA_ENCODING_TYPE__SIZE_IN_BITS, newSizeInBits, newSizeInBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputAlgorithmType getFromBinaryTransformAlgorithm() {
		return fromBinaryTransformAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromBinaryTransformAlgorithm(InputAlgorithmType newFromBinaryTransformAlgorithm, NotificationChain msgs) {
		InputAlgorithmType oldFromBinaryTransformAlgorithm = fromBinaryTransformAlgorithm;
		fromBinaryTransformAlgorithm = newFromBinaryTransformAlgorithm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.BINARY_DATA_ENCODING_TYPE__FROM_BINARY_TRANSFORM_ALGORITHM, oldFromBinaryTransformAlgorithm, newFromBinaryTransformAlgorithm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromBinaryTransformAlgorithm(InputAlgorithmType newFromBinaryTransformAlgorithm) {
		if (newFromBinaryTransformAlgorithm != fromBinaryTransformAlgorithm) {
			NotificationChain msgs = null;
			if (fromBinaryTransformAlgorithm != null)
				msgs = ((InternalEObject)fromBinaryTransformAlgorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BINARY_DATA_ENCODING_TYPE__FROM_BINARY_TRANSFORM_ALGORITHM, null, msgs);
			if (newFromBinaryTransformAlgorithm != null)
				msgs = ((InternalEObject)newFromBinaryTransformAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BINARY_DATA_ENCODING_TYPE__FROM_BINARY_TRANSFORM_ALGORITHM, null, msgs);
			msgs = basicSetFromBinaryTransformAlgorithm(newFromBinaryTransformAlgorithm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BINARY_DATA_ENCODING_TYPE__FROM_BINARY_TRANSFORM_ALGORITHM, newFromBinaryTransformAlgorithm, newFromBinaryTransformAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputAlgorithmType getToBinaryTransformAlgorithm() {
		return toBinaryTransformAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToBinaryTransformAlgorithm(InputAlgorithmType newToBinaryTransformAlgorithm, NotificationChain msgs) {
		InputAlgorithmType oldToBinaryTransformAlgorithm = toBinaryTransformAlgorithm;
		toBinaryTransformAlgorithm = newToBinaryTransformAlgorithm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.BINARY_DATA_ENCODING_TYPE__TO_BINARY_TRANSFORM_ALGORITHM, oldToBinaryTransformAlgorithm, newToBinaryTransformAlgorithm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBinaryTransformAlgorithm(InputAlgorithmType newToBinaryTransformAlgorithm) {
		if (newToBinaryTransformAlgorithm != toBinaryTransformAlgorithm) {
			NotificationChain msgs = null;
			if (toBinaryTransformAlgorithm != null)
				msgs = ((InternalEObject)toBinaryTransformAlgorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BINARY_DATA_ENCODING_TYPE__TO_BINARY_TRANSFORM_ALGORITHM, null, msgs);
			if (newToBinaryTransformAlgorithm != null)
				msgs = ((InternalEObject)newToBinaryTransformAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BINARY_DATA_ENCODING_TYPE__TO_BINARY_TRANSFORM_ALGORITHM, null, msgs);
			msgs = basicSetToBinaryTransformAlgorithm(newToBinaryTransformAlgorithm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BINARY_DATA_ENCODING_TYPE__TO_BINARY_TRANSFORM_ALGORITHM, newToBinaryTransformAlgorithm, newToBinaryTransformAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__SIZE_IN_BITS:
				return basicSetSizeInBits(null, msgs);
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__FROM_BINARY_TRANSFORM_ALGORITHM:
				return basicSetFromBinaryTransformAlgorithm(null, msgs);
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__TO_BINARY_TRANSFORM_ALGORITHM:
				return basicSetToBinaryTransformAlgorithm(null, msgs);
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
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__SIZE_IN_BITS:
				return getSizeInBits();
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__FROM_BINARY_TRANSFORM_ALGORITHM:
				return getFromBinaryTransformAlgorithm();
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__TO_BINARY_TRANSFORM_ALGORITHM:
				return getToBinaryTransformAlgorithm();
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
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__SIZE_IN_BITS:
				setSizeInBits((IntegerValueType)newValue);
				return;
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__FROM_BINARY_TRANSFORM_ALGORITHM:
				setFromBinaryTransformAlgorithm((InputAlgorithmType)newValue);
				return;
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__TO_BINARY_TRANSFORM_ALGORITHM:
				setToBinaryTransformAlgorithm((InputAlgorithmType)newValue);
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
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__SIZE_IN_BITS:
				setSizeInBits((IntegerValueType)null);
				return;
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__FROM_BINARY_TRANSFORM_ALGORITHM:
				setFromBinaryTransformAlgorithm((InputAlgorithmType)null);
				return;
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__TO_BINARY_TRANSFORM_ALGORITHM:
				setToBinaryTransformAlgorithm((InputAlgorithmType)null);
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
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__SIZE_IN_BITS:
				return sizeInBits != null;
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__FROM_BINARY_TRANSFORM_ALGORITHM:
				return fromBinaryTransformAlgorithm != null;
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__TO_BINARY_TRANSFORM_ALGORITHM:
				return toBinaryTransformAlgorithm != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryDataEncodingTypeImpl
