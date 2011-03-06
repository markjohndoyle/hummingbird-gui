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
 * A representation of the model object '<em><b>Input Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.InputSetType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.InputSetType#getParameterInstanceRef <em>Parameter Instance Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.InputSetType#getConstant <em>Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getInputSetType()
 * @model extendedMetaData="name='InputSet_._type' kind='elementOnly'"
 * @generated
 */
public interface InputSetType extends EObject {
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
	 * @see org.omg.space.xtce.XtcePackage#getInputSetType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Parameter Instance Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ParameterInstanceRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Names an input parameter to the algorithm.  There are two attributes to InputParm, inputName and parameterName. parameterName is a parameter reference name for a parameter that will be used in this algorithm.  inputName is an optional "friendly" name for the input parameter. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Instance Ref</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getInputSetType_ParameterInstanceRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ParameterInstanceRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ParameterInstanceRefType> getParameterInstanceRef();

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ConstantType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Names and provides a value for a constant input to the algorithm.  There are two attributes to Constant, constantName and value.  constantName is a variable name in the algorithm to be executed.  value is the value of the constant to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getInputSetType_Constant()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Constant' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ConstantType> getConstant();

} // InputSetType
