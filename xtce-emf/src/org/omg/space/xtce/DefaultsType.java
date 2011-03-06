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
 * A representation of the model object '<em><b>Defaults Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.DefaultsType#getDefaultDataEncoding <em>Default Data Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.DefaultsType#getParameterTimeAssociation <em>Parameter Time Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getDefaultsType()
 * @model extendedMetaData="name='Defaults_._type' kind='elementOnly'"
 * @generated
 */
public interface DefaultsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Since the data encoding (bit order and byte order) is normally the same throughout a spacesystem, using this element allows that data encoding to be specified as a default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Data Encoding</em>' containment reference.
	 * @see #setDefaultDataEncoding(DataEncodingType)
	 * @see org.omg.space.xtce.XtcePackage#getDefaultsType_DefaultDataEncoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DefaultDataEncoding' namespace='##targetNamespace'"
	 * @generated
	 */
	DataEncodingType getDefaultDataEncoding();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.DefaultsType#getDefaultDataEncoding <em>Default Data Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Data Encoding</em>' containment reference.
	 * @see #getDefaultDataEncoding()
	 * @generated
	 */
	void setDefaultDataEncoding(DataEncodingType value);

	/**
	 * Returns the value of the '<em><b>Parameter Time Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default time to associate each ParameterInstance with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Time Association</em>' containment reference.
	 * @see #setParameterTimeAssociation(TimeAssociationType)
	 * @see org.omg.space.xtce.XtcePackage#getDefaultsType_ParameterTimeAssociation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParameterTimeAssociation' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeAssociationType getParameterTimeAssociation();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.DefaultsType#getParameterTimeAssociation <em>Parameter Time Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Time Association</em>' containment reference.
	 * @see #getParameterTimeAssociation()
	 * @generated
	 */
	void setParameterTimeAssociation(TimeAssociationType value);

} // DefaultsType
