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

import org.omg.space.xtce.DynamicValueType1;
import org.omg.space.xtce.LinearAdjustmentType1;
import org.omg.space.xtce.ParameterInstanceRefType1;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Value Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.DynamicValueType1Impl#getParameterInstanceRef <em>Parameter Instance Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.DynamicValueType1Impl#getLinearAdjustment <em>Linear Adjustment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicValueType1Impl extends EObjectImpl implements DynamicValueType1 {
	/**
	 * The cached value of the '{@link #getParameterInstanceRef() <em>Parameter Instance Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterInstanceRef()
	 * @generated
	 * @ordered
	 */
	protected ParameterInstanceRefType1 parameterInstanceRef;

	/**
	 * The cached value of the '{@link #getLinearAdjustment() <em>Linear Adjustment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearAdjustment()
	 * @generated
	 * @ordered
	 */
	protected LinearAdjustmentType1 linearAdjustment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicValueType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getDynamicValueType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterInstanceRefType1 getParameterInstanceRef() {
		return parameterInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterInstanceRef(ParameterInstanceRefType1 newParameterInstanceRef, NotificationChain msgs) {
		ParameterInstanceRefType1 oldParameterInstanceRef = parameterInstanceRef;
		parameterInstanceRef = newParameterInstanceRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.DYNAMIC_VALUE_TYPE1__PARAMETER_INSTANCE_REF, oldParameterInstanceRef, newParameterInstanceRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterInstanceRef(ParameterInstanceRefType1 newParameterInstanceRef) {
		if (newParameterInstanceRef != parameterInstanceRef) {
			NotificationChain msgs = null;
			if (parameterInstanceRef != null)
				msgs = ((InternalEObject)parameterInstanceRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DYNAMIC_VALUE_TYPE1__PARAMETER_INSTANCE_REF, null, msgs);
			if (newParameterInstanceRef != null)
				msgs = ((InternalEObject)newParameterInstanceRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DYNAMIC_VALUE_TYPE1__PARAMETER_INSTANCE_REF, null, msgs);
			msgs = basicSetParameterInstanceRef(newParameterInstanceRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.DYNAMIC_VALUE_TYPE1__PARAMETER_INSTANCE_REF, newParameterInstanceRef, newParameterInstanceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearAdjustmentType1 getLinearAdjustment() {
		return linearAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearAdjustment(LinearAdjustmentType1 newLinearAdjustment, NotificationChain msgs) {
		LinearAdjustmentType1 oldLinearAdjustment = linearAdjustment;
		linearAdjustment = newLinearAdjustment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.DYNAMIC_VALUE_TYPE1__LINEAR_ADJUSTMENT, oldLinearAdjustment, newLinearAdjustment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearAdjustment(LinearAdjustmentType1 newLinearAdjustment) {
		if (newLinearAdjustment != linearAdjustment) {
			NotificationChain msgs = null;
			if (linearAdjustment != null)
				msgs = ((InternalEObject)linearAdjustment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DYNAMIC_VALUE_TYPE1__LINEAR_ADJUSTMENT, null, msgs);
			if (newLinearAdjustment != null)
				msgs = ((InternalEObject)newLinearAdjustment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DYNAMIC_VALUE_TYPE1__LINEAR_ADJUSTMENT, null, msgs);
			msgs = basicSetLinearAdjustment(newLinearAdjustment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.DYNAMIC_VALUE_TYPE1__LINEAR_ADJUSTMENT, newLinearAdjustment, newLinearAdjustment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.DYNAMIC_VALUE_TYPE1__PARAMETER_INSTANCE_REF:
				return basicSetParameterInstanceRef(null, msgs);
			case XtcePackage.DYNAMIC_VALUE_TYPE1__LINEAR_ADJUSTMENT:
				return basicSetLinearAdjustment(null, msgs);
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
			case XtcePackage.DYNAMIC_VALUE_TYPE1__PARAMETER_INSTANCE_REF:
				return getParameterInstanceRef();
			case XtcePackage.DYNAMIC_VALUE_TYPE1__LINEAR_ADJUSTMENT:
				return getLinearAdjustment();
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
			case XtcePackage.DYNAMIC_VALUE_TYPE1__PARAMETER_INSTANCE_REF:
				setParameterInstanceRef((ParameterInstanceRefType1)newValue);
				return;
			case XtcePackage.DYNAMIC_VALUE_TYPE1__LINEAR_ADJUSTMENT:
				setLinearAdjustment((LinearAdjustmentType1)newValue);
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
			case XtcePackage.DYNAMIC_VALUE_TYPE1__PARAMETER_INSTANCE_REF:
				setParameterInstanceRef((ParameterInstanceRefType1)null);
				return;
			case XtcePackage.DYNAMIC_VALUE_TYPE1__LINEAR_ADJUSTMENT:
				setLinearAdjustment((LinearAdjustmentType1)null);
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
			case XtcePackage.DYNAMIC_VALUE_TYPE1__PARAMETER_INSTANCE_REF:
				return parameterInstanceRef != null;
			case XtcePackage.DYNAMIC_VALUE_TYPE1__LINEAR_ADJUSTMENT:
				return linearAdjustment != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicValueType1Impl
