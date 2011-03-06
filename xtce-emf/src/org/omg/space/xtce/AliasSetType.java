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
 * A representation of the model object '<em><b>Alias Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains an unordered collection of Alias's
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.AliasSetType#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getAliasSetType()
 * @model extendedMetaData="name='AliasSetType' kind='elementOnly'"
 * @generated
 */
public interface AliasSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.AliasType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to contain an alias (alternate) name or ID for the the object.   For example, a parameter may have a mnemonic, an on-board id, and special IDs used by various ground software applications; all of these are alias's.  Some ground system processing equipent has some severe naming restrictions on parameters (e.g., names must less then 12 characters, single case or integral id's only); their alias's provide a means of capturing each name in a "nameSpace".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getAliasSetType_Alias()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Alias' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AliasType> getAlias();

} // AliasSetType
