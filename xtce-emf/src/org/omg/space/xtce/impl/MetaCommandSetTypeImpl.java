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

import org.omg.space.xtce.BlockMetaCommandType;
import org.omg.space.xtce.MetaCommandSetType;
import org.omg.space.xtce.MetaCommandType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Command Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandSetTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandSetTypeImpl#getMetaCommand <em>Meta Command</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandSetTypeImpl#getMetaCommandRef <em>Meta Command Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandSetTypeImpl#getBlockMetaCommand <em>Block Meta Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaCommandSetTypeImpl extends EObjectImpl implements MetaCommandSetType {
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
	protected MetaCommandSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getMetaCommandSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XtcePackage.META_COMMAND_SET_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaCommandType> getMetaCommand() {
		return getGroup().list(XtcePackage.eINSTANCE.getMetaCommandSetType_MetaCommand());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMetaCommandRef() {
		return getGroup().list(XtcePackage.eINSTANCE.getMetaCommandSetType_MetaCommandRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BlockMetaCommandType> getBlockMetaCommand() {
		return getGroup().list(XtcePackage.eINSTANCE.getMetaCommandSetType_BlockMetaCommand());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.META_COMMAND_SET_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XtcePackage.META_COMMAND_SET_TYPE__META_COMMAND:
				return ((InternalEList<?>)getMetaCommand()).basicRemove(otherEnd, msgs);
			case XtcePackage.META_COMMAND_SET_TYPE__BLOCK_META_COMMAND:
				return ((InternalEList<?>)getBlockMetaCommand()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.META_COMMAND_SET_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XtcePackage.META_COMMAND_SET_TYPE__META_COMMAND:
				return getMetaCommand();
			case XtcePackage.META_COMMAND_SET_TYPE__META_COMMAND_REF:
				return getMetaCommandRef();
			case XtcePackage.META_COMMAND_SET_TYPE__BLOCK_META_COMMAND:
				return getBlockMetaCommand();
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
			case XtcePackage.META_COMMAND_SET_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XtcePackage.META_COMMAND_SET_TYPE__META_COMMAND:
				getMetaCommand().clear();
				getMetaCommand().addAll((Collection<? extends MetaCommandType>)newValue);
				return;
			case XtcePackage.META_COMMAND_SET_TYPE__META_COMMAND_REF:
				getMetaCommandRef().clear();
				getMetaCommandRef().addAll((Collection<? extends String>)newValue);
				return;
			case XtcePackage.META_COMMAND_SET_TYPE__BLOCK_META_COMMAND:
				getBlockMetaCommand().clear();
				getBlockMetaCommand().addAll((Collection<? extends BlockMetaCommandType>)newValue);
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
			case XtcePackage.META_COMMAND_SET_TYPE__GROUP:
				getGroup().clear();
				return;
			case XtcePackage.META_COMMAND_SET_TYPE__META_COMMAND:
				getMetaCommand().clear();
				return;
			case XtcePackage.META_COMMAND_SET_TYPE__META_COMMAND_REF:
				getMetaCommandRef().clear();
				return;
			case XtcePackage.META_COMMAND_SET_TYPE__BLOCK_META_COMMAND:
				getBlockMetaCommand().clear();
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
			case XtcePackage.META_COMMAND_SET_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XtcePackage.META_COMMAND_SET_TYPE__META_COMMAND:
				return !getMetaCommand().isEmpty();
			case XtcePackage.META_COMMAND_SET_TYPE__META_COMMAND_REF:
				return !getMetaCommandRef().isEmpty();
			case XtcePackage.META_COMMAND_SET_TYPE__BLOCK_META_COMMAND:
				return !getBlockMetaCommand().isEmpty();
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

} //MetaCommandSetTypeImpl
