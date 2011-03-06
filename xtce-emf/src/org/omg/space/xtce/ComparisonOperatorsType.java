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
 * A representation of the literals of the enumeration '<em><b>Comparison Operators Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Operators to use when testing a boolean condition for a validity check
 * <!-- end-model-doc -->
 * @see org.omg.space.xtce.XtcePackage#getComparisonOperatorsType()
 * @model extendedMetaData="name='ComparisonOperatorsType'"
 * @generated
 */
public enum ComparisonOperatorsType implements Enumerator {
	/**
	 * The '<em><b></b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #__VALUE
	 * @generated
	 * @ordered
	 */
	_(0, "_", "=="),

	/**
	 * The '<em><b>1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1_VALUE
	 * @generated
	 * @ordered
	 */
	_1(1, "_1", "!="),

	/**
	 * The '<em><b>2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2_VALUE
	 * @generated
	 * @ordered
	 */
	_2(2, "_2", "<"),

	/**
	 * The '<em><b>3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_3_VALUE
	 * @generated
	 * @ordered
	 */
	_3(3, "_3", "<="),

	/**
	 * The '<em><b>4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_4_VALUE
	 * @generated
	 * @ordered
	 */
	_4(4, "_4", ">"),

	/**
	 * The '<em><b>5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_5_VALUE
	 * @generated
	 * @ordered
	 */
	_5(5, "_5", ">=");

	/**
	 * The '<em><b></b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b></b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_
	 * @model literal="=="
	 * @generated
	 * @ordered
	 */
	public static final int __VALUE = 0;

	/**
	 * The '<em><b>1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_1
	 * @model literal="!="
	 * @generated
	 * @ordered
	 */
	public static final int _1_VALUE = 1;

	/**
	 * The '<em><b>2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_2
	 * @model literal="<"
	 * @generated
	 * @ordered
	 */
	public static final int _2_VALUE = 2;

	/**
	 * The '<em><b>3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_3
	 * @model literal="<="
	 * @generated
	 * @ordered
	 */
	public static final int _3_VALUE = 3;

	/**
	 * The '<em><b>4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_4
	 * @model literal=">"
	 * @generated
	 * @ordered
	 */
	public static final int _4_VALUE = 4;

	/**
	 * The '<em><b>5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_5
	 * @model literal=">="
	 * @generated
	 * @ordered
	 */
	public static final int _5_VALUE = 5;

	/**
	 * An array of all the '<em><b>Comparison Operators Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComparisonOperatorsType[] VALUES_ARRAY =
		new ComparisonOperatorsType[] {
			_,
			_1,
			_2,
			_3,
			_4,
			_5,
		};

	/**
	 * A public read-only list of all the '<em><b>Comparison Operators Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComparisonOperatorsType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Comparison Operators Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComparisonOperatorsType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparisonOperatorsType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparison Operators Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComparisonOperatorsType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparisonOperatorsType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparison Operators Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComparisonOperatorsType get(int value) {
		switch (value) {
			case __VALUE: return _;
			case _1_VALUE: return _1;
			case _2_VALUE: return _2;
			case _3_VALUE: return _3;
			case _4_VALUE: return _4;
			case _5_VALUE: return _5;
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
	private ComparisonOperatorsType(int value, String name, String literal) {
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
	
} //ComparisonOperatorsType
