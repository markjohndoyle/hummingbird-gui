/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polynomial Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A polynomial expression.  For example: 3 + 2x
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.PolynomialType#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getPolynomialType()
 * @model extendedMetaData="name='PolynomialType' kind='elementOnly'"
 * @generated
 */
public interface PolynomialType extends EObject {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.TermType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A term in a polynomial expresssion. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getPolynomialType_Term()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Term' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TermType> getTerm();

} // PolynomialType
