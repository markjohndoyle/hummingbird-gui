/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.DimensionListType#getDimension <em>Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getDimensionListType()
 * @model extendedMetaData="name='DimensionList_._type' kind='elementOnly'"
 * @generated
 */
public interface DimensionListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.DimensionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For partial entries of an array, the starting and ending index for each dimension, OR the Size must be specified.  Indexes are zero based.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getDimensionListType_Dimension()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Dimension' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DimensionType> getDimension();

} // DimensionListType
