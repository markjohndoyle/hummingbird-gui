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

import org.omg.space.xtce.DecimalValueType;
import org.omg.space.xtce.ExecutionVerifierType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Verifier Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ExecutionVerifierTypeImpl#getPercentComplete <em>Percent Complete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionVerifierTypeImpl extends CommandVerifierTypeImpl implements ExecutionVerifierType {
	/**
	 * The cached value of the '{@link #getPercentComplete() <em>Percent Complete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentComplete()
	 * @generated
	 * @ordered
	 */
	protected DecimalValueType percentComplete;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionVerifierTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getExecutionVerifierType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalValueType getPercentComplete() {
		return percentComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPercentComplete(DecimalValueType newPercentComplete, NotificationChain msgs) {
		DecimalValueType oldPercentComplete = percentComplete;
		percentComplete = newPercentComplete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.EXECUTION_VERIFIER_TYPE__PERCENT_COMPLETE, oldPercentComplete, newPercentComplete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentComplete(DecimalValueType newPercentComplete) {
		if (newPercentComplete != percentComplete) {
			NotificationChain msgs = null;
			if (percentComplete != null)
				msgs = ((InternalEObject)percentComplete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.EXECUTION_VERIFIER_TYPE__PERCENT_COMPLETE, null, msgs);
			if (newPercentComplete != null)
				msgs = ((InternalEObject)newPercentComplete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.EXECUTION_VERIFIER_TYPE__PERCENT_COMPLETE, null, msgs);
			msgs = basicSetPercentComplete(newPercentComplete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.EXECUTION_VERIFIER_TYPE__PERCENT_COMPLETE, newPercentComplete, newPercentComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.EXECUTION_VERIFIER_TYPE__PERCENT_COMPLETE:
				return basicSetPercentComplete(null, msgs);
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
			case XtcePackage.EXECUTION_VERIFIER_TYPE__PERCENT_COMPLETE:
				return getPercentComplete();
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
			case XtcePackage.EXECUTION_VERIFIER_TYPE__PERCENT_COMPLETE:
				setPercentComplete((DecimalValueType)newValue);
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
			case XtcePackage.EXECUTION_VERIFIER_TYPE__PERCENT_COMPLETE:
				setPercentComplete((DecimalValueType)null);
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
			case XtcePackage.EXECUTION_VERIFIER_TYPE__PERCENT_COMPLETE:
				return percentComplete != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutionVerifierTypeImpl
