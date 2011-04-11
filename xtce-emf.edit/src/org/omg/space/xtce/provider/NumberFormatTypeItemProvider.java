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

import org.omg.space.xtce.NumberFormatType;
import org.omg.space.xtce.XtcePackage;

/**
 * This is the item provider adapter for a {@link org.omg.space.xtce.NumberFormatType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NumberFormatTypeItemProvider
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
	public NumberFormatTypeItemProvider(AdapterFactory adapterFactory) {
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

			addMaximumFractionDigitsPropertyDescriptor(object);
			addMaximumIntegerDigitsPropertyDescriptor(object);
			addMinimumFractionDigitsPropertyDescriptor(object);
			addMinimumIntegerDigitsPropertyDescriptor(object);
			addNegativePrefixPropertyDescriptor(object);
			addNegativeSuffixPropertyDescriptor(object);
			addNotationPropertyDescriptor(object);
			addNumberBasePropertyDescriptor(object);
			addPositivePrefixPropertyDescriptor(object);
			addPositiveSuffixPropertyDescriptor(object);
			addShowThousandsGroupingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Maximum Fraction Digits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumFractionDigitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumberFormatType_maximumFractionDigits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumberFormatType_maximumFractionDigits_feature", "_UI_NumberFormatType_type"),
				 XtcePackage.eINSTANCE.getNumberFormatType_MaximumFractionDigits(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Integer Digits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumIntegerDigitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumberFormatType_maximumIntegerDigits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumberFormatType_maximumIntegerDigits_feature", "_UI_NumberFormatType_type"),
				 XtcePackage.eINSTANCE.getNumberFormatType_MaximumIntegerDigits(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Fraction Digits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumFractionDigitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumberFormatType_minimumFractionDigits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumberFormatType_minimumFractionDigits_feature", "_UI_NumberFormatType_type"),
				 XtcePackage.eINSTANCE.getNumberFormatType_MinimumFractionDigits(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Integer Digits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumIntegerDigitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumberFormatType_minimumIntegerDigits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumberFormatType_minimumIntegerDigits_feature", "_UI_NumberFormatType_type"),
				 XtcePackage.eINSTANCE.getNumberFormatType_MinimumIntegerDigits(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Negative Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNegativePrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumberFormatType_negativePrefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumberFormatType_negativePrefix_feature", "_UI_NumberFormatType_type"),
				 XtcePackage.eINSTANCE.getNumberFormatType_NegativePrefix(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Negative Suffix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNegativeSuffixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumberFormatType_negativeSuffix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumberFormatType_negativeSuffix_feature", "_UI_NumberFormatType_type"),
				 XtcePackage.eINSTANCE.getNumberFormatType_NegativeSuffix(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumberFormatType_notation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumberFormatType_notation_feature", "_UI_NumberFormatType_type"),
				 XtcePackage.eINSTANCE.getNumberFormatType_Notation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Base feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberBasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumberFormatType_numberBase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumberFormatType_numberBase_feature", "_UI_NumberFormatType_type"),
				 XtcePackage.eINSTANCE.getNumberFormatType_NumberBase(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Positive Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositivePrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumberFormatType_positivePrefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumberFormatType_positivePrefix_feature", "_UI_NumberFormatType_type"),
				 XtcePackage.eINSTANCE.getNumberFormatType_PositivePrefix(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Positive Suffix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositiveSuffixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumberFormatType_positiveSuffix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumberFormatType_positiveSuffix_feature", "_UI_NumberFormatType_type"),
				 XtcePackage.eINSTANCE.getNumberFormatType_PositiveSuffix(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Thousands Grouping feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowThousandsGroupingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumberFormatType_showThousandsGrouping_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumberFormatType_showThousandsGrouping_feature", "_UI_NumberFormatType_type"),
				 XtcePackage.eINSTANCE.getNumberFormatType_ShowThousandsGrouping(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns NumberFormatType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NumberFormatType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BigInteger labelValue = ((NumberFormatType)object).getMaximumFractionDigits();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_NumberFormatType_type") :
			getString("_UI_NumberFormatType_type") + " " + label;
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

		switch (notification.getFeatureID(NumberFormatType.class)) {
			case XtcePackage.NUMBER_FORMAT_TYPE__MAXIMUM_FRACTION_DIGITS:
			case XtcePackage.NUMBER_FORMAT_TYPE__MAXIMUM_INTEGER_DIGITS:
			case XtcePackage.NUMBER_FORMAT_TYPE__MINIMUM_FRACTION_DIGITS:
			case XtcePackage.NUMBER_FORMAT_TYPE__MINIMUM_INTEGER_DIGITS:
			case XtcePackage.NUMBER_FORMAT_TYPE__NEGATIVE_PREFIX:
			case XtcePackage.NUMBER_FORMAT_TYPE__NEGATIVE_SUFFIX:
			case XtcePackage.NUMBER_FORMAT_TYPE__NOTATION:
			case XtcePackage.NUMBER_FORMAT_TYPE__NUMBER_BASE:
			case XtcePackage.NUMBER_FORMAT_TYPE__POSITIVE_PREFIX:
			case XtcePackage.NUMBER_FORMAT_TYPE__POSITIVE_SUFFIX:
			case XtcePackage.NUMBER_FORMAT_TYPE__SHOW_THOUSANDS_GROUPING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
