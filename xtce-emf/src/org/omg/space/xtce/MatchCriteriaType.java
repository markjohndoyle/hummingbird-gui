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
 * A representation of the model object '<em><b>Match Criteria Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains either a simple Comparison, a ComparisonList, an arbitrarily complex BooleanExpression or an escape to an externally defined algorithm
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.MatchCriteriaType#getComparison <em>Comparison</em>}</li>
 *   <li>{@link org.omg.space.xtce.MatchCriteriaType#getComparisonList <em>Comparison List</em>}</li>
 *   <li>{@link org.omg.space.xtce.MatchCriteriaType#getBooleanExpression <em>Boolean Expression</em>}</li>
 *   <li>{@link org.omg.space.xtce.MatchCriteriaType#getCustomAlgorithm <em>Custom Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getMatchCriteriaType()
 * @model extendedMetaData="name='MatchCriteriaType' kind='elementOnly'"
 * @generated
 */
public interface MatchCriteriaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A simple comparison check
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comparison</em>' containment reference.
	 * @see #setComparison(ComparisonType)
	 * @see org.omg.space.xtce.XtcePackage#getMatchCriteriaType_Comparison()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Comparison' namespace='##targetNamespace'"
	 * @generated
	 */
	ComparisonType getComparison();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MatchCriteriaType#getComparison <em>Comparison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison</em>' containment reference.
	 * @see #getComparison()
	 * @generated
	 */
	void setComparison(ComparisonType value);

	/**
	 * Returns the value of the '<em><b>Comparison List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All comparisons must be true
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comparison List</em>' containment reference.
	 * @see #setComparisonList(ComparisonListType1)
	 * @see org.omg.space.xtce.XtcePackage#getMatchCriteriaType_ComparisonList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ComparisonList' namespace='##targetNamespace'"
	 * @generated
	 */
	ComparisonListType1 getComparisonList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MatchCriteriaType#getComparisonList <em>Comparison List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison List</em>' containment reference.
	 * @see #getComparisonList()
	 * @generated
	 */
	void setComparisonList(ComparisonListType1 value);

	/**
	 * Returns the value of the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An arbitrarily complex boolean expression
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boolean Expression</em>' containment reference.
	 * @see #setBooleanExpression(BooleanExpressionType)
	 * @see org.omg.space.xtce.XtcePackage#getMatchCriteriaType_BooleanExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BooleanExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanExpressionType getBooleanExpression();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MatchCriteriaType#getBooleanExpression <em>Boolean Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Expression</em>' containment reference.
	 * @see #getBooleanExpression()
	 * @generated
	 */
	void setBooleanExpression(BooleanExpressionType value);

	/**
	 * Returns the value of the '<em><b>Custom Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An escape to an externally defined algorithm
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Algorithm</em>' containment reference.
	 * @see #setCustomAlgorithm(InputAlgorithmType)
	 * @see org.omg.space.xtce.XtcePackage#getMatchCriteriaType_CustomAlgorithm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CustomAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	InputAlgorithmType getCustomAlgorithm();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MatchCriteriaType#getCustomAlgorithm <em>Custom Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Algorithm</em>' containment reference.
	 * @see #getCustomAlgorithm()
	 * @generated
	 */
	void setCustomAlgorithm(InputAlgorithmType value);

} // MatchCriteriaType
