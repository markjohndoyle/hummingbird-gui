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
 * A representation of the model object '<em><b>Context Calibrator Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Context calibrations are applied when the ContextMatch is true.  Context calibrators overide Default calibrators
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ContextCalibratorType2#getContextMatch <em>Context Match</em>}</li>
 *   <li>{@link org.omg.space.xtce.ContextCalibratorType2#getCalibrator <em>Calibrator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getContextCalibratorType2()
 * @model extendedMetaData="name='ContextCalibratorType' kind='elementOnly'"
 * @generated
 */
public interface ContextCalibratorType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Context Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Match</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Match</em>' containment reference.
	 * @see #setContextMatch(MatchCriteriaType)
	 * @see org.omg.space.xtce.XtcePackage#getContextCalibratorType2_ContextMatch()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ContextMatch' namespace='##targetNamespace'"
	 * @generated
	 */
	MatchCriteriaType getContextMatch();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ContextCalibratorType2#getContextMatch <em>Context Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Match</em>' containment reference.
	 * @see #getContextMatch()
	 * @generated
	 */
	void setContextMatch(MatchCriteriaType value);

	/**
	 * Returns the value of the '<em><b>Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calibrator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibrator</em>' containment reference.
	 * @see #setCalibrator(CalibratorType)
	 * @see org.omg.space.xtce.XtcePackage#getContextCalibratorType2_Calibrator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Calibrator' namespace='##targetNamespace'"
	 * @generated
	 */
	CalibratorType getCalibrator();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ContextCalibratorType2#getCalibrator <em>Calibrator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibrator</em>' containment reference.
	 * @see #getCalibrator()
	 * @generated
	 */
	void setCalibrator(CalibratorType value);

} // ContextCalibratorType2
