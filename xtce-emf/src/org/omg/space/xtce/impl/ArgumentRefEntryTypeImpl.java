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

import org.omg.space.xtce.ArgumentRefEntryType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Ref Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ArgumentRefEntryTypeImpl#getArgumentRef <em>Argument Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentRefEntryTypeImpl extends SequenceEntryTypeImpl implements ArgumentRefEntryType {
	/**
	 * The default value of the '{@link #getArgumentRef() <em>Argument Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ARGUMENT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgumentRef() <em>Argument Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentRef()
	 * @generated
	 * @ordered
	 */
	protected String argumentRef = ARGUMENT_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentRefEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getArgumentRefEntryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArgumentRef() {
		return argumentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentRef(String newArgumentRef) {
		String oldArgumentRef = argumentRef;
		argumentRef = newArgumentRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ARGUMENT_REF_ENTRY_TYPE__ARGUMENT_REF, oldArgumentRef, argumentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.ARGUMENT_REF_ENTRY_TYPE__ARGUMENT_REF:
				return getArgumentRef();
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
			case XtcePackage.ARGUMENT_REF_ENTRY_TYPE__ARGUMENT_REF:
				setArgumentRef((String)newValue);
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
			case XtcePackage.ARGUMENT_REF_ENTRY_TYPE__ARGUMENT_REF:
				setArgumentRef(ARGUMENT_REF_EDEFAULT);
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
			case XtcePackage.ARGUMENT_REF_ENTRY_TYPE__ARGUMENT_REF:
				return ARGUMENT_REF_EDEFAULT == null ? argumentRef != null : !ARGUMENT_REF_EDEFAULT.equals(argumentRef);
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
		result.append(" (argumentRef: ");
		result.append(argumentRef);
		result.append(')');
		return result.toString();
	}

} //ArgumentRefEntryTypeImpl
