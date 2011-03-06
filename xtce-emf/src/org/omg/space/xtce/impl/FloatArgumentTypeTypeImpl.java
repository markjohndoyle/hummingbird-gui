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

import org.omg.space.xtce.ContextAlarmListType;
import org.omg.space.xtce.FloatArgumentTypeType;
import org.omg.space.xtce.NumericAlarmConditionType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float Argument Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.FloatArgumentTypeTypeImpl#getDefaultAlarm <em>Default Alarm</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.FloatArgumentTypeTypeImpl#getContextAlarmList <em>Context Alarm List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FloatArgumentTypeTypeImpl extends FloatDataTypeImpl implements FloatArgumentTypeType {
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
	protected ContextAlarmListType contextAlarmList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatArgumentTypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getFloatArgumentTypeType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM, oldDefaultAlarm, newDefaultAlarm);
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
				msgs = ((InternalEObject)defaultAlarm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM, null, msgs);
			if (newDefaultAlarm != null)
				msgs = ((InternalEObject)newDefaultAlarm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM, null, msgs);
			msgs = basicSetDefaultAlarm(newDefaultAlarm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM, newDefaultAlarm, newDefaultAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAlarmListType getContextAlarmList() {
		return contextAlarmList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextAlarmList(ContextAlarmListType newContextAlarmList, NotificationChain msgs) {
		ContextAlarmListType oldContextAlarmList = contextAlarmList;
		contextAlarmList = newContextAlarmList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST, oldContextAlarmList, newContextAlarmList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextAlarmList(ContextAlarmListType newContextAlarmList) {
		if (newContextAlarmList != contextAlarmList) {
			NotificationChain msgs = null;
			if (contextAlarmList != null)
				msgs = ((InternalEObject)contextAlarmList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST, null, msgs);
			if (newContextAlarmList != null)
				msgs = ((InternalEObject)newContextAlarmList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST, null, msgs);
			msgs = basicSetContextAlarmList(newContextAlarmList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST, newContextAlarmList, newContextAlarmList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM:
				return basicSetDefaultAlarm(null, msgs);
			case XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST:
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
			case XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM:
				return getDefaultAlarm();
			case XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST:
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
			case XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM:
				setDefaultAlarm((NumericAlarmConditionType)newValue);
				return;
			case XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST:
				setContextAlarmList((ContextAlarmListType)newValue);
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
			case XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM:
				setDefaultAlarm((NumericAlarmConditionType)null);
				return;
			case XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST:
				setContextAlarmList((ContextAlarmListType)null);
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
			case XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM:
				return defaultAlarm != null;
			case XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST:
				return contextAlarmList != null;
		}
		return super.eIsSet(featureID);
	}

} //FloatArgumentTypeTypeImpl
