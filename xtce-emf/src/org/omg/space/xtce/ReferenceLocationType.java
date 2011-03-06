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
 * A representation of the literals of the enumeration '<em><b>Reference Location Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.omg.space.xtce.XtcePackage#getReferenceLocationType()
 * @model extendedMetaData="name='referenceLocation_._type'"
 * @generated
 */
public enum ReferenceLocationType implements Enumerator {
	/**
	 * The '<em><b>Container Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINER_START_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINER_START(0, "containerStart", "containerStart"),

	/**
	 * The '<em><b>Container End</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINER_END_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINER_END(1, "containerEnd", "containerEnd"),

	/**
	 * The '<em><b>Previous Entry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVIOUS_ENTRY_VALUE
	 * @generated
	 * @ordered
	 */
	PREVIOUS_ENTRY(2, "previousEntry", "previousEntry"),

	/**
	 * The '<em><b>Next Entry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEXT_ENTRY_VALUE
	 * @generated
	 * @ordered
	 */
	NEXT_ENTRY(3, "nextEntry", "nextEntry");

	/**
	 * The '<em><b>Container Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Container Start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTAINER_START
	 * @model name="containerStart"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER_START_VALUE = 0;

	/**
	 * The '<em><b>Container End</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Container End</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTAINER_END
	 * @model name="containerEnd"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER_END_VALUE = 1;

	/**
	 * The '<em><b>Previous Entry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Previous Entry</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREVIOUS_ENTRY
	 * @model name="previousEntry"
	 * @generated
	 * @ordered
	 */
	public static final int PREVIOUS_ENTRY_VALUE = 2;

	/**
	 * The '<em><b>Next Entry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Next Entry</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEXT_ENTRY
	 * @model name="nextEntry"
	 * @generated
	 * @ordered
	 */
	public static final int NEXT_ENTRY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Reference Location Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReferenceLocationType[] VALUES_ARRAY =
		new ReferenceLocationType[] {
			CONTAINER_START,
			CONTAINER_END,
			PREVIOUS_ENTRY,
			NEXT_ENTRY,
		};

	/**
	 * A public read-only list of all the '<em><b>Reference Location Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReferenceLocationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reference Location Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferenceLocationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceLocationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Location Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferenceLocationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceLocationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Location Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferenceLocationType get(int value) {
		switch (value) {
			case CONTAINER_START_VALUE: return CONTAINER_START;
			case CONTAINER_END_VALUE: return CONTAINER_END;
			case PREVIOUS_ENTRY_VALUE: return PREVIOUS_ENTRY;
			case NEXT_ENTRY_VALUE: return NEXT_ENTRY;
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
	private ReferenceLocationType(int value, String name, String literal) {
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
	
} //ReferenceLocationType
