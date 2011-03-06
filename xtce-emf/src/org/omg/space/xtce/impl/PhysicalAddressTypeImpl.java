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

import org.omg.space.xtce.PhysicalAddressType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Address Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.PhysicalAddressTypeImpl#getSubAddress <em>Sub Address</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.PhysicalAddressTypeImpl#getSourceAddress <em>Source Address</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.PhysicalAddressTypeImpl#getSourceName <em>Source Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalAddressTypeImpl extends EObjectImpl implements PhysicalAddressType {
	/**
	 * The cached value of the '{@link #getSubAddress() <em>Sub Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubAddress()
	 * @generated
	 * @ordered
	 */
	protected PhysicalAddressType subAddress;

	/**
	 * The default value of the '{@link #getSourceAddress() <em>Source Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceAddress() <em>Source Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAddress()
	 * @generated
	 * @ordered
	 */
	protected String sourceAddress = SOURCE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceName()
	 * @generated
	 * @ordered
	 */
	protected String sourceName = SOURCE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalAddressTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getPhysicalAddressType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalAddressType getSubAddress() {
		return subAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubAddress(PhysicalAddressType newSubAddress, NotificationChain msgs) {
		PhysicalAddressType oldSubAddress = subAddress;
		subAddress = newSubAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.PHYSICAL_ADDRESS_TYPE__SUB_ADDRESS, oldSubAddress, newSubAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubAddress(PhysicalAddressType newSubAddress) {
		if (newSubAddress != subAddress) {
			NotificationChain msgs = null;
			if (subAddress != null)
				msgs = ((InternalEObject)subAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PHYSICAL_ADDRESS_TYPE__SUB_ADDRESS, null, msgs);
			if (newSubAddress != null)
				msgs = ((InternalEObject)newSubAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PHYSICAL_ADDRESS_TYPE__SUB_ADDRESS, null, msgs);
			msgs = basicSetSubAddress(newSubAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PHYSICAL_ADDRESS_TYPE__SUB_ADDRESS, newSubAddress, newSubAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceAddress() {
		return sourceAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAddress(String newSourceAddress) {
		String oldSourceAddress = sourceAddress;
		sourceAddress = newSourceAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PHYSICAL_ADDRESS_TYPE__SOURCE_ADDRESS, oldSourceAddress, sourceAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceName() {
		return sourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceName(String newSourceName) {
		String oldSourceName = sourceName;
		sourceName = newSourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PHYSICAL_ADDRESS_TYPE__SOURCE_NAME, oldSourceName, sourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.PHYSICAL_ADDRESS_TYPE__SUB_ADDRESS:
				return basicSetSubAddress(null, msgs);
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
			case XtcePackage.PHYSICAL_ADDRESS_TYPE__SUB_ADDRESS:
				return getSubAddress();
			case XtcePackage.PHYSICAL_ADDRESS_TYPE__SOURCE_ADDRESS:
				return getSourceAddress();
			case XtcePackage.PHYSICAL_ADDRESS_TYPE__SOURCE_NAME:
				return getSourceName();
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
			case XtcePackage.PHYSICAL_ADDRESS_TYPE__SUB_ADDRESS:
				setSubAddress((PhysicalAddressType)newValue);
				return;
			case XtcePackage.PHYSICAL_ADDRESS_TYPE__SOURCE_ADDRESS:
				setSourceAddress((String)newValue);
				return;
			case XtcePackage.PHYSICAL_ADDRESS_TYPE__SOURCE_NAME:
				setSourceName((String)newValue);
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
			case XtcePackage.PHYSICAL_ADDRESS_TYPE__SUB_ADDRESS:
				setSubAddress((PhysicalAddressType)null);
				return;
			case XtcePackage.PHYSICAL_ADDRESS_TYPE__SOURCE_ADDRESS:
				setSourceAddress(SOURCE_ADDRESS_EDEFAULT);
				return;
			case XtcePackage.PHYSICAL_ADDRESS_TYPE__SOURCE_NAME:
				setSourceName(SOURCE_NAME_EDEFAULT);
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
			case XtcePackage.PHYSICAL_ADDRESS_TYPE__SUB_ADDRESS:
				return subAddress != null;
			case XtcePackage.PHYSICAL_ADDRESS_TYPE__SOURCE_ADDRESS:
				return SOURCE_ADDRESS_EDEFAULT == null ? sourceAddress != null : !SOURCE_ADDRESS_EDEFAULT.equals(sourceAddress);
			case XtcePackage.PHYSICAL_ADDRESS_TYPE__SOURCE_NAME:
				return SOURCE_NAME_EDEFAULT == null ? sourceName != null : !SOURCE_NAME_EDEFAULT.equals(sourceName);
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
		result.append(" (sourceAddress: ");
		result.append(sourceAddress);
		result.append(", sourceName: ");
		result.append(sourceName);
		result.append(')');
		return result.toString();
	}

} //PhysicalAddressTypeImpl
