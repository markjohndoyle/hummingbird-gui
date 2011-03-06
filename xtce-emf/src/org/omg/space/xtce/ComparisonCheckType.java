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
 * A representation of the model object '<em><b>Comparison Check Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ParameterInstanceRef to a value or another parameter instance
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ComparisonCheckType#getParameterInstanceRef <em>Parameter Instance Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.ComparisonCheckType#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link org.omg.space.xtce.ComparisonCheckType#getParameterInstanceRef1 <em>Parameter Instance Ref1</em>}</li>
 *   <li>{@link org.omg.space.xtce.ComparisonCheckType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getComparisonCheckType()
 * @model extendedMetaData="name='ComparisonCheckType' kind='elementOnly'"
 * @generated
 */
public interface ComparisonCheckType extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Instance Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Instance Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Instance Ref</em>' containment reference.
	 * @see #setParameterInstanceRef(ParameterInstanceRefType1)
	 * @see org.omg.space.xtce.XtcePackage#getComparisonCheckType_ParameterInstanceRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ParameterInstanceRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterInstanceRefType1 getParameterInstanceRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ComparisonCheckType#getParameterInstanceRef <em>Parameter Instance Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Instance Ref</em>' containment reference.
	 * @see #getParameterInstanceRef()
	 * @generated
	 */
	void setParameterInstanceRef(ParameterInstanceRefType1 value);

	/**
	 * Returns the value of the '<em><b>Comparison Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.space.xtce.ComparisonOperatorsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Operator</em>' attribute.
	 * @see org.omg.space.xtce.ComparisonOperatorsType
	 * @see #isSetComparisonOperator()
	 * @see #unsetComparisonOperator()
	 * @see #setComparisonOperator(ComparisonOperatorsType)
	 * @see org.omg.space.xtce.XtcePackage#getComparisonCheckType_ComparisonOperator()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ComparisonOperator' namespace='##targetNamespace'"
	 * @generated
	 */
	ComparisonOperatorsType getComparisonOperator();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ComparisonCheckType#getComparisonOperator <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operator</em>' attribute.
	 * @see org.omg.space.xtce.ComparisonOperatorsType
	 * @see #isSetComparisonOperator()
	 * @see #unsetComparisonOperator()
	 * @see #getComparisonOperator()
	 * @generated
	 */
	void setComparisonOperator(ComparisonOperatorsType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.ComparisonCheckType#getComparisonOperator <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetComparisonOperator()
	 * @see #getComparisonOperator()
	 * @see #setComparisonOperator(ComparisonOperatorsType)
	 * @generated
	 */
	void unsetComparisonOperator();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.ComparisonCheckType#getComparisonOperator <em>Comparison Operator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Comparison Operator</em>' attribute is set.
	 * @see #unsetComparisonOperator()
	 * @see #getComparisonOperator()
	 * @see #setComparisonOperator(ComparisonOperatorsType)
	 * @generated
	 */
	boolean isSetComparisonOperator();

	/**
	 * Returns the value of the '<em><b>Parameter Instance Ref1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter is assumed to be of the same type as the comparison Parameter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Instance Ref1</em>' containment reference.
	 * @see #setParameterInstanceRef1(ParameterInstanceRefType1)
	 * @see org.omg.space.xtce.XtcePackage#getComparisonCheckType_ParameterInstanceRef1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParameterInstanceRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterInstanceRefType1 getParameterInstanceRef1();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ComparisonCheckType#getParameterInstanceRef1 <em>Parameter Instance Ref1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Instance Ref1</em>' containment reference.
	 * @see #getParameterInstanceRef1()
	 * @generated
	 */
	void setParameterInstanceRef1(ParameterInstanceRefType1 value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value is assumed to be of the same type as the comparison Parameter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.omg.space.xtce.XtcePackage#getComparisonCheckType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ComparisonCheckType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ComparisonCheckType
