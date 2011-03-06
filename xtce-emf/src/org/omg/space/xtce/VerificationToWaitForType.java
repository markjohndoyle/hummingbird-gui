/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Verification To Wait For Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.omg.space.xtce.XtcePackage#getVerificationToWaitForType()
 * @model extendedMetaData="name='verificationToWaitFor_._type'"
 * @generated
 */
public enum VerificationToWaitForType implements Enumerator {
	/**
	 * The '<em><b>Transferred To Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFERRED_TO_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFERRED_TO_RANGE(0, "transferredToRange", "transferredToRange"),

	/**
	 * The '<em><b>Sent From Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENT_FROM_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	SENT_FROM_RANGE(1, "sentFromRange", "sentFromRange"),

	/**
	 * The '<em><b>Received</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVED_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIVED(2, "received", "received"),

	/**
	 * The '<em><b>Accepted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTED(3, "accepted", "accepted"),

	/**
	 * The '<em><b>Queued</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUEUED_VALUE
	 * @generated
	 * @ordered
	 */
	QUEUED(4, "queued", "queued"),

	/**
	 * The '<em><b>Executing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTING_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTING(5, "executing", "executing"),

	/**
	 * The '<em><b>Complete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETE(6, "complete", "complete");

	/**
	 * The '<em><b>Transferred To Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transferred To Range</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSFERRED_TO_RANGE
	 * @model name="transferredToRange"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFERRED_TO_RANGE_VALUE = 0;

	/**
	 * The '<em><b>Sent From Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sent From Range</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SENT_FROM_RANGE
	 * @model name="sentFromRange"
	 * @generated
	 * @ordered
	 */
	public static final int SENT_FROM_RANGE_VALUE = 1;

	/**
	 * The '<em><b>Received</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Received</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECEIVED
	 * @model name="received"
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVED_VALUE = 2;

	/**
	 * The '<em><b>Accepted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Accepted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED
	 * @model name="accepted"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTED_VALUE = 3;

	/**
	 * The '<em><b>Queued</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Queued</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUEUED
	 * @model name="queued"
	 * @generated
	 * @ordered
	 */
	public static final int QUEUED_VALUE = 4;

	/**
	 * The '<em><b>Executing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Executing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXECUTING
	 * @model name="executing"
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTING_VALUE = 5;

	/**
	 * The '<em><b>Complete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Complete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETE
	 * @model name="complete"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Verification To Wait For Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VerificationToWaitForType[] VALUES_ARRAY =
		new VerificationToWaitForType[] {
			TRANSFERRED_TO_RANGE,
			SENT_FROM_RANGE,
			RECEIVED,
			ACCEPTED,
			QUEUED,
			EXECUTING,
			COMPLETE,
		};

	/**
	 * A public read-only list of all the '<em><b>Verification To Wait For Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VerificationToWaitForType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Verification To Wait For Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VerificationToWaitForType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VerificationToWaitForType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Verification To Wait For Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VerificationToWaitForType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VerificationToWaitForType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Verification To Wait For Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VerificationToWaitForType get(int value) {
		switch (value) {
			case TRANSFERRED_TO_RANGE_VALUE: return TRANSFERRED_TO_RANGE;
			case SENT_FROM_RANGE_VALUE: return SENT_FROM_RANGE;
			case RECEIVED_VALUE: return RECEIVED;
			case ACCEPTED_VALUE: return ACCEPTED;
			case QUEUED_VALUE: return QUEUED;
			case EXECUTING_VALUE: return EXECUTING;
			case COMPLETE_VALUE: return COMPLETE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private VerificationToWaitForType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //VerificationToWaitForType
