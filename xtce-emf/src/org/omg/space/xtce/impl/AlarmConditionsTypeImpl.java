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
import org.omg.space.xtce.MatchCriteriaType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alarm Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.AlarmConditionsTypeImpl#getWatchAlarm <em>Watch Alarm</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.AlarmConditionsTypeImpl#getWarningAlarm <em>Warning Alarm</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.AlarmConditionsTypeImpl#getDistressAlarm <em>Distress Alarm</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.AlarmConditionsTypeImpl#getCritialAlarm <em>Critial Alarm</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.AlarmConditionsTypeImpl#getSevereAlarm <em>Severe Alarm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlarmConditionsTypeImpl extends EObjectImpl implements AlarmConditionsType {
	/**
	 * The cached value of the '{@link #getWatchAlarm() <em>Watch Alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWatchAlarm()
	 * @generated
	 * @ordered
	 */
	protected MatchCriteriaType watchAlarm;

	/**
	 * The cached value of the '{@link #getWarningAlarm() <em>Warning Alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarningAlarm()
	 * @generated
	 * @ordered
	 */
	protected MatchCriteriaType warningAlarm;

	/**
	 * The cached value of the '{@link #getDistressAlarm() <em>Distress Alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistressAlarm()
	 * @generated
	 * @ordered
	 */
	protected MatchCriteriaType distressAlarm;

	/**
	 * The cached value of the '{@link #getCritialAlarm() <em>Critial Alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCritialAlarm()
	 * @generated
	 * @ordered
	 */
	protected MatchCriteriaType critialAlarm;

	/**
	 * The cached value of the '{@link #getSevereAlarm() <em>Severe Alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSevereAlarm()
	 * @generated
	 * @ordered
	 */
	protected MatchCriteriaType severeAlarm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlarmConditionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getAlarmConditionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchCriteriaType getWatchAlarm() {
		return watchAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWatchAlarm(MatchCriteriaType newWatchAlarm, NotificationChain msgs) {
		MatchCriteriaType oldWatchAlarm = watchAlarm;
		watchAlarm = newWatchAlarm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_CONDITIONS_TYPE__WATCH_ALARM, oldWatchAlarm, newWatchAlarm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWatchAlarm(MatchCriteriaType newWatchAlarm) {
		if (newWatchAlarm != watchAlarm) {
			NotificationChain msgs = null;
			if (watchAlarm != null)
				msgs = ((InternalEObject)watchAlarm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_CONDITIONS_TYPE__WATCH_ALARM, null, msgs);
			if (newWatchAlarm != null)
				msgs = ((InternalEObject)newWatchAlarm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_CONDITIONS_TYPE__WATCH_ALARM, null, msgs);
			msgs = basicSetWatchAlarm(newWatchAlarm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_CONDITIONS_TYPE__WATCH_ALARM, newWatchAlarm, newWatchAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchCriteriaType getWarningAlarm() {
		return warningAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWarningAlarm(MatchCriteriaType newWarningAlarm, NotificationChain msgs) {
		MatchCriteriaType oldWarningAlarm = warningAlarm;
		warningAlarm = newWarningAlarm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_CONDITIONS_TYPE__WARNING_ALARM, oldWarningAlarm, newWarningAlarm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarningAlarm(MatchCriteriaType newWarningAlarm) {
		if (newWarningAlarm != warningAlarm) {
			NotificationChain msgs = null;
			if (warningAlarm != null)
				msgs = ((InternalEObject)warningAlarm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_CONDITIONS_TYPE__WARNING_ALARM, null, msgs);
			if (newWarningAlarm != null)
				msgs = ((InternalEObject)newWarningAlarm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_CONDITIONS_TYPE__WARNING_ALARM, null, msgs);
			msgs = basicSetWarningAlarm(newWarningAlarm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_CONDITIONS_TYPE__WARNING_ALARM, newWarningAlarm, newWarningAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchCriteriaType getDistressAlarm() {
		return distressAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistressAlarm(MatchCriteriaType newDistressAlarm, NotificationChain msgs) {
		MatchCriteriaType oldDistressAlarm = distressAlarm;
		distressAlarm = newDistressAlarm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_CONDITIONS_TYPE__DISTRESS_ALARM, oldDistressAlarm, newDistressAlarm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistressAlarm(MatchCriteriaType newDistressAlarm) {
		if (newDistressAlarm != distressAlarm) {
			NotificationChain msgs = null;
			if (distressAlarm != null)
				msgs = ((InternalEObject)distressAlarm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_CONDITIONS_TYPE__DISTRESS_ALARM, null, msgs);
			if (newDistressAlarm != null)
				msgs = ((InternalEObject)newDistressAlarm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_CONDITIONS_TYPE__DISTRESS_ALARM, null, msgs);
			msgs = basicSetDistressAlarm(newDistressAlarm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_CONDITIONS_TYPE__DISTRESS_ALARM, newDistressAlarm, newDistressAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchCriteriaType getCritialAlarm() {
		return critialAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCritialAlarm(MatchCriteriaType newCritialAlarm, NotificationChain msgs) {
		MatchCriteriaType oldCritialAlarm = critialAlarm;
		critialAlarm = newCritialAlarm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_CONDITIONS_TYPE__CRITIAL_ALARM, oldCritialAlarm, newCritialAlarm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCritialAlarm(MatchCriteriaType newCritialAlarm) {
		if (newCritialAlarm != critialAlarm) {
			NotificationChain msgs = null;
			if (critialAlarm != null)
				msgs = ((InternalEObject)critialAlarm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_CONDITIONS_TYPE__CRITIAL_ALARM, null, msgs);
			if (newCritialAlarm != null)
				msgs = ((InternalEObject)newCritialAlarm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_CONDITIONS_TYPE__CRITIAL_ALARM, null, msgs);
			msgs = basicSetCritialAlarm(newCritialAlarm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_CONDITIONS_TYPE__CRITIAL_ALARM, newCritialAlarm, newCritialAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchCriteriaType getSevereAlarm() {
		return severeAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSevereAlarm(MatchCriteriaType newSevereAlarm, NotificationChain msgs) {
		MatchCriteriaType oldSevereAlarm = severeAlarm;
		severeAlarm = newSevereAlarm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_CONDITIONS_TYPE__SEVERE_ALARM, oldSevereAlarm, newSevereAlarm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSevereAlarm(MatchCriteriaType newSevereAlarm) {
		if (newSevereAlarm != severeAlarm) {
			NotificationChain msgs = null;
			if (severeAlarm != null)
				msgs = ((InternalEObject)severeAlarm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_CONDITIONS_TYPE__SEVERE_ALARM, null, msgs);
			if (newSevereAlarm != null)
				msgs = ((InternalEObject)newSevereAlarm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_CONDITIONS_TYPE__SEVERE_ALARM, null, msgs);
			msgs = basicSetSevereAlarm(newSevereAlarm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_CONDITIONS_TYPE__SEVERE_ALARM, newSevereAlarm, newSevereAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.ALARM_CONDITIONS_TYPE__WATCH_ALARM:
				return basicSetWatchAlarm(null, msgs);
			case XtcePackage.ALARM_CONDITIONS_TYPE__WARNING_ALARM:
				return basicSetWarningAlarm(null, msgs);
			case XtcePackage.ALARM_CONDITIONS_TYPE__DISTRESS_ALARM:
				return basicSetDistressAlarm(null, msgs);
			case XtcePackage.ALARM_CONDITIONS_TYPE__CRITIAL_ALARM:
				return basicSetCritialAlarm(null, msgs);
			case XtcePackage.ALARM_CONDITIONS_TYPE__SEVERE_ALARM:
				return basicSetSevereAlarm(null, msgs);
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
			case XtcePackage.ALARM_CONDITIONS_TYPE__WATCH_ALARM:
				return getWatchAlarm();
			case XtcePackage.ALARM_CONDITIONS_TYPE__WARNING_ALARM:
				return getWarningAlarm();
			case XtcePackage.ALARM_CONDITIONS_TYPE__DISTRESS_ALARM:
				return getDistressAlarm();
			case XtcePackage.ALARM_CONDITIONS_TYPE__CRITIAL_ALARM:
				return getCritialAlarm();
			case XtcePackage.ALARM_CONDITIONS_TYPE__SEVERE_ALARM:
				return getSevereAlarm();
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
			case XtcePackage.ALARM_CONDITIONS_TYPE__WATCH_ALARM:
				setWatchAlarm((MatchCriteriaType)newValue);
				return;
			case XtcePackage.ALARM_CONDITIONS_TYPE__WARNING_ALARM:
				setWarningAlarm((MatchCriteriaType)newValue);
				return;
			case XtcePackage.ALARM_CONDITIONS_TYPE__DISTRESS_ALARM:
				setDistressAlarm((MatchCriteriaType)newValue);
				return;
			case XtcePackage.ALARM_CONDITIONS_TYPE__CRITIAL_ALARM:
				setCritialAlarm((MatchCriteriaType)newValue);
				return;
			case XtcePackage.ALARM_CONDITIONS_TYPE__SEVERE_ALARM:
				setSevereAlarm((MatchCriteriaType)newValue);
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
			case XtcePackage.ALARM_CONDITIONS_TYPE__WATCH_ALARM:
				setWatchAlarm((MatchCriteriaType)null);
				return;
			case XtcePackage.ALARM_CONDITIONS_TYPE__WARNING_ALARM:
				setWarningAlarm((MatchCriteriaType)null);
				return;
			case XtcePackage.ALARM_CONDITIONS_TYPE__DISTRESS_ALARM:
				setDistressAlarm((MatchCriteriaType)null);
				return;
			case XtcePackage.ALARM_CONDITIONS_TYPE__CRITIAL_ALARM:
				setCritialAlarm((MatchCriteriaType)null);
				return;
			case XtcePackage.ALARM_CONDITIONS_TYPE__SEVERE_ALARM:
				setSevereAlarm((MatchCriteriaType)null);
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
			case XtcePackage.ALARM_CONDITIONS_TYPE__WATCH_ALARM:
				return watchAlarm != null;
			case XtcePackage.ALARM_CONDITIONS_TYPE__WARNING_ALARM:
				return warningAlarm != null;
			case XtcePackage.ALARM_CONDITIONS_TYPE__DISTRESS_ALARM:
				return distressAlarm != null;
			case XtcePackage.ALARM_CONDITIONS_TYPE__CRITIAL_ALARM:
				return critialAlarm != null;
			case XtcePackage.ALARM_CONDITIONS_TYPE__SEVERE_ALARM:
				return severeAlarm != null;
		}
		return super.eIsSet(featureID);
	}

} //AlarmConditionsTypeImpl
