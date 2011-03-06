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

import org.omg.space.xtce.ParameterRefType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ParameterRefTypeImpl#getTriggerName <em>Trigger Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterRefTypeImpl extends ParameterRefType1Impl implements ParameterRefType {
	/**
	 * The default value of the '{@link #getTriggerName() <em>Trigger Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTriggerName() <em>Trigger Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerName()
	 * @generated
	 * @ordered
	 */
	protected String triggerName = TRIGGER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getParameterRefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTriggerName() {
		return triggerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerName(String newTriggerName) {
		String oldTriggerName = triggerName;
		triggerName = newTriggerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_REF_TYPE__TRIGGER_NAME, oldTriggerName, triggerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.PARAMETER_REF_TYPE__TRIGGER_NAME:
				return getTriggerName();
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
			case XtcePackage.PARAMETER_REF_TYPE__TRIGGER_NAME:
				setTriggerName((String)newValue);
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
			case XtcePackage.PARAMETER_REF_TYPE__TRIGGER_NAME:
				setTriggerName(TRIGGER_NAME_EDEFAULT);
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
			case XtcePackage.PARAMETER_REF_TYPE__TRIGGER_NAME:
				return TRIGGER_NAME_EDEFAULT == null ? triggerName != null : !TRIGGER_NAME_EDEFAULT.equals(triggerName);
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
		result.append(" (triggerName: ");
		result.append(triggerName);
		result.append(')');
		return result.toString();
	}

} //ParameterRefTypeImpl
