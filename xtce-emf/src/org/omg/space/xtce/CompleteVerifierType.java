/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complete Verifier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.CompleteVerifierType#getReturnParmRef <em>Return Parm Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getCompleteVerifierType()
 * @model extendedMetaData="name='CompleteVerifier_._type' kind='elementOnly'"
 * @generated
 */
public interface CompleteVerifierType extends CommandVerifierType {
	/**
	 * Returns the value of the '<em><b>Return Parm Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Parm Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Parm Ref</em>' containment reference.
	 * @see #setReturnParmRef(ParameterRefType1)
	 * @see org.omg.space.xtce.XtcePackage#getCompleteVerifierType_ReturnParmRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReturnParmRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterRefType1 getReturnParmRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CompleteVerifierType#getReturnParmRef <em>Return Parm Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Parm Ref</em>' containment reference.
	 * @see #getReturnParmRef()
	 * @generated
	 */
	void setReturnParmRef(ParameterRefType1 value);

} // CompleteVerifierType
