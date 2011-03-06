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

import org.omg.space.xtce.ComparisonCheckType;
import org.omg.space.xtce.ComparisonOperatorsType;
import org.omg.space.xtce.ParameterInstanceRefType1;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Check Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.ComparisonCheckTypeImpl#getParameterInstanceRef <em>Parameter Instance Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ComparisonCheckTypeImpl#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ComparisonCheckTypeImpl#getParameterInstanceRef1 <em>Parameter Instance Ref1</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.ComparisonCheckTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparisonCheckTypeImpl extends EObjectImpl implements ComparisonCheckType {
	/**
	 * The cached value of the '{@link #getParameterInstanceRef() <em>Parameter Instance Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterInstanceRef()
	 * @generated
	 * @ordered
	 */
	protected ParameterInstanceRefType1 parameterInstanceRef;

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
	 * The cached value of the '{@link #getParameterInstanceRef1() <em>Parameter Instance Ref1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterInstanceRef1()
	 * @generated
	 * @ordered
	 */
	protected ParameterInstanceRefType1 parameterInstanceRef1;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonCheckTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getComparisonCheckType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterInstanceRefType1 getParameterInstanceRef() {
		return parameterInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterInstanceRef(ParameterInstanceRefType1 newParameterInstanceRef, NotificationChain msgs) {
		ParameterInstanceRefType1 oldParameterInstanceRef = parameterInstanceRef;
		parameterInstanceRef = newParameterInstanceRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF, oldParameterInstanceRef, newParameterInstanceRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterInstanceRef(ParameterInstanceRefType1 newParameterInstanceRef) {
		if (newParameterInstanceRef != parameterInstanceRef) {
			NotificationChain msgs = null;
			if (parameterInstanceRef != null)
				msgs = ((InternalEObject)parameterInstanceRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF, null, msgs);
			if (newParameterInstanceRef != null)
				msgs = ((InternalEObject)newParameterInstanceRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF, null, msgs);
			msgs = basicSetParameterInstanceRef(newParameterInstanceRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF, newParameterInstanceRef, newParameterInstanceRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMPARISON_CHECK_TYPE__COMPARISON_OPERATOR, oldComparisonOperator, comparisonOperator, !oldComparisonOperatorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.COMPARISON_CHECK_TYPE__COMPARISON_OPERATOR, oldComparisonOperator, COMPARISON_OPERATOR_EDEFAULT, oldComparisonOperatorESet));
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
	public ParameterInstanceRefType1 getParameterInstanceRef1() {
		return parameterInstanceRef1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterInstanceRef1(ParameterInstanceRefType1 newParameterInstanceRef1, NotificationChain msgs) {
		ParameterInstanceRefType1 oldParameterInstanceRef1 = parameterInstanceRef1;
		parameterInstanceRef1 = newParameterInstanceRef1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF1, oldParameterInstanceRef1, newParameterInstanceRef1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterInstanceRef1(ParameterInstanceRefType1 newParameterInstanceRef1) {
		if (newParameterInstanceRef1 != parameterInstanceRef1) {
			NotificationChain msgs = null;
			if (parameterInstanceRef1 != null)
				msgs = ((InternalEObject)parameterInstanceRef1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF1, null, msgs);
			if (newParameterInstanceRef1 != null)
				msgs = ((InternalEObject)newParameterInstanceRef1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF1, null, msgs);
			msgs = basicSetParameterInstanceRef1(newParameterInstanceRef1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF1, newParameterInstanceRef1, newParameterInstanceRef1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMPARISON_CHECK_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF:
				return basicSetParameterInstanceRef(null, msgs);
			case XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF1:
				return basicSetParameterInstanceRef1(null, msgs);
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
			case XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF:
				return getParameterInstanceRef();
			case XtcePackage.COMPARISON_CHECK_TYPE__COMPARISON_OPERATOR:
				return getComparisonOperator();
			case XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF1:
				return getParameterInstanceRef1();
			case XtcePackage.COMPARISON_CHECK_TYPE__VALUE:
				return getValue();
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
			case XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF:
				setParameterInstanceRef((ParameterInstanceRefType1)newValue);
				return;
			case XtcePackage.COMPARISON_CHECK_TYPE__COMPARISON_OPERATOR:
				setComparisonOperator((ComparisonOperatorsType)newValue);
				return;
			case XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF1:
				setParameterInstanceRef1((ParameterInstanceRefType1)newValue);
				return;
			case XtcePackage.COMPARISON_CHECK_TYPE__VALUE:
				setValue((String)newValue);
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
			case XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF:
				setParameterInstanceRef((ParameterInstanceRefType1)null);
				return;
			case XtcePackage.COMPARISON_CHECK_TYPE__COMPARISON_OPERATOR:
				unsetComparisonOperator();
				return;
			case XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF1:
				setParameterInstanceRef1((ParameterInstanceRefType1)null);
				return;
			case XtcePackage.COMPARISON_CHECK_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF:
				return parameterInstanceRef != null;
			case XtcePackage.COMPARISON_CHECK_TYPE__COMPARISON_OPERATOR:
				return isSetComparisonOperator();
			case XtcePackage.COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF1:
				return parameterInstanceRef1 != null;
			case XtcePackage.COMPARISON_CHECK_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ComparisonCheckTypeImpl
