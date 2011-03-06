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
 * A representation of the model object '<em><b>Message Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Holds a reference to a message
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.MessageRefType#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getMessageRefType()
 * @model extendedMetaData="name='MessageRefType' kind='empty'"
 * @generated
 */
public interface MessageRefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * name of container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Ref</em>' attribute.
	 * @see #setMessageRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getMessageRefType_MessageRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='messageRef'"
	 * @generated
	 */
	String getMessageRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MessageRefType#getMessageRef <em>Message Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Ref</em>' attribute.
	 * @see #getMessageRef()
	 * @generated
	 */
	void setMessageRef(String value);

} // MessageRefType
