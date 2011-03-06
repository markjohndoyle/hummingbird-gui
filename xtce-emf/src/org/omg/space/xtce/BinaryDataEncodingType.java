/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Data Encoding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * For binary data or for integer, float, string, or time data that is not in any of the known encoding formats.  For any data that is not encoded in any of the known integer, float, string, or time data formats use a To/From transform algorithm.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.BinaryDataEncodingType#getSizeInBits <em>Size In Bits</em>}</li>
 *   <li>{@link org.omg.space.xtce.BinaryDataEncodingType#getFromBinaryTransformAlgorithm <em>From Binary Transform Algorithm</em>}</li>
 *   <li>{@link org.omg.space.xtce.BinaryDataEncodingType#getToBinaryTransformAlgorithm <em>To Binary Transform Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getBinaryDataEncodingType()
 * @model extendedMetaData="name='BinaryDataEncodingType' kind='elementOnly'"
 * @generated
 */
public interface BinaryDataEncodingType extends DataEncodingType {
	/**
	 * Returns the value of the '<em><b>Size In Bits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size In Bits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size In Bits</em>' containment reference.
	 * @see #setSizeInBits(IntegerValueType)
	 * @see org.omg.space.xtce.XtcePackage#getBinaryDataEncodingType_SizeInBits()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SizeInBits' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerValueType getSizeInBits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BinaryDataEncodingType#getSizeInBits <em>Size In Bits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In Bits</em>' containment reference.
	 * @see #getSizeInBits()
	 * @generated
	 */
	void setSizeInBits(IntegerValueType value);

	/**
	 * Returns the value of the '<em><b>From Binary Transform Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to convert binary data to an application data type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Binary Transform Algorithm</em>' containment reference.
	 * @see #setFromBinaryTransformAlgorithm(InputAlgorithmType)
	 * @see org.omg.space.xtce.XtcePackage#getBinaryDataEncodingType_FromBinaryTransformAlgorithm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FromBinaryTransformAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	InputAlgorithmType getFromBinaryTransformAlgorithm();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BinaryDataEncodingType#getFromBinaryTransformAlgorithm <em>From Binary Transform Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Binary Transform Algorithm</em>' containment reference.
	 * @see #getFromBinaryTransformAlgorithm()
	 * @generated
	 */
	void setFromBinaryTransformAlgorithm(InputAlgorithmType value);

	/**
	 * Returns the value of the '<em><b>To Binary Transform Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to convert binary data from an application data type to binary data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Binary Transform Algorithm</em>' containment reference.
	 * @see #setToBinaryTransformAlgorithm(InputAlgorithmType)
	 * @see org.omg.space.xtce.XtcePackage#getBinaryDataEncodingType_ToBinaryTransformAlgorithm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ToBinaryTransformAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	InputAlgorithmType getToBinaryTransformAlgorithm();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BinaryDataEncodingType#getToBinaryTransformAlgorithm <em>To Binary Transform Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Binary Transform Algorithm</em>' containment reference.
	 * @see #getToBinaryTransformAlgorithm()
	 * @generated
	 */
	void setToBinaryTransformAlgorithm(InputAlgorithmType value);

} // BinaryDataEncodingType
