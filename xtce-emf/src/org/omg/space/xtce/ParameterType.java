/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ParameterType#getParameterProperties <em>Parameter Properties</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterType#getParameterTypeRef <em>Parameter Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getParameterType()
 * @model extendedMetaData="name='Parameter_._type' kind='elementOnly'"
 * @generated
 */
public interface ParameterType extends NameDescriptionType {
	/**
	 * Returns the value of the '<em><b>Parameter Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Properties</em>' containment reference.
	 * @see #setParameterProperties(ParameterPropertiesType)
	 * @see org.omg.space.xtce.XtcePackage#getParameterType_ParameterProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParameterProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterPropertiesType getParameterProperties();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterType#getParameterProperties <em>Parameter Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Properties</em>' containment reference.
	 * @see #getParameterProperties()
	 * @generated
	 */
	void setParameterProperties(ParameterPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Parameter Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Type Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type Ref</em>' attribute.
	 * @see #setParameterTypeRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getParameterType_ParameterTypeRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='parameterTypeRef'"
	 * @generated
	 */
	String getParameterTypeRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterType#getParameterTypeRef <em>Parameter Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type Ref</em>' attribute.
	 * @see #getParameterTypeRef()
	 * @generated
	 */
	void setParameterTypeRef(String value);

} // ParameterType
