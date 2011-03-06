/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Argument Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.IntegerArgumentTypeType#getDefaultAlarm <em>Default Alarm</em>}</li>
 *   <li>{@link org.omg.space.xtce.IntegerArgumentTypeType#getContextAlarmList <em>Context Alarm List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getIntegerArgumentTypeType()
 * @model extendedMetaData="name='IntegerArgumentType_._type' kind='elementOnly'"
 * @generated
 */
public interface IntegerArgumentTypeType extends IntegerDataType {
	/**
	 * Returns the value of the '<em><b>Default Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Alarm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Alarm</em>' containment reference.
	 * @see #setDefaultAlarm(NumericAlarmConditionType)
	 * @see org.omg.space.xtce.XtcePackage#getIntegerArgumentTypeType_DefaultAlarm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DefaultAlarm' namespace='##targetNamespace'"
	 * @generated
	 */
	NumericAlarmConditionType getDefaultAlarm();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.IntegerArgumentTypeType#getDefaultAlarm <em>Default Alarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Alarm</em>' containment reference.
	 * @see #getDefaultAlarm()
	 * @generated
	 */
	void setDefaultAlarm(NumericAlarmConditionType value);

	/**
	 * Returns the value of the '<em><b>Context Alarm List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Alarm List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Alarm List</em>' containment reference.
	 * @see #setContextAlarmList(ContextAlarmListType1)
	 * @see org.omg.space.xtce.XtcePackage#getIntegerArgumentTypeType_ContextAlarmList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContextAlarmList' namespace='##targetNamespace'"
	 * @generated
	 */
	ContextAlarmListType1 getContextAlarmList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.IntegerArgumentTypeType#getContextAlarmList <em>Context Alarm List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Alarm List</em>' containment reference.
	 * @see #getContextAlarmList()
	 * @generated
	 */
	void setContextAlarmList(ContextAlarmListType1 value);

} // IntegerArgumentTypeType
