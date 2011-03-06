/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argumement Array Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ArgumementArrayTypeType#getArrayType <em>Array Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.ArgumementArrayTypeType#getNumberOfDimensions <em>Number Of Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getArgumementArrayTypeType()
 * @model extendedMetaData="name='ArgumementArrayType_._type' kind='empty'"
 * @generated
 */
public interface ArgumementArrayTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Array Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Type</em>' attribute.
	 * @see #setArrayType(String)
	 * @see org.omg.space.xtce.XtcePackage#getArgumementArrayTypeType_ArrayType()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='arrayType'"
	 * @generated
	 */
	String getArrayType();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ArgumementArrayTypeType#getArrayType <em>Array Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Type</em>' attribute.
	 * @see #getArrayType()
	 * @generated
	 */
	void setArrayType(String value);

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
	 * @see org.omg.space.xtce.XtcePackage#getArgumementArrayTypeType_NumberOfDimensions()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='numberOfDimensions'"
	 * @generated
	 */
	BigInteger getNumberOfDimensions();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ArgumementArrayTypeType#getNumberOfDimensions <em>Number Of Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Dimensions</em>' attribute.
	 * @see #getNumberOfDimensions()
	 * @generated
	 */
	void setNumberOfDimensions(BigInteger value);

} // ArgumementArrayTypeType
