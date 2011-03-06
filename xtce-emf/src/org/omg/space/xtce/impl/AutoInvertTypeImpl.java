/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.AutoInvertType;
import org.omg.space.xtce.InputAlgorithmType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Invert Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.AutoInvertTypeImpl#getInvertAlgorithm <em>Invert Algorithm</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.AutoInvertTypeImpl#getBadFramesToAutoInvert <em>Bad Frames To Auto Invert</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutoInvertTypeImpl extends EObjectImpl implements AutoInvertType {
	/**
	 * The cached value of the '{@link #getInvertAlgorithm() <em>Invert Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvertAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected InputAlgorithmType invertAlgorithm;

	/**
	 * The default value of the '{@link #getBadFramesToAutoInvert() <em>Bad Frames To Auto Invert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadFramesToAutoInvert()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BAD_FRAMES_TO_AUTO_INVERT_EDEFAULT = new BigInteger("1024");

	/**
	 * The cached value of the '{@link #getBadFramesToAutoInvert() <em>Bad Frames To Auto Invert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadFramesToAutoInvert()
	 * @generated
	 * @ordered
	 */
	protected BigInteger badFramesToAutoInvert = BAD_FRAMES_TO_AUTO_INVERT_EDEFAULT;

	/**
	 * This is true if the Bad Frames To Auto Invert attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean badFramesToAutoInvertESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutoInvertTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getAutoInvertType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputAlgorithmType getInvertAlgorithm() {
		return invertAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvertAlgorithm(InputAlgorithmType newInvertAlgorithm, NotificationChain msgs) {
		InputAlgorithmType oldInvertAlgorithm = invertAlgorithm;
		invertAlgorithm = newInvertAlgorithm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.AUTO_INVERT_TYPE__INVERT_ALGORITHM, oldInvertAlgorithm, newInvertAlgorithm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvertAlgorithm(InputAlgorithmType newInvertAlgorithm) {
		if (newInvertAlgorithm != invertAlgorithm) {
			NotificationChain msgs = null;
			if (invertAlgorithm != null)
				msgs = ((InternalEObject)invertAlgorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.AUTO_INVERT_TYPE__INVERT_ALGORITHM, null, msgs);
			if (newInvertAlgorithm != null)
				msgs = ((InternalEObject)newInvertAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.AUTO_INVERT_TYPE__INVERT_ALGORITHM, null, msgs);
			msgs = basicSetInvertAlgorithm(newInvertAlgorithm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.AUTO_INVERT_TYPE__INVERT_ALGORITHM, newInvertAlgorithm, newInvertAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBadFramesToAutoInvert() {
		return badFramesToAutoInvert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBadFramesToAutoInvert(BigInteger newBadFramesToAutoInvert) {
		BigInteger oldBadFramesToAutoInvert = badFramesToAutoInvert;
		badFramesToAutoInvert = newBadFramesToAutoInvert;
		boolean oldBadFramesToAutoInvertESet = badFramesToAutoInvertESet;
		badFramesToAutoInvertESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.AUTO_INVERT_TYPE__BAD_FRAMES_TO_AUTO_INVERT, oldBadFramesToAutoInvert, badFramesToAutoInvert, !oldBadFramesToAutoInvertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBadFramesToAutoInvert() {
		BigInteger oldBadFramesToAutoInvert = badFramesToAutoInvert;
		boolean oldBadFramesToAutoInvertESet = badFramesToAutoInvertESet;
		badFramesToAutoInvert = BAD_FRAMES_TO_AUTO_INVERT_EDEFAULT;
		badFramesToAutoInvertESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.AUTO_INVERT_TYPE__BAD_FRAMES_TO_AUTO_INVERT, oldBadFramesToAutoInvert, BAD_FRAMES_TO_AUTO_INVERT_EDEFAULT, oldBadFramesToAutoInvertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBadFramesToAutoInvert() {
		return badFramesToAutoInvertESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.AUTO_INVERT_TYPE__INVERT_ALGORITHM:
				return basicSetInvertAlgorithm(null, msgs);
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
			case XtcePackage.AUTO_INVERT_TYPE__INVERT_ALGORITHM:
				return getInvertAlgorithm();
			case XtcePackage.AUTO_INVERT_TYPE__BAD_FRAMES_TO_AUTO_INVERT:
				return getBadFramesToAutoInvert();
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
			case XtcePackage.AUTO_INVERT_TYPE__INVERT_ALGORITHM:
				setInvertAlgorithm((InputAlgorithmType)newValue);
				return;
			case XtcePackage.AUTO_INVERT_TYPE__BAD_FRAMES_TO_AUTO_INVERT:
				setBadFramesToAutoInvert((BigInteger)newValue);
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
			case XtcePackage.AUTO_INVERT_TYPE__INVERT_ALGORITHM:
				setInvertAlgorithm((InputAlgorithmType)null);
				return;
			case XtcePackage.AUTO_INVERT_TYPE__BAD_FRAMES_TO_AUTO_INVERT:
				unsetBadFramesToAutoInvert();
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
			case XtcePackage.AUTO_INVERT_TYPE__INVERT_ALGORITHM:
				return invertAlgorithm != null;
			case XtcePackage.AUTO_INVERT_TYPE__BAD_FRAMES_TO_AUTO_INVERT:
				return isSetBadFramesToAutoInvert();
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
		result.append(" (badFramesToAutoInvert: ");
		if (badFramesToAutoInvertESet) result.append(badFramesToAutoInvert); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AutoInvertTypeImpl
