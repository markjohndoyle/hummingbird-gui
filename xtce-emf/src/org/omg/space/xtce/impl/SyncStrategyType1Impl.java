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

import org.omg.space.xtce.FlagType;
import org.omg.space.xtce.SyncStrategyType1;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sync Strategy Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.SyncStrategyType1Impl#getFlag <em>Flag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SyncStrategyType1Impl extends SyncStrategyTypeImpl implements SyncStrategyType1 {
	/**
	 * The cached value of the '{@link #getFlag() <em>Flag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlag()
	 * @generated
	 * @ordered
	 */
	protected FlagType flag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyncStrategyType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getSyncStrategyType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagType getFlag() {
		return flag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlag(FlagType newFlag, NotificationChain msgs) {
		FlagType oldFlag = flag;
		flag = newFlag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SYNC_STRATEGY_TYPE1__FLAG, oldFlag, newFlag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlag(FlagType newFlag) {
		if (newFlag != flag) {
			NotificationChain msgs = null;
			if (flag != null)
				msgs = ((InternalEObject)flag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SYNC_STRATEGY_TYPE1__FLAG, null, msgs);
			if (newFlag != null)
				msgs = ((InternalEObject)newFlag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SYNC_STRATEGY_TYPE1__FLAG, null, msgs);
			msgs = basicSetFlag(newFlag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SYNC_STRATEGY_TYPE1__FLAG, newFlag, newFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.SYNC_STRATEGY_TYPE1__FLAG:
				return basicSetFlag(null, msgs);
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
			case XtcePackage.SYNC_STRATEGY_TYPE1__FLAG:
				return getFlag();
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
			case XtcePackage.SYNC_STRATEGY_TYPE1__FLAG:
				setFlag((FlagType)newValue);
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
			case XtcePackage.SYNC_STRATEGY_TYPE1__FLAG:
				setFlag((FlagType)null);
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
			case XtcePackage.SYNC_STRATEGY_TYPE1__FLAG:
				return flag != null;
		}
		return super.eIsSet(featureID);
	}

} //SyncStrategyType1Impl
