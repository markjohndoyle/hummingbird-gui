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

import org.omg.space.xtce.StreamSegmentEntryType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream Segment Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.StreamSegmentEntryTypeImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.StreamSegmentEntryTypeImpl#getSizeInBits <em>Size In Bits</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.StreamSegmentEntryTypeImpl#getStreamRef <em>Stream Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StreamSegmentEntryTypeImpl extends SequenceEntryTypeImpl implements StreamSegmentEntryType {
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
	 * The default value of the '{@link #getStreamRef() <em>Stream Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamRef()
	 * @generated
	 * @ordered
	 */
	protected static final String STREAM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreamRef() <em>Stream Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamRef()
	 * @generated
	 * @ordered
	 */
	protected String streamRef = STREAM_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamSegmentEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getStreamSegmentEntryType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.STREAM_SEGMENT_ENTRY_TYPE__ORDER, oldOrder, order));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.STREAM_SEGMENT_ENTRY_TYPE__SIZE_IN_BITS, oldSizeInBits, sizeInBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreamRef() {
		return streamRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreamRef(String newStreamRef) {
		String oldStreamRef = streamRef;
		streamRef = newStreamRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.STREAM_SEGMENT_ENTRY_TYPE__STREAM_REF, oldStreamRef, streamRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.STREAM_SEGMENT_ENTRY_TYPE__ORDER:
				return getOrder();
			case XtcePackage.STREAM_SEGMENT_ENTRY_TYPE__SIZE_IN_BITS:
				return getSizeInBits();
			case XtcePackage.STREAM_SEGMENT_ENTRY_TYPE__STREAM_REF:
				return getStreamRef();
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
			case XtcePackage.STREAM_SEGMENT_ENTRY_TYPE__ORDER:
				setOrder((BigInteger)newValue);
				return;
			case XtcePackage.STREAM_SEGMENT_ENTRY_TYPE__SIZE_IN_BITS:
				setSizeInBits((BigInteger)newValue);
				return;
			case XtcePackage.STREAM_SEGMENT_ENTRY_TYPE__STREAM_REF:
				setStreamRef((String)newValue);
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
			case XtcePackage.STREAM_SEGMENT_ENTRY_TYPE__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case XtcePackage.STREAM_SEGMENT_ENTRY_TYPE__SIZE_IN_BITS:
				setSizeInBits(SIZE_IN_BITS_EDEFAULT);
				return;
			case XtcePackage.STREAM_SEGMENT_ENTRY_TYPE__STREAM_REF:
				setStreamRef(STREAM_REF_EDEFAULT);
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
			case XtcePackage.STREAM_SEGMENT_ENTRY_TYPE__ORDER:
				return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
			case XtcePackage.STREAM_SEGMENT_ENTRY_TYPE__SIZE_IN_BITS:
				return SIZE_IN_BITS_EDEFAULT == null ? sizeInBits != null : !SIZE_IN_BITS_EDEFAULT.equals(sizeInBits);
			case XtcePackage.STREAM_SEGMENT_ENTRY_TYPE__STREAM_REF:
				return STREAM_REF_EDEFAULT == null ? streamRef != null : !STREAM_REF_EDEFAULT.equals(streamRef);
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
		result.append(" (order: ");
		result.append(order);
		result.append(", sizeInBits: ");
		result.append(sizeInBits);
		result.append(", streamRef: ");
		result.append(streamRef);
		result.append(')');
		return result.toString();
	}

} //StreamSegmentEntryTypeImpl
