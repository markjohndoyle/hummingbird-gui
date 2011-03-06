/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.space.xtce.TimeAssociationType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.TimeAssociationTypeImpl#isInterpolateTime <em>Interpolate Time</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.TimeAssociationTypeImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeAssociationTypeImpl extends ParameterInstanceRefType1Impl implements TimeAssociationType {
	/**
	 * The default value of the '{@link #isInterpolateTime() <em>Interpolate Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterpolateTime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERPOLATE_TIME_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isInterpolateTime() <em>Interpolate Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterpolateTime()
	 * @generated
	 * @ordered
	 */
	protected boolean interpolateTime = INTERPOLATE_TIME_EDEFAULT;

	/**
	 * This is true if the Interpolate Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interpolateTimeESet;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar offset = OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getTimeAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInterpolateTime() {
		return interpolateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpolateTime(boolean newInterpolateTime) {
		boolean oldInterpolateTime = interpolateTime;
		interpolateTime = newInterpolateTime;
		boolean oldInterpolateTimeESet = interpolateTimeESet;
		interpolateTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.TIME_ASSOCIATION_TYPE__INTERPOLATE_TIME, oldInterpolateTime, interpolateTime, !oldInterpolateTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInterpolateTime() {
		boolean oldInterpolateTime = interpolateTime;
		boolean oldInterpolateTimeESet = interpolateTimeESet;
		interpolateTime = INTERPOLATE_TIME_EDEFAULT;
		interpolateTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.TIME_ASSOCIATION_TYPE__INTERPOLATE_TIME, oldInterpolateTime, INTERPOLATE_TIME_EDEFAULT, oldInterpolateTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInterpolateTime() {
		return interpolateTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(XMLGregorianCalendar newOffset) {
		XMLGregorianCalendar oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.TIME_ASSOCIATION_TYPE__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.TIME_ASSOCIATION_TYPE__INTERPOLATE_TIME:
				return isInterpolateTime();
			case XtcePackage.TIME_ASSOCIATION_TYPE__OFFSET:
				return getOffset();
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
			case XtcePackage.TIME_ASSOCIATION_TYPE__INTERPOLATE_TIME:
				setInterpolateTime((Boolean)newValue);
				return;
			case XtcePackage.TIME_ASSOCIATION_TYPE__OFFSET:
				setOffset((XMLGregorianCalendar)newValue);
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
			case XtcePackage.TIME_ASSOCIATION_TYPE__INTERPOLATE_TIME:
				unsetInterpolateTime();
				return;
			case XtcePackage.TIME_ASSOCIATION_TYPE__OFFSET:
				setOffset(OFFSET_EDEFAULT);
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
			case XtcePackage.TIME_ASSOCIATION_TYPE__INTERPOLATE_TIME:
				return isSetInterpolateTime();
			case XtcePackage.TIME_ASSOCIATION_TYPE__OFFSET:
				return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
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
		result.append(" (interpolateTime: ");
		if (interpolateTimeESet) result.append(interpolateTime); else result.append("<unset>");
		result.append(", offset: ");
		result.append(offset);
		result.append(')');
		return result.toString();
	}

} //TimeAssociationTypeImpl
