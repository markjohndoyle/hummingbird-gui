/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Math Operation Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.MathOperationType1#getTriggerSet <em>Trigger Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.MathOperationType1#getOutputParameterRef <em>Output Parameter Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getMathOperationType1()
 * @model extendedMetaData="name='MathOperation_._type' kind='elementOnly'"
 * @generated
 */
public interface MathOperationType1 extends MathOperationType {
	/**
	 * Returns the value of the '<em><b>Trigger Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Set</em>' containment reference.
	 * @see #setTriggerSet(TriggerType)
	 * @see org.omg.space.xtce.XtcePackage#getMathOperationType1_TriggerSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TriggerSet' namespace='##targetNamespace'"
	 * @generated
	 */
	TriggerType getTriggerSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MathOperationType1#getTriggerSet <em>Trigger Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Set</em>' containment reference.
	 * @see #getTriggerSet()
	 * @generated
	 */
	void setTriggerSet(TriggerType value);

	/**
	 * Returns the value of the '<em><b>Output Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Parameter Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Parameter Ref</em>' attribute.
	 * @see #setOutputParameterRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getMathOperationType1_OutputParameterRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='outputParameterRef'"
	 * @generated
	 */
	String getOutputParameterRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.MathOperationType1#getOutputParameterRef <em>Output Parameter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Parameter Ref</em>' attribute.
	 * @see #getOutputParameterRef()
	 * @generated
	 */
	void setOutputParameterRef(String value);

} // MathOperationType1
