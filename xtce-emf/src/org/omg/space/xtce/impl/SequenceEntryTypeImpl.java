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

import org.omg.space.xtce.LocationInContainerInBitsType;
import org.omg.space.xtce.MatchCriteriaType;
import org.omg.space.xtce.RepeatType;
import org.omg.space.xtce.SequenceEntryType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.SequenceEntryTypeImpl#getLocationInContainerInBits <em>Location In Container In Bits</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SequenceEntryTypeImpl#getRepeatEntry <em>Repeat Entry</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SequenceEntryTypeImpl#getIncludeCondition <em>Include Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceEntryTypeImpl extends EObjectImpl implements SequenceEntryType {
	/**
	 * The cached value of the '{@link #getLocationInContainerInBits() <em>Location In Container In Bits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationInContainerInBits()
	 * @generated
	 * @ordered
	 */
	protected LocationInContainerInBitsType locationInContainerInBits;

	/**
	 * The cached value of the '{@link #getRepeatEntry() <em>Repeat Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatEntry()
	 * @generated
	 * @ordered
	 */
	protected RepeatType repeatEntry;

	/**
	 * The cached value of the '{@link #getIncludeCondition() <em>Include Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeCondition()
	 * @generated
	 * @ordered
	 */
	protected MatchCriteriaType includeCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getSequenceEntryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationInContainerInBitsType getLocationInContainerInBits() {
		return locationInContainerInBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationInContainerInBits(LocationInContainerInBitsType newLocationInContainerInBits, NotificationChain msgs) {
		LocationInContainerInBitsType oldLocationInContainerInBits = locationInContainerInBits;
		locationInContainerInBits = newLocationInContainerInBits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS, oldLocationInContainerInBits, newLocationInContainerInBits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationInContainerInBits(LocationInContainerInBitsType newLocationInContainerInBits) {
		if (newLocationInContainerInBits != locationInContainerInBits) {
			NotificationChain msgs = null;
			if (locationInContainerInBits != null)
				msgs = ((InternalEObject)locationInContainerInBits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS, null, msgs);
			if (newLocationInContainerInBits != null)
				msgs = ((InternalEObject)newLocationInContainerInBits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS, null, msgs);
			msgs = basicSetLocationInContainerInBits(newLocationInContainerInBits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS, newLocationInContainerInBits, newLocationInContainerInBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatType getRepeatEntry() {
		return repeatEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeatEntry(RepeatType newRepeatEntry, NotificationChain msgs) {
		RepeatType oldRepeatEntry = repeatEntry;
		repeatEntry = newRepeatEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY, oldRepeatEntry, newRepeatEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatEntry(RepeatType newRepeatEntry) {
		if (newRepeatEntry != repeatEntry) {
			NotificationChain msgs = null;
			if (repeatEntry != null)
				msgs = ((InternalEObject)repeatEntry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY, null, msgs);
			if (newRepeatEntry != null)
				msgs = ((InternalEObject)newRepeatEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY, null, msgs);
			msgs = basicSetRepeatEntry(newRepeatEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY, newRepeatEntry, newRepeatEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchCriteriaType getIncludeCondition() {
		return includeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludeCondition(MatchCriteriaType newIncludeCondition, NotificationChain msgs) {
		MatchCriteriaType oldIncludeCondition = includeCondition;
		includeCondition = newIncludeCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION, oldIncludeCondition, newIncludeCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeCondition(MatchCriteriaType newIncludeCondition) {
		if (newIncludeCondition != includeCondition) {
			NotificationChain msgs = null;
			if (includeCondition != null)
				msgs = ((InternalEObject)includeCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION, null, msgs);
			if (newIncludeCondition != null)
				msgs = ((InternalEObject)newIncludeCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION, null, msgs);
			msgs = basicSetIncludeCondition(newIncludeCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION, newIncludeCondition, newIncludeCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS:
				return basicSetLocationInContainerInBits(null, msgs);
			case XtcePackage.SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY:
				return basicSetRepeatEntry(null, msgs);
			case XtcePackage.SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION:
				return basicSetIncludeCondition(null, msgs);
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
			case XtcePackage.SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS:
				return getLocationInContainerInBits();
			case XtcePackage.SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY:
				return getRepeatEntry();
			case XtcePackage.SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION:
				return getIncludeCondition();
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
			case XtcePackage.SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS:
				setLocationInContainerInBits((LocationInContainerInBitsType)newValue);
				return;
			case XtcePackage.SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY:
				setRepeatEntry((RepeatType)newValue);
				return;
			case XtcePackage.SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION:
				setIncludeCondition((MatchCriteriaType)newValue);
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
			case XtcePackage.SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS:
				setLocationInContainerInBits((LocationInContainerInBitsType)null);
				return;
			case XtcePackage.SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY:
				setRepeatEntry((RepeatType)null);
				return;
			case XtcePackage.SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION:
				setIncludeCondition((MatchCriteriaType)null);
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
			case XtcePackage.SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS:
				return locationInContainerInBits != null;
			case XtcePackage.SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY:
				return repeatEntry != null;
			case XtcePackage.SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION:
				return includeCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceEntryTypeImpl
