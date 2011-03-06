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

import org.omg.space.xtce.ArgumentAssignmentListType;
import org.omg.space.xtce.BaseMetaCommandType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Meta Command Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.BaseMetaCommandTypeImpl#getArgumentAssignmentList <em>Argument Assignment List</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.BaseMetaCommandTypeImpl#getMetaCommandRef <em>Meta Command Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseMetaCommandTypeImpl extends EObjectImpl implements BaseMetaCommandType {
	/**
	 * The cached value of the '{@link #getArgumentAssignmentList() <em>Argument Assignment List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentAssignmentList()
	 * @generated
	 * @ordered
	 */
	protected ArgumentAssignmentListType argumentAssignmentList;

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
	protected BaseMetaCommandTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getBaseMetaCommandType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentAssignmentListType getArgumentAssignmentList() {
		return argumentAssignmentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgumentAssignmentList(ArgumentAssignmentListType newArgumentAssignmentList, NotificationChain msgs) {
		ArgumentAssignmentListType oldArgumentAssignmentList = argumentAssignmentList;
		argumentAssignmentList = newArgumentAssignmentList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_META_COMMAND_TYPE__ARGUMENT_ASSIGNMENT_LIST, oldArgumentAssignmentList, newArgumentAssignmentList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentAssignmentList(ArgumentAssignmentListType newArgumentAssignmentList) {
		if (newArgumentAssignmentList != argumentAssignmentList) {
			NotificationChain msgs = null;
			if (argumentAssignmentList != null)
				msgs = ((InternalEObject)argumentAssignmentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_META_COMMAND_TYPE__ARGUMENT_ASSIGNMENT_LIST, null, msgs);
			if (newArgumentAssignmentList != null)
				msgs = ((InternalEObject)newArgumentAssignmentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BASE_META_COMMAND_TYPE__ARGUMENT_ASSIGNMENT_LIST, null, msgs);
			msgs = basicSetArgumentAssignmentList(newArgumentAssignmentList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_META_COMMAND_TYPE__ARGUMENT_ASSIGNMENT_LIST, newArgumentAssignmentList, newArgumentAssignmentList));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BASE_META_COMMAND_TYPE__META_COMMAND_REF, oldMetaCommandRef, metaCommandRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.BASE_META_COMMAND_TYPE__ARGUMENT_ASSIGNMENT_LIST:
				return basicSetArgumentAssignmentList(null, msgs);
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
			case XtcePackage.BASE_META_COMMAND_TYPE__ARGUMENT_ASSIGNMENT_LIST:
				return getArgumentAssignmentList();
			case XtcePackage.BASE_META_COMMAND_TYPE__META_COMMAND_REF:
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
			case XtcePackage.BASE_META_COMMAND_TYPE__ARGUMENT_ASSIGNMENT_LIST:
				setArgumentAssignmentList((ArgumentAssignmentListType)newValue);
				return;
			case XtcePackage.BASE_META_COMMAND_TYPE__META_COMMAND_REF:
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
			case XtcePackage.BASE_META_COMMAND_TYPE__ARGUMENT_ASSIGNMENT_LIST:
				setArgumentAssignmentList((ArgumentAssignmentListType)null);
				return;
			case XtcePackage.BASE_META_COMMAND_TYPE__META_COMMAND_REF:
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
			case XtcePackage.BASE_META_COMMAND_TYPE__ARGUMENT_ASSIGNMENT_LIST:
				return argumentAssignmentList != null;
			case XtcePackage.BASE_META_COMMAND_TYPE__META_COMMAND_REF:
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

} //BaseMetaCommandTypeImpl
