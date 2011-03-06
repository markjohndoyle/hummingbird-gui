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
 * A representation of the model object '<em><b>Fixed Value Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.FixedValueEntryType#getBinaryValue <em>Binary Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.FixedValueEntryType#getSizeInBits <em>Size In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getFixedValueEntryType()
 * @model extendedMetaData="name='FixedValueEntry_._type' kind='elementOnly'"
 * @generated
 */
public interface FixedValueEntryType extends SequenceEntryType {
	/**
	 * Returns the value of the '<em><b>Binary Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Value</em>' attribute.
	 * @see #setBinaryValue(byte[])
	 * @see org.omg.space.xtce.XtcePackage#getFixedValueEntryType_BinaryValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.HexBinary" required="true"
	 *        extendedMetaData="kind='attribute' name='binaryValue'"
	 * @generated
	 */
	byte[] getBinaryValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.FixedValueEntryType#getBinaryValue <em>Binary Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Value</em>' attribute.
	 * @see #getBinaryValue()
	 * @generated
	 */
	void setBinaryValue(byte[] value);

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
	 * @see org.omg.space.xtce.XtcePackage#getFixedValueEntryType_SizeInBits()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='sizeInBits'"
	 * @generated
	 */
	BigInteger getSizeInBits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.FixedValueEntryType#getSizeInBits <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In Bits</em>' attribute.
	 * @see #getSizeInBits()
	 * @generated
	 */
	void setSizeInBits(BigInteger value);

} // FixedValueEntryType
