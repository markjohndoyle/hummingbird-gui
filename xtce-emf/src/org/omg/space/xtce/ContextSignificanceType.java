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
 * A representation of the model object '<em><b>Context Significance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ContextSignificanceType#getContextMatch <em>Context Match</em>}</li>
 *   <li>{@link org.omg.space.xtce.ContextSignificanceType#getSignificance <em>Significance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getContextSignificanceType()
 * @model extendedMetaData="name='ContextSignificance_._type' kind='elementOnly'"
 * @generated
 */
public interface ContextSignificanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Context Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Match</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Match</em>' containment reference.
	 * @see #setContextMatch(MatchCriteriaType)
	 * @see org.omg.space.xtce.XtcePackage#getContextSignificanceType_ContextMatch()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ContextMatch' namespace='##targetNamespace'"
	 * @generated
	 */
	MatchCriteriaType getContextMatch();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ContextSignificanceType#getContextMatch <em>Context Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Match</em>' containment reference.
	 * @see #getContextMatch()
	 * @generated
	 */
	void setContextMatch(MatchCriteriaType value);

	/**
	 * Returns the value of the '<em><b>Significance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Significance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Significance</em>' containment reference.
	 * @see #setSignificance(SignificanceType)
	 * @see org.omg.space.xtce.XtcePackage#getContextSignificanceType_Significance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Significance' namespace='##targetNamespace'"
	 * @generated
	 */
	SignificanceType getSignificance();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ContextSignificanceType#getSignificance <em>Significance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Significance</em>' containment reference.
	 * @see #getSignificance()
	 * @generated
	 */
	void setSignificance(SignificanceType value);

} // ContextSignificanceType
