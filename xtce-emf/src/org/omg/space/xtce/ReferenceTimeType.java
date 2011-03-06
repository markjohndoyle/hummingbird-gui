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
 * A representation of the model object '<em><b>Reference Time Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Most time values are relative to another time e.g. seconds are relative to minutes, minutes are relative to hours.  This type is used to describe this relationship starting with the least significant time Parameter to and progressing to the most significant time parameter.  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.ReferenceTimeType#getOffsetFrom <em>Offset From</em>}</li>
 *   <li>{@link org.omg.space.xtce.ReferenceTimeType#getEpoch <em>Epoch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getReferenceTimeType()
 * @model extendedMetaData="name='ReferenceTimeType' kind='elementOnly'"
 * @generated
 */
public interface ReferenceTimeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Offset From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset From</em>' containment reference.
	 * @see #setOffsetFrom(ParameterInstanceRefType1)
	 * @see org.omg.space.xtce.XtcePackage#getReferenceTimeType_OffsetFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OffsetFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterInstanceRefType1 getOffsetFrom();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ReferenceTimeType#getOffsetFrom <em>Offset From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset From</em>' containment reference.
	 * @see #getOffsetFrom()
	 * @generated
	 */
	void setOffsetFrom(ParameterInstanceRefType1 value);

	/**
	 * Returns the value of the '<em><b>Epoch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Epoch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epoch</em>' attribute.
	 * @see #setEpoch(Object)
	 * @see org.omg.space.xtce.XtcePackage#getReferenceTimeType_Epoch()
	 * @model dataType="org.omg.space.xtce.EpochType"
	 *        extendedMetaData="kind='element' name='Epoch' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getEpoch();

	/**
	 * Sets the value of the '{@link org.omg.space.xtce.ReferenceTimeType#getEpoch <em>Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epoch</em>' attribute.
	 * @see #getEpoch()
	 * @generated
	 */
	void setEpoch(Object value);

} // ReferenceTimeType
