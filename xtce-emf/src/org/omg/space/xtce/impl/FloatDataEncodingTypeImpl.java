/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.space.xtce.CalibratorType;
import org.omg.space.xtce.ContextCalibratorListType4;
import org.omg.space.xtce.EncodingType3;
import org.omg.space.xtce.FloatDataEncodingType;
import org.omg.space.xtce.SizeInBitsType2;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float Data Encoding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.FloatDataEncodingTypeImpl#getDefaultCalibrator <em>Default Calibrator</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.FloatDataEncodingTypeImpl#getContextCalibratorList <em>Context Calibrator List</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.FloatDataEncodingTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.FloatDataEncodingTypeImpl#getSizeInBits <em>Size In Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FloatDataEncodingTypeImpl extends DataEncodingTypeImpl implements FloatDataEncodingType {
	/**
	 * The cached value of the '{@link #getDefaultCalibrator() <em>Default Calibrator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCalibrator()
	 * @generated
	 * @ordered
	 */
	protected CalibratorType defaultCalibrator;

	/**
	 * The cached value of the '{@link #getContextCalibratorList() <em>Context Calibrator List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextCalibratorList()
	 * @generated
	 * @ordered
	 */
	protected ContextCalibratorListType4 contextCalibratorList;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final EncodingType3 ENCODING_EDEFAULT = EncodingType3.IEEE7541985;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected EncodingType3 encoding = ENCODING_EDEFAULT;

	/**
	 * This is true if the Encoding attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean encodingESet;

	/**
	 * The default value of the '{@link #getSizeInBits() <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBits()
	 * @generated
	 * @ordered
	 */
	protected static final SizeInBitsType2 SIZE_IN_BITS_EDEFAULT = SizeInBitsType2._32;

	/**
	 * The cached value of the '{@link #getSizeInBits() <em>Size In Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBits()
	 * @generated
	 * @ordered
	 */
	protected SizeInBitsType2 sizeInBits = SIZE_IN_BITS_EDEFAULT;

	/**
	 * This is true if the Size In Bits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeInBitsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatDataEncodingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getFloatDataEncodingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalibratorType getDefaultCalibrator() {
		return defaultCalibrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultCalibrator(CalibratorType newDefaultCalibrator, NotificationChain msgs) {
		CalibratorType oldDefaultCalibrator = defaultCalibrator;
		defaultCalibrator = newDefaultCalibrator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.FLOAT_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR, oldDefaultCalibrator, newDefaultCalibrator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCalibrator(CalibratorType newDefaultCalibrator) {
		if (newDefaultCalibrator != defaultCalibrator) {
			NotificationChain msgs = null;
			if (defaultCalibrator != null)
				msgs = ((InternalEObject)defaultCalibrator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FLOAT_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR, null, msgs);
			if (newDefaultCalibrator != null)
				msgs = ((InternalEObject)newDefaultCalibrator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FLOAT_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR, null, msgs);
			msgs = basicSetDefaultCalibrator(newDefaultCalibrator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FLOAT_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR, newDefaultCalibrator, newDefaultCalibrator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextCalibratorListType4 getContextCalibratorList() {
		return contextCalibratorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextCalibratorList(ContextCalibratorListType4 newContextCalibratorList, NotificationChain msgs) {
		ContextCalibratorListType4 oldContextCalibratorList = contextCalibratorList;
		contextCalibratorList = newContextCalibratorList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.FLOAT_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST, oldContextCalibratorList, newContextCalibratorList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextCalibratorList(ContextCalibratorListType4 newContextCalibratorList) {
		if (newContextCalibratorList != contextCalibratorList) {
			NotificationChain msgs = null;
			if (contextCalibratorList != null)
				msgs = ((InternalEObject)contextCalibratorList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FLOAT_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST, null, msgs);
			if (newContextCalibratorList != null)
				msgs = ((InternalEObject)newContextCalibratorList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FLOAT_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST, null, msgs);
			msgs = basicSetContextCalibratorList(newContextCalibratorList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FLOAT_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST, newContextCalibratorList, newContextCalibratorList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodingType3 getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(EncodingType3 newEncoding) {
		EncodingType3 oldEncoding = encoding;
		encoding = newEncoding == null ? ENCODING_EDEFAULT : newEncoding;
		boolean oldEncodingESet = encodingESet;
		encodingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FLOAT_DATA_ENCODING_TYPE__ENCODING, oldEncoding, encoding, !oldEncodingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEncoding() {
		EncodingType3 oldEncoding = encoding;
		boolean oldEncodingESet = encodingESet;
		encoding = ENCODING_EDEFAULT;
		encodingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.FLOAT_DATA_ENCODING_TYPE__ENCODING, oldEncoding, ENCODING_EDEFAULT, oldEncodingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEncoding() {
		return encodingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeInBitsType2 getSizeInBits() {
		return sizeInBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInBits(SizeInBitsType2 newSizeInBits) {
		SizeInBitsType2 oldSizeInBits = sizeInBits;
		sizeInBits = newSizeInBits == null ? SIZE_IN_BITS_EDEFAULT : newSizeInBits;
		boolean oldSizeInBitsESet = sizeInBitsESet;
		sizeInBitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FLOAT_DATA_ENCODING_TYPE__SIZE_IN_BITS, oldSizeInBits, sizeInBits, !oldSizeInBitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSizeInBits() {
		SizeInBitsType2 oldSizeInBits = sizeInBits;
		boolean oldSizeInBitsESet = sizeInBitsESet;
		sizeInBits = SIZE_IN_BITS_EDEFAULT;
		sizeInBitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.FLOAT_DATA_ENCODING_TYPE__SIZE_IN_BITS, oldSizeInBits, SIZE_IN_BITS_EDEFAULT, oldSizeInBitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSizeInBits() {
		return sizeInBitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR:
				return basicSetDefaultCalibrator(null, msgs);
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST:
				return basicSetContextCalibratorList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR:
				return getDefaultCalibrator();
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST:
				return getContextCalibratorList();
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__ENCODING:
				return getEncoding();
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__SIZE_IN_BITS:
				return getSizeInBits();
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
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR:
				setDefaultCalibrator((CalibratorType)newValue);
				return;
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST:
				setContextCalibratorList((ContextCalibratorListType4)newValue);
				return;
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__ENCODING:
				setEncoding((EncodingType3)newValue);
				return;
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__SIZE_IN_BITS:
				setSizeInBits((SizeInBitsType2)newValue);
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
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR:
				setDefaultCalibrator((CalibratorType)null);
				return;
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST:
				setContextCalibratorList((ContextCalibratorListType4)null);
				return;
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__ENCODING:
				unsetEncoding();
				return;
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__SIZE_IN_BITS:
				unsetSizeInBits();
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
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR:
				return defaultCalibrator != null;
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST:
				return contextCalibratorList != null;
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__ENCODING:
				return isSetEncoding();
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE__SIZE_IN_BITS:
				return isSetSizeInBits();
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
		result.append(" (encoding: ");
		if (encodingESet) result.append(encoding); else result.append("<unset>");
		result.append(", sizeInBits: ");
		if (sizeInBitsESet) result.append(sizeInBits); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FloatDataEncodingTypeImpl
