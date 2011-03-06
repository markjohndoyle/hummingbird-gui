/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.space.xtce.CommandMetaDataType;
import org.omg.space.xtce.DefaultsType;
import org.omg.space.xtce.HeaderType;
import org.omg.space.xtce.ServiceSetType;
import org.omg.space.xtce.SpaceSystemType;
import org.omg.space.xtce.TelemetryMetaDataType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Space System Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.SpaceSystemTypeImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SpaceSystemTypeImpl#getTelemetryMetaData <em>Telemetry Meta Data</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SpaceSystemTypeImpl#getCommandMetaData <em>Command Meta Data</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SpaceSystemTypeImpl#getServiceSet <em>Service Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SpaceSystemTypeImpl#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SpaceSystemTypeImpl#getSpaceSystem <em>Space System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpaceSystemTypeImpl extends NameDescriptionTypeImpl implements SpaceSystemType {
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected HeaderType header;

	/**
	 * The cached value of the '{@link #getTelemetryMetaData() <em>Telemetry Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelemetryMetaData()
	 * @generated
	 * @ordered
	 */
	protected TelemetryMetaDataType telemetryMetaData;

	/**
	 * The cached value of the '{@link #getCommandMetaData() <em>Command Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandMetaData()
	 * @generated
	 * @ordered
	 */
	protected CommandMetaDataType commandMetaData;

	/**
	 * The cached value of the '{@link #getServiceSet() <em>Service Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSet()
	 * @generated
	 * @ordered
	 */
	protected ServiceSetType serviceSet;

	/**
	 * The cached value of the '{@link #getDefaults() <em>Defaults</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaults()
	 * @generated
	 * @ordered
	 */
	protected DefaultsType defaults;

	/**
	 * The cached value of the '{@link #getSpaceSystem() <em>Space System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<SpaceSystemType> spaceSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpaceSystemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getSpaceSystemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderType getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(HeaderType newHeader, NotificationChain msgs) {
		HeaderType oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SPACE_SYSTEM_TYPE__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(HeaderType newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SPACE_SYSTEM_TYPE__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SPACE_SYSTEM_TYPE__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SPACE_SYSTEM_TYPE__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelemetryMetaDataType getTelemetryMetaData() {
		return telemetryMetaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelemetryMetaData(TelemetryMetaDataType newTelemetryMetaData, NotificationChain msgs) {
		TelemetryMetaDataType oldTelemetryMetaData = telemetryMetaData;
		telemetryMetaData = newTelemetryMetaData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SPACE_SYSTEM_TYPE__TELEMETRY_META_DATA, oldTelemetryMetaData, newTelemetryMetaData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelemetryMetaData(TelemetryMetaDataType newTelemetryMetaData) {
		if (newTelemetryMetaData != telemetryMetaData) {
			NotificationChain msgs = null;
			if (telemetryMetaData != null)
				msgs = ((InternalEObject)telemetryMetaData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SPACE_SYSTEM_TYPE__TELEMETRY_META_DATA, null, msgs);
			if (newTelemetryMetaData != null)
				msgs = ((InternalEObject)newTelemetryMetaData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SPACE_SYSTEM_TYPE__TELEMETRY_META_DATA, null, msgs);
			msgs = basicSetTelemetryMetaData(newTelemetryMetaData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SPACE_SYSTEM_TYPE__TELEMETRY_META_DATA, newTelemetryMetaData, newTelemetryMetaData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandMetaDataType getCommandMetaData() {
		return commandMetaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommandMetaData(CommandMetaDataType newCommandMetaData, NotificationChain msgs) {
		CommandMetaDataType oldCommandMetaData = commandMetaData;
		commandMetaData = newCommandMetaData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SPACE_SYSTEM_TYPE__COMMAND_META_DATA, oldCommandMetaData, newCommandMetaData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandMetaData(CommandMetaDataType newCommandMetaData) {
		if (newCommandMetaData != commandMetaData) {
			NotificationChain msgs = null;
			if (commandMetaData != null)
				msgs = ((InternalEObject)commandMetaData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SPACE_SYSTEM_TYPE__COMMAND_META_DATA, null, msgs);
			if (newCommandMetaData != null)
				msgs = ((InternalEObject)newCommandMetaData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SPACE_SYSTEM_TYPE__COMMAND_META_DATA, null, msgs);
			msgs = basicSetCommandMetaData(newCommandMetaData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SPACE_SYSTEM_TYPE__COMMAND_META_DATA, newCommandMetaData, newCommandMetaData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSetType getServiceSet() {
		return serviceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceSet(ServiceSetType newServiceSet, NotificationChain msgs) {
		ServiceSetType oldServiceSet = serviceSet;
		serviceSet = newServiceSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SPACE_SYSTEM_TYPE__SERVICE_SET, oldServiceSet, newServiceSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceSet(ServiceSetType newServiceSet) {
		if (newServiceSet != serviceSet) {
			NotificationChain msgs = null;
			if (serviceSet != null)
				msgs = ((InternalEObject)serviceSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SPACE_SYSTEM_TYPE__SERVICE_SET, null, msgs);
			if (newServiceSet != null)
				msgs = ((InternalEObject)newServiceSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SPACE_SYSTEM_TYPE__SERVICE_SET, null, msgs);
			msgs = basicSetServiceSet(newServiceSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SPACE_SYSTEM_TYPE__SERVICE_SET, newServiceSet, newServiceSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultsType getDefaults() {
		return defaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaults(DefaultsType newDefaults, NotificationChain msgs) {
		DefaultsType oldDefaults = defaults;
		defaults = newDefaults;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SPACE_SYSTEM_TYPE__DEFAULTS, oldDefaults, newDefaults);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaults(DefaultsType newDefaults) {
		if (newDefaults != defaults) {
			NotificationChain msgs = null;
			if (defaults != null)
				msgs = ((InternalEObject)defaults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SPACE_SYSTEM_TYPE__DEFAULTS, null, msgs);
			if (newDefaults != null)
				msgs = ((InternalEObject)newDefaults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SPACE_SYSTEM_TYPE__DEFAULTS, null, msgs);
			msgs = basicSetDefaults(newDefaults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SPACE_SYSTEM_TYPE__DEFAULTS, newDefaults, newDefaults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpaceSystemType> getSpaceSystem() {
		if (spaceSystem == null) {
			spaceSystem = new EObjectContainmentEList<SpaceSystemType>(SpaceSystemType.class, this, XtcePackage.SPACE_SYSTEM_TYPE__SPACE_SYSTEM);
		}
		return spaceSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.SPACE_SYSTEM_TYPE__HEADER:
				return basicSetHeader(null, msgs);
			case XtcePackage.SPACE_SYSTEM_TYPE__TELEMETRY_META_DATA:
				return basicSetTelemetryMetaData(null, msgs);
			case XtcePackage.SPACE_SYSTEM_TYPE__COMMAND_META_DATA:
				return basicSetCommandMetaData(null, msgs);
			case XtcePackage.SPACE_SYSTEM_TYPE__SERVICE_SET:
				return basicSetServiceSet(null, msgs);
			case XtcePackage.SPACE_SYSTEM_TYPE__DEFAULTS:
				return basicSetDefaults(null, msgs);
			case XtcePackage.SPACE_SYSTEM_TYPE__SPACE_SYSTEM:
				return ((InternalEList<?>)getSpaceSystem()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.SPACE_SYSTEM_TYPE__HEADER:
				return getHeader();
			case XtcePackage.SPACE_SYSTEM_TYPE__TELEMETRY_META_DATA:
				return getTelemetryMetaData();
			case XtcePackage.SPACE_SYSTEM_TYPE__COMMAND_META_DATA:
				return getCommandMetaData();
			case XtcePackage.SPACE_SYSTEM_TYPE__SERVICE_SET:
				return getServiceSet();
			case XtcePackage.SPACE_SYSTEM_TYPE__DEFAULTS:
				return getDefaults();
			case XtcePackage.SPACE_SYSTEM_TYPE__SPACE_SYSTEM:
				return getSpaceSystem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XtcePackage.SPACE_SYSTEM_TYPE__HEADER:
				setHeader((HeaderType)newValue);
				return;
			case XtcePackage.SPACE_SYSTEM_TYPE__TELEMETRY_META_DATA:
				setTelemetryMetaData((TelemetryMetaDataType)newValue);
				return;
			case XtcePackage.SPACE_SYSTEM_TYPE__COMMAND_META_DATA:
				setCommandMetaData((CommandMetaDataType)newValue);
				return;
			case XtcePackage.SPACE_SYSTEM_TYPE__SERVICE_SET:
				setServiceSet((ServiceSetType)newValue);
				return;
			case XtcePackage.SPACE_SYSTEM_TYPE__DEFAULTS:
				setDefaults((DefaultsType)newValue);
				return;
			case XtcePackage.SPACE_SYSTEM_TYPE__SPACE_SYSTEM:
				getSpaceSystem().clear();
				getSpaceSystem().addAll((Collection<? extends SpaceSystemType>)newValue);
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
			case XtcePackage.SPACE_SYSTEM_TYPE__HEADER:
				setHeader((HeaderType)null);
				return;
			case XtcePackage.SPACE_SYSTEM_TYPE__TELEMETRY_META_DATA:
				setTelemetryMetaData((TelemetryMetaDataType)null);
				return;
			case XtcePackage.SPACE_SYSTEM_TYPE__COMMAND_META_DATA:
				setCommandMetaData((CommandMetaDataType)null);
				return;
			case XtcePackage.SPACE_SYSTEM_TYPE__SERVICE_SET:
				setServiceSet((ServiceSetType)null);
				return;
			case XtcePackage.SPACE_SYSTEM_TYPE__DEFAULTS:
				setDefaults((DefaultsType)null);
				return;
			case XtcePackage.SPACE_SYSTEM_TYPE__SPACE_SYSTEM:
				getSpaceSystem().clear();
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
			case XtcePackage.SPACE_SYSTEM_TYPE__HEADER:
				return header != null;
			case XtcePackage.SPACE_SYSTEM_TYPE__TELEMETRY_META_DATA:
				return telemetryMetaData != null;
			case XtcePackage.SPACE_SYSTEM_TYPE__COMMAND_META_DATA:
				return commandMetaData != null;
			case XtcePackage.SPACE_SYSTEM_TYPE__SERVICE_SET:
				return serviceSet != null;
			case XtcePackage.SPACE_SYSTEM_TYPE__DEFAULTS:
				return defaults != null;
			case XtcePackage.SPACE_SYSTEM_TYPE__SPACE_SYSTEM:
				return spaceSystem != null && !spaceSystem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpaceSystemTypeImpl
