/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.AddAttributesToIndex;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Add Attributes To Index</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddAttributesToIndexTest extends ChangeOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AddAttributesToIndexTest.class);
	}

	/**
	 * Constructs a new Add Attributes To Index test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAttributesToIndexTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Add Attributes To Index test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AddAttributesToIndex getFixture() {
		return (AddAttributesToIndex)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createAddAttributesToIndex());
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

} //AddAttributesToIndexTest
