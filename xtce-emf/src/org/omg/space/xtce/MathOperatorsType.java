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
 * A representation of the literals of the enumeration '<em><b>Math Operators Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Mathematical operators
 * <!-- end-model-doc -->
 * @see org.omg.space.xtce.XtcePackage#getMathOperatorsType()
 * @model extendedMetaData="name='MathOperatorsType'"
 * @generated
 */
public enum MathOperatorsType implements Enumerator {
	/**
	 * The '<em><b></b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #__VALUE
	 * @generated
	 * @ordered
	 */
	_(0, "_", "+"),

	/**
	 * The '<em><b>1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1_VALUE
	 * @generated
	 * @ordered
	 */
	_1(1, "_1", "-"),

	/**
	 * The '<em><b>Mult</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULT_VALUE
	 * @generated
	 * @ordered
	 */
	MULT(2, "mult", "mult"),

	/**
	 * The '<em><b>Div</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIV_VALUE
	 * @generated
	 * @ordered
	 */
	DIV(3, "div", "div"),

	/**
	 * The '<em><b>Mod</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOD_VALUE
	 * @generated
	 * @ordered
	 */
	MOD(4, "mod", "mod"),

	/**
	 * The '<em><b>Exp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXP_VALUE
	 * @generated
	 * @ordered
	 */
	EXP(5, "exp", "exp"),

	/**
	 * The '<em><b>Bitor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITOR_VALUE
	 * @generated
	 * @ordered
	 */
	BITOR(6, "bitor", "bitor"),

	/**
	 * The '<em><b>Bitand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITAND_VALUE
	 * @generated
	 * @ordered
	 */
	BITAND(7, "bitand", "bitand"),

	/**
	 * The '<em><b>Bitxor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITXOR_VALUE
	 * @generated
	 * @ordered
	 */
	BITXOR(8, "bitxor", "bitxor");

	/**
	 * The '<em><b></b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b></b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_
	 * @model literal="+"
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
	 * @model literal="-"
	 * @generated
	 * @ordered
	 */
	public static final int _1_VALUE = 1;

	/**
	 * The '<em><b>Mult</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mult</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULT
	 * @model name="mult"
	 * @generated
	 * @ordered
	 */
	public static final int MULT_VALUE = 2;

	/**
	 * The '<em><b>Div</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Div</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIV
	 * @model name="div"
	 * @generated
	 * @ordered
	 */
	public static final int DIV_VALUE = 3;

	/**
	 * The '<em><b>Mod</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mod</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOD
	 * @model name="mod"
	 * @generated
	 * @ordered
	 */
	public static final int MOD_VALUE = 4;

	/**
	 * The '<em><b>Exp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXP
	 * @model name="exp"
	 * @generated
	 * @ordered
	 */
	public static final int EXP_VALUE = 5;

	/**
	 * The '<em><b>Bitor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bitor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BITOR
	 * @model name="bitor"
	 * @generated
	 * @ordered
	 */
	public static final int BITOR_VALUE = 6;

	/**
	 * The '<em><b>Bitand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bitand</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BITAND
	 * @model name="bitand"
	 * @generated
	 * @ordered
	 */
	public static final int BITAND_VALUE = 7;

	/**
	 * The '<em><b>Bitxor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bitxor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BITXOR
	 * @model name="bitxor"
	 * @generated
	 * @ordered
	 */
	public static final int BITXOR_VALUE = 8;

	/**
	 * An array of all the '<em><b>Math Operators Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MathOperatorsType[] VALUES_ARRAY =
		new MathOperatorsType[] {
			_,
			_1,
			MULT,
			DIV,
			MOD,
			EXP,
			BITOR,
			BITAND,
			BITXOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Math Operators Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MathOperatorsType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Math Operators Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MathOperatorsType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MathOperatorsType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Math Operators Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MathOperatorsType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MathOperatorsType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Math Operators Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MathOperatorsType get(int value) {
		switch (value) {
			case __VALUE: return _;
			case _1_VALUE: return _1;
			case MULT_VALUE: return MULT;
			case DIV_VALUE: return DIV;
			case MOD_VALUE: return MOD;
			case EXP_VALUE: return EXP;
			case BITOR_VALUE: return BITOR;
			case BITAND_VALUE: return BITAND;
			case BITXOR_VALUE: return BITXOR;
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
	private MathOperatorsType(int value, String name, String literal) {
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
	
} //MathOperatorsType
