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
 * A representation of the model object '<em><b>Byte Order Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ordered list of bytes where the order of the bytes is in stream order.  Each byte has an attribute giving its significance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ByteOrderType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.ByteOrderType#getByte <em>Byte</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getByteOrderType()
 * @model extendedMetaData="name='ByteOrderType' kind='elementOnly'"
 * @generated
 */
public interface ByteOrderType extends EObject {
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
	 * @see org.omg.space.xtce.XtcePackage#getByteOrderType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Byte</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ByteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getByteOrderType_Byte()
	 * @model containment="true" lower="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Byte' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ByteType> getByte();

} // ByteOrderType
