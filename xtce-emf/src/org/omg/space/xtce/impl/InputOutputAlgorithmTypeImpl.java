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

import org.omg.space.xtce.InputOutputAlgorithmType;
import org.omg.space.xtce.OutputSetType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Output Algorithm Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.InputOutputAlgorithmTypeImpl#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.InputOutputAlgorithmTypeImpl#isThread <em>Thread</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputOutputAlgorithmTypeImpl extends InputAlgorithmTypeImpl implements InputOutputAlgorithmType {
	/**
	 * The cached value of the '{@link #getOutputSet() <em>Output Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSet()
	 * @generated
	 * @ordered
	 */
	protected OutputSetType outputSet;

	/**
	 * The default value of the '{@link #isThread() <em>Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThread()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THREAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThread() <em>Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThread()
	 * @generated
	 * @ordered
	 */
	protected boolean thread = THREAD_EDEFAULT;

	/**
	 * This is true if the Thread attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean threadESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputOutputAlgorithmTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getInputOutputAlgorithmType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSetType getOutputSet() {
		return outputSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputSet(OutputSetType newOutputSet, NotificationChain msgs) {
		OutputSetType oldOutputSet = outputSet;
		outputSet = newOutputSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE__OUTPUT_SET, oldOutputSet, newOutputSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputSet(OutputSetType newOutputSet) {
		if (newOutputSet != outputSet) {
			NotificationChain msgs = null;
			if (outputSet != null)
				msgs = ((InternalEObject)outputSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE__OUTPUT_SET, null, msgs);
			if (newOutputSet != null)
				msgs = ((InternalEObject)newOutputSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE__OUTPUT_SET, null, msgs);
			msgs = basicSetOutputSet(newOutputSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE__OUTPUT_SET, newOutputSet, newOutputSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThread() {
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThread(boolean newThread) {
		boolean oldThread = thread;
		thread = newThread;
		boolean oldThreadESet = threadESet;
		threadESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE__THREAD, oldThread, thread, !oldThreadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThread() {
		boolean oldThread = thread;
		boolean oldThreadESet = threadESet;
		thread = THREAD_EDEFAULT;
		threadESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE__THREAD, oldThread, THREAD_EDEFAULT, oldThreadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThread() {
		return threadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE__OUTPUT_SET:
				return basicSetOutputSet(null, msgs);
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
			case XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE__OUTPUT_SET:
				return getOutputSet();
			case XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE__THREAD:
				return isThread();
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
			case XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE__OUTPUT_SET:
				setOutputSet((OutputSetType)newValue);
				return;
			case XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE__THREAD:
				setThread((Boolean)newValue);
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
			case XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE__OUTPUT_SET:
				setOutputSet((OutputSetType)null);
				return;
			case XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE__THREAD:
				unsetThread();
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
			case XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE__OUTPUT_SET:
				return outputSet != null;
			case XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE__THREAD:
				return isSetThread();
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
		result.append(" (thread: ");
		if (threadESet) result.append(thread); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InputOutputAlgorithmTypeImpl
