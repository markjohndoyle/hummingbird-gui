/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Ref Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An entry that is a single Parameter
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ParameterRefEntryType#getParameterRef <em>Parameter Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getParameterRefEntryType()
 * @model extendedMetaData="name='ParameterRefEntryType' kind='elementOnly'"
 * @generated
 */
public interface ParameterRefEntryType extends SequenceEntryType {
	/**
	 * Returns the value of the '<em><b>Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Ref</em>' attribute.
	 * @see #setParameterRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getParameterRefEntryType_ParameterRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='parameterRef'"
	 * @generated
	 */
	String getParameterRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterRefEntryType#getParameterRef <em>Parameter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Ref</em>' attribute.
	 * @see #getParameterRef()
	 * @generated
	 */
	void setParameterRef(String value);

} // ParameterRefEntryType
