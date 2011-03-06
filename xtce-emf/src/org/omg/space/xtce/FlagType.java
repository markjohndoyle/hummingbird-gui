/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flag Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.FlagType#getFlagBitType <em>Flag Bit Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.FlagType#getFlagSizeInBits <em>Flag Size In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getFlagType()
 * @model extendedMetaData="name='Flag_._type' kind='empty'"
 * @generated
 */
public interface FlagType extends EObject {
	/**
	 * Returns the value of the '<em><b>Flag Bit Type</b></em>' attribute.
	 * The default value is <code>"ones"</code>.
	 * The literals are from the enumeration {@link org.omg.space.xtce.FlagBitTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flag Bit Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flag Bit Type</em>' attribute.
	 * @see org.omg.space.xtce.FlagBitTypeType
	 * @see #isSetFlagBitType()
	 * @see #unsetFlagBitType()
	 * @see #setFlagBitType(FlagBitTypeType)
	 * @see org.omg.space.xtce.XtcePackage#getFlagType_FlagBitType()
	 * @model default="ones" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='flagBitType'"
	 * @generated
	 */
	FlagBitTypeType getFlagBitType();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.FlagType#getFlagBitType <em>Flag Bit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flag Bit Type</em>' attribute.
	 * @see org.omg.space.xtce.FlagBitTypeType
	 * @see #isSetFlagBitType()
	 * @see #unsetFlagBitType()
	 * @see #getFlagBitType()
	 * @generated
	 */
	void setFlagBitType(FlagBitTypeType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.FlagType#getFlagBitType <em>Flag Bit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlagBitType()
	 * @see #getFlagBitType()
	 * @see #setFlagBitType(FlagBitTypeType)
	 * @generated
	 */
	void unsetFlagBitType();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.FlagType#getFlagBitType <em>Flag Bit Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flag Bit Type</em>' attribute is set.
	 * @see #unsetFlagBitType()
	 * @see #getFlagBitType()
	 * @see #setFlagBitType(FlagBitTypeType)
	 * @generated
	 */
	boolean isSetFlagBitType();

	/**
	 * Returns the value of the '<em><b>Flag Size In Bits</b></em>' attribute.
	 * The default value is <code>"6"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flag Size In Bits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flag Size In Bits</em>' attribute.
	 * @see #isSetFlagSizeInBits()
	 * @see #unsetFlagSizeInBits()
	 * @see #setFlagSizeInBits(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getFlagType_FlagSizeInBits()
	 * @model default="6" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='flagSizeInBits'"
	 * @generated
	 */
	BigInteger getFlagSizeInBits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.FlagType#getFlagSizeInBits <em>Flag Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flag Size In Bits</em>' attribute.
	 * @see #isSetFlagSizeInBits()
	 * @see #unsetFlagSizeInBits()
	 * @see #getFlagSizeInBits()
	 * @generated
	 */
	void setFlagSizeInBits(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.FlagType#getFlagSizeInBits <em>Flag Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlagSizeInBits()
	 * @see #getFlagSizeInBits()
	 * @see #setFlagSizeInBits(BigInteger)
	 * @generated
	 */
	void unsetFlagSizeInBits();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.FlagType#getFlagSizeInBits <em>Flag Size In Bits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flag Size In Bits</em>' attribute is set.
	 * @see #unsetFlagSizeInBits()
	 * @see #getFlagSizeInBits()
	 * @see #setFlagSizeInBits(BigInteger)
	 * @generated
	 */
	boolean isSetFlagSizeInBits();

} // FlagType
