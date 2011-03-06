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

import org.omg.space.xtce.AlgorithmSetType;
import org.omg.space.xtce.ArgumentTypeSetType;
import org.omg.space.xtce.CommandContainerSetType;
import org.omg.space.xtce.CommandMetaDataType;
import org.omg.space.xtce.MetaCommandSetType;
import org.omg.space.xtce.ParameterSetType;
import org.omg.space.xtce.ParameterTypeSetType;
import org.omg.space.xtce.StreamSetType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Meta Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.CommandMetaDataTypeImpl#getParameterTypeSet <em>Parameter Type Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandMetaDataTypeImpl#getParameterSet <em>Parameter Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandMetaDataTypeImpl#getArgumentTypeSet <em>Argument Type Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandMetaDataTypeImpl#getMetaCommandSet <em>Meta Command Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandMetaDataTypeImpl#getCommandContainerSet <em>Command Container Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandMetaDataTypeImpl#getStreamSet <em>Stream Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.CommandMetaDataTypeImpl#getAlgorithmSet <em>Algorithm Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandMetaDataTypeImpl extends EObjectImpl implements CommandMetaDataType {
	/**
	 * The cached value of the '{@link #getParameterTypeSet() <em>Parameter Type Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterTypeSet()
	 * @generated
	 * @ordered
	 */
	protected ParameterTypeSetType parameterTypeSet;

	/**
	 * The cached value of the '{@link #getParameterSet() <em>Parameter Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterSet()
	 * @generated
	 * @ordered
	 */
	protected ParameterSetType parameterSet;

	/**
	 * The cached value of the '{@link #getArgumentTypeSet() <em>Argument Type Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentTypeSet()
	 * @generated
	 * @ordered
	 */
	protected ArgumentTypeSetType argumentTypeSet;

	/**
	 * The cached value of the '{@link #getMetaCommandSet() <em>Meta Command Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaCommandSet()
	 * @generated
	 * @ordered
	 */
	protected MetaCommandSetType metaCommandSet;

	/**
	 * The cached value of the '{@link #getCommandContainerSet() <em>Command Container Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandContainerSet()
	 * @generated
	 * @ordered
	 */
	protected CommandContainerSetType commandContainerSet;

	/**
	 * The cached value of the '{@link #getStreamSet() <em>Stream Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamSet()
	 * @generated
	 * @ordered
	 */
	protected StreamSetType streamSet;

	/**
	 * The cached value of the '{@link #getAlgorithmSet() <em>Algorithm Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmSet()
	 * @generated
	 * @ordered
	 */
	protected AlgorithmSetType algorithmSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandMetaDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getCommandMetaDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterTypeSetType getParameterTypeSet() {
		return parameterTypeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterTypeSet(ParameterTypeSetType newParameterTypeSet, NotificationChain msgs) {
		ParameterTypeSetType oldParameterTypeSet = parameterTypeSet;
		parameterTypeSet = newParameterTypeSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_TYPE_SET, oldParameterTypeSet, newParameterTypeSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterTypeSet(ParameterTypeSetType newParameterTypeSet) {
		if (newParameterTypeSet != parameterTypeSet) {
			NotificationChain msgs = null;
			if (parameterTypeSet != null)
				msgs = ((InternalEObject)parameterTypeSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_TYPE_SET, null, msgs);
			if (newParameterTypeSet != null)
				msgs = ((InternalEObject)newParameterTypeSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_TYPE_SET, null, msgs);
			msgs = basicSetParameterTypeSet(newParameterTypeSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_TYPE_SET, newParameterTypeSet, newParameterTypeSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSetType getParameterSet() {
		return parameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterSet(ParameterSetType newParameterSet, NotificationChain msgs) {
		ParameterSetType oldParameterSet = parameterSet;
		parameterSet = newParameterSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_SET, oldParameterSet, newParameterSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterSet(ParameterSetType newParameterSet) {
		if (newParameterSet != parameterSet) {
			NotificationChain msgs = null;
			if (parameterSet != null)
				msgs = ((InternalEObject)parameterSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_SET, null, msgs);
			if (newParameterSet != null)
				msgs = ((InternalEObject)newParameterSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_SET, null, msgs);
			msgs = basicSetParameterSet(newParameterSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_SET, newParameterSet, newParameterSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentTypeSetType getArgumentTypeSet() {
		return argumentTypeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgumentTypeSet(ArgumentTypeSetType newArgumentTypeSet, NotificationChain msgs) {
		ArgumentTypeSetType oldArgumentTypeSet = argumentTypeSet;
		argumentTypeSet = newArgumentTypeSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_META_DATA_TYPE__ARGUMENT_TYPE_SET, oldArgumentTypeSet, newArgumentTypeSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentTypeSet(ArgumentTypeSetType newArgumentTypeSet) {
		if (newArgumentTypeSet != argumentTypeSet) {
			NotificationChain msgs = null;
			if (argumentTypeSet != null)
				msgs = ((InternalEObject)argumentTypeSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_META_DATA_TYPE__ARGUMENT_TYPE_SET, null, msgs);
			if (newArgumentTypeSet != null)
				msgs = ((InternalEObject)newArgumentTypeSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_META_DATA_TYPE__ARGUMENT_TYPE_SET, null, msgs);
			msgs = basicSetArgumentTypeSet(newArgumentTypeSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_META_DATA_TYPE__ARGUMENT_TYPE_SET, newArgumentTypeSet, newArgumentTypeSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaCommandSetType getMetaCommandSet() {
		return metaCommandSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaCommandSet(MetaCommandSetType newMetaCommandSet, NotificationChain msgs) {
		MetaCommandSetType oldMetaCommandSet = metaCommandSet;
		metaCommandSet = newMetaCommandSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_META_DATA_TYPE__META_COMMAND_SET, oldMetaCommandSet, newMetaCommandSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaCommandSet(MetaCommandSetType newMetaCommandSet) {
		if (newMetaCommandSet != metaCommandSet) {
			NotificationChain msgs = null;
			if (metaCommandSet != null)
				msgs = ((InternalEObject)metaCommandSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_META_DATA_TYPE__META_COMMAND_SET, null, msgs);
			if (newMetaCommandSet != null)
				msgs = ((InternalEObject)newMetaCommandSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_META_DATA_TYPE__META_COMMAND_SET, null, msgs);
			msgs = basicSetMetaCommandSet(newMetaCommandSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_META_DATA_TYPE__META_COMMAND_SET, newMetaCommandSet, newMetaCommandSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandContainerSetType getCommandContainerSet() {
		return commandContainerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommandContainerSet(CommandContainerSetType newCommandContainerSet, NotificationChain msgs) {
		CommandContainerSetType oldCommandContainerSet = commandContainerSet;
		commandContainerSet = newCommandContainerSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_META_DATA_TYPE__COMMAND_CONTAINER_SET, oldCommandContainerSet, newCommandContainerSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandContainerSet(CommandContainerSetType newCommandContainerSet) {
		if (newCommandContainerSet != commandContainerSet) {
			NotificationChain msgs = null;
			if (commandContainerSet != null)
				msgs = ((InternalEObject)commandContainerSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_META_DATA_TYPE__COMMAND_CONTAINER_SET, null, msgs);
			if (newCommandContainerSet != null)
				msgs = ((InternalEObject)newCommandContainerSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_META_DATA_TYPE__COMMAND_CONTAINER_SET, null, msgs);
			msgs = basicSetCommandContainerSet(newCommandContainerSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_META_DATA_TYPE__COMMAND_CONTAINER_SET, newCommandContainerSet, newCommandContainerSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamSetType getStreamSet() {
		return streamSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreamSet(StreamSetType newStreamSet, NotificationChain msgs) {
		StreamSetType oldStreamSet = streamSet;
		streamSet = newStreamSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_META_DATA_TYPE__STREAM_SET, oldStreamSet, newStreamSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreamSet(StreamSetType newStreamSet) {
		if (newStreamSet != streamSet) {
			NotificationChain msgs = null;
			if (streamSet != null)
				msgs = ((InternalEObject)streamSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_META_DATA_TYPE__STREAM_SET, null, msgs);
			if (newStreamSet != null)
				msgs = ((InternalEObject)newStreamSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_META_DATA_TYPE__STREAM_SET, null, msgs);
			msgs = basicSetStreamSet(newStreamSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_META_DATA_TYPE__STREAM_SET, newStreamSet, newStreamSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmSetType getAlgorithmSet() {
		return algorithmSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgorithmSet(AlgorithmSetType newAlgorithmSet, NotificationChain msgs) {
		AlgorithmSetType oldAlgorithmSet = algorithmSet;
		algorithmSet = newAlgorithmSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_META_DATA_TYPE__ALGORITHM_SET, oldAlgorithmSet, newAlgorithmSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithmSet(AlgorithmSetType newAlgorithmSet) {
		if (newAlgorithmSet != algorithmSet) {
			NotificationChain msgs = null;
			if (algorithmSet != null)
				msgs = ((InternalEObject)algorithmSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_META_DATA_TYPE__ALGORITHM_SET, null, msgs);
			if (newAlgorithmSet != null)
				msgs = ((InternalEObject)newAlgorithmSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.COMMAND_META_DATA_TYPE__ALGORITHM_SET, null, msgs);
			msgs = basicSetAlgorithmSet(newAlgorithmSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.COMMAND_META_DATA_TYPE__ALGORITHM_SET, newAlgorithmSet, newAlgorithmSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_TYPE_SET:
				return basicSetParameterTypeSet(null, msgs);
			case XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_SET:
				return basicSetParameterSet(null, msgs);
			case XtcePackage.COMMAND_META_DATA_TYPE__ARGUMENT_TYPE_SET:
				return basicSetArgumentTypeSet(null, msgs);
			case XtcePackage.COMMAND_META_DATA_TYPE__META_COMMAND_SET:
				return basicSetMetaCommandSet(null, msgs);
			case XtcePackage.COMMAND_META_DATA_TYPE__COMMAND_CONTAINER_SET:
				return basicSetCommandContainerSet(null, msgs);
			case XtcePackage.COMMAND_META_DATA_TYPE__STREAM_SET:
				return basicSetStreamSet(null, msgs);
			case XtcePackage.COMMAND_META_DATA_TYPE__ALGORITHM_SET:
				return basicSetAlgorithmSet(null, msgs);
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
			case XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_TYPE_SET:
				return getParameterTypeSet();
			case XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_SET:
				return getParameterSet();
			case XtcePackage.COMMAND_META_DATA_TYPE__ARGUMENT_TYPE_SET:
				return getArgumentTypeSet();
			case XtcePackage.COMMAND_META_DATA_TYPE__META_COMMAND_SET:
				return getMetaCommandSet();
			case XtcePackage.COMMAND_META_DATA_TYPE__COMMAND_CONTAINER_SET:
				return getCommandContainerSet();
			case XtcePackage.COMMAND_META_DATA_TYPE__STREAM_SET:
				return getStreamSet();
			case XtcePackage.COMMAND_META_DATA_TYPE__ALGORITHM_SET:
				return getAlgorithmSet();
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
			case XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_TYPE_SET:
				setParameterTypeSet((ParameterTypeSetType)newValue);
				return;
			case XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_SET:
				setParameterSet((ParameterSetType)newValue);
				return;
			case XtcePackage.COMMAND_META_DATA_TYPE__ARGUMENT_TYPE_SET:
				setArgumentTypeSet((ArgumentTypeSetType)newValue);
				return;
			case XtcePackage.COMMAND_META_DATA_TYPE__META_COMMAND_SET:
				setMetaCommandSet((MetaCommandSetType)newValue);
				return;
			case XtcePackage.COMMAND_META_DATA_TYPE__COMMAND_CONTAINER_SET:
				setCommandContainerSet((CommandContainerSetType)newValue);
				return;
			case XtcePackage.COMMAND_META_DATA_TYPE__STREAM_SET:
				setStreamSet((StreamSetType)newValue);
				return;
			case XtcePackage.COMMAND_META_DATA_TYPE__ALGORITHM_SET:
				setAlgorithmSet((AlgorithmSetType)newValue);
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
			case XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_TYPE_SET:
				setParameterTypeSet((ParameterTypeSetType)null);
				return;
			case XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_SET:
				setParameterSet((ParameterSetType)null);
				return;
			case XtcePackage.COMMAND_META_DATA_TYPE__ARGUMENT_TYPE_SET:
				setArgumentTypeSet((ArgumentTypeSetType)null);
				return;
			case XtcePackage.COMMAND_META_DATA_TYPE__META_COMMAND_SET:
				setMetaCommandSet((MetaCommandSetType)null);
				return;
			case XtcePackage.COMMAND_META_DATA_TYPE__COMMAND_CONTAINER_SET:
				setCommandContainerSet((CommandContainerSetType)null);
				return;
			case XtcePackage.COMMAND_META_DATA_TYPE__STREAM_SET:
				setStreamSet((StreamSetType)null);
				return;
			case XtcePackage.COMMAND_META_DATA_TYPE__ALGORITHM_SET:
				setAlgorithmSet((AlgorithmSetType)null);
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
			case XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_TYPE_SET:
				return parameterTypeSet != null;
			case XtcePackage.COMMAND_META_DATA_TYPE__PARAMETER_SET:
				return parameterSet != null;
			case XtcePackage.COMMAND_META_DATA_TYPE__ARGUMENT_TYPE_SET:
				return argumentTypeSet != null;
			case XtcePackage.COMMAND_META_DATA_TYPE__META_COMMAND_SET:
				return metaCommandSet != null;
			case XtcePackage.COMMAND_META_DATA_TYPE__COMMAND_CONTAINER_SET:
				return commandContainerSet != null;
			case XtcePackage.COMMAND_META_DATA_TYPE__STREAM_SET:
				return streamSet != null;
			case XtcePackage.COMMAND_META_DATA_TYPE__ALGORITHM_SET:
				return algorithmSet != null;
		}
		return super.eIsSet(featureID);
	}

} //CommandMetaDataTypeImpl
