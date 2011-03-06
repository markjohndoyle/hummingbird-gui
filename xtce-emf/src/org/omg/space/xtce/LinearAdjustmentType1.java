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
 * A representation of the model object '<em><b>Linear Adjustment Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.LinearAdjustmentType1#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.omg.space.xtce.LinearAdjustmentType1#getSlope <em>Slope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getLinearAdjustmentType1()
 * @model extendedMetaData="name='LinearAdjustment_._1_._type' kind='empty'"
 * @generated
 */
public interface LinearAdjustmentType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Intercept</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercept</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intercept</em>' attribute.
	 * @see #isSetIntercept()
	 * @see #unsetIntercept()
	 * @see #setIntercept(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getLinearAdjustmentType1_Intercept()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='intercept'"
	 * @generated
	 */
	BigInteger getIntercept();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.LinearAdjustmentType1#getIntercept <em>Intercept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intercept</em>' attribute.
	 * @see #isSetIntercept()
	 * @see #unsetIntercept()
	 * @see #getIntercept()
	 * @generated
	 */
	void setIntercept(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.LinearAdjustmentType1#getIntercept <em>Intercept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntercept()
	 * @see #getIntercept()
	 * @see #setIntercept(BigInteger)
	 * @generated
	 */
	void unsetIntercept();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.LinearAdjustmentType1#getIntercept <em>Intercept</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Intercept</em>' attribute is set.
	 * @see #unsetIntercept()
	 * @see #getIntercept()
	 * @see #setIntercept(BigInteger)
	 * @generated
	 */
	boolean isSetIntercept();

	/**
	 * Returns the value of the '<em><b>Slope</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope</em>' attribute.
	 * @see #isSetSlope()
	 * @see #unsetSlope()
	 * @see #setSlope(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getLinearAdjustmentType1_Slope()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='slope'"
	 * @generated
	 */
	BigInteger getSlope();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.LinearAdjustmentType1#getSlope <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope</em>' attribute.
	 * @see #isSetSlope()
	 * @see #unsetSlope()
	 * @see #getSlope()
	 * @generated
	 */
	void setSlope(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.LinearAdjustmentType1#getSlope <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSlope()
	 * @see #getSlope()
	 * @see #setSlope(BigInteger)
	 * @generated
	 */
	void unsetSlope();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.LinearAdjustmentType1#getSlope <em>Slope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Slope</em>' attribute is set.
	 * @see #unsetSlope()
	 * @see #getSlope()
	 * @see #setSlope(BigInteger)
	 * @generated
	 */
	boolean isSetSlope();

} // LinearAdjustmentType1
