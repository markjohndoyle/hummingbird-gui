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
 * A representation of the model object '<em><b>Context Calibrator List Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ContextCalibratorListType1#getContextCalibrator <em>Context Calibrator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getContextCalibratorListType1()
 * @model extendedMetaData="name='ContextCalibratorList_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface ContextCalibratorListType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Context Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Calibrator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Calibrator</em>' containment reference.
	 * @see #setContextCalibrator(ContextCalibratorType2)
	 * @see org.omg.space.xtce.XtcePackage#getContextCalibratorListType1_ContextCalibrator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ContextCalibrator' namespace='##targetNamespace'"
	 * @generated
	 */
	ContextCalibratorType2 getContextCalibrator();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ContextCalibratorListType1#getContextCalibrator <em>Context Calibrator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Calibrator</em>' containment reference.
	 * @see #getContextCalibrator()
	 * @generated
	 */
	void setContextCalibrator(ContextCalibratorType2 value);

} // ContextCalibratorListType1
