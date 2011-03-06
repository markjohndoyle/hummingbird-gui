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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.space.xtce.AuthorSetType;
import org.omg.space.xtce.HeaderType;
import org.omg.space.xtce.HistorySetType;
import org.omg.space.xtce.NoteSetType;
import org.omg.space.xtce.ValidationStatusType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.HeaderTypeImpl#getAuthorSet <em>Author Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.HeaderTypeImpl#getNoteSet <em>Note Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.HeaderTypeImpl#getHistorySet <em>History Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.HeaderTypeImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.HeaderTypeImpl#getClassificationInstructions <em>Classification Instructions</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.HeaderTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.HeaderTypeImpl#getValidationStatus <em>Validation Status</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.HeaderTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderTypeImpl extends EObjectImpl implements HeaderType {
	/**
	 * The cached value of the '{@link #getAuthorSet() <em>Author Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorSet()
	 * @generated
	 * @ordered
	 */
	protected AuthorSetType authorSet;

	/**
	 * The cached value of the '{@link #getNoteSet() <em>Note Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteSet()
	 * @generated
	 * @ordered
	 */
	protected NoteSetType noteSet;

	/**
	 * The cached value of the '{@link #getHistorySet() <em>History Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistorySet()
	 * @generated
	 * @ordered
	 */
	protected HistorySetType historySet;

	/**
	 * The default value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFICATION_EDEFAULT = "NotClassified";

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected String classification = CLASSIFICATION_EDEFAULT;

	/**
	 * This is true if the Classification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classificationESet;

	/**
	 * The default value of the '{@link #getClassificationInstructions() <em>Classification Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationInstructions()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFICATION_INSTRUCTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassificationInstructions() <em>Classification Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationInstructions()
	 * @generated
	 * @ordered
	 */
	protected String classificationInstructions = CLASSIFICATION_INSTRUCTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidationStatus() <em>Validation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ValidationStatusType VALIDATION_STATUS_EDEFAULT = ValidationStatusType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getValidationStatus() <em>Validation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationStatus()
	 * @generated
	 * @ordered
	 */
	protected ValidationStatusType validationStatus = VALIDATION_STATUS_EDEFAULT;

	/**
	 * This is true if the Validation Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validationStatusESet;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getHeaderType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorSetType getAuthorSet() {
		return authorSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorSet(AuthorSetType newAuthorSet, NotificationChain msgs) {
		AuthorSetType oldAuthorSet = authorSet;
		authorSet = newAuthorSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.HEADER_TYPE__AUTHOR_SET, oldAuthorSet, newAuthorSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorSet(AuthorSetType newAuthorSet) {
		if (newAuthorSet != authorSet) {
			NotificationChain msgs = null;
			if (authorSet != null)
				msgs = ((InternalEObject)authorSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.HEADER_TYPE__AUTHOR_SET, null, msgs);
			if (newAuthorSet != null)
				msgs = ((InternalEObject)newAuthorSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.HEADER_TYPE__AUTHOR_SET, null, msgs);
			msgs = basicSetAuthorSet(newAuthorSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.HEADER_TYPE__AUTHOR_SET, newAuthorSet, newAuthorSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteSetType getNoteSet() {
		return noteSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoteSet(NoteSetType newNoteSet, NotificationChain msgs) {
		NoteSetType oldNoteSet = noteSet;
		noteSet = newNoteSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.HEADER_TYPE__NOTE_SET, oldNoteSet, newNoteSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteSet(NoteSetType newNoteSet) {
		if (newNoteSet != noteSet) {
			NotificationChain msgs = null;
			if (noteSet != null)
				msgs = ((InternalEObject)noteSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.HEADER_TYPE__NOTE_SET, null, msgs);
			if (newNoteSet != null)
				msgs = ((InternalEObject)newNoteSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.HEADER_TYPE__NOTE_SET, null, msgs);
			msgs = basicSetNoteSet(newNoteSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.HEADER_TYPE__NOTE_SET, newNoteSet, newNoteSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistorySetType getHistorySet() {
		return historySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistorySet(HistorySetType newHistorySet, NotificationChain msgs) {
		HistorySetType oldHistorySet = historySet;
		historySet = newHistorySet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.HEADER_TYPE__HISTORY_SET, oldHistorySet, newHistorySet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistorySet(HistorySetType newHistorySet) {
		if (newHistorySet != historySet) {
			NotificationChain msgs = null;
			if (historySet != null)
				msgs = ((InternalEObject)historySet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.HEADER_TYPE__HISTORY_SET, null, msgs);
			if (newHistorySet != null)
				msgs = ((InternalEObject)newHistorySet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.HEADER_TYPE__HISTORY_SET, null, msgs);
			msgs = basicSetHistorySet(newHistorySet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.HEADER_TYPE__HISTORY_SET, newHistorySet, newHistorySet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(String newClassification) {
		String oldClassification = classification;
		classification = newClassification;
		boolean oldClassificationESet = classificationESet;
		classificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.HEADER_TYPE__CLASSIFICATION, oldClassification, classification, !oldClassificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassification() {
		String oldClassification = classification;
		boolean oldClassificationESet = classificationESet;
		classification = CLASSIFICATION_EDEFAULT;
		classificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.HEADER_TYPE__CLASSIFICATION, oldClassification, CLASSIFICATION_EDEFAULT, oldClassificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClassification() {
		return classificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassificationInstructions() {
		return classificationInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationInstructions(String newClassificationInstructions) {
		String oldClassificationInstructions = classificationInstructions;
		classificationInstructions = newClassificationInstructions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.HEADER_TYPE__CLASSIFICATION_INSTRUCTIONS, oldClassificationInstructions, classificationInstructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.HEADER_TYPE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationStatusType getValidationStatus() {
		return validationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationStatus(ValidationStatusType newValidationStatus) {
		ValidationStatusType oldValidationStatus = validationStatus;
		validationStatus = newValidationStatus == null ? VALIDATION_STATUS_EDEFAULT : newValidationStatus;
		boolean oldValidationStatusESet = validationStatusESet;
		validationStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.HEADER_TYPE__VALIDATION_STATUS, oldValidationStatus, validationStatus, !oldValidationStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValidationStatus() {
		ValidationStatusType oldValidationStatus = validationStatus;
		boolean oldValidationStatusESet = validationStatusESet;
		validationStatus = VALIDATION_STATUS_EDEFAULT;
		validationStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.HEADER_TYPE__VALIDATION_STATUS, oldValidationStatus, VALIDATION_STATUS_EDEFAULT, oldValidationStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValidationStatus() {
		return validationStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.HEADER_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.HEADER_TYPE__AUTHOR_SET:
				return basicSetAuthorSet(null, msgs);
			case XtcePackage.HEADER_TYPE__NOTE_SET:
				return basicSetNoteSet(null, msgs);
			case XtcePackage.HEADER_TYPE__HISTORY_SET:
				return basicSetHistorySet(null, msgs);
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
			case XtcePackage.HEADER_TYPE__AUTHOR_SET:
				return getAuthorSet();
			case XtcePackage.HEADER_TYPE__NOTE_SET:
				return getNoteSet();
			case XtcePackage.HEADER_TYPE__HISTORY_SET:
				return getHistorySet();
			case XtcePackage.HEADER_TYPE__CLASSIFICATION:
				return getClassification();
			case XtcePackage.HEADER_TYPE__CLASSIFICATION_INSTRUCTIONS:
				return getClassificationInstructions();
			case XtcePackage.HEADER_TYPE__DATE:
				return getDate();
			case XtcePackage.HEADER_TYPE__VALIDATION_STATUS:
				return getValidationStatus();
			case XtcePackage.HEADER_TYPE__VERSION:
				return getVersion();
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
			case XtcePackage.HEADER_TYPE__AUTHOR_SET:
				setAuthorSet((AuthorSetType)newValue);
				return;
			case XtcePackage.HEADER_TYPE__NOTE_SET:
				setNoteSet((NoteSetType)newValue);
				return;
			case XtcePackage.HEADER_TYPE__HISTORY_SET:
				setHistorySet((HistorySetType)newValue);
				return;
			case XtcePackage.HEADER_TYPE__CLASSIFICATION:
				setClassification((String)newValue);
				return;
			case XtcePackage.HEADER_TYPE__CLASSIFICATION_INSTRUCTIONS:
				setClassificationInstructions((String)newValue);
				return;
			case XtcePackage.HEADER_TYPE__DATE:
				setDate((String)newValue);
				return;
			case XtcePackage.HEADER_TYPE__VALIDATION_STATUS:
				setValidationStatus((ValidationStatusType)newValue);
				return;
			case XtcePackage.HEADER_TYPE__VERSION:
				setVersion((String)newValue);
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
			case XtcePackage.HEADER_TYPE__AUTHOR_SET:
				setAuthorSet((AuthorSetType)null);
				return;
			case XtcePackage.HEADER_TYPE__NOTE_SET:
				setNoteSet((NoteSetType)null);
				return;
			case XtcePackage.HEADER_TYPE__HISTORY_SET:
				setHistorySet((HistorySetType)null);
				return;
			case XtcePackage.HEADER_TYPE__CLASSIFICATION:
				unsetClassification();
				return;
			case XtcePackage.HEADER_TYPE__CLASSIFICATION_INSTRUCTIONS:
				setClassificationInstructions(CLASSIFICATION_INSTRUCTIONS_EDEFAULT);
				return;
			case XtcePackage.HEADER_TYPE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case XtcePackage.HEADER_TYPE__VALIDATION_STATUS:
				unsetValidationStatus();
				return;
			case XtcePackage.HEADER_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case XtcePackage.HEADER_TYPE__AUTHOR_SET:
				return authorSet != null;
			case XtcePackage.HEADER_TYPE__NOTE_SET:
				return noteSet != null;
			case XtcePackage.HEADER_TYPE__HISTORY_SET:
				return historySet != null;
			case XtcePackage.HEADER_TYPE__CLASSIFICATION:
				return isSetClassification();
			case XtcePackage.HEADER_TYPE__CLASSIFICATION_INSTRUCTIONS:
				return CLASSIFICATION_INSTRUCTIONS_EDEFAULT == null ? classificationInstructions != null : !CLASSIFICATION_INSTRUCTIONS_EDEFAULT.equals(classificationInstructions);
			case XtcePackage.HEADER_TYPE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case XtcePackage.HEADER_TYPE__VALIDATION_STATUS:
				return isSetValidationStatus();
			case XtcePackage.HEADER_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (classification: ");
		if (classificationESet) result.append(classification); else result.append("<unset>");
		result.append(", classificationInstructions: ");
		result.append(classificationInstructions);
		result.append(", date: ");
		result.append(date);
		result.append(", validationStatus: ");
		if (validationStatusESet) result.append(validationStatus); else result.append("<unset>");
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //HeaderTypeImpl
