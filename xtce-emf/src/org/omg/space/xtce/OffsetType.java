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
 * A representation of the model object '<em><b>Offset Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.OffsetType#getOffsetSizeInBits <em>Offset Size In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getOffsetType()
 * @model extendedMetaData="name='Offset_._type' kind='elementOnly'"
 * @generated
 */
public interface OffsetType extends IntegerValueType {
	/**
	 * Returns the value of the '<em><b>Offset Size In Bits</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset Size In Bits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Size In Bits</em>' attribute.
	 * @see #isSetOffsetSizeInBits()
	 * @see #unsetOffsetSizeInBits()
	 * @see #setOffsetSizeInBits(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getOffsetType_OffsetSizeInBits()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='offsetSizeInBits'"
	 * @generated
	 */
	BigInteger getOffsetSizeInBits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.OffsetType#getOffsetSizeInBits <em>Offset Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Size In Bits</em>' attribute.
	 * @see #isSetOffsetSizeInBits()
	 * @see #unsetOffsetSizeInBits()
	 * @see #getOffsetSizeInBits()
	 * @generated
	 */
	void setOffsetSizeInBits(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.OffsetType#getOffsetSizeInBits <em>Offset Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOffsetSizeInBits()
	 * @see #getOffsetSizeInBits()
	 * @see #setOffsetSizeInBits(BigInteger)
	 * @generated
	 */
	void unsetOffsetSizeInBits();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.OffsetType#getOffsetSizeInBits <em>Offset Size In Bits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Offset Size In Bits</em>' attribute is set.
	 * @see #unsetOffsetSizeInBits()
	 * @see #getOffsetSizeInBits()
	 * @see #setOffsetSizeInBits(BigInteger)
	 * @generated
	 */
	boolean isSetOffsetSizeInBits();

} // OffsetType
