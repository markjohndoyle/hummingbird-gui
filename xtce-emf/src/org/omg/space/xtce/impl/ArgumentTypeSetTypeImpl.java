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
import org.omg.space.xtce.ArgumementArrayTypeType;
import org.omg.space.xtce.ArgumentTypeSetType;
import org.omg.space.xtce.BinaryDataType;
import org.omg.space.xtce.BooleanDataType;
import org.omg.space.xtce.EnumeratedDataType;
import org.omg.space.xtce.FloatArgumentTypeType;
import org.omg.space.xtce.IntegerArgumentTypeType;
import org.omg.space.xtce.RelativeTimeDataType;
import org.omg.space.xtce.StringDataType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Type Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ArgumentTypeSetTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ArgumentTypeSetTypeImpl#getStringArgumentType <em>String Argument Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ArgumentTypeSetTypeImpl#getEnumeratedArgumentType <em>Enumerated Argument Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ArgumentTypeSetTypeImpl#getIntegerArgumentType <em>Integer Argument Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ArgumentTypeSetTypeImpl#getBinaryArgumentType <em>Binary Argument Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ArgumentTypeSetTypeImpl#getFloatArgumentType <em>Float Argument Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ArgumentTypeSetTypeImpl#getBooleanArgumentType <em>Boolean Argument Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ArgumentTypeSetTypeImpl#getRelativeTimeAgumentType <em>Relative Time Agument Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ArgumentTypeSetTypeImpl#getAbsoluteTimeArgumentType <em>Absolute Time Argument Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ArgumentTypeSetTypeImpl#getArgumementArrayType <em>Argumement Array Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentTypeSetTypeImpl extends EObjectImpl implements ArgumentTypeSetType {
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
	protected ArgumentTypeSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getArgumentTypeSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XtcePackage.ARGUMENT_TYPE_SET_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringDataType> getStringArgumentType() {
		return getGroup().list(XtcePackage.eINSTANCE.getArgumentTypeSetType_StringArgumentType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumeratedDataType> getEnumeratedArgumentType() {
		return getGroup().list(XtcePackage.eINSTANCE.getArgumentTypeSetType_EnumeratedArgumentType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerArgumentTypeType> getIntegerArgumentType() {
		return getGroup().list(XtcePackage.eINSTANCE.getArgumentTypeSetType_IntegerArgumentType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryDataType> getBinaryArgumentType() {
		return getGroup().list(XtcePackage.eINSTANCE.getArgumentTypeSetType_BinaryArgumentType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FloatArgumentTypeType> getFloatArgumentType() {
		return getGroup().list(XtcePackage.eINSTANCE.getArgumentTypeSetType_FloatArgumentType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanDataType> getBooleanArgumentType() {
		return getGroup().list(XtcePackage.eINSTANCE.getArgumentTypeSetType_BooleanArgumentType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelativeTimeDataType> getRelativeTimeAgumentType() {
		return getGroup().list(XtcePackage.eINSTANCE.getArgumentTypeSetType_RelativeTimeAgumentType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbsoluteTimeDataType> getAbsoluteTimeArgumentType() {
		return getGroup().list(XtcePackage.eINSTANCE.getArgumentTypeSetType_AbsoluteTimeArgumentType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumementArrayTypeType> getArgumementArrayType() {
		return getGroup().list(XtcePackage.eINSTANCE.getArgumentTypeSetType_ArgumementArrayType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__STRING_ARGUMENT_TYPE:
				return ((InternalEList<?>)getStringArgumentType()).basicRemove(otherEnd, msgs);
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__ENUMERATED_ARGUMENT_TYPE:
				return ((InternalEList<?>)getEnumeratedArgumentType()).basicRemove(otherEnd, msgs);
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__INTEGER_ARGUMENT_TYPE:
				return ((InternalEList<?>)getIntegerArgumentType()).basicRemove(otherEnd, msgs);
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__BINARY_ARGUMENT_TYPE:
				return ((InternalEList<?>)getBinaryArgumentType()).basicRemove(otherEnd, msgs);
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__FLOAT_ARGUMENT_TYPE:
				return ((InternalEList<?>)getFloatArgumentType()).basicRemove(otherEnd, msgs);
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__BOOLEAN_ARGUMENT_TYPE:
				return ((InternalEList<?>)getBooleanArgumentType()).basicRemove(otherEnd, msgs);
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__RELATIVE_TIME_AGUMENT_TYPE:
				return ((InternalEList<?>)getRelativeTimeAgumentType()).basicRemove(otherEnd, msgs);
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__ABSOLUTE_TIME_ARGUMENT_TYPE:
				return ((InternalEList<?>)getAbsoluteTimeArgumentType()).basicRemove(otherEnd, msgs);
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__ARGUMEMENT_ARRAY_TYPE:
				return ((InternalEList<?>)getArgumementArrayType()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__STRING_ARGUMENT_TYPE:
				return getStringArgumentType();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__ENUMERATED_ARGUMENT_TYPE:
				return getEnumeratedArgumentType();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__INTEGER_ARGUMENT_TYPE:
				return getIntegerArgumentType();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__BINARY_ARGUMENT_TYPE:
				return getBinaryArgumentType();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__FLOAT_ARGUMENT_TYPE:
				return getFloatArgumentType();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__BOOLEAN_ARGUMENT_TYPE:
				return getBooleanArgumentType();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__RELATIVE_TIME_AGUMENT_TYPE:
				return getRelativeTimeAgumentType();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__ABSOLUTE_TIME_ARGUMENT_TYPE:
				return getAbsoluteTimeArgumentType();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__ARGUMEMENT_ARRAY_TYPE:
				return getArgumementArrayType();
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
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__STRING_ARGUMENT_TYPE:
				getStringArgumentType().clear();
				getStringArgumentType().addAll((Collection<? extends StringDataType>)newValue);
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__ENUMERATED_ARGUMENT_TYPE:
				getEnumeratedArgumentType().clear();
				getEnumeratedArgumentType().addAll((Collection<? extends EnumeratedDataType>)newValue);
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__INTEGER_ARGUMENT_TYPE:
				getIntegerArgumentType().clear();
				getIntegerArgumentType().addAll((Collection<? extends IntegerArgumentTypeType>)newValue);
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__BINARY_ARGUMENT_TYPE:
				getBinaryArgumentType().clear();
				getBinaryArgumentType().addAll((Collection<? extends BinaryDataType>)newValue);
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__FLOAT_ARGUMENT_TYPE:
				getFloatArgumentType().clear();
				getFloatArgumentType().addAll((Collection<? extends FloatArgumentTypeType>)newValue);
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__BOOLEAN_ARGUMENT_TYPE:
				getBooleanArgumentType().clear();
				getBooleanArgumentType().addAll((Collection<? extends BooleanDataType>)newValue);
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__RELATIVE_TIME_AGUMENT_TYPE:
				getRelativeTimeAgumentType().clear();
				getRelativeTimeAgumentType().addAll((Collection<? extends RelativeTimeDataType>)newValue);
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__ABSOLUTE_TIME_ARGUMENT_TYPE:
				getAbsoluteTimeArgumentType().clear();
				getAbsoluteTimeArgumentType().addAll((Collection<? extends AbsoluteTimeDataType>)newValue);
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__ARGUMEMENT_ARRAY_TYPE:
				getArgumementArrayType().clear();
				getArgumementArrayType().addAll((Collection<? extends ArgumementArrayTypeType>)newValue);
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
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__GROUP:
				getGroup().clear();
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__STRING_ARGUMENT_TYPE:
				getStringArgumentType().clear();
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__ENUMERATED_ARGUMENT_TYPE:
				getEnumeratedArgumentType().clear();
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__INTEGER_ARGUMENT_TYPE:
				getIntegerArgumentType().clear();
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__BINARY_ARGUMENT_TYPE:
				getBinaryArgumentType().clear();
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__FLOAT_ARGUMENT_TYPE:
				getFloatArgumentType().clear();
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__BOOLEAN_ARGUMENT_TYPE:
				getBooleanArgumentType().clear();
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__RELATIVE_TIME_AGUMENT_TYPE:
				getRelativeTimeAgumentType().clear();
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__ABSOLUTE_TIME_ARGUMENT_TYPE:
				getAbsoluteTimeArgumentType().clear();
				return;
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__ARGUMEMENT_ARRAY_TYPE:
				getArgumementArrayType().clear();
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
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__STRING_ARGUMENT_TYPE:
				return !getStringArgumentType().isEmpty();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__ENUMERATED_ARGUMENT_TYPE:
				return !getEnumeratedArgumentType().isEmpty();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__INTEGER_ARGUMENT_TYPE:
				return !getIntegerArgumentType().isEmpty();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__BINARY_ARGUMENT_TYPE:
				return !getBinaryArgumentType().isEmpty();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__FLOAT_ARGUMENT_TYPE:
				return !getFloatArgumentType().isEmpty();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__BOOLEAN_ARGUMENT_TYPE:
				return !getBooleanArgumentType().isEmpty();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__RELATIVE_TIME_AGUMENT_TYPE:
				return !getRelativeTimeAgumentType().isEmpty();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__ABSOLUTE_TIME_ARGUMENT_TYPE:
				return !getAbsoluteTimeArgumentType().isEmpty();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__ARGUMEMENT_ARRAY_TYPE:
				return !getArgumementArrayType().isEmpty();
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

} //ArgumentTypeSetTypeImpl
