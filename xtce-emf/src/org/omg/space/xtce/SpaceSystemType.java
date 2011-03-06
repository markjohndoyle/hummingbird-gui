/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Space System Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SpaceSystem is a collection of SpaceSystem(s) including space assets, ground assets, multi-satellite systems and sub-systems.  A SpaceSystem is the root element for the set of data necessary to monitor and command an arbitrary space device - this includes the binary decomposition the data streams going into and out of a device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.SpaceSystemType#getHeader <em>Header</em>}</li>
 *   <li>{@link org.omg.space.xtce.SpaceSystemType#getTelemetryMetaData <em>Telemetry Meta Data</em>}</li>
 *   <li>{@link org.omg.space.xtce.SpaceSystemType#getCommandMetaData <em>Command Meta Data</em>}</li>
 *   <li>{@link org.omg.space.xtce.SpaceSystemType#getServiceSet <em>Service Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.SpaceSystemType#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link org.omg.space.xtce.SpaceSystemType#getSpaceSystem <em>Space System</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getSpaceSystemType()
 * @model extendedMetaData="name='SpaceSystemType' kind='elementOnly'"
 * @generated
 */
public interface SpaceSystemType extends NameDescriptionType {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(HeaderType)
	 * @see org.omg.space.xtce.XtcePackage#getSpaceSystemType_Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Header' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderType getHeader();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SpaceSystemType#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(HeaderType value);

	/**
	 * Returns the value of the '<em><b>Telemetry Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telemetry Meta Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telemetry Meta Data</em>' containment reference.
	 * @see #setTelemetryMetaData(TelemetryMetaDataType)
	 * @see org.omg.space.xtce.XtcePackage#getSpaceSystemType_TelemetryMetaData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TelemetryMetaData' namespace='##targetNamespace'"
	 * @generated
	 */
	TelemetryMetaDataType getTelemetryMetaData();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SpaceSystemType#getTelemetryMetaData <em>Telemetry Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telemetry Meta Data</em>' containment reference.
	 * @see #getTelemetryMetaData()
	 * @generated
	 */
	void setTelemetryMetaData(TelemetryMetaDataType value);

	/**
	 * Returns the value of the '<em><b>Command Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command Meta Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Meta Data</em>' containment reference.
	 * @see #setCommandMetaData(CommandMetaDataType)
	 * @see org.omg.space.xtce.XtcePackage#getSpaceSystemType_CommandMetaData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommandMetaData' namespace='##targetNamespace'"
	 * @generated
	 */
	CommandMetaDataType getCommandMetaData();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SpaceSystemType#getCommandMetaData <em>Command Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Meta Data</em>' containment reference.
	 * @see #getCommandMetaData()
	 * @generated
	 */
	void setCommandMetaData(CommandMetaDataType value);

	/**
	 * Returns the value of the '<em><b>Service Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A service is a logical grouping of container and/or messages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Set</em>' containment reference.
	 * @see #setServiceSet(ServiceSetType)
	 * @see org.omg.space.xtce.XtcePackage#getSpaceSystemType_ServiceSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServiceSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceSetType getServiceSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SpaceSystemType#getServiceSet <em>Service Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Set</em>' containment reference.
	 * @see #getServiceSet()
	 * @generated
	 */
	void setServiceSet(ServiceSetType value);

	/**
	 * Returns the value of the '<em><b>Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defaults has default data encoding for ParameterTypes and ArgumentTypes and default parameter time association that will be applied to all Parameters within this SpaceSystem.  These defaults may be overidden by sub-SpaceSystems or by the Types or Parameters themselves.  Defaults simply provides a means to avoid repeating attributes such as ‘bit order’ for every Type definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defaults</em>' containment reference.
	 * @see #setDefaults(DefaultsType)
	 * @see org.omg.space.xtce.XtcePackage#getSpaceSystemType_Defaults()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Defaults' namespace='##targetNamespace'"
	 * @generated
	 */
	DefaultsType getDefaults();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SpaceSystemType#getDefaults <em>Defaults</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaults</em>' containment reference.
	 * @see #getDefaults()
	 * @generated
	 */
	void setDefaults(DefaultsType value);

	/**
	 * Returns the value of the '<em><b>Space System</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.SpaceSystemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ROOT Element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Space System</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getSpaceSystemType_SpaceSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SpaceSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpaceSystemType> getSpaceSystem();

} // SpaceSystemType
