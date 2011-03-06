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
 * A representation of the model object '<em><b>Rate In Stream Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.RateInStreamSetType#getRateInStream <em>Rate In Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getRateInStreamSetType()
 * @model extendedMetaData="name='RateInStreamSet_._type' kind='elementOnly'"
 * @generated
 */
public interface RateInStreamSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rate In Stream</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.RateInStreamType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate In Stream</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate In Stream</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getRateInStreamSetType_RateInStream()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RateInStream' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RateInStreamType> getRateInStream();

} // RateInStreamSetType
