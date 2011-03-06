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
 * A representation of the model object '<em><b>Auto Invert Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.AutoInvertType#getInvertAlgorithm <em>Invert Algorithm</em>}</li>
 *   <li>{@link org.omg.space.xtce.AutoInvertType#getBadFramesToAutoInvert <em>Bad Frames To Auto Invert</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getAutoInvertType()
 * @model extendedMetaData="name='AutoInvert_._type' kind='elementOnly'"
 * @generated
 */
public interface AutoInvertType extends EObject {
	/**
	 * Returns the value of the '<em><b>Invert Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invert Algorithm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invert Algorithm</em>' containment reference.
	 * @see #setInvertAlgorithm(InputAlgorithmType)
	 * @see org.omg.space.xtce.XtcePackage#getAutoInvertType_InvertAlgorithm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InvertAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	InputAlgorithmType getInvertAlgorithm();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.AutoInvertType#getInvertAlgorithm <em>Invert Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invert Algorithm</em>' containment reference.
	 * @see #getInvertAlgorithm()
	 * @generated
	 */
	void setInvertAlgorithm(InputAlgorithmType value);

	/**
	 * Returns the value of the '<em><b>Bad Frames To Auto Invert</b></em>' attribute.
	 * The default value is <code>"1024"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bad Frames To Auto Invert</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bad Frames To Auto Invert</em>' attribute.
	 * @see #isSetBadFramesToAutoInvert()
	 * @see #unsetBadFramesToAutoInvert()
	 * @see #setBadFramesToAutoInvert(BigInteger)
	 * @see org.omg.space.xtce.XtcePackage#getAutoInvertType_BadFramesToAutoInvert()
	 * @model default="1024" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='badFramesToAutoInvert'"
	 * @generated
	 */
	BigInteger getBadFramesToAutoInvert();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.AutoInvertType#getBadFramesToAutoInvert <em>Bad Frames To Auto Invert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bad Frames To Auto Invert</em>' attribute.
	 * @see #isSetBadFramesToAutoInvert()
	 * @see #unsetBadFramesToAutoInvert()
	 * @see #getBadFramesToAutoInvert()
	 * @generated
	 */
	void setBadFramesToAutoInvert(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.omg.space.xtce.AutoInvertType#getBadFramesToAutoInvert <em>Bad Frames To Auto Invert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBadFramesToAutoInvert()
	 * @see #getBadFramesToAutoInvert()
	 * @see #setBadFramesToAutoInvert(BigInteger)
	 * @generated
	 */
	void unsetBadFramesToAutoInvert();

	/**
	 * Returns whether the value of the '{@link org.omg.space.xtce.AutoInvertType#getBadFramesToAutoInvert <em>Bad Frames To Auto Invert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bad Frames To Auto Invert</em>' attribute is set.
	 * @see #unsetBadFramesToAutoInvert()
	 * @see #getBadFramesToAutoInvert()
	 * @see #setBadFramesToAutoInvert(BigInteger)
	 * @generated
	 */
	boolean isSetBadFramesToAutoInvert();

} // AutoInvertType
