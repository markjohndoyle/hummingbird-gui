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
 * A representation of the model object '<em><b>Integer Data Encoding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * For all major encodings of integer data
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.IntegerDataEncodingType#getDefaultCalibrator <em>Default Calibrator</em>}</li>
 *   <li>{@link org.omg.space.xtce.IntegerDataEncodingType#getContextCalibratorList <em>Context Calibrator List</em>}</li>
 *   <li>{@link org.omg.space.xtce.IntegerDataEncodingType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.IntegerDataEncodingType#getSizeInBits <em>Size In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getIntegerDataEncodingType()
 * @model extendedMetaData="name='IntegerDataEncodingType' kind='elementOnly'"
 * @generated
 */
public interface IntegerDataEncodingType extends DataEncodingType {
	/**
	 * Returns the value of the '<em><b>Default Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Calibrator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Calibrator</em>' containment reference.
	 * @see #setDefaultCalibrator(CalibratorType)
	 * @see org.omg.space.xtce.XtcePackage#getIntegerDataEncodingType_DefaultCalibrator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DefaultCalibrator' namespace='##targetNamespace'"
	 * @generated
	 */
	CalibratorType getDefaultCalibrator();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.IntegerDataEncodingType#getDefaultCalibrator <em>Default Calibrator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Calibrator</em>' containment reference.
	 * @see #getDefaultCalibrator()
	 * @generated
	 */
	void setDefaultCalibrator(CalibratorType value);

	/**
	 * Returns the value of the '<em><b>Context Calibrator List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use when different calibrations must be used on the Parameter in different contexts.  Use the first one that tests true
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Calibrator List</em>' containment reference.
	 * @see #setContextCalibratorList(ContextCalibratorListType)
	 * @see org.omg.space.xtce.XtcePackage#getIntegerDataEncodingType_ContextCalibratorList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContextCalibratorList' namespace='##targetNamespace'"
	 * @generated
	 */
	ContextCalibratorListType getContextCalibratorList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.IntegerDataEncodingType#getContextCalibratorList <em>Context Calibrator List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Calibrator List</em>' containment reference.
	 * @see #getContextCalibratorList()
	 * @generated
	 */
	void setContextCalibratorList(ContextCalibratorListType value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * The default value is <code>"unsigned"</code>.
	 * The literals are from the enumeration {@link org.omg.space.xtce.EncodingType2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see org.omg.space.xtce.EncodingType2
	 * @see #isSetEncoding()
	 * @see #unsetEncoding()
	 * @see #setEncoding(EncodingType2)
	 * @see org.omg.space.xtce.XtcePackage#getIntegerDataEncodingType_Encoding()
	 * @model default="unsigned" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	EncodingType2 getEncoding();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.IntegerDataEncodingType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see org.omg.space.xtce.EncodingType2
	 * @see #isSetEncoding()
	 * @see #unsetEncoding()
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(EncodingType2 value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.IntegerDataEncodingType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEncoding()
	 * @see #getEncoding()
	 * @see #setEncoding(EncodingType2)
	 * @generated
	 */
	void unsetEncoding();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.IntegerDataEncodingType#getEncoding <em>Encoding</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Encoding</em>' attribute is set.
	 * @see #unsetEncoding()
	 * @see #getEncoding()
	 * @see #setEncoding(EncodingType2)
	 * @generated
	 */
	boolean isSetEncoding();

	/**
	 * Returns the value of the '<em><b>Size In Bits</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size In Bits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size In Bits</em>' attribute.
	 * @see #isSetSizeInBits()
	 * @see #unsetSizeInBits()
	 * @see #setSizeInBits(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getIntegerDataEncodingType_SizeInBits()
	 * @model default="8" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='sizeInBits'"
	 * @generated
	 */
	BigInteger getSizeInBits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.IntegerDataEncodingType#getSizeInBits <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In Bits</em>' attribute.
	 * @see #isSetSizeInBits()
	 * @see #unsetSizeInBits()
	 * @see #getSizeInBits()
	 * @generated
	 */
	void setSizeInBits(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.IntegerDataEncodingType#getSizeInBits <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeInBits()
	 * @see #getSizeInBits()
	 * @see #setSizeInBits(BigInteger)
	 * @generated
	 */
	void unsetSizeInBits();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.IntegerDataEncodingType#getSizeInBits <em>Size In Bits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size In Bits</em>' attribute is set.
	 * @see #unsetSizeInBits()
	 * @see #getSizeInBits()
	 * @see #setSizeInBits(BigInteger)
	 * @generated
	 */
	boolean isSetSizeInBits();

} // IntegerDataEncodingType
