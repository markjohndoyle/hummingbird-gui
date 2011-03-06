/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.space.xtce.TransmissionConstraintType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmission Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.TransmissionConstraintTypeImpl#isSuspendable <em>Suspendable</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.TransmissionConstraintTypeImpl#getTimeOut <em>Time Out</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransmissionConstraintTypeImpl extends MatchCriteriaTypeImpl implements TransmissionConstraintType {
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
	 * The default value of the '{@link #getTimeOut() <em>Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOut()
	 * @generated
	 * @ordered
	 */
	protected static final Duration TIME_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOut() <em>Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOut()
	 * @generated
	 * @ordered
	 */
	protected Duration timeOut = TIME_OUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getTransmissionConstraintType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.TRANSMISSION_CONSTRAINT_TYPE__SUSPENDABLE, oldSuspendable, suspendable, !oldSuspendableESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.TRANSMISSION_CONSTRAINT_TYPE__SUSPENDABLE, oldSuspendable, SUSPENDABLE_EDEFAULT, oldSuspendableESet));
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
	public Duration getTimeOut() {
		return timeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeOut(Duration newTimeOut) {
		Duration oldTimeOut = timeOut;
		timeOut = newTimeOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.TRANSMISSION_CONSTRAINT_TYPE__TIME_OUT, oldTimeOut, timeOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.TRANSMISSION_CONSTRAINT_TYPE__SUSPENDABLE:
				return isSuspendable();
			case XtcePackage.TRANSMISSION_CONSTRAINT_TYPE__TIME_OUT:
				return getTimeOut();
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
			case XtcePackage.TRANSMISSION_CONSTRAINT_TYPE__SUSPENDABLE:
				setSuspendable((Boolean)newValue);
				return;
			case XtcePackage.TRANSMISSION_CONSTRAINT_TYPE__TIME_OUT:
				setTimeOut((Duration)newValue);
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
			case XtcePackage.TRANSMISSION_CONSTRAINT_TYPE__SUSPENDABLE:
				unsetSuspendable();
				return;
			case XtcePackage.TRANSMISSION_CONSTRAINT_TYPE__TIME_OUT:
				setTimeOut(TIME_OUT_EDEFAULT);
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
			case XtcePackage.TRANSMISSION_CONSTRAINT_TYPE__SUSPENDABLE:
				return isSetSuspendable();
			case XtcePackage.TRANSMISSION_CONSTRAINT_TYPE__TIME_OUT:
				return TIME_OUT_EDEFAULT == null ? timeOut != null : !TIME_OUT_EDEFAULT.equals(timeOut);
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
		result.append(" (suspendable: ");
		if (suspendableESet) result.append(suspendable); else result.append("<unset>");
		result.append(", timeOut: ");
		result.append(timeOut);
		result.append(')');
		return result.toString();
	}

} //TransmissionConstraintTypeImpl
