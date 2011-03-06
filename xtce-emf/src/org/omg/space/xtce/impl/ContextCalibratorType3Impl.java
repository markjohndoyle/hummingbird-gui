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

import org.omg.space.xtce.BooleanExpressionType;
import org.omg.space.xtce.CalibratorType;
import org.omg.space.xtce.ContextCalibratorType3;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Calibrator Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ContextCalibratorType3Impl#getUseWhenCondition <em>Use When Condition</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ContextCalibratorType3Impl#getCalibrator <em>Calibrator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextCalibratorType3Impl extends EObjectImpl implements ContextCalibratorType3 {
	/**
	 * The cached value of the '{@link #getUseWhenCondition() <em>Use When Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseWhenCondition()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpressionType useWhenCondition;

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
	protected ContextCalibratorType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getContextCalibratorType3();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpressionType getUseWhenCondition() {
		return useWhenCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseWhenCondition(BooleanExpressionType newUseWhenCondition, NotificationChain msgs) {
		BooleanExpressionType oldUseWhenCondition = useWhenCondition;
		useWhenCondition = newUseWhenCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CONTEXT_CALIBRATOR_TYPE3__USE_WHEN_CONDITION, oldUseWhenCondition, newUseWhenCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseWhenCondition(BooleanExpressionType newUseWhenCondition) {
		if (newUseWhenCondition != useWhenCondition) {
			NotificationChain msgs = null;
			if (useWhenCondition != null)
				msgs = ((InternalEObject)useWhenCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTEXT_CALIBRATOR_TYPE3__USE_WHEN_CONDITION, null, msgs);
			if (newUseWhenCondition != null)
				msgs = ((InternalEObject)newUseWhenCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTEXT_CALIBRATOR_TYPE3__USE_WHEN_CONDITION, null, msgs);
			msgs = basicSetUseWhenCondition(newUseWhenCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CONTEXT_CALIBRATOR_TYPE3__USE_WHEN_CONDITION, newUseWhenCondition, newUseWhenCondition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CONTEXT_CALIBRATOR_TYPE3__CALIBRATOR, oldCalibrator, newCalibrator);
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
				msgs = ((InternalEObject)calibrator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTEXT_CALIBRATOR_TYPE3__CALIBRATOR, null, msgs);
			if (newCalibrator != null)
				msgs = ((InternalEObject)newCalibrator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CONTEXT_CALIBRATOR_TYPE3__CALIBRATOR, null, msgs);
			msgs = basicSetCalibrator(newCalibrator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CONTEXT_CALIBRATOR_TYPE3__CALIBRATOR, newCalibrator, newCalibrator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE3__USE_WHEN_CONDITION:
				return basicSetUseWhenCondition(null, msgs);
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE3__CALIBRATOR:
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
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE3__USE_WHEN_CONDITION:
				return getUseWhenCondition();
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE3__CALIBRATOR:
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
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE3__USE_WHEN_CONDITION:
				setUseWhenCondition((BooleanExpressionType)newValue);
				return;
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE3__CALIBRATOR:
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
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE3__USE_WHEN_CONDITION:
				setUseWhenCondition((BooleanExpressionType)null);
				return;
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE3__CALIBRATOR:
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
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE3__USE_WHEN_CONDITION:
				return useWhenCondition != null;
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE3__CALIBRATOR:
				return calibrator != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextCalibratorType3Impl
