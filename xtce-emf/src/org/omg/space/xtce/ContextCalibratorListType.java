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
 * A representation of the model object '<em><b>Context Calibrator List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ContextCalibratorListType#getContextCalibrator <em>Context Calibrator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getContextCalibratorListType()
 * @model extendedMetaData="name='ContextCalibratorList_._type' kind='elementOnly'"
 * @generated
 */
public interface ContextCalibratorListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Context Calibrator</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ContextCalibratorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Calibrator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Calibrator</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getContextCalibratorListType_ContextCalibrator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ContextCalibrator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContextCalibratorType> getContextCalibrator();

} // ContextCalibratorListType
