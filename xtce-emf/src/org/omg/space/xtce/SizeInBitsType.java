/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size In Bits Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.SizeInBitsType#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.omg.space.xtce.SizeInBitsType#getTerminationChar <em>Termination Char</em>}</li>
 *   <li>{@link org.omg.space.xtce.SizeInBitsType#getLeadingSize <em>Leading Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getSizeInBitsType()
 * @model extendedMetaData="name='SizeInBits_._type' kind='elementOnly'"
 * @generated
 */
public interface SizeInBitsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Fixed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed</em>' containment reference.
	 * @see #setFixed(IntegerValueType)
	 * @see org.omg.space.xtce.XtcePackage#getSizeInBitsType_Fixed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fixed' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerValueType getFixed();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SizeInBitsType#getFixed <em>Fixed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed</em>' containment reference.
	 * @see #getFixed()
	 * @generated
	 */
	void setFixed(IntegerValueType value);

	/**
	 * Returns the value of the '<em><b>Termination Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Like C strings, they are terminated with a special string, usually a null character.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Termination Char</em>' attribute.
	 * @see #setTerminationChar(byte[])
	 * @see org.omg.space.xtce.XtcePackage#getSizeInBitsType_TerminationChar()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.HexBinary"
	 *        extendedMetaData="kind='element' name='TerminationChar' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getTerminationChar();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SizeInBitsType#getTerminationChar <em>Termination Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination Char</em>' attribute.
	 * @see #getTerminationChar()
	 * @generated
	 */
	void setTerminationChar(byte[] value);

	/**
	 * Returns the value of the '<em><b>Leading Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Like PASCAL strings, the size of the string is given as an integer at the start of the string.  SizeTag must be an unsigned Integer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leading Size</em>' containment reference.
	 * @see #setLeadingSize(LeadingSizeType)
	 * @see org.omg.space.xtce.XtcePackage#getSizeInBitsType_LeadingSize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LeadingSize' namespace='##targetNamespace'"
	 * @generated
	 */
	LeadingSizeType getLeadingSize();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SizeInBitsType#getLeadingSize <em>Leading Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leading Size</em>' containment reference.
	 * @see #getLeadingSize()
	 * @generated
	 */
	void setLeadingSize(LeadingSizeType value);

} // SizeInBitsType
