/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Segment Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An entry that is a portion of a stream (streams are by definition, assumed continuous)   It is assumed that stream segments happen sequentially in time, that is the first part if a steam first, however, if this is not the case the order of the stream segments may be supplied with the order attribute where the first segment order="0".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.StreamSegmentEntryType#getOrder <em>Order</em>}</li>
 *   <li>{@link org.omg.space.xtce.StreamSegmentEntryType#getSizeInBits <em>Size In Bits</em>}</li>
 *   <li>{@link org.omg.space.xtce.StreamSegmentEntryType#getStreamRef <em>Stream Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getStreamSegmentEntryType()
 * @model extendedMetaData="name='StreamSegmentEntryType' kind='elementOnly'"
 * @generated
 */
public interface StreamSegmentEntryType extends SequenceEntryType {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getStreamSegmentEntryType_Order()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='order'"
	 * @generated
	 */
	BigInteger getOrder();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.StreamSegmentEntryType#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Size In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size In Bits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size In Bits</em>' attribute.
	 * @see #setSizeInBits(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getStreamSegmentEntryType_SizeInBits()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='sizeInBits'"
	 * @generated
	 */
	BigInteger getSizeInBits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.StreamSegmentEntryType#getSizeInBits <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In Bits</em>' attribute.
	 * @see #getSizeInBits()
	 * @generated
	 */
	void setSizeInBits(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Stream Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stream Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream Ref</em>' attribute.
	 * @see #setStreamRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getStreamSegmentEntryType_StreamRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='streamRef'"
	 * @generated
	 */
	String getStreamRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.StreamSegmentEntryType#getStreamRef <em>Stream Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Ref</em>' attribute.
	 * @see #getStreamRef()
	 * @generated
	 */
	void setStreamRef(String value);

} // StreamSegmentEntryType
