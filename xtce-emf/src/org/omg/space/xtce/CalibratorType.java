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
 * A representation of the model object '<em><b>Calibrator Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Calibrators are normally used to convert to and from bit compacted numerical data
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.CalibratorType#getSplineCalibrator <em>Spline Calibrator</em>}</li>
 *   <li>{@link org.omg.space.xtce.CalibratorType#getPolynomialCalibrator <em>Polynomial Calibrator</em>}</li>
 *   <li>{@link org.omg.space.xtce.CalibratorType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getCalibratorType()
 * @model extendedMetaData="name='CalibratorType' kind='elementOnly'"
 * @generated
 */
public interface CalibratorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Spline Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A calibration type where a segmented line in a raw vs calibrated plane is described using a set of points.  Raw values are converted to calibrated values by finding a position on the line coorosponding to the raw value. The algorithm triggers on the input parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spline Calibrator</em>' containment reference.
	 * @see #setSplineCalibrator(SplineCalibratorType)
	 * @see org.omg.space.xtce.XtcePackage#getCalibratorType_SplineCalibrator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SplineCalibrator' namespace='##targetNamespace'"
	 * @generated
	 */
	SplineCalibratorType getSplineCalibrator();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CalibratorType#getSplineCalibrator <em>Spline Calibrator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spline Calibrator</em>' containment reference.
	 * @see #getSplineCalibrator()
	 * @generated
	 */
	void setSplineCalibrator(SplineCalibratorType value);

	/**
	 * Returns the value of the '<em><b>Polynomial Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A calibration type where a curve in a raw vs calibrated plane is described using a set of polynomial coefficients.  Raw values are converted to calibrated values by finding a position on the curve corresponding to the raw value. The first coefficient belongs with the X^0 term, the next coefficient belongs to the X^1 term and so on. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polynomial Calibrator</em>' containment reference.
	 * @see #setPolynomialCalibrator(PolynomialType)
	 * @see org.omg.space.xtce.XtcePackage#getCalibratorType_PolynomialCalibrator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PolynomialCalibrator' namespace='##targetNamespace'"
	 * @generated
	 */
	PolynomialType getPolynomialCalibrator();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CalibratorType#getPolynomialCalibrator <em>Polynomial Calibrator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polynomial Calibrator</em>' containment reference.
	 * @see #getPolynomialCalibrator()
	 * @generated
	 */
	void setPolynomialCalibrator(PolynomialType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.space.xtce.XtcePackage#getCalibratorType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CalibratorType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CalibratorType
