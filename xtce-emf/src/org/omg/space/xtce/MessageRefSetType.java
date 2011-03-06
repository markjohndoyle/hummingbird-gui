/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Ref Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.MessageRefSetType#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getMessageRefSetType()
 * @model extendedMetaData="name='MessageRefSet_._type' kind='elementOnly'"
 * @generated
 */
public interface MessageRefSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Ref</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getMessageRefSetType_MessageRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MessageRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EObject> getMessageRef();

} // MessageRefSetType
