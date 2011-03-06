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

import org.omg.space.xtce.ParameterInstanceRefType1;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Instance Ref Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ParameterInstanceRefType1Impl#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterInstanceRefType1Impl#isUseCalibratedValue <em>Use Calibrated Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterInstanceRefType1Impl extends ParameterRefType1Impl implements ParameterInstanceRefType1 {
	/**
	 * The default value of the '{@link #getInstance() <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INSTANCE_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected BigInteger instance = INSTANCE_EDEFAULT;

	/**
	 * This is true if the Instance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean instanceESet;

	/**
	 * The default value of the '{@link #isUseCalibratedValue() <em>Use Calibrated Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCalibratedValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_CALIBRATED_VALUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseCalibratedValue() <em>Use Calibrated Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCalibratedValue()
	 * @generated
	 * @ordered
	 */
	protected boolean useCalibratedValue = USE_CALIBRATED_VALUE_EDEFAULT;

	/**
	 * This is true if the Use Calibrated Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useCalibratedValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterInstanceRefType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getParameterInstanceRefType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(BigInteger newInstance) {
		BigInteger oldInstance = instance;
		instance = newInstance;
		boolean oldInstanceESet = instanceESet;
		instanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_INSTANCE_REF_TYPE1__INSTANCE, oldInstance, instance, !oldInstanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInstance() {
		BigInteger oldInstance = instance;
		boolean oldInstanceESet = instanceESet;
		instance = INSTANCE_EDEFAULT;
		instanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.PARAMETER_INSTANCE_REF_TYPE1__INSTANCE, oldInstance, INSTANCE_EDEFAULT, oldInstanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInstance() {
		return instanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseCalibratedValue() {
		return useCalibratedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCalibratedValue(boolean newUseCalibratedValue) {
		boolean oldUseCalibratedValue = useCalibratedValue;
		useCalibratedValue = newUseCalibratedValue;
		boolean oldUseCalibratedValueESet = useCalibratedValueESet;
		useCalibratedValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_INSTANCE_REF_TYPE1__USE_CALIBRATED_VALUE, oldUseCalibratedValue, useCalibratedValue, !oldUseCalibratedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseCalibratedValue() {
		boolean oldUseCalibratedValue = useCalibratedValue;
		boolean oldUseCalibratedValueESet = useCalibratedValueESet;
		useCalibratedValue = USE_CALIBRATED_VALUE_EDEFAULT;
		useCalibratedValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.PARAMETER_INSTANCE_REF_TYPE1__USE_CALIBRATED_VALUE, oldUseCalibratedValue, USE_CALIBRATED_VALUE_EDEFAULT, oldUseCalibratedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseCalibratedValue() {
		return useCalibratedValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.PARAMETER_INSTANCE_REF_TYPE1__INSTANCE:
				return getInstance();
			case XtcePackage.PARAMETER_INSTANCE_REF_TYPE1__USE_CALIBRATED_VALUE:
				return isUseCalibratedValue();
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
			case XtcePackage.PARAMETER_INSTANCE_REF_TYPE1__INSTANCE:
				setInstance((BigInteger)newValue);
				return;
			case XtcePackage.PARAMETER_INSTANCE_REF_TYPE1__USE_CALIBRATED_VALUE:
				setUseCalibratedValue((Boolean)newValue);
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
			case XtcePackage.PARAMETER_INSTANCE_REF_TYPE1__INSTANCE:
				unsetInstance();
				return;
			case XtcePackage.PARAMETER_INSTANCE_REF_TYPE1__USE_CALIBRATED_VALUE:
				unsetUseCalibratedValue();
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
			case XtcePackage.PARAMETER_INSTANCE_REF_TYPE1__INSTANCE:
				return isSetInstance();
			case XtcePackage.PARAMETER_INSTANCE_REF_TYPE1__USE_CALIBRATED_VALUE:
				return isSetUseCalibratedValue();
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
		result.append(" (instance: ");
		if (instanceESet) result.append(instance); else result.append("<unset>");
		result.append(", useCalibratedValue: ");
		if (useCalibratedValueESet) result.append(useCalibratedValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ParameterInstanceRefType1Impl
