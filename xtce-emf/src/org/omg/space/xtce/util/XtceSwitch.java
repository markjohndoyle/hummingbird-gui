/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.omg.space.xtce.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.omg.space.xtce.XtcePackage
 * @generated
 */
public class XtceSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XtcePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtceSwitch() {
		if (modelPackage == null) {
			modelPackage = XtcePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XtcePackage.ABSOLUTE_TIME_DATA_TYPE: {
				AbsoluteTimeDataType absoluteTimeDataType = (AbsoluteTimeDataType)theEObject;
				T result = caseAbsoluteTimeDataType(absoluteTimeDataType);
				if (result == null) result = caseBaseTimeDataType(absoluteTimeDataType);
				if (result == null) result = caseNameDescriptionType(absoluteTimeDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ACCEPTED_VERIFIER_TYPE: {
				AcceptedVerifierType acceptedVerifierType = (AcceptedVerifierType)theEObject;
				T result = caseAcceptedVerifierType(acceptedVerifierType);
				if (result == null) result = caseCommandVerifierType(acceptedVerifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ALARM_CONDITIONS_TYPE: {
				AlarmConditionsType alarmConditionsType = (AlarmConditionsType)theEObject;
				T result = caseAlarmConditionsType(alarmConditionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ALARM_RANGES_TYPE: {
				AlarmRangesType alarmRangesType = (AlarmRangesType)theEObject;
				T result = caseAlarmRangesType(alarmRangesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ALGORITHM_SET_TYPE: {
				AlgorithmSetType algorithmSetType = (AlgorithmSetType)theEObject;
				T result = caseAlgorithmSetType(algorithmSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ALGORITHM_TEXT_TYPE: {
				AlgorithmTextType algorithmTextType = (AlgorithmTextType)theEObject;
				T result = caseAlgorithmTextType(algorithmTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ALIAS_SET_TYPE: {
				AliasSetType aliasSetType = (AliasSetType)theEObject;
				T result = caseAliasSetType(aliasSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ALIAS_TYPE: {
				AliasType aliasType = (AliasType)theEObject;
				T result = caseAliasType(aliasType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.AN_DED_CONDITIONS_TYPE: {
				ANDedConditionsType anDedConditionsType = (ANDedConditionsType)theEObject;
				T result = caseANDedConditionsType(anDedConditionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ARGUMEMENT_ARRAY_TYPE_TYPE: {
				ArgumementArrayTypeType argumementArrayTypeType = (ArgumementArrayTypeType)theEObject;
				T result = caseArgumementArrayTypeType(argumementArrayTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ARGUMENT_ASSIGNMENT_LIST_TYPE: {
				ArgumentAssignmentListType argumentAssignmentListType = (ArgumentAssignmentListType)theEObject;
				T result = caseArgumentAssignmentListType(argumentAssignmentListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ARGUMENT_ASSIGNMENT_TYPE: {
				ArgumentAssignmentType argumentAssignmentType = (ArgumentAssignmentType)theEObject;
				T result = caseArgumentAssignmentType(argumentAssignmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ARGUMENT_LIST_TYPE: {
				ArgumentListType argumentListType = (ArgumentListType)theEObject;
				T result = caseArgumentListType(argumentListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ARGUMENT_LIST_TYPE1: {
				ArgumentListType1 argumentListType1 = (ArgumentListType1)theEObject;
				T result = caseArgumentListType1(argumentListType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ARGUMENT_REF_ENTRY_TYPE: {
				ArgumentRefEntryType argumentRefEntryType = (ArgumentRefEntryType)theEObject;
				T result = caseArgumentRefEntryType(argumentRefEntryType);
				if (result == null) result = caseSequenceEntryType(argumentRefEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ARGUMENT_TYPE: {
				ArgumentType argumentType = (ArgumentType)theEObject;
				T result = caseArgumentType(argumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ARGUMENT_TYPE1: {
				ArgumentType1 argumentType1 = (ArgumentType1)theEObject;
				T result = caseArgumentType1(argumentType1);
				if (result == null) result = caseNameDescriptionType(argumentType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ARGUMENT_TYPE_SET_TYPE: {
				ArgumentTypeSetType argumentTypeSetType = (ArgumentTypeSetType)theEObject;
				T result = caseArgumentTypeSetType(argumentTypeSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ARRAY_PARAMETER_REF_ENTRY_TYPE: {
				ArrayParameterRefEntryType arrayParameterRefEntryType = (ArrayParameterRefEntryType)theEObject;
				T result = caseArrayParameterRefEntryType(arrayParameterRefEntryType);
				if (result == null) result = caseSequenceEntryType(arrayParameterRefEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ARRAY_PARAMETER_TYPE_TYPE: {
				ArrayParameterTypeType arrayParameterTypeType = (ArrayParameterTypeType)theEObject;
				T result = caseArrayParameterTypeType(arrayParameterTypeType);
				if (result == null) result = caseNameDescriptionType(arrayParameterTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.AUTHOR_SET_TYPE: {
				AuthorSetType authorSetType = (AuthorSetType)theEObject;
				T result = caseAuthorSetType(authorSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.AUTO_INVERT_TYPE: {
				AutoInvertType autoInvertType = (AutoInvertType)theEObject;
				T result = caseAutoInvertType(autoInvertType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.BASE_CONTAINER_TYPE: {
				BaseContainerType baseContainerType = (BaseContainerType)theEObject;
				T result = caseBaseContainerType(baseContainerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.BASE_CONTAINER_TYPE1: {
				BaseContainerType1 baseContainerType1 = (BaseContainerType1)theEObject;
				T result = caseBaseContainerType1(baseContainerType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.BASE_DATA_TYPE: {
				BaseDataType baseDataType = (BaseDataType)theEObject;
				T result = caseBaseDataType(baseDataType);
				if (result == null) result = caseNameDescriptionType(baseDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.BASE_META_COMMAND_TYPE: {
				BaseMetaCommandType baseMetaCommandType = (BaseMetaCommandType)theEObject;
				T result = caseBaseMetaCommandType(baseMetaCommandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.BASE_TIME_DATA_TYPE: {
				BaseTimeDataType baseTimeDataType = (BaseTimeDataType)theEObject;
				T result = caseBaseTimeDataType(baseTimeDataType);
				if (result == null) result = caseNameDescriptionType(baseTimeDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.BINARY_DATA_ENCODING_TYPE: {
				BinaryDataEncodingType binaryDataEncodingType = (BinaryDataEncodingType)theEObject;
				T result = caseBinaryDataEncodingType(binaryDataEncodingType);
				if (result == null) result = caseDataEncodingType(binaryDataEncodingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.BINARY_DATA_TYPE: {
				BinaryDataType binaryDataType = (BinaryDataType)theEObject;
				T result = caseBinaryDataType(binaryDataType);
				if (result == null) result = caseBaseDataType(binaryDataType);
				if (result == null) result = caseNameDescriptionType(binaryDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.BLOCK_META_COMMAND_TYPE: {
				BlockMetaCommandType blockMetaCommandType = (BlockMetaCommandType)theEObject;
				T result = caseBlockMetaCommandType(blockMetaCommandType);
				if (result == null) result = caseNameDescriptionType(blockMetaCommandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.BOOLEAN_DATA_TYPE: {
				BooleanDataType booleanDataType = (BooleanDataType)theEObject;
				T result = caseBooleanDataType(booleanDataType);
				if (result == null) result = caseBaseDataType(booleanDataType);
				if (result == null) result = caseNameDescriptionType(booleanDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.BOOLEAN_EXPRESSION_TYPE: {
				BooleanExpressionType booleanExpressionType = (BooleanExpressionType)theEObject;
				T result = caseBooleanExpressionType(booleanExpressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.BYTE_ORDER_TYPE: {
				ByteOrderType byteOrderType = (ByteOrderType)theEObject;
				T result = caseByteOrderType(byteOrderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.BYTE_TYPE: {
				ByteType byteType = (ByteType)theEObject;
				T result = caseByteType(byteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CALIBRATOR_TYPE: {
				CalibratorType calibratorType = (CalibratorType)theEObject;
				T result = caseCalibratorType(calibratorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CHANGE_TYPE: {
				ChangeType changeType = (ChangeType)theEObject;
				T result = caseChangeType(changeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.COMMAND_CONTAINER_ENTRY_LIST_TYPE: {
				CommandContainerEntryListType commandContainerEntryListType = (CommandContainerEntryListType)theEObject;
				T result = caseCommandContainerEntryListType(commandContainerEntryListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.COMMAND_CONTAINER_SET_TYPE: {
				CommandContainerSetType commandContainerSetType = (CommandContainerSetType)theEObject;
				T result = caseCommandContainerSetType(commandContainerSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.COMMAND_CONTAINER_TYPE: {
				CommandContainerType commandContainerType = (CommandContainerType)theEObject;
				T result = caseCommandContainerType(commandContainerType);
				if (result == null) result = caseContainerType(commandContainerType);
				if (result == null) result = caseNameDescriptionType(commandContainerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.COMMAND_META_DATA_TYPE: {
				CommandMetaDataType commandMetaDataType = (CommandMetaDataType)theEObject;
				T result = caseCommandMetaDataType(commandMetaDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.COMMAND_VERIFIER_TYPE: {
				CommandVerifierType commandVerifierType = (CommandVerifierType)theEObject;
				T result = caseCommandVerifierType(commandVerifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.COMPARISON_CHECK_TYPE: {
				ComparisonCheckType comparisonCheckType = (ComparisonCheckType)theEObject;
				T result = caseComparisonCheckType(comparisonCheckType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.COMPARISON_LIST_TYPE: {
				ComparisonListType comparisonListType = (ComparisonListType)theEObject;
				T result = caseComparisonListType(comparisonListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.COMPARISON_LIST_TYPE1: {
				ComparisonListType1 comparisonListType1 = (ComparisonListType1)theEObject;
				T result = caseComparisonListType1(comparisonListType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.COMPARISON_TYPE: {
				ComparisonType comparisonType = (ComparisonType)theEObject;
				T result = caseComparisonType(comparisonType);
				if (result == null) result = caseParameterInstanceRefType1(comparisonType);
				if (result == null) result = caseParameterRefType1(comparisonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.COMPLETE_VERIFIER_TYPE: {
				CompleteVerifierType completeVerifierType = (CompleteVerifierType)theEObject;
				T result = caseCompleteVerifierType(completeVerifierType);
				if (result == null) result = caseCommandVerifierType(completeVerifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONDITIONAL_ALARM_TYPE: {
				ConditionalAlarmType conditionalAlarmType = (ConditionalAlarmType)theEObject;
				T result = caseConditionalAlarmType(conditionalAlarmType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONSTANT_TYPE: {
				ConstantType constantType = (ConstantType)theEObject;
				T result = caseConstantType(constantType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTAINER_REF_ENTRY_TYPE: {
				ContainerRefEntryType containerRefEntryType = (ContainerRefEntryType)theEObject;
				T result = caseContainerRefEntryType(containerRefEntryType);
				if (result == null) result = caseSequenceEntryType(containerRefEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTAINER_REF_SET_TYPE: {
				ContainerRefSetType containerRefSetType = (ContainerRefSetType)theEObject;
				T result = caseContainerRefSetType(containerRefSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTAINER_REF_TYPE: {
				ContainerRefType containerRefType = (ContainerRefType)theEObject;
				T result = caseContainerRefType(containerRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTAINER_SEGMENT_REF_ENTRY_TYPE: {
				ContainerSegmentRefEntryType containerSegmentRefEntryType = (ContainerSegmentRefEntryType)theEObject;
				T result = caseContainerSegmentRefEntryType(containerSegmentRefEntryType);
				if (result == null) result = caseSequenceEntryType(containerSegmentRefEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTAINER_SET_TYPE: {
				ContainerSetType containerSetType = (ContainerSetType)theEObject;
				T result = caseContainerSetType(containerSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTAINER_TYPE: {
				ContainerType containerType = (ContainerType)theEObject;
				T result = caseContainerType(containerType);
				if (result == null) result = caseNameDescriptionType(containerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTEXT_ALARM_LIST_TYPE: {
				ContextAlarmListType contextAlarmListType = (ContextAlarmListType)theEObject;
				T result = caseContextAlarmListType(contextAlarmListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTEXT_ALARM_LIST_TYPE1: {
				ContextAlarmListType1 contextAlarmListType1 = (ContextAlarmListType1)theEObject;
				T result = caseContextAlarmListType1(contextAlarmListType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTEXT_ALARM_LIST_TYPE2: {
				ContextAlarmListType2 contextAlarmListType2 = (ContextAlarmListType2)theEObject;
				T result = caseContextAlarmListType2(contextAlarmListType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTEXT_ALARM_LIST_TYPE3: {
				ContextAlarmListType3 contextAlarmListType3 = (ContextAlarmListType3)theEObject;
				T result = caseContextAlarmListType3(contextAlarmListType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTEXT_ALARM_TYPE: {
				ContextAlarmType contextAlarmType = (ContextAlarmType)theEObject;
				T result = caseContextAlarmType(contextAlarmType);
				if (result == null) result = caseNumericAlarmConditionType(contextAlarmType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE: {
				ContextCalibratorListType contextCalibratorListType = (ContextCalibratorListType)theEObject;
				T result = caseContextCalibratorListType(contextCalibratorListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE1: {
				ContextCalibratorListType1 contextCalibratorListType1 = (ContextCalibratorListType1)theEObject;
				T result = caseContextCalibratorListType1(contextCalibratorListType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE2: {
				ContextCalibratorListType2 contextCalibratorListType2 = (ContextCalibratorListType2)theEObject;
				T result = caseContextCalibratorListType2(contextCalibratorListType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE3: {
				ContextCalibratorListType3 contextCalibratorListType3 = (ContextCalibratorListType3)theEObject;
				T result = caseContextCalibratorListType3(contextCalibratorListType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTEXT_CALIBRATOR_LIST_TYPE4: {
				ContextCalibratorListType4 contextCalibratorListType4 = (ContextCalibratorListType4)theEObject;
				T result = caseContextCalibratorListType4(contextCalibratorListType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE: {
				ContextCalibratorType contextCalibratorType = (ContextCalibratorType)theEObject;
				T result = caseContextCalibratorType(contextCalibratorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE1: {
				ContextCalibratorType1 contextCalibratorType1 = (ContextCalibratorType1)theEObject;
				T result = caseContextCalibratorType1(contextCalibratorType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE2: {
				ContextCalibratorType2 contextCalibratorType2 = (ContextCalibratorType2)theEObject;
				T result = caseContextCalibratorType2(contextCalibratorType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTEXT_CALIBRATOR_TYPE3: {
				ContextCalibratorType3 contextCalibratorType3 = (ContextCalibratorType3)theEObject;
				T result = caseContextCalibratorType3(contextCalibratorType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTEXT_SIGNIFICANCE_LIST_TYPE: {
				ContextSignificanceListType contextSignificanceListType = (ContextSignificanceListType)theEObject;
				T result = caseContextSignificanceListType(contextSignificanceListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CONTEXT_SIGNIFICANCE_TYPE: {
				ContextSignificanceType contextSignificanceType = (ContextSignificanceType)theEObject;
				T result = caseContextSignificanceType(contextSignificanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CRC_TYPE: {
				CRCType crcType = (CRCType)theEObject;
				T result = caseCRCType(crcType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.CUSTOM_STREAM_TYPE: {
				CustomStreamType customStreamType = (CustomStreamType)theEObject;
				T result = caseCustomStreamType(customStreamType);
				if (result == null) result = casePCMStreamType(customStreamType);
				if (result == null) result = caseNameDescriptionType(customStreamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.DATA_ENCODING_TYPE: {
				DataEncodingType dataEncodingType = (DataEncodingType)theEObject;
				T result = caseDataEncodingType(dataEncodingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.DECIMAL_RANGE_TYPE: {
				DecimalRangeType decimalRangeType = (DecimalRangeType)theEObject;
				T result = caseDecimalRangeType(decimalRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.DECIMAL_VALUE_TYPE: {
				DecimalValueType decimalValueType = (DecimalValueType)theEObject;
				T result = caseDecimalValueType(decimalValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.DEFAULTS_TYPE: {
				DefaultsType defaultsType = (DefaultsType)theEObject;
				T result = caseDefaultsType(defaultsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.DIMENSION_LIST_TYPE: {
				DimensionListType dimensionListType = (DimensionListType)theEObject;
				T result = caseDimensionListType(dimensionListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.DIMENSION_TYPE: {
				DimensionType dimensionType = (DimensionType)theEObject;
				T result = caseDimensionType(dimensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.DISCRETE_LOOKUP_LIST_TYPE: {
				DiscreteLookupListType discreteLookupListType = (DiscreteLookupListType)theEObject;
				T result = caseDiscreteLookupListType(discreteLookupListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.DISCRETE_LOOKUP_TYPE: {
				DiscreteLookupType discreteLookupType = (DiscreteLookupType)theEObject;
				T result = caseDiscreteLookupType(discreteLookupType);
				if (result == null) result = caseMatchCriteriaType(discreteLookupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.DYNAMIC_VALUE_TYPE: {
				DynamicValueType dynamicValueType = (DynamicValueType)theEObject;
				T result = caseDynamicValueType(dynamicValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.DYNAMIC_VALUE_TYPE1: {
				DynamicValueType1 dynamicValueType1 = (DynamicValueType1)theEObject;
				T result = caseDynamicValueType1(dynamicValueType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ENCODING_TYPE1: {
				EncodingType1 encodingType1 = (EncodingType1)theEObject;
				T result = caseEncodingType1(encodingType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ENTRY_LIST_TYPE: {
				EntryListType entryListType = (EntryListType)theEObject;
				T result = caseEntryListType(entryListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ENUMERATED_DATA_TYPE: {
				EnumeratedDataType enumeratedDataType = (EnumeratedDataType)theEObject;
				T result = caseEnumeratedDataType(enumeratedDataType);
				if (result == null) result = caseBaseDataType(enumeratedDataType);
				if (result == null) result = caseNameDescriptionType(enumeratedDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ENUMERATION_LIST_TYPE: {
				EnumerationListType enumerationListType = (EnumerationListType)theEObject;
				T result = caseEnumerationListType(enumerationListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ERROR_DETECT_CORRECT_TYPE: {
				ErrorDetectCorrectType errorDetectCorrectType = (ErrorDetectCorrectType)theEObject;
				T result = caseErrorDetectCorrectType(errorDetectCorrectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.EXECUTION_VERIFIER_TYPE: {
				ExecutionVerifierType executionVerifierType = (ExecutionVerifierType)theEObject;
				T result = caseExecutionVerifierType(executionVerifierType);
				if (result == null) result = caseCommandVerifierType(executionVerifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.EXTERNAL_ALGORITHM_SET_TYPE: {
				ExternalAlgorithmSetType externalAlgorithmSetType = (ExternalAlgorithmSetType)theEObject;
				T result = caseExternalAlgorithmSetType(externalAlgorithmSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.EXTERNAL_ALGORITHM_TYPE: {
				ExternalAlgorithmType externalAlgorithmType = (ExternalAlgorithmType)theEObject;
				T result = caseExternalAlgorithmType(externalAlgorithmType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.FIXED_FRAME_STREAM_TYPE: {
				FixedFrameStreamType fixedFrameStreamType = (FixedFrameStreamType)theEObject;
				T result = caseFixedFrameStreamType(fixedFrameStreamType);
				if (result == null) result = caseFrameStreamType(fixedFrameStreamType);
				if (result == null) result = casePCMStreamType(fixedFrameStreamType);
				if (result == null) result = caseNameDescriptionType(fixedFrameStreamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.FIXED_FRAME_SYNC_STRATEGY_TYPE: {
				FixedFrameSyncStrategyType fixedFrameSyncStrategyType = (FixedFrameSyncStrategyType)theEObject;
				T result = caseFixedFrameSyncStrategyType(fixedFrameSyncStrategyType);
				if (result == null) result = caseSyncStrategyType(fixedFrameSyncStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.FIXED_VALUE_ENTRY_TYPE: {
				FixedValueEntryType fixedValueEntryType = (FixedValueEntryType)theEObject;
				T result = caseFixedValueEntryType(fixedValueEntryType);
				if (result == null) result = caseSequenceEntryType(fixedValueEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.FLAG_TYPE: {
				FlagType flagType = (FlagType)theEObject;
				T result = caseFlagType(flagType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.FLOAT_ARGUMENT_TYPE_TYPE: {
				FloatArgumentTypeType floatArgumentTypeType = (FloatArgumentTypeType)theEObject;
				T result = caseFloatArgumentTypeType(floatArgumentTypeType);
				if (result == null) result = caseFloatDataType(floatArgumentTypeType);
				if (result == null) result = caseNumericDataType(floatArgumentTypeType);
				if (result == null) result = caseBaseDataType(floatArgumentTypeType);
				if (result == null) result = caseNameDescriptionType(floatArgumentTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.FLOAT_DATA_ENCODING_TYPE: {
				FloatDataEncodingType floatDataEncodingType = (FloatDataEncodingType)theEObject;
				T result = caseFloatDataEncodingType(floatDataEncodingType);
				if (result == null) result = caseDataEncodingType(floatDataEncodingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.FLOAT_DATA_TYPE: {
				FloatDataType floatDataType = (FloatDataType)theEObject;
				T result = caseFloatDataType(floatDataType);
				if (result == null) result = caseNumericDataType(floatDataType);
				if (result == null) result = caseBaseDataType(floatDataType);
				if (result == null) result = caseNameDescriptionType(floatDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.FLOAT_PARAMETER_TYPE_TYPE: {
				FloatParameterTypeType floatParameterTypeType = (FloatParameterTypeType)theEObject;
				T result = caseFloatParameterTypeType(floatParameterTypeType);
				if (result == null) result = caseFloatDataType(floatParameterTypeType);
				if (result == null) result = caseNumericDataType(floatParameterTypeType);
				if (result == null) result = caseBaseDataType(floatParameterTypeType);
				if (result == null) result = caseNameDescriptionType(floatParameterTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.FRAME_STREAM_TYPE: {
				FrameStreamType frameStreamType = (FrameStreamType)theEObject;
				T result = caseFrameStreamType(frameStreamType);
				if (result == null) result = casePCMStreamType(frameStreamType);
				if (result == null) result = caseNameDescriptionType(frameStreamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.HEADER_TYPE: {
				HeaderType headerType = (HeaderType)theEObject;
				T result = caseHeaderType(headerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.HISTORY_SET_TYPE: {
				HistorySetType historySetType = (HistorySetType)theEObject;
				T result = caseHistorySetType(historySetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.INDIRECT_PARAMETER_REF_ENTRY_TYPE: {
				IndirectParameterRefEntryType indirectParameterRefEntryType = (IndirectParameterRefEntryType)theEObject;
				T result = caseIndirectParameterRefEntryType(indirectParameterRefEntryType);
				if (result == null) result = caseSequenceEntryType(indirectParameterRefEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.INPUT_ALGORITHM_TYPE: {
				InputAlgorithmType inputAlgorithmType = (InputAlgorithmType)theEObject;
				T result = caseInputAlgorithmType(inputAlgorithmType);
				if (result == null) result = caseSimpleAlgorithmType(inputAlgorithmType);
				if (result == null) result = caseNameDescriptionType(inputAlgorithmType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.INPUT_OUTPUT_ALGORITHM_TYPE: {
				InputOutputAlgorithmType inputOutputAlgorithmType = (InputOutputAlgorithmType)theEObject;
				T result = caseInputOutputAlgorithmType(inputOutputAlgorithmType);
				if (result == null) result = caseInputAlgorithmType(inputOutputAlgorithmType);
				if (result == null) result = caseSimpleAlgorithmType(inputOutputAlgorithmType);
				if (result == null) result = caseNameDescriptionType(inputOutputAlgorithmType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE: {
				InputOutputTriggerAlgorithmType inputOutputTriggerAlgorithmType = (InputOutputTriggerAlgorithmType)theEObject;
				T result = caseInputOutputTriggerAlgorithmType(inputOutputTriggerAlgorithmType);
				if (result == null) result = caseInputOutputAlgorithmType(inputOutputTriggerAlgorithmType);
				if (result == null) result = caseInputAlgorithmType(inputOutputTriggerAlgorithmType);
				if (result == null) result = caseSimpleAlgorithmType(inputOutputTriggerAlgorithmType);
				if (result == null) result = caseNameDescriptionType(inputOutputTriggerAlgorithmType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.INPUT_SET_TYPE: {
				InputSetType inputSetType = (InputSetType)theEObject;
				T result = caseInputSetType(inputSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.INTEGER_ARGUMENT_TYPE_TYPE: {
				IntegerArgumentTypeType integerArgumentTypeType = (IntegerArgumentTypeType)theEObject;
				T result = caseIntegerArgumentTypeType(integerArgumentTypeType);
				if (result == null) result = caseIntegerDataType(integerArgumentTypeType);
				if (result == null) result = caseNumericDataType(integerArgumentTypeType);
				if (result == null) result = caseBaseDataType(integerArgumentTypeType);
				if (result == null) result = caseNameDescriptionType(integerArgumentTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.INTEGER_DATA_ENCODING_TYPE: {
				IntegerDataEncodingType integerDataEncodingType = (IntegerDataEncodingType)theEObject;
				T result = caseIntegerDataEncodingType(integerDataEncodingType);
				if (result == null) result = caseDataEncodingType(integerDataEncodingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.INTEGER_DATA_TYPE: {
				IntegerDataType integerDataType = (IntegerDataType)theEObject;
				T result = caseIntegerDataType(integerDataType);
				if (result == null) result = caseNumericDataType(integerDataType);
				if (result == null) result = caseBaseDataType(integerDataType);
				if (result == null) result = caseNameDescriptionType(integerDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.INTEGER_PARAMETER_TYPE_TYPE: {
				IntegerParameterTypeType integerParameterTypeType = (IntegerParameterTypeType)theEObject;
				T result = caseIntegerParameterTypeType(integerParameterTypeType);
				if (result == null) result = caseIntegerDataType(integerParameterTypeType);
				if (result == null) result = caseNumericDataType(integerParameterTypeType);
				if (result == null) result = caseBaseDataType(integerParameterTypeType);
				if (result == null) result = caseNameDescriptionType(integerParameterTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.INTEGER_RANGE_TYPE: {
				IntegerRangeType integerRangeType = (IntegerRangeType)theEObject;
				T result = caseIntegerRangeType(integerRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.INTEGER_VALUE_TYPE: {
				IntegerValueType integerValueType = (IntegerValueType)theEObject;
				T result = caseIntegerValueType(integerValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.INTERLOCK_TYPE: {
				InterlockType interlockType = (InterlockType)theEObject;
				T result = caseInterlockType(interlockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.LEADING_SIZE_TYPE: {
				LeadingSizeType leadingSizeType = (LeadingSizeType)theEObject;
				T result = caseLeadingSizeType(leadingSizeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.LINEAR_ADJUSTMENT_TYPE: {
				LinearAdjustmentType linearAdjustmentType = (LinearAdjustmentType)theEObject;
				T result = caseLinearAdjustmentType(linearAdjustmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.LINEAR_ADJUSTMENT_TYPE1: {
				LinearAdjustmentType1 linearAdjustmentType1 = (LinearAdjustmentType1)theEObject;
				T result = caseLinearAdjustmentType1(linearAdjustmentType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.LOCATION_IN_CONTAINER_IN_BITS_TYPE: {
				LocationInContainerInBitsType locationInContainerInBitsType = (LocationInContainerInBitsType)theEObject;
				T result = caseLocationInContainerInBitsType(locationInContainerInBitsType);
				if (result == null) result = caseIntegerValueType(locationInContainerInBitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.MATCH_CRITERIA_TYPE: {
				MatchCriteriaType matchCriteriaType = (MatchCriteriaType)theEObject;
				T result = caseMatchCriteriaType(matchCriteriaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.MATH_ALGORITHM_TYPE: {
				MathAlgorithmType mathAlgorithmType = (MathAlgorithmType)theEObject;
				T result = caseMathAlgorithmType(mathAlgorithmType);
				if (result == null) result = caseNameDescriptionType(mathAlgorithmType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.MATH_OPERATION_TYPE: {
				MathOperationType mathOperationType = (MathOperationType)theEObject;
				T result = caseMathOperationType(mathOperationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.MATH_OPERATION_TYPE1: {
				MathOperationType1 mathOperationType1 = (MathOperationType1)theEObject;
				T result = caseMathOperationType1(mathOperationType1);
				if (result == null) result = caseMathOperationType(mathOperationType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.MESSAGE_REF_SET_TYPE: {
				MessageRefSetType messageRefSetType = (MessageRefSetType)theEObject;
				T result = caseMessageRefSetType(messageRefSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.MESSAGE_REF_TYPE: {
				MessageRefType messageRefType = (MessageRefType)theEObject;
				T result = caseMessageRefType(messageRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.MESSAGE_SET_TYPE: {
				MessageSetType messageSetType = (MessageSetType)theEObject;
				T result = caseMessageSetType(messageSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.MESSAGE_TYPE: {
				MessageType messageType = (MessageType)theEObject;
				T result = caseMessageType(messageType);
				if (result == null) result = caseNameDescriptionType(messageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.META_COMMAND_SET_TYPE: {
				MetaCommandSetType metaCommandSetType = (MetaCommandSetType)theEObject;
				T result = caseMetaCommandSetType(metaCommandSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.META_COMMAND_STEP_LIST_TYPE: {
				MetaCommandStepListType metaCommandStepListType = (MetaCommandStepListType)theEObject;
				T result = caseMetaCommandStepListType(metaCommandStepListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.META_COMMAND_STEP_TYPE: {
				MetaCommandStepType metaCommandStepType = (MetaCommandStepType)theEObject;
				T result = caseMetaCommandStepType(metaCommandStepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.META_COMMAND_TYPE: {
				MetaCommandType metaCommandType = (MetaCommandType)theEObject;
				T result = caseMetaCommandType(metaCommandType);
				if (result == null) result = caseNameDescriptionType(metaCommandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.NAME_DESCRIPTION_TYPE: {
				NameDescriptionType nameDescriptionType = (NameDescriptionType)theEObject;
				T result = caseNameDescriptionType(nameDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.NOTE_SET_TYPE: {
				NoteSetType noteSetType = (NoteSetType)theEObject;
				T result = caseNoteSetType(noteSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.NUMBER_FORMAT_TYPE: {
				NumberFormatType numberFormatType = (NumberFormatType)theEObject;
				T result = caseNumberFormatType(numberFormatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.NUMBER_TO_STRING_TYPE: {
				NumberToStringType numberToStringType = (NumberToStringType)theEObject;
				T result = caseNumberToStringType(numberToStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.NUMERIC_ALARM_CONDITION_TYPE: {
				NumericAlarmConditionType numericAlarmConditionType = (NumericAlarmConditionType)theEObject;
				T result = caseNumericAlarmConditionType(numericAlarmConditionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.NUMERIC_DATA_TYPE: {
				NumericDataType numericDataType = (NumericDataType)theEObject;
				T result = caseNumericDataType(numericDataType);
				if (result == null) result = caseBaseDataType(numericDataType);
				if (result == null) result = caseNameDescriptionType(numericDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.OFFSET_TYPE: {
				OffsetType offsetType = (OffsetType)theEObject;
				T result = caseOffsetType(offsetType);
				if (result == null) result = caseIntegerValueType(offsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.ORED_CONDITIONS_TYPE: {
				ORedConditionsType oRedConditionsType = (ORedConditionsType)theEObject;
				T result = caseORedConditionsType(oRedConditionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.OUTPUT_PARAMETER_REF_TYPE: {
				OutputParameterRefType outputParameterRefType = (OutputParameterRefType)theEObject;
				T result = caseOutputParameterRefType(outputParameterRefType);
				if (result == null) result = caseParameterRefType1(outputParameterRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.OUTPUT_SET_TYPE: {
				OutputSetType outputSetType = (OutputSetType)theEObject;
				T result = caseOutputSetType(outputSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PARAMETER_INSTANCE_REF_TYPE: {
				ParameterInstanceRefType parameterInstanceRefType = (ParameterInstanceRefType)theEObject;
				T result = caseParameterInstanceRefType(parameterInstanceRefType);
				if (result == null) result = caseParameterInstanceRefType1(parameterInstanceRefType);
				if (result == null) result = caseParameterRefType1(parameterInstanceRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PARAMETER_INSTANCE_REF_TYPE1: {
				ParameterInstanceRefType1 parameterInstanceRefType1 = (ParameterInstanceRefType1)theEObject;
				T result = caseParameterInstanceRefType1(parameterInstanceRefType1);
				if (result == null) result = caseParameterRefType1(parameterInstanceRefType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PARAMETER_PROPERTIES_TYPE: {
				ParameterPropertiesType parameterPropertiesType = (ParameterPropertiesType)theEObject;
				T result = caseParameterPropertiesType(parameterPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PARAMETER_REF_ENTRY_TYPE: {
				ParameterRefEntryType parameterRefEntryType = (ParameterRefEntryType)theEObject;
				T result = caseParameterRefEntryType(parameterRefEntryType);
				if (result == null) result = caseSequenceEntryType(parameterRefEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PARAMETER_REF_TYPE: {
				ParameterRefType parameterRefType = (ParameterRefType)theEObject;
				T result = caseParameterRefType(parameterRefType);
				if (result == null) result = caseParameterRefType1(parameterRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PARAMETER_REF_TYPE1: {
				ParameterRefType1 parameterRefType1 = (ParameterRefType1)theEObject;
				T result = caseParameterRefType1(parameterRefType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PARAMETER_SEGMENT_REF_ENTRY_TYPE: {
				ParameterSegmentRefEntryType parameterSegmentRefEntryType = (ParameterSegmentRefEntryType)theEObject;
				T result = caseParameterSegmentRefEntryType(parameterSegmentRefEntryType);
				if (result == null) result = caseSequenceEntryType(parameterSegmentRefEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PARAMETER_SET_TYPE: {
				ParameterSetType parameterSetType = (ParameterSetType)theEObject;
				T result = caseParameterSetType(parameterSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PARAMETER_TO_SET_LIST_TYPE: {
				ParameterToSetListType parameterToSetListType = (ParameterToSetListType)theEObject;
				T result = caseParameterToSetListType(parameterToSetListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PARAMETER_TO_SET_TYPE: {
				ParameterToSetType parameterToSetType = (ParameterToSetType)theEObject;
				T result = caseParameterToSetType(parameterToSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PARAMETER_TO_SET_TYPE1: {
				ParameterToSetType1 parameterToSetType1 = (ParameterToSetType1)theEObject;
				T result = caseParameterToSetType1(parameterToSetType1);
				if (result == null) result = caseParameterToSetType(parameterToSetType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PARAMETER_TYPE: {
				ParameterType parameterType = (ParameterType)theEObject;
				T result = caseParameterType(parameterType);
				if (result == null) result = caseNameDescriptionType(parameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PARAMETER_TYPE_SET_TYPE: {
				ParameterTypeSetType parameterTypeSetType = (ParameterTypeSetType)theEObject;
				T result = caseParameterTypeSetType(parameterTypeSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PARAMETER_VALUE_CHANGE_TYPE: {
				ParameterValueChangeType parameterValueChangeType = (ParameterValueChangeType)theEObject;
				T result = caseParameterValueChangeType(parameterValueChangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PARITY_TYPE: {
				ParityType parityType = (ParityType)theEObject;
				T result = caseParityType(parityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PCM_STREAM_TYPE: {
				PCMStreamType pcmStreamType = (PCMStreamType)theEObject;
				T result = casePCMStreamType(pcmStreamType);
				if (result == null) result = caseNameDescriptionType(pcmStreamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PHYSICAL_ADDRESS_SET_TYPE: {
				PhysicalAddressSetType physicalAddressSetType = (PhysicalAddressSetType)theEObject;
				T result = casePhysicalAddressSetType(physicalAddressSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PHYSICAL_ADDRESS_TYPE: {
				PhysicalAddressType physicalAddressType = (PhysicalAddressType)theEObject;
				T result = casePhysicalAddressType(physicalAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PHYSICAL_ADDRESS_TYPE1: {
				PhysicalAddressType1 physicalAddressType1 = (PhysicalAddressType1)theEObject;
				T result = casePhysicalAddressType1(physicalAddressType1);
				if (result == null) result = casePhysicalAddressType(physicalAddressType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.POLYNOMIAL_TYPE: {
				PolynomialType polynomialType = (PolynomialType)theEObject;
				T result = casePolynomialType(polynomialType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = caseNameDescriptionType(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.QUEUED_VERIFIER_TYPE: {
				QueuedVerifierType queuedVerifierType = (QueuedVerifierType)theEObject;
				T result = caseQueuedVerifierType(queuedVerifierType);
				if (result == null) result = caseCommandVerifierType(queuedVerifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.RANGE_ENUMERATION_TYPE: {
				RangeEnumerationType rangeEnumerationType = (RangeEnumerationType)theEObject;
				T result = caseRangeEnumerationType(rangeEnumerationType);
				if (result == null) result = caseDecimalRangeType(rangeEnumerationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.RATE_IN_STREAM_SET_TYPE: {
				RateInStreamSetType rateInStreamSetType = (RateInStreamSetType)theEObject;
				T result = caseRateInStreamSetType(rateInStreamSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.RATE_IN_STREAM_TYPE: {
				RateInStreamType rateInStreamType = (RateInStreamType)theEObject;
				T result = caseRateInStreamType(rateInStreamType);
				if (result == null) result = caseRateInStreamType1(rateInStreamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.RATE_IN_STREAM_TYPE1: {
				RateInStreamType1 rateInStreamType1 = (RateInStreamType1)theEObject;
				T result = caseRateInStreamType1(rateInStreamType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.RECEIVED_VERIFIER_TYPE: {
				ReceivedVerifierType receivedVerifierType = (ReceivedVerifierType)theEObject;
				T result = caseReceivedVerifierType(receivedVerifierType);
				if (result == null) result = caseCommandVerifierType(receivedVerifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.REFERENCE_TIME_TYPE: {
				ReferenceTimeType referenceTimeType = (ReferenceTimeType)theEObject;
				T result = caseReferenceTimeType(referenceTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.RELATIVE_TIME_DATA_TYPE: {
				RelativeTimeDataType relativeTimeDataType = (RelativeTimeDataType)theEObject;
				T result = caseRelativeTimeDataType(relativeTimeDataType);
				if (result == null) result = caseBaseTimeDataType(relativeTimeDataType);
				if (result == null) result = caseNameDescriptionType(relativeTimeDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.REPEAT_TYPE: {
				RepeatType repeatType = (RepeatType)theEObject;
				T result = caseRepeatType(repeatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.RESTRICTION_CRITERIA_TYPE: {
				RestrictionCriteriaType restrictionCriteriaType = (RestrictionCriteriaType)theEObject;
				T result = caseRestrictionCriteriaType(restrictionCriteriaType);
				if (result == null) result = caseMatchCriteriaType(restrictionCriteriaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.RESTRICTION_CRITERIA_TYPE1: {
				RestrictionCriteriaType1 restrictionCriteriaType1 = (RestrictionCriteriaType1)theEObject;
				T result = caseRestrictionCriteriaType1(restrictionCriteriaType1);
				if (result == null) result = caseMatchCriteriaType(restrictionCriteriaType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.SENT_FROM_RANGE_VERIFIER_TYPE: {
				SentFromRangeVerifierType sentFromRangeVerifierType = (SentFromRangeVerifierType)theEObject;
				T result = caseSentFromRangeVerifierType(sentFromRangeVerifierType);
				if (result == null) result = caseCommandVerifierType(sentFromRangeVerifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.SEQUENCE_CONTAINER_TYPE: {
				SequenceContainerType sequenceContainerType = (SequenceContainerType)theEObject;
				T result = caseSequenceContainerType(sequenceContainerType);
				if (result == null) result = caseContainerType(sequenceContainerType);
				if (result == null) result = caseNameDescriptionType(sequenceContainerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.SEQUENCE_ENTRY_TYPE: {
				SequenceEntryType sequenceEntryType = (SequenceEntryType)theEObject;
				T result = caseSequenceEntryType(sequenceEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.SERVICE_REF_TYPE: {
				ServiceRefType serviceRefType = (ServiceRefType)theEObject;
				T result = caseServiceRefType(serviceRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.SERVICE_SET_TYPE: {
				ServiceSetType serviceSetType = (ServiceSetType)theEObject;
				T result = caseServiceSetType(serviceSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.SERVICE_TYPE: {
				ServiceType serviceType = (ServiceType)theEObject;
				T result = caseServiceType(serviceType);
				if (result == null) result = caseNameDescriptionType(serviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.SIGNIFICANCE_TYPE: {
				SignificanceType significanceType = (SignificanceType)theEObject;
				T result = caseSignificanceType(significanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.SIMPLE_ALGORITHM_TYPE: {
				SimpleAlgorithmType simpleAlgorithmType = (SimpleAlgorithmType)theEObject;
				T result = caseSimpleAlgorithmType(simpleAlgorithmType);
				if (result == null) result = caseNameDescriptionType(simpleAlgorithmType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.SIZE_IN_BITS_TYPE: {
				SizeInBitsType sizeInBitsType = (SizeInBitsType)theEObject;
				T result = caseSizeInBitsType(sizeInBitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.SPACE_SYSTEM_TYPE: {
				SpaceSystemType spaceSystemType = (SpaceSystemType)theEObject;
				T result = caseSpaceSystemType(spaceSystemType);
				if (result == null) result = caseNameDescriptionType(spaceSystemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.SPLINE_CALIBRATOR_TYPE: {
				SplineCalibratorType splineCalibratorType = (SplineCalibratorType)theEObject;
				T result = caseSplineCalibratorType(splineCalibratorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.SPLINE_POINT_TYPE: {
				SplinePointType splinePointType = (SplinePointType)theEObject;
				T result = caseSplinePointType(splinePointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.STREAM_REF_TYPE: {
				StreamRefType streamRefType = (StreamRefType)theEObject;
				T result = caseStreamRefType(streamRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.STREAM_SEGMENT_ENTRY_TYPE: {
				StreamSegmentEntryType streamSegmentEntryType = (StreamSegmentEntryType)theEObject;
				T result = caseStreamSegmentEntryType(streamSegmentEntryType);
				if (result == null) result = caseSequenceEntryType(streamSegmentEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.STREAM_SET_TYPE: {
				StreamSetType streamSetType = (StreamSetType)theEObject;
				T result = caseStreamSetType(streamSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.STRING_DATA_ENCODING_TYPE: {
				StringDataEncodingType stringDataEncodingType = (StringDataEncodingType)theEObject;
				T result = caseStringDataEncodingType(stringDataEncodingType);
				if (result == null) result = caseDataEncodingType(stringDataEncodingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.STRING_DATA_TYPE: {
				StringDataType stringDataType = (StringDataType)theEObject;
				T result = caseStringDataType(stringDataType);
				if (result == null) result = caseBaseDataType(stringDataType);
				if (result == null) result = caseNameDescriptionType(stringDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.SYNC_PATTERN_TYPE: {
				SyncPatternType syncPatternType = (SyncPatternType)theEObject;
				T result = caseSyncPatternType(syncPatternType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.SYNC_PATTERN_TYPE1: {
				SyncPatternType1 syncPatternType1 = (SyncPatternType1)theEObject;
				T result = caseSyncPatternType1(syncPatternType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.SYNC_STRATEGY_TYPE: {
				SyncStrategyType syncStrategyType = (SyncStrategyType)theEObject;
				T result = caseSyncStrategyType(syncStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.SYNC_STRATEGY_TYPE1: {
				SyncStrategyType1 syncStrategyType1 = (SyncStrategyType1)theEObject;
				T result = caseSyncStrategyType1(syncStrategyType1);
				if (result == null) result = caseSyncStrategyType(syncStrategyType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.SYNC_STRATEGY_TYPE2: {
				SyncStrategyType2 syncStrategyType2 = (SyncStrategyType2)theEObject;
				T result = caseSyncStrategyType2(syncStrategyType2);
				if (result == null) result = caseSyncStrategyType(syncStrategyType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.TELEMETRY_META_DATA_TYPE: {
				TelemetryMetaDataType telemetryMetaDataType = (TelemetryMetaDataType)theEObject;
				T result = caseTelemetryMetaDataType(telemetryMetaDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.TERM_TYPE: {
				TermType termType = (TermType)theEObject;
				T result = caseTermType(termType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.TIME_ASSOCIATION_TYPE: {
				TimeAssociationType timeAssociationType = (TimeAssociationType)theEObject;
				T result = caseTimeAssociationType(timeAssociationType);
				if (result == null) result = caseParameterInstanceRefType1(timeAssociationType);
				if (result == null) result = caseParameterRefType1(timeAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.TRANSFERRED_TO_RANGE_VERIFIER_TYPE: {
				TransferredToRangeVerifierType transferredToRangeVerifierType = (TransferredToRangeVerifierType)theEObject;
				T result = caseTransferredToRangeVerifierType(transferredToRangeVerifierType);
				if (result == null) result = caseCommandVerifierType(transferredToRangeVerifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.TRANSMISSION_CONSTRAINT_LIST_TYPE: {
				TransmissionConstraintListType transmissionConstraintListType = (TransmissionConstraintListType)theEObject;
				T result = caseTransmissionConstraintListType(transmissionConstraintListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.TRANSMISSION_CONSTRAINT_TYPE: {
				TransmissionConstraintType transmissionConstraintType = (TransmissionConstraintType)theEObject;
				T result = caseTransmissionConstraintType(transmissionConstraintType);
				if (result == null) result = caseMatchCriteriaType(transmissionConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.TRIGGER_TYPE: {
				TriggerType triggerType = (TriggerType)theEObject;
				T result = caseTriggerType(triggerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.UNIT_SET_TYPE: {
				UnitSetType unitSetType = (UnitSetType)theEObject;
				T result = caseUnitSetType(unitSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.UNIT_TYPE: {
				UnitType unitType = (UnitType)theEObject;
				T result = caseUnitType(unitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.VALID_RANGE_TYPE: {
				ValidRangeType validRangeType = (ValidRangeType)theEObject;
				T result = caseValidRangeType(validRangeType);
				if (result == null) result = caseDecimalRangeType(validRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.VALUE_ENUMERATION_TYPE: {
				ValueEnumerationType valueEnumerationType = (ValueEnumerationType)theEObject;
				T result = caseValueEnumerationType(valueEnumerationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.VARIABLE_FRAME_STREAM_TYPE: {
				VariableFrameStreamType variableFrameStreamType = (VariableFrameStreamType)theEObject;
				T result = caseVariableFrameStreamType(variableFrameStreamType);
				if (result == null) result = caseFrameStreamType(variableFrameStreamType);
				if (result == null) result = casePCMStreamType(variableFrameStreamType);
				if (result == null) result = caseNameDescriptionType(variableFrameStreamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XtcePackage.VERIFIERS_TYPE: {
				VerifiersType verifiersType = (VerifiersType)theEObject;
				T result = caseVerifiersType(verifiersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Time Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Time Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteTimeDataType(AbsoluteTimeDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accepted Verifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accepted Verifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptedVerifierType(AcceptedVerifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm Conditions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm Conditions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarmConditionsType(AlarmConditionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm Ranges Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm Ranges Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarmRangesType(AlarmRangesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algorithm Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algorithm Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgorithmSetType(AlgorithmSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algorithm Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algorithm Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgorithmTextType(AlgorithmTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasSetType(AliasSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasType(AliasType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AN Ded Conditions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AN Ded Conditions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANDedConditionsType(ANDedConditionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argumement Array Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argumement Array Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumementArrayTypeType(ArgumementArrayTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Assignment List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Assignment List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentAssignmentListType(ArgumentAssignmentListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Assignment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Assignment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentAssignmentType(ArgumentAssignmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentListType(ArgumentListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument List Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument List Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentListType1(ArgumentListType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Ref Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Ref Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentRefEntryType(ArgumentRefEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentType(ArgumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentType1(ArgumentType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Type Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Type Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentTypeSetType(ArgumentTypeSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Parameter Ref Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Parameter Ref Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayParameterRefEntryType(ArrayParameterRefEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Parameter Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Parameter Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayParameterTypeType(ArrayParameterTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorSetType(AuthorSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Invert Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Invert Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoInvertType(AutoInvertType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Container Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Container Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseContainerType(BaseContainerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Container Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Container Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseContainerType1(BaseContainerType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseDataType(BaseDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Meta Command Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Meta Command Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseMetaCommandType(BaseMetaCommandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Time Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Time Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseTimeDataType(BaseTimeDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Data Encoding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Data Encoding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryDataEncodingType(BinaryDataEncodingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryDataType(BinaryDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Meta Command Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Meta Command Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockMetaCommandType(BlockMetaCommandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanDataType(BooleanDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpressionType(BooleanExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Byte Order Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Byte Order Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByteOrderType(ByteOrderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Byte Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Byte Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByteType(ByteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calibrator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calibrator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalibratorType(CalibratorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeType(ChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Container Entry List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Container Entry List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandContainerEntryListType(CommandContainerEntryListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Container Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Container Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandContainerSetType(CommandContainerSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Container Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Container Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandContainerType(CommandContainerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Meta Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Meta Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandMetaDataType(CommandMetaDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Verifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Verifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandVerifierType(CommandVerifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Check Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Check Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonCheckType(ComparisonCheckType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonListType(ComparisonListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison List Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison List Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonListType1(ComparisonListType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonType(ComparisonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complete Verifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complete Verifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompleteVerifierType(CompleteVerifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Alarm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Alarm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalAlarmType(ConditionalAlarmType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantType(ConstantType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Ref Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Ref Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerRefEntryType(ContainerRefEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Ref Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Ref Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerRefSetType(ContainerRefSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerRefType(ContainerRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Segment Ref Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Segment Ref Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerSegmentRefEntryType(ContainerSegmentRefEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerSetType(ContainerSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerType(ContainerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Alarm List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Alarm List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextAlarmListType(ContextAlarmListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Alarm List Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Alarm List Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextAlarmListType1(ContextAlarmListType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Alarm List Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Alarm List Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextAlarmListType2(ContextAlarmListType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Alarm List Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Alarm List Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextAlarmListType3(ContextAlarmListType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Alarm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Alarm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextAlarmType(ContextAlarmType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Calibrator List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Calibrator List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextCalibratorListType(ContextCalibratorListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Calibrator List Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Calibrator List Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextCalibratorListType1(ContextCalibratorListType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Calibrator List Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Calibrator List Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextCalibratorListType2(ContextCalibratorListType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Calibrator List Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Calibrator List Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextCalibratorListType3(ContextCalibratorListType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Calibrator List Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Calibrator List Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextCalibratorListType4(ContextCalibratorListType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Calibrator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Calibrator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextCalibratorType(ContextCalibratorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Calibrator Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Calibrator Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextCalibratorType1(ContextCalibratorType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Calibrator Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Calibrator Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextCalibratorType2(ContextCalibratorType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Calibrator Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Calibrator Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextCalibratorType3(ContextCalibratorType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Significance List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Significance List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextSignificanceListType(ContextSignificanceListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Significance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Significance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextSignificanceType(ContextSignificanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CRC Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CRC Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCRCType(CRCType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Stream Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Stream Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomStreamType(CustomStreamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Encoding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Encoding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataEncodingType(DataEncodingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalRangeType(DecimalRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalValueType(DecimalValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defaults Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defaults Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultsType(DefaultsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionListType(DimensionListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionType(DimensionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Lookup List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Lookup List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteLookupListType(DiscreteLookupListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Lookup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Lookup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteLookupType(DiscreteLookupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicValueType(DynamicValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Value Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Value Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicValueType1(DynamicValueType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encoding Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encoding Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncodingType1(EncodingType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryListType(EntryListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedDataType(EnumeratedDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationListType(EnumerationListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Detect Correct Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Detect Correct Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorDetectCorrectType(ErrorDetectCorrectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Verifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Verifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionVerifierType(ExecutionVerifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Algorithm Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Algorithm Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalAlgorithmSetType(ExternalAlgorithmSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Algorithm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Algorithm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalAlgorithmType(ExternalAlgorithmType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Frame Stream Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Frame Stream Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedFrameStreamType(FixedFrameStreamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Frame Sync Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Frame Sync Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedFrameSyncStrategyType(FixedFrameSyncStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Value Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Value Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedValueEntryType(FixedValueEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flag Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlagType(FlagType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Argument Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Argument Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatArgumentTypeType(FloatArgumentTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Data Encoding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Data Encoding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatDataEncodingType(FloatDataEncodingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatDataType(FloatDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Parameter Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Parameter Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatParameterTypeType(FloatParameterTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame Stream Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame Stream Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrameStreamType(FrameStreamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderType(HeaderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistorySetType(HistorySetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indirect Parameter Ref Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indirect Parameter Ref Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndirectParameterRefEntryType(IndirectParameterRefEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Algorithm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Algorithm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputAlgorithmType(InputAlgorithmType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Output Algorithm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Output Algorithm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputOutputAlgorithmType(InputOutputAlgorithmType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Output Trigger Algorithm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Output Trigger Algorithm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputOutputTriggerAlgorithmType(InputOutputTriggerAlgorithmType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputSetType(InputSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Argument Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Argument Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerArgumentTypeType(IntegerArgumentTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Data Encoding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Data Encoding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerDataEncodingType(IntegerDataEncodingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerDataType(IntegerDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Parameter Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Parameter Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerParameterTypeType(IntegerParameterTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerRangeType(IntegerRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValueType(IntegerValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interlock Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interlock Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterlockType(InterlockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leading Size Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leading Size Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeadingSizeType(LeadingSizeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Adjustment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Adjustment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearAdjustmentType(LinearAdjustmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Adjustment Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Adjustment Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearAdjustmentType1(LinearAdjustmentType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location In Container In Bits Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location In Container In Bits Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationInContainerInBitsType(LocationInContainerInBitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Criteria Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Criteria Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchCriteriaType(MatchCriteriaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math Algorithm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Algorithm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathAlgorithmType(MathAlgorithmType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math Operation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Operation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathOperationType(MathOperationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math Operation Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Operation Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathOperationType1(MathOperationType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Ref Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Ref Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageRefSetType(MessageRefSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageRefType(MessageRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageSetType(MessageSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageType(MessageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Command Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Command Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaCommandSetType(MetaCommandSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Command Step List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Command Step List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaCommandStepListType(MetaCommandStepListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Command Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Command Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaCommandStepType(MetaCommandStepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Command Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Command Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaCommandType(MetaCommandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameDescriptionType(NameDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteSetType(NoteSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Format Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Format Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberFormatType(NumberFormatType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number To String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number To String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberToStringType(NumberToStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Alarm Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Alarm Condition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericAlarmConditionType(NumericAlarmConditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericDataType(NumericDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffsetType(OffsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ORed Conditions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ORed Conditions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORedConditionsType(ORedConditionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Parameter Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Parameter Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputParameterRefType(OutputParameterRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputSetType(OutputSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Instance Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Instance Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterInstanceRefType(ParameterInstanceRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Instance Ref Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Instance Ref Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterInstanceRefType1(ParameterInstanceRefType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterPropertiesType(ParameterPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Ref Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Ref Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterRefEntryType(ParameterRefEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterRefType(ParameterRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Ref Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Ref Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterRefType1(ParameterRefType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Segment Ref Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Segment Ref Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterSegmentRefEntryType(ParameterSegmentRefEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterSetType(ParameterSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter To Set List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter To Set List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterToSetListType(ParameterToSetListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter To Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter To Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterToSetType(ParameterToSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter To Set Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter To Set Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterToSetType1(ParameterToSetType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterType(ParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterTypeSetType(ParameterTypeSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterValueChangeType(ParameterValueChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParityType(ParityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Stream Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Stream Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMStreamType(PCMStreamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Address Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Address Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalAddressSetType(PhysicalAddressSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalAddressType(PhysicalAddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Address Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Address Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalAddressType1(PhysicalAddressType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polynomial Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polynomial Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolynomialType(PolynomialType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queued Verifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queued Verifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueuedVerifierType(QueuedVerifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Enumeration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeEnumerationType(RangeEnumerationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rate In Stream Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rate In Stream Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRateInStreamSetType(RateInStreamSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rate In Stream Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rate In Stream Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRateInStreamType(RateInStreamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rate In Stream Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rate In Stream Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRateInStreamType1(RateInStreamType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Received Verifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Received Verifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceivedVerifierType(ReceivedVerifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceTimeType(ReferenceTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Time Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Time Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeTimeDataType(RelativeTimeDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatType(RepeatType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restriction Criteria Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restriction Criteria Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictionCriteriaType(RestrictionCriteriaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restriction Criteria Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restriction Criteria Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictionCriteriaType1(RestrictionCriteriaType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sent From Range Verifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sent From Range Verifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSentFromRangeVerifierType(SentFromRangeVerifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Container Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Container Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceContainerType(SequenceContainerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceEntryType(SequenceEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRefType(ServiceRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceSetType(ServiceSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceType(ServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Significance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Significance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignificanceType(SignificanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Algorithm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Algorithm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleAlgorithmType(SimpleAlgorithmType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size In Bits Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size In Bits Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSizeInBitsType(SizeInBitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Space System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Space System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpaceSystemType(SpaceSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spline Calibrator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spline Calibrator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplineCalibratorType(SplineCalibratorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spline Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spline Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplinePointType(SplinePointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stream Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreamRefType(StreamRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stream Segment Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream Segment Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreamSegmentEntryType(StreamSegmentEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stream Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreamSetType(StreamSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Data Encoding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Data Encoding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringDataEncodingType(StringDataEncodingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringDataType(StringDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sync Pattern Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sync Pattern Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyncPatternType(SyncPatternType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sync Pattern Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sync Pattern Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyncPatternType1(SyncPatternType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sync Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sync Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyncStrategyType(SyncStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sync Strategy Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sync Strategy Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyncStrategyType1(SyncStrategyType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sync Strategy Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sync Strategy Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyncStrategyType2(SyncStrategyType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telemetry Meta Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telemetry Meta Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelemetryMetaDataType(TelemetryMetaDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermType(TermType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeAssociationType(TimeAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transferred To Range Verifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transferred To Range Verifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferredToRangeVerifierType(TransferredToRangeVerifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Constraint List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Constraint List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionConstraintListType(TransmissionConstraintListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmissionConstraintType(TransmissionConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerType(TriggerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitSetType(UnitSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitType(UnitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidRangeType(ValidRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Enumeration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueEnumerationType(ValueEnumerationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Frame Stream Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Frame Stream Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableFrameStreamType(VariableFrameStreamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verifiers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verifiers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerifiersType(VerifiersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //XtceSwitch
