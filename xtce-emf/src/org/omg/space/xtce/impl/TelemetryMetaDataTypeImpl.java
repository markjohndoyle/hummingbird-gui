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
import org.omg.space.xtce.ContainerSetType;
import org.omg.space.xtce.MessageSetType;
import org.omg.space.xtce.ParameterSetType;
import org.omg.space.xtce.ParameterTypeSetType;
import org.omg.space.xtce.StreamSetType;
import org.omg.space.xtce.TelemetryMetaDataType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telemetry Meta Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.TelemetryMetaDataTypeImpl#getParameterTypeSet <em>Parameter Type Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.TelemetryMetaDataTypeImpl#getParameterSet <em>Parameter Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.TelemetryMetaDataTypeImpl#getContainerSet <em>Container Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.TelemetryMetaDataTypeImpl#getMessageSet <em>Message Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.TelemetryMetaDataTypeImpl#getStreamSet <em>Stream Set</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.TelemetryMetaDataTypeImpl#getAlgorithmSet <em>Algorithm Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TelemetryMetaDataTypeImpl extends EObjectImpl implements TelemetryMetaDataType {
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
	 * The cached value of the '{@link #getContainerSet() <em>Container Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerSet()
	 * @generated
	 * @ordered
	 */
	protected ContainerSetType containerSet;

	/**
	 * The cached value of the '{@link #getMessageSet() <em>Message Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSet()
	 * @generated
	 * @ordered
	 */
	protected MessageSetType messageSet;

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
	protected TelemetryMetaDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getTelemetryMetaDataType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_TYPE_SET, oldParameterTypeSet, newParameterTypeSet);
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
				msgs = ((InternalEObject)parameterTypeSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_TYPE_SET, null, msgs);
			if (newParameterTypeSet != null)
				msgs = ((InternalEObject)newParameterTypeSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_TYPE_SET, null, msgs);
			msgs = basicSetParameterTypeSet(newParameterTypeSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_TYPE_SET, newParameterTypeSet, newParameterTypeSet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_SET, oldParameterSet, newParameterSet);
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
				msgs = ((InternalEObject)parameterSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_SET, null, msgs);
			if (newParameterSet != null)
				msgs = ((InternalEObject)newParameterSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_SET, null, msgs);
			msgs = basicSetParameterSet(newParameterSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_SET, newParameterSet, newParameterSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerSetType getContainerSet() {
		return containerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerSet(ContainerSetType newContainerSet, NotificationChain msgs) {
		ContainerSetType oldContainerSet = containerSet;
		containerSet = newContainerSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.TELEMETRY_META_DATA_TYPE__CONTAINER_SET, oldContainerSet, newContainerSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerSet(ContainerSetType newContainerSet) {
		if (newContainerSet != containerSet) {
			NotificationChain msgs = null;
			if (containerSet != null)
				msgs = ((InternalEObject)containerSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.TELEMETRY_META_DATA_TYPE__CONTAINER_SET, null, msgs);
			if (newContainerSet != null)
				msgs = ((InternalEObject)newContainerSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.TELEMETRY_META_DATA_TYPE__CONTAINER_SET, null, msgs);
			msgs = basicSetContainerSet(newContainerSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.TELEMETRY_META_DATA_TYPE__CONTAINER_SET, newContainerSet, newContainerSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSetType getMessageSet() {
		return messageSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageSet(MessageSetType newMessageSet, NotificationChain msgs) {
		MessageSetType oldMessageSet = messageSet;
		messageSet = newMessageSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.TELEMETRY_META_DATA_TYPE__MESSAGE_SET, oldMessageSet, newMessageSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageSet(MessageSetType newMessageSet) {
		if (newMessageSet != messageSet) {
			NotificationChain msgs = null;
			if (messageSet != null)
				msgs = ((InternalEObject)messageSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.TELEMETRY_META_DATA_TYPE__MESSAGE_SET, null, msgs);
			if (newMessageSet != null)
				msgs = ((InternalEObject)newMessageSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.TELEMETRY_META_DATA_TYPE__MESSAGE_SET, null, msgs);
			msgs = basicSetMessageSet(newMessageSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.TELEMETRY_META_DATA_TYPE__MESSAGE_SET, newMessageSet, newMessageSet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.TELEMETRY_META_DATA_TYPE__STREAM_SET, oldStreamSet, newStreamSet);
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
				msgs = ((InternalEObject)streamSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.TELEMETRY_META_DATA_TYPE__STREAM_SET, null, msgs);
			if (newStreamSet != null)
				msgs = ((InternalEObject)newStreamSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.TELEMETRY_META_DATA_TYPE__STREAM_SET, null, msgs);
			msgs = basicSetStreamSet(newStreamSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.TELEMETRY_META_DATA_TYPE__STREAM_SET, newStreamSet, newStreamSet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.TELEMETRY_META_DATA_TYPE__ALGORITHM_SET, oldAlgorithmSet, newAlgorithmSet);
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
				msgs = ((InternalEObject)algorithmSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.TELEMETRY_META_DATA_TYPE__ALGORITHM_SET, null, msgs);
			if (newAlgorithmSet != null)
				msgs = ((InternalEObject)newAlgorithmSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.TELEMETRY_META_DATA_TYPE__ALGORITHM_SET, null, msgs);
			msgs = basicSetAlgorithmSet(newAlgorithmSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.TELEMETRY_META_DATA_TYPE__ALGORITHM_SET, newAlgorithmSet, newAlgorithmSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_TYPE_SET:
				return basicSetParameterTypeSet(null, msgs);
			case XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_SET:
				return basicSetParameterSet(null, msgs);
			case XtcePackage.TELEMETRY_META_DATA_TYPE__CONTAINER_SET:
				return basicSetContainerSet(null, msgs);
			case XtcePackage.TELEMETRY_META_DATA_TYPE__MESSAGE_SET:
				return basicSetMessageSet(null, msgs);
			case XtcePackage.TELEMETRY_META_DATA_TYPE__STREAM_SET:
				return basicSetStreamSet(null, msgs);
			case XtcePackage.TELEMETRY_META_DATA_TYPE__ALGORITHM_SET:
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
			case XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_TYPE_SET:
				return getParameterTypeSet();
			case XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_SET:
				return getParameterSet();
			case XtcePackage.TELEMETRY_META_DATA_TYPE__CONTAINER_SET:
				return getContainerSet();
			case XtcePackage.TELEMETRY_META_DATA_TYPE__MESSAGE_SET:
				return getMessageSet();
			case XtcePackage.TELEMETRY_META_DATA_TYPE__STREAM_SET:
				return getStreamSet();
			case XtcePackage.TELEMETRY_META_DATA_TYPE__ALGORITHM_SET:
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
			case XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_TYPE_SET:
				setParameterTypeSet((ParameterTypeSetType)newValue);
				return;
			case XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_SET:
				setParameterSet((ParameterSetType)newValue);
				return;
			case XtcePackage.TELEMETRY_META_DATA_TYPE__CONTAINER_SET:
				setContainerSet((ContainerSetType)newValue);
				return;
			case XtcePackage.TELEMETRY_META_DATA_TYPE__MESSAGE_SET:
				setMessageSet((MessageSetType)newValue);
				return;
			case XtcePackage.TELEMETRY_META_DATA_TYPE__STREAM_SET:
				setStreamSet((StreamSetType)newValue);
				return;
			case XtcePackage.TELEMETRY_META_DATA_TYPE__ALGORITHM_SET:
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
			case XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_TYPE_SET:
				setParameterTypeSet((ParameterTypeSetType)null);
				return;
			case XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_SET:
				setParameterSet((ParameterSetType)null);
				return;
			case XtcePackage.TELEMETRY_META_DATA_TYPE__CONTAINER_SET:
				setContainerSet((ContainerSetType)null);
				return;
			case XtcePackage.TELEMETRY_META_DATA_TYPE__MESSAGE_SET:
				setMessageSet((MessageSetType)null);
				return;
			case XtcePackage.TELEMETRY_META_DATA_TYPE__STREAM_SET:
				setStreamSet((StreamSetType)null);
				return;
			case XtcePackage.TELEMETRY_META_DATA_TYPE__ALGORITHM_SET:
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
			case XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_TYPE_SET:
				return parameterTypeSet != null;
			case XtcePackage.TELEMETRY_META_DATA_TYPE__PARAMETER_SET:
				return parameterSet != null;
			case XtcePackage.TELEMETRY_META_DATA_TYPE__CONTAINER_SET:
				return containerSet != null;
			case XtcePackage.TELEMETRY_META_DATA_TYPE__MESSAGE_SET:
				return messageSet != null;
			case XtcePackage.TELEMETRY_META_DATA_TYPE__STREAM_SET:
				return streamSet != null;
			case XtcePackage.TELEMETRY_META_DATA_TYPE__ALGORITHM_SET:
				return algorithmSet != null;
		}
		return super.eIsSet(featureID);
	}

} //TelemetryMetaDataTypeImpl
