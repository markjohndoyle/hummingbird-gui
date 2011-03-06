/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rate In Stream Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.RateInStreamType#getStreamRef <em>Stream Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getRateInStreamType()
 * @model extendedMetaData="name='RateInStream_._type' kind='empty'"
 * @generated
 */
public interface RateInStreamType extends RateInStreamType1 {
	/**
	 * Returns the value of the '<em><b>Stream Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stream Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream Ref</em>' attribute.
	 * @see #setStreamRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getRateInStreamType_StreamRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='streamRef'"
	 * @generated
	 */
	String getStreamRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.RateInStreamType#getStreamRef <em>Stream Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Ref</em>' attribute.
	 * @see #getStreamRef()
	 * @generated
	 */
	void setStreamRef(String value);

} // RateInStreamType
