/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restriction Criteria Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.RestrictionCriteriaType#getNextContainer <em>Next Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getRestrictionCriteriaType()
 * @model extendedMetaData="name='RestrictionCriteria_._type' kind='elementOnly'"
 * @generated
 */
public interface RestrictionCriteriaType extends MatchCriteriaType {
	/**
	 * Returns the value of the '<em><b>Next Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Container</em>' containment reference.
	 * @see #setNextContainer(ContainerRefType)
	 * @see org.omg.space.xtce.XtcePackage#getRestrictionCriteriaType_NextContainer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NextContainer' namespace='##targetNamespace'"
	 * @generated
	 */
	ContainerRefType getNextContainer();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.RestrictionCriteriaType#getNextContainer <em>Next Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Container</em>' containment reference.
	 * @see #getNextContainer()
	 * @generated
	 */
	void setNextContainer(ContainerRefType value);

} // RestrictionCriteriaType
