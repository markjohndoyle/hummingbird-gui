/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame Stream Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The top level type definition for all data streams that are frame based.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.FrameStreamType#getContainerRef <em>Container Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.FrameStreamType#getServiceRef <em>Service Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.FrameStreamType#getStreamRef <em>Stream Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getFrameStreamType()
 * @model extendedMetaData="name='FrameStreamType' kind='elementOnly'"
 * @generated
 */
public interface FrameStreamType extends PCMStreamType {
	/**
	 * Returns the value of the '<em><b>Container Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This Container (usually abstract) is the container that is in the fixed frame stream.  Normally, this is an generalcontainer type from which many specific containers are inherited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container Ref</em>' containment reference.
	 * @see #setContainerRef(ContainerRefType)
	 * @see org.omg.space.xtce.XtcePackage#getFrameStreamType_ContainerRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContainerRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ContainerRefType getContainerRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.FrameStreamType#getContainerRef <em>Container Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Ref</em>' containment reference.
	 * @see #getContainerRef()
	 * @generated
	 */
	void setContainerRef(ContainerRefType value);

	/**
	 * Returns the value of the '<em><b>Service Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Ref</em>' containment reference.
	 * @see #setServiceRef(ServiceRefType)
	 * @see org.omg.space.xtce.XtcePackage#getFrameStreamType_ServiceRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServiceRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceRefType getServiceRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.FrameStreamType#getServiceRef <em>Service Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Ref</em>' containment reference.
	 * @see #getServiceRef()
	 * @generated
	 */
	void setServiceRef(ServiceRefType value);

	/**
	 * Returns the value of the '<em><b>Stream Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a reference to a connecting stream - say a custom stream.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stream Ref</em>' containment reference.
	 * @see #setStreamRef(StreamRefType)
	 * @see org.omg.space.xtce.XtcePackage#getFrameStreamType_StreamRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StreamRef' namespace='##targetNamespace'"
	 * @generated
	 */
	StreamRefType getStreamRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.FrameStreamType#getStreamRef <em>Stream Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Ref</em>' containment reference.
	 * @see #getStreamRef()
	 * @generated
	 */
	void setStreamRef(StreamRefType value);

} // FrameStreamType
