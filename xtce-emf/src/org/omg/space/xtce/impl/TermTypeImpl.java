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

import org.omg.space.xtce.TermType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.TermTypeImpl#getCoefficient <em>Coefficient</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.TermTypeImpl#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermTypeImpl extends EObjectImpl implements TermType {
	/**
	 * The default value of the '{@link #getCoefficient() <em>Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficient()
	 * @generated
	 * @ordered
	 */
	protected static final double COEFFICIENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCoefficient() <em>Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficient()
	 * @generated
	 * @ordered
	 */
	protected double coefficient = COEFFICIENT_EDEFAULT;

	/**
	 * This is true if the Coefficient attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coefficientESet;

	/**
	 * The default value of the '{@link #getExponent() <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExponent()
	 * @generated
	 * @ordered
	 */
	protected static final double EXPONENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getExponent() <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExponent()
	 * @generated
	 * @ordered
	 */
	protected double exponent = EXPONENT_EDEFAULT;

	/**
	 * This is true if the Exponent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean exponentESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getTermType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCoefficient() {
		return coefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoefficient(double newCoefficient) {
		double oldCoefficient = coefficient;
		coefficient = newCoefficient;
		boolean oldCoefficientESet = coefficientESet;
		coefficientESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.TERM_TYPE__COEFFICIENT, oldCoefficient, coefficient, !oldCoefficientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCoefficient() {
		double oldCoefficient = coefficient;
		boolean oldCoefficientESet = coefficientESet;
		coefficient = COEFFICIENT_EDEFAULT;
		coefficientESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.TERM_TYPE__COEFFICIENT, oldCoefficient, COEFFICIENT_EDEFAULT, oldCoefficientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCoefficient() {
		return coefficientESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getExponent() {
		return exponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExponent(double newExponent) {
		double oldExponent = exponent;
		exponent = newExponent;
		boolean oldExponentESet = exponentESet;
		exponentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.TERM_TYPE__EXPONENT, oldExponent, exponent, !oldExponentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExponent() {
		double oldExponent = exponent;
		boolean oldExponentESet = exponentESet;
		exponent = EXPONENT_EDEFAULT;
		exponentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.TERM_TYPE__EXPONENT, oldExponent, EXPONENT_EDEFAULT, oldExponentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExponent() {
		return exponentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.TERM_TYPE__COEFFICIENT:
				return getCoefficient();
			case XtcePackage.TERM_TYPE__EXPONENT:
				return getExponent();
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
			case XtcePackage.TERM_TYPE__COEFFICIENT:
				setCoefficient((Double)newValue);
				return;
			case XtcePackage.TERM_TYPE__EXPONENT:
				setExponent((Double)newValue);
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
			case XtcePackage.TERM_TYPE__COEFFICIENT:
				unsetCoefficient();
				return;
			case XtcePackage.TERM_TYPE__EXPONENT:
				unsetExponent();
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
			case XtcePackage.TERM_TYPE__COEFFICIENT:
				return isSetCoefficient();
			case XtcePackage.TERM_TYPE__EXPONENT:
				return isSetExponent();
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
		result.append(" (coefficient: ");
		if (coefficientESet) result.append(coefficient); else result.append("<unset>");
		result.append(", exponent: ");
		if (exponentESet) result.append(exponent); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TermTypeImpl
