/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Parameter Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ArrayParameterTypeType#getArrayTypeRef <em>Array Type Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.ArrayParameterTypeType#getNumberOfDimensions <em>Number Of Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getArrayParameterTypeType()
 * @model extendedMetaData="name='ArrayParameterType_._type' kind='elementOnly'"
 * @generated
 */
public interface ArrayParameterTypeType extends NameDescriptionType {
	/**
	 * Returns the value of the '<em><b>Array Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Type Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Type Ref</em>' attribute.
	 * @see #setArrayTypeRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getArrayParameterTypeType_ArrayTypeRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='arrayTypeRef'"
	 * @generated
	 */
	String getArrayTypeRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ArrayParameterTypeType#getArrayTypeRef <em>Array Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Type Ref</em>' attribute.
	 * @see #getArrayTypeRef()
	 * @generated
	 */
	void setArrayTypeRef(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Dimensions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Dimensions</em>' attribute.
	 * @see #setNumberOfDimensions(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getArrayParameterTypeType_NumberOfDimensions()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='numberOfDimensions'"
	 * @generated
	 */
	BigInteger getNumberOfDimensions();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ArrayParameterTypeType#getNumberOfDimensions <em>Number Of Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Dimensions</em>' attribute.
	 * @see #getNumberOfDimensions()
	 * @generated
	 */
	void setNumberOfDimensions(BigInteger value);

} // ArrayParameterTypeType
