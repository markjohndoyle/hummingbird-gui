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

import org.omg.space.xtce.BinaryDataEncodingType;
import org.omg.space.xtce.EncodingType1;
import org.omg.space.xtce.FloatDataEncodingType;
import org.omg.space.xtce.IntegerDataEncodingType;
import org.omg.space.xtce.StringDataEncodingType;
import org.omg.space.xtce.UnitsType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encoding Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.EncodingType1Impl#getBinaryDataEncoding <em>Binary Data Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.EncodingType1Impl#getFloatDataEncoding <em>Float Data Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.EncodingType1Impl#getIntegerDataEncoding <em>Integer Data Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.EncodingType1Impl#getStringDataEncoding <em>String Data Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.EncodingType1Impl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.EncodingType1Impl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.EncodingType1Impl#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncodingType1Impl extends EObjectImpl implements EncodingType1 {
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
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected double offset = OFFSET_EDEFAULT;

	/**
	 * This is true if the Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean offsetESet;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected double scale = SCALE_EDEFAULT;

	/**
	 * This is true if the Scale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scaleESet;

	/**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsType UNITS_EDEFAULT = UnitsType.SECONDS;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected UnitsType units = UNITS_EDEFAULT;

	/**
	 * This is true if the Units attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncodingType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getEncodingType1();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ENCODING_TYPE1__BINARY_DATA_ENCODING, oldBinaryDataEncoding, newBinaryDataEncoding);
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
				msgs = ((InternalEObject)binaryDataEncoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ENCODING_TYPE1__BINARY_DATA_ENCODING, null, msgs);
			if (newBinaryDataEncoding != null)
				msgs = ((InternalEObject)newBinaryDataEncoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ENCODING_TYPE1__BINARY_DATA_ENCODING, null, msgs);
			msgs = basicSetBinaryDataEncoding(newBinaryDataEncoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ENCODING_TYPE1__BINARY_DATA_ENCODING, newBinaryDataEncoding, newBinaryDataEncoding));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ENCODING_TYPE1__FLOAT_DATA_ENCODING, oldFloatDataEncoding, newFloatDataEncoding);
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
				msgs = ((InternalEObject)floatDataEncoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ENCODING_TYPE1__FLOAT_DATA_ENCODING, null, msgs);
			if (newFloatDataEncoding != null)
				msgs = ((InternalEObject)newFloatDataEncoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ENCODING_TYPE1__FLOAT_DATA_ENCODING, null, msgs);
			msgs = basicSetFloatDataEncoding(newFloatDataEncoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ENCODING_TYPE1__FLOAT_DATA_ENCODING, newFloatDataEncoding, newFloatDataEncoding));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ENCODING_TYPE1__INTEGER_DATA_ENCODING, oldIntegerDataEncoding, newIntegerDataEncoding);
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
				msgs = ((InternalEObject)integerDataEncoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ENCODING_TYPE1__INTEGER_DATA_ENCODING, null, msgs);
			if (newIntegerDataEncoding != null)
				msgs = ((InternalEObject)newIntegerDataEncoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ENCODING_TYPE1__INTEGER_DATA_ENCODING, null, msgs);
			msgs = basicSetIntegerDataEncoding(newIntegerDataEncoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ENCODING_TYPE1__INTEGER_DATA_ENCODING, newIntegerDataEncoding, newIntegerDataEncoding));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ENCODING_TYPE1__STRING_DATA_ENCODING, oldStringDataEncoding, newStringDataEncoding);
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
				msgs = ((InternalEObject)stringDataEncoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ENCODING_TYPE1__STRING_DATA_ENCODING, null, msgs);
			if (newStringDataEncoding != null)
				msgs = ((InternalEObject)newStringDataEncoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ENCODING_TYPE1__STRING_DATA_ENCODING, null, msgs);
			msgs = basicSetStringDataEncoding(newStringDataEncoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ENCODING_TYPE1__STRING_DATA_ENCODING, newStringDataEncoding, newStringDataEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(double newOffset) {
		double oldOffset = offset;
		offset = newOffset;
		boolean oldOffsetESet = offsetESet;
		offsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ENCODING_TYPE1__OFFSET, oldOffset, offset, !oldOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOffset() {
		double oldOffset = offset;
		boolean oldOffsetESet = offsetESet;
		offset = OFFSET_EDEFAULT;
		offsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.ENCODING_TYPE1__OFFSET, oldOffset, OFFSET_EDEFAULT, oldOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOffset() {
		return offsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(double newScale) {
		double oldScale = scale;
		scale = newScale;
		boolean oldScaleESet = scaleESet;
		scaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ENCODING_TYPE1__SCALE, oldScale, scale, !oldScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScale() {
		double oldScale = scale;
		boolean oldScaleESet = scaleESet;
		scale = SCALE_EDEFAULT;
		scaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.ENCODING_TYPE1__SCALE, oldScale, SCALE_EDEFAULT, oldScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScale() {
		return scaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsType getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnits(UnitsType newUnits) {
		UnitsType oldUnits = units;
		units = newUnits == null ? UNITS_EDEFAULT : newUnits;
		boolean oldUnitsESet = unitsESet;
		unitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ENCODING_TYPE1__UNITS, oldUnits, units, !oldUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnits() {
		UnitsType oldUnits = units;
		boolean oldUnitsESet = unitsESet;
		units = UNITS_EDEFAULT;
		unitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.ENCODING_TYPE1__UNITS, oldUnits, UNITS_EDEFAULT, oldUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnits() {
		return unitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.ENCODING_TYPE1__BINARY_DATA_ENCODING:
				return basicSetBinaryDataEncoding(null, msgs);
			case XtcePackage.ENCODING_TYPE1__FLOAT_DATA_ENCODING:
				return basicSetFloatDataEncoding(null, msgs);
			case XtcePackage.ENCODING_TYPE1__INTEGER_DATA_ENCODING:
				return basicSetIntegerDataEncoding(null, msgs);
			case XtcePackage.ENCODING_TYPE1__STRING_DATA_ENCODING:
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
			case XtcePackage.ENCODING_TYPE1__BINARY_DATA_ENCODING:
				return getBinaryDataEncoding();
			case XtcePackage.ENCODING_TYPE1__FLOAT_DATA_ENCODING:
				return getFloatDataEncoding();
			case XtcePackage.ENCODING_TYPE1__INTEGER_DATA_ENCODING:
				return getIntegerDataEncoding();
			case XtcePackage.ENCODING_TYPE1__STRING_DATA_ENCODING:
				return getStringDataEncoding();
			case XtcePackage.ENCODING_TYPE1__OFFSET:
				return getOffset();
			case XtcePackage.ENCODING_TYPE1__SCALE:
				return getScale();
			case XtcePackage.ENCODING_TYPE1__UNITS:
				return getUnits();
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
			case XtcePackage.ENCODING_TYPE1__BINARY_DATA_ENCODING:
				setBinaryDataEncoding((BinaryDataEncodingType)newValue);
				return;
			case XtcePackage.ENCODING_TYPE1__FLOAT_DATA_ENCODING:
				setFloatDataEncoding((FloatDataEncodingType)newValue);
				return;
			case XtcePackage.ENCODING_TYPE1__INTEGER_DATA_ENCODING:
				setIntegerDataEncoding((IntegerDataEncodingType)newValue);
				return;
			case XtcePackage.ENCODING_TYPE1__STRING_DATA_ENCODING:
				setStringDataEncoding((StringDataEncodingType)newValue);
				return;
			case XtcePackage.ENCODING_TYPE1__OFFSET:
				setOffset((Double)newValue);
				return;
			case XtcePackage.ENCODING_TYPE1__SCALE:
				setScale((Double)newValue);
				return;
			case XtcePackage.ENCODING_TYPE1__UNITS:
				setUnits((UnitsType)newValue);
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
			case XtcePackage.ENCODING_TYPE1__BINARY_DATA_ENCODING:
				setBinaryDataEncoding((BinaryDataEncodingType)null);
				return;
			case XtcePackage.ENCODING_TYPE1__FLOAT_DATA_ENCODING:
				setFloatDataEncoding((FloatDataEncodingType)null);
				return;
			case XtcePackage.ENCODING_TYPE1__INTEGER_DATA_ENCODING:
				setIntegerDataEncoding((IntegerDataEncodingType)null);
				return;
			case XtcePackage.ENCODING_TYPE1__STRING_DATA_ENCODING:
				setStringDataEncoding((StringDataEncodingType)null);
				return;
			case XtcePackage.ENCODING_TYPE1__OFFSET:
				unsetOffset();
				return;
			case XtcePackage.ENCODING_TYPE1__SCALE:
				unsetScale();
				return;
			case XtcePackage.ENCODING_TYPE1__UNITS:
				unsetUnits();
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
			case XtcePackage.ENCODING_TYPE1__BINARY_DATA_ENCODING:
				return binaryDataEncoding != null;
			case XtcePackage.ENCODING_TYPE1__FLOAT_DATA_ENCODING:
				return floatDataEncoding != null;
			case XtcePackage.ENCODING_TYPE1__INTEGER_DATA_ENCODING:
				return integerDataEncoding != null;
			case XtcePackage.ENCODING_TYPE1__STRING_DATA_ENCODING:
				return stringDataEncoding != null;
			case XtcePackage.ENCODING_TYPE1__OFFSET:
				return isSetOffset();
			case XtcePackage.ENCODING_TYPE1__SCALE:
				return isSetScale();
			case XtcePackage.ENCODING_TYPE1__UNITS:
				return isSetUnits();
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
		result.append(" (offset: ");
		if (offsetESet) result.append(offset); else result.append("<unset>");
		result.append(", scale: ");
		if (scaleESet) result.append(scale); else result.append("<unset>");
		result.append(", units: ");
		if (unitsESet) result.append(units); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EncodingType1Impl
