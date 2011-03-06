/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.NotationType;
import org.omg.space.xtce.NumberFormatType;
import org.omg.space.xtce.RadixType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Format Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.NumberFormatTypeImpl#getMaximumFractionDigits <em>Maximum Fraction Digits</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumberFormatTypeImpl#getMaximumIntegerDigits <em>Maximum Integer Digits</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumberFormatTypeImpl#getMinimumFractionDigits <em>Minimum Fraction Digits</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumberFormatTypeImpl#getMinimumIntegerDigits <em>Minimum Integer Digits</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumberFormatTypeImpl#getNegativePrefix <em>Negative Prefix</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumberFormatTypeImpl#getNegativeSuffix <em>Negative Suffix</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumberFormatTypeImpl#getNotation <em>Notation</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumberFormatTypeImpl#getNumberBase <em>Number Base</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumberFormatTypeImpl#getPositivePrefix <em>Positive Prefix</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumberFormatTypeImpl#getPositiveSuffix <em>Positive Suffix</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.NumberFormatTypeImpl#isShowThousandsGrouping <em>Show Thousands Grouping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberFormatTypeImpl extends EObjectImpl implements NumberFormatType {
	/**
	 * The default value of the '{@link #getMaximumFractionDigits() <em>Maximum Fraction Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumFractionDigits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAXIMUM_FRACTION_DIGITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumFractionDigits() <em>Maximum Fraction Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumFractionDigits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maximumFractionDigits = MAXIMUM_FRACTION_DIGITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumIntegerDigits() <em>Maximum Integer Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumIntegerDigits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAXIMUM_INTEGER_DIGITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumIntegerDigits() <em>Maximum Integer Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumIntegerDigits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maximumIntegerDigits = MAXIMUM_INTEGER_DIGITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumFractionDigits() <em>Minimum Fraction Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumFractionDigits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MINIMUM_FRACTION_DIGITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumFractionDigits() <em>Minimum Fraction Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumFractionDigits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minimumFractionDigits = MINIMUM_FRACTION_DIGITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumIntegerDigits() <em>Minimum Integer Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumIntegerDigits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MINIMUM_INTEGER_DIGITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumIntegerDigits() <em>Minimum Integer Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumIntegerDigits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minimumIntegerDigits = MINIMUM_INTEGER_DIGITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNegativePrefix() <em>Negative Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NEGATIVE_PREFIX_EDEFAULT = "-";

	/**
	 * The cached value of the '{@link #getNegativePrefix() <em>Negative Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativePrefix()
	 * @generated
	 * @ordered
	 */
	protected String negativePrefix = NEGATIVE_PREFIX_EDEFAULT;

	/**
	 * This is true if the Negative Prefix attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean negativePrefixESet;

	/**
	 * The default value of the '{@link #getNegativeSuffix() <em>Negative Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String NEGATIVE_SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegativeSuffix() <em>Negative Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeSuffix()
	 * @generated
	 * @ordered
	 */
	protected String negativeSuffix = NEGATIVE_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotation() <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected static final NotationType NOTATION_EDEFAULT = NotationType.NORMAL;

	/**
	 * The cached value of the '{@link #getNotation() <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected NotationType notation = NOTATION_EDEFAULT;

	/**
	 * This is true if the Notation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean notationESet;

	/**
	 * The default value of the '{@link #getNumberBase() <em>Number Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberBase()
	 * @generated
	 * @ordered
	 */
	protected static final RadixType NUMBER_BASE_EDEFAULT = RadixType.DECIMAL;

	/**
	 * The cached value of the '{@link #getNumberBase() <em>Number Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberBase()
	 * @generated
	 * @ordered
	 */
	protected RadixType numberBase = NUMBER_BASE_EDEFAULT;

	/**
	 * This is true if the Number Base attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberBaseESet;

	/**
	 * The default value of the '{@link #getPositivePrefix() <em>Positive Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositivePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITIVE_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositivePrefix() <em>Positive Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositivePrefix()
	 * @generated
	 * @ordered
	 */
	protected String positivePrefix = POSITIVE_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositiveSuffix() <em>Positive Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITIVE_SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositiveSuffix() <em>Positive Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveSuffix()
	 * @generated
	 * @ordered
	 */
	protected String positiveSuffix = POSITIVE_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowThousandsGrouping() <em>Show Thousands Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowThousandsGrouping()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_THOUSANDS_GROUPING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowThousandsGrouping() <em>Show Thousands Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowThousandsGrouping()
	 * @generated
	 * @ordered
	 */
	protected boolean showThousandsGrouping = SHOW_THOUSANDS_GROUPING_EDEFAULT;

	/**
	 * This is true if the Show Thousands Grouping attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showThousandsGroupingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberFormatTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getNumberFormatType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaximumFractionDigits() {
		return maximumFractionDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumFractionDigits(BigInteger newMaximumFractionDigits) {
		BigInteger oldMaximumFractionDigits = maximumFractionDigits;
		maximumFractionDigits = newMaximumFractionDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMBER_FORMAT_TYPE__MAXIMUM_FRACTION_DIGITS, oldMaximumFractionDigits, maximumFractionDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaximumIntegerDigits() {
		return maximumIntegerDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumIntegerDigits(BigInteger newMaximumIntegerDigits) {
		BigInteger oldMaximumIntegerDigits = maximumIntegerDigits;
		maximumIntegerDigits = newMaximumIntegerDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMBER_FORMAT_TYPE__MAXIMUM_INTEGER_DIGITS, oldMaximumIntegerDigits, maximumIntegerDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinimumFractionDigits() {
		return minimumFractionDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumFractionDigits(BigInteger newMinimumFractionDigits) {
		BigInteger oldMinimumFractionDigits = minimumFractionDigits;
		minimumFractionDigits = newMinimumFractionDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMBER_FORMAT_TYPE__MINIMUM_FRACTION_DIGITS, oldMinimumFractionDigits, minimumFractionDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinimumIntegerDigits() {
		return minimumIntegerDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumIntegerDigits(BigInteger newMinimumIntegerDigits) {
		BigInteger oldMinimumIntegerDigits = minimumIntegerDigits;
		minimumIntegerDigits = newMinimumIntegerDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMBER_FORMAT_TYPE__MINIMUM_INTEGER_DIGITS, oldMinimumIntegerDigits, minimumIntegerDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNegativePrefix() {
		return negativePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegativePrefix(String newNegativePrefix) {
		String oldNegativePrefix = negativePrefix;
		negativePrefix = newNegativePrefix;
		boolean oldNegativePrefixESet = negativePrefixESet;
		negativePrefixESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMBER_FORMAT_TYPE__NEGATIVE_PREFIX, oldNegativePrefix, negativePrefix, !oldNegativePrefixESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNegativePrefix() {
		String oldNegativePrefix = negativePrefix;
		boolean oldNegativePrefixESet = negativePrefixESet;
		negativePrefix = NEGATIVE_PREFIX_EDEFAULT;
		negativePrefixESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.NUMBER_FORMAT_TYPE__NEGATIVE_PREFIX, oldNegativePrefix, NEGATIVE_PREFIX_EDEFAULT, oldNegativePrefixESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNegativePrefix() {
		return negativePrefixESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNegativeSuffix() {
		return negativeSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegativeSuffix(String newNegativeSuffix) {
		String oldNegativeSuffix = negativeSuffix;
		negativeSuffix = newNegativeSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMBER_FORMAT_TYPE__NEGATIVE_SUFFIX, oldNegativeSuffix, negativeSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotationType getNotation() {
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotation(NotationType newNotation) {
		NotationType oldNotation = notation;
		notation = newNotation == null ? NOTATION_EDEFAULT : newNotation;
		boolean oldNotationESet = notationESet;
		notationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMBER_FORMAT_TYPE__NOTATION, oldNotation, notation, !oldNotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotation() {
		NotationType oldNotation = notation;
		boolean oldNotationESet = notationESet;
		notation = NOTATION_EDEFAULT;
		notationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.NUMBER_FORMAT_TYPE__NOTATION, oldNotation, NOTATION_EDEFAULT, oldNotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNotation() {
		return notationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadixType getNumberBase() {
		return numberBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberBase(RadixType newNumberBase) {
		RadixType oldNumberBase = numberBase;
		numberBase = newNumberBase == null ? NUMBER_BASE_EDEFAULT : newNumberBase;
		boolean oldNumberBaseESet = numberBaseESet;
		numberBaseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMBER_FORMAT_TYPE__NUMBER_BASE, oldNumberBase, numberBase, !oldNumberBaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberBase() {
		RadixType oldNumberBase = numberBase;
		boolean oldNumberBaseESet = numberBaseESet;
		numberBase = NUMBER_BASE_EDEFAULT;
		numberBaseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.NUMBER_FORMAT_TYPE__NUMBER_BASE, oldNumberBase, NUMBER_BASE_EDEFAULT, oldNumberBaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberBase() {
		return numberBaseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPositivePrefix() {
		return positivePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositivePrefix(String newPositivePrefix) {
		String oldPositivePrefix = positivePrefix;
		positivePrefix = newPositivePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMBER_FORMAT_TYPE__POSITIVE_PREFIX, oldPositivePrefix, positivePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPositiveSuffix() {
		return positiveSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositiveSuffix(String newPositiveSuffix) {
		String oldPositiveSuffix = positiveSuffix;
		positiveSuffix = newPositiveSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMBER_FORMAT_TYPE__POSITIVE_SUFFIX, oldPositiveSuffix, positiveSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowThousandsGrouping() {
		return showThousandsGrouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowThousandsGrouping(boolean newShowThousandsGrouping) {
		boolean oldShowThousandsGrouping = showThousandsGrouping;
		showThousandsGrouping = newShowThousandsGrouping;
		boolean oldShowThousandsGroupingESet = showThousandsGroupingESet;
		showThousandsGroupingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.NUMBER_FORMAT_TYPE__SHOW_THOUSANDS_GROUPING, oldShowThousandsGrouping, showThousandsGrouping, !oldShowThousandsGroupingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShowThousandsGrouping() {
		boolean oldShowThousandsGrouping = showThousandsGrouping;
		boolean oldShowThousandsGroupingESet = showThousandsGroupingESet;
		showThousandsGrouping = SHOW_THOUSANDS_GROUPING_EDEFAULT;
		showThousandsGroupingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.NUMBER_FORMAT_TYPE__SHOW_THOUSANDS_GROUPING, oldShowThousandsGrouping, SHOW_THOUSANDS_GROUPING_EDEFAULT, oldShowThousandsGroupingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShowThousandsGrouping() {
		return showThousandsGroupingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.NUMBER_FORMAT_TYPE__MAXIMUM_FRACTION_DIGITS:
				return getMaximumFractionDigits();
			case XtcePackage.NUMBER_FORMAT_TYPE__MAXIMUM_INTEGER_DIGITS:
				return getMaximumIntegerDigits();
			case XtcePackage.NUMBER_FORMAT_TYPE__MINIMUM_FRACTION_DIGITS:
				return getMinimumFractionDigits();
			case XtcePackage.NUMBER_FORMAT_TYPE__MINIMUM_INTEGER_DIGITS:
				return getMinimumIntegerDigits();
			case XtcePackage.NUMBER_FORMAT_TYPE__NEGATIVE_PREFIX:
				return getNegativePrefix();
			case XtcePackage.NUMBER_FORMAT_TYPE__NEGATIVE_SUFFIX:
				return getNegativeSuffix();
			case XtcePackage.NUMBER_FORMAT_TYPE__NOTATION:
				return getNotation();
			case XtcePackage.NUMBER_FORMAT_TYPE__NUMBER_BASE:
				return getNumberBase();
			case XtcePackage.NUMBER_FORMAT_TYPE__POSITIVE_PREFIX:
				return getPositivePrefix();
			case XtcePackage.NUMBER_FORMAT_TYPE__POSITIVE_SUFFIX:
				return getPositiveSuffix();
			case XtcePackage.NUMBER_FORMAT_TYPE__SHOW_THOUSANDS_GROUPING:
				return isShowThousandsGrouping();
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
			case XtcePackage.NUMBER_FORMAT_TYPE__MAXIMUM_FRACTION_DIGITS:
				setMaximumFractionDigits((BigInteger)newValue);
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__MAXIMUM_INTEGER_DIGITS:
				setMaximumIntegerDigits((BigInteger)newValue);
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__MINIMUM_FRACTION_DIGITS:
				setMinimumFractionDigits((BigInteger)newValue);
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__MINIMUM_INTEGER_DIGITS:
				setMinimumIntegerDigits((BigInteger)newValue);
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__NEGATIVE_PREFIX:
				setNegativePrefix((String)newValue);
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__NEGATIVE_SUFFIX:
				setNegativeSuffix((String)newValue);
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__NOTATION:
				setNotation((NotationType)newValue);
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__NUMBER_BASE:
				setNumberBase((RadixType)newValue);
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__POSITIVE_PREFIX:
				setPositivePrefix((String)newValue);
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__POSITIVE_SUFFIX:
				setPositiveSuffix((String)newValue);
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__SHOW_THOUSANDS_GROUPING:
				setShowThousandsGrouping((Boolean)newValue);
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
			case XtcePackage.NUMBER_FORMAT_TYPE__MAXIMUM_FRACTION_DIGITS:
				setMaximumFractionDigits(MAXIMUM_FRACTION_DIGITS_EDEFAULT);
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__MAXIMUM_INTEGER_DIGITS:
				setMaximumIntegerDigits(MAXIMUM_INTEGER_DIGITS_EDEFAULT);
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__MINIMUM_FRACTION_DIGITS:
				setMinimumFractionDigits(MINIMUM_FRACTION_DIGITS_EDEFAULT);
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__MINIMUM_INTEGER_DIGITS:
				setMinimumIntegerDigits(MINIMUM_INTEGER_DIGITS_EDEFAULT);
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__NEGATIVE_PREFIX:
				unsetNegativePrefix();
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__NEGATIVE_SUFFIX:
				setNegativeSuffix(NEGATIVE_SUFFIX_EDEFAULT);
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__NOTATION:
				unsetNotation();
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__NUMBER_BASE:
				unsetNumberBase();
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__POSITIVE_PREFIX:
				setPositivePrefix(POSITIVE_PREFIX_EDEFAULT);
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__POSITIVE_SUFFIX:
				setPositiveSuffix(POSITIVE_SUFFIX_EDEFAULT);
				return;
			case XtcePackage.NUMBER_FORMAT_TYPE__SHOW_THOUSANDS_GROUPING:
				unsetShowThousandsGrouping();
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
			case XtcePackage.NUMBER_FORMAT_TYPE__MAXIMUM_FRACTION_DIGITS:
				return MAXIMUM_FRACTION_DIGITS_EDEFAULT == null ? maximumFractionDigits != null : !MAXIMUM_FRACTION_DIGITS_EDEFAULT.equals(maximumFractionDigits);
			case XtcePackage.NUMBER_FORMAT_TYPE__MAXIMUM_INTEGER_DIGITS:
				return MAXIMUM_INTEGER_DIGITS_EDEFAULT == null ? maximumIntegerDigits != null : !MAXIMUM_INTEGER_DIGITS_EDEFAULT.equals(maximumIntegerDigits);
			case XtcePackage.NUMBER_FORMAT_TYPE__MINIMUM_FRACTION_DIGITS:
				return MINIMUM_FRACTION_DIGITS_EDEFAULT == null ? minimumFractionDigits != null : !MINIMUM_FRACTION_DIGITS_EDEFAULT.equals(minimumFractionDigits);
			case XtcePackage.NUMBER_FORMAT_TYPE__MINIMUM_INTEGER_DIGITS:
				return MINIMUM_INTEGER_DIGITS_EDEFAULT == null ? minimumIntegerDigits != null : !MINIMUM_INTEGER_DIGITS_EDEFAULT.equals(minimumIntegerDigits);
			case XtcePackage.NUMBER_FORMAT_TYPE__NEGATIVE_PREFIX:
				return isSetNegativePrefix();
			case XtcePackage.NUMBER_FORMAT_TYPE__NEGATIVE_SUFFIX:
				return NEGATIVE_SUFFIX_EDEFAULT == null ? negativeSuffix != null : !NEGATIVE_SUFFIX_EDEFAULT.equals(negativeSuffix);
			case XtcePackage.NUMBER_FORMAT_TYPE__NOTATION:
				return isSetNotation();
			case XtcePackage.NUMBER_FORMAT_TYPE__NUMBER_BASE:
				return isSetNumberBase();
			case XtcePackage.NUMBER_FORMAT_TYPE__POSITIVE_PREFIX:
				return POSITIVE_PREFIX_EDEFAULT == null ? positivePrefix != null : !POSITIVE_PREFIX_EDEFAULT.equals(positivePrefix);
			case XtcePackage.NUMBER_FORMAT_TYPE__POSITIVE_SUFFIX:
				return POSITIVE_SUFFIX_EDEFAULT == null ? positiveSuffix != null : !POSITIVE_SUFFIX_EDEFAULT.equals(positiveSuffix);
			case XtcePackage.NUMBER_FORMAT_TYPE__SHOW_THOUSANDS_GROUPING:
				return isSetShowThousandsGrouping();
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
		result.append(" (maximumFractionDigits: ");
		result.append(maximumFractionDigits);
		result.append(", maximumIntegerDigits: ");
		result.append(maximumIntegerDigits);
		result.append(", minimumFractionDigits: ");
		result.append(minimumFractionDigits);
		result.append(", minimumIntegerDigits: ");
		result.append(minimumIntegerDigits);
		result.append(", negativePrefix: ");
		if (negativePrefixESet) result.append(negativePrefix); else result.append("<unset>");
		result.append(", negativeSuffix: ");
		result.append(negativeSuffix);
		result.append(", notation: ");
		if (notationESet) result.append(notation); else result.append("<unset>");
		result.append(", numberBase: ");
		if (numberBaseESet) result.append(numberBase); else result.append("<unset>");
		result.append(", positivePrefix: ");
		result.append(positivePrefix);
		result.append(", positiveSuffix: ");
		result.append(positiveSuffix);
		result.append(", showThousandsGrouping: ");
		if (showThousandsGroupingESet) result.append(showThousandsGrouping); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NumberFormatTypeImpl
