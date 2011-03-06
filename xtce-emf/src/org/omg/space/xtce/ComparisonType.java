/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A simple ParameterInstanceRef to value comparison.  The string supplied in the value attribute needs to be converted to a type matching the Parameter being compared to.  Numerical values are assumed to be base 10 unless proceeded by 0x (hexadecimal), 0o (octal), or 0b (binary).  The value is truncated  to use the least significant bits that match the bit size of the Parameter being compared to.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ComparisonType#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link org.omg.space.xtce.ComparisonType#getValue1 <em>Value1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getComparisonType()
 * @model extendedMetaData="name='ComparisonType' kind='simple'"
 * @generated
 */
public interface ComparisonType extends ParameterInstanceRefType1 {
	/**
	 * Returns the value of the '<em><b>Comparison Operator</b></em>' attribute.
	 * The default value is <code>"=="</code>.
	 * The literals are from the enumeration {@link org.omg.space.xtce.ComparisonOperatorsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Operator</em>' attribute.
	 * @see org.omg.space.xtce.ComparisonOperatorsType
	 * @see #isSetComparisonOperator()
	 * @see #unsetComparisonOperator()
	 * @see #setComparisonOperator(ComparisonOperatorsType)
	 * @see org.omg.space.xtce.XtcePackage#getComparisonType_ComparisonOperator()
	 * @model default="==" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='comparisonOperator'"
	 * @generated
	 */
	ComparisonOperatorsType getComparisonOperator();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ComparisonType#getComparisonOperator <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operator</em>' attribute.
	 * @see org.omg.space.xtce.ComparisonOperatorsType
	 * @see #isSetComparisonOperator()
	 * @see #unsetComparisonOperator()
	 * @see #getComparisonOperator()
	 * @generated
	 */
	void setComparisonOperator(ComparisonOperatorsType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.ComparisonType#getComparisonOperator <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetComparisonOperator()
	 * @see #getComparisonOperator()
	 * @see #setComparisonOperator(ComparisonOperatorsType)
	 * @generated
	 */
	void unsetComparisonOperator();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.ComparisonType#getComparisonOperator <em>Comparison Operator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Comparison Operator</em>' attribute is set.
	 * @see #unsetComparisonOperator()
	 * @see #getComparisonOperator()
	 * @see #setComparisonOperator(ComparisonOperatorsType)
	 * @generated
	 */
	boolean isSetComparisonOperator();

	/**
	 * Returns the value of the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value1</em>' attribute.
	 * @see #setValue1(String)
	 * @see org.omg.space.xtce.XtcePackage#getComparisonType_Value1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue1();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ComparisonType#getValue1 <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1</em>' attribute.
	 * @see #getValue1()
	 * @generated
	 */
	void setValue1(String value);

} // ComparisonType
