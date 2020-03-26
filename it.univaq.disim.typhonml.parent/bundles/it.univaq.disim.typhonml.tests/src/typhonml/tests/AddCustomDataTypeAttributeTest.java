/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.AddCustomDataTypeAttribute;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Add Custom Data Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddCustomDataTypeAttributeTest extends AddAttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AddCustomDataTypeAttributeTest.class);
	}

	/**
	 * Constructs a new Add Custom Data Type Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddCustomDataTypeAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Add Custom Data Type Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AddCustomDataTypeAttribute getFixture() {
		return (AddCustomDataTypeAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createAddCustomDataTypeAttribute());
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

} //AddCustomDataTypeAttributeTest
