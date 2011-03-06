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

import org.omg.space.xtce.ArgumentRefEntryType;
import org.omg.space.xtce.ArrayParameterRefEntryType;
import org.omg.space.xtce.CommandContainerEntryListType;
import org.omg.space.xtce.ContainerRefEntryType;
import org.omg.space.xtce.ContainerSegmentRefEntryType;
import org.omg.space.xtce.FixedValueEntryType;
import org.omg.space.xtce.IndirectParameterRefEntryType;
import org.omg.space.xtce.ParameterRefEntryType;
import org.omg.space.xtce.ParameterSegmentRefEntryType;
import org.omg.space.xtce.StreamSegmentEntryType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Container Entry List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.CommandContainerEntryListTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandContainerEntryListTypeImpl#getParameterRefEntry <em>Parameter Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandContainerEntryListTypeImpl#getParameterSegmentRefEntry <em>Parameter Segment Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandContainerEntryListTypeImpl#getContainerRefEntry <em>Container Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandContainerEntryListTypeImpl#getContainerSegmentRefEntry <em>Container Segment Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandContainerEntryListTypeImpl#getStreamSegmentEntry <em>Stream Segment Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandContainerEntryListTypeImpl#getIndirectParameterRefEntry <em>Indirect Parameter Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandContainerEntryListTypeImpl#getArrayParameterRefEntry <em>Array Parameter Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandContainerEntryListTypeImpl#getArgumentRefEntry <em>Argument Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandContainerEntryListTypeImpl#getArrayArgumentRefEntry <em>Array Argument Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandContainerEntryListTypeImpl#getFixedValueEntry <em>Fixed Value Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandContainerEntryListTypeImpl extends EObjectImpl implements CommandContainerEntryListType {
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
	protected CommandContainerEntryListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getCommandContainerEntryListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterRefEntryType> getParameterRefEntry() {
		return getGroup().list(XtcePackage.eINSTANCE.getCommandContainerEntryListType_ParameterRefEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterSegmentRefEntryType> getParameterSegmentRefEntry() {
		return getGroup().list(XtcePackage.eINSTANCE.getCommandContainerEntryListType_ParameterSegmentRefEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerRefEntryType> getContainerRefEntry() {
		return getGroup().list(XtcePackage.eINSTANCE.getCommandContainerEntryListType_ContainerRefEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerSegmentRefEntryType> getContainerSegmentRefEntry() {
		return getGroup().list(XtcePackage.eINSTANCE.getCommandContainerEntryListType_ContainerSegmentRefEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StreamSegmentEntryType> getStreamSegmentEntry() {
		return getGroup().list(XtcePackage.eINSTANCE.getCommandContainerEntryListType_StreamSegmentEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndirectParameterRefEntryType> getIndirectParameterRefEntry() {
		return getGroup().list(XtcePackage.eINSTANCE.getCommandContainerEntryListType_IndirectParameterRefEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayParameterRefEntryType> getArrayParameterRefEntry() {
		return getGroup().list(XtcePackage.eINSTANCE.getCommandContainerEntryListType_ArrayParameterRefEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentRefEntryType> getArgumentRefEntry() {
		return getGroup().list(XtcePackage.eINSTANCE.getCommandContainerEntryListType_ArgumentRefEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayParameterRefEntryType> getArrayArgumentRefEntry() {
		return getGroup().list(XtcePackage.eINSTANCE.getCommandContainerEntryListType_ArrayArgumentRefEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FixedValueEntryType> getFixedValueEntry() {
		return getGroup().list(XtcePackage.eINSTANCE.getCommandContainerEntryListType_FixedValueEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__PARAMETER_REF_ENTRY:
				return ((InternalEList<?>)getParameterRefEntry()).basicRemove(otherEnd, msgs);
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__PARAMETER_SEGMENT_REF_ENTRY:
				return ((InternalEList<?>)getParameterSegmentRefEntry()).basicRemove(otherEnd, msgs);
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__CONTAINER_REF_ENTRY:
				return ((InternalEList<?>)getContainerRefEntry()).basicRemove(otherEnd, msgs);
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__CONTAINER_SEGMENT_REF_ENTRY:
				return ((InternalEList<?>)getContainerSegmentRefEntry()).basicRemove(otherEnd, msgs);
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__STREAM_SEGMENT_ENTRY:
				return ((InternalEList<?>)getStreamSegmentEntry()).basicRemove(otherEnd, msgs);
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__INDIRECT_PARAMETER_REF_ENTRY:
				return ((InternalEList<?>)getIndirectParameterRefEntry()).basicRemove(otherEnd, msgs);
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARRAY_PARAMETER_REF_ENTRY:
				return ((InternalEList<?>)getArrayParameterRefEntry()).basicRemove(otherEnd, msgs);
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARGUMENT_REF_ENTRY:
				return ((InternalEList<?>)getArgumentRefEntry()).basicRemove(otherEnd, msgs);
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARRAY_ARGUMENT_REF_ENTRY:
				return ((InternalEList<?>)getArrayArgumentRefEntry()).basicRemove(otherEnd, msgs);
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__FIXED_VALUE_ENTRY:
				return ((InternalEList<?>)getFixedValueEntry()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__PARAMETER_REF_ENTRY:
				return getParameterRefEntry();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__PARAMETER_SEGMENT_REF_ENTRY:
				return getParameterSegmentRefEntry();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__CONTAINER_REF_ENTRY:
				return getContainerRefEntry();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__CONTAINER_SEGMENT_REF_ENTRY:
				return getContainerSegmentRefEntry();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__STREAM_SEGMENT_ENTRY:
				return getStreamSegmentEntry();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__INDIRECT_PARAMETER_REF_ENTRY:
				return getIndirectParameterRefEntry();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARRAY_PARAMETER_REF_ENTRY:
				return getArrayParameterRefEntry();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARGUMENT_REF_ENTRY:
				return getArgumentRefEntry();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARRAY_ARGUMENT_REF_ENTRY:
				return getArrayArgumentRefEntry();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__FIXED_VALUE_ENTRY:
				return getFixedValueEntry();
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
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__PARAMETER_REF_ENTRY:
				getParameterRefEntry().clear();
				getParameterRefEntry().addAll((Collection<? extends ParameterRefEntryType>)newValue);
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__PARAMETER_SEGMENT_REF_ENTRY:
				getParameterSegmentRefEntry().clear();
				getParameterSegmentRefEntry().addAll((Collection<? extends ParameterSegmentRefEntryType>)newValue);
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__CONTAINER_REF_ENTRY:
				getContainerRefEntry().clear();
				getContainerRefEntry().addAll((Collection<? extends ContainerRefEntryType>)newValue);
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__CONTAINER_SEGMENT_REF_ENTRY:
				getContainerSegmentRefEntry().clear();
				getContainerSegmentRefEntry().addAll((Collection<? extends ContainerSegmentRefEntryType>)newValue);
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__STREAM_SEGMENT_ENTRY:
				getStreamSegmentEntry().clear();
				getStreamSegmentEntry().addAll((Collection<? extends StreamSegmentEntryType>)newValue);
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__INDIRECT_PARAMETER_REF_ENTRY:
				getIndirectParameterRefEntry().clear();
				getIndirectParameterRefEntry().addAll((Collection<? extends IndirectParameterRefEntryType>)newValue);
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARRAY_PARAMETER_REF_ENTRY:
				getArrayParameterRefEntry().clear();
				getArrayParameterRefEntry().addAll((Collection<? extends ArrayParameterRefEntryType>)newValue);
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARGUMENT_REF_ENTRY:
				getArgumentRefEntry().clear();
				getArgumentRefEntry().addAll((Collection<? extends ArgumentRefEntryType>)newValue);
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARRAY_ARGUMENT_REF_ENTRY:
				getArrayArgumentRefEntry().clear();
				getArrayArgumentRefEntry().addAll((Collection<? extends ArrayParameterRefEntryType>)newValue);
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__FIXED_VALUE_ENTRY:
				getFixedValueEntry().clear();
				getFixedValueEntry().addAll((Collection<? extends FixedValueEntryType>)newValue);
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
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__GROUP:
				getGroup().clear();
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__PARAMETER_REF_ENTRY:
				getParameterRefEntry().clear();
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__PARAMETER_SEGMENT_REF_ENTRY:
				getParameterSegmentRefEntry().clear();
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__CONTAINER_REF_ENTRY:
				getContainerRefEntry().clear();
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__CONTAINER_SEGMENT_REF_ENTRY:
				getContainerSegmentRefEntry().clear();
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__STREAM_SEGMENT_ENTRY:
				getStreamSegmentEntry().clear();
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__INDIRECT_PARAMETER_REF_ENTRY:
				getIndirectParameterRefEntry().clear();
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARRAY_PARAMETER_REF_ENTRY:
				getArrayParameterRefEntry().clear();
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARGUMENT_REF_ENTRY:
				getArgumentRefEntry().clear();
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARRAY_ARGUMENT_REF_ENTRY:
				getArrayArgumentRefEntry().clear();
				return;
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__FIXED_VALUE_ENTRY:
				getFixedValueEntry().clear();
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
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__PARAMETER_REF_ENTRY:
				return !getParameterRefEntry().isEmpty();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__PARAMETER_SEGMENT_REF_ENTRY:
				return !getParameterSegmentRefEntry().isEmpty();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__CONTAINER_REF_ENTRY:
				return !getContainerRefEntry().isEmpty();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__CONTAINER_SEGMENT_REF_ENTRY:
				return !getContainerSegmentRefEntry().isEmpty();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__STREAM_SEGMENT_ENTRY:
				return !getStreamSegmentEntry().isEmpty();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__INDIRECT_PARAMETER_REF_ENTRY:
				return !getIndirectParameterRefEntry().isEmpty();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARRAY_PARAMETER_REF_ENTRY:
				return !getArrayParameterRefEntry().isEmpty();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARGUMENT_REF_ENTRY:
				return !getArgumentRefEntry().isEmpty();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARRAY_ARGUMENT_REF_ENTRY:
				return !getArrayArgumentRefEntry().isEmpty();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__FIXED_VALUE_ENTRY:
				return !getFixedValueEntry().isEmpty();
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

} //CommandContainerEntryListTypeImpl
