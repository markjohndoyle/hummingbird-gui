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

import org.omg.space.xtce.ChangeType;
import org.omg.space.xtce.ParameterRefType1;
import org.omg.space.xtce.ParameterValueChangeType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Value Change Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ParameterValueChangeTypeImpl#getParameterRef <em>Parameter Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterValueChangeTypeImpl#getChange <em>Change</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterValueChangeTypeImpl extends EObjectImpl implements ParameterValueChangeType {
	/**
	 * The cached value of the '{@link #getParameterRef() <em>Parameter Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterRef()
	 * @generated
	 * @ordered
	 */
	protected ParameterRefType1 parameterRef;

	/**
	 * The cached value of the '{@link #getChange() <em>Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChange()
	 * @generated
	 * @ordered
	 */
	protected ChangeType change;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValueChangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getParameterValueChangeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterRefType1 getParameterRef() {
		return parameterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterRef(ParameterRefType1 newParameterRef, NotificationChain msgs) {
		ParameterRefType1 oldParameterRef = parameterRef;
		parameterRef = newParameterRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__PARAMETER_REF, oldParameterRef, newParameterRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterRef(ParameterRefType1 newParameterRef) {
		if (newParameterRef != parameterRef) {
			NotificationChain msgs = null;
			if (parameterRef != null)
				msgs = ((InternalEObject)parameterRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__PARAMETER_REF, null, msgs);
			if (newParameterRef != null)
				msgs = ((InternalEObject)newParameterRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__PARAMETER_REF, null, msgs);
			msgs = basicSetParameterRef(newParameterRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__PARAMETER_REF, newParameterRef, newParameterRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeType getChange() {
		return change;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChange(ChangeType newChange, NotificationChain msgs) {
		ChangeType oldChange = change;
		change = newChange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__CHANGE, oldChange, newChange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChange(ChangeType newChange) {
		if (newChange != change) {
			NotificationChain msgs = null;
			if (change != null)
				msgs = ((InternalEObject)change).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__CHANGE, null, msgs);
			if (newChange != null)
				msgs = ((InternalEObject)newChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__CHANGE, null, msgs);
			msgs = basicSetChange(newChange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__CHANGE, newChange, newChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__PARAMETER_REF:
				return basicSetParameterRef(null, msgs);
			case XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__CHANGE:
				return basicSetChange(null, msgs);
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
			case XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__PARAMETER_REF:
				return getParameterRef();
			case XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__CHANGE:
				return getChange();
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
			case XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__PARAMETER_REF:
				setParameterRef((ParameterRefType1)newValue);
				return;
			case XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__CHANGE:
				setChange((ChangeType)newValue);
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
			case XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__PARAMETER_REF:
				setParameterRef((ParameterRefType1)null);
				return;
			case XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__CHANGE:
				setChange((ChangeType)null);
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
			case XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__PARAMETER_REF:
				return parameterRef != null;
			case XtcePackage.PARAMETER_VALUE_CHANGE_TYPE__CHANGE:
				return change != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterValueChangeTypeImpl
