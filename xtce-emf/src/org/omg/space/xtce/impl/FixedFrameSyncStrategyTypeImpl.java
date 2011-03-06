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

import org.omg.space.xtce.FixedFrameSyncStrategyType;
import org.omg.space.xtce.SyncPatternType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Frame Sync Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.FixedFrameSyncStrategyTypeImpl#getSyncPattern <em>Sync Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixedFrameSyncStrategyTypeImpl extends SyncStrategyTypeImpl implements FixedFrameSyncStrategyType {
	/**
	 * The cached value of the '{@link #getSyncPattern() <em>Sync Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncPattern()
	 * @generated
	 * @ordered
	 */
	protected SyncPatternType syncPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedFrameSyncStrategyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getFixedFrameSyncStrategyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncPatternType getSyncPattern() {
		return syncPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyncPattern(SyncPatternType newSyncPattern, NotificationChain msgs) {
		SyncPatternType oldSyncPattern = syncPattern;
		syncPattern = newSyncPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.FIXED_FRAME_SYNC_STRATEGY_TYPE__SYNC_PATTERN, oldSyncPattern, newSyncPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncPattern(SyncPatternType newSyncPattern) {
		if (newSyncPattern != syncPattern) {
			NotificationChain msgs = null;
			if (syncPattern != null)
				msgs = ((InternalEObject)syncPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FIXED_FRAME_SYNC_STRATEGY_TYPE__SYNC_PATTERN, null, msgs);
			if (newSyncPattern != null)
				msgs = ((InternalEObject)newSyncPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FIXED_FRAME_SYNC_STRATEGY_TYPE__SYNC_PATTERN, null, msgs);
			msgs = basicSetSyncPattern(newSyncPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FIXED_FRAME_SYNC_STRATEGY_TYPE__SYNC_PATTERN, newSyncPattern, newSyncPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.FIXED_FRAME_SYNC_STRATEGY_TYPE__SYNC_PATTERN:
				return basicSetSyncPattern(null, msgs);
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
			case XtcePackage.FIXED_FRAME_SYNC_STRATEGY_TYPE__SYNC_PATTERN:
				return getSyncPattern();
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
			case XtcePackage.FIXED_FRAME_SYNC_STRATEGY_TYPE__SYNC_PATTERN:
				setSyncPattern((SyncPatternType)newValue);
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
			case XtcePackage.FIXED_FRAME_SYNC_STRATEGY_TYPE__SYNC_PATTERN:
				setSyncPattern((SyncPatternType)null);
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
			case XtcePackage.FIXED_FRAME_SYNC_STRATEGY_TYPE__SYNC_PATTERN:
				return syncPattern != null;
		}
		return super.eIsSet(featureID);
	}

} //FixedFrameSyncStrategyTypeImpl
