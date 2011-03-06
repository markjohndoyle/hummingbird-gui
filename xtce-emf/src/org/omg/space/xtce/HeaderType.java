/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Schema for a Header record.  A header contains general information about the system or subsystem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.HeaderType#getAuthorSet <em>Author Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.HeaderType#getNoteSet <em>Note Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.HeaderType#getHistorySet <em>History Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.HeaderType#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.omg.space.xtce.HeaderType#getClassificationInstructions <em>Classification Instructions</em>}</li>
 *   <li>{@link org.omg.space.xtce.HeaderType#getDate <em>Date</em>}</li>
 *   <li>{@link org.omg.space.xtce.HeaderType#getValidationStatus <em>Validation Status</em>}</li>
 *   <li>{@link org.omg.space.xtce.HeaderType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getHeaderType()
 * @model extendedMetaData="name='HeaderType' kind='elementOnly'"
 * @generated
 */
public interface HeaderType extends EObject {
	/**
	 * Returns the value of the '<em><b>Author Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Set</em>' containment reference.
	 * @see #setAuthorSet(AuthorSetType)
	 * @see org.omg.space.xtce.XtcePackage#getHeaderType_AuthorSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AuthorSet' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorSetType getAuthorSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.HeaderType#getAuthorSet <em>Author Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Set</em>' containment reference.
	 * @see #getAuthorSet()
	 * @generated
	 */
	void setAuthorSet(AuthorSetType value);

	/**
	 * Returns the value of the '<em><b>Note Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Set</em>' containment reference.
	 * @see #setNoteSet(NoteSetType)
	 * @see org.omg.space.xtce.XtcePackage#getHeaderType_NoteSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NoteSet' namespace='##targetNamespace'"
	 * @generated
	 */
	NoteSetType getNoteSet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.HeaderType#getNoteSet <em>Note Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Set</em>' containment reference.
	 * @see #getNoteSet()
	 * @generated
	 */
	void setNoteSet(NoteSetType value);

	/**
	 * Returns the value of the '<em><b>History Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History Set</em>' containment reference.
	 * @see #setHistorySet(HistorySetType)
	 * @see org.omg.space.xtce.XtcePackage#getHeaderType_HistorySet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HistorySet' namespace='##targetNamespace'"
	 * @generated
	 */
	HistorySetType getHistorySet();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.HeaderType#getHistorySet <em>History Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Set</em>' containment reference.
	 * @see #getHistorySet()
	 * @generated
	 */
	void setHistorySet(HistorySetType value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * The default value is <code>"NotClassified"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see #isSetClassification()
	 * @see #unsetClassification()
	 * @see #setClassification(String)
	 * @see org.omg.space.xtce.XtcePackage#getHeaderType_Classification()
	 * @model default="NotClassified" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='classification'"
	 * @generated
	 */
	String getClassification();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.HeaderType#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see #isSetClassification()
	 * @see #unsetClassification()
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(String value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.HeaderType#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClassification()
	 * @see #getClassification()
	 * @see #setClassification(String)
	 * @generated
	 */
	void unsetClassification();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.HeaderType#getClassification <em>Classification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Classification</em>' attribute is set.
	 * @see #unsetClassification()
	 * @see #getClassification()
	 * @see #setClassification(String)
	 * @generated
	 */
	boolean isSetClassification();

	/**
	 * Returns the value of the '<em><b>Classification Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Instructions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Instructions</em>' attribute.
	 * @see #setClassificationInstructions(String)
	 * @see org.omg.space.xtce.XtcePackage#getHeaderType_ClassificationInstructions()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='classificationInstructions'"
	 * @generated
	 */
	String getClassificationInstructions();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.HeaderType#getClassificationInstructions <em>Classification Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Instructions</em>' attribute.
	 * @see #getClassificationInstructions()
	 * @generated
	 */
	void setClassificationInstructions(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see org.omg.space.xtce.XtcePackage#getHeaderType_Date()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='date'"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.HeaderType#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Validation Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.space.xtce.ValidationStatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Status</em>' attribute.
	 * @see org.omg.space.xtce.ValidationStatusType
	 * @see #isSetValidationStatus()
	 * @see #unsetValidationStatus()
	 * @see #setValidationStatus(ValidationStatusType)
	 * @see org.omg.space.xtce.XtcePackage#getHeaderType_ValidationStatus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='validationStatus'"
	 * @generated
	 */
	ValidationStatusType getValidationStatus();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.HeaderType#getValidationStatus <em>Validation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Status</em>' attribute.
	 * @see org.omg.space.xtce.ValidationStatusType
	 * @see #isSetValidationStatus()
	 * @see #unsetValidationStatus()
	 * @see #getValidationStatus()
	 * @generated
	 */
	void setValidationStatus(ValidationStatusType value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.HeaderType#getValidationStatus <em>Validation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidationStatus()
	 * @see #getValidationStatus()
	 * @see #setValidationStatus(ValidationStatusType)
	 * @generated
	 */
	void unsetValidationStatus();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.HeaderType#getValidationStatus <em>Validation Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Validation Status</em>' attribute is set.
	 * @see #unsetValidationStatus()
	 * @see #getValidationStatus()
	 * @see #setValidationStatus(ValidationStatusType)
	 * @generated
	 */
	boolean isSetValidationStatus();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.omg.space.xtce.XtcePackage#getHeaderType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.HeaderType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // HeaderType
