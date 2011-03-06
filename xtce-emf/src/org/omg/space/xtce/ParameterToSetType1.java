/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter To Set Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ParameterToSetType1#getVerifierToTriggerOn <em>Verifier To Trigger On</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getParameterToSetType1()
 * @model extendedMetaData="name='ParameterToSet_._type' kind='elementOnly'"
 * @generated
 */
public interface ParameterToSetType1 extends ParameterToSetType {
	/**
	 * Returns the value of the '<em><b>Verifier To Trigger On</b></em>' attribute.
	 * The default value is <code>"release"</code>.
	 * The literals are from the enumeration {@link org.omg.space.xtce.VerifierToTriggerOnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verifier To Trigger On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verifier To Trigger On</em>' attribute.
	 * @see org.omg.space.xtce.VerifierToTriggerOnType
	 * @see #isSetVerifierToTriggerOn()
	 * @see #unsetVerifierToTriggerOn()
	 * @see #setVerifierToTriggerOn(VerifierToTriggerOnType)
	 * @see org.omg.space.xtce.XtcePackage#getParameterToSetType1_VerifierToTriggerOn()
	 * @model default="release" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='verifierToTriggerOn'"
	 * @generated
	 */
	VerifierToTriggerOnType getVerifierToTriggerOn();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterToSetType1#getVerifierToTriggerOn <em>Verifier To Trigger On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verifier To Trigger On</em>' attribute.
	 * @see org.omg.space.xtce.VerifierToTriggerOnType
	 * @see #isSetVerifierToTriggerOn()
	 * @see #unsetVerifierToTriggerOn()
	 * @see #getVerifierToTriggerOn()
	 * @generated
	 */
	void setVerifierToTriggerOn(VerifierToTriggerOnType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.ParameterToSetType1#getVerifierToTriggerOn <em>Verifier To Trigger On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerifierToTriggerOn()
	 * @see #getVerifierToTriggerOn()
	 * @see #setVerifierToTriggerOn(VerifierToTriggerOnType)
	 * @generated
	 */
	void unsetVerifierToTriggerOn();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.ParameterToSetType1#getVerifierToTriggerOn <em>Verifier To Trigger On</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Verifier To Trigger On</em>' attribute is set.
	 * @see #unsetVerifierToTriggerOn()
	 * @see #getVerifierToTriggerOn()
	 * @see #setVerifierToTriggerOn(VerifierToTriggerOnType)
	 * @generated
	 */
	boolean isSetVerifierToTriggerOn();

} // ParameterToSetType1
