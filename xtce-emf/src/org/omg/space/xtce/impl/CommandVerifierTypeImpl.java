/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.BooleanExpressionType;
import org.omg.space.xtce.CommandVerifierType;
import org.omg.space.xtce.ComparisonListType;
import org.omg.space.xtce.ComparisonType;
import org.omg.space.xtce.ContainerRefType;
import org.omg.space.xtce.InputAlgorithmType;
import org.omg.space.xtce.ParameterValueChangeType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Verifier Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.CommandVerifierTypeImpl#getComparison <em>Comparison</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandVerifierTypeImpl#getComparisonList <em>Comparison List</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandVerifierTypeImpl#getBooleanExpression <em>Boolean Expression</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandVerifierTypeImpl#getContainerRef <em>Container Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandVerifierTypeImpl#getParameterValueChange <em>Parameter Value Change</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandVerifierTypeImpl#getCustomAlgorithm <em>Custom Algorithm</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandVerifierTypeImpl#getTimeToWait <em>Time To Wait</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandVerifierTypeImpl extends EObjectImpl implements CommandVerifierType {
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
	protected ComparisonListType comparisonList;

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
	 * The cached value of the '{@link #getContainerRef() <em>Container Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerRef()
	 * @generated
	 * @ordered
	 */
	protected ContainerRefType containerRef;

	/**
	 * The cached value of the '{@link #getParameterValueChange() <em>Parameter Value Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValueChange()
	 * @generated
	 * @ordered
	 */
	protected ParameterValueChangeType parameterValueChange;

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
	 * The default value of the '{@link #getTimeToWait() <em>Time To Wait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToWait()
	 * @generated
	 * @ordered
	 */
	protected static final Duration TIME_TO_WAIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeToWait() <em>Time To Wait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToWait()
	 * @generated
	 * @ordered
	 */
	protected Duration timeToWait = TIME_TO_WAIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandVerifierTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getCommandVerifierType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON, oldComparison, newComparison);
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
				msgs = ((InternalEObject)comparison).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON, null, msgs);
			if (newComparison != null)
				msgs = ((InternalEObject)newComparison).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON, null, msgs);
			msgs = basicSetComparison(newComparison, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON, newComparison, newComparison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonListType getComparisonList() {
		return comparisonList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparisonList(ComparisonListType newComparisonList, NotificationChain msgs) {
		ComparisonListType oldComparisonList = comparisonList;
		comparisonList = newComparisonList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON_LIST, oldComparisonList, newComparisonList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonList(ComparisonListType newComparisonList) {
		if (newComparisonList != comparisonList) {
			NotificationChain msgs = null;
			if (comparisonList != null)
				msgs = ((InternalEObject)comparisonList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON_LIST, null, msgs);
			if (newComparisonList != null)
				msgs = ((InternalEObject)newComparisonList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON_LIST, null, msgs);
			msgs = basicSetComparisonList(newComparisonList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON_LIST, newComparisonList, newComparisonList));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_VERIFIER_TYPE__BOOLEAN_EXPRESSION, oldBooleanExpression, newBooleanExpression);
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
				msgs = ((InternalEObject)booleanExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_VERIFIER_TYPE__BOOLEAN_EXPRESSION, null, msgs);
			if (newBooleanExpression != null)
				msgs = ((InternalEObject)newBooleanExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_VERIFIER_TYPE__BOOLEAN_EXPRESSION, null, msgs);
			msgs = basicSetBooleanExpression(newBooleanExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_VERIFIER_TYPE__BOOLEAN_EXPRESSION, newBooleanExpression, newBooleanExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerRefType getContainerRef() {
		return containerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerRef(ContainerRefType newContainerRef, NotificationChain msgs) {
		ContainerRefType oldContainerRef = containerRef;
		containerRef = newContainerRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_VERIFIER_TYPE__CONTAINER_REF, oldContainerRef, newContainerRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerRef(ContainerRefType newContainerRef) {
		if (newContainerRef != containerRef) {
			NotificationChain msgs = null;
			if (containerRef != null)
				msgs = ((InternalEObject)containerRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_VERIFIER_TYPE__CONTAINER_REF, null, msgs);
			if (newContainerRef != null)
				msgs = ((InternalEObject)newContainerRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_VERIFIER_TYPE__CONTAINER_REF, null, msgs);
			msgs = basicSetContainerRef(newContainerRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_VERIFIER_TYPE__CONTAINER_REF, newContainerRef, newContainerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValueChangeType getParameterValueChange() {
		return parameterValueChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterValueChange(ParameterValueChangeType newParameterValueChange, NotificationChain msgs) {
		ParameterValueChangeType oldParameterValueChange = parameterValueChange;
		parameterValueChange = newParameterValueChange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE, oldParameterValueChange, newParameterValueChange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterValueChange(ParameterValueChangeType newParameterValueChange) {
		if (newParameterValueChange != parameterValueChange) {
			NotificationChain msgs = null;
			if (parameterValueChange != null)
				msgs = ((InternalEObject)parameterValueChange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE, null, msgs);
			if (newParameterValueChange != null)
				msgs = ((InternalEObject)newParameterValueChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE, null, msgs);
			msgs = basicSetParameterValueChange(newParameterValueChange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE, newParameterValueChange, newParameterValueChange));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_VERIFIER_TYPE__CUSTOM_ALGORITHM, oldCustomAlgorithm, newCustomAlgorithm);
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
				msgs = ((InternalEObject)customAlgorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_VERIFIER_TYPE__CUSTOM_ALGORITHM, null, msgs);
			if (newCustomAlgorithm != null)
				msgs = ((InternalEObject)newCustomAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_VERIFIER_TYPE__CUSTOM_ALGORITHM, null, msgs);
			msgs = basicSetCustomAlgorithm(newCustomAlgorithm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_VERIFIER_TYPE__CUSTOM_ALGORITHM, newCustomAlgorithm, newCustomAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getTimeToWait() {
		return timeToWait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeToWait(Duration newTimeToWait) {
		Duration oldTimeToWait = timeToWait;
		timeToWait = newTimeToWait;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_VERIFIER_TYPE__TIME_TO_WAIT, oldTimeToWait, timeToWait));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON:
				return basicSetComparison(null, msgs);
			case XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON_LIST:
				return basicSetComparisonList(null, msgs);
			case XtcePackage.COMMAND_VERIFIER_TYPE__BOOLEAN_EXPRESSION:
				return basicSetBooleanExpression(null, msgs);
			case XtcePackage.COMMAND_VERIFIER_TYPE__CONTAINER_REF:
				return basicSetContainerRef(null, msgs);
			case XtcePackage.COMMAND_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE:
				return basicSetParameterValueChange(null, msgs);
			case XtcePackage.COMMAND_VERIFIER_TYPE__CUSTOM_ALGORITHM:
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
			case XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON:
				return getComparison();
			case XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON_LIST:
				return getComparisonList();
			case XtcePackage.COMMAND_VERIFIER_TYPE__BOOLEAN_EXPRESSION:
				return getBooleanExpression();
			case XtcePackage.COMMAND_VERIFIER_TYPE__CONTAINER_REF:
				return getContainerRef();
			case XtcePackage.COMMAND_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE:
				return getParameterValueChange();
			case XtcePackage.COMMAND_VERIFIER_TYPE__CUSTOM_ALGORITHM:
				return getCustomAlgorithm();
			case XtcePackage.COMMAND_VERIFIER_TYPE__TIME_TO_WAIT:
				return getTimeToWait();
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
			case XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON:
				setComparison((ComparisonType)newValue);
				return;
			case XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON_LIST:
				setComparisonList((ComparisonListType)newValue);
				return;
			case XtcePackage.COMMAND_VERIFIER_TYPE__BOOLEAN_EXPRESSION:
				setBooleanExpression((BooleanExpressionType)newValue);
				return;
			case XtcePackage.COMMAND_VERIFIER_TYPE__CONTAINER_REF:
				setContainerRef((ContainerRefType)newValue);
				return;
			case XtcePackage.COMMAND_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE:
				setParameterValueChange((ParameterValueChangeType)newValue);
				return;
			case XtcePackage.COMMAND_VERIFIER_TYPE__CUSTOM_ALGORITHM:
				setCustomAlgorithm((InputAlgorithmType)newValue);
				return;
			case XtcePackage.COMMAND_VERIFIER_TYPE__TIME_TO_WAIT:
				setTimeToWait((Duration)newValue);
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
			case XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON:
				setComparison((ComparisonType)null);
				return;
			case XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON_LIST:
				setComparisonList((ComparisonListType)null);
				return;
			case XtcePackage.COMMAND_VERIFIER_TYPE__BOOLEAN_EXPRESSION:
				setBooleanExpression((BooleanExpressionType)null);
				return;
			case XtcePackage.COMMAND_VERIFIER_TYPE__CONTAINER_REF:
				setContainerRef((ContainerRefType)null);
				return;
			case XtcePackage.COMMAND_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE:
				setParameterValueChange((ParameterValueChangeType)null);
				return;
			case XtcePackage.COMMAND_VERIFIER_TYPE__CUSTOM_ALGORITHM:
				setCustomAlgorithm((InputAlgorithmType)null);
				return;
			case XtcePackage.COMMAND_VERIFIER_TYPE__TIME_TO_WAIT:
				setTimeToWait(TIME_TO_WAIT_EDEFAULT);
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
			case XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON:
				return comparison != null;
			case XtcePackage.COMMAND_VERIFIER_TYPE__COMPARISON_LIST:
				return comparisonList != null;
			case XtcePackage.COMMAND_VERIFIER_TYPE__BOOLEAN_EXPRESSION:
				return booleanExpression != null;
			case XtcePackage.COMMAND_VERIFIER_TYPE__CONTAINER_REF:
				return containerRef != null;
			case XtcePackage.COMMAND_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE:
				return parameterValueChange != null;
			case XtcePackage.COMMAND_VERIFIER_TYPE__CUSTOM_ALGORITHM:
				return customAlgorithm != null;
			case XtcePackage.COMMAND_VERIFIER_TYPE__TIME_TO_WAIT:
				return TIME_TO_WAIT_EDEFAULT == null ? timeToWait != null : !TIME_TO_WAIT_EDEFAULT.equals(timeToWait);
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
		result.append(" (timeToWait: ");
		result.append(timeToWait);
		result.append(')');
		return result.toString();
	}

} //CommandVerifierTypeImpl
