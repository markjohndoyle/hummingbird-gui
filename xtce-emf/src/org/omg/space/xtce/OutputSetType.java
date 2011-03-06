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
 * A representation of the model object '<em><b>Output Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.space.xtce.OutputSetType#getOutputParameterRef <em>Output Parameter Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.space.xtce.XtcePackage#getOutputSetType()
 * @model extendedMetaData="name='OutputSet_._type' kind='elementOnly'"
 * @generated
 */
public interface OutputSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Parameter Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.space.xtce.OutputParameterRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Names an output parameter to the algorithm.  There are two attributes to OutputParm, outputName and parameterName. parameterName is a parameter reference name for a parameter that will be updated by this algorithm.  outputName is an optional "friendly" name for the output parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Parameter Ref</em>' containment reference list.
	 * @see org.omg.space.xtce.XtcePackage#getOutputSetType_OutputParameterRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OutputParameterRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OutputParameterRefType> getOutputParameterRef();

} // OutputSetType
