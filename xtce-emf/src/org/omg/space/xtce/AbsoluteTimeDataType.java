/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absolute Time Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to contain an absolute time. Contains an absolute (to a known epoch) time.  Use the [ISO 8601] extended format CCYY-MM-DDThh:mm:ss where "CC" represents the century, "YY" the year, "MM" the month and "DD" the day, preceded by an optional leading "-" sign to indicate a negative number. If the sign is omitted, "+" is assumed. The letter "T" is the date/time separator and "hh", "mm", "ss" represent hour, minute and second respectively. Additional digits can be used to increase the precision of fractional seconds if desired i.e the format ss.ss... with any number of digits after the decimal point is supported. 
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.space.xtce.XtcePackage#getAbsoluteTimeDataType()
 * @model extendedMetaData="name='AbsoluteTimeDataType' kind='elementOnly'"
 * @generated
 */
public interface AbsoluteTimeDataType extends BaseTimeDataType {
} // AbsoluteTimeDataType
