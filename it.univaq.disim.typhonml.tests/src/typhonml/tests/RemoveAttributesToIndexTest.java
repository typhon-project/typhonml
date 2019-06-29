/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.RemoveAttributesToIndex;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Remove Attributes To Index</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoveAttributesToIndexTest extends ChangeOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RemoveAttributesToIndexTest.class);
	}

	/**
	 * Constructs a new Remove Attributes To Index test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveAttributesToIndexTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Remove Attributes To Index test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RemoveAttributesToIndex getFixture() {
		return (RemoveAttributesToIndex)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createRemoveAttributesToIndex());
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

} //RemoveAttributesToIndexTest
