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

import org.omg.space.xtce.CustomStreamType;
import org.omg.space.xtce.FixedFrameStreamType;
import org.omg.space.xtce.StreamSetType;
import org.omg.space.xtce.VariableFrameStreamType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.StreamSetTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.StreamSetTypeImpl#getFixedFrameStream <em>Fixed Frame Stream</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.StreamSetTypeImpl#getVariableFrameStream <em>Variable Frame Stream</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.StreamSetTypeImpl#getCustomStream <em>Custom Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StreamSetTypeImpl extends EObjectImpl implements StreamSetType {
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
	protected StreamSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getStreamSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XtcePackage.STREAM_SET_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FixedFrameStreamType> getFixedFrameStream() {
		return getGroup().list(XtcePackage.eINSTANCE.getStreamSetType_FixedFrameStream());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableFrameStreamType> getVariableFrameStream() {
		return getGroup().list(XtcePackage.eINSTANCE.getStreamSetType_VariableFrameStream());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomStreamType> getCustomStream() {
		return getGroup().list(XtcePackage.eINSTANCE.getStreamSetType_CustomStream());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.STREAM_SET_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XtcePackage.STREAM_SET_TYPE__FIXED_FRAME_STREAM:
				return ((InternalEList<?>)getFixedFrameStream()).basicRemove(otherEnd, msgs);
			case XtcePackage.STREAM_SET_TYPE__VARIABLE_FRAME_STREAM:
				return ((InternalEList<?>)getVariableFrameStream()).basicRemove(otherEnd, msgs);
			case XtcePackage.STREAM_SET_TYPE__CUSTOM_STREAM:
				return ((InternalEList<?>)getCustomStream()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.STREAM_SET_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XtcePackage.STREAM_SET_TYPE__FIXED_FRAME_STREAM:
				return getFixedFrameStream();
			case XtcePackage.STREAM_SET_TYPE__VARIABLE_FRAME_STREAM:
				return getVariableFrameStream();
			case XtcePackage.STREAM_SET_TYPE__CUSTOM_STREAM:
				return getCustomStream();
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
			case XtcePackage.STREAM_SET_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XtcePackage.STREAM_SET_TYPE__FIXED_FRAME_STREAM:
				getFixedFrameStream().clear();
				getFixedFrameStream().addAll((Collection<? extends FixedFrameStreamType>)newValue);
				return;
			case XtcePackage.STREAM_SET_TYPE__VARIABLE_FRAME_STREAM:
				getVariableFrameStream().clear();
				getVariableFrameStream().addAll((Collection<? extends VariableFrameStreamType>)newValue);
				return;
			case XtcePackage.STREAM_SET_TYPE__CUSTOM_STREAM:
				getCustomStream().clear();
				getCustomStream().addAll((Collection<? extends CustomStreamType>)newValue);
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
			case XtcePackage.STREAM_SET_TYPE__GROUP:
				getGroup().clear();
				return;
			case XtcePackage.STREAM_SET_TYPE__FIXED_FRAME_STREAM:
				getFixedFrameStream().clear();
				return;
			case XtcePackage.STREAM_SET_TYPE__VARIABLE_FRAME_STREAM:
				getVariableFrameStream().clear();
				return;
			case XtcePackage.STREAM_SET_TYPE__CUSTOM_STREAM:
				getCustomStream().clear();
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
			case XtcePackage.STREAM_SET_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XtcePackage.STREAM_SET_TYPE__FIXED_FRAME_STREAM:
				return !getFixedFrameStream().isEmpty();
			case XtcePackage.STREAM_SET_TYPE__VARIABLE_FRAME_STREAM:
				return !getVariableFrameStream().isEmpty();
			case XtcePackage.STREAM_SET_TYPE__CUSTOM_STREAM:
				return !getCustomStream().isEmpty();
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

} //StreamSetTypeImpl
