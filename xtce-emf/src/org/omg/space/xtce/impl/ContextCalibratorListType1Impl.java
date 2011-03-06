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

import org.omg.space.xtce.ContextCalibratorListType1;
import org.omg.space.xtce.ContextCalibratorType2;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Calibrator List Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ContextCalibratorListType1Impl#getContextCalibrator <em>Context Calibrator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextCalibratorListType1Impl extends EObjectImpl implements ContextCalibratorListType1 {
	/**
	 * The cached value of the '{@link #getContextCalibrator() <em>Context Calibrator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextCalibrator()
	 * @generated
	 * @ordered
	 */
	protected ContextCalibratorType2 contextCalibrator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextCalibratorListType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getContextCalibratorListType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextCalibratorType2 getContextCalibrator() {
		return contextCalibrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextCalibrator(ContextCalibratorType2 newContextCalibrator, NotificationChain msgs) {
		ContextCalibratorType2 oldContextCalibrator = contextCalibrator;
		contextCalibrator = newContextCalibrator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE1__CONTEXT_CALIBRATOR, oldContextCalibrator, newContextCalibrator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextCalibrator(ContextCalibratorType2 newContextCalibrator) {
		if (newContextCalibrator != contextCalibrator) {
			NotificationChain msgs = null;
			if (contextCalibrator != null)
				msgs = ((InternalEObject)contextCalibrator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE1__CONTEXT_CALIBRATOR, null, msgs);
			if (newContextCalibrator != null)
				msgs = ((InternalEObject)newContextCalibrator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE1__CONTEXT_CALIBRATOR, null, msgs);
			msgs = basicSetContextCalibrator(newContextCalibrator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE1__CONTEXT_CALIBRATOR, newContextCalibrator, newContextCalibrator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE1__CONTEXT_CALIBRATOR:
				return basicSetContextCalibrator(null, msgs);
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
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE1__CONTEXT_CALIBRATOR:
				return getContextCalibrator();
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
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE1__CONTEXT_CALIBRATOR:
				setContextCalibrator((ContextCalibratorType2)newValue);
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
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE1__CONTEXT_CALIBRATOR:
				setContextCalibrator((ContextCalibratorType2)null);
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
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE1__CONTEXT_CALIBRATOR:
				return contextCalibrator != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextCalibratorListType1Impl
