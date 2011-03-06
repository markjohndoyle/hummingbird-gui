/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rate In Stream Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used in packaging to define the expected rate that any individual container will be in a Stream
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.RateInStreamType1#getBasis <em>Basis</em>}</li>
 *   <li>{@link org.omg.space.xtce.RateInStreamType1#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link org.omg.space.xtce.RateInStreamType1#getMinimumValue <em>Minimum Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getRateInStreamType1()
 * @model extendedMetaData="name='RateInStreamType' kind='empty'"
 * @generated
 */
public interface RateInStreamType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Basis</b></em>' attribute.
	 * The default value is <code>"perSecond"</code>.
	 * The literals are from the enumeration {@link org.omg.space.xtce.BasisType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis</em>' attribute.
	 * @see org.omg.space.xtce.BasisType
	 * @see #isSetBasis()
	 * @see #unsetBasis()
	 * @see #setBasis(BasisType)
	 * @see org.omg.space.xtce.XtcePackage#getRateInStreamType1_Basis()
	 * @model default="perSecond" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='basis'"
	 * @generated
	 */
	BasisType getBasis();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.RateInStreamType1#getBasis <em>Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis</em>' attribute.
	 * @see org.omg.space.xtce.BasisType
	 * @see #isSetBasis()
	 * @see #unsetBasis()
	 * @see #getBasis()
	 * @generated
	 */
	void setBasis(BasisType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.RateInStreamType1#getBasis <em>Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBasis()
	 * @see #getBasis()
	 * @see #setBasis(BasisType)
	 * @generated
	 */
	void unsetBasis();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.RateInStreamType1#getBasis <em>Basis</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Basis</em>' attribute is set.
	 * @see #unsetBasis()
	 * @see #getBasis()
	 * @see #setBasis(BasisType)
	 * @generated
	 */
	boolean isSetBasis();

	/**
	 * Returns the value of the '<em><b>Maximum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Value</em>' attribute.
	 * @see #isSetMaximumValue()
	 * @see #unsetMaximumValue()
	 * @see #setMaximumValue(double)
	 * @see org.omg.space.xtce.XtcePackage#getRateInStreamType1_MaximumValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='maximumValue'"
	 * @generated
	 */
	double getMaximumValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.RateInStreamType1#getMaximumValue <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Value</em>' attribute.
	 * @see #isSetMaximumValue()
	 * @see #unsetMaximumValue()
	 * @see #getMaximumValue()
	 * @generated
	 */
	void setMaximumValue(double value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.RateInStreamType1#getMaximumValue <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumValue()
	 * @see #getMaximumValue()
	 * @see #setMaximumValue(double)
	 * @generated
	 */
	void unsetMaximumValue();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.RateInStreamType1#getMaximumValue <em>Maximum Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Value</em>' attribute is set.
	 * @see #unsetMaximumValue()
	 * @see #getMaximumValue()
	 * @see #setMaximumValue(double)
	 * @generated
	 */
	boolean isSetMaximumValue();

	/**
	 * Returns the value of the '<em><b>Minimum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Value</em>' attribute.
	 * @see #isSetMinimumValue()
	 * @see #unsetMinimumValue()
	 * @see #setMinimumValue(double)
	 * @see org.omg.space.xtce.XtcePackage#getRateInStreamType1_MinimumValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='minimumValue'"
	 * @generated
	 */
	double getMinimumValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.RateInStreamType1#getMinimumValue <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Value</em>' attribute.
	 * @see #isSetMinimumValue()
	 * @see #unsetMinimumValue()
	 * @see #getMinimumValue()
	 * @generated
	 */
	void setMinimumValue(double value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.RateInStreamType1#getMinimumValue <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumValue()
	 * @see #getMinimumValue()
	 * @see #setMinimumValue(double)
	 * @generated
	 */
	void unsetMinimumValue();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.RateInStreamType1#getMinimumValue <em>Minimum Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Value</em>' attribute is set.
	 * @see #unsetMinimumValue()
	 * @see #getMinimumValue()
	 * @see #setMinimumValue(double)
	 * @generated
	 */
	boolean isSetMinimumValue();

} // RateInStreamType1
