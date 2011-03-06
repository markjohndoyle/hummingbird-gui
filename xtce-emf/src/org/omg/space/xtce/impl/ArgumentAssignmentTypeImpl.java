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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.ArgumentAssignmentType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Assignment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ArgumentAssignmentTypeImpl#getArgumentName <em>Argument Name</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ArgumentAssignmentTypeImpl#getArgumentValue <em>Argument Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentAssignmentTypeImpl extends EObjectImpl implements ArgumentAssignmentType {
	/**
	 * The default value of the '{@link #getArgumentName() <em>Argument Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentName()
	 * @generated
	 * @ordered
	 */
	protected static final String ARGUMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgumentName() <em>Argument Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentName()
	 * @generated
	 * @ordered
	 */
	protected String argumentName = ARGUMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArgumentValue() <em>Argument Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ARGUMENT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgumentValue() <em>Argument Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentValue()
	 * @generated
	 * @ordered
	 */
	protected String argumentValue = ARGUMENT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentAssignmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getArgumentAssignmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArgumentName() {
		return argumentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentName(String newArgumentName) {
		String oldArgumentName = argumentName;
		argumentName = newArgumentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ARGUMENT_ASSIGNMENT_TYPE__ARGUMENT_NAME, oldArgumentName, argumentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArgumentValue() {
		return argumentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentValue(String newArgumentValue) {
		String oldArgumentValue = argumentValue;
		argumentValue = newArgumentValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ARGUMENT_ASSIGNMENT_TYPE__ARGUMENT_VALUE, oldArgumentValue, argumentValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.ARGUMENT_ASSIGNMENT_TYPE__ARGUMENT_NAME:
				return getArgumentName();
			case XtcePackage.ARGUMENT_ASSIGNMENT_TYPE__ARGUMENT_VALUE:
				return getArgumentValue();
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
			case XtcePackage.ARGUMENT_ASSIGNMENT_TYPE__ARGUMENT_NAME:
				setArgumentName((String)newValue);
				return;
			case XtcePackage.ARGUMENT_ASSIGNMENT_TYPE__ARGUMENT_VALUE:
				setArgumentValue((String)newValue);
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
			case XtcePackage.ARGUMENT_ASSIGNMENT_TYPE__ARGUMENT_NAME:
				setArgumentName(ARGUMENT_NAME_EDEFAULT);
				return;
			case XtcePackage.ARGUMENT_ASSIGNMENT_TYPE__ARGUMENT_VALUE:
				setArgumentValue(ARGUMENT_VALUE_EDEFAULT);
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
			case XtcePackage.ARGUMENT_ASSIGNMENT_TYPE__ARGUMENT_NAME:
				return ARGUMENT_NAME_EDEFAULT == null ? argumentName != null : !ARGUMENT_NAME_EDEFAULT.equals(argumentName);
			case XtcePackage.ARGUMENT_ASSIGNMENT_TYPE__ARGUMENT_VALUE:
				return ARGUMENT_VALUE_EDEFAULT == null ? argumentValue != null : !ARGUMENT_VALUE_EDEFAULT.equals(argumentValue);
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
		result.append(" (argumentName: ");
		result.append(argumentName);
		result.append(", argumentValue: ");
		result.append(argumentValue);
		result.append(')');
		return result.toString();
	}

} //ArgumentAssignmentTypeImpl
