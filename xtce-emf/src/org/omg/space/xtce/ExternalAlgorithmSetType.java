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
 * A representation of the model object '<em><b>External Algorithm Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ExternalAlgorithmSetType#getExternalAlgorithm <em>External Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getExternalAlgorithmSetType()
 * @model extendedMetaData="name='ExternalAlgorithmSet_._type' kind='elementOnly'"
 * @generated
 */
public interface ExternalAlgorithmSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>External Algorithm</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ExternalAlgorithmType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the external algorithm.  Multiple entries are provided so that the same database may be used for multiple implementation s
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Algorithm</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getExternalAlgorithmSetType_ExternalAlgorithm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ExternalAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExternalAlgorithmType> getExternalAlgorithm();

} // ExternalAlgorithmSetType
