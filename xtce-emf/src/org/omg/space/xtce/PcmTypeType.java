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
 * A representation of the literals of the enumeration '<em><b>Pcm Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.omg.space.xtce.XtcePackage#getPcmTypeType()
 * @model extendedMetaData="name='pcmType_._type'"
 * @generated
 */
public enum PcmTypeType implements Enumerator {
	/**
	 * The '<em><b>NRZL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NRZL_VALUE
	 * @generated
	 * @ordered
	 */
	NRZL(0, "NRZL", "NRZL"),

	/**
	 * The '<em><b>NRZM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NRZM_VALUE
	 * @generated
	 * @ordered
	 */
	NRZM(1, "NRZM", "NRZM"),

	/**
	 * The '<em><b>NRZS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NRZS_VALUE
	 * @generated
	 * @ordered
	 */
	NRZS(2, "NRZS", "NRZS"),

	/**
	 * The '<em><b>Bi Phase L</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BI_PHASE_L_VALUE
	 * @generated
	 * @ordered
	 */
	BI_PHASE_L(3, "BiPhaseL", "BiPhaseL"),

	/**
	 * The '<em><b>Bi Phase M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BI_PHASE_M_VALUE
	 * @generated
	 * @ordered
	 */
	BI_PHASE_M(4, "BiPhaseM", "BiPhaseM"),

	/**
	 * The '<em><b>Bi Phase S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BI_PHASE_S_VALUE
	 * @generated
	 * @ordered
	 */
	BI_PHASE_S(5, "BiPhaseS", "BiPhaseS");

	/**
	 * The '<em><b>NRZL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NRZL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NRZL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NRZL_VALUE = 0;

	/**
	 * The '<em><b>NRZM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NRZM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NRZM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NRZM_VALUE = 1;

	/**
	 * The '<em><b>NRZS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NRZS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NRZS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NRZS_VALUE = 2;

	/**
	 * The '<em><b>Bi Phase L</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bi Phase L</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BI_PHASE_L
	 * @model name="BiPhaseL"
	 * @generated
	 * @ordered
	 */
	public static final int BI_PHASE_L_VALUE = 3;

	/**
	 * The '<em><b>Bi Phase M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bi Phase M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BI_PHASE_M
	 * @model name="BiPhaseM"
	 * @generated
	 * @ordered
	 */
	public static final int BI_PHASE_M_VALUE = 4;

	/**
	 * The '<em><b>Bi Phase S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bi Phase S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BI_PHASE_S
	 * @model name="BiPhaseS"
	 * @generated
	 * @ordered
	 */
	public static final int BI_PHASE_S_VALUE = 5;

	/**
	 * An array of all the '<em><b>Pcm Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PcmTypeType[] VALUES_ARRAY =
		new PcmTypeType[] {
			NRZL,
			NRZM,
			NRZS,
			BI_PHASE_L,
			BI_PHASE_M,
			BI_PHASE_S,
		};

	/**
	 * A public read-only list of all the '<em><b>Pcm Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PcmTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pcm Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PcmTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PcmTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pcm Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PcmTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PcmTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pcm Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PcmTypeType get(int value) {
		switch (value) {
			case NRZL_VALUE: return NRZL;
			case NRZM_VALUE: return NRZM;
			case NRZS_VALUE: return NRZS;
			case BI_PHASE_L_VALUE: return BI_PHASE_L;
			case BI_PHASE_M_VALUE: return BI_PHASE_M;
			case BI_PHASE_S_VALUE: return BI_PHASE_S;
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
	private PcmTypeType(int value, String name, String literal) {
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
	
} //PcmTypeType
