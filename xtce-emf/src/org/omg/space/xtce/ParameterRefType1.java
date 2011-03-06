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
 * A representation of the model object '<em><b>Parameter Ref Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a Parameter. Uses Unix ‘like’ naming across the SpaceSystem Tree (e.g., SimpleSat/Bus/EPDS/BatteryOne/Voltage).  To reference an individual member of an array use the zero based bracket notation commonly used in languages like C, C++, and Java.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ParameterRefType1#getValue <em>Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterRefType1#getParameterRef <em>Parameter Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getParameterRefType1()
 * @model extendedMetaData="name='ParameterRefType' kind='simple'"
 * @generated
 */
public interface ParameterRefType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.omg.space.xtce.XtcePackage#getParameterRefType1_Value()
	 * @model dataType="org.omg.space.xtce.NameReferenceType"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterRefType1#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see org.omg.space.xtce.XtcePackage#getParameterRefType1_ParameterRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='parameterRef'"
	 * @generated
	 */
	String getParameterRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterRefType1#getParameterRef <em>Parameter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Ref</em>' attribute.
	 * @see #getParameterRef()
	 * @generated
	 */
	void setParameterRef(String value);

} // ParameterRefType1
