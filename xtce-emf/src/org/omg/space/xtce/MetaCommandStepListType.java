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
 * A representation of the model object '<em><b>Meta Command Step List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.MetaCommandStepListType#getMetaCommandStep <em>Meta Command Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getMetaCommandStepListType()
 * @model extendedMetaData="name='MetaCommandStepList_._type' kind='elementOnly'"
 * @generated
 */
public interface MetaCommandStepListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta Command Step</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.MetaCommandStepType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Command Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Command Step</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandStepListType_MetaCommandStep()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MetaCommandStep' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MetaCommandStepType> getMetaCommandStep();

} // MetaCommandStepListType
