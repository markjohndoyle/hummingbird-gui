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

import org.omg.space.xtce.CommandContainerSetType;
import org.omg.space.xtce.SequenceContainerType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Container Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.CommandContainerSetTypeImpl#getCommandContainer <em>Command Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandContainerSetTypeImpl extends EObjectImpl implements CommandContainerSetType {
	/**
	 * The cached value of the '{@link #getCommandContainer() <em>Command Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceContainerType> commandContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandContainerSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getCommandContainerSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceContainerType> getCommandContainer() {
		if (commandContainer == null) {
			commandContainer = new EObjectContainmentEList<SequenceContainerType>(SequenceContainerType.class, this, XtcePackage.COMMAND_CONTAINER_SET_TYPE__COMMAND_CONTAINER);
		}
		return commandContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.COMMAND_CONTAINER_SET_TYPE__COMMAND_CONTAINER:
				return ((InternalEList<?>)getCommandContainer()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.COMMAND_CONTAINER_SET_TYPE__COMMAND_CONTAINER:
				return getCommandContainer();
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
			case XtcePackage.COMMAND_CONTAINER_SET_TYPE__COMMAND_CONTAINER:
				getCommandContainer().clear();
				getCommandContainer().addAll((Collection<? extends SequenceContainerType>)newValue);
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
			case XtcePackage.COMMAND_CONTAINER_SET_TYPE__COMMAND_CONTAINER:
				getCommandContainer().clear();
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
			case XtcePackage.COMMAND_CONTAINER_SET_TYPE__COMMAND_CONTAINER:
				return commandContainer != null && !commandContainer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommandContainerSetTypeImpl
