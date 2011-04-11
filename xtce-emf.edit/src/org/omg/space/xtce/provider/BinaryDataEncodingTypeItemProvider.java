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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.omg.space.xtce.BinaryDataEncodingType;
import org.omg.space.xtce.BitOrderType;
import org.omg.space.xtce.XtceFactory;
import org.omg.space.xtce.XtcePackage;

/**
 * This is the item provider adapter for a {@link org.omg.space.xtce.BinaryDataEncodingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryDataEncodingTypeItemProvider
	extends DataEncodingTypeItemProvider
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
	public BinaryDataEncodingTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(XtcePackage.eINSTANCE.getBinaryDataEncodingType_SizeInBits());
			childrenFeatures.add(XtcePackage.eINSTANCE.getBinaryDataEncodingType_FromBinaryTransformAlgorithm());
			childrenFeatures.add(XtcePackage.eINSTANCE.getBinaryDataEncodingType_ToBinaryTransformAlgorithm());
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
	 * This returns BinaryDataEncodingType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BinaryDataEncodingType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BitOrderType labelValue = ((BinaryDataEncodingType)object).getBitOrder();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_BinaryDataEncodingType_type") :
			getString("_UI_BinaryDataEncodingType_type") + " " + label;
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

		switch (notification.getFeatureID(BinaryDataEncodingType.class)) {
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__SIZE_IN_BITS:
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__FROM_BINARY_TRANSFORM_ALGORITHM:
			case XtcePackage.BINARY_DATA_ENCODING_TYPE__TO_BINARY_TRANSFORM_ALGORITHM:
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
				(XtcePackage.eINSTANCE.getBinaryDataEncodingType_SizeInBits(),
				 XtceFactory.eINSTANCE.createIntegerValueType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getBinaryDataEncodingType_FromBinaryTransformAlgorithm(),
				 XtceFactory.eINSTANCE.createInputAlgorithmType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getBinaryDataEncodingType_FromBinaryTransformAlgorithm(),
				 XtceFactory.eINSTANCE.createInputOutputAlgorithmType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getBinaryDataEncodingType_FromBinaryTransformAlgorithm(),
				 XtceFactory.eINSTANCE.createInputOutputTriggerAlgorithmType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getBinaryDataEncodingType_ToBinaryTransformAlgorithm(),
				 XtceFactory.eINSTANCE.createInputAlgorithmType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getBinaryDataEncodingType_ToBinaryTransformAlgorithm(),
				 XtceFactory.eINSTANCE.createInputOutputAlgorithmType()));

		newChildDescriptors.add
			(createChildParameter
				(XtcePackage.eINSTANCE.getBinaryDataEncodingType_ToBinaryTransformAlgorithm(),
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
			childFeature == XtcePackage.eINSTANCE.getBinaryDataEncodingType_FromBinaryTransformAlgorithm() ||
			childFeature == XtcePackage.eINSTANCE.getBinaryDataEncodingType_ToBinaryTransformAlgorithm();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
