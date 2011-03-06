/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Output Algorithm Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of labled outputs are added to the SimpleInputAlgorithmType
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.InputOutputAlgorithmType#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.InputOutputAlgorithmType#isThread <em>Thread</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getInputOutputAlgorithmType()
 * @model extendedMetaData="name='InputOutputAlgorithmType' kind='elementOnly'"
 * @generated
 */
public interface InputOutputAlgorithmType extends InputAlgorithmType {
	/**
	 * Returns the value of the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Set</em>' containment reference.
	 * @see #setOutputSet(OutputSetType)
	 * @see org.omg.space.xtce.XtcePackage#getInputOutputAlgorithmType_OutputSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OutputSet' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputSetType getOutputSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.InputOutputAlgorithmType#getOutputSet <em>Output Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Set</em>' containment reference.
	 * @see #getOutputSet()
	 * @generated
	 */
	void setOutputSet(OutputSetType value);

	/**
	 * Returns the value of the '<em><b>Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread</em>' attribute.
	 * @see #isSetThread()
	 * @see #unsetThread()
	 * @see #setThread(boolean)
	 * @see org.omg.space.xtce.XtcePackage#getInputOutputAlgorithmType_Thread()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='thread'"
	 * @generated
	 */
	boolean isThread();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.InputOutputAlgorithmType#isThread <em>Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread</em>' attribute.
	 * @see #isSetThread()
	 * @see #unsetThread()
	 * @see #isThread()
	 * @generated
	 */
	void setThread(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.InputOutputAlgorithmType#isThread <em>Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThread()
	 * @see #isThread()
	 * @see #setThread(boolean)
	 * @generated
	 */
	void unsetThread();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.InputOutputAlgorithmType#isThread <em>Thread</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thread</em>' attribute is set.
	 * @see #unsetThread()
	 * @see #isThread()
	 * @see #setThread(boolean)
	 * @generated
	 */
	boolean isSetThread();

} // InputOutputAlgorithmType
