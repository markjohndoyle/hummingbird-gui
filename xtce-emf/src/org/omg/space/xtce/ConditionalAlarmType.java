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
 * A representation of the model object '<em><b>Conditional Alarm Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ConditionalAlarmType#getStaticAlarmConditions <em>Static Alarm Conditions</em>}</li>
 *   <li>{@link org.omg.space.xtce.ConditionalAlarmType#getChangePerSecondAlarmConditions <em>Change Per Second Alarm Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getConditionalAlarmType()
 * @model extendedMetaData="name='ConditionalAlarm_._type' kind='elementOnly'"
 * @generated
 */
public interface ConditionalAlarmType extends EObject {
	/**
	 * Returns the value of the '<em><b>Static Alarm Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Alarm Conditions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Alarm Conditions</em>' containment reference.
	 * @see #setStaticAlarmConditions(AlarmConditionsType)
	 * @see org.omg.space.xtce.XtcePackage#getConditionalAlarmType_StaticAlarmConditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StaticAlarmConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	AlarmConditionsType getStaticAlarmConditions();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ConditionalAlarmType#getStaticAlarmConditions <em>Static Alarm Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Alarm Conditions</em>' containment reference.
	 * @see #getStaticAlarmConditions()
	 * @generated
	 */
	void setStaticAlarmConditions(AlarmConditionsType value);

	/**
	 * Returns the value of the '<em><b>Change Per Second Alarm Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Per Second Alarm Conditions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Per Second Alarm Conditions</em>' containment reference.
	 * @see #setChangePerSecondAlarmConditions(AlarmConditionsType)
	 * @see org.omg.space.xtce.XtcePackage#getConditionalAlarmType_ChangePerSecondAlarmConditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChangePerSecondAlarmConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	AlarmConditionsType getChangePerSecondAlarmConditions();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ConditionalAlarmType#getChangePerSecondAlarmConditions <em>Change Per Second Alarm Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Per Second Alarm Conditions</em>' containment reference.
	 * @see #getChangePerSecondAlarmConditions()
	 * @generated
	 */
	void setChangePerSecondAlarmConditions(AlarmConditionsType value);

} // ConditionalAlarmType
