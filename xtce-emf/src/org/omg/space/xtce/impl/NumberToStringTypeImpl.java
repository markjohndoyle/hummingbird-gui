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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.space.xtce.NumberFormatType;
import org.omg.space.xtce.NumberToStringType;
import org.omg.space.xtce.RangeEnumerationType;
import org.omg.space.xtce.ValueEnumerationType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number To String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.NumberToStringTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumberToStringTypeImpl#getValueEnumeration <em>Value Enumeration</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumberToStringTypeImpl#getRangeEnumeration <em>Range Enumeration</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumberToStringTypeImpl#getNumberFormat <em>Number Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberToStringTypeImpl extends EObjectImpl implements NumberToStringType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getNumberFormat() <em>Number Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberFormat()
	 * @generated
	 * @ordered
	 */
	protected NumberFormatType numberFormat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberToStringTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getNumberToStringType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XtcePackage.NUMBER_TO_STRING_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueEnumerationType> getValueEnumeration() {
		return getGroup().list(XtcePackage.eINSTANCE.getNumberToStringType_ValueEnumeration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RangeEnumerationType> getRangeEnumeration() {
		return getGroup().list(XtcePackage.eINSTANCE.getNumberToStringType_RangeEnumeration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberFormatType getNumberFormat() {
		return numberFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberFormat(NumberFormatType newNumberFormat, NotificationChain msgs) {
		NumberFormatType oldNumberFormat = numberFormat;
		numberFormat = newNumberFormat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.NUMBER_TO_STRING_TYPE__NUMBER_FORMAT, oldNumberFormat, newNumberFormat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberFormat(NumberFormatType newNumberFormat) {
		if (newNumberFormat != numberFormat) {
			NotificationChain msgs = null;
			if (numberFormat != null)
				msgs = ((InternalEObject)numberFormat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMBER_TO_STRING_TYPE__NUMBER_FORMAT, null, msgs);
			if (newNumberFormat != null)
				msgs = ((InternalEObject)newNumberFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.NUMBER_TO_STRING_TYPE__NUMBER_FORMAT, null, msgs);
			msgs = basicSetNumberFormat(newNumberFormat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMBER_TO_STRING_TYPE__NUMBER_FORMAT, newNumberFormat, newNumberFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.NUMBER_TO_STRING_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XtcePackage.NUMBER_TO_STRING_TYPE__VALUE_ENUMERATION:
				return ((InternalEList<?>)getValueEnumeration()).basicRemove(otherEnd, msgs);
			case XtcePackage.NUMBER_TO_STRING_TYPE__RANGE_ENUMERATION:
				return ((InternalEList<?>)getRangeEnumeration()).basicRemove(otherEnd, msgs);
			case XtcePackage.NUMBER_TO_STRING_TYPE__NUMBER_FORMAT:
				return basicSetNumberFormat(null, msgs);
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
			case XtcePackage.NUMBER_TO_STRING_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XtcePackage.NUMBER_TO_STRING_TYPE__VALUE_ENUMERATION:
				return getValueEnumeration();
			case XtcePackage.NUMBER_TO_STRING_TYPE__RANGE_ENUMERATION:
				return getRangeEnumeration();
			case XtcePackage.NUMBER_TO_STRING_TYPE__NUMBER_FORMAT:
				return getNumberFormat();
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
			case XtcePackage.NUMBER_TO_STRING_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XtcePackage.NUMBER_TO_STRING_TYPE__VALUE_ENUMERATION:
				getValueEnumeration().clear();
				getValueEnumeration().addAll((Collection<? extends ValueEnumerationType>)newValue);
				return;
			case XtcePackage.NUMBER_TO_STRING_TYPE__RANGE_ENUMERATION:
				getRangeEnumeration().clear();
				getRangeEnumeration().addAll((Collection<? extends RangeEnumerationType>)newValue);
				return;
			case XtcePackage.NUMBER_TO_STRING_TYPE__NUMBER_FORMAT:
				setNumberFormat((NumberFormatType)newValue);
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
			case XtcePackage.NUMBER_TO_STRING_TYPE__GROUP:
				getGroup().clear();
				return;
			case XtcePackage.NUMBER_TO_STRING_TYPE__VALUE_ENUMERATION:
				getValueEnumeration().clear();
				return;
			case XtcePackage.NUMBER_TO_STRING_TYPE__RANGE_ENUMERATION:
				getRangeEnumeration().clear();
				return;
			case XtcePackage.NUMBER_TO_STRING_TYPE__NUMBER_FORMAT:
				setNumberFormat((NumberFormatType)null);
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
			case XtcePackage.NUMBER_TO_STRING_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XtcePackage.NUMBER_TO_STRING_TYPE__VALUE_ENUMERATION:
				return !getValueEnumeration().isEmpty();
			case XtcePackage.NUMBER_TO_STRING_TYPE__RANGE_ENUMERATION:
				return !getRangeEnumeration().isEmpty();
			case XtcePackage.NUMBER_TO_STRING_TYPE__NUMBER_FORMAT:
				return numberFormat != null;
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //NumberToStringTypeImpl
