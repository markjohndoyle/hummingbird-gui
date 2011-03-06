/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains an unordered set of Streams.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.StreamSetType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.StreamSetType#getFixedFrameStream <em>Fixed Frame Stream</em>}</li>
 *   <li>{@link org.omg.space.xtce.StreamSetType#getVariableFrameStream <em>Variable Frame Stream</em>}</li>
 *   <li>{@link org.omg.space.xtce.StreamSetType#getCustomStream <em>Custom Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getStreamSetType()
 * @model extendedMetaData="name='StreamSetType' kind='elementOnly'"
 * @generated
 */
public interface StreamSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.omg.space.xtce.XtcePackage#getStreamSetType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Fixed Frame Stream</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.FixedFrameStreamType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Frame Stream</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Frame Stream</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getStreamSetType_FixedFrameStream()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FixedFrameStream' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FixedFrameStreamType> getFixedFrameStream();

	/**
	 * Returns the value of the '<em><b>Variable Frame Stream</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.VariableFrameStreamType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Frame Stream</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Frame Stream</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getStreamSetType_VariableFrameStream()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VariableFrameStream' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<VariableFrameStreamType> getVariableFrameStream();

	/**
	 * Returns the value of the '<em><b>Custom Stream</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.CustomStreamType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Stream</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Stream</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getStreamSetType_CustomStream()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CustomStream' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CustomStreamType> getCustomStream();

} // StreamSetType
