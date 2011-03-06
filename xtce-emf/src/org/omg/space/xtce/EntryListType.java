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
 * A representation of the model object '<em><b>Entry List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains an ordered list of Entries.  Used in Sequence Container
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.EntryListType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.EntryListType#getParameterRefEntry <em>Parameter Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.EntryListType#getParameterSegmentRefEntry <em>Parameter Segment Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.EntryListType#getContainerRefEntry <em>Container Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.EntryListType#getContainerSegmentRefEntry <em>Container Segment Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.EntryListType#getStreamSegmentEntry <em>Stream Segment Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.EntryListType#getIndirectParameterRefEntry <em>Indirect Parameter Ref Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.EntryListType#getArrayParameterRefEntry <em>Array Parameter Ref Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getEntryListType()
 * @model extendedMetaData="name='EntryListType' kind='elementOnly'"
 * @generated
 */
public interface EntryListType extends EObject {
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
	 * @see org.omg.space.xtce.XtcePackage#getEntryListType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Parameter Ref Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ParameterRefEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Ref Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Ref Entry</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getEntryListType_ParameterRefEntry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ParameterRefEntry' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ParameterRefEntryType> getParameterRefEntry();

	/**
	 * Returns the value of the '<em><b>Parameter Segment Ref Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ParameterSegmentRefEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Segment Ref Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Segment Ref Entry</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getEntryListType_ParameterSegmentRefEntry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ParameterSegmentRefEntry' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ParameterSegmentRefEntryType> getParameterSegmentRefEntry();

	/**
	 * Returns the value of the '<em><b>Container Ref Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ContainerRefEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Ref Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Ref Entry</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getEntryListType_ContainerRefEntry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContainerRefEntry' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ContainerRefEntryType> getContainerRefEntry();

	/**
	 * Returns the value of the '<em><b>Container Segment Ref Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ContainerSegmentRefEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Segment Ref Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Segment Ref Entry</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getEntryListType_ContainerSegmentRefEntry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContainerSegmentRefEntry' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ContainerSegmentRefEntryType> getContainerSegmentRefEntry();

	/**
	 * Returns the value of the '<em><b>Stream Segment Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.StreamSegmentEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stream Segment Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream Segment Entry</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getEntryListType_StreamSegmentEntry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StreamSegmentEntry' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<StreamSegmentEntryType> getStreamSegmentEntry();

	/**
	 * Returns the value of the '<em><b>Indirect Parameter Ref Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.IndirectParameterRefEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indirect Parameter Ref Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indirect Parameter Ref Entry</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getEntryListType_IndirectParameterRefEntry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IndirectParameterRefEntry' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IndirectParameterRefEntryType> getIndirectParameterRefEntry();

	/**
	 * Returns the value of the '<em><b>Array Parameter Ref Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ArrayParameterRefEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Parameter Ref Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Parameter Ref Entry</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getEntryListType_ArrayParameterRefEntry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ArrayParameterRefEntry' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ArrayParameterRefEntryType> getArrayParameterRefEntry();

} // EntryListType
