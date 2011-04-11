/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.omg.space.xtce.VerifiersType;
import org.omg.space.xtce.XtceFactory;
import org.omg.space.xtce.XtcePackage;

/**
 * This is the item provider adapter for a {@link org.omg.space.xtce.VerifiersType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VerifiersTypeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifiersTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(XtcePackage.eINSTANCE.getVerifiersType_TransferredToRangeVerifier());
			childrenFeatures.add(XtcePackage.eINSTANCE.getVerifiersType_SentFromRangeVerifier());
			childrenFeatures.add(XtcePackage.eINSTANCE.getVerifiersType_ReceivedVerifier());
			childrenFeatures.add(XtcePackage.eINSTANCE.getVerifiersType_AcceptedVerifier());
			childrenFeatures.add(XtcePackage.eINSTANCE.getVerifiersType_QueuedVerifier());
			childrenFeatures.add(XtcePackage.eINSTANCE.getVerifiersType_ExecutionVerifier());
			childrenFeatures.add(XtcePackage.eINSTANCE.getVerifiersType_CompleteVerifier());
			childrenFeatures.add(XtcePackage.eINSTANCE.getVerifiersType_FailedVerifier());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns VerifiersType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VerifiersType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_VerifiersType_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(VerifiersType.class)) {
			case XtcePackage.VERIFIERS_TYPE__TRANSFERRED_TO_RANGE_VERIFIER:
			case XtcePackage.VERIFIERS_TYPE__SENT_FROM_RANGE_VERIFIER:
			case XtcePackage.VERIFIERS_TYPE__RECEIVED_VERIFIER:
			case XtcePackage.VERIFIERS_TYPE__ACCEPTED_VERIFIER:
			case XtcePackage.VERIFIERS_TYPE__QUEUED_VERIFIER:
			case XtcePackage.VERIFIERS_TYPE__EXECUTION_VERIFIER:
			case XtcePackage.VERIFIERS_TYPE__COMPLETE_VERIFIER:
			case XtcePackage.VERIFIERS_TYPE__FAILED_VERIFIER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getVerifiersType_TransferredToRangeVerifier(),
				 XtceFactory.eINSTANCE.createTransferredToRangeVerifierType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getVerifiersType_SentFromRangeVerifier(),
				 XtceFactory.eINSTANCE.createSentFromRangeVerifierType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getVerifiersType_ReceivedVerifier(),
				 XtceFactory.eINSTANCE.createReceivedVerifierType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getVerifiersType_AcceptedVerifier(),
				 XtceFactory.eINSTANCE.createAcceptedVerifierType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getVerifiersType_QueuedVerifier(),
				 XtceFactory.eINSTANCE.createQueuedVerifierType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getVerifiersType_ExecutionVerifier(),
				 XtceFactory.eINSTANCE.createExecutionVerifierType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getVerifiersType_CompleteVerifier(),
				 XtceFactory.eINSTANCE.createCompleteVerifierType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getVerifiersType_FailedVerifier(),
				 XtceFactory.eINSTANCE.createCommandVerifierType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SpaceSystemV1EditPlugin.INSTANCE;
	}

}
