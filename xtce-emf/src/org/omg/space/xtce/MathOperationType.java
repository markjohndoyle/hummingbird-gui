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
 * A representation of the model object '<em><b>Math Operation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A simple math operation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.MathOperationType#getParameterInstanceRef <em>Parameter Instance Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.MathOperationType#getValue <em>Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.MathOperationType#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.omg.space.xtce.MathOperationType#getParameterInstanceRef1 <em>Parameter Instance Ref1</em>}</li>
 *   <li>{@link org.omg.space.xtce.MathOperationType#getValue1 <em>Value1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getMathOperationType()
 * @model extendedMetaData="name='MathOperationType' kind='elementOnly'"
 * @generated
 */
public interface MathOperationType extends EObject {
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
	 * @see org.omg.space.xtce.XtcePackage#getMathOperationType_ParameterInstanceRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParameterInstanceRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterInstanceRefType1 getParameterInstanceRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MathOperationType#getParameterInstanceRef <em>Parameter Instance Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Instance Ref</em>' containment reference.
	 * @see #getParameterInstanceRef()
	 * @generated
	 */
	void setParameterInstanceRef(ParameterInstanceRefType1 value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value is assumed to be of the same type as the  Parameter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.omg.space.xtce.XtcePackage#getMathOperationType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MathOperationType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.space.xtce.MathOperatorsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.omg.space.xtce.MathOperatorsType
	 * @see #isSetOperator()
	 * @see #unsetOperator()
	 * @see #setOperator(MathOperatorsType)
	 * @see org.omg.space.xtce.XtcePackage#getMathOperationType_Operator()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Operator' namespace='##targetNamespace'"
	 * @generated
	 */
	MathOperatorsType getOperator();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MathOperationType#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.omg.space.xtce.MathOperatorsType
	 * @see #isSetOperator()
	 * @see #unsetOperator()
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(MathOperatorsType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.MathOperationType#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperator()
	 * @see #getOperator()
	 * @see #setOperator(MathOperatorsType)
	 * @generated
	 */
	void unsetOperator();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.MathOperationType#getOperator <em>Operator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operator</em>' attribute is set.
	 * @see #unsetOperator()
	 * @see #getOperator()
	 * @see #setOperator(MathOperatorsType)
	 * @generated
	 */
	boolean isSetOperator();

	/**
	 * Returns the value of the '<em><b>Parameter Instance Ref1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Instance Ref1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Instance Ref1</em>' containment reference.
	 * @see #setParameterInstanceRef1(ParameterInstanceRefType1)
	 * @see org.omg.space.xtce.XtcePackage#getMathOperationType_ParameterInstanceRef1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParameterInstanceRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterInstanceRefType1 getParameterInstanceRef1();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MathOperationType#getParameterInstanceRef1 <em>Parameter Instance Ref1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Instance Ref1</em>' containment reference.
	 * @see #getParameterInstanceRef1()
	 * @generated
	 */
	void setParameterInstanceRef1(ParameterInstanceRefType1 value);

	/**
	 * Returns the value of the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value is assumed to be of the same type as the Parameter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value1</em>' attribute.
	 * @see #setValue1(String)
	 * @see org.omg.space.xtce.XtcePackage#getMathOperationType_Value1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue1();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MathOperationType#getValue1 <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1</em>' attribute.
	 * @see #getValue1()
	 * @generated
	 */
	void setValue1(String value);

} // MathOperationType
