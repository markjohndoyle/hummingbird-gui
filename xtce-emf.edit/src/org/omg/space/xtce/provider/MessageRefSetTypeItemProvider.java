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

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.omg.space.xtce.MessageRefSetType;
import org.omg.space.xtce.XtceFactory;
import org.omg.space.xtce.XtcePackage;

/**
 * This is the item provider adapter for a {@link org.omg.space.xtce.MessageRefSetType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageRefSetTypeItemProvider
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
	public MessageRefSetTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef());
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
	 * This returns MessageRefSetType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MessageRefSetType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_MessageRefSetType_type");
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

		switch (notification.getFeatureID(MessageRefSetType.class)) {
			case XtcePackage.MESSAGE_REF_SET_TYPE__MESSAGE_REF:
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
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createNameDescriptionType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createAbsoluteTimeDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createCommandVerifierType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createAlarmConditionsType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createAlarmRangesType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createAlgorithmSetType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createAliasSetType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createANDedConditionsType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createSequenceEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createArrayParameterRefEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createDataEncodingType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createBinaryDataEncodingType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createBinaryDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createBooleanDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createBooleanExpressionType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createByteOrderType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createCalibratorType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createCommandContainerEntryListType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createCommandContainerSetType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createCommandContainerType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createCommandMetaDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createComparisonCheckType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createParameterRefType1()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createParameterInstanceRefType1()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createComparisonType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createContainerRefEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createContainerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createContainerSegmentRefEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createContainerSetType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createNumericAlarmConditionType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createContextAlarmType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createContextCalibratorType2()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createCustomStreamType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createDecimalRangeType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createDecimalValueType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createMatchCriteriaType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createEntryListType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createEnumeratedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createErrorDetectCorrectType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createFrameStreamType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createFixedFrameStreamType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createSyncStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createFixedFrameSyncStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createNumericDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createFloatDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createFloatDataEncodingType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createHeaderType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createIndirectParameterRefEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createSimpleAlgorithmType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createInputAlgorithmType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createInputOutputAlgorithmType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createInputOutputTriggerAlgorithmType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createIntegerDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createIntegerDataEncodingType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createIntegerRangeType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createIntegerValueType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createMathAlgorithmType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createMathOperationType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createMessageRefType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createMetaCommandType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createNumberToStringType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createORedConditionsType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createParameterPropertiesType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createParameterRefEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createParameterSegmentRefEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createParameterSetType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createParameterToSetType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createParameterTypeSetType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createPhysicalAddressType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createPolynomialType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createRateInStreamType1()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createReferenceTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createRelativeTimeDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createRepeatType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createSequenceContainerType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createServiceRefType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createServiceType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createSignificanceType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createSpaceSystemType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createSplinePointType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createStreamRefType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createStreamSegmentEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createStreamSetType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createStringDataEncodingType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createStringDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createTelemetryMetaDataType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createTimeAssociationType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createTriggerType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createUnitType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createValueEnumerationType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XtceFactory.eINSTANCE.createVariableFrameStreamType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getMessageRefSetType_MessageRef(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));
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
