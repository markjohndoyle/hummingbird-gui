/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The type definition used by most elements that require a name with optional descriptions.  The short description is intended to be used for quick "memory jogger" descriptions of the object.   
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.NameDescriptionType#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link org.omg.space.xtce.NameDescriptionType#getAliasSet <em>Alias Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.NameDescriptionType#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.space.xtce.NameDescriptionType#getShortDescription <em>Short Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getNameDescriptionType()
 * @model extendedMetaData="name='NameDescriptionType' kind='elementOnly'"
 * @generated
 */
public interface NameDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Long Description is intended to be used for explanitory descriptions of the object and may include HTML markup.  Long Decriptions are of unbounded length
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Long Description</em>' attribute.
	 * @see #setLongDescription(String)
	 * @see org.omg.space.xtce.XtcePackage#getNameDescriptionType_LongDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='LongDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLongDescription();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NameDescriptionType#getLongDescription <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Description</em>' attribute.
	 * @see #getLongDescription()
	 * @generated
	 */
	void setLongDescription(String value);

	/**
	 * Returns the value of the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Set</em>' containment reference.
	 * @see #setAliasSet(AliasSetType)
	 * @see org.omg.space.xtce.XtcePackage#getNameDescriptionType_AliasSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AliasSet' namespace='##targetNamespace'"
	 * @generated
	 */
	AliasSetType getAliasSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NameDescriptionType#getAliasSet <em>Alias Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Set</em>' containment reference.
	 * @see #getAliasSet()
	 * @generated
	 */
	void setAliasSet(AliasSetType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.space.xtce.XtcePackage#getNameDescriptionType_Name()
	 * @model dataType="org.omg.space.xtce.NameType" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NameDescriptionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It is strongly recommended that the short description be kept under 80 characters in length
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Short Description</em>' attribute.
	 * @see #setShortDescription(String)
	 * @see org.omg.space.xtce.XtcePackage#getNameDescriptionType_ShortDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='shortDescription'"
	 * @generated
	 */
	String getShortDescription();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NameDescriptionType#getShortDescription <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Description</em>' attribute.
	 * @see #getShortDescription()
	 * @generated
	 */
	void setShortDescription(String value);

} // NameDescriptionType
