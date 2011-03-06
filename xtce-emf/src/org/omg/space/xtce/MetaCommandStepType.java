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
 * A representation of the model object '<em><b>Meta Command Step Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.MetaCommandStepType#getArgumentList <em>Argument List</em>}</li>
 *   <li>{@link org.omg.space.xtce.MetaCommandStepType#getMetaCommandRef <em>Meta Command Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getMetaCommandStepType()
 * @model extendedMetaData="name='MetaCommandStep_._type' kind='elementOnly'"
 * @generated
 */
public interface MetaCommandStepType extends EObject {
	/**
	 * Returns the value of the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument List</em>' containment reference.
	 * @see #setArgumentList(ArgumentListType)
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandStepType_ArgumentList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ArgumentList' namespace='##targetNamespace'"
	 * @generated
	 */
	ArgumentListType getArgumentList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MetaCommandStepType#getArgumentList <em>Argument List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument List</em>' containment reference.
	 * @see #getArgumentList()
	 * @generated
	 */
	void setArgumentList(ArgumentListType value);

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
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandStepType_MetaCommandRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='metaCommandRef'"
	 * @generated
	 */
	String getMetaCommandRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MetaCommandStepType#getMetaCommandRef <em>Meta Command Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Command Ref</em>' attribute.
	 * @see #getMetaCommandRef()
	 * @generated
	 */
	void setMetaCommandRef(String value);

} // MetaCommandStepType
