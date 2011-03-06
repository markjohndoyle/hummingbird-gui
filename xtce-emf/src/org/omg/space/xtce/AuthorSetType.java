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
 * A representation of the model object '<em><b>Author Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.AuthorSetType#getAuthor <em>Author</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getAuthorSetType()
 * @model extendedMetaData="name='AuthorSet_._type' kind='elementOnly'"
 * @generated
 */
public interface AuthorSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute list.
	 * @see org.omg.space.xtce.XtcePackage#getAuthorSetType_Author()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Author' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getAuthor();

} // AuthorSetType
