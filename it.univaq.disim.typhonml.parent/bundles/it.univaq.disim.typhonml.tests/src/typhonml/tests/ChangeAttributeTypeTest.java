/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.ChangeAttributeType;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Change Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChangeAttributeTypeTest extends ChangeOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChangeAttributeTypeTest.class);
	}

	/**
	 * Constructs a new Change Attribute Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeAttributeTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Change Attribute Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChangeAttributeType getFixture() {
		return (ChangeAttributeType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createChangeAttributeType());
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

} //ChangeAttributeTypeTest
