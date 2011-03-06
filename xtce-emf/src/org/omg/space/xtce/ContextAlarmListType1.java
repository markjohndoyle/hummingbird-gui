/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Alarm List Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ContextAlarmListType1#getContextAlarm <em>Context Alarm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getContextAlarmListType1()
 * @model extendedMetaData="name='ContextAlarmList_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface ContextAlarmListType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Context Alarm</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.ContextAlarmType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Alarm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Alarm</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getContextAlarmListType1_ContextAlarm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ContextAlarm' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContextAlarmType> getContextAlarm();

} // ContextAlarmListType1
