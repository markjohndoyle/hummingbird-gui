/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ArgumentType1#getArgumentTypeRef <em>Argument Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getArgumentType1()
 * @model extendedMetaData="name='Argument_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface ArgumentType1 extends NameDescriptionType {
	/**
	 * Returns the value of the '<em><b>Argument Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Type Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Type Ref</em>' attribute.
	 * @see #setArgumentTypeRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getArgumentType1_ArgumentTypeRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='argumentTypeRef'"
	 * @generated
	 */
	String getArgumentTypeRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ArgumentType1#getArgumentTypeRef <em>Argument Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Type Ref</em>' attribute.
	 * @see #getArgumentTypeRef()
	 * @generated
	 */
	void setArgumentTypeRef(String value);

} // ArgumentType1
