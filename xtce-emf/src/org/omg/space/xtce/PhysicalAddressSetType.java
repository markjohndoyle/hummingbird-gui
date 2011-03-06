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
 * A representation of the model object '<em><b>Physical Address Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.PhysicalAddressSetType#getPhysicalAddress <em>Physical Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getPhysicalAddressSetType()
 * @model extendedMetaData="name='PhysicalAddressSet_._type' kind='elementOnly'"
 * @generated
 */
public interface PhysicalAddressSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Physical Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.PhysicalAddressType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the address (e.g., channel information) required to process the spacecraft telemetry streams. May be an onboard  id, a mux address, or a physical location.
	 * Contains the address (channel information) required to process the spacecraft telemetry streams
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Address</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getPhysicalAddressSetType_PhysicalAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PhysicalAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PhysicalAddressType1> getPhysicalAddress();

} // PhysicalAddressSetType
