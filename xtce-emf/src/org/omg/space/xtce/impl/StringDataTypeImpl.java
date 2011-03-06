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

import org.omg.space.xtce.CalibratorType;
import org.omg.space.xtce.CharacterWidthType;
import org.omg.space.xtce.ContextCalibratorListType1;
import org.omg.space.xtce.IntegerRangeType;
import org.omg.space.xtce.StringDataType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.StringDataTypeImpl#getSizeRangeInCharacters <em>Size Range In Characters</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.StringDataTypeImpl#getDefaultCalibrator <em>Default Calibrator</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.StringDataTypeImpl#getContextCalibratorList <em>Context Calibrator List</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.StringDataTypeImpl#getCharacterWidth <em>Character Width</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.StringDataTypeImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.StringDataTypeImpl#getRestrictionPattern <em>Restriction Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringDataTypeImpl extends BaseDataTypeImpl implements StringDataType {
	/**
	 * The cached value of the '{@link #getSizeRangeInCharacters() <em>Size Range In Characters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeRangeInCharacters()
	 * @generated
	 * @ordered
	 */
	protected IntegerRangeType sizeRangeInCharacters;

	/**
	 * The cached value of the '{@link #getDefaultCalibrator() <em>Default Calibrator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCalibrator()
	 * @generated
	 * @ordered
	 */
	protected CalibratorType defaultCalibrator;

	/**
	 * The cached value of the '{@link #getContextCalibratorList() <em>Context Calibrator List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextCalibratorList()
	 * @generated
	 * @ordered
	 */
	protected ContextCalibratorListType1 contextCalibratorList;

	/**
	 * The default value of the '{@link #getCharacterWidth() <em>Character Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterWidth()
	 * @generated
	 * @ordered
	 */
	protected static final CharacterWidthType CHARACTER_WIDTH_EDEFAULT = CharacterWidthType._8;

	/**
	 * The cached value of the '{@link #getCharacterWidth() <em>Character Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterWidth()
	 * @generated
	 * @ordered
	 */
	protected CharacterWidthType characterWidth = CHARACTER_WIDTH_EDEFAULT;

	/**
	 * This is true if the Character Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean characterWidthESet;

	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected String initialValue = INITIAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestrictionPattern() <em>Restriction Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTRICTION_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestrictionPattern() <em>Restriction Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionPattern()
	 * @generated
	 * @ordered
	 */
	protected String restrictionPattern = RESTRICTION_PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getStringDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerRangeType getSizeRangeInCharacters() {
		return sizeRangeInCharacters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSizeRangeInCharacters(IntegerRangeType newSizeRangeInCharacters, NotificationChain msgs) {
		IntegerRangeType oldSizeRangeInCharacters = sizeRangeInCharacters;
		sizeRangeInCharacters = newSizeRangeInCharacters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.STRING_DATA_TYPE__SIZE_RANGE_IN_CHARACTERS, oldSizeRangeInCharacters, newSizeRangeInCharacters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeRangeInCharacters(IntegerRangeType newSizeRangeInCharacters) {
		if (newSizeRangeInCharacters != sizeRangeInCharacters) {
			NotificationChain msgs = null;
			if (sizeRangeInCharacters != null)
				msgs = ((InternalEObject)sizeRangeInCharacters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.STRING_DATA_TYPE__SIZE_RANGE_IN_CHARACTERS, null, msgs);
			if (newSizeRangeInCharacters != null)
				msgs = ((InternalEObject)newSizeRangeInCharacters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.STRING_DATA_TYPE__SIZE_RANGE_IN_CHARACTERS, null, msgs);
			msgs = basicSetSizeRangeInCharacters(newSizeRangeInCharacters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.STRING_DATA_TYPE__SIZE_RANGE_IN_CHARACTERS, newSizeRangeInCharacters, newSizeRangeInCharacters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalibratorType getDefaultCalibrator() {
		return defaultCalibrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultCalibrator(CalibratorType newDefaultCalibrator, NotificationChain msgs) {
		CalibratorType oldDefaultCalibrator = defaultCalibrator;
		defaultCalibrator = newDefaultCalibrator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.STRING_DATA_TYPE__DEFAULT_CALIBRATOR, oldDefaultCalibrator, newDefaultCalibrator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCalibrator(CalibratorType newDefaultCalibrator) {
		if (newDefaultCalibrator != defaultCalibrator) {
			NotificationChain msgs = null;
			if (defaultCalibrator != null)
				msgs = ((InternalEObject)defaultCalibrator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.STRING_DATA_TYPE__DEFAULT_CALIBRATOR, null, msgs);
			if (newDefaultCalibrator != null)
				msgs = ((InternalEObject)newDefaultCalibrator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.STRING_DATA_TYPE__DEFAULT_CALIBRATOR, null, msgs);
			msgs = basicSetDefaultCalibrator(newDefaultCalibrator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.STRING_DATA_TYPE__DEFAULT_CALIBRATOR, newDefaultCalibrator, newDefaultCalibrator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextCalibratorListType1 getContextCalibratorList() {
		return contextCalibratorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextCalibratorList(ContextCalibratorListType1 newContextCalibratorList, NotificationChain msgs) {
		ContextCalibratorListType1 oldContextCalibratorList = contextCalibratorList;
		contextCalibratorList = newContextCalibratorList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.STRING_DATA_TYPE__CONTEXT_CALIBRATOR_LIST, oldContextCalibratorList, newContextCalibratorList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextCalibratorList(ContextCalibratorListType1 newContextCalibratorList) {
		if (newContextCalibratorList != contextCalibratorList) {
			NotificationChain msgs = null;
			if (contextCalibratorList != null)
				msgs = ((InternalEObject)contextCalibratorList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.STRING_DATA_TYPE__CONTEXT_CALIBRATOR_LIST, null, msgs);
			if (newContextCalibratorList != null)
				msgs = ((InternalEObject)newContextCalibratorList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.STRING_DATA_TYPE__CONTEXT_CALIBRATOR_LIST, null, msgs);
			msgs = basicSetContextCalibratorList(newContextCalibratorList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.STRING_DATA_TYPE__CONTEXT_CALIBRATOR_LIST, newContextCalibratorList, newContextCalibratorList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterWidthType getCharacterWidth() {
		return characterWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterWidth(CharacterWidthType newCharacterWidth) {
		CharacterWidthType oldCharacterWidth = characterWidth;
		characterWidth = newCharacterWidth == null ? CHARACTER_WIDTH_EDEFAULT : newCharacterWidth;
		boolean oldCharacterWidthESet = characterWidthESet;
		characterWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.STRING_DATA_TYPE__CHARACTER_WIDTH, oldCharacterWidth, characterWidth, !oldCharacterWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCharacterWidth() {
		CharacterWidthType oldCharacterWidth = characterWidth;
		boolean oldCharacterWidthESet = characterWidthESet;
		characterWidth = CHARACTER_WIDTH_EDEFAULT;
		characterWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.STRING_DATA_TYPE__CHARACTER_WIDTH, oldCharacterWidth, CHARACTER_WIDTH_EDEFAULT, oldCharacterWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCharacterWidth() {
		return characterWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(String newInitialValue) {
		String oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.STRING_DATA_TYPE__INITIAL_VALUE, oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRestrictionPattern() {
		return restrictionPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictionPattern(String newRestrictionPattern) {
		String oldRestrictionPattern = restrictionPattern;
		restrictionPattern = newRestrictionPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.STRING_DATA_TYPE__RESTRICTION_PATTERN, oldRestrictionPattern, restrictionPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.STRING_DATA_TYPE__SIZE_RANGE_IN_CHARACTERS:
				return basicSetSizeRangeInCharacters(null, msgs);
			case XtcePackage.STRING_DATA_TYPE__DEFAULT_CALIBRATOR:
				return basicSetDefaultCalibrator(null, msgs);
			case XtcePackage.STRING_DATA_TYPE__CONTEXT_CALIBRATOR_LIST:
				return basicSetContextCalibratorList(null, msgs);
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
			case XtcePackage.STRING_DATA_TYPE__SIZE_RANGE_IN_CHARACTERS:
				return getSizeRangeInCharacters();
			case XtcePackage.STRING_DATA_TYPE__DEFAULT_CALIBRATOR:
				return getDefaultCalibrator();
			case XtcePackage.STRING_DATA_TYPE__CONTEXT_CALIBRATOR_LIST:
				return getContextCalibratorList();
			case XtcePackage.STRING_DATA_TYPE__CHARACTER_WIDTH:
				return getCharacterWidth();
			case XtcePackage.STRING_DATA_TYPE__INITIAL_VALUE:
				return getInitialValue();
			case XtcePackage.STRING_DATA_TYPE__RESTRICTION_PATTERN:
				return getRestrictionPattern();
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
			case XtcePackage.STRING_DATA_TYPE__SIZE_RANGE_IN_CHARACTERS:
				setSizeRangeInCharacters((IntegerRangeType)newValue);
				return;
			case XtcePackage.STRING_DATA_TYPE__DEFAULT_CALIBRATOR:
				setDefaultCalibrator((CalibratorType)newValue);
				return;
			case XtcePackage.STRING_DATA_TYPE__CONTEXT_CALIBRATOR_LIST:
				setContextCalibratorList((ContextCalibratorListType1)newValue);
				return;
			case XtcePackage.STRING_DATA_TYPE__CHARACTER_WIDTH:
				setCharacterWidth((CharacterWidthType)newValue);
				return;
			case XtcePackage.STRING_DATA_TYPE__INITIAL_VALUE:
				setInitialValue((String)newValue);
				return;
			case XtcePackage.STRING_DATA_TYPE__RESTRICTION_PATTERN:
				setRestrictionPattern((String)newValue);
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
			case XtcePackage.STRING_DATA_TYPE__SIZE_RANGE_IN_CHARACTERS:
				setSizeRangeInCharacters((IntegerRangeType)null);
				return;
			case XtcePackage.STRING_DATA_TYPE__DEFAULT_CALIBRATOR:
				setDefaultCalibrator((CalibratorType)null);
				return;
			case XtcePackage.STRING_DATA_TYPE__CONTEXT_CALIBRATOR_LIST:
				setContextCalibratorList((ContextCalibratorListType1)null);
				return;
			case XtcePackage.STRING_DATA_TYPE__CHARACTER_WIDTH:
				unsetCharacterWidth();
				return;
			case XtcePackage.STRING_DATA_TYPE__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
			case XtcePackage.STRING_DATA_TYPE__RESTRICTION_PATTERN:
				setRestrictionPattern(RESTRICTION_PATTERN_EDEFAULT);
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
			case XtcePackage.STRING_DATA_TYPE__SIZE_RANGE_IN_CHARACTERS:
				return sizeRangeInCharacters != null;
			case XtcePackage.STRING_DATA_TYPE__DEFAULT_CALIBRATOR:
				return defaultCalibrator != null;
			case XtcePackage.STRING_DATA_TYPE__CONTEXT_CALIBRATOR_LIST:
				return contextCalibratorList != null;
			case XtcePackage.STRING_DATA_TYPE__CHARACTER_WIDTH:
				return isSetCharacterWidth();
			case XtcePackage.STRING_DATA_TYPE__INITIAL_VALUE:
				return INITIAL_VALUE_EDEFAULT == null ? initialValue != null : !INITIAL_VALUE_EDEFAULT.equals(initialValue);
			case XtcePackage.STRING_DATA_TYPE__RESTRICTION_PATTERN:
				return RESTRICTION_PATTERN_EDEFAULT == null ? restrictionPattern != null : !RESTRICTION_PATTERN_EDEFAULT.equals(restrictionPattern);
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
		result.append(" (characterWidth: ");
		if (characterWidthESet) result.append(characterWidth); else result.append("<unset>");
		result.append(", initialValue: ");
		result.append(initialValue);
		result.append(", restrictionPattern: ");
		result.append(restrictionPattern);
		result.append(')');
		return result.toString();
	}

} //StringDataTypeImpl
