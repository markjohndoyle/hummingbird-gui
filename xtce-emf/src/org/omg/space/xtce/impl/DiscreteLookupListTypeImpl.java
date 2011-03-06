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

import org.omg.space.xtce.DiscreteLookupListType;
import org.omg.space.xtce.DiscreteLookupType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Lookup List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.DiscreteLookupListTypeImpl#getDiscreteLookup <em>Discrete Lookup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscreteLookupListTypeImpl extends EObjectImpl implements DiscreteLookupListType {
	/**
	 * The cached value of the '{@link #getDiscreteLookup() <em>Discrete Lookup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscreteLookup()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscreteLookupType> discreteLookup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteLookupListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getDiscreteLookupListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscreteLookupType> getDiscreteLookup() {
		if (discreteLookup == null) {
			discreteLookup = new EObjectContainmentEList<DiscreteLookupType>(DiscreteLookupType.class, this, XtcePackage.DISCRETE_LOOKUP_LIST_TYPE__DISCRETE_LOOKUP);
		}
		return discreteLookup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.DISCRETE_LOOKUP_LIST_TYPE__DISCRETE_LOOKUP:
				return ((InternalEList<?>)getDiscreteLookup()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.DISCRETE_LOOKUP_LIST_TYPE__DISCRETE_LOOKUP:
				return getDiscreteLookup();
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
			case XtcePackage.DISCRETE_LOOKUP_LIST_TYPE__DISCRETE_LOOKUP:
				getDiscreteLookup().clear();
				getDiscreteLookup().addAll((Collection<? extends DiscreteLookupType>)newValue);
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
			case XtcePackage.DISCRETE_LOOKUP_LIST_TYPE__DISCRETE_LOOKUP:
				getDiscreteLookup().clear();
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
			case XtcePackage.DISCRETE_LOOKUP_LIST_TYPE__DISCRETE_LOOKUP:
				return discreteLookup != null && !discreteLookup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiscreteLookupListTypeImpl
