/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.AddPrimitiveDataTypeAttribute;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Add Primitive Data Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddPrimitiveDataTypeAttributeTest extends AddAttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AddPrimitiveDataTypeAttributeTest.class);
	}

	/**
	 * Constructs a new Add Primitive Data Type Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddPrimitiveDataTypeAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Add Primitive Data Type Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AddPrimitiveDataTypeAttribute getFixture() {
		return (AddPrimitiveDataTypeAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createAddPrimitiveDataTypeAttribute());
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

} //AddPrimitiveDataTypeAttributeTest
