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
 * A representation of the model object '<em><b>Parameter Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used by both the TelemetryMetaData and the CommandMetaData components each may be built independently.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ParameterSetType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterSetType#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterSetType#getParameterRef <em>Parameter Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getParameterSetType()
 * @model extendedMetaData="name='ParameterSetType' kind='elementOnly'"
 * @generated
 */
public interface ParameterSetType extends EObject {
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
	 * @see org.omg.space.xtce.XtcePackage#getParameterSetType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getParameterSetType_Parameter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Parameter' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ParameterType> getParameter();

	/**
	 * Returns the value of the '<em><b>Parameter Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ParameterRefType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to include a Parameter defined in another sub-system in this sub-system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Ref</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getParameterSetType_ParameterRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ParameterRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ParameterRefType1> getParameterRef();

} // ParameterSetType
