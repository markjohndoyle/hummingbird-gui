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

import org.omg.space.xtce.AliasSetType;
import org.omg.space.xtce.NameDescriptionType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.NameDescriptionTypeImpl#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NameDescriptionTypeImpl#getAliasSet <em>Alias Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NameDescriptionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NameDescriptionTypeImpl#getShortDescription <em>Short Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameDescriptionTypeImpl extends EObjectImpl implements NameDescriptionType {
	/**
	 * The default value of the '{@link #getLongDescription() <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongDescription() <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongDescription()
	 * @generated
	 * @ordered
	 */
	protected String longDescription = LONG_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAliasSet() <em>Alias Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasSet()
	 * @generated
	 * @ordered
	 */
	protected AliasSetType aliasSet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription()
	 * @generated
	 * @ordered
	 */
	protected String shortDescription = SHORT_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getNameDescriptionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongDescription() {
		return longDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongDescription(String newLongDescription) {
		String oldLongDescription = longDescription;
		longDescription = newLongDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION, oldLongDescription, longDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasSetType getAliasSet() {
		return aliasSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAliasSet(AliasSetType newAliasSet, NotificationChain msgs) {
		AliasSetType oldAliasSet = aliasSet;
		aliasSet = newAliasSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.NAME_DESCRIPTION_TYPE__ALIAS_SET, oldAliasSet, newAliasSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasSet(AliasSetType newAliasSet) {
		if (newAliasSet != aliasSet) {
			NotificationChain msgs = null;
			if (aliasSet != null)
				msgs = ((InternalEObject)aliasSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NAME_DESCRIPTION_TYPE__ALIAS_SET, null, msgs);
			if (newAliasSet != null)
				msgs = ((InternalEObject)newAliasSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NAME_DESCRIPTION_TYPE__ALIAS_SET, null, msgs);
			msgs = basicSetAliasSet(newAliasSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NAME_DESCRIPTION_TYPE__ALIAS_SET, newAliasSet, newAliasSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NAME_DESCRIPTION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortDescription(String newShortDescription) {
		String oldShortDescription = shortDescription;
		shortDescription = newShortDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION, oldShortDescription, shortDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.NAME_DESCRIPTION_TYPE__ALIAS_SET:
				return basicSetAliasSet(null, msgs);
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
			case XtcePackage.NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION:
				return getLongDescription();
			case XtcePackage.NAME_DESCRIPTION_TYPE__ALIAS_SET:
				return getAliasSet();
			case XtcePackage.NAME_DESCRIPTION_TYPE__NAME:
				return getName();
			case XtcePackage.NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION:
				return getShortDescription();
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
			case XtcePackage.NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION:
				setLongDescription((String)newValue);
				return;
			case XtcePackage.NAME_DESCRIPTION_TYPE__ALIAS_SET:
				setAliasSet((AliasSetType)newValue);
				return;
			case XtcePackage.NAME_DESCRIPTION_TYPE__NAME:
				setName((String)newValue);
				return;
			case XtcePackage.NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION:
				setShortDescription((String)newValue);
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
			case XtcePackage.NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION:
				setLongDescription(LONG_DESCRIPTION_EDEFAULT);
				return;
			case XtcePackage.NAME_DESCRIPTION_TYPE__ALIAS_SET:
				setAliasSet((AliasSetType)null);
				return;
			case XtcePackage.NAME_DESCRIPTION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XtcePackage.NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION:
				setShortDescription(SHORT_DESCRIPTION_EDEFAULT);
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
			case XtcePackage.NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION:
				return LONG_DESCRIPTION_EDEFAULT == null ? longDescription != null : !LONG_DESCRIPTION_EDEFAULT.equals(longDescription);
			case XtcePackage.NAME_DESCRIPTION_TYPE__ALIAS_SET:
				return aliasSet != null;
			case XtcePackage.NAME_DESCRIPTION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XtcePackage.NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION:
				return SHORT_DESCRIPTION_EDEFAULT == null ? shortDescription != null : !SHORT_DESCRIPTION_EDEFAULT.equals(shortDescription);
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
		result.append(" (longDescription: ");
		result.append(longDescription);
		result.append(", name: ");
		result.append(name);
		result.append(", shortDescription: ");
		result.append(shortDescription);
		result.append(')');
		return result.toString();
	}

} //NameDescriptionTypeImpl
