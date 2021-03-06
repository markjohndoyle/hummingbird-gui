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

import org.omg.space.xtce.ContainerRefSetType;
import org.omg.space.xtce.ContainerRefType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Ref Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ContainerRefSetTypeImpl#getContainerRef <em>Container Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerRefSetTypeImpl extends EObjectImpl implements ContainerRefSetType {
	/**
	 * The cached value of the '{@link #getContainerRef() <em>Container Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerRefType> containerRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerRefSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getContainerRefSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerRefType> getContainerRef() {
		if (containerRef == null) {
			containerRef = new EObjectContainmentEList<ContainerRefType>(ContainerRefType.class, this, XtcePackage.CONTAINER_REF_SET_TYPE__CONTAINER_REF);
		}
		return containerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.CONTAINER_REF_SET_TYPE__CONTAINER_REF:
				return ((InternalEList<?>)getContainerRef()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.CONTAINER_REF_SET_TYPE__CONTAINER_REF:
				return getContainerRef();
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
			case XtcePackage.CONTAINER_REF_SET_TYPE__CONTAINER_REF:
				getContainerRef().clear();
				getContainerRef().addAll((Collection<? extends ContainerRefType>)newValue);
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
			case XtcePackage.CONTAINER_REF_SET_TYPE__CONTAINER_REF:
				getContainerRef().clear();
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
			case XtcePackage.CONTAINER_REF_SET_TYPE__CONTAINER_REF:
				return containerRef != null && !containerRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerRefSetTypeImpl
