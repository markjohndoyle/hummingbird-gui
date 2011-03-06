/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Frame Sync Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Sync Strategy specifies the requirements to deem a PCM Fixed Frame Stream "in-sync" or out of sync.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.FixedFrameSyncStrategyType#getSyncPattern <em>Sync Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getFixedFrameSyncStrategyType()
 * @model extendedMetaData="name='FixedFrameSyncStrategyType' kind='elementOnly'"
 * @generated
 */
public interface FixedFrameSyncStrategyType extends SyncStrategyType {
	/**
	 * Returns the value of the '<em><b>Sync Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The pattern of bits used to look for frame synchronization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sync Pattern</em>' containment reference.
	 * @see #setSyncPattern(SyncPatternType)
	 * @see org.omg.space.xtce.XtcePackage#getFixedFrameSyncStrategyType_SyncPattern()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SyncPattern' namespace='##targetNamespace'"
	 * @generated
	 */
	SyncPatternType getSyncPattern();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.FixedFrameSyncStrategyType#getSyncPattern <em>Sync Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Pattern</em>' containment reference.
	 * @see #getSyncPattern()
	 * @generated
	 */
	void setSyncPattern(SyncPatternType value);

} // FixedFrameSyncStrategyType
