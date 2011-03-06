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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.ArgumementArrayTypeType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argumement Array Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ArgumementArrayTypeTypeImpl#getArrayType <em>Array Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ArgumementArrayTypeTypeImpl#getNumberOfDimensions <em>Number Of Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumementArrayTypeTypeImpl extends EObjectImpl implements ArgumementArrayTypeType {
	/**
	 * The default value of the '{@link #getArrayType() <em>Array Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayType()
	 * @generated
	 * @ordered
	 */
	protected static final String ARRAY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrayType() <em>Array Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayType()
	 * @generated
	 * @ordered
	 */
	protected String arrayType = ARRAY_TYPE_EDEFAULT;

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
	protected ArgumementArrayTypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getArgumementArrayTypeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArrayType() {
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayType(String newArrayType) {
		String oldArrayType = arrayType;
		arrayType = newArrayType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ARGUMEMENT_ARRAY_TYPE_TYPE__ARRAY_TYPE, oldArrayType, arrayType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ARGUMEMENT_ARRAY_TYPE_TYPE__NUMBER_OF_DIMENSIONS, oldNumberOfDimensions, numberOfDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.ARGUMEMENT_ARRAY_TYPE_TYPE__ARRAY_TYPE:
				return getArrayType();
			case XtcePackage.ARGUMEMENT_ARRAY_TYPE_TYPE__NUMBER_OF_DIMENSIONS:
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
			case XtcePackage.ARGUMEMENT_ARRAY_TYPE_TYPE__ARRAY_TYPE:
				setArrayType((String)newValue);
				return;
			case XtcePackage.ARGUMEMENT_ARRAY_TYPE_TYPE__NUMBER_OF_DIMENSIONS:
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
			case XtcePackage.ARGUMEMENT_ARRAY_TYPE_TYPE__ARRAY_TYPE:
				setArrayType(ARRAY_TYPE_EDEFAULT);
				return;
			case XtcePackage.ARGUMEMENT_ARRAY_TYPE_TYPE__NUMBER_OF_DIMENSIONS:
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
			case XtcePackage.ARGUMEMENT_ARRAY_TYPE_TYPE__ARRAY_TYPE:
				return ARRAY_TYPE_EDEFAULT == null ? arrayType != null : !ARRAY_TYPE_EDEFAULT.equals(arrayType);
			case XtcePackage.ARGUMEMENT_ARRAY_TYPE_TYPE__NUMBER_OF_DIMENSIONS:
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
		result.append(" (arrayType: ");
		result.append(arrayType);
		result.append(", numberOfDimensions: ");
		result.append(numberOfDimensions);
		result.append(')');
		return result.toString();
	}

} //ArgumementArrayTypeTypeImpl
