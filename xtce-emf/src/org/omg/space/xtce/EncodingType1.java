/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encoding Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.EncodingType1#getBinaryDataEncoding <em>Binary Data Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.EncodingType1#getFloatDataEncoding <em>Float Data Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.EncodingType1#getIntegerDataEncoding <em>Integer Data Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.EncodingType1#getStringDataEncoding <em>String Data Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.EncodingType1#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.omg.space.xtce.EncodingType1#getScale <em>Scale</em>}</li>
 *   <li>{@link org.omg.space.xtce.EncodingType1#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getEncodingType1()
 * @model extendedMetaData="name='Encoding_._type' kind='elementOnly'"
 * @generated
 */
public interface EncodingType1 extends EObject {
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
	 * @see org.omg.space.xtce.XtcePackage#getEncodingType1_BinaryDataEncoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BinaryDataEncoding' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryDataEncodingType getBinaryDataEncoding();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.EncodingType1#getBinaryDataEncoding <em>Binary Data Encoding</em>}' containment reference.
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
	 * @see org.omg.space.xtce.XtcePackage#getEncodingType1_FloatDataEncoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FloatDataEncoding' namespace='##targetNamespace'"
	 * @generated
	 */
	FloatDataEncodingType getFloatDataEncoding();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.EncodingType1#getFloatDataEncoding <em>Float Data Encoding</em>}' containment reference.
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
	 * @see org.omg.space.xtce.XtcePackage#getEncodingType1_IntegerDataEncoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IntegerDataEncoding' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerDataEncodingType getIntegerDataEncoding();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.EncodingType1#getIntegerDataEncoding <em>Integer Data Encoding</em>}' containment reference.
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
	 * @see org.omg.space.xtce.XtcePackage#getEncodingType1_StringDataEncoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StringDataEncoding' namespace='##targetNamespace'"
	 * @generated
	 */
	StringDataEncodingType getStringDataEncoding();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.EncodingType1#getStringDataEncoding <em>String Data Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Data Encoding</em>' containment reference.
	 * @see #getStringDataEncoding()
	 * @generated
	 */
	void setStringDataEncoding(StringDataEncodingType value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #setOffset(double)
	 * @see org.omg.space.xtce.XtcePackage#getEncodingType1_Offset()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='offset'"
	 * @generated
	 */
	double getOffset();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.EncodingType1#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(double value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.EncodingType1#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOffset()
	 * @see #getOffset()
	 * @see #setOffset(double)
	 * @generated
	 */
	void unsetOffset();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.EncodingType1#getOffset <em>Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Offset</em>' attribute is set.
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @see #setOffset(double)
	 * @generated
	 */
	boolean isSetOffset();

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #setScale(double)
	 * @see org.omg.space.xtce.XtcePackage#getEncodingType1_Scale()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='scale'"
	 * @generated
	 */
	double getScale();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.EncodingType1#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #getScale()
	 * @generated
	 */
	void setScale(double value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.EncodingType1#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScale()
	 * @see #getScale()
	 * @see #setScale(double)
	 * @generated
	 */
	void unsetScale();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.EncodingType1#getScale <em>Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scale</em>' attribute is set.
	 * @see #unsetScale()
	 * @see #getScale()
	 * @see #setScale(double)
	 * @generated
	 */
	boolean isSetScale();

	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * The default value is <code>"seconds"</code>.
	 * The literals are from the enumeration {@link org.omg.space.xtce.UnitsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see org.omg.space.xtce.UnitsType
	 * @see #isSetUnits()
	 * @see #unsetUnits()
	 * @see #setUnits(UnitsType)
	 * @see org.omg.space.xtce.XtcePackage#getEncodingType1_Units()
	 * @model default="seconds" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='units'"
	 * @generated
	 */
	UnitsType getUnits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.EncodingType1#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see org.omg.space.xtce.UnitsType
	 * @see #isSetUnits()
	 * @see #unsetUnits()
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(UnitsType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.EncodingType1#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnits()
	 * @see #getUnits()
	 * @see #setUnits(UnitsType)
	 * @generated
	 */
	void unsetUnits();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.EncodingType1#getUnits <em>Units</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Units</em>' attribute is set.
	 * @see #unsetUnits()
	 * @see #getUnits()
	 * @see #setUnits(UnitsType)
	 * @generated
	 */
	boolean isSetUnits();

} // EncodingType1
