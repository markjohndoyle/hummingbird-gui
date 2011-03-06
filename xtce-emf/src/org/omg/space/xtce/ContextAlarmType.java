/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Alarm Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Context alarms are applied when the ContextMatch is true.  Context alarms override Default alarms
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ContextAlarmType#getContextMatch <em>Context Match</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getContextAlarmType()
 * @model extendedMetaData="name='ContextAlarmType' kind='elementOnly'"
 * @generated
 */
public interface ContextAlarmType extends NumericAlarmConditionType {
	/**
	 * Returns the value of the '<em><b>Context Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Match</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Match</em>' containment reference.
	 * @see #setContextMatch(MatchCriteriaType)
	 * @see org.omg.space.xtce.XtcePackage#getContextAlarmType_ContextMatch()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ContextMatch' namespace='##targetNamespace'"
	 * @generated
	 */
	MatchCriteriaType getContextMatch();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ContextAlarmType#getContextMatch <em>Context Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Match</em>' containment reference.
	 * @see #getContextMatch()
	 * @generated
	 */
	void setContextMatch(MatchCriteriaType value);

} // ContextAlarmType
