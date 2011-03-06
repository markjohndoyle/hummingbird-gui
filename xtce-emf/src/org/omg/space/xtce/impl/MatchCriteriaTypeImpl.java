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

import org.omg.space.xtce.BooleanExpressionType;
import org.omg.space.xtce.ComparisonListType1;
import org.omg.space.xtce.ComparisonType;
import org.omg.space.xtce.InputAlgorithmType;
import org.omg.space.xtce.MatchCriteriaType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match Criteria Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.MatchCriteriaTypeImpl#getComparison <em>Comparison</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MatchCriteriaTypeImpl#getComparisonList <em>Comparison List</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MatchCriteriaTypeImpl#getBooleanExpression <em>Boolean Expression</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MatchCriteriaTypeImpl#getCustomAlgorithm <em>Custom Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchCriteriaTypeImpl extends EObjectImpl implements MatchCriteriaType {
	/**
	 * The cached value of the '{@link #getComparison() <em>Comparison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison()
	 * @generated
	 * @ordered
	 */
	protected ComparisonType comparison;

	/**
	 * The cached value of the '{@link #getComparisonList() <em>Comparison List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonList()
	 * @generated
	 * @ordered
	 */
	protected ComparisonListType1 comparisonList;

	/**
	 * The cached value of the '{@link #getBooleanExpression() <em>Boolean Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanExpression()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpressionType booleanExpression;

	/**
	 * The cached value of the '{@link #getCustomAlgorithm() <em>Custom Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected InputAlgorithmType customAlgorithm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchCriteriaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getMatchCriteriaType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonType getComparison() {
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparison(ComparisonType newComparison, NotificationChain msgs) {
		ComparisonType oldComparison = comparison;
		comparison = newComparison;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON, oldComparison, newComparison);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparison(ComparisonType newComparison) {
		if (newComparison != comparison) {
			NotificationChain msgs = null;
			if (comparison != null)
				msgs = ((InternalEObject)comparison).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON, null, msgs);
			if (newComparison != null)
				msgs = ((InternalEObject)newComparison).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON, null, msgs);
			msgs = basicSetComparison(newComparison, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON, newComparison, newComparison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonListType1 getComparisonList() {
		return comparisonList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparisonList(ComparisonListType1 newComparisonList, NotificationChain msgs) {
		ComparisonListType1 oldComparisonList = comparisonList;
		comparisonList = newComparisonList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON_LIST, oldComparisonList, newComparisonList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonList(ComparisonListType1 newComparisonList) {
		if (newComparisonList != comparisonList) {
			NotificationChain msgs = null;
			if (comparisonList != null)
				msgs = ((InternalEObject)comparisonList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON_LIST, null, msgs);
			if (newComparisonList != null)
				msgs = ((InternalEObject)newComparisonList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON_LIST, null, msgs);
			msgs = basicSetComparisonList(newComparisonList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON_LIST, newComparisonList, newComparisonList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpressionType getBooleanExpression() {
		return booleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanExpression(BooleanExpressionType newBooleanExpression, NotificationChain msgs) {
		BooleanExpressionType oldBooleanExpression = booleanExpression;
		booleanExpression = newBooleanExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.MATCH_CRITERIA_TYPE__BOOLEAN_EXPRESSION, oldBooleanExpression, newBooleanExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanExpression(BooleanExpressionType newBooleanExpression) {
		if (newBooleanExpression != booleanExpression) {
			NotificationChain msgs = null;
			if (booleanExpression != null)
				msgs = ((InternalEObject)booleanExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.MATCH_CRITERIA_TYPE__BOOLEAN_EXPRESSION, null, msgs);
			if (newBooleanExpression != null)
				msgs = ((InternalEObject)newBooleanExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.MATCH_CRITERIA_TYPE__BOOLEAN_EXPRESSION, null, msgs);
			msgs = basicSetBooleanExpression(newBooleanExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.MATCH_CRITERIA_TYPE__BOOLEAN_EXPRESSION, newBooleanExpression, newBooleanExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputAlgorithmType getCustomAlgorithm() {
		return customAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomAlgorithm(InputAlgorithmType newCustomAlgorithm, NotificationChain msgs) {
		InputAlgorithmType oldCustomAlgorithm = customAlgorithm;
		customAlgorithm = newCustomAlgorithm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.MATCH_CRITERIA_TYPE__CUSTOM_ALGORITHM, oldCustomAlgorithm, newCustomAlgorithm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomAlgorithm(InputAlgorithmType newCustomAlgorithm) {
		if (newCustomAlgorithm != customAlgorithm) {
			NotificationChain msgs = null;
			if (customAlgorithm != null)
				msgs = ((InternalEObject)customAlgorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.MATCH_CRITERIA_TYPE__CUSTOM_ALGORITHM, null, msgs);
			if (newCustomAlgorithm != null)
				msgs = ((InternalEObject)newCustomAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.MATCH_CRITERIA_TYPE__CUSTOM_ALGORITHM, null, msgs);
			msgs = basicSetCustomAlgorithm(newCustomAlgorithm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.MATCH_CRITERIA_TYPE__CUSTOM_ALGORITHM, newCustomAlgorithm, newCustomAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON:
				return basicSetComparison(null, msgs);
			case XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON_LIST:
				return basicSetComparisonList(null, msgs);
			case XtcePackage.MATCH_CRITERIA_TYPE__BOOLEAN_EXPRESSION:
				return basicSetBooleanExpression(null, msgs);
			case XtcePackage.MATCH_CRITERIA_TYPE__CUSTOM_ALGORITHM:
				return basicSetCustomAlgorithm(null, msgs);
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
			case XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON:
				return getComparison();
			case XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON_LIST:
				return getComparisonList();
			case XtcePackage.MATCH_CRITERIA_TYPE__BOOLEAN_EXPRESSION:
				return getBooleanExpression();
			case XtcePackage.MATCH_CRITERIA_TYPE__CUSTOM_ALGORITHM:
				return getCustomAlgorithm();
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
			case XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON:
				setComparison((ComparisonType)newValue);
				return;
			case XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON_LIST:
				setComparisonList((ComparisonListType1)newValue);
				return;
			case XtcePackage.MATCH_CRITERIA_TYPE__BOOLEAN_EXPRESSION:
				setBooleanExpression((BooleanExpressionType)newValue);
				return;
			case XtcePackage.MATCH_CRITERIA_TYPE__CUSTOM_ALGORITHM:
				setCustomAlgorithm((InputAlgorithmType)newValue);
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
			case XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON:
				setComparison((ComparisonType)null);
				return;
			case XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON_LIST:
				setComparisonList((ComparisonListType1)null);
				return;
			case XtcePackage.MATCH_CRITERIA_TYPE__BOOLEAN_EXPRESSION:
				setBooleanExpression((BooleanExpressionType)null);
				return;
			case XtcePackage.MATCH_CRITERIA_TYPE__CUSTOM_ALGORITHM:
				setCustomAlgorithm((InputAlgorithmType)null);
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
			case XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON:
				return comparison != null;
			case XtcePackage.MATCH_CRITERIA_TYPE__COMPARISON_LIST:
				return comparisonList != null;
			case XtcePackage.MATCH_CRITERIA_TYPE__BOOLEAN_EXPRESSION:
				return booleanExpression != null;
			case XtcePackage.MATCH_CRITERIA_TYPE__CUSTOM_ALGORITHM:
				return customAlgorithm != null;
		}
		return super.eIsSet(featureID);
	}

} //MatchCriteriaTypeImpl
