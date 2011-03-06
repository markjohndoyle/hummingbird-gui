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
 * A representation of the literals of the enumeration '<em><b>Bit Order Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.omg.space.xtce.XtcePackage#getBitOrderType()
 * @model extendedMetaData="name='bitOrder_._type'"
 * @generated
 */
public enum BitOrderType implements Enumerator {
	/**
	 * The '<em><b>Least Significant Bit First</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAST_SIGNIFICANT_BIT_FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	LEAST_SIGNIFICANT_BIT_FIRST(0, "leastSignificantBitFirst", "leastSignificantBitFirst"),

	/**
	 * The '<em><b>Most Significant Bit First</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOST_SIGNIFICANT_BIT_FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	MOST_SIGNIFICANT_BIT_FIRST(1, "mostSignificantBitFirst", "mostSignificantBitFirst");

	/**
	 * The '<em><b>Least Significant Bit First</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Least Significant Bit First</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEAST_SIGNIFICANT_BIT_FIRST
	 * @model name="leastSignificantBitFirst"
	 * @generated
	 * @ordered
	 */
	public static final int LEAST_SIGNIFICANT_BIT_FIRST_VALUE = 0;

	/**
	 * The '<em><b>Most Significant Bit First</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Most Significant Bit First</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOST_SIGNIFICANT_BIT_FIRST
	 * @model name="mostSignificantBitFirst"
	 * @generated
	 * @ordered
	 */
	public static final int MOST_SIGNIFICANT_BIT_FIRST_VALUE = 1;

	/**
	 * An array of all the '<em><b>Bit Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BitOrderType[] VALUES_ARRAY =
		new BitOrderType[] {
			LEAST_SIGNIFICANT_BIT_FIRST,
			MOST_SIGNIFICANT_BIT_FIRST,
		};

	/**
	 * A public read-only list of all the '<em><b>Bit Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BitOrderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bit Order Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BitOrderType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BitOrderType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bit Order Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BitOrderType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BitOrderType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bit Order Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BitOrderType get(int value) {
		switch (value) {
			case LEAST_SIGNIFICANT_BIT_FIRST_VALUE: return LEAST_SIGNIFICANT_BIT_FIRST;
			case MOST_SIGNIFICANT_BIT_FIRST_VALUE: return MOST_SIGNIFICANT_BIT_FIRST;
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
	private BitOrderType(int value, String name, String literal) {
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
	
} //BitOrderType
