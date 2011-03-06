/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Stream Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A PCM Stream Type is the high level definition for all Pulse Code Modulated (PCM) (i.e., binary) streams.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.PCMStreamType#getBitRateInBPS <em>Bit Rate In BPS</em>}</li>
 *   <li>{@link org.omg.space.xtce.PCMStreamType#isInverted <em>Inverted</em>}</li>
 *   <li>{@link org.omg.space.xtce.PCMStreamType#getPcmType <em>Pcm Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getPCMStreamType()
 * @model abstract="true"
 *        extendedMetaData="name='PCMStreamType' kind='elementOnly'"
 * @generated
 */
public interface PCMStreamType extends NameDescriptionType {
	/**
	 * Returns the value of the '<em><b>Bit Rate In BPS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Rate In BPS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Rate In BPS</em>' attribute.
	 * @see #isSetBitRateInBPS()
	 * @see #unsetBitRateInBPS()
	 * @see #setBitRateInBPS(double)
	 * @see org.omg.space.xtce.XtcePackage#getPCMStreamType_BitRateInBPS()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='bitRateInBPS'"
	 * @generated
	 */
	double getBitRateInBPS();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.PCMStreamType#getBitRateInBPS <em>Bit Rate In BPS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Rate In BPS</em>' attribute.
	 * @see #isSetBitRateInBPS()
	 * @see #unsetBitRateInBPS()
	 * @see #getBitRateInBPS()
	 * @generated
	 */
	void setBitRateInBPS(double value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.PCMStreamType#getBitRateInBPS <em>Bit Rate In BPS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBitRateInBPS()
	 * @see #getBitRateInBPS()
	 * @see #setBitRateInBPS(double)
	 * @generated
	 */
	void unsetBitRateInBPS();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.PCMStreamType#getBitRateInBPS <em>Bit Rate In BPS</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bit Rate In BPS</em>' attribute is set.
	 * @see #unsetBitRateInBPS()
	 * @see #getBitRateInBPS()
	 * @see #setBitRateInBPS(double)
	 * @generated
	 */
	boolean isSetBitRateInBPS();

	/**
	 * Returns the value of the '<em><b>Inverted</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverted</em>' attribute.
	 * @see #isSetInverted()
	 * @see #unsetInverted()
	 * @see #setInverted(boolean)
	 * @see org.omg.space.xtce.XtcePackage#getPCMStreamType_Inverted()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='inverted'"
	 * @generated
	 */
	boolean isInverted();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.PCMStreamType#isInverted <em>Inverted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverted</em>' attribute.
	 * @see #isSetInverted()
	 * @see #unsetInverted()
	 * @see #isInverted()
	 * @generated
	 */
	void setInverted(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.PCMStreamType#isInverted <em>Inverted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInverted()
	 * @see #isInverted()
	 * @see #setInverted(boolean)
	 * @generated
	 */
	void unsetInverted();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.PCMStreamType#isInverted <em>Inverted</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inverted</em>' attribute is set.
	 * @see #unsetInverted()
	 * @see #isInverted()
	 * @see #setInverted(boolean)
	 * @generated
	 */
	boolean isSetInverted();

	/**
	 * Returns the value of the '<em><b>Pcm Type</b></em>' attribute.
	 * The default value is <code>"NRZL"</code>.
	 * The literals are from the enumeration {@link org.omg.space.xtce.PcmTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcm Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Type</em>' attribute.
	 * @see org.omg.space.xtce.PcmTypeType
	 * @see #isSetPcmType()
	 * @see #unsetPcmType()
	 * @see #setPcmType(PcmTypeType)
	 * @see org.omg.space.xtce.XtcePackage#getPCMStreamType_PcmType()
	 * @model default="NRZL" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='pcmType'"
	 * @generated
	 */
	PcmTypeType getPcmType();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.PCMStreamType#getPcmType <em>Pcm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Type</em>' attribute.
	 * @see org.omg.space.xtce.PcmTypeType
	 * @see #isSetPcmType()
	 * @see #unsetPcmType()
	 * @see #getPcmType()
	 * @generated
	 */
	void setPcmType(PcmTypeType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.PCMStreamType#getPcmType <em>Pcm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPcmType()
	 * @see #getPcmType()
	 * @see #setPcmType(PcmTypeType)
	 * @generated
	 */
	void unsetPcmType();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.PCMStreamType#getPcmType <em>Pcm Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pcm Type</em>' attribute is set.
	 * @see #unsetPcmType()
	 * @see #getPcmType()
	 * @see #setPcmType(PcmTypeType)
	 * @generated
	 */
	boolean isSetPcmType();

} // PCMStreamType
