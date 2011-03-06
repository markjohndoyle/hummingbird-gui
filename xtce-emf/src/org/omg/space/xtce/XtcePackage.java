/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * OMG Document Number: dtc/2005-01-05
 * $Id: SpaceSystemV1.0.xsd,v 1.15 2005/01/24 05:02:50 gerry Exp $
 * This is the master schema for the OMG Space Domain Task Force XML Telemetric and Command data Exchange (XTCE) format.
 * This schema definies the dictionary for containers, which in turn describe the physical composition of data in a communication system
 * This schema defines the structure for an Algorithm.   An Algorithm may be one of a growing set of pre-defined algorithms or a named escape into a user defined algorithm where (depending on the system) the name of the algorithm may be a java class, a function in a shared library, an external program or some other reference to an outside algorithm.  At some later date, this schema may also allow the logic of the user defined algorithm to be defined within the instance document itself (perhaps using MathML?).
 * This schema provides a language for defining binary stream data.
 * <!-- end-model-doc -->
 * @see org.omg.space.xtce.XtceFactory
 * @model kind="package"
 * @generated
 */
public interface XtcePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xtce";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/space/xtce";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xtce";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XtcePackage eINSTANCE = org.omg.space.xtce.impl.XtcePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.NameDescriptionTypeImpl <em>Name Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.NameDescriptionTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getNameDescriptionType()
	 * @generated
	 */
	int NAME_DESCRIPTION_TYPE = 130;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DESCRIPTION_TYPE__ALIAS_SET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DESCRIPTION_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Name Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DESCRIPTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.BaseTimeDataTypeImpl <em>Base Time Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.BaseTimeDataTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getBaseTimeDataType()
	 * @generated
	 */
	int BASE_TIME_DATA_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TIME_DATA_TYPE__LONG_DESCRIPTION = NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TIME_DATA_TYPE__ALIAS_SET = NAME_DESCRIPTION_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TIME_DATA_TYPE__NAME = NAME_DESCRIPTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TIME_DATA_TYPE__SHORT_DESCRIPTION = NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TIME_DATA_TYPE__ENCODING = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TIME_DATA_TYPE__REFERENCE_TIME = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Base Time Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TIME_DATA_TYPE_FEATURE_COUNT = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.AbsoluteTimeDataTypeImpl <em>Absolute Time Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.AbsoluteTimeDataTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getAbsoluteTimeDataType()
	 * @generated
	 */
	int ABSOLUTE_TIME_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TIME_DATA_TYPE__LONG_DESCRIPTION = BASE_TIME_DATA_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TIME_DATA_TYPE__ALIAS_SET = BASE_TIME_DATA_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TIME_DATA_TYPE__NAME = BASE_TIME_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TIME_DATA_TYPE__SHORT_DESCRIPTION = BASE_TIME_DATA_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TIME_DATA_TYPE__ENCODING = BASE_TIME_DATA_TYPE__ENCODING;

	/**
	 * The feature id for the '<em><b>Reference Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TIME_DATA_TYPE__REFERENCE_TIME = BASE_TIME_DATA_TYPE__REFERENCE_TIME;

	/**
	 * The number of structural features of the '<em>Absolute Time Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TIME_DATA_TYPE_FEATURE_COUNT = BASE_TIME_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.CommandVerifierTypeImpl <em>Command Verifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.CommandVerifierTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getCommandVerifierType()
	 * @generated
	 */
	int COMMAND_VERIFIER_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_VERIFIER_TYPE__COMPARISON = 0;

	/**
	 * The feature id for the '<em><b>Comparison List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_VERIFIER_TYPE__COMPARISON_LIST = 1;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_VERIFIER_TYPE__BOOLEAN_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Container Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_VERIFIER_TYPE__CONTAINER_REF = 3;

	/**
	 * The feature id for the '<em><b>Parameter Value Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE = 4;

	/**
	 * The feature id for the '<em><b>Custom Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_VERIFIER_TYPE__CUSTOM_ALGORITHM = 5;

	/**
	 * The feature id for the '<em><b>Time To Wait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_VERIFIER_TYPE__TIME_TO_WAIT = 6;

	/**
	 * The number of structural features of the '<em>Command Verifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_VERIFIER_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.AcceptedVerifierTypeImpl <em>Accepted Verifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.AcceptedVerifierTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getAcceptedVerifierType()
	 * @generated
	 */
	int ACCEPTED_VERIFIER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTED_VERIFIER_TYPE__COMPARISON = COMMAND_VERIFIER_TYPE__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comparison List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTED_VERIFIER_TYPE__COMPARISON_LIST = COMMAND_VERIFIER_TYPE__COMPARISON_LIST;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTED_VERIFIER_TYPE__BOOLEAN_EXPRESSION = COMMAND_VERIFIER_TYPE__BOOLEAN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Container Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTED_VERIFIER_TYPE__CONTAINER_REF = COMMAND_VERIFIER_TYPE__CONTAINER_REF;

	/**
	 * The feature id for the '<em><b>Parameter Value Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTED_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE = COMMAND_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE;

	/**
	 * The feature id for the '<em><b>Custom Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTED_VERIFIER_TYPE__CUSTOM_ALGORITHM = COMMAND_VERIFIER_TYPE__CUSTOM_ALGORITHM;

	/**
	 * The feature id for the '<em><b>Time To Wait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTED_VERIFIER_TYPE__TIME_TO_WAIT = COMMAND_VERIFIER_TYPE__TIME_TO_WAIT;

	/**
	 * The number of structural features of the '<em>Accepted Verifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTED_VERIFIER_TYPE_FEATURE_COUNT = COMMAND_VERIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.AlarmConditionsTypeImpl <em>Alarm Conditions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.AlarmConditionsTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getAlarmConditionsType()
	 * @generated
	 */
	int ALARM_CONDITIONS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Watch Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_CONDITIONS_TYPE__WATCH_ALARM = 0;

	/**
	 * The feature id for the '<em><b>Warning Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_CONDITIONS_TYPE__WARNING_ALARM = 1;

	/**
	 * The feature id for the '<em><b>Distress Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_CONDITIONS_TYPE__DISTRESS_ALARM = 2;

	/**
	 * The feature id for the '<em><b>Critial Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_CONDITIONS_TYPE__CRITIAL_ALARM = 3;

	/**
	 * The feature id for the '<em><b>Severe Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_CONDITIONS_TYPE__SEVERE_ALARM = 4;

	/**
	 * The number of structural features of the '<em>Alarm Conditions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_CONDITIONS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.AlarmRangesTypeImpl <em>Alarm Ranges Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.AlarmRangesTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getAlarmRangesType()
	 * @generated
	 */
	int ALARM_RANGES_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Watch Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_RANGES_TYPE__WATCH_RANGE = 0;

	/**
	 * The feature id for the '<em><b>Warning Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_RANGES_TYPE__WARNING_RANGE = 1;

	/**
	 * The feature id for the '<em><b>Distress Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_RANGES_TYPE__DISTRESS_RANGE = 2;

	/**
	 * The feature id for the '<em><b>Critical Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_RANGES_TYPE__CRITICAL_RANGE = 3;

	/**
	 * The feature id for the '<em><b>Severe Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_RANGES_TYPE__SEVERE_RANGE = 4;

	/**
	 * The feature id for the '<em><b>Applies To Calibrated Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_RANGES_TYPE__APPLIES_TO_CALIBRATED_VALUES = 5;

	/**
	 * The number of structural features of the '<em>Alarm Ranges Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_RANGES_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.AlgorithmSetTypeImpl <em>Algorithm Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.AlgorithmSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getAlgorithmSetType()
	 * @generated
	 */
	int ALGORITHM_SET_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_SET_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Custom Algorithm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_SET_TYPE__CUSTOM_ALGORITHM = 1;

	/**
	 * The feature id for the '<em><b>Math Algorithm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_SET_TYPE__MATH_ALGORITHM = 2;

	/**
	 * The number of structural features of the '<em>Algorithm Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_SET_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.AlgorithmTextTypeImpl <em>Algorithm Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.AlgorithmTextTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getAlgorithmTextType()
	 * @generated
	 */
	int ALGORITHM_TEXT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_TEXT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_TEXT_TYPE__LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>Algorithm Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_TEXT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.AliasSetTypeImpl <em>Alias Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.AliasSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getAliasSetType()
	 * @generated
	 */
	int ALIAS_SET_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_SET_TYPE__ALIAS = 0;

	/**
	 * The number of structural features of the '<em>Alias Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_SET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.AliasTypeImpl <em>Alias Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.AliasTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getAliasType()
	 * @generated
	 */
	int ALIAS_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__NAME_SPACE = 1;

	/**
	 * The number of structural features of the '<em>Alias Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ANDedConditionsTypeImpl <em>AN Ded Conditions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ANDedConditionsTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getANDedConditionsType()
	 * @generated
	 */
	int AN_DED_CONDITIONS_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_DED_CONDITIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_DED_CONDITIONS_TYPE__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>ORed Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_DED_CONDITIONS_TYPE__ORED_CONDITIONS = 2;

	/**
	 * The number of structural features of the '<em>AN Ded Conditions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_DED_CONDITIONS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ArgumementArrayTypeTypeImpl <em>Argumement Array Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ArgumementArrayTypeTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getArgumementArrayTypeType()
	 * @generated
	 */
	int ARGUMEMENT_ARRAY_TYPE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Array Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMEMENT_ARRAY_TYPE_TYPE__ARRAY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Number Of Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMEMENT_ARRAY_TYPE_TYPE__NUMBER_OF_DIMENSIONS = 1;

	/**
	 * The number of structural features of the '<em>Argumement Array Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMEMENT_ARRAY_TYPE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ArgumentAssignmentListTypeImpl <em>Argument Assignment List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ArgumentAssignmentListTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getArgumentAssignmentListType()
	 * @generated
	 */
	int ARGUMENT_ASSIGNMENT_LIST_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Argument Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSIGNMENT_LIST_TYPE__ARGUMENT_ASSIGNMENT = 0;

	/**
	 * The number of structural features of the '<em>Argument Assignment List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSIGNMENT_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ArgumentAssignmentTypeImpl <em>Argument Assignment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ArgumentAssignmentTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getArgumentAssignmentType()
	 * @generated
	 */
	int ARGUMENT_ASSIGNMENT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Argument Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSIGNMENT_TYPE__ARGUMENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Argument Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSIGNMENT_TYPE__ARGUMENT_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Argument Assignment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSIGNMENT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ArgumentListTypeImpl <em>Argument List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ArgumentListTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getArgumentListType()
	 * @generated
	 */
	int ARGUMENT_LIST_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_LIST_TYPE__ARGUMENT = 0;

	/**
	 * The number of structural features of the '<em>Argument List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ArgumentListType1Impl <em>Argument List Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ArgumentListType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getArgumentListType1()
	 * @generated
	 */
	int ARGUMENT_LIST_TYPE1 = 13;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_LIST_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_LIST_TYPE1__ARGUMENT = 1;

	/**
	 * The number of structural features of the '<em>Argument List Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_LIST_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.SequenceEntryTypeImpl <em>Sequence Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.SequenceEntryTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSequenceEntryType()
	 * @generated
	 */
	int SEQUENCE_ENTRY_TYPE = 174;

	/**
	 * The feature id for the '<em><b>Location In Container In Bits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS = 0;

	/**
	 * The feature id for the '<em><b>Repeat Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Include Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Sequence Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ENTRY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ArgumentRefEntryTypeImpl <em>Argument Ref Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ArgumentRefEntryTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getArgumentRefEntryType()
	 * @generated
	 */
	int ARGUMENT_REF_ENTRY_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Location In Container In Bits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REF_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS = SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS;

	/**
	 * The feature id for the '<em><b>Repeat Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REF_ENTRY_TYPE__REPEAT_ENTRY = SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY;

	/**
	 * The feature id for the '<em><b>Include Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REF_ENTRY_TYPE__INCLUDE_CONDITION = SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION;

	/**
	 * The feature id for the '<em><b>Argument Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REF_ENTRY_TYPE__ARGUMENT_REF = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument Ref Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REF_ENTRY_TYPE_FEATURE_COUNT = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ArgumentTypeImpl <em>Argument Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ArgumentTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getArgumentType()
	 * @generated
	 */
	int ARGUMENT_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Argument Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ArgumentType1Impl <em>Argument Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ArgumentType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getArgumentType1()
	 * @generated
	 */
	int ARGUMENT_TYPE1 = 16;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE1__LONG_DESCRIPTION = NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE1__ALIAS_SET = NAME_DESCRIPTION_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE1__NAME = NAME_DESCRIPTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE1__SHORT_DESCRIPTION = NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Argument Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE1__ARGUMENT_TYPE_REF = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE1_FEATURE_COUNT = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ArgumentTypeSetTypeImpl <em>Argument Type Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ArgumentTypeSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getArgumentTypeSetType()
	 * @generated
	 */
	int ARGUMENT_TYPE_SET_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_SET_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>String Argument Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_SET_TYPE__STRING_ARGUMENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Enumerated Argument Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_SET_TYPE__ENUMERATED_ARGUMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Integer Argument Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_SET_TYPE__INTEGER_ARGUMENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Binary Argument Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_SET_TYPE__BINARY_ARGUMENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Float Argument Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_SET_TYPE__FLOAT_ARGUMENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Boolean Argument Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_SET_TYPE__BOOLEAN_ARGUMENT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Relative Time Agument Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_SET_TYPE__RELATIVE_TIME_AGUMENT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Absolute Time Argument Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_SET_TYPE__ABSOLUTE_TIME_ARGUMENT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Argumement Array Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_SET_TYPE__ARGUMEMENT_ARRAY_TYPE = 9;

	/**
	 * The number of structural features of the '<em>Argument Type Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TYPE_SET_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ArrayParameterRefEntryTypeImpl <em>Array Parameter Ref Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ArrayParameterRefEntryTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getArrayParameterRefEntryType()
	 * @generated
	 */
	int ARRAY_PARAMETER_REF_ENTRY_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Location In Container In Bits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_REF_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS = SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS;

	/**
	 * The feature id for the '<em><b>Repeat Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_REF_ENTRY_TYPE__REPEAT_ENTRY = SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY;

	/**
	 * The feature id for the '<em><b>Include Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_REF_ENTRY_TYPE__INCLUDE_CONDITION = SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION;

	/**
	 * The feature id for the '<em><b>Dimension List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_REF_ENTRY_TYPE__DIMENSION_LIST = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Entry For This Array Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_REF_ENTRY_TYPE__LAST_ENTRY_FOR_THIS_ARRAY_INSTANCE = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_REF_ENTRY_TYPE__PARAMETER_REF = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Array Parameter Ref Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_REF_ENTRY_TYPE_FEATURE_COUNT = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ArrayParameterTypeTypeImpl <em>Array Parameter Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ArrayParameterTypeTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getArrayParameterTypeType()
	 * @generated
	 */
	int ARRAY_PARAMETER_TYPE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE_TYPE__LONG_DESCRIPTION = NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE_TYPE__ALIAS_SET = NAME_DESCRIPTION_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE_TYPE__NAME = NAME_DESCRIPTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE_TYPE__SHORT_DESCRIPTION = NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Array Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE_TYPE__ARRAY_TYPE_REF = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE_TYPE__NUMBER_OF_DIMENSIONS = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Parameter Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE_TYPE_FEATURE_COUNT = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.AuthorSetTypeImpl <em>Author Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.AuthorSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getAuthorSetType()
	 * @generated
	 */
	int AUTHOR_SET_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_SET_TYPE__AUTHOR = 0;

	/**
	 * The number of structural features of the '<em>Author Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_SET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.AutoInvertTypeImpl <em>Auto Invert Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.AutoInvertTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getAutoInvertType()
	 * @generated
	 */
	int AUTO_INVERT_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Invert Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_INVERT_TYPE__INVERT_ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Bad Frames To Auto Invert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_INVERT_TYPE__BAD_FRAMES_TO_AUTO_INVERT = 1;

	/**
	 * The number of structural features of the '<em>Auto Invert Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_INVERT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.BaseContainerTypeImpl <em>Base Container Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.BaseContainerTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getBaseContainerType()
	 * @generated
	 */
	int BASE_CONTAINER_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Restriction Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINER_TYPE__RESTRICTION_CRITERIA = 0;

	/**
	 * The feature id for the '<em><b>Container Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINER_TYPE__CONTAINER_REF = 1;

	/**
	 * The number of structural features of the '<em>Base Container Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.BaseContainerType1Impl <em>Base Container Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.BaseContainerType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getBaseContainerType1()
	 * @generated
	 */
	int BASE_CONTAINER_TYPE1 = 23;

	/**
	 * The feature id for the '<em><b>Restriction Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINER_TYPE1__RESTRICTION_CRITERIA = 0;

	/**
	 * The feature id for the '<em><b>Container Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINER_TYPE1__CONTAINER_REF = 1;

	/**
	 * The number of structural features of the '<em>Base Container Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINER_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.BaseDataTypeImpl <em>Base Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.BaseDataTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getBaseDataType()
	 * @generated
	 */
	int BASE_DATA_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE__LONG_DESCRIPTION = NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE__ALIAS_SET = NAME_DESCRIPTION_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE__NAME = NAME_DESCRIPTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE__SHORT_DESCRIPTION = NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE__UNIT_SET = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binary Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE__BINARY_DATA_ENCODING = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Float Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE__FLOAT_DATA_ENCODING = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Integer Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE__INTEGER_DATA_ENCODING = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>String Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE__STRING_DATA_ENCODING = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Base Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DATA_TYPE_FEATURE_COUNT = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.BaseMetaCommandTypeImpl <em>Base Meta Command Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.BaseMetaCommandTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getBaseMetaCommandType()
	 * @generated
	 */
	int BASE_META_COMMAND_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Argument Assignment List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_META_COMMAND_TYPE__ARGUMENT_ASSIGNMENT_LIST = 0;

	/**
	 * The feature id for the '<em><b>Meta Command Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_META_COMMAND_TYPE__META_COMMAND_REF = 1;

	/**
	 * The number of structural features of the '<em>Base Meta Command Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_META_COMMAND_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.DataEncodingTypeImpl <em>Data Encoding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.DataEncodingTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getDataEncodingType()
	 * @generated
	 */
	int DATA_ENCODING_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Error Detect Correct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT = 0;

	/**
	 * The feature id for the '<em><b>Byte Order List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENCODING_TYPE__BYTE_ORDER_LIST = 1;

	/**
	 * The feature id for the '<em><b>Bit Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENCODING_TYPE__BIT_ORDER = 2;

	/**
	 * The number of structural features of the '<em>Data Encoding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENCODING_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.BinaryDataEncodingTypeImpl <em>Binary Data Encoding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.BinaryDataEncodingTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getBinaryDataEncodingType()
	 * @generated
	 */
	int BINARY_DATA_ENCODING_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Error Detect Correct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT = DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT;

	/**
	 * The feature id for the '<em><b>Byte Order List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_ENCODING_TYPE__BYTE_ORDER_LIST = DATA_ENCODING_TYPE__BYTE_ORDER_LIST;

	/**
	 * The feature id for the '<em><b>Bit Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_ENCODING_TYPE__BIT_ORDER = DATA_ENCODING_TYPE__BIT_ORDER;

	/**
	 * The feature id for the '<em><b>Size In Bits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_ENCODING_TYPE__SIZE_IN_BITS = DATA_ENCODING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Binary Transform Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_ENCODING_TYPE__FROM_BINARY_TRANSFORM_ALGORITHM = DATA_ENCODING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Binary Transform Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_ENCODING_TYPE__TO_BINARY_TRANSFORM_ALGORITHM = DATA_ENCODING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Data Encoding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_ENCODING_TYPE_FEATURE_COUNT = DATA_ENCODING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.BinaryDataTypeImpl <em>Binary Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.BinaryDataTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getBinaryDataType()
	 * @generated
	 */
	int BINARY_DATA_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_TYPE__LONG_DESCRIPTION = BASE_DATA_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_TYPE__ALIAS_SET = BASE_DATA_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_TYPE__NAME = BASE_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_TYPE__SHORT_DESCRIPTION = BASE_DATA_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_TYPE__UNIT_SET = BASE_DATA_TYPE__UNIT_SET;

	/**
	 * The feature id for the '<em><b>Binary Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_TYPE__BINARY_DATA_ENCODING = BASE_DATA_TYPE__BINARY_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Float Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_TYPE__FLOAT_DATA_ENCODING = BASE_DATA_TYPE__FLOAT_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Integer Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_TYPE__INTEGER_DATA_ENCODING = BASE_DATA_TYPE__INTEGER_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>String Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_TYPE__STRING_DATA_ENCODING = BASE_DATA_TYPE__STRING_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_TYPE__INITIAL_VALUE = BASE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DATA_TYPE_FEATURE_COUNT = BASE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.BlockMetaCommandTypeImpl <em>Block Meta Command Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.BlockMetaCommandTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getBlockMetaCommandType()
	 * @generated
	 */
	int BLOCK_META_COMMAND_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_META_COMMAND_TYPE__LONG_DESCRIPTION = NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_META_COMMAND_TYPE__ALIAS_SET = NAME_DESCRIPTION_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_META_COMMAND_TYPE__NAME = NAME_DESCRIPTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_META_COMMAND_TYPE__SHORT_DESCRIPTION = NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Meta Command Step List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_META_COMMAND_TYPE__META_COMMAND_STEP_LIST = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Meta Command Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_META_COMMAND_TYPE_FEATURE_COUNT = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.BooleanDataTypeImpl <em>Boolean Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.BooleanDataTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getBooleanDataType()
	 * @generated
	 */
	int BOOLEAN_DATA_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA_TYPE__LONG_DESCRIPTION = BASE_DATA_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA_TYPE__ALIAS_SET = BASE_DATA_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA_TYPE__NAME = BASE_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA_TYPE__SHORT_DESCRIPTION = BASE_DATA_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA_TYPE__UNIT_SET = BASE_DATA_TYPE__UNIT_SET;

	/**
	 * The feature id for the '<em><b>Binary Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA_TYPE__BINARY_DATA_ENCODING = BASE_DATA_TYPE__BINARY_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Float Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA_TYPE__FLOAT_DATA_ENCODING = BASE_DATA_TYPE__FLOAT_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Integer Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA_TYPE__INTEGER_DATA_ENCODING = BASE_DATA_TYPE__INTEGER_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>String Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA_TYPE__STRING_DATA_ENCODING = BASE_DATA_TYPE__STRING_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA_TYPE__INITIAL_VALUE = BASE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>One String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA_TYPE__ONE_STRING_VALUE = BASE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Zero String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA_TYPE__ZERO_STRING_VALUE = BASE_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA_TYPE_FEATURE_COUNT = BASE_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.BooleanExpressionTypeImpl <em>Boolean Expression Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.BooleanExpressionTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getBooleanExpressionType()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_TYPE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>AN Ded Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_TYPE__AN_DED_CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>ORed Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_TYPE__ORED_CONDITIONS = 2;

	/**
	 * The number of structural features of the '<em>Boolean Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ByteOrderTypeImpl <em>Byte Order Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ByteOrderTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getByteOrderType()
	 * @generated
	 */
	int BYTE_ORDER_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_ORDER_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Byte</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_ORDER_TYPE__BYTE = 1;

	/**
	 * The number of structural features of the '<em>Byte Order Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_ORDER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ByteTypeImpl <em>Byte Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ByteTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getByteType()
	 * @generated
	 */
	int BYTE_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Byte Significance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_TYPE__BYTE_SIGNIFICANCE = 0;

	/**
	 * The number of structural features of the '<em>Byte Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.CalibratorTypeImpl <em>Calibrator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.CalibratorTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getCalibratorType()
	 * @generated
	 */
	int CALIBRATOR_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Spline Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATOR_TYPE__SPLINE_CALIBRATOR = 0;

	/**
	 * The feature id for the '<em><b>Polynomial Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATOR_TYPE__POLYNOMIAL_CALIBRATOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATOR_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Calibrator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATOR_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ChangeTypeImpl <em>Change Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ChangeTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getChangeType()
	 * @generated
	 */
	int CHANGE_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Change Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.CommandContainerEntryListTypeImpl <em>Command Container Entry List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.CommandContainerEntryListTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getCommandContainerEntryListType()
	 * @generated
	 */
	int COMMAND_CONTAINER_ENTRY_LIST_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_ENTRY_LIST_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Parameter Ref Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_ENTRY_LIST_TYPE__PARAMETER_REF_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Parameter Segment Ref Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_ENTRY_LIST_TYPE__PARAMETER_SEGMENT_REF_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Container Ref Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_ENTRY_LIST_TYPE__CONTAINER_REF_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Container Segment Ref Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_ENTRY_LIST_TYPE__CONTAINER_SEGMENT_REF_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Stream Segment Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_ENTRY_LIST_TYPE__STREAM_SEGMENT_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Indirect Parameter Ref Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_ENTRY_LIST_TYPE__INDIRECT_PARAMETER_REF_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Array Parameter Ref Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARRAY_PARAMETER_REF_ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Argument Ref Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARGUMENT_REF_ENTRY = 8;

	/**
	 * The feature id for the '<em><b>Array Argument Ref Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_ENTRY_LIST_TYPE__ARRAY_ARGUMENT_REF_ENTRY = 9;

	/**
	 * The feature id for the '<em><b>Fixed Value Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_ENTRY_LIST_TYPE__FIXED_VALUE_ENTRY = 10;

	/**
	 * The number of structural features of the '<em>Command Container Entry List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_ENTRY_LIST_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.CommandContainerSetTypeImpl <em>Command Container Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.CommandContainerSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getCommandContainerSetType()
	 * @generated
	 */
	int COMMAND_CONTAINER_SET_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Command Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_SET_TYPE__COMMAND_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Command Container Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_SET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContainerTypeImpl <em>Container Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContainerTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContainerType()
	 * @generated
	 */
	int CONTAINER_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__LONG_DESCRIPTION = NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__ALIAS_SET = NAME_DESCRIPTION_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__NAME = NAME_DESCRIPTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__SHORT_DESCRIPTION = NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default Rate In Stream</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__DEFAULT_RATE_IN_STREAM = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rate In Stream Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__RATE_IN_STREAM_SET = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Binary Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__BINARY_ENCODING = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Container Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE_FEATURE_COUNT = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.CommandContainerTypeImpl <em>Command Container Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.CommandContainerTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getCommandContainerType()
	 * @generated
	 */
	int COMMAND_CONTAINER_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_TYPE__LONG_DESCRIPTION = CONTAINER_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_TYPE__ALIAS_SET = CONTAINER_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_TYPE__NAME = CONTAINER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_TYPE__SHORT_DESCRIPTION = CONTAINER_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default Rate In Stream</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_TYPE__DEFAULT_RATE_IN_STREAM = CONTAINER_TYPE__DEFAULT_RATE_IN_STREAM;

	/**
	 * The feature id for the '<em><b>Rate In Stream Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_TYPE__RATE_IN_STREAM_SET = CONTAINER_TYPE__RATE_IN_STREAM_SET;

	/**
	 * The feature id for the '<em><b>Binary Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_TYPE__BINARY_ENCODING = CONTAINER_TYPE__BINARY_ENCODING;

	/**
	 * The feature id for the '<em><b>Entry List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_TYPE__ENTRY_LIST = CONTAINER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_TYPE__BASE_CONTAINER = CONTAINER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Command Container Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONTAINER_TYPE_FEATURE_COUNT = CONTAINER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.CommandMetaDataTypeImpl <em>Command Meta Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.CommandMetaDataTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getCommandMetaDataType()
	 * @generated
	 */
	int COMMAND_META_DATA_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Parameter Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_META_DATA_TYPE__PARAMETER_TYPE_SET = 0;

	/**
	 * The feature id for the '<em><b>Parameter Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_META_DATA_TYPE__PARAMETER_SET = 1;

	/**
	 * The feature id for the '<em><b>Argument Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_META_DATA_TYPE__ARGUMENT_TYPE_SET = 2;

	/**
	 * The feature id for the '<em><b>Meta Command Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_META_DATA_TYPE__META_COMMAND_SET = 3;

	/**
	 * The feature id for the '<em><b>Command Container Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_META_DATA_TYPE__COMMAND_CONTAINER_SET = 4;

	/**
	 * The feature id for the '<em><b>Stream Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_META_DATA_TYPE__STREAM_SET = 5;

	/**
	 * The feature id for the '<em><b>Algorithm Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_META_DATA_TYPE__ALGORITHM_SET = 6;

	/**
	 * The number of structural features of the '<em>Command Meta Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_META_DATA_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ComparisonCheckTypeImpl <em>Comparison Check Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ComparisonCheckTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getComparisonCheckType()
	 * @generated
	 */
	int COMPARISON_CHECK_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Parameter Instance Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF = 0;

	/**
	 * The feature id for the '<em><b>Comparison Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CHECK_TYPE__COMPARISON_OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Parameter Instance Ref1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CHECK_TYPE__PARAMETER_INSTANCE_REF1 = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CHECK_TYPE__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Comparison Check Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CHECK_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ComparisonListTypeImpl <em>Comparison List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ComparisonListTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getComparisonListType()
	 * @generated
	 */
	int COMPARISON_LIST_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_LIST_TYPE__COMPARISON = 0;

	/**
	 * The number of structural features of the '<em>Comparison List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ComparisonListType1Impl <em>Comparison List Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ComparisonListType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getComparisonListType1()
	 * @generated
	 */
	int COMPARISON_LIST_TYPE1 = 43;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_LIST_TYPE1__COMPARISON = 0;

	/**
	 * The number of structural features of the '<em>Comparison List Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_LIST_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ParameterRefType1Impl <em>Parameter Ref Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ParameterRefType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getParameterRefType1()
	 * @generated
	 */
	int PARAMETER_REF_TYPE1 = 145;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_TYPE1__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_TYPE1__PARAMETER_REF = 1;

	/**
	 * The number of structural features of the '<em>Parameter Ref Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ParameterInstanceRefType1Impl <em>Parameter Instance Ref Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ParameterInstanceRefType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getParameterInstanceRefType1()
	 * @generated
	 */
	int PARAMETER_INSTANCE_REF_TYPE1 = 141;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE_REF_TYPE1__VALUE = PARAMETER_REF_TYPE1__VALUE;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE_REF_TYPE1__PARAMETER_REF = PARAMETER_REF_TYPE1__PARAMETER_REF;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE_REF_TYPE1__INSTANCE = PARAMETER_REF_TYPE1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use Calibrated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE_REF_TYPE1__USE_CALIBRATED_VALUE = PARAMETER_REF_TYPE1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Instance Ref Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE_REF_TYPE1_FEATURE_COUNT = PARAMETER_REF_TYPE1_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ComparisonTypeImpl <em>Comparison Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ComparisonTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getComparisonType()
	 * @generated
	 */
	int COMPARISON_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_TYPE__VALUE = PARAMETER_INSTANCE_REF_TYPE1__VALUE;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_TYPE__PARAMETER_REF = PARAMETER_INSTANCE_REF_TYPE1__PARAMETER_REF;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_TYPE__INSTANCE = PARAMETER_INSTANCE_REF_TYPE1__INSTANCE;

	/**
	 * The feature id for the '<em><b>Use Calibrated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_TYPE__USE_CALIBRATED_VALUE = PARAMETER_INSTANCE_REF_TYPE1__USE_CALIBRATED_VALUE;

	/**
	 * The feature id for the '<em><b>Comparison Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_TYPE__COMPARISON_OPERATOR = PARAMETER_INSTANCE_REF_TYPE1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_TYPE__VALUE1 = PARAMETER_INSTANCE_REF_TYPE1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comparison Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_TYPE_FEATURE_COUNT = PARAMETER_INSTANCE_REF_TYPE1_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.CompleteVerifierTypeImpl <em>Complete Verifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.CompleteVerifierTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getCompleteVerifierType()
	 * @generated
	 */
	int COMPLETE_VERIFIER_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_VERIFIER_TYPE__COMPARISON = COMMAND_VERIFIER_TYPE__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comparison List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_VERIFIER_TYPE__COMPARISON_LIST = COMMAND_VERIFIER_TYPE__COMPARISON_LIST;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_VERIFIER_TYPE__BOOLEAN_EXPRESSION = COMMAND_VERIFIER_TYPE__BOOLEAN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Container Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_VERIFIER_TYPE__CONTAINER_REF = COMMAND_VERIFIER_TYPE__CONTAINER_REF;

	/**
	 * The feature id for the '<em><b>Parameter Value Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE = COMMAND_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE;

	/**
	 * The feature id for the '<em><b>Custom Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_VERIFIER_TYPE__CUSTOM_ALGORITHM = COMMAND_VERIFIER_TYPE__CUSTOM_ALGORITHM;

	/**
	 * The feature id for the '<em><b>Time To Wait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_VERIFIER_TYPE__TIME_TO_WAIT = COMMAND_VERIFIER_TYPE__TIME_TO_WAIT;

	/**
	 * The feature id for the '<em><b>Return Parm Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_VERIFIER_TYPE__RETURN_PARM_REF = COMMAND_VERIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complete Verifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_VERIFIER_TYPE_FEATURE_COUNT = COMMAND_VERIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ConditionalAlarmTypeImpl <em>Conditional Alarm Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ConditionalAlarmTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getConditionalAlarmType()
	 * @generated
	 */
	int CONDITIONAL_ALARM_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Static Alarm Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ALARM_TYPE__STATIC_ALARM_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Change Per Second Alarm Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ALARM_TYPE__CHANGE_PER_SECOND_ALARM_CONDITIONS = 1;

	/**
	 * The number of structural features of the '<em>Conditional Alarm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ALARM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ConstantTypeImpl <em>Constant Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ConstantTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getConstantType()
	 * @generated
	 */
	int CONSTANT_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Constant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_TYPE__CONSTANT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Constant Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContainerRefEntryTypeImpl <em>Container Ref Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContainerRefEntryTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContainerRefEntryType()
	 * @generated
	 */
	int CONTAINER_REF_ENTRY_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Location In Container In Bits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_REF_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS = SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS;

	/**
	 * The feature id for the '<em><b>Repeat Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_REF_ENTRY_TYPE__REPEAT_ENTRY = SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY;

	/**
	 * The feature id for the '<em><b>Include Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_REF_ENTRY_TYPE__INCLUDE_CONDITION = SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION;

	/**
	 * The feature id for the '<em><b>Container Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_REF_ENTRY_TYPE__CONTAINER_REF = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Ref Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_REF_ENTRY_TYPE_FEATURE_COUNT = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContainerRefSetTypeImpl <em>Container Ref Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContainerRefSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContainerRefSetType()
	 * @generated
	 */
	int CONTAINER_REF_SET_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Container Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_REF_SET_TYPE__CONTAINER_REF = 0;

	/**
	 * The number of structural features of the '<em>Container Ref Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_REF_SET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContainerRefTypeImpl <em>Container Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContainerRefTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContainerRefType()
	 * @generated
	 */
	int CONTAINER_REF_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Container Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_REF_TYPE__CONTAINER_REF = 0;

	/**
	 * The number of structural features of the '<em>Container Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_REF_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContainerSegmentRefEntryTypeImpl <em>Container Segment Ref Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContainerSegmentRefEntryTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContainerSegmentRefEntryType()
	 * @generated
	 */
	int CONTAINER_SEGMENT_REF_ENTRY_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Location In Container In Bits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SEGMENT_REF_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS = SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS;

	/**
	 * The feature id for the '<em><b>Repeat Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SEGMENT_REF_ENTRY_TYPE__REPEAT_ENTRY = SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY;

	/**
	 * The feature id for the '<em><b>Include Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SEGMENT_REF_ENTRY_TYPE__INCLUDE_CONDITION = SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION;

	/**
	 * The feature id for the '<em><b>Container Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SEGMENT_REF_ENTRY_TYPE__CONTAINER_REF = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SEGMENT_REF_ENTRY_TYPE__ORDER = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SEGMENT_REF_ENTRY_TYPE__SIZE_IN_BITS = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Container Segment Ref Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SEGMENT_REF_ENTRY_TYPE_FEATURE_COUNT = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContainerSetTypeImpl <em>Container Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContainerSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContainerSetType()
	 * @generated
	 */
	int CONTAINER_SET_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SET_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Sequence Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SET_TYPE__SEQUENCE_CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Container Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContextAlarmListTypeImpl <em>Context Alarm List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContextAlarmListTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContextAlarmListType()
	 * @generated
	 */
	int CONTEXT_ALARM_LIST_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Context Alarm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ALARM_LIST_TYPE__CONTEXT_ALARM = 0;

	/**
	 * The number of structural features of the '<em>Context Alarm List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ALARM_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContextAlarmListType1Impl <em>Context Alarm List Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContextAlarmListType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContextAlarmListType1()
	 * @generated
	 */
	int CONTEXT_ALARM_LIST_TYPE1 = 55;

	/**
	 * The feature id for the '<em><b>Context Alarm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ALARM_LIST_TYPE1__CONTEXT_ALARM = 0;

	/**
	 * The number of structural features of the '<em>Context Alarm List Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ALARM_LIST_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContextAlarmListType2Impl <em>Context Alarm List Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContextAlarmListType2Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContextAlarmListType2()
	 * @generated
	 */
	int CONTEXT_ALARM_LIST_TYPE2 = 56;

	/**
	 * The feature id for the '<em><b>Context Alarm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ALARM_LIST_TYPE2__CONTEXT_ALARM = 0;

	/**
	 * The number of structural features of the '<em>Context Alarm List Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ALARM_LIST_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContextAlarmListType3Impl <em>Context Alarm List Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContextAlarmListType3Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContextAlarmListType3()
	 * @generated
	 */
	int CONTEXT_ALARM_LIST_TYPE3 = 57;

	/**
	 * The feature id for the '<em><b>Context Alarm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ALARM_LIST_TYPE3__CONTEXT_ALARM = 0;

	/**
	 * The number of structural features of the '<em>Context Alarm List Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ALARM_LIST_TYPE3_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.NumericAlarmConditionTypeImpl <em>Numeric Alarm Condition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.NumericAlarmConditionTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getNumericAlarmConditionType()
	 * @generated
	 */
	int NUMERIC_ALARM_CONDITION_TYPE = 134;

	/**
	 * The feature id for the '<em><b>Static Alarm Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_ALARM_CONDITION_TYPE__STATIC_ALARM_RANGES = 0;

	/**
	 * The feature id for the '<em><b>Change Per Second Alarm Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_ALARM_CONDITION_TYPE__CHANGE_PER_SECOND_ALARM_RANGES = 1;

	/**
	 * The feature id for the '<em><b>Conditional Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_ALARM_CONDITION_TYPE__CONDITIONAL_ALARM = 2;

	/**
	 * The feature id for the '<em><b>Custom Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_ALARM_CONDITION_TYPE__CUSTOM_ALARM = 3;

	/**
	 * The feature id for the '<em><b>Min Violations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_ALARM_CONDITION_TYPE__MIN_VIOLATIONS = 4;

	/**
	 * The number of structural features of the '<em>Numeric Alarm Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_ALARM_CONDITION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContextAlarmTypeImpl <em>Context Alarm Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContextAlarmTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContextAlarmType()
	 * @generated
	 */
	int CONTEXT_ALARM_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Static Alarm Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ALARM_TYPE__STATIC_ALARM_RANGES = NUMERIC_ALARM_CONDITION_TYPE__STATIC_ALARM_RANGES;

	/**
	 * The feature id for the '<em><b>Change Per Second Alarm Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ALARM_TYPE__CHANGE_PER_SECOND_ALARM_RANGES = NUMERIC_ALARM_CONDITION_TYPE__CHANGE_PER_SECOND_ALARM_RANGES;

	/**
	 * The feature id for the '<em><b>Conditional Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ALARM_TYPE__CONDITIONAL_ALARM = NUMERIC_ALARM_CONDITION_TYPE__CONDITIONAL_ALARM;

	/**
	 * The feature id for the '<em><b>Custom Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ALARM_TYPE__CUSTOM_ALARM = NUMERIC_ALARM_CONDITION_TYPE__CUSTOM_ALARM;

	/**
	 * The feature id for the '<em><b>Min Violations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ALARM_TYPE__MIN_VIOLATIONS = NUMERIC_ALARM_CONDITION_TYPE__MIN_VIOLATIONS;

	/**
	 * The feature id for the '<em><b>Context Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ALARM_TYPE__CONTEXT_MATCH = NUMERIC_ALARM_CONDITION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context Alarm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ALARM_TYPE_FEATURE_COUNT = NUMERIC_ALARM_CONDITION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContextCalibratorListTypeImpl <em>Context Calibrator List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContextCalibratorListTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContextCalibratorListType()
	 * @generated
	 */
	int CONTEXT_CALIBRATOR_LIST_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Context Calibrator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_LIST_TYPE__CONTEXT_CALIBRATOR = 0;

	/**
	 * The number of structural features of the '<em>Context Calibrator List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContextCalibratorListType1Impl <em>Context Calibrator List Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContextCalibratorListType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContextCalibratorListType1()
	 * @generated
	 */
	int CONTEXT_CALIBRATOR_LIST_TYPE1 = 60;

	/**
	 * The feature id for the '<em><b>Context Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_LIST_TYPE1__CONTEXT_CALIBRATOR = 0;

	/**
	 * The number of structural features of the '<em>Context Calibrator List Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_LIST_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContextCalibratorListType2Impl <em>Context Calibrator List Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContextCalibratorListType2Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContextCalibratorListType2()
	 * @generated
	 */
	int CONTEXT_CALIBRATOR_LIST_TYPE2 = 61;

	/**
	 * The feature id for the '<em><b>Context Calibrator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_LIST_TYPE2__CONTEXT_CALIBRATOR = 0;

	/**
	 * The number of structural features of the '<em>Context Calibrator List Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_LIST_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContextCalibratorListType3Impl <em>Context Calibrator List Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContextCalibratorListType3Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContextCalibratorListType3()
	 * @generated
	 */
	int CONTEXT_CALIBRATOR_LIST_TYPE3 = 62;

	/**
	 * The feature id for the '<em><b>Context Calibrator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_LIST_TYPE3__CONTEXT_CALIBRATOR = 0;

	/**
	 * The number of structural features of the '<em>Context Calibrator List Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_LIST_TYPE3_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContextCalibratorListType4Impl <em>Context Calibrator List Type4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContextCalibratorListType4Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContextCalibratorListType4()
	 * @generated
	 */
	int CONTEXT_CALIBRATOR_LIST_TYPE4 = 63;

	/**
	 * The feature id for the '<em><b>Context Calibrator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_LIST_TYPE4__CONTEXT_CALIBRATOR = 0;

	/**
	 * The number of structural features of the '<em>Context Calibrator List Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_LIST_TYPE4_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContextCalibratorTypeImpl <em>Context Calibrator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContextCalibratorTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContextCalibratorType()
	 * @generated
	 */
	int CONTEXT_CALIBRATOR_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Use When Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_TYPE__USE_WHEN_CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_TYPE__CALIBRATOR = 1;

	/**
	 * The number of structural features of the '<em>Context Calibrator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContextCalibratorType1Impl <em>Context Calibrator Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContextCalibratorType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContextCalibratorType1()
	 * @generated
	 */
	int CONTEXT_CALIBRATOR_TYPE1 = 65;

	/**
	 * The feature id for the '<em><b>Use When Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_TYPE1__USE_WHEN_CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_TYPE1__CALIBRATOR = 1;

	/**
	 * The number of structural features of the '<em>Context Calibrator Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContextCalibratorType2Impl <em>Context Calibrator Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContextCalibratorType2Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContextCalibratorType2()
	 * @generated
	 */
	int CONTEXT_CALIBRATOR_TYPE2 = 66;

	/**
	 * The feature id for the '<em><b>Context Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_TYPE2__CONTEXT_MATCH = 0;

	/**
	 * The feature id for the '<em><b>Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_TYPE2__CALIBRATOR = 1;

	/**
	 * The number of structural features of the '<em>Context Calibrator Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_TYPE2_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContextCalibratorType3Impl <em>Context Calibrator Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContextCalibratorType3Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContextCalibratorType3()
	 * @generated
	 */
	int CONTEXT_CALIBRATOR_TYPE3 = 67;

	/**
	 * The feature id for the '<em><b>Use When Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_TYPE3__USE_WHEN_CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_TYPE3__CALIBRATOR = 1;

	/**
	 * The number of structural features of the '<em>Context Calibrator Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CALIBRATOR_TYPE3_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContextSignificanceListTypeImpl <em>Context Significance List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContextSignificanceListTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContextSignificanceListType()
	 * @generated
	 */
	int CONTEXT_SIGNIFICANCE_LIST_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Context Significance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SIGNIFICANCE_LIST_TYPE__CONTEXT_SIGNIFICANCE = 0;

	/**
	 * The number of structural features of the '<em>Context Significance List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SIGNIFICANCE_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ContextSignificanceTypeImpl <em>Context Significance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ContextSignificanceTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getContextSignificanceType()
	 * @generated
	 */
	int CONTEXT_SIGNIFICANCE_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Context Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SIGNIFICANCE_TYPE__CONTEXT_MATCH = 0;

	/**
	 * The feature id for the '<em><b>Significance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SIGNIFICANCE_TYPE__SIGNIFICANCE = 1;

	/**
	 * The number of structural features of the '<em>Context Significance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SIGNIFICANCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.CRCTypeImpl <em>CRC Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.CRCTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getCRCType()
	 * @generated
	 */
	int CRC_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Polynomial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRC_TYPE__POLYNOMIAL = 0;

	/**
	 * The feature id for the '<em><b>Bits From Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRC_TYPE__BITS_FROM_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRC_TYPE__REFERENCE = 2;

	/**
	 * The number of structural features of the '<em>CRC Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRC_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.PCMStreamTypeImpl <em>PCM Stream Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.PCMStreamTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getPCMStreamType()
	 * @generated
	 */
	int PCM_STREAM_TYPE = 155;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_STREAM_TYPE__LONG_DESCRIPTION = NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_STREAM_TYPE__ALIAS_SET = NAME_DESCRIPTION_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_STREAM_TYPE__NAME = NAME_DESCRIPTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_STREAM_TYPE__SHORT_DESCRIPTION = NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Bit Rate In BPS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_STREAM_TYPE__BIT_RATE_IN_BPS = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_STREAM_TYPE__INVERTED = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pcm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_STREAM_TYPE__PCM_TYPE = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PCM Stream Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_STREAM_TYPE_FEATURE_COUNT = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.CustomStreamTypeImpl <em>Custom Stream Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.CustomStreamTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getCustomStreamType()
	 * @generated
	 */
	int CUSTOM_STREAM_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STREAM_TYPE__LONG_DESCRIPTION = PCM_STREAM_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STREAM_TYPE__ALIAS_SET = PCM_STREAM_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STREAM_TYPE__NAME = PCM_STREAM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STREAM_TYPE__SHORT_DESCRIPTION = PCM_STREAM_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Bit Rate In BPS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STREAM_TYPE__BIT_RATE_IN_BPS = PCM_STREAM_TYPE__BIT_RATE_IN_BPS;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STREAM_TYPE__INVERTED = PCM_STREAM_TYPE__INVERTED;

	/**
	 * The feature id for the '<em><b>Pcm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STREAM_TYPE__PCM_TYPE = PCM_STREAM_TYPE__PCM_TYPE;

	/**
	 * The feature id for the '<em><b>Encoding Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STREAM_TYPE__ENCODING_ALGORITHM = PCM_STREAM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decoding Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STREAM_TYPE__DECODING_ALGORITHM = PCM_STREAM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Decoded Stream Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STREAM_TYPE__DECODED_STREAM_REF = PCM_STREAM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Encoded Stream Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STREAM_TYPE__ENCODED_STREAM_REF = PCM_STREAM_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Custom Stream Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STREAM_TYPE_FEATURE_COUNT = PCM_STREAM_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.DecimalRangeTypeImpl <em>Decimal Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.DecimalRangeTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getDecimalRangeType()
	 * @generated
	 */
	int DECIMAL_RANGE_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_RANGE_TYPE__MAX_EXCLUSIVE = 0;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_RANGE_TYPE__MAX_INCLUSIVE = 1;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_RANGE_TYPE__MIN_EXCLUSIVE = 2;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_RANGE_TYPE__MIN_INCLUSIVE = 3;

	/**
	 * The number of structural features of the '<em>Decimal Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_RANGE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.DecimalValueTypeImpl <em>Decimal Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.DecimalValueTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getDecimalValueType()
	 * @generated
	 */
	int DECIMAL_VALUE_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Fixed Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_VALUE_TYPE__FIXED_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Dynamic Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_VALUE_TYPE__DYNAMIC_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Decimal Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.DefaultsTypeImpl <em>Defaults Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.DefaultsTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getDefaultsType()
	 * @generated
	 */
	int DEFAULTS_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Default Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTS_TYPE__DEFAULT_DATA_ENCODING = 0;

	/**
	 * The feature id for the '<em><b>Parameter Time Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTS_TYPE__PARAMETER_TIME_ASSOCIATION = 1;

	/**
	 * The number of structural features of the '<em>Defaults Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.DimensionListTypeImpl <em>Dimension List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.DimensionListTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getDimensionListType()
	 * @generated
	 */
	int DIMENSION_LIST_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_LIST_TYPE__DIMENSION = 0;

	/**
	 * The number of structural features of the '<em>Dimension List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.DimensionTypeImpl <em>Dimension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.DimensionTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getDimensionType()
	 * @generated
	 */
	int DIMENSION_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Starting Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE__STARTING_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Ending Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE__ENDING_INDEX = 1;

	/**
	 * The number of structural features of the '<em>Dimension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.DiscreteLookupListTypeImpl <em>Discrete Lookup List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.DiscreteLookupListTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getDiscreteLookupListType()
	 * @generated
	 */
	int DISCRETE_LOOKUP_LIST_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Discrete Lookup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOOKUP_LIST_TYPE__DISCRETE_LOOKUP = 0;

	/**
	 * The number of structural features of the '<em>Discrete Lookup List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOOKUP_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.MatchCriteriaTypeImpl <em>Match Criteria Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.MatchCriteriaTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getMatchCriteriaType()
	 * @generated
	 */
	int MATCH_CRITERIA_TYPE = 118;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_CRITERIA_TYPE__COMPARISON = 0;

	/**
	 * The feature id for the '<em><b>Comparison List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_CRITERIA_TYPE__COMPARISON_LIST = 1;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_CRITERIA_TYPE__BOOLEAN_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Custom Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_CRITERIA_TYPE__CUSTOM_ALGORITHM = 3;

	/**
	 * The number of structural features of the '<em>Match Criteria Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_CRITERIA_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.DiscreteLookupTypeImpl <em>Discrete Lookup Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.DiscreteLookupTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getDiscreteLookupType()
	 * @generated
	 */
	int DISCRETE_LOOKUP_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOOKUP_TYPE__COMPARISON = MATCH_CRITERIA_TYPE__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comparison List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOOKUP_TYPE__COMPARISON_LIST = MATCH_CRITERIA_TYPE__COMPARISON_LIST;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOOKUP_TYPE__BOOLEAN_EXPRESSION = MATCH_CRITERIA_TYPE__BOOLEAN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Custom Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOOKUP_TYPE__CUSTOM_ALGORITHM = MATCH_CRITERIA_TYPE__CUSTOM_ALGORITHM;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOOKUP_TYPE__VALUE = MATCH_CRITERIA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discrete Lookup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_LOOKUP_TYPE_FEATURE_COUNT = MATCH_CRITERIA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.DocumentRootImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 80;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Space System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPACE_SYSTEM = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.DynamicValueTypeImpl <em>Dynamic Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.DynamicValueTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getDynamicValueType()
	 * @generated
	 */
	int DYNAMIC_VALUE_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Parameter Instance Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VALUE_TYPE__PARAMETER_INSTANCE_REF = 0;

	/**
	 * The feature id for the '<em><b>Linear Adjustment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VALUE_TYPE__LINEAR_ADJUSTMENT = 1;

	/**
	 * The number of structural features of the '<em>Dynamic Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.DynamicValueType1Impl <em>Dynamic Value Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.DynamicValueType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getDynamicValueType1()
	 * @generated
	 */
	int DYNAMIC_VALUE_TYPE1 = 82;

	/**
	 * The feature id for the '<em><b>Parameter Instance Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VALUE_TYPE1__PARAMETER_INSTANCE_REF = 0;

	/**
	 * The feature id for the '<em><b>Linear Adjustment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VALUE_TYPE1__LINEAR_ADJUSTMENT = 1;

	/**
	 * The number of structural features of the '<em>Dynamic Value Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VALUE_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.EncodingType1Impl <em>Encoding Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.EncodingType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getEncodingType1()
	 * @generated
	 */
	int ENCODING_TYPE1 = 83;

	/**
	 * The feature id for the '<em><b>Binary Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_TYPE1__BINARY_DATA_ENCODING = 0;

	/**
	 * The feature id for the '<em><b>Float Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_TYPE1__FLOAT_DATA_ENCODING = 1;

	/**
	 * The feature id for the '<em><b>Integer Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_TYPE1__INTEGER_DATA_ENCODING = 2;

	/**
	 * The feature id for the '<em><b>String Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_TYPE1__STRING_DATA_ENCODING = 3;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_TYPE1__OFFSET = 4;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_TYPE1__SCALE = 5;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_TYPE1__UNITS = 6;

	/**
	 * The number of structural features of the '<em>Encoding Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_TYPE1_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.EntryListTypeImpl <em>Entry List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.EntryListTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getEntryListType()
	 * @generated
	 */
	int ENTRY_LIST_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_LIST_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Parameter Ref Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_LIST_TYPE__PARAMETER_REF_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Parameter Segment Ref Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_LIST_TYPE__PARAMETER_SEGMENT_REF_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Container Ref Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_LIST_TYPE__CONTAINER_REF_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Container Segment Ref Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_LIST_TYPE__CONTAINER_SEGMENT_REF_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Stream Segment Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_LIST_TYPE__STREAM_SEGMENT_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Indirect Parameter Ref Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_LIST_TYPE__INDIRECT_PARAMETER_REF_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Array Parameter Ref Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_LIST_TYPE__ARRAY_PARAMETER_REF_ENTRY = 7;

	/**
	 * The number of structural features of the '<em>Entry List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_LIST_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.EnumeratedDataTypeImpl <em>Enumerated Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.EnumeratedDataTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getEnumeratedDataType()
	 * @generated
	 */
	int ENUMERATED_DATA_TYPE = 85;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_DATA_TYPE__LONG_DESCRIPTION = BASE_DATA_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_DATA_TYPE__ALIAS_SET = BASE_DATA_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_DATA_TYPE__NAME = BASE_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_DATA_TYPE__SHORT_DESCRIPTION = BASE_DATA_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_DATA_TYPE__UNIT_SET = BASE_DATA_TYPE__UNIT_SET;

	/**
	 * The feature id for the '<em><b>Binary Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_DATA_TYPE__BINARY_DATA_ENCODING = BASE_DATA_TYPE__BINARY_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Float Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_DATA_TYPE__FLOAT_DATA_ENCODING = BASE_DATA_TYPE__FLOAT_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Integer Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_DATA_TYPE__INTEGER_DATA_ENCODING = BASE_DATA_TYPE__INTEGER_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>String Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_DATA_TYPE__STRING_DATA_ENCODING = BASE_DATA_TYPE__STRING_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Enumeration List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_DATA_TYPE__ENUMERATION_LIST = BASE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_DATA_TYPE__INITIAL_VALUE = BASE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumerated Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_DATA_TYPE_FEATURE_COUNT = BASE_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.EnumerationListTypeImpl <em>Enumeration List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.EnumerationListTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getEnumerationListType()
	 * @generated
	 */
	int ENUMERATION_LIST_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LIST_TYPE__ENUMERATION = 0;

	/**
	 * The number of structural features of the '<em>Enumeration List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ErrorDetectCorrectTypeImpl <em>Error Detect Correct Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ErrorDetectCorrectTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getErrorDetectCorrectType()
	 * @generated
	 */
	int ERROR_DETECT_CORRECT_TYPE = 87;

	/**
	 * The feature id for the '<em><b>Parity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_DETECT_CORRECT_TYPE__PARITY = 0;

	/**
	 * The feature id for the '<em><b>CRC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_DETECT_CORRECT_TYPE__CRC = 1;

	/**
	 * The number of structural features of the '<em>Error Detect Correct Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_DETECT_CORRECT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ExecutionVerifierTypeImpl <em>Execution Verifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ExecutionVerifierTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getExecutionVerifierType()
	 * @generated
	 */
	int EXECUTION_VERIFIER_TYPE = 88;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_VERIFIER_TYPE__COMPARISON = COMMAND_VERIFIER_TYPE__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comparison List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_VERIFIER_TYPE__COMPARISON_LIST = COMMAND_VERIFIER_TYPE__COMPARISON_LIST;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_VERIFIER_TYPE__BOOLEAN_EXPRESSION = COMMAND_VERIFIER_TYPE__BOOLEAN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Container Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_VERIFIER_TYPE__CONTAINER_REF = COMMAND_VERIFIER_TYPE__CONTAINER_REF;

	/**
	 * The feature id for the '<em><b>Parameter Value Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE = COMMAND_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE;

	/**
	 * The feature id for the '<em><b>Custom Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_VERIFIER_TYPE__CUSTOM_ALGORITHM = COMMAND_VERIFIER_TYPE__CUSTOM_ALGORITHM;

	/**
	 * The feature id for the '<em><b>Time To Wait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_VERIFIER_TYPE__TIME_TO_WAIT = COMMAND_VERIFIER_TYPE__TIME_TO_WAIT;

	/**
	 * The feature id for the '<em><b>Percent Complete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_VERIFIER_TYPE__PERCENT_COMPLETE = COMMAND_VERIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution Verifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_VERIFIER_TYPE_FEATURE_COUNT = COMMAND_VERIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ExternalAlgorithmSetTypeImpl <em>External Algorithm Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ExternalAlgorithmSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getExternalAlgorithmSetType()
	 * @generated
	 */
	int EXTERNAL_ALGORITHM_SET_TYPE = 89;

	/**
	 * The feature id for the '<em><b>External Algorithm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALGORITHM_SET_TYPE__EXTERNAL_ALGORITHM = 0;

	/**
	 * The number of structural features of the '<em>External Algorithm Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALGORITHM_SET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ExternalAlgorithmTypeImpl <em>External Algorithm Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ExternalAlgorithmTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getExternalAlgorithmType()
	 * @generated
	 */
	int EXTERNAL_ALGORITHM_TYPE = 90;

	/**
	 * The feature id for the '<em><b>Algorithm Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALGORITHM_TYPE__ALGORITHM_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALGORITHM_TYPE__IMPLEMENTATION_NAME = 1;

	/**
	 * The number of structural features of the '<em>External Algorithm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALGORITHM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.FrameStreamTypeImpl <em>Frame Stream Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.FrameStreamTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getFrameStreamType()
	 * @generated
	 */
	int FRAME_STREAM_TYPE = 99;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_STREAM_TYPE__LONG_DESCRIPTION = PCM_STREAM_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_STREAM_TYPE__ALIAS_SET = PCM_STREAM_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_STREAM_TYPE__NAME = PCM_STREAM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_STREAM_TYPE__SHORT_DESCRIPTION = PCM_STREAM_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Bit Rate In BPS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_STREAM_TYPE__BIT_RATE_IN_BPS = PCM_STREAM_TYPE__BIT_RATE_IN_BPS;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_STREAM_TYPE__INVERTED = PCM_STREAM_TYPE__INVERTED;

	/**
	 * The feature id for the '<em><b>Pcm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_STREAM_TYPE__PCM_TYPE = PCM_STREAM_TYPE__PCM_TYPE;

	/**
	 * The feature id for the '<em><b>Container Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_STREAM_TYPE__CONTAINER_REF = PCM_STREAM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_STREAM_TYPE__SERVICE_REF = PCM_STREAM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stream Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_STREAM_TYPE__STREAM_REF = PCM_STREAM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Frame Stream Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_STREAM_TYPE_FEATURE_COUNT = PCM_STREAM_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.FixedFrameStreamTypeImpl <em>Fixed Frame Stream Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.FixedFrameStreamTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getFixedFrameStreamType()
	 * @generated
	 */
	int FIXED_FRAME_STREAM_TYPE = 91;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_STREAM_TYPE__LONG_DESCRIPTION = FRAME_STREAM_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_STREAM_TYPE__ALIAS_SET = FRAME_STREAM_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_STREAM_TYPE__NAME = FRAME_STREAM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_STREAM_TYPE__SHORT_DESCRIPTION = FRAME_STREAM_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Bit Rate In BPS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_STREAM_TYPE__BIT_RATE_IN_BPS = FRAME_STREAM_TYPE__BIT_RATE_IN_BPS;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_STREAM_TYPE__INVERTED = FRAME_STREAM_TYPE__INVERTED;

	/**
	 * The feature id for the '<em><b>Pcm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_STREAM_TYPE__PCM_TYPE = FRAME_STREAM_TYPE__PCM_TYPE;

	/**
	 * The feature id for the '<em><b>Container Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_STREAM_TYPE__CONTAINER_REF = FRAME_STREAM_TYPE__CONTAINER_REF;

	/**
	 * The feature id for the '<em><b>Service Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_STREAM_TYPE__SERVICE_REF = FRAME_STREAM_TYPE__SERVICE_REF;

	/**
	 * The feature id for the '<em><b>Stream Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_STREAM_TYPE__STREAM_REF = FRAME_STREAM_TYPE__STREAM_REF;

	/**
	 * The feature id for the '<em><b>Sync Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_STREAM_TYPE__SYNC_STRATEGY = FRAME_STREAM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frame Length In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_STREAM_TYPE__FRAME_LENGTH_IN_BITS = FRAME_STREAM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sync Aperture In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_STREAM_TYPE__SYNC_APERTURE_IN_BITS = FRAME_STREAM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fixed Frame Stream Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_STREAM_TYPE_FEATURE_COUNT = FRAME_STREAM_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.SyncStrategyTypeImpl <em>Sync Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.SyncStrategyTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSyncStrategyType()
	 * @generated
	 */
	int SYNC_STRATEGY_TYPE = 191;

	/**
	 * The feature id for the '<em><b>Auto Invert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_STRATEGY_TYPE__AUTO_INVERT = 0;

	/**
	 * The feature id for the '<em><b>Check To Lock Good Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_STRATEGY_TYPE__CHECK_TO_LOCK_GOOD_FRAMES = 1;

	/**
	 * The feature id for the '<em><b>Max Bit Errors In Sync Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_STRATEGY_TYPE__MAX_BIT_ERRORS_IN_SYNC_PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Verify To Lock Good Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_STRATEGY_TYPE__VERIFY_TO_LOCK_GOOD_FRAMES = 3;

	/**
	 * The number of structural features of the '<em>Sync Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_STRATEGY_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.FixedFrameSyncStrategyTypeImpl <em>Fixed Frame Sync Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.FixedFrameSyncStrategyTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getFixedFrameSyncStrategyType()
	 * @generated
	 */
	int FIXED_FRAME_SYNC_STRATEGY_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Auto Invert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_SYNC_STRATEGY_TYPE__AUTO_INVERT = SYNC_STRATEGY_TYPE__AUTO_INVERT;

	/**
	 * The feature id for the '<em><b>Check To Lock Good Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_SYNC_STRATEGY_TYPE__CHECK_TO_LOCK_GOOD_FRAMES = SYNC_STRATEGY_TYPE__CHECK_TO_LOCK_GOOD_FRAMES;

	/**
	 * The feature id for the '<em><b>Max Bit Errors In Sync Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_SYNC_STRATEGY_TYPE__MAX_BIT_ERRORS_IN_SYNC_PATTERN = SYNC_STRATEGY_TYPE__MAX_BIT_ERRORS_IN_SYNC_PATTERN;

	/**
	 * The feature id for the '<em><b>Verify To Lock Good Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_SYNC_STRATEGY_TYPE__VERIFY_TO_LOCK_GOOD_FRAMES = SYNC_STRATEGY_TYPE__VERIFY_TO_LOCK_GOOD_FRAMES;

	/**
	 * The feature id for the '<em><b>Sync Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_SYNC_STRATEGY_TYPE__SYNC_PATTERN = SYNC_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fixed Frame Sync Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FRAME_SYNC_STRATEGY_TYPE_FEATURE_COUNT = SYNC_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.FixedValueEntryTypeImpl <em>Fixed Value Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.FixedValueEntryTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getFixedValueEntryType()
	 * @generated
	 */
	int FIXED_VALUE_ENTRY_TYPE = 93;

	/**
	 * The feature id for the '<em><b>Location In Container In Bits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS = SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS;

	/**
	 * The feature id for the '<em><b>Repeat Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE_ENTRY_TYPE__REPEAT_ENTRY = SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY;

	/**
	 * The feature id for the '<em><b>Include Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE_ENTRY_TYPE__INCLUDE_CONDITION = SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION;

	/**
	 * The feature id for the '<em><b>Binary Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE_ENTRY_TYPE__BINARY_VALUE = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE_ENTRY_TYPE__SIZE_IN_BITS = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fixed Value Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE_ENTRY_TYPE_FEATURE_COUNT = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.FlagTypeImpl <em>Flag Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.FlagTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getFlagType()
	 * @generated
	 */
	int FLAG_TYPE = 94;

	/**
	 * The feature id for the '<em><b>Flag Bit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG_TYPE__FLAG_BIT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Flag Size In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG_TYPE__FLAG_SIZE_IN_BITS = 1;

	/**
	 * The number of structural features of the '<em>Flag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.NumericDataTypeImpl <em>Numeric Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.NumericDataTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getNumericDataType()
	 * @generated
	 */
	int NUMERIC_DATA_TYPE = 135;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATA_TYPE__LONG_DESCRIPTION = BASE_DATA_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATA_TYPE__ALIAS_SET = BASE_DATA_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATA_TYPE__NAME = BASE_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATA_TYPE__SHORT_DESCRIPTION = BASE_DATA_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATA_TYPE__UNIT_SET = BASE_DATA_TYPE__UNIT_SET;

	/**
	 * The feature id for the '<em><b>Binary Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATA_TYPE__BINARY_DATA_ENCODING = BASE_DATA_TYPE__BINARY_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Float Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATA_TYPE__FLOAT_DATA_ENCODING = BASE_DATA_TYPE__FLOAT_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Integer Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATA_TYPE__INTEGER_DATA_ENCODING = BASE_DATA_TYPE__INTEGER_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>String Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATA_TYPE__STRING_DATA_ENCODING = BASE_DATA_TYPE__STRING_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>To String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATA_TYPE__TO_STRING = BASE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valid Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATA_TYPE__VALID_RANGE = BASE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATA_TYPE__DEFAULT_CALIBRATOR = BASE_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context Calibrator List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATA_TYPE__CONTEXT_CALIBRATOR_LIST = BASE_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Valid Range Applies To Calibrated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATA_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED = BASE_DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Numeric Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DATA_TYPE_FEATURE_COUNT = BASE_DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.FloatDataTypeImpl <em>Float Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.FloatDataTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getFloatDataType()
	 * @generated
	 */
	int FLOAT_DATA_TYPE = 97;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_TYPE__LONG_DESCRIPTION = NUMERIC_DATA_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_TYPE__ALIAS_SET = NUMERIC_DATA_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_TYPE__NAME = NUMERIC_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_TYPE__SHORT_DESCRIPTION = NUMERIC_DATA_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_TYPE__UNIT_SET = NUMERIC_DATA_TYPE__UNIT_SET;

	/**
	 * The feature id for the '<em><b>Binary Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_TYPE__BINARY_DATA_ENCODING = NUMERIC_DATA_TYPE__BINARY_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Float Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_TYPE__FLOAT_DATA_ENCODING = NUMERIC_DATA_TYPE__FLOAT_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Integer Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_TYPE__INTEGER_DATA_ENCODING = NUMERIC_DATA_TYPE__INTEGER_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>String Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_TYPE__STRING_DATA_ENCODING = NUMERIC_DATA_TYPE__STRING_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>To String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_TYPE__TO_STRING = NUMERIC_DATA_TYPE__TO_STRING;

	/**
	 * The feature id for the '<em><b>Valid Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_TYPE__VALID_RANGE = NUMERIC_DATA_TYPE__VALID_RANGE;

	/**
	 * The feature id for the '<em><b>Default Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_TYPE__DEFAULT_CALIBRATOR = NUMERIC_DATA_TYPE__DEFAULT_CALIBRATOR;

	/**
	 * The feature id for the '<em><b>Context Calibrator List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_TYPE__CONTEXT_CALIBRATOR_LIST = NUMERIC_DATA_TYPE__CONTEXT_CALIBRATOR_LIST;

	/**
	 * The feature id for the '<em><b>Valid Range Applies To Calibrated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED = NUMERIC_DATA_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_TYPE__INITIAL_VALUE = NUMERIC_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_TYPE__SIZE_IN_BITS = NUMERIC_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Float Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_TYPE_FEATURE_COUNT = NUMERIC_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.FloatArgumentTypeTypeImpl <em>Float Argument Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.FloatArgumentTypeTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getFloatArgumentTypeType()
	 * @generated
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE = 95;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__LONG_DESCRIPTION = FLOAT_DATA_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__ALIAS_SET = FLOAT_DATA_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__NAME = FLOAT_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__SHORT_DESCRIPTION = FLOAT_DATA_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__UNIT_SET = FLOAT_DATA_TYPE__UNIT_SET;

	/**
	 * The feature id for the '<em><b>Binary Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__BINARY_DATA_ENCODING = FLOAT_DATA_TYPE__BINARY_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Float Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__FLOAT_DATA_ENCODING = FLOAT_DATA_TYPE__FLOAT_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Integer Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__INTEGER_DATA_ENCODING = FLOAT_DATA_TYPE__INTEGER_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>String Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__STRING_DATA_ENCODING = FLOAT_DATA_TYPE__STRING_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>To String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__TO_STRING = FLOAT_DATA_TYPE__TO_STRING;

	/**
	 * The feature id for the '<em><b>Valid Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__VALID_RANGE = FLOAT_DATA_TYPE__VALID_RANGE;

	/**
	 * The feature id for the '<em><b>Default Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__DEFAULT_CALIBRATOR = FLOAT_DATA_TYPE__DEFAULT_CALIBRATOR;

	/**
	 * The feature id for the '<em><b>Context Calibrator List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__CONTEXT_CALIBRATOR_LIST = FLOAT_DATA_TYPE__CONTEXT_CALIBRATOR_LIST;

	/**
	 * The feature id for the '<em><b>Valid Range Applies To Calibrated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED = FLOAT_DATA_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__INITIAL_VALUE = FLOAT_DATA_TYPE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Size In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__SIZE_IN_BITS = FLOAT_DATA_TYPE__SIZE_IN_BITS;

	/**
	 * The feature id for the '<em><b>Default Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM = FLOAT_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Alarm List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST = FLOAT_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Float Argument Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ARGUMENT_TYPE_TYPE_FEATURE_COUNT = FLOAT_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.FloatDataEncodingTypeImpl <em>Float Data Encoding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.FloatDataEncodingTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getFloatDataEncodingType()
	 * @generated
	 */
	int FLOAT_DATA_ENCODING_TYPE = 96;

	/**
	 * The feature id for the '<em><b>Error Detect Correct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT = DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT;

	/**
	 * The feature id for the '<em><b>Byte Order List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_ENCODING_TYPE__BYTE_ORDER_LIST = DATA_ENCODING_TYPE__BYTE_ORDER_LIST;

	/**
	 * The feature id for the '<em><b>Bit Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_ENCODING_TYPE__BIT_ORDER = DATA_ENCODING_TYPE__BIT_ORDER;

	/**
	 * The feature id for the '<em><b>Default Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR = DATA_ENCODING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Calibrator List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST = DATA_ENCODING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_ENCODING_TYPE__ENCODING = DATA_ENCODING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_ENCODING_TYPE__SIZE_IN_BITS = DATA_ENCODING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Float Data Encoding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_DATA_ENCODING_TYPE_FEATURE_COUNT = DATA_ENCODING_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.FloatParameterTypeTypeImpl <em>Float Parameter Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.FloatParameterTypeTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getFloatParameterTypeType()
	 * @generated
	 */
	int FLOAT_PARAMETER_TYPE_TYPE = 98;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__LONG_DESCRIPTION = FLOAT_DATA_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__ALIAS_SET = FLOAT_DATA_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__NAME = FLOAT_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__SHORT_DESCRIPTION = FLOAT_DATA_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__UNIT_SET = FLOAT_DATA_TYPE__UNIT_SET;

	/**
	 * The feature id for the '<em><b>Binary Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__BINARY_DATA_ENCODING = FLOAT_DATA_TYPE__BINARY_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Float Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__FLOAT_DATA_ENCODING = FLOAT_DATA_TYPE__FLOAT_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Integer Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__INTEGER_DATA_ENCODING = FLOAT_DATA_TYPE__INTEGER_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>String Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__STRING_DATA_ENCODING = FLOAT_DATA_TYPE__STRING_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>To String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__TO_STRING = FLOAT_DATA_TYPE__TO_STRING;

	/**
	 * The feature id for the '<em><b>Valid Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__VALID_RANGE = FLOAT_DATA_TYPE__VALID_RANGE;

	/**
	 * The feature id for the '<em><b>Default Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__DEFAULT_CALIBRATOR = FLOAT_DATA_TYPE__DEFAULT_CALIBRATOR;

	/**
	 * The feature id for the '<em><b>Context Calibrator List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__CONTEXT_CALIBRATOR_LIST = FLOAT_DATA_TYPE__CONTEXT_CALIBRATOR_LIST;

	/**
	 * The feature id for the '<em><b>Valid Range Applies To Calibrated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED = FLOAT_DATA_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__INITIAL_VALUE = FLOAT_DATA_TYPE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Size In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__SIZE_IN_BITS = FLOAT_DATA_TYPE__SIZE_IN_BITS;

	/**
	 * The feature id for the '<em><b>Default Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__DEFAULT_ALARM = FLOAT_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Alarm List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE__CONTEXT_ALARM_LIST = FLOAT_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Float Parameter Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_PARAMETER_TYPE_TYPE_FEATURE_COUNT = FLOAT_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.HeaderTypeImpl <em>Header Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.HeaderTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getHeaderType()
	 * @generated
	 */
	int HEADER_TYPE = 100;

	/**
	 * The feature id for the '<em><b>Author Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__AUTHOR_SET = 0;

	/**
	 * The feature id for the '<em><b>Note Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__NOTE_SET = 1;

	/**
	 * The feature id for the '<em><b>History Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__HISTORY_SET = 2;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__CLASSIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Classification Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__CLASSIFICATION_INSTRUCTIONS = 4;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__DATE = 5;

	/**
	 * The feature id for the '<em><b>Validation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__VALIDATION_STATUS = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__VERSION = 7;

	/**
	 * The number of structural features of the '<em>Header Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.HistorySetTypeImpl <em>History Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.HistorySetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getHistorySetType()
	 * @generated
	 */
	int HISTORY_SET_TYPE = 101;

	/**
	 * The feature id for the '<em><b>History</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_SET_TYPE__HISTORY = 0;

	/**
	 * The number of structural features of the '<em>History Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_SET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.IndirectParameterRefEntryTypeImpl <em>Indirect Parameter Ref Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.IndirectParameterRefEntryTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getIndirectParameterRefEntryType()
	 * @generated
	 */
	int INDIRECT_PARAMETER_REF_ENTRY_TYPE = 102;

	/**
	 * The feature id for the '<em><b>Location In Container In Bits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_PARAMETER_REF_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS = SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS;

	/**
	 * The feature id for the '<em><b>Repeat Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_PARAMETER_REF_ENTRY_TYPE__REPEAT_ENTRY = SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY;

	/**
	 * The feature id for the '<em><b>Include Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_PARAMETER_REF_ENTRY_TYPE__INCLUDE_CONDITION = SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION;

	/**
	 * The feature id for the '<em><b>Parameter Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_PARAMETER_REF_ENTRY_TYPE__PARAMETER_INSTANCE = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alias Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_PARAMETER_REF_ENTRY_TYPE__ALIAS_NAME_SPACE = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Indirect Parameter Ref Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_PARAMETER_REF_ENTRY_TYPE_FEATURE_COUNT = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.SimpleAlgorithmTypeImpl <em>Simple Algorithm Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.SimpleAlgorithmTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSimpleAlgorithmType()
	 * @generated
	 */
	int SIMPLE_ALGORITHM_TYPE = 179;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALGORITHM_TYPE__LONG_DESCRIPTION = NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALGORITHM_TYPE__ALIAS_SET = NAME_DESCRIPTION_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALGORITHM_TYPE__NAME = NAME_DESCRIPTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALGORITHM_TYPE__SHORT_DESCRIPTION = NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Algorithm Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALGORITHM_TYPE__ALGORITHM_TEXT = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Algorithm Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALGORITHM_TYPE__EXTERNAL_ALGORITHM_SET = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Algorithm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALGORITHM_TYPE_FEATURE_COUNT = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.InputAlgorithmTypeImpl <em>Input Algorithm Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.InputAlgorithmTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getInputAlgorithmType()
	 * @generated
	 */
	int INPUT_ALGORITHM_TYPE = 103;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ALGORITHM_TYPE__LONG_DESCRIPTION = SIMPLE_ALGORITHM_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ALGORITHM_TYPE__ALIAS_SET = SIMPLE_ALGORITHM_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ALGORITHM_TYPE__NAME = SIMPLE_ALGORITHM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ALGORITHM_TYPE__SHORT_DESCRIPTION = SIMPLE_ALGORITHM_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Algorithm Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ALGORITHM_TYPE__ALGORITHM_TEXT = SIMPLE_ALGORITHM_TYPE__ALGORITHM_TEXT;

	/**
	 * The feature id for the '<em><b>External Algorithm Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ALGORITHM_TYPE__EXTERNAL_ALGORITHM_SET = SIMPLE_ALGORITHM_TYPE__EXTERNAL_ALGORITHM_SET;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ALGORITHM_TYPE__INPUT_SET = SIMPLE_ALGORITHM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Algorithm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ALGORITHM_TYPE_FEATURE_COUNT = SIMPLE_ALGORITHM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.InputOutputAlgorithmTypeImpl <em>Input Output Algorithm Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.InputOutputAlgorithmTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getInputOutputAlgorithmType()
	 * @generated
	 */
	int INPUT_OUTPUT_ALGORITHM_TYPE = 104;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_ALGORITHM_TYPE__LONG_DESCRIPTION = INPUT_ALGORITHM_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_ALGORITHM_TYPE__ALIAS_SET = INPUT_ALGORITHM_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_ALGORITHM_TYPE__NAME = INPUT_ALGORITHM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_ALGORITHM_TYPE__SHORT_DESCRIPTION = INPUT_ALGORITHM_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Algorithm Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_ALGORITHM_TYPE__ALGORITHM_TEXT = INPUT_ALGORITHM_TYPE__ALGORITHM_TEXT;

	/**
	 * The feature id for the '<em><b>External Algorithm Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_ALGORITHM_TYPE__EXTERNAL_ALGORITHM_SET = INPUT_ALGORITHM_TYPE__EXTERNAL_ALGORITHM_SET;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_ALGORITHM_TYPE__INPUT_SET = INPUT_ALGORITHM_TYPE__INPUT_SET;

	/**
	 * The feature id for the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_ALGORITHM_TYPE__OUTPUT_SET = INPUT_ALGORITHM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_ALGORITHM_TYPE__THREAD = INPUT_ALGORITHM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Output Algorithm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_ALGORITHM_TYPE_FEATURE_COUNT = INPUT_ALGORITHM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.InputOutputTriggerAlgorithmTypeImpl <em>Input Output Trigger Algorithm Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.InputOutputTriggerAlgorithmTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getInputOutputTriggerAlgorithmType()
	 * @generated
	 */
	int INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE = 105;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__LONG_DESCRIPTION = INPUT_OUTPUT_ALGORITHM_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__ALIAS_SET = INPUT_OUTPUT_ALGORITHM_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__NAME = INPUT_OUTPUT_ALGORITHM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__SHORT_DESCRIPTION = INPUT_OUTPUT_ALGORITHM_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Algorithm Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__ALGORITHM_TEXT = INPUT_OUTPUT_ALGORITHM_TYPE__ALGORITHM_TEXT;

	/**
	 * The feature id for the '<em><b>External Algorithm Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__EXTERNAL_ALGORITHM_SET = INPUT_OUTPUT_ALGORITHM_TYPE__EXTERNAL_ALGORITHM_SET;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__INPUT_SET = INPUT_OUTPUT_ALGORITHM_TYPE__INPUT_SET;

	/**
	 * The feature id for the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__OUTPUT_SET = INPUT_OUTPUT_ALGORITHM_TYPE__OUTPUT_SET;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__THREAD = INPUT_OUTPUT_ALGORITHM_TYPE__THREAD;

	/**
	 * The feature id for the '<em><b>Trigger Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__TRIGGER_SET = INPUT_OUTPUT_ALGORITHM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__PRIORITY = INPUT_OUTPUT_ALGORITHM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE__TRIGGER_CONTAINER = INPUT_OUTPUT_ALGORITHM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input Output Trigger Algorithm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_TRIGGER_ALGORITHM_TYPE_FEATURE_COUNT = INPUT_OUTPUT_ALGORITHM_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.InputSetTypeImpl <em>Input Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.InputSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getInputSetType()
	 * @generated
	 */
	int INPUT_SET_TYPE = 106;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Parameter Instance Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET_TYPE__PARAMETER_INSTANCE_REF = 1;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET_TYPE__CONSTANT = 2;

	/**
	 * The number of structural features of the '<em>Input Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.IntegerDataTypeImpl <em>Integer Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.IntegerDataTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getIntegerDataType()
	 * @generated
	 */
	int INTEGER_DATA_TYPE = 109;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE__LONG_DESCRIPTION = NUMERIC_DATA_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE__ALIAS_SET = NUMERIC_DATA_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE__NAME = NUMERIC_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE__SHORT_DESCRIPTION = NUMERIC_DATA_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE__UNIT_SET = NUMERIC_DATA_TYPE__UNIT_SET;

	/**
	 * The feature id for the '<em><b>Binary Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE__BINARY_DATA_ENCODING = NUMERIC_DATA_TYPE__BINARY_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Float Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE__FLOAT_DATA_ENCODING = NUMERIC_DATA_TYPE__FLOAT_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Integer Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE__INTEGER_DATA_ENCODING = NUMERIC_DATA_TYPE__INTEGER_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>String Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE__STRING_DATA_ENCODING = NUMERIC_DATA_TYPE__STRING_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>To String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE__TO_STRING = NUMERIC_DATA_TYPE__TO_STRING;

	/**
	 * The feature id for the '<em><b>Valid Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE__VALID_RANGE = NUMERIC_DATA_TYPE__VALID_RANGE;

	/**
	 * The feature id for the '<em><b>Default Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE__DEFAULT_CALIBRATOR = NUMERIC_DATA_TYPE__DEFAULT_CALIBRATOR;

	/**
	 * The feature id for the '<em><b>Context Calibrator List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE__CONTEXT_CALIBRATOR_LIST = NUMERIC_DATA_TYPE__CONTEXT_CALIBRATOR_LIST;

	/**
	 * The feature id for the '<em><b>Valid Range Applies To Calibrated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED = NUMERIC_DATA_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE__INITIAL_VALUE = NUMERIC_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE__SIGNED = NUMERIC_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE__SIZE_IN_BITS = NUMERIC_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integer Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_TYPE_FEATURE_COUNT = NUMERIC_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.IntegerArgumentTypeTypeImpl <em>Integer Argument Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.IntegerArgumentTypeTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getIntegerArgumentTypeType()
	 * @generated
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE = 107;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__LONG_DESCRIPTION = INTEGER_DATA_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__ALIAS_SET = INTEGER_DATA_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__NAME = INTEGER_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__SHORT_DESCRIPTION = INTEGER_DATA_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__UNIT_SET = INTEGER_DATA_TYPE__UNIT_SET;

	/**
	 * The feature id for the '<em><b>Binary Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__BINARY_DATA_ENCODING = INTEGER_DATA_TYPE__BINARY_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Float Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__FLOAT_DATA_ENCODING = INTEGER_DATA_TYPE__FLOAT_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Integer Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__INTEGER_DATA_ENCODING = INTEGER_DATA_TYPE__INTEGER_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>String Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__STRING_DATA_ENCODING = INTEGER_DATA_TYPE__STRING_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>To String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__TO_STRING = INTEGER_DATA_TYPE__TO_STRING;

	/**
	 * The feature id for the '<em><b>Valid Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__VALID_RANGE = INTEGER_DATA_TYPE__VALID_RANGE;

	/**
	 * The feature id for the '<em><b>Default Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__DEFAULT_CALIBRATOR = INTEGER_DATA_TYPE__DEFAULT_CALIBRATOR;

	/**
	 * The feature id for the '<em><b>Context Calibrator List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__CONTEXT_CALIBRATOR_LIST = INTEGER_DATA_TYPE__CONTEXT_CALIBRATOR_LIST;

	/**
	 * The feature id for the '<em><b>Valid Range Applies To Calibrated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED = INTEGER_DATA_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__INITIAL_VALUE = INTEGER_DATA_TYPE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__SIGNED = INTEGER_DATA_TYPE__SIGNED;

	/**
	 * The feature id for the '<em><b>Size In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__SIZE_IN_BITS = INTEGER_DATA_TYPE__SIZE_IN_BITS;

	/**
	 * The feature id for the '<em><b>Default Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__DEFAULT_ALARM = INTEGER_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Alarm List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE__CONTEXT_ALARM_LIST = INTEGER_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Argument Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARGUMENT_TYPE_TYPE_FEATURE_COUNT = INTEGER_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.IntegerDataEncodingTypeImpl <em>Integer Data Encoding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.IntegerDataEncodingTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getIntegerDataEncodingType()
	 * @generated
	 */
	int INTEGER_DATA_ENCODING_TYPE = 108;

	/**
	 * The feature id for the '<em><b>Error Detect Correct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT = DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT;

	/**
	 * The feature id for the '<em><b>Byte Order List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_ENCODING_TYPE__BYTE_ORDER_LIST = DATA_ENCODING_TYPE__BYTE_ORDER_LIST;

	/**
	 * The feature id for the '<em><b>Bit Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_ENCODING_TYPE__BIT_ORDER = DATA_ENCODING_TYPE__BIT_ORDER;

	/**
	 * The feature id for the '<em><b>Default Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR = DATA_ENCODING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Calibrator List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST = DATA_ENCODING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_ENCODING_TYPE__ENCODING = DATA_ENCODING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_ENCODING_TYPE__SIZE_IN_BITS = DATA_ENCODING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Integer Data Encoding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_ENCODING_TYPE_FEATURE_COUNT = DATA_ENCODING_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.IntegerParameterTypeTypeImpl <em>Integer Parameter Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.IntegerParameterTypeTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getIntegerParameterTypeType()
	 * @generated
	 */
	int INTEGER_PARAMETER_TYPE_TYPE = 110;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__LONG_DESCRIPTION = INTEGER_DATA_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__ALIAS_SET = INTEGER_DATA_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__NAME = INTEGER_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__SHORT_DESCRIPTION = INTEGER_DATA_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__UNIT_SET = INTEGER_DATA_TYPE__UNIT_SET;

	/**
	 * The feature id for the '<em><b>Binary Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__BINARY_DATA_ENCODING = INTEGER_DATA_TYPE__BINARY_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Float Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__FLOAT_DATA_ENCODING = INTEGER_DATA_TYPE__FLOAT_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Integer Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__INTEGER_DATA_ENCODING = INTEGER_DATA_TYPE__INTEGER_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>String Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__STRING_DATA_ENCODING = INTEGER_DATA_TYPE__STRING_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>To String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__TO_STRING = INTEGER_DATA_TYPE__TO_STRING;

	/**
	 * The feature id for the '<em><b>Valid Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__VALID_RANGE = INTEGER_DATA_TYPE__VALID_RANGE;

	/**
	 * The feature id for the '<em><b>Default Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__DEFAULT_CALIBRATOR = INTEGER_DATA_TYPE__DEFAULT_CALIBRATOR;

	/**
	 * The feature id for the '<em><b>Context Calibrator List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__CONTEXT_CALIBRATOR_LIST = INTEGER_DATA_TYPE__CONTEXT_CALIBRATOR_LIST;

	/**
	 * The feature id for the '<em><b>Valid Range Applies To Calibrated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED = INTEGER_DATA_TYPE__VALID_RANGE_APPLIES_TO_CALIBRATED;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__INITIAL_VALUE = INTEGER_DATA_TYPE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__SIGNED = INTEGER_DATA_TYPE__SIGNED;

	/**
	 * The feature id for the '<em><b>Size In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__SIZE_IN_BITS = INTEGER_DATA_TYPE__SIZE_IN_BITS;

	/**
	 * The feature id for the '<em><b>Default Alarm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__DEFAULT_ALARM = INTEGER_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Alarm List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE__CONTEXT_ALARM_LIST = INTEGER_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Parameter Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PARAMETER_TYPE_TYPE_FEATURE_COUNT = INTEGER_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.IntegerRangeTypeImpl <em>Integer Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.IntegerRangeTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getIntegerRangeType()
	 * @generated
	 */
	int INTEGER_RANGE_TYPE = 111;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_TYPE__MAX = 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_TYPE__MIN = 1;

	/**
	 * The number of structural features of the '<em>Integer Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.IntegerValueTypeImpl <em>Integer Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.IntegerValueTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getIntegerValueType()
	 * @generated
	 */
	int INTEGER_VALUE_TYPE = 112;

	/**
	 * The feature id for the '<em><b>Fixed Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE__FIXED_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Dynamic Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE__DYNAMIC_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Discrete Lookup List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE__DISCRETE_LOOKUP_LIST = 2;

	/**
	 * The number of structural features of the '<em>Integer Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.InterlockTypeImpl <em>Interlock Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.InterlockTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getInterlockType()
	 * @generated
	 */
	int INTERLOCK_TYPE = 113;

	/**
	 * The feature id for the '<em><b>Scope To Space System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCK_TYPE__SCOPE_TO_SPACE_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Suspendable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCK_TYPE__SUSPENDABLE = 1;

	/**
	 * The feature id for the '<em><b>Verification Progress Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCK_TYPE__VERIFICATION_PROGRESS_PERCENTAGE = 2;

	/**
	 * The feature id for the '<em><b>Verification To Wait For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCK_TYPE__VERIFICATION_TO_WAIT_FOR = 3;

	/**
	 * The number of structural features of the '<em>Interlock Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCK_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.LeadingSizeTypeImpl <em>Leading Size Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.LeadingSizeTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getLeadingSizeType()
	 * @generated
	 */
	int LEADING_SIZE_TYPE = 114;

	/**
	 * The feature id for the '<em><b>Size In Bits Of Size Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADING_SIZE_TYPE__SIZE_IN_BITS_OF_SIZE_TAG = 0;

	/**
	 * The number of structural features of the '<em>Leading Size Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADING_SIZE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.LinearAdjustmentTypeImpl <em>Linear Adjustment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.LinearAdjustmentTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getLinearAdjustmentType()
	 * @generated
	 */
	int LINEAR_ADJUSTMENT_TYPE = 115;

	/**
	 * The feature id for the '<em><b>Intercept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ADJUSTMENT_TYPE__INTERCEPT = 0;

	/**
	 * The feature id for the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ADJUSTMENT_TYPE__SLOPE = 1;

	/**
	 * The number of structural features of the '<em>Linear Adjustment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ADJUSTMENT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.LinearAdjustmentType1Impl <em>Linear Adjustment Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.LinearAdjustmentType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getLinearAdjustmentType1()
	 * @generated
	 */
	int LINEAR_ADJUSTMENT_TYPE1 = 116;

	/**
	 * The feature id for the '<em><b>Intercept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ADJUSTMENT_TYPE1__INTERCEPT = 0;

	/**
	 * The feature id for the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ADJUSTMENT_TYPE1__SLOPE = 1;

	/**
	 * The number of structural features of the '<em>Linear Adjustment Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_ADJUSTMENT_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.LocationInContainerInBitsTypeImpl <em>Location In Container In Bits Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.LocationInContainerInBitsTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getLocationInContainerInBitsType()
	 * @generated
	 */
	int LOCATION_IN_CONTAINER_IN_BITS_TYPE = 117;

	/**
	 * The feature id for the '<em><b>Fixed Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_IN_CONTAINER_IN_BITS_TYPE__FIXED_VALUE = INTEGER_VALUE_TYPE__FIXED_VALUE;

	/**
	 * The feature id for the '<em><b>Dynamic Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_IN_CONTAINER_IN_BITS_TYPE__DYNAMIC_VALUE = INTEGER_VALUE_TYPE__DYNAMIC_VALUE;

	/**
	 * The feature id for the '<em><b>Discrete Lookup List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_IN_CONTAINER_IN_BITS_TYPE__DISCRETE_LOOKUP_LIST = INTEGER_VALUE_TYPE__DISCRETE_LOOKUP_LIST;

	/**
	 * The feature id for the '<em><b>Reference Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_IN_CONTAINER_IN_BITS_TYPE__REFERENCE_LOCATION = INTEGER_VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Location In Container In Bits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_IN_CONTAINER_IN_BITS_TYPE_FEATURE_COUNT = INTEGER_VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.MathAlgorithmTypeImpl <em>Math Algorithm Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.MathAlgorithmTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getMathAlgorithmType()
	 * @generated
	 */
	int MATH_ALGORITHM_TYPE = 119;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_ALGORITHM_TYPE__LONG_DESCRIPTION = NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_ALGORITHM_TYPE__ALIAS_SET = NAME_DESCRIPTION_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_ALGORITHM_TYPE__NAME = NAME_DESCRIPTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_ALGORITHM_TYPE__SHORT_DESCRIPTION = NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Math Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_ALGORITHM_TYPE__MATH_OPERATION = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Math Algorithm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_ALGORITHM_TYPE_FEATURE_COUNT = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.MathOperationTypeImpl <em>Math Operation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.MathOperationTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getMathOperationType()
	 * @generated
	 */
	int MATH_OPERATION_TYPE = 120;

	/**
	 * The feature id for the '<em><b>Parameter Instance Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_TYPE__PARAMETER_INSTANCE_REF = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_TYPE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_TYPE__OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Parameter Instance Ref1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_TYPE__PARAMETER_INSTANCE_REF1 = 3;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_TYPE__VALUE1 = 4;

	/**
	 * The number of structural features of the '<em>Math Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.MathOperationType1Impl <em>Math Operation Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.MathOperationType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getMathOperationType1()
	 * @generated
	 */
	int MATH_OPERATION_TYPE1 = 121;

	/**
	 * The feature id for the '<em><b>Parameter Instance Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_TYPE1__PARAMETER_INSTANCE_REF = MATH_OPERATION_TYPE__PARAMETER_INSTANCE_REF;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_TYPE1__VALUE = MATH_OPERATION_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_TYPE1__OPERATOR = MATH_OPERATION_TYPE__OPERATOR;

	/**
	 * The feature id for the '<em><b>Parameter Instance Ref1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_TYPE1__PARAMETER_INSTANCE_REF1 = MATH_OPERATION_TYPE__PARAMETER_INSTANCE_REF1;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_TYPE1__VALUE1 = MATH_OPERATION_TYPE__VALUE1;

	/**
	 * The feature id for the '<em><b>Trigger Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_TYPE1__TRIGGER_SET = MATH_OPERATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_TYPE1__OUTPUT_PARAMETER_REF = MATH_OPERATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Math Operation Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_TYPE1_FEATURE_COUNT = MATH_OPERATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.MessageRefSetTypeImpl <em>Message Ref Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.MessageRefSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getMessageRefSetType()
	 * @generated
	 */
	int MESSAGE_REF_SET_TYPE = 122;

	/**
	 * The feature id for the '<em><b>Message Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF_SET_TYPE__MESSAGE_REF = 0;

	/**
	 * The number of structural features of the '<em>Message Ref Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF_SET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.MessageRefTypeImpl <em>Message Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.MessageRefTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getMessageRefType()
	 * @generated
	 */
	int MESSAGE_REF_TYPE = 123;

	/**
	 * The feature id for the '<em><b>Message Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF_TYPE__MESSAGE_REF = 0;

	/**
	 * The number of structural features of the '<em>Message Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.MessageSetTypeImpl <em>Message Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.MessageSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getMessageSetType()
	 * @generated
	 */
	int MESSAGE_SET_TYPE = 124;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET_TYPE__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Message Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.MessageTypeImpl <em>Message Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.MessageTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 125;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__LONG_DESCRIPTION = NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__ALIAS_SET = NAME_DESCRIPTION_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__NAME = NAME_DESCRIPTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__SHORT_DESCRIPTION = NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Match Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__MATCH_CRITERIA = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contain Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__CONTAIN_REF = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_FEATURE_COUNT = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.MetaCommandSetTypeImpl <em>Meta Command Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.MetaCommandSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getMetaCommandSetType()
	 * @generated
	 */
	int META_COMMAND_SET_TYPE = 126;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_SET_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Meta Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_SET_TYPE__META_COMMAND = 1;

	/**
	 * The feature id for the '<em><b>Meta Command Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_SET_TYPE__META_COMMAND_REF = 2;

	/**
	 * The feature id for the '<em><b>Block Meta Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_SET_TYPE__BLOCK_META_COMMAND = 3;

	/**
	 * The number of structural features of the '<em>Meta Command Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_SET_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.MetaCommandStepListTypeImpl <em>Meta Command Step List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.MetaCommandStepListTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getMetaCommandStepListType()
	 * @generated
	 */
	int META_COMMAND_STEP_LIST_TYPE = 127;

	/**
	 * The feature id for the '<em><b>Meta Command Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_STEP_LIST_TYPE__META_COMMAND_STEP = 0;

	/**
	 * The number of structural features of the '<em>Meta Command Step List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_STEP_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.MetaCommandStepTypeImpl <em>Meta Command Step Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.MetaCommandStepTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getMetaCommandStepType()
	 * @generated
	 */
	int META_COMMAND_STEP_TYPE = 128;

	/**
	 * The feature id for the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_STEP_TYPE__ARGUMENT_LIST = 0;

	/**
	 * The feature id for the '<em><b>Meta Command Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_STEP_TYPE__META_COMMAND_REF = 1;

	/**
	 * The number of structural features of the '<em>Meta Command Step Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_STEP_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.MetaCommandTypeImpl <em>Meta Command Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.MetaCommandTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getMetaCommandType()
	 * @generated
	 */
	int META_COMMAND_TYPE = 129;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_TYPE__LONG_DESCRIPTION = NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_TYPE__ALIAS_SET = NAME_DESCRIPTION_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_TYPE__NAME = NAME_DESCRIPTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_TYPE__SHORT_DESCRIPTION = NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Base Meta Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_TYPE__BASE_META_COMMAND = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_TYPE__SYSTEM_NAME = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_TYPE__ARGUMENT_LIST = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Command Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_TYPE__COMMAND_CONTAINER = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transmission Constraint List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_TYPE__TRANSMISSION_CONSTRAINT_LIST = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Significance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_TYPE__DEFAULT_SIGNIFICANCE = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Context Significance List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_TYPE__CONTEXT_SIGNIFICANCE_LIST = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Interlock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_TYPE__INTERLOCK = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Verifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_TYPE__VERIFIERS = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parameter To Set List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_TYPE__PARAMETER_TO_SET_LIST = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_TYPE__ABSTRACT = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Meta Command Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_COMMAND_TYPE_FEATURE_COUNT = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.NoteSetTypeImpl <em>Note Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.NoteSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getNoteSetType()
	 * @generated
	 */
	int NOTE_SET_TYPE = 131;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_SET_TYPE__NOTE = 0;

	/**
	 * The number of structural features of the '<em>Note Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_SET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.NumberFormatTypeImpl <em>Number Format Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.NumberFormatTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getNumberFormatType()
	 * @generated
	 */
	int NUMBER_FORMAT_TYPE = 132;

	/**
	 * The feature id for the '<em><b>Maximum Fraction Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FORMAT_TYPE__MAXIMUM_FRACTION_DIGITS = 0;

	/**
	 * The feature id for the '<em><b>Maximum Integer Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FORMAT_TYPE__MAXIMUM_INTEGER_DIGITS = 1;

	/**
	 * The feature id for the '<em><b>Minimum Fraction Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FORMAT_TYPE__MINIMUM_FRACTION_DIGITS = 2;

	/**
	 * The feature id for the '<em><b>Minimum Integer Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FORMAT_TYPE__MINIMUM_INTEGER_DIGITS = 3;

	/**
	 * The feature id for the '<em><b>Negative Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FORMAT_TYPE__NEGATIVE_PREFIX = 4;

	/**
	 * The feature id for the '<em><b>Negative Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FORMAT_TYPE__NEGATIVE_SUFFIX = 5;

	/**
	 * The feature id for the '<em><b>Notation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FORMAT_TYPE__NOTATION = 6;

	/**
	 * The feature id for the '<em><b>Number Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FORMAT_TYPE__NUMBER_BASE = 7;

	/**
	 * The feature id for the '<em><b>Positive Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FORMAT_TYPE__POSITIVE_PREFIX = 8;

	/**
	 * The feature id for the '<em><b>Positive Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FORMAT_TYPE__POSITIVE_SUFFIX = 9;

	/**
	 * The feature id for the '<em><b>Show Thousands Grouping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FORMAT_TYPE__SHOW_THOUSANDS_GROUPING = 10;

	/**
	 * The number of structural features of the '<em>Number Format Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FORMAT_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.NumberToStringTypeImpl <em>Number To String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.NumberToStringTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getNumberToStringType()
	 * @generated
	 */
	int NUMBER_TO_STRING_TYPE = 133;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TO_STRING_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Value Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TO_STRING_TYPE__VALUE_ENUMERATION = 1;

	/**
	 * The feature id for the '<em><b>Range Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TO_STRING_TYPE__RANGE_ENUMERATION = 2;

	/**
	 * The feature id for the '<em><b>Number Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TO_STRING_TYPE__NUMBER_FORMAT = 3;

	/**
	 * The number of structural features of the '<em>Number To String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TO_STRING_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.OffsetTypeImpl <em>Offset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.OffsetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getOffsetType()
	 * @generated
	 */
	int OFFSET_TYPE = 136;

	/**
	 * The feature id for the '<em><b>Fixed Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_TYPE__FIXED_VALUE = INTEGER_VALUE_TYPE__FIXED_VALUE;

	/**
	 * The feature id for the '<em><b>Dynamic Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_TYPE__DYNAMIC_VALUE = INTEGER_VALUE_TYPE__DYNAMIC_VALUE;

	/**
	 * The feature id for the '<em><b>Discrete Lookup List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_TYPE__DISCRETE_LOOKUP_LIST = INTEGER_VALUE_TYPE__DISCRETE_LOOKUP_LIST;

	/**
	 * The feature id for the '<em><b>Offset Size In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_TYPE__OFFSET_SIZE_IN_BITS = INTEGER_VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Offset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_TYPE_FEATURE_COUNT = INTEGER_VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ORedConditionsTypeImpl <em>ORed Conditions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ORedConditionsTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getORedConditionsType()
	 * @generated
	 */
	int ORED_CONDITIONS_TYPE = 137;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORED_CONDITIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORED_CONDITIONS_TYPE__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>AN Ded Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORED_CONDITIONS_TYPE__AN_DED_CONDITIONS = 2;

	/**
	 * The number of structural features of the '<em>ORed Conditions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORED_CONDITIONS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.OutputParameterRefTypeImpl <em>Output Parameter Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.OutputParameterRefTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getOutputParameterRefType()
	 * @generated
	 */
	int OUTPUT_PARAMETER_REF_TYPE = 138;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETER_REF_TYPE__VALUE = PARAMETER_REF_TYPE1__VALUE;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETER_REF_TYPE__PARAMETER_REF = PARAMETER_REF_TYPE1__PARAMETER_REF;

	/**
	 * The feature id for the '<em><b>Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETER_REF_TYPE__OUTPUT_NAME = PARAMETER_REF_TYPE1_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Parameter Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETER_REF_TYPE_FEATURE_COUNT = PARAMETER_REF_TYPE1_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.OutputSetTypeImpl <em>Output Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.OutputSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getOutputSetType()
	 * @generated
	 */
	int OUTPUT_SET_TYPE = 139;

	/**
	 * The feature id for the '<em><b>Output Parameter Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET_TYPE__OUTPUT_PARAMETER_REF = 0;

	/**
	 * The number of structural features of the '<em>Output Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ParameterInstanceRefTypeImpl <em>Parameter Instance Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ParameterInstanceRefTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getParameterInstanceRefType()
	 * @generated
	 */
	int PARAMETER_INSTANCE_REF_TYPE = 140;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE_REF_TYPE__VALUE = PARAMETER_INSTANCE_REF_TYPE1__VALUE;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE_REF_TYPE__PARAMETER_REF = PARAMETER_INSTANCE_REF_TYPE1__PARAMETER_REF;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE_REF_TYPE__INSTANCE = PARAMETER_INSTANCE_REF_TYPE1__INSTANCE;

	/**
	 * The feature id for the '<em><b>Use Calibrated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE_REF_TYPE__USE_CALIBRATED_VALUE = PARAMETER_INSTANCE_REF_TYPE1__USE_CALIBRATED_VALUE;

	/**
	 * The feature id for the '<em><b>Input Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE_REF_TYPE__INPUT_NAME = PARAMETER_INSTANCE_REF_TYPE1_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Instance Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE_REF_TYPE_FEATURE_COUNT = PARAMETER_INSTANCE_REF_TYPE1_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ParameterPropertiesTypeImpl <em>Parameter Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ParameterPropertiesTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getParameterPropertiesType()
	 * @generated
	 */
	int PARAMETER_PROPERTIES_TYPE = 142;

	/**
	 * The feature id for the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PROPERTIES_TYPE__SYSTEM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Validity Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PROPERTIES_TYPE__VALIDITY_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Physical Address Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PROPERTIES_TYPE__PHYSICAL_ADDRESS_SET = 2;

	/**
	 * The feature id for the '<em><b>Time Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PROPERTIES_TYPE__TIME_ASSOCIATION = 3;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PROPERTIES_TYPE__DATA_SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PROPERTIES_TYPE__READ_ONLY = 5;

	/**
	 * The number of structural features of the '<em>Parameter Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PROPERTIES_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ParameterRefEntryTypeImpl <em>Parameter Ref Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ParameterRefEntryTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getParameterRefEntryType()
	 * @generated
	 */
	int PARAMETER_REF_ENTRY_TYPE = 143;

	/**
	 * The feature id for the '<em><b>Location In Container In Bits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS = SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS;

	/**
	 * The feature id for the '<em><b>Repeat Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_ENTRY_TYPE__REPEAT_ENTRY = SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY;

	/**
	 * The feature id for the '<em><b>Include Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_ENTRY_TYPE__INCLUDE_CONDITION = SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_ENTRY_TYPE__PARAMETER_REF = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Ref Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_ENTRY_TYPE_FEATURE_COUNT = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ParameterRefTypeImpl <em>Parameter Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ParameterRefTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getParameterRefType()
	 * @generated
	 */
	int PARAMETER_REF_TYPE = 144;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_TYPE__VALUE = PARAMETER_REF_TYPE1__VALUE;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_TYPE__PARAMETER_REF = PARAMETER_REF_TYPE1__PARAMETER_REF;

	/**
	 * The feature id for the '<em><b>Trigger Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_TYPE__TRIGGER_NAME = PARAMETER_REF_TYPE1_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_TYPE_FEATURE_COUNT = PARAMETER_REF_TYPE1_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ParameterSegmentRefEntryTypeImpl <em>Parameter Segment Ref Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ParameterSegmentRefEntryTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getParameterSegmentRefEntryType()
	 * @generated
	 */
	int PARAMETER_SEGMENT_REF_ENTRY_TYPE = 146;

	/**
	 * The feature id for the '<em><b>Location In Container In Bits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SEGMENT_REF_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS = SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS;

	/**
	 * The feature id for the '<em><b>Repeat Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SEGMENT_REF_ENTRY_TYPE__REPEAT_ENTRY = SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY;

	/**
	 * The feature id for the '<em><b>Include Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SEGMENT_REF_ENTRY_TYPE__INCLUDE_CONDITION = SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SEGMENT_REF_ENTRY_TYPE__ORDER = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SEGMENT_REF_ENTRY_TYPE__PARAMETER_REF = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SEGMENT_REF_ENTRY_TYPE__SIZE_IN_BITS = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter Segment Ref Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SEGMENT_REF_ENTRY_TYPE_FEATURE_COUNT = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ParameterSetTypeImpl <em>Parameter Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ParameterSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getParameterSetType()
	 * @generated
	 */
	int PARAMETER_SET_TYPE = 147;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_TYPE__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_TYPE__PARAMETER_REF = 2;

	/**
	 * The number of structural features of the '<em>Parameter Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ParameterToSetListTypeImpl <em>Parameter To Set List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ParameterToSetListTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getParameterToSetListType()
	 * @generated
	 */
	int PARAMETER_TO_SET_LIST_TYPE = 148;

	/**
	 * The feature id for the '<em><b>Parameter To Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_SET_LIST_TYPE__PARAMETER_TO_SET = 0;

	/**
	 * The number of structural features of the '<em>Parameter To Set List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_SET_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ParameterToSetTypeImpl <em>Parameter To Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ParameterToSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getParameterToSetType()
	 * @generated
	 */
	int PARAMETER_TO_SET_TYPE = 149;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_SET_TYPE__PARAMETER_REF = 0;

	/**
	 * The feature id for the '<em><b>Derivation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_SET_TYPE__DERIVATION = 1;

	/**
	 * The number of structural features of the '<em>Parameter To Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_SET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ParameterToSetType1Impl <em>Parameter To Set Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ParameterToSetType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getParameterToSetType1()
	 * @generated
	 */
	int PARAMETER_TO_SET_TYPE1 = 150;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_SET_TYPE1__PARAMETER_REF = PARAMETER_TO_SET_TYPE__PARAMETER_REF;

	/**
	 * The feature id for the '<em><b>Derivation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_SET_TYPE1__DERIVATION = PARAMETER_TO_SET_TYPE__DERIVATION;

	/**
	 * The feature id for the '<em><b>Verifier To Trigger On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_SET_TYPE1__VERIFIER_TO_TRIGGER_ON = PARAMETER_TO_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter To Set Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_SET_TYPE1_FEATURE_COUNT = PARAMETER_TO_SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ParameterTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 151;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__LONG_DESCRIPTION = NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__ALIAS_SET = NAME_DESCRIPTION_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__NAME = NAME_DESCRIPTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__SHORT_DESCRIPTION = NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parameter Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__PARAMETER_PROPERTIES = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__PARAMETER_TYPE_REF = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ParameterTypeSetTypeImpl <em>Parameter Type Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ParameterTypeSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getParameterTypeSetType()
	 * @generated
	 */
	int PARAMETER_TYPE_SET_TYPE = 152;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_SET_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>String Parameter Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_SET_TYPE__STRING_PARAMETER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Enumerated Parameter Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_SET_TYPE__ENUMERATED_PARAMETER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Integer Parameter Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_SET_TYPE__INTEGER_PARAMETER_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Binary Parameter Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_SET_TYPE__BINARY_PARAMETER_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Float Parameter Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_SET_TYPE__FLOAT_PARAMETER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Boolean Parameter Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_SET_TYPE__BOOLEAN_PARAMETER_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Relative Time Parameter Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_SET_TYPE__RELATIVE_TIME_PARAMETER_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Absolute Time Parameter Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_SET_TYPE__ABSOLUTE_TIME_PARAMETER_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Array Parameter Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_SET_TYPE__ARRAY_PARAMETER_TYPE = 9;

	/**
	 * The number of structural features of the '<em>Parameter Type Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_SET_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ParameterValueChangeTypeImpl <em>Parameter Value Change Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ParameterValueChangeTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getParameterValueChangeType()
	 * @generated
	 */
	int PARAMETER_VALUE_CHANGE_TYPE = 153;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_CHANGE_TYPE__PARAMETER_REF = 0;

	/**
	 * The feature id for the '<em><b>Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_CHANGE_TYPE__CHANGE = 1;

	/**
	 * The number of structural features of the '<em>Parameter Value Change Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_CHANGE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ParityTypeImpl <em>Parity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ParityTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getParityType()
	 * @generated
	 */
	int PARITY_TYPE = 154;

	/**
	 * The feature id for the '<em><b>Bits From Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARITY_TYPE__BITS_FROM_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARITY_TYPE__REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARITY_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Parity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARITY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.PhysicalAddressSetTypeImpl <em>Physical Address Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.PhysicalAddressSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getPhysicalAddressSetType()
	 * @generated
	 */
	int PHYSICAL_ADDRESS_SET_TYPE = 156;

	/**
	 * The feature id for the '<em><b>Physical Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ADDRESS_SET_TYPE__PHYSICAL_ADDRESS = 0;

	/**
	 * The number of structural features of the '<em>Physical Address Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ADDRESS_SET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.PhysicalAddressTypeImpl <em>Physical Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.PhysicalAddressTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getPhysicalAddressType()
	 * @generated
	 */
	int PHYSICAL_ADDRESS_TYPE = 157;

	/**
	 * The feature id for the '<em><b>Sub Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ADDRESS_TYPE__SUB_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Source Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ADDRESS_TYPE__SOURCE_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ADDRESS_TYPE__SOURCE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Physical Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ADDRESS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.PhysicalAddressType1Impl <em>Physical Address Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.PhysicalAddressType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getPhysicalAddressType1()
	 * @generated
	 */
	int PHYSICAL_ADDRESS_TYPE1 = 158;

	/**
	 * The feature id for the '<em><b>Sub Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ADDRESS_TYPE1__SUB_ADDRESS = PHYSICAL_ADDRESS_TYPE__SUB_ADDRESS;

	/**
	 * The feature id for the '<em><b>Source Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ADDRESS_TYPE1__SOURCE_ADDRESS = PHYSICAL_ADDRESS_TYPE__SOURCE_ADDRESS;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ADDRESS_TYPE1__SOURCE_NAME = PHYSICAL_ADDRESS_TYPE__SOURCE_NAME;

	/**
	 * The number of structural features of the '<em>Physical Address Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ADDRESS_TYPE1_FEATURE_COUNT = PHYSICAL_ADDRESS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.PolynomialTypeImpl <em>Polynomial Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.PolynomialTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getPolynomialType()
	 * @generated
	 */
	int POLYNOMIAL_TYPE = 159;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL_TYPE__TERM = 0;

	/**
	 * The number of structural features of the '<em>Polynomial Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.PropertyTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 160;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__LONG_DESCRIPTION = NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__ALIAS_SET = NAME_DESCRIPTION_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = NAME_DESCRIPTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__SHORT_DESCRIPTION = NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__GROUP = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__PROPERTY = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.QueuedVerifierTypeImpl <em>Queued Verifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.QueuedVerifierTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getQueuedVerifierType()
	 * @generated
	 */
	int QUEUED_VERIFIER_TYPE = 161;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_VERIFIER_TYPE__COMPARISON = COMMAND_VERIFIER_TYPE__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comparison List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_VERIFIER_TYPE__COMPARISON_LIST = COMMAND_VERIFIER_TYPE__COMPARISON_LIST;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_VERIFIER_TYPE__BOOLEAN_EXPRESSION = COMMAND_VERIFIER_TYPE__BOOLEAN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Container Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_VERIFIER_TYPE__CONTAINER_REF = COMMAND_VERIFIER_TYPE__CONTAINER_REF;

	/**
	 * The feature id for the '<em><b>Parameter Value Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE = COMMAND_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE;

	/**
	 * The feature id for the '<em><b>Custom Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_VERIFIER_TYPE__CUSTOM_ALGORITHM = COMMAND_VERIFIER_TYPE__CUSTOM_ALGORITHM;

	/**
	 * The feature id for the '<em><b>Time To Wait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_VERIFIER_TYPE__TIME_TO_WAIT = COMMAND_VERIFIER_TYPE__TIME_TO_WAIT;

	/**
	 * The number of structural features of the '<em>Queued Verifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_VERIFIER_TYPE_FEATURE_COUNT = COMMAND_VERIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.RangeEnumerationTypeImpl <em>Range Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.RangeEnumerationTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getRangeEnumerationType()
	 * @generated
	 */
	int RANGE_ENUMERATION_TYPE = 162;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_ENUMERATION_TYPE__MAX_EXCLUSIVE = DECIMAL_RANGE_TYPE__MAX_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_ENUMERATION_TYPE__MAX_INCLUSIVE = DECIMAL_RANGE_TYPE__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_ENUMERATION_TYPE__MIN_EXCLUSIVE = DECIMAL_RANGE_TYPE__MIN_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_ENUMERATION_TYPE__MIN_INCLUSIVE = DECIMAL_RANGE_TYPE__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_ENUMERATION_TYPE__LABEL = DECIMAL_RANGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Range Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_ENUMERATION_TYPE_FEATURE_COUNT = DECIMAL_RANGE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.RateInStreamSetTypeImpl <em>Rate In Stream Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.RateInStreamSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getRateInStreamSetType()
	 * @generated
	 */
	int RATE_IN_STREAM_SET_TYPE = 163;

	/**
	 * The feature id for the '<em><b>Rate In Stream</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_IN_STREAM_SET_TYPE__RATE_IN_STREAM = 0;

	/**
	 * The number of structural features of the '<em>Rate In Stream Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_IN_STREAM_SET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.RateInStreamType1Impl <em>Rate In Stream Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.RateInStreamType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getRateInStreamType1()
	 * @generated
	 */
	int RATE_IN_STREAM_TYPE1 = 165;

	/**
	 * The feature id for the '<em><b>Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_IN_STREAM_TYPE1__BASIS = 0;

	/**
	 * The feature id for the '<em><b>Maximum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_IN_STREAM_TYPE1__MAXIMUM_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Minimum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_IN_STREAM_TYPE1__MINIMUM_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Rate In Stream Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_IN_STREAM_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.RateInStreamTypeImpl <em>Rate In Stream Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.RateInStreamTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getRateInStreamType()
	 * @generated
	 */
	int RATE_IN_STREAM_TYPE = 164;

	/**
	 * The feature id for the '<em><b>Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_IN_STREAM_TYPE__BASIS = RATE_IN_STREAM_TYPE1__BASIS;

	/**
	 * The feature id for the '<em><b>Maximum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_IN_STREAM_TYPE__MAXIMUM_VALUE = RATE_IN_STREAM_TYPE1__MAXIMUM_VALUE;

	/**
	 * The feature id for the '<em><b>Minimum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_IN_STREAM_TYPE__MINIMUM_VALUE = RATE_IN_STREAM_TYPE1__MINIMUM_VALUE;

	/**
	 * The feature id for the '<em><b>Stream Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_IN_STREAM_TYPE__STREAM_REF = RATE_IN_STREAM_TYPE1_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rate In Stream Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_IN_STREAM_TYPE_FEATURE_COUNT = RATE_IN_STREAM_TYPE1_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ReceivedVerifierTypeImpl <em>Received Verifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ReceivedVerifierTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getReceivedVerifierType()
	 * @generated
	 */
	int RECEIVED_VERIFIER_TYPE = 166;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVED_VERIFIER_TYPE__COMPARISON = COMMAND_VERIFIER_TYPE__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comparison List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVED_VERIFIER_TYPE__COMPARISON_LIST = COMMAND_VERIFIER_TYPE__COMPARISON_LIST;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVED_VERIFIER_TYPE__BOOLEAN_EXPRESSION = COMMAND_VERIFIER_TYPE__BOOLEAN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Container Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVED_VERIFIER_TYPE__CONTAINER_REF = COMMAND_VERIFIER_TYPE__CONTAINER_REF;

	/**
	 * The feature id for the '<em><b>Parameter Value Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVED_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE = COMMAND_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE;

	/**
	 * The feature id for the '<em><b>Custom Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVED_VERIFIER_TYPE__CUSTOM_ALGORITHM = COMMAND_VERIFIER_TYPE__CUSTOM_ALGORITHM;

	/**
	 * The feature id for the '<em><b>Time To Wait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVED_VERIFIER_TYPE__TIME_TO_WAIT = COMMAND_VERIFIER_TYPE__TIME_TO_WAIT;

	/**
	 * The number of structural features of the '<em>Received Verifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVED_VERIFIER_TYPE_FEATURE_COUNT = COMMAND_VERIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ReferenceTimeTypeImpl <em>Reference Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ReferenceTimeTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getReferenceTimeType()
	 * @generated
	 */
	int REFERENCE_TIME_TYPE = 167;

	/**
	 * The feature id for the '<em><b>Offset From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TIME_TYPE__OFFSET_FROM = 0;

	/**
	 * The feature id for the '<em><b>Epoch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TIME_TYPE__EPOCH = 1;

	/**
	 * The number of structural features of the '<em>Reference Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TIME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.RelativeTimeDataTypeImpl <em>Relative Time Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.RelativeTimeDataTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getRelativeTimeDataType()
	 * @generated
	 */
	int RELATIVE_TIME_DATA_TYPE = 168;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_DATA_TYPE__LONG_DESCRIPTION = BASE_TIME_DATA_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_DATA_TYPE__ALIAS_SET = BASE_TIME_DATA_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_DATA_TYPE__NAME = BASE_TIME_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_DATA_TYPE__SHORT_DESCRIPTION = BASE_TIME_DATA_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_DATA_TYPE__ENCODING = BASE_TIME_DATA_TYPE__ENCODING;

	/**
	 * The feature id for the '<em><b>Reference Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_DATA_TYPE__REFERENCE_TIME = BASE_TIME_DATA_TYPE__REFERENCE_TIME;

	/**
	 * The number of structural features of the '<em>Relative Time Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_DATA_TYPE_FEATURE_COUNT = BASE_TIME_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.RepeatTypeImpl <em>Repeat Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.RepeatTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getRepeatType()
	 * @generated
	 */
	int REPEAT_TYPE = 169;

	/**
	 * The feature id for the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__COUNT = 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__OFFSET = 1;

	/**
	 * The number of structural features of the '<em>Repeat Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.RestrictionCriteriaTypeImpl <em>Restriction Criteria Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.RestrictionCriteriaTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getRestrictionCriteriaType()
	 * @generated
	 */
	int RESTRICTION_CRITERIA_TYPE = 170;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_CRITERIA_TYPE__COMPARISON = MATCH_CRITERIA_TYPE__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comparison List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_CRITERIA_TYPE__COMPARISON_LIST = MATCH_CRITERIA_TYPE__COMPARISON_LIST;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_CRITERIA_TYPE__BOOLEAN_EXPRESSION = MATCH_CRITERIA_TYPE__BOOLEAN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Custom Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_CRITERIA_TYPE__CUSTOM_ALGORITHM = MATCH_CRITERIA_TYPE__CUSTOM_ALGORITHM;

	/**
	 * The feature id for the '<em><b>Next Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_CRITERIA_TYPE__NEXT_CONTAINER = MATCH_CRITERIA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Restriction Criteria Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_CRITERIA_TYPE_FEATURE_COUNT = MATCH_CRITERIA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.RestrictionCriteriaType1Impl <em>Restriction Criteria Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.RestrictionCriteriaType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getRestrictionCriteriaType1()
	 * @generated
	 */
	int RESTRICTION_CRITERIA_TYPE1 = 171;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_CRITERIA_TYPE1__COMPARISON = MATCH_CRITERIA_TYPE__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comparison List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_CRITERIA_TYPE1__COMPARISON_LIST = MATCH_CRITERIA_TYPE__COMPARISON_LIST;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_CRITERIA_TYPE1__BOOLEAN_EXPRESSION = MATCH_CRITERIA_TYPE__BOOLEAN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Custom Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_CRITERIA_TYPE1__CUSTOM_ALGORITHM = MATCH_CRITERIA_TYPE__CUSTOM_ALGORITHM;

	/**
	 * The feature id for the '<em><b>Next Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_CRITERIA_TYPE1__NEXT_CONTAINER = MATCH_CRITERIA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Restriction Criteria Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_CRITERIA_TYPE1_FEATURE_COUNT = MATCH_CRITERIA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.SentFromRangeVerifierTypeImpl <em>Sent From Range Verifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.SentFromRangeVerifierTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSentFromRangeVerifierType()
	 * @generated
	 */
	int SENT_FROM_RANGE_VERIFIER_TYPE = 172;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENT_FROM_RANGE_VERIFIER_TYPE__COMPARISON = COMMAND_VERIFIER_TYPE__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comparison List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENT_FROM_RANGE_VERIFIER_TYPE__COMPARISON_LIST = COMMAND_VERIFIER_TYPE__COMPARISON_LIST;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENT_FROM_RANGE_VERIFIER_TYPE__BOOLEAN_EXPRESSION = COMMAND_VERIFIER_TYPE__BOOLEAN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Container Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENT_FROM_RANGE_VERIFIER_TYPE__CONTAINER_REF = COMMAND_VERIFIER_TYPE__CONTAINER_REF;

	/**
	 * The feature id for the '<em><b>Parameter Value Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENT_FROM_RANGE_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE = COMMAND_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE;

	/**
	 * The feature id for the '<em><b>Custom Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENT_FROM_RANGE_VERIFIER_TYPE__CUSTOM_ALGORITHM = COMMAND_VERIFIER_TYPE__CUSTOM_ALGORITHM;

	/**
	 * The feature id for the '<em><b>Time To Wait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENT_FROM_RANGE_VERIFIER_TYPE__TIME_TO_WAIT = COMMAND_VERIFIER_TYPE__TIME_TO_WAIT;

	/**
	 * The number of structural features of the '<em>Sent From Range Verifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENT_FROM_RANGE_VERIFIER_TYPE_FEATURE_COUNT = COMMAND_VERIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.SequenceContainerTypeImpl <em>Sequence Container Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.SequenceContainerTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSequenceContainerType()
	 * @generated
	 */
	int SEQUENCE_CONTAINER_TYPE = 173;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONTAINER_TYPE__LONG_DESCRIPTION = CONTAINER_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONTAINER_TYPE__ALIAS_SET = CONTAINER_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONTAINER_TYPE__NAME = CONTAINER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONTAINER_TYPE__SHORT_DESCRIPTION = CONTAINER_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default Rate In Stream</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONTAINER_TYPE__DEFAULT_RATE_IN_STREAM = CONTAINER_TYPE__DEFAULT_RATE_IN_STREAM;

	/**
	 * The feature id for the '<em><b>Rate In Stream Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONTAINER_TYPE__RATE_IN_STREAM_SET = CONTAINER_TYPE__RATE_IN_STREAM_SET;

	/**
	 * The feature id for the '<em><b>Binary Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONTAINER_TYPE__BINARY_ENCODING = CONTAINER_TYPE__BINARY_ENCODING;

	/**
	 * The feature id for the '<em><b>Entry List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONTAINER_TYPE__ENTRY_LIST = CONTAINER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONTAINER_TYPE__BASE_CONTAINER = CONTAINER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONTAINER_TYPE__ABSTRACT = CONTAINER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Idle Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONTAINER_TYPE__IDLE_PATTERN = CONTAINER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sequence Container Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONTAINER_TYPE_FEATURE_COUNT = CONTAINER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ServiceRefTypeImpl <em>Service Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ServiceRefTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getServiceRefType()
	 * @generated
	 */
	int SERVICE_REF_TYPE = 175;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Service Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE__SERVICE_REF = 1;

	/**
	 * The number of structural features of the '<em>Service Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ServiceSetTypeImpl <em>Service Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ServiceSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getServiceSetType()
	 * @generated
	 */
	int SERVICE_SET_TYPE = 176;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SET_TYPE__SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Service Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ServiceTypeImpl <em>Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ServiceTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 177;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__LONG_DESCRIPTION = NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__ALIAS_SET = NAME_DESCRIPTION_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__NAME = NAME_DESCRIPTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__SHORT_DESCRIPTION = NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Message Ref Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__MESSAGE_REF_SET = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Ref Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__CONTAINER_REF_SET = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_FEATURE_COUNT = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.SignificanceTypeImpl <em>Significance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.SignificanceTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSignificanceType()
	 * @generated
	 */
	int SIGNIFICANCE_TYPE = 178;

	/**
	 * The feature id for the '<em><b>Consequence Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFICANCE_TYPE__CONSEQUENCE_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Reason For Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFICANCE_TYPE__REASON_FOR_WARNING = 1;

	/**
	 * The feature id for the '<em><b>Space System At Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFICANCE_TYPE__SPACE_SYSTEM_AT_RISK = 2;

	/**
	 * The number of structural features of the '<em>Significance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFICANCE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.SizeInBitsTypeImpl <em>Size In Bits Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.SizeInBitsTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSizeInBitsType()
	 * @generated
	 */
	int SIZE_IN_BITS_TYPE = 180;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_IN_BITS_TYPE__FIXED = 0;

	/**
	 * The feature id for the '<em><b>Termination Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_IN_BITS_TYPE__TERMINATION_CHAR = 1;

	/**
	 * The feature id for the '<em><b>Leading Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_IN_BITS_TYPE__LEADING_SIZE = 2;

	/**
	 * The number of structural features of the '<em>Size In Bits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_IN_BITS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.SpaceSystemTypeImpl <em>Space System Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.SpaceSystemTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSpaceSystemType()
	 * @generated
	 */
	int SPACE_SYSTEM_TYPE = 181;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_SYSTEM_TYPE__LONG_DESCRIPTION = NAME_DESCRIPTION_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_SYSTEM_TYPE__ALIAS_SET = NAME_DESCRIPTION_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_SYSTEM_TYPE__NAME = NAME_DESCRIPTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_SYSTEM_TYPE__SHORT_DESCRIPTION = NAME_DESCRIPTION_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_SYSTEM_TYPE__HEADER = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Telemetry Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_SYSTEM_TYPE__TELEMETRY_META_DATA = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Command Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_SYSTEM_TYPE__COMMAND_META_DATA = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_SYSTEM_TYPE__SERVICE_SET = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_SYSTEM_TYPE__DEFAULTS = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Space System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_SYSTEM_TYPE__SPACE_SYSTEM = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Space System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_SYSTEM_TYPE_FEATURE_COUNT = NAME_DESCRIPTION_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.SplineCalibratorTypeImpl <em>Spline Calibrator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.SplineCalibratorTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSplineCalibratorType()
	 * @generated
	 */
	int SPLINE_CALIBRATOR_TYPE = 182;

	/**
	 * The feature id for the '<em><b>Spline Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLINE_CALIBRATOR_TYPE__SPLINE_POINT = 0;

	/**
	 * The feature id for the '<em><b>Extrapolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLINE_CALIBRATOR_TYPE__EXTRAPOLATE = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLINE_CALIBRATOR_TYPE__ORDER = 2;

	/**
	 * The number of structural features of the '<em>Spline Calibrator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLINE_CALIBRATOR_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.SplinePointTypeImpl <em>Spline Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.SplinePointTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSplinePointType()
	 * @generated
	 */
	int SPLINE_POINT_TYPE = 183;

	/**
	 * The feature id for the '<em><b>Calibrated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLINE_POINT_TYPE__CALIBRATED = 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLINE_POINT_TYPE__ORDER = 1;

	/**
	 * The feature id for the '<em><b>Raw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLINE_POINT_TYPE__RAW = 2;

	/**
	 * The number of structural features of the '<em>Spline Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLINE_POINT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.StreamRefTypeImpl <em>Stream Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.StreamRefTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getStreamRefType()
	 * @generated
	 */
	int STREAM_REF_TYPE = 184;

	/**
	 * The feature id for the '<em><b>Stream Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_REF_TYPE__STREAM_REF = 0;

	/**
	 * The number of structural features of the '<em>Stream Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_REF_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.StreamSegmentEntryTypeImpl <em>Stream Segment Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.StreamSegmentEntryTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getStreamSegmentEntryType()
	 * @generated
	 */
	int STREAM_SEGMENT_ENTRY_TYPE = 185;

	/**
	 * The feature id for the '<em><b>Location In Container In Bits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_SEGMENT_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS = SEQUENCE_ENTRY_TYPE__LOCATION_IN_CONTAINER_IN_BITS;

	/**
	 * The feature id for the '<em><b>Repeat Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_SEGMENT_ENTRY_TYPE__REPEAT_ENTRY = SEQUENCE_ENTRY_TYPE__REPEAT_ENTRY;

	/**
	 * The feature id for the '<em><b>Include Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_SEGMENT_ENTRY_TYPE__INCLUDE_CONDITION = SEQUENCE_ENTRY_TYPE__INCLUDE_CONDITION;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_SEGMENT_ENTRY_TYPE__ORDER = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_SEGMENT_ENTRY_TYPE__SIZE_IN_BITS = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stream Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_SEGMENT_ENTRY_TYPE__STREAM_REF = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stream Segment Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_SEGMENT_ENTRY_TYPE_FEATURE_COUNT = SEQUENCE_ENTRY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.StreamSetTypeImpl <em>Stream Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.StreamSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getStreamSetType()
	 * @generated
	 */
	int STREAM_SET_TYPE = 186;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_SET_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Fixed Frame Stream</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_SET_TYPE__FIXED_FRAME_STREAM = 1;

	/**
	 * The feature id for the '<em><b>Variable Frame Stream</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_SET_TYPE__VARIABLE_FRAME_STREAM = 2;

	/**
	 * The feature id for the '<em><b>Custom Stream</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_SET_TYPE__CUSTOM_STREAM = 3;

	/**
	 * The number of structural features of the '<em>Stream Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_SET_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.StringDataEncodingTypeImpl <em>String Data Encoding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.StringDataEncodingTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getStringDataEncodingType()
	 * @generated
	 */
	int STRING_DATA_ENCODING_TYPE = 187;

	/**
	 * The feature id for the '<em><b>Error Detect Correct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT = DATA_ENCODING_TYPE__ERROR_DETECT_CORRECT;

	/**
	 * The feature id for the '<em><b>Byte Order List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_ENCODING_TYPE__BYTE_ORDER_LIST = DATA_ENCODING_TYPE__BYTE_ORDER_LIST;

	/**
	 * The feature id for the '<em><b>Bit Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_ENCODING_TYPE__BIT_ORDER = DATA_ENCODING_TYPE__BIT_ORDER;

	/**
	 * The feature id for the '<em><b>Default Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_ENCODING_TYPE__DEFAULT_CALIBRATOR = DATA_ENCODING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Calibrator List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_ENCODING_TYPE__CONTEXT_CALIBRATOR_LIST = DATA_ENCODING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size In Bits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_ENCODING_TYPE__SIZE_IN_BITS = DATA_ENCODING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_ENCODING_TYPE__ENCODING = DATA_ENCODING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>String Data Encoding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_ENCODING_TYPE_FEATURE_COUNT = DATA_ENCODING_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.StringDataTypeImpl <em>String Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.StringDataTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getStringDataType()
	 * @generated
	 */
	int STRING_DATA_TYPE = 188;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_TYPE__LONG_DESCRIPTION = BASE_DATA_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_TYPE__ALIAS_SET = BASE_DATA_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_TYPE__NAME = BASE_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_TYPE__SHORT_DESCRIPTION = BASE_DATA_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_TYPE__UNIT_SET = BASE_DATA_TYPE__UNIT_SET;

	/**
	 * The feature id for the '<em><b>Binary Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_TYPE__BINARY_DATA_ENCODING = BASE_DATA_TYPE__BINARY_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Float Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_TYPE__FLOAT_DATA_ENCODING = BASE_DATA_TYPE__FLOAT_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Integer Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_TYPE__INTEGER_DATA_ENCODING = BASE_DATA_TYPE__INTEGER_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>String Data Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_TYPE__STRING_DATA_ENCODING = BASE_DATA_TYPE__STRING_DATA_ENCODING;

	/**
	 * The feature id for the '<em><b>Size Range In Characters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_TYPE__SIZE_RANGE_IN_CHARACTERS = BASE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Calibrator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_TYPE__DEFAULT_CALIBRATOR = BASE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context Calibrator List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_TYPE__CONTEXT_CALIBRATOR_LIST = BASE_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Character Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_TYPE__CHARACTER_WIDTH = BASE_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_TYPE__INITIAL_VALUE = BASE_DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Restriction Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_TYPE__RESTRICTION_PATTERN = BASE_DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>String Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DATA_TYPE_FEATURE_COUNT = BASE_DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.SyncPatternTypeImpl <em>Sync Pattern Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.SyncPatternTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSyncPatternType()
	 * @generated
	 */
	int SYNC_PATTERN_TYPE = 189;

	/**
	 * The feature id for the '<em><b>Bit Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_PATTERN_TYPE__BIT_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_PATTERN_TYPE__MASK = 1;

	/**
	 * The feature id for the '<em><b>Mask Length In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_PATTERN_TYPE__MASK_LENGTH_IN_BITS = 2;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_PATTERN_TYPE__PATTERN = 3;

	/**
	 * The feature id for the '<em><b>Pattern Length In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_PATTERN_TYPE__PATTERN_LENGTH_IN_BITS = 4;

	/**
	 * The number of structural features of the '<em>Sync Pattern Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_PATTERN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.SyncPatternType1Impl <em>Sync Pattern Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.SyncPatternType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSyncPatternType1()
	 * @generated
	 */
	int SYNC_PATTERN_TYPE1 = 190;

	/**
	 * The feature id for the '<em><b>Bit Location From Start Of Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_PATTERN_TYPE1__BIT_LOCATION_FROM_START_OF_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_PATTERN_TYPE1__MASK = 1;

	/**
	 * The feature id for the '<em><b>Mask Length In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_PATTERN_TYPE1__MASK_LENGTH_IN_BITS = 2;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_PATTERN_TYPE1__PATTERN = 3;

	/**
	 * The feature id for the '<em><b>Pattern Length In Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_PATTERN_TYPE1__PATTERN_LENGTH_IN_BITS = 4;

	/**
	 * The number of structural features of the '<em>Sync Pattern Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_PATTERN_TYPE1_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.SyncStrategyType1Impl <em>Sync Strategy Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.SyncStrategyType1Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSyncStrategyType1()
	 * @generated
	 */
	int SYNC_STRATEGY_TYPE1 = 192;

	/**
	 * The feature id for the '<em><b>Auto Invert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_STRATEGY_TYPE1__AUTO_INVERT = SYNC_STRATEGY_TYPE__AUTO_INVERT;

	/**
	 * The feature id for the '<em><b>Check To Lock Good Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_STRATEGY_TYPE1__CHECK_TO_LOCK_GOOD_FRAMES = SYNC_STRATEGY_TYPE__CHECK_TO_LOCK_GOOD_FRAMES;

	/**
	 * The feature id for the '<em><b>Max Bit Errors In Sync Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_STRATEGY_TYPE1__MAX_BIT_ERRORS_IN_SYNC_PATTERN = SYNC_STRATEGY_TYPE__MAX_BIT_ERRORS_IN_SYNC_PATTERN;

	/**
	 * The feature id for the '<em><b>Verify To Lock Good Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_STRATEGY_TYPE1__VERIFY_TO_LOCK_GOOD_FRAMES = SYNC_STRATEGY_TYPE__VERIFY_TO_LOCK_GOOD_FRAMES;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_STRATEGY_TYPE1__FLAG = SYNC_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sync Strategy Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_STRATEGY_TYPE1_FEATURE_COUNT = SYNC_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.SyncStrategyType2Impl <em>Sync Strategy Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.SyncStrategyType2Impl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSyncStrategyType2()
	 * @generated
	 */
	int SYNC_STRATEGY_TYPE2 = 193;

	/**
	 * The feature id for the '<em><b>Auto Invert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_STRATEGY_TYPE2__AUTO_INVERT = SYNC_STRATEGY_TYPE__AUTO_INVERT;

	/**
	 * The feature id for the '<em><b>Check To Lock Good Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_STRATEGY_TYPE2__CHECK_TO_LOCK_GOOD_FRAMES = SYNC_STRATEGY_TYPE__CHECK_TO_LOCK_GOOD_FRAMES;

	/**
	 * The feature id for the '<em><b>Max Bit Errors In Sync Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_STRATEGY_TYPE2__MAX_BIT_ERRORS_IN_SYNC_PATTERN = SYNC_STRATEGY_TYPE__MAX_BIT_ERRORS_IN_SYNC_PATTERN;

	/**
	 * The feature id for the '<em><b>Verify To Lock Good Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_STRATEGY_TYPE2__VERIFY_TO_LOCK_GOOD_FRAMES = SYNC_STRATEGY_TYPE__VERIFY_TO_LOCK_GOOD_FRAMES;

	/**
	 * The feature id for the '<em><b>Sync Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_STRATEGY_TYPE2__SYNC_PATTERN = SYNC_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sync Strategy Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_STRATEGY_TYPE2_FEATURE_COUNT = SYNC_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.TelemetryMetaDataTypeImpl <em>Telemetry Meta Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.TelemetryMetaDataTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getTelemetryMetaDataType()
	 * @generated
	 */
	int TELEMETRY_META_DATA_TYPE = 194;

	/**
	 * The feature id for the '<em><b>Parameter Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY_META_DATA_TYPE__PARAMETER_TYPE_SET = 0;

	/**
	 * The feature id for the '<em><b>Parameter Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY_META_DATA_TYPE__PARAMETER_SET = 1;

	/**
	 * The feature id for the '<em><b>Container Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY_META_DATA_TYPE__CONTAINER_SET = 2;

	/**
	 * The feature id for the '<em><b>Message Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY_META_DATA_TYPE__MESSAGE_SET = 3;

	/**
	 * The feature id for the '<em><b>Stream Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY_META_DATA_TYPE__STREAM_SET = 4;

	/**
	 * The feature id for the '<em><b>Algorithm Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY_META_DATA_TYPE__ALGORITHM_SET = 5;

	/**
	 * The number of structural features of the '<em>Telemetry Meta Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY_META_DATA_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.TermTypeImpl <em>Term Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.TermTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getTermType()
	 * @generated
	 */
	int TERM_TYPE = 195;

	/**
	 * The feature id for the '<em><b>Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE__COEFFICIENT = 0;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE__EXPONENT = 1;

	/**
	 * The number of structural features of the '<em>Term Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.TimeAssociationTypeImpl <em>Time Association Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.TimeAssociationTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getTimeAssociationType()
	 * @generated
	 */
	int TIME_ASSOCIATION_TYPE = 196;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ASSOCIATION_TYPE__VALUE = PARAMETER_INSTANCE_REF_TYPE1__VALUE;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ASSOCIATION_TYPE__PARAMETER_REF = PARAMETER_INSTANCE_REF_TYPE1__PARAMETER_REF;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ASSOCIATION_TYPE__INSTANCE = PARAMETER_INSTANCE_REF_TYPE1__INSTANCE;

	/**
	 * The feature id for the '<em><b>Use Calibrated Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ASSOCIATION_TYPE__USE_CALIBRATED_VALUE = PARAMETER_INSTANCE_REF_TYPE1__USE_CALIBRATED_VALUE;

	/**
	 * The feature id for the '<em><b>Interpolate Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ASSOCIATION_TYPE__INTERPOLATE_TIME = PARAMETER_INSTANCE_REF_TYPE1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ASSOCIATION_TYPE__OFFSET = PARAMETER_INSTANCE_REF_TYPE1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Association Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ASSOCIATION_TYPE_FEATURE_COUNT = PARAMETER_INSTANCE_REF_TYPE1_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.TransferredToRangeVerifierTypeImpl <em>Transferred To Range Verifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.TransferredToRangeVerifierTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getTransferredToRangeVerifierType()
	 * @generated
	 */
	int TRANSFERRED_TO_RANGE_VERIFIER_TYPE = 197;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFERRED_TO_RANGE_VERIFIER_TYPE__COMPARISON = COMMAND_VERIFIER_TYPE__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comparison List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFERRED_TO_RANGE_VERIFIER_TYPE__COMPARISON_LIST = COMMAND_VERIFIER_TYPE__COMPARISON_LIST;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFERRED_TO_RANGE_VERIFIER_TYPE__BOOLEAN_EXPRESSION = COMMAND_VERIFIER_TYPE__BOOLEAN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Container Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFERRED_TO_RANGE_VERIFIER_TYPE__CONTAINER_REF = COMMAND_VERIFIER_TYPE__CONTAINER_REF;

	/**
	 * The feature id for the '<em><b>Parameter Value Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFERRED_TO_RANGE_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE = COMMAND_VERIFIER_TYPE__PARAMETER_VALUE_CHANGE;

	/**
	 * The feature id for the '<em><b>Custom Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFERRED_TO_RANGE_VERIFIER_TYPE__CUSTOM_ALGORITHM = COMMAND_VERIFIER_TYPE__CUSTOM_ALGORITHM;

	/**
	 * The feature id for the '<em><b>Time To Wait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFERRED_TO_RANGE_VERIFIER_TYPE__TIME_TO_WAIT = COMMAND_VERIFIER_TYPE__TIME_TO_WAIT;

	/**
	 * The number of structural features of the '<em>Transferred To Range Verifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFERRED_TO_RANGE_VERIFIER_TYPE_FEATURE_COUNT = COMMAND_VERIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.TransmissionConstraintListTypeImpl <em>Transmission Constraint List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.TransmissionConstraintListTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getTransmissionConstraintListType()
	 * @generated
	 */
	int TRANSMISSION_CONSTRAINT_LIST_TYPE = 198;

	/**
	 * The feature id for the '<em><b>Transmission Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CONSTRAINT_LIST_TYPE__TRANSMISSION_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Transmission Constraint List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CONSTRAINT_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.TransmissionConstraintTypeImpl <em>Transmission Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.TransmissionConstraintTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getTransmissionConstraintType()
	 * @generated
	 */
	int TRANSMISSION_CONSTRAINT_TYPE = 199;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CONSTRAINT_TYPE__COMPARISON = MATCH_CRITERIA_TYPE__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comparison List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CONSTRAINT_TYPE__COMPARISON_LIST = MATCH_CRITERIA_TYPE__COMPARISON_LIST;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CONSTRAINT_TYPE__BOOLEAN_EXPRESSION = MATCH_CRITERIA_TYPE__BOOLEAN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Custom Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CONSTRAINT_TYPE__CUSTOM_ALGORITHM = MATCH_CRITERIA_TYPE__CUSTOM_ALGORITHM;

	/**
	 * The feature id for the '<em><b>Suspendable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CONSTRAINT_TYPE__SUSPENDABLE = MATCH_CRITERIA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CONSTRAINT_TYPE__TIME_OUT = MATCH_CRITERIA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transmission Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_CONSTRAINT_TYPE_FEATURE_COUNT = MATCH_CRITERIA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.TriggerTypeImpl <em>Trigger Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.TriggerTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getTriggerType()
	 * @generated
	 */
	int TRIGGER_TYPE = 200;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__PARAMETER_REF = 1;

	/**
	 * The feature id for the '<em><b>Trigger Frequency</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__TRIGGER_FREQUENCY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Trigger Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE__TRIGGER_RATE = 4;

	/**
	 * The number of structural features of the '<em>Trigger Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.UnitSetTypeImpl <em>Unit Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.UnitSetTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getUnitSetType()
	 * @generated
	 */
	int UNIT_SET_TYPE = 201;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SET_TYPE__UNIT = 0;

	/**
	 * The number of structural features of the '<em>Unit Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_SET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.UnitTypeImpl <em>Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.UnitTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 202;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__FACTOR = 2;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__POWER = 3;

	/**
	 * The number of structural features of the '<em>Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ValidRangeTypeImpl <em>Valid Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ValidRangeTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getValidRangeType()
	 * @generated
	 */
	int VALID_RANGE_TYPE = 203;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RANGE_TYPE__MAX_EXCLUSIVE = DECIMAL_RANGE_TYPE__MAX_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RANGE_TYPE__MAX_INCLUSIVE = DECIMAL_RANGE_TYPE__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RANGE_TYPE__MIN_EXCLUSIVE = DECIMAL_RANGE_TYPE__MIN_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RANGE_TYPE__MIN_INCLUSIVE = DECIMAL_RANGE_TYPE__MIN_INCLUSIVE;

	/**
	 * The number of structural features of the '<em>Valid Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_RANGE_TYPE_FEATURE_COUNT = DECIMAL_RANGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.ValueEnumerationTypeImpl <em>Value Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.ValueEnumerationTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getValueEnumerationType()
	 * @generated
	 */
	int VALUE_ENUMERATION_TYPE = 204;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ENUMERATION_TYPE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ENUMERATION_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Value Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ENUMERATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.VariableFrameStreamTypeImpl <em>Variable Frame Stream Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.VariableFrameStreamTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getVariableFrameStreamType()
	 * @generated
	 */
	int VARIABLE_FRAME_STREAM_TYPE = 205;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FRAME_STREAM_TYPE__LONG_DESCRIPTION = FRAME_STREAM_TYPE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FRAME_STREAM_TYPE__ALIAS_SET = FRAME_STREAM_TYPE__ALIAS_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FRAME_STREAM_TYPE__NAME = FRAME_STREAM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FRAME_STREAM_TYPE__SHORT_DESCRIPTION = FRAME_STREAM_TYPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Bit Rate In BPS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FRAME_STREAM_TYPE__BIT_RATE_IN_BPS = FRAME_STREAM_TYPE__BIT_RATE_IN_BPS;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FRAME_STREAM_TYPE__INVERTED = FRAME_STREAM_TYPE__INVERTED;

	/**
	 * The feature id for the '<em><b>Pcm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FRAME_STREAM_TYPE__PCM_TYPE = FRAME_STREAM_TYPE__PCM_TYPE;

	/**
	 * The feature id for the '<em><b>Container Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FRAME_STREAM_TYPE__CONTAINER_REF = FRAME_STREAM_TYPE__CONTAINER_REF;

	/**
	 * The feature id for the '<em><b>Service Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FRAME_STREAM_TYPE__SERVICE_REF = FRAME_STREAM_TYPE__SERVICE_REF;

	/**
	 * The feature id for the '<em><b>Stream Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FRAME_STREAM_TYPE__STREAM_REF = FRAME_STREAM_TYPE__STREAM_REF;

	/**
	 * The feature id for the '<em><b>Sync Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FRAME_STREAM_TYPE__SYNC_STRATEGY = FRAME_STREAM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Frame Stream Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FRAME_STREAM_TYPE_FEATURE_COUNT = FRAME_STREAM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.impl.VerifiersTypeImpl <em>Verifiers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.impl.VerifiersTypeImpl
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getVerifiersType()
	 * @generated
	 */
	int VERIFIERS_TYPE = 206;

	/**
	 * The feature id for the '<em><b>Transferred To Range Verifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIERS_TYPE__TRANSFERRED_TO_RANGE_VERIFIER = 0;

	/**
	 * The feature id for the '<em><b>Sent From Range Verifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIERS_TYPE__SENT_FROM_RANGE_VERIFIER = 1;

	/**
	 * The feature id for the '<em><b>Received Verifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIERS_TYPE__RECEIVED_VERIFIER = 2;

	/**
	 * The feature id for the '<em><b>Accepted Verifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIERS_TYPE__ACCEPTED_VERIFIER = 3;

	/**
	 * The feature id for the '<em><b>Queued Verifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIERS_TYPE__QUEUED_VERIFIER = 4;

	/**
	 * The feature id for the '<em><b>Execution Verifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIERS_TYPE__EXECUTION_VERIFIER = 5;

	/**
	 * The feature id for the '<em><b>Complete Verifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIERS_TYPE__COMPLETE_VERIFIER = 6;

	/**
	 * The feature id for the '<em><b>Failed Verifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIERS_TYPE__FAILED_VERIFIER = 7;

	/**
	 * The number of structural features of the '<em>Verifiers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIERS_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.BasisType <em>Basis Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.BasisType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getBasisType()
	 * @generated
	 */
	int BASIS_TYPE = 207;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.BitOrderType <em>Bit Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.BitOrderType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getBitOrderType()
	 * @generated
	 */
	int BIT_ORDER_TYPE = 208;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.CharacterWidthType <em>Character Width Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.CharacterWidthType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getCharacterWidthType()
	 * @generated
	 */
	int CHARACTER_WIDTH_TYPE = 209;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.ComparisonOperatorsType <em>Comparison Operators Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.ComparisonOperatorsType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getComparisonOperatorsType()
	 * @generated
	 */
	int COMPARISON_OPERATORS_TYPE = 210;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.ConsequenceLevelType <em>Consequence Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.ConsequenceLevelType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getConsequenceLevelType()
	 * @generated
	 */
	int CONSEQUENCE_LEVEL_TYPE = 211;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.DataSourceType <em>Data Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.DataSourceType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getDataSourceType()
	 * @generated
	 */
	int DATA_SOURCE_TYPE = 212;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.EncodingType <em>Encoding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.EncodingType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getEncodingType()
	 * @generated
	 */
	int ENCODING_TYPE = 213;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.EncodingType2 <em>Encoding Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.EncodingType2
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getEncodingType2()
	 * @generated
	 */
	int ENCODING_TYPE2 = 214;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.EncodingType3 <em>Encoding Type3</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.EncodingType3
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getEncodingType3()
	 * @generated
	 */
	int ENCODING_TYPE3 = 215;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.EpochTypeMember1 <em>Epoch Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.EpochTypeMember1
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getEpochTypeMember1()
	 * @generated
	 */
	int EPOCH_TYPE_MEMBER1 = 216;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.FlagBitTypeType <em>Flag Bit Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.FlagBitTypeType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getFlagBitTypeType()
	 * @generated
	 */
	int FLAG_BIT_TYPE_TYPE = 217;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.MathOperatorsType <em>Math Operators Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.MathOperatorsType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getMathOperatorsType()
	 * @generated
	 */
	int MATH_OPERATORS_TYPE = 218;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.NotationType <em>Notation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.NotationType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getNotationType()
	 * @generated
	 */
	int NOTATION_TYPE = 219;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.PcmTypeType <em>Pcm Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.PcmTypeType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getPcmTypeType()
	 * @generated
	 */
	int PCM_TYPE_TYPE = 220;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.RadixType <em>Radix Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.RadixType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getRadixType()
	 * @generated
	 */
	int RADIX_TYPE = 221;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.ReferenceLocationType <em>Reference Location Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.ReferenceLocationType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getReferenceLocationType()
	 * @generated
	 */
	int REFERENCE_LOCATION_TYPE = 222;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.ReferenceType <em>Reference Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.ReferenceType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 223;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.ReferenceType1 <em>Reference Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.ReferenceType1
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getReferenceType1()
	 * @generated
	 */
	int REFERENCE_TYPE1 = 224;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.SizeInBitsType1 <em>Size In Bits Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.SizeInBitsType1
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSizeInBitsType1()
	 * @generated
	 */
	int SIZE_IN_BITS_TYPE1 = 225;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.SizeInBitsType2 <em>Size In Bits Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.SizeInBitsType2
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSizeInBitsType2()
	 * @generated
	 */
	int SIZE_IN_BITS_TYPE2 = 226;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.TypeType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 227;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.UnitsType <em>Units Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.UnitsType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getUnitsType()
	 * @generated
	 */
	int UNITS_TYPE = 228;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.ValidationStatusType <em>Validation Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.ValidationStatusType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getValidationStatusType()
	 * @generated
	 */
	int VALIDATION_STATUS_TYPE = 229;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.VerificationToWaitForType <em>Verification To Wait For Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.VerificationToWaitForType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getVerificationToWaitForType()
	 * @generated
	 */
	int VERIFICATION_TO_WAIT_FOR_TYPE = 230;

	/**
	 * The meta object id for the '{@link org.omg.space.xtce.VerifierToTriggerOnType <em>Verifier To Trigger On Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.VerifierToTriggerOnType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getVerifierToTriggerOnType()
	 * @generated
	 */
	int VERIFIER_TO_TRIGGER_ON_TYPE = 231;

	/**
	 * The meta object id for the '<em>Basis Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.BasisType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getBasisTypeObject()
	 * @generated
	 */
	int BASIS_TYPE_OBJECT = 232;

	/**
	 * The meta object id for the '<em>Binary Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getBinaryType()
	 * @generated
	 */
	int BINARY_TYPE = 233;

	/**
	 * The meta object id for the '<em>Bit Order Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.BitOrderType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getBitOrderTypeObject()
	 * @generated
	 */
	int BIT_ORDER_TYPE_OBJECT = 234;

	/**
	 * The meta object id for the '<em>Character Width Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.CharacterWidthType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getCharacterWidthTypeObject()
	 * @generated
	 */
	int CHARACTER_WIDTH_TYPE_OBJECT = 235;

	/**
	 * The meta object id for the '<em>Comparison Operators Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.ComparisonOperatorsType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getComparisonOperatorsTypeObject()
	 * @generated
	 */
	int COMPARISON_OPERATORS_TYPE_OBJECT = 236;

	/**
	 * The meta object id for the '<em>Consequence Level Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.ConsequenceLevelType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getConsequenceLevelTypeObject()
	 * @generated
	 */
	int CONSEQUENCE_LEVEL_TYPE_OBJECT = 237;

	/**
	 * The meta object id for the '<em>Data Source Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.DataSourceType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getDataSourceTypeObject()
	 * @generated
	 */
	int DATA_SOURCE_TYPE_OBJECT = 238;

	/**
	 * The meta object id for the '<em>Encoding Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.EncodingType2
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getEncodingTypeObject()
	 * @generated
	 */
	int ENCODING_TYPE_OBJECT = 239;

	/**
	 * The meta object id for the '<em>Encoding Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.EncodingType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getEncodingTypeObject1()
	 * @generated
	 */
	int ENCODING_TYPE_OBJECT1 = 240;

	/**
	 * The meta object id for the '<em>Encoding Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.EncodingType3
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getEncodingTypeObject2()
	 * @generated
	 */
	int ENCODING_TYPE_OBJECT2 = 241;

	/**
	 * The meta object id for the '<em>Epoch Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getEpochType()
	 * @generated
	 */
	int EPOCH_TYPE = 242;

	/**
	 * The meta object id for the '<em>Epoch Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.EpochTypeMember1
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getEpochTypeMember1Object()
	 * @generated
	 */
	int EPOCH_TYPE_MEMBER1_OBJECT = 243;

	/**
	 * The meta object id for the '<em>Fixed Integer Value Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getFixedIntegerValueType()
	 * @generated
	 */
	int FIXED_INTEGER_VALUE_TYPE = 244;

	/**
	 * The meta object id for the '<em>Flag Bit Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.FlagBitTypeType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getFlagBitTypeTypeObject()
	 * @generated
	 */
	int FLAG_BIT_TYPE_TYPE_OBJECT = 245;

	/**
	 * The meta object id for the '<em>Hexadecimal Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getHexadecimalType()
	 * @generated
	 */
	int HEXADECIMAL_TYPE = 246;

	/**
	 * The meta object id for the '<em>Math Operators Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.MathOperatorsType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getMathOperatorsTypeObject()
	 * @generated
	 */
	int MATH_OPERATORS_TYPE_OBJECT = 247;

	/**
	 * The meta object id for the '<em>Name Reference Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getNameReferenceType()
	 * @generated
	 */
	int NAME_REFERENCE_TYPE = 248;

	/**
	 * The meta object id for the '<em>Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 249;

	/**
	 * The meta object id for the '<em>Notation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.NotationType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getNotationTypeObject()
	 * @generated
	 */
	int NOTATION_TYPE_OBJECT = 250;

	/**
	 * The meta object id for the '<em>Octal Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getOctalType()
	 * @generated
	 */
	int OCTAL_TYPE = 251;

	/**
	 * The meta object id for the '<em>Pcm Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.PcmTypeType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getPcmTypeTypeObject()
	 * @generated
	 */
	int PCM_TYPE_TYPE_OBJECT = 252;

	/**
	 * The meta object id for the '<em>Radix Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.RadixType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getRadixTypeObject()
	 * @generated
	 */
	int RADIX_TYPE_OBJECT = 253;

	/**
	 * The meta object id for the '<em>Reference Location Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.ReferenceLocationType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getReferenceLocationTypeObject()
	 * @generated
	 */
	int REFERENCE_LOCATION_TYPE_OBJECT = 254;

	/**
	 * The meta object id for the '<em>Reference Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.ReferenceType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getReferenceTypeObject()
	 * @generated
	 */
	int REFERENCE_TYPE_OBJECT = 255;

	/**
	 * The meta object id for the '<em>Reference Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.ReferenceType1
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getReferenceTypeObject1()
	 * @generated
	 */
	int REFERENCE_TYPE_OBJECT1 = 256;

	/**
	 * The meta object id for the '<em>Relative Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.Duration
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getRelativeTimeType()
	 * @generated
	 */
	int RELATIVE_TIME_TYPE = 257;

	/**
	 * The meta object id for the '<em>Size In Bits Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.SizeInBitsType1
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSizeInBitsTypeObject()
	 * @generated
	 */
	int SIZE_IN_BITS_TYPE_OBJECT = 258;

	/**
	 * The meta object id for the '<em>Size In Bits Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.SizeInBitsType2
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getSizeInBitsTypeObject1()
	 * @generated
	 */
	int SIZE_IN_BITS_TYPE_OBJECT1 = 259;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.TypeType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 260;

	/**
	 * The meta object id for the '<em>Units Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.UnitsType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getUnitsTypeObject()
	 * @generated
	 */
	int UNITS_TYPE_OBJECT = 261;

	/**
	 * The meta object id for the '<em>Validation Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.ValidationStatusType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getValidationStatusTypeObject()
	 * @generated
	 */
	int VALIDATION_STATUS_TYPE_OBJECT = 262;

	/**
	 * The meta object id for the '<em>Verification To Wait For Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.VerificationToWaitForType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getVerificationToWaitForTypeObject()
	 * @generated
	 */
	int VERIFICATION_TO_WAIT_FOR_TYPE_OBJECT = 263;

	/**
	 * The meta object id for the '<em>Verifier To Trigger On Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.space.xtce.VerifierToTriggerOnType
	 * @see org.omg.space.xtce.impl.XtcePackageImpl#getVerifierToTriggerOnTypeObject()
	 * @generated
	 */
	int VERIFIER_TO_TRIGGER_ON_TYPE_OBJECT = 264;


	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.AbsoluteTimeDataType <em>Absolute Time Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Time Data Type</em>'.
	 * @see org.omg.space.xtce.AbsoluteTimeDataType
	 * @generated
	 */
	EClass getAbsoluteTimeDataType();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.AcceptedVerifierType <em>Accepted Verifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accepted Verifier Type</em>'.
	 * @see org.omg.space.xtce.AcceptedVerifierType
	 * @generated
	 */
	EClass getAcceptedVerifierType();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.AlarmConditionsType <em>Alarm Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm Conditions Type</em>'.
	 * @see org.omg.space.xtce.AlarmConditionsType
	 * @generated
	 */
	EClass getAlarmConditionsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.AlarmConditionsType#getWatchAlarm <em>Watch Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Watch Alarm</em>'.
	 * @see org.omg.space.xtce.AlarmConditionsType#getWatchAlarm()
	 * @see #getAlarmConditionsType()
	 * @generated
	 */
	EReference getAlarmConditionsType_WatchAlarm();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.AlarmConditionsType#getWarningAlarm <em>Warning Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Warning Alarm</em>'.
	 * @see org.omg.space.xtce.AlarmConditionsType#getWarningAlarm()
	 * @see #getAlarmConditionsType()
	 * @generated
	 */
	EReference getAlarmConditionsType_WarningAlarm();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.AlarmConditionsType#getDistressAlarm <em>Distress Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distress Alarm</em>'.
	 * @see org.omg.space.xtce.AlarmConditionsType#getDistressAlarm()
	 * @see #getAlarmConditionsType()
	 * @generated
	 */
	EReference getAlarmConditionsType_DistressAlarm();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.AlarmConditionsType#getCritialAlarm <em>Critial Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Critial Alarm</em>'.
	 * @see org.omg.space.xtce.AlarmConditionsType#getCritialAlarm()
	 * @see #getAlarmConditionsType()
	 * @generated
	 */
	EReference getAlarmConditionsType_CritialAlarm();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.AlarmConditionsType#getSevereAlarm <em>Severe Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Severe Alarm</em>'.
	 * @see org.omg.space.xtce.AlarmConditionsType#getSevereAlarm()
	 * @see #getAlarmConditionsType()
	 * @generated
	 */
	EReference getAlarmConditionsType_SevereAlarm();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.AlarmRangesType <em>Alarm Ranges Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm Ranges Type</em>'.
	 * @see org.omg.space.xtce.AlarmRangesType
	 * @generated
	 */
	EClass getAlarmRangesType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.AlarmRangesType#getWatchRange <em>Watch Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Watch Range</em>'.
	 * @see org.omg.space.xtce.AlarmRangesType#getWatchRange()
	 * @see #getAlarmRangesType()
	 * @generated
	 */
	EReference getAlarmRangesType_WatchRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.AlarmRangesType#getWarningRange <em>Warning Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Warning Range</em>'.
	 * @see org.omg.space.xtce.AlarmRangesType#getWarningRange()
	 * @see #getAlarmRangesType()
	 * @generated
	 */
	EReference getAlarmRangesType_WarningRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.AlarmRangesType#getDistressRange <em>Distress Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distress Range</em>'.
	 * @see org.omg.space.xtce.AlarmRangesType#getDistressRange()
	 * @see #getAlarmRangesType()
	 * @generated
	 */
	EReference getAlarmRangesType_DistressRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.AlarmRangesType#getCriticalRange <em>Critical Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Critical Range</em>'.
	 * @see org.omg.space.xtce.AlarmRangesType#getCriticalRange()
	 * @see #getAlarmRangesType()
	 * @generated
	 */
	EReference getAlarmRangesType_CriticalRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.AlarmRangesType#getSevereRange <em>Severe Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Severe Range</em>'.
	 * @see org.omg.space.xtce.AlarmRangesType#getSevereRange()
	 * @see #getAlarmRangesType()
	 * @generated
	 */
	EReference getAlarmRangesType_SevereRange();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.AlarmRangesType#isAppliesToCalibratedValues <em>Applies To Calibrated Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applies To Calibrated Values</em>'.
	 * @see org.omg.space.xtce.AlarmRangesType#isAppliesToCalibratedValues()
	 * @see #getAlarmRangesType()
	 * @generated
	 */
	EAttribute getAlarmRangesType_AppliesToCalibratedValues();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.AlgorithmSetType <em>Algorithm Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm Set Type</em>'.
	 * @see org.omg.space.xtce.AlgorithmSetType
	 * @generated
	 */
	EClass getAlgorithmSetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.AlgorithmSetType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.space.xtce.AlgorithmSetType#getGroup()
	 * @see #getAlgorithmSetType()
	 * @generated
	 */
	EAttribute getAlgorithmSetType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.AlgorithmSetType#getCustomAlgorithm <em>Custom Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Algorithm</em>'.
	 * @see org.omg.space.xtce.AlgorithmSetType#getCustomAlgorithm()
	 * @see #getAlgorithmSetType()
	 * @generated
	 */
	EReference getAlgorithmSetType_CustomAlgorithm();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.AlgorithmSetType#getMathAlgorithm <em>Math Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Math Algorithm</em>'.
	 * @see org.omg.space.xtce.AlgorithmSetType#getMathAlgorithm()
	 * @see #getAlgorithmSetType()
	 * @generated
	 */
	EReference getAlgorithmSetType_MathAlgorithm();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.AlgorithmTextType <em>Algorithm Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm Text Type</em>'.
	 * @see org.omg.space.xtce.AlgorithmTextType
	 * @generated
	 */
	EClass getAlgorithmTextType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.AlgorithmTextType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.space.xtce.AlgorithmTextType#getValue()
	 * @see #getAlgorithmTextType()
	 * @generated
	 */
	EAttribute getAlgorithmTextType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.AlgorithmTextType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.omg.space.xtce.AlgorithmTextType#getLanguage()
	 * @see #getAlgorithmTextType()
	 * @generated
	 */
	EAttribute getAlgorithmTextType_Language();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.AliasSetType <em>Alias Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias Set Type</em>'.
	 * @see org.omg.space.xtce.AliasSetType
	 * @generated
	 */
	EClass getAliasSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.AliasSetType#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias</em>'.
	 * @see org.omg.space.xtce.AliasSetType#getAlias()
	 * @see #getAliasSetType()
	 * @generated
	 */
	EReference getAliasSetType_Alias();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.AliasType <em>Alias Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias Type</em>'.
	 * @see org.omg.space.xtce.AliasType
	 * @generated
	 */
	EClass getAliasType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.AliasType#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.omg.space.xtce.AliasType#getAlias()
	 * @see #getAliasType()
	 * @generated
	 */
	EAttribute getAliasType_Alias();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.AliasType#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Space</em>'.
	 * @see org.omg.space.xtce.AliasType#getNameSpace()
	 * @see #getAliasType()
	 * @generated
	 */
	EAttribute getAliasType_NameSpace();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ANDedConditionsType <em>AN Ded Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AN Ded Conditions Type</em>'.
	 * @see org.omg.space.xtce.ANDedConditionsType
	 * @generated
	 */
	EClass getANDedConditionsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.ANDedConditionsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.space.xtce.ANDedConditionsType#getGroup()
	 * @see #getANDedConditionsType()
	 * @generated
	 */
	EAttribute getANDedConditionsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ANDedConditionsType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see org.omg.space.xtce.ANDedConditionsType#getCondition()
	 * @see #getANDedConditionsType()
	 * @generated
	 */
	EReference getANDedConditionsType_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ANDedConditionsType#getORedConditions <em>ORed Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ORed Conditions</em>'.
	 * @see org.omg.space.xtce.ANDedConditionsType#getORedConditions()
	 * @see #getANDedConditionsType()
	 * @generated
	 */
	EReference getANDedConditionsType_ORedConditions();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ArgumementArrayTypeType <em>Argumement Array Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argumement Array Type Type</em>'.
	 * @see org.omg.space.xtce.ArgumementArrayTypeType
	 * @generated
	 */
	EClass getArgumementArrayTypeType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ArgumementArrayTypeType#getArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array Type</em>'.
	 * @see org.omg.space.xtce.ArgumementArrayTypeType#getArrayType()
	 * @see #getArgumementArrayTypeType()
	 * @generated
	 */
	EAttribute getArgumementArrayTypeType_ArrayType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ArgumementArrayTypeType#getNumberOfDimensions <em>Number Of Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Dimensions</em>'.
	 * @see org.omg.space.xtce.ArgumementArrayTypeType#getNumberOfDimensions()
	 * @see #getArgumementArrayTypeType()
	 * @generated
	 */
	EAttribute getArgumementArrayTypeType_NumberOfDimensions();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ArgumentAssignmentListType <em>Argument Assignment List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Assignment List Type</em>'.
	 * @see org.omg.space.xtce.ArgumentAssignmentListType
	 * @generated
	 */
	EClass getArgumentAssignmentListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ArgumentAssignmentListType#getArgumentAssignment <em>Argument Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument Assignment</em>'.
	 * @see org.omg.space.xtce.ArgumentAssignmentListType#getArgumentAssignment()
	 * @see #getArgumentAssignmentListType()
	 * @generated
	 */
	EReference getArgumentAssignmentListType_ArgumentAssignment();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ArgumentAssignmentType <em>Argument Assignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Assignment Type</em>'.
	 * @see org.omg.space.xtce.ArgumentAssignmentType
	 * @generated
	 */
	EClass getArgumentAssignmentType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ArgumentAssignmentType#getArgumentName <em>Argument Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument Name</em>'.
	 * @see org.omg.space.xtce.ArgumentAssignmentType#getArgumentName()
	 * @see #getArgumentAssignmentType()
	 * @generated
	 */
	EAttribute getArgumentAssignmentType_ArgumentName();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ArgumentAssignmentType#getArgumentValue <em>Argument Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument Value</em>'.
	 * @see org.omg.space.xtce.ArgumentAssignmentType#getArgumentValue()
	 * @see #getArgumentAssignmentType()
	 * @generated
	 */
	EAttribute getArgumentAssignmentType_ArgumentValue();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ArgumentListType <em>Argument List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument List Type</em>'.
	 * @see org.omg.space.xtce.ArgumentListType
	 * @generated
	 */
	EClass getArgumentListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ArgumentListType#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see org.omg.space.xtce.ArgumentListType#getArgument()
	 * @see #getArgumentListType()
	 * @generated
	 */
	EReference getArgumentListType_Argument();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ArgumentListType1 <em>Argument List Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument List Type1</em>'.
	 * @see org.omg.space.xtce.ArgumentListType1
	 * @generated
	 */
	EClass getArgumentListType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.ArgumentListType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.space.xtce.ArgumentListType1#getGroup()
	 * @see #getArgumentListType1()
	 * @generated
	 */
	EAttribute getArgumentListType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ArgumentListType1#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see org.omg.space.xtce.ArgumentListType1#getArgument()
	 * @see #getArgumentListType1()
	 * @generated
	 */
	EReference getArgumentListType1_Argument();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ArgumentRefEntryType <em>Argument Ref Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Ref Entry Type</em>'.
	 * @see org.omg.space.xtce.ArgumentRefEntryType
	 * @generated
	 */
	EClass getArgumentRefEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ArgumentRefEntryType#getArgumentRef <em>Argument Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument Ref</em>'.
	 * @see org.omg.space.xtce.ArgumentRefEntryType#getArgumentRef()
	 * @see #getArgumentRefEntryType()
	 * @generated
	 */
	EAttribute getArgumentRefEntryType_ArgumentRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ArgumentType <em>Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Type</em>'.
	 * @see org.omg.space.xtce.ArgumentType
	 * @generated
	 */
	EClass getArgumentType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ArgumentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.space.xtce.ArgumentType#getName()
	 * @see #getArgumentType()
	 * @generated
	 */
	EAttribute getArgumentType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ArgumentType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.space.xtce.ArgumentType#getValue()
	 * @see #getArgumentType()
	 * @generated
	 */
	EAttribute getArgumentType_Value();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ArgumentType1 <em>Argument Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Type1</em>'.
	 * @see org.omg.space.xtce.ArgumentType1
	 * @generated
	 */
	EClass getArgumentType1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ArgumentType1#getArgumentTypeRef <em>Argument Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument Type Ref</em>'.
	 * @see org.omg.space.xtce.ArgumentType1#getArgumentTypeRef()
	 * @see #getArgumentType1()
	 * @generated
	 */
	EAttribute getArgumentType1_ArgumentTypeRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ArgumentTypeSetType <em>Argument Type Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Type Set Type</em>'.
	 * @see org.omg.space.xtce.ArgumentTypeSetType
	 * @generated
	 */
	EClass getArgumentTypeSetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.ArgumentTypeSetType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.space.xtce.ArgumentTypeSetType#getGroup()
	 * @see #getArgumentTypeSetType()
	 * @generated
	 */
	EAttribute getArgumentTypeSetType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ArgumentTypeSetType#getStringArgumentType <em>String Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String Argument Type</em>'.
	 * @see org.omg.space.xtce.ArgumentTypeSetType#getStringArgumentType()
	 * @see #getArgumentTypeSetType()
	 * @generated
	 */
	EReference getArgumentTypeSetType_StringArgumentType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ArgumentTypeSetType#getEnumeratedArgumentType <em>Enumerated Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerated Argument Type</em>'.
	 * @see org.omg.space.xtce.ArgumentTypeSetType#getEnumeratedArgumentType()
	 * @see #getArgumentTypeSetType()
	 * @generated
	 */
	EReference getArgumentTypeSetType_EnumeratedArgumentType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ArgumentTypeSetType#getIntegerArgumentType <em>Integer Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Argument Type</em>'.
	 * @see org.omg.space.xtce.ArgumentTypeSetType#getIntegerArgumentType()
	 * @see #getArgumentTypeSetType()
	 * @generated
	 */
	EReference getArgumentTypeSetType_IntegerArgumentType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ArgumentTypeSetType#getBinaryArgumentType <em>Binary Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binary Argument Type</em>'.
	 * @see org.omg.space.xtce.ArgumentTypeSetType#getBinaryArgumentType()
	 * @see #getArgumentTypeSetType()
	 * @generated
	 */
	EReference getArgumentTypeSetType_BinaryArgumentType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ArgumentTypeSetType#getFloatArgumentType <em>Float Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Float Argument Type</em>'.
	 * @see org.omg.space.xtce.ArgumentTypeSetType#getFloatArgumentType()
	 * @see #getArgumentTypeSetType()
	 * @generated
	 */
	EReference getArgumentTypeSetType_FloatArgumentType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ArgumentTypeSetType#getBooleanArgumentType <em>Boolean Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Argument Type</em>'.
	 * @see org.omg.space.xtce.ArgumentTypeSetType#getBooleanArgumentType()
	 * @see #getArgumentTypeSetType()
	 * @generated
	 */
	EReference getArgumentTypeSetType_BooleanArgumentType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ArgumentTypeSetType#getRelativeTimeAgumentType <em>Relative Time Agument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relative Time Agument Type</em>'.
	 * @see org.omg.space.xtce.ArgumentTypeSetType#getRelativeTimeAgumentType()
	 * @see #getArgumentTypeSetType()
	 * @generated
	 */
	EReference getArgumentTypeSetType_RelativeTimeAgumentType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ArgumentTypeSetType#getAbsoluteTimeArgumentType <em>Absolute Time Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Absolute Time Argument Type</em>'.
	 * @see org.omg.space.xtce.ArgumentTypeSetType#getAbsoluteTimeArgumentType()
	 * @see #getArgumentTypeSetType()
	 * @generated
	 */
	EReference getArgumentTypeSetType_AbsoluteTimeArgumentType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ArgumentTypeSetType#getArgumementArrayType <em>Argumement Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argumement Array Type</em>'.
	 * @see org.omg.space.xtce.ArgumentTypeSetType#getArgumementArrayType()
	 * @see #getArgumentTypeSetType()
	 * @generated
	 */
	EReference getArgumentTypeSetType_ArgumementArrayType();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ArrayParameterRefEntryType <em>Array Parameter Ref Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Parameter Ref Entry Type</em>'.
	 * @see org.omg.space.xtce.ArrayParameterRefEntryType
	 * @generated
	 */
	EClass getArrayParameterRefEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ArrayParameterRefEntryType#getDimensionList <em>Dimension List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension List</em>'.
	 * @see org.omg.space.xtce.ArrayParameterRefEntryType#getDimensionList()
	 * @see #getArrayParameterRefEntryType()
	 * @generated
	 */
	EReference getArrayParameterRefEntryType_DimensionList();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ArrayParameterRefEntryType#isLastEntryForThisArrayInstance <em>Last Entry For This Array Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Entry For This Array Instance</em>'.
	 * @see org.omg.space.xtce.ArrayParameterRefEntryType#isLastEntryForThisArrayInstance()
	 * @see #getArrayParameterRefEntryType()
	 * @generated
	 */
	EAttribute getArrayParameterRefEntryType_LastEntryForThisArrayInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ArrayParameterRefEntryType#getParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Ref</em>'.
	 * @see org.omg.space.xtce.ArrayParameterRefEntryType#getParameterRef()
	 * @see #getArrayParameterRefEntryType()
	 * @generated
	 */
	EAttribute getArrayParameterRefEntryType_ParameterRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ArrayParameterTypeType <em>Array Parameter Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Parameter Type Type</em>'.
	 * @see org.omg.space.xtce.ArrayParameterTypeType
	 * @generated
	 */
	EClass getArrayParameterTypeType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ArrayParameterTypeType#getArrayTypeRef <em>Array Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array Type Ref</em>'.
	 * @see org.omg.space.xtce.ArrayParameterTypeType#getArrayTypeRef()
	 * @see #getArrayParameterTypeType()
	 * @generated
	 */
	EAttribute getArrayParameterTypeType_ArrayTypeRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ArrayParameterTypeType#getNumberOfDimensions <em>Number Of Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Dimensions</em>'.
	 * @see org.omg.space.xtce.ArrayParameterTypeType#getNumberOfDimensions()
	 * @see #getArrayParameterTypeType()
	 * @generated
	 */
	EAttribute getArrayParameterTypeType_NumberOfDimensions();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.AuthorSetType <em>Author Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author Set Type</em>'.
	 * @see org.omg.space.xtce.AuthorSetType
	 * @generated
	 */
	EClass getAuthorSetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.AuthorSetType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Author</em>'.
	 * @see org.omg.space.xtce.AuthorSetType#getAuthor()
	 * @see #getAuthorSetType()
	 * @generated
	 */
	EAttribute getAuthorSetType_Author();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.AutoInvertType <em>Auto Invert Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Invert Type</em>'.
	 * @see org.omg.space.xtce.AutoInvertType
	 * @generated
	 */
	EClass getAutoInvertType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.AutoInvertType#getInvertAlgorithm <em>Invert Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invert Algorithm</em>'.
	 * @see org.omg.space.xtce.AutoInvertType#getInvertAlgorithm()
	 * @see #getAutoInvertType()
	 * @generated
	 */
	EReference getAutoInvertType_InvertAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.AutoInvertType#getBadFramesToAutoInvert <em>Bad Frames To Auto Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bad Frames To Auto Invert</em>'.
	 * @see org.omg.space.xtce.AutoInvertType#getBadFramesToAutoInvert()
	 * @see #getAutoInvertType()
	 * @generated
	 */
	EAttribute getAutoInvertType_BadFramesToAutoInvert();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.BaseContainerType <em>Base Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Container Type</em>'.
	 * @see org.omg.space.xtce.BaseContainerType
	 * @generated
	 */
	EClass getBaseContainerType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.BaseContainerType#getRestrictionCriteria <em>Restriction Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction Criteria</em>'.
	 * @see org.omg.space.xtce.BaseContainerType#getRestrictionCriteria()
	 * @see #getBaseContainerType()
	 * @generated
	 */
	EReference getBaseContainerType_RestrictionCriteria();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.BaseContainerType#getContainerRef <em>Container Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Ref</em>'.
	 * @see org.omg.space.xtce.BaseContainerType#getContainerRef()
	 * @see #getBaseContainerType()
	 * @generated
	 */
	EAttribute getBaseContainerType_ContainerRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.BaseContainerType1 <em>Base Container Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Container Type1</em>'.
	 * @see org.omg.space.xtce.BaseContainerType1
	 * @generated
	 */
	EClass getBaseContainerType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.BaseContainerType1#getRestrictionCriteria <em>Restriction Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction Criteria</em>'.
	 * @see org.omg.space.xtce.BaseContainerType1#getRestrictionCriteria()
	 * @see #getBaseContainerType1()
	 * @generated
	 */
	EReference getBaseContainerType1_RestrictionCriteria();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.BaseContainerType1#getContainerRef <em>Container Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Ref</em>'.
	 * @see org.omg.space.xtce.BaseContainerType1#getContainerRef()
	 * @see #getBaseContainerType1()
	 * @generated
	 */
	EAttribute getBaseContainerType1_ContainerRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.BaseDataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Data Type</em>'.
	 * @see org.omg.space.xtce.BaseDataType
	 * @generated
	 */
	EClass getBaseDataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.BaseDataType#getUnitSet <em>Unit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Set</em>'.
	 * @see org.omg.space.xtce.BaseDataType#getUnitSet()
	 * @see #getBaseDataType()
	 * @generated
	 */
	EReference getBaseDataType_UnitSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.BaseDataType#getBinaryDataEncoding <em>Binary Data Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binary Data Encoding</em>'.
	 * @see org.omg.space.xtce.BaseDataType#getBinaryDataEncoding()
	 * @see #getBaseDataType()
	 * @generated
	 */
	EReference getBaseDataType_BinaryDataEncoding();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.BaseDataType#getFloatDataEncoding <em>Float Data Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Float Data Encoding</em>'.
	 * @see org.omg.space.xtce.BaseDataType#getFloatDataEncoding()
	 * @see #getBaseDataType()
	 * @generated
	 */
	EReference getBaseDataType_FloatDataEncoding();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.BaseDataType#getIntegerDataEncoding <em>Integer Data Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Data Encoding</em>'.
	 * @see org.omg.space.xtce.BaseDataType#getIntegerDataEncoding()
	 * @see #getBaseDataType()
	 * @generated
	 */
	EReference getBaseDataType_IntegerDataEncoding();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.BaseDataType#getStringDataEncoding <em>String Data Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Data Encoding</em>'.
	 * @see org.omg.space.xtce.BaseDataType#getStringDataEncoding()
	 * @see #getBaseDataType()
	 * @generated
	 */
	EReference getBaseDataType_StringDataEncoding();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.BaseMetaCommandType <em>Base Meta Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Meta Command Type</em>'.
	 * @see org.omg.space.xtce.BaseMetaCommandType
	 * @generated
	 */
	EClass getBaseMetaCommandType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.BaseMetaCommandType#getArgumentAssignmentList <em>Argument Assignment List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument Assignment List</em>'.
	 * @see org.omg.space.xtce.BaseMetaCommandType#getArgumentAssignmentList()
	 * @see #getBaseMetaCommandType()
	 * @generated
	 */
	EReference getBaseMetaCommandType_ArgumentAssignmentList();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.BaseMetaCommandType#getMetaCommandRef <em>Meta Command Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Command Ref</em>'.
	 * @see org.omg.space.xtce.BaseMetaCommandType#getMetaCommandRef()
	 * @see #getBaseMetaCommandType()
	 * @generated
	 */
	EAttribute getBaseMetaCommandType_MetaCommandRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.BaseTimeDataType <em>Base Time Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Time Data Type</em>'.
	 * @see org.omg.space.xtce.BaseTimeDataType
	 * @generated
	 */
	EClass getBaseTimeDataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.BaseTimeDataType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encoding</em>'.
	 * @see org.omg.space.xtce.BaseTimeDataType#getEncoding()
	 * @see #getBaseTimeDataType()
	 * @generated
	 */
	EReference getBaseTimeDataType_Encoding();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.BaseTimeDataType#getReferenceTime <em>Reference Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Time</em>'.
	 * @see org.omg.space.xtce.BaseTimeDataType#getReferenceTime()
	 * @see #getBaseTimeDataType()
	 * @generated
	 */
	EReference getBaseTimeDataType_ReferenceTime();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.BinaryDataEncodingType <em>Binary Data Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Data Encoding Type</em>'.
	 * @see org.omg.space.xtce.BinaryDataEncodingType
	 * @generated
	 */
	EClass getBinaryDataEncodingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.BinaryDataEncodingType#getSizeInBits <em>Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size In Bits</em>'.
	 * @see org.omg.space.xtce.BinaryDataEncodingType#getSizeInBits()
	 * @see #getBinaryDataEncodingType()
	 * @generated
	 */
	EReference getBinaryDataEncodingType_SizeInBits();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.BinaryDataEncodingType#getFromBinaryTransformAlgorithm <em>From Binary Transform Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Binary Transform Algorithm</em>'.
	 * @see org.omg.space.xtce.BinaryDataEncodingType#getFromBinaryTransformAlgorithm()
	 * @see #getBinaryDataEncodingType()
	 * @generated
	 */
	EReference getBinaryDataEncodingType_FromBinaryTransformAlgorithm();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.BinaryDataEncodingType#getToBinaryTransformAlgorithm <em>To Binary Transform Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Binary Transform Algorithm</em>'.
	 * @see org.omg.space.xtce.BinaryDataEncodingType#getToBinaryTransformAlgorithm()
	 * @see #getBinaryDataEncodingType()
	 * @generated
	 */
	EReference getBinaryDataEncodingType_ToBinaryTransformAlgorithm();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.BinaryDataType <em>Binary Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Data Type</em>'.
	 * @see org.omg.space.xtce.BinaryDataType
	 * @generated
	 */
	EClass getBinaryDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.BinaryDataType#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.omg.space.xtce.BinaryDataType#getInitialValue()
	 * @see #getBinaryDataType()
	 * @generated
	 */
	EAttribute getBinaryDataType_InitialValue();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.BlockMetaCommandType <em>Block Meta Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Meta Command Type</em>'.
	 * @see org.omg.space.xtce.BlockMetaCommandType
	 * @generated
	 */
	EClass getBlockMetaCommandType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.BlockMetaCommandType#getMetaCommandStepList <em>Meta Command Step List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Command Step List</em>'.
	 * @see org.omg.space.xtce.BlockMetaCommandType#getMetaCommandStepList()
	 * @see #getBlockMetaCommandType()
	 * @generated
	 */
	EReference getBlockMetaCommandType_MetaCommandStepList();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.BooleanDataType <em>Boolean Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Data Type</em>'.
	 * @see org.omg.space.xtce.BooleanDataType
	 * @generated
	 */
	EClass getBooleanDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.BooleanDataType#isInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.omg.space.xtce.BooleanDataType#isInitialValue()
	 * @see #getBooleanDataType()
	 * @generated
	 */
	EAttribute getBooleanDataType_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.BooleanDataType#getOneStringValue <em>One String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>One String Value</em>'.
	 * @see org.omg.space.xtce.BooleanDataType#getOneStringValue()
	 * @see #getBooleanDataType()
	 * @generated
	 */
	EAttribute getBooleanDataType_OneStringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.BooleanDataType#getZeroStringValue <em>Zero String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zero String Value</em>'.
	 * @see org.omg.space.xtce.BooleanDataType#getZeroStringValue()
	 * @see #getBooleanDataType()
	 * @generated
	 */
	EAttribute getBooleanDataType_ZeroStringValue();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.BooleanExpressionType <em>Boolean Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression Type</em>'.
	 * @see org.omg.space.xtce.BooleanExpressionType
	 * @generated
	 */
	EClass getBooleanExpressionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.BooleanExpressionType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.omg.space.xtce.BooleanExpressionType#getCondition()
	 * @see #getBooleanExpressionType()
	 * @generated
	 */
	EReference getBooleanExpressionType_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.BooleanExpressionType#getANDedConditions <em>AN Ded Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>AN Ded Conditions</em>'.
	 * @see org.omg.space.xtce.BooleanExpressionType#getANDedConditions()
	 * @see #getBooleanExpressionType()
	 * @generated
	 */
	EReference getBooleanExpressionType_ANDedConditions();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.BooleanExpressionType#getORedConditions <em>ORed Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ORed Conditions</em>'.
	 * @see org.omg.space.xtce.BooleanExpressionType#getORedConditions()
	 * @see #getBooleanExpressionType()
	 * @generated
	 */
	EReference getBooleanExpressionType_ORedConditions();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ByteOrderType <em>Byte Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte Order Type</em>'.
	 * @see org.omg.space.xtce.ByteOrderType
	 * @generated
	 */
	EClass getByteOrderType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.ByteOrderType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.space.xtce.ByteOrderType#getGroup()
	 * @see #getByteOrderType()
	 * @generated
	 */
	EAttribute getByteOrderType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ByteOrderType#getByte <em>Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Byte</em>'.
	 * @see org.omg.space.xtce.ByteOrderType#getByte()
	 * @see #getByteOrderType()
	 * @generated
	 */
	EReference getByteOrderType_Byte();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ByteType <em>Byte Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte Type</em>'.
	 * @see org.omg.space.xtce.ByteType
	 * @generated
	 */
	EClass getByteType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ByteType#getByteSignificance <em>Byte Significance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Significance</em>'.
	 * @see org.omg.space.xtce.ByteType#getByteSignificance()
	 * @see #getByteType()
	 * @generated
	 */
	EAttribute getByteType_ByteSignificance();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.CalibratorType <em>Calibrator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calibrator Type</em>'.
	 * @see org.omg.space.xtce.CalibratorType
	 * @generated
	 */
	EClass getCalibratorType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CalibratorType#getSplineCalibrator <em>Spline Calibrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spline Calibrator</em>'.
	 * @see org.omg.space.xtce.CalibratorType#getSplineCalibrator()
	 * @see #getCalibratorType()
	 * @generated
	 */
	EReference getCalibratorType_SplineCalibrator();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CalibratorType#getPolynomialCalibrator <em>Polynomial Calibrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polynomial Calibrator</em>'.
	 * @see org.omg.space.xtce.CalibratorType#getPolynomialCalibrator()
	 * @see #getCalibratorType()
	 * @generated
	 */
	EReference getCalibratorType_PolynomialCalibrator();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.CalibratorType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.space.xtce.CalibratorType#getName()
	 * @see #getCalibratorType()
	 * @generated
	 */
	EAttribute getCalibratorType_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ChangeType <em>Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Type</em>'.
	 * @see org.omg.space.xtce.ChangeType
	 * @generated
	 */
	EClass getChangeType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ChangeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.space.xtce.ChangeType#getValue()
	 * @see #getChangeType()
	 * @generated
	 */
	EAttribute getChangeType_Value();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.CommandContainerEntryListType <em>Command Container Entry List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Container Entry List Type</em>'.
	 * @see org.omg.space.xtce.CommandContainerEntryListType
	 * @generated
	 */
	EClass getCommandContainerEntryListType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.CommandContainerEntryListType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.space.xtce.CommandContainerEntryListType#getGroup()
	 * @see #getCommandContainerEntryListType()
	 * @generated
	 */
	EAttribute getCommandContainerEntryListType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.CommandContainerEntryListType#getParameterRefEntry <em>Parameter Ref Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Ref Entry</em>'.
	 * @see org.omg.space.xtce.CommandContainerEntryListType#getParameterRefEntry()
	 * @see #getCommandContainerEntryListType()
	 * @generated
	 */
	EReference getCommandContainerEntryListType_ParameterRefEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.CommandContainerEntryListType#getParameterSegmentRefEntry <em>Parameter Segment Ref Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Segment Ref Entry</em>'.
	 * @see org.omg.space.xtce.CommandContainerEntryListType#getParameterSegmentRefEntry()
	 * @see #getCommandContainerEntryListType()
	 * @generated
	 */
	EReference getCommandContainerEntryListType_ParameterSegmentRefEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.CommandContainerEntryListType#getContainerRefEntry <em>Container Ref Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Ref Entry</em>'.
	 * @see org.omg.space.xtce.CommandContainerEntryListType#getContainerRefEntry()
	 * @see #getCommandContainerEntryListType()
	 * @generated
	 */
	EReference getCommandContainerEntryListType_ContainerRefEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.CommandContainerEntryListType#getContainerSegmentRefEntry <em>Container Segment Ref Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Segment Ref Entry</em>'.
	 * @see org.omg.space.xtce.CommandContainerEntryListType#getContainerSegmentRefEntry()
	 * @see #getCommandContainerEntryListType()
	 * @generated
	 */
	EReference getCommandContainerEntryListType_ContainerSegmentRefEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.CommandContainerEntryListType#getStreamSegmentEntry <em>Stream Segment Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stream Segment Entry</em>'.
	 * @see org.omg.space.xtce.CommandContainerEntryListType#getStreamSegmentEntry()
	 * @see #getCommandContainerEntryListType()
	 * @generated
	 */
	EReference getCommandContainerEntryListType_StreamSegmentEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.CommandContainerEntryListType#getIndirectParameterRefEntry <em>Indirect Parameter Ref Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indirect Parameter Ref Entry</em>'.
	 * @see org.omg.space.xtce.CommandContainerEntryListType#getIndirectParameterRefEntry()
	 * @see #getCommandContainerEntryListType()
	 * @generated
	 */
	EReference getCommandContainerEntryListType_IndirectParameterRefEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.CommandContainerEntryListType#getArrayParameterRefEntry <em>Array Parameter Ref Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Parameter Ref Entry</em>'.
	 * @see org.omg.space.xtce.CommandContainerEntryListType#getArrayParameterRefEntry()
	 * @see #getCommandContainerEntryListType()
	 * @generated
	 */
	EReference getCommandContainerEntryListType_ArrayParameterRefEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.CommandContainerEntryListType#getArgumentRefEntry <em>Argument Ref Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument Ref Entry</em>'.
	 * @see org.omg.space.xtce.CommandContainerEntryListType#getArgumentRefEntry()
	 * @see #getCommandContainerEntryListType()
	 * @generated
	 */
	EReference getCommandContainerEntryListType_ArgumentRefEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.CommandContainerEntryListType#getArrayArgumentRefEntry <em>Array Argument Ref Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Argument Ref Entry</em>'.
	 * @see org.omg.space.xtce.CommandContainerEntryListType#getArrayArgumentRefEntry()
	 * @see #getCommandContainerEntryListType()
	 * @generated
	 */
	EReference getCommandContainerEntryListType_ArrayArgumentRefEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.CommandContainerEntryListType#getFixedValueEntry <em>Fixed Value Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fixed Value Entry</em>'.
	 * @see org.omg.space.xtce.CommandContainerEntryListType#getFixedValueEntry()
	 * @see #getCommandContainerEntryListType()
	 * @generated
	 */
	EReference getCommandContainerEntryListType_FixedValueEntry();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.CommandContainerSetType <em>Command Container Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Container Set Type</em>'.
	 * @see org.omg.space.xtce.CommandContainerSetType
	 * @generated
	 */
	EClass getCommandContainerSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.CommandContainerSetType#getCommandContainer <em>Command Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command Container</em>'.
	 * @see org.omg.space.xtce.CommandContainerSetType#getCommandContainer()
	 * @see #getCommandContainerSetType()
	 * @generated
	 */
	EReference getCommandContainerSetType_CommandContainer();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.CommandContainerType <em>Command Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Container Type</em>'.
	 * @see org.omg.space.xtce.CommandContainerType
	 * @generated
	 */
	EClass getCommandContainerType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CommandContainerType#getEntryList <em>Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry List</em>'.
	 * @see org.omg.space.xtce.CommandContainerType#getEntryList()
	 * @see #getCommandContainerType()
	 * @generated
	 */
	EReference getCommandContainerType_EntryList();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CommandContainerType#getBaseContainer <em>Base Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Container</em>'.
	 * @see org.omg.space.xtce.CommandContainerType#getBaseContainer()
	 * @see #getCommandContainerType()
	 * @generated
	 */
	EReference getCommandContainerType_BaseContainer();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.CommandMetaDataType <em>Command Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Meta Data Type</em>'.
	 * @see org.omg.space.xtce.CommandMetaDataType
	 * @generated
	 */
	EClass getCommandMetaDataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CommandMetaDataType#getParameterTypeSet <em>Parameter Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Type Set</em>'.
	 * @see org.omg.space.xtce.CommandMetaDataType#getParameterTypeSet()
	 * @see #getCommandMetaDataType()
	 * @generated
	 */
	EReference getCommandMetaDataType_ParameterTypeSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CommandMetaDataType#getParameterSet <em>Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Set</em>'.
	 * @see org.omg.space.xtce.CommandMetaDataType#getParameterSet()
	 * @see #getCommandMetaDataType()
	 * @generated
	 */
	EReference getCommandMetaDataType_ParameterSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CommandMetaDataType#getArgumentTypeSet <em>Argument Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument Type Set</em>'.
	 * @see org.omg.space.xtce.CommandMetaDataType#getArgumentTypeSet()
	 * @see #getCommandMetaDataType()
	 * @generated
	 */
	EReference getCommandMetaDataType_ArgumentTypeSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CommandMetaDataType#getMetaCommandSet <em>Meta Command Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Command Set</em>'.
	 * @see org.omg.space.xtce.CommandMetaDataType#getMetaCommandSet()
	 * @see #getCommandMetaDataType()
	 * @generated
	 */
	EReference getCommandMetaDataType_MetaCommandSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CommandMetaDataType#getCommandContainerSet <em>Command Container Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command Container Set</em>'.
	 * @see org.omg.space.xtce.CommandMetaDataType#getCommandContainerSet()
	 * @see #getCommandMetaDataType()
	 * @generated
	 */
	EReference getCommandMetaDataType_CommandContainerSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CommandMetaDataType#getStreamSet <em>Stream Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stream Set</em>'.
	 * @see org.omg.space.xtce.CommandMetaDataType#getStreamSet()
	 * @see #getCommandMetaDataType()
	 * @generated
	 */
	EReference getCommandMetaDataType_StreamSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CommandMetaDataType#getAlgorithmSet <em>Algorithm Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algorithm Set</em>'.
	 * @see org.omg.space.xtce.CommandMetaDataType#getAlgorithmSet()
	 * @see #getCommandMetaDataType()
	 * @generated
	 */
	EReference getCommandMetaDataType_AlgorithmSet();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.CommandVerifierType <em>Command Verifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Verifier Type</em>'.
	 * @see org.omg.space.xtce.CommandVerifierType
	 * @generated
	 */
	EClass getCommandVerifierType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CommandVerifierType#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparison</em>'.
	 * @see org.omg.space.xtce.CommandVerifierType#getComparison()
	 * @see #getCommandVerifierType()
	 * @generated
	 */
	EReference getCommandVerifierType_Comparison();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CommandVerifierType#getComparisonList <em>Comparison List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparison List</em>'.
	 * @see org.omg.space.xtce.CommandVerifierType#getComparisonList()
	 * @see #getCommandVerifierType()
	 * @generated
	 */
	EReference getCommandVerifierType_ComparisonList();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CommandVerifierType#getBooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Expression</em>'.
	 * @see org.omg.space.xtce.CommandVerifierType#getBooleanExpression()
	 * @see #getCommandVerifierType()
	 * @generated
	 */
	EReference getCommandVerifierType_BooleanExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CommandVerifierType#getContainerRef <em>Container Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container Ref</em>'.
	 * @see org.omg.space.xtce.CommandVerifierType#getContainerRef()
	 * @see #getCommandVerifierType()
	 * @generated
	 */
	EReference getCommandVerifierType_ContainerRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CommandVerifierType#getParameterValueChange <em>Parameter Value Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Value Change</em>'.
	 * @see org.omg.space.xtce.CommandVerifierType#getParameterValueChange()
	 * @see #getCommandVerifierType()
	 * @generated
	 */
	EReference getCommandVerifierType_ParameterValueChange();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CommandVerifierType#getCustomAlgorithm <em>Custom Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Algorithm</em>'.
	 * @see org.omg.space.xtce.CommandVerifierType#getCustomAlgorithm()
	 * @see #getCommandVerifierType()
	 * @generated
	 */
	EReference getCommandVerifierType_CustomAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.CommandVerifierType#getTimeToWait <em>Time To Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time To Wait</em>'.
	 * @see org.omg.space.xtce.CommandVerifierType#getTimeToWait()
	 * @see #getCommandVerifierType()
	 * @generated
	 */
	EAttribute getCommandVerifierType_TimeToWait();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ComparisonCheckType <em>Comparison Check Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Check Type</em>'.
	 * @see org.omg.space.xtce.ComparisonCheckType
	 * @generated
	 */
	EClass getComparisonCheckType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ComparisonCheckType#getParameterInstanceRef <em>Parameter Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Instance Ref</em>'.
	 * @see org.omg.space.xtce.ComparisonCheckType#getParameterInstanceRef()
	 * @see #getComparisonCheckType()
	 * @generated
	 */
	EReference getComparisonCheckType_ParameterInstanceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ComparisonCheckType#getComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Operator</em>'.
	 * @see org.omg.space.xtce.ComparisonCheckType#getComparisonOperator()
	 * @see #getComparisonCheckType()
	 * @generated
	 */
	EAttribute getComparisonCheckType_ComparisonOperator();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ComparisonCheckType#getParameterInstanceRef1 <em>Parameter Instance Ref1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Instance Ref1</em>'.
	 * @see org.omg.space.xtce.ComparisonCheckType#getParameterInstanceRef1()
	 * @see #getComparisonCheckType()
	 * @generated
	 */
	EReference getComparisonCheckType_ParameterInstanceRef1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ComparisonCheckType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.space.xtce.ComparisonCheckType#getValue()
	 * @see #getComparisonCheckType()
	 * @generated
	 */
	EAttribute getComparisonCheckType_Value();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ComparisonListType <em>Comparison List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison List Type</em>'.
	 * @see org.omg.space.xtce.ComparisonListType
	 * @generated
	 */
	EClass getComparisonListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ComparisonListType#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comparison</em>'.
	 * @see org.omg.space.xtce.ComparisonListType#getComparison()
	 * @see #getComparisonListType()
	 * @generated
	 */
	EReference getComparisonListType_Comparison();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ComparisonListType1 <em>Comparison List Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison List Type1</em>'.
	 * @see org.omg.space.xtce.ComparisonListType1
	 * @generated
	 */
	EClass getComparisonListType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ComparisonListType1#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comparison</em>'.
	 * @see org.omg.space.xtce.ComparisonListType1#getComparison()
	 * @see #getComparisonListType1()
	 * @generated
	 */
	EReference getComparisonListType1_Comparison();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ComparisonType <em>Comparison Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Type</em>'.
	 * @see org.omg.space.xtce.ComparisonType
	 * @generated
	 */
	EClass getComparisonType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ComparisonType#getComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Operator</em>'.
	 * @see org.omg.space.xtce.ComparisonType#getComparisonOperator()
	 * @see #getComparisonType()
	 * @generated
	 */
	EAttribute getComparisonType_ComparisonOperator();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ComparisonType#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see org.omg.space.xtce.ComparisonType#getValue1()
	 * @see #getComparisonType()
	 * @generated
	 */
	EAttribute getComparisonType_Value1();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.CompleteVerifierType <em>Complete Verifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complete Verifier Type</em>'.
	 * @see org.omg.space.xtce.CompleteVerifierType
	 * @generated
	 */
	EClass getCompleteVerifierType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CompleteVerifierType#getReturnParmRef <em>Return Parm Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Parm Ref</em>'.
	 * @see org.omg.space.xtce.CompleteVerifierType#getReturnParmRef()
	 * @see #getCompleteVerifierType()
	 * @generated
	 */
	EReference getCompleteVerifierType_ReturnParmRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ConditionalAlarmType <em>Conditional Alarm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Alarm Type</em>'.
	 * @see org.omg.space.xtce.ConditionalAlarmType
	 * @generated
	 */
	EClass getConditionalAlarmType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ConditionalAlarmType#getStaticAlarmConditions <em>Static Alarm Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Static Alarm Conditions</em>'.
	 * @see org.omg.space.xtce.ConditionalAlarmType#getStaticAlarmConditions()
	 * @see #getConditionalAlarmType()
	 * @generated
	 */
	EReference getConditionalAlarmType_StaticAlarmConditions();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ConditionalAlarmType#getChangePerSecondAlarmConditions <em>Change Per Second Alarm Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Per Second Alarm Conditions</em>'.
	 * @see org.omg.space.xtce.ConditionalAlarmType#getChangePerSecondAlarmConditions()
	 * @see #getConditionalAlarmType()
	 * @generated
	 */
	EReference getConditionalAlarmType_ChangePerSecondAlarmConditions();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ConstantType <em>Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Type</em>'.
	 * @see org.omg.space.xtce.ConstantType
	 * @generated
	 */
	EClass getConstantType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ConstantType#getConstantName <em>Constant Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant Name</em>'.
	 * @see org.omg.space.xtce.ConstantType#getConstantName()
	 * @see #getConstantType()
	 * @generated
	 */
	EAttribute getConstantType_ConstantName();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ConstantType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.space.xtce.ConstantType#getValue()
	 * @see #getConstantType()
	 * @generated
	 */
	EAttribute getConstantType_Value();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContainerRefEntryType <em>Container Ref Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Ref Entry Type</em>'.
	 * @see org.omg.space.xtce.ContainerRefEntryType
	 * @generated
	 */
	EClass getContainerRefEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ContainerRefEntryType#getContainerRef <em>Container Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Ref</em>'.
	 * @see org.omg.space.xtce.ContainerRefEntryType#getContainerRef()
	 * @see #getContainerRefEntryType()
	 * @generated
	 */
	EAttribute getContainerRefEntryType_ContainerRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContainerRefSetType <em>Container Ref Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Ref Set Type</em>'.
	 * @see org.omg.space.xtce.ContainerRefSetType
	 * @generated
	 */
	EClass getContainerRefSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ContainerRefSetType#getContainerRef <em>Container Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Ref</em>'.
	 * @see org.omg.space.xtce.ContainerRefSetType#getContainerRef()
	 * @see #getContainerRefSetType()
	 * @generated
	 */
	EReference getContainerRefSetType_ContainerRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContainerRefType <em>Container Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Ref Type</em>'.
	 * @see org.omg.space.xtce.ContainerRefType
	 * @generated
	 */
	EClass getContainerRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ContainerRefType#getContainerRef <em>Container Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Ref</em>'.
	 * @see org.omg.space.xtce.ContainerRefType#getContainerRef()
	 * @see #getContainerRefType()
	 * @generated
	 */
	EAttribute getContainerRefType_ContainerRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContainerSegmentRefEntryType <em>Container Segment Ref Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Segment Ref Entry Type</em>'.
	 * @see org.omg.space.xtce.ContainerSegmentRefEntryType
	 * @generated
	 */
	EClass getContainerSegmentRefEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ContainerSegmentRefEntryType#getContainerRef <em>Container Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Ref</em>'.
	 * @see org.omg.space.xtce.ContainerSegmentRefEntryType#getContainerRef()
	 * @see #getContainerSegmentRefEntryType()
	 * @generated
	 */
	EAttribute getContainerSegmentRefEntryType_ContainerRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ContainerSegmentRefEntryType#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.omg.space.xtce.ContainerSegmentRefEntryType#getOrder()
	 * @see #getContainerSegmentRefEntryType()
	 * @generated
	 */
	EAttribute getContainerSegmentRefEntryType_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ContainerSegmentRefEntryType#getSizeInBits <em>Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size In Bits</em>'.
	 * @see org.omg.space.xtce.ContainerSegmentRefEntryType#getSizeInBits()
	 * @see #getContainerSegmentRefEntryType()
	 * @generated
	 */
	EAttribute getContainerSegmentRefEntryType_SizeInBits();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContainerSetType <em>Container Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Set Type</em>'.
	 * @see org.omg.space.xtce.ContainerSetType
	 * @generated
	 */
	EClass getContainerSetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.ContainerSetType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.space.xtce.ContainerSetType#getGroup()
	 * @see #getContainerSetType()
	 * @generated
	 */
	EAttribute getContainerSetType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ContainerSetType#getSequenceContainer <em>Sequence Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Container</em>'.
	 * @see org.omg.space.xtce.ContainerSetType#getSequenceContainer()
	 * @see #getContainerSetType()
	 * @generated
	 */
	EReference getContainerSetType_SequenceContainer();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Type</em>'.
	 * @see org.omg.space.xtce.ContainerType
	 * @generated
	 */
	EClass getContainerType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ContainerType#getDefaultRateInStream <em>Default Rate In Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Rate In Stream</em>'.
	 * @see org.omg.space.xtce.ContainerType#getDefaultRateInStream()
	 * @see #getContainerType()
	 * @generated
	 */
	EReference getContainerType_DefaultRateInStream();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ContainerType#getRateInStreamSet <em>Rate In Stream Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rate In Stream Set</em>'.
	 * @see org.omg.space.xtce.ContainerType#getRateInStreamSet()
	 * @see #getContainerType()
	 * @generated
	 */
	EReference getContainerType_RateInStreamSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ContainerType#getBinaryEncoding <em>Binary Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binary Encoding</em>'.
	 * @see org.omg.space.xtce.ContainerType#getBinaryEncoding()
	 * @see #getContainerType()
	 * @generated
	 */
	EReference getContainerType_BinaryEncoding();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContextAlarmListType <em>Context Alarm List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Alarm List Type</em>'.
	 * @see org.omg.space.xtce.ContextAlarmListType
	 * @generated
	 */
	EClass getContextAlarmListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ContextAlarmListType#getContextAlarm <em>Context Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Alarm</em>'.
	 * @see org.omg.space.xtce.ContextAlarmListType#getContextAlarm()
	 * @see #getContextAlarmListType()
	 * @generated
	 */
	EReference getContextAlarmListType_ContextAlarm();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContextAlarmListType1 <em>Context Alarm List Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Alarm List Type1</em>'.
	 * @see org.omg.space.xtce.ContextAlarmListType1
	 * @generated
	 */
	EClass getContextAlarmListType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ContextAlarmListType1#getContextAlarm <em>Context Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Alarm</em>'.
	 * @see org.omg.space.xtce.ContextAlarmListType1#getContextAlarm()
	 * @see #getContextAlarmListType1()
	 * @generated
	 */
	EReference getContextAlarmListType1_ContextAlarm();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContextAlarmListType2 <em>Context Alarm List Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Alarm List Type2</em>'.
	 * @see org.omg.space.xtce.ContextAlarmListType2
	 * @generated
	 */
	EClass getContextAlarmListType2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ContextAlarmListType2#getContextAlarm <em>Context Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Alarm</em>'.
	 * @see org.omg.space.xtce.ContextAlarmListType2#getContextAlarm()
	 * @see #getContextAlarmListType2()
	 * @generated
	 */
	EReference getContextAlarmListType2_ContextAlarm();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContextAlarmListType3 <em>Context Alarm List Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Alarm List Type3</em>'.
	 * @see org.omg.space.xtce.ContextAlarmListType3
	 * @generated
	 */
	EClass getContextAlarmListType3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ContextAlarmListType3#getContextAlarm <em>Context Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Alarm</em>'.
	 * @see org.omg.space.xtce.ContextAlarmListType3#getContextAlarm()
	 * @see #getContextAlarmListType3()
	 * @generated
	 */
	EReference getContextAlarmListType3_ContextAlarm();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContextAlarmType <em>Context Alarm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Alarm Type</em>'.
	 * @see org.omg.space.xtce.ContextAlarmType
	 * @generated
	 */
	EClass getContextAlarmType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ContextAlarmType#getContextMatch <em>Context Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Match</em>'.
	 * @see org.omg.space.xtce.ContextAlarmType#getContextMatch()
	 * @see #getContextAlarmType()
	 * @generated
	 */
	EReference getContextAlarmType_ContextMatch();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContextCalibratorListType <em>Context Calibrator List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Calibrator List Type</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorListType
	 * @generated
	 */
	EClass getContextCalibratorListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ContextCalibratorListType#getContextCalibrator <em>Context Calibrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Calibrator</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorListType#getContextCalibrator()
	 * @see #getContextCalibratorListType()
	 * @generated
	 */
	EReference getContextCalibratorListType_ContextCalibrator();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContextCalibratorListType1 <em>Context Calibrator List Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Calibrator List Type1</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorListType1
	 * @generated
	 */
	EClass getContextCalibratorListType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ContextCalibratorListType1#getContextCalibrator <em>Context Calibrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Calibrator</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorListType1#getContextCalibrator()
	 * @see #getContextCalibratorListType1()
	 * @generated
	 */
	EReference getContextCalibratorListType1_ContextCalibrator();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContextCalibratorListType2 <em>Context Calibrator List Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Calibrator List Type2</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorListType2
	 * @generated
	 */
	EClass getContextCalibratorListType2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ContextCalibratorListType2#getContextCalibrator <em>Context Calibrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Calibrator</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorListType2#getContextCalibrator()
	 * @see #getContextCalibratorListType2()
	 * @generated
	 */
	EReference getContextCalibratorListType2_ContextCalibrator();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContextCalibratorListType3 <em>Context Calibrator List Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Calibrator List Type3</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorListType3
	 * @generated
	 */
	EClass getContextCalibratorListType3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ContextCalibratorListType3#getContextCalibrator <em>Context Calibrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Calibrator</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorListType3#getContextCalibrator()
	 * @see #getContextCalibratorListType3()
	 * @generated
	 */
	EReference getContextCalibratorListType3_ContextCalibrator();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContextCalibratorListType4 <em>Context Calibrator List Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Calibrator List Type4</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorListType4
	 * @generated
	 */
	EClass getContextCalibratorListType4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ContextCalibratorListType4#getContextCalibrator <em>Context Calibrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Calibrator</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorListType4#getContextCalibrator()
	 * @see #getContextCalibratorListType4()
	 * @generated
	 */
	EReference getContextCalibratorListType4_ContextCalibrator();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContextCalibratorType <em>Context Calibrator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Calibrator Type</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorType
	 * @generated
	 */
	EClass getContextCalibratorType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ContextCalibratorType#getUseWhenCondition <em>Use When Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use When Condition</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorType#getUseWhenCondition()
	 * @see #getContextCalibratorType()
	 * @generated
	 */
	EReference getContextCalibratorType_UseWhenCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ContextCalibratorType#getCalibrator <em>Calibrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calibrator</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorType#getCalibrator()
	 * @see #getContextCalibratorType()
	 * @generated
	 */
	EReference getContextCalibratorType_Calibrator();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContextCalibratorType1 <em>Context Calibrator Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Calibrator Type1</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorType1
	 * @generated
	 */
	EClass getContextCalibratorType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ContextCalibratorType1#getUseWhenCondition <em>Use When Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use When Condition</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorType1#getUseWhenCondition()
	 * @see #getContextCalibratorType1()
	 * @generated
	 */
	EReference getContextCalibratorType1_UseWhenCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ContextCalibratorType1#getCalibrator <em>Calibrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calibrator</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorType1#getCalibrator()
	 * @see #getContextCalibratorType1()
	 * @generated
	 */
	EReference getContextCalibratorType1_Calibrator();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContextCalibratorType2 <em>Context Calibrator Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Calibrator Type2</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorType2
	 * @generated
	 */
	EClass getContextCalibratorType2();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ContextCalibratorType2#getContextMatch <em>Context Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Match</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorType2#getContextMatch()
	 * @see #getContextCalibratorType2()
	 * @generated
	 */
	EReference getContextCalibratorType2_ContextMatch();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ContextCalibratorType2#getCalibrator <em>Calibrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calibrator</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorType2#getCalibrator()
	 * @see #getContextCalibratorType2()
	 * @generated
	 */
	EReference getContextCalibratorType2_Calibrator();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContextCalibratorType3 <em>Context Calibrator Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Calibrator Type3</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorType3
	 * @generated
	 */
	EClass getContextCalibratorType3();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ContextCalibratorType3#getUseWhenCondition <em>Use When Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use When Condition</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorType3#getUseWhenCondition()
	 * @see #getContextCalibratorType3()
	 * @generated
	 */
	EReference getContextCalibratorType3_UseWhenCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ContextCalibratorType3#getCalibrator <em>Calibrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calibrator</em>'.
	 * @see org.omg.space.xtce.ContextCalibratorType3#getCalibrator()
	 * @see #getContextCalibratorType3()
	 * @generated
	 */
	EReference getContextCalibratorType3_Calibrator();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContextSignificanceListType <em>Context Significance List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Significance List Type</em>'.
	 * @see org.omg.space.xtce.ContextSignificanceListType
	 * @generated
	 */
	EClass getContextSignificanceListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ContextSignificanceListType#getContextSignificance <em>Context Significance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Significance</em>'.
	 * @see org.omg.space.xtce.ContextSignificanceListType#getContextSignificance()
	 * @see #getContextSignificanceListType()
	 * @generated
	 */
	EReference getContextSignificanceListType_ContextSignificance();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ContextSignificanceType <em>Context Significance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Significance Type</em>'.
	 * @see org.omg.space.xtce.ContextSignificanceType
	 * @generated
	 */
	EClass getContextSignificanceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ContextSignificanceType#getContextMatch <em>Context Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Match</em>'.
	 * @see org.omg.space.xtce.ContextSignificanceType#getContextMatch()
	 * @see #getContextSignificanceType()
	 * @generated
	 */
	EReference getContextSignificanceType_ContextMatch();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ContextSignificanceType#getSignificance <em>Significance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Significance</em>'.
	 * @see org.omg.space.xtce.ContextSignificanceType#getSignificance()
	 * @see #getContextSignificanceType()
	 * @generated
	 */
	EReference getContextSignificanceType_Significance();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.CRCType <em>CRC Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CRC Type</em>'.
	 * @see org.omg.space.xtce.CRCType
	 * @generated
	 */
	EClass getCRCType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CRCType#getPolynomial <em>Polynomial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polynomial</em>'.
	 * @see org.omg.space.xtce.CRCType#getPolynomial()
	 * @see #getCRCType()
	 * @generated
	 */
	EReference getCRCType_Polynomial();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.CRCType#getBitsFromReference <em>Bits From Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bits From Reference</em>'.
	 * @see org.omg.space.xtce.CRCType#getBitsFromReference()
	 * @see #getCRCType()
	 * @generated
	 */
	EAttribute getCRCType_BitsFromReference();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.CRCType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.omg.space.xtce.CRCType#getReference()
	 * @see #getCRCType()
	 * @generated
	 */
	EAttribute getCRCType_Reference();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.CustomStreamType <em>Custom Stream Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Stream Type</em>'.
	 * @see org.omg.space.xtce.CustomStreamType
	 * @generated
	 */
	EClass getCustomStreamType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CustomStreamType#getEncodingAlgorithm <em>Encoding Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encoding Algorithm</em>'.
	 * @see org.omg.space.xtce.CustomStreamType#getEncodingAlgorithm()
	 * @see #getCustomStreamType()
	 * @generated
	 */
	EReference getCustomStreamType_EncodingAlgorithm();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.CustomStreamType#getDecodingAlgorithm <em>Decoding Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decoding Algorithm</em>'.
	 * @see org.omg.space.xtce.CustomStreamType#getDecodingAlgorithm()
	 * @see #getCustomStreamType()
	 * @generated
	 */
	EReference getCustomStreamType_DecodingAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.CustomStreamType#getDecodedStreamRef <em>Decoded Stream Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decoded Stream Ref</em>'.
	 * @see org.omg.space.xtce.CustomStreamType#getDecodedStreamRef()
	 * @see #getCustomStreamType()
	 * @generated
	 */
	EAttribute getCustomStreamType_DecodedStreamRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.CustomStreamType#getEncodedStreamRef <em>Encoded Stream Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoded Stream Ref</em>'.
	 * @see org.omg.space.xtce.CustomStreamType#getEncodedStreamRef()
	 * @see #getCustomStreamType()
	 * @generated
	 */
	EAttribute getCustomStreamType_EncodedStreamRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.DataEncodingType <em>Data Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Encoding Type</em>'.
	 * @see org.omg.space.xtce.DataEncodingType
	 * @generated
	 */
	EClass getDataEncodingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.DataEncodingType#getErrorDetectCorrect <em>Error Detect Correct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Detect Correct</em>'.
	 * @see org.omg.space.xtce.DataEncodingType#getErrorDetectCorrect()
	 * @see #getDataEncodingType()
	 * @generated
	 */
	EReference getDataEncodingType_ErrorDetectCorrect();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.DataEncodingType#getByteOrderList <em>Byte Order List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Byte Order List</em>'.
	 * @see org.omg.space.xtce.DataEncodingType#getByteOrderList()
	 * @see #getDataEncodingType()
	 * @generated
	 */
	EReference getDataEncodingType_ByteOrderList();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.DataEncodingType#getBitOrder <em>Bit Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Order</em>'.
	 * @see org.omg.space.xtce.DataEncodingType#getBitOrder()
	 * @see #getDataEncodingType()
	 * @generated
	 */
	EAttribute getDataEncodingType_BitOrder();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.DecimalRangeType <em>Decimal Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Range Type</em>'.
	 * @see org.omg.space.xtce.DecimalRangeType
	 * @generated
	 */
	EClass getDecimalRangeType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.DecimalRangeType#getMaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Exclusive</em>'.
	 * @see org.omg.space.xtce.DecimalRangeType#getMaxExclusive()
	 * @see #getDecimalRangeType()
	 * @generated
	 */
	EAttribute getDecimalRangeType_MaxExclusive();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.DecimalRangeType#getMaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Inclusive</em>'.
	 * @see org.omg.space.xtce.DecimalRangeType#getMaxInclusive()
	 * @see #getDecimalRangeType()
	 * @generated
	 */
	EAttribute getDecimalRangeType_MaxInclusive();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.DecimalRangeType#getMinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Exclusive</em>'.
	 * @see org.omg.space.xtce.DecimalRangeType#getMinExclusive()
	 * @see #getDecimalRangeType()
	 * @generated
	 */
	EAttribute getDecimalRangeType_MinExclusive();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.DecimalRangeType#getMinInclusive <em>Min Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Inclusive</em>'.
	 * @see org.omg.space.xtce.DecimalRangeType#getMinInclusive()
	 * @see #getDecimalRangeType()
	 * @generated
	 */
	EAttribute getDecimalRangeType_MinInclusive();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.DecimalValueType <em>Decimal Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Value Type</em>'.
	 * @see org.omg.space.xtce.DecimalValueType
	 * @generated
	 */
	EClass getDecimalValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.DecimalValueType#getFixedValue <em>Fixed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Value</em>'.
	 * @see org.omg.space.xtce.DecimalValueType#getFixedValue()
	 * @see #getDecimalValueType()
	 * @generated
	 */
	EAttribute getDecimalValueType_FixedValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.DecimalValueType#getDynamicValue <em>Dynamic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dynamic Value</em>'.
	 * @see org.omg.space.xtce.DecimalValueType#getDynamicValue()
	 * @see #getDecimalValueType()
	 * @generated
	 */
	EReference getDecimalValueType_DynamicValue();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.DefaultsType <em>Defaults Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defaults Type</em>'.
	 * @see org.omg.space.xtce.DefaultsType
	 * @generated
	 */
	EClass getDefaultsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.DefaultsType#getDefaultDataEncoding <em>Default Data Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Data Encoding</em>'.
	 * @see org.omg.space.xtce.DefaultsType#getDefaultDataEncoding()
	 * @see #getDefaultsType()
	 * @generated
	 */
	EReference getDefaultsType_DefaultDataEncoding();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.DefaultsType#getParameterTimeAssociation <em>Parameter Time Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Time Association</em>'.
	 * @see org.omg.space.xtce.DefaultsType#getParameterTimeAssociation()
	 * @see #getDefaultsType()
	 * @generated
	 */
	EReference getDefaultsType_ParameterTimeAssociation();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.DimensionListType <em>Dimension List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension List Type</em>'.
	 * @see org.omg.space.xtce.DimensionListType
	 * @generated
	 */
	EClass getDimensionListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.DimensionListType#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension</em>'.
	 * @see org.omg.space.xtce.DimensionListType#getDimension()
	 * @see #getDimensionListType()
	 * @generated
	 */
	EReference getDimensionListType_Dimension();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.DimensionType <em>Dimension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Type</em>'.
	 * @see org.omg.space.xtce.DimensionType
	 * @generated
	 */
	EClass getDimensionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.DimensionType#getStartingIndex <em>Starting Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Starting Index</em>'.
	 * @see org.omg.space.xtce.DimensionType#getStartingIndex()
	 * @see #getDimensionType()
	 * @generated
	 */
	EReference getDimensionType_StartingIndex();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.DimensionType#getEndingIndex <em>Ending Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ending Index</em>'.
	 * @see org.omg.space.xtce.DimensionType#getEndingIndex()
	 * @see #getDimensionType()
	 * @generated
	 */
	EReference getDimensionType_EndingIndex();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.DiscreteLookupListType <em>Discrete Lookup List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Lookup List Type</em>'.
	 * @see org.omg.space.xtce.DiscreteLookupListType
	 * @generated
	 */
	EClass getDiscreteLookupListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.DiscreteLookupListType#getDiscreteLookup <em>Discrete Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Discrete Lookup</em>'.
	 * @see org.omg.space.xtce.DiscreteLookupListType#getDiscreteLookup()
	 * @see #getDiscreteLookupListType()
	 * @generated
	 */
	EReference getDiscreteLookupListType_DiscreteLookup();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.DiscreteLookupType <em>Discrete Lookup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Lookup Type</em>'.
	 * @see org.omg.space.xtce.DiscreteLookupType
	 * @generated
	 */
	EClass getDiscreteLookupType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.DiscreteLookupType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.space.xtce.DiscreteLookupType#getValue()
	 * @see #getDiscreteLookupType()
	 * @generated
	 */
	EAttribute getDiscreteLookupType_Value();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.omg.space.xtce.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.omg.space.xtce.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.omg.space.xtce.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.omg.space.xtce.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.omg.space.xtce.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.omg.space.xtce.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.DocumentRoot#getSpaceSystem <em>Space System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Space System</em>'.
	 * @see org.omg.space.xtce.DocumentRoot#getSpaceSystem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SpaceSystem();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.DynamicValueType <em>Dynamic Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Value Type</em>'.
	 * @see org.omg.space.xtce.DynamicValueType
	 * @generated
	 */
	EClass getDynamicValueType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.DynamicValueType#getParameterInstanceRef <em>Parameter Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Instance Ref</em>'.
	 * @see org.omg.space.xtce.DynamicValueType#getParameterInstanceRef()
	 * @see #getDynamicValueType()
	 * @generated
	 */
	EReference getDynamicValueType_ParameterInstanceRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.DynamicValueType#getLinearAdjustment <em>Linear Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linear Adjustment</em>'.
	 * @see org.omg.space.xtce.DynamicValueType#getLinearAdjustment()
	 * @see #getDynamicValueType()
	 * @generated
	 */
	EReference getDynamicValueType_LinearAdjustment();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.DynamicValueType1 <em>Dynamic Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Value Type1</em>'.
	 * @see org.omg.space.xtce.DynamicValueType1
	 * @generated
	 */
	EClass getDynamicValueType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.DynamicValueType1#getParameterInstanceRef <em>Parameter Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Instance Ref</em>'.
	 * @see org.omg.space.xtce.DynamicValueType1#getParameterInstanceRef()
	 * @see #getDynamicValueType1()
	 * @generated
	 */
	EReference getDynamicValueType1_ParameterInstanceRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.DynamicValueType1#getLinearAdjustment <em>Linear Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linear Adjustment</em>'.
	 * @see org.omg.space.xtce.DynamicValueType1#getLinearAdjustment()
	 * @see #getDynamicValueType1()
	 * @generated
	 */
	EReference getDynamicValueType1_LinearAdjustment();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.EncodingType1 <em>Encoding Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encoding Type1</em>'.
	 * @see org.omg.space.xtce.EncodingType1
	 * @generated
	 */
	EClass getEncodingType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.EncodingType1#getBinaryDataEncoding <em>Binary Data Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binary Data Encoding</em>'.
	 * @see org.omg.space.xtce.EncodingType1#getBinaryDataEncoding()
	 * @see #getEncodingType1()
	 * @generated
	 */
	EReference getEncodingType1_BinaryDataEncoding();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.EncodingType1#getFloatDataEncoding <em>Float Data Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Float Data Encoding</em>'.
	 * @see org.omg.space.xtce.EncodingType1#getFloatDataEncoding()
	 * @see #getEncodingType1()
	 * @generated
	 */
	EReference getEncodingType1_FloatDataEncoding();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.EncodingType1#getIntegerDataEncoding <em>Integer Data Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Data Encoding</em>'.
	 * @see org.omg.space.xtce.EncodingType1#getIntegerDataEncoding()
	 * @see #getEncodingType1()
	 * @generated
	 */
	EReference getEncodingType1_IntegerDataEncoding();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.EncodingType1#getStringDataEncoding <em>String Data Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Data Encoding</em>'.
	 * @see org.omg.space.xtce.EncodingType1#getStringDataEncoding()
	 * @see #getEncodingType1()
	 * @generated
	 */
	EReference getEncodingType1_StringDataEncoding();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.EncodingType1#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.omg.space.xtce.EncodingType1#getOffset()
	 * @see #getEncodingType1()
	 * @generated
	 */
	EAttribute getEncodingType1_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.EncodingType1#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.omg.space.xtce.EncodingType1#getScale()
	 * @see #getEncodingType1()
	 * @generated
	 */
	EAttribute getEncodingType1_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.EncodingType1#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see org.omg.space.xtce.EncodingType1#getUnits()
	 * @see #getEncodingType1()
	 * @generated
	 */
	EAttribute getEncodingType1_Units();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.EntryListType <em>Entry List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry List Type</em>'.
	 * @see org.omg.space.xtce.EntryListType
	 * @generated
	 */
	EClass getEntryListType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.EntryListType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.space.xtce.EntryListType#getGroup()
	 * @see #getEntryListType()
	 * @generated
	 */
	EAttribute getEntryListType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.EntryListType#getParameterRefEntry <em>Parameter Ref Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Ref Entry</em>'.
	 * @see org.omg.space.xtce.EntryListType#getParameterRefEntry()
	 * @see #getEntryListType()
	 * @generated
	 */
	EReference getEntryListType_ParameterRefEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.EntryListType#getParameterSegmentRefEntry <em>Parameter Segment Ref Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Segment Ref Entry</em>'.
	 * @see org.omg.space.xtce.EntryListType#getParameterSegmentRefEntry()
	 * @see #getEntryListType()
	 * @generated
	 */
	EReference getEntryListType_ParameterSegmentRefEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.EntryListType#getContainerRefEntry <em>Container Ref Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Ref Entry</em>'.
	 * @see org.omg.space.xtce.EntryListType#getContainerRefEntry()
	 * @see #getEntryListType()
	 * @generated
	 */
	EReference getEntryListType_ContainerRefEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.EntryListType#getContainerSegmentRefEntry <em>Container Segment Ref Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Segment Ref Entry</em>'.
	 * @see org.omg.space.xtce.EntryListType#getContainerSegmentRefEntry()
	 * @see #getEntryListType()
	 * @generated
	 */
	EReference getEntryListType_ContainerSegmentRefEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.EntryListType#getStreamSegmentEntry <em>Stream Segment Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stream Segment Entry</em>'.
	 * @see org.omg.space.xtce.EntryListType#getStreamSegmentEntry()
	 * @see #getEntryListType()
	 * @generated
	 */
	EReference getEntryListType_StreamSegmentEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.EntryListType#getIndirectParameterRefEntry <em>Indirect Parameter Ref Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indirect Parameter Ref Entry</em>'.
	 * @see org.omg.space.xtce.EntryListType#getIndirectParameterRefEntry()
	 * @see #getEntryListType()
	 * @generated
	 */
	EReference getEntryListType_IndirectParameterRefEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.EntryListType#getArrayParameterRefEntry <em>Array Parameter Ref Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Parameter Ref Entry</em>'.
	 * @see org.omg.space.xtce.EntryListType#getArrayParameterRefEntry()
	 * @see #getEntryListType()
	 * @generated
	 */
	EReference getEntryListType_ArrayParameterRefEntry();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.EnumeratedDataType <em>Enumerated Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Data Type</em>'.
	 * @see org.omg.space.xtce.EnumeratedDataType
	 * @generated
	 */
	EClass getEnumeratedDataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.EnumeratedDataType#getEnumerationList <em>Enumeration List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enumeration List</em>'.
	 * @see org.omg.space.xtce.EnumeratedDataType#getEnumerationList()
	 * @see #getEnumeratedDataType()
	 * @generated
	 */
	EReference getEnumeratedDataType_EnumerationList();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.EnumeratedDataType#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.omg.space.xtce.EnumeratedDataType#getInitialValue()
	 * @see #getEnumeratedDataType()
	 * @generated
	 */
	EAttribute getEnumeratedDataType_InitialValue();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.EnumerationListType <em>Enumeration List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration List Type</em>'.
	 * @see org.omg.space.xtce.EnumerationListType
	 * @generated
	 */
	EClass getEnumerationListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.EnumerationListType#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see org.omg.space.xtce.EnumerationListType#getEnumeration()
	 * @see #getEnumerationListType()
	 * @generated
	 */
	EReference getEnumerationListType_Enumeration();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ErrorDetectCorrectType <em>Error Detect Correct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Detect Correct Type</em>'.
	 * @see org.omg.space.xtce.ErrorDetectCorrectType
	 * @generated
	 */
	EClass getErrorDetectCorrectType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ErrorDetectCorrectType#getParity <em>Parity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parity</em>'.
	 * @see org.omg.space.xtce.ErrorDetectCorrectType#getParity()
	 * @see #getErrorDetectCorrectType()
	 * @generated
	 */
	EReference getErrorDetectCorrectType_Parity();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ErrorDetectCorrectType#getCRC <em>CRC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CRC</em>'.
	 * @see org.omg.space.xtce.ErrorDetectCorrectType#getCRC()
	 * @see #getErrorDetectCorrectType()
	 * @generated
	 */
	EReference getErrorDetectCorrectType_CRC();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ExecutionVerifierType <em>Execution Verifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Verifier Type</em>'.
	 * @see org.omg.space.xtce.ExecutionVerifierType
	 * @generated
	 */
	EClass getExecutionVerifierType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ExecutionVerifierType#getPercentComplete <em>Percent Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Percent Complete</em>'.
	 * @see org.omg.space.xtce.ExecutionVerifierType#getPercentComplete()
	 * @see #getExecutionVerifierType()
	 * @generated
	 */
	EReference getExecutionVerifierType_PercentComplete();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ExternalAlgorithmSetType <em>External Algorithm Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Algorithm Set Type</em>'.
	 * @see org.omg.space.xtce.ExternalAlgorithmSetType
	 * @generated
	 */
	EClass getExternalAlgorithmSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ExternalAlgorithmSetType#getExternalAlgorithm <em>External Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Algorithm</em>'.
	 * @see org.omg.space.xtce.ExternalAlgorithmSetType#getExternalAlgorithm()
	 * @see #getExternalAlgorithmSetType()
	 * @generated
	 */
	EReference getExternalAlgorithmSetType_ExternalAlgorithm();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ExternalAlgorithmType <em>External Algorithm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Algorithm Type</em>'.
	 * @see org.omg.space.xtce.ExternalAlgorithmType
	 * @generated
	 */
	EClass getExternalAlgorithmType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ExternalAlgorithmType#getAlgorithmLocation <em>Algorithm Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm Location</em>'.
	 * @see org.omg.space.xtce.ExternalAlgorithmType#getAlgorithmLocation()
	 * @see #getExternalAlgorithmType()
	 * @generated
	 */
	EAttribute getExternalAlgorithmType_AlgorithmLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ExternalAlgorithmType#getImplementationName <em>Implementation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Name</em>'.
	 * @see org.omg.space.xtce.ExternalAlgorithmType#getImplementationName()
	 * @see #getExternalAlgorithmType()
	 * @generated
	 */
	EAttribute getExternalAlgorithmType_ImplementationName();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.FixedFrameStreamType <em>Fixed Frame Stream Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Frame Stream Type</em>'.
	 * @see org.omg.space.xtce.FixedFrameStreamType
	 * @generated
	 */
	EClass getFixedFrameStreamType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.FixedFrameStreamType#getSyncStrategy <em>Sync Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sync Strategy</em>'.
	 * @see org.omg.space.xtce.FixedFrameStreamType#getSyncStrategy()
	 * @see #getFixedFrameStreamType()
	 * @generated
	 */
	EReference getFixedFrameStreamType_SyncStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.FixedFrameStreamType#getFrameLengthInBits <em>Frame Length In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame Length In Bits</em>'.
	 * @see org.omg.space.xtce.FixedFrameStreamType#getFrameLengthInBits()
	 * @see #getFixedFrameStreamType()
	 * @generated
	 */
	EAttribute getFixedFrameStreamType_FrameLengthInBits();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.FixedFrameStreamType#getSyncApertureInBits <em>Sync Aperture In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Aperture In Bits</em>'.
	 * @see org.omg.space.xtce.FixedFrameStreamType#getSyncApertureInBits()
	 * @see #getFixedFrameStreamType()
	 * @generated
	 */
	EAttribute getFixedFrameStreamType_SyncApertureInBits();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.FixedFrameSyncStrategyType <em>Fixed Frame Sync Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Frame Sync Strategy Type</em>'.
	 * @see org.omg.space.xtce.FixedFrameSyncStrategyType
	 * @generated
	 */
	EClass getFixedFrameSyncStrategyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.FixedFrameSyncStrategyType#getSyncPattern <em>Sync Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sync Pattern</em>'.
	 * @see org.omg.space.xtce.FixedFrameSyncStrategyType#getSyncPattern()
	 * @see #getFixedFrameSyncStrategyType()
	 * @generated
	 */
	EReference getFixedFrameSyncStrategyType_SyncPattern();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.FixedValueEntryType <em>Fixed Value Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Value Entry Type</em>'.
	 * @see org.omg.space.xtce.FixedValueEntryType
	 * @generated
	 */
	EClass getFixedValueEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.FixedValueEntryType#getBinaryValue <em>Binary Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Value</em>'.
	 * @see org.omg.space.xtce.FixedValueEntryType#getBinaryValue()
	 * @see #getFixedValueEntryType()
	 * @generated
	 */
	EAttribute getFixedValueEntryType_BinaryValue();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.FixedValueEntryType#getSizeInBits <em>Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size In Bits</em>'.
	 * @see org.omg.space.xtce.FixedValueEntryType#getSizeInBits()
	 * @see #getFixedValueEntryType()
	 * @generated
	 */
	EAttribute getFixedValueEntryType_SizeInBits();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.FlagType <em>Flag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flag Type</em>'.
	 * @see org.omg.space.xtce.FlagType
	 * @generated
	 */
	EClass getFlagType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.FlagType#getFlagBitType <em>Flag Bit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flag Bit Type</em>'.
	 * @see org.omg.space.xtce.FlagType#getFlagBitType()
	 * @see #getFlagType()
	 * @generated
	 */
	EAttribute getFlagType_FlagBitType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.FlagType#getFlagSizeInBits <em>Flag Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flag Size In Bits</em>'.
	 * @see org.omg.space.xtce.FlagType#getFlagSizeInBits()
	 * @see #getFlagType()
	 * @generated
	 */
	EAttribute getFlagType_FlagSizeInBits();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.FloatArgumentTypeType <em>Float Argument Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Argument Type Type</em>'.
	 * @see org.omg.space.xtce.FloatArgumentTypeType
	 * @generated
	 */
	EClass getFloatArgumentTypeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.FloatArgumentTypeType#getDefaultAlarm <em>Default Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Alarm</em>'.
	 * @see org.omg.space.xtce.FloatArgumentTypeType#getDefaultAlarm()
	 * @see #getFloatArgumentTypeType()
	 * @generated
	 */
	EReference getFloatArgumentTypeType_DefaultAlarm();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.FloatArgumentTypeType#getContextAlarmList <em>Context Alarm List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Alarm List</em>'.
	 * @see org.omg.space.xtce.FloatArgumentTypeType#getContextAlarmList()
	 * @see #getFloatArgumentTypeType()
	 * @generated
	 */
	EReference getFloatArgumentTypeType_ContextAlarmList();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.FloatDataEncodingType <em>Float Data Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Data Encoding Type</em>'.
	 * @see org.omg.space.xtce.FloatDataEncodingType
	 * @generated
	 */
	EClass getFloatDataEncodingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.FloatDataEncodingType#getDefaultCalibrator <em>Default Calibrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Calibrator</em>'.
	 * @see org.omg.space.xtce.FloatDataEncodingType#getDefaultCalibrator()
	 * @see #getFloatDataEncodingType()
	 * @generated
	 */
	EReference getFloatDataEncodingType_DefaultCalibrator();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.FloatDataEncodingType#getContextCalibratorList <em>Context Calibrator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Calibrator List</em>'.
	 * @see org.omg.space.xtce.FloatDataEncodingType#getContextCalibratorList()
	 * @see #getFloatDataEncodingType()
	 * @generated
	 */
	EReference getFloatDataEncodingType_ContextCalibratorList();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.FloatDataEncodingType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.omg.space.xtce.FloatDataEncodingType#getEncoding()
	 * @see #getFloatDataEncodingType()
	 * @generated
	 */
	EAttribute getFloatDataEncodingType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.FloatDataEncodingType#getSizeInBits <em>Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size In Bits</em>'.
	 * @see org.omg.space.xtce.FloatDataEncodingType#getSizeInBits()
	 * @see #getFloatDataEncodingType()
	 * @generated
	 */
	EAttribute getFloatDataEncodingType_SizeInBits();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.FloatDataType <em>Float Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Data Type</em>'.
	 * @see org.omg.space.xtce.FloatDataType
	 * @generated
	 */
	EClass getFloatDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.FloatDataType#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.omg.space.xtce.FloatDataType#getInitialValue()
	 * @see #getFloatDataType()
	 * @generated
	 */
	EAttribute getFloatDataType_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.FloatDataType#getSizeInBits <em>Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size In Bits</em>'.
	 * @see org.omg.space.xtce.FloatDataType#getSizeInBits()
	 * @see #getFloatDataType()
	 * @generated
	 */
	EAttribute getFloatDataType_SizeInBits();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.FloatParameterTypeType <em>Float Parameter Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Parameter Type Type</em>'.
	 * @see org.omg.space.xtce.FloatParameterTypeType
	 * @generated
	 */
	EClass getFloatParameterTypeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.FloatParameterTypeType#getDefaultAlarm <em>Default Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Alarm</em>'.
	 * @see org.omg.space.xtce.FloatParameterTypeType#getDefaultAlarm()
	 * @see #getFloatParameterTypeType()
	 * @generated
	 */
	EReference getFloatParameterTypeType_DefaultAlarm();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.FloatParameterTypeType#getContextAlarmList <em>Context Alarm List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Alarm List</em>'.
	 * @see org.omg.space.xtce.FloatParameterTypeType#getContextAlarmList()
	 * @see #getFloatParameterTypeType()
	 * @generated
	 */
	EReference getFloatParameterTypeType_ContextAlarmList();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.FrameStreamType <em>Frame Stream Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame Stream Type</em>'.
	 * @see org.omg.space.xtce.FrameStreamType
	 * @generated
	 */
	EClass getFrameStreamType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.FrameStreamType#getContainerRef <em>Container Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container Ref</em>'.
	 * @see org.omg.space.xtce.FrameStreamType#getContainerRef()
	 * @see #getFrameStreamType()
	 * @generated
	 */
	EReference getFrameStreamType_ContainerRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.FrameStreamType#getServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Ref</em>'.
	 * @see org.omg.space.xtce.FrameStreamType#getServiceRef()
	 * @see #getFrameStreamType()
	 * @generated
	 */
	EReference getFrameStreamType_ServiceRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.FrameStreamType#getStreamRef <em>Stream Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stream Ref</em>'.
	 * @see org.omg.space.xtce.FrameStreamType#getStreamRef()
	 * @see #getFrameStreamType()
	 * @generated
	 */
	EReference getFrameStreamType_StreamRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.HeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Type</em>'.
	 * @see org.omg.space.xtce.HeaderType
	 * @generated
	 */
	EClass getHeaderType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.HeaderType#getAuthorSet <em>Author Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author Set</em>'.
	 * @see org.omg.space.xtce.HeaderType#getAuthorSet()
	 * @see #getHeaderType()
	 * @generated
	 */
	EReference getHeaderType_AuthorSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.HeaderType#getNoteSet <em>Note Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Note Set</em>'.
	 * @see org.omg.space.xtce.HeaderType#getNoteSet()
	 * @see #getHeaderType()
	 * @generated
	 */
	EReference getHeaderType_NoteSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.HeaderType#getHistorySet <em>History Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>History Set</em>'.
	 * @see org.omg.space.xtce.HeaderType#getHistorySet()
	 * @see #getHeaderType()
	 * @generated
	 */
	EReference getHeaderType_HistorySet();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.HeaderType#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see org.omg.space.xtce.HeaderType#getClassification()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Classification();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.HeaderType#getClassificationInstructions <em>Classification Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification Instructions</em>'.
	 * @see org.omg.space.xtce.HeaderType#getClassificationInstructions()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_ClassificationInstructions();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.HeaderType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.omg.space.xtce.HeaderType#getDate()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.HeaderType#getValidationStatus <em>Validation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Status</em>'.
	 * @see org.omg.space.xtce.HeaderType#getValidationStatus()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_ValidationStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.HeaderType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.omg.space.xtce.HeaderType#getVersion()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Version();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.HistorySetType <em>History Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Set Type</em>'.
	 * @see org.omg.space.xtce.HistorySetType
	 * @generated
	 */
	EClass getHistorySetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.HistorySetType#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>History</em>'.
	 * @see org.omg.space.xtce.HistorySetType#getHistory()
	 * @see #getHistorySetType()
	 * @generated
	 */
	EAttribute getHistorySetType_History();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.IndirectParameterRefEntryType <em>Indirect Parameter Ref Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indirect Parameter Ref Entry Type</em>'.
	 * @see org.omg.space.xtce.IndirectParameterRefEntryType
	 * @generated
	 */
	EClass getIndirectParameterRefEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.IndirectParameterRefEntryType#getParameterInstance <em>Parameter Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Instance</em>'.
	 * @see org.omg.space.xtce.IndirectParameterRefEntryType#getParameterInstance()
	 * @see #getIndirectParameterRefEntryType()
	 * @generated
	 */
	EReference getIndirectParameterRefEntryType_ParameterInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.IndirectParameterRefEntryType#getAliasNameSpace <em>Alias Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias Name Space</em>'.
	 * @see org.omg.space.xtce.IndirectParameterRefEntryType#getAliasNameSpace()
	 * @see #getIndirectParameterRefEntryType()
	 * @generated
	 */
	EAttribute getIndirectParameterRefEntryType_AliasNameSpace();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.InputAlgorithmType <em>Input Algorithm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Algorithm Type</em>'.
	 * @see org.omg.space.xtce.InputAlgorithmType
	 * @generated
	 */
	EClass getInputAlgorithmType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.InputAlgorithmType#getInputSet <em>Input Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Set</em>'.
	 * @see org.omg.space.xtce.InputAlgorithmType#getInputSet()
	 * @see #getInputAlgorithmType()
	 * @generated
	 */
	EReference getInputAlgorithmType_InputSet();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.InputOutputAlgorithmType <em>Input Output Algorithm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Output Algorithm Type</em>'.
	 * @see org.omg.space.xtce.InputOutputAlgorithmType
	 * @generated
	 */
	EClass getInputOutputAlgorithmType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.InputOutputAlgorithmType#getOutputSet <em>Output Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Set</em>'.
	 * @see org.omg.space.xtce.InputOutputAlgorithmType#getOutputSet()
	 * @see #getInputOutputAlgorithmType()
	 * @generated
	 */
	EReference getInputOutputAlgorithmType_OutputSet();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.InputOutputAlgorithmType#isThread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread</em>'.
	 * @see org.omg.space.xtce.InputOutputAlgorithmType#isThread()
	 * @see #getInputOutputAlgorithmType()
	 * @generated
	 */
	EAttribute getInputOutputAlgorithmType_Thread();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.InputOutputTriggerAlgorithmType <em>Input Output Trigger Algorithm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Output Trigger Algorithm Type</em>'.
	 * @see org.omg.space.xtce.InputOutputTriggerAlgorithmType
	 * @generated
	 */
	EClass getInputOutputTriggerAlgorithmType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.InputOutputTriggerAlgorithmType#getTriggerSet <em>Trigger Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger Set</em>'.
	 * @see org.omg.space.xtce.InputOutputTriggerAlgorithmType#getTriggerSet()
	 * @see #getInputOutputTriggerAlgorithmType()
	 * @generated
	 */
	EReference getInputOutputTriggerAlgorithmType_TriggerSet();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.InputOutputTriggerAlgorithmType#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.omg.space.xtce.InputOutputTriggerAlgorithmType#getPriority()
	 * @see #getInputOutputTriggerAlgorithmType()
	 * @generated
	 */
	EAttribute getInputOutputTriggerAlgorithmType_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.InputOutputTriggerAlgorithmType#getTriggerContainer <em>Trigger Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Container</em>'.
	 * @see org.omg.space.xtce.InputOutputTriggerAlgorithmType#getTriggerContainer()
	 * @see #getInputOutputTriggerAlgorithmType()
	 * @generated
	 */
	EAttribute getInputOutputTriggerAlgorithmType_TriggerContainer();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.InputSetType <em>Input Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Set Type</em>'.
	 * @see org.omg.space.xtce.InputSetType
	 * @generated
	 */
	EClass getInputSetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.InputSetType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.space.xtce.InputSetType#getGroup()
	 * @see #getInputSetType()
	 * @generated
	 */
	EAttribute getInputSetType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.InputSetType#getParameterInstanceRef <em>Parameter Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Instance Ref</em>'.
	 * @see org.omg.space.xtce.InputSetType#getParameterInstanceRef()
	 * @see #getInputSetType()
	 * @generated
	 */
	EReference getInputSetType_ParameterInstanceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.InputSetType#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constant</em>'.
	 * @see org.omg.space.xtce.InputSetType#getConstant()
	 * @see #getInputSetType()
	 * @generated
	 */
	EReference getInputSetType_Constant();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.IntegerArgumentTypeType <em>Integer Argument Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Argument Type Type</em>'.
	 * @see org.omg.space.xtce.IntegerArgumentTypeType
	 * @generated
	 */
	EClass getIntegerArgumentTypeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.IntegerArgumentTypeType#getDefaultAlarm <em>Default Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Alarm</em>'.
	 * @see org.omg.space.xtce.IntegerArgumentTypeType#getDefaultAlarm()
	 * @see #getIntegerArgumentTypeType()
	 * @generated
	 */
	EReference getIntegerArgumentTypeType_DefaultAlarm();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.IntegerArgumentTypeType#getContextAlarmList <em>Context Alarm List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Alarm List</em>'.
	 * @see org.omg.space.xtce.IntegerArgumentTypeType#getContextAlarmList()
	 * @see #getIntegerArgumentTypeType()
	 * @generated
	 */
	EReference getIntegerArgumentTypeType_ContextAlarmList();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.IntegerDataEncodingType <em>Integer Data Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Data Encoding Type</em>'.
	 * @see org.omg.space.xtce.IntegerDataEncodingType
	 * @generated
	 */
	EClass getIntegerDataEncodingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.IntegerDataEncodingType#getDefaultCalibrator <em>Default Calibrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Calibrator</em>'.
	 * @see org.omg.space.xtce.IntegerDataEncodingType#getDefaultCalibrator()
	 * @see #getIntegerDataEncodingType()
	 * @generated
	 */
	EReference getIntegerDataEncodingType_DefaultCalibrator();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.IntegerDataEncodingType#getContextCalibratorList <em>Context Calibrator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Calibrator List</em>'.
	 * @see org.omg.space.xtce.IntegerDataEncodingType#getContextCalibratorList()
	 * @see #getIntegerDataEncodingType()
	 * @generated
	 */
	EReference getIntegerDataEncodingType_ContextCalibratorList();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.IntegerDataEncodingType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.omg.space.xtce.IntegerDataEncodingType#getEncoding()
	 * @see #getIntegerDataEncodingType()
	 * @generated
	 */
	EAttribute getIntegerDataEncodingType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.IntegerDataEncodingType#getSizeInBits <em>Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size In Bits</em>'.
	 * @see org.omg.space.xtce.IntegerDataEncodingType#getSizeInBits()
	 * @see #getIntegerDataEncodingType()
	 * @generated
	 */
	EAttribute getIntegerDataEncodingType_SizeInBits();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.IntegerDataType <em>Integer Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Data Type</em>'.
	 * @see org.omg.space.xtce.IntegerDataType
	 * @generated
	 */
	EClass getIntegerDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.IntegerDataType#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.omg.space.xtce.IntegerDataType#getInitialValue()
	 * @see #getIntegerDataType()
	 * @generated
	 */
	EAttribute getIntegerDataType_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.IntegerDataType#isSigned <em>Signed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signed</em>'.
	 * @see org.omg.space.xtce.IntegerDataType#isSigned()
	 * @see #getIntegerDataType()
	 * @generated
	 */
	EAttribute getIntegerDataType_Signed();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.IntegerDataType#getSizeInBits <em>Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size In Bits</em>'.
	 * @see org.omg.space.xtce.IntegerDataType#getSizeInBits()
	 * @see #getIntegerDataType()
	 * @generated
	 */
	EAttribute getIntegerDataType_SizeInBits();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.IntegerParameterTypeType <em>Integer Parameter Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Parameter Type Type</em>'.
	 * @see org.omg.space.xtce.IntegerParameterTypeType
	 * @generated
	 */
	EClass getIntegerParameterTypeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.IntegerParameterTypeType#getDefaultAlarm <em>Default Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Alarm</em>'.
	 * @see org.omg.space.xtce.IntegerParameterTypeType#getDefaultAlarm()
	 * @see #getIntegerParameterTypeType()
	 * @generated
	 */
	EReference getIntegerParameterTypeType_DefaultAlarm();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.IntegerParameterTypeType#getContextAlarmList <em>Context Alarm List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Alarm List</em>'.
	 * @see org.omg.space.xtce.IntegerParameterTypeType#getContextAlarmList()
	 * @see #getIntegerParameterTypeType()
	 * @generated
	 */
	EReference getIntegerParameterTypeType_ContextAlarmList();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.IntegerRangeType <em>Integer Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Range Type</em>'.
	 * @see org.omg.space.xtce.IntegerRangeType
	 * @generated
	 */
	EClass getIntegerRangeType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.IntegerRangeType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.omg.space.xtce.IntegerRangeType#getMax()
	 * @see #getIntegerRangeType()
	 * @generated
	 */
	EAttribute getIntegerRangeType_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.IntegerRangeType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.omg.space.xtce.IntegerRangeType#getMin()
	 * @see #getIntegerRangeType()
	 * @generated
	 */
	EAttribute getIntegerRangeType_Min();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.IntegerValueType <em>Integer Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value Type</em>'.
	 * @see org.omg.space.xtce.IntegerValueType
	 * @generated
	 */
	EClass getIntegerValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.IntegerValueType#getFixedValue <em>Fixed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Value</em>'.
	 * @see org.omg.space.xtce.IntegerValueType#getFixedValue()
	 * @see #getIntegerValueType()
	 * @generated
	 */
	EAttribute getIntegerValueType_FixedValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.IntegerValueType#getDynamicValue <em>Dynamic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dynamic Value</em>'.
	 * @see org.omg.space.xtce.IntegerValueType#getDynamicValue()
	 * @see #getIntegerValueType()
	 * @generated
	 */
	EReference getIntegerValueType_DynamicValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.IntegerValueType#getDiscreteLookupList <em>Discrete Lookup List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discrete Lookup List</em>'.
	 * @see org.omg.space.xtce.IntegerValueType#getDiscreteLookupList()
	 * @see #getIntegerValueType()
	 * @generated
	 */
	EReference getIntegerValueType_DiscreteLookupList();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.InterlockType <em>Interlock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interlock Type</em>'.
	 * @see org.omg.space.xtce.InterlockType
	 * @generated
	 */
	EClass getInterlockType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.InterlockType#getScopeToSpaceSystem <em>Scope To Space System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope To Space System</em>'.
	 * @see org.omg.space.xtce.InterlockType#getScopeToSpaceSystem()
	 * @see #getInterlockType()
	 * @generated
	 */
	EAttribute getInterlockType_ScopeToSpaceSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.InterlockType#isSuspendable <em>Suspendable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspendable</em>'.
	 * @see org.omg.space.xtce.InterlockType#isSuspendable()
	 * @see #getInterlockType()
	 * @generated
	 */
	EAttribute getInterlockType_Suspendable();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.InterlockType#getVerificationProgressPercentage <em>Verification Progress Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verification Progress Percentage</em>'.
	 * @see org.omg.space.xtce.InterlockType#getVerificationProgressPercentage()
	 * @see #getInterlockType()
	 * @generated
	 */
	EAttribute getInterlockType_VerificationProgressPercentage();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.InterlockType#getVerificationToWaitFor <em>Verification To Wait For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verification To Wait For</em>'.
	 * @see org.omg.space.xtce.InterlockType#getVerificationToWaitFor()
	 * @see #getInterlockType()
	 * @generated
	 */
	EAttribute getInterlockType_VerificationToWaitFor();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.LeadingSizeType <em>Leading Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leading Size Type</em>'.
	 * @see org.omg.space.xtce.LeadingSizeType
	 * @generated
	 */
	EClass getLeadingSizeType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.LeadingSizeType#getSizeInBitsOfSizeTag <em>Size In Bits Of Size Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size In Bits Of Size Tag</em>'.
	 * @see org.omg.space.xtce.LeadingSizeType#getSizeInBitsOfSizeTag()
	 * @see #getLeadingSizeType()
	 * @generated
	 */
	EAttribute getLeadingSizeType_SizeInBitsOfSizeTag();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.LinearAdjustmentType <em>Linear Adjustment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Adjustment Type</em>'.
	 * @see org.omg.space.xtce.LinearAdjustmentType
	 * @generated
	 */
	EClass getLinearAdjustmentType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.LinearAdjustmentType#getIntercept <em>Intercept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intercept</em>'.
	 * @see org.omg.space.xtce.LinearAdjustmentType#getIntercept()
	 * @see #getLinearAdjustmentType()
	 * @generated
	 */
	EAttribute getLinearAdjustmentType_Intercept();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.LinearAdjustmentType#getSlope <em>Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope</em>'.
	 * @see org.omg.space.xtce.LinearAdjustmentType#getSlope()
	 * @see #getLinearAdjustmentType()
	 * @generated
	 */
	EAttribute getLinearAdjustmentType_Slope();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.LinearAdjustmentType1 <em>Linear Adjustment Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Adjustment Type1</em>'.
	 * @see org.omg.space.xtce.LinearAdjustmentType1
	 * @generated
	 */
	EClass getLinearAdjustmentType1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.LinearAdjustmentType1#getIntercept <em>Intercept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intercept</em>'.
	 * @see org.omg.space.xtce.LinearAdjustmentType1#getIntercept()
	 * @see #getLinearAdjustmentType1()
	 * @generated
	 */
	EAttribute getLinearAdjustmentType1_Intercept();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.LinearAdjustmentType1#getSlope <em>Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope</em>'.
	 * @see org.omg.space.xtce.LinearAdjustmentType1#getSlope()
	 * @see #getLinearAdjustmentType1()
	 * @generated
	 */
	EAttribute getLinearAdjustmentType1_Slope();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.LocationInContainerInBitsType <em>Location In Container In Bits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location In Container In Bits Type</em>'.
	 * @see org.omg.space.xtce.LocationInContainerInBitsType
	 * @generated
	 */
	EClass getLocationInContainerInBitsType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.LocationInContainerInBitsType#getReferenceLocation <em>Reference Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Location</em>'.
	 * @see org.omg.space.xtce.LocationInContainerInBitsType#getReferenceLocation()
	 * @see #getLocationInContainerInBitsType()
	 * @generated
	 */
	EAttribute getLocationInContainerInBitsType_ReferenceLocation();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.MatchCriteriaType <em>Match Criteria Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Criteria Type</em>'.
	 * @see org.omg.space.xtce.MatchCriteriaType
	 * @generated
	 */
	EClass getMatchCriteriaType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MatchCriteriaType#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparison</em>'.
	 * @see org.omg.space.xtce.MatchCriteriaType#getComparison()
	 * @see #getMatchCriteriaType()
	 * @generated
	 */
	EReference getMatchCriteriaType_Comparison();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MatchCriteriaType#getComparisonList <em>Comparison List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparison List</em>'.
	 * @see org.omg.space.xtce.MatchCriteriaType#getComparisonList()
	 * @see #getMatchCriteriaType()
	 * @generated
	 */
	EReference getMatchCriteriaType_ComparisonList();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MatchCriteriaType#getBooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Expression</em>'.
	 * @see org.omg.space.xtce.MatchCriteriaType#getBooleanExpression()
	 * @see #getMatchCriteriaType()
	 * @generated
	 */
	EReference getMatchCriteriaType_BooleanExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MatchCriteriaType#getCustomAlgorithm <em>Custom Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Algorithm</em>'.
	 * @see org.omg.space.xtce.MatchCriteriaType#getCustomAlgorithm()
	 * @see #getMatchCriteriaType()
	 * @generated
	 */
	EReference getMatchCriteriaType_CustomAlgorithm();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.MathAlgorithmType <em>Math Algorithm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Algorithm Type</em>'.
	 * @see org.omg.space.xtce.MathAlgorithmType
	 * @generated
	 */
	EClass getMathAlgorithmType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MathAlgorithmType#getMathOperation <em>Math Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Math Operation</em>'.
	 * @see org.omg.space.xtce.MathAlgorithmType#getMathOperation()
	 * @see #getMathAlgorithmType()
	 * @generated
	 */
	EReference getMathAlgorithmType_MathOperation();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.MathOperationType <em>Math Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Operation Type</em>'.
	 * @see org.omg.space.xtce.MathOperationType
	 * @generated
	 */
	EClass getMathOperationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MathOperationType#getParameterInstanceRef <em>Parameter Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Instance Ref</em>'.
	 * @see org.omg.space.xtce.MathOperationType#getParameterInstanceRef()
	 * @see #getMathOperationType()
	 * @generated
	 */
	EReference getMathOperationType_ParameterInstanceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.MathOperationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.space.xtce.MathOperationType#getValue()
	 * @see #getMathOperationType()
	 * @generated
	 */
	EAttribute getMathOperationType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.MathOperationType#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.omg.space.xtce.MathOperationType#getOperator()
	 * @see #getMathOperationType()
	 * @generated
	 */
	EAttribute getMathOperationType_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MathOperationType#getParameterInstanceRef1 <em>Parameter Instance Ref1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Instance Ref1</em>'.
	 * @see org.omg.space.xtce.MathOperationType#getParameterInstanceRef1()
	 * @see #getMathOperationType()
	 * @generated
	 */
	EReference getMathOperationType_ParameterInstanceRef1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.MathOperationType#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see org.omg.space.xtce.MathOperationType#getValue1()
	 * @see #getMathOperationType()
	 * @generated
	 */
	EAttribute getMathOperationType_Value1();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.MathOperationType1 <em>Math Operation Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Operation Type1</em>'.
	 * @see org.omg.space.xtce.MathOperationType1
	 * @generated
	 */
	EClass getMathOperationType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MathOperationType1#getTriggerSet <em>Trigger Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger Set</em>'.
	 * @see org.omg.space.xtce.MathOperationType1#getTriggerSet()
	 * @see #getMathOperationType1()
	 * @generated
	 */
	EReference getMathOperationType1_TriggerSet();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.MathOperationType1#getOutputParameterRef <em>Output Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Parameter Ref</em>'.
	 * @see org.omg.space.xtce.MathOperationType1#getOutputParameterRef()
	 * @see #getMathOperationType1()
	 * @generated
	 */
	EAttribute getMathOperationType1_OutputParameterRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.MessageRefSetType <em>Message Ref Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Ref Set Type</em>'.
	 * @see org.omg.space.xtce.MessageRefSetType
	 * @generated
	 */
	EClass getMessageRefSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.MessageRefSetType#getMessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Ref</em>'.
	 * @see org.omg.space.xtce.MessageRefSetType#getMessageRef()
	 * @see #getMessageRefSetType()
	 * @generated
	 */
	EReference getMessageRefSetType_MessageRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.MessageRefType <em>Message Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Ref Type</em>'.
	 * @see org.omg.space.xtce.MessageRefType
	 * @generated
	 */
	EClass getMessageRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.MessageRefType#getMessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Ref</em>'.
	 * @see org.omg.space.xtce.MessageRefType#getMessageRef()
	 * @see #getMessageRefType()
	 * @generated
	 */
	EAttribute getMessageRefType_MessageRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.MessageSetType <em>Message Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Set Type</em>'.
	 * @see org.omg.space.xtce.MessageSetType
	 * @generated
	 */
	EClass getMessageSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.MessageSetType#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message</em>'.
	 * @see org.omg.space.xtce.MessageSetType#getMessage()
	 * @see #getMessageSetType()
	 * @generated
	 */
	EReference getMessageSetType_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.MessageSetType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.space.xtce.MessageSetType#getName()
	 * @see #getMessageSetType()
	 * @generated
	 */
	EAttribute getMessageSetType_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Type</em>'.
	 * @see org.omg.space.xtce.MessageType
	 * @generated
	 */
	EClass getMessageType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MessageType#getMatchCriteria <em>Match Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Match Criteria</em>'.
	 * @see org.omg.space.xtce.MessageType#getMatchCriteria()
	 * @see #getMessageType()
	 * @generated
	 */
	EReference getMessageType_MatchCriteria();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MessageType#getContainRef <em>Contain Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contain Ref</em>'.
	 * @see org.omg.space.xtce.MessageType#getContainRef()
	 * @see #getMessageType()
	 * @generated
	 */
	EReference getMessageType_ContainRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.MetaCommandSetType <em>Meta Command Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Command Set Type</em>'.
	 * @see org.omg.space.xtce.MetaCommandSetType
	 * @generated
	 */
	EClass getMetaCommandSetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.MetaCommandSetType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.space.xtce.MetaCommandSetType#getGroup()
	 * @see #getMetaCommandSetType()
	 * @generated
	 */
	EAttribute getMetaCommandSetType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.MetaCommandSetType#getMetaCommand <em>Meta Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Command</em>'.
	 * @see org.omg.space.xtce.MetaCommandSetType#getMetaCommand()
	 * @see #getMetaCommandSetType()
	 * @generated
	 */
	EReference getMetaCommandSetType_MetaCommand();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.MetaCommandSetType#getMetaCommandRef <em>Meta Command Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Meta Command Ref</em>'.
	 * @see org.omg.space.xtce.MetaCommandSetType#getMetaCommandRef()
	 * @see #getMetaCommandSetType()
	 * @generated
	 */
	EAttribute getMetaCommandSetType_MetaCommandRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.MetaCommandSetType#getBlockMetaCommand <em>Block Meta Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block Meta Command</em>'.
	 * @see org.omg.space.xtce.MetaCommandSetType#getBlockMetaCommand()
	 * @see #getMetaCommandSetType()
	 * @generated
	 */
	EReference getMetaCommandSetType_BlockMetaCommand();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.MetaCommandStepListType <em>Meta Command Step List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Command Step List Type</em>'.
	 * @see org.omg.space.xtce.MetaCommandStepListType
	 * @generated
	 */
	EClass getMetaCommandStepListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.MetaCommandStepListType#getMetaCommandStep <em>Meta Command Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Command Step</em>'.
	 * @see org.omg.space.xtce.MetaCommandStepListType#getMetaCommandStep()
	 * @see #getMetaCommandStepListType()
	 * @generated
	 */
	EReference getMetaCommandStepListType_MetaCommandStep();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.MetaCommandStepType <em>Meta Command Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Command Step Type</em>'.
	 * @see org.omg.space.xtce.MetaCommandStepType
	 * @generated
	 */
	EClass getMetaCommandStepType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MetaCommandStepType#getArgumentList <em>Argument List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument List</em>'.
	 * @see org.omg.space.xtce.MetaCommandStepType#getArgumentList()
	 * @see #getMetaCommandStepType()
	 * @generated
	 */
	EReference getMetaCommandStepType_ArgumentList();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.MetaCommandStepType#getMetaCommandRef <em>Meta Command Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Command Ref</em>'.
	 * @see org.omg.space.xtce.MetaCommandStepType#getMetaCommandRef()
	 * @see #getMetaCommandStepType()
	 * @generated
	 */
	EAttribute getMetaCommandStepType_MetaCommandRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.MetaCommandType <em>Meta Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Command Type</em>'.
	 * @see org.omg.space.xtce.MetaCommandType
	 * @generated
	 */
	EClass getMetaCommandType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MetaCommandType#getBaseMetaCommand <em>Base Meta Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Meta Command</em>'.
	 * @see org.omg.space.xtce.MetaCommandType#getBaseMetaCommand()
	 * @see #getMetaCommandType()
	 * @generated
	 */
	EReference getMetaCommandType_BaseMetaCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.MetaCommandType#getSystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Name</em>'.
	 * @see org.omg.space.xtce.MetaCommandType#getSystemName()
	 * @see #getMetaCommandType()
	 * @generated
	 */
	EAttribute getMetaCommandType_SystemName();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MetaCommandType#getArgumentList <em>Argument List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument List</em>'.
	 * @see org.omg.space.xtce.MetaCommandType#getArgumentList()
	 * @see #getMetaCommandType()
	 * @generated
	 */
	EReference getMetaCommandType_ArgumentList();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MetaCommandType#getCommandContainer <em>Command Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command Container</em>'.
	 * @see org.omg.space.xtce.MetaCommandType#getCommandContainer()
	 * @see #getMetaCommandType()
	 * @generated
	 */
	EReference getMetaCommandType_CommandContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MetaCommandType#getTransmissionConstraintList <em>Transmission Constraint List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transmission Constraint List</em>'.
	 * @see org.omg.space.xtce.MetaCommandType#getTransmissionConstraintList()
	 * @see #getMetaCommandType()
	 * @generated
	 */
	EReference getMetaCommandType_TransmissionConstraintList();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MetaCommandType#getDefaultSignificance <em>Default Significance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Significance</em>'.
	 * @see org.omg.space.xtce.MetaCommandType#getDefaultSignificance()
	 * @see #getMetaCommandType()
	 * @generated
	 */
	EReference getMetaCommandType_DefaultSignificance();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MetaCommandType#getContextSignificanceList <em>Context Significance List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Significance List</em>'.
	 * @see org.omg.space.xtce.MetaCommandType#getContextSignificanceList()
	 * @see #getMetaCommandType()
	 * @generated
	 */
	EReference getMetaCommandType_ContextSignificanceList();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MetaCommandType#getInterlock <em>Interlock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interlock</em>'.
	 * @see org.omg.space.xtce.MetaCommandType#getInterlock()
	 * @see #getMetaCommandType()
	 * @generated
	 */
	EReference getMetaCommandType_Interlock();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MetaCommandType#getVerifiers <em>Verifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verifiers</em>'.
	 * @see org.omg.space.xtce.MetaCommandType#getVerifiers()
	 * @see #getMetaCommandType()
	 * @generated
	 */
	EReference getMetaCommandType_Verifiers();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.MetaCommandType#getParameterToSetList <em>Parameter To Set List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter To Set List</em>'.
	 * @see org.omg.space.xtce.MetaCommandType#getParameterToSetList()
	 * @see #getMetaCommandType()
	 * @generated
	 */
	EReference getMetaCommandType_ParameterToSetList();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.MetaCommandType#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.omg.space.xtce.MetaCommandType#isAbstract()
	 * @see #getMetaCommandType()
	 * @generated
	 */
	EAttribute getMetaCommandType_Abstract();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.NameDescriptionType <em>Name Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Description Type</em>'.
	 * @see org.omg.space.xtce.NameDescriptionType
	 * @generated
	 */
	EClass getNameDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.NameDescriptionType#getLongDescription <em>Long Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Description</em>'.
	 * @see org.omg.space.xtce.NameDescriptionType#getLongDescription()
	 * @see #getNameDescriptionType()
	 * @generated
	 */
	EAttribute getNameDescriptionType_LongDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.NameDescriptionType#getAliasSet <em>Alias Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias Set</em>'.
	 * @see org.omg.space.xtce.NameDescriptionType#getAliasSet()
	 * @see #getNameDescriptionType()
	 * @generated
	 */
	EReference getNameDescriptionType_AliasSet();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.NameDescriptionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.space.xtce.NameDescriptionType#getName()
	 * @see #getNameDescriptionType()
	 * @generated
	 */
	EAttribute getNameDescriptionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.NameDescriptionType#getShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Description</em>'.
	 * @see org.omg.space.xtce.NameDescriptionType#getShortDescription()
	 * @see #getNameDescriptionType()
	 * @generated
	 */
	EAttribute getNameDescriptionType_ShortDescription();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.NoteSetType <em>Note Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note Set Type</em>'.
	 * @see org.omg.space.xtce.NoteSetType
	 * @generated
	 */
	EClass getNoteSetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.NoteSetType#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Note</em>'.
	 * @see org.omg.space.xtce.NoteSetType#getNote()
	 * @see #getNoteSetType()
	 * @generated
	 */
	EAttribute getNoteSetType_Note();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.NumberFormatType <em>Number Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Format Type</em>'.
	 * @see org.omg.space.xtce.NumberFormatType
	 * @generated
	 */
	EClass getNumberFormatType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.NumberFormatType#getMaximumFractionDigits <em>Maximum Fraction Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Fraction Digits</em>'.
	 * @see org.omg.space.xtce.NumberFormatType#getMaximumFractionDigits()
	 * @see #getNumberFormatType()
	 * @generated
	 */
	EAttribute getNumberFormatType_MaximumFractionDigits();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.NumberFormatType#getMaximumIntegerDigits <em>Maximum Integer Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Integer Digits</em>'.
	 * @see org.omg.space.xtce.NumberFormatType#getMaximumIntegerDigits()
	 * @see #getNumberFormatType()
	 * @generated
	 */
	EAttribute getNumberFormatType_MaximumIntegerDigits();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.NumberFormatType#getMinimumFractionDigits <em>Minimum Fraction Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Fraction Digits</em>'.
	 * @see org.omg.space.xtce.NumberFormatType#getMinimumFractionDigits()
	 * @see #getNumberFormatType()
	 * @generated
	 */
	EAttribute getNumberFormatType_MinimumFractionDigits();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.NumberFormatType#getMinimumIntegerDigits <em>Minimum Integer Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Integer Digits</em>'.
	 * @see org.omg.space.xtce.NumberFormatType#getMinimumIntegerDigits()
	 * @see #getNumberFormatType()
	 * @generated
	 */
	EAttribute getNumberFormatType_MinimumIntegerDigits();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.NumberFormatType#getNegativePrefix <em>Negative Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative Prefix</em>'.
	 * @see org.omg.space.xtce.NumberFormatType#getNegativePrefix()
	 * @see #getNumberFormatType()
	 * @generated
	 */
	EAttribute getNumberFormatType_NegativePrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.NumberFormatType#getNegativeSuffix <em>Negative Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative Suffix</em>'.
	 * @see org.omg.space.xtce.NumberFormatType#getNegativeSuffix()
	 * @see #getNumberFormatType()
	 * @generated
	 */
	EAttribute getNumberFormatType_NegativeSuffix();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.NumberFormatType#getNotation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notation</em>'.
	 * @see org.omg.space.xtce.NumberFormatType#getNotation()
	 * @see #getNumberFormatType()
	 * @generated
	 */
	EAttribute getNumberFormatType_Notation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.NumberFormatType#getNumberBase <em>Number Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Base</em>'.
	 * @see org.omg.space.xtce.NumberFormatType#getNumberBase()
	 * @see #getNumberFormatType()
	 * @generated
	 */
	EAttribute getNumberFormatType_NumberBase();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.NumberFormatType#getPositivePrefix <em>Positive Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Prefix</em>'.
	 * @see org.omg.space.xtce.NumberFormatType#getPositivePrefix()
	 * @see #getNumberFormatType()
	 * @generated
	 */
	EAttribute getNumberFormatType_PositivePrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.NumberFormatType#getPositiveSuffix <em>Positive Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Suffix</em>'.
	 * @see org.omg.space.xtce.NumberFormatType#getPositiveSuffix()
	 * @see #getNumberFormatType()
	 * @generated
	 */
	EAttribute getNumberFormatType_PositiveSuffix();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.NumberFormatType#isShowThousandsGrouping <em>Show Thousands Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Thousands Grouping</em>'.
	 * @see org.omg.space.xtce.NumberFormatType#isShowThousandsGrouping()
	 * @see #getNumberFormatType()
	 * @generated
	 */
	EAttribute getNumberFormatType_ShowThousandsGrouping();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.NumberToStringType <em>Number To String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number To String Type</em>'.
	 * @see org.omg.space.xtce.NumberToStringType
	 * @generated
	 */
	EClass getNumberToStringType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.NumberToStringType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.space.xtce.NumberToStringType#getGroup()
	 * @see #getNumberToStringType()
	 * @generated
	 */
	EAttribute getNumberToStringType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.NumberToStringType#getValueEnumeration <em>Value Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Enumeration</em>'.
	 * @see org.omg.space.xtce.NumberToStringType#getValueEnumeration()
	 * @see #getNumberToStringType()
	 * @generated
	 */
	EReference getNumberToStringType_ValueEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.NumberToStringType#getRangeEnumeration <em>Range Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Range Enumeration</em>'.
	 * @see org.omg.space.xtce.NumberToStringType#getRangeEnumeration()
	 * @see #getNumberToStringType()
	 * @generated
	 */
	EReference getNumberToStringType_RangeEnumeration();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.NumberToStringType#getNumberFormat <em>Number Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number Format</em>'.
	 * @see org.omg.space.xtce.NumberToStringType#getNumberFormat()
	 * @see #getNumberToStringType()
	 * @generated
	 */
	EReference getNumberToStringType_NumberFormat();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.NumericAlarmConditionType <em>Numeric Alarm Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Alarm Condition Type</em>'.
	 * @see org.omg.space.xtce.NumericAlarmConditionType
	 * @generated
	 */
	EClass getNumericAlarmConditionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.NumericAlarmConditionType#getStaticAlarmRanges <em>Static Alarm Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Static Alarm Ranges</em>'.
	 * @see org.omg.space.xtce.NumericAlarmConditionType#getStaticAlarmRanges()
	 * @see #getNumericAlarmConditionType()
	 * @generated
	 */
	EReference getNumericAlarmConditionType_StaticAlarmRanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.NumericAlarmConditionType#getChangePerSecondAlarmRanges <em>Change Per Second Alarm Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Per Second Alarm Ranges</em>'.
	 * @see org.omg.space.xtce.NumericAlarmConditionType#getChangePerSecondAlarmRanges()
	 * @see #getNumericAlarmConditionType()
	 * @generated
	 */
	EReference getNumericAlarmConditionType_ChangePerSecondAlarmRanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.NumericAlarmConditionType#getConditionalAlarm <em>Conditional Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditional Alarm</em>'.
	 * @see org.omg.space.xtce.NumericAlarmConditionType#getConditionalAlarm()
	 * @see #getNumericAlarmConditionType()
	 * @generated
	 */
	EReference getNumericAlarmConditionType_ConditionalAlarm();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.NumericAlarmConditionType#getCustomAlarm <em>Custom Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Alarm</em>'.
	 * @see org.omg.space.xtce.NumericAlarmConditionType#getCustomAlarm()
	 * @see #getNumericAlarmConditionType()
	 * @generated
	 */
	EReference getNumericAlarmConditionType_CustomAlarm();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.NumericAlarmConditionType#getMinViolations <em>Min Violations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Violations</em>'.
	 * @see org.omg.space.xtce.NumericAlarmConditionType#getMinViolations()
	 * @see #getNumericAlarmConditionType()
	 * @generated
	 */
	EAttribute getNumericAlarmConditionType_MinViolations();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.NumericDataType <em>Numeric Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Data Type</em>'.
	 * @see org.omg.space.xtce.NumericDataType
	 * @generated
	 */
	EClass getNumericDataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.NumericDataType#getToString <em>To String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To String</em>'.
	 * @see org.omg.space.xtce.NumericDataType#getToString()
	 * @see #getNumericDataType()
	 * @generated
	 */
	EReference getNumericDataType_ToString();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.NumericDataType#getValidRange <em>Valid Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid Range</em>'.
	 * @see org.omg.space.xtce.NumericDataType#getValidRange()
	 * @see #getNumericDataType()
	 * @generated
	 */
	EReference getNumericDataType_ValidRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.NumericDataType#getDefaultCalibrator <em>Default Calibrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Calibrator</em>'.
	 * @see org.omg.space.xtce.NumericDataType#getDefaultCalibrator()
	 * @see #getNumericDataType()
	 * @generated
	 */
	EReference getNumericDataType_DefaultCalibrator();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.NumericDataType#getContextCalibratorList <em>Context Calibrator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Calibrator List</em>'.
	 * @see org.omg.space.xtce.NumericDataType#getContextCalibratorList()
	 * @see #getNumericDataType()
	 * @generated
	 */
	EReference getNumericDataType_ContextCalibratorList();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.NumericDataType#isValidRangeAppliesToCalibrated <em>Valid Range Applies To Calibrated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Range Applies To Calibrated</em>'.
	 * @see org.omg.space.xtce.NumericDataType#isValidRangeAppliesToCalibrated()
	 * @see #getNumericDataType()
	 * @generated
	 */
	EAttribute getNumericDataType_ValidRangeAppliesToCalibrated();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.OffsetType <em>Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offset Type</em>'.
	 * @see org.omg.space.xtce.OffsetType
	 * @generated
	 */
	EClass getOffsetType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.OffsetType#getOffsetSizeInBits <em>Offset Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset Size In Bits</em>'.
	 * @see org.omg.space.xtce.OffsetType#getOffsetSizeInBits()
	 * @see #getOffsetType()
	 * @generated
	 */
	EAttribute getOffsetType_OffsetSizeInBits();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ORedConditionsType <em>ORed Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ORed Conditions Type</em>'.
	 * @see org.omg.space.xtce.ORedConditionsType
	 * @generated
	 */
	EClass getORedConditionsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.ORedConditionsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.space.xtce.ORedConditionsType#getGroup()
	 * @see #getORedConditionsType()
	 * @generated
	 */
	EAttribute getORedConditionsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ORedConditionsType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see org.omg.space.xtce.ORedConditionsType#getCondition()
	 * @see #getORedConditionsType()
	 * @generated
	 */
	EReference getORedConditionsType_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ORedConditionsType#getANDedConditions <em>AN Ded Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AN Ded Conditions</em>'.
	 * @see org.omg.space.xtce.ORedConditionsType#getANDedConditions()
	 * @see #getORedConditionsType()
	 * @generated
	 */
	EReference getORedConditionsType_ANDedConditions();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.OutputParameterRefType <em>Output Parameter Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Parameter Ref Type</em>'.
	 * @see org.omg.space.xtce.OutputParameterRefType
	 * @generated
	 */
	EClass getOutputParameterRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.OutputParameterRefType#getOutputName <em>Output Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Name</em>'.
	 * @see org.omg.space.xtce.OutputParameterRefType#getOutputName()
	 * @see #getOutputParameterRefType()
	 * @generated
	 */
	EAttribute getOutputParameterRefType_OutputName();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.OutputSetType <em>Output Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Set Type</em>'.
	 * @see org.omg.space.xtce.OutputSetType
	 * @generated
	 */
	EClass getOutputSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.OutputSetType#getOutputParameterRef <em>Output Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Parameter Ref</em>'.
	 * @see org.omg.space.xtce.OutputSetType#getOutputParameterRef()
	 * @see #getOutputSetType()
	 * @generated
	 */
	EReference getOutputSetType_OutputParameterRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ParameterInstanceRefType <em>Parameter Instance Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Instance Ref Type</em>'.
	 * @see org.omg.space.xtce.ParameterInstanceRefType
	 * @generated
	 */
	EClass getParameterInstanceRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParameterInstanceRefType#getInputName <em>Input Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Name</em>'.
	 * @see org.omg.space.xtce.ParameterInstanceRefType#getInputName()
	 * @see #getParameterInstanceRefType()
	 * @generated
	 */
	EAttribute getParameterInstanceRefType_InputName();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ParameterInstanceRefType1 <em>Parameter Instance Ref Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Instance Ref Type1</em>'.
	 * @see org.omg.space.xtce.ParameterInstanceRefType1
	 * @generated
	 */
	EClass getParameterInstanceRefType1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParameterInstanceRefType1#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see org.omg.space.xtce.ParameterInstanceRefType1#getInstance()
	 * @see #getParameterInstanceRefType1()
	 * @generated
	 */
	EAttribute getParameterInstanceRefType1_Instance();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParameterInstanceRefType1#isUseCalibratedValue <em>Use Calibrated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Calibrated Value</em>'.
	 * @see org.omg.space.xtce.ParameterInstanceRefType1#isUseCalibratedValue()
	 * @see #getParameterInstanceRefType1()
	 * @generated
	 */
	EAttribute getParameterInstanceRefType1_UseCalibratedValue();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ParameterPropertiesType <em>Parameter Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Properties Type</em>'.
	 * @see org.omg.space.xtce.ParameterPropertiesType
	 * @generated
	 */
	EClass getParameterPropertiesType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParameterPropertiesType#getSystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Name</em>'.
	 * @see org.omg.space.xtce.ParameterPropertiesType#getSystemName()
	 * @see #getParameterPropertiesType()
	 * @generated
	 */
	EAttribute getParameterPropertiesType_SystemName();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ParameterPropertiesType#getValidityCondition <em>Validity Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validity Condition</em>'.
	 * @see org.omg.space.xtce.ParameterPropertiesType#getValidityCondition()
	 * @see #getParameterPropertiesType()
	 * @generated
	 */
	EReference getParameterPropertiesType_ValidityCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ParameterPropertiesType#getPhysicalAddressSet <em>Physical Address Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physical Address Set</em>'.
	 * @see org.omg.space.xtce.ParameterPropertiesType#getPhysicalAddressSet()
	 * @see #getParameterPropertiesType()
	 * @generated
	 */
	EReference getParameterPropertiesType_PhysicalAddressSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ParameterPropertiesType#getTimeAssociation <em>Time Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Association</em>'.
	 * @see org.omg.space.xtce.ParameterPropertiesType#getTimeAssociation()
	 * @see #getParameterPropertiesType()
	 * @generated
	 */
	EReference getParameterPropertiesType_TimeAssociation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParameterPropertiesType#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see org.omg.space.xtce.ParameterPropertiesType#getDataSource()
	 * @see #getParameterPropertiesType()
	 * @generated
	 */
	EAttribute getParameterPropertiesType_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParameterPropertiesType#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.omg.space.xtce.ParameterPropertiesType#isReadOnly()
	 * @see #getParameterPropertiesType()
	 * @generated
	 */
	EAttribute getParameterPropertiesType_ReadOnly();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ParameterRefEntryType <em>Parameter Ref Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Ref Entry Type</em>'.
	 * @see org.omg.space.xtce.ParameterRefEntryType
	 * @generated
	 */
	EClass getParameterRefEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParameterRefEntryType#getParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Ref</em>'.
	 * @see org.omg.space.xtce.ParameterRefEntryType#getParameterRef()
	 * @see #getParameterRefEntryType()
	 * @generated
	 */
	EAttribute getParameterRefEntryType_ParameterRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ParameterRefType <em>Parameter Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Ref Type</em>'.
	 * @see org.omg.space.xtce.ParameterRefType
	 * @generated
	 */
	EClass getParameterRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParameterRefType#getTriggerName <em>Trigger Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Name</em>'.
	 * @see org.omg.space.xtce.ParameterRefType#getTriggerName()
	 * @see #getParameterRefType()
	 * @generated
	 */
	EAttribute getParameterRefType_TriggerName();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ParameterRefType1 <em>Parameter Ref Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Ref Type1</em>'.
	 * @see org.omg.space.xtce.ParameterRefType1
	 * @generated
	 */
	EClass getParameterRefType1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParameterRefType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.space.xtce.ParameterRefType1#getValue()
	 * @see #getParameterRefType1()
	 * @generated
	 */
	EAttribute getParameterRefType1_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParameterRefType1#getParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Ref</em>'.
	 * @see org.omg.space.xtce.ParameterRefType1#getParameterRef()
	 * @see #getParameterRefType1()
	 * @generated
	 */
	EAttribute getParameterRefType1_ParameterRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ParameterSegmentRefEntryType <em>Parameter Segment Ref Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Segment Ref Entry Type</em>'.
	 * @see org.omg.space.xtce.ParameterSegmentRefEntryType
	 * @generated
	 */
	EClass getParameterSegmentRefEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParameterSegmentRefEntryType#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.omg.space.xtce.ParameterSegmentRefEntryType#getOrder()
	 * @see #getParameterSegmentRefEntryType()
	 * @generated
	 */
	EAttribute getParameterSegmentRefEntryType_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParameterSegmentRefEntryType#getParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Ref</em>'.
	 * @see org.omg.space.xtce.ParameterSegmentRefEntryType#getParameterRef()
	 * @see #getParameterSegmentRefEntryType()
	 * @generated
	 */
	EAttribute getParameterSegmentRefEntryType_ParameterRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParameterSegmentRefEntryType#getSizeInBits <em>Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size In Bits</em>'.
	 * @see org.omg.space.xtce.ParameterSegmentRefEntryType#getSizeInBits()
	 * @see #getParameterSegmentRefEntryType()
	 * @generated
	 */
	EAttribute getParameterSegmentRefEntryType_SizeInBits();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ParameterSetType <em>Parameter Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Set Type</em>'.
	 * @see org.omg.space.xtce.ParameterSetType
	 * @generated
	 */
	EClass getParameterSetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.ParameterSetType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.space.xtce.ParameterSetType#getGroup()
	 * @see #getParameterSetType()
	 * @generated
	 */
	EAttribute getParameterSetType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ParameterSetType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.omg.space.xtce.ParameterSetType#getParameter()
	 * @see #getParameterSetType()
	 * @generated
	 */
	EReference getParameterSetType_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ParameterSetType#getParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Ref</em>'.
	 * @see org.omg.space.xtce.ParameterSetType#getParameterRef()
	 * @see #getParameterSetType()
	 * @generated
	 */
	EReference getParameterSetType_ParameterRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ParameterToSetListType <em>Parameter To Set List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter To Set List Type</em>'.
	 * @see org.omg.space.xtce.ParameterToSetListType
	 * @generated
	 */
	EClass getParameterToSetListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ParameterToSetListType#getParameterToSet <em>Parameter To Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter To Set</em>'.
	 * @see org.omg.space.xtce.ParameterToSetListType#getParameterToSet()
	 * @see #getParameterToSetListType()
	 * @generated
	 */
	EReference getParameterToSetListType_ParameterToSet();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ParameterToSetType <em>Parameter To Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter To Set Type</em>'.
	 * @see org.omg.space.xtce.ParameterToSetType
	 * @generated
	 */
	EClass getParameterToSetType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ParameterToSetType#getParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Ref</em>'.
	 * @see org.omg.space.xtce.ParameterToSetType#getParameterRef()
	 * @see #getParameterToSetType()
	 * @generated
	 */
	EReference getParameterToSetType_ParameterRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ParameterToSetType#getDerivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derivation</em>'.
	 * @see org.omg.space.xtce.ParameterToSetType#getDerivation()
	 * @see #getParameterToSetType()
	 * @generated
	 */
	EReference getParameterToSetType_Derivation();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ParameterToSetType1 <em>Parameter To Set Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter To Set Type1</em>'.
	 * @see org.omg.space.xtce.ParameterToSetType1
	 * @generated
	 */
	EClass getParameterToSetType1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParameterToSetType1#getVerifierToTriggerOn <em>Verifier To Trigger On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verifier To Trigger On</em>'.
	 * @see org.omg.space.xtce.ParameterToSetType1#getVerifierToTriggerOn()
	 * @see #getParameterToSetType1()
	 * @generated
	 */
	EAttribute getParameterToSetType1_VerifierToTriggerOn();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see org.omg.space.xtce.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ParameterType#getParameterProperties <em>Parameter Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Properties</em>'.
	 * @see org.omg.space.xtce.ParameterType#getParameterProperties()
	 * @see #getParameterType()
	 * @generated
	 */
	EReference getParameterType_ParameterProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParameterType#getParameterTypeRef <em>Parameter Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type Ref</em>'.
	 * @see org.omg.space.xtce.ParameterType#getParameterTypeRef()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_ParameterTypeRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ParameterTypeSetType <em>Parameter Type Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type Set Type</em>'.
	 * @see org.omg.space.xtce.ParameterTypeSetType
	 * @generated
	 */
	EClass getParameterTypeSetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.ParameterTypeSetType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.space.xtce.ParameterTypeSetType#getGroup()
	 * @see #getParameterTypeSetType()
	 * @generated
	 */
	EAttribute getParameterTypeSetType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ParameterTypeSetType#getStringParameterType <em>String Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String Parameter Type</em>'.
	 * @see org.omg.space.xtce.ParameterTypeSetType#getStringParameterType()
	 * @see #getParameterTypeSetType()
	 * @generated
	 */
	EReference getParameterTypeSetType_StringParameterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ParameterTypeSetType#getEnumeratedParameterType <em>Enumerated Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerated Parameter Type</em>'.
	 * @see org.omg.space.xtce.ParameterTypeSetType#getEnumeratedParameterType()
	 * @see #getParameterTypeSetType()
	 * @generated
	 */
	EReference getParameterTypeSetType_EnumeratedParameterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ParameterTypeSetType#getIntegerParameterType <em>Integer Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Parameter Type</em>'.
	 * @see org.omg.space.xtce.ParameterTypeSetType#getIntegerParameterType()
	 * @see #getParameterTypeSetType()
	 * @generated
	 */
	EReference getParameterTypeSetType_IntegerParameterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ParameterTypeSetType#getBinaryParameterType <em>Binary Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binary Parameter Type</em>'.
	 * @see org.omg.space.xtce.ParameterTypeSetType#getBinaryParameterType()
	 * @see #getParameterTypeSetType()
	 * @generated
	 */
	EReference getParameterTypeSetType_BinaryParameterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ParameterTypeSetType#getFloatParameterType <em>Float Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Float Parameter Type</em>'.
	 * @see org.omg.space.xtce.ParameterTypeSetType#getFloatParameterType()
	 * @see #getParameterTypeSetType()
	 * @generated
	 */
	EReference getParameterTypeSetType_FloatParameterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ParameterTypeSetType#getBooleanParameterType <em>Boolean Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Parameter Type</em>'.
	 * @see org.omg.space.xtce.ParameterTypeSetType#getBooleanParameterType()
	 * @see #getParameterTypeSetType()
	 * @generated
	 */
	EReference getParameterTypeSetType_BooleanParameterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ParameterTypeSetType#getRelativeTimeParameterType <em>Relative Time Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relative Time Parameter Type</em>'.
	 * @see org.omg.space.xtce.ParameterTypeSetType#getRelativeTimeParameterType()
	 * @see #getParameterTypeSetType()
	 * @generated
	 */
	EReference getParameterTypeSetType_RelativeTimeParameterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ParameterTypeSetType#getAbsoluteTimeParameterType <em>Absolute Time Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Absolute Time Parameter Type</em>'.
	 * @see org.omg.space.xtce.ParameterTypeSetType#getAbsoluteTimeParameterType()
	 * @see #getParameterTypeSetType()
	 * @generated
	 */
	EReference getParameterTypeSetType_AbsoluteTimeParameterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ParameterTypeSetType#getArrayParameterType <em>Array Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Parameter Type</em>'.
	 * @see org.omg.space.xtce.ParameterTypeSetType#getArrayParameterType()
	 * @see #getParameterTypeSetType()
	 * @generated
	 */
	EReference getParameterTypeSetType_ArrayParameterType();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ParameterValueChangeType <em>Parameter Value Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value Change Type</em>'.
	 * @see org.omg.space.xtce.ParameterValueChangeType
	 * @generated
	 */
	EClass getParameterValueChangeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ParameterValueChangeType#getParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Ref</em>'.
	 * @see org.omg.space.xtce.ParameterValueChangeType#getParameterRef()
	 * @see #getParameterValueChangeType()
	 * @generated
	 */
	EReference getParameterValueChangeType_ParameterRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ParameterValueChangeType#getChange <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change</em>'.
	 * @see org.omg.space.xtce.ParameterValueChangeType#getChange()
	 * @see #getParameterValueChangeType()
	 * @generated
	 */
	EReference getParameterValueChangeType_Change();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ParityType <em>Parity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parity Type</em>'.
	 * @see org.omg.space.xtce.ParityType
	 * @generated
	 */
	EClass getParityType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParityType#getBitsFromReference <em>Bits From Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bits From Reference</em>'.
	 * @see org.omg.space.xtce.ParityType#getBitsFromReference()
	 * @see #getParityType()
	 * @generated
	 */
	EAttribute getParityType_BitsFromReference();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParityType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.omg.space.xtce.ParityType#getReference()
	 * @see #getParityType()
	 * @generated
	 */
	EAttribute getParityType_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ParityType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.omg.space.xtce.ParityType#getType()
	 * @see #getParityType()
	 * @generated
	 */
	EAttribute getParityType_Type();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.PCMStreamType <em>PCM Stream Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Stream Type</em>'.
	 * @see org.omg.space.xtce.PCMStreamType
	 * @generated
	 */
	EClass getPCMStreamType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.PCMStreamType#getBitRateInBPS <em>Bit Rate In BPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Rate In BPS</em>'.
	 * @see org.omg.space.xtce.PCMStreamType#getBitRateInBPS()
	 * @see #getPCMStreamType()
	 * @generated
	 */
	EAttribute getPCMStreamType_BitRateInBPS();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.PCMStreamType#isInverted <em>Inverted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverted</em>'.
	 * @see org.omg.space.xtce.PCMStreamType#isInverted()
	 * @see #getPCMStreamType()
	 * @generated
	 */
	EAttribute getPCMStreamType_Inverted();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.PCMStreamType#getPcmType <em>Pcm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pcm Type</em>'.
	 * @see org.omg.space.xtce.PCMStreamType#getPcmType()
	 * @see #getPCMStreamType()
	 * @generated
	 */
	EAttribute getPCMStreamType_PcmType();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.PhysicalAddressSetType <em>Physical Address Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Address Set Type</em>'.
	 * @see org.omg.space.xtce.PhysicalAddressSetType
	 * @generated
	 */
	EClass getPhysicalAddressSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.PhysicalAddressSetType#getPhysicalAddress <em>Physical Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical Address</em>'.
	 * @see org.omg.space.xtce.PhysicalAddressSetType#getPhysicalAddress()
	 * @see #getPhysicalAddressSetType()
	 * @generated
	 */
	EReference getPhysicalAddressSetType_PhysicalAddress();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.PhysicalAddressType <em>Physical Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Address Type</em>'.
	 * @see org.omg.space.xtce.PhysicalAddressType
	 * @generated
	 */
	EClass getPhysicalAddressType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.PhysicalAddressType#getSubAddress <em>Sub Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Address</em>'.
	 * @see org.omg.space.xtce.PhysicalAddressType#getSubAddress()
	 * @see #getPhysicalAddressType()
	 * @generated
	 */
	EReference getPhysicalAddressType_SubAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.PhysicalAddressType#getSourceAddress <em>Source Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Address</em>'.
	 * @see org.omg.space.xtce.PhysicalAddressType#getSourceAddress()
	 * @see #getPhysicalAddressType()
	 * @generated
	 */
	EAttribute getPhysicalAddressType_SourceAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.PhysicalAddressType#getSourceName <em>Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Name</em>'.
	 * @see org.omg.space.xtce.PhysicalAddressType#getSourceName()
	 * @see #getPhysicalAddressType()
	 * @generated
	 */
	EAttribute getPhysicalAddressType_SourceName();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.PhysicalAddressType1 <em>Physical Address Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Address Type1</em>'.
	 * @see org.omg.space.xtce.PhysicalAddressType1
	 * @generated
	 */
	EClass getPhysicalAddressType1();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.PolynomialType <em>Polynomial Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polynomial Type</em>'.
	 * @see org.omg.space.xtce.PolynomialType
	 * @generated
	 */
	EClass getPolynomialType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.PolynomialType#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Term</em>'.
	 * @see org.omg.space.xtce.PolynomialType#getTerm()
	 * @see #getPolynomialType()
	 * @generated
	 */
	EReference getPolynomialType_Term();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see org.omg.space.xtce.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.PropertyType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.space.xtce.PropertyType#getGroup()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.PropertyType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.omg.space.xtce.PropertyType#getProperty()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.space.xtce.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Value();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.QueuedVerifierType <em>Queued Verifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queued Verifier Type</em>'.
	 * @see org.omg.space.xtce.QueuedVerifierType
	 * @generated
	 */
	EClass getQueuedVerifierType();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.RangeEnumerationType <em>Range Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Enumeration Type</em>'.
	 * @see org.omg.space.xtce.RangeEnumerationType
	 * @generated
	 */
	EClass getRangeEnumerationType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.RangeEnumerationType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.omg.space.xtce.RangeEnumerationType#getLabel()
	 * @see #getRangeEnumerationType()
	 * @generated
	 */
	EAttribute getRangeEnumerationType_Label();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.RateInStreamSetType <em>Rate In Stream Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rate In Stream Set Type</em>'.
	 * @see org.omg.space.xtce.RateInStreamSetType
	 * @generated
	 */
	EClass getRateInStreamSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.RateInStreamSetType#getRateInStream <em>Rate In Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rate In Stream</em>'.
	 * @see org.omg.space.xtce.RateInStreamSetType#getRateInStream()
	 * @see #getRateInStreamSetType()
	 * @generated
	 */
	EReference getRateInStreamSetType_RateInStream();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.RateInStreamType <em>Rate In Stream Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rate In Stream Type</em>'.
	 * @see org.omg.space.xtce.RateInStreamType
	 * @generated
	 */
	EClass getRateInStreamType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.RateInStreamType#getStreamRef <em>Stream Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stream Ref</em>'.
	 * @see org.omg.space.xtce.RateInStreamType#getStreamRef()
	 * @see #getRateInStreamType()
	 * @generated
	 */
	EAttribute getRateInStreamType_StreamRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.RateInStreamType1 <em>Rate In Stream Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rate In Stream Type1</em>'.
	 * @see org.omg.space.xtce.RateInStreamType1
	 * @generated
	 */
	EClass getRateInStreamType1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.RateInStreamType1#getBasis <em>Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Basis</em>'.
	 * @see org.omg.space.xtce.RateInStreamType1#getBasis()
	 * @see #getRateInStreamType1()
	 * @generated
	 */
	EAttribute getRateInStreamType1_Basis();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.RateInStreamType1#getMaximumValue <em>Maximum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Value</em>'.
	 * @see org.omg.space.xtce.RateInStreamType1#getMaximumValue()
	 * @see #getRateInStreamType1()
	 * @generated
	 */
	EAttribute getRateInStreamType1_MaximumValue();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.RateInStreamType1#getMinimumValue <em>Minimum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Value</em>'.
	 * @see org.omg.space.xtce.RateInStreamType1#getMinimumValue()
	 * @see #getRateInStreamType1()
	 * @generated
	 */
	EAttribute getRateInStreamType1_MinimumValue();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ReceivedVerifierType <em>Received Verifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Received Verifier Type</em>'.
	 * @see org.omg.space.xtce.ReceivedVerifierType
	 * @generated
	 */
	EClass getReceivedVerifierType();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ReferenceTimeType <em>Reference Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Time Type</em>'.
	 * @see org.omg.space.xtce.ReferenceTimeType
	 * @generated
	 */
	EClass getReferenceTimeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ReferenceTimeType#getOffsetFrom <em>Offset From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset From</em>'.
	 * @see org.omg.space.xtce.ReferenceTimeType#getOffsetFrom()
	 * @see #getReferenceTimeType()
	 * @generated
	 */
	EReference getReferenceTimeType_OffsetFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ReferenceTimeType#getEpoch <em>Epoch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Epoch</em>'.
	 * @see org.omg.space.xtce.ReferenceTimeType#getEpoch()
	 * @see #getReferenceTimeType()
	 * @generated
	 */
	EAttribute getReferenceTimeType_Epoch();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.RelativeTimeDataType <em>Relative Time Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Time Data Type</em>'.
	 * @see org.omg.space.xtce.RelativeTimeDataType
	 * @generated
	 */
	EClass getRelativeTimeDataType();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.RepeatType <em>Repeat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Type</em>'.
	 * @see org.omg.space.xtce.RepeatType
	 * @generated
	 */
	EClass getRepeatType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.RepeatType#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count</em>'.
	 * @see org.omg.space.xtce.RepeatType#getCount()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_Count();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.RepeatType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see org.omg.space.xtce.RepeatType#getOffset()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_Offset();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.RestrictionCriteriaType <em>Restriction Criteria Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction Criteria Type</em>'.
	 * @see org.omg.space.xtce.RestrictionCriteriaType
	 * @generated
	 */
	EClass getRestrictionCriteriaType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.RestrictionCriteriaType#getNextContainer <em>Next Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Container</em>'.
	 * @see org.omg.space.xtce.RestrictionCriteriaType#getNextContainer()
	 * @see #getRestrictionCriteriaType()
	 * @generated
	 */
	EReference getRestrictionCriteriaType_NextContainer();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.RestrictionCriteriaType1 <em>Restriction Criteria Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction Criteria Type1</em>'.
	 * @see org.omg.space.xtce.RestrictionCriteriaType1
	 * @generated
	 */
	EClass getRestrictionCriteriaType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.RestrictionCriteriaType1#getNextContainer <em>Next Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Container</em>'.
	 * @see org.omg.space.xtce.RestrictionCriteriaType1#getNextContainer()
	 * @see #getRestrictionCriteriaType1()
	 * @generated
	 */
	EReference getRestrictionCriteriaType1_NextContainer();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.SentFromRangeVerifierType <em>Sent From Range Verifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sent From Range Verifier Type</em>'.
	 * @see org.omg.space.xtce.SentFromRangeVerifierType
	 * @generated
	 */
	EClass getSentFromRangeVerifierType();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.SequenceContainerType <em>Sequence Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Container Type</em>'.
	 * @see org.omg.space.xtce.SequenceContainerType
	 * @generated
	 */
	EClass getSequenceContainerType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.SequenceContainerType#getEntryList <em>Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry List</em>'.
	 * @see org.omg.space.xtce.SequenceContainerType#getEntryList()
	 * @see #getSequenceContainerType()
	 * @generated
	 */
	EReference getSequenceContainerType_EntryList();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.SequenceContainerType#getBaseContainer <em>Base Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Container</em>'.
	 * @see org.omg.space.xtce.SequenceContainerType#getBaseContainer()
	 * @see #getSequenceContainerType()
	 * @generated
	 */
	EReference getSequenceContainerType_BaseContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SequenceContainerType#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.omg.space.xtce.SequenceContainerType#isAbstract()
	 * @see #getSequenceContainerType()
	 * @generated
	 */
	EAttribute getSequenceContainerType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SequenceContainerType#getIdlePattern <em>Idle Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idle Pattern</em>'.
	 * @see org.omg.space.xtce.SequenceContainerType#getIdlePattern()
	 * @see #getSequenceContainerType()
	 * @generated
	 */
	EAttribute getSequenceContainerType_IdlePattern();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.SequenceEntryType <em>Sequence Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Entry Type</em>'.
	 * @see org.omg.space.xtce.SequenceEntryType
	 * @generated
	 */
	EClass getSequenceEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.SequenceEntryType#getLocationInContainerInBits <em>Location In Container In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location In Container In Bits</em>'.
	 * @see org.omg.space.xtce.SequenceEntryType#getLocationInContainerInBits()
	 * @see #getSequenceEntryType()
	 * @generated
	 */
	EReference getSequenceEntryType_LocationInContainerInBits();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.SequenceEntryType#getRepeatEntry <em>Repeat Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Entry</em>'.
	 * @see org.omg.space.xtce.SequenceEntryType#getRepeatEntry()
	 * @see #getSequenceEntryType()
	 * @generated
	 */
	EReference getSequenceEntryType_RepeatEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.SequenceEntryType#getIncludeCondition <em>Include Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Include Condition</em>'.
	 * @see org.omg.space.xtce.SequenceEntryType#getIncludeCondition()
	 * @see #getSequenceEntryType()
	 * @generated
	 */
	EReference getSequenceEntryType_IncludeCondition();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ServiceRefType <em>Service Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Ref Type</em>'.
	 * @see org.omg.space.xtce.ServiceRefType
	 * @generated
	 */
	EClass getServiceRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ServiceRefType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.space.xtce.ServiceRefType#getValue()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EAttribute getServiceRefType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ServiceRefType#getServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Ref</em>'.
	 * @see org.omg.space.xtce.ServiceRefType#getServiceRef()
	 * @see #getServiceRefType()
	 * @generated
	 */
	EAttribute getServiceRefType_ServiceRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ServiceSetType <em>Service Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Set Type</em>'.
	 * @see org.omg.space.xtce.ServiceSetType
	 * @generated
	 */
	EClass getServiceSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.ServiceSetType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.omg.space.xtce.ServiceSetType#getService()
	 * @see #getServiceSetType()
	 * @generated
	 */
	EReference getServiceSetType_Service();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Type</em>'.
	 * @see org.omg.space.xtce.ServiceType
	 * @generated
	 */
	EClass getServiceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ServiceType#getMessageRefSet <em>Message Ref Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Ref Set</em>'.
	 * @see org.omg.space.xtce.ServiceType#getMessageRefSet()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_MessageRefSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.ServiceType#getContainerRefSet <em>Container Ref Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container Ref Set</em>'.
	 * @see org.omg.space.xtce.ServiceType#getContainerRefSet()
	 * @see #getServiceType()
	 * @generated
	 */
	EReference getServiceType_ContainerRefSet();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.SignificanceType <em>Significance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Significance Type</em>'.
	 * @see org.omg.space.xtce.SignificanceType
	 * @generated
	 */
	EClass getSignificanceType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SignificanceType#getConsequenceLevel <em>Consequence Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consequence Level</em>'.
	 * @see org.omg.space.xtce.SignificanceType#getConsequenceLevel()
	 * @see #getSignificanceType()
	 * @generated
	 */
	EAttribute getSignificanceType_ConsequenceLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SignificanceType#getReasonForWarning <em>Reason For Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason For Warning</em>'.
	 * @see org.omg.space.xtce.SignificanceType#getReasonForWarning()
	 * @see #getSignificanceType()
	 * @generated
	 */
	EAttribute getSignificanceType_ReasonForWarning();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SignificanceType#getSpaceSystemAtRisk <em>Space System At Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space System At Risk</em>'.
	 * @see org.omg.space.xtce.SignificanceType#getSpaceSystemAtRisk()
	 * @see #getSignificanceType()
	 * @generated
	 */
	EAttribute getSignificanceType_SpaceSystemAtRisk();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.SimpleAlgorithmType <em>Simple Algorithm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Algorithm Type</em>'.
	 * @see org.omg.space.xtce.SimpleAlgorithmType
	 * @generated
	 */
	EClass getSimpleAlgorithmType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.SimpleAlgorithmType#getAlgorithmText <em>Algorithm Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algorithm Text</em>'.
	 * @see org.omg.space.xtce.SimpleAlgorithmType#getAlgorithmText()
	 * @see #getSimpleAlgorithmType()
	 * @generated
	 */
	EReference getSimpleAlgorithmType_AlgorithmText();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.SimpleAlgorithmType#getExternalAlgorithmSet <em>External Algorithm Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Algorithm Set</em>'.
	 * @see org.omg.space.xtce.SimpleAlgorithmType#getExternalAlgorithmSet()
	 * @see #getSimpleAlgorithmType()
	 * @generated
	 */
	EReference getSimpleAlgorithmType_ExternalAlgorithmSet();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.SizeInBitsType <em>Size In Bits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size In Bits Type</em>'.
	 * @see org.omg.space.xtce.SizeInBitsType
	 * @generated
	 */
	EClass getSizeInBitsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.SizeInBitsType#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixed</em>'.
	 * @see org.omg.space.xtce.SizeInBitsType#getFixed()
	 * @see #getSizeInBitsType()
	 * @generated
	 */
	EReference getSizeInBitsType_Fixed();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SizeInBitsType#getTerminationChar <em>Termination Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination Char</em>'.
	 * @see org.omg.space.xtce.SizeInBitsType#getTerminationChar()
	 * @see #getSizeInBitsType()
	 * @generated
	 */
	EAttribute getSizeInBitsType_TerminationChar();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.SizeInBitsType#getLeadingSize <em>Leading Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leading Size</em>'.
	 * @see org.omg.space.xtce.SizeInBitsType#getLeadingSize()
	 * @see #getSizeInBitsType()
	 * @generated
	 */
	EReference getSizeInBitsType_LeadingSize();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.SpaceSystemType <em>Space System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space System Type</em>'.
	 * @see org.omg.space.xtce.SpaceSystemType
	 * @generated
	 */
	EClass getSpaceSystemType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.SpaceSystemType#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.omg.space.xtce.SpaceSystemType#getHeader()
	 * @see #getSpaceSystemType()
	 * @generated
	 */
	EReference getSpaceSystemType_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.SpaceSystemType#getTelemetryMetaData <em>Telemetry Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Telemetry Meta Data</em>'.
	 * @see org.omg.space.xtce.SpaceSystemType#getTelemetryMetaData()
	 * @see #getSpaceSystemType()
	 * @generated
	 */
	EReference getSpaceSystemType_TelemetryMetaData();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.SpaceSystemType#getCommandMetaData <em>Command Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command Meta Data</em>'.
	 * @see org.omg.space.xtce.SpaceSystemType#getCommandMetaData()
	 * @see #getSpaceSystemType()
	 * @generated
	 */
	EReference getSpaceSystemType_CommandMetaData();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.SpaceSystemType#getServiceSet <em>Service Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Set</em>'.
	 * @see org.omg.space.xtce.SpaceSystemType#getServiceSet()
	 * @see #getSpaceSystemType()
	 * @generated
	 */
	EReference getSpaceSystemType_ServiceSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.SpaceSystemType#getDefaults <em>Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defaults</em>'.
	 * @see org.omg.space.xtce.SpaceSystemType#getDefaults()
	 * @see #getSpaceSystemType()
	 * @generated
	 */
	EReference getSpaceSystemType_Defaults();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.SpaceSystemType#getSpaceSystem <em>Space System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Space System</em>'.
	 * @see org.omg.space.xtce.SpaceSystemType#getSpaceSystem()
	 * @see #getSpaceSystemType()
	 * @generated
	 */
	EReference getSpaceSystemType_SpaceSystem();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.SplineCalibratorType <em>Spline Calibrator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spline Calibrator Type</em>'.
	 * @see org.omg.space.xtce.SplineCalibratorType
	 * @generated
	 */
	EClass getSplineCalibratorType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.SplineCalibratorType#getSplinePoint <em>Spline Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spline Point</em>'.
	 * @see org.omg.space.xtce.SplineCalibratorType#getSplinePoint()
	 * @see #getSplineCalibratorType()
	 * @generated
	 */
	EReference getSplineCalibratorType_SplinePoint();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SplineCalibratorType#isExtrapolate <em>Extrapolate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrapolate</em>'.
	 * @see org.omg.space.xtce.SplineCalibratorType#isExtrapolate()
	 * @see #getSplineCalibratorType()
	 * @generated
	 */
	EAttribute getSplineCalibratorType_Extrapolate();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SplineCalibratorType#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.omg.space.xtce.SplineCalibratorType#getOrder()
	 * @see #getSplineCalibratorType()
	 * @generated
	 */
	EAttribute getSplineCalibratorType_Order();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.SplinePointType <em>Spline Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spline Point Type</em>'.
	 * @see org.omg.space.xtce.SplinePointType
	 * @generated
	 */
	EClass getSplinePointType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SplinePointType#getCalibrated <em>Calibrated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calibrated</em>'.
	 * @see org.omg.space.xtce.SplinePointType#getCalibrated()
	 * @see #getSplinePointType()
	 * @generated
	 */
	EAttribute getSplinePointType_Calibrated();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SplinePointType#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.omg.space.xtce.SplinePointType#getOrder()
	 * @see #getSplinePointType()
	 * @generated
	 */
	EAttribute getSplinePointType_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SplinePointType#getRaw <em>Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw</em>'.
	 * @see org.omg.space.xtce.SplinePointType#getRaw()
	 * @see #getSplinePointType()
	 * @generated
	 */
	EAttribute getSplinePointType_Raw();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.StreamRefType <em>Stream Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Ref Type</em>'.
	 * @see org.omg.space.xtce.StreamRefType
	 * @generated
	 */
	EClass getStreamRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.StreamRefType#getStreamRef <em>Stream Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stream Ref</em>'.
	 * @see org.omg.space.xtce.StreamRefType#getStreamRef()
	 * @see #getStreamRefType()
	 * @generated
	 */
	EAttribute getStreamRefType_StreamRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.StreamSegmentEntryType <em>Stream Segment Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Segment Entry Type</em>'.
	 * @see org.omg.space.xtce.StreamSegmentEntryType
	 * @generated
	 */
	EClass getStreamSegmentEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.StreamSegmentEntryType#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.omg.space.xtce.StreamSegmentEntryType#getOrder()
	 * @see #getStreamSegmentEntryType()
	 * @generated
	 */
	EAttribute getStreamSegmentEntryType_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.StreamSegmentEntryType#getSizeInBits <em>Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size In Bits</em>'.
	 * @see org.omg.space.xtce.StreamSegmentEntryType#getSizeInBits()
	 * @see #getStreamSegmentEntryType()
	 * @generated
	 */
	EAttribute getStreamSegmentEntryType_SizeInBits();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.StreamSegmentEntryType#getStreamRef <em>Stream Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stream Ref</em>'.
	 * @see org.omg.space.xtce.StreamSegmentEntryType#getStreamRef()
	 * @see #getStreamSegmentEntryType()
	 * @generated
	 */
	EAttribute getStreamSegmentEntryType_StreamRef();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.StreamSetType <em>Stream Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Set Type</em>'.
	 * @see org.omg.space.xtce.StreamSetType
	 * @generated
	 */
	EClass getStreamSetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.StreamSetType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.space.xtce.StreamSetType#getGroup()
	 * @see #getStreamSetType()
	 * @generated
	 */
	EAttribute getStreamSetType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.StreamSetType#getFixedFrameStream <em>Fixed Frame Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fixed Frame Stream</em>'.
	 * @see org.omg.space.xtce.StreamSetType#getFixedFrameStream()
	 * @see #getStreamSetType()
	 * @generated
	 */
	EReference getStreamSetType_FixedFrameStream();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.StreamSetType#getVariableFrameStream <em>Variable Frame Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Frame Stream</em>'.
	 * @see org.omg.space.xtce.StreamSetType#getVariableFrameStream()
	 * @see #getStreamSetType()
	 * @generated
	 */
	EReference getStreamSetType_VariableFrameStream();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.StreamSetType#getCustomStream <em>Custom Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Stream</em>'.
	 * @see org.omg.space.xtce.StreamSetType#getCustomStream()
	 * @see #getStreamSetType()
	 * @generated
	 */
	EReference getStreamSetType_CustomStream();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.StringDataEncodingType <em>String Data Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Data Encoding Type</em>'.
	 * @see org.omg.space.xtce.StringDataEncodingType
	 * @generated
	 */
	EClass getStringDataEncodingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.StringDataEncodingType#getDefaultCalibrator <em>Default Calibrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Calibrator</em>'.
	 * @see org.omg.space.xtce.StringDataEncodingType#getDefaultCalibrator()
	 * @see #getStringDataEncodingType()
	 * @generated
	 */
	EReference getStringDataEncodingType_DefaultCalibrator();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.StringDataEncodingType#getContextCalibratorList <em>Context Calibrator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Calibrator List</em>'.
	 * @see org.omg.space.xtce.StringDataEncodingType#getContextCalibratorList()
	 * @see #getStringDataEncodingType()
	 * @generated
	 */
	EReference getStringDataEncodingType_ContextCalibratorList();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.StringDataEncodingType#getSizeInBits <em>Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size In Bits</em>'.
	 * @see org.omg.space.xtce.StringDataEncodingType#getSizeInBits()
	 * @see #getStringDataEncodingType()
	 * @generated
	 */
	EReference getStringDataEncodingType_SizeInBits();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.StringDataEncodingType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.omg.space.xtce.StringDataEncodingType#getEncoding()
	 * @see #getStringDataEncodingType()
	 * @generated
	 */
	EAttribute getStringDataEncodingType_Encoding();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.StringDataType <em>String Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Data Type</em>'.
	 * @see org.omg.space.xtce.StringDataType
	 * @generated
	 */
	EClass getStringDataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.StringDataType#getSizeRangeInCharacters <em>Size Range In Characters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size Range In Characters</em>'.
	 * @see org.omg.space.xtce.StringDataType#getSizeRangeInCharacters()
	 * @see #getStringDataType()
	 * @generated
	 */
	EReference getStringDataType_SizeRangeInCharacters();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.StringDataType#getDefaultCalibrator <em>Default Calibrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Calibrator</em>'.
	 * @see org.omg.space.xtce.StringDataType#getDefaultCalibrator()
	 * @see #getStringDataType()
	 * @generated
	 */
	EReference getStringDataType_DefaultCalibrator();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.StringDataType#getContextCalibratorList <em>Context Calibrator List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Calibrator List</em>'.
	 * @see org.omg.space.xtce.StringDataType#getContextCalibratorList()
	 * @see #getStringDataType()
	 * @generated
	 */
	EReference getStringDataType_ContextCalibratorList();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.StringDataType#getCharacterWidth <em>Character Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character Width</em>'.
	 * @see org.omg.space.xtce.StringDataType#getCharacterWidth()
	 * @see #getStringDataType()
	 * @generated
	 */
	EAttribute getStringDataType_CharacterWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.StringDataType#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.omg.space.xtce.StringDataType#getInitialValue()
	 * @see #getStringDataType()
	 * @generated
	 */
	EAttribute getStringDataType_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.StringDataType#getRestrictionPattern <em>Restriction Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restriction Pattern</em>'.
	 * @see org.omg.space.xtce.StringDataType#getRestrictionPattern()
	 * @see #getStringDataType()
	 * @generated
	 */
	EAttribute getStringDataType_RestrictionPattern();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.SyncPatternType <em>Sync Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sync Pattern Type</em>'.
	 * @see org.omg.space.xtce.SyncPatternType
	 * @generated
	 */
	EClass getSyncPatternType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SyncPatternType#getBitLocation <em>Bit Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Location</em>'.
	 * @see org.omg.space.xtce.SyncPatternType#getBitLocation()
	 * @see #getSyncPatternType()
	 * @generated
	 */
	EAttribute getSyncPatternType_BitLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SyncPatternType#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see org.omg.space.xtce.SyncPatternType#getMask()
	 * @see #getSyncPatternType()
	 * @generated
	 */
	EAttribute getSyncPatternType_Mask();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SyncPatternType#getMaskLengthInBits <em>Mask Length In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask Length In Bits</em>'.
	 * @see org.omg.space.xtce.SyncPatternType#getMaskLengthInBits()
	 * @see #getSyncPatternType()
	 * @generated
	 */
	EAttribute getSyncPatternType_MaskLengthInBits();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SyncPatternType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.omg.space.xtce.SyncPatternType#getPattern()
	 * @see #getSyncPatternType()
	 * @generated
	 */
	EAttribute getSyncPatternType_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SyncPatternType#getPatternLengthInBits <em>Pattern Length In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Length In Bits</em>'.
	 * @see org.omg.space.xtce.SyncPatternType#getPatternLengthInBits()
	 * @see #getSyncPatternType()
	 * @generated
	 */
	EAttribute getSyncPatternType_PatternLengthInBits();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.SyncPatternType1 <em>Sync Pattern Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sync Pattern Type1</em>'.
	 * @see org.omg.space.xtce.SyncPatternType1
	 * @generated
	 */
	EClass getSyncPatternType1();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SyncPatternType1#getBitLocationFromStartOfContainer <em>Bit Location From Start Of Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Location From Start Of Container</em>'.
	 * @see org.omg.space.xtce.SyncPatternType1#getBitLocationFromStartOfContainer()
	 * @see #getSyncPatternType1()
	 * @generated
	 */
	EAttribute getSyncPatternType1_BitLocationFromStartOfContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SyncPatternType1#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see org.omg.space.xtce.SyncPatternType1#getMask()
	 * @see #getSyncPatternType1()
	 * @generated
	 */
	EAttribute getSyncPatternType1_Mask();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SyncPatternType1#getMaskLengthInBits <em>Mask Length In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask Length In Bits</em>'.
	 * @see org.omg.space.xtce.SyncPatternType1#getMaskLengthInBits()
	 * @see #getSyncPatternType1()
	 * @generated
	 */
	EAttribute getSyncPatternType1_MaskLengthInBits();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SyncPatternType1#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.omg.space.xtce.SyncPatternType1#getPattern()
	 * @see #getSyncPatternType1()
	 * @generated
	 */
	EAttribute getSyncPatternType1_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SyncPatternType1#getPatternLengthInBits <em>Pattern Length In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Length In Bits</em>'.
	 * @see org.omg.space.xtce.SyncPatternType1#getPatternLengthInBits()
	 * @see #getSyncPatternType1()
	 * @generated
	 */
	EAttribute getSyncPatternType1_PatternLengthInBits();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.SyncStrategyType <em>Sync Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sync Strategy Type</em>'.
	 * @see org.omg.space.xtce.SyncStrategyType
	 * @generated
	 */
	EClass getSyncStrategyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.SyncStrategyType#getAutoInvert <em>Auto Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Invert</em>'.
	 * @see org.omg.space.xtce.SyncStrategyType#getAutoInvert()
	 * @see #getSyncStrategyType()
	 * @generated
	 */
	EReference getSyncStrategyType_AutoInvert();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SyncStrategyType#getCheckToLockGoodFrames <em>Check To Lock Good Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check To Lock Good Frames</em>'.
	 * @see org.omg.space.xtce.SyncStrategyType#getCheckToLockGoodFrames()
	 * @see #getSyncStrategyType()
	 * @generated
	 */
	EAttribute getSyncStrategyType_CheckToLockGoodFrames();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SyncStrategyType#getMaxBitErrorsInSyncPattern <em>Max Bit Errors In Sync Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Bit Errors In Sync Pattern</em>'.
	 * @see org.omg.space.xtce.SyncStrategyType#getMaxBitErrorsInSyncPattern()
	 * @see #getSyncStrategyType()
	 * @generated
	 */
	EAttribute getSyncStrategyType_MaxBitErrorsInSyncPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.SyncStrategyType#getVerifyToLockGoodFrames <em>Verify To Lock Good Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verify To Lock Good Frames</em>'.
	 * @see org.omg.space.xtce.SyncStrategyType#getVerifyToLockGoodFrames()
	 * @see #getSyncStrategyType()
	 * @generated
	 */
	EAttribute getSyncStrategyType_VerifyToLockGoodFrames();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.SyncStrategyType1 <em>Sync Strategy Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sync Strategy Type1</em>'.
	 * @see org.omg.space.xtce.SyncStrategyType1
	 * @generated
	 */
	EClass getSyncStrategyType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.SyncStrategyType1#getFlag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flag</em>'.
	 * @see org.omg.space.xtce.SyncStrategyType1#getFlag()
	 * @see #getSyncStrategyType1()
	 * @generated
	 */
	EReference getSyncStrategyType1_Flag();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.SyncStrategyType2 <em>Sync Strategy Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sync Strategy Type2</em>'.
	 * @see org.omg.space.xtce.SyncStrategyType2
	 * @generated
	 */
	EClass getSyncStrategyType2();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.SyncStrategyType2#getSyncPattern <em>Sync Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sync Pattern</em>'.
	 * @see org.omg.space.xtce.SyncStrategyType2#getSyncPattern()
	 * @see #getSyncStrategyType2()
	 * @generated
	 */
	EReference getSyncStrategyType2_SyncPattern();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.TelemetryMetaDataType <em>Telemetry Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telemetry Meta Data Type</em>'.
	 * @see org.omg.space.xtce.TelemetryMetaDataType
	 * @generated
	 */
	EClass getTelemetryMetaDataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.TelemetryMetaDataType#getParameterTypeSet <em>Parameter Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Type Set</em>'.
	 * @see org.omg.space.xtce.TelemetryMetaDataType#getParameterTypeSet()
	 * @see #getTelemetryMetaDataType()
	 * @generated
	 */
	EReference getTelemetryMetaDataType_ParameterTypeSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.TelemetryMetaDataType#getParameterSet <em>Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Set</em>'.
	 * @see org.omg.space.xtce.TelemetryMetaDataType#getParameterSet()
	 * @see #getTelemetryMetaDataType()
	 * @generated
	 */
	EReference getTelemetryMetaDataType_ParameterSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.TelemetryMetaDataType#getContainerSet <em>Container Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container Set</em>'.
	 * @see org.omg.space.xtce.TelemetryMetaDataType#getContainerSet()
	 * @see #getTelemetryMetaDataType()
	 * @generated
	 */
	EReference getTelemetryMetaDataType_ContainerSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.TelemetryMetaDataType#getMessageSet <em>Message Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Set</em>'.
	 * @see org.omg.space.xtce.TelemetryMetaDataType#getMessageSet()
	 * @see #getTelemetryMetaDataType()
	 * @generated
	 */
	EReference getTelemetryMetaDataType_MessageSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.TelemetryMetaDataType#getStreamSet <em>Stream Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stream Set</em>'.
	 * @see org.omg.space.xtce.TelemetryMetaDataType#getStreamSet()
	 * @see #getTelemetryMetaDataType()
	 * @generated
	 */
	EReference getTelemetryMetaDataType_StreamSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.TelemetryMetaDataType#getAlgorithmSet <em>Algorithm Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algorithm Set</em>'.
	 * @see org.omg.space.xtce.TelemetryMetaDataType#getAlgorithmSet()
	 * @see #getTelemetryMetaDataType()
	 * @generated
	 */
	EReference getTelemetryMetaDataType_AlgorithmSet();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.TermType <em>Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Type</em>'.
	 * @see org.omg.space.xtce.TermType
	 * @generated
	 */
	EClass getTermType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.TermType#getCoefficient <em>Coefficient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coefficient</em>'.
	 * @see org.omg.space.xtce.TermType#getCoefficient()
	 * @see #getTermType()
	 * @generated
	 */
	EAttribute getTermType_Coefficient();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.TermType#getExponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponent</em>'.
	 * @see org.omg.space.xtce.TermType#getExponent()
	 * @see #getTermType()
	 * @generated
	 */
	EAttribute getTermType_Exponent();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.TimeAssociationType <em>Time Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Association Type</em>'.
	 * @see org.omg.space.xtce.TimeAssociationType
	 * @generated
	 */
	EClass getTimeAssociationType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.TimeAssociationType#isInterpolateTime <em>Interpolate Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolate Time</em>'.
	 * @see org.omg.space.xtce.TimeAssociationType#isInterpolateTime()
	 * @see #getTimeAssociationType()
	 * @generated
	 */
	EAttribute getTimeAssociationType_InterpolateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.TimeAssociationType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.omg.space.xtce.TimeAssociationType#getOffset()
	 * @see #getTimeAssociationType()
	 * @generated
	 */
	EAttribute getTimeAssociationType_Offset();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.TransferredToRangeVerifierType <em>Transferred To Range Verifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transferred To Range Verifier Type</em>'.
	 * @see org.omg.space.xtce.TransferredToRangeVerifierType
	 * @generated
	 */
	EClass getTransferredToRangeVerifierType();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.TransmissionConstraintListType <em>Transmission Constraint List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission Constraint List Type</em>'.
	 * @see org.omg.space.xtce.TransmissionConstraintListType
	 * @generated
	 */
	EClass getTransmissionConstraintListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.TransmissionConstraintListType#getTransmissionConstraint <em>Transmission Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transmission Constraint</em>'.
	 * @see org.omg.space.xtce.TransmissionConstraintListType#getTransmissionConstraint()
	 * @see #getTransmissionConstraintListType()
	 * @generated
	 */
	EReference getTransmissionConstraintListType_TransmissionConstraint();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.TransmissionConstraintType <em>Transmission Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission Constraint Type</em>'.
	 * @see org.omg.space.xtce.TransmissionConstraintType
	 * @generated
	 */
	EClass getTransmissionConstraintType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.TransmissionConstraintType#isSuspendable <em>Suspendable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspendable</em>'.
	 * @see org.omg.space.xtce.TransmissionConstraintType#isSuspendable()
	 * @see #getTransmissionConstraintType()
	 * @generated
	 */
	EAttribute getTransmissionConstraintType_Suspendable();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.TransmissionConstraintType#getTimeOut <em>Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Out</em>'.
	 * @see org.omg.space.xtce.TransmissionConstraintType#getTimeOut()
	 * @see #getTransmissionConstraintType()
	 * @generated
	 */
	EAttribute getTransmissionConstraintType_TimeOut();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.TriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Type</em>'.
	 * @see org.omg.space.xtce.TriggerType
	 * @generated
	 */
	EClass getTriggerType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.TriggerType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.omg.space.xtce.TriggerType#getGroup()
	 * @see #getTriggerType()
	 * @generated
	 */
	EAttribute getTriggerType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.TriggerType#getParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Ref</em>'.
	 * @see org.omg.space.xtce.TriggerType#getParameterRef()
	 * @see #getTriggerType()
	 * @generated
	 */
	EReference getTriggerType_ParameterRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.TriggerType#getTriggerFrequency <em>Trigger Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Trigger Frequency</em>'.
	 * @see org.omg.space.xtce.TriggerType#getTriggerFrequency()
	 * @see #getTriggerType()
	 * @generated
	 */
	EAttribute getTriggerType_TriggerFrequency();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.TriggerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.space.xtce.TriggerType#getName()
	 * @see #getTriggerType()
	 * @generated
	 */
	EAttribute getTriggerType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.TriggerType#getTriggerRate <em>Trigger Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Rate</em>'.
	 * @see org.omg.space.xtce.TriggerType#getTriggerRate()
	 * @see #getTriggerType()
	 * @generated
	 */
	EAttribute getTriggerType_TriggerRate();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.UnitSetType <em>Unit Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Set Type</em>'.
	 * @see org.omg.space.xtce.UnitSetType
	 * @generated
	 */
	EClass getUnitSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.UnitSetType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit</em>'.
	 * @see org.omg.space.xtce.UnitSetType#getUnit()
	 * @see #getUnitSetType()
	 * @generated
	 */
	EReference getUnitSetType_Unit();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Type</em>'.
	 * @see org.omg.space.xtce.UnitType
	 * @generated
	 */
	EClass getUnitType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.space.xtce.UnitType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.omg.space.xtce.UnitType#getMixed()
	 * @see #getUnitType()
	 * @generated
	 */
	EAttribute getUnitType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.UnitType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.omg.space.xtce.UnitType#getDescription()
	 * @see #getUnitType()
	 * @generated
	 */
	EAttribute getUnitType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.UnitType#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see org.omg.space.xtce.UnitType#getFactor()
	 * @see #getUnitType()
	 * @generated
	 */
	EAttribute getUnitType_Factor();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.UnitType#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see org.omg.space.xtce.UnitType#getPower()
	 * @see #getUnitType()
	 * @generated
	 */
	EAttribute getUnitType_Power();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ValidRangeType <em>Valid Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Range Type</em>'.
	 * @see org.omg.space.xtce.ValidRangeType
	 * @generated
	 */
	EClass getValidRangeType();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.ValueEnumerationType <em>Value Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Enumeration Type</em>'.
	 * @see org.omg.space.xtce.ValueEnumerationType
	 * @generated
	 */
	EClass getValueEnumerationType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ValueEnumerationType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.omg.space.xtce.ValueEnumerationType#getLabel()
	 * @see #getValueEnumerationType()
	 * @generated
	 */
	EAttribute getValueEnumerationType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.space.xtce.ValueEnumerationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.space.xtce.ValueEnumerationType#getValue()
	 * @see #getValueEnumerationType()
	 * @generated
	 */
	EAttribute getValueEnumerationType_Value();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.VariableFrameStreamType <em>Variable Frame Stream Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Frame Stream Type</em>'.
	 * @see org.omg.space.xtce.VariableFrameStreamType
	 * @generated
	 */
	EClass getVariableFrameStreamType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.VariableFrameStreamType#getSyncStrategy <em>Sync Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sync Strategy</em>'.
	 * @see org.omg.space.xtce.VariableFrameStreamType#getSyncStrategy()
	 * @see #getVariableFrameStreamType()
	 * @generated
	 */
	EReference getVariableFrameStreamType_SyncStrategy();

	/**
	 * Returns the meta object for class '{@link org.omg.space.xtce.VerifiersType <em>Verifiers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verifiers Type</em>'.
	 * @see org.omg.space.xtce.VerifiersType
	 * @generated
	 */
	EClass getVerifiersType();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.VerifiersType#getTransferredToRangeVerifier <em>Transferred To Range Verifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transferred To Range Verifier</em>'.
	 * @see org.omg.space.xtce.VerifiersType#getTransferredToRangeVerifier()
	 * @see #getVerifiersType()
	 * @generated
	 */
	EReference getVerifiersType_TransferredToRangeVerifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.VerifiersType#getSentFromRangeVerifier <em>Sent From Range Verifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sent From Range Verifier</em>'.
	 * @see org.omg.space.xtce.VerifiersType#getSentFromRangeVerifier()
	 * @see #getVerifiersType()
	 * @generated
	 */
	EReference getVerifiersType_SentFromRangeVerifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.VerifiersType#getReceivedVerifier <em>Received Verifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Received Verifier</em>'.
	 * @see org.omg.space.xtce.VerifiersType#getReceivedVerifier()
	 * @see #getVerifiersType()
	 * @generated
	 */
	EReference getVerifiersType_ReceivedVerifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.VerifiersType#getAcceptedVerifier <em>Accepted Verifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accepted Verifier</em>'.
	 * @see org.omg.space.xtce.VerifiersType#getAcceptedVerifier()
	 * @see #getVerifiersType()
	 * @generated
	 */
	EReference getVerifiersType_AcceptedVerifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.VerifiersType#getQueuedVerifier <em>Queued Verifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Queued Verifier</em>'.
	 * @see org.omg.space.xtce.VerifiersType#getQueuedVerifier()
	 * @see #getVerifiersType()
	 * @generated
	 */
	EReference getVerifiersType_QueuedVerifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.VerifiersType#getExecutionVerifier <em>Execution Verifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Verifier</em>'.
	 * @see org.omg.space.xtce.VerifiersType#getExecutionVerifier()
	 * @see #getVerifiersType()
	 * @generated
	 */
	EReference getVerifiersType_ExecutionVerifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.space.xtce.VerifiersType#getCompleteVerifier <em>Complete Verifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complete Verifier</em>'.
	 * @see org.omg.space.xtce.VerifiersType#getCompleteVerifier()
	 * @see #getVerifiersType()
	 * @generated
	 */
	EReference getVerifiersType_CompleteVerifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.space.xtce.VerifiersType#getFailedVerifier <em>Failed Verifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Failed Verifier</em>'.
	 * @see org.omg.space.xtce.VerifiersType#getFailedVerifier()
	 * @see #getVerifiersType()
	 * @generated
	 */
	EReference getVerifiersType_FailedVerifier();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.BasisType <em>Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Basis Type</em>'.
	 * @see org.omg.space.xtce.BasisType
	 * @generated
	 */
	EEnum getBasisType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.BitOrderType <em>Bit Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bit Order Type</em>'.
	 * @see org.omg.space.xtce.BitOrderType
	 * @generated
	 */
	EEnum getBitOrderType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.CharacterWidthType <em>Character Width Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Character Width Type</em>'.
	 * @see org.omg.space.xtce.CharacterWidthType
	 * @generated
	 */
	EEnum getCharacterWidthType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.ComparisonOperatorsType <em>Comparison Operators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operators Type</em>'.
	 * @see org.omg.space.xtce.ComparisonOperatorsType
	 * @generated
	 */
	EEnum getComparisonOperatorsType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.ConsequenceLevelType <em>Consequence Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consequence Level Type</em>'.
	 * @see org.omg.space.xtce.ConsequenceLevelType
	 * @generated
	 */
	EEnum getConsequenceLevelType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.DataSourceType <em>Data Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Source Type</em>'.
	 * @see org.omg.space.xtce.DataSourceType
	 * @generated
	 */
	EEnum getDataSourceType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.EncodingType <em>Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encoding Type</em>'.
	 * @see org.omg.space.xtce.EncodingType
	 * @generated
	 */
	EEnum getEncodingType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.EncodingType2 <em>Encoding Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encoding Type2</em>'.
	 * @see org.omg.space.xtce.EncodingType2
	 * @generated
	 */
	EEnum getEncodingType2();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.EncodingType3 <em>Encoding Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encoding Type3</em>'.
	 * @see org.omg.space.xtce.EncodingType3
	 * @generated
	 */
	EEnum getEncodingType3();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.EpochTypeMember1 <em>Epoch Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Epoch Type Member1</em>'.
	 * @see org.omg.space.xtce.EpochTypeMember1
	 * @generated
	 */
	EEnum getEpochTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.FlagBitTypeType <em>Flag Bit Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flag Bit Type Type</em>'.
	 * @see org.omg.space.xtce.FlagBitTypeType
	 * @generated
	 */
	EEnum getFlagBitTypeType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.MathOperatorsType <em>Math Operators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Math Operators Type</em>'.
	 * @see org.omg.space.xtce.MathOperatorsType
	 * @generated
	 */
	EEnum getMathOperatorsType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.NotationType <em>Notation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Notation Type</em>'.
	 * @see org.omg.space.xtce.NotationType
	 * @generated
	 */
	EEnum getNotationType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.PcmTypeType <em>Pcm Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pcm Type Type</em>'.
	 * @see org.omg.space.xtce.PcmTypeType
	 * @generated
	 */
	EEnum getPcmTypeType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.RadixType <em>Radix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Radix Type</em>'.
	 * @see org.omg.space.xtce.RadixType
	 * @generated
	 */
	EEnum getRadixType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.ReferenceLocationType <em>Reference Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reference Location Type</em>'.
	 * @see org.omg.space.xtce.ReferenceLocationType
	 * @generated
	 */
	EEnum getReferenceLocationType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reference Type</em>'.
	 * @see org.omg.space.xtce.ReferenceType
	 * @generated
	 */
	EEnum getReferenceType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.ReferenceType1 <em>Reference Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reference Type1</em>'.
	 * @see org.omg.space.xtce.ReferenceType1
	 * @generated
	 */
	EEnum getReferenceType1();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.SizeInBitsType1 <em>Size In Bits Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size In Bits Type1</em>'.
	 * @see org.omg.space.xtce.SizeInBitsType1
	 * @generated
	 */
	EEnum getSizeInBitsType1();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.SizeInBitsType2 <em>Size In Bits Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size In Bits Type2</em>'.
	 * @see org.omg.space.xtce.SizeInBitsType2
	 * @generated
	 */
	EEnum getSizeInBitsType2();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see org.omg.space.xtce.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.UnitsType <em>Units Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units Type</em>'.
	 * @see org.omg.space.xtce.UnitsType
	 * @generated
	 */
	EEnum getUnitsType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.ValidationStatusType <em>Validation Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validation Status Type</em>'.
	 * @see org.omg.space.xtce.ValidationStatusType
	 * @generated
	 */
	EEnum getValidationStatusType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.VerificationToWaitForType <em>Verification To Wait For Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Verification To Wait For Type</em>'.
	 * @see org.omg.space.xtce.VerificationToWaitForType
	 * @generated
	 */
	EEnum getVerificationToWaitForType();

	/**
	 * Returns the meta object for enum '{@link org.omg.space.xtce.VerifierToTriggerOnType <em>Verifier To Trigger On Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Verifier To Trigger On Type</em>'.
	 * @see org.omg.space.xtce.VerifierToTriggerOnType
	 * @generated
	 */
	EEnum getVerifierToTriggerOnType();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.BasisType <em>Basis Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Basis Type Object</em>'.
	 * @see org.omg.space.xtce.BasisType
	 * @model instanceClass="org.omg.space.xtce.BasisType"
	 *        extendedMetaData="name='basis_._type:Object' baseType='basis_._type'"
	 * @generated
	 */
	EDataType getBasisTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Binary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Binary Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='BinaryType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getBinaryType();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.BitOrderType <em>Bit Order Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bit Order Type Object</em>'.
	 * @see org.omg.space.xtce.BitOrderType
	 * @model instanceClass="org.omg.space.xtce.BitOrderType"
	 *        extendedMetaData="name='bitOrder_._type:Object' baseType='bitOrder_._type'"
	 * @generated
	 */
	EDataType getBitOrderTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.CharacterWidthType <em>Character Width Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Character Width Type Object</em>'.
	 * @see org.omg.space.xtce.CharacterWidthType
	 * @model instanceClass="org.omg.space.xtce.CharacterWidthType"
	 *        extendedMetaData="name='characterWidth_._type:Object' baseType='characterWidth_._type'"
	 * @generated
	 */
	EDataType getCharacterWidthTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.ComparisonOperatorsType <em>Comparison Operators Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Comparison Operators Type Object</em>'.
	 * @see org.omg.space.xtce.ComparisonOperatorsType
	 * @model instanceClass="org.omg.space.xtce.ComparisonOperatorsType"
	 *        extendedMetaData="name='ComparisonOperatorsType:Object' baseType='ComparisonOperatorsType'"
	 * @generated
	 */
	EDataType getComparisonOperatorsTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.ConsequenceLevelType <em>Consequence Level Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Consequence Level Type Object</em>'.
	 * @see org.omg.space.xtce.ConsequenceLevelType
	 * @model instanceClass="org.omg.space.xtce.ConsequenceLevelType"
	 *        extendedMetaData="name='consequenceLevel_._type:Object' baseType='consequenceLevel_._type'"
	 * @generated
	 */
	EDataType getConsequenceLevelTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.DataSourceType <em>Data Source Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Source Type Object</em>'.
	 * @see org.omg.space.xtce.DataSourceType
	 * @model instanceClass="org.omg.space.xtce.DataSourceType"
	 *        extendedMetaData="name='dataSource_._type:Object' baseType='dataSource_._type'"
	 * @generated
	 */
	EDataType getDataSourceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.EncodingType2 <em>Encoding Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Encoding Type Object</em>'.
	 * @see org.omg.space.xtce.EncodingType2
	 * @model instanceClass="org.omg.space.xtce.EncodingType2"
	 *        extendedMetaData="name='encoding_._1_._type:Object' baseType='encoding_._1_._type'"
	 * @generated
	 */
	EDataType getEncodingTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.EncodingType <em>Encoding Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Encoding Type Object1</em>'.
	 * @see org.omg.space.xtce.EncodingType
	 * @model instanceClass="org.omg.space.xtce.EncodingType"
	 *        extendedMetaData="name='encoding_._type:Object' baseType='encoding_._type'"
	 * @generated
	 */
	EDataType getEncodingTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.EncodingType3 <em>Encoding Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Encoding Type Object2</em>'.
	 * @see org.omg.space.xtce.EncodingType3
	 * @model instanceClass="org.omg.space.xtce.EncodingType3"
	 *        extendedMetaData="name='encoding_._2_._type:Object' baseType='encoding_._2_._type'"
	 * @generated
	 */
	EDataType getEncodingTypeObject2();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Epoch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Epoch Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='EpochType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#date EpochType_._member_._1'"
	 * @generated
	 */
	EDataType getEpochType();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.EpochTypeMember1 <em>Epoch Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Epoch Type Member1 Object</em>'.
	 * @see org.omg.space.xtce.EpochTypeMember1
	 * @model instanceClass="org.omg.space.xtce.EpochTypeMember1"
	 *        extendedMetaData="name='EpochType_._member_._1:Object' baseType='EpochType_._member_._1'"
	 * @generated
	 */
	EDataType getEpochTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Fixed Integer Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fixed Integer Value Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='FixedIntegerValueType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#integer HexadecimalType OctalType BinaryType'"
	 * @generated
	 */
	EDataType getFixedIntegerValueType();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.FlagBitTypeType <em>Flag Bit Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Flag Bit Type Type Object</em>'.
	 * @see org.omg.space.xtce.FlagBitTypeType
	 * @model instanceClass="org.omg.space.xtce.FlagBitTypeType"
	 *        extendedMetaData="name='flagBitType_._type:Object' baseType='flagBitType_._type'"
	 * @generated
	 */
	EDataType getFlagBitTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hexadecimal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hexadecimal Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HexadecimalType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getHexadecimalType();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.MathOperatorsType <em>Math Operators Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Math Operators Type Object</em>'.
	 * @see org.omg.space.xtce.MathOperatorsType
	 * @model instanceClass="org.omg.space.xtce.MathOperatorsType"
	 *        extendedMetaData="name='MathOperatorsType:Object' baseType='MathOperatorsType'"
	 * @generated
	 */
	EDataType getMathOperatorsTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Reference Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='NameReferenceType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getNameReferenceType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='NameType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getNameType();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.NotationType <em>Notation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Notation Type Object</em>'.
	 * @see org.omg.space.xtce.NotationType
	 * @model instanceClass="org.omg.space.xtce.NotationType"
	 *        extendedMetaData="name='notation_._type:Object' baseType='notation_._type'"
	 * @generated
	 */
	EDataType getNotationTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Octal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Octal Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='OctalType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getOctalType();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.PcmTypeType <em>Pcm Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pcm Type Type Object</em>'.
	 * @see org.omg.space.xtce.PcmTypeType
	 * @model instanceClass="org.omg.space.xtce.PcmTypeType"
	 *        extendedMetaData="name='pcmType_._type:Object' baseType='pcmType_._type'"
	 * @generated
	 */
	EDataType getPcmTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.RadixType <em>Radix Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Radix Type Object</em>'.
	 * @see org.omg.space.xtce.RadixType
	 * @model instanceClass="org.omg.space.xtce.RadixType"
	 *        extendedMetaData="name='RadixType:Object' baseType='RadixType'"
	 * @generated
	 */
	EDataType getRadixTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.ReferenceLocationType <em>Reference Location Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reference Location Type Object</em>'.
	 * @see org.omg.space.xtce.ReferenceLocationType
	 * @model instanceClass="org.omg.space.xtce.ReferenceLocationType"
	 *        extendedMetaData="name='referenceLocation_._type:Object' baseType='referenceLocation_._type'"
	 * @generated
	 */
	EDataType getReferenceLocationTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.ReferenceType <em>Reference Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reference Type Object</em>'.
	 * @see org.omg.space.xtce.ReferenceType
	 * @model instanceClass="org.omg.space.xtce.ReferenceType"
	 *        extendedMetaData="name='reference_._type:Object' baseType='reference_._type'"
	 * @generated
	 */
	EDataType getReferenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.ReferenceType1 <em>Reference Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reference Type Object1</em>'.
	 * @see org.omg.space.xtce.ReferenceType1
	 * @model instanceClass="org.omg.space.xtce.ReferenceType1"
	 *        extendedMetaData="name='reference_._1_._type:Object' baseType='reference_._1_._type'"
	 * @generated
	 */
	EDataType getReferenceTypeObject1();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.Duration <em>Relative Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Relative Time Type</em>'.
	 * @see javax.xml.datatype.Duration
	 * @model instanceClass="javax.xml.datatype.Duration"
	 *        extendedMetaData="name='RelativeTimeType' baseType='http://www.eclipse.org/emf/2003/XMLType#duration'"
	 * @generated
	 */
	EDataType getRelativeTimeType();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.SizeInBitsType1 <em>Size In Bits Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Size In Bits Type Object</em>'.
	 * @see org.omg.space.xtce.SizeInBitsType1
	 * @model instanceClass="org.omg.space.xtce.SizeInBitsType1"
	 *        extendedMetaData="name='sizeInBits_._type:Object' baseType='sizeInBits_._type'"
	 * @generated
	 */
	EDataType getSizeInBitsTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.SizeInBitsType2 <em>Size In Bits Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Size In Bits Type Object1</em>'.
	 * @see org.omg.space.xtce.SizeInBitsType2
	 * @model instanceClass="org.omg.space.xtce.SizeInBitsType2"
	 *        extendedMetaData="name='sizeInBits_._1_._type:Object' baseType='sizeInBits_._1_._type'"
	 * @generated
	 */
	EDataType getSizeInBitsTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see org.omg.space.xtce.TypeType
	 * @model instanceClass="org.omg.space.xtce.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.UnitsType <em>Units Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Units Type Object</em>'.
	 * @see org.omg.space.xtce.UnitsType
	 * @model instanceClass="org.omg.space.xtce.UnitsType"
	 *        extendedMetaData="name='units_._type:Object' baseType='units_._type'"
	 * @generated
	 */
	EDataType getUnitsTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.ValidationStatusType <em>Validation Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Validation Status Type Object</em>'.
	 * @see org.omg.space.xtce.ValidationStatusType
	 * @model instanceClass="org.omg.space.xtce.ValidationStatusType"
	 *        extendedMetaData="name='validationStatus_._type:Object' baseType='validationStatus_._type'"
	 * @generated
	 */
	EDataType getValidationStatusTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.VerificationToWaitForType <em>Verification To Wait For Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Verification To Wait For Type Object</em>'.
	 * @see org.omg.space.xtce.VerificationToWaitForType
	 * @model instanceClass="org.omg.space.xtce.VerificationToWaitForType"
	 *        extendedMetaData="name='verificationToWaitFor_._type:Object' baseType='verificationToWaitFor_._type'"
	 * @generated
	 */
	EDataType getVerificationToWaitForTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.space.xtce.VerifierToTriggerOnType <em>Verifier To Trigger On Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Verifier To Trigger On Type Object</em>'.
	 * @see org.omg.space.xtce.VerifierToTriggerOnType
	 * @model instanceClass="org.omg.space.xtce.VerifierToTriggerOnType"
	 *        extendedMetaData="name='verifierToTriggerOn_._type:Object' baseType='verifierToTriggerOn_._type'"
	 * @generated
	 */
	EDataType getVerifierToTriggerOnTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XtceFactory getXtceFactory();

} //XtcePackage
