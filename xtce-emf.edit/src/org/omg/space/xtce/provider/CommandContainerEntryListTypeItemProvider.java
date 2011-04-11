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

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.omg.space.xtce.CommandContainerEntryListType;
import org.omg.space.xtce.XtceFactory;
import org.omg.space.xtce.XtcePackage;

/**
 * This is the item provider adapter for a {@link org.omg.space.xtce.CommandContainerEntryListType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandContainerEntryListTypeItemProvider
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
	public CommandContainerEntryListTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(XtcePackage.eINSTANCE.getCommandContainerEntryListType_Group());
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
	 * This returns CommandContainerEntryListType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CommandContainerEntryListType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_CommandContainerEntryListType_type");
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

		switch (notification.getFeatureID(CommandContainerEntryListType.class)) {
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE__GROUP:
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
				(XtcePackage.eINSTANCE.getCommandContainerEntryListType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getCommandContainerEntryListType_ParameterRefEntry(),
					 XtceFactory.eINSTANCE.createParameterRefEntryType())));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getCommandContainerEntryListType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getCommandContainerEntryListType_ParameterSegmentRefEntry(),
					 XtceFactory.eINSTANCE.createParameterSegmentRefEntryType())));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getCommandContainerEntryListType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getCommandContainerEntryListType_ContainerRefEntry(),
					 XtceFactory.eINSTANCE.createContainerRefEntryType())));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getCommandContainerEntryListType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getCommandContainerEntryListType_ContainerSegmentRefEntry(),
					 XtceFactory.eINSTANCE.createContainerSegmentRefEntryType())));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getCommandContainerEntryListType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getCommandContainerEntryListType_StreamSegmentEntry(),
					 XtceFactory.eINSTANCE.createStreamSegmentEntryType())));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getCommandContainerEntryListType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getCommandContainerEntryListType_IndirectParameterRefEntry(),
					 XtceFactory.eINSTANCE.createIndirectParameterRefEntryType())));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getCommandContainerEntryListType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getCommandContainerEntryListType_ArrayParameterRefEntry(),
					 XtceFactory.eINSTANCE.createArrayParameterRefEntryType())));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getCommandContainerEntryListType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getCommandContainerEntryListType_ArgumentRefEntry(),
					 XtceFactory.eINSTANCE.createArgumentRefEntryType())));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getCommandContainerEntryListType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getCommandContainerEntryListType_ArrayArgumentRefEntry(),
					 XtceFactory.eINSTANCE.createArrayParameterRefEntryType())));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getCommandContainerEntryListType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getCommandContainerEntryListType_FixedValueEntry(),
					 XtceFactory.eINSTANCE.createFixedValueEntryType())));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == XtcePackage.eINSTANCE.getCommandContainerEntryListType_ArrayParameterRefEntry() ||
			childFeature == XtcePackage.eINSTANCE.getCommandContainerEntryListType_ArrayArgumentRefEntry();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
