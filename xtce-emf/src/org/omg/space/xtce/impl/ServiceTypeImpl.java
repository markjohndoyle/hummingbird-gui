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

import org.omg.space.xtce.ContainerRefSetType;
import org.omg.space.xtce.MessageRefSetType;
import org.omg.space.xtce.ServiceType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ServiceTypeImpl#getMessageRefSet <em>Message Ref Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ServiceTypeImpl#getContainerRefSet <em>Container Ref Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceTypeImpl extends NameDescriptionTypeImpl implements ServiceType {
	/**
	 * The cached value of the '{@link #getMessageRefSet() <em>Message Ref Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRefSet()
	 * @generated
	 * @ordered
	 */
	protected MessageRefSetType messageRefSet;

	/**
	 * The cached value of the '{@link #getContainerRefSet() <em>Container Ref Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerRefSet()
	 * @generated
	 * @ordered
	 */
	protected ContainerRefSetType containerRefSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getServiceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageRefSetType getMessageRefSet() {
		return messageRefSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageRefSet(MessageRefSetType newMessageRefSet, NotificationChain msgs) {
		MessageRefSetType oldMessageRefSet = messageRefSet;
		messageRefSet = newMessageRefSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SERVICE_TYPE__MESSAGE_REF_SET, oldMessageRefSet, newMessageRefSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageRefSet(MessageRefSetType newMessageRefSet) {
		if (newMessageRefSet != messageRefSet) {
			NotificationChain msgs = null;
			if (messageRefSet != null)
				msgs = ((InternalEObject)messageRefSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SERVICE_TYPE__MESSAGE_REF_SET, null, msgs);
			if (newMessageRefSet != null)
				msgs = ((InternalEObject)newMessageRefSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SERVICE_TYPE__MESSAGE_REF_SET, null, msgs);
			msgs = basicSetMessageRefSet(newMessageRefSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SERVICE_TYPE__MESSAGE_REF_SET, newMessageRefSet, newMessageRefSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerRefSetType getContainerRefSet() {
		return containerRefSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerRefSet(ContainerRefSetType newContainerRefSet, NotificationChain msgs) {
		ContainerRefSetType oldContainerRefSet = containerRefSet;
		containerRefSet = newContainerRefSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SERVICE_TYPE__CONTAINER_REF_SET, oldContainerRefSet, newContainerRefSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerRefSet(ContainerRefSetType newContainerRefSet) {
		if (newContainerRefSet != containerRefSet) {
			NotificationChain msgs = null;
			if (containerRefSet != null)
				msgs = ((InternalEObject)containerRefSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SERVICE_TYPE__CONTAINER_REF_SET, null, msgs);
			if (newContainerRefSet != null)
				msgs = ((InternalEObject)newContainerRefSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SERVICE_TYPE__CONTAINER_REF_SET, null, msgs);
			msgs = basicSetContainerRefSet(newContainerRefSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SERVICE_TYPE__CONTAINER_REF_SET, newContainerRefSet, newContainerRefSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.SERVICE_TYPE__MESSAGE_REF_SET:
				return basicSetMessageRefSet(null, msgs);
			case XtcePackage.SERVICE_TYPE__CONTAINER_REF_SET:
				return basicSetContainerRefSet(null, msgs);
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
			case XtcePackage.SERVICE_TYPE__MESSAGE_REF_SET:
				return getMessageRefSet();
			case XtcePackage.SERVICE_TYPE__CONTAINER_REF_SET:
				return getContainerRefSet();
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
			case XtcePackage.SERVICE_TYPE__MESSAGE_REF_SET:
				setMessageRefSet((MessageRefSetType)newValue);
				return;
			case XtcePackage.SERVICE_TYPE__CONTAINER_REF_SET:
				setContainerRefSet((ContainerRefSetType)newValue);
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
			case XtcePackage.SERVICE_TYPE__MESSAGE_REF_SET:
				setMessageRefSet((MessageRefSetType)null);
				return;
			case XtcePackage.SERVICE_TYPE__CONTAINER_REF_SET:
				setContainerRefSet((ContainerRefSetType)null);
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
			case XtcePackage.SERVICE_TYPE__MESSAGE_REF_SET:
				return messageRefSet != null;
			case XtcePackage.SERVICE_TYPE__CONTAINER_REF_SET:
				return containerRefSet != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceTypeImpl
