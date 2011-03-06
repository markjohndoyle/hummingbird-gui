/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.space.xtce.ComparisonOperatorsType;
import org.omg.space.xtce.ComparisonType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ComparisonTypeImpl#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ComparisonTypeImpl#getValue1 <em>Value1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparisonTypeImpl extends ParameterInstanceRefType1Impl implements ComparisonType {
	/**
	 * The default value of the '{@link #getComparisonOperator() <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperatorsType COMPARISON_OPERATOR_EDEFAULT = ComparisonOperatorsType._;

	/**
	 * The cached value of the '{@link #getComparisonOperator() <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperatorsType comparisonOperator = COMPARISON_OPERATOR_EDEFAULT;

	/**
	 * This is true if the Comparison Operator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean comparisonOperatorESet;

	/**
	 * The default value of the '{@link #getValue1() <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue1() <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
	protected String value1 = VALUE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getComparisonType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperatorsType getComparisonOperator() {
		return comparisonOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonOperator(ComparisonOperatorsType newComparisonOperator) {
		ComparisonOperatorsType oldComparisonOperator = comparisonOperator;
		comparisonOperator = newComparisonOperator == null ? COMPARISON_OPERATOR_EDEFAULT : newComparisonOperator;
		boolean oldComparisonOperatorESet = comparisonOperatorESet;
		comparisonOperatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMPARISON_TYPE__COMPARISON_OPERATOR, oldComparisonOperator, comparisonOperator, !oldComparisonOperatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetComparisonOperator() {
		ComparisonOperatorsType oldComparisonOperator = comparisonOperator;
		boolean oldComparisonOperatorESet = comparisonOperatorESet;
		comparisonOperator = COMPARISON_OPERATOR_EDEFAULT;
		comparisonOperatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.COMPARISON_TYPE__COMPARISON_OPERATOR, oldComparisonOperator, COMPARISON_OPERATOR_EDEFAULT, oldComparisonOperatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetComparisonOperator() {
		return comparisonOperatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue1() {
		return value1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue1(String newValue1) {
		String oldValue1 = value1;
		value1 = newValue1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMPARISON_TYPE__VALUE1, oldValue1, value1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.COMPARISON_TYPE__COMPARISON_OPERATOR:
				return getComparisonOperator();
			case XtcePackage.COMPARISON_TYPE__VALUE1:
				return getValue1();
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
			case XtcePackage.COMPARISON_TYPE__COMPARISON_OPERATOR:
				setComparisonOperator((ComparisonOperatorsType)newValue);
				return;
			case XtcePackage.COMPARISON_TYPE__VALUE1:
				setValue1((String)newValue);
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
			case XtcePackage.COMPARISON_TYPE__COMPARISON_OPERATOR:
				unsetComparisonOperator();
				return;
			case XtcePackage.COMPARISON_TYPE__VALUE1:
				setValue1(VALUE1_EDEFAULT);
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
			case XtcePackage.COMPARISON_TYPE__COMPARISON_OPERATOR:
				return isSetComparisonOperator();
			case XtcePackage.COMPARISON_TYPE__VALUE1:
				return VALUE1_EDEFAULT == null ? value1 != null : !VALUE1_EDEFAULT.equals(value1);
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
		result.append(" (comparisonOperator: ");
		if (comparisonOperatorESet) result.append(comparisonOperator); else result.append("<unset>");
		result.append(", value1: ");
		result.append(value1);
		result.append(')');
		return result.toString();
	}

} //ComparisonTypeImpl
