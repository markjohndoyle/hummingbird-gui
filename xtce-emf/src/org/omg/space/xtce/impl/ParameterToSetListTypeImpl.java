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

import org.omg.space.xtce.ParameterToSetListType;
import org.omg.space.xtce.ParameterToSetType1;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter To Set List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ParameterToSetListTypeImpl#getParameterToSet <em>Parameter To Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterToSetListTypeImpl extends EObjectImpl implements ParameterToSetListType {
	/**
	 * The cached value of the '{@link #getParameterToSet() <em>Parameter To Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterToSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterToSetType1> parameterToSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterToSetListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getParameterToSetListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterToSetType1> getParameterToSet() {
		if (parameterToSet == null) {
			parameterToSet = new EObjectContainmentEList<ParameterToSetType1>(ParameterToSetType1.class, this, XtcePackage.PARAMETER_TO_SET_LIST_TYPE__PARAMETER_TO_SET);
		}
		return parameterToSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.PARAMETER_TO_SET_LIST_TYPE__PARAMETER_TO_SET:
				return ((InternalEList<?>)getParameterToSet()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.PARAMETER_TO_SET_LIST_TYPE__PARAMETER_TO_SET:
				return getParameterToSet();
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
			case XtcePackage.PARAMETER_TO_SET_LIST_TYPE__PARAMETER_TO_SET:
				getParameterToSet().clear();
				getParameterToSet().addAll((Collection<? extends ParameterToSetType1>)newValue);
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
			case XtcePackage.PARAMETER_TO_SET_LIST_TYPE__PARAMETER_TO_SET:
				getParameterToSet().clear();
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
			case XtcePackage.PARAMETER_TO_SET_LIST_TYPE__PARAMETER_TO_SET:
				return parameterToSet != null && !parameterToSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParameterToSetListTypeImpl
