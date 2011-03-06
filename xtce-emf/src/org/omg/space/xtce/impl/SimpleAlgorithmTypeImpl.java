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

import org.omg.space.xtce.AlgorithmTextType;
import org.omg.space.xtce.ExternalAlgorithmSetType;
import org.omg.space.xtce.SimpleAlgorithmType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Algorithm Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.SimpleAlgorithmTypeImpl#getAlgorithmText <em>Algorithm Text</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SimpleAlgorithmTypeImpl#getExternalAlgorithmSet <em>External Algorithm Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleAlgorithmTypeImpl extends NameDescriptionTypeImpl implements SimpleAlgorithmType {
	/**
	 * The cached value of the '{@link #getAlgorithmText() <em>Algorithm Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmText()
	 * @generated
	 * @ordered
	 */
	protected AlgorithmTextType algorithmText;

	/**
	 * The cached value of the '{@link #getExternalAlgorithmSet() <em>External Algorithm Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalAlgorithmSet()
	 * @generated
	 * @ordered
	 */
	protected ExternalAlgorithmSetType externalAlgorithmSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleAlgorithmTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getSimpleAlgorithmType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmTextType getAlgorithmText() {
		return algorithmText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgorithmText(AlgorithmTextType newAlgorithmText, NotificationChain msgs) {
		AlgorithmTextType oldAlgorithmText = algorithmText;
		algorithmText = newAlgorithmText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SIMPLE_ALGORITHM_TYPE__ALGORITHM_TEXT, oldAlgorithmText, newAlgorithmText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithmText(AlgorithmTextType newAlgorithmText) {
		if (newAlgorithmText != algorithmText) {
			NotificationChain msgs = null;
			if (algorithmText != null)
				msgs = ((InternalEObject)algorithmText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SIMPLE_ALGORITHM_TYPE__ALGORITHM_TEXT, null, msgs);
			if (newAlgorithmText != null)
				msgs = ((InternalEObject)newAlgorithmText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SIMPLE_ALGORITHM_TYPE__ALGORITHM_TEXT, null, msgs);
			msgs = basicSetAlgorithmText(newAlgorithmText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SIMPLE_ALGORITHM_TYPE__ALGORITHM_TEXT, newAlgorithmText, newAlgorithmText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalAlgorithmSetType getExternalAlgorithmSet() {
		return externalAlgorithmSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalAlgorithmSet(ExternalAlgorithmSetType newExternalAlgorithmSet, NotificationChain msgs) {
		ExternalAlgorithmSetType oldExternalAlgorithmSet = externalAlgorithmSet;
		externalAlgorithmSet = newExternalAlgorithmSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SIMPLE_ALGORITHM_TYPE__EXTERNAL_ALGORITHM_SET, oldExternalAlgorithmSet, newExternalAlgorithmSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalAlgorithmSet(ExternalAlgorithmSetType newExternalAlgorithmSet) {
		if (newExternalAlgorithmSet != externalAlgorithmSet) {
			NotificationChain msgs = null;
			if (externalAlgorithmSet != null)
				msgs = ((InternalEObject)externalAlgorithmSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SIMPLE_ALGORITHM_TYPE__EXTERNAL_ALGORITHM_SET, null, msgs);
			if (newExternalAlgorithmSet != null)
				msgs = ((InternalEObject)newExternalAlgorithmSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SIMPLE_ALGORITHM_TYPE__EXTERNAL_ALGORITHM_SET, null, msgs);
			msgs = basicSetExternalAlgorithmSet(newExternalAlgorithmSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SIMPLE_ALGORITHM_TYPE__EXTERNAL_ALGORITHM_SET, newExternalAlgorithmSet, newExternalAlgorithmSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.SIMPLE_ALGORITHM_TYPE__ALGORITHM_TEXT:
				return basicSetAlgorithmText(null, msgs);
			case XtcePackage.SIMPLE_ALGORITHM_TYPE__EXTERNAL_ALGORITHM_SET:
				return basicSetExternalAlgorithmSet(null, msgs);
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
			case XtcePackage.SIMPLE_ALGORITHM_TYPE__ALGORITHM_TEXT:
				return getAlgorithmText();
			case XtcePackage.SIMPLE_ALGORITHM_TYPE__EXTERNAL_ALGORITHM_SET:
				return getExternalAlgorithmSet();
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
			case XtcePackage.SIMPLE_ALGORITHM_TYPE__ALGORITHM_TEXT:
				setAlgorithmText((AlgorithmTextType)newValue);
				return;
			case XtcePackage.SIMPLE_ALGORITHM_TYPE__EXTERNAL_ALGORITHM_SET:
				setExternalAlgorithmSet((ExternalAlgorithmSetType)newValue);
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
			case XtcePackage.SIMPLE_ALGORITHM_TYPE__ALGORITHM_TEXT:
				setAlgorithmText((AlgorithmTextType)null);
				return;
			case XtcePackage.SIMPLE_ALGORITHM_TYPE__EXTERNAL_ALGORITHM_SET:
				setExternalAlgorithmSet((ExternalAlgorithmSetType)null);
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
			case XtcePackage.SIMPLE_ALGORITHM_TYPE__ALGORITHM_TEXT:
				return algorithmText != null;
			case XtcePackage.SIMPLE_ALGORITHM_TYPE__EXTERNAL_ALGORITHM_SET:
				return externalAlgorithmSet != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleAlgorithmTypeImpl
