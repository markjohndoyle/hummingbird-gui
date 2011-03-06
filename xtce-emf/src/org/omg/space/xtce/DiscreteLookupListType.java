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
 * A representation of the model object '<em><b>Discrete Lookup List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.DiscreteLookupListType#getDiscreteLookup <em>Discrete Lookup</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getDiscreteLookupListType()
 * @model extendedMetaData="name='DiscreteLookupList_._type' kind='elementOnly'"
 * @generated
 */
public interface DiscreteLookupListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Discrete Lookup</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.DiscreteLookupType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discrete Lookup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discrete Lookup</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getDiscreteLookupListType_DiscreteLookup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DiscreteLookup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DiscreteLookupType> getDiscreteLookup();

} // DiscreteLookupListType
