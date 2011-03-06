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

import org.omg.space.xtce.AlarmRangesType;
import org.omg.space.xtce.DecimalRangeType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alarm Ranges Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.AlarmRangesTypeImpl#getWatchRange <em>Watch Range</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.AlarmRangesTypeImpl#getWarningRange <em>Warning Range</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.AlarmRangesTypeImpl#getDistressRange <em>Distress Range</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.AlarmRangesTypeImpl#getCriticalRange <em>Critical Range</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.AlarmRangesTypeImpl#getSevereRange <em>Severe Range</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.AlarmRangesTypeImpl#isAppliesToCalibratedValues <em>Applies To Calibrated Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlarmRangesTypeImpl extends EObjectImpl implements AlarmRangesType {
	/**
	 * The cached value of the '{@link #getWatchRange() <em>Watch Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWatchRange()
	 * @generated
	 * @ordered
	 */
	protected DecimalRangeType watchRange;

	/**
	 * The cached value of the '{@link #getWarningRange() <em>Warning Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarningRange()
	 * @generated
	 * @ordered
	 */
	protected DecimalRangeType warningRange;

	/**
	 * The cached value of the '{@link #getDistressRange() <em>Distress Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistressRange()
	 * @generated
	 * @ordered
	 */
	protected DecimalRangeType distressRange;

	/**
	 * The cached value of the '{@link #getCriticalRange() <em>Critical Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalRange()
	 * @generated
	 * @ordered
	 */
	protected DecimalRangeType criticalRange;

	/**
	 * The cached value of the '{@link #getSevereRange() <em>Severe Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSevereRange()
	 * @generated
	 * @ordered
	 */
	protected DecimalRangeType severeRange;

	/**
	 * The default value of the '{@link #isAppliesToCalibratedValues() <em>Applies To Calibrated Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAppliesToCalibratedValues()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLIES_TO_CALIBRATED_VALUES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAppliesToCalibratedValues() <em>Applies To Calibrated Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAppliesToCalibratedValues()
	 * @generated
	 * @ordered
	 */
	protected boolean appliesToCalibratedValues = APPLIES_TO_CALIBRATED_VALUES_EDEFAULT;

	/**
	 * This is true if the Applies To Calibrated Values attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean appliesToCalibratedValuesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlarmRangesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getAlarmRangesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalRangeType getWatchRange() {
		return watchRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWatchRange(DecimalRangeType newWatchRange, NotificationChain msgs) {
		DecimalRangeType oldWatchRange = watchRange;
		watchRange = newWatchRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_RANGES_TYPE__WATCH_RANGE, oldWatchRange, newWatchRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWatchRange(DecimalRangeType newWatchRange) {
		if (newWatchRange != watchRange) {
			NotificationChain msgs = null;
			if (watchRange != null)
				msgs = ((InternalEObject)watchRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_RANGES_TYPE__WATCH_RANGE, null, msgs);
			if (newWatchRange != null)
				msgs = ((InternalEObject)newWatchRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_RANGES_TYPE__WATCH_RANGE, null, msgs);
			msgs = basicSetWatchRange(newWatchRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_RANGES_TYPE__WATCH_RANGE, newWatchRange, newWatchRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalRangeType getWarningRange() {
		return warningRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWarningRange(DecimalRangeType newWarningRange, NotificationChain msgs) {
		DecimalRangeType oldWarningRange = warningRange;
		warningRange = newWarningRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_RANGES_TYPE__WARNING_RANGE, oldWarningRange, newWarningRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarningRange(DecimalRangeType newWarningRange) {
		if (newWarningRange != warningRange) {
			NotificationChain msgs = null;
			if (warningRange != null)
				msgs = ((InternalEObject)warningRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_RANGES_TYPE__WARNING_RANGE, null, msgs);
			if (newWarningRange != null)
				msgs = ((InternalEObject)newWarningRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_RANGES_TYPE__WARNING_RANGE, null, msgs);
			msgs = basicSetWarningRange(newWarningRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_RANGES_TYPE__WARNING_RANGE, newWarningRange, newWarningRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalRangeType getDistressRange() {
		return distressRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistressRange(DecimalRangeType newDistressRange, NotificationChain msgs) {
		DecimalRangeType oldDistressRange = distressRange;
		distressRange = newDistressRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_RANGES_TYPE__DISTRESS_RANGE, oldDistressRange, newDistressRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistressRange(DecimalRangeType newDistressRange) {
		if (newDistressRange != distressRange) {
			NotificationChain msgs = null;
			if (distressRange != null)
				msgs = ((InternalEObject)distressRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_RANGES_TYPE__DISTRESS_RANGE, null, msgs);
			if (newDistressRange != null)
				msgs = ((InternalEObject)newDistressRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_RANGES_TYPE__DISTRESS_RANGE, null, msgs);
			msgs = basicSetDistressRange(newDistressRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_RANGES_TYPE__DISTRESS_RANGE, newDistressRange, newDistressRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalRangeType getCriticalRange() {
		return criticalRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCriticalRange(DecimalRangeType newCriticalRange, NotificationChain msgs) {
		DecimalRangeType oldCriticalRange = criticalRange;
		criticalRange = newCriticalRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_RANGES_TYPE__CRITICAL_RANGE, oldCriticalRange, newCriticalRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticalRange(DecimalRangeType newCriticalRange) {
		if (newCriticalRange != criticalRange) {
			NotificationChain msgs = null;
			if (criticalRange != null)
				msgs = ((InternalEObject)criticalRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_RANGES_TYPE__CRITICAL_RANGE, null, msgs);
			if (newCriticalRange != null)
				msgs = ((InternalEObject)newCriticalRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_RANGES_TYPE__CRITICAL_RANGE, null, msgs);
			msgs = basicSetCriticalRange(newCriticalRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_RANGES_TYPE__CRITICAL_RANGE, newCriticalRange, newCriticalRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalRangeType getSevereRange() {
		return severeRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSevereRange(DecimalRangeType newSevereRange, NotificationChain msgs) {
		DecimalRangeType oldSevereRange = severeRange;
		severeRange = newSevereRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_RANGES_TYPE__SEVERE_RANGE, oldSevereRange, newSevereRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSevereRange(DecimalRangeType newSevereRange) {
		if (newSevereRange != severeRange) {
			NotificationChain msgs = null;
			if (severeRange != null)
				msgs = ((InternalEObject)severeRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_RANGES_TYPE__SEVERE_RANGE, null, msgs);
			if (newSevereRange != null)
				msgs = ((InternalEObject)newSevereRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ALARM_RANGES_TYPE__SEVERE_RANGE, null, msgs);
			msgs = basicSetSevereRange(newSevereRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_RANGES_TYPE__SEVERE_RANGE, newSevereRange, newSevereRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppliesToCalibratedValues() {
		return appliesToCalibratedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliesToCalibratedValues(boolean newAppliesToCalibratedValues) {
		boolean oldAppliesToCalibratedValues = appliesToCalibratedValues;
		appliesToCalibratedValues = newAppliesToCalibratedValues;
		boolean oldAppliesToCalibratedValuesESet = appliesToCalibratedValuesESet;
		appliesToCalibratedValuesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ALARM_RANGES_TYPE__APPLIES_TO_CALIBRATED_VALUES, oldAppliesToCalibratedValues, appliesToCalibratedValues, !oldAppliesToCalibratedValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAppliesToCalibratedValues() {
		boolean oldAppliesToCalibratedValues = appliesToCalibratedValues;
		boolean oldAppliesToCalibratedValuesESet = appliesToCalibratedValuesESet;
		appliesToCalibratedValues = APPLIES_TO_CALIBRATED_VALUES_EDEFAULT;
		appliesToCalibratedValuesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.ALARM_RANGES_TYPE__APPLIES_TO_CALIBRATED_VALUES, oldAppliesToCalibratedValues, APPLIES_TO_CALIBRATED_VALUES_EDEFAULT, oldAppliesToCalibratedValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAppliesToCalibratedValues() {
		return appliesToCalibratedValuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.ALARM_RANGES_TYPE__WATCH_RANGE:
				return basicSetWatchRange(null, msgs);
			case XtcePackage.ALARM_RANGES_TYPE__WARNING_RANGE:
				return basicSetWarningRange(null, msgs);
			case XtcePackage.ALARM_RANGES_TYPE__DISTRESS_RANGE:
				return basicSetDistressRange(null, msgs);
			case XtcePackage.ALARM_RANGES_TYPE__CRITICAL_RANGE:
				return basicSetCriticalRange(null, msgs);
			case XtcePackage.ALARM_RANGES_TYPE__SEVERE_RANGE:
				return basicSetSevereRange(null, msgs);
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
			case XtcePackage.ALARM_RANGES_TYPE__WATCH_RANGE:
				return getWatchRange();
			case XtcePackage.ALARM_RANGES_TYPE__WARNING_RANGE:
				return getWarningRange();
			case XtcePackage.ALARM_RANGES_TYPE__DISTRESS_RANGE:
				return getDistressRange();
			case XtcePackage.ALARM_RANGES_TYPE__CRITICAL_RANGE:
				return getCriticalRange();
			case XtcePackage.ALARM_RANGES_TYPE__SEVERE_RANGE:
				return getSevereRange();
			case XtcePackage.ALARM_RANGES_TYPE__APPLIES_TO_CALIBRATED_VALUES:
				return isAppliesToCalibratedValues();
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
			case XtcePackage.ALARM_RANGES_TYPE__WATCH_RANGE:
				setWatchRange((DecimalRangeType)newValue);
				return;
			case XtcePackage.ALARM_RANGES_TYPE__WARNING_RANGE:
				setWarningRange((DecimalRangeType)newValue);
				return;
			case XtcePackage.ALARM_RANGES_TYPE__DISTRESS_RANGE:
				setDistressRange((DecimalRangeType)newValue);
				return;
			case XtcePackage.ALARM_RANGES_TYPE__CRITICAL_RANGE:
				setCriticalRange((DecimalRangeType)newValue);
				return;
			case XtcePackage.ALARM_RANGES_TYPE__SEVERE_RANGE:
				setSevereRange((DecimalRangeType)newValue);
				return;
			case XtcePackage.ALARM_RANGES_TYPE__APPLIES_TO_CALIBRATED_VALUES:
				setAppliesToCalibratedValues((Boolean)newValue);
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
			case XtcePackage.ALARM_RANGES_TYPE__WATCH_RANGE:
				setWatchRange((DecimalRangeType)null);
				return;
			case XtcePackage.ALARM_RANGES_TYPE__WARNING_RANGE:
				setWarningRange((DecimalRangeType)null);
				return;
			case XtcePackage.ALARM_RANGES_TYPE__DISTRESS_RANGE:
				setDistressRange((DecimalRangeType)null);
				return;
			case XtcePackage.ALARM_RANGES_TYPE__CRITICAL_RANGE:
				setCriticalRange((DecimalRangeType)null);
				return;
			case XtcePackage.ALARM_RANGES_TYPE__SEVERE_RANGE:
				setSevereRange((DecimalRangeType)null);
				return;
			case XtcePackage.ALARM_RANGES_TYPE__APPLIES_TO_CALIBRATED_VALUES:
				unsetAppliesToCalibratedValues();
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
			case XtcePackage.ALARM_RANGES_TYPE__WATCH_RANGE:
				return watchRange != null;
			case XtcePackage.ALARM_RANGES_TYPE__WARNING_RANGE:
				return warningRange != null;
			case XtcePackage.ALARM_RANGES_TYPE__DISTRESS_RANGE:
				return distressRange != null;
			case XtcePackage.ALARM_RANGES_TYPE__CRITICAL_RANGE:
				return criticalRange != null;
			case XtcePackage.ALARM_RANGES_TYPE__SEVERE_RANGE:
				return severeRange != null;
			case XtcePackage.ALARM_RANGES_TYPE__APPLIES_TO_CALIBRATED_VALUES:
				return isSetAppliesToCalibratedValues();
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
		result.append(" (appliesToCalibratedValues: ");
		if (appliesToCalibratedValuesESet) result.append(appliesToCalibratedValues); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AlarmRangesTypeImpl
