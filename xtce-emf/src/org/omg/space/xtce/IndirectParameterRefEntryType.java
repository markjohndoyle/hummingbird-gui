/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indirect Parameter Ref Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An entry whose name is given by the value of a ParamameterInstance.  This entry may be used to implement dwell telemetry streams.  The value of the parameter in ParameterInstance must use either the name of the Parameter or its alias.  If it's an alias name, the alias namespace is supplied as an attribute.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.IndirectParameterRefEntryType#getParameterInstance <em>Parameter Instance</em>}</li>
 *   <li>{@link org.omg.space.xtce.IndirectParameterRefEntryType#getAliasNameSpace <em>Alias Name Space</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getIndirectParameterRefEntryType()
 * @model extendedMetaData="name='IndirectParameterRefEntryType' kind='elementOnly'"
 * @generated
 */
public interface IndirectParameterRefEntryType extends SequenceEntryType {
	/**
	 * Returns the value of the '<em><b>Parameter Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Instance</em>' containment reference.
	 * @see #setParameterInstance(ParameterInstanceRefType1)
	 * @see org.omg.space.xtce.XtcePackage#getIndirectParameterRefEntryType_ParameterInstance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ParameterInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterInstanceRefType1 getParameterInstance();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.IndirectParameterRefEntryType#getParameterInstance <em>Parameter Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Instance</em>' containment reference.
	 * @see #getParameterInstance()
	 * @generated
	 */
	void setParameterInstance(ParameterInstanceRefType1 value);

	/**
	 * Returns the value of the '<em><b>Alias Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias Name Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Name Space</em>' attribute.
	 * @see #setAliasNameSpace(String)
	 * @see org.omg.space.xtce.XtcePackage#getIndirectParameterRefEntryType_AliasNameSpace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='aliasNameSpace'"
	 * @generated
	 */
	String getAliasNameSpace();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.IndirectParameterRefEntryType#getAliasNameSpace <em>Alias Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Name Space</em>' attribute.
	 * @see #getAliasNameSpace()
	 * @generated
	 */
	void setAliasNameSpace(String value);

} // IndirectParameterRefEntryType
