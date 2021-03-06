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
 * A representation of the model object '<em><b>AN Ded Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A list of boolean comparisons, or boolean groups that are logically ANDed together.  Any ORed conditions in the list are evaluated first.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ANDedConditionsType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.ANDedConditionsType#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.omg.space.xtce.ANDedConditionsType#getORedConditions <em>ORed Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getANDedConditionsType()
 * @model extendedMetaData="name='ANDedConditionsType' kind='elementOnly'"
 * @generated
 */
public interface ANDedConditionsType extends EObject {
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
	 * @see org.omg.space.xtce.XtcePackage#getANDedConditionsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ComparisonCheckType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getANDedConditionsType_Condition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ComparisonCheckType> getCondition();

	/**
	 * Returns the value of the '<em><b>ORed Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ORedConditionsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ORed Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ORed Conditions</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getANDedConditionsType_ORedConditions()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ORedConditions' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ORedConditionsType> getORedConditions();

} // ANDedConditionsType
