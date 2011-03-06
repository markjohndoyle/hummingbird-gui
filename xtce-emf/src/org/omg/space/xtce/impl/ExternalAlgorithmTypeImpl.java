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

import org.omg.space.xtce.ExternalAlgorithmType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Algorithm Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ExternalAlgorithmTypeImpl#getAlgorithmLocation <em>Algorithm Location</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ExternalAlgorithmTypeImpl#getImplementationName <em>Implementation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalAlgorithmTypeImpl extends EObjectImpl implements ExternalAlgorithmType {
	/**
	 * The default value of the '{@link #getAlgorithmLocation() <em>Algorithm Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithmLocation() <em>Algorithm Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmLocation()
	 * @generated
	 * @ordered
	 */
	protected String algorithmLocation = ALGORITHM_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementationName() <em>Implementation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationName() <em>Implementation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationName()
	 * @generated
	 * @ordered
	 */
	protected String implementationName = IMPLEMENTATION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalAlgorithmTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getExternalAlgorithmType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithmLocation() {
		return algorithmLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithmLocation(String newAlgorithmLocation) {
		String oldAlgorithmLocation = algorithmLocation;
		algorithmLocation = newAlgorithmLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.EXTERNAL_ALGORITHM_TYPE__ALGORITHM_LOCATION, oldAlgorithmLocation, algorithmLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementationName() {
		return implementationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationName(String newImplementationName) {
		String oldImplementationName = implementationName;
		implementationName = newImplementationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.EXTERNAL_ALGORITHM_TYPE__IMPLEMENTATION_NAME, oldImplementationName, implementationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.EXTERNAL_ALGORITHM_TYPE__ALGORITHM_LOCATION:
				return getAlgorithmLocation();
			case XtcePackage.EXTERNAL_ALGORITHM_TYPE__IMPLEMENTATION_NAME:
				return getImplementationName();
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
			case XtcePackage.EXTERNAL_ALGORITHM_TYPE__ALGORITHM_LOCATION:
				setAlgorithmLocation((String)newValue);
				return;
			case XtcePackage.EXTERNAL_ALGORITHM_TYPE__IMPLEMENTATION_NAME:
				setImplementationName((String)newValue);
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
			case XtcePackage.EXTERNAL_ALGORITHM_TYPE__ALGORITHM_LOCATION:
				setAlgorithmLocation(ALGORITHM_LOCATION_EDEFAULT);
				return;
			case XtcePackage.EXTERNAL_ALGORITHM_TYPE__IMPLEMENTATION_NAME:
				setImplementationName(IMPLEMENTATION_NAME_EDEFAULT);
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
			case XtcePackage.EXTERNAL_ALGORITHM_TYPE__ALGORITHM_LOCATION:
				return ALGORITHM_LOCATION_EDEFAULT == null ? algorithmLocation != null : !ALGORITHM_LOCATION_EDEFAULT.equals(algorithmLocation);
			case XtcePackage.EXTERNAL_ALGORITHM_TYPE__IMPLEMENTATION_NAME:
				return IMPLEMENTATION_NAME_EDEFAULT == null ? implementationName != null : !IMPLEMENTATION_NAME_EDEFAULT.equals(implementationName);
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
		result.append(" (algorithmLocation: ");
		result.append(algorithmLocation);
		result.append(", implementationName: ");
		result.append(implementationName);
		result.append(')');
		return result.toString();
	}

} //ExternalAlgorithmTypeImpl
