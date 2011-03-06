/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import javax.xml.datatype.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.TransmissionConstraintType#isSuspendable <em>Suspendable</em>}</li>
 *   <li>{@link org.omg.space.xtce.TransmissionConstraintType#getTimeOut <em>Time Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getTransmissionConstraintType()
 * @model extendedMetaData="name='TransmissionConstraint_._type' kind='elementOnly'"
 * @generated
 */
public interface TransmissionConstraintType extends MatchCriteriaType {
	/**
	 * Returns the value of the '<em><b>Suspendable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the contraints for a Command may be suspended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suspendable</em>' attribute.
	 * @see #isSetSuspendable()
	 * @see #unsetSuspendable()
	 * @see #setSuspendable(boolean)
	 * @see org.omg.space.xtce.XtcePackage#getTransmissionConstraintType_Suspendable()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='suspendable'"
	 * @generated
	 */
	boolean isSuspendable();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.TransmissionConstraintType#isSuspendable <em>Suspendable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspendable</em>' attribute.
	 * @see #isSetSuspendable()
	 * @see #unsetSuspendable()
	 * @see #isSuspendable()
	 * @generated
	 */
	void setSuspendable(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.TransmissionConstraintType#isSuspendable <em>Suspendable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuspendable()
	 * @see #isSuspendable()
	 * @see #setSuspendable(boolean)
	 * @generated
	 */
	void unsetSuspendable();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.TransmissionConstraintType#isSuspendable <em>Suspendable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Suspendable</em>' attribute is set.
	 * @see #unsetSuspendable()
	 * @see #isSuspendable()
	 * @see #setSuspendable(boolean)
	 * @generated
	 */
	boolean isSetSuspendable();

	/**
	 * Returns the value of the '<em><b>Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pause during timeOut, fail when the timeout passes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Out</em>' attribute.
	 * @see #setTimeOut(Duration)
	 * @see org.omg.space.xtce.XtcePackage#getTransmissionConstraintType_TimeOut()
	 * @model dataType="org.omg.space.xtce.RelativeTimeType"
	 *        extendedMetaData="kind='attribute' name='timeOut'"
	 * @generated
	 */
	Duration getTimeOut();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.TransmissionConstraintType#getTimeOut <em>Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Out</em>' attribute.
	 * @see #getTimeOut()
	 * @generated
	 */
	void setTimeOut(Duration value);

} // TransmissionConstraintType
