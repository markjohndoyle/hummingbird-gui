/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.omg.space.xtce.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.space.xtce.XtcePackage
 * @generated
 */
public class XtceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XtcePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XtcePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XtceSwitch<Adapter> modelSwitch =
		new XtceSwitch<Adapter>() {
			@Override
			public Adapter caseAbsoluteTimeDataType(AbsoluteTimeDataType object) {
				return createAbsoluteTimeDataTypeAdapter();
			}
			@Override
			public Adapter caseAcceptedVerifierType(AcceptedVerifierType object) {
				return createAcceptedVerifierTypeAdapter();
			}
			@Override
			public Adapter caseAlarmConditionsType(AlarmConditionsType object) {
				return createAlarmConditionsTypeAdapter();
			}
			@Override
			public Adapter caseAlarmRangesType(AlarmRangesType object) {
				return createAlarmRangesTypeAdapter();
			}
			@Override
			public Adapter caseAlgorithmSetType(AlgorithmSetType object) {
				return createAlgorithmSetTypeAdapter();
			}
			@Override
			public Adapter caseAlgorithmTextType(AlgorithmTextType object) {
				return createAlgorithmTextTypeAdapter();
			}
			@Override
			public Adapter caseAliasSetType(AliasSetType object) {
				return createAliasSetTypeAdapter();
			}
			@Override
			public Adapter caseAliasType(AliasType object) {
				return createAliasTypeAdapter();
			}
			@Override
			public Adapter caseANDedConditionsType(ANDedConditionsType object) {
				return createANDedConditionsTypeAdapter();
			}
			@Override
			public Adapter caseArgumementArrayTypeType(ArgumementArrayTypeType object) {
				return createArgumementArrayTypeTypeAdapter();
			}
			@Override
			public Adapter caseArgumentAssignmentListType(ArgumentAssignmentListType object) {
				return createArgumentAssignmentListTypeAdapter();
			}
			@Override
			public Adapter caseArgumentAssignmentType(ArgumentAssignmentType object) {
				return createArgumentAssignmentTypeAdapter();
			}
			@Override
			public Adapter caseArgumentListType(ArgumentListType object) {
				return createArgumentListTypeAdapter();
			}
			@Override
			public Adapter caseArgumentListType1(ArgumentListType1 object) {
				return createArgumentListType1Adapter();
			}
			@Override
			public Adapter caseArgumentRefEntryType(ArgumentRefEntryType object) {
				return createArgumentRefEntryTypeAdapter();
			}
			@Override
			public Adapter caseArgumentType(ArgumentType object) {
				return createArgumentTypeAdapter();
			}
			@Override
			public Adapter caseArgumentType1(ArgumentType1 object) {
				return createArgumentType1Adapter();
			}
			@Override
			public Adapter caseArgumentTypeSetType(ArgumentTypeSetType object) {
				return createArgumentTypeSetTypeAdapter();
			}
			@Override
			public Adapter caseArrayParameterRefEntryType(ArrayParameterRefEntryType object) {
				return createArrayParameterRefEntryTypeAdapter();
			}
			@Override
			public Adapter caseArrayParameterTypeType(ArrayParameterTypeType object) {
				return createArrayParameterTypeTypeAdapter();
			}
			@Override
			public Adapter caseAuthorSetType(AuthorSetType object) {
				return createAuthorSetTypeAdapter();
			}
			@Override
			public Adapter caseAutoInvertType(AutoInvertType object) {
				return createAutoInvertTypeAdapter();
			}
			@Override
			public Adapter caseBaseContainerType(BaseContainerType object) {
				return createBaseContainerTypeAdapter();
			}
			@Override
			public Adapter caseBaseContainerType1(BaseContainerType1 object) {
				return createBaseContainerType1Adapter();
			}
			@Override
			public Adapter caseBaseDataType(BaseDataType object) {
				return createBaseDataTypeAdapter();
			}
			@Override
			public Adapter caseBaseMetaCommandType(BaseMetaCommandType object) {
				return createBaseMetaCommandTypeAdapter();
			}
			@Override
			public Adapter caseBaseTimeDataType(BaseTimeDataType object) {
				return createBaseTimeDataTypeAdapter();
			}
			@Override
			public Adapter caseBinaryDataEncodingType(BinaryDataEncodingType object) {
				return createBinaryDataEncodingTypeAdapter();
			}
			@Override
			public Adapter caseBinaryDataType(BinaryDataType object) {
				return createBinaryDataTypeAdapter();
			}
			@Override
			public Adapter caseBlockMetaCommandType(BlockMetaCommandType object) {
				return createBlockMetaCommandTypeAdapter();
			}
			@Override
			public Adapter caseBooleanDataType(BooleanDataType object) {
				return createBooleanDataTypeAdapter();
			}
			@Override
			public Adapter caseBooleanExpressionType(BooleanExpressionType object) {
				return createBooleanExpressionTypeAdapter();
			}
			@Override
			public Adapter caseByteOrderType(ByteOrderType object) {
				return createByteOrderTypeAdapter();
			}
			@Override
			public Adapter caseByteType(ByteType object) {
				return createByteTypeAdapter();
			}
			@Override
			public Adapter caseCalibratorType(CalibratorType object) {
				return createCalibratorTypeAdapter();
			}
			@Override
			public Adapter caseChangeType(ChangeType object) {
				return createChangeTypeAdapter();
			}
			@Override
			public Adapter caseCommandContainerEntryListType(CommandContainerEntryListType object) {
				return createCommandContainerEntryListTypeAdapter();
			}
			@Override
			public Adapter caseCommandContainerSetType(CommandContainerSetType object) {
				return createCommandContainerSetTypeAdapter();
			}
			@Override
			public Adapter caseCommandContainerType(CommandContainerType object) {
				return createCommandContainerTypeAdapter();
			}
			@Override
			public Adapter caseCommandMetaDataType(CommandMetaDataType object) {
				return createCommandMetaDataTypeAdapter();
			}
			@Override
			public Adapter caseCommandVerifierType(CommandVerifierType object) {
				return createCommandVerifierTypeAdapter();
			}
			@Override
			public Adapter caseComparisonCheckType(ComparisonCheckType object) {
				return createComparisonCheckTypeAdapter();
			}
			@Override
			public Adapter caseComparisonListType(ComparisonListType object) {
				return createComparisonListTypeAdapter();
			}
			@Override
			public Adapter caseComparisonListType1(ComparisonListType1 object) {
				return createComparisonListType1Adapter();
			}
			@Override
			public Adapter caseComparisonType(ComparisonType object) {
				return createComparisonTypeAdapter();
			}
			@Override
			public Adapter caseCompleteVerifierType(CompleteVerifierType object) {
				return createCompleteVerifierTypeAdapter();
			}
			@Override
			public Adapter caseConditionalAlarmType(ConditionalAlarmType object) {
				return createConditionalAlarmTypeAdapter();
			}
			@Override
			public Adapter caseConstantType(ConstantType object) {
				return createConstantTypeAdapter();
			}
			@Override
			public Adapter caseContainerRefEntryType(ContainerRefEntryType object) {
				return createContainerRefEntryTypeAdapter();
			}
			@Override
			public Adapter caseContainerRefSetType(ContainerRefSetType object) {
				return createContainerRefSetTypeAdapter();
			}
			@Override
			public Adapter caseContainerRefType(ContainerRefType object) {
				return createContainerRefTypeAdapter();
			}
			@Override
			public Adapter caseContainerSegmentRefEntryType(ContainerSegmentRefEntryType object) {
				return createContainerSegmentRefEntryTypeAdapter();
			}
			@Override
			public Adapter caseContainerSetType(ContainerSetType object) {
				return createContainerSetTypeAdapter();
			}
			@Override
			public Adapter caseContainerType(ContainerType object) {
				return createContainerTypeAdapter();
			}
			@Override
			public Adapter caseContextAlarmListType(ContextAlarmListType object) {
				return createContextAlarmListTypeAdapter();
			}
			@Override
			public Adapter caseContextAlarmListType1(ContextAlarmListType1 object) {
				return createContextAlarmListType1Adapter();
			}
			@Override
			public Adapter caseContextAlarmListType2(ContextAlarmListType2 object) {
				return createContextAlarmListType2Adapter();
			}
			@Override
			public Adapter caseContextAlarmListType3(ContextAlarmListType3 object) {
				return createContextAlarmListType3Adapter();
			}
			@Override
			public Adapter caseContextAlarmType(ContextAlarmType object) {
				return createContextAlarmTypeAdapter();
			}
			@Override
			public Adapter caseContextCalibratorListType(ContextCalibratorListType object) {
				return createContextCalibratorListTypeAdapter();
			}
			@Override
			public Adapter caseContextCalibratorListType1(ContextCalibratorListType1 object) {
				return createContextCalibratorListType1Adapter();
			}
			@Override
			public Adapter caseContextCalibratorListType2(ContextCalibratorListType2 object) {
				return createContextCalibratorListType2Adapter();
			}
			@Override
			public Adapter caseContextCalibratorListType3(ContextCalibratorListType3 object) {
				return createContextCalibratorListType3Adapter();
			}
			@Override
			public Adapter caseContextCalibratorListType4(ContextCalibratorListType4 object) {
				return createContextCalibratorListType4Adapter();
			}
			@Override
			public Adapter caseContextCalibratorType(ContextCalibratorType object) {
				return createContextCalibratorTypeAdapter();
			}
			@Override
			public Adapter caseContextCalibratorType1(ContextCalibratorType1 object) {
				return createContextCalibratorType1Adapter();
			}
			@Override
			public Adapter caseContextCalibratorType2(ContextCalibratorType2 object) {
				return createContextCalibratorType2Adapter();
			}
			@Override
			public Adapter caseContextCalibratorType3(ContextCalibratorType3 object) {
				return createContextCalibratorType3Adapter();
			}
			@Override
			public Adapter caseContextSignificanceListType(ContextSignificanceListType object) {
				return createContextSignificanceListTypeAdapter();
			}
			@Override
			public Adapter caseContextSignificanceType(ContextSignificanceType object) {
				return createContextSignificanceTypeAdapter();
			}
			@Override
			public Adapter caseCRCType(CRCType object) {
				return createCRCTypeAdapter();
			}
			@Override
			public Adapter caseCustomStreamType(CustomStreamType object) {
				return createCustomStreamTypeAdapter();
			}
			@Override
			public Adapter caseDataEncodingType(DataEncodingType object) {
				return createDataEncodingTypeAdapter();
			}
			@Override
			public Adapter caseDecimalRangeType(DecimalRangeType object) {
				return createDecimalRangeTypeAdapter();
			}
			@Override
			public Adapter caseDecimalValueType(DecimalValueType object) {
				return createDecimalValueTypeAdapter();
			}
			@Override
			public Adapter caseDefaultsType(DefaultsType object) {
				return createDefaultsTypeAdapter();
			}
			@Override
			public Adapter caseDimensionListType(DimensionListType object) {
				return createDimensionListTypeAdapter();
			}
			@Override
			public Adapter caseDimensionType(DimensionType object) {
				return createDimensionTypeAdapter();
			}
			@Override
			public Adapter caseDiscreteLookupListType(DiscreteLookupListType object) {
				return createDiscreteLookupListTypeAdapter();
			}
			@Override
			public Adapter caseDiscreteLookupType(DiscreteLookupType object) {
				return createDiscreteLookupTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDynamicValueType(DynamicValueType object) {
				return createDynamicValueTypeAdapter();
			}
			@Override
			public Adapter caseDynamicValueType1(DynamicValueType1 object) {
				return createDynamicValueType1Adapter();
			}
			@Override
			public Adapter caseEncodingType1(EncodingType1 object) {
				return createEncodingType1Adapter();
			}
			@Override
			public Adapter caseEntryListType(EntryListType object) {
				return createEntryListTypeAdapter();
			}
			@Override
			public Adapter caseEnumeratedDataType(EnumeratedDataType object) {
				return createEnumeratedDataTypeAdapter();
			}
			@Override
			public Adapter caseEnumerationListType(EnumerationListType object) {
				return createEnumerationListTypeAdapter();
			}
			@Override
			public Adapter caseErrorDetectCorrectType(ErrorDetectCorrectType object) {
				return createErrorDetectCorrectTypeAdapter();
			}
			@Override
			public Adapter caseExecutionVerifierType(ExecutionVerifierType object) {
				return createExecutionVerifierTypeAdapter();
			}
			@Override
			public Adapter caseExternalAlgorithmSetType(ExternalAlgorithmSetType object) {
				return createExternalAlgorithmSetTypeAdapter();
			}
			@Override
			public Adapter caseExternalAlgorithmType(ExternalAlgorithmType object) {
				return createExternalAlgorithmTypeAdapter();
			}
			@Override
			public Adapter caseFixedFrameStreamType(FixedFrameStreamType object) {
				return createFixedFrameStreamTypeAdapter();
			}
			@Override
			public Adapter caseFixedFrameSyncStrategyType(FixedFrameSyncStrategyType object) {
				return createFixedFrameSyncStrategyTypeAdapter();
			}
			@Override
			public Adapter caseFixedValueEntryType(FixedValueEntryType object) {
				return createFixedValueEntryTypeAdapter();
			}
			@Override
			public Adapter caseFlagType(FlagType object) {
				return createFlagTypeAdapter();
			}
			@Override
			public Adapter caseFloatArgumentTypeType(FloatArgumentTypeType object) {
				return createFloatArgumentTypeTypeAdapter();
			}
			@Override
			public Adapter caseFloatDataEncodingType(FloatDataEncodingType object) {
				return createFloatDataEncodingTypeAdapter();
			}
			@Override
			public Adapter caseFloatDataType(FloatDataType object) {
				return createFloatDataTypeAdapter();
			}
			@Override
			public Adapter caseFloatParameterTypeType(FloatParameterTypeType object) {
				return createFloatParameterTypeTypeAdapter();
			}
			@Override
			public Adapter caseFrameStreamType(FrameStreamType object) {
				return createFrameStreamTypeAdapter();
			}
			@Override
			public Adapter caseHeaderType(HeaderType object) {
				return createHeaderTypeAdapter();
			}
			@Override
			public Adapter caseHistorySetType(HistorySetType object) {
				return createHistorySetTypeAdapter();
			}
			@Override
			public Adapter caseIndirectParameterRefEntryType(IndirectParameterRefEntryType object) {
				return createIndirectParameterRefEntryTypeAdapter();
			}
			@Override
			public Adapter caseInputAlgorithmType(InputAlgorithmType object) {
				return createInputAlgorithmTypeAdapter();
			}
			@Override
			public Adapter caseInputOutputAlgorithmType(InputOutputAlgorithmType object) {
				return createInputOutputAlgorithmTypeAdapter();
			}
			@Override
			public Adapter caseInputOutputTriggerAlgorithmType(InputOutputTriggerAlgorithmType object) {
				return createInputOutputTriggerAlgorithmTypeAdapter();
			}
			@Override
			public Adapter caseInputSetType(InputSetType object) {
				return createInputSetTypeAdapter();
			}
			@Override
			public Adapter caseIntegerArgumentTypeType(IntegerArgumentTypeType object) {
				return createIntegerArgumentTypeTypeAdapter();
			}
			@Override
			public Adapter caseIntegerDataEncodingType(IntegerDataEncodingType object) {
				return createIntegerDataEncodingTypeAdapter();
			}
			@Override
			public Adapter caseIntegerDataType(IntegerDataType object) {
				return createIntegerDataTypeAdapter();
			}
			@Override
			public Adapter caseIntegerParameterTypeType(IntegerParameterTypeType object) {
				return createIntegerParameterTypeTypeAdapter();
			}
			@Override
			public Adapter caseIntegerRangeType(IntegerRangeType object) {
				return createIntegerRangeTypeAdapter();
			}
			@Override
			public Adapter caseIntegerValueType(IntegerValueType object) {
				return createIntegerValueTypeAdapter();
			}
			@Override
			public Adapter caseInterlockType(InterlockType object) {
				return createInterlockTypeAdapter();
			}
			@Override
			public Adapter caseLeadingSizeType(LeadingSizeType object) {
				return createLeadingSizeTypeAdapter();
			}
			@Override
			public Adapter caseLinearAdjustmentType(LinearAdjustmentType object) {
				return createLinearAdjustmentTypeAdapter();
			}
			@Override
			public Adapter caseLinearAdjustmentType1(LinearAdjustmentType1 object) {
				return createLinearAdjustmentType1Adapter();
			}
			@Override
			public Adapter caseLocationInContainerInBitsType(LocationInContainerInBitsType object) {
				return createLocationInContainerInBitsTypeAdapter();
			}
			@Override
			public Adapter caseMatchCriteriaType(MatchCriteriaType object) {
				return createMatchCriteriaTypeAdapter();
			}
			@Override
			public Adapter caseMathAlgorithmType(MathAlgorithmType object) {
				return createMathAlgorithmTypeAdapter();
			}
			@Override
			public Adapter caseMathOperationType(MathOperationType object) {
				return createMathOperationTypeAdapter();
			}
			@Override
			public Adapter caseMathOperationType1(MathOperationType1 object) {
				return createMathOperationType1Adapter();
			}
			@Override
			public Adapter caseMessageRefSetType(MessageRefSetType object) {
				return createMessageRefSetTypeAdapter();
			}
			@Override
			public Adapter caseMessageRefType(MessageRefType object) {
				return createMessageRefTypeAdapter();
			}
			@Override
			public Adapter caseMessageSetType(MessageSetType object) {
				return createMessageSetTypeAdapter();
			}
			@Override
			public Adapter caseMessageType(MessageType object) {
				return createMessageTypeAdapter();
			}
			@Override
			public Adapter caseMetaCommandSetType(MetaCommandSetType object) {
				return createMetaCommandSetTypeAdapter();
			}
			@Override
			public Adapter caseMetaCommandStepListType(MetaCommandStepListType object) {
				return createMetaCommandStepListTypeAdapter();
			}
			@Override
			public Adapter caseMetaCommandStepType(MetaCommandStepType object) {
				return createMetaCommandStepTypeAdapter();
			}
			@Override
			public Adapter caseMetaCommandType(MetaCommandType object) {
				return createMetaCommandTypeAdapter();
			}
			@Override
			public Adapter caseNameDescriptionType(NameDescriptionType object) {
				return createNameDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseNoteSetType(NoteSetType object) {
				return createNoteSetTypeAdapter();
			}
			@Override
			public Adapter caseNumberFormatType(NumberFormatType object) {
				return createNumberFormatTypeAdapter();
			}
			@Override
			public Adapter caseNumberToStringType(NumberToStringType object) {
				return createNumberToStringTypeAdapter();
			}
			@Override
			public Adapter caseNumericAlarmConditionType(NumericAlarmConditionType object) {
				return createNumericAlarmConditionTypeAdapter();
			}
			@Override
			public Adapter caseNumericDataType(NumericDataType object) {
				return createNumericDataTypeAdapter();
			}
			@Override
			public Adapter caseOffsetType(OffsetType object) {
				return createOffsetTypeAdapter();
			}
			@Override
			public Adapter caseORedConditionsType(ORedConditionsType object) {
				return createORedConditionsTypeAdapter();
			}
			@Override
			public Adapter caseOutputParameterRefType(OutputParameterRefType object) {
				return createOutputParameterRefTypeAdapter();
			}
			@Override
			public Adapter caseOutputSetType(OutputSetType object) {
				return createOutputSetTypeAdapter();
			}
			@Override
			public Adapter caseParameterInstanceRefType(ParameterInstanceRefType object) {
				return createParameterInstanceRefTypeAdapter();
			}
			@Override
			public Adapter caseParameterInstanceRefType1(ParameterInstanceRefType1 object) {
				return createParameterInstanceRefType1Adapter();
			}
			@Override
			public Adapter caseParameterPropertiesType(ParameterPropertiesType object) {
				return createParameterPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseParameterRefEntryType(ParameterRefEntryType object) {
				return createParameterRefEntryTypeAdapter();
			}
			@Override
			public Adapter caseParameterRefType(ParameterRefType object) {
				return createParameterRefTypeAdapter();
			}
			@Override
			public Adapter caseParameterRefType1(ParameterRefType1 object) {
				return createParameterRefType1Adapter();
			}
			@Override
			public Adapter caseParameterSegmentRefEntryType(ParameterSegmentRefEntryType object) {
				return createParameterSegmentRefEntryTypeAdapter();
			}
			@Override
			public Adapter caseParameterSetType(ParameterSetType object) {
				return createParameterSetTypeAdapter();
			}
			@Override
			public Adapter caseParameterToSetListType(ParameterToSetListType object) {
				return createParameterToSetListTypeAdapter();
			}
			@Override
			public Adapter caseParameterToSetType(ParameterToSetType object) {
				return createParameterToSetTypeAdapter();
			}
			@Override
			public Adapter caseParameterToSetType1(ParameterToSetType1 object) {
				return createParameterToSetType1Adapter();
			}
			@Override
			public Adapter caseParameterType(ParameterType object) {
				return createParameterTypeAdapter();
			}
			@Override
			public Adapter caseParameterTypeSetType(ParameterTypeSetType object) {
				return createParameterTypeSetTypeAdapter();
			}
			@Override
			public Adapter caseParameterValueChangeType(ParameterValueChangeType object) {
				return createParameterValueChangeTypeAdapter();
			}
			@Override
			public Adapter caseParityType(ParityType object) {
				return createParityTypeAdapter();
			}
			@Override
			public Adapter casePCMStreamType(PCMStreamType object) {
				return createPCMStreamTypeAdapter();
			}
			@Override
			public Adapter casePhysicalAddressSetType(PhysicalAddressSetType object) {
				return createPhysicalAddressSetTypeAdapter();
			}
			@Override
			public Adapter casePhysicalAddressType(PhysicalAddressType object) {
				return createPhysicalAddressTypeAdapter();
			}
			@Override
			public Adapter casePhysicalAddressType1(PhysicalAddressType1 object) {
				return createPhysicalAddressType1Adapter();
			}
			@Override
			public Adapter casePolynomialType(PolynomialType object) {
				return createPolynomialTypeAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter caseQueuedVerifierType(QueuedVerifierType object) {
				return createQueuedVerifierTypeAdapter();
			}
			@Override
			public Adapter caseRangeEnumerationType(RangeEnumerationType object) {
				return createRangeEnumerationTypeAdapter();
			}
			@Override
			public Adapter caseRateInStreamSetType(RateInStreamSetType object) {
				return createRateInStreamSetTypeAdapter();
			}
			@Override
			public Adapter caseRateInStreamType(RateInStreamType object) {
				return createRateInStreamTypeAdapter();
			}
			@Override
			public Adapter caseRateInStreamType1(RateInStreamType1 object) {
				return createRateInStreamType1Adapter();
			}
			@Override
			public Adapter caseReceivedVerifierType(ReceivedVerifierType object) {
				return createReceivedVerifierTypeAdapter();
			}
			@Override
			public Adapter caseReferenceTimeType(ReferenceTimeType object) {
				return createReferenceTimeTypeAdapter();
			}
			@Override
			public Adapter caseRelativeTimeDataType(RelativeTimeDataType object) {
				return createRelativeTimeDataTypeAdapter();
			}
			@Override
			public Adapter caseRepeatType(RepeatType object) {
				return createRepeatTypeAdapter();
			}
			@Override
			public Adapter caseRestrictionCriteriaType(RestrictionCriteriaType object) {
				return createRestrictionCriteriaTypeAdapter();
			}
			@Override
			public Adapter caseRestrictionCriteriaType1(RestrictionCriteriaType1 object) {
				return createRestrictionCriteriaType1Adapter();
			}
			@Override
			public Adapter caseSentFromRangeVerifierType(SentFromRangeVerifierType object) {
				return createSentFromRangeVerifierTypeAdapter();
			}
			@Override
			public Adapter caseSequenceContainerType(SequenceContainerType object) {
				return createSequenceContainerTypeAdapter();
			}
			@Override
			public Adapter caseSequenceEntryType(SequenceEntryType object) {
				return createSequenceEntryTypeAdapter();
			}
			@Override
			public Adapter caseServiceRefType(ServiceRefType object) {
				return createServiceRefTypeAdapter();
			}
			@Override
			public Adapter caseServiceSetType(ServiceSetType object) {
				return createServiceSetTypeAdapter();
			}
			@Override
			public Adapter caseServiceType(ServiceType object) {
				return createServiceTypeAdapter();
			}
			@Override
			public Adapter caseSignificanceType(SignificanceType object) {
				return createSignificanceTypeAdapter();
			}
			@Override
			public Adapter caseSimpleAlgorithmType(SimpleAlgorithmType object) {
				return createSimpleAlgorithmTypeAdapter();
			}
			@Override
			public Adapter caseSizeInBitsType(SizeInBitsType object) {
				return createSizeInBitsTypeAdapter();
			}
			@Override
			public Adapter caseSpaceSystemType(SpaceSystemType object) {
				return createSpaceSystemTypeAdapter();
			}
			@Override
			public Adapter caseSplineCalibratorType(SplineCalibratorType object) {
				return createSplineCalibratorTypeAdapter();
			}
			@Override
			public Adapter caseSplinePointType(SplinePointType object) {
				return createSplinePointTypeAdapter();
			}
			@Override
			public Adapter caseStreamRefType(StreamRefType object) {
				return createStreamRefTypeAdapter();
			}
			@Override
			public Adapter caseStreamSegmentEntryType(StreamSegmentEntryType object) {
				return createStreamSegmentEntryTypeAdapter();
			}
			@Override
			public Adapter caseStreamSetType(StreamSetType object) {
				return createStreamSetTypeAdapter();
			}
			@Override
			public Adapter caseStringDataEncodingType(StringDataEncodingType object) {
				return createStringDataEncodingTypeAdapter();
			}
			@Override
			public Adapter caseStringDataType(StringDataType object) {
				return createStringDataTypeAdapter();
			}
			@Override
			public Adapter caseSyncPatternType(SyncPatternType object) {
				return createSyncPatternTypeAdapter();
			}
			@Override
			public Adapter caseSyncPatternType1(SyncPatternType1 object) {
				return createSyncPatternType1Adapter();
			}
			@Override
			public Adapter caseSyncStrategyType(SyncStrategyType object) {
				return createSyncStrategyTypeAdapter();
			}
			@Override
			public Adapter caseSyncStrategyType1(SyncStrategyType1 object) {
				return createSyncStrategyType1Adapter();
			}
			@Override
			public Adapter caseSyncStrategyType2(SyncStrategyType2 object) {
				return createSyncStrategyType2Adapter();
			}
			@Override
			public Adapter caseTelemetryMetaDataType(TelemetryMetaDataType object) {
				return createTelemetryMetaDataTypeAdapter();
			}
			@Override
			public Adapter caseTermType(TermType object) {
				return createTermTypeAdapter();
			}
			@Override
			public Adapter caseTimeAssociationType(TimeAssociationType object) {
				return createTimeAssociationTypeAdapter();
			}
			@Override
			public Adapter caseTransferredToRangeVerifierType(TransferredToRangeVerifierType object) {
				return createTransferredToRangeVerifierTypeAdapter();
			}
			@Override
			public Adapter caseTransmissionConstraintListType(TransmissionConstraintListType object) {
				return createTransmissionConstraintListTypeAdapter();
			}
			@Override
			public Adapter caseTransmissionConstraintType(TransmissionConstraintType object) {
				return createTransmissionConstraintTypeAdapter();
			}
			@Override
			public Adapter caseTriggerType(TriggerType object) {
				return createTriggerTypeAdapter();
			}
			@Override
			public Adapter caseUnitSetType(UnitSetType object) {
				return createUnitSetTypeAdapter();
			}
			@Override
			public Adapter caseUnitType(UnitType object) {
				return createUnitTypeAdapter();
			}
			@Override
			public Adapter caseValidRangeType(ValidRangeType object) {
				return createValidRangeTypeAdapter();
			}
			@Override
			public Adapter caseValueEnumerationType(ValueEnumerationType object) {
				return createValueEnumerationTypeAdapter();
			}
			@Override
			public Adapter caseVariableFrameStreamType(VariableFrameStreamType object) {
				return createVariableFrameStreamTypeAdapter();
			}
			@Override
			public Adapter caseVerifiersType(VerifiersType object) {
				return createVerifiersTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.AbsoluteTimeDataType <em>Absolute Time Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.AbsoluteTimeDataType
	 * @generated
	 */
	public Adapter createAbsoluteTimeDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.AcceptedVerifierType <em>Accepted Verifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.AcceptedVerifierType
	 * @generated
	 */
	public Adapter createAcceptedVerifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.AlarmConditionsType <em>Alarm Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.AlarmConditionsType
	 * @generated
	 */
	public Adapter createAlarmConditionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.AlarmRangesType <em>Alarm Ranges Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.AlarmRangesType
	 * @generated
	 */
	public Adapter createAlarmRangesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.AlgorithmSetType <em>Algorithm Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.AlgorithmSetType
	 * @generated
	 */
	public Adapter createAlgorithmSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.AlgorithmTextType <em>Algorithm Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.AlgorithmTextType
	 * @generated
	 */
	public Adapter createAlgorithmTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.AliasSetType <em>Alias Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.AliasSetType
	 * @generated
	 */
	public Adapter createAliasSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.AliasType <em>Alias Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.AliasType
	 * @generated
	 */
	public Adapter createAliasTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ANDedConditionsType <em>AN Ded Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ANDedConditionsType
	 * @generated
	 */
	public Adapter createANDedConditionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ArgumementArrayTypeType <em>Argumement Array Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ArgumementArrayTypeType
	 * @generated
	 */
	public Adapter createArgumementArrayTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ArgumentAssignmentListType <em>Argument Assignment List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ArgumentAssignmentListType
	 * @generated
	 */
	public Adapter createArgumentAssignmentListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ArgumentAssignmentType <em>Argument Assignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ArgumentAssignmentType
	 * @generated
	 */
	public Adapter createArgumentAssignmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ArgumentListType <em>Argument List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ArgumentListType
	 * @generated
	 */
	public Adapter createArgumentListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ArgumentListType1 <em>Argument List Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ArgumentListType1
	 * @generated
	 */
	public Adapter createArgumentListType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ArgumentRefEntryType <em>Argument Ref Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ArgumentRefEntryType
	 * @generated
	 */
	public Adapter createArgumentRefEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ArgumentType <em>Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ArgumentType
	 * @generated
	 */
	public Adapter createArgumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ArgumentType1 <em>Argument Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ArgumentType1
	 * @generated
	 */
	public Adapter createArgumentType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ArgumentTypeSetType <em>Argument Type Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ArgumentTypeSetType
	 * @generated
	 */
	public Adapter createArgumentTypeSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ArrayParameterRefEntryType <em>Array Parameter Ref Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ArrayParameterRefEntryType
	 * @generated
	 */
	public Adapter createArrayParameterRefEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ArrayParameterTypeType <em>Array Parameter Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ArrayParameterTypeType
	 * @generated
	 */
	public Adapter createArrayParameterTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.AuthorSetType <em>Author Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.AuthorSetType
	 * @generated
	 */
	public Adapter createAuthorSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.AutoInvertType <em>Auto Invert Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.AutoInvertType
	 * @generated
	 */
	public Adapter createAutoInvertTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.BaseContainerType <em>Base Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.BaseContainerType
	 * @generated
	 */
	public Adapter createBaseContainerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.BaseContainerType1 <em>Base Container Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.BaseContainerType1
	 * @generated
	 */
	public Adapter createBaseContainerType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.BaseDataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.BaseDataType
	 * @generated
	 */
	public Adapter createBaseDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.BaseMetaCommandType <em>Base Meta Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.BaseMetaCommandType
	 * @generated
	 */
	public Adapter createBaseMetaCommandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.BaseTimeDataType <em>Base Time Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.BaseTimeDataType
	 * @generated
	 */
	public Adapter createBaseTimeDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.BinaryDataEncodingType <em>Binary Data Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.BinaryDataEncodingType
	 * @generated
	 */
	public Adapter createBinaryDataEncodingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.BinaryDataType <em>Binary Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.BinaryDataType
	 * @generated
	 */
	public Adapter createBinaryDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.BlockMetaCommandType <em>Block Meta Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.BlockMetaCommandType
	 * @generated
	 */
	public Adapter createBlockMetaCommandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.BooleanDataType <em>Boolean Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.BooleanDataType
	 * @generated
	 */
	public Adapter createBooleanDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.BooleanExpressionType <em>Boolean Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.BooleanExpressionType
	 * @generated
	 */
	public Adapter createBooleanExpressionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ByteOrderType <em>Byte Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ByteOrderType
	 * @generated
	 */
	public Adapter createByteOrderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ByteType <em>Byte Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ByteType
	 * @generated
	 */
	public Adapter createByteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.CalibratorType <em>Calibrator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.CalibratorType
	 * @generated
	 */
	public Adapter createCalibratorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ChangeType <em>Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ChangeType
	 * @generated
	 */
	public Adapter createChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.CommandContainerEntryListType <em>Command Container Entry List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.CommandContainerEntryListType
	 * @generated
	 */
	public Adapter createCommandContainerEntryListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.CommandContainerSetType <em>Command Container Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.CommandContainerSetType
	 * @generated
	 */
	public Adapter createCommandContainerSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.CommandContainerType <em>Command Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.CommandContainerType
	 * @generated
	 */
	public Adapter createCommandContainerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.CommandMetaDataType <em>Command Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.CommandMetaDataType
	 * @generated
	 */
	public Adapter createCommandMetaDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.CommandVerifierType <em>Command Verifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.CommandVerifierType
	 * @generated
	 */
	public Adapter createCommandVerifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ComparisonCheckType <em>Comparison Check Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ComparisonCheckType
	 * @generated
	 */
	public Adapter createComparisonCheckTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ComparisonListType <em>Comparison List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ComparisonListType
	 * @generated
	 */
	public Adapter createComparisonListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ComparisonListType1 <em>Comparison List Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ComparisonListType1
	 * @generated
	 */
	public Adapter createComparisonListType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ComparisonType <em>Comparison Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ComparisonType
	 * @generated
	 */
	public Adapter createComparisonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.CompleteVerifierType <em>Complete Verifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.CompleteVerifierType
	 * @generated
	 */
	public Adapter createCompleteVerifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ConditionalAlarmType <em>Conditional Alarm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ConditionalAlarmType
	 * @generated
	 */
	public Adapter createConditionalAlarmTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ConstantType <em>Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ConstantType
	 * @generated
	 */
	public Adapter createConstantTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContainerRefEntryType <em>Container Ref Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContainerRefEntryType
	 * @generated
	 */
	public Adapter createContainerRefEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContainerRefSetType <em>Container Ref Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContainerRefSetType
	 * @generated
	 */
	public Adapter createContainerRefSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContainerRefType <em>Container Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContainerRefType
	 * @generated
	 */
	public Adapter createContainerRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContainerSegmentRefEntryType <em>Container Segment Ref Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContainerSegmentRefEntryType
	 * @generated
	 */
	public Adapter createContainerSegmentRefEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContainerSetType <em>Container Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContainerSetType
	 * @generated
	 */
	public Adapter createContainerSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContainerType
	 * @generated
	 */
	public Adapter createContainerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContextAlarmListType <em>Context Alarm List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContextAlarmListType
	 * @generated
	 */
	public Adapter createContextAlarmListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContextAlarmListType1 <em>Context Alarm List Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContextAlarmListType1
	 * @generated
	 */
	public Adapter createContextAlarmListType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContextAlarmListType2 <em>Context Alarm List Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContextAlarmListType2
	 * @generated
	 */
	public Adapter createContextAlarmListType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContextAlarmListType3 <em>Context Alarm List Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContextAlarmListType3
	 * @generated
	 */
	public Adapter createContextAlarmListType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContextAlarmType <em>Context Alarm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContextAlarmType
	 * @generated
	 */
	public Adapter createContextAlarmTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContextCalibratorListType <em>Context Calibrator List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContextCalibratorListType
	 * @generated
	 */
	public Adapter createContextCalibratorListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContextCalibratorListType1 <em>Context Calibrator List Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContextCalibratorListType1
	 * @generated
	 */
	public Adapter createContextCalibratorListType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContextCalibratorListType2 <em>Context Calibrator List Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContextCalibratorListType2
	 * @generated
	 */
	public Adapter createContextCalibratorListType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContextCalibratorListType3 <em>Context Calibrator List Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContextCalibratorListType3
	 * @generated
	 */
	public Adapter createContextCalibratorListType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContextCalibratorListType4 <em>Context Calibrator List Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContextCalibratorListType4
	 * @generated
	 */
	public Adapter createContextCalibratorListType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContextCalibratorType <em>Context Calibrator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContextCalibratorType
	 * @generated
	 */
	public Adapter createContextCalibratorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContextCalibratorType1 <em>Context Calibrator Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContextCalibratorType1
	 * @generated
	 */
	public Adapter createContextCalibratorType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContextCalibratorType2 <em>Context Calibrator Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContextCalibratorType2
	 * @generated
	 */
	public Adapter createContextCalibratorType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContextCalibratorType3 <em>Context Calibrator Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContextCalibratorType3
	 * @generated
	 */
	public Adapter createContextCalibratorType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContextSignificanceListType <em>Context Significance List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContextSignificanceListType
	 * @generated
	 */
	public Adapter createContextSignificanceListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ContextSignificanceType <em>Context Significance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ContextSignificanceType
	 * @generated
	 */
	public Adapter createContextSignificanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.CRCType <em>CRC Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.CRCType
	 * @generated
	 */
	public Adapter createCRCTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.CustomStreamType <em>Custom Stream Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.CustomStreamType
	 * @generated
	 */
	public Adapter createCustomStreamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.DataEncodingType <em>Data Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.DataEncodingType
	 * @generated
	 */
	public Adapter createDataEncodingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.DecimalRangeType <em>Decimal Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.DecimalRangeType
	 * @generated
	 */
	public Adapter createDecimalRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.DecimalValueType <em>Decimal Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.DecimalValueType
	 * @generated
	 */
	public Adapter createDecimalValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.DefaultsType <em>Defaults Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.DefaultsType
	 * @generated
	 */
	public Adapter createDefaultsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.DimensionListType <em>Dimension List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.DimensionListType
	 * @generated
	 */
	public Adapter createDimensionListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.DimensionType <em>Dimension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.DimensionType
	 * @generated
	 */
	public Adapter createDimensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.DiscreteLookupListType <em>Discrete Lookup List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.DiscreteLookupListType
	 * @generated
	 */
	public Adapter createDiscreteLookupListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.DiscreteLookupType <em>Discrete Lookup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.DiscreteLookupType
	 * @generated
	 */
	public Adapter createDiscreteLookupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.DynamicValueType <em>Dynamic Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.DynamicValueType
	 * @generated
	 */
	public Adapter createDynamicValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.DynamicValueType1 <em>Dynamic Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.DynamicValueType1
	 * @generated
	 */
	public Adapter createDynamicValueType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.EncodingType1 <em>Encoding Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.EncodingType1
	 * @generated
	 */
	public Adapter createEncodingType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.EntryListType <em>Entry List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.EntryListType
	 * @generated
	 */
	public Adapter createEntryListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.EnumeratedDataType <em>Enumerated Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.EnumeratedDataType
	 * @generated
	 */
	public Adapter createEnumeratedDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.EnumerationListType <em>Enumeration List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.EnumerationListType
	 * @generated
	 */
	public Adapter createEnumerationListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ErrorDetectCorrectType <em>Error Detect Correct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ErrorDetectCorrectType
	 * @generated
	 */
	public Adapter createErrorDetectCorrectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ExecutionVerifierType <em>Execution Verifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ExecutionVerifierType
	 * @generated
	 */
	public Adapter createExecutionVerifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ExternalAlgorithmSetType <em>External Algorithm Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ExternalAlgorithmSetType
	 * @generated
	 */
	public Adapter createExternalAlgorithmSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ExternalAlgorithmType <em>External Algorithm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ExternalAlgorithmType
	 * @generated
	 */
	public Adapter createExternalAlgorithmTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.FixedFrameStreamType <em>Fixed Frame Stream Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.FixedFrameStreamType
	 * @generated
	 */
	public Adapter createFixedFrameStreamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.FixedFrameSyncStrategyType <em>Fixed Frame Sync Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.FixedFrameSyncStrategyType
	 * @generated
	 */
	public Adapter createFixedFrameSyncStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.FixedValueEntryType <em>Fixed Value Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.FixedValueEntryType
	 * @generated
	 */
	public Adapter createFixedValueEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.FlagType <em>Flag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.FlagType
	 * @generated
	 */
	public Adapter createFlagTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.FloatArgumentTypeType <em>Float Argument Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.FloatArgumentTypeType
	 * @generated
	 */
	public Adapter createFloatArgumentTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.FloatDataEncodingType <em>Float Data Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.FloatDataEncodingType
	 * @generated
	 */
	public Adapter createFloatDataEncodingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.FloatDataType <em>Float Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.FloatDataType
	 * @generated
	 */
	public Adapter createFloatDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.FloatParameterTypeType <em>Float Parameter Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.FloatParameterTypeType
	 * @generated
	 */
	public Adapter createFloatParameterTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.FrameStreamType <em>Frame Stream Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.FrameStreamType
	 * @generated
	 */
	public Adapter createFrameStreamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.HeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.HeaderType
	 * @generated
	 */
	public Adapter createHeaderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.HistorySetType <em>History Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.HistorySetType
	 * @generated
	 */
	public Adapter createHistorySetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.IndirectParameterRefEntryType <em>Indirect Parameter Ref Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.IndirectParameterRefEntryType
	 * @generated
	 */
	public Adapter createIndirectParameterRefEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.InputAlgorithmType <em>Input Algorithm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.InputAlgorithmType
	 * @generated
	 */
	public Adapter createInputAlgorithmTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.InputOutputAlgorithmType <em>Input Output Algorithm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.InputOutputAlgorithmType
	 * @generated
	 */
	public Adapter createInputOutputAlgorithmTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.InputOutputTriggerAlgorithmType <em>Input Output Trigger Algorithm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.InputOutputTriggerAlgorithmType
	 * @generated
	 */
	public Adapter createInputOutputTriggerAlgorithmTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.InputSetType <em>Input Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.InputSetType
	 * @generated
	 */
	public Adapter createInputSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.IntegerArgumentTypeType <em>Integer Argument Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.IntegerArgumentTypeType
	 * @generated
	 */
	public Adapter createIntegerArgumentTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.IntegerDataEncodingType <em>Integer Data Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.IntegerDataEncodingType
	 * @generated
	 */
	public Adapter createIntegerDataEncodingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.IntegerDataType <em>Integer Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.IntegerDataType
	 * @generated
	 */
	public Adapter createIntegerDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.IntegerParameterTypeType <em>Integer Parameter Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.IntegerParameterTypeType
	 * @generated
	 */
	public Adapter createIntegerParameterTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.IntegerRangeType <em>Integer Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.IntegerRangeType
	 * @generated
	 */
	public Adapter createIntegerRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.IntegerValueType <em>Integer Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.IntegerValueType
	 * @generated
	 */
	public Adapter createIntegerValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.InterlockType <em>Interlock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.InterlockType
	 * @generated
	 */
	public Adapter createInterlockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.LeadingSizeType <em>Leading Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.LeadingSizeType
	 * @generated
	 */
	public Adapter createLeadingSizeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.LinearAdjustmentType <em>Linear Adjustment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.LinearAdjustmentType
	 * @generated
	 */
	public Adapter createLinearAdjustmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.LinearAdjustmentType1 <em>Linear Adjustment Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.LinearAdjustmentType1
	 * @generated
	 */
	public Adapter createLinearAdjustmentType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.LocationInContainerInBitsType <em>Location In Container In Bits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.LocationInContainerInBitsType
	 * @generated
	 */
	public Adapter createLocationInContainerInBitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.MatchCriteriaType <em>Match Criteria Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.MatchCriteriaType
	 * @generated
	 */
	public Adapter createMatchCriteriaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.MathAlgorithmType <em>Math Algorithm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.MathAlgorithmType
	 * @generated
	 */
	public Adapter createMathAlgorithmTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.MathOperationType <em>Math Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.MathOperationType
	 * @generated
	 */
	public Adapter createMathOperationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.MathOperationType1 <em>Math Operation Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.MathOperationType1
	 * @generated
	 */
	public Adapter createMathOperationType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.MessageRefSetType <em>Message Ref Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.MessageRefSetType
	 * @generated
	 */
	public Adapter createMessageRefSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.MessageRefType <em>Message Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.MessageRefType
	 * @generated
	 */
	public Adapter createMessageRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.MessageSetType <em>Message Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.MessageSetType
	 * @generated
	 */
	public Adapter createMessageSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.MessageType
	 * @generated
	 */
	public Adapter createMessageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.MetaCommandSetType <em>Meta Command Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.MetaCommandSetType
	 * @generated
	 */
	public Adapter createMetaCommandSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.MetaCommandStepListType <em>Meta Command Step List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.MetaCommandStepListType
	 * @generated
	 */
	public Adapter createMetaCommandStepListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.MetaCommandStepType <em>Meta Command Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.MetaCommandStepType
	 * @generated
	 */
	public Adapter createMetaCommandStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.MetaCommandType <em>Meta Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.MetaCommandType
	 * @generated
	 */
	public Adapter createMetaCommandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.NameDescriptionType <em>Name Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.NameDescriptionType
	 * @generated
	 */
	public Adapter createNameDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.NoteSetType <em>Note Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.NoteSetType
	 * @generated
	 */
	public Adapter createNoteSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.NumberFormatType <em>Number Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.NumberFormatType
	 * @generated
	 */
	public Adapter createNumberFormatTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.NumberToStringType <em>Number To String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.NumberToStringType
	 * @generated
	 */
	public Adapter createNumberToStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.NumericAlarmConditionType <em>Numeric Alarm Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.NumericAlarmConditionType
	 * @generated
	 */
	public Adapter createNumericAlarmConditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.NumericDataType <em>Numeric Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.NumericDataType
	 * @generated
	 */
	public Adapter createNumericDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.OffsetType <em>Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.OffsetType
	 * @generated
	 */
	public Adapter createOffsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ORedConditionsType <em>ORed Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ORedConditionsType
	 * @generated
	 */
	public Adapter createORedConditionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.OutputParameterRefType <em>Output Parameter Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.OutputParameterRefType
	 * @generated
	 */
	public Adapter createOutputParameterRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.OutputSetType <em>Output Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.OutputSetType
	 * @generated
	 */
	public Adapter createOutputSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ParameterInstanceRefType <em>Parameter Instance Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ParameterInstanceRefType
	 * @generated
	 */
	public Adapter createParameterInstanceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ParameterInstanceRefType1 <em>Parameter Instance Ref Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ParameterInstanceRefType1
	 * @generated
	 */
	public Adapter createParameterInstanceRefType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ParameterPropertiesType <em>Parameter Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ParameterPropertiesType
	 * @generated
	 */
	public Adapter createParameterPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ParameterRefEntryType <em>Parameter Ref Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ParameterRefEntryType
	 * @generated
	 */
	public Adapter createParameterRefEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ParameterRefType <em>Parameter Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ParameterRefType
	 * @generated
	 */
	public Adapter createParameterRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ParameterRefType1 <em>Parameter Ref Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ParameterRefType1
	 * @generated
	 */
	public Adapter createParameterRefType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ParameterSegmentRefEntryType <em>Parameter Segment Ref Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ParameterSegmentRefEntryType
	 * @generated
	 */
	public Adapter createParameterSegmentRefEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ParameterSetType <em>Parameter Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ParameterSetType
	 * @generated
	 */
	public Adapter createParameterSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ParameterToSetListType <em>Parameter To Set List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ParameterToSetListType
	 * @generated
	 */
	public Adapter createParameterToSetListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ParameterToSetType <em>Parameter To Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ParameterToSetType
	 * @generated
	 */
	public Adapter createParameterToSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ParameterToSetType1 <em>Parameter To Set Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ParameterToSetType1
	 * @generated
	 */
	public Adapter createParameterToSetType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ParameterTypeSetType <em>Parameter Type Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ParameterTypeSetType
	 * @generated
	 */
	public Adapter createParameterTypeSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ParameterValueChangeType <em>Parameter Value Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ParameterValueChangeType
	 * @generated
	 */
	public Adapter createParameterValueChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ParityType <em>Parity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ParityType
	 * @generated
	 */
	public Adapter createParityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.PCMStreamType <em>PCM Stream Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.PCMStreamType
	 * @generated
	 */
	public Adapter createPCMStreamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.PhysicalAddressSetType <em>Physical Address Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.PhysicalAddressSetType
	 * @generated
	 */
	public Adapter createPhysicalAddressSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.PhysicalAddressType <em>Physical Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.PhysicalAddressType
	 * @generated
	 */
	public Adapter createPhysicalAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.PhysicalAddressType1 <em>Physical Address Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.PhysicalAddressType1
	 * @generated
	 */
	public Adapter createPhysicalAddressType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.PolynomialType <em>Polynomial Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.PolynomialType
	 * @generated
	 */
	public Adapter createPolynomialTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.QueuedVerifierType <em>Queued Verifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.QueuedVerifierType
	 * @generated
	 */
	public Adapter createQueuedVerifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.RangeEnumerationType <em>Range Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.RangeEnumerationType
	 * @generated
	 */
	public Adapter createRangeEnumerationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.RateInStreamSetType <em>Rate In Stream Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.RateInStreamSetType
	 * @generated
	 */
	public Adapter createRateInStreamSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.RateInStreamType <em>Rate In Stream Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.RateInStreamType
	 * @generated
	 */
	public Adapter createRateInStreamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.RateInStreamType1 <em>Rate In Stream Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.RateInStreamType1
	 * @generated
	 */
	public Adapter createRateInStreamType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ReceivedVerifierType <em>Received Verifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ReceivedVerifierType
	 * @generated
	 */
	public Adapter createReceivedVerifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ReferenceTimeType <em>Reference Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ReferenceTimeType
	 * @generated
	 */
	public Adapter createReferenceTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.RelativeTimeDataType <em>Relative Time Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.RelativeTimeDataType
	 * @generated
	 */
	public Adapter createRelativeTimeDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.RepeatType <em>Repeat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.RepeatType
	 * @generated
	 */
	public Adapter createRepeatTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.RestrictionCriteriaType <em>Restriction Criteria Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.RestrictionCriteriaType
	 * @generated
	 */
	public Adapter createRestrictionCriteriaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.RestrictionCriteriaType1 <em>Restriction Criteria Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.RestrictionCriteriaType1
	 * @generated
	 */
	public Adapter createRestrictionCriteriaType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.SentFromRangeVerifierType <em>Sent From Range Verifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.SentFromRangeVerifierType
	 * @generated
	 */
	public Adapter createSentFromRangeVerifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.SequenceContainerType <em>Sequence Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.SequenceContainerType
	 * @generated
	 */
	public Adapter createSequenceContainerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.SequenceEntryType <em>Sequence Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.SequenceEntryType
	 * @generated
	 */
	public Adapter createSequenceEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ServiceRefType <em>Service Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ServiceRefType
	 * @generated
	 */
	public Adapter createServiceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ServiceSetType <em>Service Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ServiceSetType
	 * @generated
	 */
	public Adapter createServiceSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ServiceType
	 * @generated
	 */
	public Adapter createServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.SignificanceType <em>Significance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.SignificanceType
	 * @generated
	 */
	public Adapter createSignificanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.SimpleAlgorithmType <em>Simple Algorithm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.SimpleAlgorithmType
	 * @generated
	 */
	public Adapter createSimpleAlgorithmTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.SizeInBitsType <em>Size In Bits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.SizeInBitsType
	 * @generated
	 */
	public Adapter createSizeInBitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.SpaceSystemType <em>Space System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.SpaceSystemType
	 * @generated
	 */
	public Adapter createSpaceSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.SplineCalibratorType <em>Spline Calibrator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.SplineCalibratorType
	 * @generated
	 */
	public Adapter createSplineCalibratorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.SplinePointType <em>Spline Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.SplinePointType
	 * @generated
	 */
	public Adapter createSplinePointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.StreamRefType <em>Stream Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.StreamRefType
	 * @generated
	 */
	public Adapter createStreamRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.StreamSegmentEntryType <em>Stream Segment Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.StreamSegmentEntryType
	 * @generated
	 */
	public Adapter createStreamSegmentEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.StreamSetType <em>Stream Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.StreamSetType
	 * @generated
	 */
	public Adapter createStreamSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.StringDataEncodingType <em>String Data Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.StringDataEncodingType
	 * @generated
	 */
	public Adapter createStringDataEncodingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.StringDataType <em>String Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.StringDataType
	 * @generated
	 */
	public Adapter createStringDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.SyncPatternType <em>Sync Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.SyncPatternType
	 * @generated
	 */
	public Adapter createSyncPatternTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.SyncPatternType1 <em>Sync Pattern Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.SyncPatternType1
	 * @generated
	 */
	public Adapter createSyncPatternType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.SyncStrategyType <em>Sync Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.SyncStrategyType
	 * @generated
	 */
	public Adapter createSyncStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.SyncStrategyType1 <em>Sync Strategy Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.SyncStrategyType1
	 * @generated
	 */
	public Adapter createSyncStrategyType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.SyncStrategyType2 <em>Sync Strategy Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.SyncStrategyType2
	 * @generated
	 */
	public Adapter createSyncStrategyType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.TelemetryMetaDataType <em>Telemetry Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.TelemetryMetaDataType
	 * @generated
	 */
	public Adapter createTelemetryMetaDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.TermType <em>Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.TermType
	 * @generated
	 */
	public Adapter createTermTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.TimeAssociationType <em>Time Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.TimeAssociationType
	 * @generated
	 */
	public Adapter createTimeAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.TransferredToRangeVerifierType <em>Transferred To Range Verifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.TransferredToRangeVerifierType
	 * @generated
	 */
	public Adapter createTransferredToRangeVerifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.TransmissionConstraintListType <em>Transmission Constraint List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.TransmissionConstraintListType
	 * @generated
	 */
	public Adapter createTransmissionConstraintListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.TransmissionConstraintType <em>Transmission Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.TransmissionConstraintType
	 * @generated
	 */
	public Adapter createTransmissionConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.TriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.TriggerType
	 * @generated
	 */
	public Adapter createTriggerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.UnitSetType <em>Unit Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.UnitSetType
	 * @generated
	 */
	public Adapter createUnitSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.UnitType
	 * @generated
	 */
	public Adapter createUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ValidRangeType <em>Valid Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ValidRangeType
	 * @generated
	 */
	public Adapter createValidRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.ValueEnumerationType <em>Value Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.ValueEnumerationType
	 * @generated
	 */
	public Adapter createValueEnumerationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.VariableFrameStreamType <em>Variable Frame Stream Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.VariableFrameStreamType
	 * @generated
	 */
	public Adapter createVariableFrameStreamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.space.xtce.VerifiersType <em>Verifiers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.space.xtce.VerifiersType
	 * @generated
	 */
	public Adapter createVerifiersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XtceAdapterFactory
