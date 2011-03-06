/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.AlarmRangesType;
import org.omg.space.xtce.ConditionalAlarmType;
import org.omg.space.xtce.InputAlgorithmType;
import org.omg.space.xtce.NumericAlarmConditionType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Alarm Condition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.NumericAlarmConditionTypeImpl#getStaticAlarmRanges <em>Static Alarm Ranges</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumericAlarmConditionTypeImpl#getChangePerSecondAlarmRanges <em>Change Per Second Alarm Ranges</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumericAlarmConditionTypeImpl#getConditionalAlarm <em>Conditional Alarm</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumericAlarmConditionTypeImpl#getCustomAlarm <em>Custom Alarm</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumericAlarmConditionTypeImpl#getMinViolations <em>Min Violations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericAlarmConditionTypeImpl extends EObjectImpl implements NumericAlarmConditionType {
	/**
	 * The cached value of the '{@link #getStaticAlarmRanges() <em>Static Alarm Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticAlarmRanges()
	 * @generated
	 * @ordered
	 */
	protected AlarmRangesType staticAlarmRanges;

	/**
	 * The cached value of the '{@link #getChangePerSecondAlarmRanges() <em>Change Per Second Alarm Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangePerSecondAlarmRanges()
	 * @generated
	 * @ordered
	 */
	protected AlarmRangesType changePerSecondAlarmRanges;

	/**
	 * The cached value of the '{@link #getConditionalAlarm() <em>Conditional Alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalAlarm()
	 * @generated
	 * @ordered
	 */
	protected ConditionalAlarmType conditionalAlarm;

	/**
	 * The cached value of the '{@link #getCustomAlarm() <em>Custom Alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomAlarm()
	 * @generated
	 * @ordered
	 */
	protected InputAlgorithmType customAlarm;

	/**
	 * The default value of the '{@link #getMinViolations() <em>Min Violations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinViolations()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_VIOLATIONS_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getMinViolations() <em>Min Violations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinViolations()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minViolations = MIN_VIOLATIONS_EDEFAULT;

	/**
	 * This is true if the Min Violations attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minViolationsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericAlarmConditionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getNumericAlarmConditionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlarmRangesType getStaticAlarmRanges() {
		return staticAlarmRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticAlarmRanges(AlarmRangesType newStaticAlarmRanges, NotificationChain msgs) {
		AlarmRangesType oldStaticAlarmRanges = staticAlarmRanges;
		staticAlarmRanges = newStaticAlarmRanges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__STATIC_ALARM_RANGES, oldStaticAlarmRanges, newStaticAlarmRanges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticAlarmRanges(AlarmRangesType newStaticAlarmRanges) {
		if (newStaticAlarmRanges != staticAlarmRanges) {
			NotificationChain msgs = null;
			if (staticAlarmRanges != null)
				msgs = ((InternalEObject)staticAlarmRanges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__STATIC_ALARM_RANGES, null, msgs);
			if (newStaticAlarmRanges != null)
				msgs = ((InternalEObject)newStaticAlarmRanges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__STATIC_ALARM_RANGES, null, msgs);
			msgs = basicSetStaticAlarmRanges(newStaticAlarmRanges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__STATIC_ALARM_RANGES, newStaticAlarmRanges, newStaticAlarmRanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlarmRangesType getChangePerSecondAlarmRanges() {
		return changePerSecondAlarmRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangePerSecondAlarmRanges(AlarmRangesType newChangePerSecondAlarmRanges, NotificationChain msgs) {
		AlarmRangesType oldChangePerSecondAlarmRanges = changePerSecondAlarmRanges;
		changePerSecondAlarmRanges = newChangePerSecondAlarmRanges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CHANGE_PER_SECOND_ALARM_RANGES, oldChangePerSecondAlarmRanges, newChangePerSecondAlarmRanges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangePerSecondAlarmRanges(AlarmRangesType newChangePerSecondAlarmRanges) {
		if (newChangePerSecondAlarmRanges != changePerSecondAlarmRanges) {
			NotificationChain msgs = null;
			if (changePerSecondAlarmRanges != null)
				msgs = ((InternalEObject)changePerSecondAlarmRanges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CHANGE_PER_SECOND_ALARM_RANGES, null, msgs);
			if (newChangePerSecondAlarmRanges != null)
				msgs = ((InternalEObject)newChangePerSecondAlarmRanges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CHANGE_PER_SECOND_ALARM_RANGES, null, msgs);
			msgs = basicSetChangePerSecondAlarmRanges(newChangePerSecondAlarmRanges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CHANGE_PER_SECOND_ALARM_RANGES, newChangePerSecondAlarmRanges, newChangePerSecondAlarmRanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalAlarmType getConditionalAlarm() {
		return conditionalAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalAlarm(ConditionalAlarmType newConditionalAlarm, NotificationChain msgs) {
		ConditionalAlarmType oldConditionalAlarm = conditionalAlarm;
		conditionalAlarm = newConditionalAlarm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CONDITIONAL_ALARM, oldConditionalAlarm, newConditionalAlarm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalAlarm(ConditionalAlarmType newConditionalAlarm) {
		if (newConditionalAlarm != conditionalAlarm) {
			NotificationChain msgs = null;
			if (conditionalAlarm != null)
				msgs = ((InternalEObject)conditionalAlarm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CONDITIONAL_ALARM, null, msgs);
			if (newConditionalAlarm != null)
				msgs = ((InternalEObject)newConditionalAlarm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CONDITIONAL_ALARM, null, msgs);
			msgs = basicSetConditionalAlarm(newConditionalAlarm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CONDITIONAL_ALARM, newConditionalAlarm, newConditionalAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputAlgorithmType getCustomAlarm() {
		return customAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomAlarm(InputAlgorithmType newCustomAlarm, NotificationChain msgs) {
		InputAlgorithmType oldCustomAlarm = customAlarm;
		customAlarm = newCustomAlarm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CUSTOM_ALARM, oldCustomAlarm, newCustomAlarm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomAlarm(InputAlgorithmType newCustomAlarm) {
		if (newCustomAlarm != customAlarm) {
			NotificationChain msgs = null;
			if (customAlarm != null)
				msgs = ((InternalEObject)customAlarm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CUSTOM_ALARM, null, msgs);
			if (newCustomAlarm != null)
				msgs = ((InternalEObject)newCustomAlarm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CUSTOM_ALARM, null, msgs);
			msgs = basicSetCustomAlarm(newCustomAlarm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CUSTOM_ALARM, newCustomAlarm, newCustomAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinViolations() {
		return minViolations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinViolations(BigInteger newMinViolations) {
		BigInteger oldMinViolations = minViolations;
		minViolations = newMinViolations;
		boolean oldMinViolationsESet = minViolationsESet;
		minViolationsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__MIN_VIOLATIONS, oldMinViolations, minViolations, !oldMinViolationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinViolations() {
		BigInteger oldMinViolations = minViolations;
		boolean oldMinViolationsESet = minViolationsESet;
		minViolations = MIN_VIOLATIONS_EDEFAULT;
		minViolationsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__MIN_VIOLATIONS, oldMinViolations, MIN_VIOLATIONS_EDEFAULT, oldMinViolationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinViolations() {
		return minViolationsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__STATIC_ALARM_RANGES:
				return basicSetStaticAlarmRanges(null, msgs);
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CHANGE_PER_SECOND_ALARM_RANGES:
				return basicSetChangePerSecondAlarmRanges(null, msgs);
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CONDITIONAL_ALARM:
				return basicSetConditionalAlarm(null, msgs);
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CUSTOM_ALARM:
				return basicSetCustomAlarm(null, msgs);
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
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__STATIC_ALARM_RANGES:
				return getStaticAlarmRanges();
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CHANGE_PER_SECOND_ALARM_RANGES:
				return getChangePerSecondAlarmRanges();
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CONDITIONAL_ALARM:
				return getConditionalAlarm();
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CUSTOM_ALARM:
				return getCustomAlarm();
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__MIN_VIOLATIONS:
				return getMinViolations();
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
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__STATIC_ALARM_RANGES:
				setStaticAlarmRanges((AlarmRangesType)newValue);
				return;
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CHANGE_PER_SECOND_ALARM_RANGES:
				setChangePerSecondAlarmRanges((AlarmRangesType)newValue);
				return;
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CONDITIONAL_ALARM:
				setConditionalAlarm((ConditionalAlarmType)newValue);
				return;
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CUSTOM_ALARM:
				setCustomAlarm((InputAlgorithmType)newValue);
				return;
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__MIN_VIOLATIONS:
				setMinViolations((BigInteger)newValue);
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
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__STATIC_ALARM_RANGES:
				setStaticAlarmRanges((AlarmRangesType)null);
				return;
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CHANGE_PER_SECOND_ALARM_RANGES:
				setChangePerSecondAlarmRanges((AlarmRangesType)null);
				return;
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CONDITIONAL_ALARM:
				setConditionalAlarm((ConditionalAlarmType)null);
				return;
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CUSTOM_ALARM:
				setCustomAlarm((InputAlgorithmType)null);
				return;
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__MIN_VIOLATIONS:
				unsetMinViolations();
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
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__STATIC_ALARM_RANGES:
				return staticAlarmRanges != null;
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CHANGE_PER_SECOND_ALARM_RANGES:
				return changePerSecondAlarmRanges != null;
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CONDITIONAL_ALARM:
				return conditionalAlarm != null;
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CUSTOM_ALARM:
				return customAlarm != null;
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__MIN_VIOLATIONS:
				return isSetMinViolations();
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
		result.append(" (minViolations: ");
		if (minViolationsESet) result.append(minViolations); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NumericAlarmConditionTypeImpl
