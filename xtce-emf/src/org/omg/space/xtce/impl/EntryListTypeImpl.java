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

import org.omg.space.xtce.ArrayParameterRefEntryType;
import org.omg.space.xtce.ContainerRefEntryType;
import org.omg.space.xtce.ContainerSegmentRefEntryType;
import org.omg.space.xtce.EntryListType;
import org.omg.space.xtce.IndirectParameterRefEntryType;
import org.omg.space.xtce.ParameterRefEntryType;
import org.omg.space.xtce.ParameterSegmentRefEntryType;
import org.omg.space.xtce.StreamSegmentEntryType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.EntryListTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.EntryListTypeImpl#getParameterRefEntry <em>Parameter Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.EntryListTypeImpl#getParameterSegmentRefEntry <em>Parameter Segment Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.EntryListTypeImpl#getContainerRefEntry <em>Container Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.EntryListTypeImpl#getContainerSegmentRefEntry <em>Container Segment Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.EntryListTypeImpl#getStreamSegmentEntry <em>Stream Segment Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.EntryListTypeImpl#getIndirectParameterRefEntry <em>Indirect Parameter Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.EntryListTypeImpl#getArrayParameterRefEntry <em>Array Parameter Ref Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryListTypeImpl extends EObjectImpl implements EntryListType {
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
	protected EntryListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getEntryListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XtcePackage.ENTRY_LIST_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterRefEntryType> getParameterRefEntry() {
		return getGroup().list(XtcePackage.eINSTANCE.getEntryListType_ParameterRefEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterSegmentRefEntryType> getParameterSegmentRefEntry() {
		return getGroup().list(XtcePackage.eINSTANCE.getEntryListType_ParameterSegmentRefEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerRefEntryType> getContainerRefEntry() {
		return getGroup().list(XtcePackage.eINSTANCE.getEntryListType_ContainerRefEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerSegmentRefEntryType> getContainerSegmentRefEntry() {
		return getGroup().list(XtcePackage.eINSTANCE.getEntryListType_ContainerSegmentRefEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StreamSegmentEntryType> getStreamSegmentEntry() {
		return getGroup().list(XtcePackage.eINSTANCE.getEntryListType_StreamSegmentEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndirectParameterRefEntryType> getIndirectParameterRefEntry() {
		return getGroup().list(XtcePackage.eINSTANCE.getEntryListType_IndirectParameterRefEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayParameterRefEntryType> getArrayParameterRefEntry() {
		return getGroup().list(XtcePackage.eINSTANCE.getEntryListType_ArrayParameterRefEntry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.ENTRY_LIST_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XtcePackage.ENTRY_LIST_TYPE__PARAMETER_REF_ENTRY:
				return ((InternalEList<?>)getParameterRefEntry()).basicRemove(otherEnd, msgs);
			case XtcePackage.ENTRY_LIST_TYPE__PARAMETER_SEGMENT_REF_ENTRY:
				return ((InternalEList<?>)getParameterSegmentRefEntry()).basicRemove(otherEnd, msgs);
			case XtcePackage.ENTRY_LIST_TYPE__CONTAINER_REF_ENTRY:
				return ((InternalEList<?>)getContainerRefEntry()).basicRemove(otherEnd, msgs);
			case XtcePackage.ENTRY_LIST_TYPE__CONTAINER_SEGMENT_REF_ENTRY:
				return ((InternalEList<?>)getContainerSegmentRefEntry()).basicRemove(otherEnd, msgs);
			case XtcePackage.ENTRY_LIST_TYPE__STREAM_SEGMENT_ENTRY:
				return ((InternalEList<?>)getStreamSegmentEntry()).basicRemove(otherEnd, msgs);
			case XtcePackage.ENTRY_LIST_TYPE__INDIRECT_PARAMETER_REF_ENTRY:
				return ((InternalEList<?>)getIndirectParameterRefEntry()).basicRemove(otherEnd, msgs);
			case XtcePackage.ENTRY_LIST_TYPE__ARRAY_PARAMETER_REF_ENTRY:
				return ((InternalEList<?>)getArrayParameterRefEntry()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.ENTRY_LIST_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XtcePackage.ENTRY_LIST_TYPE__PARAMETER_REF_ENTRY:
				return getParameterRefEntry();
			case XtcePackage.ENTRY_LIST_TYPE__PARAMETER_SEGMENT_REF_ENTRY:
				return getParameterSegmentRefEntry();
			case XtcePackage.ENTRY_LIST_TYPE__CONTAINER_REF_ENTRY:
				return getContainerRefEntry();
			case XtcePackage.ENTRY_LIST_TYPE__CONTAINER_SEGMENT_REF_ENTRY:
				return getContainerSegmentRefEntry();
			case XtcePackage.ENTRY_LIST_TYPE__STREAM_SEGMENT_ENTRY:
				return getStreamSegmentEntry();
			case XtcePackage.ENTRY_LIST_TYPE__INDIRECT_PARAMETER_REF_ENTRY:
				return getIndirectParameterRefEntry();
			case XtcePackage.ENTRY_LIST_TYPE__ARRAY_PARAMETER_REF_ENTRY:
				return getArrayParameterRefEntry();
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
			case XtcePackage.ENTRY_LIST_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XtcePackage.ENTRY_LIST_TYPE__PARAMETER_REF_ENTRY:
				getParameterRefEntry().clear();
				getParameterRefEntry().addAll((Collection<? extends ParameterRefEntryType>)newValue);
				return;
			case XtcePackage.ENTRY_LIST_TYPE__PARAMETER_SEGMENT_REF_ENTRY:
				getParameterSegmentRefEntry().clear();
				getParameterSegmentRefEntry().addAll((Collection<? extends ParameterSegmentRefEntryType>)newValue);
				return;
			case XtcePackage.ENTRY_LIST_TYPE__CONTAINER_REF_ENTRY:
				getContainerRefEntry().clear();
				getContainerRefEntry().addAll((Collection<? extends ContainerRefEntryType>)newValue);
				return;
			case XtcePackage.ENTRY_LIST_TYPE__CONTAINER_SEGMENT_REF_ENTRY:
				getContainerSegmentRefEntry().clear();
				getContainerSegmentRefEntry().addAll((Collection<? extends ContainerSegmentRefEntryType>)newValue);
				return;
			case XtcePackage.ENTRY_LIST_TYPE__STREAM_SEGMENT_ENTRY:
				getStreamSegmentEntry().clear();
				getStreamSegmentEntry().addAll((Collection<? extends StreamSegmentEntryType>)newValue);
				return;
			case XtcePackage.ENTRY_LIST_TYPE__INDIRECT_PARAMETER_REF_ENTRY:
				getIndirectParameterRefEntry().clear();
				getIndirectParameterRefEntry().addAll((Collection<? extends IndirectParameterRefEntryType>)newValue);
				return;
			case XtcePackage.ENTRY_LIST_TYPE__ARRAY_PARAMETER_REF_ENTRY:
				getArrayParameterRefEntry().clear();
				getArrayParameterRefEntry().addAll((Collection<? extends ArrayParameterRefEntryType>)newValue);
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
			case XtcePackage.ENTRY_LIST_TYPE__GROUP:
				getGroup().clear();
				return;
			case XtcePackage.ENTRY_LIST_TYPE__PARAMETER_REF_ENTRY:
				getParameterRefEntry().clear();
				return;
			case XtcePackage.ENTRY_LIST_TYPE__PARAMETER_SEGMENT_REF_ENTRY:
				getParameterSegmentRefEntry().clear();
				return;
			case XtcePackage.ENTRY_LIST_TYPE__CONTAINER_REF_ENTRY:
				getContainerRefEntry().clear();
				return;
			case XtcePackage.ENTRY_LIST_TYPE__CONTAINER_SEGMENT_REF_ENTRY:
				getContainerSegmentRefEntry().clear();
				return;
			case XtcePackage.ENTRY_LIST_TYPE__STREAM_SEGMENT_ENTRY:
				getStreamSegmentEntry().clear();
				return;
			case XtcePackage.ENTRY_LIST_TYPE__INDIRECT_PARAMETER_REF_ENTRY:
				getIndirectParameterRefEntry().clear();
				return;
			case XtcePackage.ENTRY_LIST_TYPE__ARRAY_PARAMETER_REF_ENTRY:
				getArrayParameterRefEntry().clear();
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
			case XtcePackage.ENTRY_LIST_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XtcePackage.ENTRY_LIST_TYPE__PARAMETER_REF_ENTRY:
				return !getParameterRefEntry().isEmpty();
			case XtcePackage.ENTRY_LIST_TYPE__PARAMETER_SEGMENT_REF_ENTRY:
				return !getParameterSegmentRefEntry().isEmpty();
			case XtcePackage.ENTRY_LIST_TYPE__CONTAINER_REF_ENTRY:
				return !getContainerRefEntry().isEmpty();
			case XtcePackage.ENTRY_LIST_TYPE__CONTAINER_SEGMENT_REF_ENTRY:
				return !getContainerSegmentRefEntry().isEmpty();
			case XtcePackage.ENTRY_LIST_TYPE__STREAM_SEGMENT_ENTRY:
				return !getStreamSegmentEntry().isEmpty();
			case XtcePackage.ENTRY_LIST_TYPE__INDIRECT_PARAMETER_REF_ENTRY:
				return !getIndirectParameterRefEntry().isEmpty();
			case XtcePackage.ENTRY_LIST_TYPE__ARRAY_PARAMETER_REF_ENTRY:
				return !getArrayParameterRefEntry().isEmpty();
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

} //EntryListTypeImpl
