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
 * A representation of the model object '<em><b>Base Container Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.BaseContainerType#getRestrictionCriteria <em>Restriction Criteria</em>}</li>
 *   <li>{@link org.omg.space.xtce.BaseContainerType#getContainerRef <em>Container Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getBaseContainerType()
 * @model extendedMetaData="name='BaseContainer_._type' kind='elementOnly'"
 * @generated
 */
public interface BaseContainerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Restriction Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given that this Container is the Base container type, RestrictionCriteria lists conditions that must be true for this Container to be 'this' subContainer type.  May be a simple Comparison List, a Boolean Expression, and/or in a Graph of containers established by the NextContainer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Restriction Criteria</em>' containment reference.
	 * @see #setRestrictionCriteria(RestrictionCriteriaType)
	 * @see org.omg.space.xtce.XtcePackage#getBaseContainerType_RestrictionCriteria()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RestrictionCriteria' namespace='##targetNamespace'"
	 * @generated
	 */
	RestrictionCriteriaType getRestrictionCriteria();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BaseContainerType#getRestrictionCriteria <em>Restriction Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction Criteria</em>' containment reference.
	 * @see #getRestrictionCriteria()
	 * @generated
	 */
	void setRestrictionCriteria(RestrictionCriteriaType value);

	/**
	 * Returns the value of the '<em><b>Container Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Ref</em>' attribute.
	 * @see #setContainerRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getBaseContainerType_ContainerRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='containerRef'"
	 * @generated
	 */
	String getContainerRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BaseContainerType#getContainerRef <em>Container Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Ref</em>' attribute.
	 * @see #getContainerRef()
	 * @generated
	 */
	void setContainerRef(String value);

} // BaseContainerType
