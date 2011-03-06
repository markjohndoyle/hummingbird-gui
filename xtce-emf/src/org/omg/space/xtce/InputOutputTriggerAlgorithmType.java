/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Output Trigger Algorithm Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of labled triggers is added to the SimpleInputOutputAlgorithmType
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.InputOutputTriggerAlgorithmType#getTriggerSet <em>Trigger Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.InputOutputTriggerAlgorithmType#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.omg.space.xtce.InputOutputTriggerAlgorithmType#getTriggerContainer <em>Trigger Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getInputOutputTriggerAlgorithmType()
 * @model extendedMetaData="name='InputOutputTriggerAlgorithmType' kind='elementOnly'"
 * @generated
 */
public interface InputOutputTriggerAlgorithmType extends InputOutputAlgorithmType {
	/**
	 * Returns the value of the '<em><b>Trigger Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Set</em>' containment reference.
	 * @see #setTriggerSet(TriggerType)
	 * @see org.omg.space.xtce.XtcePackage#getInputOutputTriggerAlgorithmType_TriggerSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TriggerSet' namespace='##targetNamespace'"
	 * @generated
	 */
	TriggerType getTriggerSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.InputOutputTriggerAlgorithmType#getTriggerSet <em>Trigger Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Set</em>' containment reference.
	 * @see #getTriggerSet()
	 * @generated
	 */
	void setTriggerSet(TriggerType value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Algorithm processing priority.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getInputOutputTriggerAlgorithmType_Priority()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='priority'"
	 * @generated
	 */
	BigInteger getPriority();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.InputOutputTriggerAlgorithmType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Trigger Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First telemetry container from which the output parameter should be calculated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Container</em>' attribute.
	 * @see #setTriggerContainer(String)
	 * @see org.omg.space.xtce.XtcePackage#getInputOutputTriggerAlgorithmType_TriggerContainer()
	 * @model dataType="org.omg.space.xtce.NameType"
	 *        extendedMetaData="kind='attribute' name='triggerContainer'"
	 * @generated
	 */
	String getTriggerContainer();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.InputOutputTriggerAlgorithmType#getTriggerContainer <em>Trigger Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Container</em>' attribute.
	 * @see #getTriggerContainer()
	 * @generated
	 */
	void setTriggerContainer(String value);

} // InputOutputTriggerAlgorithmType
