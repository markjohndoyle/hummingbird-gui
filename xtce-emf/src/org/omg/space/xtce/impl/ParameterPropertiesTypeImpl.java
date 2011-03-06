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

import org.omg.space.xtce.DataSourceType;
import org.omg.space.xtce.MatchCriteriaType;
import org.omg.space.xtce.ParameterPropertiesType;
import org.omg.space.xtce.PhysicalAddressSetType;
import org.omg.space.xtce.TimeAssociationType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ParameterPropertiesTypeImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterPropertiesTypeImpl#getValidityCondition <em>Validity Condition</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterPropertiesTypeImpl#getPhysicalAddressSet <em>Physical Address Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterPropertiesTypeImpl#getTimeAssociation <em>Time Association</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterPropertiesTypeImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterPropertiesTypeImpl#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterPropertiesTypeImpl extends EObjectImpl implements ParameterPropertiesType {
	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidityCondition() <em>Validity Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityCondition()
	 * @generated
	 * @ordered
	 */
	protected MatchCriteriaType validityCondition;

	/**
	 * The cached value of the '{@link #getPhysicalAddressSet() <em>Physical Address Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalAddressSet()
	 * @generated
	 * @ordered
	 */
	protected PhysicalAddressSetType physicalAddressSet;

	/**
	 * The cached value of the '{@link #getTimeAssociation() <em>Time Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAssociation()
	 * @generated
	 * @ordered
	 */
	protected TimeAssociationType timeAssociation;

	/**
	 * The default value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected static final DataSourceType DATA_SOURCE_EDEFAULT = DataSourceType.TELEMETERED;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected DataSourceType dataSource = DATA_SOURCE_EDEFAULT;

	/**
	 * This is true if the Data Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSourceESet;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * This is true if the Read Only attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean readOnlyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getParameterPropertiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_PROPERTIES_TYPE__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchCriteriaType getValidityCondition() {
		return validityCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidityCondition(MatchCriteriaType newValidityCondition, NotificationChain msgs) {
		MatchCriteriaType oldValidityCondition = validityCondition;
		validityCondition = newValidityCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_PROPERTIES_TYPE__VALIDITY_CONDITION, oldValidityCondition, newValidityCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidityCondition(MatchCriteriaType newValidityCondition) {
		if (newValidityCondition != validityCondition) {
			NotificationChain msgs = null;
			if (validityCondition != null)
				msgs = ((InternalEObject)validityCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PARAMETER_PROPERTIES_TYPE__VALIDITY_CONDITION, null, msgs);
			if (newValidityCondition != null)
				msgs = ((InternalEObject)newValidityCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PARAMETER_PROPERTIES_TYPE__VALIDITY_CONDITION, null, msgs);
			msgs = basicSetValidityCondition(newValidityCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_PROPERTIES_TYPE__VALIDITY_CONDITION, newValidityCondition, newValidityCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalAddressSetType getPhysicalAddressSet() {
		return physicalAddressSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalAddressSet(PhysicalAddressSetType newPhysicalAddressSet, NotificationChain msgs) {
		PhysicalAddressSetType oldPhysicalAddressSet = physicalAddressSet;
		physicalAddressSet = newPhysicalAddressSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_PROPERTIES_TYPE__PHYSICAL_ADDRESS_SET, oldPhysicalAddressSet, newPhysicalAddressSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalAddressSet(PhysicalAddressSetType newPhysicalAddressSet) {
		if (newPhysicalAddressSet != physicalAddressSet) {
			NotificationChain msgs = null;
			if (physicalAddressSet != null)
				msgs = ((InternalEObject)physicalAddressSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PARAMETER_PROPERTIES_TYPE__PHYSICAL_ADDRESS_SET, null, msgs);
			if (newPhysicalAddressSet != null)
				msgs = ((InternalEObject)newPhysicalAddressSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PARAMETER_PROPERTIES_TYPE__PHYSICAL_ADDRESS_SET, null, msgs);
			msgs = basicSetPhysicalAddressSet(newPhysicalAddressSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_PROPERTIES_TYPE__PHYSICAL_ADDRESS_SET, newPhysicalAddressSet, newPhysicalAddressSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAssociationType getTimeAssociation() {
		return timeAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeAssociation(TimeAssociationType newTimeAssociation, NotificationChain msgs) {
		TimeAssociationType oldTimeAssociation = timeAssociation;
		timeAssociation = newTimeAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_PROPERTIES_TYPE__TIME_ASSOCIATION, oldTimeAssociation, newTimeAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeAssociation(TimeAssociationType newTimeAssociation) {
		if (newTimeAssociation != timeAssociation) {
			NotificationChain msgs = null;
			if (timeAssociation != null)
				msgs = ((InternalEObject)timeAssociation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PARAMETER_PROPERTIES_TYPE__TIME_ASSOCIATION, null, msgs);
			if (newTimeAssociation != null)
				msgs = ((InternalEObject)newTimeAssociation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PARAMETER_PROPERTIES_TYPE__TIME_ASSOCIATION, null, msgs);
			msgs = basicSetTimeAssociation(newTimeAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_PROPERTIES_TYPE__TIME_ASSOCIATION, newTimeAssociation, newTimeAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceType getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSource(DataSourceType newDataSource) {
		DataSourceType oldDataSource = dataSource;
		dataSource = newDataSource == null ? DATA_SOURCE_EDEFAULT : newDataSource;
		boolean oldDataSourceESet = dataSourceESet;
		dataSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_PROPERTIES_TYPE__DATA_SOURCE, oldDataSource, dataSource, !oldDataSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSource() {
		DataSourceType oldDataSource = dataSource;
		boolean oldDataSourceESet = dataSourceESet;
		dataSource = DATA_SOURCE_EDEFAULT;
		dataSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.PARAMETER_PROPERTIES_TYPE__DATA_SOURCE, oldDataSource, DATA_SOURCE_EDEFAULT, oldDataSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSource() {
		return dataSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		boolean oldReadOnlyESet = readOnlyESet;
		readOnlyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_PROPERTIES_TYPE__READ_ONLY, oldReadOnly, readOnly, !oldReadOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReadOnly() {
		boolean oldReadOnly = readOnly;
		boolean oldReadOnlyESet = readOnlyESet;
		readOnly = READ_ONLY_EDEFAULT;
		readOnlyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.PARAMETER_PROPERTIES_TYPE__READ_ONLY, oldReadOnly, READ_ONLY_EDEFAULT, oldReadOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReadOnly() {
		return readOnlyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__VALIDITY_CONDITION:
				return basicSetValidityCondition(null, msgs);
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__PHYSICAL_ADDRESS_SET:
				return basicSetPhysicalAddressSet(null, msgs);
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__TIME_ASSOCIATION:
				return basicSetTimeAssociation(null, msgs);
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
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__SYSTEM_NAME:
				return getSystemName();
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__VALIDITY_CONDITION:
				return getValidityCondition();
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__PHYSICAL_ADDRESS_SET:
				return getPhysicalAddressSet();
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__TIME_ASSOCIATION:
				return getTimeAssociation();
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__DATA_SOURCE:
				return getDataSource();
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__READ_ONLY:
				return isReadOnly();
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
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__VALIDITY_CONDITION:
				setValidityCondition((MatchCriteriaType)newValue);
				return;
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__PHYSICAL_ADDRESS_SET:
				setPhysicalAddressSet((PhysicalAddressSetType)newValue);
				return;
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__TIME_ASSOCIATION:
				setTimeAssociation((TimeAssociationType)newValue);
				return;
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__DATA_SOURCE:
				setDataSource((DataSourceType)newValue);
				return;
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__READ_ONLY:
				setReadOnly((Boolean)newValue);
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
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__VALIDITY_CONDITION:
				setValidityCondition((MatchCriteriaType)null);
				return;
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__PHYSICAL_ADDRESS_SET:
				setPhysicalAddressSet((PhysicalAddressSetType)null);
				return;
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__TIME_ASSOCIATION:
				setTimeAssociation((TimeAssociationType)null);
				return;
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__DATA_SOURCE:
				unsetDataSource();
				return;
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__READ_ONLY:
				unsetReadOnly();
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
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__VALIDITY_CONDITION:
				return validityCondition != null;
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__PHYSICAL_ADDRESS_SET:
				return physicalAddressSet != null;
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__TIME_ASSOCIATION:
				return timeAssociation != null;
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__DATA_SOURCE:
				return isSetDataSource();
			case XtcePackage.PARAMETER_PROPERTIES_TYPE__READ_ONLY:
				return isSetReadOnly();
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
		result.append(" (systemName: ");
		result.append(systemName);
		result.append(", dataSource: ");
		if (dataSourceESet) result.append(dataSource); else result.append("<unset>");
		result.append(", readOnly: ");
		if (readOnlyESet) result.append(readOnly); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ParameterPropertiesTypeImpl
