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
 * A representation of the model object '<em><b>Parity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ParityType#getBitsFromReference <em>Bits From Reference</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParityType#getReference <em>Reference</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParityType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getParityType()
 * @model extendedMetaData="name='Parity_._type' kind='empty'"
 * @generated
 */
public interface ParityType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bits From Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bits From Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bits From Reference</em>' attribute.
	 * @see #setBitsFromReference(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getParityType_BitsFromReference()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='bitsFromReference'"
	 * @generated
	 */
	BigInteger getBitsFromReference();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParityType#getBitsFromReference <em>Bits From Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bits From Reference</em>' attribute.
	 * @see #getBitsFromReference()
	 * @generated
	 */
	void setBitsFromReference(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * The default value is <code>"start"</code>.
	 * The literals are from the enumeration {@link org.omg.space.xtce.ReferenceType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see org.omg.space.xtce.ReferenceType1
	 * @see #isSetReference()
	 * @see #unsetReference()
	 * @see #setReference(ReferenceType1)
	 * @see org.omg.space.xtce.XtcePackage#getParityType_Reference()
	 * @model default="start" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='reference'"
	 * @generated
	 */
	ReferenceType1 getReference();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParityType#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see org.omg.space.xtce.ReferenceType1
	 * @see #isSetReference()
	 * @see #unsetReference()
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ReferenceType1 value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.ParityType#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReference()
	 * @see #getReference()
	 * @see #setReference(ReferenceType1)
	 * @generated
	 */
	void unsetReference();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.ParityType#getReference <em>Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference</em>' attribute is set.
	 * @see #unsetReference()
	 * @see #getReference()
	 * @see #setReference(ReferenceType1)
	 * @generated
	 */
	boolean isSetReference();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.space.xtce.TypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.omg.space.xtce.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see org.omg.space.xtce.XtcePackage#getParityType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParityType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.omg.space.xtce.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.ParityType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.ParityType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

} // ParityType
