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

import org.omg.space.xtce.BitOrderType;
import org.omg.space.xtce.ByteOrderType;
import org.omg.space.xtce.DataEncodingType;
import org.omg.space.xtce.ErrorDetectCorrectType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Encoding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.DataEncodingTypeImpl#getErrorDetectCorrect <em>Error Detect Correct</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.DataEncodingTypeImpl#getByteOrderList <em>Byte Order List</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.DataEncodingTypeImpl#getBitOrder <em>Bit Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataEncodingTypeImpl extends EObjectImpl implements DataEncodingType {
	/**
	 * The cached value of the '{@link #getErrorDetectCorrect() <em>Error Detect Correct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDetectCorrect()
	 * @generated
	 * @ordered
	 */
	protected ErrorDetectCorrectType errorDetectCorrect;

	/**
	 * The cached value of the '{@link #getByteOrderList() <em>Byte Order List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteOrderList()
	 * @generated
	 * @ordered
	 */
	protected ByteOrderType byteOrderList;

	/**
	 * The default value of the '{@link #getBitOrder() <em>Bit Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitOrder()
	 * @generated
	 * @ordered
	 */
	protected static final BitOrderType BIT_ORDER_EDEFAULT = BitOrderType.MOST_SIGNIFICANT_BIT_FIRST;

	/**
	 * The cached value of the '{@link #getBitOrder() <em>Bit Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitOrder()
	 * @generated
	 * @ordered
	 */
	protected BitOrderType bitOrder = BIT_ORDER_EDEFAULT;

	/**
	 * This is true if the Bit Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bitOrderESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataEncodingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getDataEncodingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorDetectCorrectType getErrorDetectCorrect() {
		return errorDetectCorrect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorDetectCorrect(ErrorDetectCorrectType newErrorDetectCorrect, NotificationChain msgs) {
		ErrorDetectCorrectType oldErrorDetectCorrect = errorDetectCorrect;
		errorDetectCorrect = newErrorDetectCorrect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT, oldErrorDetectCorrect, newErrorDetectCorrect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorDetectCorrect(ErrorDetectCorrectType newErrorDetectCorrect) {
		if (newErrorDetectCorrect != errorDetectCorrect) {
			NotificationChain msgs = null;
			if (errorDetectCorrect != null)
				msgs = ((InternalEObject)errorDetectCorrect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT, null, msgs);
			if (newErrorDetectCorrect != null)
				msgs = ((InternalEObject)newErrorDetectCorrect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT, null, msgs);
			msgs = basicSetErrorDetectCorrect(newErrorDetectCorrect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT, newErrorDetectCorrect, newErrorDetectCorrect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByteOrderType getByteOrderList() {
		return byteOrderList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetByteOrderList(ByteOrderType newByteOrderList, NotificationChain msgs) {
		ByteOrderType oldByteOrderList = byteOrderList;
		byteOrderList = newByteOrderList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.DATA_ENCODING_TYPE__BYTE_ORDER_LIST, oldByteOrderList, newByteOrderList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteOrderList(ByteOrderType newByteOrderList) {
		if (newByteOrderList != byteOrderList) {
			NotificationChain msgs = null;
			if (byteOrderList != null)
				msgs = ((InternalEObject)byteOrderList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DATA_ENCODING_TYPE__BYTE_ORDER_LIST, null, msgs);
			if (newByteOrderList != null)
				msgs = ((InternalEObject)newByteOrderList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DATA_ENCODING_TYPE__BYTE_ORDER_LIST, null, msgs);
			msgs = basicSetByteOrderList(newByteOrderList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.DATA_ENCODING_TYPE__BYTE_ORDER_LIST, newByteOrderList, newByteOrderList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitOrderType getBitOrder() {
		return bitOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitOrder(BitOrderType newBitOrder) {
		BitOrderType oldBitOrder = bitOrder;
		bitOrder = newBitOrder == null ? BIT_ORDER_EDEFAULT : newBitOrder;
		boolean oldBitOrderESet = bitOrderESet;
		bitOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.DATA_ENCODING_TYPE__BIT_ORDER, oldBitOrder, bitOrder, !oldBitOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBitOrder() {
		BitOrderType oldBitOrder = bitOrder;
		boolean oldBitOrderESet = bitOrderESet;
		bitOrder = BIT_ORDER_EDEFAULT;
		bitOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.DATA_ENCODING_TYPE__BIT_ORDER, oldBitOrder, BIT_ORDER_EDEFAULT, oldBitOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBitOrder() {
		return bitOrderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT:
				return basicSetErrorDetectCorrect(null, msgs);
			case XtcePackage.DATA_ENCODING_TYPE__BYTE_ORDER_LIST:
				return basicSetByteOrderList(null, msgs);
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
			case XtcePackage.DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT:
				return getErrorDetectCorrect();
			case XtcePackage.DATA_ENCODING_TYPE__BYTE_ORDER_LIST:
				return getByteOrderList();
			case XtcePackage.DATA_ENCODING_TYPE__BIT_ORDER:
				return getBitOrder();
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
			case XtcePackage.DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT:
				setErrorDetectCorrect((ErrorDetectCorrectType)newValue);
				return;
			case XtcePackage.DATA_ENCODING_TYPE__BYTE_ORDER_LIST:
				setByteOrderList((ByteOrderType)newValue);
				return;
			case XtcePackage.DATA_ENCODING_TYPE__BIT_ORDER:
				setBitOrder((BitOrderType)newValue);
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
			case XtcePackage.DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT:
				setErrorDetectCorrect((ErrorDetectCorrectType)null);
				return;
			case XtcePackage.DATA_ENCODING_TYPE__BYTE_ORDER_LIST:
				setByteOrderList((ByteOrderType)null);
				return;
			case XtcePackage.DATA_ENCODING_TYPE__BIT_ORDER:
				unsetBitOrder();
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
			case XtcePackage.DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT:
				return errorDetectCorrect != null;
			case XtcePackage.DATA_ENCODING_TYPE__BYTE_ORDER_LIST:
				return byteOrderList != null;
			case XtcePackage.DATA_ENCODING_TYPE__BIT_ORDER:
				return isSetBitOrder();
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
		result.append(" (bitOrder: ");
		if (bitOrderESet) result.append(bitOrder); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataEncodingTypeImpl
