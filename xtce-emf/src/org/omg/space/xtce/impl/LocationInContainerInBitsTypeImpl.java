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

import org.omg.space.xtce.LocationInContainerInBitsType;
import org.omg.space.xtce.ReferenceLocationType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location In Container In Bits Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.LocationInContainerInBitsTypeImpl#getReferenceLocation <em>Reference Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationInContainerInBitsTypeImpl extends IntegerValueTypeImpl implements LocationInContainerInBitsType {
	/**
	 * The default value of the '{@link #getReferenceLocation() <em>Reference Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceLocation()
	 * @generated
	 * @ordered
	 */
	protected static final ReferenceLocationType REFERENCE_LOCATION_EDEFAULT = ReferenceLocationType.PREVIOUS_ENTRY;

	/**
	 * The cached value of the '{@link #getReferenceLocation() <em>Reference Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceLocation()
	 * @generated
	 * @ordered
	 */
	protected ReferenceLocationType referenceLocation = REFERENCE_LOCATION_EDEFAULT;

	/**
	 * This is true if the Reference Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referenceLocationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationInContainerInBitsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getLocationInContainerInBitsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceLocationType getReferenceLocation() {
		return referenceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceLocation(ReferenceLocationType newReferenceLocation) {
		ReferenceLocationType oldReferenceLocation = referenceLocation;
		referenceLocation = newReferenceLocation == null ? REFERENCE_LOCATION_EDEFAULT : newReferenceLocation;
		boolean oldReferenceLocationESet = referenceLocationESet;
		referenceLocationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.LOCATION_IN_CONTAINER_IN_BITS_TYPE__REFERENCE_LOCATION, oldReferenceLocation, referenceLocation, !oldReferenceLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferenceLocation() {
		ReferenceLocationType oldReferenceLocation = referenceLocation;
		boolean oldReferenceLocationESet = referenceLocationESet;
		referenceLocation = REFERENCE_LOCATION_EDEFAULT;
		referenceLocationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.LOCATION_IN_CONTAINER_IN_BITS_TYPE__REFERENCE_LOCATION, oldReferenceLocation, REFERENCE_LOCATION_EDEFAULT, oldReferenceLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferenceLocation() {
		return referenceLocationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.LOCATION_IN_CONTAINER_IN_BITS_TYPE__REFERENCE_LOCATION:
				return getReferenceLocation();
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
			case XtcePackage.LOCATION_IN_CONTAINER_IN_BITS_TYPE__REFERENCE_LOCATION:
				setReferenceLocation((ReferenceLocationType)newValue);
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
			case XtcePackage.LOCATION_IN_CONTAINER_IN_BITS_TYPE__REFERENCE_LOCATION:
				unsetReferenceLocation();
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
			case XtcePackage.LOCATION_IN_CONTAINER_IN_BITS_TYPE__REFERENCE_LOCATION:
				return isSetReferenceLocation();
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
		result.append(" (referenceLocation: ");
		if (referenceLocationESet) result.append(referenceLocation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LocationInContainerInBitsTypeImpl
