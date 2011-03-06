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
 * A representation of the model object '<em><b>Comparison List Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ComparisonListType1#getComparison <em>Comparison</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getComparisonListType1()
 * @model extendedMetaData="name='ComparisonList_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface ComparisonListType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ComparisonType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getComparisonListType1_Comparison()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Comparison' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComparisonType> getComparison();

} // ComparisonListType1
