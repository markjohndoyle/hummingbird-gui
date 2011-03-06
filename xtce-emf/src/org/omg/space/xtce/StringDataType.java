/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains a String Value
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.StringDataType#getSizeRangeInCharacters <em>Size Range In Characters</em>}</li>
 *   <li>{@link org.omg.space.xtce.StringDataType#getDefaultCalibrator <em>Default Calibrator</em>}</li>
 *   <li>{@link org.omg.space.xtce.StringDataType#getContextCalibratorList <em>Context Calibrator List</em>}</li>
 *   <li>{@link org.omg.space.xtce.StringDataType#getCharacterWidth <em>Character Width</em>}</li>
 *   <li>{@link org.omg.space.xtce.StringDataType#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.StringDataType#getRestrictionPattern <em>Restriction Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getStringDataType()
 * @model extendedMetaData="name='StringDataType' kind='elementOnly'"
 * @generated
 */
public interface StringDataType extends BaseDataType {
	/**
	 * Returns the value of the '<em><b>Size Range In Characters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Range In Characters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Range In Characters</em>' containment reference.
	 * @see #setSizeRangeInCharacters(IntegerRangeType)
	 * @see org.omg.space.xtce.XtcePackage#getStringDataType_SizeRangeInCharacters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SizeRangeInCharacters' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerRangeType getSizeRangeInCharacters();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.StringDataType#getSizeRangeInCharacters <em>Size Range In Characters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Range In Characters</em>' containment reference.
	 * @see #getSizeRangeInCharacters()
	 * @generated
	 */
	void setSizeRangeInCharacters(IntegerRangeType value);

	/**
	 * Returns the value of the '<em><b>Default Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Calibrator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Calibrator</em>' containment reference.
	 * @see #setDefaultCalibrator(CalibratorType)
	 * @see org.omg.space.xtce.XtcePackage#getStringDataType_DefaultCalibrator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DefaultCalibrator' namespace='##targetNamespace'"
	 * @generated
	 */
	CalibratorType getDefaultCalibrator();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.StringDataType#getDefaultCalibrator <em>Default Calibrator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Calibrator</em>' containment reference.
	 * @see #getDefaultCalibrator()
	 * @generated
	 */
	void setDefaultCalibrator(CalibratorType value);

	/**
	 * Returns the value of the '<em><b>Context Calibrator List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Calibrator List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Calibrator List</em>' containment reference.
	 * @see #setContextCalibratorList(ContextCalibratorListType1)
	 * @see org.omg.space.xtce.XtcePackage#getStringDataType_ContextCalibratorList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContextCalibratorList' namespace='##targetNamespace'"
	 * @generated
	 */
	ContextCalibratorListType1 getContextCalibratorList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.StringDataType#getContextCalibratorList <em>Context Calibrator List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Calibrator List</em>' containment reference.
	 * @see #getContextCalibratorList()
	 * @generated
	 */
	void setContextCalibratorList(ContextCalibratorListType1 value);

	/**
	 * Returns the value of the '<em><b>Character Width</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.space.xtce.CharacterWidthType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Width</em>' attribute.
	 * @see org.omg.space.xtce.CharacterWidthType
	 * @see #isSetCharacterWidth()
	 * @see #unsetCharacterWidth()
	 * @see #setCharacterWidth(CharacterWidthType)
	 * @see org.omg.space.xtce.XtcePackage#getStringDataType_CharacterWidth()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='characterWidth'"
	 * @generated
	 */
	CharacterWidthType getCharacterWidth();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.StringDataType#getCharacterWidth <em>Character Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Width</em>' attribute.
	 * @see org.omg.space.xtce.CharacterWidthType
	 * @see #isSetCharacterWidth()
	 * @see #unsetCharacterWidth()
	 * @see #getCharacterWidth()
	 * @generated
	 */
	void setCharacterWidth(CharacterWidthType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.StringDataType#getCharacterWidth <em>Character Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCharacterWidth()
	 * @see #getCharacterWidth()
	 * @see #setCharacterWidth(CharacterWidthType)
	 * @generated
	 */
	void unsetCharacterWidth();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.StringDataType#getCharacterWidth <em>Character Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Character Width</em>' attribute is set.
	 * @see #unsetCharacterWidth()
	 * @see #getCharacterWidth()
	 * @see #setCharacterWidth(CharacterWidthType)
	 * @generated
	 */
	boolean isSetCharacterWidth();

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(String)
	 * @see org.omg.space.xtce.XtcePackage#getStringDataType_InitialValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='initialValue'"
	 * @generated
	 */
	String getInitialValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.StringDataType#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(String value);

	/**
	 * Returns the value of the '<em><b>Restriction Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction Pattern</em>' attribute.
	 * @see #setRestrictionPattern(String)
	 * @see org.omg.space.xtce.XtcePackage#getStringDataType_RestrictionPattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='restrictionPattern'"
	 * @generated
	 */
	String getRestrictionPattern();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.StringDataType#getRestrictionPattern <em>Restriction Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction Pattern</em>' attribute.
	 * @see #getRestrictionPattern()
	 * @generated
	 */
	void setRestrictionPattern(String value);

} // StringDataType
