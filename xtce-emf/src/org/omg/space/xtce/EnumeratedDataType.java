/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains an enumerated value - a value that has both an integral and a string representation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.EnumeratedDataType#getEnumerationList <em>Enumeration List</em>}</li>
 *   <li>{@link org.omg.space.xtce.EnumeratedDataType#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getEnumeratedDataType()
 * @model extendedMetaData="name='EnumeratedDataType' kind='elementOnly'"
 * @generated
 */
public interface EnumeratedDataType extends BaseDataType {
	/**
	 * Returns the value of the '<em><b>Enumeration List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration List</em>' containment reference.
	 * @see #setEnumerationList(EnumerationListType)
	 * @see org.omg.space.xtce.XtcePackage#getEnumeratedDataType_EnumerationList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EnumerationList' namespace='##targetNamespace'"
	 * @generated
	 */
	EnumerationListType getEnumerationList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.EnumeratedDataType#getEnumerationList <em>Enumeration List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration List</em>' containment reference.
	 * @see #getEnumerationList()
	 * @generated
	 */
	void setEnumerationList(EnumerationListType value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(String)
	 * @see org.omg.space.xtce.XtcePackage#getEnumeratedDataType_InitialValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='initialValue'"
	 * @generated
	 */
	String getInitialValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.EnumeratedDataType#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(String value);

} // EnumeratedDataType
