/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.util;

import java.math.BigInteger;

import java.util.Map;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.omg.space.xtce.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.omg.space.xtce.XtcePackage
 * @generated
 */
public class XtceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final XtceValidator INSTANCE = new XtceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.omg.space.xtce";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtceValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return XtcePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case XtcePackage.ABSOLUTE_TIME_DATA_TYPE:
				return validateAbsoluteTimeDataType((AbsoluteTimeDataType)value, diagnostics, context);
			case XtcePackage.ACCEPTED_VERIFIER_TYPE:
				return validateAcceptedVerifierType((AcceptedVerifierType)value, diagnostics, context);
			case XtcePackage.ALARM_CONDITIONS_TYPE:
				return validateAlarmConditionsType((AlarmConditionsType)value, diagnostics, context);
			case XtcePackage.ALARM_RANGES_TYPE:
				return validateAlarmRangesType((AlarmRangesType)value, diagnostics, context);
			case XtcePackage.ALGORITHM_SET_TYPE:
				return validateAlgorithmSetType((AlgorithmSetType)value, diagnostics, context);
			case XtcePackage.ALGORITHM_TEXT_TYPE:
				return validateAlgorithmTextType((AlgorithmTextType)value, diagnostics, context);
			case XtcePackage.ALIAS_SET_TYPE:
				return validateAliasSetType((AliasSetType)value, diagnostics, context);
			case XtcePackage.ALIAS_TYPE:
				return validateAliasType((AliasType)value, diagnostics, context);
			case XtcePackage.AN_DED_CONDITIONS_TYPE:
				return validateANDedConditionsType((ANDedConditionsType)value, diagnostics, context);
			case XtcePackage.ARGUMEMENT_ARRAY_TYPE_TYPE:
				return validateArgumementArrayTypeType((ArgumementArrayTypeType)value, diagnostics, context);
			case XtcePackage.ARGUMENT_ASSIGNMENT_LIST_TYPE:
				return validateArgumentAssignmentListType((ArgumentAssignmentListType)value, diagnostics, context);
			case XtcePackage.ARGUMENT_ASSIGNMENT_TYPE:
				return validateArgumentAssignmentType((ArgumentAssignmentType)value, diagnostics, context);
			case XtcePackage.ARGUMENT_LIST_TYPE:
				return validateArgumentListType((ArgumentListType)value, diagnostics, context);
			case XtcePackage.ARGUMENT_LIST_TYPE1:
				return validateArgumentListType1((ArgumentListType1)value, diagnostics, context);
			case XtcePackage.ARGUMENT_REF_ENTRY_TYPE:
				return validateArgumentRefEntryType((ArgumentRefEntryType)value, diagnostics, context);
			case XtcePackage.ARGUMENT_TYPE:
				return validateArgumentType((ArgumentType)value, diagnostics, context);
			case XtcePackage.ARGUMENT_TYPE1:
				return validateArgumentType1((ArgumentType1)value, diagnostics, context);
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE:
				return validateArgumentTypeSetType((ArgumentTypeSetType)value, diagnostics, context);
			case XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE:
				return validateArrayParameterRefEntryType((ArrayParameterRefEntryType)value, diagnostics, context);
			case XtcePackage.ARRAY_PARAMETER_TYPE_TYPE:
				return validateArrayParameterTypeType((ArrayParameterTypeType)value, diagnostics, context);
			case XtcePackage.AUTHOR_SET_TYPE:
				return validateAuthorSetType((AuthorSetType)value, diagnostics, context);
			case XtcePackage.AUTO_INVERT_TYPE:
				return validateAutoInvertType((AutoInvertType)value, diagnostics, context);
			case XtcePackage.BASE_CONTAINER_TYPE:
				return validateBaseContainerType((BaseContainerType)value, diagnostics, context);
			case XtcePackage.BASE_CONTAINER_TYPE1:
				return validateBaseContainerType1((BaseContainerType1)value, diagnostics, context);
			case XtcePackage.BASE_DATA_TYPE:
				return validateBaseDataType((BaseDataType)value, diagnostics, context);
			case XtcePackage.BASE_META_COMMAND_TYPE:
				return validateBaseMetaCommandType((BaseMetaCommandType)value, diagnostics, context);
			case XtcePackage.BASE_TIME_DATA_TYPE:
				return validateBaseTimeDataType((BaseTimeDataType)value, diagnostics, context);
			case XtcePackage.BINARY_DATA_ENCODING_TYPE:
				return validateBinaryDataEncodingType((BinaryDataEncodingType)value, diagnostics, context);
			case XtcePackage.BINARY_DATA_TYPE:
				return validateBinaryDataType((BinaryDataType)value, diagnostics, context);
			case XtcePackage.BLOCK_META_COMMAND_TYPE:
				return validateBlockMetaCommandType((BlockMetaCommandType)value, diagnostics, context);
			case XtcePackage.BOOLEAN_DATA_TYPE:
				return validateBooleanDataType((BooleanDataType)value, diagnostics, context);
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE:
				return validateBooleanExpressionType((BooleanExpressionType)value, diagnostics, context);
			case XtcePackage.BYTE_ORDER_TYPE:
				return validateByteOrderType((ByteOrderType)value, diagnostics, context);
			case XtcePackage.BYTE_TYPE:
				return validateByteType((ByteType)value, diagnostics, context);
			case XtcePackage.CALIBRATOR_TYPE:
				return validateCalibratorType((CalibratorType)value, diagnostics, context);
			case XtcePackage.CHANGE_TYPE:
				return validateChangeType((ChangeType)value, diagnostics, context);
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE:
				return validateCommandContainerEntryListType((CommandContainerEntryListType)value, diagnostics, context);
			case XtcePackage.COMMAND_CONTAINER_SET_TYPE:
				return validateCommandContainerSetType((CommandContainerSetType)value, diagnostics, context);
			case XtcePackage.COMMAND_CONTAINER_TYPE:
				return validateCommandContainerType((CommandContainerType)value, diagnostics, context);
			case XtcePackage.COMMAND_META_DATA_TYPE:
				return validateCommandMetaDataType((CommandMetaDataType)value, diagnostics, context);
			case XtcePackage.COMMAND_VERIFIER_TYPE:
				return validateCommandVerifierType((CommandVerifierType)value, diagnostics, context);
			case XtcePackage.COMPARISON_CHECK_TYPE:
				return validateComparisonCheckType((ComparisonCheckType)value, diagnostics, context);
			case XtcePackage.COMPARISON_LIST_TYPE:
				return validateComparisonListType((ComparisonListType)value, diagnostics, context);
			case XtcePackage.COMPARISON_LIST_TYPE1:
				return validateComparisonListType1((ComparisonListType1)value, diagnostics, context);
			case XtcePackage.COMPARISON_TYPE:
				return validateComparisonType((ComparisonType)value, diagnostics, context);
			case XtcePackage.COMPLETE_VERIFIER_TYPE:
				return validateCompleteVerifierType((CompleteVerifierType)value, diagnostics, context);
			case XtcePackage.CONDITIONAL_ALARM_TYPE:
				return validateConditionalAlarmType((ConditionalAlarmType)value, diagnostics, context);
			case XtcePackage.CONSTANT_TYPE:
				return validateConstantType((ConstantType)value, diagnostics, context);
			case XtcePackage.CONTAINER_REF_ENTRY_TYPE:
				return validateContainerRefEntryType((ContainerRefEntryType)value, diagnostics, context);
			case XtcePackage.CONTAINER_REF_SET_TYPE:
				return validateContainerRefSetType((ContainerRefSetType)value, diagnostics, context);
			case XtcePackage.CONTAINER_REF_TYPE:
				return validateContainerRefType((ContainerRefType)value, diagnostics, context);
			case XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE:
				return validateContainerSegmentRefEntryType((ContainerSegmentRefEntryType)value, diagnostics, context);
			case XtcePackage.CONTAINER_SET_TYPE:
				return validateContainerSetType((ContainerSetType)value, diagnostics, context);
			case XtcePackage.CONTAINER_TYPE:
				return validateContainerType((ContainerType)value, diagnostics, context);
			case XtcePackage.CONTEXT_ALARM_LIST_TYPE:
				return validateContextAlarmListType((ContextAlarmListType)value, diagnostics, context);
			case XtcePackage.CONTEXT_ALARM_LIST_TYPE1:
				return validateContextAlarmListType1((ContextAlarmListType1)value, diagnostics, context);
			case XtcePackage.CONTEXT_ALARM_LIST_TYPE2:
				return validateContextAlarmListType2((ContextAlarmListType2)value, diagnostics, context);
			case XtcePackage.CONTEXT_ALARM_LIST_TYPE3:
				return validateContextAlarmListType3((ContextAlarmListType3)value, diagnostics, context);
			case XtcePackage.CONTEXT_ALARM_TYPE:
				return validateContextAlarmType((ContextAlarmType)value, diagnostics, context);
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE:
				return validateContextCalibratorListType((ContextCalibratorListType)value, diagnostics, context);
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE1:
				return validateContextCalibratorListType1((ContextCalibratorListType1)value, diagnostics, context);
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE2:
				return validateContextCalibratorListType2((ContextCalibratorListType2)value, diagnostics, context);
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE3:
				return validateContextCalibratorListType3((ContextCalibratorListType3)value, diagnostics, context);
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE4:
				return validateContextCalibratorListType4((ContextCalibratorListType4)value, diagnostics, context);
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE:
				return validateContextCalibratorType((ContextCalibratorType)value, diagnostics, context);
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE1:
				return validateContextCalibratorType1((ContextCalibratorType1)value, diagnostics, context);
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE2:
				return validateContextCalibratorType2((ContextCalibratorType2)value, diagnostics, context);
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE3:
				return validateContextCalibratorType3((ContextCalibratorType3)value, diagnostics, context);
			case XtcePackage.CONTEXT_SIGNIFICANCE_LIST_TYPE:
				return validateContextSignificanceListType((ContextSignificanceListType)value, diagnostics, context);
			case XtcePackage.CONTEXT_SIGNIFICANCE_TYPE:
				return validateContextSignificanceType((ContextSignificanceType)value, diagnostics, context);
			case XtcePackage.CRC_TYPE:
				return validateCRCType((CRCType)value, diagnostics, context);
			case XtcePackage.CUSTOM_STREAM_TYPE:
				return validateCustomStreamType((CustomStreamType)value, diagnostics, context);
			case XtcePackage.DATA_ENCODING_TYPE:
				return validateDataEncodingType((DataEncodingType)value, diagnostics, context);
			case XtcePackage.DECIMAL_RANGE_TYPE:
				return validateDecimalRangeType((DecimalRangeType)value, diagnostics, context);
			case XtcePackage.DECIMAL_VALUE_TYPE:
				return validateDecimalValueType((DecimalValueType)value, diagnostics, context);
			case XtcePackage.DEFAULTS_TYPE:
				return validateDefaultsType((DefaultsType)value, diagnostics, context);
			case XtcePackage.DIMENSION_LIST_TYPE:
				return validateDimensionListType((DimensionListType)value, diagnostics, context);
			case XtcePackage.DIMENSION_TYPE:
				return validateDimensionType((DimensionType)value, diagnostics, context);
			case XtcePackage.DISCRETE_LOOKUP_LIST_TYPE:
				return validateDiscreteLookupListType((DiscreteLookupListType)value, diagnostics, context);
			case XtcePackage.DISCRETE_LOOKUP_TYPE:
				return validateDiscreteLookupType((DiscreteLookupType)value, diagnostics, context);
			case XtcePackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case XtcePackage.DYNAMIC_VALUE_TYPE:
				return validateDynamicValueType((DynamicValueType)value, diagnostics, context);
			case XtcePackage.DYNAMIC_VALUE_TYPE1:
				return validateDynamicValueType1((DynamicValueType1)value, diagnostics, context);
			case XtcePackage.ENCODING_TYPE1:
				return validateEncodingType1((EncodingType1)value, diagnostics, context);
			case XtcePackage.ENTRY_LIST_TYPE:
				return validateEntryListType((EntryListType)value, diagnostics, context);
			case XtcePackage.ENUMERATED_DATA_TYPE:
				return validateEnumeratedDataType((EnumeratedDataType)value, diagnostics, context);
			case XtcePackage.ENUMERATION_LIST_TYPE:
				return validateEnumerationListType((EnumerationListType)value, diagnostics, context);
			case XtcePackage.ERROR_DETECT_CORRECT_TYPE:
				return validateErrorDetectCorrectType((ErrorDetectCorrectType)value, diagnostics, context);
			case XtcePackage.EXECUTION_VERIFIER_TYPE:
				return validateExecutionVerifierType((ExecutionVerifierType)value, diagnostics, context);
			case XtcePackage.EXTERNAL_ALGORITHM_SET_TYPE:
				return validateExternalAlgorithmSetType((ExternalAlgorithmSetType)value, diagnostics, context);
			case XtcePackage.EXTERNAL_ALGORITHM_TYPE:
				return validateExternalAlgorithmType((ExternalAlgorithmType)value, diagnostics, context);
			case XtcePackage.FIXED_FRAME_STREAM_TYPE:
				return validateFixedFrameStreamType((FixedFrameStreamType)value, diagnostics, context);
			case XtcePackage.FIXED_FRAME_SYNC_STRATEGY_TYPE:
				return validateFixedFrameSyncStrategyType((FixedFrameSyncStrategyType)value, diagnostics, context);
			case XtcePackage.FIXED_VALUE_ENTRY_TYPE:
				return validateFixedValueEntryType((FixedValueEntryType)value, diagnostics, context);
			case XtcePackage.FLAG_TYPE:
				return validateFlagType((FlagType)value, diagnostics, context);
			case XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE:
				return validateFloatArgumentTypeType((FloatArgumentTypeType)value, diagnostics, context);
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE:
				return validateFloatDataEncodingType((FloatDataEncodingType)value, diagnostics, context);
			case XtcePackage.FLOAT_DATA_TYPE:
				return validateFloatDataType((FloatDataType)value, diagnostics, context);
			case XtcePackage.FLOAT_PARAMETER_TYPE_TYPE:
				return validateFloatParameterTypeType((FloatParameterTypeType)value, diagnostics, context);
			case XtcePackage.FRAME_STREAM_TYPE:
				return validateFrameStreamType((FrameStreamType)value, diagnostics, context);
			case XtcePackage.HEADER_TYPE:
				return validateHeaderType((HeaderType)value, diagnostics, context);
			case XtcePackage.HISTORY_SET_TYPE:
				return validateHistorySetType((HistorySetType)value, diagnostics, context);
			case XtcePackage.INDIRECT_PARAMETER_REF_ENTRY_TYPE:
				return validateIndirectParameterRefEntryType((IndirectParameterRefEntryType)value, diagnostics, context);
			case XtcePackage.INPUT_ALGORITHM_TYPE:
				return validateInputAlgorithmType((InputAlgorithmType)value, diagnostics, context);
			case XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE:
				return validateInputOutputAlgorithmType((InputOutputAlgorithmType)value, diagnostics, context);
			case XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE:
				return validateInputOutputTriggerAlgorithmType((InputOutputTriggerAlgorithmType)value, diagnostics, context);
			case XtcePackage.INPUT_SET_TYPE:
				return validateInputSetType((InputSetType)value, diagnostics, context);
			case XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE:
				return validateIntegerArgumentTypeType((IntegerArgumentTypeType)value, diagnostics, context);
			case XtcePackage.INTEGER_DATA_ENCODING_TYPE:
				return validateIntegerDataEncodingType((IntegerDataEncodingType)value, diagnostics, context);
			case XtcePackage.INTEGER_DATA_TYPE:
				return validateIntegerDataType((IntegerDataType)value, diagnostics, context);
			case XtcePackage.INTEGER_PARAMETER_TYPE_TYPE:
				return validateIntegerParameterTypeType((IntegerParameterTypeType)value, diagnostics, context);
			case XtcePackage.INTEGER_RANGE_TYPE:
				return validateIntegerRangeType((IntegerRangeType)value, diagnostics, context);
			case XtcePackage.INTEGER_VALUE_TYPE:
				return validateIntegerValueType((IntegerValueType)value, diagnostics, context);
			case XtcePackage.INTERLOCK_TYPE:
				return validateInterlockType((InterlockType)value, diagnostics, context);
			case XtcePackage.LEADING_SIZE_TYPE:
				return validateLeadingSizeType((LeadingSizeType)value, diagnostics, context);
			case XtcePackage.LINEAR_ADJUSTMENT_TYPE:
				return validateLinearAdjustmentType((LinearAdjustmentType)value, diagnostics, context);
			case XtcePackage.LINEAR_ADJUSTMENT_TYPE1:
				return validateLinearAdjustmentType1((LinearAdjustmentType1)value, diagnostics, context);
			case XtcePackage.LOCATION_IN_CONTAINER_IN_BITS_TYPE:
				return validateLocationInContainerInBitsType((LocationInContainerInBitsType)value, diagnostics, context);
			case XtcePackage.MATCH_CRITERIA_TYPE:
				return validateMatchCriteriaType((MatchCriteriaType)value, diagnostics, context);
			case XtcePackage.MATH_ALGORITHM_TYPE:
				return validateMathAlgorithmType((MathAlgorithmType)value, diagnostics, context);
			case XtcePackage.MATH_OPERATION_TYPE:
				return validateMathOperationType((MathOperationType)value, diagnostics, context);
			case XtcePackage.MATH_OPERATION_TYPE1:
				return validateMathOperationType1((MathOperationType1)value, diagnostics, context);
			case XtcePackage.MESSAGE_REF_SET_TYPE:
				return validateMessageRefSetType((MessageRefSetType)value, diagnostics, context);
			case XtcePackage.MESSAGE_REF_TYPE:
				return validateMessageRefType((MessageRefType)value, diagnostics, context);
			case XtcePackage.MESSAGE_SET_TYPE:
				return validateMessageSetType((MessageSetType)value, diagnostics, context);
			case XtcePackage.MESSAGE_TYPE:
				return validateMessageType((MessageType)value, diagnostics, context);
			case XtcePackage.META_COMMAND_SET_TYPE:
				return validateMetaCommandSetType((MetaCommandSetType)value, diagnostics, context);
			case XtcePackage.META_COMMAND_STEP_LIST_TYPE:
				return validateMetaCommandStepListType((MetaCommandStepListType)value, diagnostics, context);
			case XtcePackage.META_COMMAND_STEP_TYPE:
				return validateMetaCommandStepType((MetaCommandStepType)value, diagnostics, context);
			case XtcePackage.META_COMMAND_TYPE:
				return validateMetaCommandType((MetaCommandType)value, diagnostics, context);
			case XtcePackage.NAME_DESCRIPTION_TYPE:
				return validateNameDescriptionType((NameDescriptionType)value, diagnostics, context);
			case XtcePackage.NOTE_SET_TYPE:
				return validateNoteSetType((NoteSetType)value, diagnostics, context);
			case XtcePackage.NUMBER_FORMAT_TYPE:
				return validateNumberFormatType((NumberFormatType)value, diagnostics, context);
			case XtcePackage.NUMBER_TO_STRING_TYPE:
				return validateNumberToStringType((NumberToStringType)value, diagnostics, context);
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE:
				return validateNumericAlarmConditionType((NumericAlarmConditionType)value, diagnostics, context);
			case XtcePackage.NUMERIC_DATA_TYPE:
				return validateNumericDataType((NumericDataType)value, diagnostics, context);
			case XtcePackage.OFFSET_TYPE:
				return validateOffsetType((OffsetType)value, diagnostics, context);
			case XtcePackage.ORED_CONDITIONS_TYPE:
				return validateORedConditionsType((ORedConditionsType)value, diagnostics, context);
			case XtcePackage.OUTPUT_PARAMETER_REF_TYPE:
				return validateOutputParameterRefType((OutputParameterRefType)value, diagnostics, context);
			case XtcePackage.OUTPUT_SET_TYPE:
				return validateOutputSetType((OutputSetType)value, diagnostics, context);
			case XtcePackage.PARAMETER_INSTANCE_REF_TYPE:
				return validateParameterInstanceRefType((ParameterInstanceRefType)value, diagnostics, context);
			case XtcePackage.PARAMETER_INSTANCE_REF_TYPE1:
				return validateParameterInstanceRefType1((ParameterInstanceRefType1)value, diagnostics, context);
			case XtcePackage.PARAMETER_PROPERTIES_TYPE:
				return validateParameterPropertiesType((ParameterPropertiesType)value, diagnostics, context);
			case XtcePackage.PARAMETER_REF_ENTRY_TYPE:
				return validateParameterRefEntryType((ParameterRefEntryType)value, diagnostics, context);
			case XtcePackage.PARAMETER_REF_TYPE:
				return validateParameterRefType((ParameterRefType)value, diagnostics, context);
			case XtcePackage.PARAMETER_REF_TYPE1:
				return validateParameterRefType1((ParameterRefType1)value, diagnostics, context);
			case XtcePackage.PARAMETER_SEGMENT_REF_ENTRY_TYPE:
				return validateParameterSegmentRefEntryType((ParameterSegmentRefEntryType)value, diagnostics, context);
			case XtcePackage.PARAMETER_SET_TYPE:
				return validateParameterSetType((ParameterSetType)value, diagnostics, context);
			case XtcePackage.PARAMETER_TO_SET_LIST_TYPE:
				return validateParameterToSetListType((ParameterToSetListType)value, diagnostics, context);
			case XtcePackage.PARAMETER_TO_SET_TYPE:
				return validateParameterToSetType((ParameterToSetType)value, diagnostics, context);
			case XtcePackage.PARAMETER_TO_SET_TYPE1:
				return validateParameterToSetType1((ParameterToSetType1)value, diagnostics, context);
			case XtcePackage.PARAMETER_TYPE:
				return validateParameterType((ParameterType)value, diagnostics, context);
			case XtcePackage.PARAMETER_TYPE_SET_TYPE:
				return validateParameterTypeSetType((ParameterTypeSetType)value, diagnostics, context);
			case XtcePackage.PARAMETER_VALUE_CHANGE_TYPE:
				return validateParameterValueChangeType((ParameterValueChangeType)value, diagnostics, context);
			case XtcePackage.PARITY_TYPE:
				return validateParityType((ParityType)value, diagnostics, context);
			case XtcePackage.PCM_STREAM_TYPE:
				return validatePCMStreamType((PCMStreamType)value, diagnostics, context);
			case XtcePackage.PHYSICAL_ADDRESS_SET_TYPE:
				return validatePhysicalAddressSetType((PhysicalAddressSetType)value, diagnostics, context);
			case XtcePackage.PHYSICAL_ADDRESS_TYPE:
				return validatePhysicalAddressType((PhysicalAddressType)value, diagnostics, context);
			case XtcePackage.PHYSICAL_ADDRESS_TYPE1:
				return validatePhysicalAddressType1((PhysicalAddressType1)value, diagnostics, context);
			case XtcePackage.POLYNOMIAL_TYPE:
				return validatePolynomialType((PolynomialType)value, diagnostics, context);
			case XtcePackage.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			case XtcePackage.QUEUED_VERIFIER_TYPE:
				return validateQueuedVerifierType((QueuedVerifierType)value, diagnostics, context);
			case XtcePackage.RANGE_ENUMERATION_TYPE:
				return validateRangeEnumerationType((RangeEnumerationType)value, diagnostics, context);
			case XtcePackage.RATE_IN_STREAM_SET_TYPE:
				return validateRateInStreamSetType((RateInStreamSetType)value, diagnostics, context);
			case XtcePackage.RATE_IN_STREAM_TYPE:
				return validateRateInStreamType((RateInStreamType)value, diagnostics, context);
			case XtcePackage.RATE_IN_STREAM_TYPE1:
				return validateRateInStreamType1((RateInStreamType1)value, diagnostics, context);
			case XtcePackage.RECEIVED_VERIFIER_TYPE:
				return validateReceivedVerifierType((ReceivedVerifierType)value, diagnostics, context);
			case XtcePackage.REFERENCE_TIME_TYPE:
				return validateReferenceTimeType((ReferenceTimeType)value, diagnostics, context);
			case XtcePackage.RELATIVE_TIME_DATA_TYPE:
				return validateRelativeTimeDataType((RelativeTimeDataType)value, diagnostics, context);
			case XtcePackage.REPEAT_TYPE:
				return validateRepeatType((RepeatType)value, diagnostics, context);
			case XtcePackage.RESTRICTION_CRITERIA_TYPE:
				return validateRestrictionCriteriaType((RestrictionCriteriaType)value, diagnostics, context);
			case XtcePackage.RESTRICTION_CRITERIA_TYPE1:
				return validateRestrictionCriteriaType1((RestrictionCriteriaType1)value, diagnostics, context);
			case XtcePackage.SENT_FROM_RANGE_VERIFIER_TYPE:
				return validateSentFromRangeVerifierType((SentFromRangeVerifierType)value, diagnostics, context);
			case XtcePackage.SEQUENCE_CONTAINER_TYPE:
				return validateSequenceContainerType((SequenceContainerType)value, diagnostics, context);
			case XtcePackage.SEQUENCE_ENTRY_TYPE:
				return validateSequenceEntryType((SequenceEntryType)value, diagnostics, context);
			case XtcePackage.SERVICE_REF_TYPE:
				return validateServiceRefType((ServiceRefType)value, diagnostics, context);
			case XtcePackage.SERVICE_SET_TYPE:
				return validateServiceSetType((ServiceSetType)value, diagnostics, context);
			case XtcePackage.SERVICE_TYPE:
				return validateServiceType((ServiceType)value, diagnostics, context);
			case XtcePackage.SIGNIFICANCE_TYPE:
				return validateSignificanceType((SignificanceType)value, diagnostics, context);
			case XtcePackage.SIMPLE_ALGORITHM_TYPE:
				return validateSimpleAlgorithmType((SimpleAlgorithmType)value, diagnostics, context);
			case XtcePackage.SIZE_IN_BITS_TYPE:
				return validateSizeInBitsType((SizeInBitsType)value, diagnostics, context);
			case XtcePackage.SPACE_SYSTEM_TYPE:
				return validateSpaceSystemType((SpaceSystemType)value, diagnostics, context);
			case XtcePackage.SPLINE_CALIBRATOR_TYPE:
				return validateSplineCalibratorType((SplineCalibratorType)value, diagnostics, context);
			case XtcePackage.SPLINE_POINT_TYPE:
				return validateSplinePointType((SplinePointType)value, diagnostics, context);
			case XtcePackage.STREAM_REF_TYPE:
				return validateStreamRefType((StreamRefType)value, diagnostics, context);
			case XtcePackage.STREAM_SEGMENT_ENTRY_TYPE:
				return validateStreamSegmentEntryType((StreamSegmentEntryType)value, diagnostics, context);
			case XtcePackage.STREAM_SET_TYPE:
				return validateStreamSetType((StreamSetType)value, diagnostics, context);
			case XtcePackage.STRING_DATA_ENCODING_TYPE:
				return validateStringDataEncodingType((StringDataEncodingType)value, diagnostics, context);
			case XtcePackage.STRING_DATA_TYPE:
				return validateStringDataType((StringDataType)value, diagnostics, context);
			case XtcePackage.SYNC_PATTERN_TYPE:
				return validateSyncPatternType((SyncPatternType)value, diagnostics, context);
			case XtcePackage.SYNC_PATTERN_TYPE1:
				return validateSyncPatternType1((SyncPatternType1)value, diagnostics, context);
			case XtcePackage.SYNC_STRATEGY_TYPE:
				return validateSyncStrategyType((SyncStrategyType)value, diagnostics, context);
			case XtcePackage.SYNC_STRATEGY_TYPE1:
				return validateSyncStrategyType1((SyncStrategyType1)value, diagnostics, context);
			case XtcePackage.SYNC_STRATEGY_TYPE2:
				return validateSyncStrategyType2((SyncStrategyType2)value, diagnostics, context);
			case XtcePackage.TELEMETRY_META_DATA_TYPE:
				return validateTelemetryMetaDataType((TelemetryMetaDataType)value, diagnostics, context);
			case XtcePackage.TERM_TYPE:
				return validateTermType((TermType)value, diagnostics, context);
			case XtcePackage.TIME_ASSOCIATION_TYPE:
				return validateTimeAssociationType((TimeAssociationType)value, diagnostics, context);
			case XtcePackage.TRANSFERRED_TO_RANGE_VERIFIER_TYPE:
				return validateTransferredToRangeVerifierType((TransferredToRangeVerifierType)value, diagnostics, context);
			case XtcePackage.TRANSMISSION_CONSTRAINT_LIST_TYPE:
				return validateTransmissionConstraintListType((TransmissionConstraintListType)value, diagnostics, context);
			case XtcePackage.TRANSMISSION_CONSTRAINT_TYPE:
				return validateTransmissionConstraintType((TransmissionConstraintType)value, diagnostics, context);
			case XtcePackage.TRIGGER_TYPE:
				return validateTriggerType((TriggerType)value, diagnostics, context);
			case XtcePackage.UNIT_SET_TYPE:
				return validateUnitSetType((UnitSetType)value, diagnostics, context);
			case XtcePackage.UNIT_TYPE:
				return validateUnitType((UnitType)value, diagnostics, context);
			case XtcePackage.VALID_RANGE_TYPE:
				return validateValidRangeType((ValidRangeType)value, diagnostics, context);
			case XtcePackage.VALUE_ENUMERATION_TYPE:
				return validateValueEnumerationType((ValueEnumerationType)value, diagnostics, context);
			case XtcePackage.VARIABLE_FRAME_STREAM_TYPE:
				return validateVariableFrameStreamType((VariableFrameStreamType)value, diagnostics, context);
			case XtcePackage.VERIFIERS_TYPE:
				return validateVerifiersType((VerifiersType)value, diagnostics, context);
			case XtcePackage.BASIS_TYPE:
				return validateBasisType((BasisType)value, diagnostics, context);
			case XtcePackage.BIT_ORDER_TYPE:
				return validateBitOrderType((BitOrderType)value, diagnostics, context);
			case XtcePackage.CHARACTER_WIDTH_TYPE:
				return validateCharacterWidthType((CharacterWidthType)value, diagnostics, context);
			case XtcePackage.COMPARISON_OPERATORS_TYPE:
				return validateComparisonOperatorsType((ComparisonOperatorsType)value, diagnostics, context);
			case XtcePackage.CONSEQUENCE_LEVEL_TYPE:
				return validateConsequenceLevelType((ConsequenceLevelType)value, diagnostics, context);
			case XtcePackage.DATA_SOURCE_TYPE:
				return validateDataSourceType((DataSourceType)value, diagnostics, context);
			case XtcePackage.ENCODING_TYPE:
				return validateEncodingType((EncodingType)value, diagnostics, context);
			case XtcePackage.ENCODING_TYPE2:
				return validateEncodingType2((EncodingType2)value, diagnostics, context);
			case XtcePackage.ENCODING_TYPE3:
				return validateEncodingType3((EncodingType3)value, diagnostics, context);
			case XtcePackage.EPOCH_TYPE_MEMBER1:
				return validateEpochTypeMember1((EpochTypeMember1)value, diagnostics, context);
			case XtcePackage.FLAG_BIT_TYPE_TYPE:
				return validateFlagBitTypeType((FlagBitTypeType)value, diagnostics, context);
			case XtcePackage.MATH_OPERATORS_TYPE:
				return validateMathOperatorsType((MathOperatorsType)value, diagnostics, context);
			case XtcePackage.NOTATION_TYPE:
				return validateNotationType((NotationType)value, diagnostics, context);
			case XtcePackage.PCM_TYPE_TYPE:
				return validatePcmTypeType((PcmTypeType)value, diagnostics, context);
			case XtcePackage.RADIX_TYPE:
				return validateRadixType((RadixType)value, diagnostics, context);
			case XtcePackage.REFERENCE_LOCATION_TYPE:
				return validateReferenceLocationType((ReferenceLocationType)value, diagnostics, context);
			case XtcePackage.REFERENCE_TYPE:
				return validateReferenceType((ReferenceType)value, diagnostics, context);
			case XtcePackage.REFERENCE_TYPE1:
				return validateReferenceType1((ReferenceType1)value, diagnostics, context);
			case XtcePackage.SIZE_IN_BITS_TYPE1:
				return validateSizeInBitsType1((SizeInBitsType1)value, diagnostics, context);
			case XtcePackage.SIZE_IN_BITS_TYPE2:
				return validateSizeInBitsType2((SizeInBitsType2)value, diagnostics, context);
			case XtcePackage.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case XtcePackage.UNITS_TYPE:
				return validateUnitsType((UnitsType)value, diagnostics, context);
			case XtcePackage.VALIDATION_STATUS_TYPE:
				return validateValidationStatusType((ValidationStatusType)value, diagnostics, context);
			case XtcePackage.VERIFICATION_TO_WAIT_FOR_TYPE:
				return validateVerificationToWaitForType((VerificationToWaitForType)value, diagnostics, context);
			case XtcePackage.VERIFIER_TO_TRIGGER_ON_TYPE:
				return validateVerifierToTriggerOnType((VerifierToTriggerOnType)value, diagnostics, context);
			case XtcePackage.BASIS_TYPE_OBJECT:
				return validateBasisTypeObject((BasisType)value, diagnostics, context);
			case XtcePackage.BINARY_TYPE:
				return validateBinaryType((String)value, diagnostics, context);
			case XtcePackage.BIT_ORDER_TYPE_OBJECT:
				return validateBitOrderTypeObject((BitOrderType)value, diagnostics, context);
			case XtcePackage.CHARACTER_WIDTH_TYPE_OBJECT:
				return validateCharacterWidthTypeObject((CharacterWidthType)value, diagnostics, context);
			case XtcePackage.COMPARISON_OPERATORS_TYPE_OBJECT:
				return validateComparisonOperatorsTypeObject((ComparisonOperatorsType)value, diagnostics, context);
			case XtcePackage.CONSEQUENCE_LEVEL_TYPE_OBJECT:
				return validateConsequenceLevelTypeObject((ConsequenceLevelType)value, diagnostics, context);
			case XtcePackage.DATA_SOURCE_TYPE_OBJECT:
				return validateDataSourceTypeObject((DataSourceType)value, diagnostics, context);
			case XtcePackage.ENCODING_TYPE_OBJECT:
				return validateEncodingTypeObject((EncodingType2)value, diagnostics, context);
			case XtcePackage.ENCODING_TYPE_OBJECT1:
				return validateEncodingTypeObject1((EncodingType)value, diagnostics, context);
			case XtcePackage.ENCODING_TYPE_OBJECT2:
				return validateEncodingTypeObject2((EncodingType3)value, diagnostics, context);
			case XtcePackage.EPOCH_TYPE:
				return validateEpochType(value, diagnostics, context);
			case XtcePackage.EPOCH_TYPE_MEMBER1_OBJECT:
				return validateEpochTypeMember1Object((EpochTypeMember1)value, diagnostics, context);
			case XtcePackage.FIXED_INTEGER_VALUE_TYPE:
				return validateFixedIntegerValueType(value, diagnostics, context);
			case XtcePackage.FLAG_BIT_TYPE_TYPE_OBJECT:
				return validateFlagBitTypeTypeObject((FlagBitTypeType)value, diagnostics, context);
			case XtcePackage.HEXADECIMAL_TYPE:
				return validateHexadecimalType((String)value, diagnostics, context);
			case XtcePackage.MATH_OPERATORS_TYPE_OBJECT:
				return validateMathOperatorsTypeObject((MathOperatorsType)value, diagnostics, context);
			case XtcePackage.NAME_REFERENCE_TYPE:
				return validateNameReferenceType((String)value, diagnostics, context);
			case XtcePackage.NAME_TYPE:
				return validateNameType((String)value, diagnostics, context);
			case XtcePackage.NOTATION_TYPE_OBJECT:
				return validateNotationTypeObject((NotationType)value, diagnostics, context);
			case XtcePackage.OCTAL_TYPE:
				return validateOctalType((String)value, diagnostics, context);
			case XtcePackage.PCM_TYPE_TYPE_OBJECT:
				return validatePcmTypeTypeObject((PcmTypeType)value, diagnostics, context);
			case XtcePackage.RADIX_TYPE_OBJECT:
				return validateRadixTypeObject((RadixType)value, diagnostics, context);
			case XtcePackage.REFERENCE_LOCATION_TYPE_OBJECT:
				return validateReferenceLocationTypeObject((ReferenceLocationType)value, diagnostics, context);
			case XtcePackage.REFERENCE_TYPE_OBJECT:
				return validateReferenceTypeObject((ReferenceType)value, diagnostics, context);
			case XtcePackage.REFERENCE_TYPE_OBJECT1:
				return validateReferenceTypeObject1((ReferenceType1)value, diagnostics, context);
			case XtcePackage.RELATIVE_TIME_TYPE:
				return validateRelativeTimeType((Duration)value, diagnostics, context);
			case XtcePackage.SIZE_IN_BITS_TYPE_OBJECT:
				return validateSizeInBitsTypeObject((SizeInBitsType1)value, diagnostics, context);
			case XtcePackage.SIZE_IN_BITS_TYPE_OBJECT1:
				return validateSizeInBitsTypeObject1((SizeInBitsType2)value, diagnostics, context);
			case XtcePackage.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType)value, diagnostics, context);
			case XtcePackage.UNITS_TYPE_OBJECT:
				return validateUnitsTypeObject((UnitsType)value, diagnostics, context);
			case XtcePackage.VALIDATION_STATUS_TYPE_OBJECT:
				return validateValidationStatusTypeObject((ValidationStatusType)value, diagnostics, context);
			case XtcePackage.VERIFICATION_TO_WAIT_FOR_TYPE_OBJECT:
				return validateVerificationToWaitForTypeObject((VerificationToWaitForType)value, diagnostics, context);
			case XtcePackage.VERIFIER_TO_TRIGGER_ON_TYPE_OBJECT:
				return validateVerifierToTriggerOnTypeObject((VerifierToTriggerOnType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbsoluteTimeDataType(AbsoluteTimeDataType absoluteTimeDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(absoluteTimeDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptedVerifierType(AcceptedVerifierType acceptedVerifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(acceptedVerifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlarmConditionsType(AlarmConditionsType alarmConditionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alarmConditionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlarmRangesType(AlarmRangesType alarmRangesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alarmRangesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgorithmSetType(AlgorithmSetType algorithmSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(algorithmSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgorithmTextType(AlgorithmTextType algorithmTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(algorithmTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAliasSetType(AliasSetType aliasSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aliasSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAliasType(AliasType aliasType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aliasType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateANDedConditionsType(ANDedConditionsType anDedConditionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anDedConditionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgumementArrayTypeType(ArgumementArrayTypeType argumementArrayTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argumementArrayTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgumentAssignmentListType(ArgumentAssignmentListType argumentAssignmentListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argumentAssignmentListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgumentAssignmentType(ArgumentAssignmentType argumentAssignmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argumentAssignmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgumentListType(ArgumentListType argumentListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argumentListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgumentListType1(ArgumentListType1 argumentListType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argumentListType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgumentRefEntryType(ArgumentRefEntryType argumentRefEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argumentRefEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgumentType(ArgumentType argumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argumentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgumentType1(ArgumentType1 argumentType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argumentType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgumentTypeSetType(ArgumentTypeSetType argumentTypeSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argumentTypeSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayParameterRefEntryType(ArrayParameterRefEntryType arrayParameterRefEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayParameterRefEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayParameterTypeType(ArrayParameterTypeType arrayParameterTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayParameterTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorSetType(AuthorSetType authorSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authorSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutoInvertType(AutoInvertType autoInvertType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(autoInvertType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseContainerType(BaseContainerType baseContainerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseContainerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseContainerType1(BaseContainerType1 baseContainerType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseContainerType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseDataType(BaseDataType baseDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseMetaCommandType(BaseMetaCommandType baseMetaCommandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseMetaCommandType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseTimeDataType(BaseTimeDataType baseTimeDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseTimeDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryDataEncodingType(BinaryDataEncodingType binaryDataEncodingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryDataEncodingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryDataType(BinaryDataType binaryDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlockMetaCommandType(BlockMetaCommandType blockMetaCommandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(blockMetaCommandType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanDataType(BooleanDataType booleanDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanExpressionType(BooleanExpressionType booleanExpressionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanExpressionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateByteOrderType(ByteOrderType byteOrderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(byteOrderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateByteType(ByteType byteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(byteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalibratorType(CalibratorType calibratorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calibratorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeType(ChangeType changeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandContainerEntryListType(CommandContainerEntryListType commandContainerEntryListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commandContainerEntryListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandContainerSetType(CommandContainerSetType commandContainerSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commandContainerSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandContainerType(CommandContainerType commandContainerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commandContainerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandMetaDataType(CommandMetaDataType commandMetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commandMetaDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandVerifierType(CommandVerifierType commandVerifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commandVerifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonCheckType(ComparisonCheckType comparisonCheckType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comparisonCheckType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonListType(ComparisonListType comparisonListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comparisonListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonListType1(ComparisonListType1 comparisonListType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comparisonListType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonType(ComparisonType comparisonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comparisonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompleteVerifierType(CompleteVerifierType completeVerifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(completeVerifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalAlarmType(ConditionalAlarmType conditionalAlarmType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionalAlarmType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantType(ConstantType constantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constantType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainerRefEntryType(ContainerRefEntryType containerRefEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containerRefEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainerRefSetType(ContainerRefSetType containerRefSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containerRefSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainerRefType(ContainerRefType containerRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containerRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainerSegmentRefEntryType(ContainerSegmentRefEntryType containerSegmentRefEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containerSegmentRefEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainerSetType(ContainerSetType containerSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containerSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainerType(ContainerType containerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextAlarmListType(ContextAlarmListType contextAlarmListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextAlarmListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextAlarmListType1(ContextAlarmListType1 contextAlarmListType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextAlarmListType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextAlarmListType2(ContextAlarmListType2 contextAlarmListType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextAlarmListType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextAlarmListType3(ContextAlarmListType3 contextAlarmListType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextAlarmListType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextAlarmType(ContextAlarmType contextAlarmType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextAlarmType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextCalibratorListType(ContextCalibratorListType contextCalibratorListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextCalibratorListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextCalibratorListType1(ContextCalibratorListType1 contextCalibratorListType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextCalibratorListType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextCalibratorListType2(ContextCalibratorListType2 contextCalibratorListType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextCalibratorListType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextCalibratorListType3(ContextCalibratorListType3 contextCalibratorListType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextCalibratorListType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextCalibratorListType4(ContextCalibratorListType4 contextCalibratorListType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextCalibratorListType4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextCalibratorType(ContextCalibratorType contextCalibratorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextCalibratorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextCalibratorType1(ContextCalibratorType1 contextCalibratorType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextCalibratorType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextCalibratorType2(ContextCalibratorType2 contextCalibratorType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextCalibratorType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextCalibratorType3(ContextCalibratorType3 contextCalibratorType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextCalibratorType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextSignificanceListType(ContextSignificanceListType contextSignificanceListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextSignificanceListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextSignificanceType(ContextSignificanceType contextSignificanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextSignificanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCRCType(CRCType crcType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crcType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomStreamType(CustomStreamType customStreamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customStreamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataEncodingType(DataEncodingType dataEncodingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataEncodingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalRangeType(DecimalRangeType decimalRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decimalRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalValueType(DecimalValueType decimalValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decimalValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultsType(DefaultsType defaultsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(defaultsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionListType(DimensionListType dimensionListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimensionListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionType(DimensionType dimensionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimensionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteLookupListType(DiscreteLookupListType discreteLookupListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discreteLookupListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteLookupType(DiscreteLookupType discreteLookupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discreteLookupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicValueType(DynamicValueType dynamicValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dynamicValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicValueType1(DynamicValueType1 dynamicValueType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dynamicValueType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncodingType1(EncodingType1 encodingType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encodingType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryListType(EntryListType entryListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeratedDataType(EnumeratedDataType enumeratedDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumeratedDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationListType(EnumerationListType enumerationListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorDetectCorrectType(ErrorDetectCorrectType errorDetectCorrectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(errorDetectCorrectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionVerifierType(ExecutionVerifierType executionVerifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executionVerifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalAlgorithmSetType(ExternalAlgorithmSetType externalAlgorithmSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalAlgorithmSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalAlgorithmType(ExternalAlgorithmType externalAlgorithmType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalAlgorithmType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedFrameStreamType(FixedFrameStreamType fixedFrameStreamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedFrameStreamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedFrameSyncStrategyType(FixedFrameSyncStrategyType fixedFrameSyncStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedFrameSyncStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedValueEntryType(FixedValueEntryType fixedValueEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedValueEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagType(FlagType flagType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flagType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatArgumentTypeType(FloatArgumentTypeType floatArgumentTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(floatArgumentTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatDataEncodingType(FloatDataEncodingType floatDataEncodingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(floatDataEncodingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatDataType(FloatDataType floatDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(floatDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatParameterTypeType(FloatParameterTypeType floatParameterTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(floatParameterTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameStreamType(FrameStreamType frameStreamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(frameStreamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeaderType(HeaderType headerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(headerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistorySetType(HistorySetType historySetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(historySetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndirectParameterRefEntryType(IndirectParameterRefEntryType indirectParameterRefEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indirectParameterRefEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputAlgorithmType(InputAlgorithmType inputAlgorithmType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputAlgorithmType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputOutputAlgorithmType(InputOutputAlgorithmType inputOutputAlgorithmType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputOutputAlgorithmType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputOutputTriggerAlgorithmType(InputOutputTriggerAlgorithmType inputOutputTriggerAlgorithmType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputOutputTriggerAlgorithmType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputSetType(InputSetType inputSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerArgumentTypeType(IntegerArgumentTypeType integerArgumentTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerArgumentTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerDataEncodingType(IntegerDataEncodingType integerDataEncodingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerDataEncodingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerDataType(IntegerDataType integerDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerParameterTypeType(IntegerParameterTypeType integerParameterTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerParameterTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerRangeType(IntegerRangeType integerRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerValueType(IntegerValueType integerValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterlockType(InterlockType interlockType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interlockType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeadingSizeType(LeadingSizeType leadingSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leadingSizeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinearAdjustmentType(LinearAdjustmentType linearAdjustmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linearAdjustmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinearAdjustmentType1(LinearAdjustmentType1 linearAdjustmentType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linearAdjustmentType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationInContainerInBitsType(LocationInContainerInBitsType locationInContainerInBitsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationInContainerInBitsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatchCriteriaType(MatchCriteriaType matchCriteriaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(matchCriteriaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathAlgorithmType(MathAlgorithmType mathAlgorithmType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mathAlgorithmType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathOperationType(MathOperationType mathOperationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mathOperationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathOperationType1(MathOperationType1 mathOperationType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mathOperationType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageRefSetType(MessageRefSetType messageRefSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageRefSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageRefType(MessageRefType messageRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSetType(MessageSetType messageSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageType(MessageType messageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaCommandSetType(MetaCommandSetType metaCommandSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metaCommandSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaCommandStepListType(MetaCommandStepListType metaCommandStepListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metaCommandStepListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaCommandStepType(MetaCommandStepType metaCommandStepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metaCommandStepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaCommandType(MetaCommandType metaCommandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metaCommandType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameDescriptionType(NameDescriptionType nameDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameDescriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteSetType(NoteSetType noteSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noteSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberFormatType(NumberFormatType numberFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberFormatType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberToStringType(NumberToStringType numberToStringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberToStringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericAlarmConditionType(NumericAlarmConditionType numericAlarmConditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericAlarmConditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericDataType(NumericDataType numericDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOffsetType(OffsetType offsetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(offsetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateORedConditionsType(ORedConditionsType oRedConditionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oRedConditionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputParameterRefType(OutputParameterRefType outputParameterRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputParameterRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputSetType(OutputSetType outputSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterInstanceRefType(ParameterInstanceRefType parameterInstanceRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterInstanceRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterInstanceRefType1(ParameterInstanceRefType1 parameterInstanceRefType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterInstanceRefType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterPropertiesType(ParameterPropertiesType parameterPropertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterRefEntryType(ParameterRefEntryType parameterRefEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterRefEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterRefType(ParameterRefType parameterRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterRefType1(ParameterRefType1 parameterRefType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterRefType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterSegmentRefEntryType(ParameterSegmentRefEntryType parameterSegmentRefEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterSegmentRefEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterSetType(ParameterSetType parameterSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterToSetListType(ParameterToSetListType parameterToSetListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterToSetListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterToSetType(ParameterToSetType parameterToSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterToSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterToSetType1(ParameterToSetType1 parameterToSetType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterToSetType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType(ParameterType parameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterTypeSetType(ParameterTypeSetType parameterTypeSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterTypeSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterValueChangeType(ParameterValueChangeType parameterValueChangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterValueChangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParityType(ParityType parityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCMStreamType(PCMStreamType pcmStreamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pcmStreamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalAddressSetType(PhysicalAddressSetType physicalAddressSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(physicalAddressSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalAddressType(PhysicalAddressType physicalAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(physicalAddressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalAddressType1(PhysicalAddressType1 physicalAddressType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(physicalAddressType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolynomialType(PolynomialType polynomialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polynomialType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueuedVerifierType(QueuedVerifierType queuedVerifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queuedVerifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeEnumerationType(RangeEnumerationType rangeEnumerationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangeEnumerationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRateInStreamSetType(RateInStreamSetType rateInStreamSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rateInStreamSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRateInStreamType(RateInStreamType rateInStreamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rateInStreamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRateInStreamType1(RateInStreamType1 rateInStreamType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rateInStreamType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceivedVerifierType(ReceivedVerifierType receivedVerifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(receivedVerifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceTimeType(ReferenceTimeType referenceTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeTimeDataType(RelativeTimeDataType relativeTimeDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relativeTimeDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeatType(RepeatType repeatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repeatType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestrictionCriteriaType(RestrictionCriteriaType restrictionCriteriaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restrictionCriteriaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestrictionCriteriaType1(RestrictionCriteriaType1 restrictionCriteriaType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restrictionCriteriaType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSentFromRangeVerifierType(SentFromRangeVerifierType sentFromRangeVerifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sentFromRangeVerifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceContainerType(SequenceContainerType sequenceContainerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceContainerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceEntryType(SequenceEntryType sequenceEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceRefType(ServiceRefType serviceRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceSetType(ServiceSetType serviceSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceType(ServiceType serviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignificanceType(SignificanceType significanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(significanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleAlgorithmType(SimpleAlgorithmType simpleAlgorithmType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleAlgorithmType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizeInBitsType(SizeInBitsType sizeInBitsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sizeInBitsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpaceSystemType(SpaceSystemType spaceSystemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spaceSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplineCalibratorType(SplineCalibratorType splineCalibratorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(splineCalibratorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplinePointType(SplinePointType splinePointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(splinePointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreamRefType(StreamRefType streamRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(streamRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreamSegmentEntryType(StreamSegmentEntryType streamSegmentEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(streamSegmentEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreamSetType(StreamSetType streamSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(streamSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringDataEncodingType(StringDataEncodingType stringDataEncodingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringDataEncodingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringDataType(StringDataType stringDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSyncPatternType(SyncPatternType syncPatternType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(syncPatternType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSyncPatternType1(SyncPatternType1 syncPatternType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(syncPatternType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSyncStrategyType(SyncStrategyType syncStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(syncStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSyncStrategyType1(SyncStrategyType1 syncStrategyType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(syncStrategyType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSyncStrategyType2(SyncStrategyType2 syncStrategyType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(syncStrategyType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelemetryMetaDataType(TelemetryMetaDataType telemetryMetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telemetryMetaDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTermType(TermType termType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(termType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeAssociationType(TimeAssociationType timeAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferredToRangeVerifierType(TransferredToRangeVerifierType transferredToRangeVerifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transferredToRangeVerifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmissionConstraintListType(TransmissionConstraintListType transmissionConstraintListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transmissionConstraintListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmissionConstraintType(TransmissionConstraintType transmissionConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transmissionConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerType(TriggerType triggerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitSetType(UnitSetType unitSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitType(UnitType unitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidRangeType(ValidRangeType validRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(validRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueEnumerationType(ValueEnumerationType valueEnumerationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueEnumerationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableFrameStreamType(VariableFrameStreamType variableFrameStreamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableFrameStreamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerifiersType(VerifiersType verifiersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verifiersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasisType(BasisType basisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitOrderType(BitOrderType bitOrderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterWidthType(CharacterWidthType characterWidthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonOperatorsType(ComparisonOperatorsType comparisonOperatorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsequenceLevelType(ConsequenceLevelType consequenceLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSourceType(DataSourceType dataSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncodingType(EncodingType encodingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncodingType2(EncodingType2 encodingType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncodingType3(EncodingType3 encodingType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpochTypeMember1(EpochTypeMember1 epochTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagBitTypeType(FlagBitTypeType flagBitTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathOperatorsType(MathOperatorsType mathOperatorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotationType(NotationType notationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePcmTypeType(PcmTypeType pcmTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadixType(RadixType radixType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceLocationType(ReferenceLocationType referenceLocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceType(ReferenceType referenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceType1(ReferenceType1 referenceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizeInBitsType1(SizeInBitsType1 sizeInBitsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizeInBitsType2(SizeInBitsType2 sizeInBitsType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsType(UnitsType unitsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidationStatusType(ValidationStatusType validationStatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerificationToWaitForType(VerificationToWaitForType verificationToWaitForType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerifierToTriggerOnType(VerifierToTriggerOnType verifierToTriggerOnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasisTypeObject(BasisType basisTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryType(String binaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitOrderTypeObject(BitOrderType bitOrderTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterWidthTypeObject(CharacterWidthType characterWidthTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonOperatorsTypeObject(ComparisonOperatorsType comparisonOperatorsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsequenceLevelTypeObject(ConsequenceLevelType consequenceLevelTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSourceTypeObject(DataSourceType dataSourceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncodingTypeObject(EncodingType2 encodingTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncodingTypeObject1(EncodingType encodingTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncodingTypeObject2(EncodingType3 encodingTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpochType(Object epochType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEpochType_MemberTypes(epochType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Epoch Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpochType_MemberTypes(Object epochType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.DATE.isInstance(epochType)) {
				if (xmlTypeValidator.validateDate((XMLGregorianCalendar)epochType, tempDiagnostics, context)) return true;
			}
			if (XtcePackage.eINSTANCE.getEpochTypeMember1().isInstance(epochType)) {
				if (validateEpochTypeMember1((EpochTypeMember1)epochType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.DATE.isInstance(epochType)) {
				if (xmlTypeValidator.validateDate((XMLGregorianCalendar)epochType, null, context)) return true;
			}
			if (XtcePackage.eINSTANCE.getEpochTypeMember1().isInstance(epochType)) {
				if (validateEpochTypeMember1((EpochTypeMember1)epochType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpochTypeMember1Object(EpochTypeMember1 epochTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedIntegerValueType(Object fixedIntegerValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFixedIntegerValueType_MemberTypes(fixedIntegerValueType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Fixed Integer Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedIntegerValueType_MemberTypes(Object fixedIntegerValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.INTEGER.isInstance(fixedIntegerValueType)) {
				if (xmlTypeValidator.validateInteger((BigInteger)fixedIntegerValueType, tempDiagnostics, context)) return true;
			}
			if (XtcePackage.eINSTANCE.getHexadecimalType().isInstance(fixedIntegerValueType)) {
				if (validateHexadecimalType((String)fixedIntegerValueType, tempDiagnostics, context)) return true;
			}
			if (XtcePackage.eINSTANCE.getOctalType().isInstance(fixedIntegerValueType)) {
				if (validateOctalType((String)fixedIntegerValueType, tempDiagnostics, context)) return true;
			}
			if (XtcePackage.eINSTANCE.getBinaryType().isInstance(fixedIntegerValueType)) {
				if (validateBinaryType((String)fixedIntegerValueType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.INTEGER.isInstance(fixedIntegerValueType)) {
				if (xmlTypeValidator.validateInteger((BigInteger)fixedIntegerValueType, null, context)) return true;
			}
			if (XtcePackage.eINSTANCE.getHexadecimalType().isInstance(fixedIntegerValueType)) {
				if (validateHexadecimalType((String)fixedIntegerValueType, null, context)) return true;
			}
			if (XtcePackage.eINSTANCE.getOctalType().isInstance(fixedIntegerValueType)) {
				if (validateOctalType((String)fixedIntegerValueType, null, context)) return true;
			}
			if (XtcePackage.eINSTANCE.getBinaryType().isInstance(fixedIntegerValueType)) {
				if (validateBinaryType((String)fixedIntegerValueType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagBitTypeTypeObject(FlagBitTypeType flagBitTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHexadecimalType(String hexadecimalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathOperatorsTypeObject(MathOperatorsType mathOperatorsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameReferenceType(String nameReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType(String nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotationTypeObject(NotationType notationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOctalType(String octalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePcmTypeTypeObject(PcmTypeType pcmTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadixTypeObject(RadixType radixTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceLocationTypeObject(ReferenceLocationType referenceLocationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceTypeObject(ReferenceType referenceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceTypeObject1(ReferenceType1 referenceTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeTimeType(Duration relativeTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizeInBitsTypeObject(SizeInBitsType1 sizeInBitsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizeInBitsTypeObject1(SizeInBitsType2 sizeInBitsTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsTypeObject(UnitsType unitsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidationStatusTypeObject(ValidationStatusType validationStatusTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerificationToWaitForTypeObject(VerificationToWaitForType verificationToWaitForTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerifierToTriggerOnTypeObject(VerifierToTriggerOnType verifierToTriggerOnTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //XtceValidator
