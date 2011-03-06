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
 * A representation of the model object '<em><b>Verifiers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.VerifiersType#getTransferredToRangeVerifier <em>Transferred To Range Verifier</em>}</li>
 *   <li>{@link org.omg.space.xtce.VerifiersType#getSentFromRangeVerifier <em>Sent From Range Verifier</em>}</li>
 *   <li>{@link org.omg.space.xtce.VerifiersType#getReceivedVerifier <em>Received Verifier</em>}</li>
 *   <li>{@link org.omg.space.xtce.VerifiersType#getAcceptedVerifier <em>Accepted Verifier</em>}</li>
 *   <li>{@link org.omg.space.xtce.VerifiersType#getQueuedVerifier <em>Queued Verifier</em>}</li>
 *   <li>{@link org.omg.space.xtce.VerifiersType#getExecutionVerifier <em>Execution Verifier</em>}</li>
 *   <li>{@link org.omg.space.xtce.VerifiersType#getCompleteVerifier <em>Complete Verifier</em>}</li>
 *   <li>{@link org.omg.space.xtce.VerifiersType#getFailedVerifier <em>Failed Verifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getVerifiersType()
 * @model extendedMetaData="name='Verifiers_._type' kind='elementOnly'"
 * @generated
 */
public interface VerifiersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Transferred To Range Verifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transferred to range means the command has been received by a the network that connects the ground system to the spacecraft.  Obviously, this verifier must come from something other than the spacecraft. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transferred To Range Verifier</em>' containment reference.
	 * @see #setTransferredToRangeVerifier(TransferredToRangeVerifierType)
	 * @see org.omg.space.xtce.XtcePackage#getVerifiersType_TransferredToRangeVerifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TransferredToRangeVerifier' namespace='##targetNamespace'"
	 * @generated
	 */
	TransferredToRangeVerifierType getTransferredToRangeVerifier();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.VerifiersType#getTransferredToRangeVerifier <em>Transferred To Range Verifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transferred To Range Verifier</em>' containment reference.
	 * @see #getTransferredToRangeVerifier()
	 * @generated
	 */
	void setTransferredToRangeVerifier(TransferredToRangeVerifierType value);

	/**
	 * Returns the value of the '<em><b>Sent From Range Verifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sent from range means the command has been transmitted to the spacecraft by a the network that connects the ground system to the spacecraft.  Obviously, this verifier must come from something other than the spacecraft. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sent From Range Verifier</em>' containment reference.
	 * @see #setSentFromRangeVerifier(SentFromRangeVerifierType)
	 * @see org.omg.space.xtce.XtcePackage#getVerifiersType_SentFromRangeVerifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SentFromRangeVerifier' namespace='##targetNamespace'"
	 * @generated
	 */
	SentFromRangeVerifierType getSentFromRangeVerifier();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.VerifiersType#getSentFromRangeVerifier <em>Sent From Range Verifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sent From Range Verifier</em>' containment reference.
	 * @see #getSentFromRangeVerifier()
	 * @generated
	 */
	void setSentFromRangeVerifier(SentFromRangeVerifierType value);

	/**
	 * Returns the value of the '<em><b>Received Verifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A verifier that simply means the SpaceSystem has received the command.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Received Verifier</em>' containment reference.
	 * @see #setReceivedVerifier(ReceivedVerifierType)
	 * @see org.omg.space.xtce.XtcePackage#getVerifiersType_ReceivedVerifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReceivedVerifier' namespace='##targetNamespace'"
	 * @generated
	 */
	ReceivedVerifierType getReceivedVerifier();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.VerifiersType#getReceivedVerifier <em>Received Verifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Verifier</em>' containment reference.
	 * @see #getReceivedVerifier()
	 * @generated
	 */
	void setReceivedVerifier(ReceivedVerifierType value);

	/**
	 * Returns the value of the '<em><b>Accepted Verifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A verifier that means the SpaceSystem has accepted the command
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accepted Verifier</em>' containment reference.
	 * @see #setAcceptedVerifier(AcceptedVerifierType)
	 * @see org.omg.space.xtce.XtcePackage#getVerifiersType_AcceptedVerifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AcceptedVerifier' namespace='##targetNamespace'"
	 * @generated
	 */
	AcceptedVerifierType getAcceptedVerifier();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.VerifiersType#getAcceptedVerifier <em>Accepted Verifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accepted Verifier</em>' containment reference.
	 * @see #getAcceptedVerifier()
	 * @generated
	 */
	void setAcceptedVerifier(AcceptedVerifierType value);

	/**
	 * Returns the value of the '<em><b>Queued Verifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A verifyer that means the command is scheduled for execution by the SpaceSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queued Verifier</em>' containment reference.
	 * @see #setQueuedVerifier(QueuedVerifierType)
	 * @see org.omg.space.xtce.XtcePackage#getVerifiersType_QueuedVerifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QueuedVerifier' namespace='##targetNamespace'"
	 * @generated
	 */
	QueuedVerifierType getQueuedVerifier();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.VerifiersType#getQueuedVerifier <em>Queued Verifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queued Verifier</em>' containment reference.
	 * @see #getQueuedVerifier()
	 * @generated
	 */
	void setQueuedVerifier(QueuedVerifierType value);

	/**
	 * Returns the value of the '<em><b>Execution Verifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A verifier that indicates that the command is being executed.  An optional Element indicates how far along the command has progressed either as a fixed value or an (possibly scaled) ParameterInstance value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Verifier</em>' containment reference.
	 * @see #setExecutionVerifier(ExecutionVerifierType)
	 * @see org.omg.space.xtce.XtcePackage#getVerifiersType_ExecutionVerifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExecutionVerifier' namespace='##targetNamespace'"
	 * @generated
	 */
	ExecutionVerifierType getExecutionVerifier();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.VerifiersType#getExecutionVerifier <em>Execution Verifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Verifier</em>' containment reference.
	 * @see #getExecutionVerifier()
	 * @generated
	 */
	void setExecutionVerifier(ExecutionVerifierType value);

	/**
	 * Returns the value of the '<em><b>Complete Verifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.CompleteVerifierType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A possible set of verifiers that all must be true for the command be considered completed.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complete Verifier</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getVerifiersType_CompleteVerifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CompleteVerifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CompleteVerifierType> getCompleteVerifier();

	/**
	 * Returns the value of the '<em><b>Failed Verifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When true, indicates that the command failed.  timeToWait is how long to wait for the FailedVerifier to test true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failed Verifier</em>' containment reference.
	 * @see #setFailedVerifier(CommandVerifierType)
	 * @see org.omg.space.xtce.XtcePackage#getVerifiersType_FailedVerifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FailedVerifier' namespace='##targetNamespace'"
	 * @generated
	 */
	CommandVerifierType getFailedVerifier();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.VerifiersType#getFailedVerifier <em>Failed Verifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failed Verifier</em>' containment reference.
	 * @see #getFailedVerifier()
	 * @generated
	 */
	void setFailedVerifier(CommandVerifierType value);

} // VerifiersType
