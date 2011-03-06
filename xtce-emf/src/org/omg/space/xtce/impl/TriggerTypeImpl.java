/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.math.BigInteger;

import java.util.Collection;

import javax.xml.datatype.Duration;

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

import org.omg.space.xtce.ParameterRefType;
import org.omg.space.xtce.TriggerType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.TriggerTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.TriggerTypeImpl#getParameterRef <em>Parameter Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.TriggerTypeImpl#getTriggerFrequency <em>Trigger Frequency</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.TriggerTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.TriggerTypeImpl#getTriggerRate <em>Trigger Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerTypeImpl extends EObjectImpl implements TriggerType {
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
	 * The default value of the '{@link #getTriggerRate() <em>Trigger Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerRate()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TRIGGER_RATE_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getTriggerRate() <em>Trigger Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerRate()
	 * @generated
	 * @ordered
	 */
	protected BigInteger triggerRate = TRIGGER_RATE_EDEFAULT;

	/**
	 * This is true if the Trigger Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean triggerRateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getTriggerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XtcePackage.TRIGGER_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterRefType> getParameterRef() {
		return getGroup().list(XtcePackage.eINSTANCE.getTriggerType_ParameterRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Duration> getTriggerFrequency() {
		return getGroup().list(XtcePackage.eINSTANCE.getTriggerType_TriggerFrequency());
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
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.TRIGGER_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTriggerRate() {
		return triggerRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerRate(BigInteger newTriggerRate) {
		BigInteger oldTriggerRate = triggerRate;
		triggerRate = newTriggerRate;
		boolean oldTriggerRateESet = triggerRateESet;
		triggerRateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.TRIGGER_TYPE__TRIGGER_RATE, oldTriggerRate, triggerRate, !oldTriggerRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTriggerRate() {
		BigInteger oldTriggerRate = triggerRate;
		boolean oldTriggerRateESet = triggerRateESet;
		triggerRate = TRIGGER_RATE_EDEFAULT;
		triggerRateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.TRIGGER_TYPE__TRIGGER_RATE, oldTriggerRate, TRIGGER_RATE_EDEFAULT, oldTriggerRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTriggerRate() {
		return triggerRateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.TRIGGER_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XtcePackage.TRIGGER_TYPE__PARAMETER_REF:
				return ((InternalEList<?>)getParameterRef()).basicRemove(otherEnd, msgs);
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
			case XtcePackage.TRIGGER_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XtcePackage.TRIGGER_TYPE__PARAMETER_REF:
				return getParameterRef();
			case XtcePackage.TRIGGER_TYPE__TRIGGER_FREQUENCY:
				return getTriggerFrequency();
			case XtcePackage.TRIGGER_TYPE__NAME:
				return getName();
			case XtcePackage.TRIGGER_TYPE__TRIGGER_RATE:
				return getTriggerRate();
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
			case XtcePackage.TRIGGER_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XtcePackage.TRIGGER_TYPE__PARAMETER_REF:
				getParameterRef().clear();
				getParameterRef().addAll((Collection<? extends ParameterRefType>)newValue);
				return;
			case XtcePackage.TRIGGER_TYPE__TRIGGER_FREQUENCY:
				getTriggerFrequency().clear();
				getTriggerFrequency().addAll((Collection<? extends Duration>)newValue);
				return;
			case XtcePackage.TRIGGER_TYPE__NAME:
				setName((String)newValue);
				return;
			case XtcePackage.TRIGGER_TYPE__TRIGGER_RATE:
				setTriggerRate((BigInteger)newValue);
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
			case XtcePackage.TRIGGER_TYPE__GROUP:
				getGroup().clear();
				return;
			case XtcePackage.TRIGGER_TYPE__PARAMETER_REF:
				getParameterRef().clear();
				return;
			case XtcePackage.TRIGGER_TYPE__TRIGGER_FREQUENCY:
				getTriggerFrequency().clear();
				return;
			case XtcePackage.TRIGGER_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XtcePackage.TRIGGER_TYPE__TRIGGER_RATE:
				unsetTriggerRate();
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
			case XtcePackage.TRIGGER_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XtcePackage.TRIGGER_TYPE__PARAMETER_REF:
				return !getParameterRef().isEmpty();
			case XtcePackage.TRIGGER_TYPE__TRIGGER_FREQUENCY:
				return !getTriggerFrequency().isEmpty();
			case XtcePackage.TRIGGER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XtcePackage.TRIGGER_TYPE__TRIGGER_RATE:
				return isSetTriggerRate();
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
		result.append(", name: ");
		result.append(name);
		result.append(", triggerRate: ");
		if (triggerRateESet) result.append(triggerRate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TriggerTypeImpl
