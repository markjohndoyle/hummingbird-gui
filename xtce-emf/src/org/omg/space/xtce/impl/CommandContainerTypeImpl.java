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

import org.omg.space.xtce.BaseContainerType;
import org.omg.space.xtce.CommandContainerEntryListType;
import org.omg.space.xtce.CommandContainerType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Container Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.CommandContainerTypeImpl#getEntryList <em>Entry List</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandContainerTypeImpl#getBaseContainer <em>Base Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandContainerTypeImpl extends ContainerTypeImpl implements CommandContainerType {
	/**
	 * The cached value of the '{@link #getEntryList() <em>Entry List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryList()
	 * @generated
	 * @ordered
	 */
	protected CommandContainerEntryListType entryList;

	/**
	 * The cached value of the '{@link #getBaseContainer() <em>Base Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseContainer()
	 * @generated
	 * @ordered
	 */
	protected BaseContainerType baseContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandContainerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getCommandContainerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandContainerEntryListType getEntryList() {
		return entryList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryList(CommandContainerEntryListType newEntryList, NotificationChain msgs) {
		CommandContainerEntryListType oldEntryList = entryList;
		entryList = newEntryList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_CONTAINER_TYPE__ENTRY_LIST, oldEntryList, newEntryList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryList(CommandContainerEntryListType newEntryList) {
		if (newEntryList != entryList) {
			NotificationChain msgs = null;
			if (entryList != null)
				msgs = ((InternalEObject)entryList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_CONTAINER_TYPE__ENTRY_LIST, null, msgs);
			if (newEntryList != null)
				msgs = ((InternalEObject)newEntryList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_CONTAINER_TYPE__ENTRY_LIST, null, msgs);
			msgs = basicSetEntryList(newEntryList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_CONTAINER_TYPE__ENTRY_LIST, newEntryList, newEntryList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseContainerType getBaseContainer() {
		return baseContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseContainer(BaseContainerType newBaseContainer, NotificationChain msgs) {
		BaseContainerType oldBaseContainer = baseContainer;
		baseContainer = newBaseContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_CONTAINER_TYPE__BASE_CONTAINER, oldBaseContainer, newBaseContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseContainer(BaseContainerType newBaseContainer) {
		if (newBaseContainer != baseContainer) {
			NotificationChain msgs = null;
			if (baseContainer != null)
				msgs = ((InternalEObject)baseContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_CONTAINER_TYPE__BASE_CONTAINER, null, msgs);
			if (newBaseContainer != null)
				msgs = ((InternalEObject)newBaseContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_CONTAINER_TYPE__BASE_CONTAINER, null, msgs);
			msgs = basicSetBaseContainer(newBaseContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_CONTAINER_TYPE__BASE_CONTAINER, newBaseContainer, newBaseContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.COMMAND_CONTAINER_TYPE__ENTRY_LIST:
				return basicSetEntryList(null, msgs);
			case XtcePackage.COMMAND_CONTAINER_TYPE__BASE_CONTAINER:
				return basicSetBaseContainer(null, msgs);
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
			case XtcePackage.COMMAND_CONTAINER_TYPE__ENTRY_LIST:
				return getEntryList();
			case XtcePackage.COMMAND_CONTAINER_TYPE__BASE_CONTAINER:
				return getBaseContainer();
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
			case XtcePackage.COMMAND_CONTAINER_TYPE__ENTRY_LIST:
				setEntryList((CommandContainerEntryListType)newValue);
				return;
			case XtcePackage.COMMAND_CONTAINER_TYPE__BASE_CONTAINER:
				setBaseContainer((BaseContainerType)newValue);
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
			case XtcePackage.COMMAND_CONTAINER_TYPE__ENTRY_LIST:
				setEntryList((CommandContainerEntryListType)null);
				return;
			case XtcePackage.COMMAND_CONTAINER_TYPE__BASE_CONTAINER:
				setBaseContainer((BaseContainerType)null);
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
			case XtcePackage.COMMAND_CONTAINER_TYPE__ENTRY_LIST:
				return entryList != null;
			case XtcePackage.COMMAND_CONTAINER_TYPE__BASE_CONTAINER:
				return baseContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //CommandContainerTypeImpl
