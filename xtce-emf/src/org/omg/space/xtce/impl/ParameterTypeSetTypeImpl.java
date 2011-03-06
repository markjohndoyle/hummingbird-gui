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

import org.omg.space.xtce.AbsoluteTimeDataType;
import org.omg.space.xtce.ArrayParameterTypeType;
import org.omg.space.xtce.BinaryDataType;
import org.omg.space.xtce.BooleanDataType;
import org.omg.space.xtce.EnumeratedDataType;
import org.omg.space.xtce.FloatParameterTypeType;
import org.omg.space.xtce.IntegerParameterTypeType;
import org.omg.space.xtce.ParameterTypeSetType;
import org.omg.space.xtce.RelativeTimeDataType;
import org.omg.space.xtce.StringDataType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Type Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ParameterTypeSetTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterTypeSetTypeImpl#getStringParameterType <em>String Parameter Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterTypeSetTypeImpl#getEnumeratedParameterType <em>Enumerated Parameter Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterTypeSetTypeImpl#getIntegerParameterType <em>Integer Parameter Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterTypeSetTypeImpl#getBinaryParameterType <em>Binary Parameter Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterTypeSetTypeImpl#getFloatParameterType <em>Float Parameter Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterTypeSetTypeImpl#getBooleanParameterType <em>Boolean Parameter Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterTypeSetTypeImpl#getRelativeTimeParameterType <em>Relative Time Parameter Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterTypeSetTypeImpl#getAbsoluteTimeParameterType <em>Absolute Time Parameter Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterTypeSetTypeImpl#getArrayParameterType <em>Array Parameter Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterTypeSetTypeImpl extends EObjectImpl implements ParameterTypeSetType {
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
	protected ParameterTypeSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getParameterTypeSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XtcePackage.PARAMETER_TYPE_SET_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringDataType> getStringParameterType() {
		return getGroup().list(XtcePackage.eINSTANCE.getParameterTypeSetType_StringParameterType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumeratedDataType> getEnumeratedParameterType() {
		return getGroup().list(XtcePackage.eINSTANCE.getParameterTypeSetType_EnumeratedParameterType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerParameterTypeType> getIntegerParameterType() {
		return getGroup().list(XtcePackage.eINSTANCE.getParameterTypeSetType_IntegerParameterType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryDataType> getBinaryParameterType() {
		return getGroup().list(XtcePackage.eINSTANCE.getParameterTypeSetType_BinaryParameterType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FloatParameterTypeType> getFloatParameterType() {
		return getGroup().list(XtcePackage.eINSTANCE.getParameterTypeSetType_FloatParameterType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanDataType> getBooleanParameterType() {
		return getGroup().list(XtcePackage.eINSTANCE.getParameterTypeSetType_BooleanParameterType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelativeTimeDataType> getRelativeTimeParameterType() {
		return getGroup().list(XtcePackage.eINSTANCE.getParameterTypeSetType_RelativeTimeParameterType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbsoluteTimeDataType> getAbsoluteTimeParameterType() {
		return getGroup().list(XtcePackage.eINSTANCE.getParameterTypeSetType_AbsoluteTimeParameterType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayParameterTypeType> getArrayParameterType() {
		return getGroup().list(XtcePackage.eINSTANCE.getParameterTypeSetType_ArrayParameterType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__STRING_PARAMETER_TYPE:
				return ((InternalEList<?>)getStringParameterType()).basicRemove(otherEnd, msgs);
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__ENUMERATED_PARAMETER_TYPE:
				return ((InternalEList<?>)getEnumeratedParameterType()).basicRemove(otherEnd, msgs);
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__INTEGER_PARAMETER_TYPE:
				return ((InternalEList<?>)getIntegerParameterType()).basicRemove(otherEnd, msgs);
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__BINARY_PARAMETER_TYPE:
				return ((InternalEList<?>)getBinaryParameterType()).basicRemove(otherEnd, msgs);
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__FLOAT_PARAMETER_TYPE:
				return ((InternalEList<?>)getFloatParameterType()).basicRemove(otherEnd, msgs);
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__BOOLEAN_PARAMETER_TYPE:
				return ((InternalEList<?>)getBooleanParameterType()).basicRemove(otherEnd, msgs);
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__RELATIVE_TIME_PARAMETER_TYPE:
				return ((InternalEList<?>)getRelativeTimeParameterType()).basicRemove(otherEnd, msgs);
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__ABSOLUTE_TIME_PARAMETER_TYPE:
				return ((InternalEList<?>)getAbsoluteTimeParameterType()).basicRemove(otherEnd, msgs);
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__ARRAY_PARAMETER_TYPE:
				return ((InternalEList<?>)getArrayParameterType()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__STRING_PARAMETER_TYPE:
				return getStringParameterType();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__ENUMERATED_PARAMETER_TYPE:
				return getEnumeratedParameterType();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__INTEGER_PARAMETER_TYPE:
				return getIntegerParameterType();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__BINARY_PARAMETER_TYPE:
				return getBinaryParameterType();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__FLOAT_PARAMETER_TYPE:
				return getFloatParameterType();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__BOOLEAN_PARAMETER_TYPE:
				return getBooleanParameterType();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__RELATIVE_TIME_PARAMETER_TYPE:
				return getRelativeTimeParameterType();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__ABSOLUTE_TIME_PARAMETER_TYPE:
				return getAbsoluteTimeParameterType();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__ARRAY_PARAMETER_TYPE:
				return getArrayParameterType();
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
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__STRING_PARAMETER_TYPE:
				getStringParameterType().clear();
				getStringParameterType().addAll((Collection<? extends StringDataType>)newValue);
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__ENUMERATED_PARAMETER_TYPE:
				getEnumeratedParameterType().clear();
				getEnumeratedParameterType().addAll((Collection<? extends EnumeratedDataType>)newValue);
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__INTEGER_PARAMETER_TYPE:
				getIntegerParameterType().clear();
				getIntegerParameterType().addAll((Collection<? extends IntegerParameterTypeType>)newValue);
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__BINARY_PARAMETER_TYPE:
				getBinaryParameterType().clear();
				getBinaryParameterType().addAll((Collection<? extends BinaryDataType>)newValue);
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__FLOAT_PARAMETER_TYPE:
				getFloatParameterType().clear();
				getFloatParameterType().addAll((Collection<? extends FloatParameterTypeType>)newValue);
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__BOOLEAN_PARAMETER_TYPE:
				getBooleanParameterType().clear();
				getBooleanParameterType().addAll((Collection<? extends BooleanDataType>)newValue);
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__RELATIVE_TIME_PARAMETER_TYPE:
				getRelativeTimeParameterType().clear();
				getRelativeTimeParameterType().addAll((Collection<? extends RelativeTimeDataType>)newValue);
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__ABSOLUTE_TIME_PARAMETER_TYPE:
				getAbsoluteTimeParameterType().clear();
				getAbsoluteTimeParameterType().addAll((Collection<? extends AbsoluteTimeDataType>)newValue);
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__ARRAY_PARAMETER_TYPE:
				getArrayParameterType().clear();
				getArrayParameterType().addAll((Collection<? extends ArrayParameterTypeType>)newValue);
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
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__GROUP:
				getGroup().clear();
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__STRING_PARAMETER_TYPE:
				getStringParameterType().clear();
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__ENUMERATED_PARAMETER_TYPE:
				getEnumeratedParameterType().clear();
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__INTEGER_PARAMETER_TYPE:
				getIntegerParameterType().clear();
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__BINARY_PARAMETER_TYPE:
				getBinaryParameterType().clear();
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__FLOAT_PARAMETER_TYPE:
				getFloatParameterType().clear();
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__BOOLEAN_PARAMETER_TYPE:
				getBooleanParameterType().clear();
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__RELATIVE_TIME_PARAMETER_TYPE:
				getRelativeTimeParameterType().clear();
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__ABSOLUTE_TIME_PARAMETER_TYPE:
				getAbsoluteTimeParameterType().clear();
				return;
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__ARRAY_PARAMETER_TYPE:
				getArrayParameterType().clear();
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
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__STRING_PARAMETER_TYPE:
				return !getStringParameterType().isEmpty();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__ENUMERATED_PARAMETER_TYPE:
				return !getEnumeratedParameterType().isEmpty();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__INTEGER_PARAMETER_TYPE:
				return !getIntegerParameterType().isEmpty();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__BINARY_PARAMETER_TYPE:
				return !getBinaryParameterType().isEmpty();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__FLOAT_PARAMETER_TYPE:
				return !getFloatParameterType().isEmpty();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__BOOLEAN_PARAMETER_TYPE:
				return !getBooleanParameterType().isEmpty();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__RELATIVE_TIME_PARAMETER_TYPE:
				return !getRelativeTimeParameterType().isEmpty();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__ABSOLUTE_TIME_PARAMETER_TYPE:
				return !getAbsoluteTimeParameterType().isEmpty();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE__ARRAY_PARAMETER_TYPE:
				return !getArrayParameterType().isEmpty();
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

} //ParameterTypeSetTypeImpl
