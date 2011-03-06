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

import org.omg.space.xtce.EnumeratedDataType;
import org.omg.space.xtce.EnumerationListType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumerated Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.EnumeratedDataTypeImpl#getEnumerationList <em>Enumeration List</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.EnumeratedDataTypeImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumeratedDataTypeImpl extends BaseDataTypeImpl implements EnumeratedDataType {
	/**
	 * The cached value of the '{@link #getEnumerationList() <em>Enumeration List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationList()
	 * @generated
	 * @ordered
	 */
	protected EnumerationListType enumerationList;

	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected String initialValue = INITIAL_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getEnumeratedDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationListType getEnumerationList() {
		return enumerationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumerationList(EnumerationListType newEnumerationList, NotificationChain msgs) {
		EnumerationListType oldEnumerationList = enumerationList;
		enumerationList = newEnumerationList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ENUMERATED_DATA_TYPE__ENUMERATION_LIST, oldEnumerationList, newEnumerationList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumerationList(EnumerationListType newEnumerationList) {
		if (newEnumerationList != enumerationList) {
			NotificationChain msgs = null;
			if (enumerationList != null)
				msgs = ((InternalEObject)enumerationList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ENUMERATED_DATA_TYPE__ENUMERATION_LIST, null, msgs);
			if (newEnumerationList != null)
				msgs = ((InternalEObject)newEnumerationList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ENUMERATED_DATA_TYPE__ENUMERATION_LIST, null, msgs);
			msgs = basicSetEnumerationList(newEnumerationList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ENUMERATED_DATA_TYPE__ENUMERATION_LIST, newEnumerationList, newEnumerationList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(String newInitialValue) {
		String oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ENUMERATED_DATA_TYPE__INITIAL_VALUE, oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.ENUMERATED_DATA_TYPE__ENUMERATION_LIST:
				return basicSetEnumerationList(null, msgs);
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
			case XtcePackage.ENUMERATED_DATA_TYPE__ENUMERATION_LIST:
				return getEnumerationList();
			case XtcePackage.ENUMERATED_DATA_TYPE__INITIAL_VALUE:
				return getInitialValue();
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
			case XtcePackage.ENUMERATED_DATA_TYPE__ENUMERATION_LIST:
				setEnumerationList((EnumerationListType)newValue);
				return;
			case XtcePackage.ENUMERATED_DATA_TYPE__INITIAL_VALUE:
				setInitialValue((String)newValue);
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
			case XtcePackage.ENUMERATED_DATA_TYPE__ENUMERATION_LIST:
				setEnumerationList((EnumerationListType)null);
				return;
			case XtcePackage.ENUMERATED_DATA_TYPE__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
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
			case XtcePackage.ENUMERATED_DATA_TYPE__ENUMERATION_LIST:
				return enumerationList != null;
			case XtcePackage.ENUMERATED_DATA_TYPE__INITIAL_VALUE:
				return INITIAL_VALUE_EDEFAULT == null ? initialValue != null : !INITIAL_VALUE_EDEFAULT.equals(initialValue);
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
		result.append(initialValue);
		result.append(')');
		return result.toString();
	}

} //EnumeratedDataTypeImpl
