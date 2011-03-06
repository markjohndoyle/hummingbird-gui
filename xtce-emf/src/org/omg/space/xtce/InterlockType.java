/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interlock Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.InterlockType#getScopeToSpaceSystem <em>Scope To Space System</em>}</li>
 *   <li>{@link org.omg.space.xtce.InterlockType#isSuspendable <em>Suspendable</em>}</li>
 *   <li>{@link org.omg.space.xtce.InterlockType#getVerificationProgressPercentage <em>Verification Progress Percentage</em>}</li>
 *   <li>{@link org.omg.space.xtce.InterlockType#getVerificationToWaitFor <em>Verification To Wait For</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getInterlockType()
 * @model extendedMetaData="name='Interlock_._type' kind='empty'"
 * @generated
 */
public interface InterlockType extends EObject {
	/**
	 * Returns the value of the '<em><b>Scope To Space System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of a SpaceSystem this Interlock applies to.  By default, it only applies to the SpaceSystem that contains this MetaCommand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope To Space System</em>' attribute.
	 * @see #setScopeToSpaceSystem(String)
	 * @see org.omg.space.xtce.XtcePackage#getInterlockType_ScopeToSpaceSystem()
	 * @model dataType="org.omg.space.xtce.NameReferenceType"
	 *        extendedMetaData="kind='attribute' name='scopeToSpaceSystem'"
	 * @generated
	 */
	String getScopeToSpaceSystem();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.InterlockType#getScopeToSpaceSystem <em>Scope To Space System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope To Space System</em>' attribute.
	 * @see #getScopeToSpaceSystem()
	 * @generated
	 */
	void setScopeToSpaceSystem(String value);

	/**
	 * Returns the value of the '<em><b>Suspendable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag that indicates that under special circumstances, this Interlock can be suspended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suspendable</em>' attribute.
	 * @see #isSetSuspendable()
	 * @see #unsetSuspendable()
	 * @see #setSuspendable(boolean)
	 * @see org.omg.space.xtce.XtcePackage#getInterlockType_Suspendable()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='suspendable'"
	 * @generated
	 */
	boolean isSuspendable();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.InterlockType#isSuspendable <em>Suspendable</em>}' attribute.
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
	 * Unsets the value of the '{@link org.omg.space.xtce.InterlockType#isSuspendable <em>Suspendable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuspendable()
	 * @see #isSuspendable()
	 * @see #setSuspendable(boolean)
	 * @generated
	 */
	void unsetSuspendable();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.InterlockType#isSuspendable <em>Suspendable</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Verification Progress Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only applies when the verificationToWaitFor attribute is 'queued' or 'executing'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verification Progress Percentage</em>' attribute.
	 * @see #setVerificationProgressPercentage(BigDecimal)
	 * @see org.omg.space.xtce.XtcePackage#getInterlockType_VerificationProgressPercentage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='verificationProgressPercentage'"
	 * @generated
	 */
	BigDecimal getVerificationProgressPercentage();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.InterlockType#getVerificationProgressPercentage <em>Verification Progress Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Progress Percentage</em>' attribute.
	 * @see #getVerificationProgressPercentage()
	 * @generated
	 */
	void setVerificationProgressPercentage(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Verification To Wait For</b></em>' attribute.
	 * The default value is <code>"complete"</code>.
	 * The literals are from the enumeration {@link org.omg.space.xtce.VerificationToWaitForType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification To Wait For</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification To Wait For</em>' attribute.
	 * @see org.omg.space.xtce.VerificationToWaitForType
	 * @see #isSetVerificationToWaitFor()
	 * @see #unsetVerificationToWaitFor()
	 * @see #setVerificationToWaitFor(VerificationToWaitForType)
	 * @see org.omg.space.xtce.XtcePackage#getInterlockType_VerificationToWaitFor()
	 * @model default="complete" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='verificationToWaitFor'"
	 * @generated
	 */
	VerificationToWaitForType getVerificationToWaitFor();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.InterlockType#getVerificationToWaitFor <em>Verification To Wait For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification To Wait For</em>' attribute.
	 * @see org.omg.space.xtce.VerificationToWaitForType
	 * @see #isSetVerificationToWaitFor()
	 * @see #unsetVerificationToWaitFor()
	 * @see #getVerificationToWaitFor()
	 * @generated
	 */
	void setVerificationToWaitFor(VerificationToWaitForType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.InterlockType#getVerificationToWaitFor <em>Verification To Wait For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerificationToWaitFor()
	 * @see #getVerificationToWaitFor()
	 * @see #setVerificationToWaitFor(VerificationToWaitForType)
	 * @generated
	 */
	void unsetVerificationToWaitFor();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.InterlockType#getVerificationToWaitFor <em>Verification To Wait For</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Verification To Wait For</em>' attribute is set.
	 * @see #unsetVerificationToWaitFor()
	 * @see #getVerificationToWaitFor()
	 * @see #setVerificationToWaitFor(VerificationToWaitForType)
	 * @generated
	 */
	boolean isSetVerificationToWaitFor();

} // InterlockType
