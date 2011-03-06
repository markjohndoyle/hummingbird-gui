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
 * A representation of the model object '<em><b>Repeat Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hold a structure that can be repeated X times, where X is the Count
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.RepeatType#getCount <em>Count</em>}</li>
 *   <li>{@link org.omg.space.xtce.RepeatType#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getRepeatType()
 * @model extendedMetaData="name='RepeatType' kind='elementOnly'"
 * @generated
 */
public interface RepeatType extends EObject {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value (either fixed or dynamic) that contains the count of repeated structures.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(IntegerValueType)
	 * @see org.omg.space.xtce.XtcePackage#getRepeatType_Count()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Count' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerValueType getCount();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.RepeatType#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(IntegerValueType value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the distance between repeating entries (the last bit of one entry to the start bit of the next entry)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(OffsetType)
	 * @see org.omg.space.xtce.XtcePackage#getRepeatType_Offset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Offset' namespace='##targetNamespace'"
	 * @generated
	 */
	OffsetType getOffset();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.RepeatType#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(OffsetType value);

} // RepeatType
