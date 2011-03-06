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
 * A representation of the model object '<em><b>CRC Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.CRCType#getPolynomial <em>Polynomial</em>}</li>
 *   <li>{@link org.omg.space.xtce.CRCType#getBitsFromReference <em>Bits From Reference</em>}</li>
 *   <li>{@link org.omg.space.xtce.CRCType#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getCRCType()
 * @model extendedMetaData="name='CRC_._type' kind='elementOnly'"
 * @generated
 */
public interface CRCType extends EObject {
	/**
	 * Returns the value of the '<em><b>Polynomial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polynomial</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polynomial</em>' containment reference.
	 * @see #setPolynomial(PolynomialType)
	 * @see org.omg.space.xtce.XtcePackage#getCRCType_Polynomial()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Polynomial' namespace='##targetNamespace'"
	 * @generated
	 */
	PolynomialType getPolynomial();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CRCType#getPolynomial <em>Polynomial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polynomial</em>' containment reference.
	 * @see #getPolynomial()
	 * @generated
	 */
	void setPolynomial(PolynomialType value);

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
	 * @see org.omg.space.xtce.XtcePackage#getCRCType_BitsFromReference()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='bitsFromReference'"
	 * @generated
	 */
	BigInteger getBitsFromReference();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CRCType#getBitsFromReference <em>Bits From Reference</em>}' attribute.
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
	 * The literals are from the enumeration {@link org.omg.space.xtce.ReferenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see org.omg.space.xtce.ReferenceType
	 * @see #isSetReference()
	 * @see #unsetReference()
	 * @see #setReference(ReferenceType)
	 * @see org.omg.space.xtce.XtcePackage#getCRCType_Reference()
	 * @model default="start" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='reference'"
	 * @generated
	 */
	ReferenceType getReference();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CRCType#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see org.omg.space.xtce.ReferenceType
	 * @see #isSetReference()
	 * @see #unsetReference()
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ReferenceType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.CRCType#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReference()
	 * @see #getReference()
	 * @see #setReference(ReferenceType)
	 * @generated
	 */
	void unsetReference();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.CRCType#getReference <em>Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference</em>' attribute is set.
	 * @see #unsetReference()
	 * @see #getReference()
	 * @see #setReference(ReferenceType)
	 * @generated
	 */
	boolean isSetReference();

} // CRCType
