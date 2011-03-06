/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Stream Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A stream type where some level of custom processing (e.g. convolutional, encryption, compression) is performed.  Has a reference to external algorithms for encoding and decoding algorithms.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.CustomStreamType#getEncodingAlgorithm <em>Encoding Algorithm</em>}</li>
 *   <li>{@link org.omg.space.xtce.CustomStreamType#getDecodingAlgorithm <em>Decoding Algorithm</em>}</li>
 *   <li>{@link org.omg.space.xtce.CustomStreamType#getDecodedStreamRef <em>Decoded Stream Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.CustomStreamType#getEncodedStreamRef <em>Encoded Stream Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getCustomStreamType()
 * @model extendedMetaData="name='CustomStreamType' kind='elementOnly'"
 * @generated
 */
public interface CustomStreamType extends PCMStreamType {
	/**
	 * Returns the value of the '<em><b>Encoding Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding Algorithm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding Algorithm</em>' containment reference.
	 * @see #setEncodingAlgorithm(InputAlgorithmType)
	 * @see org.omg.space.xtce.XtcePackage#getCustomStreamType_EncodingAlgorithm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EncodingAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	InputAlgorithmType getEncodingAlgorithm();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CustomStreamType#getEncodingAlgorithm <em>Encoding Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding Algorithm</em>' containment reference.
	 * @see #getEncodingAlgorithm()
	 * @generated
	 */
	void setEncodingAlgorithm(InputAlgorithmType value);

	/**
	 * Returns the value of the '<em><b>Decoding Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Algorithm outputs may be used to set decoding quality parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decoding Algorithm</em>' containment reference.
	 * @see #setDecodingAlgorithm(InputOutputAlgorithmType)
	 * @see org.omg.space.xtce.XtcePackage#getCustomStreamType_DecodingAlgorithm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DecodingAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	InputOutputAlgorithmType getDecodingAlgorithm();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CustomStreamType#getDecodingAlgorithm <em>Decoding Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decoding Algorithm</em>' containment reference.
	 * @see #getDecodingAlgorithm()
	 * @generated
	 */
	void setDecodingAlgorithm(InputOutputAlgorithmType value);

	/**
	 * Returns the value of the '<em><b>Decoded Stream Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decoded Stream Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoded Stream Ref</em>' attribute.
	 * @see #setDecodedStreamRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getCustomStreamType_DecodedStreamRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='decodedStreamRef'"
	 * @generated
	 */
	String getDecodedStreamRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CustomStreamType#getDecodedStreamRef <em>Decoded Stream Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decoded Stream Ref</em>' attribute.
	 * @see #getDecodedStreamRef()
	 * @generated
	 */
	void setDecodedStreamRef(String value);

	/**
	 * Returns the value of the '<em><b>Encoded Stream Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoded Stream Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoded Stream Ref</em>' attribute.
	 * @see #setEncodedStreamRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getCustomStreamType_EncodedStreamRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='encodedStreamRef'"
	 * @generated
	 */
	String getEncodedStreamRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CustomStreamType#getEncodedStreamRef <em>Encoded Stream Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoded Stream Ref</em>' attribute.
	 * @see #getEncodedStreamRef()
	 * @generated
	 */
	void setEncodedStreamRef(String value);

} // CustomStreamType
