/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.space.xtce.ContainerRefType;
import org.omg.space.xtce.MatchCriteriaType;
import org.omg.space.xtce.MessageType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.MessageTypeImpl#getMatchCriteria <em>Match Criteria</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MessageTypeImpl#getContainRef <em>Contain Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageTypeImpl extends NameDescriptionTypeImpl implements MessageType {
	/**
	 * The cached value of the '{@link #getMatchCriteria() <em>Match Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchCriteria()
	 * @generated
	 * @ordered
	 */
	protected MatchCriteriaType matchCriteria;

	/**
	 * The cached value of the '{@link #getContainRef() <em>Contain Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainRef()
	 * @generated
	 * @ordered
	 */
	protected ContainerRefType containRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getMessageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchCriteriaType getMatchCriteria() {
		return matchCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatchCriteria(MatchCriteriaType newMatchCriteria, NotificationChain msgs) {
		MatchCriteriaType oldMatchCriteria = matchCriteria;
		matchCriteria = newMatchCriteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.MESSAGE_TYPE__MATCH_CRITERIA, oldMatchCriteria, newMatchCriteria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchCriteria(MatchCriteriaType newMatchCriteria) {
		if (newMatchCriteria != matchCriteria) {
			NotificationChain msgs = null;
			if (matchCriteria != null)
				msgs = ((InternalEObject)matchCriteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.MESSAGE_TYPE__MATCH_CRITERIA, null, msgs);
			if (newMatchCriteria != null)
				msgs = ((InternalEObject)newMatchCriteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.MESSAGE_TYPE__MATCH_CRITERIA, null, msgs);
			msgs = basicSetMatchCriteria(newMatchCriteria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.MESSAGE_TYPE__MATCH_CRITERIA, newMatchCriteria, newMatchCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerRefType getContainRef() {
		return containRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainRef(ContainerRefType newContainRef, NotificationChain msgs) {
		ContainerRefType oldContainRef = containRef;
		containRef = newContainRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.MESSAGE_TYPE__CONTAIN_REF, oldContainRef, newContainRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainRef(ContainerRefType newContainRef) {
		if (newContainRef != containRef) {
			NotificationChain msgs = null;
			if (containRef != null)
				msgs = ((InternalEObject)containRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.MESSAGE_TYPE__CONTAIN_REF, null, msgs);
			if (newContainRef != null)
				msgs = ((InternalEObject)newContainRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.MESSAGE_TYPE__CONTAIN_REF, null, msgs);
			msgs = basicSetContainRef(newContainRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.MESSAGE_TYPE__CONTAIN_REF, newContainRef, newContainRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.MESSAGE_TYPE__MATCH_CRITERIA:
				return basicSetMatchCriteria(null, msgs);
			case XtcePackage.MESSAGE_TYPE__CONTAIN_REF:
				return basicSetContainRef(null, msgs);
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
			case XtcePackage.MESSAGE_TYPE__MATCH_CRITERIA:
				return getMatchCriteria();
			case XtcePackage.MESSAGE_TYPE__CONTAIN_REF:
				return getContainRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XtcePackage.MESSAGE_TYPE__MATCH_CRITERIA:
				setMatchCriteria((MatchCriteriaType)newValue);
				return;
			case XtcePackage.MESSAGE_TYPE__CONTAIN_REF:
				setContainRef((ContainerRefType)newValue);
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
			case XtcePackage.MESSAGE_TYPE__MATCH_CRITERIA:
				setMatchCriteria((MatchCriteriaType)null);
				return;
			case XtcePackage.MESSAGE_TYPE__CONTAIN_REF:
				setContainRef((ContainerRefType)null);
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
			case XtcePackage.MESSAGE_TYPE__MATCH_CRITERIA:
				return matchCriteria != null;
			case XtcePackage.MESSAGE_TYPE__CONTAIN_REF:
				return containRef != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageTypeImpl
