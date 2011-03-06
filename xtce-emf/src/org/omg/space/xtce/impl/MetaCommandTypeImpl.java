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

import org.omg.space.xtce.ArgumentListType1;
import org.omg.space.xtce.BaseMetaCommandType;
import org.omg.space.xtce.CommandContainerType;
import org.omg.space.xtce.ContextSignificanceListType;
import org.omg.space.xtce.InterlockType;
import org.omg.space.xtce.MetaCommandType;
import org.omg.space.xtce.ParameterToSetListType;
import org.omg.space.xtce.SignificanceType;
import org.omg.space.xtce.TransmissionConstraintListType;
import org.omg.space.xtce.VerifiersType;
import org.omg.space.xtce.XtcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Command Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandTypeImpl#getBaseMetaCommand <em>Base Meta Command</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandTypeImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandTypeImpl#getArgumentList <em>Argument List</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandTypeImpl#getCommandContainer <em>Command Container</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandTypeImpl#getTransmissionConstraintList <em>Transmission Constraint List</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandTypeImpl#getDefaultSignificance <em>Default Significance</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandTypeImpl#getContextSignificanceList <em>Context Significance List</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandTypeImpl#getInterlock <em>Interlock</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandTypeImpl#getVerifiers <em>Verifiers</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandTypeImpl#getParameterToSetList <em>Parameter To Set List</em>}</li>
 *   <li>{@link org.omg.space.xtce.impl.MetaCommandTypeImpl#isAbstract <em>Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaCommandTypeImpl extends NameDescriptionTypeImpl implements MetaCommandType {
	/**
	 * The cached value of the '{@link #getBaseMetaCommand() <em>Base Meta Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMetaCommand()
	 * @generated
	 * @ordered
	 */
	protected BaseMetaCommandType baseMetaCommand;

	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArgumentList() <em>Argument List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentList()
	 * @generated
	 * @ordered
	 */
	protected ArgumentListType1 argumentList;

	/**
	 * The cached value of the '{@link #getCommandContainer() <em>Command Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandContainer()
	 * @generated
	 * @ordered
	 */
	protected CommandContainerType commandContainer;

	/**
	 * The cached value of the '{@link #getTransmissionConstraintList() <em>Transmission Constraint List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionConstraintList()
	 * @generated
	 * @ordered
	 */
	protected TransmissionConstraintListType transmissionConstraintList;

	/**
	 * The cached value of the '{@link #getDefaultSignificance() <em>Default Significance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSignificance()
	 * @generated
	 * @ordered
	 */
	protected SignificanceType defaultSignificance;

	/**
	 * The cached value of the '{@link #getContextSignificanceList() <em>Context Significance List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextSignificanceList()
	 * @generated
	 * @ordered
	 */
	protected ContextSignificanceListType contextSignificanceList;

	/**
	 * The cached value of the '{@link #getInterlock() <em>Interlock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterlock()
	 * @generated
	 * @ordered
	 */
	protected InterlockType interlock;

	/**
	 * The cached value of the '{@link #getVerifiers() <em>Verifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiers()
	 * @generated
	 * @ordered
	 */
	protected VerifiersType verifiers;

	/**
	 * The cached value of the '{@link #getParameterToSetList() <em>Parameter To Set List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterToSetList()
	 * @generated
	 * @ordered
	 */
	protected ParameterToSetListType parameterToSetList;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean abstractESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaCommandTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtcePackage.eINSTANCE.getMetaCommandType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseMetaCommandType getBaseMetaCommand() {
		return baseMetaCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseMetaCommand(BaseMetaCommandType newBaseMetaCommand, NotificationChain msgs) {
		BaseMetaCommandType oldBaseMetaCommand = baseMetaCommand;
		baseMetaCommand = newBaseMetaCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__BASE_META_COMMAND, oldBaseMetaCommand, newBaseMetaCommand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseMetaCommand(BaseMetaCommandType newBaseMetaCommand) {
		if (newBaseMetaCommand != baseMetaCommand) {
			NotificationChain msgs = null;
			if (baseMetaCommand != null)
				msgs = ((InternalEObject)baseMetaCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__BASE_META_COMMAND, null, msgs);
			if (newBaseMetaCommand != null)
				msgs = ((InternalEObject)newBaseMetaCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__BASE_META_COMMAND, null, msgs);
			msgs = basicSetBaseMetaCommand(newBaseMetaCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__BASE_META_COMMAND, newBaseMetaCommand, newBaseMetaCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentListType1 getArgumentList() {
		return argumentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgumentList(ArgumentListType1 newArgumentList, NotificationChain msgs) {
		ArgumentListType1 oldArgumentList = argumentList;
		argumentList = newArgumentList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__ARGUMENT_LIST, oldArgumentList, newArgumentList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentList(ArgumentListType1 newArgumentList) {
		if (newArgumentList != argumentList) {
			NotificationChain msgs = null;
			if (argumentList != null)
				msgs = ((InternalEObject)argumentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__ARGUMENT_LIST, null, msgs);
			if (newArgumentList != null)
				msgs = ((InternalEObject)newArgumentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__ARGUMENT_LIST, null, msgs);
			msgs = basicSetArgumentList(newArgumentList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__ARGUMENT_LIST, newArgumentList, newArgumentList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandContainerType getCommandContainer() {
		return commandContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommandContainer(CommandContainerType newCommandContainer, NotificationChain msgs) {
		CommandContainerType oldCommandContainer = commandContainer;
		commandContainer = newCommandContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__COMMAND_CONTAINER, oldCommandContainer, newCommandContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandContainer(CommandContainerType newCommandContainer) {
		if (newCommandContainer != commandContainer) {
			NotificationChain msgs = null;
			if (commandContainer != null)
				msgs = ((InternalEObject)commandContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__COMMAND_CONTAINER, null, msgs);
			if (newCommandContainer != null)
				msgs = ((InternalEObject)newCommandContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__COMMAND_CONTAINER, null, msgs);
			msgs = basicSetCommandContainer(newCommandContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__COMMAND_CONTAINER, newCommandContainer, newCommandContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionConstraintListType getTransmissionConstraintList() {
		return transmissionConstraintList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransmissionConstraintList(TransmissionConstraintListType newTransmissionConstraintList, NotificationChain msgs) {
		TransmissionConstraintListType oldTransmissionConstraintList = transmissionConstraintList;
		transmissionConstraintList = newTransmissionConstraintList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__TRANSMISSION_CONSTRAINT_LIST, oldTransmissionConstraintList, newTransmissionConstraintList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionConstraintList(TransmissionConstraintListType newTransmissionConstraintList) {
		if (newTransmissionConstraintList != transmissionConstraintList) {
			NotificationChain msgs = null;
			if (transmissionConstraintList != null)
				msgs = ((InternalEObject)transmissionConstraintList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__TRANSMISSION_CONSTRAINT_LIST, null, msgs);
			if (newTransmissionConstraintList != null)
				msgs = ((InternalEObject)newTransmissionConstraintList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__TRANSMISSION_CONSTRAINT_LIST, null, msgs);
			msgs = basicSetTransmissionConstraintList(newTransmissionConstraintList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__TRANSMISSION_CONSTRAINT_LIST, newTransmissionConstraintList, newTransmissionConstraintList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignificanceType getDefaultSignificance() {
		return defaultSignificance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultSignificance(SignificanceType newDefaultSignificance, NotificationChain msgs) {
		SignificanceType oldDefaultSignificance = defaultSignificance;
		defaultSignificance = newDefaultSignificance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__DEFAULT_SIGNIFICANCE, oldDefaultSignificance, newDefaultSignificance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultSignificance(SignificanceType newDefaultSignificance) {
		if (newDefaultSignificance != defaultSignificance) {
			NotificationChain msgs = null;
			if (defaultSignificance != null)
				msgs = ((InternalEObject)defaultSignificance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__DEFAULT_SIGNIFICANCE, null, msgs);
			if (newDefaultSignificance != null)
				msgs = ((InternalEObject)newDefaultSignificance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__DEFAULT_SIGNIFICANCE, null, msgs);
			msgs = basicSetDefaultSignificance(newDefaultSignificance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__DEFAULT_SIGNIFICANCE, newDefaultSignificance, newDefaultSignificance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextSignificanceListType getContextSignificanceList() {
		return contextSignificanceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextSignificanceList(ContextSignificanceListType newContextSignificanceList, NotificationChain msgs) {
		ContextSignificanceListType oldContextSignificanceList = contextSignificanceList;
		contextSignificanceList = newContextSignificanceList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__CONTEXT_SIGNIFICANCE_LIST, oldContextSignificanceList, newContextSignificanceList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextSignificanceList(ContextSignificanceListType newContextSignificanceList) {
		if (newContextSignificanceList != contextSignificanceList) {
			NotificationChain msgs = null;
			if (contextSignificanceList != null)
				msgs = ((InternalEObject)contextSignificanceList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__CONTEXT_SIGNIFICANCE_LIST, null, msgs);
			if (newContextSignificanceList != null)
				msgs = ((InternalEObject)newContextSignificanceList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__CONTEXT_SIGNIFICANCE_LIST, null, msgs);
			msgs = basicSetContextSignificanceList(newContextSignificanceList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__CONTEXT_SIGNIFICANCE_LIST, newContextSignificanceList, newContextSignificanceList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterlockType getInterlock() {
		return interlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterlock(InterlockType newInterlock, NotificationChain msgs) {
		InterlockType oldInterlock = interlock;
		interlock = newInterlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__INTERLOCK, oldInterlock, newInterlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterlock(InterlockType newInterlock) {
		if (newInterlock != interlock) {
			NotificationChain msgs = null;
			if (interlock != null)
				msgs = ((InternalEObject)interlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__INTERLOCK, null, msgs);
			if (newInterlock != null)
				msgs = ((InternalEObject)newInterlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__INTERLOCK, null, msgs);
			msgs = basicSetInterlock(newInterlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__INTERLOCK, newInterlock, newInterlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifiersType getVerifiers() {
		return verifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerifiers(VerifiersType newVerifiers, NotificationChain msgs) {
		VerifiersType oldVerifiers = verifiers;
		verifiers = newVerifiers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__VERIFIERS, oldVerifiers, newVerifiers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerifiers(VerifiersType newVerifiers) {
		if (newVerifiers != verifiers) {
			NotificationChain msgs = null;
			if (verifiers != null)
				msgs = ((InternalEObject)verifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__VERIFIERS, null, msgs);
			if (newVerifiers != null)
				msgs = ((InternalEObject)newVerifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__VERIFIERS, null, msgs);
			msgs = basicSetVerifiers(newVerifiers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__VERIFIERS, newVerifiers, newVerifiers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterToSetListType getParameterToSetList() {
		return parameterToSetList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterToSetList(ParameterToSetListType newParameterToSetList, NotificationChain msgs) {
		ParameterToSetListType oldParameterToSetList = parameterToSetList;
		parameterToSetList = newParameterToSetList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__PARAMETER_TO_SET_LIST, oldParameterToSetList, newParameterToSetList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterToSetList(ParameterToSetListType newParameterToSetList) {
		if (newParameterToSetList != parameterToSetList) {
			NotificationChain msgs = null;
			if (parameterToSetList != null)
				msgs = ((InternalEObject)parameterToSetList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__PARAMETER_TO_SET_LIST, null, msgs);
			if (newParameterToSetList != null)
				msgs = ((InternalEObject)newParameterToSetList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtcePackage.META_COMMAND_TYPE__PARAMETER_TO_SET_LIST, null, msgs);
			msgs = basicSetParameterToSetList(newParameterToSetList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__PARAMETER_TO_SET_LIST, newParameterToSetList, newParameterToSetList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		boolean oldAbstractESet = abstractESet;
		abstractESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtcePackage.META_COMMAND_TYPE__ABSTRACT, oldAbstract, abstract_, !oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAbstract() {
		boolean oldAbstract = abstract_;
		boolean oldAbstractESet = abstractESet;
		abstract_ = ABSTRACT_EDEFAULT;
		abstractESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XtcePackage.META_COMMAND_TYPE__ABSTRACT, oldAbstract, ABSTRACT_EDEFAULT, oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAbstract() {
		return abstractESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtcePackage.META_COMMAND_TYPE__BASE_META_COMMAND:
				return basicSetBaseMetaCommand(null, msgs);
			case XtcePackage.META_COMMAND_TYPE__ARGUMENT_LIST:
				return basicSetArgumentList(null, msgs);
			case XtcePackage.META_COMMAND_TYPE__COMMAND_CONTAINER:
				return basicSetCommandContainer(null, msgs);
			case XtcePackage.META_COMMAND_TYPE__TRANSMISSION_CONSTRAINT_LIST:
				return basicSetTransmissionConstraintList(null, msgs);
			case XtcePackage.META_COMMAND_TYPE__DEFAULT_SIGNIFICANCE:
				return basicSetDefaultSignificance(null, msgs);
			case XtcePackage.META_COMMAND_TYPE__CONTEXT_SIGNIFICANCE_LIST:
				return basicSetContextSignificanceList(null, msgs);
			case XtcePackage.META_COMMAND_TYPE__INTERLOCK:
				return basicSetInterlock(null, msgs);
			case XtcePackage.META_COMMAND_TYPE__VERIFIERS:
				return basicSetVerifiers(null, msgs);
			case XtcePackage.META_COMMAND_TYPE__PARAMETER_TO_SET_LIST:
				return basicSetParameterToSetList(null, msgs);
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
			case XtcePackage.META_COMMAND_TYPE__BASE_META_COMMAND:
				return getBaseMetaCommand();
			case XtcePackage.META_COMMAND_TYPE__SYSTEM_NAME:
				return getSystemName();
			case XtcePackage.META_COMMAND_TYPE__ARGUMENT_LIST:
				return getArgumentList();
			case XtcePackage.META_COMMAND_TYPE__COMMAND_CONTAINER:
				return getCommandContainer();
			case XtcePackage.META_COMMAND_TYPE__TRANSMISSION_CONSTRAINT_LIST:
				return getTransmissionConstraintList();
			case XtcePackage.META_COMMAND_TYPE__DEFAULT_SIGNIFICANCE:
				return getDefaultSignificance();
			case XtcePackage.META_COMMAND_TYPE__CONTEXT_SIGNIFICANCE_LIST:
				return getContextSignificanceList();
			case XtcePackage.META_COMMAND_TYPE__INTERLOCK:
				return getInterlock();
			case XtcePackage.META_COMMAND_TYPE__VERIFIERS:
				return getVerifiers();
			case XtcePackage.META_COMMAND_TYPE__PARAMETER_TO_SET_LIST:
				return getParameterToSetList();
			case XtcePackage.META_COMMAND_TYPE__ABSTRACT:
				return isAbstract();
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
			case XtcePackage.META_COMMAND_TYPE__BASE_META_COMMAND:
				setBaseMetaCommand((BaseMetaCommandType)newValue);
				return;
			case XtcePackage.META_COMMAND_TYPE__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case XtcePackage.META_COMMAND_TYPE__ARGUMENT_LIST:
				setArgumentList((ArgumentListType1)newValue);
				return;
			case XtcePackage.META_COMMAND_TYPE__COMMAND_CONTAINER:
				setCommandContainer((CommandContainerType)newValue);
				return;
			case XtcePackage.META_COMMAND_TYPE__TRANSMISSION_CONSTRAINT_LIST:
				setTransmissionConstraintList((TransmissionConstraintListType)newValue);
				return;
			case XtcePackage.META_COMMAND_TYPE__DEFAULT_SIGNIFICANCE:
				setDefaultSignificance((SignificanceType)newValue);
				return;
			case XtcePackage.META_COMMAND_TYPE__CONTEXT_SIGNIFICANCE_LIST:
				setContextSignificanceList((ContextSignificanceListType)newValue);
				return;
			case XtcePackage.META_COMMAND_TYPE__INTERLOCK:
				setInterlock((InterlockType)newValue);
				return;
			case XtcePackage.META_COMMAND_TYPE__VERIFIERS:
				setVerifiers((VerifiersType)newValue);
				return;
			case XtcePackage.META_COMMAND_TYPE__PARAMETER_TO_SET_LIST:
				setParameterToSetList((ParameterToSetListType)newValue);
				return;
			case XtcePackage.META_COMMAND_TYPE__ABSTRACT:
				setAbstract((Boolean)newValue);
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
			case XtcePackage.META_COMMAND_TYPE__BASE_META_COMMAND:
				setBaseMetaCommand((BaseMetaCommandType)null);
				return;
			case XtcePackage.META_COMMAND_TYPE__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case XtcePackage.META_COMMAND_TYPE__ARGUMENT_LIST:
				setArgumentList((ArgumentListType1)null);
				return;
			case XtcePackage.META_COMMAND_TYPE__COMMAND_CONTAINER:
				setCommandContainer((CommandContainerType)null);
				return;
			case XtcePackage.META_COMMAND_TYPE__TRANSMISSION_CONSTRAINT_LIST:
				setTransmissionConstraintList((TransmissionConstraintListType)null);
				return;
			case XtcePackage.META_COMMAND_TYPE__DEFAULT_SIGNIFICANCE:
				setDefaultSignificance((SignificanceType)null);
				return;
			case XtcePackage.META_COMMAND_TYPE__CONTEXT_SIGNIFICANCE_LIST:
				setContextSignificanceList((ContextSignificanceListType)null);
				return;
			case XtcePackage.META_COMMAND_TYPE__INTERLOCK:
				setInterlock((InterlockType)null);
				return;
			case XtcePackage.META_COMMAND_TYPE__VERIFIERS:
				setVerifiers((VerifiersType)null);
				return;
			case XtcePackage.META_COMMAND_TYPE__PARAMETER_TO_SET_LIST:
				setParameterToSetList((ParameterToSetListType)null);
				return;
			case XtcePackage.META_COMMAND_TYPE__ABSTRACT:
				unsetAbstract();
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
			case XtcePackage.META_COMMAND_TYPE__BASE_META_COMMAND:
				return baseMetaCommand != null;
			case XtcePackage.META_COMMAND_TYPE__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case XtcePackage.META_COMMAND_TYPE__ARGUMENT_LIST:
				return argumentList != null;
			case XtcePackage.META_COMMAND_TYPE__COMMAND_CONTAINER:
				return commandContainer != null;
			case XtcePackage.META_COMMAND_TYPE__TRANSMISSION_CONSTRAINT_LIST:
				return transmissionConstraintList != null;
			case XtcePackage.META_COMMAND_TYPE__DEFAULT_SIGNIFICANCE:
				return defaultSignificance != null;
			case XtcePackage.META_COMMAND_TYPE__CONTEXT_SIGNIFICANCE_LIST:
				return contextSignificanceList != null;
			case XtcePackage.META_COMMAND_TYPE__INTERLOCK:
				return interlock != null;
			case XtcePackage.META_COMMAND_TYPE__VERIFIERS:
				return verifiers != null;
			case XtcePackage.META_COMMAND_TYPE__PARAMETER_TO_SET_LIST:
				return parameterToSetList != null;
			case XtcePackage.META_COMMAND_TYPE__ABSTRACT:
				return isSetAbstract();
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
		result.append(" (systemName: ");
		result.append(systemName);
		result.append(", abstract: ");
		if (abstractESet) result.append(abstract_); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MetaCommandTypeImpl
