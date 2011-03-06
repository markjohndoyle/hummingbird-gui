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
 * A representation of the model object '<em><b>Argument Assignment List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ArgumentAssignmentListType#getArgumentAssignment <em>Argument Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getArgumentAssignmentListType()
 * @model extendedMetaData="name='ArgumentAssignmentList_._type' kind='elementOnly'"
 * @generated
 */
public interface ArgumentAssignmentListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Argument Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ArgumentAssignmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Assignment</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getArgumentAssignmentListType_ArgumentAssignment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ArgumentAssignment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArgumentAssignmentType> getArgumentAssignment();

} // ArgumentAssignmentListType
