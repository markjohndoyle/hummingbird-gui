/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sync Strategy Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.SyncStrategyType1#getFlag <em>Flag</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getSyncStrategyType1()
 * @model extendedMetaData="name='SyncStrategy_._type' kind='elementOnly'"
 * @generated
 */
public interface SyncStrategyType1 extends SyncStrategyType {
	/**
	 * Returns the value of the '<em><b>Flag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The pattern of bits used to look for frame synchronization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flag</em>' containment reference.
	 * @see #setFlag(FlagType)
	 * @see org.omg.space.xtce.XtcePackage#getSyncStrategyType1_Flag()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Flag' namespace='##targetNamespace'"
	 * @generated
	 */
	FlagType getFlag();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SyncStrategyType1#getFlag <em>Flag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flag</em>' containment reference.
	 * @see #getFlag()
	 * @generated
	 */
	void setFlag(FlagType value);

} // SyncStrategyType1
