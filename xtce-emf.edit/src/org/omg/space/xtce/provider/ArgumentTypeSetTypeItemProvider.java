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

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.omg.space.xtce.ArgumentTypeSetType;
import org.omg.space.xtce.XtceFactory;
import org.omg.space.xtce.XtcePackage;

/**
 * This is the item provider adapter for a {@link org.omg.space.xtce.ArgumentTypeSetType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentTypeSetTypeItemProvider
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
	public ArgumentTypeSetTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(XtcePackage.eINSTANCE.getArgumentTypeSetType_Group());
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
	 * This returns ArgumentTypeSetType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArgumentTypeSetType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ArgumentTypeSetType_type");
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

		switch (notification.getFeatureID(ArgumentTypeSetType.class)) {
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE__GROUP:
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
				(XtcePackage.eINSTANCE.getArgumentTypeSetType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getArgumentTypeSetType_StringArgumentType(),
					 XtceFactory.eINSTANCE.createStringDataType())));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getArgumentTypeSetType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getArgumentTypeSetType_EnumeratedArgumentType(),
					 XtceFactory.eINSTANCE.createEnumeratedDataType())));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getArgumentTypeSetType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getArgumentTypeSetType_IntegerArgumentType(),
					 XtceFactory.eINSTANCE.createIntegerArgumentTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getArgumentTypeSetType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getArgumentTypeSetType_BinaryArgumentType(),
					 XtceFactory.eINSTANCE.createBinaryDataType())));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getArgumentTypeSetType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getArgumentTypeSetType_FloatArgumentType(),
					 XtceFactory.eINSTANCE.createFloatArgumentTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getArgumentTypeSetType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getArgumentTypeSetType_BooleanArgumentType(),
					 XtceFactory.eINSTANCE.createBooleanDataType())));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getArgumentTypeSetType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getArgumentTypeSetType_RelativeTimeAgumentType(),
					 XtceFactory.eINSTANCE.createRelativeTimeDataType())));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getArgumentTypeSetType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getArgumentTypeSetType_AbsoluteTimeArgumentType(),
					 XtceFactory.eINSTANCE.createAbsoluteTimeDataType())));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getArgumentTypeSetType_Group(),
				 FeatureMapUtil.createEntry
					(XtcePackage.eINSTANCE.getArgumentTypeSetType_ArgumementArrayType(),
					 XtceFactory.eINSTANCE.createArgumementArrayTypeType())));
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
