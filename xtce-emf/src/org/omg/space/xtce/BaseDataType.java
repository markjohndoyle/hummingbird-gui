/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract type used by within the schema to derive other data types by the ground system.  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.BaseDataType#getUnitSet <em>Unit Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.BaseDataType#getBinaryDataEncoding <em>Binary Data Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.BaseDataType#getFloatDataEncoding <em>Float Data Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.BaseDataType#getIntegerDataEncoding <em>Integer Data Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.BaseDataType#getStringDataEncoding <em>String Data Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getBaseDataType()
 * @model abstract="true"
 *        extendedMetaData="name='BaseDataType' kind='elementOnly'"
 * @generated
 */
public interface BaseDataType extends NameDescriptionType {
	/**
	 * Returns the value of the '<em><b>Unit Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Set</em>' containment reference.
	 * @see #setUnitSet(UnitSetType)
	 * @see org.omg.space.xtce.XtcePackage#getBaseDataType_UnitSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UnitSet' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitSetType getUnitSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BaseDataType#getUnitSet <em>Unit Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Set</em>' containment reference.
	 * @see #getUnitSet()
	 * @generated
	 */
	void setUnitSet(UnitSetType value);

	/**
	 * Returns the value of the '<em><b>Binary Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Data Encoding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Data Encoding</em>' containment reference.
	 * @see #setBinaryDataEncoding(BinaryDataEncodingType)
	 * @see org.omg.space.xtce.XtcePackage#getBaseDataType_BinaryDataEncoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BinaryDataEncoding' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryDataEncodingType getBinaryDataEncoding();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BaseDataType#getBinaryDataEncoding <em>Binary Data Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Data Encoding</em>' containment reference.
	 * @see #getBinaryDataEncoding()
	 * @generated
	 */
	void setBinaryDataEncoding(BinaryDataEncodingType value);

	/**
	 * Returns the value of the '<em><b>Float Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float Data Encoding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float Data Encoding</em>' containment reference.
	 * @see #setFloatDataEncoding(FloatDataEncodingType)
	 * @see org.omg.space.xtce.XtcePackage#getBaseDataType_FloatDataEncoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FloatDataEncoding' namespace='##targetNamespace'"
	 * @generated
	 */
	FloatDataEncodingType getFloatDataEncoding();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BaseDataType#getFloatDataEncoding <em>Float Data Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float Data Encoding</em>' containment reference.
	 * @see #getFloatDataEncoding()
	 * @generated
	 */
	void setFloatDataEncoding(FloatDataEncodingType value);

	/**
	 * Returns the value of the '<em><b>Integer Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Data Encoding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Data Encoding</em>' containment reference.
	 * @see #setIntegerDataEncoding(IntegerDataEncodingType)
	 * @see org.omg.space.xtce.XtcePackage#getBaseDataType_IntegerDataEncoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IntegerDataEncoding' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerDataEncodingType getIntegerDataEncoding();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BaseDataType#getIntegerDataEncoding <em>Integer Data Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Data Encoding</em>' containment reference.
	 * @see #getIntegerDataEncoding()
	 * @generated
	 */
	void setIntegerDataEncoding(IntegerDataEncodingType value);

	/**
	 * Returns the value of the '<em><b>String Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Data Encoding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Data Encoding</em>' containment reference.
	 * @see #setStringDataEncoding(StringDataEncodingType)
	 * @see org.omg.space.xtce.XtcePackage#getBaseDataType_StringDataEncoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StringDataEncoding' namespace='##targetNamespace'"
	 * @generated
	 */
	StringDataEncodingType getStringDataEncoding();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BaseDataType#getStringDataEncoding <em>String Data Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Data Encoding</em>' containment reference.
	 * @see #getStringDataEncoding()
	 * @generated
	 */
	void setStringDataEncoding(StringDataEncodingType value);

} // BaseDataType
