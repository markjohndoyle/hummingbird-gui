/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.tests;

import junit.textui.TestRunner;

import org.omg.space.xtce.FixedFrameSyncStrategyType;
import org.omg.space.xtce.XtceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fixed Frame Sync Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FixedFrameSyncStrategyTypeTest extends SyncStrategyTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FixedFrameSyncStrategyTypeTest.class);
	}

	/**
	 * Constructs a new Fixed Frame Sync Strategy Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedFrameSyncStrategyTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fixed Frame Sync Strategy Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FixedFrameSyncStrategyType getFixture() {
		return (FixedFrameSyncStrategyType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XtceFactory.eINSTANCE.createFixedFrameSyncStrategyType());
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

} //FixedFrameSyncStrategyTypeTest
