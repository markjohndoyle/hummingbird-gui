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
 * A representation of the model object '<em><b>Container Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Unordered Set of Containers
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ContainerSetType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.ContainerSetType#getSequenceContainer <em>Sequence Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getContainerSetType()
 * @model extendedMetaData="name='ContainerSetType' kind='elementOnly'"
 * @generated
 */
public interface ContainerSetType extends EObject {
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
	 * @see org.omg.space.xtce.XtcePackage#getContainerSetType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Sequence Container</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.SequenceContainerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SequenceContainers define sequences of parameters or other containers.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Container</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getContainerSetType_SequenceContainer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SequenceContainer' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SequenceContainerType> getSequenceContainer();

} // ContainerSetType
