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
 * A representation of the model object '<em><b>Parameter Segment Ref Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An entry that is only a portion of a parameter value indicating that the entire parameter value must be assembled from other parameter segments.   It is assumed that parameter segments happen sequentially in time, that is the first part if a telemetry parameter first, however (and there's always a however), if this is not the case the order of this parameter segment may be supplied with the order attribute where the first segment order="0".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ParameterSegmentRefEntryType#getOrder <em>Order</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterSegmentRefEntryType#getParameterRef <em>Parameter Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterSegmentRefEntryType#getSizeInBits <em>Size In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getParameterSegmentRefEntryType()
 * @model extendedMetaData="name='ParameterSegmentRefEntryType' kind='elementOnly'"
 * @generated
 */
public interface ParameterSegmentRefEntryType extends SequenceEntryType {
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
	 * @see org.omg.space.xtce.XtcePackage#getParameterSegmentRefEntryType_Order()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='order'"
	 * @generated
	 */
	BigInteger getOrder();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterSegmentRefEntryType#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Ref</em>' attribute.
	 * @see #setParameterRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getParameterSegmentRefEntryType_ParameterRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='parameterRef'"
	 * @generated
	 */
	String getParameterRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterSegmentRefEntryType#getParameterRef <em>Parameter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Ref</em>' attribute.
	 * @see #getParameterRef()
	 * @generated
	 */
	void setParameterRef(String value);

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
	 * @see org.omg.space.xtce.XtcePackage#getParameterSegmentRefEntryType_SizeInBits()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='sizeInBits'"
	 * @generated
	 */
	BigInteger getSizeInBits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterSegmentRefEntryType#getSizeInBits <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In Bits</em>' attribute.
	 * @see #getSizeInBits()
	 * @generated
	 */
	void setSizeInBits(BigInteger value);

} // ParameterSegmentRefEntryType
