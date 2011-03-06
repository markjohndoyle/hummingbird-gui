/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Adjustment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.LinearAdjustmentType#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.omg.space.xtce.LinearAdjustmentType#getSlope <em>Slope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getLinearAdjustmentType()
 * @model extendedMetaData="name='LinearAdjustment_._type' kind='empty'"
 * @generated
 */
public interface LinearAdjustmentType extends EObject {
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
	 * @see #setIntercept(BigDecimal)
	 * @see org.omg.space.xtce.XtcePackage#getLinearAdjustmentType_Intercept()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='intercept'"
	 * @generated
	 */
	BigDecimal getIntercept();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.LinearAdjustmentType#getIntercept <em>Intercept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intercept</em>' attribute.
	 * @see #isSetIntercept()
	 * @see #unsetIntercept()
	 * @see #getIntercept()
	 * @generated
	 */
	void setIntercept(BigDecimal value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.LinearAdjustmentType#getIntercept <em>Intercept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntercept()
	 * @see #getIntercept()
	 * @see #setIntercept(BigDecimal)
	 * @generated
	 */
	void unsetIntercept();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.LinearAdjustmentType#getIntercept <em>Intercept</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Intercept</em>' attribute is set.
	 * @see #unsetIntercept()
	 * @see #getIntercept()
	 * @see #setIntercept(BigDecimal)
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
	 * @see #setSlope(BigDecimal)
	 * @see org.omg.space.xtce.XtcePackage#getLinearAdjustmentType_Slope()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='slope'"
	 * @generated
	 */
	BigDecimal getSlope();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.LinearAdjustmentType#getSlope <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope</em>' attribute.
	 * @see #isSetSlope()
	 * @see #unsetSlope()
	 * @see #getSlope()
	 * @generated
	 */
	void setSlope(BigDecimal value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.LinearAdjustmentType#getSlope <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSlope()
	 * @see #getSlope()
	 * @see #setSlope(BigDecimal)
	 * @generated
	 */
	void unsetSlope();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.LinearAdjustmentType#getSlope <em>Slope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Slope</em>' attribute is set.
	 * @see #unsetSlope()
	 * @see #getSlope()
	 * @see #setSlope(BigDecimal)
	 * @generated
	 */
	boolean isSetSlope();

} // LinearAdjustmentType
