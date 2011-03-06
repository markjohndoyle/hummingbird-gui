/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Data Encoding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * For common encodings of string data
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.StringDataEncodingType#getDefaultCalibrator <em>Default Calibrator</em>}</li>
 *   <li>{@link org.omg.space.xtce.StringDataEncodingType#getContextCalibratorList <em>Context Calibrator List</em>}</li>
 *   <li>{@link org.omg.space.xtce.StringDataEncodingType#getSizeInBits <em>Size In Bits</em>}</li>
 *   <li>{@link org.omg.space.xtce.StringDataEncodingType#getEncoding <em>Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getStringDataEncodingType()
 * @model extendedMetaData="name='StringDataEncodingType' kind='elementOnly'"
 * @generated
 */
public interface StringDataEncodingType extends DataEncodingType {
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
	 * @see org.omg.space.xtce.XtcePackage#getStringDataEncodingType_DefaultCalibrator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DefaultCalibrator' namespace='##targetNamespace'"
	 * @generated
	 */
	CalibratorType getDefaultCalibrator();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.StringDataEncodingType#getDefaultCalibrator <em>Default Calibrator</em>}' containment reference.
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
	 * @see #setContextCalibratorList(ContextCalibratorListType2)
	 * @see org.omg.space.xtce.XtcePackage#getStringDataEncodingType_ContextCalibratorList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContextCalibratorList' namespace='##targetNamespace'"
	 * @generated
	 */
	ContextCalibratorListType2 getContextCalibratorList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.StringDataEncodingType#getContextCalibratorList <em>Context Calibrator List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Calibrator List</em>' containment reference.
	 * @see #getContextCalibratorList()
	 * @generated
	 */
	void setContextCalibratorList(ContextCalibratorListType2 value);

	/**
	 * Returns the value of the '<em><b>Size In Bits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size In Bits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size In Bits</em>' containment reference.
	 * @see #setSizeInBits(SizeInBitsType)
	 * @see org.omg.space.xtce.XtcePackage#getStringDataEncodingType_SizeInBits()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SizeInBits' namespace='##targetNamespace'"
	 * @generated
	 */
	SizeInBitsType getSizeInBits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.StringDataEncodingType#getSizeInBits <em>Size In Bits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In Bits</em>' containment reference.
	 * @see #getSizeInBits()
	 * @generated
	 */
	void setSizeInBits(SizeInBitsType value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * The default value is <code>"UTF-8"</code>.
	 * The literals are from the enumeration {@link org.omg.space.xtce.EncodingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see org.omg.space.xtce.EncodingType
	 * @see #isSetEncoding()
	 * @see #unsetEncoding()
	 * @see #setEncoding(EncodingType)
	 * @see org.omg.space.xtce.XtcePackage#getStringDataEncodingType_Encoding()
	 * @model default="UTF-8" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	EncodingType getEncoding();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.StringDataEncodingType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see org.omg.space.xtce.EncodingType
	 * @see #isSetEncoding()
	 * @see #unsetEncoding()
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(EncodingType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.StringDataEncodingType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEncoding()
	 * @see #getEncoding()
	 * @see #setEncoding(EncodingType)
	 * @generated
	 */
	void unsetEncoding();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.StringDataEncodingType#getEncoding <em>Encoding</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Encoding</em>' attribute is set.
	 * @see #unsetEncoding()
	 * @see #getEncoding()
	 * @see #setEncoding(EncodingType)
	 * @generated
	 */
	boolean isSetEncoding();

} // StringDataEncodingType
