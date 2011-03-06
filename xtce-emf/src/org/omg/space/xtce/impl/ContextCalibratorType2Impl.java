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

import org.omg.space.xtce.CalibratorType;
import org.omg.space.xtce.ContextCalibratorType2;
import org.omg.space.xtce.MatchCriteriaType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Calibrator Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ContextCalibratorType2Impl#getContextMatch <em>Context Match</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ContextCalibratorType2Impl#getCalibrator <em>Calibrator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextCalibratorType2Impl extends EObjectImpl implements ContextCalibratorType2 {
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
	 * The cached value of the '{@link #getCalibrator() <em>Calibrator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibrator()
	 * @generated
	 * @ordered
	 */
	protected CalibratorType calibrator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextCalibratorType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getContextCalibratorType2();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CONTEXT_MATCH, oldContextMatch, newContextMatch);
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
				msgs = ((InternalEObject)contextMatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CONTEXT_MATCH, null, msgs);
			if (newContextMatch != null)
				msgs = ((InternalEObject)newContextMatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CONTEXT_MATCH, null, msgs);
			msgs = basicSetContextMatch(newContextMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CONTEXT_MATCH, newContextMatch, newContextMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalibratorType getCalibrator() {
		return calibrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalibrator(CalibratorType newCalibrator, NotificationChain msgs) {
		CalibratorType oldCalibrator = calibrator;
		calibrator = newCalibrator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CALIBRATOR, oldCalibrator, newCalibrator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalibrator(CalibratorType newCalibrator) {
		if (newCalibrator != calibrator) {
			NotificationChain msgs = null;
			if (calibrator != null)
				msgs = ((InternalEObject)calibrator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CALIBRATOR, null, msgs);
			if (newCalibrator != null)
				msgs = ((InternalEObject)newCalibrator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CALIBRATOR, null, msgs);
			msgs = basicSetCalibrator(newCalibrator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CALIBRATOR, newCalibrator, newCalibrator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CONTEXT_MATCH:
				return basicSetContextMatch(null, msgs);
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CALIBRATOR:
				return basicSetCalibrator(null, msgs);
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
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CONTEXT_MATCH:
				return getContextMatch();
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CALIBRATOR:
				return getCalibrator();
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
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CONTEXT_MATCH:
				setContextMatch((MatchCriteriaType)newValue);
				return;
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CALIBRATOR:
				setCalibrator((CalibratorType)newValue);
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
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CONTEXT_MATCH:
				setContextMatch((MatchCriteriaType)null);
				return;
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CALIBRATOR:
				setCalibrator((CalibratorType)null);
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
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CONTEXT_MATCH:
				return contextMatch != null;
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE2__CALIBRATOR:
				return calibrator != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextCalibratorType2Impl
