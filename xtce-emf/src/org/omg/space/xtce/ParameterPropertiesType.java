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
 * A representation of the model object '<em><b>Parameter Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A wrapper for those properties that are unique to telemetry parameters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ParameterPropertiesType#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterPropertiesType#getValidityCondition <em>Validity Condition</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterPropertiesType#getPhysicalAddressSet <em>Physical Address Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterPropertiesType#getTimeAssociation <em>Time Association</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterPropertiesType#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.omg.space.xtce.ParameterPropertiesType#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getParameterPropertiesType()
 * @model extendedMetaData="name='ParameterPropertiesType' kind='elementOnly'"
 * @generated
 */
public interface ParameterPropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional.  Normally used when the database is built in a flat, non-hierarchical format
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.omg.space.xtce.XtcePackage#getParameterPropertiesType_SystemName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SystemName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterPropertiesType#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Validity Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional condition that must be true for this Parameter to be valid
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Condition</em>' containment reference.
	 * @see #setValidityCondition(MatchCriteriaType)
	 * @see org.omg.space.xtce.XtcePackage#getParameterPropertiesType_ValidityCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValidityCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	MatchCriteriaType getValidityCondition();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterPropertiesType#getValidityCondition <em>Validity Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Condition</em>' containment reference.
	 * @see #getValidityCondition()
	 * @generated
	 */
	void setValidityCondition(MatchCriteriaType value);

	/**
	 * Returns the value of the '<em><b>Physical Address Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more physical addresses may be associated with each Parameter.  Examples of phyical addresses include a location on the spacecraft or a location on a data collection bus. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Address Set</em>' containment reference.
	 * @see #setPhysicalAddressSet(PhysicalAddressSetType)
	 * @see org.omg.space.xtce.XtcePackage#getParameterPropertiesType_PhysicalAddressSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PhysicalAddressSet' namespace='##targetNamespace'"
	 * @generated
	 */
	PhysicalAddressSetType getPhysicalAddressSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterPropertiesType#getPhysicalAddressSet <em>Physical Address Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Address Set</em>' containment reference.
	 * @see #getPhysicalAddressSet()
	 * @generated
	 */
	void setPhysicalAddressSet(PhysicalAddressSetType value);

	/**
	 * Returns the value of the '<em><b>Time Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This time will overide any Default value for TimeAssociation. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Association</em>' containment reference.
	 * @see #setTimeAssociation(TimeAssociationType)
	 * @see org.omg.space.xtce.XtcePackage#getParameterPropertiesType_TimeAssociation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TimeAssociation' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeAssociationType getTimeAssociation();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterPropertiesType#getTimeAssociation <em>Time Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Association</em>' containment reference.
	 * @see #getTimeAssociation()
	 * @generated
	 */
	void setTimeAssociation(TimeAssociationType value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.space.xtce.DataSourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A telemetered Parameter is one that will have values in telemetry.  A derived Parameter is one that is calculated, usually be an Algorithm.  A constant Parameter is  one that is used as a constant in the system (e.g. a vehicle id).  A local Parameter is one that is used purely on the ground (e.g. a ground command counter).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see org.omg.space.xtce.DataSourceType
	 * @see #isSetDataSource()
	 * @see #unsetDataSource()
	 * @see #setDataSource(DataSourceType)
	 * @see org.omg.space.xtce.XtcePackage#getParameterPropertiesType_DataSource()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dataSource'"
	 * @generated
	 */
	DataSourceType getDataSource();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterPropertiesType#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see org.omg.space.xtce.DataSourceType
	 * @see #isSetDataSource()
	 * @see #unsetDataSource()
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSourceType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.ParameterPropertiesType#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSource()
	 * @see #getDataSource()
	 * @see #setDataSource(DataSourceType)
	 * @generated
	 */
	void unsetDataSource();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.ParameterPropertiesType#getDataSource <em>Data Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Source</em>' attribute is set.
	 * @see #unsetDataSource()
	 * @see #getDataSource()
	 * @see #setDataSource(DataSourceType)
	 * @generated
	 */
	boolean isSetDataSource();

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Parameter marked as 'readOnly' true is constant and non-settable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #isSetReadOnly()
	 * @see #unsetReadOnly()
	 * @see #setReadOnly(boolean)
	 * @see org.omg.space.xtce.XtcePackage#getParameterPropertiesType_ReadOnly()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='readOnly'"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ParameterPropertiesType#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isSetReadOnly()
	 * @see #unsetReadOnly()
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.ParameterPropertiesType#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadOnly()
	 * @see #isReadOnly()
	 * @see #setReadOnly(boolean)
	 * @generated
	 */
	void unsetReadOnly();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.ParameterPropertiesType#isReadOnly <em>Read Only</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Read Only</em>' attribute is set.
	 * @see #unsetReadOnly()
	 * @see #isReadOnly()
	 * @see #setReadOnly(boolean)
	 * @generated
	 */
	boolean isSetReadOnly();

} // ParameterPropertiesType
