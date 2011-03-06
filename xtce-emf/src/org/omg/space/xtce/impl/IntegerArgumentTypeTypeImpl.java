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

import org.omg.space.xtce.ContextAlarmListType1;
import org.omg.space.xtce.IntegerArgumentTypeType;
import org.omg.space.xtce.NumericAlarmConditionType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Argument Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.IntegerArgumentTypeTypeImpl#getDefaultAlarm <em>Default Alarm</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.IntegerArgumentTypeTypeImpl#getContextAlarmList <em>Context Alarm List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerArgumentTypeTypeImpl extends IntegerDataTypeImpl implements IntegerArgumentTypeType {
	/**
	 * The cached value of the '{@link #getDefaultAlarm() <em>Default Alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAlarm()
	 * @generated
	 * @ordered
	 */
	protected NumericAlarmConditionType defaultAlarm;

	/**
	 * The cached value of the '{@link #getContextAlarmList() <em>Context Alarm List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextAlarmList()
	 * @generated
	 * @ordered
	 */
	protected ContextAlarmListType1 contextAlarmList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerArgumentTypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getIntegerArgumentTypeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericAlarmConditionType getDefaultAlarm() {
		return defaultAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultAlarm(NumericAlarmConditionType newDefaultAlarm, NotificationChain msgs) {
		NumericAlarmConditionType oldDefaultAlarm = defaultAlarm;
		defaultAlarm = newDefaultAlarm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM, oldDefaultAlarm, newDefaultAlarm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultAlarm(NumericAlarmConditionType newDefaultAlarm) {
		if (newDefaultAlarm != defaultAlarm) {
			NotificationChain msgs = null;
			if (defaultAlarm != null)
				msgs = ((InternalEObject)defaultAlarm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM, null, msgs);
			if (newDefaultAlarm != null)
				msgs = ((InternalEObject)newDefaultAlarm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM, null, msgs);
			msgs = basicSetDefaultAlarm(newDefaultAlarm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM, newDefaultAlarm, newDefaultAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAlarmListType1 getContextAlarmList() {
		return contextAlarmList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextAlarmList(ContextAlarmListType1 newContextAlarmList, NotificationChain msgs) {
		ContextAlarmListType1 oldContextAlarmList = contextAlarmList;
		contextAlarmList = newContextAlarmList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST, oldContextAlarmList, newContextAlarmList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextAlarmList(ContextAlarmListType1 newContextAlarmList) {
		if (newContextAlarmList != contextAlarmList) {
			NotificationChain msgs = null;
			if (contextAlarmList != null)
				msgs = ((InternalEObject)contextAlarmList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST, null, msgs);
			if (newContextAlarmList != null)
				msgs = ((InternalEObject)newContextAlarmList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST, null, msgs);
			msgs = basicSetContextAlarmList(newContextAlarmList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST, newContextAlarmList, newContextAlarmList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM:
				return basicSetDefaultAlarm(null, msgs);
			case XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST:
				return basicSetContextAlarmList(null, msgs);
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
			case XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM:
				return getDefaultAlarm();
			case XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST:
				return getContextAlarmList();
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
			case XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM:
				setDefaultAlarm((NumericAlarmConditionType)newValue);
				return;
			case XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST:
				setContextAlarmList((ContextAlarmListType1)newValue);
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
			case XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM:
				setDefaultAlarm((NumericAlarmConditionType)null);
				return;
			case XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST:
				setContextAlarmList((ContextAlarmListType1)null);
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
			case XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM:
				return defaultAlarm != null;
			case XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST:
				return contextAlarmList != null;
		}
		return super.eIsSet(featureID);
	}

} //IntegerArgumentTypeTypeImpl
