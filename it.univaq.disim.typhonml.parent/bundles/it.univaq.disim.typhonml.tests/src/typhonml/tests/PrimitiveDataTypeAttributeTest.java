/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.PrimitiveDataTypeAttribute;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Primitive Data Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitiveDataTypeAttributeTest extends AttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrimitiveDataTypeAttributeTest.class);
	}

	/**
	 * Constructs a new Primitive Data Type Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataTypeAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Primitive Data Type Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PrimitiveDataTypeAttribute getFixture() {
		return (PrimitiveDataTypeAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createPrimitiveDataTypeAttribute());
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

} //PrimitiveDataTypeAttributeTest
