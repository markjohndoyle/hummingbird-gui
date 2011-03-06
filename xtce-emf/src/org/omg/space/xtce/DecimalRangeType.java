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
 * A representation of the model object '<em><b>Decimal Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A range of numbers.  "minInclusive", "minExclusive", "maxInclusive" and "maxExclusive" attributes are borrowed from the W3C schema language.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.DecimalRangeType#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link org.omg.space.xtce.DecimalRangeType#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link org.omg.space.xtce.DecimalRangeType#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link org.omg.space.xtce.DecimalRangeType#getMinInclusive <em>Min Inclusive</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getDecimalRangeType()
 * @model extendedMetaData="name='DecimalRangeType' kind='empty'"
 * @generated
 */
public interface DecimalRangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Exclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Exclusive</em>' attribute.
	 * @see #setMaxExclusive(BigDecimal)
	 * @see org.omg.space.xtce.XtcePackage#getDecimalRangeType_MaxExclusive()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='maxExclusive'"
	 * @generated
	 */
	BigDecimal getMaxExclusive();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.DecimalRangeType#getMaxExclusive <em>Max Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Exclusive</em>' attribute.
	 * @see #getMaxExclusive()
	 * @generated
	 */
	void setMaxExclusive(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Inclusive</em>' attribute.
	 * @see #setMaxInclusive(BigDecimal)
	 * @see org.omg.space.xtce.XtcePackage#getDecimalRangeType_MaxInclusive()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='maxInclusive'"
	 * @generated
	 */
	BigDecimal getMaxInclusive();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.DecimalRangeType#getMaxInclusive <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Inclusive</em>' attribute.
	 * @see #getMaxInclusive()
	 * @generated
	 */
	void setMaxInclusive(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Exclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Exclusive</em>' attribute.
	 * @see #setMinExclusive(BigDecimal)
	 * @see org.omg.space.xtce.XtcePackage#getDecimalRangeType_MinExclusive()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='minExclusive'"
	 * @generated
	 */
	BigDecimal getMinExclusive();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.DecimalRangeType#getMinExclusive <em>Min Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Exclusive</em>' attribute.
	 * @see #getMinExclusive()
	 * @generated
	 */
	void setMinExclusive(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Inclusive</em>' attribute.
	 * @see #setMinInclusive(BigDecimal)
	 * @see org.omg.space.xtce.XtcePackage#getDecimalRangeType_MinInclusive()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='minInclusive'"
	 * @generated
	 */
	BigDecimal getMinInclusive();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.DecimalRangeType#getMinInclusive <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Inclusive</em>' attribute.
	 * @see #getMinInclusive()
	 * @generated
	 */
	void setMinInclusive(BigDecimal value);

} // DecimalRangeType
