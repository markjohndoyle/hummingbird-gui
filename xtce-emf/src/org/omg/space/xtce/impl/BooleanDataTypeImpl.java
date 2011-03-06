/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.space.xtce.BooleanDataType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.BooleanDataTypeImpl#isInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.BooleanDataTypeImpl#getOneStringValue <em>One String Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.BooleanDataTypeImpl#getZeroStringValue <em>Zero String Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanDataTypeImpl extends BaseDataTypeImpl implements BooleanDataType {
	/**
	 * The default value of the '{@link #isInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialValue()
	 * @generated
	 * @ordered
	 */
	protected boolean initialValue = INITIAL_VALUE_EDEFAULT;

	/**
	 * This is true if the Initial Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initialValueESet;

	/**
	 * The default value of the '{@link #getOneStringValue() <em>One String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneStringValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ONE_STRING_VALUE_EDEFAULT = "True";

	/**
	 * The cached value of the '{@link #getOneStringValue() <em>One String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneStringValue()
	 * @generated
	 * @ordered
	 */
	protected String oneStringValue = ONE_STRING_VALUE_EDEFAULT;

	/**
	 * This is true if the One String Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean oneStringValueESet;

	/**
	 * The default value of the '{@link #getZeroStringValue() <em>Zero String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeroStringValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ZERO_STRING_VALUE_EDEFAULT = "False";

	/**
	 * The cached value of the '{@link #getZeroStringValue() <em>Zero String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeroStringValue()
	 * @generated
	 * @ordered
	 */
	protected String zeroStringValue = ZERO_STRING_VALUE_EDEFAULT;

	/**
	 * This is true if the Zero String Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zeroStringValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getBooleanDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(boolean newInitialValue) {
		boolean oldInitialValue = initialValue;
		initialValue = newInitialValue;
		boolean oldInitialValueESet = initialValueESet;
		initialValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BOOLEAN_DATA_TYPE__INITIAL_VALUE, oldInitialValue, initialValue, !oldInitialValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInitialValue() {
		boolean oldInitialValue = initialValue;
		boolean oldInitialValueESet = initialValueESet;
		initialValue = INITIAL_VALUE_EDEFAULT;
		initialValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.BOOLEAN_DATA_TYPE__INITIAL_VALUE, oldInitialValue, INITIAL_VALUE_EDEFAULT, oldInitialValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitialValue() {
		return initialValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOneStringValue() {
		return oneStringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOneStringValue(String newOneStringValue) {
		String oldOneStringValue = oneStringValue;
		oneStringValue = newOneStringValue;
		boolean oldOneStringValueESet = oneStringValueESet;
		oneStringValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BOOLEAN_DATA_TYPE__ONE_STRING_VALUE, oldOneStringValue, oneStringValue, !oldOneStringValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOneStringValue() {
		String oldOneStringValue = oneStringValue;
		boolean oldOneStringValueESet = oneStringValueESet;
		oneStringValue = ONE_STRING_VALUE_EDEFAULT;
		oneStringValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.BOOLEAN_DATA_TYPE__ONE_STRING_VALUE, oldOneStringValue, ONE_STRING_VALUE_EDEFAULT, oldOneStringValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOneStringValue() {
		return oneStringValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZeroStringValue() {
		return zeroStringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZeroStringValue(String newZeroStringValue) {
		String oldZeroStringValue = zeroStringValue;
		zeroStringValue = newZeroStringValue;
		boolean oldZeroStringValueESet = zeroStringValueESet;
		zeroStringValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BOOLEAN_DATA_TYPE__ZERO_STRING_VALUE, oldZeroStringValue, zeroStringValue, !oldZeroStringValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetZeroStringValue() {
		String oldZeroStringValue = zeroStringValue;
		boolean oldZeroStringValueESet = zeroStringValueESet;
		zeroStringValue = ZERO_STRING_VALUE_EDEFAULT;
		zeroStringValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.BOOLEAN_DATA_TYPE__ZERO_STRING_VALUE, oldZeroStringValue, ZERO_STRING_VALUE_EDEFAULT, oldZeroStringValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetZeroStringValue() {
		return zeroStringValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.BOOLEAN_DATA_TYPE__INITIAL_VALUE:
				return isInitialValue();
			case XtcePackage.BOOLEAN_DATA_TYPE__ONE_STRING_VALUE:
				return getOneStringValue();
			case XtcePackage.BOOLEAN_DATA_TYPE__ZERO_STRING_VALUE:
				return getZeroStringValue();
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
			case XtcePackage.BOOLEAN_DATA_TYPE__INITIAL_VALUE:
				setInitialValue((Boolean)newValue);
				return;
			case XtcePackage.BOOLEAN_DATA_TYPE__ONE_STRING_VALUE:
				setOneStringValue((String)newValue);
				return;
			case XtcePackage.BOOLEAN_DATA_TYPE__ZERO_STRING_VALUE:
				setZeroStringValue((String)newValue);
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
			case XtcePackage.BOOLEAN_DATA_TYPE__INITIAL_VALUE:
				unsetInitialValue();
				return;
			case XtcePackage.BOOLEAN_DATA_TYPE__ONE_STRING_VALUE:
				unsetOneStringValue();
				return;
			case XtcePackage.BOOLEAN_DATA_TYPE__ZERO_STRING_VALUE:
				unsetZeroStringValue();
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
			case XtcePackage.BOOLEAN_DATA_TYPE__INITIAL_VALUE:
				return isSetInitialValue();
			case XtcePackage.BOOLEAN_DATA_TYPE__ONE_STRING_VALUE:
				return isSetOneStringValue();
			case XtcePackage.BOOLEAN_DATA_TYPE__ZERO_STRING_VALUE:
				return isSetZeroStringValue();
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
		result.append(" (initialValue: ");
		if (initialValueESet) result.append(initialValue); else result.append("<unset>");
		result.append(", oneStringValue: ");
		if (oneStringValueESet) result.append(oneStringValue); else result.append("<unset>");
		result.append(", zeroStringValue: ");
		if (zeroStringValueESet) result.append(zeroStringValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BooleanDataTypeImpl
