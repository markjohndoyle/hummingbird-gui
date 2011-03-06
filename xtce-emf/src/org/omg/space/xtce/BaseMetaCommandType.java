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
 * A representation of the model object '<em><b>Base Meta Command Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.BaseMetaCommandType#getArgumentAssignmentList <em>Argument Assignment List</em>}</li>
 *   <li>{@link org.omg.space.xtce.BaseMetaCommandType#getMetaCommandRef <em>Meta Command Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getBaseMetaCommandType()
 * @model extendedMetaData="name='BaseMetaCommand_._type' kind='elementOnly'"
 * @generated
 */
public interface BaseMetaCommandType extends EObject {
	/**
	 * Returns the value of the '<em><b>Argument Assignment List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Assignment List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Assignment List</em>' containment reference.
	 * @see #setArgumentAssignmentList(ArgumentAssignmentListType)
	 * @see org.omg.space.xtce.XtcePackage#getBaseMetaCommandType_ArgumentAssignmentList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ArgumentAssignmentList' namespace='##targetNamespace'"
	 * @generated
	 */
	ArgumentAssignmentListType getArgumentAssignmentList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BaseMetaCommandType#getArgumentAssignmentList <em>Argument Assignment List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Assignment List</em>' containment reference.
	 * @see #getArgumentAssignmentList()
	 * @generated
	 */
	void setArgumentAssignmentList(ArgumentAssignmentListType value);

	/**
	 * Returns the value of the '<em><b>Meta Command Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Command Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Command Ref</em>' attribute.
	 * @see #setMetaCommandRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getBaseMetaCommandType_MetaCommandRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='metaCommandRef'"
	 * @generated
	 */
	String getMetaCommandRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BaseMetaCommandType#getMetaCommandRef <em>Meta Command Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Command Ref</em>' attribute.
	 * @see #getMetaCommandRef()
	 * @generated
	 */
	void setMetaCommandRef(String value);

} // BaseMetaCommandType
