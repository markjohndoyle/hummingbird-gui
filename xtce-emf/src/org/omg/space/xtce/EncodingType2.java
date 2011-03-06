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
 * A representation of the literals of the enumeration '<em><b>Encoding Type2</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.omg.space.xtce.XtcePackage#getEncodingType2()
 * @model extendedMetaData="name='encoding_._1_._type'"
 * @generated
 */
public enum EncodingType2 implements Enumerator {
	/**
	 * The '<em><b>Unsigned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED(0, "unsigned", "unsigned"),

	/**
	 * The '<em><b>Sign Magnitude</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGN_MAGNITUDE_VALUE
	 * @generated
	 * @ordered
	 */
	SIGN_MAGNITUDE(1, "signMagnitude", "signMagnitude"),

	/**
	 * The '<em><b>Twos Compliment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWOS_COMPLIMENT_VALUE
	 * @generated
	 * @ordered
	 */
	TWOS_COMPLIMENT(2, "twosCompliment", "twosCompliment"),

	/**
	 * The '<em><b>Ones Compliment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONES_COMPLIMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ONES_COMPLIMENT(3, "onesCompliment", "onesCompliment"),

	/**
	 * The '<em><b>BCD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BCD_VALUE
	 * @generated
	 * @ordered
	 */
	BCD(4, "BCD", "BCD"),

	/**
	 * The '<em><b>Packed BCD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKED_BCD_VALUE
	 * @generated
	 * @ordered
	 */
	PACKED_BCD(5, "packedBCD", "packedBCD");

	/**
	 * The '<em><b>Unsigned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED
	 * @model name="unsigned"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_VALUE = 0;

	/**
	 * The '<em><b>Sign Magnitude</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sign Magnitude</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGN_MAGNITUDE
	 * @model name="signMagnitude"
	 * @generated
	 * @ordered
	 */
	public static final int SIGN_MAGNITUDE_VALUE = 1;

	/**
	 * The '<em><b>Twos Compliment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Twos Compliment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWOS_COMPLIMENT
	 * @model name="twosCompliment"
	 * @generated
	 * @ordered
	 */
	public static final int TWOS_COMPLIMENT_VALUE = 2;

	/**
	 * The '<em><b>Ones Compliment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ones Compliment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONES_COMPLIMENT
	 * @model name="onesCompliment"
	 * @generated
	 * @ordered
	 */
	public static final int ONES_COMPLIMENT_VALUE = 3;

	/**
	 * The '<em><b>BCD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BCD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BCD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BCD_VALUE = 4;

	/**
	 * The '<em><b>Packed BCD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Packed BCD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PACKED_BCD
	 * @model name="packedBCD"
	 * @generated
	 * @ordered
	 */
	public static final int PACKED_BCD_VALUE = 5;

	/**
	 * An array of all the '<em><b>Encoding Type2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EncodingType2[] VALUES_ARRAY =
		new EncodingType2[] {
			UNSIGNED,
			SIGN_MAGNITUDE,
			TWOS_COMPLIMENT,
			ONES_COMPLIMENT,
			BCD,
			PACKED_BCD,
		};

	/**
	 * A public read-only list of all the '<em><b>Encoding Type2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EncodingType2> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Encoding Type2</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EncodingType2 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncodingType2 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encoding Type2</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EncodingType2 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncodingType2 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encoding Type2</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EncodingType2 get(int value) {
		switch (value) {
			case UNSIGNED_VALUE: return UNSIGNED;
			case SIGN_MAGNITUDE_VALUE: return SIGN_MAGNITUDE;
			case TWOS_COMPLIMENT_VALUE: return TWOS_COMPLIMENT;
			case ONES_COMPLIMENT_VALUE: return ONES_COMPLIMENT;
			case BCD_VALUE: return BCD;
			case PACKED_BCD_VALUE: return PACKED_BCD;
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
	private EncodingType2(int value, String name, String literal) {
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
	
} //EncodingType2
