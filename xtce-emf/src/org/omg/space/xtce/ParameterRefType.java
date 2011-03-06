/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ParameterRefType#getTriggerName <em>Trigger Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getParameterRefType()
 * @model extendedMetaData="name='ParameterRef_._type' kind='simple'"
 * @generated
 */
public interface ParameterRefType extends ParameterRefType1 {
	/**
	 * Returns the value of the '<em><b>Trigger Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Name</em>' attribute.
	 * @see #setTriggerName(String)
	 * @see org.omg.space.xtce.XtcePackage#getParameterRefType_TriggerName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='triggerName'"
	 * @generated
	 */
	String getTriggerName();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterRefType#getTriggerName <em>Trigger Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Name</em>' attribute.
	 * @see #getTriggerName()
	 * @generated
	 */
	void setTriggerName(String value);

} // ParameterRefType
