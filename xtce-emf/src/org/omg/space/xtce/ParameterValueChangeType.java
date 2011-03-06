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
 * A representation of the model object '<em><b>Parameter Value Change Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ParameterValueChangeType#getParameterRef <em>Parameter Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterValueChangeType#getChange <em>Change</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getParameterValueChangeType()
 * @model extendedMetaData="name='ParameterValueChange_._type' kind='elementOnly'"
 * @generated
 */
public interface ParameterValueChangeType extends EObject {
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
	 * @see org.omg.space.xtce.XtcePackage#getParameterValueChangeType_ParameterRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ParameterRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterRefType1 getParameterRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterValueChangeType#getParameterRef <em>Parameter Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Ref</em>' containment reference.
	 * @see #getParameterRef()
	 * @generated
	 */
	void setParameterRef(ParameterRefType1 value);

	/**
	 * Returns the value of the '<em><b>Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change</em>' containment reference.
	 * @see #setChange(ChangeType)
	 * @see org.omg.space.xtce.XtcePackage#getParameterValueChangeType_Change()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Change' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeType getChange();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterValueChangeType#getChange <em>Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change</em>' containment reference.
	 * @see #getChange()
	 * @generated
	 */
	void setChange(ChangeType value);

} // ParameterValueChangeType
