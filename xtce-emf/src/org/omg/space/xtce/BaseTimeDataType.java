/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Time Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract type used by within the schema to describe derive other data types by the ground system.  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.BaseTimeDataType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.BaseTimeDataType#getReferenceTime <em>Reference Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getBaseTimeDataType()
 * @model abstract="true"
 *        extendedMetaData="name='BaseTimeDataType' kind='elementOnly'"
 * @generated
 */
public interface BaseTimeDataType extends NameDescriptionType {
	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scale and offset are used in a y =mx +b type relationship (m is the scale and b is the offset) to make adjustmets to the encoded value to that it matches the time units.  Binary Encoded time is typically used with a user supplied transform algorithm to convert time data formats that are too difficult to describe in XTCE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encoding</em>' containment reference.
	 * @see #setEncoding(EncodingType1)
	 * @see org.omg.space.xtce.XtcePackage#getBaseTimeDataType_Encoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Encoding' namespace='##targetNamespace'"
	 * @generated
	 */
	EncodingType1 getEncoding();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BaseTimeDataType#getEncoding <em>Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' containment reference.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(EncodingType1 value);

	/**
	 * Returns the value of the '<em><b>Reference Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Time</em>' containment reference.
	 * @see #setReferenceTime(ReferenceTimeType)
	 * @see org.omg.space.xtce.XtcePackage#getBaseTimeDataType_ReferenceTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferenceTime' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceTimeType getReferenceTime();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BaseTimeDataType#getReferenceTime <em>Reference Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Time</em>' containment reference.
	 * @see #getReferenceTime()
	 * @generated
	 */
	void setReferenceTime(ReferenceTimeType value);

} // BaseTimeDataType
