/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Container Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A list of raw parameters, parameter segments, stream segments, containers, or container segments.  Sequence containers may inherit from other sequence containers; when they do, the sequence in the parent SequenceContainer is 'inherited' and if the location of entries in the child sequence is not specified, it is assumed to start where the parent sequence ended.  Parent sequence containers may be marked as "abstract".  The idle pattern is part of any unallocated space in the Container.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.SequenceContainerType#getEntryList <em>Entry List</em>}</li>
 *   <li>{@link org.omg.space.xtce.SequenceContainerType#getBaseContainer <em>Base Container</em>}</li>
 *   <li>{@link org.omg.space.xtce.SequenceContainerType#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.omg.space.xtce.SequenceContainerType#getIdlePattern <em>Idle Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getSequenceContainerType()
 * @model extendedMetaData="name='SequenceContainerType' kind='elementOnly'"
 * @generated
 */
public interface SequenceContainerType extends ContainerType {
	/**
	 * Returns the value of the '<em><b>Entry List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry List</em>' containment reference.
	 * @see #setEntryList(EntryListType)
	 * @see org.omg.space.xtce.XtcePackage#getSequenceContainerType_EntryList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EntryList' namespace='##targetNamespace'"
	 * @generated
	 */
	EntryListType getEntryList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SequenceContainerType#getEntryList <em>Entry List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry List</em>' containment reference.
	 * @see #getEntryList()
	 * @generated
	 */
	void setEntryList(EntryListType value);

	/**
	 * Returns the value of the '<em><b>Base Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Container</em>' containment reference.
	 * @see #setBaseContainer(BaseContainerType1)
	 * @see org.omg.space.xtce.XtcePackage#getSequenceContainerType_BaseContainer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BaseContainer' namespace='##targetNamespace'"
	 * @generated
	 */
	BaseContainerType1 getBaseContainer();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SequenceContainerType#getBaseContainer <em>Base Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Container</em>' containment reference.
	 * @see #getBaseContainer()
	 * @generated
	 */
	void setBaseContainer(BaseContainerType1 value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #setAbstract(boolean)
	 * @see org.omg.space.xtce.XtcePackage#getSequenceContainerType_Abstract()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='abstract'"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SequenceContainerType#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.SequenceContainerType#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbstract()
	 * @see #isAbstract()
	 * @see #setAbstract(boolean)
	 * @generated
	 */
	void unsetAbstract();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.SequenceContainerType#isAbstract <em>Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Abstract</em>' attribute is set.
	 * @see #unsetAbstract()
	 * @see #isAbstract()
	 * @see #setAbstract(boolean)
	 * @generated
	 */
	boolean isSetAbstract();

	/**
	 * Returns the value of the '<em><b>Idle Pattern</b></em>' attribute.
	 * The default value is <code>"0x0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idle Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idle Pattern</em>' attribute.
	 * @see #isSetIdlePattern()
	 * @see #unsetIdlePattern()
	 * @see #setIdlePattern(Object)
	 * @see org.omg.space.xtce.XtcePackage#getSequenceContainerType_IdlePattern()
	 * @model default="0x0" unsettable="true" dataType="org.omg.space.xtce.FixedIntegerValueType"
	 *        extendedMetaData="kind='attribute' name='idlePattern'"
	 * @generated
	 */
	Object getIdlePattern();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SequenceContainerType#getIdlePattern <em>Idle Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idle Pattern</em>' attribute.
	 * @see #isSetIdlePattern()
	 * @see #unsetIdlePattern()
	 * @see #getIdlePattern()
	 * @generated
	 */
	void setIdlePattern(Object value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.SequenceContainerType#getIdlePattern <em>Idle Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIdlePattern()
	 * @see #getIdlePattern()
	 * @see #setIdlePattern(Object)
	 * @generated
	 */
	void unsetIdlePattern();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.SequenceContainerType#getIdlePattern <em>Idle Pattern</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Idle Pattern</em>' attribute is set.
	 * @see #unsetIdlePattern()
	 * @see #getIdlePattern()
	 * @see #setIdlePattern(Object)
	 * @generated
	 */
	boolean isSetIdlePattern();

} // SequenceContainerType
