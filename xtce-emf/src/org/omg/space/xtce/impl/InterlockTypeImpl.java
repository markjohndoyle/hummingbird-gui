/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.InterlockType;
import org.omg.space.xtce.VerificationToWaitForType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interlock Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.InterlockTypeImpl#getScopeToSpaceSystem <em>Scope To Space System</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.InterlockTypeImpl#isSuspendable <em>Suspendable</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.InterlockTypeImpl#getVerificationProgressPercentage <em>Verification Progress Percentage</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.InterlockTypeImpl#getVerificationToWaitFor <em>Verification To Wait For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterlockTypeImpl extends EObjectImpl implements InterlockType {
	/**
	 * The default value of the '{@link #getScopeToSpaceSystem() <em>Scope To Space System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeToSpaceSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_TO_SPACE_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScopeToSpaceSystem() <em>Scope To Space System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeToSpaceSystem()
	 * @generated
	 * @ordered
	 */
	protected String scopeToSpaceSystem = SCOPE_TO_SPACE_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #isSuspendable() <em>Suspendable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuspendable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUSPENDABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSuspendable() <em>Suspendable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuspendable()
	 * @generated
	 * @ordered
	 */
	protected boolean suspendable = SUSPENDABLE_EDEFAULT;

	/**
	 * This is true if the Suspendable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean suspendableESet;

	/**
	 * The default value of the '{@link #getVerificationProgressPercentage() <em>Verification Progress Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationProgressPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VERIFICATION_PROGRESS_PERCENTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerificationProgressPercentage() <em>Verification Progress Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationProgressPercentage()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal verificationProgressPercentage = VERIFICATION_PROGRESS_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerificationToWaitFor() <em>Verification To Wait For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationToWaitFor()
	 * @generated
	 * @ordered
	 */
	protected static final VerificationToWaitForType VERIFICATION_TO_WAIT_FOR_EDEFAULT = VerificationToWaitForType.COMPLETE;

	/**
	 * The cached value of the '{@link #getVerificationToWaitFor() <em>Verification To Wait For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationToWaitFor()
	 * @generated
	 * @ordered
	 */
	protected VerificationToWaitForType verificationToWaitFor = VERIFICATION_TO_WAIT_FOR_EDEFAULT;

	/**
	 * This is true if the Verification To Wait For attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verificationToWaitForESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterlockTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getInterlockType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScopeToSpaceSystem() {
		return scopeToSpaceSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopeToSpaceSystem(String newScopeToSpaceSystem) {
		String oldScopeToSpaceSystem = scopeToSpaceSystem;
		scopeToSpaceSystem = newScopeToSpaceSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INTERLOCK_TYPE__SCOPE_TO_SPACE_SYSTEM, oldScopeToSpaceSystem, scopeToSpaceSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuspendable() {
		return suspendable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuspendable(boolean newSuspendable) {
		boolean oldSuspendable = suspendable;
		suspendable = newSuspendable;
		boolean oldSuspendableESet = suspendableESet;
		suspendableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INTERLOCK_TYPE__SUSPENDABLE, oldSuspendable, suspendable, !oldSuspendableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSuspendable() {
		boolean oldSuspendable = suspendable;
		boolean oldSuspendableESet = suspendableESet;
		suspendable = SUSPENDABLE_EDEFAULT;
		suspendableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.INTERLOCK_TYPE__SUSPENDABLE, oldSuspendable, SUSPENDABLE_EDEFAULT, oldSuspendableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuspendable() {
		return suspendableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getVerificationProgressPercentage() {
		return verificationProgressPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerificationProgressPercentage(BigDecimal newVerificationProgressPercentage) {
		BigDecimal oldVerificationProgressPercentage = verificationProgressPercentage;
		verificationProgressPercentage = newVerificationProgressPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INTERLOCK_TYPE__VERIFICATION_PROGRESS_PERCENTAGE, oldVerificationProgressPercentage, verificationProgressPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationToWaitForType getVerificationToWaitFor() {
		return verificationToWaitFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerificationToWaitFor(VerificationToWaitForType newVerificationToWaitFor) {
		VerificationToWaitForType oldVerificationToWaitFor = verificationToWaitFor;
		verificationToWaitFor = newVerificationToWaitFor == null ? VERIFICATION_TO_WAIT_FOR_EDEFAULT : newVerificationToWaitFor;
		boolean oldVerificationToWaitForESet = verificationToWaitForESet;
		verificationToWaitForESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INTERLOCK_TYPE__VERIFICATION_TO_WAIT_FOR, oldVerificationToWaitFor, verificationToWaitFor, !oldVerificationToWaitForESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVerificationToWaitFor() {
		VerificationToWaitForType oldVerificationToWaitFor = verificationToWaitFor;
		boolean oldVerificationToWaitForESet = verificationToWaitForESet;
		verificationToWaitFor = VERIFICATION_TO_WAIT_FOR_EDEFAULT;
		verificationToWaitForESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.INTERLOCK_TYPE__VERIFICATION_TO_WAIT_FOR, oldVerificationToWaitFor, VERIFICATION_TO_WAIT_FOR_EDEFAULT, oldVerificationToWaitForESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVerificationToWaitFor() {
		return verificationToWaitForESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.INTERLOCK_TYPE__SCOPE_TO_SPACE_SYSTEM:
				return getScopeToSpaceSystem();
			case XtcePackage.INTERLOCK_TYPE__SUSPENDABLE:
				return isSuspendable();
			case XtcePackage.INTERLOCK_TYPE__VERIFICATION_PROGRESS_PERCENTAGE:
				return getVerificationProgressPercentage();
			case XtcePackage.INTERLOCK_TYPE__VERIFICATION_TO_WAIT_FOR:
				return getVerificationToWaitFor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XtcePackage.INTERLOCK_TYPE__SCOPE_TO_SPACE_SYSTEM:
				setScopeToSpaceSystem((String)newValue);
				return;
			case XtcePackage.INTERLOCK_TYPE__SUSPENDABLE:
				setSuspendable((Boolean)newValue);
				return;
			case XtcePackage.INTERLOCK_TYPE__VERIFICATION_PROGRESS_PERCENTAGE:
				setVerificationProgressPercentage((BigDecimal)newValue);
				return;
			case XtcePackage.INTERLOCK_TYPE__VERIFICATION_TO_WAIT_FOR:
				setVerificationToWaitFor((VerificationToWaitForType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XtcePackage.INTERLOCK_TYPE__SCOPE_TO_SPACE_SYSTEM:
				setScopeToSpaceSystem(SCOPE_TO_SPACE_SYSTEM_EDEFAULT);
				return;
			case XtcePackage.INTERLOCK_TYPE__SUSPENDABLE:
				unsetSuspendable();
				return;
			case XtcePackage.INTERLOCK_TYPE__VERIFICATION_PROGRESS_PERCENTAGE:
				setVerificationProgressPercentage(VERIFICATION_PROGRESS_PERCENTAGE_EDEFAULT);
				return;
			case XtcePackage.INTERLOCK_TYPE__VERIFICATION_TO_WAIT_FOR:
				unsetVerificationToWaitFor();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XtcePackage.INTERLOCK_TYPE__SCOPE_TO_SPACE_SYSTEM:
				return SCOPE_TO_SPACE_SYSTEM_EDEFAULT == null ? scopeToSpaceSystem != null : !SCOPE_TO_SPACE_SYSTEM_EDEFAULT.equals(scopeToSpaceSystem);
			case XtcePackage.INTERLOCK_TYPE__SUSPENDABLE:
				return isSetSuspendable();
			case XtcePackage.INTERLOCK_TYPE__VERIFICATION_PROGRESS_PERCENTAGE:
				return VERIFICATION_PROGRESS_PERCENTAGE_EDEFAULT == null ? verificationProgressPercentage != null : !VERIFICATION_PROGRESS_PERCENTAGE_EDEFAULT.equals(verificationProgressPercentage);
			case XtcePackage.INTERLOCK_TYPE__VERIFICATION_TO_WAIT_FOR:
				return isSetVerificationToWaitFor();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (scopeToSpaceSystem: ");
		result.append(scopeToSpaceSystem);
		result.append(", suspendable: ");
		if (suspendableESet) result.append(suspendable); else result.append("<unset>");
		result.append(", verificationProgressPercentage: ");
		result.append(verificationProgressPercentage);
		result.append(", verificationToWaitFor: ");
		if (verificationToWaitForESet) result.append(verificationToWaitFor); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InterlockTypeImpl
