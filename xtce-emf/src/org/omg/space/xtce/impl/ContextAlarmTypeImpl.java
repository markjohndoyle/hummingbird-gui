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

import org.omg.space.xtce.ContextAlarmType;
import org.omg.space.xtce.MatchCriteriaType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Alarm Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ContextAlarmTypeImpl#getContextMatch <em>Context Match</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextAlarmTypeImpl extends NumericAlarmConditionTypeImpl implements ContextAlarmType {
	/**
	 * The cached value of the '{@link #getContextMatch() <em>Context Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextMatch()
	 * @generated
	 * @ordered
	 */
	protected MatchCriteriaType contextMatch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextAlarmTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getContextAlarmType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchCriteriaType getContextMatch() {
		return contextMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextMatch(MatchCriteriaType newContextMatch, NotificationChain msgs) {
		MatchCriteriaType oldContextMatch = contextMatch;
		contextMatch = newContextMatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CONTEXT_ALARM_TYPE__CONTEXT_MATCH, oldContextMatch, newContextMatch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextMatch(MatchCriteriaType newContextMatch) {
		if (newContextMatch != contextMatch) {
			NotificationChain msgs = null;
			if (contextMatch != null)
				msgs = ((InternalEObject)contextMatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTEXT_ALARM_TYPE__CONTEXT_MATCH, null, msgs);
			if (newContextMatch != null)
				msgs = ((InternalEObject)newContextMatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTEXT_ALARM_TYPE__CONTEXT_MATCH, null, msgs);
			msgs = basicSetContextMatch(newContextMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CONTEXT_ALARM_TYPE__CONTEXT_MATCH, newContextMatch, newContextMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.CONTEXT_ALARM_TYPE__CONTEXT_MATCH:
				return basicSetContextMatch(null, msgs);
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
			case XtcePackage.CONTEXT_ALARM_TYPE__CONTEXT_MATCH:
				return getContextMatch();
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
			case XtcePackage.CONTEXT_ALARM_TYPE__CONTEXT_MATCH:
				setContextMatch((MatchCriteriaType)newValue);
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
			case XtcePackage.CONTEXT_ALARM_TYPE__CONTEXT_MATCH:
				setContextMatch((MatchCriteriaType)null);
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
			case XtcePackage.CONTEXT_ALARM_TYPE__CONTEXT_MATCH:
				return contextMatch != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextAlarmTypeImpl
