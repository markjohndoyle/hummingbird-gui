/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Algorithm Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of labeled inputs is added to the SimpleAlgorithmType
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.InputAlgorithmType#getInputSet <em>Input Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getInputAlgorithmType()
 * @model extendedMetaData="name='InputAlgorithmType' kind='elementOnly'"
 * @generated
 */
public interface InputAlgorithmType extends SimpleAlgorithmType {
	/**
	 * Returns the value of the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set</em>' containment reference.
	 * @see #setInputSet(InputSetType)
	 * @see org.omg.space.xtce.XtcePackage#getInputAlgorithmType_InputSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InputSet' namespace='##targetNamespace'"
	 * @generated
	 */
	InputSetType getInputSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.InputAlgorithmType#getInputSet <em>Input Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Set</em>' containment reference.
	 * @see #getInputSet()
	 * @generated
	 */
	void setInputSet(InputSetType value);

} // InputAlgorithmType
