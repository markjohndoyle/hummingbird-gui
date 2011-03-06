/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Telemetry parameter instances are oftentimes "time-tagged" with a timing signal either provided on the ground or on  the space system.  This data element allows one to specify which of possibly many AbsoluteTimeParameters to use to "time-tag" parameter instances with.  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.TimeAssociationType#isInterpolateTime <em>Interpolate Time</em>}</li>
 *   <li>{@link org.omg.space.xtce.TimeAssociationType#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getTimeAssociationType()
 * @model extendedMetaData="name='TimeAssociationType' kind='simple'"
 * @generated
 */
public interface TimeAssociationType extends ParameterInstanceRefType1 {
	/**
	 * Returns the value of the '<em><b>Interpolate Time</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, then the current value of the AbsoluteTime will be projected to current time.  I.E., if the value of the AbsoluteTime parameter was set 10 seconds ago, then 10 seconds will be added to it's value before associating this time with the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpolate Time</em>' attribute.
	 * @see #isSetInterpolateTime()
	 * @see #unsetInterpolateTime()
	 * @see #setInterpolateTime(boolean)
	 * @see org.omg.space.xtce.XtcePackage#getTimeAssociationType_InterpolateTime()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='interpolateTime'"
	 * @generated
	 */
	boolean isInterpolateTime();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.TimeAssociationType#isInterpolateTime <em>Interpolate Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolate Time</em>' attribute.
	 * @see #isSetInterpolateTime()
	 * @see #unsetInterpolateTime()
	 * @see #isInterpolateTime()
	 * @generated
	 */
	void setInterpolateTime(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.TimeAssociationType#isInterpolateTime <em>Interpolate Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterpolateTime()
	 * @see #isInterpolateTime()
	 * @see #setInterpolateTime(boolean)
	 * @generated
	 */
	void unsetInterpolateTime();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.TimeAssociationType#isInterpolateTime <em>Interpolate Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interpolate Time</em>' attribute is set.
	 * @see #unsetInterpolateTime()
	 * @see #isInterpolateTime()
	 * @see #setInterpolateTime(boolean)
	 * @generated
	 */
	boolean isSetInterpolateTime();

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The offset is used to supply a relative time offset from the time association and to this parameter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(XMLGregorianCalendar)
	 * @see org.omg.space.xtce.XtcePackage#getTimeAssociationType_Offset()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='offset'"
	 * @generated
	 */
	XMLGregorianCalendar getOffset();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.TimeAssociationType#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(XMLGregorianCalendar value);

} // TimeAssociationType
