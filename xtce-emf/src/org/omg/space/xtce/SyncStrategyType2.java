/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sync Strategy Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.SyncStrategyType2#getSyncPattern <em>Sync Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getSyncStrategyType2()
 * @model extendedMetaData="name='SyncStrategy_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface SyncStrategyType2 extends SyncStrategyType {
	/**
	 * Returns the value of the '<em><b>Sync Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The pattern of bits used to look for frame synchronization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sync Pattern</em>' containment reference.
	 * @see #setSyncPattern(SyncPatternType1)
	 * @see org.omg.space.xtce.XtcePackage#getSyncStrategyType2_SyncPattern()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SyncPattern' namespace='##targetNamespace'"
	 * @generated
	 */
	SyncPatternType1 getSyncPattern();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SyncStrategyType2#getSyncPattern <em>Sync Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Pattern</em>' containment reference.
	 * @see #getSyncPattern()
	 * @generated
	 */
	void setSyncPattern(SyncPatternType1 value);

} // SyncStrategyType2
