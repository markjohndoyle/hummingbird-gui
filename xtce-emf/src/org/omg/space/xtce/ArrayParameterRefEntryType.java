/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Parameter Ref Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An entry that is an array parameter.  This entry is somewhat special because the entry may represent only a part of the Array and it's important to decribe which diminsions of the array come first in the sequence as well as the size of the array.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ArrayParameterRefEntryType#getDimensionList <em>Dimension List</em>}</li>
 *   <li>{@link org.omg.space.xtce.ArrayParameterRefEntryType#isLastEntryForThisArrayInstance <em>Last Entry For This Array Instance</em>}</li>
 *   <li>{@link org.omg.space.xtce.ArrayParameterRefEntryType#getParameterRef <em>Parameter Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getArrayParameterRefEntryType()
 * @model extendedMetaData="name='ArrayParameterRefEntryType' kind='elementOnly'"
 * @generated
 */
public interface ArrayParameterRefEntryType extends SequenceEntryType {
	/**
	 * Returns the value of the '<em><b>Dimension List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the Dimension list is in this form:  Array[1stDim][2ndDim][lastDim].  The last dimension is assumed to be the least significant - that is this dimension will cycle through it's combination before the next to last dimension changes.  The order MUST ascend or the array will need to be broken out entry by entry. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimension List</em>' containment reference.
	 * @see #setDimensionList(DimensionListType)
	 * @see org.omg.space.xtce.XtcePackage#getArrayParameterRefEntryType_DimensionList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DimensionList' namespace='##targetNamespace'"
	 * @generated
	 */
	DimensionListType getDimensionList();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ArrayParameterRefEntryType#getDimensionList <em>Dimension List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension List</em>' containment reference.
	 * @see #getDimensionList()
	 * @generated
	 */
	void setDimensionList(DimensionListType value);

	/**
	 * Returns the value of the '<em><b>Last Entry For This Array Instance</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Entry For This Array Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Entry For This Array Instance</em>' attribute.
	 * @see #isSetLastEntryForThisArrayInstance()
	 * @see #unsetLastEntryForThisArrayInstance()
	 * @see #setLastEntryForThisArrayInstance(boolean)
	 * @see org.omg.space.xtce.XtcePackage#getArrayParameterRefEntryType_LastEntryForThisArrayInstance()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='lastEntryForThisArrayInstance'"
	 * @generated
	 */
	boolean isLastEntryForThisArrayInstance();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ArrayParameterRefEntryType#isLastEntryForThisArrayInstance <em>Last Entry For This Array Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Entry For This Array Instance</em>' attribute.
	 * @see #isSetLastEntryForThisArrayInstance()
	 * @see #unsetLastEntryForThisArrayInstance()
	 * @see #isLastEntryForThisArrayInstance()
	 * @generated
	 */
	void setLastEntryForThisArrayInstance(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.ArrayParameterRefEntryType#isLastEntryForThisArrayInstance <em>Last Entry For This Array Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastEntryForThisArrayInstance()
	 * @see #isLastEntryForThisArrayInstance()
	 * @see #setLastEntryForThisArrayInstance(boolean)
	 * @generated
	 */
	void unsetLastEntryForThisArrayInstance();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.ArrayParameterRefEntryType#isLastEntryForThisArrayInstance <em>Last Entry For This Array Instance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Entry For This Array Instance</em>' attribute is set.
	 * @see #unsetLastEntryForThisArrayInstance()
	 * @see #isLastEntryForThisArrayInstance()
	 * @see #setLastEntryForThisArrayInstance(boolean)
	 * @generated
	 */
	boolean isSetLastEntryForThisArrayInstance();

	/**
	 * Returns the value of the '<em><b>Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Ref</em>' attribute.
	 * @see #setParameterRef(String)
	 * @see org.omg.space.xtce.XtcePackage#getArrayParameterRefEntryType_ParameterRef()
	 * @model dataType="org.omg.space.xtce.NameReferenceType" required="true"
	 *        extendedMetaData="kind='attribute' name='parameterRef'"
	 * @generated
	 */
	String getParameterRef();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ArrayParameterRefEntryType#getParameterRef <em>Parameter Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Ref</em>' attribute.
	 * @see #getParameterRef()
	 * @generated
	 */
	void setParameterRef(String value);

} // ArrayParameterRefEntryType
