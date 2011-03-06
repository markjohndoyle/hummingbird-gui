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
 * A representation of the model object '<em><b>External Algorithm Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ExternalAlgorithmType#getAlgorithmLocation <em>Algorithm Location</em>}</li>
 *   <li>{@link org.omg.space.xtce.ExternalAlgorithmType#getImplementationName <em>Implementation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getExternalAlgorithmType()
 * @model extendedMetaData="name='ExternalAlgorithm_._type' kind='empty'"
 * @generated
 */
public interface ExternalAlgorithmType extends EObject {
	/**
	 * Returns the value of the '<em><b>Algorithm Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Location</em>' attribute.
	 * @see #setAlgorithmLocation(String)
	 * @see org.omg.space.xtce.XtcePackage#getExternalAlgorithmType_AlgorithmLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='algorithmLocation'"
	 * @generated
	 */
	String getAlgorithmLocation();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ExternalAlgorithmType#getAlgorithmLocation <em>Algorithm Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Location</em>' attribute.
	 * @see #getAlgorithmLocation()
	 * @generated
	 */
	void setAlgorithmLocation(String value);

	/**
	 * Returns the value of the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Name</em>' attribute.
	 * @see #setImplementationName(String)
	 * @see org.omg.space.xtce.XtcePackage#getExternalAlgorithmType_ImplementationName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='implementationName'"
	 * @generated
	 */
	String getImplementationName();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ExternalAlgorithmType#getImplementationName <em>Implementation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Name</em>' attribute.
	 * @see #getImplementationName()
	 * @generated
	 */
	void setImplementationName(String value);

} // ExternalAlgorithmType
