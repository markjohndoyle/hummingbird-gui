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

import org.omg.space.xtce.DataEncodingType;
import org.omg.space.xtce.DefaultsType;
import org.omg.space.xtce.TimeAssociationType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defaults Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.DefaultsTypeImpl#getDefaultDataEncoding <em>Default Data Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.DefaultsTypeImpl#getParameterTimeAssociation <em>Parameter Time Association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultsTypeImpl extends EObjectImpl implements DefaultsType {
	/**
	 * The cached value of the '{@link #getDefaultDataEncoding() <em>Default Data Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDataEncoding()
	 * @generated
	 * @ordered
	 */
	protected DataEncodingType defaultDataEncoding;

	/**
	 * The cached value of the '{@link #getParameterTimeAssociation() <em>Parameter Time Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterTimeAssociation()
	 * @generated
	 * @ordered
	 */
	protected TimeAssociationType parameterTimeAssociation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getDefaultsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEncodingType getDefaultDataEncoding() {
		return defaultDataEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultDataEncoding(DataEncodingType newDefaultDataEncoding, NotificationChain msgs) {
		DataEncodingType oldDefaultDataEncoding = defaultDataEncoding;
		defaultDataEncoding = newDefaultDataEncoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.DEFAULTS_TYPE__DEFAULT_DATA_ENCODING, oldDefaultDataEncoding, newDefaultDataEncoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultDataEncoding(DataEncodingType newDefaultDataEncoding) {
		if (newDefaultDataEncoding != defaultDataEncoding) {
			NotificationChain msgs = null;
			if (defaultDataEncoding != null)
				msgs = ((InternalEObject)defaultDataEncoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DEFAULTS_TYPE__DEFAULT_DATA_ENCODING, null, msgs);
			if (newDefaultDataEncoding != null)
				msgs = ((InternalEObject)newDefaultDataEncoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DEFAULTS_TYPE__DEFAULT_DATA_ENCODING, null, msgs);
			msgs = basicSetDefaultDataEncoding(newDefaultDataEncoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.DEFAULTS_TYPE__DEFAULT_DATA_ENCODING, newDefaultDataEncoding, newDefaultDataEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAssociationType getParameterTimeAssociation() {
		return parameterTimeAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterTimeAssociation(TimeAssociationType newParameterTimeAssociation, NotificationChain msgs) {
		TimeAssociationType oldParameterTimeAssociation = parameterTimeAssociation;
		parameterTimeAssociation = newParameterTimeAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.DEFAULTS_TYPE__PARAMETER_TIME_ASSOCIATION, oldParameterTimeAssociation, newParameterTimeAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterTimeAssociation(TimeAssociationType newParameterTimeAssociation) {
		if (newParameterTimeAssociation != parameterTimeAssociation) {
			NotificationChain msgs = null;
			if (parameterTimeAssociation != null)
				msgs = ((InternalEObject)parameterTimeAssociation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DEFAULTS_TYPE__PARAMETER_TIME_ASSOCIATION, null, msgs);
			if (newParameterTimeAssociation != null)
				msgs = ((InternalEObject)newParameterTimeAssociation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DEFAULTS_TYPE__PARAMETER_TIME_ASSOCIATION, null, msgs);
			msgs = basicSetParameterTimeAssociation(newParameterTimeAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.DEFAULTS_TYPE__PARAMETER_TIME_ASSOCIATION, newParameterTimeAssociation, newParameterTimeAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.DEFAULTS_TYPE__DEFAULT_DATA_ENCODING:
				return basicSetDefaultDataEncoding(null, msgs);
			case XtcePackage.DEFAULTS_TYPE__PARAMETER_TIME_ASSOCIATION:
				return basicSetParameterTimeAssociation(null, msgs);
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
			case XtcePackage.DEFAULTS_TYPE__DEFAULT_DATA_ENCODING:
				return getDefaultDataEncoding();
			case XtcePackage.DEFAULTS_TYPE__PARAMETER_TIME_ASSOCIATION:
				return getParameterTimeAssociation();
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
			case XtcePackage.DEFAULTS_TYPE__DEFAULT_DATA_ENCODING:
				setDefaultDataEncoding((DataEncodingType)newValue);
				return;
			case XtcePackage.DEFAULTS_TYPE__PARAMETER_TIME_ASSOCIATION:
				setParameterTimeAssociation((TimeAssociationType)newValue);
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
			case XtcePackage.DEFAULTS_TYPE__DEFAULT_DATA_ENCODING:
				setDefaultDataEncoding((DataEncodingType)null);
				return;
			case XtcePackage.DEFAULTS_TYPE__PARAMETER_TIME_ASSOCIATION:
				setParameterTimeAssociation((TimeAssociationType)null);
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
			case XtcePackage.DEFAULTS_TYPE__DEFAULT_DATA_ENCODING:
				return defaultDataEncoding != null;
			case XtcePackage.DEFAULTS_TYPE__PARAMETER_TIME_ASSOCIATION:
				return parameterTimeAssociation != null;
		}
		return super.eIsSet(featureID);
	}

} //DefaultsTypeImpl
