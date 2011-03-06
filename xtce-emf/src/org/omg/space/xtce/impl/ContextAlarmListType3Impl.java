/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.space.xtce.ContextAlarmListType3;
import org.omg.space.xtce.ContextAlarmType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Alarm List Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ContextAlarmListType3Impl#getContextAlarm <em>Context Alarm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextAlarmListType3Impl extends EObjectImpl implements ContextAlarmListType3 {
	/**
	 * The cached value of the '{@link #getContextAlarm() <em>Context Alarm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextAlarm()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextAlarmType> contextAlarm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextAlarmListType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getContextAlarmListType3();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextAlarmType> getContextAlarm() {
		if (contextAlarm == null) {
			contextAlarm = new EObjectContainmentEList<ContextAlarmType>(ContextAlarmType.class, this, XtcePackage.CONTEXT_ALARM_LIST_TYPE3__CONTEXT_ALARM);
		}
		return contextAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.CONTEXT_ALARM_LIST_TYPE3__CONTEXT_ALARM:
				return ((InternalEList<?>)getContextAlarm()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.CONTEXT_ALARM_LIST_TYPE3__CONTEXT_ALARM:
				return getContextAlarm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XtcePackage.CONTEXT_ALARM_LIST_TYPE3__CONTEXT_ALARM:
				getContextAlarm().clear();
				getContextAlarm().addAll((Collection<? extends ContextAlarmType>)newValue);
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
			case XtcePackage.CONTEXT_ALARM_LIST_TYPE3__CONTEXT_ALARM:
				getContextAlarm().clear();
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
			case XtcePackage.CONTEXT_ALARM_LIST_TYPE3__CONTEXT_ALARM:
				return contextAlarm != null && !contextAlarm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextAlarmListType3Impl
