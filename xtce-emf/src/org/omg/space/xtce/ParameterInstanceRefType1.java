/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Instance Ref Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to an instance of a Parameter.   Used when the value of a parameter is required for a calculation or as an index value.  A positive value for instance is forward in time, a negative value for count is backward in time, a 0 value for count means use the current value of the parameter or the first value in a container.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ParameterInstanceRefType1#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterInstanceRefType1#isUseCalibratedValue <em>Use Calibrated Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getParameterInstanceRefType1()
 * @model extendedMetaData="name='ParameterInstanceRefType' kind='simple'"
 * @generated
 */
public interface ParameterInstanceRefType1 extends ParameterRefType1 {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' attribute.
	 * @see #isSetInstance()
	 * @see #unsetInstance()
	 * @see #setInstance(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getParameterInstanceRefType1_Instance()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='instance'"
	 * @generated
	 */
	BigInteger getInstance();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterInstanceRefType1#getInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' attribute.
	 * @see #isSetInstance()
	 * @see #unsetInstance()
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.ParameterInstanceRefType1#getInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInstance()
	 * @see #getInstance()
	 * @see #setInstance(BigInteger)
	 * @generated
	 */
	void unsetInstance();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.ParameterInstanceRefType1#getInstance <em>Instance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Instance</em>' attribute is set.
	 * @see #unsetInstance()
	 * @see #getInstance()
	 * @see #setInstance(BigInteger)
	 * @generated
	 */
	boolean isSetInstance();

	/**
	 * Returns the value of the '<em><b>Use Calibrated Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Calibrated Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Calibrated Value</em>' attribute.
	 * @see #isSetUseCalibratedValue()
	 * @see #unsetUseCalibratedValue()
	 * @see #setUseCalibratedValue(boolean)
	 * @see org.omg.space.xtce.XtcePackage#getParameterInstanceRefType1_UseCalibratedValue()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='useCalibratedValue'"
	 * @generated
	 */
	boolean isUseCalibratedValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterInstanceRefType1#isUseCalibratedValue <em>Use Calibrated Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Calibrated Value</em>' attribute.
	 * @see #isSetUseCalibratedValue()
	 * @see #unsetUseCalibratedValue()
	 * @see #isUseCalibratedValue()
	 * @generated
	 */
	void setUseCalibratedValue(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.ParameterInstanceRefType1#isUseCalibratedValue <em>Use Calibrated Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseCalibratedValue()
	 * @see #isUseCalibratedValue()
	 * @see #setUseCalibratedValue(boolean)
	 * @generated
	 */
	void unsetUseCalibratedValue();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.ParameterInstanceRefType1#isUseCalibratedValue <em>Use Calibrated Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Calibrated Value</em>' attribute is set.
	 * @see #unsetUseCalibratedValue()
	 * @see #isUseCalibratedValue()
	 * @see #setUseCalibratedValue(boolean)
	 * @generated
	 */
	boolean isSetUseCalibratedValue();

} // ParameterInstanceRefType1
