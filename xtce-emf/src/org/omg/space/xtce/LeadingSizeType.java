/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leading Size Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.LeadingSizeType#getSizeInBitsOfSizeTag <em>Size In Bits Of Size Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getLeadingSizeType()
 * @model extendedMetaData="name='LeadingSize_._type' kind='empty'"
 * @generated
 */
public interface LeadingSizeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Size In Bits Of Size Tag</b></em>' attribute.
	 * The default value is <code>"16"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size In Bits Of Size Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size In Bits Of Size Tag</em>' attribute.
	 * @see #isSetSizeInBitsOfSizeTag()
	 * @see #unsetSizeInBitsOfSizeTag()
	 * @see #setSizeInBitsOfSizeTag(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getLeadingSizeType_SizeInBitsOfSizeTag()
	 * @model default="16" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='sizeInBitsOfSizeTag'"
	 * @generated
	 */
	BigInteger getSizeInBitsOfSizeTag();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.LeadingSizeType#getSizeInBitsOfSizeTag <em>Size In Bits Of Size Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In Bits Of Size Tag</em>' attribute.
	 * @see #isSetSizeInBitsOfSizeTag()
	 * @see #unsetSizeInBitsOfSizeTag()
	 * @see #getSizeInBitsOfSizeTag()
	 * @generated
	 */
	void setSizeInBitsOfSizeTag(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.LeadingSizeType#getSizeInBitsOfSizeTag <em>Size In Bits Of Size Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeInBitsOfSizeTag()
	 * @see #getSizeInBitsOfSizeTag()
	 * @see #setSizeInBitsOfSizeTag(BigInteger)
	 * @generated
	 */
	void unsetSizeInBitsOfSizeTag();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.LeadingSizeType#getSizeInBitsOfSizeTag <em>Size In Bits Of Size Tag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size In Bits Of Size Tag</em>' attribute is set.
	 * @see #unsetSizeInBitsOfSizeTag()
	 * @see #getSizeInBitsOfSizeTag()
	 * @see #setSizeInBitsOfSizeTag(BigInteger)
	 * @generated
	 */
	boolean isSetSizeInBitsOfSizeTag();

} // LeadingSizeType
