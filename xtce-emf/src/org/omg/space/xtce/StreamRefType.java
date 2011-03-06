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
 * A representation of the model object '<em><b>Stream Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Holds a reference to a stream
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.StreamRefType#getStreamRef <em>Stream Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getStreamRefType()
 * @model extendedMetaData="name='StreamRefType' kind='empty'"
 * @generated
 */
public interface StreamRefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stream Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * name of reference stream
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stream Ref</em>' attribute.
	 * @see #setStreamRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getStreamRefType_StreamRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='streamRef'"
	 * @generated
	 */
	String getStreamRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.StreamRefType#getStreamRef <em>Stream Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Ref</em>' attribute.
	 * @see #getStreamRef()
	 * @generated
	 */
	void setStreamRef(String value);

} // StreamRefType
