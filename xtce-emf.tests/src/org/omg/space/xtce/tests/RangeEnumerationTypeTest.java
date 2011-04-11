/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.tests;

import junit.textui.TestRunner;

import org.omg.space.xtce.RangeEnumerationType;
import org.omg.space.xtce.XtceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Range Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RangeEnumerationTypeTest extends DecimalRangeTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RangeEnumerationTypeTest.class);
	}

	/**
	 * Constructs a new Range Enumeration Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeEnumerationTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Range Enumeration Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RangeEnumerationType getFixture() {
		return (RangeEnumerationType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XtceFactory.eINSTANCE.createRangeEnumerationType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RangeEnumerationTypeTest
