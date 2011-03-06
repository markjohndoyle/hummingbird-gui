/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.AutoInvertType;
import org.omg.space.xtce.SyncStrategyType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sync Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.SyncStrategyTypeImpl#getAutoInvert <em>Auto Invert</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SyncStrategyTypeImpl#getCheckToLockGoodFrames <em>Check To Lock Good Frames</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SyncStrategyTypeImpl#getMaxBitErrorsInSyncPattern <em>Max Bit Errors In Sync Pattern</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SyncStrategyTypeImpl#getVerifyToLockGoodFrames <em>Verify To Lock Good Frames</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SyncStrategyTypeImpl extends EObjectImpl implements SyncStrategyType {
	/**
	 * The cached value of the '{@link #getAutoInvert() <em>Auto Invert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoInvert()
	 * @generated
	 * @ordered
	 */
	protected AutoInvertType autoInvert;

	/**
	 * The default value of the '{@link #getCheckToLockGoodFrames() <em>Check To Lock Good Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckToLockGoodFrames()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CHECK_TO_LOCK_GOOD_FRAMES_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getCheckToLockGoodFrames() <em>Check To Lock Good Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckToLockGoodFrames()
	 * @generated
	 * @ordered
	 */
	protected BigInteger checkToLockGoodFrames = CHECK_TO_LOCK_GOOD_FRAMES_EDEFAULT;

	/**
	 * This is true if the Check To Lock Good Frames attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean checkToLockGoodFramesESet;

	/**
	 * The default value of the '{@link #getMaxBitErrorsInSyncPattern() <em>Max Bit Errors In Sync Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBitErrorsInSyncPattern()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_BIT_ERRORS_IN_SYNC_PATTERN_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getMaxBitErrorsInSyncPattern() <em>Max Bit Errors In Sync Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBitErrorsInSyncPattern()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxBitErrorsInSyncPattern = MAX_BIT_ERRORS_IN_SYNC_PATTERN_EDEFAULT;

	/**
	 * This is true if the Max Bit Errors In Sync Pattern attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxBitErrorsInSyncPatternESet;

	/**
	 * The default value of the '{@link #getVerifyToLockGoodFrames() <em>Verify To Lock Good Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyToLockGoodFrames()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VERIFY_TO_LOCK_GOOD_FRAMES_EDEFAULT = new BigInteger("4");

	/**
	 * The cached value of the '{@link #getVerifyToLockGoodFrames() <em>Verify To Lock Good Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyToLockGoodFrames()
	 * @generated
	 * @ordered
	 */
	protected BigInteger verifyToLockGoodFrames = VERIFY_TO_LOCK_GOOD_FRAMES_EDEFAULT;

	/**
	 * This is true if the Verify To Lock Good Frames attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verifyToLockGoodFramesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyncStrategyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getSyncStrategyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoInvertType getAutoInvert() {
		return autoInvert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutoInvert(AutoInvertType newAutoInvert, NotificationChain msgs) {
		AutoInvertType oldAutoInvert = autoInvert;
		autoInvert = newAutoInvert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SYNC_STRATEGY_TYPE__AUTO_INVERT, oldAutoInvert, newAutoInvert);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoInvert(AutoInvertType newAutoInvert) {
		if (newAutoInvert != autoInvert) {
			NotificationChain msgs = null;
			if (autoInvert != null)
				msgs = ((InternalEObject)autoInvert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SYNC_STRATEGY_TYPE__AUTO_INVERT, null, msgs);
			if (newAutoInvert != null)
				msgs = ((InternalEObject)newAutoInvert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SYNC_STRATEGY_TYPE__AUTO_INVERT, null, msgs);
			msgs = basicSetAutoInvert(newAutoInvert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SYNC_STRATEGY_TYPE__AUTO_INVERT, newAutoInvert, newAutoInvert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCheckToLockGoodFrames() {
		return checkToLockGoodFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckToLockGoodFrames(BigInteger newCheckToLockGoodFrames) {
		BigInteger oldCheckToLockGoodFrames = checkToLockGoodFrames;
		checkToLockGoodFrames = newCheckToLockGoodFrames;
		boolean oldCheckToLockGoodFramesESet = checkToLockGoodFramesESet;
		checkToLockGoodFramesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SYNC_STRATEGY_TYPE__CHECK_TO_LOCK_GOOD_FRAMES, oldCheckToLockGoodFrames, checkToLockGoodFrames, !oldCheckToLockGoodFramesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCheckToLockGoodFrames() {
		BigInteger oldCheckToLockGoodFrames = checkToLockGoodFrames;
		boolean oldCheckToLockGoodFramesESet = checkToLockGoodFramesESet;
		checkToLockGoodFrames = CHECK_TO_LOCK_GOOD_FRAMES_EDEFAULT;
		checkToLockGoodFramesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.SYNC_STRATEGY_TYPE__CHECK_TO_LOCK_GOOD_FRAMES, oldCheckToLockGoodFrames, CHECK_TO_LOCK_GOOD_FRAMES_EDEFAULT, oldCheckToLockGoodFramesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCheckToLockGoodFrames() {
		return checkToLockGoodFramesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxBitErrorsInSyncPattern() {
		return maxBitErrorsInSyncPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBitErrorsInSyncPattern(BigInteger newMaxBitErrorsInSyncPattern) {
		BigInteger oldMaxBitErrorsInSyncPattern = maxBitErrorsInSyncPattern;
		maxBitErrorsInSyncPattern = newMaxBitErrorsInSyncPattern;
		boolean oldMaxBitErrorsInSyncPatternESet = maxBitErrorsInSyncPatternESet;
		maxBitErrorsInSyncPatternESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SYNC_STRATEGY_TYPE__MAX_BIT_ERRORS_IN_SYNC_PATTERN, oldMaxBitErrorsInSyncPattern, maxBitErrorsInSyncPattern, !oldMaxBitErrorsInSyncPatternESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxBitErrorsInSyncPattern() {
		BigInteger oldMaxBitErrorsInSyncPattern = maxBitErrorsInSyncPattern;
		boolean oldMaxBitErrorsInSyncPatternESet = maxBitErrorsInSyncPatternESet;
		maxBitErrorsInSyncPattern = MAX_BIT_ERRORS_IN_SYNC_PATTERN_EDEFAULT;
		maxBitErrorsInSyncPatternESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.SYNC_STRATEGY_TYPE__MAX_BIT_ERRORS_IN_SYNC_PATTERN, oldMaxBitErrorsInSyncPattern, MAX_BIT_ERRORS_IN_SYNC_PATTERN_EDEFAULT, oldMaxBitErrorsInSyncPatternESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxBitErrorsInSyncPattern() {
		return maxBitErrorsInSyncPatternESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getVerifyToLockGoodFrames() {
		return verifyToLockGoodFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerifyToLockGoodFrames(BigInteger newVerifyToLockGoodFrames) {
		BigInteger oldVerifyToLockGoodFrames = verifyToLockGoodFrames;
		verifyToLockGoodFrames = newVerifyToLockGoodFrames;
		boolean oldVerifyToLockGoodFramesESet = verifyToLockGoodFramesESet;
		verifyToLockGoodFramesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SYNC_STRATEGY_TYPE__VERIFY_TO_LOCK_GOOD_FRAMES, oldVerifyToLockGoodFrames, verifyToLockGoodFrames, !oldVerifyToLockGoodFramesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVerifyToLockGoodFrames() {
		BigInteger oldVerifyToLockGoodFrames = verifyToLockGoodFrames;
		boolean oldVerifyToLockGoodFramesESet = verifyToLockGoodFramesESet;
		verifyToLockGoodFrames = VERIFY_TO_LOCK_GOOD_FRAMES_EDEFAULT;
		verifyToLockGoodFramesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.SYNC_STRATEGY_TYPE__VERIFY_TO_LOCK_GOOD_FRAMES, oldVerifyToLockGoodFrames, VERIFY_TO_LOCK_GOOD_FRAMES_EDEFAULT, oldVerifyToLockGoodFramesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVerifyToLockGoodFrames() {
		return verifyToLockGoodFramesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.SYNC_STRATEGY_TYPE__AUTO_INVERT:
				return basicSetAutoInvert(null, msgs);
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
			case XtcePackage.SYNC_STRATEGY_TYPE__AUTO_INVERT:
				return getAutoInvert();
			case XtcePackage.SYNC_STRATEGY_TYPE__CHECK_TO_LOCK_GOOD_FRAMES:
				return getCheckToLockGoodFrames();
			case XtcePackage.SYNC_STRATEGY_TYPE__MAX_BIT_ERRORS_IN_SYNC_PATTERN:
				return getMaxBitErrorsInSyncPattern();
			case XtcePackage.SYNC_STRATEGY_TYPE__VERIFY_TO_LOCK_GOOD_FRAMES:
				return getVerifyToLockGoodFrames();
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
			case XtcePackage.SYNC_STRATEGY_TYPE__AUTO_INVERT:
				setAutoInvert((AutoInvertType)newValue);
				return;
			case XtcePackage.SYNC_STRATEGY_TYPE__CHECK_TO_LOCK_GOOD_FRAMES:
				setCheckToLockGoodFrames((BigInteger)newValue);
				return;
			case XtcePackage.SYNC_STRATEGY_TYPE__MAX_BIT_ERRORS_IN_SYNC_PATTERN:
				setMaxBitErrorsInSyncPattern((BigInteger)newValue);
				return;
			case XtcePackage.SYNC_STRATEGY_TYPE__VERIFY_TO_LOCK_GOOD_FRAMES:
				setVerifyToLockGoodFrames((BigInteger)newValue);
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
			case XtcePackage.SYNC_STRATEGY_TYPE__AUTO_INVERT:
				setAutoInvert((AutoInvertType)null);
				return;
			case XtcePackage.SYNC_STRATEGY_TYPE__CHECK_TO_LOCK_GOOD_FRAMES:
				unsetCheckToLockGoodFrames();
				return;
			case XtcePackage.SYNC_STRATEGY_TYPE__MAX_BIT_ERRORS_IN_SYNC_PATTERN:
				unsetMaxBitErrorsInSyncPattern();
				return;
			case XtcePackage.SYNC_STRATEGY_TYPE__VERIFY_TO_LOCK_GOOD_FRAMES:
				unsetVerifyToLockGoodFrames();
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
			case XtcePackage.SYNC_STRATEGY_TYPE__AUTO_INVERT:
				return autoInvert != null;
			case XtcePackage.SYNC_STRATEGY_TYPE__CHECK_TO_LOCK_GOOD_FRAMES:
				return isSetCheckToLockGoodFrames();
			case XtcePackage.SYNC_STRATEGY_TYPE__MAX_BIT_ERRORS_IN_SYNC_PATTERN:
				return isSetMaxBitErrorsInSyncPattern();
			case XtcePackage.SYNC_STRATEGY_TYPE__VERIFY_TO_LOCK_GOOD_FRAMES:
				return isSetVerifyToLockGoodFrames();
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
		result.append(" (checkToLockGoodFrames: ");
		if (checkToLockGoodFramesESet) result.append(checkToLockGoodFrames); else result.append("<unset>");
		result.append(", maxBitErrorsInSyncPattern: ");
		if (maxBitErrorsInSyncPatternESet) result.append(maxBitErrorsInSyncPattern); else result.append("<unset>");
		result.append(", verifyToLockGoodFrames: ");
		if (verifyToLockGoodFramesESet) result.append(verifyToLockGoodFrames); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SyncStrategyTypeImpl
