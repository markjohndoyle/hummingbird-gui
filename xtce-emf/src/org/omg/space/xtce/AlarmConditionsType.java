/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alarm Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * When the alarm is determined by boolean logic
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.AlarmConditionsType#getWatchAlarm <em>Watch Alarm</em>}</li>
 *   <li>{@link org.omg.space.xtce.AlarmConditionsType#getWarningAlarm <em>Warning Alarm</em>}</li>
 *   <li>{@link org.omg.space.xtce.AlarmConditionsType#getDistressAlarm <em>Distress Alarm</em>}</li>
 *   <li>{@link org.omg.space.xtce.AlarmConditionsType#getCritialAlarm <em>Critial Alarm</em>}</li>
 *   <li>{@link org.omg.space.xtce.AlarmConditionsType#getSevereAlarm <em>Severe Alarm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getAlarmConditionsType()
 * @model extendedMetaData="name='AlarmConditionsType' kind='elementOnly'"
 * @generated
 */
public interface AlarmConditionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Watch Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Watch Alarm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watch Alarm</em>' containment reference.
	 * @see #setWatchAlarm(MatchCriteriaType)
	 * @see org.omg.space.xtce.XtcePackage#getAlarmConditionsType_WatchAlarm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WatchAlarm' namespace='##targetNamespace'"
	 * @generated
	 */
	MatchCriteriaType getWatchAlarm();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.AlarmConditionsType#getWatchAlarm <em>Watch Alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watch Alarm</em>' containment reference.
	 * @see #getWatchAlarm()
	 * @generated
	 */
	void setWatchAlarm(MatchCriteriaType value);

	/**
	 * Returns the value of the '<em><b>Warning Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warning Alarm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning Alarm</em>' containment reference.
	 * @see #setWarningAlarm(MatchCriteriaType)
	 * @see org.omg.space.xtce.XtcePackage#getAlarmConditionsType_WarningAlarm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WarningAlarm' namespace='##targetNamespace'"
	 * @generated
	 */
	MatchCriteriaType getWarningAlarm();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.AlarmConditionsType#getWarningAlarm <em>Warning Alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning Alarm</em>' containment reference.
	 * @see #getWarningAlarm()
	 * @generated
	 */
	void setWarningAlarm(MatchCriteriaType value);

	/**
	 * Returns the value of the '<em><b>Distress Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distress Alarm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distress Alarm</em>' containment reference.
	 * @see #setDistressAlarm(MatchCriteriaType)
	 * @see org.omg.space.xtce.XtcePackage#getAlarmConditionsType_DistressAlarm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistressAlarm' namespace='##targetNamespace'"
	 * @generated
	 */
	MatchCriteriaType getDistressAlarm();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.AlarmConditionsType#getDistressAlarm <em>Distress Alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distress Alarm</em>' containment reference.
	 * @see #getDistressAlarm()
	 * @generated
	 */
	void setDistressAlarm(MatchCriteriaType value);

	/**
	 * Returns the value of the '<em><b>Critial Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critial Alarm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critial Alarm</em>' containment reference.
	 * @see #setCritialAlarm(MatchCriteriaType)
	 * @see org.omg.space.xtce.XtcePackage#getAlarmConditionsType_CritialAlarm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CritialAlarm' namespace='##targetNamespace'"
	 * @generated
	 */
	MatchCriteriaType getCritialAlarm();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.AlarmConditionsType#getCritialAlarm <em>Critial Alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critial Alarm</em>' containment reference.
	 * @see #getCritialAlarm()
	 * @generated
	 */
	void setCritialAlarm(MatchCriteriaType value);

	/**
	 * Returns the value of the '<em><b>Severe Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severe Alarm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severe Alarm</em>' containment reference.
	 * @see #setSevereAlarm(MatchCriteriaType)
	 * @see org.omg.space.xtce.XtcePackage#getAlarmConditionsType_SevereAlarm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SevereAlarm' namespace='##targetNamespace'"
	 * @generated
	 */
	MatchCriteriaType getSevereAlarm();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.AlarmConditionsType#getSevereAlarm <em>Severe Alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severe Alarm</em>' containment reference.
	 * @see #getSevereAlarm()
	 * @generated
	 */
	void setSevereAlarm(MatchCriteriaType value);

} // AlarmConditionsType
