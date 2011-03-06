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

import org.omg.space.xtce.ExternalAlgorithmSetType;
import org.omg.space.xtce.ExternalAlgorithmType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Algorithm Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ExternalAlgorithmSetTypeImpl#getExternalAlgorithm <em>External Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalAlgorithmSetTypeImpl extends EObjectImpl implements ExternalAlgorithmSetType {
	/**
	 * The cached value of the '{@link #getExternalAlgorithm() <em>External Algorithm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalAlgorithmType> externalAlgorithm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalAlgorithmSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getExternalAlgorithmSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalAlgorithmType> getExternalAlgorithm() {
		if (externalAlgorithm == null) {
			externalAlgorithm = new EObjectContainmentEList<ExternalAlgorithmType>(ExternalAlgorithmType.class, this, XtcePackage.EXTERNAL_ALGORITHM_SET_TYPE__EXTERNAL_ALGORITHM);
		}
		return externalAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.EXTERNAL_ALGORITHM_SET_TYPE__EXTERNAL_ALGORITHM:
				return ((InternalEList<?>)getExternalAlgorithm()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.EXTERNAL_ALGORITHM_SET_TYPE__EXTERNAL_ALGORITHM:
				return getExternalAlgorithm();
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
			case XtcePackage.EXTERNAL_ALGORITHM_SET_TYPE__EXTERNAL_ALGORITHM:
				getExternalAlgorithm().clear();
				getExternalAlgorithm().addAll((Collection<? extends ExternalAlgorithmType>)newValue);
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
			case XtcePackage.EXTERNAL_ALGORITHM_SET_TYPE__EXTERNAL_ALGORITHM:
				getExternalAlgorithm().clear();
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
			case XtcePackage.EXTERNAL_ALGORITHM_SET_TYPE__EXTERNAL_ALGORITHM:
				return externalAlgorithm != null && !externalAlgorithm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExternalAlgorithmSetTypeImpl
