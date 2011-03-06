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

import org.omg.space.xtce.FixedFrameStreamType;
import org.omg.space.xtce.SyncStrategyType2;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Frame Stream Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.FixedFrameStreamTypeImpl#getSyncStrategy <em>Sync Strategy</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.FixedFrameStreamTypeImpl#getFrameLengthInBits <em>Frame Length In Bits</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.FixedFrameStreamTypeImpl#getSyncApertureInBits <em>Sync Aperture In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixedFrameStreamTypeImpl extends FrameStreamTypeImpl implements FixedFrameStreamType {
	/**
	 * The cached value of the '{@link #getSyncStrategy() <em>Sync Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncStrategy()
	 * @generated
	 * @ordered
	 */
	protected SyncStrategyType2 syncStrategy;

	/**
	 * The default value of the '{@link #getFrameLengthInBits() <em>Frame Length In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameLengthInBits()
	 * @generated
	 * @ordered
	 */
	protected static final long FRAME_LENGTH_IN_BITS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getFrameLengthInBits() <em>Frame Length In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameLengthInBits()
	 * @generated
	 * @ordered
	 */
	protected long frameLengthInBits = FRAME_LENGTH_IN_BITS_EDEFAULT;

	/**
	 * This is true if the Frame Length In Bits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frameLengthInBitsESet;

	/**
	 * The default value of the '{@link #getSyncApertureInBits() <em>Sync Aperture In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncApertureInBits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SYNC_APERTURE_IN_BITS_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getSyncApertureInBits() <em>Sync Aperture In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncApertureInBits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger syncApertureInBits = SYNC_APERTURE_IN_BITS_EDEFAULT;

	/**
	 * This is true if the Sync Aperture In Bits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean syncApertureInBitsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedFrameStreamTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getFixedFrameStreamType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncStrategyType2 getSyncStrategy() {
		return syncStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyncStrategy(SyncStrategyType2 newSyncStrategy, NotificationChain msgs) {
		SyncStrategyType2 oldSyncStrategy = syncStrategy;
		syncStrategy = newSyncStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.FIXED_FRAME_STREAM_TYPE__SYNC_STRATEGY, oldSyncStrategy, newSyncStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncStrategy(SyncStrategyType2 newSyncStrategy) {
		if (newSyncStrategy != syncStrategy) {
			NotificationChain msgs = null;
			if (syncStrategy != null)
				msgs = ((InternalEObject)syncStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FIXED_FRAME_STREAM_TYPE__SYNC_STRATEGY, null, msgs);
			if (newSyncStrategy != null)
				msgs = ((InternalEObject)newSyncStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FIXED_FRAME_STREAM_TYPE__SYNC_STRATEGY, null, msgs);
			msgs = basicSetSyncStrategy(newSyncStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FIXED_FRAME_STREAM_TYPE__SYNC_STRATEGY, newSyncStrategy, newSyncStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getFrameLengthInBits() {
		return frameLengthInBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameLengthInBits(long newFrameLengthInBits) {
		long oldFrameLengthInBits = frameLengthInBits;
		frameLengthInBits = newFrameLengthInBits;
		boolean oldFrameLengthInBitsESet = frameLengthInBitsESet;
		frameLengthInBitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FIXED_FRAME_STREAM_TYPE__FRAME_LENGTH_IN_BITS, oldFrameLengthInBits, frameLengthInBits, !oldFrameLengthInBitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrameLengthInBits() {
		long oldFrameLengthInBits = frameLengthInBits;
		boolean oldFrameLengthInBitsESet = frameLengthInBitsESet;
		frameLengthInBits = FRAME_LENGTH_IN_BITS_EDEFAULT;
		frameLengthInBitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.FIXED_FRAME_STREAM_TYPE__FRAME_LENGTH_IN_BITS, oldFrameLengthInBits, FRAME_LENGTH_IN_BITS_EDEFAULT, oldFrameLengthInBitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrameLengthInBits() {
		return frameLengthInBitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSyncApertureInBits() {
		return syncApertureInBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncApertureInBits(BigInteger newSyncApertureInBits) {
		BigInteger oldSyncApertureInBits = syncApertureInBits;
		syncApertureInBits = newSyncApertureInBits;
		boolean oldSyncApertureInBitsESet = syncApertureInBitsESet;
		syncApertureInBitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FIXED_FRAME_STREAM_TYPE__SYNC_APERTURE_IN_BITS, oldSyncApertureInBits, syncApertureInBits, !oldSyncApertureInBitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSyncApertureInBits() {
		BigInteger oldSyncApertureInBits = syncApertureInBits;
		boolean oldSyncApertureInBitsESet = syncApertureInBitsESet;
		syncApertureInBits = SYNC_APERTURE_IN_BITS_EDEFAULT;
		syncApertureInBitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.FIXED_FRAME_STREAM_TYPE__SYNC_APERTURE_IN_BITS, oldSyncApertureInBits, SYNC_APERTURE_IN_BITS_EDEFAULT, oldSyncApertureInBitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSyncApertureInBits() {
		return syncApertureInBitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.FIXED_FRAME_STREAM_TYPE__SYNC_STRATEGY:
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
			case XtcePackage.FIXED_FRAME_STREAM_TYPE__SYNC_STRATEGY:
				return getSyncStrategy();
			case XtcePackage.FIXED_FRAME_STREAM_TYPE__FRAME_LENGTH_IN_BITS:
				return getFrameLengthInBits();
			case XtcePackage.FIXED_FRAME_STREAM_TYPE__SYNC_APERTURE_IN_BITS:
				return getSyncApertureInBits();
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
			case XtcePackage.FIXED_FRAME_STREAM_TYPE__SYNC_STRATEGY:
				setSyncStrategy((SyncStrategyType2)newValue);
				return;
			case XtcePackage.FIXED_FRAME_STREAM_TYPE__FRAME_LENGTH_IN_BITS:
				setFrameLengthInBits((Long)newValue);
				return;
			case XtcePackage.FIXED_FRAME_STREAM_TYPE__SYNC_APERTURE_IN_BITS:
				setSyncApertureInBits((BigInteger)newValue);
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
			case XtcePackage.FIXED_FRAME_STREAM_TYPE__SYNC_STRATEGY:
				setSyncStrategy((SyncStrategyType2)null);
				return;
			case XtcePackage.FIXED_FRAME_STREAM_TYPE__FRAME_LENGTH_IN_BITS:
				unsetFrameLengthInBits();
				return;
			case XtcePackage.FIXED_FRAME_STREAM_TYPE__SYNC_APERTURE_IN_BITS:
				unsetSyncApertureInBits();
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
			case XtcePackage.FIXED_FRAME_STREAM_TYPE__SYNC_STRATEGY:
				return syncStrategy != null;
			case XtcePackage.FIXED_FRAME_STREAM_TYPE__FRAME_LENGTH_IN_BITS:
				return isSetFrameLengthInBits();
			case XtcePackage.FIXED_FRAME_STREAM_TYPE__SYNC_APERTURE_IN_BITS:
				return isSetSyncApertureInBits();
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
		result.append(" (frameLengthInBits: ");
		if (frameLengthInBitsESet) result.append(frameLengthInBits); else result.append("<unset>");
		result.append(", syncApertureInBits: ");
		if (syncApertureInBitsESet) result.append(syncApertureInBits); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FixedFrameStreamTypeImpl
