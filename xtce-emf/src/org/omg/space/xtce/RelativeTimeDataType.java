/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Time Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to contain a relative time value.  Used to describe a relative time.  Normally used for time offsets.  A Relative time is expressed as PnYn MnDTnH nMnS, where nY represents the number of years, nM the number of months, nD the number of days, 'T' is the date/time separator, nH the number of hours, nM the number of minutes and nS the number of seconds. The number of seconds can include decimal digits to arbitrary precision.  For example, to indicate a duration of 1 year, 2 months, 3 days, 10 hours, and 30 minutes, one would write: P1Y2M3DT10H30M. One could also indicate a duration of minus 120 days as: -P120D.  An extension of Schema duration type. 
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.space.xtce.XtcePackage#getRelativeTimeDataType()
 * @model extendedMetaData="name='RelativeTimeDataType' kind='elementOnly'"
 * @generated
 */
public interface RelativeTimeDataType extends BaseTimeDataType {
} // RelativeTimeDataType
