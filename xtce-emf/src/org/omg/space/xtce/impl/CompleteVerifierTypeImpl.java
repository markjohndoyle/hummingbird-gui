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

import org.omg.space.xtce.CompleteVerifierType;
import org.omg.space.xtce.ParameterRefType1;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complete Verifier Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.CompleteVerifierTypeImpl#getReturnParmRef <em>Return Parm Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompleteVerifierTypeImpl extends CommandVerifierTypeImpl implements CompleteVerifierType {
	/**
	 * The cached value of the '{@link #getReturnParmRef() <em>Return Parm Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnParmRef()
	 * @generated
	 * @ordered
	 */
	protected ParameterRefType1 returnParmRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompleteVerifierTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getCompleteVerifierType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterRefType1 getReturnParmRef() {
		return returnParmRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnParmRef(ParameterRefType1 newReturnParmRef, NotificationChain msgs) {
		ParameterRefType1 oldReturnParmRef = returnParmRef;
		returnParmRef = newReturnParmRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMPLETE_VERIFIER_TYPE__RETURN_PARM_REF, oldReturnParmRef, newReturnParmRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnParmRef(ParameterRefType1 newReturnParmRef) {
		if (newReturnParmRef != returnParmRef) {
			NotificationChain msgs = null;
			if (returnParmRef != null)
				msgs = ((InternalEObject)returnParmRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMPLETE_VERIFIER_TYPE__RETURN_PARM_REF, null, msgs);
			if (newReturnParmRef != null)
				msgs = ((InternalEObject)newReturnParmRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMPLETE_VERIFIER_TYPE__RETURN_PARM_REF, null, msgs);
			msgs = basicSetReturnParmRef(newReturnParmRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMPLETE_VERIFIER_TYPE__RETURN_PARM_REF, newReturnParmRef, newReturnParmRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.COMPLETE_VERIFIER_TYPE__RETURN_PARM_REF:
				return basicSetReturnParmRef(null, msgs);
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
			case XtcePackage.COMPLETE_VERIFIER_TYPE__RETURN_PARM_REF:
				return getReturnParmRef();
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
			case XtcePackage.COMPLETE_VERIFIER_TYPE__RETURN_PARM_REF:
				setReturnParmRef((ParameterRefType1)newValue);
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
			case XtcePackage.COMPLETE_VERIFIER_TYPE__RETURN_PARM_REF:
				setReturnParmRef((ParameterRefType1)null);
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
			case XtcePackage.COMPLETE_VERIFIER_TYPE__RETURN_PARM_REF:
				return returnParmRef != null;
		}
		return super.eIsSet(featureID);
	}

} //CompleteVerifierTypeImpl
