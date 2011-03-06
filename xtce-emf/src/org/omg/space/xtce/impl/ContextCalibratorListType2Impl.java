/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.space.xtce.ContextCalibratorListType2;
import org.omg.space.xtce.ContextCalibratorType1;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Calibrator List Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ContextCalibratorListType2Impl#getContextCalibrator <em>Context Calibrator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextCalibratorListType2Impl extends EObjectImpl implements ContextCalibratorListType2 {
	/**
	 * The cached value of the '{@link #getContextCalibrator() <em>Context Calibrator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextCalibrator()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextCalibratorType1> contextCalibrator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextCalibratorListType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getContextCalibratorListType2();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextCalibratorType1> getContextCalibrator() {
		if (contextCalibrator == null) {
			contextCalibrator = new EObjectContainmentEList<ContextCalibratorType1>(ContextCalibratorType1.class, this, XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE2__CONTEXT_CALIBRATOR);
		}
		return contextCalibrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE2__CONTEXT_CALIBRATOR:
				return ((InternalEList<?>)getContextCalibrator()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE2__CONTEXT_CALIBRATOR:
				return getContextCalibrator();
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
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE2__CONTEXT_CALIBRATOR:
				getContextCalibrator().clear();
				getContextCalibrator().addAll((Collection<? extends ContextCalibratorType1>)newValue);
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
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE2__CONTEXT_CALIBRATOR:
				getContextCalibrator().clear();
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
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE2__CONTEXT_CALIBRATOR:
				return contextCalibrator != null && !contextCalibrator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextCalibratorListType2Impl
