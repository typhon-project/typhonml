/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.ChangePrimitiveDataTypeAttribute;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Change Primitive Data Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChangePrimitiveDataTypeAttributeTest extends ChangeAttributeTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChangePrimitiveDataTypeAttributeTest.class);
	}

	/**
	 * Constructs a new Change Primitive Data Type Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangePrimitiveDataTypeAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Change Primitive Data Type Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChangePrimitiveDataTypeAttribute getFixture() {
		return (ChangePrimitiveDataTypeAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createChangePrimitiveDataTypeAttribute());
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

} //ChangePrimitiveDataTypeAttributeTest
