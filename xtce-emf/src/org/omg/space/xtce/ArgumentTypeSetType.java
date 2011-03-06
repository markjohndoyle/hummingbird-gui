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
 * A representation of the model object '<em><b>Argument Type Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ArgumentTypeSetType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.ArgumentTypeSetType#getStringArgumentType <em>String Argument Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.ArgumentTypeSetType#getEnumeratedArgumentType <em>Enumerated Argument Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.ArgumentTypeSetType#getIntegerArgumentType <em>Integer Argument Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.ArgumentTypeSetType#getBinaryArgumentType <em>Binary Argument Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.ArgumentTypeSetType#getFloatArgumentType <em>Float Argument Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.ArgumentTypeSetType#getBooleanArgumentType <em>Boolean Argument Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.ArgumentTypeSetType#getRelativeTimeAgumentType <em>Relative Time Agument Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.ArgumentTypeSetType#getAbsoluteTimeArgumentType <em>Absolute Time Argument Type</em>}</li>
 *   <li>{@link org.omg.space.xtce.ArgumentTypeSetType#getArgumementArrayType <em>Argumement Array Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getArgumentTypeSetType()
 * @model extendedMetaData="name='ArgumentTypeSet_._type' kind='elementOnly'"
 * @generated
 */
public interface ArgumentTypeSetType extends EObject {
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
	 * @see org.omg.space.xtce.XtcePackage#getArgumentTypeSetType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>String Argument Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.StringDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Argument Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Argument Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getArgumentTypeSetType_StringArgumentType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StringArgumentType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<StringDataType> getStringArgumentType();

	/**
	 * Returns the value of the '<em><b>Enumerated Argument Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.EnumeratedDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerated Argument Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerated Argument Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getArgumentTypeSetType_EnumeratedArgumentType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EnumeratedArgumentType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EnumeratedDataType> getEnumeratedArgumentType();

	/**
	 * Returns the value of the '<em><b>Integer Argument Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.IntegerArgumentTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Argument Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Argument Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getArgumentTypeSetType_IntegerArgumentType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IntegerArgumentType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IntegerArgumentTypeType> getIntegerArgumentType();

	/**
	 * Returns the value of the '<em><b>Binary Argument Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.BinaryDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Argument Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Argument Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getArgumentTypeSetType_BinaryArgumentType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BinaryArgumentType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BinaryDataType> getBinaryArgumentType();

	/**
	 * Returns the value of the '<em><b>Float Argument Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.FloatArgumentTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float Argument Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float Argument Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getArgumentTypeSetType_FloatArgumentType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FloatArgumentType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FloatArgumentTypeType> getFloatArgumentType();

	/**
	 * Returns the value of the '<em><b>Boolean Argument Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.BooleanDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Argument Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Argument Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getArgumentTypeSetType_BooleanArgumentType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BooleanArgumentType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BooleanDataType> getBooleanArgumentType();

	/**
	 * Returns the value of the '<em><b>Relative Time Agument Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.RelativeTimeDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Time Agument Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Time Agument Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getArgumentTypeSetType_RelativeTimeAgumentType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelativeTimeAgumentType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RelativeTimeDataType> getRelativeTimeAgumentType();

	/**
	 * Returns the value of the '<em><b>Absolute Time Argument Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.AbsoluteTimeDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Time Argument Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Time Argument Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getArgumentTypeSetType_AbsoluteTimeArgumentType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbsoluteTimeArgumentType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AbsoluteTimeDataType> getAbsoluteTimeArgumentType();

	/**
	 * Returns the value of the '<em><b>Argumement Array Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ArgumementArrayTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argumement Array Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argumement Array Type</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getArgumentTypeSetType_ArgumementArrayType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ArgumementArrayType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ArgumementArrayTypeType> getArgumementArrayType();

} // ArgumentTypeSetType
