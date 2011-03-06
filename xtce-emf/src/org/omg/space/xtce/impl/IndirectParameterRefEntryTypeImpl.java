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

import org.omg.space.xtce.IndirectParameterRefEntryType;
import org.omg.space.xtce.ParameterInstanceRefType1;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indirect Parameter Ref Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.IndirectParameterRefEntryTypeImpl#getParameterInstance <em>Parameter Instance</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.IndirectParameterRefEntryTypeImpl#getAliasNameSpace <em>Alias Name Space</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndirectParameterRefEntryTypeImpl extends SequenceEntryTypeImpl implements IndirectParameterRefEntryType {
	/**
	 * The cached value of the '{@link #getParameterInstance() <em>Parameter Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterInstance()
	 * @generated
	 * @ordered
	 */
	protected ParameterInstanceRefType1 parameterInstance;

	/**
	 * The default value of the '{@link #getAliasNameSpace() <em>Alias Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasNameSpace()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_NAME_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAliasNameSpace() <em>Alias Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasNameSpace()
	 * @generated
	 * @ordered
	 */
	protected String aliasNameSpace = ALIAS_NAME_SPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndirectParameterRefEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getIndirectParameterRefEntryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterInstanceRefType1 getParameterInstance() {
		return parameterInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterInstance(ParameterInstanceRefType1 newParameterInstance, NotificationChain msgs) {
		ParameterInstanceRefType1 oldParameterInstance = parameterInstance;
		parameterInstance = newParameterInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.INDIRECT_PARAMETER_REF_ENTRY_TYPE__PARAMETER_INSTANCE, oldParameterInstance, newParameterInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterInstance(ParameterInstanceRefType1 newParameterInstance) {
		if (newParameterInstance != parameterInstance) {
			NotificationChain msgs = null;
			if (parameterInstance != null)
				msgs = ((InternalEObject)parameterInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.INDIRECT_PARAMETER_REF_ENTRY_TYPE__PARAMETER_INSTANCE, null, msgs);
			if (newParameterInstance != null)
				msgs = ((InternalEObject)newParameterInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.INDIRECT_PARAMETER_REF_ENTRY_TYPE__PARAMETER_INSTANCE, null, msgs);
			msgs = basicSetParameterInstance(newParameterInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INDIRECT_PARAMETER_REF_ENTRY_TYPE__PARAMETER_INSTANCE, newParameterInstance, newParameterInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAliasNameSpace() {
		return aliasNameSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasNameSpace(String newAliasNameSpace) {
		String oldAliasNameSpace = aliasNameSpace;
		aliasNameSpace = newAliasNameSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INDIRECT_PARAMETER_REF_ENTRY_TYPE__ALIAS_NAME_SPACE, oldAliasNameSpace, aliasNameSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.INDIRECT_PARAMETER_REF_ENTRY_TYPE__PARAMETER_INSTANCE:
				return basicSetParameterInstance(null, msgs);
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
			case XtcePackage.INDIRECT_PARAMETER_REF_ENTRY_TYPE__PARAMETER_INSTANCE:
				return getParameterInstance();
			case XtcePackage.INDIRECT_PARAMETER_REF_ENTRY_TYPE__ALIAS_NAME_SPACE:
				return getAliasNameSpace();
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
			case XtcePackage.INDIRECT_PARAMETER_REF_ENTRY_TYPE__PARAMETER_INSTANCE:
				setParameterInstance((ParameterInstanceRefType1)newValue);
				return;
			case XtcePackage.INDIRECT_PARAMETER_REF_ENTRY_TYPE__ALIAS_NAME_SPACE:
				setAliasNameSpace((String)newValue);
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
			case XtcePackage.INDIRECT_PARAMETER_REF_ENTRY_TYPE__PARAMETER_INSTANCE:
				setParameterInstance((ParameterInstanceRefType1)null);
				return;
			case XtcePackage.INDIRECT_PARAMETER_REF_ENTRY_TYPE__ALIAS_NAME_SPACE:
				setAliasNameSpace(ALIAS_NAME_SPACE_EDEFAULT);
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
			case XtcePackage.INDIRECT_PARAMETER_REF_ENTRY_TYPE__PARAMETER_INSTANCE:
				return parameterInstance != null;
			case XtcePackage.INDIRECT_PARAMETER_REF_ENTRY_TYPE__ALIAS_NAME_SPACE:
				return ALIAS_NAME_SPACE_EDEFAULT == null ? aliasNameSpace != null : !ALIAS_NAME_SPACE_EDEFAULT.equals(aliasNameSpace);
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
		result.append(" (aliasNameSpace: ");
		result.append(aliasNameSpace);
		result.append(')');
		return result.toString();
	}

} //IndirectParameterRefEntryTypeImpl
