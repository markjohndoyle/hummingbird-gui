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
 * A representation of the model object '<em><b>Command Meta Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Command Meta Data contains information about commands
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.CommandMetaDataType#getParameterTypeSet <em>Parameter Type Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.CommandMetaDataType#getParameterSet <em>Parameter Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.CommandMetaDataType#getArgumentTypeSet <em>Argument Type Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.CommandMetaDataType#getMetaCommandSet <em>Meta Command Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.CommandMetaDataType#getCommandContainerSet <em>Command Container Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.CommandMetaDataType#getStreamSet <em>Stream Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.CommandMetaDataType#getAlgorithmSet <em>Algorithm Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getCommandMetaDataType()
 * @model extendedMetaData="name='CommandMetaDataType' kind='elementOnly'"
 * @generated
 */
public interface CommandMetaDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of parameter types
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Type Set</em>' containment reference.
	 * @see #setParameterTypeSet(ParameterTypeSetType)
	 * @see org.omg.space.xtce.XtcePackage#getCommandMetaDataType_ParameterTypeSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParameterTypeSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterTypeSetType getParameterTypeSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CommandMetaDataType#getParameterTypeSet <em>Parameter Type Set</em>}' containment reference.
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
	 * Parameters referenced by MetaCommands.  This Parameter Set is located here so that MetaCommand data can be built independantly of TelemetryMetaData.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Set</em>' containment reference.
	 * @see #setParameterSet(ParameterSetType)
	 * @see org.omg.space.xtce.XtcePackage#getCommandMetaDataType_ParameterSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParameterSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterSetType getParameterSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CommandMetaDataType#getParameterSet <em>Parameter Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Set</em>' containment reference.
	 * @see #getParameterSet()
	 * @generated
	 */
	void setParameterSet(ParameterSetType value);

	/**
	 * Returns the value of the '<em><b>Argument Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Type Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Type Set</em>' containment reference.
	 * @see #setArgumentTypeSet(ArgumentTypeSetType)
	 * @see org.omg.space.xtce.XtcePackage#getCommandMetaDataType_ArgumentTypeSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ArgumentTypeSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ArgumentTypeSetType getArgumentTypeSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CommandMetaDataType#getArgumentTypeSet <em>Argument Type Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Type Set</em>' containment reference.
	 * @see #getArgumentTypeSet()
	 * @generated
	 */
	void setArgumentTypeSet(ArgumentTypeSetType value);

	/**
	 * Returns the value of the '<em><b>Meta Command Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of Command Definitions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meta Command Set</em>' containment reference.
	 * @see #setMetaCommandSet(MetaCommandSetType)
	 * @see org.omg.space.xtce.XtcePackage#getCommandMetaDataType_MetaCommandSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MetaCommandSet' namespace='##targetNamespace'"
	 * @generated
	 */
	MetaCommandSetType getMetaCommandSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CommandMetaDataType#getMetaCommandSet <em>Meta Command Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Command Set</em>' containment reference.
	 * @see #getMetaCommandSet()
	 * @generated
	 */
	void setMetaCommandSet(MetaCommandSetType value);

	/**
	 * Returns the value of the '<em><b>Command Container Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Command Container defines the construction of a Command.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command Container Set</em>' containment reference.
	 * @see #setCommandContainerSet(CommandContainerSetType)
	 * @see org.omg.space.xtce.XtcePackage#getCommandMetaDataType_CommandContainerSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommandContainerSet' namespace='##targetNamespace'"
	 * @generated
	 */
	CommandContainerSetType getCommandContainerSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CommandMetaDataType#getCommandContainerSet <em>Command Container Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Container Set</em>' containment reference.
	 * @see #getCommandContainerSet()
	 * @generated
	 */
	void setCommandContainerSet(CommandContainerSetType value);

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
	 * @see org.omg.space.xtce.XtcePackage#getCommandMetaDataType_StreamSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StreamSet' namespace='##targetNamespace'"
	 * @generated
	 */
	StreamSetType getStreamSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CommandMetaDataType#getStreamSet <em>Stream Set</em>}' containment reference.
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
	 * @see org.omg.space.xtce.XtcePackage#getCommandMetaDataType_AlgorithmSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AlgorithmSet' namespace='##targetNamespace'"
	 * @generated
	 */
	AlgorithmSetType getAlgorithmSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CommandMetaDataType#getAlgorithmSet <em>Algorithm Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Set</em>' containment reference.
	 * @see #getAlgorithmSet()
	 * @generated
	 */
	void setAlgorithmSet(AlgorithmSetType value);

} // CommandMetaDataType
