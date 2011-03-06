/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.space.xtce.AcceptedVerifierType;
import org.omg.space.xtce.CommandVerifierType;
import org.omg.space.xtce.CompleteVerifierType;
import org.omg.space.xtce.ExecutionVerifierType;
import org.omg.space.xtce.QueuedVerifierType;
import org.omg.space.xtce.ReceivedVerifierType;
import org.omg.space.xtce.SentFromRangeVerifierType;
import org.omg.space.xtce.TransferredToRangeVerifierType;
import org.omg.space.xtce.VerifiersType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verifiers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.VerifiersTypeImpl#getTransferredToRangeVerifier <em>Transferred To Range Verifier</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.VerifiersTypeImpl#getSentFromRangeVerifier <em>Sent From Range Verifier</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.VerifiersTypeImpl#getReceivedVerifier <em>Received Verifier</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.VerifiersTypeImpl#getAcceptedVerifier <em>Accepted Verifier</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.VerifiersTypeImpl#getQueuedVerifier <em>Queued Verifier</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.VerifiersTypeImpl#getExecutionVerifier <em>Execution Verifier</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.VerifiersTypeImpl#getCompleteVerifier <em>Complete Verifier</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.VerifiersTypeImpl#getFailedVerifier <em>Failed Verifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerifiersTypeImpl extends EObjectImpl implements VerifiersType {
	/**
	 * The cached value of the '{@link #getTransferredToRangeVerifier() <em>Transferred To Range Verifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferredToRangeVerifier()
	 * @generated
	 * @ordered
	 */
	protected TransferredToRangeVerifierType transferredToRangeVerifier;

	/**
	 * The cached value of the '{@link #getSentFromRangeVerifier() <em>Sent From Range Verifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentFromRangeVerifier()
	 * @generated
	 * @ordered
	 */
	protected SentFromRangeVerifierType sentFromRangeVerifier;

	/**
	 * The cached value of the '{@link #getReceivedVerifier() <em>Received Verifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedVerifier()
	 * @generated
	 * @ordered
	 */
	protected ReceivedVerifierType receivedVerifier;

	/**
	 * The cached value of the '{@link #getAcceptedVerifier() <em>Accepted Verifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedVerifier()
	 * @generated
	 * @ordered
	 */
	protected AcceptedVerifierType acceptedVerifier;

	/**
	 * The cached value of the '{@link #getQueuedVerifier() <em>Queued Verifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueuedVerifier()
	 * @generated
	 * @ordered
	 */
	protected QueuedVerifierType queuedVerifier;

	/**
	 * The cached value of the '{@link #getExecutionVerifier() <em>Execution Verifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionVerifier()
	 * @generated
	 * @ordered
	 */
	protected ExecutionVerifierType executionVerifier;

	/**
	 * The cached value of the '{@link #getCompleteVerifier() <em>Complete Verifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteVerifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CompleteVerifierType> completeVerifier;

	/**
	 * The cached value of the '{@link #getFailedVerifier() <em>Failed Verifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedVerifier()
	 * @generated
	 * @ordered
	 */
	protected CommandVerifierType failedVerifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerifiersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getVerifiersType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferredToRangeVerifierType getTransferredToRangeVerifier() {
		return transferredToRangeVerifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransferredToRangeVerifier(TransferredToRangeVerifierType newTransferredToRangeVerifier, NotificationChain msgs) {
		TransferredToRangeVerifierType oldTransferredToRangeVerifier = transferredToRangeVerifier;
		transferredToRangeVerifier = newTransferredToRangeVerifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.VERIFIERS_TYPE__TRANSFERRED_TO_RANGE_VERIFIER, oldTransferredToRangeVerifier, newTransferredToRangeVerifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferredToRangeVerifier(TransferredToRangeVerifierType newTransferredToRangeVerifier) {
		if (newTransferredToRangeVerifier != transferredToRangeVerifier) {
			NotificationChain msgs = null;
			if (transferredToRangeVerifier != null)
				msgs = ((InternalEObject)transferredToRangeVerifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.VERIFIERS_TYPE__TRANSFERRED_TO_RANGE_VERIFIER, null, msgs);
			if (newTransferredToRangeVerifier != null)
				msgs = ((InternalEObject)newTransferredToRangeVerifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.VERIFIERS_TYPE__TRANSFERRED_TO_RANGE_VERIFIER, null, msgs);
			msgs = basicSetTransferredToRangeVerifier(newTransferredToRangeVerifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.VERIFIERS_TYPE__TRANSFERRED_TO_RANGE_VERIFIER, newTransferredToRangeVerifier, newTransferredToRangeVerifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SentFromRangeVerifierType getSentFromRangeVerifier() {
		return sentFromRangeVerifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSentFromRangeVerifier(SentFromRangeVerifierType newSentFromRangeVerifier, NotificationChain msgs) {
		SentFromRangeVerifierType oldSentFromRangeVerifier = sentFromRangeVerifier;
		sentFromRangeVerifier = newSentFromRangeVerifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.VERIFIERS_TYPE__SENT_FROM_RANGE_VERIFIER, oldSentFromRangeVerifier, newSentFromRangeVerifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSentFromRangeVerifier(SentFromRangeVerifierType newSentFromRangeVerifier) {
		if (newSentFromRangeVerifier != sentFromRangeVerifier) {
			NotificationChain msgs = null;
			if (sentFromRangeVerifier != null)
				msgs = ((InternalEObject)sentFromRangeVerifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.VERIFIERS_TYPE__SENT_FROM_RANGE_VERIFIER, null, msgs);
			if (newSentFromRangeVerifier != null)
				msgs = ((InternalEObject)newSentFromRangeVerifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.VERIFIERS_TYPE__SENT_FROM_RANGE_VERIFIER, null, msgs);
			msgs = basicSetSentFromRangeVerifier(newSentFromRangeVerifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.VERIFIERS_TYPE__SENT_FROM_RANGE_VERIFIER, newSentFromRangeVerifier, newSentFromRangeVerifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceivedVerifierType getReceivedVerifier() {
		return receivedVerifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceivedVerifier(ReceivedVerifierType newReceivedVerifier, NotificationChain msgs) {
		ReceivedVerifierType oldReceivedVerifier = receivedVerifier;
		receivedVerifier = newReceivedVerifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.VERIFIERS_TYPE__RECEIVED_VERIFIER, oldReceivedVerifier, newReceivedVerifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivedVerifier(ReceivedVerifierType newReceivedVerifier) {
		if (newReceivedVerifier != receivedVerifier) {
			NotificationChain msgs = null;
			if (receivedVerifier != null)
				msgs = ((InternalEObject)receivedVerifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.VERIFIERS_TYPE__RECEIVED_VERIFIER, null, msgs);
			if (newReceivedVerifier != null)
				msgs = ((InternalEObject)newReceivedVerifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.VERIFIERS_TYPE__RECEIVED_VERIFIER, null, msgs);
			msgs = basicSetReceivedVerifier(newReceivedVerifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.VERIFIERS_TYPE__RECEIVED_VERIFIER, newReceivedVerifier, newReceivedVerifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptedVerifierType getAcceptedVerifier() {
		return acceptedVerifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcceptedVerifier(AcceptedVerifierType newAcceptedVerifier, NotificationChain msgs) {
		AcceptedVerifierType oldAcceptedVerifier = acceptedVerifier;
		acceptedVerifier = newAcceptedVerifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.VERIFIERS_TYPE__ACCEPTED_VERIFIER, oldAcceptedVerifier, newAcceptedVerifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptedVerifier(AcceptedVerifierType newAcceptedVerifier) {
		if (newAcceptedVerifier != acceptedVerifier) {
			NotificationChain msgs = null;
			if (acceptedVerifier != null)
				msgs = ((InternalEObject)acceptedVerifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.VERIFIERS_TYPE__ACCEPTED_VERIFIER, null, msgs);
			if (newAcceptedVerifier != null)
				msgs = ((InternalEObject)newAcceptedVerifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.VERIFIERS_TYPE__ACCEPTED_VERIFIER, null, msgs);
			msgs = basicSetAcceptedVerifier(newAcceptedVerifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.VERIFIERS_TYPE__ACCEPTED_VERIFIER, newAcceptedVerifier, newAcceptedVerifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueuedVerifierType getQueuedVerifier() {
		return queuedVerifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueuedVerifier(QueuedVerifierType newQueuedVerifier, NotificationChain msgs) {
		QueuedVerifierType oldQueuedVerifier = queuedVerifier;
		queuedVerifier = newQueuedVerifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.VERIFIERS_TYPE__QUEUED_VERIFIER, oldQueuedVerifier, newQueuedVerifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueuedVerifier(QueuedVerifierType newQueuedVerifier) {
		if (newQueuedVerifier != queuedVerifier) {
			NotificationChain msgs = null;
			if (queuedVerifier != null)
				msgs = ((InternalEObject)queuedVerifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.VERIFIERS_TYPE__QUEUED_VERIFIER, null, msgs);
			if (newQueuedVerifier != null)
				msgs = ((InternalEObject)newQueuedVerifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.VERIFIERS_TYPE__QUEUED_VERIFIER, null, msgs);
			msgs = basicSetQueuedVerifier(newQueuedVerifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.VERIFIERS_TYPE__QUEUED_VERIFIER, newQueuedVerifier, newQueuedVerifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionVerifierType getExecutionVerifier() {
		return executionVerifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionVerifier(ExecutionVerifierType newExecutionVerifier, NotificationChain msgs) {
		ExecutionVerifierType oldExecutionVerifier = executionVerifier;
		executionVerifier = newExecutionVerifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.VERIFIERS_TYPE__EXECUTION_VERIFIER, oldExecutionVerifier, newExecutionVerifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionVerifier(ExecutionVerifierType newExecutionVerifier) {
		if (newExecutionVerifier != executionVerifier) {
			NotificationChain msgs = null;
			if (executionVerifier != null)
				msgs = ((InternalEObject)executionVerifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.VERIFIERS_TYPE__EXECUTION_VERIFIER, null, msgs);
			if (newExecutionVerifier != null)
				msgs = ((InternalEObject)newExecutionVerifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.VERIFIERS_TYPE__EXECUTION_VERIFIER, null, msgs);
			msgs = basicSetExecutionVerifier(newExecutionVerifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.VERIFIERS_TYPE__EXECUTION_VERIFIER, newExecutionVerifier, newExecutionVerifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompleteVerifierType> getCompleteVerifier() {
		if (completeVerifier == null) {
			completeVerifier = new EObjectContainmentEList<CompleteVerifierType>(CompleteVerifierType.class, this, XtcePackage.VERIFIERS_TYPE__COMPLETE_VERIFIER);
		}
		return completeVerifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandVerifierType getFailedVerifier() {
		return failedVerifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailedVerifier(CommandVerifierType newFailedVerifier, NotificationChain msgs) {
		CommandVerifierType oldFailedVerifier = failedVerifier;
		failedVerifier = newFailedVerifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.VERIFIERS_TYPE__FAILED_VERIFIER, oldFailedVerifier, newFailedVerifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailedVerifier(CommandVerifierType newFailedVerifier) {
		if (newFailedVerifier != failedVerifier) {
			NotificationChain msgs = null;
			if (failedVerifier != null)
				msgs = ((InternalEObject)failedVerifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.VERIFIERS_TYPE__FAILED_VERIFIER, null, msgs);
			if (newFailedVerifier != null)
				msgs = ((InternalEObject)newFailedVerifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.VERIFIERS_TYPE__FAILED_VERIFIER, null, msgs);
			msgs = basicSetFailedVerifier(newFailedVerifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.VERIFIERS_TYPE__FAILED_VERIFIER, newFailedVerifier, newFailedVerifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.VERIFIERS_TYPE__TRANSFERRED_TO_RANGE_VERIFIER:
				return basicSetTransferredToRangeVerifier(null, msgs);
			case XtcePackage.VERIFIERS_TYPE__SENT_FROM_RANGE_VERIFIER:
				return basicSetSentFromRangeVerifier(null, msgs);
			case XtcePackage.VERIFIERS_TYPE__RECEIVED_VERIFIER:
				return basicSetReceivedVerifier(null, msgs);
			case XtcePackage.VERIFIERS_TYPE__ACCEPTED_VERIFIER:
				return basicSetAcceptedVerifier(null, msgs);
			case XtcePackage.VERIFIERS_TYPE__QUEUED_VERIFIER:
				return basicSetQueuedVerifier(null, msgs);
			case XtcePackage.VERIFIERS_TYPE__EXECUTION_VERIFIER:
				return basicSetExecutionVerifier(null, msgs);
			case XtcePackage.VERIFIERS_TYPE__COMPLETE_VERIFIER:
				return ((InternalEList<?>)getCompleteVerifier()).basicRemove(otherEnd, msgs);
			case XtcePackage.VERIFIERS_TYPE__FAILED_VERIFIER:
				return basicSetFailedVerifier(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.VERIFIERS_TYPE__TRANSFERRED_TO_RANGE_VERIFIER:
				return getTransferredToRangeVerifier();
			case XtcePackage.VERIFIERS_TYPE__SENT_FROM_RANGE_VERIFIER:
				return getSentFromRangeVerifier();
			case XtcePackage.VERIFIERS_TYPE__RECEIVED_VERIFIER:
				return getReceivedVerifier();
			case XtcePackage.VERIFIERS_TYPE__ACCEPTED_VERIFIER:
				return getAcceptedVerifier();
			case XtcePackage.VERIFIERS_TYPE__QUEUED_VERIFIER:
				return getQueuedVerifier();
			case XtcePackage.VERIFIERS_TYPE__EXECUTION_VERIFIER:
				return getExecutionVerifier();
			case XtcePackage.VERIFIERS_TYPE__COMPLETE_VERIFIER:
				return getCompleteVerifier();
			case XtcePackage.VERIFIERS_TYPE__FAILED_VERIFIER:
				return getFailedVerifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XtcePackage.VERIFIERS_TYPE__TRANSFERRED_TO_RANGE_VERIFIER:
				setTransferredToRangeVerifier((TransferredToRangeVerifierType)newValue);
				return;
			case XtcePackage.VERIFIERS_TYPE__SENT_FROM_RANGE_VERIFIER:
				setSentFromRangeVerifier((SentFromRangeVerifierType)newValue);
				return;
			case XtcePackage.VERIFIERS_TYPE__RECEIVED_VERIFIER:
				setReceivedVerifier((ReceivedVerifierType)newValue);
				return;
			case XtcePackage.VERIFIERS_TYPE__ACCEPTED_VERIFIER:
				setAcceptedVerifier((AcceptedVerifierType)newValue);
				return;
			case XtcePackage.VERIFIERS_TYPE__QUEUED_VERIFIER:
				setQueuedVerifier((QueuedVerifierType)newValue);
				return;
			case XtcePackage.VERIFIERS_TYPE__EXECUTION_VERIFIER:
				setExecutionVerifier((ExecutionVerifierType)newValue);
				return;
			case XtcePackage.VERIFIERS_TYPE__COMPLETE_VERIFIER:
				getCompleteVerifier().clear();
				getCompleteVerifier().addAll((Collection<? extends CompleteVerifierType>)newValue);
				return;
			case XtcePackage.VERIFIERS_TYPE__FAILED_VERIFIER:
				setFailedVerifier((CommandVerifierType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XtcePackage.VERIFIERS_TYPE__TRANSFERRED_TO_RANGE_VERIFIER:
				setTransferredToRangeVerifier((TransferredToRangeVerifierType)null);
				return;
			case XtcePackage.VERIFIERS_TYPE__SENT_FROM_RANGE_VERIFIER:
				setSentFromRangeVerifier((SentFromRangeVerifierType)null);
				return;
			case XtcePackage.VERIFIERS_TYPE__RECEIVED_VERIFIER:
				setReceivedVerifier((ReceivedVerifierType)null);
				return;
			case XtcePackage.VERIFIERS_TYPE__ACCEPTED_VERIFIER:
				setAcceptedVerifier((AcceptedVerifierType)null);
				return;
			case XtcePackage.VERIFIERS_TYPE__QUEUED_VERIFIER:
				setQueuedVerifier((QueuedVerifierType)null);
				return;
			case XtcePackage.VERIFIERS_TYPE__EXECUTION_VERIFIER:
				setExecutionVerifier((ExecutionVerifierType)null);
				return;
			case XtcePackage.VERIFIERS_TYPE__COMPLETE_VERIFIER:
				getCompleteVerifier().clear();
				return;
			case XtcePackage.VERIFIERS_TYPE__FAILED_VERIFIER:
				setFailedVerifier((CommandVerifierType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XtcePackage.VERIFIERS_TYPE__TRANSFERRED_TO_RANGE_VERIFIER:
				return transferredToRangeVerifier != null;
			case XtcePackage.VERIFIERS_TYPE__SENT_FROM_RANGE_VERIFIER:
				return sentFromRangeVerifier != null;
			case XtcePackage.VERIFIERS_TYPE__RECEIVED_VERIFIER:
				return receivedVerifier != null;
			case XtcePackage.VERIFIERS_TYPE__ACCEPTED_VERIFIER:
				return acceptedVerifier != null;
			case XtcePackage.VERIFIERS_TYPE__QUEUED_VERIFIER:
				return queuedVerifier != null;
			case XtcePackage.VERIFIERS_TYPE__EXECUTION_VERIFIER:
				return executionVerifier != null;
			case XtcePackage.VERIFIERS_TYPE__COMPLETE_VERIFIER:
				return completeVerifier != null && !completeVerifier.isEmpty();
			case XtcePackage.VERIFIERS_TYPE__FAILED_VERIFIER:
				return failedVerifier != null;
		}
		return super.eIsSet(featureID);
	}

} //VerifiersTypeImpl
