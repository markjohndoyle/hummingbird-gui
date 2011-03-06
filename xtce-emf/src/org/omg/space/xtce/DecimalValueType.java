/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains an Numeric value; value may be provided directly or via the value in a parameter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.DecimalValueType#getFixedValue <em>Fixed Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.DecimalValueType#getDynamicValue <em>Dynamic Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getDecimalValueType()
 * @model extendedMetaData="name='DecimalValueType' kind='elementOnly'"
 * @generated
 */
public interface DecimalValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Fixed Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Value</em>' attribute.
	 * @see #setFixedValue(BigDecimal)
	 * @see org.omg.space.xtce.XtcePackage#getDecimalValueType_FixedValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='FixedValue' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getFixedValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.DecimalValueType#getFixedValue <em>Fixed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Value</em>' attribute.
	 * @see #getFixedValue()
	 * @generated
	 */
	void setFixedValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Dynamic Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Uses a parameter  to for the value.  The parameter value may be optionally adjusted by a Linear function or use a series of boolean expressions to lookup the value.  Anything more complex and a DynamicValue with a CustomAlgorithm may be used  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Value</em>' containment reference.
	 * @see #setDynamicValue(DynamicValueType)
	 * @see org.omg.space.xtce.XtcePackage#getDecimalValueType_DynamicValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DynamicValue' namespace='##targetNamespace'"
	 * @generated
	 */
	DynamicValueType getDynamicValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.DecimalValueType#getDynamicValue <em>Dynamic Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Value</em>' containment reference.
	 * @see #getDynamicValue()
	 * @generated
	 */
	void setDynamicValue(DynamicValueType value);

} // DecimalValueType
