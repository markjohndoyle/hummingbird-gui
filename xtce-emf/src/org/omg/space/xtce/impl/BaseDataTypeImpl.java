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

import org.omg.space.xtce.BaseDataType;
import org.omg.space.xtce.BinaryDataEncodingType;
import org.omg.space.xtce.FloatDataEncodingType;
import org.omg.space.xtce.IntegerDataEncodingType;
import org.omg.space.xtce.StringDataEncodingType;
import org.omg.space.xtce.UnitSetType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.BaseDataTypeImpl#getUnitSet <em>Unit Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.BaseDataTypeImpl#getBinaryDataEncoding <em>Binary Data Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.BaseDataTypeImpl#getFloatDataEncoding <em>Float Data Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.BaseDataTypeImpl#getIntegerDataEncoding <em>Integer Data Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.BaseDataTypeImpl#getStringDataEncoding <em>String Data Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BaseDataTypeImpl extends NameDescriptionTypeImpl implements BaseDataType {
	/**
	 * The cached value of the '{@link #getUnitSet() <em>Unit Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitSet()
	 * @generated
	 * @ordered
	 */
	protected UnitSetType unitSet;

	/**
	 * The cached value of the '{@link #getBinaryDataEncoding() <em>Binary Data Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryDataEncoding()
	 * @generated
	 * @ordered
	 */
	protected BinaryDataEncodingType binaryDataEncoding;

	/**
	 * The cached value of the '{@link #getFloatDataEncoding() <em>Float Data Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatDataEncoding()
	 * @generated
	 * @ordered
	 */
	protected FloatDataEncodingType floatDataEncoding;

	/**
	 * The cached value of the '{@link #getIntegerDataEncoding() <em>Integer Data Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerDataEncoding()
	 * @generated
	 * @ordered
	 */
	protected IntegerDataEncodingType integerDataEncoding;

	/**
	 * The cached value of the '{@link #getStringDataEncoding() <em>String Data Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringDataEncoding()
	 * @generated
	 * @ordered
	 */
	protected StringDataEncodingType stringDataEncoding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getBaseDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSetType getUnitSet() {
		return unitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitSet(UnitSetType newUnitSet, NotificationChain msgs) {
		UnitSetType oldUnitSet = unitSet;
		unitSet = newUnitSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_DATA_TYPE__UNIT_SET, oldUnitSet, newUnitSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitSet(UnitSetType newUnitSet) {
		if (newUnitSet != unitSet) {
			NotificationChain msgs = null;
			if (unitSet != null)
				msgs = ((InternalEObject)unitSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_DATA_TYPE__UNIT_SET, null, msgs);
			if (newUnitSet != null)
				msgs = ((InternalEObject)newUnitSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_DATA_TYPE__UNIT_SET, null, msgs);
			msgs = basicSetUnitSet(newUnitSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_DATA_TYPE__UNIT_SET, newUnitSet, newUnitSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryDataEncodingType getBinaryDataEncoding() {
		return binaryDataEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryDataEncoding(BinaryDataEncodingType newBinaryDataEncoding, NotificationChain msgs) {
		BinaryDataEncodingType oldBinaryDataEncoding = binaryDataEncoding;
		binaryDataEncoding = newBinaryDataEncoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_DATA_TYPE__BINARY_DATA_ENCODING, oldBinaryDataEncoding, newBinaryDataEncoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryDataEncoding(BinaryDataEncodingType newBinaryDataEncoding) {
		if (newBinaryDataEncoding != binaryDataEncoding) {
			NotificationChain msgs = null;
			if (binaryDataEncoding != null)
				msgs = ((InternalEObject)binaryDataEncoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_DATA_TYPE__BINARY_DATA_ENCODING, null, msgs);
			if (newBinaryDataEncoding != null)
				msgs = ((InternalEObject)newBinaryDataEncoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_DATA_TYPE__BINARY_DATA_ENCODING, null, msgs);
			msgs = basicSetBinaryDataEncoding(newBinaryDataEncoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_DATA_TYPE__BINARY_DATA_ENCODING, newBinaryDataEncoding, newBinaryDataEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatDataEncodingType getFloatDataEncoding() {
		return floatDataEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloatDataEncoding(FloatDataEncodingType newFloatDataEncoding, NotificationChain msgs) {
		FloatDataEncodingType oldFloatDataEncoding = floatDataEncoding;
		floatDataEncoding = newFloatDataEncoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_DATA_TYPE__FLOAT_DATA_ENCODING, oldFloatDataEncoding, newFloatDataEncoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatDataEncoding(FloatDataEncodingType newFloatDataEncoding) {
		if (newFloatDataEncoding != floatDataEncoding) {
			NotificationChain msgs = null;
			if (floatDataEncoding != null)
				msgs = ((InternalEObject)floatDataEncoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_DATA_TYPE__FLOAT_DATA_ENCODING, null, msgs);
			if (newFloatDataEncoding != null)
				msgs = ((InternalEObject)newFloatDataEncoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_DATA_TYPE__FLOAT_DATA_ENCODING, null, msgs);
			msgs = basicSetFloatDataEncoding(newFloatDataEncoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_DATA_TYPE__FLOAT_DATA_ENCODING, newFloatDataEncoding, newFloatDataEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerDataEncodingType getIntegerDataEncoding() {
		return integerDataEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntegerDataEncoding(IntegerDataEncodingType newIntegerDataEncoding, NotificationChain msgs) {
		IntegerDataEncodingType oldIntegerDataEncoding = integerDataEncoding;
		integerDataEncoding = newIntegerDataEncoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_DATA_TYPE__INTEGER_DATA_ENCODING, oldIntegerDataEncoding, newIntegerDataEncoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerDataEncoding(IntegerDataEncodingType newIntegerDataEncoding) {
		if (newIntegerDataEncoding != integerDataEncoding) {
			NotificationChain msgs = null;
			if (integerDataEncoding != null)
				msgs = ((InternalEObject)integerDataEncoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_DATA_TYPE__INTEGER_DATA_ENCODING, null, msgs);
			if (newIntegerDataEncoding != null)
				msgs = ((InternalEObject)newIntegerDataEncoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_DATA_TYPE__INTEGER_DATA_ENCODING, null, msgs);
			msgs = basicSetIntegerDataEncoding(newIntegerDataEncoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_DATA_TYPE__INTEGER_DATA_ENCODING, newIntegerDataEncoding, newIntegerDataEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringDataEncodingType getStringDataEncoding() {
		return stringDataEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringDataEncoding(StringDataEncodingType newStringDataEncoding, NotificationChain msgs) {
		StringDataEncodingType oldStringDataEncoding = stringDataEncoding;
		stringDataEncoding = newStringDataEncoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_DATA_TYPE__STRING_DATA_ENCODING, oldStringDataEncoding, newStringDataEncoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringDataEncoding(StringDataEncodingType newStringDataEncoding) {
		if (newStringDataEncoding != stringDataEncoding) {
			NotificationChain msgs = null;
			if (stringDataEncoding != null)
				msgs = ((InternalEObject)stringDataEncoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_DATA_TYPE__STRING_DATA_ENCODING, null, msgs);
			if (newStringDataEncoding != null)
				msgs = ((InternalEObject)newStringDataEncoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_DATA_TYPE__STRING_DATA_ENCODING, null, msgs);
			msgs = basicSetStringDataEncoding(newStringDataEncoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_DATA_TYPE__STRING_DATA_ENCODING, newStringDataEncoding, newStringDataEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.BASE_DATA_TYPE__UNIT_SET:
				return basicSetUnitSet(null, msgs);
			case XtcePackage.BASE_DATA_TYPE__BINARY_DATA_ENCODING:
				return basicSetBinaryDataEncoding(null, msgs);
			case XtcePackage.BASE_DATA_TYPE__FLOAT_DATA_ENCODING:
				return basicSetFloatDataEncoding(null, msgs);
			case XtcePackage.BASE_DATA_TYPE__INTEGER_DATA_ENCODING:
				return basicSetIntegerDataEncoding(null, msgs);
			case XtcePackage.BASE_DATA_TYPE__STRING_DATA_ENCODING:
				return basicSetStringDataEncoding(null, msgs);
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
			case XtcePackage.BASE_DATA_TYPE__UNIT_SET:
				return getUnitSet();
			case XtcePackage.BASE_DATA_TYPE__BINARY_DATA_ENCODING:
				return getBinaryDataEncoding();
			case XtcePackage.BASE_DATA_TYPE__FLOAT_DATA_ENCODING:
				return getFloatDataEncoding();
			case XtcePackage.BASE_DATA_TYPE__INTEGER_DATA_ENCODING:
				return getIntegerDataEncoding();
			case XtcePackage.BASE_DATA_TYPE__STRING_DATA_ENCODING:
				return getStringDataEncoding();
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
			case XtcePackage.BASE_DATA_TYPE__UNIT_SET:
				setUnitSet((UnitSetType)newValue);
				return;
			case XtcePackage.BASE_DATA_TYPE__BINARY_DATA_ENCODING:
				setBinaryDataEncoding((BinaryDataEncodingType)newValue);
				return;
			case XtcePackage.BASE_DATA_TYPE__FLOAT_DATA_ENCODING:
				setFloatDataEncoding((FloatDataEncodingType)newValue);
				return;
			case XtcePackage.BASE_DATA_TYPE__INTEGER_DATA_ENCODING:
				setIntegerDataEncoding((IntegerDataEncodingType)newValue);
				return;
			case XtcePackage.BASE_DATA_TYPE__STRING_DATA_ENCODING:
				setStringDataEncoding((StringDataEncodingType)newValue);
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
			case XtcePackage.BASE_DATA_TYPE__UNIT_SET:
				setUnitSet((UnitSetType)null);
				return;
			case XtcePackage.BASE_DATA_TYPE__BINARY_DATA_ENCODING:
				setBinaryDataEncoding((BinaryDataEncodingType)null);
				return;
			case XtcePackage.BASE_DATA_TYPE__FLOAT_DATA_ENCODING:
				setFloatDataEncoding((FloatDataEncodingType)null);
				return;
			case XtcePackage.BASE_DATA_TYPE__INTEGER_DATA_ENCODING:
				setIntegerDataEncoding((IntegerDataEncodingType)null);
				return;
			case XtcePackage.BASE_DATA_TYPE__STRING_DATA_ENCODING:
				setStringDataEncoding((StringDataEncodingType)null);
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
			case XtcePackage.BASE_DATA_TYPE__UNIT_SET:
				return unitSet != null;
			case XtcePackage.BASE_DATA_TYPE__BINARY_DATA_ENCODING:
				return binaryDataEncoding != null;
			case XtcePackage.BASE_DATA_TYPE__FLOAT_DATA_ENCODING:
				return floatDataEncoding != null;
			case XtcePackage.BASE_DATA_TYPE__INTEGER_DATA_ENCODING:
				return integerDataEncoding != null;
			case XtcePackage.BASE_DATA_TYPE__STRING_DATA_ENCODING:
				return stringDataEncoding != null;
		}
		return super.eIsSet(featureID);
	}

} //BaseDataTypeImpl
