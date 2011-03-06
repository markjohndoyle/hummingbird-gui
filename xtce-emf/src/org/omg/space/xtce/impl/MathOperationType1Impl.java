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

import org.omg.space.xtce.MathOperationType1;
import org.omg.space.xtce.TriggerType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Math Operation Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.MathOperationType1Impl#getTriggerSet <em>Trigger Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MathOperationType1Impl#getOutputParameterRef <em>Output Parameter Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MathOperationType1Impl extends MathOperationTypeImpl implements MathOperationType1 {
	/**
	 * The cached value of the '{@link #getTriggerSet() <em>Trigger Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerSet()
	 * @generated
	 * @ordered
	 */
	protected TriggerType triggerSet;

	/**
	 * The default value of the '{@link #getOutputParameterRef() <em>Output Parameter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParameterRef()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_PARAMETER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputParameterRef() <em>Output Parameter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParameterRef()
	 * @generated
	 * @ordered
	 */
	protected String outputParameterRef = OUTPUT_PARAMETER_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MathOperationType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getMathOperationType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerType getTriggerSet() {
		return triggerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggerSet(TriggerType newTriggerSet, NotificationChain msgs) {
		TriggerType oldTriggerSet = triggerSet;
		triggerSet = newTriggerSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.MATH_OPERATION_TYPE1__TRIGGER_SET, oldTriggerSet, newTriggerSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerSet(TriggerType newTriggerSet) {
		if (newTriggerSet != triggerSet) {
			NotificationChain msgs = null;
			if (triggerSet != null)
				msgs = ((InternalEObject)triggerSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.MATH_OPERATION_TYPE1__TRIGGER_SET, null, msgs);
			if (newTriggerSet != null)
				msgs = ((InternalEObject)newTriggerSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.MATH_OPERATION_TYPE1__TRIGGER_SET, null, msgs);
			msgs = basicSetTriggerSet(newTriggerSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.MATH_OPERATION_TYPE1__TRIGGER_SET, newTriggerSet, newTriggerSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputParameterRef() {
		return outputParameterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputParameterRef(String newOutputParameterRef) {
		String oldOutputParameterRef = outputParameterRef;
		outputParameterRef = newOutputParameterRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.MATH_OPERATION_TYPE1__OUTPUT_PARAMETER_REF, oldOutputParameterRef, outputParameterRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.MATH_OPERATION_TYPE1__TRIGGER_SET:
				return basicSetTriggerSet(null, msgs);
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
			case XtcePackage.MATH_OPERATION_TYPE1__TRIGGER_SET:
				return getTriggerSet();
			case XtcePackage.MATH_OPERATION_TYPE1__OUTPUT_PARAMETER_REF:
				return getOutputParameterRef();
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
			case XtcePackage.MATH_OPERATION_TYPE1__TRIGGER_SET:
				setTriggerSet((TriggerType)newValue);
				return;
			case XtcePackage.MATH_OPERATION_TYPE1__OUTPUT_PARAMETER_REF:
				setOutputParameterRef((String)newValue);
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
			case XtcePackage.MATH_OPERATION_TYPE1__TRIGGER_SET:
				setTriggerSet((TriggerType)null);
				return;
			case XtcePackage.MATH_OPERATION_TYPE1__OUTPUT_PARAMETER_REF:
				setOutputParameterRef(OUTPUT_PARAMETER_REF_EDEFAULT);
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
			case XtcePackage.MATH_OPERATION_TYPE1__TRIGGER_SET:
				return triggerSet != null;
			case XtcePackage.MATH_OPERATION_TYPE1__OUTPUT_PARAMETER_REF:
				return OUTPUT_PARAMETER_REF_EDEFAULT == null ? outputParameterRef != null : !OUTPUT_PARAMETER_REF_EDEFAULT.equals(outputParameterRef);
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
		result.append(" (outputParameterRef: ");
		result.append(outputParameterRef);
		result.append(')');
		return result.toString();
	}

} //MathOperationType1Impl
