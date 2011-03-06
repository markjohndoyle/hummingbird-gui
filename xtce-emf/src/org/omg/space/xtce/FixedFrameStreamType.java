/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Frame Stream Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * For streams that contain a series of frames with a fixed frame length where the frames are found by looking for a marker in the data.  This marker is sometimes called the frame sync pattern and sometimes the Asynchronous Sync Marker (ASM).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.FixedFrameStreamType#getSyncStrategy <em>Sync Strategy</em>}</li>
 *   <li>{@link org.omg.space.xtce.FixedFrameStreamType#getFrameLengthInBits <em>Frame Length In Bits</em>}</li>
 *   <li>{@link org.omg.space.xtce.FixedFrameStreamType#getSyncApertureInBits <em>Sync Aperture In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getFixedFrameStreamType()
 * @model extendedMetaData="name='FixedFrameStreamType' kind='elementOnly'"
 * @generated
 */
public interface FixedFrameStreamType extends FrameStreamType {
	/**
	 * Returns the value of the '<em><b>Sync Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync Strategy</em>' containment reference.
	 * @see #setSyncStrategy(SyncStrategyType2)
	 * @see org.omg.space.xtce.XtcePackage#getFixedFrameStreamType_SyncStrategy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SyncStrategy' namespace='##targetNamespace'"
	 * @generated
	 */
	SyncStrategyType2 getSyncStrategy();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.FixedFrameStreamType#getSyncStrategy <em>Sync Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Strategy</em>' containment reference.
	 * @see #getSyncStrategy()
	 * @generated
	 */
	void setSyncStrategy(SyncStrategyType2 value);

	/**
	 * Returns the value of the '<em><b>Frame Length In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Length In Bits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Length In Bits</em>' attribute.
	 * @see #isSetFrameLengthInBits()
	 * @see #unsetFrameLengthInBits()
	 * @see #setFrameLengthInBits(long)
	 * @see org.omg.space.xtce.XtcePackage#getFixedFrameStreamType_FrameLengthInBits()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='attribute' name='frameLengthInBits'"
	 * @generated
	 */
	long getFrameLengthInBits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.FixedFrameStreamType#getFrameLengthInBits <em>Frame Length In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Length In Bits</em>' attribute.
	 * @see #isSetFrameLengthInBits()
	 * @see #unsetFrameLengthInBits()
	 * @see #getFrameLengthInBits()
	 * @generated
	 */
	void setFrameLengthInBits(long value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.FixedFrameStreamType#getFrameLengthInBits <em>Frame Length In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrameLengthInBits()
	 * @see #getFrameLengthInBits()
	 * @see #setFrameLengthInBits(long)
	 * @generated
	 */
	void unsetFrameLengthInBits();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.FixedFrameStreamType#getFrameLengthInBits <em>Frame Length In Bits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame Length In Bits</em>' attribute is set.
	 * @see #unsetFrameLengthInBits()
	 * @see #getFrameLengthInBits()
	 * @see #setFrameLengthInBits(long)
	 * @generated
	 */
	boolean isSetFrameLengthInBits();

	/**
	 * Returns the value of the '<em><b>Sync Aperture In Bits</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowed slip (in bits) in either direction for the sync pattern
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sync Aperture In Bits</em>' attribute.
	 * @see #isSetSyncApertureInBits()
	 * @see #unsetSyncApertureInBits()
	 * @see #setSyncApertureInBits(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getFixedFrameStreamType_SyncApertureInBits()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='syncApertureInBits'"
	 * @generated
	 */
	BigInteger getSyncApertureInBits();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.FixedFrameStreamType#getSyncApertureInBits <em>Sync Aperture In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Aperture In Bits</em>' attribute.
	 * @see #isSetSyncApertureInBits()
	 * @see #unsetSyncApertureInBits()
	 * @see #getSyncApertureInBits()
	 * @generated
	 */
	void setSyncApertureInBits(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.FixedFrameStreamType#getSyncApertureInBits <em>Sync Aperture In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSyncApertureInBits()
	 * @see #getSyncApertureInBits()
	 * @see #setSyncApertureInBits(BigInteger)
	 * @generated
	 */
	void unsetSyncApertureInBits();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.FixedFrameStreamType#getSyncApertureInBits <em>Sync Aperture In Bits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sync Aperture In Bits</em>' attribute is set.
	 * @see #unsetSyncApertureInBits()
	 * @see #getSyncApertureInBits()
	 * @see #setSyncApertureInBits(BigInteger)
	 * @generated
	 */
	boolean isSetSyncApertureInBits();

} // FixedFrameStreamType
