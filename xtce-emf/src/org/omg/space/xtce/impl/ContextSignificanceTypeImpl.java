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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.ContextSignificanceType;
import org.omg.space.xtce.MatchCriteriaType;
import org.omg.space.xtce.SignificanceType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Significance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ContextSignificanceTypeImpl#getContextMatch <em>Context Match</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ContextSignificanceTypeImpl#getSignificance <em>Significance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextSignificanceTypeImpl extends EObjectImpl implements ContextSignificanceType {
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
	 * The cached value of the '{@link #getSignificance() <em>Significance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignificance()
	 * @generated
	 * @ordered
	 */
	protected SignificanceType significance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextSignificanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getContextSignificanceType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__CONTEXT_MATCH, oldContextMatch, newContextMatch);
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
				msgs = ((InternalEObject)contextMatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__CONTEXT_MATCH, null, msgs);
			if (newContextMatch != null)
				msgs = ((InternalEObject)newContextMatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__CONTEXT_MATCH, null, msgs);
			msgs = basicSetContextMatch(newContextMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__CONTEXT_MATCH, newContextMatch, newContextMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignificanceType getSignificance() {
		return significance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignificance(SignificanceType newSignificance, NotificationChain msgs) {
		SignificanceType oldSignificance = significance;
		significance = newSignificance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__SIGNIFICANCE, oldSignificance, newSignificance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignificance(SignificanceType newSignificance) {
		if (newSignificance != significance) {
			NotificationChain msgs = null;
			if (significance != null)
				msgs = ((InternalEObject)significance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__SIGNIFICANCE, null, msgs);
			if (newSignificance != null)
				msgs = ((InternalEObject)newSignificance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__SIGNIFICANCE, null, msgs);
			msgs = basicSetSignificance(newSignificance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__SIGNIFICANCE, newSignificance, newSignificance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__CONTEXT_MATCH:
				return basicSetContextMatch(null, msgs);
			case XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__SIGNIFICANCE:
				return basicSetSignificance(null, msgs);
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
			case XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__CONTEXT_MATCH:
				return getContextMatch();
			case XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__SIGNIFICANCE:
				return getSignificance();
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
			case XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__CONTEXT_MATCH:
				setContextMatch((MatchCriteriaType)newValue);
				return;
			case XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__SIGNIFICANCE:
				setSignificance((SignificanceType)newValue);
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
			case XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__CONTEXT_MATCH:
				setContextMatch((MatchCriteriaType)null);
				return;
			case XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__SIGNIFICANCE:
				setSignificance((SignificanceType)null);
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
			case XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__CONTEXT_MATCH:
				return contextMatch != null;
			case XtcePackage.CONTEXT_SIGNIFICANCE_TYPE__SIGNIFICANCE:
				return significance != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextSignificanceTypeImpl
