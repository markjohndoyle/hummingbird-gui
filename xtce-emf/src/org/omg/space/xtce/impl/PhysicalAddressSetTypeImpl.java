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

import org.omg.space.xtce.PhysicalAddressSetType;
import org.omg.space.xtce.PhysicalAddressType1;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Address Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.PhysicalAddressSetTypeImpl#getPhysicalAddress <em>Physical Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalAddressSetTypeImpl extends EObjectImpl implements PhysicalAddressSetType {
	/**
	 * The cached value of the '{@link #getPhysicalAddress() <em>Physical Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalAddressType1> physicalAddress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalAddressSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getPhysicalAddressSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalAddressType1> getPhysicalAddress() {
		if (physicalAddress == null) {
			physicalAddress = new EObjectContainmentEList<PhysicalAddressType1>(PhysicalAddressType1.class, this, XtcePackage.PHYSICAL_ADDRESS_SET_TYPE__PHYSICAL_ADDRESS);
		}
		return physicalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.PHYSICAL_ADDRESS_SET_TYPE__PHYSICAL_ADDRESS:
				return ((InternalEList<?>)getPhysicalAddress()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.PHYSICAL_ADDRESS_SET_TYPE__PHYSICAL_ADDRESS:
				return getPhysicalAddress();
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
			case XtcePackage.PHYSICAL_ADDRESS_SET_TYPE__PHYSICAL_ADDRESS:
				getPhysicalAddress().clear();
				getPhysicalAddress().addAll((Collection<? extends PhysicalAddressType1>)newValue);
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
			case XtcePackage.PHYSICAL_ADDRESS_SET_TYPE__PHYSICAL_ADDRESS:
				getPhysicalAddress().clear();
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
			case XtcePackage.PHYSICAL_ADDRESS_SET_TYPE__PHYSICAL_ADDRESS:
				return physicalAddress != null && !physicalAddress.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalAddressSetTypeImpl
