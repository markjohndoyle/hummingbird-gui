/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spline Calibrator Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.SplineCalibratorType#getSplinePoint <em>Spline Point</em>}</li>
 *   <li>{@link org.omg.space.xtce.SplineCalibratorType#isExtrapolate <em>Extrapolate</em>}</li>
 *   <li>{@link org.omg.space.xtce.SplineCalibratorType#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getSplineCalibratorType()
 * @model extendedMetaData="name='SplineCalibrator_._type' kind='elementOnly'"
 * @generated
 */
public interface SplineCalibratorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Spline Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.SplinePointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spline Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spline Point</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getSplineCalibratorType_SplinePoint()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='SplinePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SplinePointType> getSplinePoint();

	/**
	 * Returns the value of the '<em><b>Extrapolate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrapolate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrapolate</em>' attribute.
	 * @see #isSetExtrapolate()
	 * @see #unsetExtrapolate()
	 * @see #setExtrapolate(boolean)
	 * @see org.omg.space.xtce.XtcePackage#getSplineCalibratorType_Extrapolate()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='extrapolate'"
	 * @generated
	 */
	boolean isExtrapolate();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SplineCalibratorType#isExtrapolate <em>Extrapolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrapolate</em>' attribute.
	 * @see #isSetExtrapolate()
	 * @see #unsetExtrapolate()
	 * @see #isExtrapolate()
	 * @generated
	 */
	void setExtrapolate(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.SplineCalibratorType#isExtrapolate <em>Extrapolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrapolate()
	 * @see #isExtrapolate()
	 * @see #setExtrapolate(boolean)
	 * @generated
	 */
	void unsetExtrapolate();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.SplineCalibratorType#isExtrapolate <em>Extrapolate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrapolate</em>' attribute is set.
	 * @see #unsetExtrapolate()
	 * @see #isExtrapolate()
	 * @see #setExtrapolate(boolean)
	 * @generated
	 */
	boolean isSetExtrapolate();

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #isSetOrder()
	 * @see #unsetOrder()
	 * @see #setOrder(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getSplineCalibratorType_Order()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='order'"
	 * @generated
	 */
	BigInteger getOrder();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SplineCalibratorType#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #isSetOrder()
	 * @see #unsetOrder()
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.SplineCalibratorType#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrder()
	 * @see #getOrder()
	 * @see #setOrder(BigInteger)
	 * @generated
	 */
	void unsetOrder();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.SplineCalibratorType#getOrder <em>Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Order</em>' attribute is set.
	 * @see #unsetOrder()
	 * @see #getOrder()
	 * @see #setOrder(BigInteger)
	 * @generated
	 */
	boolean isSetOrder();

} // SplineCalibratorType
