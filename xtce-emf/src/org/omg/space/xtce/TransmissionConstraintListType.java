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
 * A representation of the model object '<em><b>Transmission Constraint List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.TransmissionConstraintListType#getTransmissionConstraint <em>Transmission Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getTransmissionConstraintListType()
 * @model extendedMetaData="name='TransmissionConstraintList_._type' kind='elementOnly'"
 * @generated
 */
public interface TransmissionConstraintListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Transmission Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.TransmissionConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A CommandTransmission constraint is used to check that the command can be run in the current operating mode and may block the transmission of the command if the constraint condition is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmission Constraint</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getTransmissionConstraintListType_TransmissionConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TransmissionConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TransmissionConstraintType> getTransmissionConstraint();

} // TransmissionConstraintListType
