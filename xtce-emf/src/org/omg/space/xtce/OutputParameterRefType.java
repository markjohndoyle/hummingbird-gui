/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Parameter Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.OutputParameterRefType#getOutputName <em>Output Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getOutputParameterRefType()
 * @model extendedMetaData="name='OutputParameterRef_._type' kind='simple'"
 * @generated
 */
public interface OutputParameterRefType extends ParameterRefType1 {
	/**
	 * Returns the value of the '<em><b>Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Name</em>' attribute.
	 * @see #setOutputName(String)
	 * @see org.omg.space.xtce.XtcePackage#getOutputParameterRefType_OutputName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='outputName'"
	 * @generated
	 */
	String getOutputName();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.OutputParameterRefType#getOutputName <em>Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Name</em>' attribute.
	 * @see #getOutputName()
	 * @generated
	 */
	void setOutputName(String value);

} // OutputParameterRefType
