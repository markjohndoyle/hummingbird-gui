/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import javax.xml.datatype.Duration;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.omg.space.xtce.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XtceFactoryImpl extends EFactoryImpl implements XtceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XtceFactory init() {
		try {
			XtceFactory theXtceFactory = (XtceFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.omg.org/space/xtce"); 
			if (theXtceFactory != null) {
				return theXtceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XtceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XtcePackage.ABSOLUTE_TIME_DATA_TYPE: return createAbsoluteTimeDataType();
			case XtcePackage.ACCEPTED_VERIFIER_TYPE: return createAcceptedVerifierType();
			case XtcePackage.ALARM_CONDITIONS_TYPE: return createAlarmConditionsType();
			case XtcePackage.ALARM_RANGES_TYPE: return createAlarmRangesType();
			case XtcePackage.ALGORITHM_SET_TYPE: return createAlgorithmSetType();
			case XtcePackage.ALGORITHM_TEXT_TYPE: return createAlgorithmTextType();
			case XtcePackage.ALIAS_SET_TYPE: return createAliasSetType();
			case XtcePackage.ALIAS_TYPE: return createAliasType();
			case XtcePackage.AN_DED_CONDITIONS_TYPE: return createANDedConditionsType();
			case XtcePackage.ARGUMEMENT_ARRAY_TYPE_TYPE: return createArgumementArrayTypeType();
			case XtcePackage.ARGUMENT_ASSIGNMENT_LIST_TYPE: return createArgumentAssignmentListType();
			case XtcePackage.ARGUMENT_ASSIGNMENT_TYPE: return createArgumentAssignmentType();
			case XtcePackage.ARGUMENT_LIST_TYPE: return createArgumentListType();
			case XtcePackage.ARGUMENT_LIST_TYPE1: return createArgumentListType1();
			case XtcePackage.ARGUMENT_REF_ENTRY_TYPE: return createArgumentRefEntryType();
			case XtcePackage.ARGUMENT_TYPE: return createArgumentType();
			case XtcePackage.ARGUMENT_TYPE1: return createArgumentType1();
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE: return createArgumentTypeSetType();
			case XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE: return createArrayParameterRefEntryType();
			case XtcePackage.ARRAY_PARAMETER_TYPE_TYPE: return createArrayParameterTypeType();
			case XtcePackage.AUTHOR_SET_TYPE: return createAuthorSetType();
			case XtcePackage.AUTO_INVERT_TYPE: return createAutoInvertType();
			case XtcePackage.BASE_CONTAINER_TYPE: return createBaseContainerType();
			case XtcePackage.BASE_CONTAINER_TYPE1: return createBaseContainerType1();
			case XtcePackage.BASE_META_COMMAND_TYPE: return createBaseMetaCommandType();
			case XtcePackage.BINARY_DATA_ENCODING_TYPE: return createBinaryDataEncodingType();
			case XtcePackage.BINARY_DATA_TYPE: return createBinaryDataType();
			case XtcePackage.BLOCK_META_COMMAND_TYPE: return createBlockMetaCommandType();
			case XtcePackage.BOOLEAN_DATA_TYPE: return createBooleanDataType();
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE: return createBooleanExpressionType();
			case XtcePackage.BYTE_ORDER_TYPE: return createByteOrderType();
			case XtcePackage.BYTE_TYPE: return createByteType();
			case XtcePackage.CALIBRATOR_TYPE: return createCalibratorType();
			case XtcePackage.CHANGE_TYPE: return createChangeType();
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE: return createCommandContainerEntryListType();
			case XtcePackage.COMMAND_CONTAINER_SET_TYPE: return createCommandContainerSetType();
			case XtcePackage.COMMAND_CONTAINER_TYPE: return createCommandContainerType();
			case XtcePackage.COMMAND_META_DATA_TYPE: return createCommandMetaDataType();
			case XtcePackage.COMMAND_VERIFIER_TYPE: return createCommandVerifierType();
			case XtcePackage.COMPARISON_CHECK_TYPE: return createComparisonCheckType();
			case XtcePackage.COMPARISON_LIST_TYPE: return createComparisonListType();
			case XtcePackage.COMPARISON_LIST_TYPE1: return createComparisonListType1();
			case XtcePackage.COMPARISON_TYPE: return createComparisonType();
			case XtcePackage.COMPLETE_VERIFIER_TYPE: return createCompleteVerifierType();
			case XtcePackage.CONDITIONAL_ALARM_TYPE: return createConditionalAlarmType();
			case XtcePackage.CONSTANT_TYPE: return createConstantType();
			case XtcePackage.CONTAINER_REF_ENTRY_TYPE: return createContainerRefEntryType();
			case XtcePackage.CONTAINER_REF_SET_TYPE: return createContainerRefSetType();
			case XtcePackage.CONTAINER_REF_TYPE: return createContainerRefType();
			case XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE: return createContainerSegmentRefEntryType();
			case XtcePackage.CONTAINER_SET_TYPE: return createContainerSetType();
			case XtcePackage.CONTEXT_ALARM_LIST_TYPE: return createContextAlarmListType();
			case XtcePackage.CONTEXT_ALARM_LIST_TYPE1: return createContextAlarmListType1();
			case XtcePackage.CONTEXT_ALARM_LIST_TYPE2: return createContextAlarmListType2();
			case XtcePackage.CONTEXT_ALARM_LIST_TYPE3: return createContextAlarmListType3();
			case XtcePackage.CONTEXT_ALARM_TYPE: return createContextAlarmType();
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE: return createContextCalibratorListType();
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE1: return createContextCalibratorListType1();
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE2: return createContextCalibratorListType2();
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE3: return createContextCalibratorListType3();
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE4: return createContextCalibratorListType4();
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE: return createContextCalibratorType();
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE1: return createContextCalibratorType1();
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE2: return createContextCalibratorType2();
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE3: return createContextCalibratorType3();
			case XtcePackage.CONTEXT_SIGNIFICANCE_LIST_TYPE: return createContextSignificanceListType();
			case XtcePackage.CONTEXT_SIGNIFICANCE_TYPE: return createContextSignificanceType();
			case XtcePackage.CRC_TYPE: return createCRCType();
			case XtcePackage.CUSTOM_STREAM_TYPE: return createCustomStreamType();
			case XtcePackage.DATA_ENCODING_TYPE: return createDataEncodingType();
			case XtcePackage.DECIMAL_RANGE_TYPE: return createDecimalRangeType();
			case XtcePackage.DECIMAL_VALUE_TYPE: return createDecimalValueType();
			case XtcePackage.DEFAULTS_TYPE: return createDefaultsType();
			case XtcePackage.DIMENSION_LIST_TYPE: return createDimensionListType();
			case XtcePackage.DIMENSION_TYPE: return createDimensionType();
			case XtcePackage.DISCRETE_LOOKUP_LIST_TYPE: return createDiscreteLookupListType();
			case XtcePackage.DISCRETE_LOOKUP_TYPE: return createDiscreteLookupType();
			case XtcePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case XtcePackage.DYNAMIC_VALUE_TYPE: return createDynamicValueType();
			case XtcePackage.DYNAMIC_VALUE_TYPE1: return createDynamicValueType1();
			case XtcePackage.ENCODING_TYPE1: return createEncodingType1();
			case XtcePackage.ENTRY_LIST_TYPE: return createEntryListType();
			case XtcePackage.ENUMERATED_DATA_TYPE: return createEnumeratedDataType();
			case XtcePackage.ENUMERATION_LIST_TYPE: return createEnumerationListType();
			case XtcePackage.ERROR_DETECT_CORRECT_TYPE: return createErrorDetectCorrectType();
			case XtcePackage.EXECUTION_VERIFIER_TYPE: return createExecutionVerifierType();
			case XtcePackage.EXTERNAL_ALGORITHM_SET_TYPE: return createExternalAlgorithmSetType();
			case XtcePackage.EXTERNAL_ALGORITHM_TYPE: return createExternalAlgorithmType();
			case XtcePackage.FIXED_FRAME_STREAM_TYPE: return createFixedFrameStreamType();
			case XtcePackage.FIXED_FRAME_SYNC_STRATEGY_TYPE: return createFixedFrameSyncStrategyType();
			case XtcePackage.FIXED_VALUE_ENTRY_TYPE: return createFixedValueEntryType();
			case XtcePackage.FLAG_TYPE: return createFlagType();
			case XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE: return createFloatArgumentTypeType();
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE: return createFloatDataEncodingType();
			case XtcePackage.FLOAT_DATA_TYPE: return createFloatDataType();
			case XtcePackage.FLOAT_PARAMETER_TYPE_TYPE: return createFloatParameterTypeType();
			case XtcePackage.FRAME_STREAM_TYPE: return createFrameStreamType();
			case XtcePackage.HEADER_TYPE: return createHeaderType();
			case XtcePackage.HISTORY_SET_TYPE: return createHistorySetType();
			case XtcePackage.INDIRECT_PARAMETER_REF_ENTRY_TYPE: return createIndirectParameterRefEntryType();
			case XtcePackage.INPUT_ALGORITHM_TYPE: return createInputAlgorithmType();
			case XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE: return createInputOutputAlgorithmType();
			case XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE: return createInputOutputTriggerAlgorithmType();
			case XtcePackage.INPUT_SET_TYPE: return createInputSetType();
			case XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE: return createIntegerArgumentTypeType();
			case XtcePackage.INTEGER_DATA_ENCODING_TYPE: return createIntegerDataEncodingType();
			case XtcePackage.INTEGER_DATA_TYPE: return createIntegerDataType();
			case XtcePackage.INTEGER_PARAMETER_TYPE_TYPE: return createIntegerParameterTypeType();
			case XtcePackage.INTEGER_RANGE_TYPE: return createIntegerRangeType();
			case XtcePackage.INTEGER_VALUE_TYPE: return createIntegerValueType();
			case XtcePackage.INTERLOCK_TYPE: return createInterlockType();
			case XtcePackage.LEADING_SIZE_TYPE: return createLeadingSizeType();
			case XtcePackage.LINEAR_ADJUSTMENT_TYPE: return createLinearAdjustmentType();
			case XtcePackage.LINEAR_ADJUSTMENT_TYPE1: return createLinearAdjustmentType1();
			case XtcePackage.LOCATION_IN_CONTAINER_IN_BITS_TYPE: return createLocationInContainerInBitsType();
			case XtcePackage.MATCH_CRITERIA_TYPE: return createMatchCriteriaType();
			case XtcePackage.MATH_ALGORITHM_TYPE: return createMathAlgorithmType();
			case XtcePackage.MATH_OPERATION_TYPE: return createMathOperationType();
			case XtcePackage.MATH_OPERATION_TYPE1: return createMathOperationType1();
			case XtcePackage.MESSAGE_REF_SET_TYPE: return createMessageRefSetType();
			case XtcePackage.MESSAGE_REF_TYPE: return createMessageRefType();
			case XtcePackage.MESSAGE_SET_TYPE: return createMessageSetType();
			case XtcePackage.MESSAGE_TYPE: return createMessageType();
			case XtcePackage.META_COMMAND_SET_TYPE: return createMetaCommandSetType();
			case XtcePackage.META_COMMAND_STEP_LIST_TYPE: return createMetaCommandStepListType();
			case XtcePackage.META_COMMAND_STEP_TYPE: return createMetaCommandStepType();
			case XtcePackage.META_COMMAND_TYPE: return createMetaCommandType();
			case XtcePackage.NAME_DESCRIPTION_TYPE: return createNameDescriptionType();
			case XtcePackage.NOTE_SET_TYPE: return createNoteSetType();
			case XtcePackage.NUMBER_FORMAT_TYPE: return createNumberFormatType();
			case XtcePackage.NUMBER_TO_STRING_TYPE: return createNumberToStringType();
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE: return createNumericAlarmConditionType();
			case XtcePackage.NUMERIC_DATA_TYPE: return createNumericDataType();
			case XtcePackage.OFFSET_TYPE: return createOffsetType();
			case XtcePackage.ORED_CONDITIONS_TYPE: return createORedConditionsType();
			case XtcePackage.OUTPUT_PARAMETER_REF_TYPE: return createOutputParameterRefType();
			case XtcePackage.OUTPUT_SET_TYPE: return createOutputSetType();
			case XtcePackage.PARAMETER_INSTANCE_REF_TYPE: return createParameterInstanceRefType();
			case XtcePackage.PARAMETER_INSTANCE_REF_TYPE1: return createParameterInstanceRefType1();
			case XtcePackage.PARAMETER_PROPERTIES_TYPE: return createParameterPropertiesType();
			case XtcePackage.PARAMETER_REF_ENTRY_TYPE: return createParameterRefEntryType();
			case XtcePackage.PARAMETER_REF_TYPE: return createParameterRefType();
			case XtcePackage.PARAMETER_REF_TYPE1: return createParameterRefType1();
			case XtcePackage.PARAMETER_SEGMENT_REF_ENTRY_TYPE: return createParameterSegmentRefEntryType();
			case XtcePackage.PARAMETER_SET_TYPE: return createParameterSetType();
			case XtcePackage.PARAMETER_TO_SET_LIST_TYPE: return createParameterToSetListType();
			case XtcePackage.PARAMETER_TO_SET_TYPE: return createParameterToSetType();
			case XtcePackage.PARAMETER_TO_SET_TYPE1: return createParameterToSetType1();
			case XtcePackage.PARAMETER_TYPE: return createParameterType();
			case XtcePackage.PARAMETER_TYPE_SET_TYPE: return createParameterTypeSetType();
			case XtcePackage.PARAMETER_VALUE_CHANGE_TYPE: return createParameterValueChangeType();
			case XtcePackage.PARITY_TYPE: return createParityType();
			case XtcePackage.PHYSICAL_ADDRESS_SET_TYPE: return createPhysicalAddressSetType();
			case XtcePackage.PHYSICAL_ADDRESS_TYPE: return createPhysicalAddressType();
			case XtcePackage.PHYSICAL_ADDRESS_TYPE1: return createPhysicalAddressType1();
			case XtcePackage.POLYNOMIAL_TYPE: return createPolynomialType();
			case XtcePackage.PROPERTY_TYPE: return createPropertyType();
			case XtcePackage.QUEUED_VERIFIER_TYPE: return createQueuedVerifierType();
			case XtcePackage.RANGE_ENUMERATION_TYPE: return createRangeEnumerationType();
			case XtcePackage.RATE_IN_STREAM_SET_TYPE: return createRateInStreamSetType();
			case XtcePackage.RATE_IN_STREAM_TYPE: return createRateInStreamType();
			case XtcePackage.RATE_IN_STREAM_TYPE1: return createRateInStreamType1();
			case XtcePackage.RECEIVED_VERIFIER_TYPE: return createReceivedVerifierType();
			case XtcePackage.REFERENCE_TIME_TYPE: return createReferenceTimeType();
			case XtcePackage.RELATIVE_TIME_DATA_TYPE: return createRelativeTimeDataType();
			case XtcePackage.REPEAT_TYPE: return createRepeatType();
			case XtcePackage.RESTRICTION_CRITERIA_TYPE: return createRestrictionCriteriaType();
			case XtcePackage.RESTRICTION_CRITERIA_TYPE1: return createRestrictionCriteriaType1();
			case XtcePackage.SENT_FROM_RANGE_VERIFIER_TYPE: return createSentFromRangeVerifierType();
			case XtcePackage.SEQUENCE_CONTAINER_TYPE: return createSequenceContainerType();
			case XtcePackage.SEQUENCE_ENTRY_TYPE: return createSequenceEntryType();
			case XtcePackage.SERVICE_REF_TYPE: return createServiceRefType();
			case XtcePackage.SERVICE_SET_TYPE: return createServiceSetType();
			case XtcePackage.SERVICE_TYPE: return createServiceType();
			case XtcePackage.SIGNIFICANCE_TYPE: return createSignificanceType();
			case XtcePackage.SIMPLE_ALGORITHM_TYPE: return createSimpleAlgorithmType();
			case XtcePackage.SIZE_IN_BITS_TYPE: return createSizeInBitsType();
			case XtcePackage.SPACE_SYSTEM_TYPE: return createSpaceSystemType();
			case XtcePackage.SPLINE_CALIBRATOR_TYPE: return createSplineCalibratorType();
			case XtcePackage.SPLINE_POINT_TYPE: return createSplinePointType();
			case XtcePackage.STREAM_REF_TYPE: return createStreamRefType();
			case XtcePackage.STREAM_SEGMENT_ENTRY_TYPE: return createStreamSegmentEntryType();
			case XtcePackage.STREAM_SET_TYPE: return createStreamSetType();
			case XtcePackage.STRING_DATA_ENCODING_TYPE: return createStringDataEncodingType();
			case XtcePackage.STRING_DATA_TYPE: return createStringDataType();
			case XtcePackage.SYNC_PATTERN_TYPE: return createSyncPatternType();
			case XtcePackage.SYNC_PATTERN_TYPE1: return createSyncPatternType1();
			case XtcePackage.SYNC_STRATEGY_TYPE: return createSyncStrategyType();
			case XtcePackage.SYNC_STRATEGY_TYPE1: return createSyncStrategyType1();
			case XtcePackage.SYNC_STRATEGY_TYPE2: return createSyncStrategyType2();
			case XtcePackage.TELEMETRY_META_DATA_TYPE: return createTelemetryMetaDataType();
			case XtcePackage.TERM_TYPE: return createTermType();
			case XtcePackage.TIME_ASSOCIATION_TYPE: return createTimeAssociationType();
			case XtcePackage.TRANSFERRED_TO_RANGE_VERIFIER_TYPE: return createTransferredToRangeVerifierType();
			case XtcePackage.TRANSMISSION_CONSTRAINT_LIST_TYPE: return createTransmissionConstraintListType();
			case XtcePackage.TRANSMISSION_CONSTRAINT_TYPE: return createTransmissionConstraintType();
			case XtcePackage.TRIGGER_TYPE: return createTriggerType();
			case XtcePackage.UNIT_SET_TYPE: return createUnitSetType();
			case XtcePackage.UNIT_TYPE: return createUnitType();
			case XtcePackage.VALID_RANGE_TYPE: return createValidRangeType();
			case XtcePackage.VALUE_ENUMERATION_TYPE: return createValueEnumerationType();
			case XtcePackage.VARIABLE_FRAME_STREAM_TYPE: return createVariableFrameStreamType();
			case XtcePackage.VERIFIERS_TYPE: return createVerifiersType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XtcePackage.BASIS_TYPE:
				return createBasisTypeFromString(eDataType, initialValue);
			case XtcePackage.BIT_ORDER_TYPE:
				return createBitOrderTypeFromString(eDataType, initialValue);
			case XtcePackage.CHARACTER_WIDTH_TYPE:
				return createCharacterWidthTypeFromString(eDataType, initialValue);
			case XtcePackage.COMPARISON_OPERATORS_TYPE:
				return createComparisonOperatorsTypeFromString(eDataType, initialValue);
			case XtcePackage.CONSEQUENCE_LEVEL_TYPE:
				return createConsequenceLevelTypeFromString(eDataType, initialValue);
			case XtcePackage.DATA_SOURCE_TYPE:
				return createDataSourceTypeFromString(eDataType, initialValue);
			case XtcePackage.ENCODING_TYPE:
				return createEncodingTypeFromString(eDataType, initialValue);
			case XtcePackage.ENCODING_TYPE2:
				return createEncodingType2FromString(eDataType, initialValue);
			case XtcePackage.ENCODING_TYPE3:
				return createEncodingType3FromString(eDataType, initialValue);
			case XtcePackage.EPOCH_TYPE_MEMBER1:
				return createEpochTypeMember1FromString(eDataType, initialValue);
			case XtcePackage.FLAG_BIT_TYPE_TYPE:
				return createFlagBitTypeTypeFromString(eDataType, initialValue);
			case XtcePackage.MATH_OPERATORS_TYPE:
				return createMathOperatorsTypeFromString(eDataType, initialValue);
			case XtcePackage.NOTATION_TYPE:
				return createNotationTypeFromString(eDataType, initialValue);
			case XtcePackage.PCM_TYPE_TYPE:
				return createPcmTypeTypeFromString(eDataType, initialValue);
			case XtcePackage.RADIX_TYPE:
				return createRadixTypeFromString(eDataType, initialValue);
			case XtcePackage.REFERENCE_LOCATION_TYPE:
				return createReferenceLocationTypeFromString(eDataType, initialValue);
			case XtcePackage.REFERENCE_TYPE:
				return createReferenceTypeFromString(eDataType, initialValue);
			case XtcePackage.REFERENCE_TYPE1:
				return createReferenceType1FromString(eDataType, initialValue);
			case XtcePackage.SIZE_IN_BITS_TYPE1:
				return createSizeInBitsType1FromString(eDataType, initialValue);
			case XtcePackage.SIZE_IN_BITS_TYPE2:
				return createSizeInBitsType2FromString(eDataType, initialValue);
			case XtcePackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case XtcePackage.UNITS_TYPE:
				return createUnitsTypeFromString(eDataType, initialValue);
			case XtcePackage.VALIDATION_STATUS_TYPE:
				return createValidationStatusTypeFromString(eDataType, initialValue);
			case XtcePackage.VERIFICATION_TO_WAIT_FOR_TYPE:
				return createVerificationToWaitForTypeFromString(eDataType, initialValue);
			case XtcePackage.VERIFIER_TO_TRIGGER_ON_TYPE:
				return createVerifierToTriggerOnTypeFromString(eDataType, initialValue);
			case XtcePackage.BASIS_TYPE_OBJECT:
				return createBasisTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.BINARY_TYPE:
				return createBinaryTypeFromString(eDataType, initialValue);
			case XtcePackage.BIT_ORDER_TYPE_OBJECT:
				return createBitOrderTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.CHARACTER_WIDTH_TYPE_OBJECT:
				return createCharacterWidthTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.COMPARISON_OPERATORS_TYPE_OBJECT:
				return createComparisonOperatorsTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.CONSEQUENCE_LEVEL_TYPE_OBJECT:
				return createConsequenceLevelTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.DATA_SOURCE_TYPE_OBJECT:
				return createDataSourceTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.ENCODING_TYPE_OBJECT:
				return createEncodingTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.ENCODING_TYPE_OBJECT1:
				return createEncodingTypeObject1FromString(eDataType, initialValue);
			case XtcePackage.ENCODING_TYPE_OBJECT2:
				return createEncodingTypeObject2FromString(eDataType, initialValue);
			case XtcePackage.EPOCH_TYPE:
				return createEpochTypeFromString(eDataType, initialValue);
			case XtcePackage.EPOCH_TYPE_MEMBER1_OBJECT:
				return createEpochTypeMember1ObjectFromString(eDataType, initialValue);
			case XtcePackage.FIXED_INTEGER_VALUE_TYPE:
				return createFixedIntegerValueTypeFromString(eDataType, initialValue);
			case XtcePackage.FLAG_BIT_TYPE_TYPE_OBJECT:
				return createFlagBitTypeTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.HEXADECIMAL_TYPE:
				return createHexadecimalTypeFromString(eDataType, initialValue);
			case XtcePackage.MATH_OPERATORS_TYPE_OBJECT:
				return createMathOperatorsTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.NAME_REFERENCE_TYPE:
				return createNameReferenceTypeFromString(eDataType, initialValue);
			case XtcePackage.NAME_TYPE:
				return createNameTypeFromString(eDataType, initialValue);
			case XtcePackage.NOTATION_TYPE_OBJECT:
				return createNotationTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.OCTAL_TYPE:
				return createOctalTypeFromString(eDataType, initialValue);
			case XtcePackage.PCM_TYPE_TYPE_OBJECT:
				return createPcmTypeTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.RADIX_TYPE_OBJECT:
				return createRadixTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.REFERENCE_LOCATION_TYPE_OBJECT:
				return createReferenceLocationTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.REFERENCE_TYPE_OBJECT:
				return createReferenceTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.REFERENCE_TYPE_OBJECT1:
				return createReferenceTypeObject1FromString(eDataType, initialValue);
			case XtcePackage.RELATIVE_TIME_TYPE:
				return createRelativeTimeTypeFromString(eDataType, initialValue);
			case XtcePackage.SIZE_IN_BITS_TYPE_OBJECT:
				return createSizeInBitsTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.SIZE_IN_BITS_TYPE_OBJECT1:
				return createSizeInBitsTypeObject1FromString(eDataType, initialValue);
			case XtcePackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.UNITS_TYPE_OBJECT:
				return createUnitsTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.VALIDATION_STATUS_TYPE_OBJECT:
				return createValidationStatusTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.VERIFICATION_TO_WAIT_FOR_TYPE_OBJECT:
				return createVerificationToWaitForTypeObjectFromString(eDataType, initialValue);
			case XtcePackage.VERIFIER_TO_TRIGGER_ON_TYPE_OBJECT:
				return createVerifierToTriggerOnTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XtcePackage.BASIS_TYPE:
				return convertBasisTypeToString(eDataType, instanceValue);
			case XtcePackage.BIT_ORDER_TYPE:
				return convertBitOrderTypeToString(eDataType, instanceValue);
			case XtcePackage.CHARACTER_WIDTH_TYPE:
				return convertCharacterWidthTypeToString(eDataType, instanceValue);
			case XtcePackage.COMPARISON_OPERATORS_TYPE:
				return convertComparisonOperatorsTypeToString(eDataType, instanceValue);
			case XtcePackage.CONSEQUENCE_LEVEL_TYPE:
				return convertConsequenceLevelTypeToString(eDataType, instanceValue);
			case XtcePackage.DATA_SOURCE_TYPE:
				return convertDataSourceTypeToString(eDataType, instanceValue);
			case XtcePackage.ENCODING_TYPE:
				return convertEncodingTypeToString(eDataType, instanceValue);
			case XtcePackage.ENCODING_TYPE2:
				return convertEncodingType2ToString(eDataType, instanceValue);
			case XtcePackage.ENCODING_TYPE3:
				return convertEncodingType3ToString(eDataType, instanceValue);
			case XtcePackage.EPOCH_TYPE_MEMBER1:
				return convertEpochTypeMember1ToString(eDataType, instanceValue);
			case XtcePackage.FLAG_BIT_TYPE_TYPE:
				return convertFlagBitTypeTypeToString(eDataType, instanceValue);
			case XtcePackage.MATH_OPERATORS_TYPE:
				return convertMathOperatorsTypeToString(eDataType, instanceValue);
			case XtcePackage.NOTATION_TYPE:
				return convertNotationTypeToString(eDataType, instanceValue);
			case XtcePackage.PCM_TYPE_TYPE:
				return convertPcmTypeTypeToString(eDataType, instanceValue);
			case XtcePackage.RADIX_TYPE:
				return convertRadixTypeToString(eDataType, instanceValue);
			case XtcePackage.REFERENCE_LOCATION_TYPE:
				return convertReferenceLocationTypeToString(eDataType, instanceValue);
			case XtcePackage.REFERENCE_TYPE:
				return convertReferenceTypeToString(eDataType, instanceValue);
			case XtcePackage.REFERENCE_TYPE1:
				return convertReferenceType1ToString(eDataType, instanceValue);
			case XtcePackage.SIZE_IN_BITS_TYPE1:
				return convertSizeInBitsType1ToString(eDataType, instanceValue);
			case XtcePackage.SIZE_IN_BITS_TYPE2:
				return convertSizeInBitsType2ToString(eDataType, instanceValue);
			case XtcePackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case XtcePackage.UNITS_TYPE:
				return convertUnitsTypeToString(eDataType, instanceValue);
			case XtcePackage.VALIDATION_STATUS_TYPE:
				return convertValidationStatusTypeToString(eDataType, instanceValue);
			case XtcePackage.VERIFICATION_TO_WAIT_FOR_TYPE:
				return convertVerificationToWaitForTypeToString(eDataType, instanceValue);
			case XtcePackage.VERIFIER_TO_TRIGGER_ON_TYPE:
				return convertVerifierToTriggerOnTypeToString(eDataType, instanceValue);
			case XtcePackage.BASIS_TYPE_OBJECT:
				return convertBasisTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.BINARY_TYPE:
				return convertBinaryTypeToString(eDataType, instanceValue);
			case XtcePackage.BIT_ORDER_TYPE_OBJECT:
				return convertBitOrderTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.CHARACTER_WIDTH_TYPE_OBJECT:
				return convertCharacterWidthTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.COMPARISON_OPERATORS_TYPE_OBJECT:
				return convertComparisonOperatorsTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.CONSEQUENCE_LEVEL_TYPE_OBJECT:
				return convertConsequenceLevelTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.DATA_SOURCE_TYPE_OBJECT:
				return convertDataSourceTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.ENCODING_TYPE_OBJECT:
				return convertEncodingTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.ENCODING_TYPE_OBJECT1:
				return convertEncodingTypeObject1ToString(eDataType, instanceValue);
			case XtcePackage.ENCODING_TYPE_OBJECT2:
				return convertEncodingTypeObject2ToString(eDataType, instanceValue);
			case XtcePackage.EPOCH_TYPE:
				return convertEpochTypeToString(eDataType, instanceValue);
			case XtcePackage.EPOCH_TYPE_MEMBER1_OBJECT:
				return convertEpochTypeMember1ObjectToString(eDataType, instanceValue);
			case XtcePackage.FIXED_INTEGER_VALUE_TYPE:
				return convertFixedIntegerValueTypeToString(eDataType, instanceValue);
			case XtcePackage.FLAG_BIT_TYPE_TYPE_OBJECT:
				return convertFlagBitTypeTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.HEXADECIMAL_TYPE:
				return convertHexadecimalTypeToString(eDataType, instanceValue);
			case XtcePackage.MATH_OPERATORS_TYPE_OBJECT:
				return convertMathOperatorsTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.NAME_REFERENCE_TYPE:
				return convertNameReferenceTypeToString(eDataType, instanceValue);
			case XtcePackage.NAME_TYPE:
				return convertNameTypeToString(eDataType, instanceValue);
			case XtcePackage.NOTATION_TYPE_OBJECT:
				return convertNotationTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.OCTAL_TYPE:
				return convertOctalTypeToString(eDataType, instanceValue);
			case XtcePackage.PCM_TYPE_TYPE_OBJECT:
				return convertPcmTypeTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.RADIX_TYPE_OBJECT:
				return convertRadixTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.REFERENCE_LOCATION_TYPE_OBJECT:
				return convertReferenceLocationTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.REFERENCE_TYPE_OBJECT:
				return convertReferenceTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.REFERENCE_TYPE_OBJECT1:
				return convertReferenceTypeObject1ToString(eDataType, instanceValue);
			case XtcePackage.RELATIVE_TIME_TYPE:
				return convertRelativeTimeTypeToString(eDataType, instanceValue);
			case XtcePackage.SIZE_IN_BITS_TYPE_OBJECT:
				return convertSizeInBitsTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.SIZE_IN_BITS_TYPE_OBJECT1:
				return convertSizeInBitsTypeObject1ToString(eDataType, instanceValue);
			case XtcePackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.UNITS_TYPE_OBJECT:
				return convertUnitsTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.VALIDATION_STATUS_TYPE_OBJECT:
				return convertValidationStatusTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.VERIFICATION_TO_WAIT_FOR_TYPE_OBJECT:
				return convertVerificationToWaitForTypeObjectToString(eDataType, instanceValue);
			case XtcePackage.VERIFIER_TO_TRIGGER_ON_TYPE_OBJECT:
				return convertVerifierToTriggerOnTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteTimeDataType createAbsoluteTimeDataType() {
		AbsoluteTimeDataTypeImpl absoluteTimeDataType = new AbsoluteTimeDataTypeImpl();
		return absoluteTimeDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptedVerifierType createAcceptedVerifierType() {
		AcceptedVerifierTypeImpl acceptedVerifierType = new AcceptedVerifierTypeImpl();
		return acceptedVerifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlarmConditionsType createAlarmConditionsType() {
		AlarmConditionsTypeImpl alarmConditionsType = new AlarmConditionsTypeImpl();
		return alarmConditionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlarmRangesType createAlarmRangesType() {
		AlarmRangesTypeImpl alarmRangesType = new AlarmRangesTypeImpl();
		return alarmRangesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmSetType createAlgorithmSetType() {
		AlgorithmSetTypeImpl algorithmSetType = new AlgorithmSetTypeImpl();
		return algorithmSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmTextType createAlgorithmTextType() {
		AlgorithmTextTypeImpl algorithmTextType = new AlgorithmTextTypeImpl();
		return algorithmTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasSetType createAliasSetType() {
		AliasSetTypeImpl aliasSetType = new AliasSetTypeImpl();
		return aliasSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasType createAliasType() {
		AliasTypeImpl aliasType = new AliasTypeImpl();
		return aliasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANDedConditionsType createANDedConditionsType() {
		ANDedConditionsTypeImpl anDedConditionsType = new ANDedConditionsTypeImpl();
		return anDedConditionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumementArrayTypeType createArgumementArrayTypeType() {
		ArgumementArrayTypeTypeImpl argumementArrayTypeType = new ArgumementArrayTypeTypeImpl();
		return argumementArrayTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentAssignmentListType createArgumentAssignmentListType() {
		ArgumentAssignmentListTypeImpl argumentAssignmentListType = new ArgumentAssignmentListTypeImpl();
		return argumentAssignmentListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentAssignmentType createArgumentAssignmentType() {
		ArgumentAssignmentTypeImpl argumentAssignmentType = new ArgumentAssignmentTypeImpl();
		return argumentAssignmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentListType createArgumentListType() {
		ArgumentListTypeImpl argumentListType = new ArgumentListTypeImpl();
		return argumentListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentListType1 createArgumentListType1() {
		ArgumentListType1Impl argumentListType1 = new ArgumentListType1Impl();
		return argumentListType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentRefEntryType createArgumentRefEntryType() {
		ArgumentRefEntryTypeImpl argumentRefEntryType = new ArgumentRefEntryTypeImpl();
		return argumentRefEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentType createArgumentType() {
		ArgumentTypeImpl argumentType = new ArgumentTypeImpl();
		return argumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentType1 createArgumentType1() {
		ArgumentType1Impl argumentType1 = new ArgumentType1Impl();
		return argumentType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentTypeSetType createArgumentTypeSetType() {
		ArgumentTypeSetTypeImpl argumentTypeSetType = new ArgumentTypeSetTypeImpl();
		return argumentTypeSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayParameterRefEntryType createArrayParameterRefEntryType() {
		ArrayParameterRefEntryTypeImpl arrayParameterRefEntryType = new ArrayParameterRefEntryTypeImpl();
		return arrayParameterRefEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayParameterTypeType createArrayParameterTypeType() {
		ArrayParameterTypeTypeImpl arrayParameterTypeType = new ArrayParameterTypeTypeImpl();
		return arrayParameterTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorSetType createAuthorSetType() {
		AuthorSetTypeImpl authorSetType = new AuthorSetTypeImpl();
		return authorSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoInvertType createAutoInvertType() {
		AutoInvertTypeImpl autoInvertType = new AutoInvertTypeImpl();
		return autoInvertType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseContainerType createBaseContainerType() {
		BaseContainerTypeImpl baseContainerType = new BaseContainerTypeImpl();
		return baseContainerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseContainerType1 createBaseContainerType1() {
		BaseContainerType1Impl baseContainerType1 = new BaseContainerType1Impl();
		return baseContainerType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseMetaCommandType createBaseMetaCommandType() {
		BaseMetaCommandTypeImpl baseMetaCommandType = new BaseMetaCommandTypeImpl();
		return baseMetaCommandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryDataEncodingType createBinaryDataEncodingType() {
		BinaryDataEncodingTypeImpl binaryDataEncodingType = new BinaryDataEncodingTypeImpl();
		return binaryDataEncodingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryDataType createBinaryDataType() {
		BinaryDataTypeImpl binaryDataType = new BinaryDataTypeImpl();
		return binaryDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockMetaCommandType createBlockMetaCommandType() {
		BlockMetaCommandTypeImpl blockMetaCommandType = new BlockMetaCommandTypeImpl();
		return blockMetaCommandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanDataType createBooleanDataType() {
		BooleanDataTypeImpl booleanDataType = new BooleanDataTypeImpl();
		return booleanDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpressionType createBooleanExpressionType() {
		BooleanExpressionTypeImpl booleanExpressionType = new BooleanExpressionTypeImpl();
		return booleanExpressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByteOrderType createByteOrderType() {
		ByteOrderTypeImpl byteOrderType = new ByteOrderTypeImpl();
		return byteOrderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByteType createByteType() {
		ByteTypeImpl byteType = new ByteTypeImpl();
		return byteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalibratorType createCalibratorType() {
		CalibratorTypeImpl calibratorType = new CalibratorTypeImpl();
		return calibratorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeType createChangeType() {
		ChangeTypeImpl changeType = new ChangeTypeImpl();
		return changeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandContainerEntryListType createCommandContainerEntryListType() {
		CommandContainerEntryListTypeImpl commandContainerEntryListType = new CommandContainerEntryListTypeImpl();
		return commandContainerEntryListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandContainerSetType createCommandContainerSetType() {
		CommandContainerSetTypeImpl commandContainerSetType = new CommandContainerSetTypeImpl();
		return commandContainerSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandContainerType createCommandContainerType() {
		CommandContainerTypeImpl commandContainerType = new CommandContainerTypeImpl();
		return commandContainerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandMetaDataType createCommandMetaDataType() {
		CommandMetaDataTypeImpl commandMetaDataType = new CommandMetaDataTypeImpl();
		return commandMetaDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandVerifierType createCommandVerifierType() {
		CommandVerifierTypeImpl commandVerifierType = new CommandVerifierTypeImpl();
		return commandVerifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonCheckType createComparisonCheckType() {
		ComparisonCheckTypeImpl comparisonCheckType = new ComparisonCheckTypeImpl();
		return comparisonCheckType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonListType createComparisonListType() {
		ComparisonListTypeImpl comparisonListType = new ComparisonListTypeImpl();
		return comparisonListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonListType1 createComparisonListType1() {
		ComparisonListType1Impl comparisonListType1 = new ComparisonListType1Impl();
		return comparisonListType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonType createComparisonType() {
		ComparisonTypeImpl comparisonType = new ComparisonTypeImpl();
		return comparisonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteVerifierType createCompleteVerifierType() {
		CompleteVerifierTypeImpl completeVerifierType = new CompleteVerifierTypeImpl();
		return completeVerifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalAlarmType createConditionalAlarmType() {
		ConditionalAlarmTypeImpl conditionalAlarmType = new ConditionalAlarmTypeImpl();
		return conditionalAlarmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantType createConstantType() {
		ConstantTypeImpl constantType = new ConstantTypeImpl();
		return constantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerRefEntryType createContainerRefEntryType() {
		ContainerRefEntryTypeImpl containerRefEntryType = new ContainerRefEntryTypeImpl();
		return containerRefEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerRefSetType createContainerRefSetType() {
		ContainerRefSetTypeImpl containerRefSetType = new ContainerRefSetTypeImpl();
		return containerRefSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerRefType createContainerRefType() {
		ContainerRefTypeImpl containerRefType = new ContainerRefTypeImpl();
		return containerRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerSegmentRefEntryType createContainerSegmentRefEntryType() {
		ContainerSegmentRefEntryTypeImpl containerSegmentRefEntryType = new ContainerSegmentRefEntryTypeImpl();
		return containerSegmentRefEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerSetType createContainerSetType() {
		ContainerSetTypeImpl containerSetType = new ContainerSetTypeImpl();
		return containerSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAlarmListType createContextAlarmListType() {
		ContextAlarmListTypeImpl contextAlarmListType = new ContextAlarmListTypeImpl();
		return contextAlarmListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAlarmListType1 createContextAlarmListType1() {
		ContextAlarmListType1Impl contextAlarmListType1 = new ContextAlarmListType1Impl();
		return contextAlarmListType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAlarmListType2 createContextAlarmListType2() {
		ContextAlarmListType2Impl contextAlarmListType2 = new ContextAlarmListType2Impl();
		return contextAlarmListType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAlarmListType3 createContextAlarmListType3() {
		ContextAlarmListType3Impl contextAlarmListType3 = new ContextAlarmListType3Impl();
		return contextAlarmListType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAlarmType createContextAlarmType() {
		ContextAlarmTypeImpl contextAlarmType = new ContextAlarmTypeImpl();
		return contextAlarmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextCalibratorListType createContextCalibratorListType() {
		ContextCalibratorListTypeImpl contextCalibratorListType = new ContextCalibratorListTypeImpl();
		return contextCalibratorListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextCalibratorListType1 createContextCalibratorListType1() {
		ContextCalibratorListType1Impl contextCalibratorListType1 = new ContextCalibratorListType1Impl();
		return contextCalibratorListType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextCalibratorListType2 createContextCalibratorListType2() {
		ContextCalibratorListType2Impl contextCalibratorListType2 = new ContextCalibratorListType2Impl();
		return contextCalibratorListType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextCalibratorListType3 createContextCalibratorListType3() {
		ContextCalibratorListType3Impl contextCalibratorListType3 = new ContextCalibratorListType3Impl();
		return contextCalibratorListType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextCalibratorListType4 createContextCalibratorListType4() {
		ContextCalibratorListType4Impl contextCalibratorListType4 = new ContextCalibratorListType4Impl();
		return contextCalibratorListType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextCalibratorType createContextCalibratorType() {
		ContextCalibratorTypeImpl contextCalibratorType = new ContextCalibratorTypeImpl();
		return contextCalibratorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextCalibratorType1 createContextCalibratorType1() {
		ContextCalibratorType1Impl contextCalibratorType1 = new ContextCalibratorType1Impl();
		return contextCalibratorType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextCalibratorType2 createContextCalibratorType2() {
		ContextCalibratorType2Impl contextCalibratorType2 = new ContextCalibratorType2Impl();
		return contextCalibratorType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextCalibratorType3 createContextCalibratorType3() {
		ContextCalibratorType3Impl contextCalibratorType3 = new ContextCalibratorType3Impl();
		return contextCalibratorType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextSignificanceListType createContextSignificanceListType() {
		ContextSignificanceListTypeImpl contextSignificanceListType = new ContextSignificanceListTypeImpl();
		return contextSignificanceListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextSignificanceType createContextSignificanceType() {
		ContextSignificanceTypeImpl contextSignificanceType = new ContextSignificanceTypeImpl();
		return contextSignificanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRCType createCRCType() {
		CRCTypeImpl crcType = new CRCTypeImpl();
		return crcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomStreamType createCustomStreamType() {
		CustomStreamTypeImpl customStreamType = new CustomStreamTypeImpl();
		return customStreamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEncodingType createDataEncodingType() {
		DataEncodingTypeImpl dataEncodingType = new DataEncodingTypeImpl();
		return dataEncodingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalRangeType createDecimalRangeType() {
		DecimalRangeTypeImpl decimalRangeType = new DecimalRangeTypeImpl();
		return decimalRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalValueType createDecimalValueType() {
		DecimalValueTypeImpl decimalValueType = new DecimalValueTypeImpl();
		return decimalValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultsType createDefaultsType() {
		DefaultsTypeImpl defaultsType = new DefaultsTypeImpl();
		return defaultsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionListType createDimensionListType() {
		DimensionListTypeImpl dimensionListType = new DimensionListTypeImpl();
		return dimensionListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionType createDimensionType() {
		DimensionTypeImpl dimensionType = new DimensionTypeImpl();
		return dimensionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteLookupListType createDiscreteLookupListType() {
		DiscreteLookupListTypeImpl discreteLookupListType = new DiscreteLookupListTypeImpl();
		return discreteLookupListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteLookupType createDiscreteLookupType() {
		DiscreteLookupTypeImpl discreteLookupType = new DiscreteLookupTypeImpl();
		return discreteLookupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicValueType createDynamicValueType() {
		DynamicValueTypeImpl dynamicValueType = new DynamicValueTypeImpl();
		return dynamicValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicValueType1 createDynamicValueType1() {
		DynamicValueType1Impl dynamicValueType1 = new DynamicValueType1Impl();
		return dynamicValueType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodingType1 createEncodingType1() {
		EncodingType1Impl encodingType1 = new EncodingType1Impl();
		return encodingType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryListType createEntryListType() {
		EntryListTypeImpl entryListType = new EntryListTypeImpl();
		return entryListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedDataType createEnumeratedDataType() {
		EnumeratedDataTypeImpl enumeratedDataType = new EnumeratedDataTypeImpl();
		return enumeratedDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationListType createEnumerationListType() {
		EnumerationListTypeImpl enumerationListType = new EnumerationListTypeImpl();
		return enumerationListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorDetectCorrectType createErrorDetectCorrectType() {
		ErrorDetectCorrectTypeImpl errorDetectCorrectType = new ErrorDetectCorrectTypeImpl();
		return errorDetectCorrectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionVerifierType createExecutionVerifierType() {
		ExecutionVerifierTypeImpl executionVerifierType = new ExecutionVerifierTypeImpl();
		return executionVerifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalAlgorithmSetType createExternalAlgorithmSetType() {
		ExternalAlgorithmSetTypeImpl externalAlgorithmSetType = new ExternalAlgorithmSetTypeImpl();
		return externalAlgorithmSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalAlgorithmType createExternalAlgorithmType() {
		ExternalAlgorithmTypeImpl externalAlgorithmType = new ExternalAlgorithmTypeImpl();
		return externalAlgorithmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedFrameStreamType createFixedFrameStreamType() {
		FixedFrameStreamTypeImpl fixedFrameStreamType = new FixedFrameStreamTypeImpl();
		return fixedFrameStreamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedFrameSyncStrategyType createFixedFrameSyncStrategyType() {
		FixedFrameSyncStrategyTypeImpl fixedFrameSyncStrategyType = new FixedFrameSyncStrategyTypeImpl();
		return fixedFrameSyncStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedValueEntryType createFixedValueEntryType() {
		FixedValueEntryTypeImpl fixedValueEntryType = new FixedValueEntryTypeImpl();
		return fixedValueEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagType createFlagType() {
		FlagTypeImpl flagType = new FlagTypeImpl();
		return flagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatArgumentTypeType createFloatArgumentTypeType() {
		FloatArgumentTypeTypeImpl floatArgumentTypeType = new FloatArgumentTypeTypeImpl();
		return floatArgumentTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatDataEncodingType createFloatDataEncodingType() {
		FloatDataEncodingTypeImpl floatDataEncodingType = new FloatDataEncodingTypeImpl();
		return floatDataEncodingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatDataType createFloatDataType() {
		FloatDataTypeImpl floatDataType = new FloatDataTypeImpl();
		return floatDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatParameterTypeType createFloatParameterTypeType() {
		FloatParameterTypeTypeImpl floatParameterTypeType = new FloatParameterTypeTypeImpl();
		return floatParameterTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameStreamType createFrameStreamType() {
		FrameStreamTypeImpl frameStreamType = new FrameStreamTypeImpl();
		return frameStreamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderType createHeaderType() {
		HeaderTypeImpl headerType = new HeaderTypeImpl();
		return headerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistorySetType createHistorySetType() {
		HistorySetTypeImpl historySetType = new HistorySetTypeImpl();
		return historySetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndirectParameterRefEntryType createIndirectParameterRefEntryType() {
		IndirectParameterRefEntryTypeImpl indirectParameterRefEntryType = new IndirectParameterRefEntryTypeImpl();
		return indirectParameterRefEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputAlgorithmType createInputAlgorithmType() {
		InputAlgorithmTypeImpl inputAlgorithmType = new InputAlgorithmTypeImpl();
		return inputAlgorithmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputAlgorithmType createInputOutputAlgorithmType() {
		InputOutputAlgorithmTypeImpl inputOutputAlgorithmType = new InputOutputAlgorithmTypeImpl();
		return inputOutputAlgorithmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputTriggerAlgorithmType createInputOutputTriggerAlgorithmType() {
		InputOutputTriggerAlgorithmTypeImpl inputOutputTriggerAlgorithmType = new InputOutputTriggerAlgorithmTypeImpl();
		return inputOutputTriggerAlgorithmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSetType createInputSetType() {
		InputSetTypeImpl inputSetType = new InputSetTypeImpl();
		return inputSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerArgumentTypeType createIntegerArgumentTypeType() {
		IntegerArgumentTypeTypeImpl integerArgumentTypeType = new IntegerArgumentTypeTypeImpl();
		return integerArgumentTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerDataEncodingType createIntegerDataEncodingType() {
		IntegerDataEncodingTypeImpl integerDataEncodingType = new IntegerDataEncodingTypeImpl();
		return integerDataEncodingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerDataType createIntegerDataType() {
		IntegerDataTypeImpl integerDataType = new IntegerDataTypeImpl();
		return integerDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerParameterTypeType createIntegerParameterTypeType() {
		IntegerParameterTypeTypeImpl integerParameterTypeType = new IntegerParameterTypeTypeImpl();
		return integerParameterTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerRangeType createIntegerRangeType() {
		IntegerRangeTypeImpl integerRangeType = new IntegerRangeTypeImpl();
		return integerRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueType createIntegerValueType() {
		IntegerValueTypeImpl integerValueType = new IntegerValueTypeImpl();
		return integerValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterlockType createInterlockType() {
		InterlockTypeImpl interlockType = new InterlockTypeImpl();
		return interlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeadingSizeType createLeadingSizeType() {
		LeadingSizeTypeImpl leadingSizeType = new LeadingSizeTypeImpl();
		return leadingSizeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearAdjustmentType createLinearAdjustmentType() {
		LinearAdjustmentTypeImpl linearAdjustmentType = new LinearAdjustmentTypeImpl();
		return linearAdjustmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearAdjustmentType1 createLinearAdjustmentType1() {
		LinearAdjustmentType1Impl linearAdjustmentType1 = new LinearAdjustmentType1Impl();
		return linearAdjustmentType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationInContainerInBitsType createLocationInContainerInBitsType() {
		LocationInContainerInBitsTypeImpl locationInContainerInBitsType = new LocationInContainerInBitsTypeImpl();
		return locationInContainerInBitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchCriteriaType createMatchCriteriaType() {
		MatchCriteriaTypeImpl matchCriteriaType = new MatchCriteriaTypeImpl();
		return matchCriteriaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathAlgorithmType createMathAlgorithmType() {
		MathAlgorithmTypeImpl mathAlgorithmType = new MathAlgorithmTypeImpl();
		return mathAlgorithmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathOperationType createMathOperationType() {
		MathOperationTypeImpl mathOperationType = new MathOperationTypeImpl();
		return mathOperationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathOperationType1 createMathOperationType1() {
		MathOperationType1Impl mathOperationType1 = new MathOperationType1Impl();
		return mathOperationType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageRefSetType createMessageRefSetType() {
		MessageRefSetTypeImpl messageRefSetType = new MessageRefSetTypeImpl();
		return messageRefSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageRefType createMessageRefType() {
		MessageRefTypeImpl messageRefType = new MessageRefTypeImpl();
		return messageRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSetType createMessageSetType() {
		MessageSetTypeImpl messageSetType = new MessageSetTypeImpl();
		return messageSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType createMessageType() {
		MessageTypeImpl messageType = new MessageTypeImpl();
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaCommandSetType createMetaCommandSetType() {
		MetaCommandSetTypeImpl metaCommandSetType = new MetaCommandSetTypeImpl();
		return metaCommandSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaCommandStepListType createMetaCommandStepListType() {
		MetaCommandStepListTypeImpl metaCommandStepListType = new MetaCommandStepListTypeImpl();
		return metaCommandStepListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaCommandStepType createMetaCommandStepType() {
		MetaCommandStepTypeImpl metaCommandStepType = new MetaCommandStepTypeImpl();
		return metaCommandStepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaCommandType createMetaCommandType() {
		MetaCommandTypeImpl metaCommandType = new MetaCommandTypeImpl();
		return metaCommandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameDescriptionType createNameDescriptionType() {
		NameDescriptionTypeImpl nameDescriptionType = new NameDescriptionTypeImpl();
		return nameDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteSetType createNoteSetType() {
		NoteSetTypeImpl noteSetType = new NoteSetTypeImpl();
		return noteSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberFormatType createNumberFormatType() {
		NumberFormatTypeImpl numberFormatType = new NumberFormatTypeImpl();
		return numberFormatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberToStringType createNumberToStringType() {
		NumberToStringTypeImpl numberToStringType = new NumberToStringTypeImpl();
		return numberToStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericAlarmConditionType createNumericAlarmConditionType() {
		NumericAlarmConditionTypeImpl numericAlarmConditionType = new NumericAlarmConditionTypeImpl();
		return numericAlarmConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericDataType createNumericDataType() {
		NumericDataTypeImpl numericDataType = new NumericDataTypeImpl();
		return numericDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffsetType createOffsetType() {
		OffsetTypeImpl offsetType = new OffsetTypeImpl();
		return offsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORedConditionsType createORedConditionsType() {
		ORedConditionsTypeImpl oRedConditionsType = new ORedConditionsTypeImpl();
		return oRedConditionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputParameterRefType createOutputParameterRefType() {
		OutputParameterRefTypeImpl outputParameterRefType = new OutputParameterRefTypeImpl();
		return outputParameterRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSetType createOutputSetType() {
		OutputSetTypeImpl outputSetType = new OutputSetTypeImpl();
		return outputSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterInstanceRefType createParameterInstanceRefType() {
		ParameterInstanceRefTypeImpl parameterInstanceRefType = new ParameterInstanceRefTypeImpl();
		return parameterInstanceRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterInstanceRefType1 createParameterInstanceRefType1() {
		ParameterInstanceRefType1Impl parameterInstanceRefType1 = new ParameterInstanceRefType1Impl();
		return parameterInstanceRefType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterPropertiesType createParameterPropertiesType() {
		ParameterPropertiesTypeImpl parameterPropertiesType = new ParameterPropertiesTypeImpl();
		return parameterPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterRefEntryType createParameterRefEntryType() {
		ParameterRefEntryTypeImpl parameterRefEntryType = new ParameterRefEntryTypeImpl();
		return parameterRefEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterRefType createParameterRefType() {
		ParameterRefTypeImpl parameterRefType = new ParameterRefTypeImpl();
		return parameterRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterRefType1 createParameterRefType1() {
		ParameterRefType1Impl parameterRefType1 = new ParameterRefType1Impl();
		return parameterRefType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSegmentRefEntryType createParameterSegmentRefEntryType() {
		ParameterSegmentRefEntryTypeImpl parameterSegmentRefEntryType = new ParameterSegmentRefEntryTypeImpl();
		return parameterSegmentRefEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSetType createParameterSetType() {
		ParameterSetTypeImpl parameterSetType = new ParameterSetTypeImpl();
		return parameterSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterToSetListType createParameterToSetListType() {
		ParameterToSetListTypeImpl parameterToSetListType = new ParameterToSetListTypeImpl();
		return parameterToSetListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterToSetType createParameterToSetType() {
		ParameterToSetTypeImpl parameterToSetType = new ParameterToSetTypeImpl();
		return parameterToSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterToSetType1 createParameterToSetType1() {
		ParameterToSetType1Impl parameterToSetType1 = new ParameterToSetType1Impl();
		return parameterToSetType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterTypeSetType createParameterTypeSetType() {
		ParameterTypeSetTypeImpl parameterTypeSetType = new ParameterTypeSetTypeImpl();
		return parameterTypeSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValueChangeType createParameterValueChangeType() {
		ParameterValueChangeTypeImpl parameterValueChangeType = new ParameterValueChangeTypeImpl();
		return parameterValueChangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParityType createParityType() {
		ParityTypeImpl parityType = new ParityTypeImpl();
		return parityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalAddressSetType createPhysicalAddressSetType() {
		PhysicalAddressSetTypeImpl physicalAddressSetType = new PhysicalAddressSetTypeImpl();
		return physicalAddressSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalAddressType createPhysicalAddressType() {
		PhysicalAddressTypeImpl physicalAddressType = new PhysicalAddressTypeImpl();
		return physicalAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalAddressType1 createPhysicalAddressType1() {
		PhysicalAddressType1Impl physicalAddressType1 = new PhysicalAddressType1Impl();
		return physicalAddressType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolynomialType createPolynomialType() {
		PolynomialTypeImpl polynomialType = new PolynomialTypeImpl();
		return polynomialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueuedVerifierType createQueuedVerifierType() {
		QueuedVerifierTypeImpl queuedVerifierType = new QueuedVerifierTypeImpl();
		return queuedVerifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeEnumerationType createRangeEnumerationType() {
		RangeEnumerationTypeImpl rangeEnumerationType = new RangeEnumerationTypeImpl();
		return rangeEnumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateInStreamSetType createRateInStreamSetType() {
		RateInStreamSetTypeImpl rateInStreamSetType = new RateInStreamSetTypeImpl();
		return rateInStreamSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateInStreamType createRateInStreamType() {
		RateInStreamTypeImpl rateInStreamType = new RateInStreamTypeImpl();
		return rateInStreamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateInStreamType1 createRateInStreamType1() {
		RateInStreamType1Impl rateInStreamType1 = new RateInStreamType1Impl();
		return rateInStreamType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceivedVerifierType createReceivedVerifierType() {
		ReceivedVerifierTypeImpl receivedVerifierType = new ReceivedVerifierTypeImpl();
		return receivedVerifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceTimeType createReferenceTimeType() {
		ReferenceTimeTypeImpl referenceTimeType = new ReferenceTimeTypeImpl();
		return referenceTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeTimeDataType createRelativeTimeDataType() {
		RelativeTimeDataTypeImpl relativeTimeDataType = new RelativeTimeDataTypeImpl();
		return relativeTimeDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatType createRepeatType() {
		RepeatTypeImpl repeatType = new RepeatTypeImpl();
		return repeatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionCriteriaType createRestrictionCriteriaType() {
		RestrictionCriteriaTypeImpl restrictionCriteriaType = new RestrictionCriteriaTypeImpl();
		return restrictionCriteriaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionCriteriaType1 createRestrictionCriteriaType1() {
		RestrictionCriteriaType1Impl restrictionCriteriaType1 = new RestrictionCriteriaType1Impl();
		return restrictionCriteriaType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SentFromRangeVerifierType createSentFromRangeVerifierType() {
		SentFromRangeVerifierTypeImpl sentFromRangeVerifierType = new SentFromRangeVerifierTypeImpl();
		return sentFromRangeVerifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceContainerType createSequenceContainerType() {
		SequenceContainerTypeImpl sequenceContainerType = new SequenceContainerTypeImpl();
		return sequenceContainerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceEntryType createSequenceEntryType() {
		SequenceEntryTypeImpl sequenceEntryType = new SequenceEntryTypeImpl();
		return sequenceEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRefType createServiceRefType() {
		ServiceRefTypeImpl serviceRefType = new ServiceRefTypeImpl();
		return serviceRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSetType createServiceSetType() {
		ServiceSetTypeImpl serviceSetType = new ServiceSetTypeImpl();
		return serviceSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceType() {
		ServiceTypeImpl serviceType = new ServiceTypeImpl();
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignificanceType createSignificanceType() {
		SignificanceTypeImpl significanceType = new SignificanceTypeImpl();
		return significanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAlgorithmType createSimpleAlgorithmType() {
		SimpleAlgorithmTypeImpl simpleAlgorithmType = new SimpleAlgorithmTypeImpl();
		return simpleAlgorithmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeInBitsType createSizeInBitsType() {
		SizeInBitsTypeImpl sizeInBitsType = new SizeInBitsTypeImpl();
		return sizeInBitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceSystemType createSpaceSystemType() {
		SpaceSystemTypeImpl spaceSystemType = new SpaceSystemTypeImpl();
		return spaceSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplineCalibratorType createSplineCalibratorType() {
		SplineCalibratorTypeImpl splineCalibratorType = new SplineCalibratorTypeImpl();
		return splineCalibratorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplinePointType createSplinePointType() {
		SplinePointTypeImpl splinePointType = new SplinePointTypeImpl();
		return splinePointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamRefType createStreamRefType() {
		StreamRefTypeImpl streamRefType = new StreamRefTypeImpl();
		return streamRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamSegmentEntryType createStreamSegmentEntryType() {
		StreamSegmentEntryTypeImpl streamSegmentEntryType = new StreamSegmentEntryTypeImpl();
		return streamSegmentEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamSetType createStreamSetType() {
		StreamSetTypeImpl streamSetType = new StreamSetTypeImpl();
		return streamSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringDataEncodingType createStringDataEncodingType() {
		StringDataEncodingTypeImpl stringDataEncodingType = new StringDataEncodingTypeImpl();
		return stringDataEncodingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringDataType createStringDataType() {
		StringDataTypeImpl stringDataType = new StringDataTypeImpl();
		return stringDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncPatternType createSyncPatternType() {
		SyncPatternTypeImpl syncPatternType = new SyncPatternTypeImpl();
		return syncPatternType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncPatternType1 createSyncPatternType1() {
		SyncPatternType1Impl syncPatternType1 = new SyncPatternType1Impl();
		return syncPatternType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncStrategyType createSyncStrategyType() {
		SyncStrategyTypeImpl syncStrategyType = new SyncStrategyTypeImpl();
		return syncStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncStrategyType1 createSyncStrategyType1() {
		SyncStrategyType1Impl syncStrategyType1 = new SyncStrategyType1Impl();
		return syncStrategyType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncStrategyType2 createSyncStrategyType2() {
		SyncStrategyType2Impl syncStrategyType2 = new SyncStrategyType2Impl();
		return syncStrategyType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelemetryMetaDataType createTelemetryMetaDataType() {
		TelemetryMetaDataTypeImpl telemetryMetaDataType = new TelemetryMetaDataTypeImpl();
		return telemetryMetaDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermType createTermType() {
		TermTypeImpl termType = new TermTypeImpl();
		return termType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAssociationType createTimeAssociationType() {
		TimeAssociationTypeImpl timeAssociationType = new TimeAssociationTypeImpl();
		return timeAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferredToRangeVerifierType createTransferredToRangeVerifierType() {
		TransferredToRangeVerifierTypeImpl transferredToRangeVerifierType = new TransferredToRangeVerifierTypeImpl();
		return transferredToRangeVerifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionConstraintListType createTransmissionConstraintListType() {
		TransmissionConstraintListTypeImpl transmissionConstraintListType = new TransmissionConstraintListTypeImpl();
		return transmissionConstraintListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionConstraintType createTransmissionConstraintType() {
		TransmissionConstraintTypeImpl transmissionConstraintType = new TransmissionConstraintTypeImpl();
		return transmissionConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerType createTriggerType() {
		TriggerTypeImpl triggerType = new TriggerTypeImpl();
		return triggerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSetType createUnitSetType() {
		UnitSetTypeImpl unitSetType = new UnitSetTypeImpl();
		return unitSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitType() {
		UnitTypeImpl unitType = new UnitTypeImpl();
		return unitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidRangeType createValidRangeType() {
		ValidRangeTypeImpl validRangeType = new ValidRangeTypeImpl();
		return validRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueEnumerationType createValueEnumerationType() {
		ValueEnumerationTypeImpl valueEnumerationType = new ValueEnumerationTypeImpl();
		return valueEnumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableFrameStreamType createVariableFrameStreamType() {
		VariableFrameStreamTypeImpl variableFrameStreamType = new VariableFrameStreamTypeImpl();
		return variableFrameStreamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifiersType createVerifiersType() {
		VerifiersTypeImpl verifiersType = new VerifiersTypeImpl();
		return verifiersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisType createBasisTypeFromString(EDataType eDataType, String initialValue) {
		BasisType result = BasisType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasisTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitOrderType createBitOrderTypeFromString(EDataType eDataType, String initialValue) {
		BitOrderType result = BitOrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBitOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterWidthType createCharacterWidthTypeFromString(EDataType eDataType, String initialValue) {
		CharacterWidthType result = CharacterWidthType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacterWidthTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperatorsType createComparisonOperatorsTypeFromString(EDataType eDataType, String initialValue) {
		ComparisonOperatorsType result = ComparisonOperatorsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOperatorsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsequenceLevelType createConsequenceLevelTypeFromString(EDataType eDataType, String initialValue) {
		ConsequenceLevelType result = ConsequenceLevelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsequenceLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceType createDataSourceTypeFromString(EDataType eDataType, String initialValue) {
		DataSourceType result = DataSourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodingType createEncodingTypeFromString(EDataType eDataType, String initialValue) {
		EncodingType result = EncodingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncodingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodingType2 createEncodingType2FromString(EDataType eDataType, String initialValue) {
		EncodingType2 result = EncodingType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncodingType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodingType3 createEncodingType3FromString(EDataType eDataType, String initialValue) {
		EncodingType3 result = EncodingType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncodingType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpochTypeMember1 createEpochTypeMember1FromString(EDataType eDataType, String initialValue) {
		EpochTypeMember1 result = EpochTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpochTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagBitTypeType createFlagBitTypeTypeFromString(EDataType eDataType, String initialValue) {
		FlagBitTypeType result = FlagBitTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagBitTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathOperatorsType createMathOperatorsTypeFromString(EDataType eDataType, String initialValue) {
		MathOperatorsType result = MathOperatorsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathOperatorsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotationType createNotationTypeFromString(EDataType eDataType, String initialValue) {
		NotationType result = NotationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmTypeType createPcmTypeTypeFromString(EDataType eDataType, String initialValue) {
		PcmTypeType result = PcmTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPcmTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadixType createRadixTypeFromString(EDataType eDataType, String initialValue) {
		RadixType result = RadixType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRadixTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceLocationType createReferenceLocationTypeFromString(EDataType eDataType, String initialValue) {
		ReferenceLocationType result = ReferenceLocationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceLocationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceTypeFromString(EDataType eDataType, String initialValue) {
		ReferenceType result = ReferenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType1 createReferenceType1FromString(EDataType eDataType, String initialValue) {
		ReferenceType1 result = ReferenceType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeInBitsType1 createSizeInBitsType1FromString(EDataType eDataType, String initialValue) {
		SizeInBitsType1 result = SizeInBitsType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeInBitsType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeInBitsType2 createSizeInBitsType2FromString(EDataType eDataType, String initialValue) {
		SizeInBitsType2 result = SizeInBitsType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeInBitsType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsType createUnitsTypeFromString(EDataType eDataType, String initialValue) {
		UnitsType result = UnitsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationStatusType createValidationStatusTypeFromString(EDataType eDataType, String initialValue) {
		ValidationStatusType result = ValidationStatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValidationStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationToWaitForType createVerificationToWaitForTypeFromString(EDataType eDataType, String initialValue) {
		VerificationToWaitForType result = VerificationToWaitForType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerificationToWaitForTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifierToTriggerOnType createVerifierToTriggerOnTypeFromString(EDataType eDataType, String initialValue) {
		VerifierToTriggerOnType result = VerifierToTriggerOnType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerifierToTriggerOnTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisType createBasisTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBasisTypeFromString(XtcePackage.eINSTANCE.getBasisType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasisTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBasisTypeToString(XtcePackage.eINSTANCE.getBasisType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBinaryTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitOrderType createBitOrderTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBitOrderTypeFromString(XtcePackage.eINSTANCE.getBitOrderType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBitOrderTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBitOrderTypeToString(XtcePackage.eINSTANCE.getBitOrderType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterWidthType createCharacterWidthTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCharacterWidthTypeFromString(XtcePackage.eINSTANCE.getCharacterWidthType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacterWidthTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCharacterWidthTypeToString(XtcePackage.eINSTANCE.getCharacterWidthType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperatorsType createComparisonOperatorsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createComparisonOperatorsTypeFromString(XtcePackage.eINSTANCE.getComparisonOperatorsType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOperatorsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertComparisonOperatorsTypeToString(XtcePackage.eINSTANCE.getComparisonOperatorsType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsequenceLevelType createConsequenceLevelTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createConsequenceLevelTypeFromString(XtcePackage.eINSTANCE.getConsequenceLevelType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsequenceLevelTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConsequenceLevelTypeToString(XtcePackage.eINSTANCE.getConsequenceLevelType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceType createDataSourceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDataSourceTypeFromString(XtcePackage.eINSTANCE.getDataSourceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSourceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataSourceTypeToString(XtcePackage.eINSTANCE.getDataSourceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodingType2 createEncodingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEncodingType2FromString(XtcePackage.eINSTANCE.getEncodingType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncodingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEncodingType2ToString(XtcePackage.eINSTANCE.getEncodingType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodingType createEncodingTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createEncodingTypeFromString(XtcePackage.eINSTANCE.getEncodingType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncodingTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertEncodingTypeToString(XtcePackage.eINSTANCE.getEncodingType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodingType3 createEncodingTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createEncodingType3FromString(XtcePackage.eINSTANCE.getEncodingType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncodingTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertEncodingType3ToString(XtcePackage.eINSTANCE.getEncodingType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createEpochTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createEpochTypeMember1FromString(XtcePackage.eINSTANCE.getEpochTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpochTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XtcePackage.eINSTANCE.getEpochTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertEpochTypeMember1ToString(XtcePackage.eINSTANCE.getEpochTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpochTypeMember1 createEpochTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createEpochTypeMember1FromString(XtcePackage.eINSTANCE.getEpochTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpochTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEpochTypeMember1ToString(XtcePackage.eINSTANCE.getEpochTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFixedIntegerValueTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createHexadecimalTypeFromString(XtcePackage.eINSTANCE.getHexadecimalType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createOctalTypeFromString(XtcePackage.eINSTANCE.getOctalType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createBinaryTypeFromString(XtcePackage.eINSTANCE.getBinaryType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFixedIntegerValueTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.INTEGER.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XtcePackage.eINSTANCE.getHexadecimalType().isInstance(instanceValue)) {
			try {
				String value = convertHexadecimalTypeToString(XtcePackage.eINSTANCE.getHexadecimalType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XtcePackage.eINSTANCE.getOctalType().isInstance(instanceValue)) {
			try {
				String value = convertOctalTypeToString(XtcePackage.eINSTANCE.getOctalType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XtcePackage.eINSTANCE.getBinaryType().isInstance(instanceValue)) {
			try {
				String value = convertBinaryTypeToString(XtcePackage.eINSTANCE.getBinaryType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagBitTypeType createFlagBitTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFlagBitTypeTypeFromString(XtcePackage.eINSTANCE.getFlagBitTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagBitTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFlagBitTypeTypeToString(XtcePackage.eINSTANCE.getFlagBitTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHexadecimalTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHexadecimalTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathOperatorsType createMathOperatorsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMathOperatorsTypeFromString(XtcePackage.eINSTANCE.getMathOperatorsType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathOperatorsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMathOperatorsTypeToString(XtcePackage.eINSTANCE.getMathOperatorsType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameReferenceTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameReferenceTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotationType createNotationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNotationTypeFromString(XtcePackage.eINSTANCE.getNotationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNotationTypeToString(XtcePackage.eINSTANCE.getNotationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOctalTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOctalTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmTypeType createPcmTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPcmTypeTypeFromString(XtcePackage.eINSTANCE.getPcmTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPcmTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPcmTypeTypeToString(XtcePackage.eINSTANCE.getPcmTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadixType createRadixTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRadixTypeFromString(XtcePackage.eINSTANCE.getRadixType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRadixTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRadixTypeToString(XtcePackage.eINSTANCE.getRadixType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceLocationType createReferenceLocationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReferenceLocationTypeFromString(XtcePackage.eINSTANCE.getReferenceLocationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceLocationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReferenceLocationTypeToString(XtcePackage.eINSTANCE.getReferenceLocationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReferenceTypeFromString(XtcePackage.eINSTANCE.getReferenceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReferenceTypeToString(XtcePackage.eINSTANCE.getReferenceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType1 createReferenceTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createReferenceType1FromString(XtcePackage.eINSTANCE.getReferenceType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertReferenceType1ToString(XtcePackage.eINSTANCE.getReferenceType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createRelativeTimeTypeFromString(EDataType eDataType, String initialValue) {
		return (Duration)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DURATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelativeTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DURATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeInBitsType1 createSizeInBitsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSizeInBitsType1FromString(XtcePackage.eINSTANCE.getSizeInBitsType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeInBitsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSizeInBitsType1ToString(XtcePackage.eINSTANCE.getSizeInBitsType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeInBitsType2 createSizeInBitsTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createSizeInBitsType2FromString(XtcePackage.eINSTANCE.getSizeInBitsType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeInBitsTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertSizeInBitsType2ToString(XtcePackage.eINSTANCE.getSizeInBitsType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(XtcePackage.eINSTANCE.getTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(XtcePackage.eINSTANCE.getTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsType createUnitsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitsTypeFromString(XtcePackage.eINSTANCE.getUnitsType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsTypeToString(XtcePackage.eINSTANCE.getUnitsType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationStatusType createValidationStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValidationStatusTypeFromString(XtcePackage.eINSTANCE.getValidationStatusType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValidationStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValidationStatusTypeToString(XtcePackage.eINSTANCE.getValidationStatusType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationToWaitForType createVerificationToWaitForTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVerificationToWaitForTypeFromString(XtcePackage.eINSTANCE.getVerificationToWaitForType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerificationToWaitForTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVerificationToWaitForTypeToString(XtcePackage.eINSTANCE.getVerificationToWaitForType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifierToTriggerOnType createVerifierToTriggerOnTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVerifierToTriggerOnTypeFromString(XtcePackage.eINSTANCE.getVerifierToTriggerOnType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerifierToTriggerOnTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVerifierToTriggerOnTypeToString(XtcePackage.eINSTANCE.getVerifierToTriggerOnType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtcePackage getXtcePackage() {
		return (XtcePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XtcePackage getPackage() {
		return XtcePackage.eINSTANCE;
	}

} //XtceFactoryImpl
