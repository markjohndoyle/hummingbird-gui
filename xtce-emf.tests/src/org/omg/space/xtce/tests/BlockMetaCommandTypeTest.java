/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.omg.space.xtce.tests;

import junit.textui.TestRunner;

import org.omg.space.xtce.BlockMetaCommandType;
import org.omg.space.xtce.XtceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Block Meta Command Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockMetaCommandTypeTest extends NameDescriptionTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BlockMetaCommandTypeTest.class);
	}

	/**
	 * Constructs a new Block Meta Command Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockMetaCommandTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Block Meta Command Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BlockMetaCommandType getFixture() {
		return (BlockMetaCommandType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XtceFactory.eINSTANCE.createBlockMetaCommandType());
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

} //BlockMetaCommandTypeTest
