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
 * A representation of the model object '<em><b>Argument List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ArgumentListType#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getArgumentListType()
 * @model extendedMetaData="name='ArgumentList_._type' kind='elementOnly'"
 * @generated
 */
public interface ArgumentListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ArgumentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getArgumentListType_Argument()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Argument' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArgumentType> getArgument();

} // ArgumentListType
