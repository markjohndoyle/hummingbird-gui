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
 * A representation of the model object '<em><b>Algorithm Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An unordered collection of algorithms
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.AlgorithmSetType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.AlgorithmSetType#getCustomAlgorithm <em>Custom Algorithm</em>}</li>
 *   <li>{@link org.omg.space.xtce.AlgorithmSetType#getMathAlgorithm <em>Math Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getAlgorithmSetType()
 * @model extendedMetaData="name='AlgorithmSetType' kind='elementOnly'"
 * @generated
 */
public interface AlgorithmSetType extends EObject {
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
	 * @see org.omg.space.xtce.XtcePackage#getAlgorithmSetType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Custom Algorithm</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.InputOutputTriggerAlgorithmType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Algorithm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Algorithm</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getAlgorithmSetType_CustomAlgorithm()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CustomAlgorithm' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<InputOutputTriggerAlgorithmType> getCustomAlgorithm();

	/**
	 * Returns the value of the '<em><b>Math Algorithm</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.MathAlgorithmType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Math Algorithm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Math Algorithm</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getAlgorithmSetType_MathAlgorithm()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MathAlgorithm' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MathAlgorithmType> getMathAlgorithm();

} // AlgorithmSetType
