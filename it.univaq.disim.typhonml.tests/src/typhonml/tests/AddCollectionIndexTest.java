/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.AddCollectionIndex;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Add Collection Index</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddCollectionIndexTest extends ChangeOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AddCollectionIndexTest.class);
	}

	/**
	 * Constructs a new Add Collection Index test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddCollectionIndexTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Add Collection Index test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AddCollectionIndex getFixture() {
		return (AddCollectionIndex)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createAddCollectionIndex());
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

} //AddCollectionIndexTest
