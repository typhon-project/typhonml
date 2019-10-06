/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.RemoveGraphAttribute;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Remove Graph Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoveGraphAttributeTest extends ChangeOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RemoveGraphAttributeTest.class);
	}

	/**
	 * Constructs a new Remove Graph Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveGraphAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Remove Graph Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RemoveGraphAttribute getFixture() {
		return (RemoveGraphAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createRemoveGraphAttribute());
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

} //RemoveGraphAttributeTest
