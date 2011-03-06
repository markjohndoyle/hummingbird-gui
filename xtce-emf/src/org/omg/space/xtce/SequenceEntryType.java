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
 * A representation of the model object '<em><b>Sequence Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract type used by sequence containers.  An entry contains a location in the container.  The location may be either fixed or dynamic, absolute (to the start or end of the enclosing container, or relative (to either the previous or subsequent entry).  Entries may also repeat.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.SequenceEntryType#getLocationInContainerInBits <em>Location In Container In Bits</em>}</li>
 *   <li>{@link org.omg.space.xtce.SequenceEntryType#getRepeatEntry <em>Repeat Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.SequenceEntryType#getIncludeCondition <em>Include Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getSequenceEntryType()
 * @model extendedMetaData="name='SequenceEntryType' kind='elementOnly'"
 * @generated
 */
public interface SequenceEntryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Location In Container In Bits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If no LocationInContainer value is given, the entry is assumed to begin immediately after the previous entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location In Container In Bits</em>' containment reference.
	 * @see #setLocationInContainerInBits(LocationInContainerInBitsType)
	 * @see org.omg.space.xtce.XtcePackage#getSequenceEntryType_LocationInContainerInBits()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocationInContainerInBits' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationInContainerInBitsType getLocationInContainerInBits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SequenceEntryType#getLocationInContainerInBits <em>Location In Container In Bits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location In Container In Bits</em>' containment reference.
	 * @see #getLocationInContainerInBits()
	 * @generated
	 */
	void setLocationInContainerInBits(LocationInContainerInBitsType value);

	/**
	 * Returns the value of the '<em><b>Repeat Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * May be used when this entry repeats itself in the sequence container.  If not supplied, the entry does not repeat.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeat Entry</em>' containment reference.
	 * @see #setRepeatEntry(RepeatType)
	 * @see org.omg.space.xtce.XtcePackage#getSequenceEntryType_RepeatEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RepeatEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	RepeatType getRepeatEntry();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SequenceEntryType#getRepeatEntry <em>Repeat Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Entry</em>' containment reference.
	 * @see #getRepeatEntry()
	 * @generated
	 */
	void setRepeatEntry(RepeatType value);

	/**
	 * Returns the value of the '<em><b>Include Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This entry will only be included in the sequence when this condition is true.  If no IncludeCondition is given, then it is will be included.  A parameter that is not included will be treated as if it did not exist in the sequence at all.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Condition</em>' containment reference.
	 * @see #setIncludeCondition(MatchCriteriaType)
	 * @see org.omg.space.xtce.XtcePackage#getSequenceEntryType_IncludeCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IncludeCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	MatchCriteriaType getIncludeCondition();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SequenceEntryType#getIncludeCondition <em>Include Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Condition</em>' containment reference.
	 * @see #getIncludeCondition()
	 * @generated
	 */
	void setIncludeCondition(MatchCriteriaType value);

} // SequenceEntryType
