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

import org.omg.space.xtce.ANDedConditionsType;
import org.omg.space.xtce.BooleanExpressionType;
import org.omg.space.xtce.ComparisonCheckType;
import org.omg.space.xtce.ORedConditionsType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Expression Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.BooleanExpressionTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.BooleanExpressionTypeImpl#getANDedConditions <em>AN Ded Conditions</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.BooleanExpressionTypeImpl#getORedConditions <em>ORed Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanExpressionTypeImpl extends EObjectImpl implements BooleanExpressionType {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ComparisonCheckType condition;

	/**
	 * The cached value of the '{@link #getANDedConditions() <em>AN Ded Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANDedConditions()
	 * @generated
	 * @ordered
	 */
	protected ANDedConditionsType aNDedConditions;

	/**
	 * The cached value of the '{@link #getORedConditions() <em>ORed Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORedConditions()
	 * @generated
	 * @ordered
	 */
	protected ORedConditionsType oRedConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanExpressionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getBooleanExpressionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonCheckType getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(ComparisonCheckType newCondition, NotificationChain msgs) {
		ComparisonCheckType oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.BOOLEAN_EXPRESSION_TYPE__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(ComparisonCheckType newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BOOLEAN_EXPRESSION_TYPE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BOOLEAN_EXPRESSION_TYPE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BOOLEAN_EXPRESSION_TYPE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANDedConditionsType getANDedConditions() {
		return aNDedConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetANDedConditions(ANDedConditionsType newANDedConditions, NotificationChain msgs) {
		ANDedConditionsType oldANDedConditions = aNDedConditions;
		aNDedConditions = newANDedConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.BOOLEAN_EXPRESSION_TYPE__AN_DED_CONDITIONS, oldANDedConditions, newANDedConditions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANDedConditions(ANDedConditionsType newANDedConditions) {
		if (newANDedConditions != aNDedConditions) {
			NotificationChain msgs = null;
			if (aNDedConditions != null)
				msgs = ((InternalEObject)aNDedConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BOOLEAN_EXPRESSION_TYPE__AN_DED_CONDITIONS, null, msgs);
			if (newANDedConditions != null)
				msgs = ((InternalEObject)newANDedConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BOOLEAN_EXPRESSION_TYPE__AN_DED_CONDITIONS, null, msgs);
			msgs = basicSetANDedConditions(newANDedConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BOOLEAN_EXPRESSION_TYPE__AN_DED_CONDITIONS, newANDedConditions, newANDedConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORedConditionsType getORedConditions() {
		return oRedConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORedConditions(ORedConditionsType newORedConditions, NotificationChain msgs) {
		ORedConditionsType oldORedConditions = oRedConditions;
		oRedConditions = newORedConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.BOOLEAN_EXPRESSION_TYPE__ORED_CONDITIONS, oldORedConditions, newORedConditions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORedConditions(ORedConditionsType newORedConditions) {
		if (newORedConditions != oRedConditions) {
			NotificationChain msgs = null;
			if (oRedConditions != null)
				msgs = ((InternalEObject)oRedConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BOOLEAN_EXPRESSION_TYPE__ORED_CONDITIONS, null, msgs);
			if (newORedConditions != null)
				msgs = ((InternalEObject)newORedConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.BOOLEAN_EXPRESSION_TYPE__ORED_CONDITIONS, null, msgs);
			msgs = basicSetORedConditions(newORedConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.BOOLEAN_EXPRESSION_TYPE__ORED_CONDITIONS, newORedConditions, newORedConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE__CONDITION:
				return basicSetCondition(null, msgs);
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE__AN_DED_CONDITIONS:
				return basicSetANDedConditions(null, msgs);
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE__ORED_CONDITIONS:
				return basicSetORedConditions(null, msgs);
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
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE__CONDITION:
				return getCondition();
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE__AN_DED_CONDITIONS:
				return getANDedConditions();
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE__ORED_CONDITIONS:
				return getORedConditions();
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
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE__CONDITION:
				setCondition((ComparisonCheckType)newValue);
				return;
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE__AN_DED_CONDITIONS:
				setANDedConditions((ANDedConditionsType)newValue);
				return;
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE__ORED_CONDITIONS:
				setORedConditions((ORedConditionsType)newValue);
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
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE__CONDITION:
				setCondition((ComparisonCheckType)null);
				return;
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE__AN_DED_CONDITIONS:
				setANDedConditions((ANDedConditionsType)null);
				return;
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE__ORED_CONDITIONS:
				setORedConditions((ORedConditionsType)null);
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
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE__CONDITION:
				return condition != null;
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE__AN_DED_CONDITIONS:
				return aNDedConditions != null;
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE__ORED_CONDITIONS:
				return oRedConditions != null;
		}
		return super.eIsSet(featureID);
	}

} //BooleanExpressionTypeImpl
