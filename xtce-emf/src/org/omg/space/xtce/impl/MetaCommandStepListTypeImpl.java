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

import org.omg.space.xtce.MetaCommandStepListType;
import org.omg.space.xtce.MetaCommandStepType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Command Step List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandStepListTypeImpl#getMetaCommandStep <em>Meta Command Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaCommandStepListTypeImpl extends EObjectImpl implements MetaCommandStepListType {
	/**
	 * The cached value of the '{@link #getMetaCommandStep() <em>Meta Command Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaCommandStep()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaCommandStepType> metaCommandStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaCommandStepListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getMetaCommandStepListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaCommandStepType> getMetaCommandStep() {
		if (metaCommandStep == null) {
			metaCommandStep = new EObjectContainmentEList<MetaCommandStepType>(MetaCommandStepType.class, this, XtcePackage.META_COMMAND_STEP_LIST_TYPE__META_COMMAND_STEP);
		}
		return metaCommandStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.META_COMMAND_STEP_LIST_TYPE__META_COMMAND_STEP:
				return ((InternalEList<?>)getMetaCommandStep()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.META_COMMAND_STEP_LIST_TYPE__META_COMMAND_STEP:
				return getMetaCommandStep();
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
			case XtcePackage.META_COMMAND_STEP_LIST_TYPE__META_COMMAND_STEP:
				getMetaCommandStep().clear();
				getMetaCommandStep().addAll((Collection<? extends MetaCommandStepType>)newValue);
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
			case XtcePackage.META_COMMAND_STEP_LIST_TYPE__META_COMMAND_STEP:
				getMetaCommandStep().clear();
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
			case XtcePackage.META_COMMAND_STEP_LIST_TYPE__META_COMMAND_STEP:
				return metaCommandStep != null && !metaCommandStep.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetaCommandStepListTypeImpl
