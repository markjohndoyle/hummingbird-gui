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
 * A representation of the model object '<em><b>Physical Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * When it's important to know the physical address(s) on the spacecraft that this parameter may be collected from, use this.  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.PhysicalAddressType#getSubAddress <em>Sub Address</em>}</li>
 *   <li>{@link org.omg.space.xtce.PhysicalAddressType#getSourceAddress <em>Source Address</em>}</li>
 *   <li>{@link org.omg.space.xtce.PhysicalAddressType#getSourceName <em>Source Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getPhysicalAddressType()
 * @model extendedMetaData="name='PhysicalAddressType' kind='elementOnly'"
 * @generated
 */
public interface PhysicalAddressType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Address</em>' containment reference.
	 * @see #setSubAddress(PhysicalAddressType)
	 * @see org.omg.space.xtce.XtcePackage#getPhysicalAddressType_SubAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	PhysicalAddressType getSubAddress();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.PhysicalAddressType#getSubAddress <em>Sub Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Address</em>' containment reference.
	 * @see #getSubAddress()
	 * @generated
	 */
	void setSubAddress(PhysicalAddressType value);

	/**
	 * Returns the value of the '<em><b>Source Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Address</em>' attribute.
	 * @see #setSourceAddress(String)
	 * @see org.omg.space.xtce.XtcePackage#getPhysicalAddressType_SourceAddress()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sourceAddress'"
	 * @generated
	 */
	String getSourceAddress();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.PhysicalAddressType#getSourceAddress <em>Source Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Address</em>' attribute.
	 * @see #getSourceAddress()
	 * @generated
	 */
	void setSourceAddress(String value);

	/**
	 * Returns the value of the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Name</em>' attribute.
	 * @see #setSourceName(String)
	 * @see org.omg.space.xtce.XtcePackage#getPhysicalAddressType_SourceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sourceName'"
	 * @generated
	 */
	String getSourceName();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.PhysicalAddressType#getSourceName <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Name</em>' attribute.
	 * @see #getSourceName()
	 * @generated
	 */
	void setSourceName(String value);

} // PhysicalAddressType
