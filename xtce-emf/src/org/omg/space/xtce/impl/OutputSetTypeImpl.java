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

import org.omg.space.xtce.OutputParameterRefType;
import org.omg.space.xtce.OutputSetType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.OutputSetTypeImpl#getOutputParameterRef <em>Output Parameter Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputSetTypeImpl extends EObjectImpl implements OutputSetType {
	/**
	 * The cached value of the '{@link #getOutputParameterRef() <em>Output Parameter Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParameterRef()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputParameterRefType> outputParameterRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getOutputSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputParameterRefType> getOutputParameterRef() {
		if (outputParameterRef == null) {
			outputParameterRef = new EObjectContainmentEList<OutputParameterRefType>(OutputParameterRefType.class, this, XtcePackage.OUTPUT_SET_TYPE__OUTPUT_PARAMETER_REF);
		}
		return outputParameterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.OUTPUT_SET_TYPE__OUTPUT_PARAMETER_REF:
				return ((InternalEList<?>)getOutputParameterRef()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.OUTPUT_SET_TYPE__OUTPUT_PARAMETER_REF:
				return getOutputParameterRef();
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
			case XtcePackage.OUTPUT_SET_TYPE__OUTPUT_PARAMETER_REF:
				getOutputParameterRef().clear();
				getOutputParameterRef().addAll((Collection<? extends OutputParameterRefType>)newValue);
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
			case XtcePackage.OUTPUT_SET_TYPE__OUTPUT_PARAMETER_REF:
				getOutputParameterRef().clear();
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
			case XtcePackage.OUTPUT_SET_TYPE__OUTPUT_PARAMETER_REF:
				return outputParameterRef != null && !outputParameterRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutputSetTypeImpl
