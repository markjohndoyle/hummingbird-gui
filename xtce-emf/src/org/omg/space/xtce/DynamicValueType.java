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
 * A representation of the model object '<em><b>Dynamic Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.DynamicValueType#getParameterInstanceRef <em>Parameter Instance Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.DynamicValueType#getLinearAdjustment <em>Linear Adjustment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getDynamicValueType()
 * @model extendedMetaData="name='DynamicValue_._type' kind='elementOnly'"
 * @generated
 */
public interface DynamicValueType extends EObject {
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
	 * @see org.omg.space.xtce.XtcePackage#getDynamicValueType_ParameterInstanceRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ParameterInstanceRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterInstanceRefType1 getParameterInstanceRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.DynamicValueType#getParameterInstanceRef <em>Parameter Instance Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Instance Ref</em>' containment reference.
	 * @see #getParameterInstanceRef()
	 * @generated
	 */
	void setParameterInstanceRef(ParameterInstanceRefType1 value);

	/**
	 * Returns the value of the '<em><b>Linear Adjustment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A slope and intercept may be applied to scale or shift the value of the parameter in the dynamic value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linear Adjustment</em>' containment reference.
	 * @see #setLinearAdjustment(LinearAdjustmentType)
	 * @see org.omg.space.xtce.XtcePackage#getDynamicValueType_LinearAdjustment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LinearAdjustment' namespace='##targetNamespace'"
	 * @generated
	 */
	LinearAdjustmentType getLinearAdjustment();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.DynamicValueType#getLinearAdjustment <em>Linear Adjustment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Adjustment</em>' containment reference.
	 * @see #getLinearAdjustment()
	 * @generated
	 */
	void setLinearAdjustment(LinearAdjustmentType value);

} // DynamicValueType
