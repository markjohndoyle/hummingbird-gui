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

import org.omg.space.xtce.CalibratorType;
import org.omg.space.xtce.ContextCalibratorListType3;
import org.omg.space.xtce.NumberToStringType;
import org.omg.space.xtce.NumericDataType;
import org.omg.space.xtce.ValidRangeType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.NumericDataTypeImpl#getToString <em>To String</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumericDataTypeImpl#getValidRange <em>Valid Range</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumericDataTypeImpl#getDefaultCalibrator <em>Default Calibrator</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumericDataTypeImpl#getContextCalibratorList <em>Context Calibrator List</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumericDataTypeImpl#isValidRangeAppliesToCalibrated <em>Valid Range Applies To Calibrated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericDataTypeImpl extends BaseDataTypeImpl implements NumericDataType {
	/**
	 * The cached value of the '{@link #getToString() <em>To String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToString()
	 * @generated
	 * @ordered
	 */
	protected NumberToStringType toString;

	/**
	 * The cached value of the '{@link #getValidRange() <em>Valid Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidRange()
	 * @generated
	 * @ordered
	 */
	protected ValidRangeType validRange;

	/**
	 * The cached value of the '{@link #getDefaultCalibrator() <em>Default Calibrator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCalibrator()
	 * @generated
	 * @ordered
	 */
	protected CalibratorType defaultCalibrator;

	/**
	 * The cached value of the '{@link #getContextCalibratorList() <em>Context Calibrator List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextCalibratorList()
	 * @generated
	 * @ordered
	 */
	protected ContextCalibratorListType3 contextCalibratorList;

	/**
	 * The default value of the '{@link #isValidRangeAppliesToCalibrated() <em>Valid Range Applies To Calibrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidRangeAppliesToCalibrated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALID_RANGE_APPLIES_TO_CALIBRATED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isValidRangeAppliesToCalibrated() <em>Valid Range Applies To Calibrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidRangeAppliesToCalibrated()
	 * @generated
	 * @ordered
	 */
	protected boolean validRangeAppliesToCalibrated = VALID_RANGE_APPLIES_TO_CALIBRATED_EDEFAULT;

	/**
	 * This is true if the Valid Range Applies To Calibrated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validRangeAppliesToCalibratedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getNumericDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberToStringType getToString() {
		return toString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToString(NumberToStringType newToString, NotificationChain msgs) {
		NumberToStringType oldToString = toString;
		toString = newToString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_DATA_TYPE__TO_STRING, oldToString, newToString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToString(NumberToStringType newToString) {
		if (newToString != toString) {
			NotificationChain msgs = null;
			if (toString != null)
				msgs = ((InternalEObject)toString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMERIC_DATA_TYPE__TO_STRING, null, msgs);
			if (newToString != null)
				msgs = ((InternalEObject)newToString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMERIC_DATA_TYPE__TO_STRING, null, msgs);
			msgs = basicSetToString(newToString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_DATA_TYPE__TO_STRING, newToString, newToString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidRangeType getValidRange() {
		return validRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidRange(ValidRangeType newValidRange, NotificationChain msgs) {
		ValidRangeType oldValidRange = validRange;
		validRange = newValidRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_DATA_TYPE__VALID_RANGE, oldValidRange, newValidRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidRange(ValidRangeType newValidRange) {
		if (newValidRange != validRange) {
			NotificationChain msgs = null;
			if (validRange != null)
				msgs = ((InternalEObject)validRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMERIC_DATA_TYPE__VALID_RANGE, null, msgs);
			if (newValidRange != null)
				msgs = ((InternalEObject)newValidRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMERIC_DATA_TYPE__VALID_RANGE, null, msgs);
			msgs = basicSetValidRange(newValidRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_DATA_TYPE__VALID_RANGE, newValidRange, newValidRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalibratorType getDefaultCalibrator() {
		return defaultCalibrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultCalibrator(CalibratorType newDefaultCalibrator, NotificationChain msgs) {
		CalibratorType oldDefaultCalibrator = defaultCalibrator;
		defaultCalibrator = newDefaultCalibrator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_DATA_TYPE__DEFAULT_CALIBRATOR, oldDefaultCalibrator, newDefaultCalibrator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCalibrator(CalibratorType newDefaultCalibrator) {
		if (newDefaultCalibrator != defaultCalibrator) {
			NotificationChain msgs = null;
			if (defaultCalibrator != null)
				msgs = ((InternalEObject)defaultCalibrator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMERIC_DATA_TYPE__DEFAULT_CALIBRATOR, null, msgs);
			if (newDefaultCalibrator != null)
				msgs = ((InternalEObject)newDefaultCalibrator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMERIC_DATA_TYPE__DEFAULT_CALIBRATOR, null, msgs);
			msgs = basicSetDefaultCalibrator(newDefaultCalibrator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_DATA_TYPE__DEFAULT_CALIBRATOR, newDefaultCalibrator, newDefaultCalibrator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextCalibratorListType3 getContextCalibratorList() {
		return contextCalibratorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextCalibratorList(ContextCalibratorListType3 newContextCalibratorList, NotificationChain msgs) {
		ContextCalibratorListType3 oldContextCalibratorList = contextCalibratorList;
		contextCalibratorList = newContextCalibratorList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_DATA_TYPE__CONTEXT_CALIBRATOR_LIST, oldContextCalibratorList, newContextCalibratorList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextCalibratorList(ContextCalibratorListType3 newContextCalibratorList) {
		if (newContextCalibratorList != contextCalibratorList) {
			NotificationChain msgs = null;
			if (contextCalibratorList != null)
				msgs = ((InternalEObject)contextCalibratorList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMERIC_DATA_TYPE__CONTEXT_CALIBRATOR_LIST, null, msgs);
			if (newContextCalibratorList != null)
				msgs = ((InternalEObject)newContextCalibratorList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMERIC_DATA_TYPE__CONTEXT_CALIBRATOR_LIST, null, msgs);
			msgs = basicSetContextCalibratorList(newContextCalibratorList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_DATA_TYPE__CONTEXT_CALIBRATOR_LIST, newContextCalibratorList, newContextCalibratorList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValidRangeAppliesToCalibrated() {
		return validRangeAppliesToCalibrated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidRangeAppliesToCalibrated(boolean newValidRangeAppliesToCalibrated) {
		boolean oldValidRangeAppliesToCalibrated = validRangeAppliesToCalibrated;
		validRangeAppliesToCalibrated = newValidRangeAppliesToCalibrated;
		boolean oldValidRangeAppliesToCalibratedESet = validRangeAppliesToCalibratedESet;
		validRangeAppliesToCalibratedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_DATA_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED, oldValidRangeAppliesToCalibrated, validRangeAppliesToCalibrated, !oldValidRangeAppliesToCalibratedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValidRangeAppliesToCalibrated() {
		boolean oldValidRangeAppliesToCalibrated = validRangeAppliesToCalibrated;
		boolean oldValidRangeAppliesToCalibratedESet = validRangeAppliesToCalibratedESet;
		validRangeAppliesToCalibrated = VALID_RANGE_APPLIES_TO_CALIBRATED_EDEFAULT;
		validRangeAppliesToCalibratedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.NUMERIC_DATA_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED, oldValidRangeAppliesToCalibrated, VALID_RANGE_APPLIES_TO_CALIBRATED_EDEFAULT, oldValidRangeAppliesToCalibratedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValidRangeAppliesToCalibrated() {
		return validRangeAppliesToCalibratedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.NUMERIC_DATA_TYPE__TO_STRING:
				return basicSetToString(null, msgs);
			case XtcePackage.NUMERIC_DATA_TYPE__VALID_RANGE:
				return basicSetValidRange(null, msgs);
			case XtcePackage.NUMERIC_DATA_TYPE__DEFAULT_CALIBRATOR:
				return basicSetDefaultCalibrator(null, msgs);
			case XtcePackage.NUMERIC_DATA_TYPE__CONTEXT_CALIBRATOR_LIST:
				return basicSetContextCalibratorList(null, msgs);
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
			case XtcePackage.NUMERIC_DATA_TYPE__TO_STRING:
				return getToString();
			case XtcePackage.NUMERIC_DATA_TYPE__VALID_RANGE:
				return getValidRange();
			case XtcePackage.NUMERIC_DATA_TYPE__DEFAULT_CALIBRATOR:
				return getDefaultCalibrator();
			case XtcePackage.NUMERIC_DATA_TYPE__CONTEXT_CALIBRATOR_LIST:
				return getContextCalibratorList();
			case XtcePackage.NUMERIC_DATA_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED:
				return isValidRangeAppliesToCalibrated();
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
			case XtcePackage.NUMERIC_DATA_TYPE__TO_STRING:
				setToString((NumberToStringType)newValue);
				return;
			case XtcePackage.NUMERIC_DATA_TYPE__VALID_RANGE:
				setValidRange((ValidRangeType)newValue);
				return;
			case XtcePackage.NUMERIC_DATA_TYPE__DEFAULT_CALIBRATOR:
				setDefaultCalibrator((CalibratorType)newValue);
				return;
			case XtcePackage.NUMERIC_DATA_TYPE__CONTEXT_CALIBRATOR_LIST:
				setContextCalibratorList((ContextCalibratorListType3)newValue);
				return;
			case XtcePackage.NUMERIC_DATA_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED:
				setValidRangeAppliesToCalibrated((Boolean)newValue);
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
			case XtcePackage.NUMERIC_DATA_TYPE__TO_STRING:
				setToString((NumberToStringType)null);
				return;
			case XtcePackage.NUMERIC_DATA_TYPE__VALID_RANGE:
				setValidRange((ValidRangeType)null);
				return;
			case XtcePackage.NUMERIC_DATA_TYPE__DEFAULT_CALIBRATOR:
				setDefaultCalibrator((CalibratorType)null);
				return;
			case XtcePackage.NUMERIC_DATA_TYPE__CONTEXT_CALIBRATOR_LIST:
				setContextCalibratorList((ContextCalibratorListType3)null);
				return;
			case XtcePackage.NUMERIC_DATA_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED:
				unsetValidRangeAppliesToCalibrated();
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
			case XtcePackage.NUMERIC_DATA_TYPE__TO_STRING:
				return toString != null;
			case XtcePackage.NUMERIC_DATA_TYPE__VALID_RANGE:
				return validRange != null;
			case XtcePackage.NUMERIC_DATA_TYPE__DEFAULT_CALIBRATOR:
				return defaultCalibrator != null;
			case XtcePackage.NUMERIC_DATA_TYPE__CONTEXT_CALIBRATOR_LIST:
				return contextCalibratorList != null;
			case XtcePackage.NUMERIC_DATA_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED:
				return isSetValidRangeAppliesToCalibrated();
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
		result.append(" (validRangeAppliesToCalibrated: ");
		if (validRangeAppliesToCalibratedESet) result.append(validRangeAppliesToCalibrated); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NumericDataTypeImpl
