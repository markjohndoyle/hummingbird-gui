/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to hold the unit(s) plus possibly the exponents for the units
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.UnitType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.omg.space.xtce.UnitType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.omg.space.xtce.UnitType#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.omg.space.xtce.UnitType#getPower <em>Power</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getUnitType()
 * @model extendedMetaData="name='UnitType' kind='mixed'"
 * @generated
 */
public interface UnitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.omg.space.xtce.XtcePackage#getUnitType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.omg.space.xtce.XtcePackage#getUnitType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.UnitType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #isSetFactor()
	 * @see #unsetFactor()
	 * @see #setFactor(String)
	 * @see org.omg.space.xtce.XtcePackage#getUnitType_Factor()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='factor'"
	 * @generated
	 */
	String getFactor();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.UnitType#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #isSetFactor()
	 * @see #unsetFactor()
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(String value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.UnitType#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFactor()
	 * @see #getFactor()
	 * @see #setFactor(String)
	 * @generated
	 */
	void unsetFactor();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.UnitType#getFactor <em>Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Factor</em>' attribute is set.
	 * @see #unsetFactor()
	 * @see #getFactor()
	 * @see #setFactor(String)
	 * @generated
	 */
	boolean isSetFactor();

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #isSetPower()
	 * @see #unsetPower()
	 * @see #setPower(BigDecimal)
	 * @see org.omg.space.xtce.XtcePackage#getUnitType_Power()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='power'"
	 * @generated
	 */
	BigDecimal getPower();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.UnitType#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #isSetPower()
	 * @see #unsetPower()
	 * @see #getPower()
	 * @generated
	 */
	void setPower(BigDecimal value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.UnitType#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPower()
	 * @see #getPower()
	 * @see #setPower(BigDecimal)
	 * @generated
	 */
	void unsetPower();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.UnitType#getPower <em>Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Power</em>' attribute is set.
	 * @see #unsetPower()
	 * @see #getPower()
	 * @see #setPower(BigDecimal)
	 * @generated
	 */
	boolean isSetPower();

} // UnitType
