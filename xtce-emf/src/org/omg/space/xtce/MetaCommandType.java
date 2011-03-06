/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Command Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type definition used as the base type for a CommandDefinition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.MetaCommandType#getBaseMetaCommand <em>Base Meta Command</em>}</li>
 *   <li>{@link org.omg.space.xtce.MetaCommandType#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.omg.space.xtce.MetaCommandType#getArgumentList <em>Argument List</em>}</li>
 *   <li>{@link org.omg.space.xtce.MetaCommandType#getCommandContainer <em>Command Container</em>}</li>
 *   <li>{@link org.omg.space.xtce.MetaCommandType#getTransmissionConstraintList <em>Transmission Constraint List</em>}</li>
 *   <li>{@link org.omg.space.xtce.MetaCommandType#getDefaultSignificance <em>Default Significance</em>}</li>
 *   <li>{@link org.omg.space.xtce.MetaCommandType#getContextSignificanceList <em>Context Significance List</em>}</li>
 *   <li>{@link org.omg.space.xtce.MetaCommandType#getInterlock <em>Interlock</em>}</li>
 *   <li>{@link org.omg.space.xtce.MetaCommandType#getVerifiers <em>Verifiers</em>}</li>
 *   <li>{@link org.omg.space.xtce.MetaCommandType#getParameterToSetList <em>Parameter To Set List</em>}</li>
 *   <li>{@link org.omg.space.xtce.MetaCommandType#isAbstract <em>Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getMetaCommandType()
 * @model extendedMetaData="name='MetaCommandType' kind='elementOnly'"
 * @generated
 */
public interface MetaCommandType extends NameDescriptionType {
	/**
	 * Returns the value of the '<em><b>Base Meta Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MetaCommand is derived from this Base.  Arguments of the base MetaCommand are further specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Meta Command</em>' containment reference.
	 * @see #setBaseMetaCommand(BaseMetaCommandType)
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandType_BaseMetaCommand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BaseMetaCommand' namespace='##targetNamespace'"
	 * @generated
	 */
	BaseMetaCommandType getBaseMetaCommand();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MetaCommandType#getBaseMetaCommand <em>Base Meta Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Meta Command</em>' containment reference.
	 * @see #getBaseMetaCommand()
	 * @generated
	 */
	void setBaseMetaCommand(BaseMetaCommandType value);

	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional.  Normally used when the database is built in a flat, non-hierarchical format
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandType_SystemName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SystemName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MetaCommandType#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Many commands have one or more options.  These are called command arguments.  Command arguments may be of any of the standard data types.  MetaCommand arguments are local to the MetaCommand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument List</em>' containment reference.
	 * @see #setArgumentList(ArgumentListType1)
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandType_ArgumentList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ArgumentList' namespace='##targetNamespace'"
	 * @generated
	 */
	ArgumentListType1 getArgumentList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MetaCommandType#getArgumentList <em>Argument List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument List</em>' containment reference.
	 * @see #getArgumentList()
	 * @generated
	 */
	void setArgumentList(ArgumentListType1 value);

	/**
	 * Returns the value of the '<em><b>Command Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells how to package this command
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command Container</em>' containment reference.
	 * @see #setCommandContainer(CommandContainerType)
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandType_CommandContainer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommandContainer' namespace='##targetNamespace'"
	 * @generated
	 */
	CommandContainerType getCommandContainer();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MetaCommandType#getCommandContainer <em>Command Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Container</em>' containment reference.
	 * @see #getCommandContainer()
	 * @generated
	 */
	void setCommandContainer(CommandContainerType value);

	/**
	 * Returns the value of the '<em><b>Transmission Constraint List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appended to the TramsmissionConstraint List of the base command.  Constraints are checked in order.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmission Constraint List</em>' containment reference.
	 * @see #setTransmissionConstraintList(TransmissionConstraintListType)
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandType_TransmissionConstraintList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TransmissionConstraintList' namespace='##targetNamespace'"
	 * @generated
	 */
	TransmissionConstraintListType getTransmissionConstraintList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MetaCommandType#getTransmissionConstraintList <em>Transmission Constraint List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Constraint List</em>' containment reference.
	 * @see #getTransmissionConstraintList()
	 * @generated
	 */
	void setTransmissionConstraintList(TransmissionConstraintListType value);

	/**
	 * Returns the value of the '<em><b>Default Significance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some Command and Control Systems may require special user access our confirmations before transmitting commands with certain levels.  Will inherit any level defined in the Base MetaCommand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Significance</em>' containment reference.
	 * @see #setDefaultSignificance(SignificanceType)
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandType_DefaultSignificance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DefaultSignificance' namespace='##targetNamespace'"
	 * @generated
	 */
	SignificanceType getDefaultSignificance();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MetaCommandType#getDefaultSignificance <em>Default Significance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Significance</em>' containment reference.
	 * @see #getDefaultSignificance()
	 * @generated
	 */
	void setDefaultSignificance(SignificanceType value);

	/**
	 * Returns the value of the '<em><b>Context Significance List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used when the significance of a command varies by the operating context
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Significance List</em>' containment reference.
	 * @see #setContextSignificanceList(ContextSignificanceListType)
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandType_ContextSignificanceList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContextSignificanceList' namespace='##targetNamespace'"
	 * @generated
	 */
	ContextSignificanceListType getContextSignificanceList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MetaCommandType#getContextSignificanceList <em>Context Significance List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Significance List</em>' containment reference.
	 * @see #getContextSignificanceList()
	 * @generated
	 */
	void setContextSignificanceList(ContextSignificanceListType value);

	/**
	 * Returns the value of the '<em><b>Interlock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Interlock is a type of Constraint, but not on Command instances of this MetaCommand; Interlocks apply instead to the next command.  An Interlock will block successive commands until this command has reached a certain stage (through verifications).  Interlocks are scoped to a SpaceSystem basis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interlock</em>' containment reference.
	 * @see #setInterlock(InterlockType)
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandType_Interlock()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Interlock' namespace='##targetNamespace'"
	 * @generated
	 */
	InterlockType getInterlock();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MetaCommandType#getInterlock <em>Interlock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interlock</em>' containment reference.
	 * @see #getInterlock()
	 * @generated
	 */
	void setInterlock(InterlockType value);

	/**
	 * Returns the value of the '<em><b>Verifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Command Verifier is a conditional check on the telemetry from a SpaceSystem that provides positive indication on the successful execution of a command.  Completed verifiers are added to the Base MetaCommand verifiers.  All others will replace a verifier defined in a Base MetaCommand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verifiers</em>' containment reference.
	 * @see #setVerifiers(VerifiersType)
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandType_Verifiers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Verifiers' namespace='##targetNamespace'"
	 * @generated
	 */
	VerifiersType getVerifiers();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MetaCommandType#getVerifiers <em>Verifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verifiers</em>' containment reference.
	 * @see #getVerifiers()
	 * @generated
	 */
	void setVerifiers(VerifiersType value);

	/**
	 * Returns the value of the '<em><b>Parameter To Set List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters that are set with a new value after the command has been sent.  Appended to the Base Command list
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter To Set List</em>' containment reference.
	 * @see #setParameterToSetList(ParameterToSetListType)
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandType_ParameterToSetList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParameterToSetList' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterToSetListType getParameterToSetList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MetaCommandType#getParameterToSetList <em>Parameter To Set List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter To Set List</em>' containment reference.
	 * @see #getParameterToSetList()
	 * @generated
	 */
	void setParameterToSetList(ParameterToSetListType value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #setAbstract(boolean)
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandType_Abstract()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='abstract'"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MetaCommandType#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.MetaCommandType#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbstract()
	 * @see #isAbstract()
	 * @see #setAbstract(boolean)
	 * @generated
	 */
	void unsetAbstract();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.MetaCommandType#isAbstract <em>Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Abstract</em>' attribute is set.
	 * @see #unsetAbstract()
	 * @see #isAbstract()
	 * @see #setAbstract(boolean)
	 * @generated
	 */
	boolean isSetAbstract();

} // MetaCommandType
