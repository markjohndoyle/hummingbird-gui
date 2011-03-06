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

import org.omg.space.xtce.MathAlgorithmType;
import org.omg.space.xtce.MathOperationType1;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Math Algorithm Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.MathAlgorithmTypeImpl#getMathOperation <em>Math Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MathAlgorithmTypeImpl extends NameDescriptionTypeImpl implements MathAlgorithmType {
	/**
	 * The cached value of the '{@link #getMathOperation() <em>Math Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMathOperation()
	 * @generated
	 * @ordered
	 */
	protected MathOperationType1 mathOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MathAlgorithmTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getMathAlgorithmType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathOperationType1 getMathOperation() {
		return mathOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMathOperation(MathOperationType1 newMathOperation, NotificationChain msgs) {
		MathOperationType1 oldMathOperation = mathOperation;
		mathOperation = newMathOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.MATH_ALGORITHM_TYPE__MATH_OPERATION, oldMathOperation, newMathOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMathOperation(MathOperationType1 newMathOperation) {
		if (newMathOperation != mathOperation) {
			NotificationChain msgs = null;
			if (mathOperation != null)
				msgs = ((InternalEObject)mathOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.MATH_ALGORITHM_TYPE__MATH_OPERATION, null, msgs);
			if (newMathOperation != null)
				msgs = ((InternalEObject)newMathOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.MATH_ALGORITHM_TYPE__MATH_OPERATION, null, msgs);
			msgs = basicSetMathOperation(newMathOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.MATH_ALGORITHM_TYPE__MATH_OPERATION, newMathOperation, newMathOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.MATH_ALGORITHM_TYPE__MATH_OPERATION:
				return basicSetMathOperation(null, msgs);
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
			case XtcePackage.MATH_ALGORITHM_TYPE__MATH_OPERATION:
				return getMathOperation();
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
			case XtcePackage.MATH_ALGORITHM_TYPE__MATH_OPERATION:
				setMathOperation((MathOperationType1)newValue);
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
			case XtcePackage.MATH_ALGORITHM_TYPE__MATH_OPERATION:
				setMathOperation((MathOperationType1)null);
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
			case XtcePackage.MATH_ALGORITHM_TYPE__MATH_OPERATION:
				return mathOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //MathAlgorithmTypeImpl
