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
 * A representation of the model object '<em><b>Container Ref Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ContainerRefSetType#getContainerRef <em>Container Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getContainerRefSetType()
 * @model extendedMetaData="name='ContainerRefSet_._type' kind='elementOnly'"
 * @generated
 */
public interface ContainerRefSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Container Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ContainerRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Ref</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getContainerRefSetType_ContainerRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ContainerRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContainerRefType> getContainerRef();

} // ContainerRefSetType
