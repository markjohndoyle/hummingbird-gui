/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Ref Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ArgumentRefEntryType#getArgumentRef <em>Argument Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getArgumentRefEntryType()
 * @model extendedMetaData="name='ArgumentRefEntry_._type' kind='elementOnly'"
 * @generated
 */
public interface ArgumentRefEntryType extends SequenceEntryType {
	/**
	 * Returns the value of the '<em><b>Argument Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Ref</em>' attribute.
	 * @see #setArgumentRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getArgumentRefEntryType_ArgumentRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='argumentRef'"
	 * @generated
	 */
	String getArgumentRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ArgumentRefEntryType#getArgumentRef <em>Argument Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Ref</em>' attribute.
	 * @see #getArgumentRef()
	 * @generated
	 */
	void setArgumentRef(String value);

} // ArgumentRefEntryType
