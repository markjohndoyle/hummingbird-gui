/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spline Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * a spline is a set on points from which a curve may be drawn to interpolate raw to calibrated values
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.SplinePointType#getCalibrated <em>Calibrated</em>}</li>
 *   <li>{@link org.omg.space.xtce.SplinePointType#getOrder <em>Order</em>}</li>
 *   <li>{@link org.omg.space.xtce.SplinePointType#getRaw <em>Raw</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getSplinePointType()
 * @model extendedMetaData="name='SplinePointType' kind='empty'"
 * @generated
 */
public interface SplinePointType extends EObject {
	/**
	 * Returns the value of the '<em><b>Calibrated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calibrated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibrated</em>' attribute.
	 * @see #isSetCalibrated()
	 * @see #unsetCalibrated()
	 * @see #setCalibrated(double)
	 * @see org.omg.space.xtce.XtcePackage#getSplinePointType_Calibrated()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='calibrated'"
	 * @generated
	 */
	double getCalibrated();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SplinePointType#getCalibrated <em>Calibrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibrated</em>' attribute.
	 * @see #isSetCalibrated()
	 * @see #unsetCalibrated()
	 * @see #getCalibrated()
	 * @generated
	 */
	void setCalibrated(double value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.SplinePointType#getCalibrated <em>Calibrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCalibrated()
	 * @see #getCalibrated()
	 * @see #setCalibrated(double)
	 * @generated
	 */
	void unsetCalibrated();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.SplinePointType#getCalibrated <em>Calibrated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Calibrated</em>' attribute is set.
	 * @see #unsetCalibrated()
	 * @see #getCalibrated()
	 * @see #setCalibrated(double)
	 * @generated
	 */
	boolean isSetCalibrated();

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
	 * @see org.omg.space.xtce.XtcePackage#getSplinePointType_Order()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='order'"
	 * @generated
	 */
	BigInteger getOrder();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SplinePointType#getOrder <em>Order</em>}' attribute.
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
	 * Unsets the value of the '{@link org.omg.space.xtce.SplinePointType#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrder()
	 * @see #getOrder()
	 * @see #setOrder(BigInteger)
	 * @generated
	 */
	void unsetOrder();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.SplinePointType#getOrder <em>Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Order</em>' attribute is set.
	 * @see #unsetOrder()
	 * @see #getOrder()
	 * @see #setOrder(BigInteger)
	 * @generated
	 */
	boolean isSetOrder();

	/**
	 * Returns the value of the '<em><b>Raw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw</em>' attribute.
	 * @see #isSetRaw()
	 * @see #unsetRaw()
	 * @see #setRaw(double)
	 * @see org.omg.space.xtce.XtcePackage#getSplinePointType_Raw()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='raw'"
	 * @generated
	 */
	double getRaw();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SplinePointType#getRaw <em>Raw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw</em>' attribute.
	 * @see #isSetRaw()
	 * @see #unsetRaw()
	 * @see #getRaw()
	 * @generated
	 */
	void setRaw(double value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.SplinePointType#getRaw <em>Raw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRaw()
	 * @see #getRaw()
	 * @see #setRaw(double)
	 * @generated
	 */
	void unsetRaw();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.SplinePointType#getRaw <em>Raw</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Raw</em>' attribute is set.
	 * @see #unsetRaw()
	 * @see #getRaw()
	 * @see #setRaw(double)
	 * @generated
	 */
	boolean isSetRaw();

} // SplinePointType
