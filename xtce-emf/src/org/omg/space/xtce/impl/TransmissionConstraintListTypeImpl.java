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

import org.omg.space.xtce.TransmissionConstraintListType;
import org.omg.space.xtce.TransmissionConstraintType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmission Constraint List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.TransmissionConstraintListTypeImpl#getTransmissionConstraint <em>Transmission Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransmissionConstraintListTypeImpl extends EObjectImpl implements TransmissionConstraintListType {
	/**
	 * The cached value of the '{@link #getTransmissionConstraint() <em>Transmission Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionConstraintType> transmissionConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionConstraintListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getTransmissionConstraintListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransmissionConstraintType> getTransmissionConstraint() {
		if (transmissionConstraint == null) {
			transmissionConstraint = new EObjectContainmentEList<TransmissionConstraintType>(TransmissionConstraintType.class, this, XtcePackage.TRANSMISSION_CONSTRAINT_LIST_TYPE__TRANSMISSION_CONSTRAINT);
		}
		return transmissionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.TRANSMISSION_CONSTRAINT_LIST_TYPE__TRANSMISSION_CONSTRAINT:
				return ((InternalEList<?>)getTransmissionConstraint()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.TRANSMISSION_CONSTRAINT_LIST_TYPE__TRANSMISSION_CONSTRAINT:
				return getTransmissionConstraint();
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
			case XtcePackage.TRANSMISSION_CONSTRAINT_LIST_TYPE__TRANSMISSION_CONSTRAINT:
				getTransmissionConstraint().clear();
				getTransmissionConstraint().addAll((Collection<? extends TransmissionConstraintType>)newValue);
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
			case XtcePackage.TRANSMISSION_CONSTRAINT_LIST_TYPE__TRANSMISSION_CONSTRAINT:
				getTransmissionConstraint().clear();
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
			case XtcePackage.TRANSMISSION_CONSTRAINT_LIST_TYPE__TRANSMISSION_CONSTRAINT:
				return transmissionConstraint != null && !transmissionConstraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransmissionConstraintListTypeImpl
