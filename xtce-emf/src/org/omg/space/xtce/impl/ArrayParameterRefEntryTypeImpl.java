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

import org.omg.space.xtce.ArrayParameterRefEntryType;
import org.omg.space.xtce.DimensionListType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Parameter Ref Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ArrayParameterRefEntryTypeImpl#getDimensionList <em>Dimension List</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ArrayParameterRefEntryTypeImpl#isLastEntryForThisArrayInstance <em>Last Entry For This Array Instance</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ArrayParameterRefEntryTypeImpl#getParameterRef <em>Parameter Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayParameterRefEntryTypeImpl extends SequenceEntryTypeImpl implements ArrayParameterRefEntryType {
	/**
	 * The cached value of the '{@link #getDimensionList() <em>Dimension List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionList()
	 * @generated
	 * @ordered
	 */
	protected DimensionListType dimensionList;

	/**
	 * The default value of the '{@link #isLastEntryForThisArrayInstance() <em>Last Entry For This Array Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLastEntryForThisArrayInstance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAST_ENTRY_FOR_THIS_ARRAY_INSTANCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLastEntryForThisArrayInstance() <em>Last Entry For This Array Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLastEntryForThisArrayInstance()
	 * @generated
	 * @ordered
	 */
	protected boolean lastEntryForThisArrayInstance = LAST_ENTRY_FOR_THIS_ARRAY_INSTANCE_EDEFAULT;

	/**
	 * This is true if the Last Entry For This Array Instance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastEntryForThisArrayInstanceESet;

	/**
	 * The default value of the '{@link #getParameterRef() <em>Parameter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterRef() <em>Parameter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterRef()
	 * @generated
	 * @ordered
	 */
	protected String parameterRef = PARAMETER_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayParameterRefEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getArrayParameterRefEntryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionListType getDimensionList() {
		return dimensionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimensionList(DimensionListType newDimensionList, NotificationChain msgs) {
		DimensionListType oldDimensionList = dimensionList;
		dimensionList = newDimensionList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__DIMENSION_LIST, oldDimensionList, newDimensionList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensionList(DimensionListType newDimensionList) {
		if (newDimensionList != dimensionList) {
			NotificationChain msgs = null;
			if (dimensionList != null)
				msgs = ((InternalEObject)dimensionList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__DIMENSION_LIST, null, msgs);
			if (newDimensionList != null)
				msgs = ((InternalEObject)newDimensionList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__DIMENSION_LIST, null, msgs);
			msgs = basicSetDimensionList(newDimensionList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__DIMENSION_LIST, newDimensionList, newDimensionList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLastEntryForThisArrayInstance() {
		return lastEntryForThisArrayInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastEntryForThisArrayInstance(boolean newLastEntryForThisArrayInstance) {
		boolean oldLastEntryForThisArrayInstance = lastEntryForThisArrayInstance;
		lastEntryForThisArrayInstance = newLastEntryForThisArrayInstance;
		boolean oldLastEntryForThisArrayInstanceESet = lastEntryForThisArrayInstanceESet;
		lastEntryForThisArrayInstanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__LAST_ENTRY_FOR_THIS_ARRAY_INSTANCE, oldLastEntryForThisArrayInstance, lastEntryForThisArrayInstance, !oldLastEntryForThisArrayInstanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastEntryForThisArrayInstance() {
		boolean oldLastEntryForThisArrayInstance = lastEntryForThisArrayInstance;
		boolean oldLastEntryForThisArrayInstanceESet = lastEntryForThisArrayInstanceESet;
		lastEntryForThisArrayInstance = LAST_ENTRY_FOR_THIS_ARRAY_INSTANCE_EDEFAULT;
		lastEntryForThisArrayInstanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__LAST_ENTRY_FOR_THIS_ARRAY_INSTANCE, oldLastEntryForThisArrayInstance, LAST_ENTRY_FOR_THIS_ARRAY_INSTANCE_EDEFAULT, oldLastEntryForThisArrayInstanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastEntryForThisArrayInstance() {
		return lastEntryForThisArrayInstanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterRef() {
		return parameterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterRef(String newParameterRef) {
		String oldParameterRef = parameterRef;
		parameterRef = newParameterRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__PARAMETER_REF, oldParameterRef, parameterRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__DIMENSION_LIST:
				return basicSetDimensionList(null, msgs);
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
			case XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__DIMENSION_LIST:
				return getDimensionList();
			case XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__LAST_ENTRY_FOR_THIS_ARRAY_INSTANCE:
				return isLastEntryForThisArrayInstance();
			case XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__PARAMETER_REF:
				return getParameterRef();
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
			case XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__DIMENSION_LIST:
				setDimensionList((DimensionListType)newValue);
				return;
			case XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__LAST_ENTRY_FOR_THIS_ARRAY_INSTANCE:
				setLastEntryForThisArrayInstance((Boolean)newValue);
				return;
			case XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__PARAMETER_REF:
				setParameterRef((String)newValue);
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
			case XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__DIMENSION_LIST:
				setDimensionList((DimensionListType)null);
				return;
			case XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__LAST_ENTRY_FOR_THIS_ARRAY_INSTANCE:
				unsetLastEntryForThisArrayInstance();
				return;
			case XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__PARAMETER_REF:
				setParameterRef(PARAMETER_REF_EDEFAULT);
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
			case XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__DIMENSION_LIST:
				return dimensionList != null;
			case XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__LAST_ENTRY_FOR_THIS_ARRAY_INSTANCE:
				return isSetLastEntryForThisArrayInstance();
			case XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE__PARAMETER_REF:
				return PARAMETER_REF_EDEFAULT == null ? parameterRef != null : !PARAMETER_REF_EDEFAULT.equals(parameterRef);
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
		result.append(" (lastEntryForThisArrayInstance: ");
		if (lastEntryForThisArrayInstanceESet) result.append(lastEntryForThisArrayInstance); else result.append("<unset>");
		result.append(", parameterRef: ");
		result.append(parameterRef);
		result.append(')');
		return result.toString();
	}

} //ArrayParameterRefEntryTypeImpl
