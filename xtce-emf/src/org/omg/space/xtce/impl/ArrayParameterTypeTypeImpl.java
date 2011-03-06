/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.space.xtce.ArrayParameterTypeType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Parameter Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ArrayParameterTypeTypeImpl#getArrayTypeRef <em>Array Type Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ArrayParameterTypeTypeImpl#getNumberOfDimensions <em>Number Of Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayParameterTypeTypeImpl extends NameDescriptionTypeImpl implements ArrayParameterTypeType {
	/**
	 * The default value of the '{@link #getArrayTypeRef() <em>Array Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayTypeRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ARRAY_TYPE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrayTypeRef() <em>Array Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayTypeRef()
	 * @generated
	 * @ordered
	 */
	protected String arrayTypeRef = ARRAY_TYPE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfDimensions() <em>Number Of Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_OF_DIMENSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfDimensions() <em>Number Of Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDimensions()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberOfDimensions = NUMBER_OF_DIMENSIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayParameterTypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getArrayParameterTypeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArrayTypeRef() {
		return arrayTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayTypeRef(String newArrayTypeRef) {
		String oldArrayTypeRef = arrayTypeRef;
		arrayTypeRef = newArrayTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ARRAY_PARAMETER_TYPE_TYPE__ARRAY_TYPE_REF, oldArrayTypeRef, arrayTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberOfDimensions() {
		return numberOfDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfDimensions(BigInteger newNumberOfDimensions) {
		BigInteger oldNumberOfDimensions = numberOfDimensions;
		numberOfDimensions = newNumberOfDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ARRAY_PARAMETER_TYPE_TYPE__NUMBER_OF_DIMENSIONS, oldNumberOfDimensions, numberOfDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.ARRAY_PARAMETER_TYPE_TYPE__ARRAY_TYPE_REF:
				return getArrayTypeRef();
			case XtcePackage.ARRAY_PARAMETER_TYPE_TYPE__NUMBER_OF_DIMENSIONS:
				return getNumberOfDimensions();
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
			case XtcePackage.ARRAY_PARAMETER_TYPE_TYPE__ARRAY_TYPE_REF:
				setArrayTypeRef((String)newValue);
				return;
			case XtcePackage.ARRAY_PARAMETER_TYPE_TYPE__NUMBER_OF_DIMENSIONS:
				setNumberOfDimensions((BigInteger)newValue);
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
			case XtcePackage.ARRAY_PARAMETER_TYPE_TYPE__ARRAY_TYPE_REF:
				setArrayTypeRef(ARRAY_TYPE_REF_EDEFAULT);
				return;
			case XtcePackage.ARRAY_PARAMETER_TYPE_TYPE__NUMBER_OF_DIMENSIONS:
				setNumberOfDimensions(NUMBER_OF_DIMENSIONS_EDEFAULT);
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
			case XtcePackage.ARRAY_PARAMETER_TYPE_TYPE__ARRAY_TYPE_REF:
				return ARRAY_TYPE_REF_EDEFAULT == null ? arrayTypeRef != null : !ARRAY_TYPE_REF_EDEFAULT.equals(arrayTypeRef);
			case XtcePackage.ARRAY_PARAMETER_TYPE_TYPE__NUMBER_OF_DIMENSIONS:
				return NUMBER_OF_DIMENSIONS_EDEFAULT == null ? numberOfDimensions != null : !NUMBER_OF_DIMENSIONS_EDEFAULT.equals(numberOfDimensions);
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
		result.append(" (arrayTypeRef: ");
		result.append(arrayTypeRef);
		result.append(", numberOfDimensions: ");
		result.append(numberOfDimensions);
		result.append(')');
		return result.toString();
	}

} //ArrayParameterTypeTypeImpl
