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
 * A representation of the model object '<em><b>Context Significance List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ContextSignificanceListType#getContextSignificance <em>Context Significance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getContextSignificanceListType()
 * @model extendedMetaData="name='ContextSignificanceList_._type' kind='elementOnly'"
 * @generated
 */
public interface ContextSignificanceListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Context Significance</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ContextSignificanceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Significance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Significance</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getContextSignificanceListType_ContextSignificance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ContextSignificance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContextSignificanceType> getContextSignificance();

} // ContextSignificanceListType
