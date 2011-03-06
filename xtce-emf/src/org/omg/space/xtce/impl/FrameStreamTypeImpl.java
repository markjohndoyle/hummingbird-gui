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

import org.omg.space.xtce.ContainerRefType;
import org.omg.space.xtce.FrameStreamType;
import org.omg.space.xtce.ServiceRefType;
import org.omg.space.xtce.StreamRefType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frame Stream Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.FrameStreamTypeImpl#getContainerRef <em>Container Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.FrameStreamTypeImpl#getServiceRef <em>Service Ref</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.FrameStreamTypeImpl#getStreamRef <em>Stream Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrameStreamTypeImpl extends PCMStreamTypeImpl implements FrameStreamType {
	/**
	 * The cached value of the '{@link #getContainerRef() <em>Container Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerRef()
	 * @generated
	 * @ordered
	 */
	protected ContainerRefType containerRef;

	/**
	 * The cached value of the '{@link #getServiceRef() <em>Service Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRef()
	 * @generated
	 * @ordered
	 */
	protected ServiceRefType serviceRef;

	/**
	 * The cached value of the '{@link #getStreamRef() <em>Stream Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamRef()
	 * @generated
	 * @ordered
	 */
	protected StreamRefType streamRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameStreamTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getFrameStreamType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerRefType getContainerRef() {
		return containerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerRef(ContainerRefType newContainerRef, NotificationChain msgs) {
		ContainerRefType oldContainerRef = containerRef;
		containerRef = newContainerRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.FRAME_STREAM_TYPE__CONTAINER_REF, oldContainerRef, newContainerRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerRef(ContainerRefType newContainerRef) {
		if (newContainerRef != containerRef) {
			NotificationChain msgs = null;
			if (containerRef != null)
				msgs = ((InternalEObject)containerRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FRAME_STREAM_TYPE__CONTAINER_REF, null, msgs);
			if (newContainerRef != null)
				msgs = ((InternalEObject)newContainerRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FRAME_STREAM_TYPE__CONTAINER_REF, null, msgs);
			msgs = basicSetContainerRef(newContainerRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FRAME_STREAM_TYPE__CONTAINER_REF, newContainerRef, newContainerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRefType getServiceRef() {
		return serviceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceRef(ServiceRefType newServiceRef, NotificationChain msgs) {
		ServiceRefType oldServiceRef = serviceRef;
		serviceRef = newServiceRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.FRAME_STREAM_TYPE__SERVICE_REF, oldServiceRef, newServiceRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceRef(ServiceRefType newServiceRef) {
		if (newServiceRef != serviceRef) {
			NotificationChain msgs = null;
			if (serviceRef != null)
				msgs = ((InternalEObject)serviceRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FRAME_STREAM_TYPE__SERVICE_REF, null, msgs);
			if (newServiceRef != null)
				msgs = ((InternalEObject)newServiceRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FRAME_STREAM_TYPE__SERVICE_REF, null, msgs);
			msgs = basicSetServiceRef(newServiceRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FRAME_STREAM_TYPE__SERVICE_REF, newServiceRef, newServiceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamRefType getStreamRef() {
		return streamRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreamRef(StreamRefType newStreamRef, NotificationChain msgs) {
		StreamRefType oldStreamRef = streamRef;
		streamRef = newStreamRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.FRAME_STREAM_TYPE__STREAM_REF, oldStreamRef, newStreamRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreamRef(StreamRefType newStreamRef) {
		if (newStreamRef != streamRef) {
			NotificationChain msgs = null;
			if (streamRef != null)
				msgs = ((InternalEObject)streamRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FRAME_STREAM_TYPE__STREAM_REF, null, msgs);
			if (newStreamRef != null)
				msgs = ((InternalEObject)newStreamRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.FRAME_STREAM_TYPE__STREAM_REF, null, msgs);
			msgs = basicSetStreamRef(newStreamRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.FRAME_STREAM_TYPE__STREAM_REF, newStreamRef, newStreamRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.FRAME_STREAM_TYPE__CONTAINER_REF:
				return basicSetContainerRef(null, msgs);
			case XtcePackage.FRAME_STREAM_TYPE__SERVICE_REF:
				return basicSetServiceRef(null, msgs);
			case XtcePackage.FRAME_STREAM_TYPE__STREAM_REF:
				return basicSetStreamRef(null, msgs);
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
			case XtcePackage.FRAME_STREAM_TYPE__CONTAINER_REF:
				return getContainerRef();
			case XtcePackage.FRAME_STREAM_TYPE__SERVICE_REF:
				return getServiceRef();
			case XtcePackage.FRAME_STREAM_TYPE__STREAM_REF:
				return getStreamRef();
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
			case XtcePackage.FRAME_STREAM_TYPE__CONTAINER_REF:
				setContainerRef((ContainerRefType)newValue);
				return;
			case XtcePackage.FRAME_STREAM_TYPE__SERVICE_REF:
				setServiceRef((ServiceRefType)newValue);
				return;
			case XtcePackage.FRAME_STREAM_TYPE__STREAM_REF:
				setStreamRef((StreamRefType)newValue);
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
			case XtcePackage.FRAME_STREAM_TYPE__CONTAINER_REF:
				setContainerRef((ContainerRefType)null);
				return;
			case XtcePackage.FRAME_STREAM_TYPE__SERVICE_REF:
				setServiceRef((ServiceRefType)null);
				return;
			case XtcePackage.FRAME_STREAM_TYPE__STREAM_REF:
				setStreamRef((StreamRefType)null);
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
			case XtcePackage.FRAME_STREAM_TYPE__CONTAINER_REF:
				return containerRef != null;
			case XtcePackage.FRAME_STREAM_TYPE__SERVICE_REF:
				return serviceRef != null;
			case XtcePackage.FRAME_STREAM_TYPE__STREAM_REF:
				return streamRef != null;
		}
		return super.eIsSet(featureID);
	}

} //FrameStreamTypeImpl
