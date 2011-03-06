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
 * A representation of the model object '<em><b>Parameter To Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used by Meta Command to indicate ground Parameters that should be set after completion of a command.  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ParameterToSetType#getParameterRef <em>Parameter Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterToSetType#getDerivation <em>Derivation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getParameterToSetType()
 * @model extendedMetaData="name='ParameterToSetType' kind='elementOnly'"
 * @generated
 */
public interface ParameterToSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Ref</em>' containment reference.
	 * @see #setParameterRef(ParameterRefType1)
	 * @see org.omg.space.xtce.XtcePackage#getParameterToSetType_ParameterRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ParameterRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterRefType1 getParameterRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterToSetType#getParameterRef <em>Parameter Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Ref</em>' containment reference.
	 * @see #getParameterRef()
	 * @generated
	 */
	void setParameterRef(ParameterRefType1 value);

	/**
	 * Returns the value of the '<em><b>Derivation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation</em>' containment reference.
	 * @see #setDerivation(MathOperationType)
	 * @see org.omg.space.xtce.XtcePackage#getParameterToSetType_Derivation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Derivation' namespace='##targetNamespace'"
	 * @generated
	 */
	MathOperationType getDerivation();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterToSetType#getDerivation <em>Derivation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation</em>' containment reference.
	 * @see #getDerivation()
	 * @generated
	 */
	void setDerivation(MathOperationType value);

} // ParameterToSetType
