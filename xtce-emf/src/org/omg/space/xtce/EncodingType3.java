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
 * A representation of the literals of the enumeration '<em><b>Encoding Type3</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.omg.space.xtce.XtcePackage#getEncodingType3()
 * @model extendedMetaData="name='encoding_._2_._type'"
 * @generated
 */
public enum EncodingType3 implements Enumerator {
	/**
	 * The '<em><b>IEEE7541985</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEEE7541985_VALUE
	 * @generated
	 * @ordered
	 */
	IEEE7541985(0, "IEEE7541985", "IEEE754_1985"),

	/**
	 * The '<em><b>MILSTD1750A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILSTD1750A_VALUE
	 * @generated
	 * @ordered
	 */
	MILSTD1750A(1, "MILSTD1750A", "MILSTD_1750A");

	/**
	 * The '<em><b>IEEE7541985</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IEEE7541985</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IEEE7541985
	 * @model literal="IEEE754_1985"
	 * @generated
	 * @ordered
	 */
	public static final int IEEE7541985_VALUE = 0;

	/**
	 * The '<em><b>MILSTD1750A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MILSTD1750A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MILSTD1750A
	 * @model literal="MILSTD_1750A"
	 * @generated
	 * @ordered
	 */
	public static final int MILSTD1750A_VALUE = 1;

	/**
	 * An array of all the '<em><b>Encoding Type3</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EncodingType3[] VALUES_ARRAY =
		new EncodingType3[] {
			IEEE7541985,
			MILSTD1750A,
		};

	/**
	 * A public read-only list of all the '<em><b>Encoding Type3</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EncodingType3> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Encoding Type3</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EncodingType3 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncodingType3 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encoding Type3</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EncodingType3 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncodingType3 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encoding Type3</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EncodingType3 get(int value) {
		switch (value) {
			case IEEE7541985_VALUE: return IEEE7541985;
			case MILSTD1750A_VALUE: return MILSTD1750A;
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
	private EncodingType3(int value, String name, String literal) {
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
	
} //EncodingType3
