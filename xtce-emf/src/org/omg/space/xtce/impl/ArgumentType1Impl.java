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

import org.omg.space.xtce.ArgumentType1;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ArgumentType1Impl#getArgumentTypeRef <em>Argument Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentType1Impl extends NameDescriptionTypeImpl implements ArgumentType1 {
	/**
	 * The default value of the '{@link #getArgumentTypeRef() <em>Argument Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentTypeRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ARGUMENT_TYPE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgumentTypeRef() <em>Argument Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentTypeRef()
	 * @generated
	 * @ordered
	 */
	protected String argumentTypeRef = ARGUMENT_TYPE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getArgumentType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArgumentTypeRef() {
		return argumentTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentTypeRef(String newArgumentTypeRef) {
		String oldArgumentTypeRef = argumentTypeRef;
		argumentTypeRef = newArgumentTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ARGUMENT_TYPE1__ARGUMENT_TYPE_REF, oldArgumentTypeRef, argumentTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.ARGUMENT_TYPE1__ARGUMENT_TYPE_REF:
				return getArgumentTypeRef();
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
			case XtcePackage.ARGUMENT_TYPE1__ARGUMENT_TYPE_REF:
				setArgumentTypeRef((String)newValue);
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
			case XtcePackage.ARGUMENT_TYPE1__ARGUMENT_TYPE_REF:
				setArgumentTypeRef(ARGUMENT_TYPE_REF_EDEFAULT);
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
			case XtcePackage.ARGUMENT_TYPE1__ARGUMENT_TYPE_REF:
				return ARGUMENT_TYPE_REF_EDEFAULT == null ? argumentTypeRef != null : !ARGUMENT_TYPE_REF_EDEFAULT.equals(argumentTypeRef);
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
		result.append(" (argumentTypeRef: ");
		result.append(argumentTypeRef);
		result.append(')');
		return result.toString();
	}

} //ArgumentType1Impl
