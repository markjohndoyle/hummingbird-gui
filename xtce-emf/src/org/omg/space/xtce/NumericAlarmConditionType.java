/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Alarm Condition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Alarms associated with numeric data types
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.NumericAlarmConditionType#getStaticAlarmRanges <em>Static Alarm Ranges</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumericAlarmConditionType#getChangePerSecondAlarmRanges <em>Change Per Second Alarm Ranges</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumericAlarmConditionType#getConditionalAlarm <em>Conditional Alarm</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumericAlarmConditionType#getCustomAlarm <em>Custom Alarm</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumericAlarmConditionType#getMinViolations <em>Min Violations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getNumericAlarmConditionType()
 * @model extendedMetaData="name='NumericAlarmConditionType' kind='elementOnly'"
 * @generated
 */
public interface NumericAlarmConditionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Static Alarm Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StaticAlarmRanges are used to trigger alarms when the parameter value passes some threshold value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Alarm Ranges</em>' containment reference.
	 * @see #setStaticAlarmRanges(AlarmRangesType)
	 * @see org.omg.space.xtce.XtcePackage#getNumericAlarmConditionType_StaticAlarmRanges()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StaticAlarmRanges' namespace='##targetNamespace'"
	 * @generated
	 */
	AlarmRangesType getStaticAlarmRanges();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumericAlarmConditionType#getStaticAlarmRanges <em>Static Alarm Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Alarm Ranges</em>' containment reference.
	 * @see #getStaticAlarmRanges()
	 * @generated
	 */
	void setStaticAlarmRanges(AlarmRangesType value);

	/**
	 * Returns the value of the '<em><b>Change Per Second Alarm Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ChangePerSecondAlarmRanges are used to trigger alarms when the parameter value's rate-of-change passes some threshold value.  An alarm condition that triggers when the value changes too fast (or too slow)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Change Per Second Alarm Ranges</em>' containment reference.
	 * @see #setChangePerSecondAlarmRanges(AlarmRangesType)
	 * @see org.omg.space.xtce.XtcePackage#getNumericAlarmConditionType_ChangePerSecondAlarmRanges()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChangePerSecondAlarmRanges' namespace='##targetNamespace'"
	 * @generated
	 */
	AlarmRangesType getChangePerSecondAlarmRanges();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumericAlarmConditionType#getChangePerSecondAlarmRanges <em>Change Per Second Alarm Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Per Second Alarm Ranges</em>' containment reference.
	 * @see #getChangePerSecondAlarmRanges()
	 * @generated
	 */
	void setChangePerSecondAlarmRanges(AlarmRangesType value);

	/**
	 * Returns the value of the '<em><b>Conditional Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A MatchCriteria may be specifiec for each of the 5 alarm levels.  Each level is optional and the alarm should be the highest level to test true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditional Alarm</em>' containment reference.
	 * @see #setConditionalAlarm(ConditionalAlarmType)
	 * @see org.omg.space.xtce.XtcePackage#getNumericAlarmConditionType_ConditionalAlarm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConditionalAlarm' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionalAlarmType getConditionalAlarm();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumericAlarmConditionType#getConditionalAlarm <em>Conditional Alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Alarm</em>' containment reference.
	 * @see #getConditionalAlarm()
	 * @generated
	 */
	void setConditionalAlarm(ConditionalAlarmType value);

	/**
	 * Returns the value of the '<em><b>Custom Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An escape for ridiculously complex alarm conditions.  Will trigger on changes to the  containing Parameter.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Alarm</em>' containment reference.
	 * @see #setCustomAlarm(InputAlgorithmType)
	 * @see org.omg.space.xtce.XtcePackage#getNumericAlarmConditionType_CustomAlarm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CustomAlarm' namespace='##targetNamespace'"
	 * @generated
	 */
	InputAlgorithmType getCustomAlarm();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumericAlarmConditionType#getCustomAlarm <em>Custom Alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Alarm</em>' containment reference.
	 * @see #getCustomAlarm()
	 * @generated
	 */
	void setCustomAlarm(InputAlgorithmType value);

	/**
	 * Returns the value of the '<em><b>Min Violations</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of successive values of the Parameter for the Alarm to trigger.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Violations</em>' attribute.
	 * @see #isSetMinViolations()
	 * @see #unsetMinViolations()
	 * @see #setMinViolations(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getNumericAlarmConditionType_MinViolations()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='minViolations'"
	 * @generated
	 */
	BigInteger getMinViolations();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumericAlarmConditionType#getMinViolations <em>Min Violations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Violations</em>' attribute.
	 * @see #isSetMinViolations()
	 * @see #unsetMinViolations()
	 * @see #getMinViolations()
	 * @generated
	 */
	void setMinViolations(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.NumericAlarmConditionType#getMinViolations <em>Min Violations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinViolations()
	 * @see #getMinViolations()
	 * @see #setMinViolations(BigInteger)
	 * @generated
	 */
	void unsetMinViolations();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.NumericAlarmConditionType#getMinViolations <em>Min Violations</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Violations</em>' attribute is set.
	 * @see #unsetMinViolations()
	 * @see #getMinViolations()
	 * @see #setMinViolations(BigInteger)
	 * @generated
	 */
	boolean isSetMinViolations();

} // NumericAlarmConditionType
