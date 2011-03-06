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

import org.omg.space.xtce.ContextSignificanceListType;
import org.omg.space.xtce.ContextSignificanceType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Significance List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ContextSignificanceListTypeImpl#getContextSignificance <em>Context Significance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextSignificanceListTypeImpl extends EObjectImpl implements ContextSignificanceListType {
	/**
	 * The cached value of the '{@link #getContextSignificance() <em>Context Significance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextSignificance()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextSignificanceType> contextSignificance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextSignificanceListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getContextSignificanceListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextSignificanceType> getContextSignificance() {
		if (contextSignificance == null) {
			contextSignificance = new EObjectContainmentEList<ContextSignificanceType>(ContextSignificanceType.class, this, XtcePackage.CONTEXT_SIGNIFICANCE_LIST_TYPE__CONTEXT_SIGNIFICANCE);
		}
		return contextSignificance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.CONTEXT_SIGNIFICANCE_LIST_TYPE__CONTEXT_SIGNIFICANCE:
				return ((InternalEList<?>)getContextSignificance()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.CONTEXT_SIGNIFICANCE_LIST_TYPE__CONTEXT_SIGNIFICANCE:
				return getContextSignificance();
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
			case XtcePackage.CONTEXT_SIGNIFICANCE_LIST_TYPE__CONTEXT_SIGNIFICANCE:
				getContextSignificance().clear();
				getContextSignificance().addAll((Collection<? extends ContextSignificanceType>)newValue);
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
			case XtcePackage.CONTEXT_SIGNIFICANCE_LIST_TYPE__CONTEXT_SIGNIFICANCE:
				getContextSignificance().clear();
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
			case XtcePackage.CONTEXT_SIGNIFICANCE_LIST_TYPE__CONTEXT_SIGNIFICANCE:
				return contextSignificance != null && !contextSignificance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextSignificanceListTypeImpl
