/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import javax.xml.datatype.Duration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Verifier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A command verifier is used to check that the command has be successfully executed. Command Verifiers may be either a Custom Algorithm or a Boolean Check or the presence of a Container for a relative change in the value of a Parameter.  The timeToWait is a time period where the verification must test true.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.CommandVerifierType#getComparison <em>Comparison</em>}</li>
 *   <li>{@link org.omg.space.xtce.CommandVerifierType#getComparisonList <em>Comparison List</em>}</li>
 *   <li>{@link org.omg.space.xtce.CommandVerifierType#getBooleanExpression <em>Boolean Expression</em>}</li>
 *   <li>{@link org.omg.space.xtce.CommandVerifierType#getContainerRef <em>Container Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.CommandVerifierType#getParameterValueChange <em>Parameter Value Change</em>}</li>
 *   <li>{@link org.omg.space.xtce.CommandVerifierType#getCustomAlgorithm <em>Custom Algorithm</em>}</li>
 *   <li>{@link org.omg.space.xtce.CommandVerifierType#getTimeToWait <em>Time To Wait</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getCommandVerifierType()
 * @model extendedMetaData="name='CommandVerifierType' kind='elementOnly'"
 * @generated
 */
public interface CommandVerifierType extends EObject {
	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' containment reference.
	 * @see #setComparison(ComparisonType)
	 * @see org.omg.space.xtce.XtcePackage#getCommandVerifierType_Comparison()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Comparison' namespace='##targetNamespace'"
	 * @generated
	 */
	ComparisonType getComparison();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CommandVerifierType#getComparison <em>Comparison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison</em>' containment reference.
	 * @see #getComparison()
	 * @generated
	 */
	void setComparison(ComparisonType value);

	/**
	 * Returns the value of the '<em><b>Comparison List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All comparisons must be true
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comparison List</em>' containment reference.
	 * @see #setComparisonList(ComparisonListType)
	 * @see org.omg.space.xtce.XtcePackage#getCommandVerifierType_ComparisonList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ComparisonList' namespace='##targetNamespace'"
	 * @generated
	 */
	ComparisonListType getComparisonList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CommandVerifierType#getComparisonList <em>Comparison List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison List</em>' containment reference.
	 * @see #getComparisonList()
	 * @generated
	 */
	void setComparisonList(ComparisonListType value);

	/**
	 * Returns the value of the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Expression</em>' containment reference.
	 * @see #setBooleanExpression(BooleanExpressionType)
	 * @see org.omg.space.xtce.XtcePackage#getCommandVerifierType_BooleanExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BooleanExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanExpressionType getBooleanExpression();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CommandVerifierType#getBooleanExpression <em>Boolean Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Expression</em>' containment reference.
	 * @see #getBooleanExpression()
	 * @generated
	 */
	void setBooleanExpression(BooleanExpressionType value);

	/**
	 * Returns the value of the '<em><b>Container Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When verification is the existance of a Container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container Ref</em>' containment reference.
	 * @see #setContainerRef(ContainerRefType)
	 * @see org.omg.space.xtce.XtcePackage#getCommandVerifierType_ContainerRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContainerRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ContainerRefType getContainerRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CommandVerifierType#getContainerRef <em>Container Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Ref</em>' containment reference.
	 * @see #getContainerRef()
	 * @generated
	 */
	void setContainerRef(ContainerRefType value);

	/**
	 * Returns the value of the '<em><b>Parameter Value Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to look for relative change in a Parameter value.  Only usefull for numeric Parameters
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Value Change</em>' containment reference.
	 * @see #setParameterValueChange(ParameterValueChangeType)
	 * @see org.omg.space.xtce.XtcePackage#getCommandVerifierType_ParameterValueChange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParameterValueChange' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterValueChangeType getParameterValueChange();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CommandVerifierType#getParameterValueChange <em>Parameter Value Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Value Change</em>' containment reference.
	 * @see #getParameterValueChange()
	 * @generated
	 */
	void setParameterValueChange(ParameterValueChangeType value);

	/**
	 * Returns the value of the '<em><b>Custom Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Algorithm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Algorithm</em>' containment reference.
	 * @see #setCustomAlgorithm(InputAlgorithmType)
	 * @see org.omg.space.xtce.XtcePackage#getCommandVerifierType_CustomAlgorithm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CustomAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	InputAlgorithmType getCustomAlgorithm();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CommandVerifierType#getCustomAlgorithm <em>Custom Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Algorithm</em>' containment reference.
	 * @see #getCustomAlgorithm()
	 * @generated
	 */
	void setCustomAlgorithm(InputAlgorithmType value);

	/**
	 * Returns the value of the '<em><b>Time To Wait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies how much time to provide for the verification.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time To Wait</em>' attribute.
	 * @see #setTimeToWait(Duration)
	 * @see org.omg.space.xtce.XtcePackage#getCommandVerifierType_TimeToWait()
	 * @model dataType="org.omg.space.xtce.RelativeTimeType" required="true"
	 *        extendedMetaData="kind='attribute' name='timeToWait'"
	 * @generated
	 */
	Duration getTimeToWait();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CommandVerifierType#getTimeToWait <em>Time To Wait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time To Wait</em>' attribute.
	 * @see #getTimeToWait()
	 * @generated
	 */
	void setTimeToWait(Duration value);

} // CommandVerifierType
