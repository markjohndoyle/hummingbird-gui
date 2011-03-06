/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract type that is a super type of either an Integer or Float Data type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.NumericDataType#getToString <em>To String</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumericDataType#getValidRange <em>Valid Range</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumericDataType#getDefaultCalibrator <em>Default Calibrator</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumericDataType#getContextCalibratorList <em>Context Calibrator List</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumericDataType#isValidRangeAppliesToCalibrated <em>Valid Range Applies To Calibrated</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getNumericDataType()
 * @model extendedMetaData="name='NumericDataType' kind='elementOnly'"
 * @generated
 */
public interface NumericDataType extends BaseDataType {
	/**
	 * Returns the value of the '<em><b>To String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To String</em>' containment reference.
	 * @see #setToString(NumberToStringType)
	 * @see org.omg.space.xtce.XtcePackage#getNumericDataType_ToString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ToString' namespace='##targetNamespace'"
	 * @generated
	 */
	NumberToStringType getToString();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumericDataType#getToString <em>To String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To String</em>' containment reference.
	 * @see #getToString()
	 * @generated
	 */
	void setToString(NumberToStringType value);

	/**
	 * Returns the value of the '<em><b>Valid Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Range</em>' containment reference.
	 * @see #setValidRange(ValidRangeType)
	 * @see org.omg.space.xtce.XtcePackage#getNumericDataType_ValidRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValidRange' namespace='##targetNamespace'"
	 * @generated
	 */
	ValidRangeType getValidRange();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumericDataType#getValidRange <em>Valid Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Range</em>' containment reference.
	 * @see #getValidRange()
	 * @generated
	 */
	void setValidRange(ValidRangeType value);

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
	 * @see org.omg.space.xtce.XtcePackage#getNumericDataType_DefaultCalibrator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DefaultCalibrator' namespace='##targetNamespace'"
	 * @generated
	 */
	CalibratorType getDefaultCalibrator();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumericDataType#getDefaultCalibrator <em>Default Calibrator</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Context Calibrator List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Calibrator List</em>' containment reference.
	 * @see #setContextCalibratorList(ContextCalibratorListType3)
	 * @see org.omg.space.xtce.XtcePackage#getNumericDataType_ContextCalibratorList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContextCalibratorList' namespace='##targetNamespace'"
	 * @generated
	 */
	ContextCalibratorListType3 getContextCalibratorList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumericDataType#getContextCalibratorList <em>Context Calibrator List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Calibrator List</em>' containment reference.
	 * @see #getContextCalibratorList()
	 * @generated
	 */
	void setContextCalibratorList(ContextCalibratorListType3 value);

	/**
	 * Returns the value of the '<em><b>Valid Range Applies To Calibrated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Range Applies To Calibrated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Range Applies To Calibrated</em>' attribute.
	 * @see #isSetValidRangeAppliesToCalibrated()
	 * @see #unsetValidRangeAppliesToCalibrated()
	 * @see #setValidRangeAppliesToCalibrated(boolean)
	 * @see org.omg.space.xtce.XtcePackage#getNumericDataType_ValidRangeAppliesToCalibrated()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='validRangeAppliesToCalibrated'"
	 * @generated
	 */
	boolean isValidRangeAppliesToCalibrated();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumericDataType#isValidRangeAppliesToCalibrated <em>Valid Range Applies To Calibrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Range Applies To Calibrated</em>' attribute.
	 * @see #isSetValidRangeAppliesToCalibrated()
	 * @see #unsetValidRangeAppliesToCalibrated()
	 * @see #isValidRangeAppliesToCalibrated()
	 * @generated
	 */
	void setValidRangeAppliesToCalibrated(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.NumericDataType#isValidRangeAppliesToCalibrated <em>Valid Range Applies To Calibrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidRangeAppliesToCalibrated()
	 * @see #isValidRangeAppliesToCalibrated()
	 * @see #setValidRangeAppliesToCalibrated(boolean)
	 * @generated
	 */
	void unsetValidRangeAppliesToCalibrated();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.NumericDataType#isValidRangeAppliesToCalibrated <em>Valid Range Applies To Calibrated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valid Range Applies To Calibrated</em>' attribute is set.
	 * @see #unsetValidRangeAppliesToCalibrated()
	 * @see #isValidRangeAppliesToCalibrated()
	 * @see #setValidRangeAppliesToCalibrated(boolean)
	 * @generated
	 */
	boolean isSetValidRangeAppliesToCalibrated();

} // NumericDataType
