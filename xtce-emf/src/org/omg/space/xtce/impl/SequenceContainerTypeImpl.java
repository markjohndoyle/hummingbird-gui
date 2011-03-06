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

import org.omg.space.xtce.BaseContainerType1;
import org.omg.space.xtce.EntryListType;
import org.omg.space.xtce.SequenceContainerType;
import org.omg.space.xtce.XtceFactory;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Container Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.SequenceContainerTypeImpl#getEntryList <em>Entry List</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SequenceContainerTypeImpl#getBaseContainer <em>Base Container</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SequenceContainerTypeImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SequenceContainerTypeImpl#getIdlePattern <em>Idle Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceContainerTypeImpl extends ContainerTypeImpl implements SequenceContainerType {
	/**
	 * The cached value of the '{@link #getEntryList() <em>Entry List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryList()
	 * @generated
	 * @ordered
	 */
	protected EntryListType entryList;

	/**
	 * The cached value of the '{@link #getBaseContainer() <em>Base Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseContainer()
	 * @generated
	 * @ordered
	 */
	protected BaseContainerType1 baseContainer;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean abstractESet;

	/**
	 * The default value of the '{@link #getIdlePattern() <em>Idle Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdlePattern()
	 * @generated
	 * @ordered
	 */
	protected static final Object IDLE_PATTERN_EDEFAULT = XtceFactory.eINSTANCE.createFromString(XtcePackage.eINSTANCE.getFixedIntegerValueType(), "0x0");

	/**
	 * The cached value of the '{@link #getIdlePattern() <em>Idle Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdlePattern()
	 * @generated
	 * @ordered
	 */
	protected Object idlePattern = IDLE_PATTERN_EDEFAULT;

	/**
	 * This is true if the Idle Pattern attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idlePatternESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceContainerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getSequenceContainerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryListType getEntryList() {
		return entryList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryList(EntryListType newEntryList, NotificationChain msgs) {
		EntryListType oldEntryList = entryList;
		entryList = newEntryList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SEQUENCE_CONTAINER_TYPE__ENTRY_LIST, oldEntryList, newEntryList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryList(EntryListType newEntryList) {
		if (newEntryList != entryList) {
			NotificationChain msgs = null;
			if (entryList != null)
				msgs = ((InternalEObject)entryList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SEQUENCE_CONTAINER_TYPE__ENTRY_LIST, null, msgs);
			if (newEntryList != null)
				msgs = ((InternalEObject)newEntryList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SEQUENCE_CONTAINER_TYPE__ENTRY_LIST, null, msgs);
			msgs = basicSetEntryList(newEntryList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SEQUENCE_CONTAINER_TYPE__ENTRY_LIST, newEntryList, newEntryList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseContainerType1 getBaseContainer() {
		return baseContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseContainer(BaseContainerType1 newBaseContainer, NotificationChain msgs) {
		BaseContainerType1 oldBaseContainer = baseContainer;
		baseContainer = newBaseContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.SEQUENCE_CONTAINER_TYPE__BASE_CONTAINER, oldBaseContainer, newBaseContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseContainer(BaseContainerType1 newBaseContainer) {
		if (newBaseContainer != baseContainer) {
			NotificationChain msgs = null;
			if (baseContainer != null)
				msgs = ((InternalEObject)baseContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SEQUENCE_CONTAINER_TYPE__BASE_CONTAINER, null, msgs);
			if (newBaseContainer != null)
				msgs = ((InternalEObject)newBaseContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.SEQUENCE_CONTAINER_TYPE__BASE_CONTAINER, null, msgs);
			msgs = basicSetBaseContainer(newBaseContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SEQUENCE_CONTAINER_TYPE__BASE_CONTAINER, newBaseContainer, newBaseContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		boolean oldAbstractESet = abstractESet;
		abstractESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SEQUENCE_CONTAINER_TYPE__ABSTRACT, oldAbstract, abstract_, !oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAbstract() {
		boolean oldAbstract = abstract_;
		boolean oldAbstractESet = abstractESet;
		abstract_ = ABSTRACT_EDEFAULT;
		abstractESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.SEQUENCE_CONTAINER_TYPE__ABSTRACT, oldAbstract, ABSTRACT_EDEFAULT, oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAbstract() {
		return abstractESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIdlePattern() {
		return idlePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdlePattern(Object newIdlePattern) {
		Object oldIdlePattern = idlePattern;
		idlePattern = newIdlePattern;
		boolean oldIdlePatternESet = idlePatternESet;
		idlePatternESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SEQUENCE_CONTAINER_TYPE__IDLE_PATTERN, oldIdlePattern, idlePattern, !oldIdlePatternESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIdlePattern() {
		Object oldIdlePattern = idlePattern;
		boolean oldIdlePatternESet = idlePatternESet;
		idlePattern = IDLE_PATTERN_EDEFAULT;
		idlePatternESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.SEQUENCE_CONTAINER_TYPE__IDLE_PATTERN, oldIdlePattern, IDLE_PATTERN_EDEFAULT, oldIdlePatternESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIdlePattern() {
		return idlePatternESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__ENTRY_LIST:
				return basicSetEntryList(null, msgs);
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__BASE_CONTAINER:
				return basicSetBaseContainer(null, msgs);
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
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__ENTRY_LIST:
				return getEntryList();
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__BASE_CONTAINER:
				return getBaseContainer();
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__ABSTRACT:
				return isAbstract();
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__IDLE_PATTERN:
				return getIdlePattern();
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
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__ENTRY_LIST:
				setEntryList((EntryListType)newValue);
				return;
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__BASE_CONTAINER:
				setBaseContainer((BaseContainerType1)newValue);
				return;
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__IDLE_PATTERN:
				setIdlePattern(newValue);
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
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__ENTRY_LIST:
				setEntryList((EntryListType)null);
				return;
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__BASE_CONTAINER:
				setBaseContainer((BaseContainerType1)null);
				return;
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__ABSTRACT:
				unsetAbstract();
				return;
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__IDLE_PATTERN:
				unsetIdlePattern();
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
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__ENTRY_LIST:
				return entryList != null;
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__BASE_CONTAINER:
				return baseContainer != null;
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__ABSTRACT:
				return isSetAbstract();
			case XtcePackage.SEQUENCE_CONTAINER_TYPE__IDLE_PATTERN:
				return isSetIdlePattern();
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
		result.append(" (abstract: ");
		if (abstractESet) result.append(abstract_); else result.append("<unset>");
		result.append(", idlePattern: ");
		if (idlePatternESet) result.append(idlePattern); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SequenceContainerTypeImpl
