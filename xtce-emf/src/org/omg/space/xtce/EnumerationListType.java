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
 * A representation of the model object '<em><b>Enumeration List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.EnumerationListType#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getEnumerationListType()
 * @model extendedMetaData="name='EnumerationList_._type' kind='elementOnly'"
 * @generated
 */
public interface EnumerationListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ValueEnumerationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getEnumerationListType_Enumeration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Enumeration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueEnumerationType> getEnumeration();

} // EnumerationListType
