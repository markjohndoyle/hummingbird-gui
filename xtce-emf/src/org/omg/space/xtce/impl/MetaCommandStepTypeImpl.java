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

import org.omg.space.xtce.ArgumentListType;
import org.omg.space.xtce.MetaCommandStepType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Command Step Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandStepTypeImpl#getArgumentList <em>Argument List</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandStepTypeImpl#getMetaCommandRef <em>Meta Command Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaCommandStepTypeImpl extends EObjectImpl implements MetaCommandStepType {
	/**
	 * The cached value of the '{@link #getArgumentList() <em>Argument List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentList()
	 * @generated
	 * @ordered
	 */
	protected ArgumentListType argumentList;

	/**
	 * The default value of the '{@link #getMetaCommandRef() <em>Meta Command Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaCommandRef()
	 * @generated
	 * @ordered
	 */
	protected static final String META_COMMAND_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaCommandRef() <em>Meta Command Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaCommandRef()
	 * @generated
	 * @ordered
	 */
	protected String metaCommandRef = META_COMMAND_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaCommandStepTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getMetaCommandStepType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentListType getArgumentList() {
		return argumentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgumentList(ArgumentListType newArgumentList, NotificationChain msgs) {
		ArgumentListType oldArgumentList = argumentList;
		argumentList = newArgumentList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_STEP_TYPE__ARGUMENT_LIST, oldArgumentList, newArgumentList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentList(ArgumentListType newArgumentList) {
		if (newArgumentList != argumentList) {
			NotificationChain msgs = null;
			if (argumentList != null)
				msgs = ((InternalEObject)argumentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_STEP_TYPE__ARGUMENT_LIST, null, msgs);
			if (newArgumentList != null)
				msgs = ((InternalEObject)newArgumentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_STEP_TYPE__ARGUMENT_LIST, null, msgs);
			msgs = basicSetArgumentList(newArgumentList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_STEP_TYPE__ARGUMENT_LIST, newArgumentList, newArgumentList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaCommandRef() {
		return metaCommandRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaCommandRef(String newMetaCommandRef) {
		String oldMetaCommandRef = metaCommandRef;
		metaCommandRef = newMetaCommandRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_STEP_TYPE__META_COMMAND_REF, oldMetaCommandRef, metaCommandRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.META_COMMAND_STEP_TYPE__ARGUMENT_LIST:
				return basicSetArgumentList(null, msgs);
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
			case XtcePackage.META_COMMAND_STEP_TYPE__ARGUMENT_LIST:
				return getArgumentList();
			case XtcePackage.META_COMMAND_STEP_TYPE__META_COMMAND_REF:
				return getMetaCommandRef();
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
			case XtcePackage.META_COMMAND_STEP_TYPE__ARGUMENT_LIST:
				setArgumentList((ArgumentListType)newValue);
				return;
			case XtcePackage.META_COMMAND_STEP_TYPE__META_COMMAND_REF:
				setMetaCommandRef((String)newValue);
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
			case XtcePackage.META_COMMAND_STEP_TYPE__ARGUMENT_LIST:
				setArgumentList((ArgumentListType)null);
				return;
			case XtcePackage.META_COMMAND_STEP_TYPE__META_COMMAND_REF:
				setMetaCommandRef(META_COMMAND_REF_EDEFAULT);
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
			case XtcePackage.META_COMMAND_STEP_TYPE__ARGUMENT_LIST:
				return argumentList != null;
			case XtcePackage.META_COMMAND_STEP_TYPE__META_COMMAND_REF:
				return META_COMMAND_REF_EDEFAULT == null ? metaCommandRef != null : !META_COMMAND_REF_EDEFAULT.equals(metaCommandRef);
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
		result.append(" (metaCommandRef: ");
		result.append(metaCommandRef);
		result.append(')');
		return result.toString();
	}

} //MetaCommandStepTypeImpl
