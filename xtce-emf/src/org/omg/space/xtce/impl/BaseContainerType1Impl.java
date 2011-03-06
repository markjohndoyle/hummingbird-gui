/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.BaseContainerType1;
import org.omg.space.xtce.RestrictionCriteriaType1;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Container Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.BaseContainerType1Impl#getRestrictionCriteria <em>Restriction Criteria</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.BaseContainerType1Impl#getContainerRef <em>Container Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseContainerType1Impl extends EObjectImpl implements BaseContainerType1 {
	/**
	 * The cached value of the '{@link #getRestrictionCriteria() <em>Restriction Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionCriteria()
	 * @generated
	 * @ordered
	 */
	protected RestrictionCriteriaType1 restrictionCriteria;

	/**
	 * The default value of the '{@link #getContainerRef() <em>Container Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerRef() <em>Container Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerRef()
	 * @generated
	 * @ordered
	 */
	protected String containerRef = CONTAINER_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseContainerType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getBaseContainerType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionCriteriaType1 getRestrictionCriteria() {
		return restrictionCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestrictionCriteria(RestrictionCriteriaType1 newRestrictionCriteria, NotificationChain msgs) {
		RestrictionCriteriaType1 oldRestrictionCriteria = restrictionCriteria;
		restrictionCriteria = newRestrictionCriteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_CONTAINER_TYPE1__RESTRICTION_CRITERIA, oldRestrictionCriteria, newRestrictionCriteria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictionCriteria(RestrictionCriteriaType1 newRestrictionCriteria) {
		if (newRestrictionCriteria != restrictionCriteria) {
			NotificationChain msgs = null;
			if (restrictionCriteria != null)
				msgs = ((InternalEObject)restrictionCriteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_CONTAINER_TYPE1__RESTRICTION_CRITERIA, null, msgs);
			if (newRestrictionCriteria != null)
				msgs = ((InternalEObject)newRestrictionCriteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_CONTAINER_TYPE1__RESTRICTION_CRITERIA, null, msgs);
			msgs = basicSetRestrictionCriteria(newRestrictionCriteria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_CONTAINER_TYPE1__RESTRICTION_CRITERIA, newRestrictionCriteria, newRestrictionCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainerRef() {
		return containerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerRef(String newContainerRef) {
		String oldContainerRef = containerRef;
		containerRef = newContainerRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_CONTAINER_TYPE1__CONTAINER_REF, oldContainerRef, containerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.BASE_CONTAINER_TYPE1__RESTRICTION_CRITERIA:
				return basicSetRestrictionCriteria(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.BASE_CONTAINER_TYPE1__RESTRICTION_CRITERIA:
				return getRestrictionCriteria();
			case XtcePackage.BASE_CONTAINER_TYPE1__CONTAINER_REF:
				return getContainerRef();
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
			case XtcePackage.BASE_CONTAINER_TYPE1__RESTRICTION_CRITERIA:
				setRestrictionCriteria((RestrictionCriteriaType1)newValue);
				return;
			case XtcePackage.BASE_CONTAINER_TYPE1__CONTAINER_REF:
				setContainerRef((String)newValue);
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
			case XtcePackage.BASE_CONTAINER_TYPE1__RESTRICTION_CRITERIA:
				setRestrictionCriteria((RestrictionCriteriaType1)null);
				return;
			case XtcePackage.BASE_CONTAINER_TYPE1__CONTAINER_REF:
				setContainerRef(CONTAINER_REF_EDEFAULT);
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
			case XtcePackage.BASE_CONTAINER_TYPE1__RESTRICTION_CRITERIA:
				return restrictionCriteria != null;
			case XtcePackage.BASE_CONTAINER_TYPE1__CONTAINER_REF:
				return CONTAINER_REF_EDEFAULT == null ? containerRef != null : !CONTAINER_REF_EDEFAULT.equals(containerRef);
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
		result.append(" (containerRef: ");
		result.append(containerRef);
		result.append(')');
		return result.toString();
	}

} //BaseContainerType1Impl
