/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains an integral value
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.IntegerDataType#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.IntegerDataType#isSigned <em>Signed</em>}</li>
 *   <li>{@link org.omg.space.xtce.IntegerDataType#getSizeInBits <em>Size In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getIntegerDataType()
 * @model extendedMetaData="name='IntegerDataType' kind='elementOnly'"
 * @generated
 */
public interface IntegerDataType extends NumericDataType {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * base 10 integer value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getIntegerDataType_InitialValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='initialValue'"
	 * @generated
	 */
	BigInteger getInitialValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.IntegerDataType#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Signed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signed</em>' attribute.
	 * @see #isSetSigned()
	 * @see #unsetSigned()
	 * @see #setSigned(boolean)
	 * @see org.omg.space.xtce.XtcePackage#getIntegerDataType_Signed()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='signed'"
	 * @generated
	 */
	boolean isSigned();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.IntegerDataType#isSigned <em>Signed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signed</em>' attribute.
	 * @see #isSetSigned()
	 * @see #unsetSigned()
	 * @see #isSigned()
	 * @generated
	 */
	void setSigned(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.IntegerDataType#isSigned <em>Signed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSigned()
	 * @see #isSigned()
	 * @see #setSigned(boolean)
	 * @generated
	 */
	void unsetSigned();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.IntegerDataType#isSigned <em>Signed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Signed</em>' attribute is set.
	 * @see #unsetSigned()
	 * @see #isSigned()
	 * @see #setSigned(boolean)
	 * @generated
	 */
	boolean isSetSigned();

	/**
	 * Returns the value of the '<em><b>Size In Bits</b></em>' attribute.
	 * The default value is <code>"32"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size In Bits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size In Bits</em>' attribute.
	 * @see #isSetSizeInBits()
	 * @see #unsetSizeInBits()
	 * @see #setSizeInBits(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getIntegerDataType_SizeInBits()
	 * @model default="32" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='sizeInBits'"
	 * @generated
	 */
	BigInteger getSizeInBits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.IntegerDataType#getSizeInBits <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In Bits</em>' attribute.
	 * @see #isSetSizeInBits()
	 * @see #unsetSizeInBits()
	 * @see #getSizeInBits()
	 * @generated
	 */
	void setSizeInBits(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.IntegerDataType#getSizeInBits <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeInBits()
	 * @see #getSizeInBits()
	 * @see #setSizeInBits(BigInteger)
	 * @generated
	 */
	void unsetSizeInBits();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.IntegerDataType#getSizeInBits <em>Size In Bits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size In Bits</em>' attribute is set.
	 * @see #unsetSizeInBits()
	 * @see #getSizeInBits()
	 * @see #setSizeInBits(BigInteger)
	 * @generated
	 */
	boolean isSetSizeInBits();

} // IntegerDataType
