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
 * A representation of the model object '<em><b>Parameter Type Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Holds the list of parameter definitions. A Parameter is a description of something that can have a value; it is not the value itself.   
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ParameterTypeSetType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterTypeSetType#getStringParameterType <em>String Parameter Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterTypeSetType#getEnumeratedParameterType <em>Enumerated Parameter Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterTypeSetType#getIntegerParameterType <em>Integer Parameter Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterTypeSetType#getBinaryParameterType <em>Binary Parameter Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterTypeSetType#getFloatParameterType <em>Float Parameter Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterTypeSetType#getBooleanParameterType <em>Boolean Parameter Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterTypeSetType#getRelativeTimeParameterType <em>Relative Time Parameter Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterTypeSetType#getAbsoluteTimeParameterType <em>Absolute Time Parameter Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterTypeSetType#getArrayParameterType <em>Array Parameter Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getParameterTypeSetType()
 * @model extendedMetaData="name='ParameterTypeSetType' kind='elementOnly'"
 * @generated
 */
public interface ParameterTypeSetType extends EObject {
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
	 * @see org.omg.space.xtce.XtcePackage#getParameterTypeSetType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>String Parameter Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.StringDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Parameter Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Parameter Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getParameterTypeSetType_StringParameterType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StringParameterType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<StringDataType> getStringParameterType();

	/**
	 * Returns the value of the '<em><b>Enumerated Parameter Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.EnumeratedDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerated Parameter Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerated Parameter Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getParameterTypeSetType_EnumeratedParameterType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EnumeratedParameterType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EnumeratedDataType> getEnumeratedParameterType();

	/**
	 * Returns the value of the '<em><b>Integer Parameter Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.IntegerParameterTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Parameter Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Parameter Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getParameterTypeSetType_IntegerParameterType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IntegerParameterType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IntegerParameterTypeType> getIntegerParameterType();

	/**
	 * Returns the value of the '<em><b>Binary Parameter Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.BinaryDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Parameter Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Parameter Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getParameterTypeSetType_BinaryParameterType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BinaryParameterType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BinaryDataType> getBinaryParameterType();

	/**
	 * Returns the value of the '<em><b>Float Parameter Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.FloatParameterTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float Parameter Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float Parameter Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getParameterTypeSetType_FloatParameterType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FloatParameterType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FloatParameterTypeType> getFloatParameterType();

	/**
	 * Returns the value of the '<em><b>Boolean Parameter Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.BooleanDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Parameter Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Parameter Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getParameterTypeSetType_BooleanParameterType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BooleanParameterType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BooleanDataType> getBooleanParameterType();

	/**
	 * Returns the value of the '<em><b>Relative Time Parameter Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.RelativeTimeDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Time Parameter Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Time Parameter Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getParameterTypeSetType_RelativeTimeParameterType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelativeTimeParameterType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RelativeTimeDataType> getRelativeTimeParameterType();

	/**
	 * Returns the value of the '<em><b>Absolute Time Parameter Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.AbsoluteTimeDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Time Parameter Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Time Parameter Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getParameterTypeSetType_AbsoluteTimeParameterType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbsoluteTimeParameterType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AbsoluteTimeDataType> getAbsoluteTimeParameterType();

	/**
	 * Returns the value of the '<em><b>Array Parameter Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ArrayParameterTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array type.  Will be an array of parameters of the type referenced in 'arrayTypeRef' and have the number of array dimensions as specified in 'numberOfDimensions' 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Array Parameter Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getParameterTypeSetType_ArrayParameterType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ArrayParameterType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ArrayParameterTypeType> getArrayParameterType();

} // ParameterTypeSetType
