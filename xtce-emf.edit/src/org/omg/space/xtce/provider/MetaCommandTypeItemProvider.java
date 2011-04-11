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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.omg.space.xtce.MetaCommandType;
import org.omg.space.xtce.XtceFactory;
import org.omg.space.xtce.XtcePackage;

/**
 * This is the item provider adapter for a {@link org.omg.space.xtce.MetaCommandType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaCommandTypeItemProvider
	extends NameDescriptionTypeItemProvider
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
	public MetaCommandTypeItemProvider(AdapterFactory adapterFactory) {
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

			addSystemNamePropertyDescriptor(object);
			addAbstractPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the System Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSystemNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MetaCommandType_systemName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MetaCommandType_systemName_feature", "_UI_MetaCommandType_type"),
				 XtcePackage.eINSTANCE.getMetaCommandType_SystemName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MetaCommandType_abstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MetaCommandType_abstract_feature", "_UI_MetaCommandType_type"),
				 XtcePackage.eINSTANCE.getMetaCommandType_Abstract(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(XtcePackage.eINSTANCE.getMetaCommandType_BaseMetaCommand());
			childrenFeatures.add(XtcePackage.eINSTANCE.getMetaCommandType_ArgumentList());
			childrenFeatures.add(XtcePackage.eINSTANCE.getMetaCommandType_CommandContainer());
			childrenFeatures.add(XtcePackage.eINSTANCE.getMetaCommandType_TransmissionConstraintList());
			childrenFeatures.add(XtcePackage.eINSTANCE.getMetaCommandType_DefaultSignificance());
			childrenFeatures.add(XtcePackage.eINSTANCE.getMetaCommandType_ContextSignificanceList());
			childrenFeatures.add(XtcePackage.eINSTANCE.getMetaCommandType_Interlock());
			childrenFeatures.add(XtcePackage.eINSTANCE.getMetaCommandType_Verifiers());
			childrenFeatures.add(XtcePackage.eINSTANCE.getMetaCommandType_ParameterToSetList());
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
	 * This returns MetaCommandType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MetaCommandType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MetaCommandType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MetaCommandType_type") :
			getString("_UI_MetaCommandType_type") + " " + label;
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

		switch (notification.getFeatureID(MetaCommandType.class)) {
			case XtcePackage.META_COMMAND_TYPE__SYSTEM_NAME:
			case XtcePackage.META_COMMAND_TYPE__ABSTRACT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XtcePackage.META_COMMAND_TYPE__BASE_META_COMMAND:
			case XtcePackage.META_COMMAND_TYPE__ARGUMENT_LIST:
			case XtcePackage.META_COMMAND_TYPE__COMMAND_CONTAINER:
			case XtcePackage.META_COMMAND_TYPE__TRANSMISSION_CONSTRAINT_LIST:
			case XtcePackage.META_COMMAND_TYPE__DEFAULT_SIGNIFICANCE:
			case XtcePackage.META_COMMAND_TYPE__CONTEXT_SIGNIFICANCE_LIST:
			case XtcePackage.META_COMMAND_TYPE__INTERLOCK:
			case XtcePackage.META_COMMAND_TYPE__VERIFIERS:
			case XtcePackage.META_COMMAND_TYPE__PARAMETER_TO_SET_LIST:
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
				(XtcePackage.eINSTANCE.getMetaCommandType_BaseMetaCommand(),
				 XtceFactory.eINSTANCE.createBaseMetaCommandType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMetaCommandType_ArgumentList(),
				 XtceFactory.eINSTANCE.createArgumentListType1()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMetaCommandType_CommandContainer(),
				 XtceFactory.eINSTANCE.createCommandContainerType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMetaCommandType_TransmissionConstraintList(),
				 XtceFactory.eINSTANCE.createTransmissionConstraintListType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMetaCommandType_DefaultSignificance(),
				 XtceFactory.eINSTANCE.createSignificanceType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMetaCommandType_ContextSignificanceList(),
				 XtceFactory.eINSTANCE.createContextSignificanceListType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMetaCommandType_Interlock(),
				 XtceFactory.eINSTANCE.createInterlockType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMetaCommandType_Verifiers(),
				 XtceFactory.eINSTANCE.createVerifiersType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMetaCommandType_ParameterToSetList(),
				 XtceFactory.eINSTANCE.createParameterToSetListType()));
	}

}
