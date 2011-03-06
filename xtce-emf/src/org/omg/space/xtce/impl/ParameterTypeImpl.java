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

import org.omg.space.xtce.ParameterPropertiesType;
import org.omg.space.xtce.ParameterType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ParameterTypeImpl#getParameterProperties <em>Parameter Properties</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ParameterTypeImpl#getParameterTypeRef <em>Parameter Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterTypeImpl extends NameDescriptionTypeImpl implements ParameterType {
	/**
	 * The cached value of the '{@link #getParameterProperties() <em>Parameter Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterProperties()
	 * @generated
	 * @ordered
	 */
	protected ParameterPropertiesType parameterProperties;

	/**
	 * The default value of the '{@link #getParameterTypeRef() <em>Parameter Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterTypeRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_TYPE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterTypeRef() <em>Parameter Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterTypeRef()
	 * @generated
	 * @ordered
	 */
	protected String parameterTypeRef = PARAMETER_TYPE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getParameterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterPropertiesType getParameterProperties() {
		return parameterProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterProperties(ParameterPropertiesType newParameterProperties, NotificationChain msgs) {
		ParameterPropertiesType oldParameterProperties = parameterProperties;
		parameterProperties = newParameterProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_TYPE__PARAMETER_PROPERTIES, oldParameterProperties, newParameterProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterProperties(ParameterPropertiesType newParameterProperties) {
		if (newParameterProperties != parameterProperties) {
			NotificationChain msgs = null;
			if (parameterProperties != null)
				msgs = ((InternalEObject)parameterProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PARAMETER_TYPE__PARAMETER_PROPERTIES, null, msgs);
			if (newParameterProperties != null)
				msgs = ((InternalEObject)newParameterProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.PARAMETER_TYPE__PARAMETER_PROPERTIES, null, msgs);
			msgs = basicSetParameterProperties(newParameterProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_TYPE__PARAMETER_PROPERTIES, newParameterProperties, newParameterProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterTypeRef() {
		return parameterTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterTypeRef(String newParameterTypeRef) {
		String oldParameterTypeRef = parameterTypeRef;
		parameterTypeRef = newParameterTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PARAMETER_TYPE__PARAMETER_TYPE_REF, oldParameterTypeRef, parameterTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.PARAMETER_TYPE__PARAMETER_PROPERTIES:
				return basicSetParameterProperties(null, msgs);
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
			case XtcePackage.PARAMETER_TYPE__PARAMETER_PROPERTIES:
				return getParameterProperties();
			case XtcePackage.PARAMETER_TYPE__PARAMETER_TYPE_REF:
				return getParameterTypeRef();
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
			case XtcePackage.PARAMETER_TYPE__PARAMETER_PROPERTIES:
				setParameterProperties((ParameterPropertiesType)newValue);
				return;
			case XtcePackage.PARAMETER_TYPE__PARAMETER_TYPE_REF:
				setParameterTypeRef((String)newValue);
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
			case XtcePackage.PARAMETER_TYPE__PARAMETER_PROPERTIES:
				setParameterProperties((ParameterPropertiesType)null);
				return;
			case XtcePackage.PARAMETER_TYPE__PARAMETER_TYPE_REF:
				setParameterTypeRef(PARAMETER_TYPE_REF_EDEFAULT);
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
			case XtcePackage.PARAMETER_TYPE__PARAMETER_PROPERTIES:
				return parameterProperties != null;
			case XtcePackage.PARAMETER_TYPE__PARAMETER_TYPE_REF:
				return PARAMETER_TYPE_REF_EDEFAULT == null ? parameterTypeRef != null : !PARAMETER_TYPE_REF_EDEFAULT.equals(parameterTypeRef);
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
		result.append(" (parameterTypeRef: ");
		result.append(parameterTypeRef);
		result.append(')');
		return result.toString();
	}

} //ParameterTypeImpl
