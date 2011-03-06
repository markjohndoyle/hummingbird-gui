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

import org.omg.space.xtce.DynamicValueType;
import org.omg.space.xtce.LinearAdjustmentType;
import org.omg.space.xtce.ParameterInstanceRefType1;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.DynamicValueTypeImpl#getParameterInstanceRef <em>Parameter Instance Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.DynamicValueTypeImpl#getLinearAdjustment <em>Linear Adjustment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicValueTypeImpl extends EObjectImpl implements DynamicValueType {
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
	protected LinearAdjustmentType linearAdjustment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getDynamicValueType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.DYNAMIC_VALUE_TYPE__PARAMETER_INSTANCE_REF, oldParameterInstanceRef, newParameterInstanceRef);
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
				msgs = ((InternalEObject)parameterInstanceRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DYNAMIC_VALUE_TYPE__PARAMETER_INSTANCE_REF, null, msgs);
			if (newParameterInstanceRef != null)
				msgs = ((InternalEObject)newParameterInstanceRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DYNAMIC_VALUE_TYPE__PARAMETER_INSTANCE_REF, null, msgs);
			msgs = basicSetParameterInstanceRef(newParameterInstanceRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.DYNAMIC_VALUE_TYPE__PARAMETER_INSTANCE_REF, newParameterInstanceRef, newParameterInstanceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearAdjustmentType getLinearAdjustment() {
		return linearAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearAdjustment(LinearAdjustmentType newLinearAdjustment, NotificationChain msgs) {
		LinearAdjustmentType oldLinearAdjustment = linearAdjustment;
		linearAdjustment = newLinearAdjustment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.DYNAMIC_VALUE_TYPE__LINEAR_ADJUSTMENT, oldLinearAdjustment, newLinearAdjustment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearAdjustment(LinearAdjustmentType newLinearAdjustment) {
		if (newLinearAdjustment != linearAdjustment) {
			NotificationChain msgs = null;
			if (linearAdjustment != null)
				msgs = ((InternalEObject)linearAdjustment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DYNAMIC_VALUE_TYPE__LINEAR_ADJUSTMENT, null, msgs);
			if (newLinearAdjustment != null)
				msgs = ((InternalEObject)newLinearAdjustment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DYNAMIC_VALUE_TYPE__LINEAR_ADJUSTMENT, null, msgs);
			msgs = basicSetLinearAdjustment(newLinearAdjustment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.DYNAMIC_VALUE_TYPE__LINEAR_ADJUSTMENT, newLinearAdjustment, newLinearAdjustment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.DYNAMIC_VALUE_TYPE__PARAMETER_INSTANCE_REF:
				return basicSetParameterInstanceRef(null, msgs);
			case XtcePackage.DYNAMIC_VALUE_TYPE__LINEAR_ADJUSTMENT:
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
			case XtcePackage.DYNAMIC_VALUE_TYPE__PARAMETER_INSTANCE_REF:
				return getParameterInstanceRef();
			case XtcePackage.DYNAMIC_VALUE_TYPE__LINEAR_ADJUSTMENT:
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
			case XtcePackage.DYNAMIC_VALUE_TYPE__PARAMETER_INSTANCE_REF:
				setParameterInstanceRef((ParameterInstanceRefType1)newValue);
				return;
			case XtcePackage.DYNAMIC_VALUE_TYPE__LINEAR_ADJUSTMENT:
				setLinearAdjustment((LinearAdjustmentType)newValue);
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
			case XtcePackage.DYNAMIC_VALUE_TYPE__PARAMETER_INSTANCE_REF:
				setParameterInstanceRef((ParameterInstanceRefType1)null);
				return;
			case XtcePackage.DYNAMIC_VALUE_TYPE__LINEAR_ADJUSTMENT:
				setLinearAdjustment((LinearAdjustmentType)null);
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
			case XtcePackage.DYNAMIC_VALUE_TYPE__PARAMETER_INSTANCE_REF:
				return parameterInstanceRef != null;
			case XtcePackage.DYNAMIC_VALUE_TYPE__LINEAR_ADJUSTMENT:
				return linearAdjustment != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicValueTypeImpl
