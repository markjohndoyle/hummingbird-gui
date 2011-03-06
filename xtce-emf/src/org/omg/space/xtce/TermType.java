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
 * A representation of the model object '<em><b>Term Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.TermType#getCoefficient <em>Coefficient</em>}</li>
 *   <li>{@link org.omg.space.xtce.TermType#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getTermType()
 * @model extendedMetaData="name='Term_._type' kind='empty'"
 * @generated
 */
public interface TermType extends EObject {
	/**
	 * Returns the value of the '<em><b>Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coefficient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficient</em>' attribute.
	 * @see #isSetCoefficient()
	 * @see #unsetCoefficient()
	 * @see #setCoefficient(double)
	 * @see org.omg.space.xtce.XtcePackage#getTermType_Coefficient()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='coefficient'"
	 * @generated
	 */
	double getCoefficient();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.TermType#getCoefficient <em>Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coefficient</em>' attribute.
	 * @see #isSetCoefficient()
	 * @see #unsetCoefficient()
	 * @see #getCoefficient()
	 * @generated
	 */
	void setCoefficient(double value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.TermType#getCoefficient <em>Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoefficient()
	 * @see #getCoefficient()
	 * @see #setCoefficient(double)
	 * @generated
	 */
	void unsetCoefficient();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.TermType#getCoefficient <em>Coefficient</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Coefficient</em>' attribute is set.
	 * @see #unsetCoefficient()
	 * @see #getCoefficient()
	 * @see #setCoefficient(double)
	 * @generated
	 */
	boolean isSetCoefficient();

	/**
	 * Returns the value of the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponent</em>' attribute.
	 * @see #isSetExponent()
	 * @see #unsetExponent()
	 * @see #setExponent(double)
	 * @see org.omg.space.xtce.XtcePackage#getTermType_Exponent()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='exponent'"
	 * @generated
	 */
	double getExponent();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.TermType#getExponent <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent</em>' attribute.
	 * @see #isSetExponent()
	 * @see #unsetExponent()
	 * @see #getExponent()
	 * @generated
	 */
	void setExponent(double value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.TermType#getExponent <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExponent()
	 * @see #getExponent()
	 * @see #setExponent(double)
	 * @generated
	 */
	void unsetExponent();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.TermType#getExponent <em>Exponent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exponent</em>' attribute is set.
	 * @see #unsetExponent()
	 * @see #getExponent()
	 * @see #setExponent(double)
	 * @generated
	 */
	boolean isSetExponent();

} // TermType
