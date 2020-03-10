/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.SplitEntityVertical;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Split Entity Vertical</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SplitEntityVerticalTest extends ChangeOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SplitEntityVerticalTest.class);
	}

	/**
	 * Constructs a new Split Entity Vertical test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitEntityVerticalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Split Entity Vertical test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SplitEntityVertical getFixture() {
		return (SplitEntityVertical)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createSplitEntityVertical());
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

} //SplitEntityVerticalTest
