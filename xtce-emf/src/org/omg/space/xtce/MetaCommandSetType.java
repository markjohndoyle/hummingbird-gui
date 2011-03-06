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
 * A representation of the model object '<em><b>Meta Command Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.MetaCommandSetType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.MetaCommandSetType#getMetaCommand <em>Meta Command</em>}</li>
 *   <li>{@link org.omg.space.xtce.MetaCommandSetType#getMetaCommandRef <em>Meta Command Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.MetaCommandSetType#getBlockMetaCommand <em>Block Meta Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getMetaCommandSetType()
 * @model extendedMetaData="name='MetaCommandSet_._type' kind='elementOnly'"
 * @generated
 */
public interface MetaCommandSetType extends EObject {
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
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandSetType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Meta Command</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.MetaCommandType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All commands to be sent on this mission are listed here.  In addition this area has verification and validation information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meta Command</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandSetType_MetaCommand()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MetaCommand' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MetaCommandType> getMetaCommand();

	/**
	 * Returns the value of the '<em><b>Meta Command Ref</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to include a MetaCommand defined in another sub-system in this sub-system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meta Command Ref</em>' attribute list.
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandSetType_MetaCommandRef()
	 * @model unique="false" dataType="org.omg.space.xtce.NameReferenceType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MetaCommandRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getMetaCommandRef();

	/**
	 * Returns the value of the '<em><b>Block Meta Command</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.BlockMetaCommandType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BlockMetaCommands are simply a list of individual MetaCommands that can be packaged up in a single BlockMetaCommand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Block Meta Command</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getMetaCommandSetType_BlockMetaCommand()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BlockMetaCommand' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BlockMetaCommandType> getBlockMetaCommand();

} // MetaCommandSetType
