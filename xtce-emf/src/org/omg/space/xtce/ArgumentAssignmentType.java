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
 * A representation of the model object '<em><b>Argument Assignment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ArgumentAssignmentType#getArgumentName <em>Argument Name</em>}</li>
 *   <li>{@link org.omg.space.xtce.ArgumentAssignmentType#getArgumentValue <em>Argument Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getArgumentAssignmentType()
 * @model extendedMetaData="name='ArgumentAssignment_._type' kind='empty'"
 * @generated
 */
public interface ArgumentAssignmentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Argument Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Name</em>' attribute.
	 * @see #setArgumentName(String)
	 * @see org.omg.space.xtce.XtcePackage#getArgumentAssignmentType_ArgumentName()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='argumentName'"
	 * @generated
	 */
	String getArgumentName();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ArgumentAssignmentType#getArgumentName <em>Argument Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Name</em>' attribute.
	 * @see #getArgumentName()
	 * @generated
	 */
	void setArgumentName(String value);

	/**
	 * Returns the value of the '<em><b>Argument Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Value</em>' attribute.
	 * @see #setArgumentValue(String)
	 * @see org.omg.space.xtce.XtcePackage#getArgumentAssignmentType_ArgumentValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='argumentValue'"
	 * @generated
	 */
	String getArgumentValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ArgumentAssignmentType#getArgumentValue <em>Argument Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Value</em>' attribute.
	 * @see #getArgumentValue()
	 * @generated
	 */
	void setArgumentValue(String value);

} // ArgumentAssignmentType
