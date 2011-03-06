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
 * A representation of the model object '<em><b>Boolean Expression Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Holds an arbitrarily complex boolean expression
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.BooleanExpressionType#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.omg.space.xtce.BooleanExpressionType#getANDedConditions <em>AN Ded Conditions</em>}</li>
 *   <li>{@link org.omg.space.xtce.BooleanExpressionType#getORedConditions <em>ORed Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getBooleanExpressionType()
 * @model extendedMetaData="name='BooleanExpressionType' kind='elementOnly'"
 * @generated
 */
public interface BooleanExpressionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ComparisonCheckType)
	 * @see org.omg.space.xtce.XtcePackage#getBooleanExpressionType_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace'"
	 * @generated
	 */
	ComparisonCheckType getCondition();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BooleanExpressionType#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ComparisonCheckType value);

	/**
	 * Returns the value of the '<em><b>AN Ded Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AN Ded Conditions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AN Ded Conditions</em>' containment reference.
	 * @see #setANDedConditions(ANDedConditionsType)
	 * @see org.omg.space.xtce.XtcePackage#getBooleanExpressionType_ANDedConditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ANDedConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	ANDedConditionsType getANDedConditions();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BooleanExpressionType#getANDedConditions <em>AN Ded Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AN Ded Conditions</em>' containment reference.
	 * @see #getANDedConditions()
	 * @generated
	 */
	void setANDedConditions(ANDedConditionsType value);

	/**
	 * Returns the value of the '<em><b>ORed Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ORed Conditions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ORed Conditions</em>' containment reference.
	 * @see #setORedConditions(ORedConditionsType)
	 * @see org.omg.space.xtce.XtcePackage#getBooleanExpressionType_ORedConditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ORedConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	ORedConditionsType getORedConditions();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BooleanExpressionType#getORedConditions <em>ORed Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ORed Conditions</em>' containment reference.
	 * @see #getORedConditions()
	 * @generated
	 */
	void setORedConditions(ORedConditionsType value);

} // BooleanExpressionType
