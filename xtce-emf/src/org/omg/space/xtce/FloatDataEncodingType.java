/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Data Encoding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * For common encodings of floating point data
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.FloatDataEncodingType#getDefaultCalibrator <em>Default Calibrator</em>}</li>
 *   <li>{@link org.omg.space.xtce.FloatDataEncodingType#getContextCalibratorList <em>Context Calibrator List</em>}</li>
 *   <li>{@link org.omg.space.xtce.FloatDataEncodingType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.FloatDataEncodingType#getSizeInBits <em>Size In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getFloatDataEncodingType()
 * @model extendedMetaData="name='FloatDataEncodingType' kind='elementOnly'"
 * @generated
 */
public interface FloatDataEncodingType extends DataEncodingType {
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
	 * @see org.omg.space.xtce.XtcePackage#getFloatDataEncodingType_DefaultCalibrator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DefaultCalibrator' namespace='##targetNamespace'"
	 * @generated
	 */
	CalibratorType getDefaultCalibrator();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.FloatDataEncodingType#getDefaultCalibrator <em>Default Calibrator</em>}' containment reference.
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
	 * @see #setContextCalibratorList(ContextCalibratorListType4)
	 * @see org.omg.space.xtce.XtcePackage#getFloatDataEncodingType_ContextCalibratorList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContextCalibratorList' namespace='##targetNamespace'"
	 * @generated
	 */
	ContextCalibratorListType4 getContextCalibratorList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.FloatDataEncodingType#getContextCalibratorList <em>Context Calibrator List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Calibrator List</em>' containment reference.
	 * @see #getContextCalibratorList()
	 * @generated
	 */
	void setContextCalibratorList(ContextCalibratorListType4 value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * The default value is <code>"IEEE754_1985"</code>.
	 * The literals are from the enumeration {@link org.omg.space.xtce.EncodingType3}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see org.omg.space.xtce.EncodingType3
	 * @see #isSetEncoding()
	 * @see #unsetEncoding()
	 * @see #setEncoding(EncodingType3)
	 * @see org.omg.space.xtce.XtcePackage#getFloatDataEncodingType_Encoding()
	 * @model default="IEEE754_1985" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	EncodingType3 getEncoding();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.FloatDataEncodingType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see org.omg.space.xtce.EncodingType3
	 * @see #isSetEncoding()
	 * @see #unsetEncoding()
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(EncodingType3 value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.FloatDataEncodingType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEncoding()
	 * @see #getEncoding()
	 * @see #setEncoding(EncodingType3)
	 * @generated
	 */
	void unsetEncoding();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.FloatDataEncodingType#getEncoding <em>Encoding</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Encoding</em>' attribute is set.
	 * @see #unsetEncoding()
	 * @see #getEncoding()
	 * @see #setEncoding(EncodingType3)
	 * @generated
	 */
	boolean isSetEncoding();

	/**
	 * Returns the value of the '<em><b>Size In Bits</b></em>' attribute.
	 * The default value is <code>"32"</code>.
	 * The literals are from the enumeration {@link org.omg.space.xtce.SizeInBitsType2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size In Bits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size In Bits</em>' attribute.
	 * @see org.omg.space.xtce.SizeInBitsType2
	 * @see #isSetSizeInBits()
	 * @see #unsetSizeInBits()
	 * @see #setSizeInBits(SizeInBitsType2)
	 * @see org.omg.space.xtce.XtcePackage#getFloatDataEncodingType_SizeInBits()
	 * @model default="32" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='sizeInBits'"
	 * @generated
	 */
	SizeInBitsType2 getSizeInBits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.FloatDataEncodingType#getSizeInBits <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In Bits</em>' attribute.
	 * @see org.omg.space.xtce.SizeInBitsType2
	 * @see #isSetSizeInBits()
	 * @see #unsetSizeInBits()
	 * @see #getSizeInBits()
	 * @generated
	 */
	void setSizeInBits(SizeInBitsType2 value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.FloatDataEncodingType#getSizeInBits <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeInBits()
	 * @see #getSizeInBits()
	 * @see #setSizeInBits(SizeInBitsType2)
	 * @generated
	 */
	void unsetSizeInBits();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.FloatDataEncodingType#getSizeInBits <em>Size In Bits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size In Bits</em>' attribute is set.
	 * @see #unsetSizeInBits()
	 * @see #getSizeInBits()
	 * @see #setSizeInBits(SizeInBitsType2)
	 * @generated
	 */
	boolean isSetSizeInBits();

} // FloatDataEncodingType
