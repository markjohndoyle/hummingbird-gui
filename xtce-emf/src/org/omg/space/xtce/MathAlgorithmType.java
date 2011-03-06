/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Math Algorithm Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A simple mathematical operation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.MathAlgorithmType#getMathOperation <em>Math Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getMathAlgorithmType()
 * @model extendedMetaData="name='MathAlgorithmType' kind='elementOnly'"
 * @generated
 */
public interface MathAlgorithmType extends NameDescriptionType {
	/**
	 * Returns the value of the '<em><b>Math Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Math Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Math Operation</em>' containment reference.
	 * @see #setMathOperation(MathOperationType1)
	 * @see org.omg.space.xtce.XtcePackage#getMathAlgorithmType_MathOperation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MathOperation' namespace='##targetNamespace'"
	 * @generated
	 */
	MathOperationType1 getMathOperation();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MathAlgorithmType#getMathOperation <em>Math Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Math Operation</em>' containment reference.
	 * @see #getMathOperation()
	 * @generated
	 */
	void setMathOperation(MathOperationType1 value);

} // MathAlgorithmType
