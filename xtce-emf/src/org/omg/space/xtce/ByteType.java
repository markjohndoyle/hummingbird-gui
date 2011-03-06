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
 * A representation of the model object '<em><b>Byte Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ByteType#getByteSignificance <em>Byte Significance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getByteType()
 * @model extendedMetaData="name='Byte_._type' kind='empty'"
 * @generated
 */
public interface ByteType extends EObject {
	/**
	 * Returns the value of the '<em><b>Byte Significance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Significance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Significance</em>' attribute.
	 * @see #setByteSignificance(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getByteType_ByteSignificance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='byteSignificance'"
	 * @generated
	 */
	BigInteger getByteSignificance();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ByteType#getByteSignificance <em>Byte Significance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Significance</em>' attribute.
	 * @see #getByteSignificance()
	 * @generated
	 */
	void setByteSignificance(BigInteger value);

} // ByteType
