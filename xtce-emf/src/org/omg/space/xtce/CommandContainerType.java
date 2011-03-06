/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Container Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Key = Command Op Code.  Each MetaCommand may have one CommandContainer.  The sequence may now contain command fields
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.CommandContainerType#getEntryList <em>Entry List</em>}</li>
 *   <li>{@link org.omg.space.xtce.CommandContainerType#getBaseContainer <em>Base Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getCommandContainerType()
 * @model extendedMetaData="name='CommandContainerType' kind='elementOnly'"
 * @generated
 */
public interface CommandContainerType extends ContainerType {
	/**
	 * Returns the value of the '<em><b>Entry List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry List</em>' containment reference.
	 * @see #setEntryList(CommandContainerEntryListType)
	 * @see org.omg.space.xtce.XtcePackage#getCommandContainerType_EntryList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EntryList' namespace='##targetNamespace'"
	 * @generated
	 */
	CommandContainerEntryListType getEntryList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CommandContainerType#getEntryList <em>Entry List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry List</em>' containment reference.
	 * @see #getEntryList()
	 * @generated
	 */
	void setEntryList(CommandContainerEntryListType value);

	/**
	 * Returns the value of the '<em><b>Base Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Container</em>' containment reference.
	 * @see #setBaseContainer(BaseContainerType)
	 * @see org.omg.space.xtce.XtcePackage#getCommandContainerType_BaseContainer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BaseContainer' namespace='##targetNamespace'"
	 * @generated
	 */
	BaseContainerType getBaseContainer();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.CommandContainerType#getBaseContainer <em>Base Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Container</em>' containment reference.
	 * @see #getBaseContainer()
	 * @generated
	 */
	void setBaseContainer(BaseContainerType value);

} // CommandContainerType
