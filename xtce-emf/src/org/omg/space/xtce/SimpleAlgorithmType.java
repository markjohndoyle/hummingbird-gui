/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Algorithm Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The simplest form of algorithm, a SimpleAlgorithmType contains an area for a free-form pseudo code description of the algorithm plus a Set of references to external algorithms.  External algorithms are usually unique to a ground system type.   Multiple external algorithms are possible because XTCE documents may be used across multiple ground systems.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.SimpleAlgorithmType#getAlgorithmText <em>Algorithm Text</em>}</li>
 *   <li>{@link org.omg.space.xtce.SimpleAlgorithmType#getExternalAlgorithmSet <em>External Algorithm Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getSimpleAlgorithmType()
 * @model extendedMetaData="name='SimpleAlgorithmType' kind='elementOnly'"
 * @generated
 */
public interface SimpleAlgorithmType extends NameDescriptionType {
	/**
	 * Returns the value of the '<em><b>Algorithm Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This optional element may be used to enter Pseudo or actual code for the algorithm.  The language for the algorithm is specified with the language attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithm Text</em>' containment reference.
	 * @see #setAlgorithmText(AlgorithmTextType)
	 * @see org.omg.space.xtce.XtcePackage#getSimpleAlgorithmType_AlgorithmText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AlgorithmText' namespace='##targetNamespace'"
	 * @generated
	 */
	AlgorithmTextType getAlgorithmText();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SimpleAlgorithmType#getAlgorithmText <em>Algorithm Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Text</em>' containment reference.
	 * @see #getAlgorithmText()
	 * @generated
	 */
	void setAlgorithmText(AlgorithmTextType value);

	/**
	 * Returns the value of the '<em><b>External Algorithm Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Algorithm Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Algorithm Set</em>' containment reference.
	 * @see #setExternalAlgorithmSet(ExternalAlgorithmSetType)
	 * @see org.omg.space.xtce.XtcePackage#getSimpleAlgorithmType_ExternalAlgorithmSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExternalAlgorithmSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalAlgorithmSetType getExternalAlgorithmSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SimpleAlgorithmType#getExternalAlgorithmSet <em>External Algorithm Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Algorithm Set</em>' containment reference.
	 * @see #getExternalAlgorithmSet()
	 * @generated
	 */
	void setExternalAlgorithmSet(ExternalAlgorithmSetType value);

} // SimpleAlgorithmType
