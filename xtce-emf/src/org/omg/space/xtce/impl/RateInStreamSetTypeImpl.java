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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.space.xtce.RateInStreamSetType;
import org.omg.space.xtce.RateInStreamType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rate In Stream Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.RateInStreamSetTypeImpl#getRateInStream <em>Rate In Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RateInStreamSetTypeImpl extends EObjectImpl implements RateInStreamSetType {
	/**
	 * The cached value of the '{@link #getRateInStream() <em>Rate In Stream</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateInStream()
	 * @generated
	 * @ordered
	 */
	protected EList<RateInStreamType> rateInStream;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RateInStreamSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getRateInStreamSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RateInStreamType> getRateInStream() {
		if (rateInStream == null) {
			rateInStream = new EObjectContainmentEList<RateInStreamType>(RateInStreamType.class, this, XtcePackage.RATE_IN_STREAM_SET_TYPE__RATE_IN_STREAM);
		}
		return rateInStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.RATE_IN_STREAM_SET_TYPE__RATE_IN_STREAM:
				return ((InternalEList<?>)getRateInStream()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.RATE_IN_STREAM_SET_TYPE__RATE_IN_STREAM:
				return getRateInStream();
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
			case XtcePackage.RATE_IN_STREAM_SET_TYPE__RATE_IN_STREAM:
				getRateInStream().clear();
				getRateInStream().addAll((Collection<? extends RateInStreamType>)newValue);
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
			case XtcePackage.RATE_IN_STREAM_SET_TYPE__RATE_IN_STREAM:
				getRateInStream().clear();
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
			case XtcePackage.RATE_IN_STREAM_SET_TYPE__RATE_IN_STREAM:
				return rateInStream != null && !rateInStream.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RateInStreamSetTypeImpl
