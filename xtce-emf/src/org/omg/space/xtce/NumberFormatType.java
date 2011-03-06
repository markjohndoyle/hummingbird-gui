/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Format Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.NumberFormatType#getMaximumFractionDigits <em>Maximum Fraction Digits</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumberFormatType#getMaximumIntegerDigits <em>Maximum Integer Digits</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumberFormatType#getMinimumFractionDigits <em>Minimum Fraction Digits</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumberFormatType#getMinimumIntegerDigits <em>Minimum Integer Digits</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumberFormatType#getNegativePrefix <em>Negative Prefix</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumberFormatType#getNegativeSuffix <em>Negative Suffix</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumberFormatType#getNotation <em>Notation</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumberFormatType#getNumberBase <em>Number Base</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumberFormatType#getPositivePrefix <em>Positive Prefix</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumberFormatType#getPositiveSuffix <em>Positive Suffix</em>}</li>
 *   <li>{@link org.omg.space.xtce.NumberFormatType#isShowThousandsGrouping <em>Show Thousands Grouping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getNumberFormatType()
 * @model extendedMetaData="name='NumberFormat_._type' kind='empty'"
 * @generated
 */
public interface NumberFormatType extends EObject {
	/**
	 * Returns the value of the '<em><b>Maximum Fraction Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Fraction Digits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Fraction Digits</em>' attribute.
	 * @see #setMaximumFractionDigits(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getNumberFormatType_MaximumFractionDigits()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='maximumFractionDigits'"
	 * @generated
	 */
	BigInteger getMaximumFractionDigits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumberFormatType#getMaximumFractionDigits <em>Maximum Fraction Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Fraction Digits</em>' attribute.
	 * @see #getMaximumFractionDigits()
	 * @generated
	 */
	void setMaximumFractionDigits(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Maximum Integer Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Integer Digits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Integer Digits</em>' attribute.
	 * @see #setMaximumIntegerDigits(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getNumberFormatType_MaximumIntegerDigits()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='maximumIntegerDigits'"
	 * @generated
	 */
	BigInteger getMaximumIntegerDigits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumberFormatType#getMaximumIntegerDigits <em>Maximum Integer Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Integer Digits</em>' attribute.
	 * @see #getMaximumIntegerDigits()
	 * @generated
	 */
	void setMaximumIntegerDigits(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Minimum Fraction Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Fraction Digits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Fraction Digits</em>' attribute.
	 * @see #setMinimumFractionDigits(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getNumberFormatType_MinimumFractionDigits()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='minimumFractionDigits'"
	 * @generated
	 */
	BigInteger getMinimumFractionDigits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumberFormatType#getMinimumFractionDigits <em>Minimum Fraction Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Fraction Digits</em>' attribute.
	 * @see #getMinimumFractionDigits()
	 * @generated
	 */
	void setMinimumFractionDigits(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Minimum Integer Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Integer Digits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Integer Digits</em>' attribute.
	 * @see #setMinimumIntegerDigits(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getNumberFormatType_MinimumIntegerDigits()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='minimumIntegerDigits'"
	 * @generated
	 */
	BigInteger getMinimumIntegerDigits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumberFormatType#getMinimumIntegerDigits <em>Minimum Integer Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Integer Digits</em>' attribute.
	 * @see #getMinimumIntegerDigits()
	 * @generated
	 */
	void setMinimumIntegerDigits(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Negative Prefix</b></em>' attribute.
	 * The default value is <code>"-"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative Prefix</em>' attribute.
	 * @see #isSetNegativePrefix()
	 * @see #unsetNegativePrefix()
	 * @see #setNegativePrefix(String)
	 * @see org.omg.space.xtce.XtcePackage#getNumberFormatType_NegativePrefix()
	 * @model default="-" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='negativePrefix'"
	 * @generated
	 */
	String getNegativePrefix();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumberFormatType#getNegativePrefix <em>Negative Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative Prefix</em>' attribute.
	 * @see #isSetNegativePrefix()
	 * @see #unsetNegativePrefix()
	 * @see #getNegativePrefix()
	 * @generated
	 */
	void setNegativePrefix(String value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.NumberFormatType#getNegativePrefix <em>Negative Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNegativePrefix()
	 * @see #getNegativePrefix()
	 * @see #setNegativePrefix(String)
	 * @generated
	 */
	void unsetNegativePrefix();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.NumberFormatType#getNegativePrefix <em>Negative Prefix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Negative Prefix</em>' attribute is set.
	 * @see #unsetNegativePrefix()
	 * @see #getNegativePrefix()
	 * @see #setNegativePrefix(String)
	 * @generated
	 */
	boolean isSetNegativePrefix();

	/**
	 * Returns the value of the '<em><b>Negative Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative Suffix</em>' attribute.
	 * @see #setNegativeSuffix(String)
	 * @see org.omg.space.xtce.XtcePackage#getNumberFormatType_NegativeSuffix()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='negativeSuffix'"
	 * @generated
	 */
	String getNegativeSuffix();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumberFormatType#getNegativeSuffix <em>Negative Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative Suffix</em>' attribute.
	 * @see #getNegativeSuffix()
	 * @generated
	 */
	void setNegativeSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Notation</b></em>' attribute.
	 * The default value is <code>"normal"</code>.
	 * The literals are from the enumeration {@link org.omg.space.xtce.NotationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation</em>' attribute.
	 * @see org.omg.space.xtce.NotationType
	 * @see #isSetNotation()
	 * @see #unsetNotation()
	 * @see #setNotation(NotationType)
	 * @see org.omg.space.xtce.XtcePackage#getNumberFormatType_Notation()
	 * @model default="normal" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='notation'"
	 * @generated
	 */
	NotationType getNotation();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumberFormatType#getNotation <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation</em>' attribute.
	 * @see org.omg.space.xtce.NotationType
	 * @see #isSetNotation()
	 * @see #unsetNotation()
	 * @see #getNotation()
	 * @generated
	 */
	void setNotation(NotationType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.NumberFormatType#getNotation <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotation()
	 * @see #getNotation()
	 * @see #setNotation(NotationType)
	 * @generated
	 */
	void unsetNotation();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.NumberFormatType#getNotation <em>Notation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Notation</em>' attribute is set.
	 * @see #unsetNotation()
	 * @see #getNotation()
	 * @see #setNotation(NotationType)
	 * @generated
	 */
	boolean isSetNotation();

	/**
	 * Returns the value of the '<em><b>Number Base</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.space.xtce.RadixType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Base</em>' attribute.
	 * @see org.omg.space.xtce.RadixType
	 * @see #isSetNumberBase()
	 * @see #unsetNumberBase()
	 * @see #setNumberBase(RadixType)
	 * @see org.omg.space.xtce.XtcePackage#getNumberFormatType_NumberBase()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='numberBase'"
	 * @generated
	 */
	RadixType getNumberBase();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumberFormatType#getNumberBase <em>Number Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Base</em>' attribute.
	 * @see org.omg.space.xtce.RadixType
	 * @see #isSetNumberBase()
	 * @see #unsetNumberBase()
	 * @see #getNumberBase()
	 * @generated
	 */
	void setNumberBase(RadixType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.NumberFormatType#getNumberBase <em>Number Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberBase()
	 * @see #getNumberBase()
	 * @see #setNumberBase(RadixType)
	 * @generated
	 */
	void unsetNumberBase();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.NumberFormatType#getNumberBase <em>Number Base</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Base</em>' attribute is set.
	 * @see #unsetNumberBase()
	 * @see #getNumberBase()
	 * @see #setNumberBase(RadixType)
	 * @generated
	 */
	boolean isSetNumberBase();

	/**
	 * Returns the value of the '<em><b>Positive Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Prefix</em>' attribute.
	 * @see #setPositivePrefix(String)
	 * @see org.omg.space.xtce.XtcePackage#getNumberFormatType_PositivePrefix()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='positivePrefix'"
	 * @generated
	 */
	String getPositivePrefix();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumberFormatType#getPositivePrefix <em>Positive Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Prefix</em>' attribute.
	 * @see #getPositivePrefix()
	 * @generated
	 */
	void setPositivePrefix(String value);

	/**
	 * Returns the value of the '<em><b>Positive Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Suffix</em>' attribute.
	 * @see #setPositiveSuffix(String)
	 * @see org.omg.space.xtce.XtcePackage#getNumberFormatType_PositiveSuffix()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='positiveSuffix'"
	 * @generated
	 */
	String getPositiveSuffix();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumberFormatType#getPositiveSuffix <em>Positive Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Suffix</em>' attribute.
	 * @see #getPositiveSuffix()
	 * @generated
	 */
	void setPositiveSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Show Thousands Grouping</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Thousands Grouping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Thousands Grouping</em>' attribute.
	 * @see #isSetShowThousandsGrouping()
	 * @see #unsetShowThousandsGrouping()
	 * @see #setShowThousandsGrouping(boolean)
	 * @see org.omg.space.xtce.XtcePackage#getNumberFormatType_ShowThousandsGrouping()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='showThousandsGrouping'"
	 * @generated
	 */
	boolean isShowThousandsGrouping();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.NumberFormatType#isShowThousandsGrouping <em>Show Thousands Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Thousands Grouping</em>' attribute.
	 * @see #isSetShowThousandsGrouping()
	 * @see #unsetShowThousandsGrouping()
	 * @see #isShowThousandsGrouping()
	 * @generated
	 */
	void setShowThousandsGrouping(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.NumberFormatType#isShowThousandsGrouping <em>Show Thousands Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShowThousandsGrouping()
	 * @see #isShowThousandsGrouping()
	 * @see #setShowThousandsGrouping(boolean)
	 * @generated
	 */
	void unsetShowThousandsGrouping();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.NumberFormatType#isShowThousandsGrouping <em>Show Thousands Grouping</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show Thousands Grouping</em>' attribute is set.
	 * @see #unsetShowThousandsGrouping()
	 * @see #isShowThousandsGrouping()
	 * @see #setShowThousandsGrouping(boolean)
	 * @generated
	 */
	boolean isSetShowThousandsGrouping();

} // NumberFormatType
