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

import org.omg.space.xtce.AlarmConditionsType;
import org.omg.space.xtce.ConditionalAlarmType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Alarm Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ConditionalAlarmTypeImpl#getStaticAlarmConditions <em>Static Alarm Conditions</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ConditionalAlarmTypeImpl#getChangePerSecondAlarmConditions <em>Change Per Second Alarm Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalAlarmTypeImpl extends EObjectImpl implements ConditionalAlarmType {
	/**
	 * The cached value of the '{@link #getStaticAlarmConditions() <em>Static Alarm Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticAlarmConditions()
	 * @generated
	 * @ordered
	 */
	protected AlarmConditionsType staticAlarmConditions;

	/**
	 * The cached value of the '{@link #getChangePerSecondAlarmConditions() <em>Change Per Second Alarm Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangePerSecondAlarmConditions()
	 * @generated
	 * @ordered
	 */
	protected AlarmConditionsType changePerSecondAlarmConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalAlarmTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getConditionalAlarmType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlarmConditionsType getStaticAlarmConditions() {
		return staticAlarmConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticAlarmConditions(AlarmConditionsType newStaticAlarmConditions, NotificationChain msgs) {
		AlarmConditionsType oldStaticAlarmConditions = staticAlarmConditions;
		staticAlarmConditions = newStaticAlarmConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CONDITIONAL_ALARM_TYPE__STATIC_ALARM_CONDITIONS, oldStaticAlarmConditions, newStaticAlarmConditions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticAlarmConditions(AlarmConditionsType newStaticAlarmConditions) {
		if (newStaticAlarmConditions != staticAlarmConditions) {
			NotificationChain msgs = null;
			if (staticAlarmConditions != null)
				msgs = ((InternalEObject)staticAlarmConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONDITIONAL_ALARM_TYPE__STATIC_ALARM_CONDITIONS, null, msgs);
			if (newStaticAlarmConditions != null)
				msgs = ((InternalEObject)newStaticAlarmConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONDITIONAL_ALARM_TYPE__STATIC_ALARM_CONDITIONS, null, msgs);
			msgs = basicSetStaticAlarmConditions(newStaticAlarmConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CONDITIONAL_ALARM_TYPE__STATIC_ALARM_CONDITIONS, newStaticAlarmConditions, newStaticAlarmConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlarmConditionsType getChangePerSecondAlarmConditions() {
		return changePerSecondAlarmConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangePerSecondAlarmConditions(AlarmConditionsType newChangePerSecondAlarmConditions, NotificationChain msgs) {
		AlarmConditionsType oldChangePerSecondAlarmConditions = changePerSecondAlarmConditions;
		changePerSecondAlarmConditions = newChangePerSecondAlarmConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CONDITIONAL_ALARM_TYPE__CHANGE_PER_SECOND_ALARM_CONDITIONS, oldChangePerSecondAlarmConditions, newChangePerSecondAlarmConditions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangePerSecondAlarmConditions(AlarmConditionsType newChangePerSecondAlarmConditions) {
		if (newChangePerSecondAlarmConditions != changePerSecondAlarmConditions) {
			NotificationChain msgs = null;
			if (changePerSecondAlarmConditions != null)
				msgs = ((InternalEObject)changePerSecondAlarmConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONDITIONAL_ALARM_TYPE__CHANGE_PER_SECOND_ALARM_CONDITIONS, null, msgs);
			if (newChangePerSecondAlarmConditions != null)
				msgs = ((InternalEObject)newChangePerSecondAlarmConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONDITIONAL_ALARM_TYPE__CHANGE_PER_SECOND_ALARM_CONDITIONS, null, msgs);
			msgs = basicSetChangePerSecondAlarmConditions(newChangePerSecondAlarmConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CONDITIONAL_ALARM_TYPE__CHANGE_PER_SECOND_ALARM_CONDITIONS, newChangePerSecondAlarmConditions, newChangePerSecondAlarmConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.CONDITIONAL_ALARM_TYPE__STATIC_ALARM_CONDITIONS:
				return basicSetStaticAlarmConditions(null, msgs);
			case XtcePackage.CONDITIONAL_ALARM_TYPE__CHANGE_PER_SECOND_ALARM_CONDITIONS:
				return basicSetChangePerSecondAlarmConditions(null, msgs);
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
			case XtcePackage.CONDITIONAL_ALARM_TYPE__STATIC_ALARM_CONDITIONS:
				return getStaticAlarmConditions();
			case XtcePackage.CONDITIONAL_ALARM_TYPE__CHANGE_PER_SECOND_ALARM_CONDITIONS:
				return getChangePerSecondAlarmConditions();
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
			case XtcePackage.CONDITIONAL_ALARM_TYPE__STATIC_ALARM_CONDITIONS:
				setStaticAlarmConditions((AlarmConditionsType)newValue);
				return;
			case XtcePackage.CONDITIONAL_ALARM_TYPE__CHANGE_PER_SECOND_ALARM_CONDITIONS:
				setChangePerSecondAlarmConditions((AlarmConditionsType)newValue);
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
			case XtcePackage.CONDITIONAL_ALARM_TYPE__STATIC_ALARM_CONDITIONS:
				setStaticAlarmConditions((AlarmConditionsType)null);
				return;
			case XtcePackage.CONDITIONAL_ALARM_TYPE__CHANGE_PER_SECOND_ALARM_CONDITIONS:
				setChangePerSecondAlarmConditions((AlarmConditionsType)null);
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
			case XtcePackage.CONDITIONAL_ALARM_TYPE__STATIC_ALARM_CONDITIONS:
				return staticAlarmConditions != null;
			case XtcePackage.CONDITIONAL_ALARM_TYPE__CHANGE_PER_SECOND_ALARM_CONDITIONS:
				return changePerSecondAlarmConditions != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalAlarmTypeImpl
