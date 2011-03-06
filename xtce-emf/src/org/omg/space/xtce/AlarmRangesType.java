/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alarm Ranges Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains five ranges: Watch, Warning, Distress, Critical, and Severe each in increasing severity.  Normally, only the Warning and Critical ranges are used and the color yellow is associated with Warning and the color red is associated with Critical.   The ranges given are valid for numbers lower than the min and higher than the max values.   These ranges should not overlap, but if they do, assume the most severe range is to be applied.  All ranges are optional and it is quite allowed for there to be only one end of the range. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.AlarmRangesType#getWatchRange <em>Watch Range</em>}</li>
 *   <li>{@link org.omg.space.xtce.AlarmRangesType#getWarningRange <em>Warning Range</em>}</li>
 *   <li>{@link org.omg.space.xtce.AlarmRangesType#getDistressRange <em>Distress Range</em>}</li>
 *   <li>{@link org.omg.space.xtce.AlarmRangesType#getCriticalRange <em>Critical Range</em>}</li>
 *   <li>{@link org.omg.space.xtce.AlarmRangesType#getSevereRange <em>Severe Range</em>}</li>
 *   <li>{@link org.omg.space.xtce.AlarmRangesType#isAppliesToCalibratedValues <em>Applies To Calibrated Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getAlarmRangesType()
 * @model extendedMetaData="name='AlarmRangesType' kind='elementOnly'"
 * @generated
 */
public interface AlarmRangesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Watch Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Watch Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watch Range</em>' containment reference.
	 * @see #setWatchRange(DecimalRangeType)
	 * @see org.omg.space.xtce.XtcePackage#getAlarmRangesType_WatchRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WatchRange' namespace='##targetNamespace'"
	 * @generated
	 */
	DecimalRangeType getWatchRange();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.AlarmRangesType#getWatchRange <em>Watch Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watch Range</em>' containment reference.
	 * @see #getWatchRange()
	 * @generated
	 */
	void setWatchRange(DecimalRangeType value);

	/**
	 * Returns the value of the '<em><b>Warning Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warning Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning Range</em>' containment reference.
	 * @see #setWarningRange(DecimalRangeType)
	 * @see org.omg.space.xtce.XtcePackage#getAlarmRangesType_WarningRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WarningRange' namespace='##targetNamespace'"
	 * @generated
	 */
	DecimalRangeType getWarningRange();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.AlarmRangesType#getWarningRange <em>Warning Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning Range</em>' containment reference.
	 * @see #getWarningRange()
	 * @generated
	 */
	void setWarningRange(DecimalRangeType value);

	/**
	 * Returns the value of the '<em><b>Distress Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distress Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distress Range</em>' containment reference.
	 * @see #setDistressRange(DecimalRangeType)
	 * @see org.omg.space.xtce.XtcePackage#getAlarmRangesType_DistressRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistressRange' namespace='##targetNamespace'"
	 * @generated
	 */
	DecimalRangeType getDistressRange();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.AlarmRangesType#getDistressRange <em>Distress Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distress Range</em>' containment reference.
	 * @see #getDistressRange()
	 * @generated
	 */
	void setDistressRange(DecimalRangeType value);

	/**
	 * Returns the value of the '<em><b>Critical Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critical Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical Range</em>' containment reference.
	 * @see #setCriticalRange(DecimalRangeType)
	 * @see org.omg.space.xtce.XtcePackage#getAlarmRangesType_CriticalRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CriticalRange' namespace='##targetNamespace'"
	 * @generated
	 */
	DecimalRangeType getCriticalRange();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.AlarmRangesType#getCriticalRange <em>Critical Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical Range</em>' containment reference.
	 * @see #getCriticalRange()
	 * @generated
	 */
	void setCriticalRange(DecimalRangeType value);

	/**
	 * Returns the value of the '<em><b>Severe Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severe Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severe Range</em>' containment reference.
	 * @see #setSevereRange(DecimalRangeType)
	 * @see org.omg.space.xtce.XtcePackage#getAlarmRangesType_SevereRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SevereRange' namespace='##targetNamespace'"
	 * @generated
	 */
	DecimalRangeType getSevereRange();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.AlarmRangesType#getSevereRange <em>Severe Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severe Range</em>' containment reference.
	 * @see #getSevereRange()
	 * @generated
	 */
	void setSevereRange(DecimalRangeType value);

	/**
	 * Returns the value of the '<em><b>Applies To Calibrated Values</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To Calibrated Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To Calibrated Values</em>' attribute.
	 * @see #isSetAppliesToCalibratedValues()
	 * @see #unsetAppliesToCalibratedValues()
	 * @see #setAppliesToCalibratedValues(boolean)
	 * @see org.omg.space.xtce.XtcePackage#getAlarmRangesType_AppliesToCalibratedValues()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='appliesToCalibratedValues'"
	 * @generated
	 */
	boolean isAppliesToCalibratedValues();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.AlarmRangesType#isAppliesToCalibratedValues <em>Applies To Calibrated Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To Calibrated Values</em>' attribute.
	 * @see #isSetAppliesToCalibratedValues()
	 * @see #unsetAppliesToCalibratedValues()
	 * @see #isAppliesToCalibratedValues()
	 * @generated
	 */
	void setAppliesToCalibratedValues(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.AlarmRangesType#isAppliesToCalibratedValues <em>Applies To Calibrated Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAppliesToCalibratedValues()
	 * @see #isAppliesToCalibratedValues()
	 * @see #setAppliesToCalibratedValues(boolean)
	 * @generated
	 */
	void unsetAppliesToCalibratedValues();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.AlarmRangesType#isAppliesToCalibratedValues <em>Applies To Calibrated Values</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Applies To Calibrated Values</em>' attribute is set.
	 * @see #unsetAppliesToCalibratedValues()
	 * @see #isAppliesToCalibratedValues()
	 * @see #setAppliesToCalibratedValues(boolean)
	 * @generated
	 */
	boolean isSetAppliesToCalibratedValues();

} // AlarmRangesType
