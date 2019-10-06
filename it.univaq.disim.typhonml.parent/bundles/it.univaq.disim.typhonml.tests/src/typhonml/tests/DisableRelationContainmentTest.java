/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.DisableRelationContainment;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Disable Relation Containment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DisableRelationContainmentTest extends ChangeOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DisableRelationContainmentTest.class);
	}

	/**
	 * Constructs a new Disable Relation Containment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableRelationContainmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Disable Relation Containment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DisableRelationContainment getFixture() {
		return (DisableRelationContainment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createDisableRelationContainment());
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

} //DisableRelationContainmentTest
