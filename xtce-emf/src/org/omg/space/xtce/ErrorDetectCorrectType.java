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
 * A representation of the model object '<em><b>Error Detect Correct Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A simple element that provides for simple, but common error checking and detection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ErrorDetectCorrectType#getParity <em>Parity</em>}</li>
 *   <li>{@link org.omg.space.xtce.ErrorDetectCorrectType#getCRC <em>CRC</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getErrorDetectCorrectType()
 * @model extendedMetaData="name='ErrorDetectCorrectType' kind='elementOnly'"
 * @generated
 */
public interface ErrorDetectCorrectType extends EObject {
	/**
	 * Returns the value of the '<em><b>Parity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bit position starts with 'zero'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parity</em>' containment reference.
	 * @see #setParity(ParityType)
	 * @see org.omg.space.xtce.XtcePackage#getErrorDetectCorrectType_Parity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Parity' namespace='##targetNamespace'"
	 * @generated
	 */
	ParityType getParity();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ErrorDetectCorrectType#getParity <em>Parity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parity</em>' containment reference.
	 * @see #getParity()
	 * @generated
	 */
	void setParity(ParityType value);

	/**
	 * Returns the value of the '<em><b>CRC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cyclic Redundancy Check definition. Legal values for coefficient's are 0 or 1. Exponents must be integer values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CRC</em>' containment reference.
	 * @see #setCRC(CRCType)
	 * @see org.omg.space.xtce.XtcePackage#getErrorDetectCorrectType_CRC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CRC' namespace='##targetNamespace'"
	 * @generated
	 */
	CRCType getCRC();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ErrorDetectCorrectType#getCRC <em>CRC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CRC</em>' containment reference.
	 * @see #getCRC()
	 * @generated
	 */
	void setCRC(CRCType value);

} // ErrorDetectCorrectType
