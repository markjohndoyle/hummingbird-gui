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
 * A representation of the literals of the enumeration '<em><b>Basis Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.omg.space.xtce.XtcePackage#getBasisType()
 * @model extendedMetaData="name='basis_._type'"
 * @generated
 */
public enum BasisType implements Enumerator {
	/**
	 * The '<em><b>Per Second</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PER_SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	PER_SECOND(0, "perSecond", "perSecond"),

	/**
	 * The '<em><b>Per Container Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PER_CONTAINER_UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	PER_CONTAINER_UPDATE(1, "perContainerUpdate", "perContainerUpdate");

	/**
	 * The '<em><b>Per Second</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Per Second</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PER_SECOND
	 * @model name="perSecond"
	 * @generated
	 * @ordered
	 */
	public static final int PER_SECOND_VALUE = 0;

	/**
	 * The '<em><b>Per Container Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Per Container Update</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PER_CONTAINER_UPDATE
	 * @model name="perContainerUpdate"
	 * @generated
	 * @ordered
	 */
	public static final int PER_CONTAINER_UPDATE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Basis Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BasisType[] VALUES_ARRAY =
		new BasisType[] {
			PER_SECOND,
			PER_CONTAINER_UPDATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Basis Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BasisType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Basis Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasisType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BasisType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Basis Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasisType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BasisType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Basis Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasisType get(int value) {
		switch (value) {
			case PER_SECOND_VALUE: return PER_SECOND;
			case PER_CONTAINER_UPDATE_VALUE: return PER_CONTAINER_UPDATE;
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
	private BasisType(int value, String name, String literal) {
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
	
} //BasisType
