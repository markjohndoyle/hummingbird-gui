/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.MessageType#getMatchCriteria <em>Match Criteria</em>}</li>
 *   <li>{@link org.omg.space.xtce.MessageType#getContainRef <em>Contain Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getMessageType()
 * @model extendedMetaData="name='Message_._type' kind='elementOnly'"
 * @generated
 */
public interface MessageType extends NameDescriptionType {
	/**
	 * Returns the value of the '<em><b>Match Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match Criteria</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Criteria</em>' containment reference.
	 * @see #setMatchCriteria(MatchCriteriaType)
	 * @see org.omg.space.xtce.XtcePackage#getMessageType_MatchCriteria()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MatchCriteria' namespace='##targetNamespace'"
	 * @generated
	 */
	MatchCriteriaType getMatchCriteria();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MessageType#getMatchCriteria <em>Match Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Criteria</em>' containment reference.
	 * @see #getMatchCriteria()
	 * @generated
	 */
	void setMatchCriteria(MatchCriteriaType value);

	/**
	 * Returns the value of the '<em><b>Contain Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ContainerRef should point to ROOT container that will describe an entire packet/minor frame or chunk of telemetry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contain Ref</em>' containment reference.
	 * @see #setContainRef(ContainerRefType)
	 * @see org.omg.space.xtce.XtcePackage#getMessageType_ContainRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ContainRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ContainerRefType getContainRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MessageType#getContainRef <em>Contain Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contain Ref</em>' containment reference.
	 * @see #getContainRef()
	 * @generated
	 */
	void setContainRef(ContainerRefType value);

} // MessageType
