/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Encoding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes how a particular piece of data is sent or received from some non-native, off-platform device. (e.g. a spacecraft)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.DataEncodingType#getErrorDetectCorrect <em>Error Detect Correct</em>}</li>
 *   <li>{@link org.omg.space.xtce.DataEncodingType#getByteOrderList <em>Byte Order List</em>}</li>
 *   <li>{@link org.omg.space.xtce.DataEncodingType#getBitOrder <em>Bit Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getDataEncodingType()
 * @model extendedMetaData="name='DataEncodingType' kind='elementOnly'"
 * @generated
 */
public interface DataEncodingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Error Detect Correct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Detect Correct</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Detect Correct</em>' containment reference.
	 * @see #setErrorDetectCorrect(ErrorDetectCorrectType)
	 * @see org.omg.space.xtce.XtcePackage#getDataEncodingType_ErrorDetectCorrect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ErrorDetectCorrect' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrorDetectCorrectType getErrorDetectCorrect();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.DataEncodingType#getErrorDetectCorrect <em>Error Detect Correct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Detect Correct</em>' containment reference.
	 * @see #getErrorDetectCorrect()
	 * @generated
	 */
	void setErrorDetectCorrect(ErrorDetectCorrectType value);

	/**
	 * Returns the value of the '<em><b>Byte Order List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to describe an arbitrary byte order in multibyte parameters.  First byte in list is the first in the stream.  Byte significance is the is highest for most significant bytes.  If not included, it is assumed that the most significant byte is first, least significant byte last.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Byte Order List</em>' containment reference.
	 * @see #setByteOrderList(ByteOrderType)
	 * @see org.omg.space.xtce.XtcePackage#getDataEncodingType_ByteOrderList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ByteOrderList' namespace='##targetNamespace'"
	 * @generated
	 */
	ByteOrderType getByteOrderList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.DataEncodingType#getByteOrderList <em>Byte Order List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Order List</em>' containment reference.
	 * @see #getByteOrderList()
	 * @generated
	 */
	void setByteOrderList(ByteOrderType value);

	/**
	 * Returns the value of the '<em><b>Bit Order</b></em>' attribute.
	 * The default value is <code>"mostSignificantBitFirst"</code>.
	 * The literals are from the enumeration {@link org.omg.space.xtce.BitOrderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Order</em>' attribute.
	 * @see org.omg.space.xtce.BitOrderType
	 * @see #isSetBitOrder()
	 * @see #unsetBitOrder()
	 * @see #setBitOrder(BitOrderType)
	 * @see org.omg.space.xtce.XtcePackage#getDataEncodingType_BitOrder()
	 * @model default="mostSignificantBitFirst" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='bitOrder'"
	 * @generated
	 */
	BitOrderType getBitOrder();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.DataEncodingType#getBitOrder <em>Bit Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Order</em>' attribute.
	 * @see org.omg.space.xtce.BitOrderType
	 * @see #isSetBitOrder()
	 * @see #unsetBitOrder()
	 * @see #getBitOrder()
	 * @generated
	 */
	void setBitOrder(BitOrderType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.DataEncodingType#getBitOrder <em>Bit Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBitOrder()
	 * @see #getBitOrder()
	 * @see #setBitOrder(BitOrderType)
	 * @generated
	 */
	void unsetBitOrder();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.DataEncodingType#getBitOrder <em>Bit Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bit Order</em>' attribute is set.
	 * @see #unsetBitOrder()
	 * @see #getBitOrder()
	 * @see #setBitOrder(BitOrderType)
	 * @generated
	 */
	boolean isSetBitOrder();

} // DataEncodingType
