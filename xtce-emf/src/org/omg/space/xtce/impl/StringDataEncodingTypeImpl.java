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
import org.omg.space.xtce.ContextCalibratorListType2;
import org.omg.space.xtce.EncodingType;
import org.omg.space.xtce.SizeInBitsType;
import org.omg.space.xtce.StringDataEncodingType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Data Encoding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.StringDataEncodingTypeImpl#getDefaultCalibrator <em>Default Calibrator</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.StringDataEncodingTypeImpl#getContextCalibratorList <em>Context Calibrator List</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.StringDataEncodingTypeImpl#getSizeInBits <em>Size In Bits</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.StringDataEncodingTypeImpl#getEncoding <em>Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringDataEncodingTypeImpl extends DataEncodingTypeImpl implements StringDataEncodingType {
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
	protected ContextCalibratorListType2 contextCalibratorList;

	/**
	 * The cached value of the '{@link #getSizeInBits() <em>Size In Bits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBits()
	 * @generated
	 * @ordered
	 */
	protected SizeInBitsType sizeInBits;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final EncodingType ENCODING_EDEFAULT = EncodingType.UTF8;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected EncodingType encoding = ENCODING_EDEFAULT;

	/**
	 * This is true if the Encoding attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean encodingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringDataEncodingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getStringDataEncodingType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.STRING_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR, oldDefaultCalibrator, newDefaultCalibrator);
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
				msgs = ((InternalEObject)defaultCalibrator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.STRING_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR, null, msgs);
			if (newDefaultCalibrator != null)
				msgs = ((InternalEObject)newDefaultCalibrator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.STRING_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR, null, msgs);
			msgs = basicSetDefaultCalibrator(newDefaultCalibrator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.STRING_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR, newDefaultCalibrator, newDefaultCalibrator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextCalibratorListType2 getContextCalibratorList() {
		return contextCalibratorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextCalibratorList(ContextCalibratorListType2 newContextCalibratorList, NotificationChain msgs) {
		ContextCalibratorListType2 oldContextCalibratorList = contextCalibratorList;
		contextCalibratorList = newContextCalibratorList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.STRING_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST, oldContextCalibratorList, newContextCalibratorList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextCalibratorList(ContextCalibratorListType2 newContextCalibratorList) {
		if (newContextCalibratorList != contextCalibratorList) {
			NotificationChain msgs = null;
			if (contextCalibratorList != null)
				msgs = ((InternalEObject)contextCalibratorList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.STRING_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST, null, msgs);
			if (newContextCalibratorList != null)
				msgs = ((InternalEObject)newContextCalibratorList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.STRING_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST, null, msgs);
			msgs = basicSetContextCalibratorList(newContextCalibratorList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.STRING_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST, newContextCalibratorList, newContextCalibratorList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeInBitsType getSizeInBits() {
		return sizeInBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSizeInBits(SizeInBitsType newSizeInBits, NotificationChain msgs) {
		SizeInBitsType oldSizeInBits = sizeInBits;
		sizeInBits = newSizeInBits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.STRING_DATA_ENCODING_TYPE__SIZE_IN_BITS, oldSizeInBits, newSizeInBits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInBits(SizeInBitsType newSizeInBits) {
		if (newSizeInBits != sizeInBits) {
			NotificationChain msgs = null;
			if (sizeInBits != null)
				msgs = ((InternalEObject)sizeInBits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.STRING_DATA_ENCODING_TYPE__SIZE_IN_BITS, null, msgs);
			if (newSizeInBits != null)
				msgs = ((InternalEObject)newSizeInBits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.STRING_DATA_ENCODING_TYPE__SIZE_IN_BITS, null, msgs);
			msgs = basicSetSizeInBits(newSizeInBits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.STRING_DATA_ENCODING_TYPE__SIZE_IN_BITS, newSizeInBits, newSizeInBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodingType getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(EncodingType newEncoding) {
		EncodingType oldEncoding = encoding;
		encoding = newEncoding == null ? ENCODING_EDEFAULT : newEncoding;
		boolean oldEncodingESet = encodingESet;
		encodingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.STRING_DATA_ENCODING_TYPE__ENCODING, oldEncoding, encoding, !oldEncodingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEncoding() {
		EncodingType oldEncoding = encoding;
		boolean oldEncodingESet = encodingESet;
		encoding = ENCODING_EDEFAULT;
		encodingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.STRING_DATA_ENCODING_TYPE__ENCODING, oldEncoding, ENCODING_EDEFAULT, oldEncodingESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.STRING_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR:
				return basicSetDefaultCalibrator(null, msgs);
			case XtcePackage.STRING_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST:
				return basicSetContextCalibratorList(null, msgs);
			case XtcePackage.STRING_DATA_ENCODING_TYPE__SIZE_IN_BITS:
				return basicSetSizeInBits(null, msgs);
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
			case XtcePackage.STRING_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR:
				return getDefaultCalibrator();
			case XtcePackage.STRING_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST:
				return getContextCalibratorList();
			case XtcePackage.STRING_DATA_ENCODING_TYPE__SIZE_IN_BITS:
				return getSizeInBits();
			case XtcePackage.STRING_DATA_ENCODING_TYPE__ENCODING:
				return getEncoding();
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
			case XtcePackage.STRING_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR:
				setDefaultCalibrator((CalibratorType)newValue);
				return;
			case XtcePackage.STRING_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST:
				setContextCalibratorList((ContextCalibratorListType2)newValue);
				return;
			case XtcePackage.STRING_DATA_ENCODING_TYPE__SIZE_IN_BITS:
				setSizeInBits((SizeInBitsType)newValue);
				return;
			case XtcePackage.STRING_DATA_ENCODING_TYPE__ENCODING:
				setEncoding((EncodingType)newValue);
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
			case XtcePackage.STRING_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR:
				setDefaultCalibrator((CalibratorType)null);
				return;
			case XtcePackage.STRING_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST:
				setContextCalibratorList((ContextCalibratorListType2)null);
				return;
			case XtcePackage.STRING_DATA_ENCODING_TYPE__SIZE_IN_BITS:
				setSizeInBits((SizeInBitsType)null);
				return;
			case XtcePackage.STRING_DATA_ENCODING_TYPE__ENCODING:
				unsetEncoding();
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
			case XtcePackage.STRING_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR:
				return defaultCalibrator != null;
			case XtcePackage.STRING_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST:
				return contextCalibratorList != null;
			case XtcePackage.STRING_DATA_ENCODING_TYPE__SIZE_IN_BITS:
				return sizeInBits != null;
			case XtcePackage.STRING_DATA_ENCODING_TYPE__ENCODING:
				return isSetEncoding();
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
		result.append(')');
		return result.toString();
	}

} //StringDataEncodingTypeImpl
