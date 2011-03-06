/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Frame Stream Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * For streams that contain a series of frames with a variable frame length where the frames are found by looking for a series of one's or zero's (usually one's).  The series is called the flag.   in the PCM stream that are usually made to be illegal in the PCM stream by zero or one bit insertion.  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.VariableFrameStreamType#getSyncStrategy <em>Sync Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getVariableFrameStreamType()
 * @model extendedMetaData="name='VariableFrameStreamType' kind='elementOnly'"
 * @generated
 */
public interface VariableFrameStreamType extends FrameStreamType {
	/**
	 * Returns the value of the '<em><b>Sync Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync Strategy</em>' containment reference.
	 * @see #setSyncStrategy(SyncStrategyType1)
	 * @see org.omg.space.xtce.XtcePackage#getVariableFrameStreamType_SyncStrategy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SyncStrategy' namespace='##targetNamespace'"
	 * @generated
	 */
	SyncStrategyType1 getSyncStrategy();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.VariableFrameStreamType#getSyncStrategy <em>Sync Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Strategy</em>' containment reference.
	 * @see #getSyncStrategy()
	 * @generated
	 */
	void setSyncStrategy(SyncStrategyType1 value);

} // VariableFrameStreamType
