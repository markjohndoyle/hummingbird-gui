/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.space.xtce.ParameterToSetType1;
import org.omg.space.xtce.VerifierToTriggerOnType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter To Set Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ParameterToSetType1Impl#getVerifierToTriggerOn <em>Verifier To Trigger On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterToSetType1Impl extends ParameterToSetTypeImpl implements ParameterToSetType1 {
	/**
	 * The default value of the '{@link #getVerifierToTriggerOn() <em>Verifier To Trigger On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifierToTriggerOn()
	 * @generated
	 * @ordered
	 */
	protected static final VerifierToTriggerOnType VERIFIER_TO_TRIGGER_ON_EDEFAULT = VerifierToTriggerOnType.RELEASE;

	/**
	 * The cached value of the '{@link #getVerifierToTriggerOn() <em>Verifier To Trigger On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifierToTriggerOn()
	 * @generated
	 * @ordered
	 */
	protected VerifierToTriggerOnType verifierToTriggerOn = VERIFIER_TO_TRIGGER_ON_EDEFAULT;

	/**
	 * This is true if the Verifier To Trigger On attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verifierToTriggerOnESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterToSetType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getParameterToSetType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifierToTriggerOnType getVerifierToTriggerOn() {
		return verifierToTriggerOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerifierToTriggerOn(VerifierToTriggerOnType newVerifierToTriggerOn) {
		VerifierToTriggerOnType oldVerifierToTriggerOn = verifierToTriggerOn;
		verifierToTriggerOn = newVerifierToTriggerOn == null ? VERIFIER_TO_TRIGGER_ON_EDEFAULT : newVerifierToTriggerOn;
		boolean oldVerifierToTriggerOnESet = verifierToTriggerOnESet;
		verifierToTriggerOnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_TO_SET_TYPE1__VERIFIER_TO_TRIGGER_ON, oldVerifierToTriggerOn, verifierToTriggerOn, !oldVerifierToTriggerOnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVerifierToTriggerOn() {
		VerifierToTriggerOnType oldVerifierToTriggerOn = verifierToTriggerOn;
		boolean oldVerifierToTriggerOnESet = verifierToTriggerOnESet;
		verifierToTriggerOn = VERIFIER_TO_TRIGGER_ON_EDEFAULT;
		verifierToTriggerOnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.PARAMETER_TO_SET_TYPE1__VERIFIER_TO_TRIGGER_ON, oldVerifierToTriggerOn, VERIFIER_TO_TRIGGER_ON_EDEFAULT, oldVerifierToTriggerOnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVerifierToTriggerOn() {
		return verifierToTriggerOnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.PARAMETER_TO_SET_TYPE1__VERIFIER_TO_TRIGGER_ON:
				return getVerifierToTriggerOn();
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
			case XtcePackage.PARAMETER_TO_SET_TYPE1__VERIFIER_TO_TRIGGER_ON:
				setVerifierToTriggerOn((VerifierToTriggerOnType)newValue);
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
			case XtcePackage.PARAMETER_TO_SET_TYPE1__VERIFIER_TO_TRIGGER_ON:
				unsetVerifierToTriggerOn();
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
			case XtcePackage.PARAMETER_TO_SET_TYPE1__VERIFIER_TO_TRIGGER_ON:
				return isSetVerifierToTriggerOn();
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
		result.append(" (verifierToTriggerOn: ");
		if (verifierToTriggerOnESet) result.append(verifierToTriggerOn); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ParameterToSetType1Impl
