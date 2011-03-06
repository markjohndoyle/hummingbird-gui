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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.space.xtce.ParameterRefType1;
import org.omg.space.xtce.ParameterSetType;
import org.omg.space.xtce.ParameterType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ParameterSetTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterSetTypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterSetTypeImpl#getParameterRef <em>Parameter Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterSetTypeImpl extends EObjectImpl implements ParameterSetType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getParameterSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XtcePackage.PARAMETER_SET_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterType> getParameter() {
		return getGroup().list(XtcePackage.eINSTANCE.getParameterSetType_Parameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterRefType1> getParameterRef() {
		return getGroup().list(XtcePackage.eINSTANCE.getParameterSetType_ParameterRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.PARAMETER_SET_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XtcePackage.PARAMETER_SET_TYPE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case XtcePackage.PARAMETER_SET_TYPE__PARAMETER_REF:
				return ((InternalEList<?>)getParameterRef()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.PARAMETER_SET_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XtcePackage.PARAMETER_SET_TYPE__PARAMETER:
				return getParameter();
			case XtcePackage.PARAMETER_SET_TYPE__PARAMETER_REF:
				return getParameterRef();
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
			case XtcePackage.PARAMETER_SET_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XtcePackage.PARAMETER_SET_TYPE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends ParameterType>)newValue);
				return;
			case XtcePackage.PARAMETER_SET_TYPE__PARAMETER_REF:
				getParameterRef().clear();
				getParameterRef().addAll((Collection<? extends ParameterRefType1>)newValue);
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
			case XtcePackage.PARAMETER_SET_TYPE__GROUP:
				getGroup().clear();
				return;
			case XtcePackage.PARAMETER_SET_TYPE__PARAMETER:
				getParameter().clear();
				return;
			case XtcePackage.PARAMETER_SET_TYPE__PARAMETER_REF:
				getParameterRef().clear();
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
			case XtcePackage.PARAMETER_SET_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XtcePackage.PARAMETER_SET_TYPE__PARAMETER:
				return !getParameter().isEmpty();
			case XtcePackage.PARAMETER_SET_TYPE__PARAMETER_REF:
				return !getParameterRef().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ParameterSetTypeImpl
