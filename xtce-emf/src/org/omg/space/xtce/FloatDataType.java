/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains a floating point value
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.FloatDataType#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.FloatDataType#getSizeInBits <em>Size In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getFloatDataType()
 * @model extendedMetaData="name='FloatDataType' kind='elementOnly'"
 * @generated
 */
public interface FloatDataType extends NumericDataType {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(BigDecimal)
	 * @see org.omg.space.xtce.XtcePackage#getFloatDataType_InitialValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='initialValue'"
	 * @generated
	 */
	BigDecimal getInitialValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.FloatDataType#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Size In Bits</b></em>' attribute.
	 * The default value is <code>"32"</code>.
	 * The literals are from the enumeration {@link org.omg.space.xtce.SizeInBitsType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size In Bits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size In Bits</em>' attribute.
	 * @see org.omg.space.xtce.SizeInBitsType1
	 * @see #isSetSizeInBits()
	 * @see #unsetSizeInBits()
	 * @see #setSizeInBits(SizeInBitsType1)
	 * @see org.omg.space.xtce.XtcePackage#getFloatDataType_SizeInBits()
	 * @model default="32" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='sizeInBits'"
	 * @generated
	 */
	SizeInBitsType1 getSizeInBits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.FloatDataType#getSizeInBits <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In Bits</em>' attribute.
	 * @see org.omg.space.xtce.SizeInBitsType1
	 * @see #isSetSizeInBits()
	 * @see #unsetSizeInBits()
	 * @see #getSizeInBits()
	 * @generated
	 */
	void setSizeInBits(SizeInBitsType1 value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.FloatDataType#getSizeInBits <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeInBits()
	 * @see #getSizeInBits()
	 * @see #setSizeInBits(SizeInBitsType1)
	 * @generated
	 */
	void unsetSizeInBits();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.FloatDataType#getSizeInBits <em>Size In Bits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size In Bits</em>' attribute is set.
	 * @see #unsetSizeInBits()
	 * @see #getSizeInBits()
	 * @see #setSizeInBits(SizeInBitsType1)
	 * @generated
	 */
	boolean isSetSizeInBits();

} // FloatDataType
