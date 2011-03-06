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

import org.omg.space.xtce.SyncPatternType1;
import org.omg.space.xtce.SyncStrategyType2;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sync Strategy Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.SyncStrategyType2Impl#getSyncPattern <em>Sync Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SyncStrategyType2Impl extends SyncStrategyTypeImpl implements SyncStrategyType2 {
	/**
	 * The cached value of the '{@link #getSyncPattern() <em>Sync Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncPattern()
	 * @generated
	 * @ordered
	 */
	protected SyncPatternType1 syncPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyncStrategyType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getSyncStrategyType2();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncPatternType1 getSyncPattern() {
		return syncPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyncPattern(SyncPatternType1 newSyncPattern, NotificationChain msgs) {
		SyncPatternType1 oldSyncPattern = syncPattern;
		syncPattern = newSyncPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SYNC_STRATEGY_TYPE2__SYNC_PATTERN, oldSyncPattern, newSyncPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncPattern(SyncPatternType1 newSyncPattern) {
		if (newSyncPattern != syncPattern) {
			NotificationChain msgs = null;
			if (syncPattern != null)
				msgs = ((InternalEObject)syncPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SYNC_STRATEGY_TYPE2__SYNC_PATTERN, null, msgs);
			if (newSyncPattern != null)
				msgs = ((InternalEObject)newSyncPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SYNC_STRATEGY_TYPE2__SYNC_PATTERN, null, msgs);
			msgs = basicSetSyncPattern(newSyncPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SYNC_STRATEGY_TYPE2__SYNC_PATTERN, newSyncPattern, newSyncPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.SYNC_STRATEGY_TYPE2__SYNC_PATTERN:
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
			case XtcePackage.SYNC_STRATEGY_TYPE2__SYNC_PATTERN:
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
			case XtcePackage.SYNC_STRATEGY_TYPE2__SYNC_PATTERN:
				setSyncPattern((SyncPatternType1)newValue);
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
			case XtcePackage.SYNC_STRATEGY_TYPE2__SYNC_PATTERN:
				setSyncPattern((SyncPatternType1)null);
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
			case XtcePackage.SYNC_STRATEGY_TYPE2__SYNC_PATTERN:
				return syncPattern != null;
		}
		return super.eIsSet(featureID);
	}

} //SyncStrategyType2Impl
