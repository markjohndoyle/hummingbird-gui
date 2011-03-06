/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Holds a set of services, logical groups of containers  OR messages (not both).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ServiceType#getMessageRefSet <em>Message Ref Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.ServiceType#getContainerRefSet <em>Container Ref Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getServiceType()
 * @model extendedMetaData="name='ServiceType' kind='elementOnly'"
 * @generated
 */
public interface ServiceType extends NameDescriptionType {
	/**
	 * Returns the value of the '<em><b>Message Ref Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Ref Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Ref Set</em>' containment reference.
	 * @see #setMessageRefSet(MessageRefSetType)
	 * @see org.omg.space.xtce.XtcePackage#getServiceType_MessageRefSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MessageRefSet' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageRefSetType getMessageRefSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ServiceType#getMessageRefSet <em>Message Ref Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Ref Set</em>' containment reference.
	 * @see #getMessageRefSet()
	 * @generated
	 */
	void setMessageRefSet(MessageRefSetType value);

	/**
	 * Returns the value of the '<em><b>Container Ref Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Ref Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Ref Set</em>' containment reference.
	 * @see #setContainerRefSet(ContainerRefSetType)
	 * @see org.omg.space.xtce.XtcePackage#getServiceType_ContainerRefSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ContainerRefSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ContainerRefSetType getContainerRefSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ServiceType#getContainerRefSet <em>Container Ref Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Ref Set</em>' containment reference.
	 * @see #getContainerRefSet()
	 * @generated
	 */
	void setContainerRefSet(ContainerRefSetType value);

} // ServiceType
