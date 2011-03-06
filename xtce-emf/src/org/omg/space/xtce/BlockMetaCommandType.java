/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Meta Command Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.BlockMetaCommandType#getMetaCommandStepList <em>Meta Command Step List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getBlockMetaCommandType()
 * @model extendedMetaData="name='BlockMetaCommand_._type' kind='elementOnly'"
 * @generated
 */
public interface BlockMetaCommandType extends NameDescriptionType {
	/**
	 * Returns the value of the '<em><b>Meta Command Step List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Command Step List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Command Step List</em>' containment reference.
	 * @see #setMetaCommandStepList(MetaCommandStepListType)
	 * @see org.omg.space.xtce.XtcePackage#getBlockMetaCommandType_MetaCommandStepList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MetaCommandStepList' namespace='##targetNamespace'"
	 * @generated
	 */
	MetaCommandStepListType getMetaCommandStepList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BlockMetaCommandType#getMetaCommandStepList <em>Meta Command Step List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Command Step List</em>' containment reference.
	 * @see #getMetaCommandStepList()
	 * @generated
	 */
	void setMetaCommandStepList(MetaCommandStepListType value);

} // BlockMetaCommandType
