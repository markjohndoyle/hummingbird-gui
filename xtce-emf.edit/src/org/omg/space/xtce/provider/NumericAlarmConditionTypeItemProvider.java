/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.provider;


import java.math.BigInteger;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.omg.space.xtce.NumericAlarmConditionType;
import org.omg.space.xtce.XtceFactory;
import org.omg.space.xtce.XtcePackage;

/**
 * This is the item provider adapter for a {@link org.omg.space.xtce.NumericAlarmConditionType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NumericAlarmConditionTypeItemProvider
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
	public NumericAlarmConditionTypeItemProvider(AdapterFactory adapterFactory) {
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

			addMinViolationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Min Violations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinViolationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumericAlarmConditionType_minViolations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumericAlarmConditionType_minViolations_feature", "_UI_NumericAlarmConditionType_type"),
				 XtcePackage.eINSTANCE.getNumericAlarmConditionType_MinViolations(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(XtcePackage.eINSTANCE.getNumericAlarmConditionType_StaticAlarmRanges());
			childrenFeatures.add(XtcePackage.eINSTANCE.getNumericAlarmConditionType_ChangePerSecondAlarmRanges());
			childrenFeatures.add(XtcePackage.eINSTANCE.getNumericAlarmConditionType_ConditionalAlarm());
			childrenFeatures.add(XtcePackage.eINSTANCE.getNumericAlarmConditionType_CustomAlarm());
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
	 * This returns NumericAlarmConditionType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NumericAlarmConditionType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BigInteger labelValue = ((NumericAlarmConditionType)object).getMinViolations();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_NumericAlarmConditionType_type") :
			getString("_UI_NumericAlarmConditionType_type") + " " + label;
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

		switch (notification.getFeatureID(NumericAlarmConditionType.class)) {
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__MIN_VIOLATIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__STATIC_ALARM_RANGES:
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CHANGE_PER_SECOND_ALARM_RANGES:
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CONDITIONAL_ALARM:
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE__CUSTOM_ALARM:
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
				(XtcePackage.eINSTANCE.getNumericAlarmConditionType_StaticAlarmRanges(),
				 XtceFactory.eINSTANCE.createAlarmRangesType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getNumericAlarmConditionType_ChangePerSecondAlarmRanges(),
				 XtceFactory.eINSTANCE.createAlarmRangesType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getNumericAlarmConditionType_ConditionalAlarm(),
				 XtceFactory.eINSTANCE.createConditionalAlarmType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getNumericAlarmConditionType_CustomAlarm(),
				 XtceFactory.eINSTANCE.createInputAlgorithmType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getNumericAlarmConditionType_CustomAlarm(),
				 XtceFactory.eINSTANCE.createInputOutputAlgorithmType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getNumericAlarmConditionType_CustomAlarm(),
				 XtceFactory.eINSTANCE.createInputOutputTriggerAlgorithmType()));
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

		boolean qualify =
			childFeature == XtcePackage.eINSTANCE.getNumericAlarmConditionType_StaticAlarmRanges() ||
			childFeature == XtcePackage.eINSTANCE.getNumericAlarmConditionType_ChangePerSecondAlarmRanges();

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
