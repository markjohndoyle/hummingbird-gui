/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.omg.space.xtce.XtceFactory;
import org.omg.space.xtce.XtcePackage;

import org.omg.space.xtce.util.XtceValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XtcePackageImpl extends EPackageImpl implements XtcePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "xtce.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteTimeDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptedVerifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmConditionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmRangesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anDedConditionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumementArrayTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentAssignmentListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentAssignmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentListType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentRefEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentTypeSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayParameterRefEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayParameterTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoInvertTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseContainerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseContainerType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseMetaCommandTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseTimeDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryDataEncodingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockMetaCommandTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byteOrderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calibratorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandContainerEntryListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandContainerSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandContainerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandMetaDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandVerifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonCheckTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonListType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completeVerifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalAlarmTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerRefEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerRefSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerSegmentRefEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextAlarmListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextAlarmListType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextAlarmListType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextAlarmListType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextAlarmTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextCalibratorListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextCalibratorListType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextCalibratorListType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextCalibratorListType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextCalibratorListType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextCalibratorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextCalibratorType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextCalibratorType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextCalibratorType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextSignificanceListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextSignificanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customStreamTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEncodingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteLookupListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteLookupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicValueType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encodingType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorDetectCorrectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionVerifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalAlgorithmSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalAlgorithmTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedFrameStreamTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedFrameSyncStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedValueEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flagTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatArgumentTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatDataEncodingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatParameterTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameStreamTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historySetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indirectParameterRefEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputAlgorithmTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputOutputAlgorithmTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputOutputTriggerAlgorithmTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerArgumentTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerDataEncodingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerParameterTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interlockTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leadingSizeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearAdjustmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearAdjustmentType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationInContainerInBitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchCriteriaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mathAlgorithmTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mathOperationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mathOperationType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageRefSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaCommandSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaCommandStepListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaCommandStepTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaCommandTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberFormatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberToStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericAlarmConditionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offsetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oRedConditionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputParameterRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterInstanceRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterInstanceRefType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterRefEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterRefType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSegmentRefEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterToSetListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterToSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterToSetType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueChangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmStreamTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalAddressSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalAddressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalAddressType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polynomialTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queuedVerifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeEnumerationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rateInStreamSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rateInStreamTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rateInStreamType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receivedVerifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeTimeDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionCriteriaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionCriteriaType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sentFromRangeVerifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceContainerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass significanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleAlgorithmTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeInBitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spaceSystemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splineCalibratorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splinePointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamSegmentEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringDataEncodingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syncPatternTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syncPatternType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syncStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syncStrategyType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syncStrategyType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telemetryMetaDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferredToRangeVerifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transmissionConstraintListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transmissionConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEnumerationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableFrameStreamTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verifiersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basisTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bitOrderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum characterWidthTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonOperatorsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consequenceLevelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataSourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encodingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encodingType2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encodingType3EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum epochTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flagBitTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mathOperatorsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum notationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pcmTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum radixTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceLocationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sizeInBitsType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sizeInBitsType2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum validationStatusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verificationToWaitForTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verifierToTriggerOnTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType basisTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType binaryTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bitOrderTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType characterWidthTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType comparisonOperatorsTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType consequenceLevelTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataSourceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType encodingTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType encodingTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType encodingTypeObject2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType epochTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType epochTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fixedIntegerValueTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType flagBitTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hexadecimalTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mathOperatorsTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameReferenceTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType notationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType octalTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pcmTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType radixTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType referenceLocationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType referenceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType referenceTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relativeTimeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sizeInBitsTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sizeInBitsTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitsTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType validationStatusTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType verificationToWaitForTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType verifierToTriggerOnTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.omg.space.xtce.XtcePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XtcePackageImpl() {
		super(eNS_URI, XtceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XtcePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static XtcePackage init() {
		if (isInited) return (XtcePackage)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI);

		// Obtain or create and register package
		XtcePackageImpl theXtcePackage = (XtcePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XtcePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XtcePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		theXtcePackage.loadPackage();

		// Fix loaded packages
		theXtcePackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theXtcePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return XtceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theXtcePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XtcePackage.eNS_URI, theXtcePackage);
		return theXtcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteTimeDataType() {
		if (absoluteTimeDataTypeEClass == null) {
			absoluteTimeDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(0);
		}
		return absoluteTimeDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptedVerifierType() {
		if (acceptedVerifierTypeEClass == null) {
			acceptedVerifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(1);
		}
		return acceptedVerifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlarmConditionsType() {
		if (alarmConditionsTypeEClass == null) {
			alarmConditionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(2);
		}
		return alarmConditionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlarmConditionsType_WatchAlarm() {
        return (EReference)getAlarmConditionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlarmConditionsType_WarningAlarm() {
        return (EReference)getAlarmConditionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlarmConditionsType_DistressAlarm() {
        return (EReference)getAlarmConditionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlarmConditionsType_CritialAlarm() {
        return (EReference)getAlarmConditionsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlarmConditionsType_SevereAlarm() {
        return (EReference)getAlarmConditionsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlarmRangesType() {
		if (alarmRangesTypeEClass == null) {
			alarmRangesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(3);
		}
		return alarmRangesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlarmRangesType_WatchRange() {
        return (EReference)getAlarmRangesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlarmRangesType_WarningRange() {
        return (EReference)getAlarmRangesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlarmRangesType_DistressRange() {
        return (EReference)getAlarmRangesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlarmRangesType_CriticalRange() {
        return (EReference)getAlarmRangesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlarmRangesType_SevereRange() {
        return (EReference)getAlarmRangesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlarmRangesType_AppliesToCalibratedValues() {
        return (EAttribute)getAlarmRangesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgorithmSetType() {
		if (algorithmSetTypeEClass == null) {
			algorithmSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(4);
		}
		return algorithmSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgorithmSetType_Group() {
        return (EAttribute)getAlgorithmSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithmSetType_CustomAlgorithm() {
        return (EReference)getAlgorithmSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithmSetType_MathAlgorithm() {
        return (EReference)getAlgorithmSetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgorithmTextType() {
		if (algorithmTextTypeEClass == null) {
			algorithmTextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(5);
		}
		return algorithmTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgorithmTextType_Value() {
        return (EAttribute)getAlgorithmTextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgorithmTextType_Language() {
        return (EAttribute)getAlgorithmTextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasSetType() {
		if (aliasSetTypeEClass == null) {
			aliasSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(6);
		}
		return aliasSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasSetType_Alias() {
        return (EReference)getAliasSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasType() {
		if (aliasTypeEClass == null) {
			aliasTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(7);
		}
		return aliasTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasType_Alias() {
        return (EAttribute)getAliasType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasType_NameSpace() {
        return (EAttribute)getAliasType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANDedConditionsType() {
		if (anDedConditionsTypeEClass == null) {
			anDedConditionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(8);
		}
		return anDedConditionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getANDedConditionsType_Group() {
        return (EAttribute)getANDedConditionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getANDedConditionsType_Condition() {
        return (EReference)getANDedConditionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getANDedConditionsType_ORedConditions() {
        return (EReference)getANDedConditionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumementArrayTypeType() {
		if (argumementArrayTypeTypeEClass == null) {
			argumementArrayTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(9);
		}
		return argumementArrayTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumementArrayTypeType_ArrayType() {
        return (EAttribute)getArgumementArrayTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumementArrayTypeType_NumberOfDimensions() {
        return (EAttribute)getArgumementArrayTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentAssignmentListType() {
		if (argumentAssignmentListTypeEClass == null) {
			argumentAssignmentListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(10);
		}
		return argumentAssignmentListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentAssignmentListType_ArgumentAssignment() {
        return (EReference)getArgumentAssignmentListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentAssignmentType() {
		if (argumentAssignmentTypeEClass == null) {
			argumentAssignmentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(11);
		}
		return argumentAssignmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentAssignmentType_ArgumentName() {
        return (EAttribute)getArgumentAssignmentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentAssignmentType_ArgumentValue() {
        return (EAttribute)getArgumentAssignmentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentListType() {
		if (argumentListTypeEClass == null) {
			argumentListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(12);
		}
		return argumentListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentListType_Argument() {
        return (EReference)getArgumentListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentListType1() {
		if (argumentListType1EClass == null) {
			argumentListType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(13);
		}
		return argumentListType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentListType1_Group() {
        return (EAttribute)getArgumentListType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentListType1_Argument() {
        return (EReference)getArgumentListType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentRefEntryType() {
		if (argumentRefEntryTypeEClass == null) {
			argumentRefEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(14);
		}
		return argumentRefEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentRefEntryType_ArgumentRef() {
        return (EAttribute)getArgumentRefEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentType() {
		if (argumentTypeEClass == null) {
			argumentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(15);
		}
		return argumentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentType_Name() {
        return (EAttribute)getArgumentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentType_Value() {
        return (EAttribute)getArgumentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentType1() {
		if (argumentType1EClass == null) {
			argumentType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(16);
		}
		return argumentType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentType1_ArgumentTypeRef() {
        return (EAttribute)getArgumentType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentTypeSetType() {
		if (argumentTypeSetTypeEClass == null) {
			argumentTypeSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(17);
		}
		return argumentTypeSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentTypeSetType_Group() {
        return (EAttribute)getArgumentTypeSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentTypeSetType_StringArgumentType() {
        return (EReference)getArgumentTypeSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentTypeSetType_EnumeratedArgumentType() {
        return (EReference)getArgumentTypeSetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentTypeSetType_IntegerArgumentType() {
        return (EReference)getArgumentTypeSetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentTypeSetType_BinaryArgumentType() {
        return (EReference)getArgumentTypeSetType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentTypeSetType_FloatArgumentType() {
        return (EReference)getArgumentTypeSetType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentTypeSetType_BooleanArgumentType() {
        return (EReference)getArgumentTypeSetType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentTypeSetType_RelativeTimeAgumentType() {
        return (EReference)getArgumentTypeSetType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentTypeSetType_AbsoluteTimeArgumentType() {
        return (EReference)getArgumentTypeSetType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentTypeSetType_ArgumementArrayType() {
        return (EReference)getArgumentTypeSetType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayParameterRefEntryType() {
		if (arrayParameterRefEntryTypeEClass == null) {
			arrayParameterRefEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(18);
		}
		return arrayParameterRefEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayParameterRefEntryType_DimensionList() {
        return (EReference)getArrayParameterRefEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayParameterRefEntryType_LastEntryForThisArrayInstance() {
        return (EAttribute)getArrayParameterRefEntryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayParameterRefEntryType_ParameterRef() {
        return (EAttribute)getArrayParameterRefEntryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayParameterTypeType() {
		if (arrayParameterTypeTypeEClass == null) {
			arrayParameterTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(19);
		}
		return arrayParameterTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayParameterTypeType_ArrayTypeRef() {
        return (EAttribute)getArrayParameterTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayParameterTypeType_NumberOfDimensions() {
        return (EAttribute)getArrayParameterTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorSetType() {
		if (authorSetTypeEClass == null) {
			authorSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(20);
		}
		return authorSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorSetType_Author() {
        return (EAttribute)getAuthorSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutoInvertType() {
		if (autoInvertTypeEClass == null) {
			autoInvertTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(21);
		}
		return autoInvertTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutoInvertType_InvertAlgorithm() {
        return (EReference)getAutoInvertType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutoInvertType_BadFramesToAutoInvert() {
        return (EAttribute)getAutoInvertType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseContainerType() {
		if (baseContainerTypeEClass == null) {
			baseContainerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(22);
		}
		return baseContainerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseContainerType_RestrictionCriteria() {
        return (EReference)getBaseContainerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseContainerType_ContainerRef() {
        return (EAttribute)getBaseContainerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseContainerType1() {
		if (baseContainerType1EClass == null) {
			baseContainerType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(23);
		}
		return baseContainerType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseContainerType1_RestrictionCriteria() {
        return (EReference)getBaseContainerType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseContainerType1_ContainerRef() {
        return (EAttribute)getBaseContainerType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseDataType() {
		if (baseDataTypeEClass == null) {
			baseDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(24);
		}
		return baseDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseDataType_UnitSet() {
        return (EReference)getBaseDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseDataType_BinaryDataEncoding() {
        return (EReference)getBaseDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseDataType_FloatDataEncoding() {
        return (EReference)getBaseDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseDataType_IntegerDataEncoding() {
        return (EReference)getBaseDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseDataType_StringDataEncoding() {
        return (EReference)getBaseDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseMetaCommandType() {
		if (baseMetaCommandTypeEClass == null) {
			baseMetaCommandTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(25);
		}
		return baseMetaCommandTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseMetaCommandType_ArgumentAssignmentList() {
        return (EReference)getBaseMetaCommandType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseMetaCommandType_MetaCommandRef() {
        return (EAttribute)getBaseMetaCommandType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseTimeDataType() {
		if (baseTimeDataTypeEClass == null) {
			baseTimeDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(26);
		}
		return baseTimeDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseTimeDataType_Encoding() {
        return (EReference)getBaseTimeDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseTimeDataType_ReferenceTime() {
        return (EReference)getBaseTimeDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryDataEncodingType() {
		if (binaryDataEncodingTypeEClass == null) {
			binaryDataEncodingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(29);
		}
		return binaryDataEncodingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryDataEncodingType_SizeInBits() {
        return (EReference)getBinaryDataEncodingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryDataEncodingType_FromBinaryTransformAlgorithm() {
        return (EReference)getBinaryDataEncodingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryDataEncodingType_ToBinaryTransformAlgorithm() {
        return (EReference)getBinaryDataEncodingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryDataType() {
		if (binaryDataTypeEClass == null) {
			binaryDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(30);
		}
		return binaryDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryDataType_InitialValue() {
        return (EAttribute)getBinaryDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockMetaCommandType() {
		if (blockMetaCommandTypeEClass == null) {
			blockMetaCommandTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(34);
		}
		return blockMetaCommandTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockMetaCommandType_MetaCommandStepList() {
        return (EReference)getBlockMetaCommandType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanDataType() {
		if (booleanDataTypeEClass == null) {
			booleanDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(35);
		}
		return booleanDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanDataType_InitialValue() {
        return (EAttribute)getBooleanDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanDataType_OneStringValue() {
        return (EAttribute)getBooleanDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanDataType_ZeroStringValue() {
        return (EAttribute)getBooleanDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpressionType() {
		if (booleanExpressionTypeEClass == null) {
			booleanExpressionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(36);
		}
		return booleanExpressionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanExpressionType_Condition() {
        return (EReference)getBooleanExpressionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanExpressionType_ANDedConditions() {
        return (EReference)getBooleanExpressionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanExpressionType_ORedConditions() {
        return (EReference)getBooleanExpressionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByteOrderType() {
		if (byteOrderTypeEClass == null) {
			byteOrderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(37);
		}
		return byteOrderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getByteOrderType_Group() {
        return (EAttribute)getByteOrderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getByteOrderType_Byte() {
        return (EReference)getByteOrderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByteType() {
		if (byteTypeEClass == null) {
			byteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(38);
		}
		return byteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getByteType_ByteSignificance() {
        return (EAttribute)getByteType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalibratorType() {
		if (calibratorTypeEClass == null) {
			calibratorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(39);
		}
		return calibratorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalibratorType_SplineCalibrator() {
        return (EReference)getCalibratorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalibratorType_PolynomialCalibrator() {
        return (EReference)getCalibratorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalibratorType_Name() {
        return (EAttribute)getCalibratorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeType() {
		if (changeTypeEClass == null) {
			changeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(40);
		}
		return changeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeType_Value() {
        return (EAttribute)getChangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandContainerEntryListType() {
		if (commandContainerEntryListTypeEClass == null) {
			commandContainerEntryListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(43);
		}
		return commandContainerEntryListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandContainerEntryListType_Group() {
        return (EAttribute)getCommandContainerEntryListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandContainerEntryListType_ParameterRefEntry() {
        return (EReference)getCommandContainerEntryListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandContainerEntryListType_ParameterSegmentRefEntry() {
        return (EReference)getCommandContainerEntryListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandContainerEntryListType_ContainerRefEntry() {
        return (EReference)getCommandContainerEntryListType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandContainerEntryListType_ContainerSegmentRefEntry() {
        return (EReference)getCommandContainerEntryListType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandContainerEntryListType_StreamSegmentEntry() {
        return (EReference)getCommandContainerEntryListType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandContainerEntryListType_IndirectParameterRefEntry() {
        return (EReference)getCommandContainerEntryListType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandContainerEntryListType_ArrayParameterRefEntry() {
        return (EReference)getCommandContainerEntryListType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandContainerEntryListType_ArgumentRefEntry() {
        return (EReference)getCommandContainerEntryListType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandContainerEntryListType_ArrayArgumentRefEntry() {
        return (EReference)getCommandContainerEntryListType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandContainerEntryListType_FixedValueEntry() {
        return (EReference)getCommandContainerEntryListType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandContainerSetType() {
		if (commandContainerSetTypeEClass == null) {
			commandContainerSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(44);
		}
		return commandContainerSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandContainerSetType_CommandContainer() {
        return (EReference)getCommandContainerSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandContainerType() {
		if (commandContainerTypeEClass == null) {
			commandContainerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(45);
		}
		return commandContainerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandContainerType_EntryList() {
        return (EReference)getCommandContainerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandContainerType_BaseContainer() {
        return (EReference)getCommandContainerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandMetaDataType() {
		if (commandMetaDataTypeEClass == null) {
			commandMetaDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(46);
		}
		return commandMetaDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandMetaDataType_ParameterTypeSet() {
        return (EReference)getCommandMetaDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandMetaDataType_ParameterSet() {
        return (EReference)getCommandMetaDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandMetaDataType_ArgumentTypeSet() {
        return (EReference)getCommandMetaDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandMetaDataType_MetaCommandSet() {
        return (EReference)getCommandMetaDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandMetaDataType_CommandContainerSet() {
        return (EReference)getCommandMetaDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandMetaDataType_StreamSet() {
        return (EReference)getCommandMetaDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandMetaDataType_AlgorithmSet() {
        return (EReference)getCommandMetaDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandVerifierType() {
		if (commandVerifierTypeEClass == null) {
			commandVerifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(47);
		}
		return commandVerifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandVerifierType_Comparison() {
        return (EReference)getCommandVerifierType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandVerifierType_ComparisonList() {
        return (EReference)getCommandVerifierType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandVerifierType_BooleanExpression() {
        return (EReference)getCommandVerifierType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandVerifierType_ContainerRef() {
        return (EReference)getCommandVerifierType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandVerifierType_ParameterValueChange() {
        return (EReference)getCommandVerifierType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandVerifierType_CustomAlgorithm() {
        return (EReference)getCommandVerifierType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandVerifierType_TimeToWait() {
        return (EAttribute)getCommandVerifierType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonCheckType() {
		if (comparisonCheckTypeEClass == null) {
			comparisonCheckTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(48);
		}
		return comparisonCheckTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparisonCheckType_ParameterInstanceRef() {
        return (EReference)getComparisonCheckType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonCheckType_ComparisonOperator() {
        return (EAttribute)getComparisonCheckType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparisonCheckType_ParameterInstanceRef1() {
        return (EReference)getComparisonCheckType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonCheckType_Value() {
        return (EAttribute)getComparisonCheckType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonListType() {
		if (comparisonListTypeEClass == null) {
			comparisonListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(49);
		}
		return comparisonListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparisonListType_Comparison() {
        return (EReference)getComparisonListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonListType1() {
		if (comparisonListType1EClass == null) {
			comparisonListType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(50);
		}
		return comparisonListType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparisonListType1_Comparison() {
        return (EReference)getComparisonListType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonType() {
		if (comparisonTypeEClass == null) {
			comparisonTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(53);
		}
		return comparisonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonType_ComparisonOperator() {
        return (EAttribute)getComparisonType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonType_Value1() {
        return (EAttribute)getComparisonType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompleteVerifierType() {
		if (completeVerifierTypeEClass == null) {
			completeVerifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(54);
		}
		return completeVerifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompleteVerifierType_ReturnParmRef() {
        return (EReference)getCompleteVerifierType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalAlarmType() {
		if (conditionalAlarmTypeEClass == null) {
			conditionalAlarmTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(55);
		}
		return conditionalAlarmTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalAlarmType_StaticAlarmConditions() {
        return (EReference)getConditionalAlarmType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalAlarmType_ChangePerSecondAlarmConditions() {
        return (EReference)getConditionalAlarmType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantType() {
		if (constantTypeEClass == null) {
			constantTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(58);
		}
		return constantTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantType_ConstantName() {
        return (EAttribute)getConstantType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantType_Value() {
        return (EAttribute)getConstantType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerRefEntryType() {
		if (containerRefEntryTypeEClass == null) {
			containerRefEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(59);
		}
		return containerRefEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerRefEntryType_ContainerRef() {
        return (EAttribute)getContainerRefEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerRefSetType() {
		if (containerRefSetTypeEClass == null) {
			containerRefSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(60);
		}
		return containerRefSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerRefSetType_ContainerRef() {
        return (EReference)getContainerRefSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerRefType() {
		if (containerRefTypeEClass == null) {
			containerRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(61);
		}
		return containerRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerRefType_ContainerRef() {
        return (EAttribute)getContainerRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerSegmentRefEntryType() {
		if (containerSegmentRefEntryTypeEClass == null) {
			containerSegmentRefEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(62);
		}
		return containerSegmentRefEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerSegmentRefEntryType_ContainerRef() {
        return (EAttribute)getContainerSegmentRefEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerSegmentRefEntryType_Order() {
        return (EAttribute)getContainerSegmentRefEntryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerSegmentRefEntryType_SizeInBits() {
        return (EAttribute)getContainerSegmentRefEntryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerSetType() {
		if (containerSetTypeEClass == null) {
			containerSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(63);
		}
		return containerSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerSetType_Group() {
        return (EAttribute)getContainerSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerSetType_SequenceContainer() {
        return (EReference)getContainerSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerType() {
		if (containerTypeEClass == null) {
			containerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(64);
		}
		return containerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerType_DefaultRateInStream() {
        return (EReference)getContainerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerType_RateInStreamSet() {
        return (EReference)getContainerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerType_BinaryEncoding() {
        return (EReference)getContainerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextAlarmListType() {
		if (contextAlarmListTypeEClass == null) {
			contextAlarmListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(65);
		}
		return contextAlarmListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAlarmListType_ContextAlarm() {
        return (EReference)getContextAlarmListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextAlarmListType1() {
		if (contextAlarmListType1EClass == null) {
			contextAlarmListType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(66);
		}
		return contextAlarmListType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAlarmListType1_ContextAlarm() {
        return (EReference)getContextAlarmListType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextAlarmListType2() {
		if (contextAlarmListType2EClass == null) {
			contextAlarmListType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(67);
		}
		return contextAlarmListType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAlarmListType2_ContextAlarm() {
        return (EReference)getContextAlarmListType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextAlarmListType3() {
		if (contextAlarmListType3EClass == null) {
			contextAlarmListType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(68);
		}
		return contextAlarmListType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAlarmListType3_ContextAlarm() {
        return (EReference)getContextAlarmListType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextAlarmType() {
		if (contextAlarmTypeEClass == null) {
			contextAlarmTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(69);
		}
		return contextAlarmTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAlarmType_ContextMatch() {
        return (EReference)getContextAlarmType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextCalibratorListType() {
		if (contextCalibratorListTypeEClass == null) {
			contextCalibratorListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(70);
		}
		return contextCalibratorListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextCalibratorListType_ContextCalibrator() {
        return (EReference)getContextCalibratorListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextCalibratorListType1() {
		if (contextCalibratorListType1EClass == null) {
			contextCalibratorListType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(71);
		}
		return contextCalibratorListType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextCalibratorListType1_ContextCalibrator() {
        return (EReference)getContextCalibratorListType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextCalibratorListType2() {
		if (contextCalibratorListType2EClass == null) {
			contextCalibratorListType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(72);
		}
		return contextCalibratorListType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextCalibratorListType2_ContextCalibrator() {
        return (EReference)getContextCalibratorListType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextCalibratorListType3() {
		if (contextCalibratorListType3EClass == null) {
			contextCalibratorListType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(73);
		}
		return contextCalibratorListType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextCalibratorListType3_ContextCalibrator() {
        return (EReference)getContextCalibratorListType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextCalibratorListType4() {
		if (contextCalibratorListType4EClass == null) {
			contextCalibratorListType4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(74);
		}
		return contextCalibratorListType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextCalibratorListType4_ContextCalibrator() {
        return (EReference)getContextCalibratorListType4().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextCalibratorType() {
		if (contextCalibratorTypeEClass == null) {
			contextCalibratorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(75);
		}
		return contextCalibratorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextCalibratorType_UseWhenCondition() {
        return (EReference)getContextCalibratorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextCalibratorType_Calibrator() {
        return (EReference)getContextCalibratorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextCalibratorType1() {
		if (contextCalibratorType1EClass == null) {
			contextCalibratorType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(76);
		}
		return contextCalibratorType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextCalibratorType1_UseWhenCondition() {
        return (EReference)getContextCalibratorType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextCalibratorType1_Calibrator() {
        return (EReference)getContextCalibratorType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextCalibratorType2() {
		if (contextCalibratorType2EClass == null) {
			contextCalibratorType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(77);
		}
		return contextCalibratorType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextCalibratorType2_ContextMatch() {
        return (EReference)getContextCalibratorType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextCalibratorType2_Calibrator() {
        return (EReference)getContextCalibratorType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextCalibratorType3() {
		if (contextCalibratorType3EClass == null) {
			contextCalibratorType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(78);
		}
		return contextCalibratorType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextCalibratorType3_UseWhenCondition() {
        return (EReference)getContextCalibratorType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextCalibratorType3_Calibrator() {
        return (EReference)getContextCalibratorType3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextSignificanceListType() {
		if (contextSignificanceListTypeEClass == null) {
			contextSignificanceListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(79);
		}
		return contextSignificanceListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextSignificanceListType_ContextSignificance() {
        return (EReference)getContextSignificanceListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextSignificanceType() {
		if (contextSignificanceTypeEClass == null) {
			contextSignificanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(80);
		}
		return contextSignificanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextSignificanceType_ContextMatch() {
        return (EReference)getContextSignificanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextSignificanceType_Significance() {
        return (EReference)getContextSignificanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCRCType() {
		if (crcTypeEClass == null) {
			crcTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(81);
		}
		return crcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCRCType_Polynomial() {
        return (EReference)getCRCType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRCType_BitsFromReference() {
        return (EAttribute)getCRCType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRCType_Reference() {
        return (EAttribute)getCRCType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomStreamType() {
		if (customStreamTypeEClass == null) {
			customStreamTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(82);
		}
		return customStreamTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomStreamType_EncodingAlgorithm() {
        return (EReference)getCustomStreamType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomStreamType_DecodingAlgorithm() {
        return (EReference)getCustomStreamType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomStreamType_DecodedStreamRef() {
        return (EAttribute)getCustomStreamType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomStreamType_EncodedStreamRef() {
        return (EAttribute)getCustomStreamType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataEncodingType() {
		if (dataEncodingTypeEClass == null) {
			dataEncodingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(83);
		}
		return dataEncodingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataEncodingType_ErrorDetectCorrect() {
        return (EReference)getDataEncodingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataEncodingType_ByteOrderList() {
        return (EReference)getDataEncodingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataEncodingType_BitOrder() {
        return (EAttribute)getDataEncodingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalRangeType() {
		if (decimalRangeTypeEClass == null) {
			decimalRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(86);
		}
		return decimalRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalRangeType_MaxExclusive() {
        return (EAttribute)getDecimalRangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalRangeType_MaxInclusive() {
        return (EAttribute)getDecimalRangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalRangeType_MinExclusive() {
        return (EAttribute)getDecimalRangeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalRangeType_MinInclusive() {
        return (EAttribute)getDecimalRangeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalValueType() {
		if (decimalValueTypeEClass == null) {
			decimalValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(87);
		}
		return decimalValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalValueType_FixedValue() {
        return (EAttribute)getDecimalValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecimalValueType_DynamicValue() {
        return (EReference)getDecimalValueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultsType() {
		if (defaultsTypeEClass == null) {
			defaultsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(88);
		}
		return defaultsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultsType_DefaultDataEncoding() {
        return (EReference)getDefaultsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultsType_ParameterTimeAssociation() {
        return (EReference)getDefaultsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionListType() {
		if (dimensionListTypeEClass == null) {
			dimensionListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(89);
		}
		return dimensionListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionListType_Dimension() {
        return (EReference)getDimensionListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionType() {
		if (dimensionTypeEClass == null) {
			dimensionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(90);
		}
		return dimensionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionType_StartingIndex() {
        return (EReference)getDimensionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionType_EndingIndex() {
        return (EReference)getDimensionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteLookupListType() {
		if (discreteLookupListTypeEClass == null) {
			discreteLookupListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(91);
		}
		return discreteLookupListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscreteLookupListType_DiscreteLookup() {
        return (EReference)getDiscreteLookupListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteLookupType() {
		if (discreteLookupTypeEClass == null) {
			discreteLookupTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(92);
		}
		return discreteLookupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteLookupType_Value() {
        return (EAttribute)getDiscreteLookupType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(93);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SpaceSystem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicValueType() {
		if (dynamicValueTypeEClass == null) {
			dynamicValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(94);
		}
		return dynamicValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicValueType_ParameterInstanceRef() {
        return (EReference)getDynamicValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicValueType_LinearAdjustment() {
        return (EReference)getDynamicValueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicValueType1() {
		if (dynamicValueType1EClass == null) {
			dynamicValueType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(95);
		}
		return dynamicValueType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicValueType1_ParameterInstanceRef() {
        return (EReference)getDynamicValueType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicValueType1_LinearAdjustment() {
        return (EReference)getDynamicValueType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncodingType1() {
		if (encodingType1EClass == null) {
			encodingType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(97);
		}
		return encodingType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncodingType1_BinaryDataEncoding() {
        return (EReference)getEncodingType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncodingType1_FloatDataEncoding() {
        return (EReference)getEncodingType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncodingType1_IntegerDataEncoding() {
        return (EReference)getEncodingType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncodingType1_StringDataEncoding() {
        return (EReference)getEncodingType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncodingType1_Offset() {
        return (EAttribute)getEncodingType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncodingType1_Scale() {
        return (EAttribute)getEncodingType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncodingType1_Units() {
        return (EAttribute)getEncodingType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryListType() {
		if (entryListTypeEClass == null) {
			entryListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(103);
		}
		return entryListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryListType_Group() {
        return (EAttribute)getEntryListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryListType_ParameterRefEntry() {
        return (EReference)getEntryListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryListType_ParameterSegmentRefEntry() {
        return (EReference)getEntryListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryListType_ContainerRefEntry() {
        return (EReference)getEntryListType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryListType_ContainerSegmentRefEntry() {
        return (EReference)getEntryListType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryListType_StreamSegmentEntry() {
        return (EReference)getEntryListType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryListType_IndirectParameterRefEntry() {
        return (EReference)getEntryListType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryListType_ArrayParameterRefEntry() {
        return (EReference)getEntryListType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeratedDataType() {
		if (enumeratedDataTypeEClass == null) {
			enumeratedDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(104);
		}
		return enumeratedDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedDataType_EnumerationList() {
        return (EReference)getEnumeratedDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeratedDataType_InitialValue() {
        return (EAttribute)getEnumeratedDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationListType() {
		if (enumerationListTypeEClass == null) {
			enumerationListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(105);
		}
		return enumerationListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationListType_Enumeration() {
        return (EReference)getEnumerationListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorDetectCorrectType() {
		if (errorDetectCorrectTypeEClass == null) {
			errorDetectCorrectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(109);
		}
		return errorDetectCorrectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorDetectCorrectType_Parity() {
        return (EReference)getErrorDetectCorrectType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorDetectCorrectType_CRC() {
        return (EReference)getErrorDetectCorrectType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionVerifierType() {
		if (executionVerifierTypeEClass == null) {
			executionVerifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(110);
		}
		return executionVerifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionVerifierType_PercentComplete() {
        return (EReference)getExecutionVerifierType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalAlgorithmSetType() {
		if (externalAlgorithmSetTypeEClass == null) {
			externalAlgorithmSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(111);
		}
		return externalAlgorithmSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalAlgorithmSetType_ExternalAlgorithm() {
        return (EReference)getExternalAlgorithmSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalAlgorithmType() {
		if (externalAlgorithmTypeEClass == null) {
			externalAlgorithmTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(112);
		}
		return externalAlgorithmTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalAlgorithmType_AlgorithmLocation() {
        return (EAttribute)getExternalAlgorithmType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalAlgorithmType_ImplementationName() {
        return (EAttribute)getExternalAlgorithmType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedFrameStreamType() {
		if (fixedFrameStreamTypeEClass == null) {
			fixedFrameStreamTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(113);
		}
		return fixedFrameStreamTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFixedFrameStreamType_SyncStrategy() {
        return (EReference)getFixedFrameStreamType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedFrameStreamType_FrameLengthInBits() {
        return (EAttribute)getFixedFrameStreamType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedFrameStreamType_SyncApertureInBits() {
        return (EAttribute)getFixedFrameStreamType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedFrameSyncStrategyType() {
		if (fixedFrameSyncStrategyTypeEClass == null) {
			fixedFrameSyncStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(114);
		}
		return fixedFrameSyncStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFixedFrameSyncStrategyType_SyncPattern() {
        return (EReference)getFixedFrameSyncStrategyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedValueEntryType() {
		if (fixedValueEntryTypeEClass == null) {
			fixedValueEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(116);
		}
		return fixedValueEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedValueEntryType_BinaryValue() {
        return (EAttribute)getFixedValueEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedValueEntryType_SizeInBits() {
        return (EAttribute)getFixedValueEntryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlagType() {
		if (flagTypeEClass == null) {
			flagTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(119);
		}
		return flagTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlagType_FlagBitType() {
        return (EAttribute)getFlagType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlagType_FlagSizeInBits() {
        return (EAttribute)getFlagType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatArgumentTypeType() {
		if (floatArgumentTypeTypeEClass == null) {
			floatArgumentTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(120);
		}
		return floatArgumentTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloatArgumentTypeType_DefaultAlarm() {
        return (EReference)getFloatArgumentTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloatArgumentTypeType_ContextAlarmList() {
        return (EReference)getFloatArgumentTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatDataEncodingType() {
		if (floatDataEncodingTypeEClass == null) {
			floatDataEncodingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(121);
		}
		return floatDataEncodingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloatDataEncodingType_DefaultCalibrator() {
        return (EReference)getFloatDataEncodingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloatDataEncodingType_ContextCalibratorList() {
        return (EReference)getFloatDataEncodingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatDataEncodingType_Encoding() {
        return (EAttribute)getFloatDataEncodingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatDataEncodingType_SizeInBits() {
        return (EAttribute)getFloatDataEncodingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatDataType() {
		if (floatDataTypeEClass == null) {
			floatDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(122);
		}
		return floatDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatDataType_InitialValue() {
        return (EAttribute)getFloatDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatDataType_SizeInBits() {
        return (EAttribute)getFloatDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatParameterTypeType() {
		if (floatParameterTypeTypeEClass == null) {
			floatParameterTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(123);
		}
		return floatParameterTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloatParameterTypeType_DefaultAlarm() {
        return (EReference)getFloatParameterTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloatParameterTypeType_ContextAlarmList() {
        return (EReference)getFloatParameterTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrameStreamType() {
		if (frameStreamTypeEClass == null) {
			frameStreamTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(124);
		}
		return frameStreamTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrameStreamType_ContainerRef() {
        return (EReference)getFrameStreamType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrameStreamType_ServiceRef() {
        return (EReference)getFrameStreamType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrameStreamType_StreamRef() {
        return (EReference)getFrameStreamType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderType() {
		if (headerTypeEClass == null) {
			headerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(125);
		}
		return headerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderType_AuthorSet() {
        return (EReference)getHeaderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderType_NoteSet() {
        return (EReference)getHeaderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderType_HistorySet() {
        return (EReference)getHeaderType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_Classification() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_ClassificationInstructions() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_Date() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_ValidationStatus() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_Version() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistorySetType() {
		if (historySetTypeEClass == null) {
			historySetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(127);
		}
		return historySetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistorySetType_History() {
        return (EAttribute)getHistorySetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndirectParameterRefEntryType() {
		if (indirectParameterRefEntryTypeEClass == null) {
			indirectParameterRefEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(128);
		}
		return indirectParameterRefEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndirectParameterRefEntryType_ParameterInstance() {
        return (EReference)getIndirectParameterRefEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndirectParameterRefEntryType_AliasNameSpace() {
        return (EAttribute)getIndirectParameterRefEntryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputAlgorithmType() {
		if (inputAlgorithmTypeEClass == null) {
			inputAlgorithmTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(129);
		}
		return inputAlgorithmTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputAlgorithmType_InputSet() {
        return (EReference)getInputAlgorithmType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputOutputAlgorithmType() {
		if (inputOutputAlgorithmTypeEClass == null) {
			inputOutputAlgorithmTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(130);
		}
		return inputOutputAlgorithmTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputOutputAlgorithmType_OutputSet() {
        return (EReference)getInputOutputAlgorithmType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputOutputAlgorithmType_Thread() {
        return (EAttribute)getInputOutputAlgorithmType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputOutputTriggerAlgorithmType() {
		if (inputOutputTriggerAlgorithmTypeEClass == null) {
			inputOutputTriggerAlgorithmTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(131);
		}
		return inputOutputTriggerAlgorithmTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputOutputTriggerAlgorithmType_TriggerSet() {
        return (EReference)getInputOutputTriggerAlgorithmType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputOutputTriggerAlgorithmType_Priority() {
        return (EAttribute)getInputOutputTriggerAlgorithmType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputOutputTriggerAlgorithmType_TriggerContainer() {
        return (EAttribute)getInputOutputTriggerAlgorithmType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputSetType() {
		if (inputSetTypeEClass == null) {
			inputSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(132);
		}
		return inputSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputSetType_Group() {
        return (EAttribute)getInputSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputSetType_ParameterInstanceRef() {
        return (EReference)getInputSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputSetType_Constant() {
        return (EReference)getInputSetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerArgumentTypeType() {
		if (integerArgumentTypeTypeEClass == null) {
			integerArgumentTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(133);
		}
		return integerArgumentTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerArgumentTypeType_DefaultAlarm() {
        return (EReference)getIntegerArgumentTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerArgumentTypeType_ContextAlarmList() {
        return (EReference)getIntegerArgumentTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerDataEncodingType() {
		if (integerDataEncodingTypeEClass == null) {
			integerDataEncodingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(134);
		}
		return integerDataEncodingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerDataEncodingType_DefaultCalibrator() {
        return (EReference)getIntegerDataEncodingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerDataEncodingType_ContextCalibratorList() {
        return (EReference)getIntegerDataEncodingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerDataEncodingType_Encoding() {
        return (EAttribute)getIntegerDataEncodingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerDataEncodingType_SizeInBits() {
        return (EAttribute)getIntegerDataEncodingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerDataType() {
		if (integerDataTypeEClass == null) {
			integerDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(135);
		}
		return integerDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerDataType_InitialValue() {
        return (EAttribute)getIntegerDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerDataType_Signed() {
        return (EAttribute)getIntegerDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerDataType_SizeInBits() {
        return (EAttribute)getIntegerDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerParameterTypeType() {
		if (integerParameterTypeTypeEClass == null) {
			integerParameterTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(136);
		}
		return integerParameterTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerParameterTypeType_DefaultAlarm() {
        return (EReference)getIntegerParameterTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerParameterTypeType_ContextAlarmList() {
        return (EReference)getIntegerParameterTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerRangeType() {
		if (integerRangeTypeEClass == null) {
			integerRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(137);
		}
		return integerRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerRangeType_Max() {
        return (EAttribute)getIntegerRangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerRangeType_Min() {
        return (EAttribute)getIntegerRangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValueType() {
		if (integerValueTypeEClass == null) {
			integerValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(138);
		}
		return integerValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValueType_FixedValue() {
        return (EAttribute)getIntegerValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerValueType_DynamicValue() {
        return (EReference)getIntegerValueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerValueType_DiscreteLookupList() {
        return (EReference)getIntegerValueType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterlockType() {
		if (interlockTypeEClass == null) {
			interlockTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(139);
		}
		return interlockTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterlockType_ScopeToSpaceSystem() {
        return (EAttribute)getInterlockType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterlockType_Suspendable() {
        return (EAttribute)getInterlockType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterlockType_VerificationProgressPercentage() {
        return (EAttribute)getInterlockType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterlockType_VerificationToWaitFor() {
        return (EAttribute)getInterlockType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeadingSizeType() {
		if (leadingSizeTypeEClass == null) {
			leadingSizeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(140);
		}
		return leadingSizeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeadingSizeType_SizeInBitsOfSizeTag() {
        return (EAttribute)getLeadingSizeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearAdjustmentType() {
		if (linearAdjustmentTypeEClass == null) {
			linearAdjustmentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(141);
		}
		return linearAdjustmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearAdjustmentType_Intercept() {
        return (EAttribute)getLinearAdjustmentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearAdjustmentType_Slope() {
        return (EAttribute)getLinearAdjustmentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearAdjustmentType1() {
		if (linearAdjustmentType1EClass == null) {
			linearAdjustmentType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(142);
		}
		return linearAdjustmentType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearAdjustmentType1_Intercept() {
        return (EAttribute)getLinearAdjustmentType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearAdjustmentType1_Slope() {
        return (EAttribute)getLinearAdjustmentType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationInContainerInBitsType() {
		if (locationInContainerInBitsTypeEClass == null) {
			locationInContainerInBitsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(143);
		}
		return locationInContainerInBitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationInContainerInBitsType_ReferenceLocation() {
        return (EAttribute)getLocationInContainerInBitsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchCriteriaType() {
		if (matchCriteriaTypeEClass == null) {
			matchCriteriaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(144);
		}
		return matchCriteriaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchCriteriaType_Comparison() {
        return (EReference)getMatchCriteriaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchCriteriaType_ComparisonList() {
        return (EReference)getMatchCriteriaType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchCriteriaType_BooleanExpression() {
        return (EReference)getMatchCriteriaType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchCriteriaType_CustomAlgorithm() {
        return (EReference)getMatchCriteriaType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMathAlgorithmType() {
		if (mathAlgorithmTypeEClass == null) {
			mathAlgorithmTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(145);
		}
		return mathAlgorithmTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMathAlgorithmType_MathOperation() {
        return (EReference)getMathAlgorithmType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMathOperationType() {
		if (mathOperationTypeEClass == null) {
			mathOperationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(146);
		}
		return mathOperationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMathOperationType_ParameterInstanceRef() {
        return (EReference)getMathOperationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMathOperationType_Value() {
        return (EAttribute)getMathOperationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMathOperationType_Operator() {
        return (EAttribute)getMathOperationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMathOperationType_ParameterInstanceRef1() {
        return (EReference)getMathOperationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMathOperationType_Value1() {
        return (EAttribute)getMathOperationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMathOperationType1() {
		if (mathOperationType1EClass == null) {
			mathOperationType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(147);
		}
		return mathOperationType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMathOperationType1_TriggerSet() {
        return (EReference)getMathOperationType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMathOperationType1_OutputParameterRef() {
        return (EAttribute)getMathOperationType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageRefSetType() {
		if (messageRefSetTypeEClass == null) {
			messageRefSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(150);
		}
		return messageRefSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageRefSetType_MessageRef() {
        return (EReference)getMessageRefSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageRefType() {
		if (messageRefTypeEClass == null) {
			messageRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(151);
		}
		return messageRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageRefType_MessageRef() {
        return (EAttribute)getMessageRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageSetType() {
		if (messageSetTypeEClass == null) {
			messageSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(152);
		}
		return messageSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageSetType_Message() {
        return (EReference)getMessageSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageSetType_Name() {
        return (EAttribute)getMessageSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageType() {
		if (messageTypeEClass == null) {
			messageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(153);
		}
		return messageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_MatchCriteria() {
        return (EReference)getMessageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_ContainRef() {
        return (EReference)getMessageType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaCommandSetType() {
		if (metaCommandSetTypeEClass == null) {
			metaCommandSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(154);
		}
		return metaCommandSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaCommandSetType_Group() {
        return (EAttribute)getMetaCommandSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaCommandSetType_MetaCommand() {
        return (EReference)getMetaCommandSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaCommandSetType_MetaCommandRef() {
        return (EAttribute)getMetaCommandSetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaCommandSetType_BlockMetaCommand() {
        return (EReference)getMetaCommandSetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaCommandStepListType() {
		if (metaCommandStepListTypeEClass == null) {
			metaCommandStepListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(155);
		}
		return metaCommandStepListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaCommandStepListType_MetaCommandStep() {
        return (EReference)getMetaCommandStepListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaCommandStepType() {
		if (metaCommandStepTypeEClass == null) {
			metaCommandStepTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(156);
		}
		return metaCommandStepTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaCommandStepType_ArgumentList() {
        return (EReference)getMetaCommandStepType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaCommandStepType_MetaCommandRef() {
        return (EAttribute)getMetaCommandStepType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaCommandType() {
		if (metaCommandTypeEClass == null) {
			metaCommandTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(157);
		}
		return metaCommandTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaCommandType_BaseMetaCommand() {
        return (EReference)getMetaCommandType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaCommandType_SystemName() {
        return (EAttribute)getMetaCommandType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaCommandType_ArgumentList() {
        return (EReference)getMetaCommandType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaCommandType_CommandContainer() {
        return (EReference)getMetaCommandType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaCommandType_TransmissionConstraintList() {
        return (EReference)getMetaCommandType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaCommandType_DefaultSignificance() {
        return (EReference)getMetaCommandType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaCommandType_ContextSignificanceList() {
        return (EReference)getMetaCommandType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaCommandType_Interlock() {
        return (EReference)getMetaCommandType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaCommandType_Verifiers() {
        return (EReference)getMetaCommandType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaCommandType_ParameterToSetList() {
        return (EReference)getMetaCommandType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaCommandType_Abstract() {
        return (EAttribute)getMetaCommandType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameDescriptionType() {
		if (nameDescriptionTypeEClass == null) {
			nameDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(158);
		}
		return nameDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameDescriptionType_LongDescription() {
        return (EAttribute)getNameDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameDescriptionType_AliasSet() {
        return (EReference)getNameDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameDescriptionType_Name() {
        return (EAttribute)getNameDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameDescriptionType_ShortDescription() {
        return (EAttribute)getNameDescriptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoteSetType() {
		if (noteSetTypeEClass == null) {
			noteSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(163);
		}
		return noteSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteSetType_Note() {
        return (EAttribute)getNoteSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberFormatType() {
		if (numberFormatTypeEClass == null) {
			numberFormatTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(164);
		}
		return numberFormatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberFormatType_MaximumFractionDigits() {
        return (EAttribute)getNumberFormatType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberFormatType_MaximumIntegerDigits() {
        return (EAttribute)getNumberFormatType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberFormatType_MinimumFractionDigits() {
        return (EAttribute)getNumberFormatType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberFormatType_MinimumIntegerDigits() {
        return (EAttribute)getNumberFormatType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberFormatType_NegativePrefix() {
        return (EAttribute)getNumberFormatType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberFormatType_NegativeSuffix() {
        return (EAttribute)getNumberFormatType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberFormatType_Notation() {
        return (EAttribute)getNumberFormatType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberFormatType_NumberBase() {
        return (EAttribute)getNumberFormatType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberFormatType_PositivePrefix() {
        return (EAttribute)getNumberFormatType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberFormatType_PositiveSuffix() {
        return (EAttribute)getNumberFormatType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberFormatType_ShowThousandsGrouping() {
        return (EAttribute)getNumberFormatType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberToStringType() {
		if (numberToStringTypeEClass == null) {
			numberToStringTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(165);
		}
		return numberToStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberToStringType_Group() {
        return (EAttribute)getNumberToStringType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberToStringType_ValueEnumeration() {
        return (EReference)getNumberToStringType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberToStringType_RangeEnumeration() {
        return (EReference)getNumberToStringType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberToStringType_NumberFormat() {
        return (EReference)getNumberToStringType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericAlarmConditionType() {
		if (numericAlarmConditionTypeEClass == null) {
			numericAlarmConditionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(166);
		}
		return numericAlarmConditionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericAlarmConditionType_StaticAlarmRanges() {
        return (EReference)getNumericAlarmConditionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericAlarmConditionType_ChangePerSecondAlarmRanges() {
        return (EReference)getNumericAlarmConditionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericAlarmConditionType_ConditionalAlarm() {
        return (EReference)getNumericAlarmConditionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericAlarmConditionType_CustomAlarm() {
        return (EReference)getNumericAlarmConditionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericAlarmConditionType_MinViolations() {
        return (EAttribute)getNumericAlarmConditionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericDataType() {
		if (numericDataTypeEClass == null) {
			numericDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(167);
		}
		return numericDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericDataType_ToString() {
        return (EReference)getNumericDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericDataType_ValidRange() {
        return (EReference)getNumericDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericDataType_DefaultCalibrator() {
        return (EReference)getNumericDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericDataType_ContextCalibratorList() {
        return (EReference)getNumericDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericDataType_ValidRangeAppliesToCalibrated() {
        return (EAttribute)getNumericDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffsetType() {
		if (offsetTypeEClass == null) {
			offsetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(169);
		}
		return offsetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffsetType_OffsetSizeInBits() {
        return (EAttribute)getOffsetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getORedConditionsType() {
		if (oRedConditionsTypeEClass == null) {
			oRedConditionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(170);
		}
		return oRedConditionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getORedConditionsType_Group() {
        return (EAttribute)getORedConditionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORedConditionsType_Condition() {
        return (EReference)getORedConditionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORedConditionsType_ANDedConditions() {
        return (EReference)getORedConditionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputParameterRefType() {
		if (outputParameterRefTypeEClass == null) {
			outputParameterRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(171);
		}
		return outputParameterRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputParameterRefType_OutputName() {
        return (EAttribute)getOutputParameterRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputSetType() {
		if (outputSetTypeEClass == null) {
			outputSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(172);
		}
		return outputSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputSetType_OutputParameterRef() {
        return (EReference)getOutputSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterInstanceRefType() {
		if (parameterInstanceRefTypeEClass == null) {
			parameterInstanceRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(173);
		}
		return parameterInstanceRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterInstanceRefType_InputName() {
        return (EAttribute)getParameterInstanceRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterInstanceRefType1() {
		if (parameterInstanceRefType1EClass == null) {
			parameterInstanceRefType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(174);
		}
		return parameterInstanceRefType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterInstanceRefType1_Instance() {
        return (EAttribute)getParameterInstanceRefType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterInstanceRefType1_UseCalibratedValue() {
        return (EAttribute)getParameterInstanceRefType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterPropertiesType() {
		if (parameterPropertiesTypeEClass == null) {
			parameterPropertiesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(175);
		}
		return parameterPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterPropertiesType_SystemName() {
        return (EAttribute)getParameterPropertiesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterPropertiesType_ValidityCondition() {
        return (EReference)getParameterPropertiesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterPropertiesType_PhysicalAddressSet() {
        return (EReference)getParameterPropertiesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterPropertiesType_TimeAssociation() {
        return (EReference)getParameterPropertiesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterPropertiesType_DataSource() {
        return (EAttribute)getParameterPropertiesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterPropertiesType_ReadOnly() {
        return (EAttribute)getParameterPropertiesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterRefEntryType() {
		if (parameterRefEntryTypeEClass == null) {
			parameterRefEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(176);
		}
		return parameterRefEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterRefEntryType_ParameterRef() {
        return (EAttribute)getParameterRefEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterRefType() {
		if (parameterRefTypeEClass == null) {
			parameterRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(177);
		}
		return parameterRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterRefType_TriggerName() {
        return (EAttribute)getParameterRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterRefType1() {
		if (parameterRefType1EClass == null) {
			parameterRefType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(178);
		}
		return parameterRefType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterRefType1_Value() {
        return (EAttribute)getParameterRefType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterRefType1_ParameterRef() {
        return (EAttribute)getParameterRefType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSegmentRefEntryType() {
		if (parameterSegmentRefEntryTypeEClass == null) {
			parameterSegmentRefEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(179);
		}
		return parameterSegmentRefEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterSegmentRefEntryType_Order() {
        return (EAttribute)getParameterSegmentRefEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterSegmentRefEntryType_ParameterRef() {
        return (EAttribute)getParameterSegmentRefEntryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterSegmentRefEntryType_SizeInBits() {
        return (EAttribute)getParameterSegmentRefEntryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSetType() {
		if (parameterSetTypeEClass == null) {
			parameterSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(180);
		}
		return parameterSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterSetType_Group() {
        return (EAttribute)getParameterSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSetType_Parameter() {
        return (EReference)getParameterSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSetType_ParameterRef() {
        return (EReference)getParameterSetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterToSetListType() {
		if (parameterToSetListTypeEClass == null) {
			parameterToSetListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(181);
		}
		return parameterToSetListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterToSetListType_ParameterToSet() {
        return (EReference)getParameterToSetListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterToSetType() {
		if (parameterToSetTypeEClass == null) {
			parameterToSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(182);
		}
		return parameterToSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterToSetType_ParameterRef() {
        return (EReference)getParameterToSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterToSetType_Derivation() {
        return (EReference)getParameterToSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterToSetType1() {
		if (parameterToSetType1EClass == null) {
			parameterToSetType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(183);
		}
		return parameterToSetType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterToSetType1_VerifierToTriggerOn() {
        return (EAttribute)getParameterToSetType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterType() {
		if (parameterTypeEClass == null) {
			parameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(184);
		}
		return parameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterType_ParameterProperties() {
        return (EReference)getParameterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterType_ParameterTypeRef() {
        return (EAttribute)getParameterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterTypeSetType() {
		if (parameterTypeSetTypeEClass == null) {
			parameterTypeSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(185);
		}
		return parameterTypeSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterTypeSetType_Group() {
        return (EAttribute)getParameterTypeSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterTypeSetType_StringParameterType() {
        return (EReference)getParameterTypeSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterTypeSetType_EnumeratedParameterType() {
        return (EReference)getParameterTypeSetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterTypeSetType_IntegerParameterType() {
        return (EReference)getParameterTypeSetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterTypeSetType_BinaryParameterType() {
        return (EReference)getParameterTypeSetType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterTypeSetType_FloatParameterType() {
        return (EReference)getParameterTypeSetType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterTypeSetType_BooleanParameterType() {
        return (EReference)getParameterTypeSetType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterTypeSetType_RelativeTimeParameterType() {
        return (EReference)getParameterTypeSetType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterTypeSetType_AbsoluteTimeParameterType() {
        return (EReference)getParameterTypeSetType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterTypeSetType_ArrayParameterType() {
        return (EReference)getParameterTypeSetType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValueChangeType() {
		if (parameterValueChangeTypeEClass == null) {
			parameterValueChangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(186);
		}
		return parameterValueChangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValueChangeType_ParameterRef() {
        return (EReference)getParameterValueChangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValueChangeType_Change() {
        return (EReference)getParameterValueChangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParityType() {
		if (parityTypeEClass == null) {
			parityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(187);
		}
		return parityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParityType_BitsFromReference() {
        return (EAttribute)getParityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParityType_Reference() {
        return (EAttribute)getParityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParityType_Type() {
        return (EAttribute)getParityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCMStreamType() {
		if (pcmStreamTypeEClass == null) {
			pcmStreamTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(188);
		}
		return pcmStreamTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCMStreamType_BitRateInBPS() {
        return (EAttribute)getPCMStreamType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCMStreamType_Inverted() {
        return (EAttribute)getPCMStreamType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCMStreamType_PcmType() {
        return (EAttribute)getPCMStreamType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalAddressSetType() {
		if (physicalAddressSetTypeEClass == null) {
			physicalAddressSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(191);
		}
		return physicalAddressSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalAddressSetType_PhysicalAddress() {
        return (EReference)getPhysicalAddressSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalAddressType() {
		if (physicalAddressTypeEClass == null) {
			physicalAddressTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(192);
		}
		return physicalAddressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalAddressType_SubAddress() {
        return (EReference)getPhysicalAddressType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalAddressType_SourceAddress() {
        return (EAttribute)getPhysicalAddressType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalAddressType_SourceName() {
        return (EAttribute)getPhysicalAddressType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalAddressType1() {
		if (physicalAddressType1EClass == null) {
			physicalAddressType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(193);
		}
		return physicalAddressType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolynomialType() {
		if (polynomialTypeEClass == null) {
			polynomialTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(194);
		}
		return polynomialTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolynomialType_Term() {
        return (EReference)getPolynomialType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyType() {
		if (propertyTypeEClass == null) {
			propertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(195);
		}
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Group() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyType_Property() {
        return (EReference)getPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Value() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueuedVerifierType() {
		if (queuedVerifierTypeEClass == null) {
			queuedVerifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(196);
		}
		return queuedVerifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeEnumerationType() {
		if (rangeEnumerationTypeEClass == null) {
			rangeEnumerationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(199);
		}
		return rangeEnumerationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeEnumerationType_Label() {
        return (EAttribute)getRangeEnumerationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRateInStreamSetType() {
		if (rateInStreamSetTypeEClass == null) {
			rateInStreamSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(200);
		}
		return rateInStreamSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRateInStreamSetType_RateInStream() {
        return (EReference)getRateInStreamSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRateInStreamType() {
		if (rateInStreamTypeEClass == null) {
			rateInStreamTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(201);
		}
		return rateInStreamTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateInStreamType_StreamRef() {
        return (EAttribute)getRateInStreamType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRateInStreamType1() {
		if (rateInStreamType1EClass == null) {
			rateInStreamType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(202);
		}
		return rateInStreamType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateInStreamType1_Basis() {
        return (EAttribute)getRateInStreamType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateInStreamType1_MaximumValue() {
        return (EAttribute)getRateInStreamType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateInStreamType1_MinimumValue() {
        return (EAttribute)getRateInStreamType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceivedVerifierType() {
		if (receivedVerifierTypeEClass == null) {
			receivedVerifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(203);
		}
		return receivedVerifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceTimeType() {
		if (referenceTimeTypeEClass == null) {
			referenceTimeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(206);
		}
		return referenceTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceTimeType_OffsetFrom() {
        return (EReference)getReferenceTimeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceTimeType_Epoch() {
        return (EAttribute)getReferenceTimeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeTimeDataType() {
		if (relativeTimeDataTypeEClass == null) {
			relativeTimeDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(211);
		}
		return relativeTimeDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatType() {
		if (repeatTypeEClass == null) {
			repeatTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(213);
		}
		return repeatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatType_Count() {
        return (EReference)getRepeatType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatType_Offset() {
        return (EReference)getRepeatType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictionCriteriaType() {
		if (restrictionCriteriaTypeEClass == null) {
			restrictionCriteriaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(214);
		}
		return restrictionCriteriaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionCriteriaType_NextContainer() {
        return (EReference)getRestrictionCriteriaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictionCriteriaType1() {
		if (restrictionCriteriaType1EClass == null) {
			restrictionCriteriaType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(215);
		}
		return restrictionCriteriaType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionCriteriaType1_NextContainer() {
        return (EReference)getRestrictionCriteriaType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSentFromRangeVerifierType() {
		if (sentFromRangeVerifierTypeEClass == null) {
			sentFromRangeVerifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(216);
		}
		return sentFromRangeVerifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceContainerType() {
		if (sequenceContainerTypeEClass == null) {
			sequenceContainerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(217);
		}
		return sequenceContainerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceContainerType_EntryList() {
        return (EReference)getSequenceContainerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceContainerType_BaseContainer() {
        return (EReference)getSequenceContainerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceContainerType_Abstract() {
        return (EAttribute)getSequenceContainerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceContainerType_IdlePattern() {
        return (EAttribute)getSequenceContainerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceEntryType() {
		if (sequenceEntryTypeEClass == null) {
			sequenceEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(218);
		}
		return sequenceEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceEntryType_LocationInContainerInBits() {
        return (EReference)getSequenceEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceEntryType_RepeatEntry() {
        return (EReference)getSequenceEntryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceEntryType_IncludeCondition() {
        return (EReference)getSequenceEntryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceRefType() {
		if (serviceRefTypeEClass == null) {
			serviceRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(219);
		}
		return serviceRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRefType_Value() {
        return (EAttribute)getServiceRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceRefType_ServiceRef() {
        return (EAttribute)getServiceRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceSetType() {
		if (serviceSetTypeEClass == null) {
			serviceSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(220);
		}
		return serviceSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceSetType_Service() {
        return (EReference)getServiceSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceType() {
		if (serviceTypeEClass == null) {
			serviceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(221);
		}
		return serviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceType_MessageRefSet() {
        return (EReference)getServiceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceType_ContainerRefSet() {
        return (EReference)getServiceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignificanceType() {
		if (significanceTypeEClass == null) {
			significanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(222);
		}
		return significanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignificanceType_ConsequenceLevel() {
        return (EAttribute)getSignificanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignificanceType_ReasonForWarning() {
        return (EAttribute)getSignificanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignificanceType_SpaceSystemAtRisk() {
        return (EAttribute)getSignificanceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleAlgorithmType() {
		if (simpleAlgorithmTypeEClass == null) {
			simpleAlgorithmTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(223);
		}
		return simpleAlgorithmTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleAlgorithmType_AlgorithmText() {
        return (EReference)getSimpleAlgorithmType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleAlgorithmType_ExternalAlgorithmSet() {
        return (EReference)getSimpleAlgorithmType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSizeInBitsType() {
		if (sizeInBitsTypeEClass == null) {
			sizeInBitsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(224);
		}
		return sizeInBitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSizeInBitsType_Fixed() {
        return (EReference)getSizeInBitsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSizeInBitsType_TerminationChar() {
        return (EAttribute)getSizeInBitsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSizeInBitsType_LeadingSize() {
        return (EReference)getSizeInBitsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpaceSystemType() {
		if (spaceSystemTypeEClass == null) {
			spaceSystemTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(229);
		}
		return spaceSystemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpaceSystemType_Header() {
        return (EReference)getSpaceSystemType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpaceSystemType_TelemetryMetaData() {
        return (EReference)getSpaceSystemType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpaceSystemType_CommandMetaData() {
        return (EReference)getSpaceSystemType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpaceSystemType_ServiceSet() {
        return (EReference)getSpaceSystemType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpaceSystemType_Defaults() {
        return (EReference)getSpaceSystemType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpaceSystemType_SpaceSystem() {
        return (EReference)getSpaceSystemType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplineCalibratorType() {
		if (splineCalibratorTypeEClass == null) {
			splineCalibratorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(230);
		}
		return splineCalibratorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplineCalibratorType_SplinePoint() {
        return (EReference)getSplineCalibratorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSplineCalibratorType_Extrapolate() {
        return (EAttribute)getSplineCalibratorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSplineCalibratorType_Order() {
        return (EAttribute)getSplineCalibratorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplinePointType() {
		if (splinePointTypeEClass == null) {
			splinePointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(231);
		}
		return splinePointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSplinePointType_Calibrated() {
        return (EAttribute)getSplinePointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSplinePointType_Order() {
        return (EAttribute)getSplinePointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSplinePointType_Raw() {
        return (EAttribute)getSplinePointType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStreamRefType() {
		if (streamRefTypeEClass == null) {
			streamRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(232);
		}
		return streamRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStreamRefType_StreamRef() {
        return (EAttribute)getStreamRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStreamSegmentEntryType() {
		if (streamSegmentEntryTypeEClass == null) {
			streamSegmentEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(233);
		}
		return streamSegmentEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStreamSegmentEntryType_Order() {
        return (EAttribute)getStreamSegmentEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStreamSegmentEntryType_SizeInBits() {
        return (EAttribute)getStreamSegmentEntryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStreamSegmentEntryType_StreamRef() {
        return (EAttribute)getStreamSegmentEntryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStreamSetType() {
		if (streamSetTypeEClass == null) {
			streamSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(234);
		}
		return streamSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStreamSetType_Group() {
        return (EAttribute)getStreamSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreamSetType_FixedFrameStream() {
        return (EReference)getStreamSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreamSetType_VariableFrameStream() {
        return (EReference)getStreamSetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreamSetType_CustomStream() {
        return (EReference)getStreamSetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringDataEncodingType() {
		if (stringDataEncodingTypeEClass == null) {
			stringDataEncodingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(235);
		}
		return stringDataEncodingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringDataEncodingType_DefaultCalibrator() {
        return (EReference)getStringDataEncodingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringDataEncodingType_ContextCalibratorList() {
        return (EReference)getStringDataEncodingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringDataEncodingType_SizeInBits() {
        return (EReference)getStringDataEncodingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringDataEncodingType_Encoding() {
        return (EAttribute)getStringDataEncodingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringDataType() {
		if (stringDataTypeEClass == null) {
			stringDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(236);
		}
		return stringDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringDataType_SizeRangeInCharacters() {
        return (EReference)getStringDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringDataType_DefaultCalibrator() {
        return (EReference)getStringDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringDataType_ContextCalibratorList() {
        return (EReference)getStringDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringDataType_CharacterWidth() {
        return (EAttribute)getStringDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringDataType_InitialValue() {
        return (EAttribute)getStringDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringDataType_RestrictionPattern() {
        return (EAttribute)getStringDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyncPatternType() {
		if (syncPatternTypeEClass == null) {
			syncPatternTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(237);
		}
		return syncPatternTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyncPatternType_BitLocation() {
        return (EAttribute)getSyncPatternType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyncPatternType_Mask() {
        return (EAttribute)getSyncPatternType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyncPatternType_MaskLengthInBits() {
        return (EAttribute)getSyncPatternType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyncPatternType_Pattern() {
        return (EAttribute)getSyncPatternType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyncPatternType_PatternLengthInBits() {
        return (EAttribute)getSyncPatternType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyncPatternType1() {
		if (syncPatternType1EClass == null) {
			syncPatternType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(238);
		}
		return syncPatternType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyncPatternType1_BitLocationFromStartOfContainer() {
        return (EAttribute)getSyncPatternType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyncPatternType1_Mask() {
        return (EAttribute)getSyncPatternType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyncPatternType1_MaskLengthInBits() {
        return (EAttribute)getSyncPatternType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyncPatternType1_Pattern() {
        return (EAttribute)getSyncPatternType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyncPatternType1_PatternLengthInBits() {
        return (EAttribute)getSyncPatternType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyncStrategyType() {
		if (syncStrategyTypeEClass == null) {
			syncStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(239);
		}
		return syncStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSyncStrategyType_AutoInvert() {
        return (EReference)getSyncStrategyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyncStrategyType_CheckToLockGoodFrames() {
        return (EAttribute)getSyncStrategyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyncStrategyType_MaxBitErrorsInSyncPattern() {
        return (EAttribute)getSyncStrategyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyncStrategyType_VerifyToLockGoodFrames() {
        return (EAttribute)getSyncStrategyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyncStrategyType1() {
		if (syncStrategyType1EClass == null) {
			syncStrategyType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(240);
		}
		return syncStrategyType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSyncStrategyType1_Flag() {
        return (EReference)getSyncStrategyType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyncStrategyType2() {
		if (syncStrategyType2EClass == null) {
			syncStrategyType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(241);
		}
		return syncStrategyType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSyncStrategyType2_SyncPattern() {
        return (EReference)getSyncStrategyType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTelemetryMetaDataType() {
		if (telemetryMetaDataTypeEClass == null) {
			telemetryMetaDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(242);
		}
		return telemetryMetaDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTelemetryMetaDataType_ParameterTypeSet() {
        return (EReference)getTelemetryMetaDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTelemetryMetaDataType_ParameterSet() {
        return (EReference)getTelemetryMetaDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTelemetryMetaDataType_ContainerSet() {
        return (EReference)getTelemetryMetaDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTelemetryMetaDataType_MessageSet() {
        return (EReference)getTelemetryMetaDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTelemetryMetaDataType_StreamSet() {
        return (EReference)getTelemetryMetaDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTelemetryMetaDataType_AlgorithmSet() {
        return (EReference)getTelemetryMetaDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermType() {
		if (termTypeEClass == null) {
			termTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(243);
		}
		return termTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermType_Coefficient() {
        return (EAttribute)getTermType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermType_Exponent() {
        return (EAttribute)getTermType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeAssociationType() {
		if (timeAssociationTypeEClass == null) {
			timeAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(244);
		}
		return timeAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAssociationType_InterpolateTime() {
        return (EAttribute)getTimeAssociationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAssociationType_Offset() {
        return (EAttribute)getTimeAssociationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransferredToRangeVerifierType() {
		if (transferredToRangeVerifierTypeEClass == null) {
			transferredToRangeVerifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(245);
		}
		return transferredToRangeVerifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransmissionConstraintListType() {
		if (transmissionConstraintListTypeEClass == null) {
			transmissionConstraintListTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(246);
		}
		return transmissionConstraintListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmissionConstraintListType_TransmissionConstraint() {
        return (EReference)getTransmissionConstraintListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransmissionConstraintType() {
		if (transmissionConstraintTypeEClass == null) {
			transmissionConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(247);
		}
		return transmissionConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransmissionConstraintType_Suspendable() {
        return (EAttribute)getTransmissionConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransmissionConstraintType_TimeOut() {
        return (EAttribute)getTransmissionConstraintType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerType() {
		if (triggerTypeEClass == null) {
			triggerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(248);
		}
		return triggerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriggerType_Group() {
        return (EAttribute)getTriggerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerType_ParameterRef() {
        return (EReference)getTriggerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriggerType_TriggerFrequency() {
        return (EAttribute)getTriggerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriggerType_Name() {
        return (EAttribute)getTriggerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriggerType_TriggerRate() {
        return (EAttribute)getTriggerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitSetType() {
		if (unitSetTypeEClass == null) {
			unitSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(251);
		}
		return unitSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitSetType_Unit() {
        return (EReference)getUnitSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitType() {
		if (unitTypeEClass == null) {
			unitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(254);
		}
		return unitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitType_Mixed() {
        return (EAttribute)getUnitType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitType_Description() {
        return (EAttribute)getUnitType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitType_Factor() {
        return (EAttribute)getUnitType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitType_Power() {
        return (EAttribute)getUnitType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidRangeType() {
		if (validRangeTypeEClass == null) {
			validRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(257);
		}
		return validRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueEnumerationType() {
		if (valueEnumerationTypeEClass == null) {
			valueEnumerationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(258);
		}
		return valueEnumerationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueEnumerationType_Label() {
        return (EAttribute)getValueEnumerationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueEnumerationType_Value() {
        return (EAttribute)getValueEnumerationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableFrameStreamType() {
		if (variableFrameStreamTypeEClass == null) {
			variableFrameStreamTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(259);
		}
		return variableFrameStreamTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableFrameStreamType_SyncStrategy() {
        return (EReference)getVariableFrameStreamType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerifiersType() {
		if (verifiersTypeEClass == null) {
			verifiersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(262);
		}
		return verifiersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerifiersType_TransferredToRangeVerifier() {
        return (EReference)getVerifiersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerifiersType_SentFromRangeVerifier() {
        return (EReference)getVerifiersType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerifiersType_ReceivedVerifier() {
        return (EReference)getVerifiersType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerifiersType_AcceptedVerifier() {
        return (EReference)getVerifiersType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerifiersType_QueuedVerifier() {
        return (EReference)getVerifiersType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerifiersType_ExecutionVerifier() {
        return (EReference)getVerifiersType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerifiersType_CompleteVerifier() {
        return (EReference)getVerifiersType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerifiersType_FailedVerifier() {
        return (EReference)getVerifiersType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasisType() {
		if (basisTypeEEnum == null) {
			basisTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(27);
		}
		return basisTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBitOrderType() {
		if (bitOrderTypeEEnum == null) {
			bitOrderTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(32);
		}
		return bitOrderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCharacterWidthType() {
		if (characterWidthTypeEEnum == null) {
			characterWidthTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(41);
		}
		return characterWidthTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonOperatorsType() {
		if (comparisonOperatorsTypeEEnum == null) {
			comparisonOperatorsTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(51);
		}
		return comparisonOperatorsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConsequenceLevelType() {
		if (consequenceLevelTypeEEnum == null) {
			consequenceLevelTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(56);
		}
		return consequenceLevelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataSourceType() {
		if (dataSourceTypeEEnum == null) {
			dataSourceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(84);
		}
		return dataSourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncodingType() {
		if (encodingTypeEEnum == null) {
			encodingTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(96);
		}
		return encodingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncodingType2() {
		if (encodingType2EEnum == null) {
			encodingType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(98);
		}
		return encodingType2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncodingType3() {
		if (encodingType3EEnum == null) {
			encodingType3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(99);
		}
		return encodingType3EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEpochTypeMember1() {
		if (epochTypeMember1EEnum == null) {
			epochTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(107);
		}
		return epochTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlagBitTypeType() {
		if (flagBitTypeTypeEEnum == null) {
			flagBitTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(117);
		}
		return flagBitTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMathOperatorsType() {
		if (mathOperatorsTypeEEnum == null) {
			mathOperatorsTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(148);
		}
		return mathOperatorsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNotationType() {
		if (notationTypeEEnum == null) {
			notationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(161);
		}
		return notationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPcmTypeType() {
		if (pcmTypeTypeEEnum == null) {
			pcmTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(189);
		}
		return pcmTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRadixType() {
		if (radixTypeEEnum == null) {
			radixTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(197);
		}
		return radixTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferenceLocationType() {
		if (referenceLocationTypeEEnum == null) {
			referenceLocationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(204);
		}
		return referenceLocationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferenceType() {
		if (referenceTypeEEnum == null) {
			referenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(207);
		}
		return referenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferenceType1() {
		if (referenceType1EEnum == null) {
			referenceType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(208);
		}
		return referenceType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSizeInBitsType1() {
		if (sizeInBitsType1EEnum == null) {
			sizeInBitsType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(225);
		}
		return sizeInBitsType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSizeInBitsType2() {
		if (sizeInBitsType2EEnum == null) {
			sizeInBitsType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(226);
		}
		return sizeInBitsType2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType() {
		if (typeTypeEEnum == null) {
			typeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(249);
		}
		return typeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitsType() {
		if (unitsTypeEEnum == null) {
			unitsTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(252);
		}
		return unitsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValidationStatusType() {
		if (validationStatusTypeEEnum == null) {
			validationStatusTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(255);
		}
		return validationStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVerificationToWaitForType() {
		if (verificationToWaitForTypeEEnum == null) {
			verificationToWaitForTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(260);
		}
		return verificationToWaitForTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVerifierToTriggerOnType() {
		if (verifierToTriggerOnTypeEEnum == null) {
			verifierToTriggerOnTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(263);
		}
		return verifierToTriggerOnTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBasisTypeObject() {
		if (basisTypeObjectEDataType == null) {
			basisTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(28);
		}
		return basisTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBinaryType() {
		if (binaryTypeEDataType == null) {
			binaryTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(31);
		}
		return binaryTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBitOrderTypeObject() {
		if (bitOrderTypeObjectEDataType == null) {
			bitOrderTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(33);
		}
		return bitOrderTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCharacterWidthTypeObject() {
		if (characterWidthTypeObjectEDataType == null) {
			characterWidthTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(42);
		}
		return characterWidthTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getComparisonOperatorsTypeObject() {
		if (comparisonOperatorsTypeObjectEDataType == null) {
			comparisonOperatorsTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(52);
		}
		return comparisonOperatorsTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConsequenceLevelTypeObject() {
		if (consequenceLevelTypeObjectEDataType == null) {
			consequenceLevelTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(57);
		}
		return consequenceLevelTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataSourceTypeObject() {
		if (dataSourceTypeObjectEDataType == null) {
			dataSourceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(85);
		}
		return dataSourceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEncodingTypeObject() {
		if (encodingTypeObjectEDataType == null) {
			encodingTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(100);
		}
		return encodingTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEncodingTypeObject1() {
		if (encodingTypeObject1EDataType == null) {
			encodingTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(101);
		}
		return encodingTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEncodingTypeObject2() {
		if (encodingTypeObject2EDataType == null) {
			encodingTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(102);
		}
		return encodingTypeObject2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEpochType() {
		if (epochTypeEDataType == null) {
			epochTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(106);
		}
		return epochTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEpochTypeMember1Object() {
		if (epochTypeMember1ObjectEDataType == null) {
			epochTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(108);
		}
		return epochTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFixedIntegerValueType() {
		if (fixedIntegerValueTypeEDataType == null) {
			fixedIntegerValueTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(115);
		}
		return fixedIntegerValueTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFlagBitTypeTypeObject() {
		if (flagBitTypeTypeObjectEDataType == null) {
			flagBitTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(118);
		}
		return flagBitTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHexadecimalType() {
		if (hexadecimalTypeEDataType == null) {
			hexadecimalTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(126);
		}
		return hexadecimalTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMathOperatorsTypeObject() {
		if (mathOperatorsTypeObjectEDataType == null) {
			mathOperatorsTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(149);
		}
		return mathOperatorsTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameReferenceType() {
		if (nameReferenceTypeEDataType == null) {
			nameReferenceTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(159);
		}
		return nameReferenceTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameType() {
		if (nameTypeEDataType == null) {
			nameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(160);
		}
		return nameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNotationTypeObject() {
		if (notationTypeObjectEDataType == null) {
			notationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(162);
		}
		return notationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOctalType() {
		if (octalTypeEDataType == null) {
			octalTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(168);
		}
		return octalTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPcmTypeTypeObject() {
		if (pcmTypeTypeObjectEDataType == null) {
			pcmTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(190);
		}
		return pcmTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRadixTypeObject() {
		if (radixTypeObjectEDataType == null) {
			radixTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(198);
		}
		return radixTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReferenceLocationTypeObject() {
		if (referenceLocationTypeObjectEDataType == null) {
			referenceLocationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(205);
		}
		return referenceLocationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReferenceTypeObject() {
		if (referenceTypeObjectEDataType == null) {
			referenceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(209);
		}
		return referenceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReferenceTypeObject1() {
		if (referenceTypeObject1EDataType == null) {
			referenceTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(210);
		}
		return referenceTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelativeTimeType() {
		if (relativeTimeTypeEDataType == null) {
			relativeTimeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(212);
		}
		return relativeTimeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSizeInBitsTypeObject() {
		if (sizeInBitsTypeObjectEDataType == null) {
			sizeInBitsTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(227);
		}
		return sizeInBitsTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSizeInBitsTypeObject1() {
		if (sizeInBitsTypeObject1EDataType == null) {
			sizeInBitsTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(228);
		}
		return sizeInBitsTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject() {
		if (typeTypeObjectEDataType == null) {
			typeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(250);
		}
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnitsTypeObject() {
		if (unitsTypeObjectEDataType == null) {
			unitsTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(253);
		}
		return unitsTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getValidationStatusTypeObject() {
		if (validationStatusTypeObjectEDataType == null) {
			validationStatusTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(256);
		}
		return validationStatusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVerificationToWaitForTypeObject() {
		if (verificationToWaitForTypeObjectEDataType == null) {
			verificationToWaitForTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(261);
		}
		return verificationToWaitForTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVerifierToTriggerOnTypeObject() {
		if (verifierToTriggerOnTypeObjectEDataType == null) {
			verifierToTriggerOnTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XtcePackage.eNS_URI).getEClassifiers().get(264);
		}
		return verifierToTriggerOnTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtceFactory getXtceFactory() {
		return (XtceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.omg.space.xtce." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //XtcePackageImpl
