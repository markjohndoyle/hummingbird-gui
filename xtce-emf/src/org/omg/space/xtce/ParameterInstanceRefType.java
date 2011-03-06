/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Instance Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ParameterInstanceRefType#getInputName <em>Input Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getParameterInstanceRefType()
 * @model extendedMetaData="name='ParameterInstanceRef_._type' kind='simple'"
 * @generated
 */
public interface ParameterInstanceRefType extends ParameterInstanceRefType1 {
	/**
	 * Returns the value of the '<em><b>Input Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Name</em>' attribute.
	 * @see #setInputName(String)
	 * @see org.omg.space.xtce.XtcePackage#getParameterInstanceRefType_InputName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inputName'"
	 * @generated
	 */
	String getInputName();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterInstanceRefType#getInputName <em>Input Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Name</em>' attribute.
	 * @see #getInputName()
	 * @generated
	 */
	void setInputName(String value);

} // ParameterInstanceRefType
