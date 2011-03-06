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
 * A representation of the model object '<em><b>Significance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Significance provides some cautionary information about the potential consequence of each MetaCommand.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.SignificanceType#getConsequenceLevel <em>Consequence Level</em>}</li>
 *   <li>{@link org.omg.space.xtce.SignificanceType#getReasonForWarning <em>Reason For Warning</em>}</li>
 *   <li>{@link org.omg.space.xtce.SignificanceType#getSpaceSystemAtRisk <em>Space System At Risk</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getSignificanceType()
 * @model extendedMetaData="name='SignificanceType' kind='empty'"
 * @generated
 */
public interface SignificanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Consequence Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.space.xtce.ConsequenceLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No specific meanings have been assigned to these different levels, but they mirror the Alarm levels of Telemetry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consequence Level</em>' attribute.
	 * @see org.omg.space.xtce.ConsequenceLevelType
	 * @see #isSetConsequenceLevel()
	 * @see #unsetConsequenceLevel()
	 * @see #setConsequenceLevel(ConsequenceLevelType)
	 * @see org.omg.space.xtce.XtcePackage#getSignificanceType_ConsequenceLevel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='consequenceLevel'"
	 * @generated
	 */
	ConsequenceLevelType getConsequenceLevel();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SignificanceType#getConsequenceLevel <em>Consequence Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequence Level</em>' attribute.
	 * @see org.omg.space.xtce.ConsequenceLevelType
	 * @see #isSetConsequenceLevel()
	 * @see #unsetConsequenceLevel()
	 * @see #getConsequenceLevel()
	 * @generated
	 */
	void setConsequenceLevel(ConsequenceLevelType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.SignificanceType#getConsequenceLevel <em>Consequence Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConsequenceLevel()
	 * @see #getConsequenceLevel()
	 * @see #setConsequenceLevel(ConsequenceLevelType)
	 * @generated
	 */
	void unsetConsequenceLevel();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.SignificanceType#getConsequenceLevel <em>Consequence Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Consequence Level</em>' attribute is set.
	 * @see #unsetConsequenceLevel()
	 * @see #getConsequenceLevel()
	 * @see #setConsequenceLevel(ConsequenceLevelType)
	 * @generated
	 */
	boolean isSetConsequenceLevel();

	/**
	 * Returns the value of the '<em><b>Reason For Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason For Warning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason For Warning</em>' attribute.
	 * @see #setReasonForWarning(String)
	 * @see org.omg.space.xtce.XtcePackage#getSignificanceType_ReasonForWarning()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='reasonForWarning'"
	 * @generated
	 */
	String getReasonForWarning();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SignificanceType#getReasonForWarning <em>Reason For Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason For Warning</em>' attribute.
	 * @see #getReasonForWarning()
	 * @generated
	 */
	void setReasonForWarning(String value);

	/**
	 * Returns the value of the '<em><b>Space System At Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If none is supplied, then the current SpaceSystem is assumed to be the one at risk by the issuance of this command
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Space System At Risk</em>' attribute.
	 * @see #setSpaceSystemAtRisk(String)
	 * @see org.omg.space.xtce.XtcePackage#getSignificanceType_SpaceSystemAtRisk()
	 * @model dataType="org.omg.space.xtce.NameReferenceType"
	 *        extendedMetaData="kind='attribute' name='spaceSystemAtRisk'"
	 * @generated
	 */
	String getSpaceSystemAtRisk();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SignificanceType#getSpaceSystemAtRisk <em>Space System At Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space System At Risk</em>' attribute.
	 * @see #getSpaceSystemAtRisk()
	 * @generated
	 */
	void setSpaceSystemAtRisk(String value);

} // SignificanceType
