/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sync Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Sync Strategy specifies the strategy on how to find frames within a stream of PCM data.  The sync strategy is based upon a state machine that begins in the 'Search' state until the first sync marker is found.  Then it goes into the 'Verify' state until a specified number of successive good sync markers are found.  Then, the state machine goes into the 'Lock' state, in the 'Lock' state frames are considered good.  Should a sync marker be missed in the 'Lock' state, the state machine will transition into the 'Check' state, if the next sync marker is where it's expected within a specified number of frames, then the state machine will transition back to the 'Lock' state, it not it will transition back to 'Search'.  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.SyncStrategyType#getAutoInvert <em>Auto Invert</em>}</li>
 *   <li>{@link org.omg.space.xtce.SyncStrategyType#getCheckToLockGoodFrames <em>Check To Lock Good Frames</em>}</li>
 *   <li>{@link org.omg.space.xtce.SyncStrategyType#getMaxBitErrorsInSyncPattern <em>Max Bit Errors In Sync Pattern</em>}</li>
 *   <li>{@link org.omg.space.xtce.SyncStrategyType#getVerifyToLockGoodFrames <em>Verify To Lock Good Frames</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getSyncStrategyType()
 * @model extendedMetaData="name='SyncStrategyType' kind='elementOnly'"
 * @generated
 */
public interface SyncStrategyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Auto Invert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * After serching for the frame sync marker for some number of bitss, it may be desirable to invert the incoming data, and then look for frame sync.  In some cases this will require an external algorithm
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Invert</em>' containment reference.
	 * @see #setAutoInvert(AutoInvertType)
	 * @see org.omg.space.xtce.XtcePackage#getSyncStrategyType_AutoInvert()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AutoInvert' namespace='##targetNamespace'"
	 * @generated
	 */
	AutoInvertType getAutoInvert();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SyncStrategyType#getAutoInvert <em>Auto Invert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Invert</em>' containment reference.
	 * @see #getAutoInvert()
	 * @generated
	 */
	void setAutoInvert(AutoInvertType value);

	/**
	 * Returns the value of the '<em><b>Check To Lock Good Frames</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check To Lock Good Frames</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check To Lock Good Frames</em>' attribute.
	 * @see #isSetCheckToLockGoodFrames()
	 * @see #unsetCheckToLockGoodFrames()
	 * @see #setCheckToLockGoodFrames(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getSyncStrategyType_CheckToLockGoodFrames()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='checkToLockGoodFrames'"
	 * @generated
	 */
	BigInteger getCheckToLockGoodFrames();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SyncStrategyType#getCheckToLockGoodFrames <em>Check To Lock Good Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check To Lock Good Frames</em>' attribute.
	 * @see #isSetCheckToLockGoodFrames()
	 * @see #unsetCheckToLockGoodFrames()
	 * @see #getCheckToLockGoodFrames()
	 * @generated
	 */
	void setCheckToLockGoodFrames(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.SyncStrategyType#getCheckToLockGoodFrames <em>Check To Lock Good Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCheckToLockGoodFrames()
	 * @see #getCheckToLockGoodFrames()
	 * @see #setCheckToLockGoodFrames(BigInteger)
	 * @generated
	 */
	void unsetCheckToLockGoodFrames();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.SyncStrategyType#getCheckToLockGoodFrames <em>Check To Lock Good Frames</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Check To Lock Good Frames</em>' attribute is set.
	 * @see #unsetCheckToLockGoodFrames()
	 * @see #getCheckToLockGoodFrames()
	 * @see #setCheckToLockGoodFrames(BigInteger)
	 * @generated
	 */
	boolean isSetCheckToLockGoodFrames();

	/**
	 * Returns the value of the '<em><b>Max Bit Errors In Sync Pattern</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of bit errors in the sync pattern (marker).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Bit Errors In Sync Pattern</em>' attribute.
	 * @see #isSetMaxBitErrorsInSyncPattern()
	 * @see #unsetMaxBitErrorsInSyncPattern()
	 * @see #setMaxBitErrorsInSyncPattern(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getSyncStrategyType_MaxBitErrorsInSyncPattern()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='maxBitErrorsInSyncPattern'"
	 * @generated
	 */
	BigInteger getMaxBitErrorsInSyncPattern();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SyncStrategyType#getMaxBitErrorsInSyncPattern <em>Max Bit Errors In Sync Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Bit Errors In Sync Pattern</em>' attribute.
	 * @see #isSetMaxBitErrorsInSyncPattern()
	 * @see #unsetMaxBitErrorsInSyncPattern()
	 * @see #getMaxBitErrorsInSyncPattern()
	 * @generated
	 */
	void setMaxBitErrorsInSyncPattern(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.SyncStrategyType#getMaxBitErrorsInSyncPattern <em>Max Bit Errors In Sync Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxBitErrorsInSyncPattern()
	 * @see #getMaxBitErrorsInSyncPattern()
	 * @see #setMaxBitErrorsInSyncPattern(BigInteger)
	 * @generated
	 */
	void unsetMaxBitErrorsInSyncPattern();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.SyncStrategyType#getMaxBitErrorsInSyncPattern <em>Max Bit Errors In Sync Pattern</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Bit Errors In Sync Pattern</em>' attribute is set.
	 * @see #unsetMaxBitErrorsInSyncPattern()
	 * @see #getMaxBitErrorsInSyncPattern()
	 * @see #setMaxBitErrorsInSyncPattern(BigInteger)
	 * @generated
	 */
	boolean isSetMaxBitErrorsInSyncPattern();

	/**
	 * Returns the value of the '<em><b>Verify To Lock Good Frames</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verify To Lock Good Frames</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify To Lock Good Frames</em>' attribute.
	 * @see #isSetVerifyToLockGoodFrames()
	 * @see #unsetVerifyToLockGoodFrames()
	 * @see #setVerifyToLockGoodFrames(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getSyncStrategyType_VerifyToLockGoodFrames()
	 * @model default="4" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='verifyToLockGoodFrames'"
	 * @generated
	 */
	BigInteger getVerifyToLockGoodFrames();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.SyncStrategyType#getVerifyToLockGoodFrames <em>Verify To Lock Good Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verify To Lock Good Frames</em>' attribute.
	 * @see #isSetVerifyToLockGoodFrames()
	 * @see #unsetVerifyToLockGoodFrames()
	 * @see #getVerifyToLockGoodFrames()
	 * @generated
	 */
	void setVerifyToLockGoodFrames(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.SyncStrategyType#getVerifyToLockGoodFrames <em>Verify To Lock Good Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerifyToLockGoodFrames()
	 * @see #getVerifyToLockGoodFrames()
	 * @see #setVerifyToLockGoodFrames(BigInteger)
	 * @generated
	 */
	void unsetVerifyToLockGoodFrames();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.SyncStrategyType#getVerifyToLockGoodFrames <em>Verify To Lock Good Frames</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Verify To Lock Good Frames</em>' attribute is set.
	 * @see #unsetVerifyToLockGoodFrames()
	 * @see #getVerifyToLockGoodFrames()
	 * @see #setVerifyToLockGoodFrames(BigInteger)
	 * @generated
	 */
	boolean isSetVerifyToLockGoodFrames();

} // SyncStrategyType
