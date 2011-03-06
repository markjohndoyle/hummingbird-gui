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
 * A representation of the model object '<em><b>Dimension Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.DimensionType#getStartingIndex <em>Starting Index</em>}</li>
 *   <li>{@link org.omg.space.xtce.DimensionType#getEndingIndex <em>Ending Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getDimensionType()
 * @model extendedMetaData="name='Dimension_._type' kind='elementOnly'"
 * @generated
 */
public interface DimensionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Starting Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * zero based index
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Starting Index</em>' containment reference.
	 * @see #setStartingIndex(IntegerValueType)
	 * @see org.omg.space.xtce.XtcePackage#getDimensionType_StartingIndex()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StartingIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerValueType getStartingIndex();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.DimensionType#getStartingIndex <em>Starting Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Index</em>' containment reference.
	 * @see #getStartingIndex()
	 * @generated
	 */
	void setStartingIndex(IntegerValueType value);

	/**
	 * Returns the value of the '<em><b>Ending Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ending Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ending Index</em>' containment reference.
	 * @see #setEndingIndex(IntegerValueType)
	 * @see org.omg.space.xtce.XtcePackage#getDimensionType_EndingIndex()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EndingIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerValueType getEndingIndex();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.DimensionType#getEndingIndex <em>Ending Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending Index</em>' containment reference.
	 * @see #getEndingIndex()
	 * @generated
	 */
	void setEndingIndex(IntegerValueType value);

} // DimensionType
