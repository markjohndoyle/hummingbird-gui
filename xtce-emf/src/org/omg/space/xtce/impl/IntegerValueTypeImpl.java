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

import org.omg.space.xtce.DiscreteLookupListType;
import org.omg.space.xtce.DynamicValueType1;
import org.omg.space.xtce.IntegerValueType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.IntegerValueTypeImpl#getFixedValue <em>Fixed Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.IntegerValueTypeImpl#getDynamicValue <em>Dynamic Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.IntegerValueTypeImpl#getDiscreteLookupList <em>Discrete Lookup List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerValueTypeImpl extends EObjectImpl implements IntegerValueType {
	/**
	 * The default value of the '{@link #getFixedValue() <em>Fixed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object FIXED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixedValue() <em>Fixed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedValue()
	 * @generated
	 * @ordered
	 */
	protected Object fixedValue = FIXED_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDynamicValue() <em>Dynamic Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicValue()
	 * @generated
	 * @ordered
	 */
	protected DynamicValueType1 dynamicValue;

	/**
	 * The cached value of the '{@link #getDiscreteLookupList() <em>Discrete Lookup List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscreteLookupList()
	 * @generated
	 * @ordered
	 */
	protected DiscreteLookupListType discreteLookupList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getIntegerValueType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFixedValue() {
		return fixedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedValue(Object newFixedValue) {
		Object oldFixedValue = fixedValue;
		fixedValue = newFixedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INTEGER_VALUE_TYPE__FIXED_VALUE, oldFixedValue, fixedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicValueType1 getDynamicValue() {
		return dynamicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicValue(DynamicValueType1 newDynamicValue, NotificationChain msgs) {
		DynamicValueType1 oldDynamicValue = dynamicValue;
		dynamicValue = newDynamicValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.INTEGER_VALUE_TYPE__DYNAMIC_VALUE, oldDynamicValue, newDynamicValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicValue(DynamicValueType1 newDynamicValue) {
		if (newDynamicValue != dynamicValue) {
			NotificationChain msgs = null;
			if (dynamicValue != null)
				msgs = ((InternalEObject)dynamicValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.INTEGER_VALUE_TYPE__DYNAMIC_VALUE, null, msgs);
			if (newDynamicValue != null)
				msgs = ((InternalEObject)newDynamicValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.INTEGER_VALUE_TYPE__DYNAMIC_VALUE, null, msgs);
			msgs = basicSetDynamicValue(newDynamicValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INTEGER_VALUE_TYPE__DYNAMIC_VALUE, newDynamicValue, newDynamicValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteLookupListType getDiscreteLookupList() {
		return discreteLookupList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscreteLookupList(DiscreteLookupListType newDiscreteLookupList, NotificationChain msgs) {
		DiscreteLookupListType oldDiscreteLookupList = discreteLookupList;
		discreteLookupList = newDiscreteLookupList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.INTEGER_VALUE_TYPE__DISCRETE_LOOKUP_LIST, oldDiscreteLookupList, newDiscreteLookupList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscreteLookupList(DiscreteLookupListType newDiscreteLookupList) {
		if (newDiscreteLookupList != discreteLookupList) {
			NotificationChain msgs = null;
			if (discreteLookupList != null)
				msgs = ((InternalEObject)discreteLookupList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.INTEGER_VALUE_TYPE__DISCRETE_LOOKUP_LIST, null, msgs);
			if (newDiscreteLookupList != null)
				msgs = ((InternalEObject)newDiscreteLookupList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.INTEGER_VALUE_TYPE__DISCRETE_LOOKUP_LIST, null, msgs);
			msgs = basicSetDiscreteLookupList(newDiscreteLookupList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INTEGER_VALUE_TYPE__DISCRETE_LOOKUP_LIST, newDiscreteLookupList, newDiscreteLookupList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.INTEGER_VALUE_TYPE__DYNAMIC_VALUE:
				return basicSetDynamicValue(null, msgs);
			case XtcePackage.INTEGER_VALUE_TYPE__DISCRETE_LOOKUP_LIST:
				return basicSetDiscreteLookupList(null, msgs);
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
			case XtcePackage.INTEGER_VALUE_TYPE__FIXED_VALUE:
				return getFixedValue();
			case XtcePackage.INTEGER_VALUE_TYPE__DYNAMIC_VALUE:
				return getDynamicValue();
			case XtcePackage.INTEGER_VALUE_TYPE__DISCRETE_LOOKUP_LIST:
				return getDiscreteLookupList();
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
			case XtcePackage.INTEGER_VALUE_TYPE__FIXED_VALUE:
				setFixedValue(newValue);
				return;
			case XtcePackage.INTEGER_VALUE_TYPE__DYNAMIC_VALUE:
				setDynamicValue((DynamicValueType1)newValue);
				return;
			case XtcePackage.INTEGER_VALUE_TYPE__DISCRETE_LOOKUP_LIST:
				setDiscreteLookupList((DiscreteLookupListType)newValue);
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
			case XtcePackage.INTEGER_VALUE_TYPE__FIXED_VALUE:
				setFixedValue(FIXED_VALUE_EDEFAULT);
				return;
			case XtcePackage.INTEGER_VALUE_TYPE__DYNAMIC_VALUE:
				setDynamicValue((DynamicValueType1)null);
				return;
			case XtcePackage.INTEGER_VALUE_TYPE__DISCRETE_LOOKUP_LIST:
				setDiscreteLookupList((DiscreteLookupListType)null);
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
			case XtcePackage.INTEGER_VALUE_TYPE__FIXED_VALUE:
				return FIXED_VALUE_EDEFAULT == null ? fixedValue != null : !FIXED_VALUE_EDEFAULT.equals(fixedValue);
			case XtcePackage.INTEGER_VALUE_TYPE__DYNAMIC_VALUE:
				return dynamicValue != null;
			case XtcePackage.INTEGER_VALUE_TYPE__DISCRETE_LOOKUP_LIST:
				return discreteLookupList != null;
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
		result.append(" (fixedValue: ");
		result.append(fixedValue);
		result.append(')');
		return result.toString();
	}

} //IntegerValueTypeImpl
