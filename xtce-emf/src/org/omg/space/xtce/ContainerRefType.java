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
 * A representation of the model object '<em><b>Container Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Holds a reference to a container
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ContainerRefType#getContainerRef <em>Container Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getContainerRefType()
 * @model extendedMetaData="name='ContainerRefType' kind='empty'"
 * @generated
 */
public interface ContainerRefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Container Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * name of container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container Ref</em>' attribute.
	 * @see #setContainerRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getContainerRefType_ContainerRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='containerRef'"
	 * @generated
	 */
	String getContainerRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ContainerRefType#getContainerRef <em>Container Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Ref</em>' attribute.
	 * @see #getContainerRef()
	 * @generated
	 */
	void setContainerRef(String value);

} // ContainerRefType
