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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.ParameterInstanceRefType1;
import org.omg.space.xtce.ReferenceTimeType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Time Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ReferenceTimeTypeImpl#getOffsetFrom <em>Offset From</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ReferenceTimeTypeImpl#getEpoch <em>Epoch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceTimeTypeImpl extends EObjectImpl implements ReferenceTimeType {
	/**
	 * The cached value of the '{@link #getOffsetFrom() <em>Offset From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetFrom()
	 * @generated
	 * @ordered
	 */
	protected ParameterInstanceRefType1 offsetFrom;

	/**
	 * The default value of the '{@link #getEpoch() <em>Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpoch()
	 * @generated
	 * @ordered
	 */
	protected static final Object EPOCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEpoch() <em>Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpoch()
	 * @generated
	 * @ordered
	 */
	protected Object epoch = EPOCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceTimeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getReferenceTimeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterInstanceRefType1 getOffsetFrom() {
		return offsetFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffsetFrom(ParameterInstanceRefType1 newOffsetFrom, NotificationChain msgs) {
		ParameterInstanceRefType1 oldOffsetFrom = offsetFrom;
		offsetFrom = newOffsetFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.REFERENCE_TIME_TYPE__OFFSET_FROM, oldOffsetFrom, newOffsetFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetFrom(ParameterInstanceRefType1 newOffsetFrom) {
		if (newOffsetFrom != offsetFrom) {
			NotificationChain msgs = null;
			if (offsetFrom != null)
				msgs = ((InternalEObject)offsetFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.REFERENCE_TIME_TYPE__OFFSET_FROM, null, msgs);
			if (newOffsetFrom != null)
				msgs = ((InternalEObject)newOffsetFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.REFERENCE_TIME_TYPE__OFFSET_FROM, null, msgs);
			msgs = basicSetOffsetFrom(newOffsetFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.REFERENCE_TIME_TYPE__OFFSET_FROM, newOffsetFrom, newOffsetFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEpoch() {
		return epoch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpoch(Object newEpoch) {
		Object oldEpoch = epoch;
		epoch = newEpoch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.REFERENCE_TIME_TYPE__EPOCH, oldEpoch, epoch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.REFERENCE_TIME_TYPE__OFFSET_FROM:
				return basicSetOffsetFrom(null, msgs);
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
			case XtcePackage.REFERENCE_TIME_TYPE__OFFSET_FROM:
				return getOffsetFrom();
			case XtcePackage.REFERENCE_TIME_TYPE__EPOCH:
				return getEpoch();
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
			case XtcePackage.REFERENCE_TIME_TYPE__OFFSET_FROM:
				setOffsetFrom((ParameterInstanceRefType1)newValue);
				return;
			case XtcePackage.REFERENCE_TIME_TYPE__EPOCH:
				setEpoch(newValue);
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
			case XtcePackage.REFERENCE_TIME_TYPE__OFFSET_FROM:
				setOffsetFrom((ParameterInstanceRefType1)null);
				return;
			case XtcePackage.REFERENCE_TIME_TYPE__EPOCH:
				setEpoch(EPOCH_EDEFAULT);
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
			case XtcePackage.REFERENCE_TIME_TYPE__OFFSET_FROM:
				return offsetFrom != null;
			case XtcePackage.REFERENCE_TIME_TYPE__EPOCH:
				return EPOCH_EDEFAULT == null ? epoch != null : !EPOCH_EDEFAULT.equals(epoch);
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
		result.append(" (epoch: ");
		result.append(epoch);
		result.append(')');
		return result.toString();
	}

} //ReferenceTimeTypeImpl
