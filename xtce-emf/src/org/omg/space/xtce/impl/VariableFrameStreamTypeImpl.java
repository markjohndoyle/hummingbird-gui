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

import org.omg.space.xtce.SyncStrategyType1;
import org.omg.space.xtce.VariableFrameStreamType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Frame Stream Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.VariableFrameStreamTypeImpl#getSyncStrategy <em>Sync Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableFrameStreamTypeImpl extends FrameStreamTypeImpl implements VariableFrameStreamType {
	/**
	 * The cached value of the '{@link #getSyncStrategy() <em>Sync Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncStrategy()
	 * @generated
	 * @ordered
	 */
	protected SyncStrategyType1 syncStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableFrameStreamTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getVariableFrameStreamType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncStrategyType1 getSyncStrategy() {
		return syncStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyncStrategy(SyncStrategyType1 newSyncStrategy, NotificationChain msgs) {
		SyncStrategyType1 oldSyncStrategy = syncStrategy;
		syncStrategy = newSyncStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.VARIABLE_FRAME_STREAM_TYPE__SYNC_STRATEGY, oldSyncStrategy, newSyncStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncStrategy(SyncStrategyType1 newSyncStrategy) {
		if (newSyncStrategy != syncStrategy) {
			NotificationChain msgs = null;
			if (syncStrategy != null)
				msgs = ((InternalEObject)syncStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.VARIABLE_FRAME_STREAM_TYPE__SYNC_STRATEGY, null, msgs);
			if (newSyncStrategy != null)
				msgs = ((InternalEObject)newSyncStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.VARIABLE_FRAME_STREAM_TYPE__SYNC_STRATEGY, null, msgs);
			msgs = basicSetSyncStrategy(newSyncStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.VARIABLE_FRAME_STREAM_TYPE__SYNC_STRATEGY, newSyncStrategy, newSyncStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.VARIABLE_FRAME_STREAM_TYPE__SYNC_STRATEGY:
				return basicSetSyncStrategy(null, msgs);
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
			case XtcePackage.VARIABLE_FRAME_STREAM_TYPE__SYNC_STRATEGY:
				return getSyncStrategy();
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
			case XtcePackage.VARIABLE_FRAME_STREAM_TYPE__SYNC_STRATEGY:
				setSyncStrategy((SyncStrategyType1)newValue);
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
			case XtcePackage.VARIABLE_FRAME_STREAM_TYPE__SYNC_STRATEGY:
				setSyncStrategy((SyncStrategyType1)null);
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
			case XtcePackage.VARIABLE_FRAME_STREAM_TYPE__SYNC_STRATEGY:
				return syncStrategy != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableFrameStreamTypeImpl
