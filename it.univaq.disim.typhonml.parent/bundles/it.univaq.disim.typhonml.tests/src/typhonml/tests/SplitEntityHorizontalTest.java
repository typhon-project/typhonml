/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.SplitEntityHorizontal;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Split Entity Horizontal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SplitEntityHorizontalTest extends ChangeOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SplitEntityHorizontalTest.class);
	}

	/**
	 * Constructs a new Split Entity Horizontal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitEntityHorizontalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Split Entity Horizontal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SplitEntityHorizontal getFixture() {
		return (SplitEntityHorizontal)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createSplitEntityHorizontal());
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

} //SplitEntityHorizontalTest
