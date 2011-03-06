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
 * A representation of the model object '<em><b>Command Container Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains an unordered Set of Command Containers
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.CommandContainerSetType#getCommandContainer <em>Command Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getCommandContainerSetType()
 * @model extendedMetaData="name='CommandContainerSetType' kind='elementOnly'"
 * @generated
 */
public interface CommandContainerSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Command Container</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.SequenceContainerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Container</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getCommandContainerSetType_CommandContainer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CommandContainer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SequenceContainerType> getCommandContainer();

} // CommandContainerSetType
