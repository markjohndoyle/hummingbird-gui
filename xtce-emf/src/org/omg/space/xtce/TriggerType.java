/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigInteger;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A trigger is used to initiate the processing of some algorithm.  A trigger may be based on an update of a Parameter or on a time basis.  Triggers may also have a rate that limits their firing to a 1/rate basis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.TriggerType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.TriggerType#getParameterRef <em>Parameter Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.TriggerType#getTriggerFrequency <em>Trigger Frequency</em>}</li>
 *   <li>{@link org.omg.space.xtce.TriggerType#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.space.xtce.TriggerType#getTriggerRate <em>Trigger Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getTriggerType()
 * @model extendedMetaData="name='TriggerType' kind='elementOnly'"
 * @generated
 */
public interface TriggerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.omg.space.xtce.XtcePackage#getTriggerType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Parameter Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ParameterRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Names a parameter that upon change will start the execution of the algorithm.  Holds a parameter reference name for a parameter that when it changes, will cause this algorithm to be executed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Ref</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getTriggerType_ParameterRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ParameterRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ParameterRefType> getParameterRef();

	/**
	 * Returns the value of the '<em><b>Trigger Frequency</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.datatype.Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Frequency</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Frequency</em>' attribute list.
	 * @see org.omg.space.xtce.XtcePackage#getTriggerType_TriggerFrequency()
	 * @model unique="false" dataType="org.omg.space.xtce.RelativeTimeType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TriggerFrequency' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Duration> getTriggerFrequency();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.space.xtce.XtcePackage#getTriggerType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.TriggerType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Trigger Rate</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Rate</em>' attribute.
	 * @see #isSetTriggerRate()
	 * @see #unsetTriggerRate()
	 * @see #setTriggerRate(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getTriggerType_TriggerRate()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='triggerRate'"
	 * @generated
	 */
	BigInteger getTriggerRate();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.TriggerType#getTriggerRate <em>Trigger Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Rate</em>' attribute.
	 * @see #isSetTriggerRate()
	 * @see #unsetTriggerRate()
	 * @see #getTriggerRate()
	 * @generated
	 */
	void setTriggerRate(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.TriggerType#getTriggerRate <em>Trigger Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTriggerRate()
	 * @see #getTriggerRate()
	 * @see #setTriggerRate(BigInteger)
	 * @generated
	 */
	void unsetTriggerRate();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.TriggerType#getTriggerRate <em>Trigger Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trigger Rate</em>' attribute is set.
	 * @see #unsetTriggerRate()
	 * @see #getTriggerRate()
	 * @see #setTriggerRate(BigInteger)
	 * @generated
	 */
	boolean isSetTriggerRate();

} // TriggerType
