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

import org.omg.space.xtce.ContainerRefType;
import org.omg.space.xtce.RestrictionCriteriaType1;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restriction Criteria Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.RestrictionCriteriaType1Impl#getNextContainer <em>Next Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestrictionCriteriaType1Impl extends MatchCriteriaTypeImpl implements RestrictionCriteriaType1 {
	/**
	 * The cached value of the '{@link #getNextContainer() <em>Next Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextContainer()
	 * @generated
	 * @ordered
	 */
	protected ContainerRefType nextContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictionCriteriaType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getRestrictionCriteriaType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerRefType getNextContainer() {
		return nextContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextContainer(ContainerRefType newNextContainer, NotificationChain msgs) {
		ContainerRefType oldNextContainer = nextContainer;
		nextContainer = newNextContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.RESTRICTION_CRITERIA_TYPE1__NEXT_CONTAINER, oldNextContainer, newNextContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextContainer(ContainerRefType newNextContainer) {
		if (newNextContainer != nextContainer) {
			NotificationChain msgs = null;
			if (nextContainer != null)
				msgs = ((InternalEObject)nextContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.RESTRICTION_CRITERIA_TYPE1__NEXT_CONTAINER, null, msgs);
			if (newNextContainer != null)
				msgs = ((InternalEObject)newNextContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.RESTRICTION_CRITERIA_TYPE1__NEXT_CONTAINER, null, msgs);
			msgs = basicSetNextContainer(newNextContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.RESTRICTION_CRITERIA_TYPE1__NEXT_CONTAINER, newNextContainer, newNextContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.RESTRICTION_CRITERIA_TYPE1__NEXT_CONTAINER:
				return basicSetNextContainer(null, msgs);
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
			case XtcePackage.RESTRICTION_CRITERIA_TYPE1__NEXT_CONTAINER:
				return getNextContainer();
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
			case XtcePackage.RESTRICTION_CRITERIA_TYPE1__NEXT_CONTAINER:
				setNextContainer((ContainerRefType)newValue);
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
			case XtcePackage.RESTRICTION_CRITERIA_TYPE1__NEXT_CONTAINER:
				setNextContainer((ContainerRefType)null);
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
			case XtcePackage.RESTRICTION_CRITERIA_TYPE1__NEXT_CONTAINER:
				return nextContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //RestrictionCriteriaType1Impl
