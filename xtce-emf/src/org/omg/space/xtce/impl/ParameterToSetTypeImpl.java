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

import org.omg.space.xtce.MathOperationType;
import org.omg.space.xtce.ParameterRefType1;
import org.omg.space.xtce.ParameterToSetType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter To Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ParameterToSetTypeImpl#getParameterRef <em>Parameter Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterToSetTypeImpl#getDerivation <em>Derivation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterToSetTypeImpl extends EObjectImpl implements ParameterToSetType {
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
	 * The cached value of the '{@link #getDerivation() <em>Derivation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivation()
	 * @generated
	 * @ordered
	 */
	protected MathOperationType derivation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterToSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getParameterToSetType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_TO_SET_TYPE__PARAMETER_REF, oldParameterRef, newParameterRef);
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
				msgs = ((InternalEObject)parameterRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PARAMETER_TO_SET_TYPE__PARAMETER_REF, null, msgs);
			if (newParameterRef != null)
				msgs = ((InternalEObject)newParameterRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PARAMETER_TO_SET_TYPE__PARAMETER_REF, null, msgs);
			msgs = basicSetParameterRef(newParameterRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_TO_SET_TYPE__PARAMETER_REF, newParameterRef, newParameterRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathOperationType getDerivation() {
		return derivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivation(MathOperationType newDerivation, NotificationChain msgs) {
		MathOperationType oldDerivation = derivation;
		derivation = newDerivation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_TO_SET_TYPE__DERIVATION, oldDerivation, newDerivation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivation(MathOperationType newDerivation) {
		if (newDerivation != derivation) {
			NotificationChain msgs = null;
			if (derivation != null)
				msgs = ((InternalEObject)derivation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PARAMETER_TO_SET_TYPE__DERIVATION, null, msgs);
			if (newDerivation != null)
				msgs = ((InternalEObject)newDerivation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PARAMETER_TO_SET_TYPE__DERIVATION, null, msgs);
			msgs = basicSetDerivation(newDerivation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_TO_SET_TYPE__DERIVATION, newDerivation, newDerivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.PARAMETER_TO_SET_TYPE__PARAMETER_REF:
				return basicSetParameterRef(null, msgs);
			case XtcePackage.PARAMETER_TO_SET_TYPE__DERIVATION:
				return basicSetDerivation(null, msgs);
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
			case XtcePackage.PARAMETER_TO_SET_TYPE__PARAMETER_REF:
				return getParameterRef();
			case XtcePackage.PARAMETER_TO_SET_TYPE__DERIVATION:
				return getDerivation();
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
			case XtcePackage.PARAMETER_TO_SET_TYPE__PARAMETER_REF:
				setParameterRef((ParameterRefType1)newValue);
				return;
			case XtcePackage.PARAMETER_TO_SET_TYPE__DERIVATION:
				setDerivation((MathOperationType)newValue);
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
			case XtcePackage.PARAMETER_TO_SET_TYPE__PARAMETER_REF:
				setParameterRef((ParameterRefType1)null);
				return;
			case XtcePackage.PARAMETER_TO_SET_TYPE__DERIVATION:
				setDerivation((MathOperationType)null);
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
			case XtcePackage.PARAMETER_TO_SET_TYPE__PARAMETER_REF:
				return parameterRef != null;
			case XtcePackage.PARAMETER_TO_SET_TYPE__DERIVATION:
				return derivation != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterToSetTypeImpl
