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

import org.omg.space.xtce.InputOutputTriggerAlgorithmType;
import org.omg.space.xtce.TriggerType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Output Trigger Algorithm Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.InputOutputTriggerAlgorithmTypeImpl#getTriggerSet <em>Trigger Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.InputOutputTriggerAlgorithmTypeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.InputOutputTriggerAlgorithmTypeImpl#getTriggerContainer <em>Trigger Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputOutputTriggerAlgorithmTypeImpl extends InputOutputAlgorithmTypeImpl implements InputOutputTriggerAlgorithmType {
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
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTriggerContainer() <em>Trigger Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerContainer()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_CONTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTriggerContainer() <em>Trigger Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerContainer()
	 * @generated
	 * @ordered
	 */
	protected String triggerContainer = TRIGGER_CONTAINER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputOutputTriggerAlgorithmTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getInputOutputTriggerAlgorithmType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__TRIGGER_SET, oldTriggerSet, newTriggerSet);
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
				msgs = ((InternalEObject)triggerSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__TRIGGER_SET, null, msgs);
			if (newTriggerSet != null)
				msgs = ((InternalEObject)newTriggerSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__TRIGGER_SET, null, msgs);
			msgs = basicSetTriggerSet(newTriggerSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__TRIGGER_SET, newTriggerSet, newTriggerSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(BigInteger newPriority) {
		BigInteger oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTriggerContainer() {
		return triggerContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerContainer(String newTriggerContainer) {
		String oldTriggerContainer = triggerContainer;
		triggerContainer = newTriggerContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__TRIGGER_CONTAINER, oldTriggerContainer, triggerContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__TRIGGER_SET:
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
			case XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__TRIGGER_SET:
				return getTriggerSet();
			case XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__PRIORITY:
				return getPriority();
			case XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__TRIGGER_CONTAINER:
				return getTriggerContainer();
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
			case XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__TRIGGER_SET:
				setTriggerSet((TriggerType)newValue);
				return;
			case XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__PRIORITY:
				setPriority((BigInteger)newValue);
				return;
			case XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__TRIGGER_CONTAINER:
				setTriggerContainer((String)newValue);
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
			case XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__TRIGGER_SET:
				setTriggerSet((TriggerType)null);
				return;
			case XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__TRIGGER_CONTAINER:
				setTriggerContainer(TRIGGER_CONTAINER_EDEFAULT);
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
			case XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__TRIGGER_SET:
				return triggerSet != null;
			case XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__TRIGGER_CONTAINER:
				return TRIGGER_CONTAINER_EDEFAULT == null ? triggerContainer != null : !TRIGGER_CONTAINER_EDEFAULT.equals(triggerContainer);
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(", triggerContainer: ");
		result.append(triggerContainer);
		result.append(')');
		return result.toString();
	}

} //InputOutputTriggerAlgorithmTypeImpl
