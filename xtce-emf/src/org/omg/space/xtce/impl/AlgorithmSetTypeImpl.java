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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.space.xtce.AlgorithmSetType;
import org.omg.space.xtce.InputOutputTriggerAlgorithmType;
import org.omg.space.xtce.MathAlgorithmType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algorithm Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.AlgorithmSetTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.AlgorithmSetTypeImpl#getCustomAlgorithm <em>Custom Algorithm</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.AlgorithmSetTypeImpl#getMathAlgorithm <em>Math Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlgorithmSetTypeImpl extends EObjectImpl implements AlgorithmSetType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getAlgorithmSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XtcePackage.ALGORITHM_SET_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputOutputTriggerAlgorithmType> getCustomAlgorithm() {
		return getGroup().list(XtcePackage.eINSTANCE.getAlgorithmSetType_CustomAlgorithm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MathAlgorithmType> getMathAlgorithm() {
		return getGroup().list(XtcePackage.eINSTANCE.getAlgorithmSetType_MathAlgorithm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.ALGORITHM_SET_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XtcePackage.ALGORITHM_SET_TYPE__CUSTOM_ALGORITHM:
				return ((InternalEList<?>)getCustomAlgorithm()).basicRemove(otherEnd, msgs);
			case XtcePackage.ALGORITHM_SET_TYPE__MATH_ALGORITHM:
				return ((InternalEList<?>)getMathAlgorithm()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.ALGORITHM_SET_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XtcePackage.ALGORITHM_SET_TYPE__CUSTOM_ALGORITHM:
				return getCustomAlgorithm();
			case XtcePackage.ALGORITHM_SET_TYPE__MATH_ALGORITHM:
				return getMathAlgorithm();
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
			case XtcePackage.ALGORITHM_SET_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XtcePackage.ALGORITHM_SET_TYPE__CUSTOM_ALGORITHM:
				getCustomAlgorithm().clear();
				getCustomAlgorithm().addAll((Collection<? extends InputOutputTriggerAlgorithmType>)newValue);
				return;
			case XtcePackage.ALGORITHM_SET_TYPE__MATH_ALGORITHM:
				getMathAlgorithm().clear();
				getMathAlgorithm().addAll((Collection<? extends MathAlgorithmType>)newValue);
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
			case XtcePackage.ALGORITHM_SET_TYPE__GROUP:
				getGroup().clear();
				return;
			case XtcePackage.ALGORITHM_SET_TYPE__CUSTOM_ALGORITHM:
				getCustomAlgorithm().clear();
				return;
			case XtcePackage.ALGORITHM_SET_TYPE__MATH_ALGORITHM:
				getMathAlgorithm().clear();
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
			case XtcePackage.ALGORITHM_SET_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XtcePackage.ALGORITHM_SET_TYPE__CUSTOM_ALGORITHM:
				return !getCustomAlgorithm().isEmpty();
			case XtcePackage.ALGORITHM_SET_TYPE__MATH_ALGORITHM:
				return !getMathAlgorithm().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //AlgorithmSetTypeImpl
