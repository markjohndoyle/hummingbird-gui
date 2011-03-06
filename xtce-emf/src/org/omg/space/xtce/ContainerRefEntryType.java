/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Ref Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An entry that is simply a reference to another container.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ContainerRefEntryType#getContainerRef <em>Container Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getContainerRefEntryType()
 * @model extendedMetaData="name='ContainerRefEntryType' kind='elementOnly'"
 * @generated
 */
public interface ContainerRefEntryType extends SequenceEntryType {
	/**
	 * Returns the value of the '<em><b>Container Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Ref</em>' attribute.
	 * @see #setContainerRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getContainerRefEntryType_ContainerRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='containerRef'"
	 * @generated
	 */
	String getContainerRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ContainerRefEntryType#getContainerRef <em>Container Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Ref</em>' attribute.
	 * @see #getContainerRef()
	 * @generated
	 */
	void setContainerRef(String value);

} // ContainerRefEntryType
