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

import org.omg.space.xtce.InputAlgorithmType;
import org.omg.space.xtce.InputSetType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Algorithm Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.InputAlgorithmTypeImpl#getInputSet <em>Input Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputAlgorithmTypeImpl extends SimpleAlgorithmTypeImpl implements InputAlgorithmType {
	/**
	 * The cached value of the '{@link #getInputSet() <em>Input Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSet()
	 * @generated
	 * @ordered
	 */
	protected InputSetType inputSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputAlgorithmTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getInputAlgorithmType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSetType getInputSet() {
		return inputSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputSet(InputSetType newInputSet, NotificationChain msgs) {
		InputSetType oldInputSet = inputSet;
		inputSet = newInputSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.INPUT_ALGORITHM_TYPE__INPUT_SET, oldInputSet, newInputSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputSet(InputSetType newInputSet) {
		if (newInputSet != inputSet) {
			NotificationChain msgs = null;
			if (inputSet != null)
				msgs = ((InternalEObject)inputSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.INPUT_ALGORITHM_TYPE__INPUT_SET, null, msgs);
			if (newInputSet != null)
				msgs = ((InternalEObject)newInputSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.INPUT_ALGORITHM_TYPE__INPUT_SET, null, msgs);
			msgs = basicSetInputSet(newInputSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INPUT_ALGORITHM_TYPE__INPUT_SET, newInputSet, newInputSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.INPUT_ALGORITHM_TYPE__INPUT_SET:
				return basicSetInputSet(null, msgs);
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
			case XtcePackage.INPUT_ALGORITHM_TYPE__INPUT_SET:
				return getInputSet();
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
			case XtcePackage.INPUT_ALGORITHM_TYPE__INPUT_SET:
				setInputSet((InputSetType)newValue);
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
			case XtcePackage.INPUT_ALGORITHM_TYPE__INPUT_SET:
				setInputSet((InputSetType)null);
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
			case XtcePackage.INPUT_ALGORITHM_TYPE__INPUT_SET:
				return inputSet != null;
		}
		return super.eIsSet(featureID);
	}

} //InputAlgorithmTypeImpl
