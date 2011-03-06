/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location In Container In Bits Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.LocationInContainerInBitsType#getReferenceLocation <em>Reference Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getLocationInContainerInBitsType()
 * @model extendedMetaData="name='LocationInContainerInBits_._type' kind='elementOnly'"
 * @generated
 */
public interface LocationInContainerInBitsType extends IntegerValueType {
	/**
	 * Returns the value of the '<em><b>Reference Location</b></em>' attribute.
	 * The default value is <code>"previousEntry"</code>.
	 * The literals are from the enumeration {@link org.omg.space.xtce.ReferenceLocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location may be relative to the start of the container (containerStart), relatitive to the end of the previous entry (previousEntry), relative to the end of the container (containerEnd), or relative to the entry that follows this one (nextEntry).  If going forward (containerStart and previousEntry) then, then the location refers to the start of the Entry.  If going backwards (containerEnd and nextEntry) then, the location refers to the end of the entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Location</em>' attribute.
	 * @see org.omg.space.xtce.ReferenceLocationType
	 * @see #isSetReferenceLocation()
	 * @see #unsetReferenceLocation()
	 * @see #setReferenceLocation(ReferenceLocationType)
	 * @see org.omg.space.xtce.XtcePackage#getLocationInContainerInBitsType_ReferenceLocation()
	 * @model default="previousEntry" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='referenceLocation'"
	 * @generated
	 */
	ReferenceLocationType getReferenceLocation();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.LocationInContainerInBitsType#getReferenceLocation <em>Reference Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Location</em>' attribute.
	 * @see org.omg.space.xtce.ReferenceLocationType
	 * @see #isSetReferenceLocation()
	 * @see #unsetReferenceLocation()
	 * @see #getReferenceLocation()
	 * @generated
	 */
	void setReferenceLocation(ReferenceLocationType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.LocationInContainerInBitsType#getReferenceLocation <em>Reference Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceLocation()
	 * @see #getReferenceLocation()
	 * @see #setReferenceLocation(ReferenceLocationType)
	 * @generated
	 */
	void unsetReferenceLocation();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.LocationInContainerInBitsType#getReferenceLocation <em>Reference Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Location</em>' attribute is set.
	 * @see #unsetReferenceLocation()
	 * @see #getReferenceLocation()
	 * @see #setReferenceLocation(ReferenceLocationType)
	 * @generated
	 */
	boolean isSetReferenceLocation();

} // LocationInContainerInBitsType
