/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains an arbitrarily large binary value 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.BinaryDataType#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getBinaryDataType()
 * @model extendedMetaData="name='BinaryDataType' kind='elementOnly'"
 * @generated
 */
public interface BinaryDataType extends BaseDataType {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(byte[])
	 * @see org.omg.space.xtce.XtcePackage#getBinaryDataType_InitialValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.HexBinary"
	 *        extendedMetaData="kind='attribute' name='initialValue'"
	 * @generated
	 */
	byte[] getInitialValue();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.BinaryDataType#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(byte[] value);

} // BinaryDataType
