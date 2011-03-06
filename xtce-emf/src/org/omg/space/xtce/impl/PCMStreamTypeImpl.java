/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.space.xtce.PCMStreamType;
import org.omg.space.xtce.PcmTypeType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Stream Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.PCMStreamTypeImpl#getBitRateInBPS <em>Bit Rate In BPS</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.PCMStreamTypeImpl#isInverted <em>Inverted</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.PCMStreamTypeImpl#getPcmType <em>Pcm Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PCMStreamTypeImpl extends NameDescriptionTypeImpl implements PCMStreamType {
	/**
	 * The default value of the '{@link #getBitRateInBPS() <em>Bit Rate In BPS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitRateInBPS()
	 * @generated
	 * @ordered
	 */
	protected static final double BIT_RATE_IN_BPS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBitRateInBPS() <em>Bit Rate In BPS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitRateInBPS()
	 * @generated
	 * @ordered
	 */
	protected double bitRateInBPS = BIT_RATE_IN_BPS_EDEFAULT;

	/**
	 * This is true if the Bit Rate In BPS attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bitRateInBPSESet;

	/**
	 * The default value of the '{@link #isInverted() <em>Inverted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInverted() <em>Inverted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverted()
	 * @generated
	 * @ordered
	 */
	protected boolean inverted = INVERTED_EDEFAULT;

	/**
	 * This is true if the Inverted attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean invertedESet;

	/**
	 * The default value of the '{@link #getPcmType() <em>Pcm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmType()
	 * @generated
	 * @ordered
	 */
	protected static final PcmTypeType PCM_TYPE_EDEFAULT = PcmTypeType.NRZL;

	/**
	 * The cached value of the '{@link #getPcmType() <em>Pcm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmType()
	 * @generated
	 * @ordered
	 */
	protected PcmTypeType pcmType = PCM_TYPE_EDEFAULT;

	/**
	 * This is true if the Pcm Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pcmTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMStreamTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getPCMStreamType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBitRateInBPS() {
		return bitRateInBPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitRateInBPS(double newBitRateInBPS) {
		double oldBitRateInBPS = bitRateInBPS;
		bitRateInBPS = newBitRateInBPS;
		boolean oldBitRateInBPSESet = bitRateInBPSESet;
		bitRateInBPSESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PCM_STREAM_TYPE__BIT_RATE_IN_BPS, oldBitRateInBPS, bitRateInBPS, !oldBitRateInBPSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBitRateInBPS() {
		double oldBitRateInBPS = bitRateInBPS;
		boolean oldBitRateInBPSESet = bitRateInBPSESet;
		bitRateInBPS = BIT_RATE_IN_BPS_EDEFAULT;
		bitRateInBPSESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.PCM_STREAM_TYPE__BIT_RATE_IN_BPS, oldBitRateInBPS, BIT_RATE_IN_BPS_EDEFAULT, oldBitRateInBPSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBitRateInBPS() {
		return bitRateInBPSESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInverted() {
		return inverted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverted(boolean newInverted) {
		boolean oldInverted = inverted;
		inverted = newInverted;
		boolean oldInvertedESet = invertedESet;
		invertedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PCM_STREAM_TYPE__INVERTED, oldInverted, inverted, !oldInvertedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInverted() {
		boolean oldInverted = inverted;
		boolean oldInvertedESet = invertedESet;
		inverted = INVERTED_EDEFAULT;
		invertedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.PCM_STREAM_TYPE__INVERTED, oldInverted, INVERTED_EDEFAULT, oldInvertedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInverted() {
		return invertedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmTypeType getPcmType() {
		return pcmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcmType(PcmTypeType newPcmType) {
		PcmTypeType oldPcmType = pcmType;
		pcmType = newPcmType == null ? PCM_TYPE_EDEFAULT : newPcmType;
		boolean oldPcmTypeESet = pcmTypeESet;
		pcmTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.PCM_STREAM_TYPE__PCM_TYPE, oldPcmType, pcmType, !oldPcmTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPcmType() {
		PcmTypeType oldPcmType = pcmType;
		boolean oldPcmTypeESet = pcmTypeESet;
		pcmType = PCM_TYPE_EDEFAULT;
		pcmTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.PCM_STREAM_TYPE__PCM_TYPE, oldPcmType, PCM_TYPE_EDEFAULT, oldPcmTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPcmType() {
		return pcmTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.PCM_STREAM_TYPE__BIT_RATE_IN_BPS:
				return getBitRateInBPS();
			case XtcePackage.PCM_STREAM_TYPE__INVERTED:
				return isInverted();
			case XtcePackage.PCM_STREAM_TYPE__PCM_TYPE:
				return getPcmType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XtcePackage.PCM_STREAM_TYPE__BIT_RATE_IN_BPS:
				setBitRateInBPS((Double)newValue);
				return;
			case XtcePackage.PCM_STREAM_TYPE__INVERTED:
				setInverted((Boolean)newValue);
				return;
			case XtcePackage.PCM_STREAM_TYPE__PCM_TYPE:
				setPcmType((PcmTypeType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XtcePackage.PCM_STREAM_TYPE__BIT_RATE_IN_BPS:
				unsetBitRateInBPS();
				return;
			case XtcePackage.PCM_STREAM_TYPE__INVERTED:
				unsetInverted();
				return;
			case XtcePackage.PCM_STREAM_TYPE__PCM_TYPE:
				unsetPcmType();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XtcePackage.PCM_STREAM_TYPE__BIT_RATE_IN_BPS:
				return isSetBitRateInBPS();
			case XtcePackage.PCM_STREAM_TYPE__INVERTED:
				return isSetInverted();
			case XtcePackage.PCM_STREAM_TYPE__PCM_TYPE:
				return isSetPcmType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bitRateInBPS: ");
		if (bitRateInBPSESet) result.append(bitRateInBPS); else result.append("<unset>");
		result.append(", inverted: ");
		if (invertedESet) result.append(inverted); else result.append("<unset>");
		result.append(", pcmType: ");
		if (pcmTypeESet) result.append(pcmType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PCMStreamTypeImpl
