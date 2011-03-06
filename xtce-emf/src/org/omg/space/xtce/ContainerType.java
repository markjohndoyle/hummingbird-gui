/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract block of data; used as the base type for more specific container types
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ContainerType#getDefaultRateInStream <em>Default Rate In Stream</em>}</li>
 *   <li>{@link org.omg.space.xtce.ContainerType#getRateInStreamSet <em>Rate In Stream Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.ContainerType#getBinaryEncoding <em>Binary Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getContainerType()
 * @model abstract="true"
 *        extendedMetaData="name='ContainerType' kind='elementOnly'"
 * @generated
 */
public interface ContainerType extends NameDescriptionType {
	/**
	 * Returns the value of the '<em><b>Default Rate In Stream</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Rate In Stream</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Rate In Stream</em>' containment reference.
	 * @see #setDefaultRateInStream(RateInStreamType1)
	 * @see org.omg.space.xtce.XtcePackage#getContainerType_DefaultRateInStream()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DefaultRateInStream' namespace='##targetNamespace'"
	 * @generated
	 */
	RateInStreamType1 getDefaultRateInStream();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ContainerType#getDefaultRateInStream <em>Default Rate In Stream</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Rate In Stream</em>' containment reference.
	 * @see #getDefaultRateInStream()
	 * @generated
	 */
	void setDefaultRateInStream(RateInStreamType1 value);

	/**
	 * Returns the value of the '<em><b>Rate In Stream Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate In Stream Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate In Stream Set</em>' containment reference.
	 * @see #setRateInStreamSet(RateInStreamSetType)
	 * @see org.omg.space.xtce.XtcePackage#getContainerType_RateInStreamSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RateInStreamSet' namespace='##targetNamespace'"
	 * @generated
	 */
	RateInStreamSetType getRateInStreamSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ContainerType#getRateInStreamSet <em>Rate In Stream Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate In Stream Set</em>' containment reference.
	 * @see #getRateInStreamSet()
	 * @generated
	 */
	void setRateInStreamSet(RateInStreamSetType value);

	/**
	 * Returns the value of the '<em><b>Binary Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * May be used to indicate error detection and correction, chage byte order,  provide the size (when it can't be derived), or perform some custom processing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Encoding</em>' containment reference.
	 * @see #setBinaryEncoding(BinaryDataEncodingType)
	 * @see org.omg.space.xtce.XtcePackage#getContainerType_BinaryEncoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BinaryEncoding' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryDataEncodingType getBinaryEncoding();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ContainerType#getBinaryEncoding <em>Binary Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Encoding</em>' containment reference.
	 * @see #getBinaryEncoding()
	 * @generated
	 */
	void setBinaryEncoding(BinaryDataEncodingType value);

} // ContainerType
