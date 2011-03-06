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
 * A representation of the model object '<em><b>Integer Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains an Integer value; value may be provided directly or via the value in a parameter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.IntegerValueType#getFixedValue <em>Fixed Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.IntegerValueType#getDynamicValue <em>Dynamic Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.IntegerValueType#getDiscreteLookupList <em>Discrete Lookup List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getIntegerValueType()
 * @model extendedMetaData="name='IntegerValueType' kind='elementOnly'"
 * @generated
 */
public interface IntegerValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Fixed Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Value</em>' attribute.
	 * @see #setFixedValue(Object)
	 * @see org.omg.space.xtce.XtcePackage#getIntegerValueType_FixedValue()
	 * @model dataType="org.omg.space.xtce.FixedIntegerValueType"
	 *        extendedMetaData="kind='element' name='FixedValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getFixedValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.IntegerValueType#getFixedValue <em>Fixed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Value</em>' attribute.
	 * @see #getFixedValue()
	 * @generated
	 */
	void setFixedValue(Object value);

	/**
	 * Returns the value of the '<em><b>Dynamic Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Uses a parameter  to for the value.  The parameter value may be optionally adjusted by a Linear function or use a series of boolean expressions to lookup the value.  Anything more complex and a DynamicValue with a CustomAlgorithm may be used  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Value</em>' containment reference.
	 * @see #setDynamicValue(DynamicValueType1)
	 * @see org.omg.space.xtce.XtcePackage#getIntegerValueType_DynamicValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DynamicValue' namespace='##targetNamespace'"
	 * @generated
	 */
	DynamicValueType1 getDynamicValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.IntegerValueType#getDynamicValue <em>Dynamic Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Value</em>' containment reference.
	 * @see #getDynamicValue()
	 * @generated
	 */
	void setDynamicValue(DynamicValueType1 value);

	/**
	 * Returns the value of the '<em><b>Discrete Lookup List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lookup a value using the lookup list supplied.  Use the first match found.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Discrete Lookup List</em>' containment reference.
	 * @see #setDiscreteLookupList(DiscreteLookupListType)
	 * @see org.omg.space.xtce.XtcePackage#getIntegerValueType_DiscreteLookupList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DiscreteLookupList' namespace='##targetNamespace'"
	 * @generated
	 */
	DiscreteLookupListType getDiscreteLookupList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.IntegerValueType#getDiscreteLookupList <em>Discrete Lookup List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discrete Lookup List</em>' containment reference.
	 * @see #getDiscreteLookupList()
	 * @generated
	 */
	void setDiscreteLookupList(DiscreteLookupListType value);

} // IntegerValueType
