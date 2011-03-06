/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.UnitSetType#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getUnitSetType()
 * @model extendedMetaData="name='UnitSet_._type' kind='elementOnly'"
 * @generated
 */
public interface UnitSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.UnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getUnitSetType_Unit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Unit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UnitType> getUnit();

} // UnitSetType
