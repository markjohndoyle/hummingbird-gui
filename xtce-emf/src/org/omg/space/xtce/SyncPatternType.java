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
 * A representation of the model object '<em><b>Sync Pattern Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.SyncPatternType#getBitLocation <em>Bit Location</em>}</li>
 *   <li>{@link org.omg.space.xtce.SyncPatternType#getMask <em>Mask</em>}</li>
 *   <li>{@link org.omg.space.xtce.SyncPatternType#getMaskLengthInBits <em>Mask Length In Bits</em>}</li>
 *   <li>{@link org.omg.space.xtce.SyncPatternType#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.omg.space.xtce.SyncPatternType#getPatternLengthInBits <em>Pattern Length In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getSyncPatternType()
 * @model extendedMetaData="name='SyncPattern_._type' kind='empty'"
 * @generated
 */
public interface SyncPatternType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bit Location</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Location</em>' attribute.
	 * @see #isSetBitLocation()
	 * @see #unsetBitLocation()
	 * @see #setBitLocation(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getSyncPatternType_BitLocation()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='bitLocation'"
	 * @generated
	 */
	BigInteger getBitLocation();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SyncPatternType#getBitLocation <em>Bit Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Location</em>' attribute.
	 * @see #isSetBitLocation()
	 * @see #unsetBitLocation()
	 * @see #getBitLocation()
	 * @generated
	 */
	void setBitLocation(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.SyncPatternType#getBitLocation <em>Bit Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBitLocation()
	 * @see #getBitLocation()
	 * @see #setBitLocation(BigInteger)
	 * @generated
	 */
	void unsetBitLocation();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.SyncPatternType#getBitLocation <em>Bit Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bit Location</em>' attribute is set.
	 * @see #unsetBitLocation()
	 * @see #getBitLocation()
	 * @see #setBitLocation(BigInteger)
	 * @generated
	 */
	boolean isSetBitLocation();

	/**
	 * Returns the value of the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask</em>' attribute.
	 * @see #setMask(byte[])
	 * @see org.omg.space.xtce.XtcePackage#getSyncPatternType_Mask()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.HexBinary"
	 *        extendedMetaData="kind='attribute' name='mask'"
	 * @generated
	 */
	byte[] getMask();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SyncPatternType#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' attribute.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(byte[] value);

	/**
	 * Returns the value of the '<em><b>Mask Length In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask Length In Bits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask Length In Bits</em>' attribute.
	 * @see #setMaskLengthInBits(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getSyncPatternType_MaskLengthInBits()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='maskLengthInBits'"
	 * @generated
	 */
	BigInteger getMaskLengthInBits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SyncPatternType#getMaskLengthInBits <em>Mask Length In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask Length In Bits</em>' attribute.
	 * @see #getMaskLengthInBits()
	 * @generated
	 */
	void setMaskLengthInBits(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(byte[])
	 * @see org.omg.space.xtce.XtcePackage#getSyncPatternType_Pattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.HexBinary" required="true"
	 *        extendedMetaData="kind='attribute' name='pattern'"
	 * @generated
	 */
	byte[] getPattern();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SyncPatternType#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(byte[] value);

	/**
	 * Returns the value of the '<em><b>Pattern Length In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Length In Bits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Length In Bits</em>' attribute.
	 * @see #setPatternLengthInBits(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getSyncPatternType_PatternLengthInBits()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='patternLengthInBits'"
	 * @generated
	 */
	BigInteger getPatternLengthInBits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SyncPatternType#getPatternLengthInBits <em>Pattern Length In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Length In Bits</em>' attribute.
	 * @see #getPatternLengthInBits()
	 * @generated
	 */
	void setPatternLengthInBits(BigInteger value);

} // SyncPatternType
