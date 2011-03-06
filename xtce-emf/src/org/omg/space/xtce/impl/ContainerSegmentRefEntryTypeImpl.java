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

import org.omg.space.xtce.ContainerSegmentRefEntryType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Segment Ref Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ContainerSegmentRefEntryTypeImpl#getContainerRef <em>Container Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ContainerSegmentRefEntryTypeImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ContainerSegmentRefEntryTypeImpl#getSizeInBits <em>Size In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerSegmentRefEntryTypeImpl extends SequenceEntryTypeImpl implements ContainerSegmentRefEntryType {
	/**
	 * The default value of the '{@link #getContainerRef() <em>Container Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerRef() <em>Container Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerRef()
	 * @generated
	 * @ordered
	 */
	protected String containerRef = CONTAINER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected BigInteger order = ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeInBits() <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SIZE_IN_BITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeInBits() <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sizeInBits = SIZE_IN_BITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerSegmentRefEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getContainerSegmentRefEntryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainerRef() {
		return containerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerRef(String newContainerRef) {
		String oldContainerRef = containerRef;
		containerRef = newContainerRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE__CONTAINER_REF, oldContainerRef, containerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(BigInteger newOrder) {
		BigInteger oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSizeInBits() {
		return sizeInBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInBits(BigInteger newSizeInBits) {
		BigInteger oldSizeInBits = sizeInBits;
		sizeInBits = newSizeInBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE__SIZE_IN_BITS, oldSizeInBits, sizeInBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE__CONTAINER_REF:
				return getContainerRef();
			case XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE__ORDER:
				return getOrder();
			case XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE__SIZE_IN_BITS:
				return getSizeInBits();
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
			case XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE__CONTAINER_REF:
				setContainerRef((String)newValue);
				return;
			case XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE__ORDER:
				setOrder((BigInteger)newValue);
				return;
			case XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE__SIZE_IN_BITS:
				setSizeInBits((BigInteger)newValue);
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
			case XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE__CONTAINER_REF:
				setContainerRef(CONTAINER_REF_EDEFAULT);
				return;
			case XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE__SIZE_IN_BITS:
				setSizeInBits(SIZE_IN_BITS_EDEFAULT);
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
			case XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE__CONTAINER_REF:
				return CONTAINER_REF_EDEFAULT == null ? containerRef != null : !CONTAINER_REF_EDEFAULT.equals(containerRef);
			case XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE__ORDER:
				return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
			case XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE__SIZE_IN_BITS:
				return SIZE_IN_BITS_EDEFAULT == null ? sizeInBits != null : !SIZE_IN_BITS_EDEFAULT.equals(sizeInBits);
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
		result.append(" (containerRef: ");
		result.append(containerRef);
		result.append(", order: ");
		result.append(order);
		result.append(", sizeInBits: ");
		result.append(sizeInBits);
		result.append(')');
		return result.toString();
	}

} //ContainerSegmentRefEntryTypeImpl
