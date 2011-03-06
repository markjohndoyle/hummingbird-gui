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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.ConsequenceLevelType;
import org.omg.space.xtce.SignificanceType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Significance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.SignificanceTypeImpl#getConsequenceLevel <em>Consequence Level</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SignificanceTypeImpl#getReasonForWarning <em>Reason For Warning</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.SignificanceTypeImpl#getSpaceSystemAtRisk <em>Space System At Risk</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignificanceTypeImpl extends EObjectImpl implements SignificanceType {
	/**
	 * The default value of the '{@link #getConsequenceLevel() <em>Consequence Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequenceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final ConsequenceLevelType CONSEQUENCE_LEVEL_EDEFAULT = ConsequenceLevelType.NONE;

	/**
	 * The cached value of the '{@link #getConsequenceLevel() <em>Consequence Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequenceLevel()
	 * @generated
	 * @ordered
	 */
	protected ConsequenceLevelType consequenceLevel = CONSEQUENCE_LEVEL_EDEFAULT;

	/**
	 * This is true if the Consequence Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean consequenceLevelESet;

	/**
	 * The default value of the '{@link #getReasonForWarning() <em>Reason For Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForWarning()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_FOR_WARNING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReasonForWarning() <em>Reason For Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForWarning()
	 * @generated
	 * @ordered
	 */
	protected String reasonForWarning = REASON_FOR_WARNING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpaceSystemAtRisk() <em>Space System At Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceSystemAtRisk()
	 * @generated
	 * @ordered
	 */
	protected static final String SPACE_SYSTEM_AT_RISK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpaceSystemAtRisk() <em>Space System At Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceSystemAtRisk()
	 * @generated
	 * @ordered
	 */
	protected String spaceSystemAtRisk = SPACE_SYSTEM_AT_RISK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignificanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getSignificanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsequenceLevelType getConsequenceLevel() {
		return consequenceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsequenceLevel(ConsequenceLevelType newConsequenceLevel) {
		ConsequenceLevelType oldConsequenceLevel = consequenceLevel;
		consequenceLevel = newConsequenceLevel == null ? CONSEQUENCE_LEVEL_EDEFAULT : newConsequenceLevel;
		boolean oldConsequenceLevelESet = consequenceLevelESet;
		consequenceLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SIGNIFICANCE_TYPE__CONSEQUENCE_LEVEL, oldConsequenceLevel, consequenceLevel, !oldConsequenceLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConsequenceLevel() {
		ConsequenceLevelType oldConsequenceLevel = consequenceLevel;
		boolean oldConsequenceLevelESet = consequenceLevelESet;
		consequenceLevel = CONSEQUENCE_LEVEL_EDEFAULT;
		consequenceLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.SIGNIFICANCE_TYPE__CONSEQUENCE_LEVEL, oldConsequenceLevel, CONSEQUENCE_LEVEL_EDEFAULT, oldConsequenceLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConsequenceLevel() {
		return consequenceLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReasonForWarning() {
		return reasonForWarning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonForWarning(String newReasonForWarning) {
		String oldReasonForWarning = reasonForWarning;
		reasonForWarning = newReasonForWarning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SIGNIFICANCE_TYPE__REASON_FOR_WARNING, oldReasonForWarning, reasonForWarning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpaceSystemAtRisk() {
		return spaceSystemAtRisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpaceSystemAtRisk(String newSpaceSystemAtRisk) {
		String oldSpaceSystemAtRisk = spaceSystemAtRisk;
		spaceSystemAtRisk = newSpaceSystemAtRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.SIGNIFICANCE_TYPE__SPACE_SYSTEM_AT_RISK, oldSpaceSystemAtRisk, spaceSystemAtRisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.SIGNIFICANCE_TYPE__CONSEQUENCE_LEVEL:
				return getConsequenceLevel();
			case XtcePackage.SIGNIFICANCE_TYPE__REASON_FOR_WARNING:
				return getReasonForWarning();
			case XtcePackage.SIGNIFICANCE_TYPE__SPACE_SYSTEM_AT_RISK:
				return getSpaceSystemAtRisk();
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
			case XtcePackage.SIGNIFICANCE_TYPE__CONSEQUENCE_LEVEL:
				setConsequenceLevel((ConsequenceLevelType)newValue);
				return;
			case XtcePackage.SIGNIFICANCE_TYPE__REASON_FOR_WARNING:
				setReasonForWarning((String)newValue);
				return;
			case XtcePackage.SIGNIFICANCE_TYPE__SPACE_SYSTEM_AT_RISK:
				setSpaceSystemAtRisk((String)newValue);
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
			case XtcePackage.SIGNIFICANCE_TYPE__CONSEQUENCE_LEVEL:
				unsetConsequenceLevel();
				return;
			case XtcePackage.SIGNIFICANCE_TYPE__REASON_FOR_WARNING:
				setReasonForWarning(REASON_FOR_WARNING_EDEFAULT);
				return;
			case XtcePackage.SIGNIFICANCE_TYPE__SPACE_SYSTEM_AT_RISK:
				setSpaceSystemAtRisk(SPACE_SYSTEM_AT_RISK_EDEFAULT);
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
			case XtcePackage.SIGNIFICANCE_TYPE__CONSEQUENCE_LEVEL:
				return isSetConsequenceLevel();
			case XtcePackage.SIGNIFICANCE_TYPE__REASON_FOR_WARNING:
				return REASON_FOR_WARNING_EDEFAULT == null ? reasonForWarning != null : !REASON_FOR_WARNING_EDEFAULT.equals(reasonForWarning);
			case XtcePackage.SIGNIFICANCE_TYPE__SPACE_SYSTEM_AT_RISK:
				return SPACE_SYSTEM_AT_RISK_EDEFAULT == null ? spaceSystemAtRisk != null : !SPACE_SYSTEM_AT_RISK_EDEFAULT.equals(spaceSystemAtRisk);
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
		result.append(" (consequenceLevel: ");
		if (consequenceLevelESet) result.append(consequenceLevel); else result.append("<unset>");
		result.append(", reasonForWarning: ");
		result.append(reasonForWarning);
		result.append(", spaceSystemAtRisk: ");
		result.append(spaceSystemAtRisk);
		result.append(')');
		return result.toString();
	}

} //SignificanceTypeImpl
