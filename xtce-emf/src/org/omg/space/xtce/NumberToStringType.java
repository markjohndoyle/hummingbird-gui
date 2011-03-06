/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number To String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * There are two ways numeric data can be changed to string data: using a Java style NumberFormat, or using an enumerated list.   Enumerated lists can be assigned to a single value or a value range.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.NumberToStringType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumberToStringType#getValueEnumeration <em>Value Enumeration</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumberToStringType#getRangeEnumeration <em>Range Enumeration</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumberToStringType#getNumberFormat <em>Number Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getNumberToStringType()
 * @model extendedMetaData="name='NumberToStringType' kind='elementOnly'"
 * @generated
 */
public interface NumberToStringType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.omg.space.xtce.XtcePackage#getNumberToStringType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Value Enumeration</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ValueEnumerationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number or range assigned to a string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Enumeration</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getNumberToStringType_ValueEnumeration()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueEnumeration' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ValueEnumerationType> getValueEnumeration();

	/**
	 * Returns the value of the '<em><b>Range Enumeration</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.RangeEnumerationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string value associated with a numerical range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Enumeration</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getNumberToStringType_RangeEnumeration()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RangeEnumeration' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RangeEnumerationType> getRangeEnumeration();

	/**
	 * Returns the value of the '<em><b>Number Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Format</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Format</em>' containment reference.
	 * @see #setNumberFormat(NumberFormatType)
	 * @see org.omg.space.xtce.XtcePackage#getNumberToStringType_NumberFormat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NumberFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	NumberFormatType getNumberFormat();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumberToStringType#getNumberFormat <em>Number Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Format</em>' containment reference.
	 * @see #getNumberFormat()
	 * @generated
	 */
	void setNumberFormat(NumberFormatType value);

} // NumberToStringType
