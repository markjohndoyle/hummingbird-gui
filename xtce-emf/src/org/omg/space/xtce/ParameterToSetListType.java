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
 * A representation of the model object '<em><b>Parameter To Set List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ParameterToSetListType#getParameterToSet <em>Parameter To Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getParameterToSetListType()
 * @model extendedMetaData="name='ParameterToSetList_._type' kind='elementOnly'"
 * @generated
 */
public interface ParameterToSetListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter To Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ParameterToSetType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets a Parameter to a new value after the command has been verified (all verifications have passed)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter To Set</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getParameterToSetListType_ParameterToSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ParameterToSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParameterToSetType1> getParameterToSet();

} // ParameterToSetListType
