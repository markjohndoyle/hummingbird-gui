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

import org.omg.space.xtce.CalibratorType;
import org.omg.space.xtce.PolynomialType;
import org.omg.space.xtce.SplineCalibratorType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calibrator Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.CalibratorTypeImpl#getSplineCalibrator <em>Spline Calibrator</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CalibratorTypeImpl#getPolynomialCalibrator <em>Polynomial Calibrator</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CalibratorTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CalibratorTypeImpl extends EObjectImpl implements CalibratorType {
	/**
	 * The cached value of the '{@link #getSplineCalibrator() <em>Spline Calibrator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplineCalibrator()
	 * @generated
	 * @ordered
	 */
	protected SplineCalibratorType splineCalibrator;

	/**
	 * The cached value of the '{@link #getPolynomialCalibrator() <em>Polynomial Calibrator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolynomialCalibrator()
	 * @generated
	 * @ordered
	 */
	protected PolynomialType polynomialCalibrator;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalibratorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getCalibratorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplineCalibratorType getSplineCalibrator() {
		return splineCalibrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSplineCalibrator(SplineCalibratorType newSplineCalibrator, NotificationChain msgs) {
		SplineCalibratorType oldSplineCalibrator = splineCalibrator;
		splineCalibrator = newSplineCalibrator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CALIBRATOR_TYPE__SPLINE_CALIBRATOR, oldSplineCalibrator, newSplineCalibrator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplineCalibrator(SplineCalibratorType newSplineCalibrator) {
		if (newSplineCalibrator != splineCalibrator) {
			NotificationChain msgs = null;
			if (splineCalibrator != null)
				msgs = ((InternalEObject)splineCalibrator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CALIBRATOR_TYPE__SPLINE_CALIBRATOR, null, msgs);
			if (newSplineCalibrator != null)
				msgs = ((InternalEObject)newSplineCalibrator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CALIBRATOR_TYPE__SPLINE_CALIBRATOR, null, msgs);
			msgs = basicSetSplineCalibrator(newSplineCalibrator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CALIBRATOR_TYPE__SPLINE_CALIBRATOR, newSplineCalibrator, newSplineCalibrator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolynomialType getPolynomialCalibrator() {
		return polynomialCalibrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolynomialCalibrator(PolynomialType newPolynomialCalibrator, NotificationChain msgs) {
		PolynomialType oldPolynomialCalibrator = polynomialCalibrator;
		polynomialCalibrator = newPolynomialCalibrator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.CALIBRATOR_TYPE__POLYNOMIAL_CALIBRATOR, oldPolynomialCalibrator, newPolynomialCalibrator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolynomialCalibrator(PolynomialType newPolynomialCalibrator) {
		if (newPolynomialCalibrator != polynomialCalibrator) {
			NotificationChain msgs = null;
			if (polynomialCalibrator != null)
				msgs = ((InternalEObject)polynomialCalibrator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CALIBRATOR_TYPE__POLYNOMIAL_CALIBRATOR, null, msgs);
			if (newPolynomialCalibrator != null)
				msgs = ((InternalEObject)newPolynomialCalibrator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.CALIBRATOR_TYPE__POLYNOMIAL_CALIBRATOR, null, msgs);
			msgs = basicSetPolynomialCalibrator(newPolynomialCalibrator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CALIBRATOR_TYPE__POLYNOMIAL_CALIBRATOR, newPolynomialCalibrator, newPolynomialCalibrator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CALIBRATOR_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.CALIBRATOR_TYPE__SPLINE_CALIBRATOR:
				return basicSetSplineCalibrator(null, msgs);
			case XtcePackage.CALIBRATOR_TYPE__POLYNOMIAL_CALIBRATOR:
				return basicSetPolynomialCalibrator(null, msgs);
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
			case XtcePackage.CALIBRATOR_TYPE__SPLINE_CALIBRATOR:
				return getSplineCalibrator();
			case XtcePackage.CALIBRATOR_TYPE__POLYNOMIAL_CALIBRATOR:
				return getPolynomialCalibrator();
			case XtcePackage.CALIBRATOR_TYPE__NAME:
				return getName();
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
			case XtcePackage.CALIBRATOR_TYPE__SPLINE_CALIBRATOR:
				setSplineCalibrator((SplineCalibratorType)newValue);
				return;
			case XtcePackage.CALIBRATOR_TYPE__POLYNOMIAL_CALIBRATOR:
				setPolynomialCalibrator((PolynomialType)newValue);
				return;
			case XtcePackage.CALIBRATOR_TYPE__NAME:
				setName((String)newValue);
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
			case XtcePackage.CALIBRATOR_TYPE__SPLINE_CALIBRATOR:
				setSplineCalibrator((SplineCalibratorType)null);
				return;
			case XtcePackage.CALIBRATOR_TYPE__POLYNOMIAL_CALIBRATOR:
				setPolynomialCalibrator((PolynomialType)null);
				return;
			case XtcePackage.CALIBRATOR_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case XtcePackage.CALIBRATOR_TYPE__SPLINE_CALIBRATOR:
				return splineCalibrator != null;
			case XtcePackage.CALIBRATOR_TYPE__POLYNOMIAL_CALIBRATOR:
				return polynomialCalibrator != null;
			case XtcePackage.CALIBRATOR_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CalibratorTypeImpl
