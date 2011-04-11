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

import org.omg.space.xtce.AlarmConditionsType;
import org.omg.space.xtce.XtceFactory;
import org.omg.space.xtce.XtcePackage;

/**
 * This is the item provider adapter for a {@link org.omg.space.xtce.AlarmConditionsType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AlarmConditionsTypeItemProvider
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
	public AlarmConditionsTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(XtcePackage.eINSTANCE.getAlarmConditionsType_WatchAlarm());
			childrenFeatures.add(XtcePackage.eINSTANCE.getAlarmConditionsType_WarningAlarm());
			childrenFeatures.add(XtcePackage.eINSTANCE.getAlarmConditionsType_DistressAlarm());
			childrenFeatures.add(XtcePackage.eINSTANCE.getAlarmConditionsType_CritialAlarm());
			childrenFeatures.add(XtcePackage.eINSTANCE.getAlarmConditionsType_SevereAlarm());
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
	 * This returns AlarmConditionsType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AlarmConditionsType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_AlarmConditionsType_type");
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

		switch (notification.getFeatureID(AlarmConditionsType.class)) {
			case XtcePackage.ALARM_CONDITIONS_TYPE__WATCH_ALARM:
			case XtcePackage.ALARM_CONDITIONS_TYPE__WARNING_ALARM:
			case XtcePackage.ALARM_CONDITIONS_TYPE__DISTRESS_ALARM:
			case XtcePackage.ALARM_CONDITIONS_TYPE__CRITIAL_ALARM:
			case XtcePackage.ALARM_CONDITIONS_TYPE__SEVERE_ALARM:
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
				(XtcePackage.eINSTANCE.getAlarmConditionsType_WatchAlarm(),
				 XtceFactory.eINSTANCE.createMatchCriteriaType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getAlarmConditionsType_WarningAlarm(),
				 XtceFactory.eINSTANCE.createMatchCriteriaType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getAlarmConditionsType_DistressAlarm(),
				 XtceFactory.eINSTANCE.createMatchCriteriaType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getAlarmConditionsType_CritialAlarm(),
				 XtceFactory.eINSTANCE.createMatchCriteriaType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getAlarmConditionsType_SevereAlarm(),
				 XtceFactory.eINSTANCE.createMatchCriteriaType()));
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
			childFeature == XtcePackage.eINSTANCE.getAlarmConditionsType_WatchAlarm() ||
			childFeature == XtcePackage.eINSTANCE.getAlarmConditionsType_WarningAlarm() ||
			childFeature == XtcePackage.eINSTANCE.getAlarmConditionsType_DistressAlarm() ||
			childFeature == XtcePackage.eINSTANCE.getAlarmConditionsType_CritialAlarm() ||
			childFeature == XtcePackage.eINSTANCE.getAlarmConditionsType_SevereAlarm();

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
