/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>xtce</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class XtceTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new XtceTests("xtce Tests");
		suite.addTestSuite(AlgorithmSetTypeTest.class);
		suite.addTestSuite(ANDedConditionsTypeTest.class);
		suite.addTestSuite(ArgumentListType1Test.class);
		suite.addTestSuite(ArgumentTypeSetTypeTest.class);
		suite.addTestSuite(ByteOrderTypeTest.class);
		suite.addTestSuite(CommandContainerEntryListTypeTest.class);
		suite.addTestSuite(ContainerSetTypeTest.class);
		suite.addTestSuite(DocumentRootTest.class);
		suite.addTestSuite(EntryListTypeTest.class);
		suite.addTestSuite(InputSetTypeTest.class);
		suite.addTestSuite(MetaCommandSetTypeTest.class);
		suite.addTestSuite(NumberToStringTypeTest.class);
		suite.addTestSuite(ORedConditionsTypeTest.class);
		suite.addTestSuite(ParameterSetTypeTest.class);
		suite.addTestSuite(ParameterTypeSetTypeTest.class);
		suite.addTestSuite(PropertyTypeTest.class);
		suite.addTestSuite(StreamSetTypeTest.class);
		suite.addTestSuite(TriggerTypeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtceTests(String name) {
		super(name);
	}

} //XtceTests
