/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.space.xtce.BlockMetaCommandType;
import org.omg.space.xtce.MetaCommandStepListType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Meta Command Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.BlockMetaCommandTypeImpl#getMetaCommandStepList <em>Meta Command Step List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockMetaCommandTypeImpl extends NameDescriptionTypeImpl implements BlockMetaCommandType {
	/**
	 * The cached value of the '{@link #getMetaCommandStepList() <em>Meta Command Step List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaCommandStepList()
	 * @generated
	 * @ordered
	 */
	protected MetaCommandStepListType metaCommandStepList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockMetaCommandTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getBlockMetaCommandType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaCommandStepListType getMetaCommandStepList() {
		return metaCommandStepList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaCommandStepList(MetaCommandStepListType newMetaCommandStepList, NotificationChain msgs) {
		MetaCommandStepListType oldMetaCommandStepList = metaCommandStepList;
		metaCommandStepList = newMetaCommandStepList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.BLOCK_META_COMMAND_TYPE__META_COMMAND_STEP_LIST, oldMetaCommandStepList, newMetaCommandStepList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaCommandStepList(MetaCommandStepListType newMetaCommandStepList) {
		if (newMetaCommandStepList != metaCommandStepList) {
			NotificationChain msgs = null;
			if (metaCommandStepList != null)
				msgs = ((InternalEObject)metaCommandStepList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BLOCK_META_COMMAND_TYPE__META_COMMAND_STEP_LIST, null, msgs);
			if (newMetaCommandStepList != null)
				msgs = ((InternalEObject)newMetaCommandStepList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BLOCK_META_COMMAND_TYPE__META_COMMAND_STEP_LIST, null, msgs);
			msgs = basicSetMetaCommandStepList(newMetaCommandStepList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BLOCK_META_COMMAND_TYPE__META_COMMAND_STEP_LIST, newMetaCommandStepList, newMetaCommandStepList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.BLOCK_META_COMMAND_TYPE__META_COMMAND_STEP_LIST:
				return basicSetMetaCommandStepList(null, msgs);
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
			case XtcePackage.BLOCK_META_COMMAND_TYPE__META_COMMAND_STEP_LIST:
				return getMetaCommandStepList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XtcePackage.BLOCK_META_COMMAND_TYPE__META_COMMAND_STEP_LIST:
				setMetaCommandStepList((MetaCommandStepListType)newValue);
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
			case XtcePackage.BLOCK_META_COMMAND_TYPE__META_COMMAND_STEP_LIST:
				setMetaCommandStepList((MetaCommandStepListType)null);
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
			case XtcePackage.BLOCK_META_COMMAND_TYPE__META_COMMAND_STEP_LIST:
				return metaCommandStepList != null;
		}
		return super.eIsSet(featureID);
	}

} //BlockMetaCommandTypeImpl
