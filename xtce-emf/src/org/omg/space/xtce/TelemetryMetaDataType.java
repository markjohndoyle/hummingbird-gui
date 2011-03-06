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
 * A representation of the model object '<em><b>Telemetry Meta Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * All the data about telemetry is contained in TelemetryMetaData
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.TelemetryMetaDataType#getParameterTypeSet <em>Parameter Type Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.TelemetryMetaDataType#getParameterSet <em>Parameter Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.TelemetryMetaDataType#getContainerSet <em>Container Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.TelemetryMetaDataType#getMessageSet <em>Message Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.TelemetryMetaDataType#getStreamSet <em>Stream Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.TelemetryMetaDataType#getAlgorithmSet <em>Algorithm Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getTelemetryMetaDataType()
 * @model extendedMetaData="name='TelemetryMetaDataType' kind='elementOnly'"
 * @generated
 */
public interface TelemetryMetaDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of parameter types
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Type Set</em>' containment reference.
	 * @see #setParameterTypeSet(ParameterTypeSetType)
	 * @see org.omg.space.xtce.XtcePackage#getTelemetryMetaDataType_ParameterTypeSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParameterTypeSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterTypeSetType getParameterTypeSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.TelemetryMetaDataType#getParameterTypeSet <em>Parameter Type Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type Set</em>' containment reference.
	 * @see #getParameterTypeSet()
	 * @generated
	 */
	void setParameterTypeSet(ParameterTypeSetType value);

	/**
	 * Returns the value of the '<em><b>Parameter Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of Parameters for this Space System.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Set</em>' containment reference.
	 * @see #setParameterSet(ParameterSetType)
	 * @see org.omg.space.xtce.XtcePackage#getTelemetryMetaDataType_ParameterSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParameterSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterSetType getParameterSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.TelemetryMetaDataType#getParameterSet <em>Parameter Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Set</em>' containment reference.
	 * @see #getParameterSet()
	 * @generated
	 */
	void setParameterSet(ParameterSetType value);

	/**
	 * Returns the value of the '<em><b>Container Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds the list of all potential container definitions for telemetry. Containers may parts of packets or TDM, and then groups of the containers, and then an entire entity -- such as a packet.  In order to maximize re-used for duplication, the pieces may defined once here, and then assembled as needed into larger structures, also here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container Set</em>' containment reference.
	 * @see #setContainerSet(ContainerSetType)
	 * @see org.omg.space.xtce.XtcePackage#getTelemetryMetaDataType_ContainerSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContainerSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ContainerSetType getContainerSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.TelemetryMetaDataType#getContainerSet <em>Container Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Set</em>' containment reference.
	 * @see #getContainerSet()
	 * @generated
	 */
	void setContainerSet(ContainerSetType value);

	/**
	 * Returns the value of the '<em><b>Message Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Messages are an alternative method of uniquely identifying containers within a Service.  A message provides a test in the form of MatchCriteria to match to a container.  A simple example might be: [When minorframeID=21, the message is the 21st minorframe container.  The collection of messages to search thru will be bound by a Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Set</em>' containment reference.
	 * @see #setMessageSet(MessageSetType)
	 * @see org.omg.space.xtce.XtcePackage#getTelemetryMetaDataType_MessageSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MessageSet' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageSetType getMessageSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.TelemetryMetaDataType#getMessageSet <em>Message Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Set</em>' containment reference.
	 * @see #getMessageSet()
	 * @generated
	 */
	void setMessageSet(MessageSetType value);

	/**
	 * Returns the value of the '<em><b>Stream Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stream Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream Set</em>' containment reference.
	 * @see #setStreamSet(StreamSetType)
	 * @see org.omg.space.xtce.XtcePackage#getTelemetryMetaDataType_StreamSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StreamSet' namespace='##targetNamespace'"
	 * @generated
	 */
	StreamSetType getStreamSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.TelemetryMetaDataType#getStreamSet <em>Stream Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Set</em>' containment reference.
	 * @see #getStreamSet()
	 * @generated
	 */
	void setStreamSet(StreamSetType value);

	/**
	 * Returns the value of the '<em><b>Algorithm Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Set</em>' containment reference.
	 * @see #setAlgorithmSet(AlgorithmSetType)
	 * @see org.omg.space.xtce.XtcePackage#getTelemetryMetaDataType_AlgorithmSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AlgorithmSet' namespace='##targetNamespace'"
	 * @generated
	 */
	AlgorithmSetType getAlgorithmSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.TelemetryMetaDataType#getAlgorithmSet <em>Algorithm Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Set</em>' containment reference.
	 * @see #getAlgorithmSet()
	 * @generated
	 */
	void setAlgorithmSet(AlgorithmSetType value);

} // TelemetryMetaDataType
