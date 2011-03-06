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

import org.omg.space.xtce.ArgumentAssignmentListType;
import org.omg.space.xtce.ArgumentAssignmentType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Assignment List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ArgumentAssignmentListTypeImpl#getArgumentAssignment <em>Argument Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentAssignmentListTypeImpl extends EObjectImpl implements ArgumentAssignmentListType {
	/**
	 * The cached value of the '{@link #getArgumentAssignment() <em>Argument Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentAssignmentType> argumentAssignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentAssignmentListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getArgumentAssignmentListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentAssignmentType> getArgumentAssignment() {
		if (argumentAssignment == null) {
			argumentAssignment = new EObjectContainmentEList<ArgumentAssignmentType>(ArgumentAssignmentType.class, this, XtcePackage.ARGUMENT_ASSIGNMENT_LIST_TYPE__ARGUMENT_ASSIGNMENT);
		}
		return argumentAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.ARGUMENT_ASSIGNMENT_LIST_TYPE__ARGUMENT_ASSIGNMENT:
				return ((InternalEList<?>)getArgumentAssignment()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.ARGUMENT_ASSIGNMENT_LIST_TYPE__ARGUMENT_ASSIGNMENT:
				return getArgumentAssignment();
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
			case XtcePackage.ARGUMENT_ASSIGNMENT_LIST_TYPE__ARGUMENT_ASSIGNMENT:
				getArgumentAssignment().clear();
				getArgumentAssignment().addAll((Collection<? extends ArgumentAssignmentType>)newValue);
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
			case XtcePackage.ARGUMENT_ASSIGNMENT_LIST_TYPE__ARGUMENT_ASSIGNMENT:
				getArgumentAssignment().clear();
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
			case XtcePackage.ARGUMENT_ASSIGNMENT_LIST_TYPE__ARGUMENT_ASSIGNMENT:
				return argumentAssignment != null && !argumentAssignment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentAssignmentListTypeImpl
