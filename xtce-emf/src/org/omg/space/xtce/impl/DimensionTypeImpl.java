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

import org.omg.space.xtce.DimensionType;
import org.omg.space.xtce.IntegerValueType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.DimensionTypeImpl#getStartingIndex <em>Starting Index</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.DimensionTypeImpl#getEndingIndex <em>Ending Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionTypeImpl extends EObjectImpl implements DimensionType {
	/**
	 * The cached value of the '{@link #getStartingIndex() <em>Starting Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingIndex()
	 * @generated
	 * @ordered
	 */
	protected IntegerValueType startingIndex;

	/**
	 * The cached value of the '{@link #getEndingIndex() <em>Ending Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingIndex()
	 * @generated
	 * @ordered
	 */
	protected IntegerValueType endingIndex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getDimensionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueType getStartingIndex() {
		return startingIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartingIndex(IntegerValueType newStartingIndex, NotificationChain msgs) {
		IntegerValueType oldStartingIndex = startingIndex;
		startingIndex = newStartingIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.DIMENSION_TYPE__STARTING_INDEX, oldStartingIndex, newStartingIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingIndex(IntegerValueType newStartingIndex) {
		if (newStartingIndex != startingIndex) {
			NotificationChain msgs = null;
			if (startingIndex != null)
				msgs = ((InternalEObject)startingIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DIMENSION_TYPE__STARTING_INDEX, null, msgs);
			if (newStartingIndex != null)
				msgs = ((InternalEObject)newStartingIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DIMENSION_TYPE__STARTING_INDEX, null, msgs);
			msgs = basicSetStartingIndex(newStartingIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.DIMENSION_TYPE__STARTING_INDEX, newStartingIndex, newStartingIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueType getEndingIndex() {
		return endingIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndingIndex(IntegerValueType newEndingIndex, NotificationChain msgs) {
		IntegerValueType oldEndingIndex = endingIndex;
		endingIndex = newEndingIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.DIMENSION_TYPE__ENDING_INDEX, oldEndingIndex, newEndingIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndingIndex(IntegerValueType newEndingIndex) {
		if (newEndingIndex != endingIndex) {
			NotificationChain msgs = null;
			if (endingIndex != null)
				msgs = ((InternalEObject)endingIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DIMENSION_TYPE__ENDING_INDEX, null, msgs);
			if (newEndingIndex != null)
				msgs = ((InternalEObject)newEndingIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.DIMENSION_TYPE__ENDING_INDEX, null, msgs);
			msgs = basicSetEndingIndex(newEndingIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.DIMENSION_TYPE__ENDING_INDEX, newEndingIndex, newEndingIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.DIMENSION_TYPE__STARTING_INDEX:
				return basicSetStartingIndex(null, msgs);
			case XtcePackage.DIMENSION_TYPE__ENDING_INDEX:
				return basicSetEndingIndex(null, msgs);
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
			case XtcePackage.DIMENSION_TYPE__STARTING_INDEX:
				return getStartingIndex();
			case XtcePackage.DIMENSION_TYPE__ENDING_INDEX:
				return getEndingIndex();
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
			case XtcePackage.DIMENSION_TYPE__STARTING_INDEX:
				setStartingIndex((IntegerValueType)newValue);
				return;
			case XtcePackage.DIMENSION_TYPE__ENDING_INDEX:
				setEndingIndex((IntegerValueType)newValue);
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
			case XtcePackage.DIMENSION_TYPE__STARTING_INDEX:
				setStartingIndex((IntegerValueType)null);
				return;
			case XtcePackage.DIMENSION_TYPE__ENDING_INDEX:
				setEndingIndex((IntegerValueType)null);
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
			case XtcePackage.DIMENSION_TYPE__STARTING_INDEX:
				return startingIndex != null;
			case XtcePackage.DIMENSION_TYPE__ENDING_INDEX:
				return endingIndex != null;
		}
		return super.eIsSet(featureID);
	}

} //DimensionTypeImpl
