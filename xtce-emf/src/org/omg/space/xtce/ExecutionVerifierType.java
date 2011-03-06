/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Verifier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ExecutionVerifierType#getPercentComplete <em>Percent Complete</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getExecutionVerifierType()
 * @model extendedMetaData="name='ExecutionVerifier_._type' kind='elementOnly'"
 * @generated
 */
public interface ExecutionVerifierType extends CommandVerifierType {
	/**
	 * Returns the value of the '<em><b>Percent Complete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percent Complete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent Complete</em>' containment reference.
	 * @see #setPercentComplete(DecimalValueType)
	 * @see org.omg.space.xtce.XtcePackage#getExecutionVerifierType_PercentComplete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PercentComplete' namespace='##targetNamespace'"
	 * @generated
	 */
	DecimalValueType getPercentComplete();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ExecutionVerifierType#getPercentComplete <em>Percent Complete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Complete</em>' containment reference.
	 * @see #getPercentComplete()
	 * @generated
	 */
	void setPercentComplete(DecimalValueType value);

} // ExecutionVerifierType
