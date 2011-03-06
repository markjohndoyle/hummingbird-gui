/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains a boolean value
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.BooleanDataType#isInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.BooleanDataType#getOneStringValue <em>One String Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.BooleanDataType#getZeroStringValue <em>Zero String Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getBooleanDataType()
 * @model extendedMetaData="name='BooleanDataType' kind='elementOnly'"
 * @generated
 */
public interface BooleanDataType extends BaseDataType {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #isSetInitialValue()
	 * @see #unsetInitialValue()
	 * @see #setInitialValue(boolean)
	 * @see org.omg.space.xtce.XtcePackage#getBooleanDataType_InitialValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='initialValue'"
	 * @generated
	 */
	boolean isInitialValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BooleanDataType#isInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #isSetInitialValue()
	 * @see #unsetInitialValue()
	 * @see #isInitialValue()
	 * @generated
	 */
	void setInitialValue(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.BooleanDataType#isInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialValue()
	 * @see #isInitialValue()
	 * @see #setInitialValue(boolean)
	 * @generated
	 */
	void unsetInitialValue();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.BooleanDataType#isInitialValue <em>Initial Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial Value</em>' attribute is set.
	 * @see #unsetInitialValue()
	 * @see #isInitialValue()
	 * @see #setInitialValue(boolean)
	 * @generated
	 */
	boolean isSetInitialValue();

	/**
	 * Returns the value of the '<em><b>One String Value</b></em>' attribute.
	 * The default value is <code>"True"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One String Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One String Value</em>' attribute.
	 * @see #isSetOneStringValue()
	 * @see #unsetOneStringValue()
	 * @see #setOneStringValue(String)
	 * @see org.omg.space.xtce.XtcePackage#getBooleanDataType_OneStringValue()
	 * @model default="True" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='oneStringValue'"
	 * @generated
	 */
	String getOneStringValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BooleanDataType#getOneStringValue <em>One String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One String Value</em>' attribute.
	 * @see #isSetOneStringValue()
	 * @see #unsetOneStringValue()
	 * @see #getOneStringValue()
	 * @generated
	 */
	void setOneStringValue(String value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.BooleanDataType#getOneStringValue <em>One String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOneStringValue()
	 * @see #getOneStringValue()
	 * @see #setOneStringValue(String)
	 * @generated
	 */
	void unsetOneStringValue();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.BooleanDataType#getOneStringValue <em>One String Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>One String Value</em>' attribute is set.
	 * @see #unsetOneStringValue()
	 * @see #getOneStringValue()
	 * @see #setOneStringValue(String)
	 * @generated
	 */
	boolean isSetOneStringValue();

	/**
	 * Returns the value of the '<em><b>Zero String Value</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zero String Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zero String Value</em>' attribute.
	 * @see #isSetZeroStringValue()
	 * @see #unsetZeroStringValue()
	 * @see #setZeroStringValue(String)
	 * @see org.omg.space.xtce.XtcePackage#getBooleanDataType_ZeroStringValue()
	 * @model default="False" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='zeroStringValue'"
	 * @generated
	 */
	String getZeroStringValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BooleanDataType#getZeroStringValue <em>Zero String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zero String Value</em>' attribute.
	 * @see #isSetZeroStringValue()
	 * @see #unsetZeroStringValue()
	 * @see #getZeroStringValue()
	 * @generated
	 */
	void setZeroStringValue(String value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.BooleanDataType#getZeroStringValue <em>Zero String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZeroStringValue()
	 * @see #getZeroStringValue()
	 * @see #setZeroStringValue(String)
	 * @generated
	 */
	void unsetZeroStringValue();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.BooleanDataType#getZeroStringValue <em>Zero String Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zero String Value</em>' attribute is set.
	 * @see #unsetZeroStringValue()
	 * @see #getZeroStringValue()
	 * @see #setZeroStringValue(String)
	 * @generated
	 */
	boolean isSetZeroStringValue();

} // BooleanDataType
