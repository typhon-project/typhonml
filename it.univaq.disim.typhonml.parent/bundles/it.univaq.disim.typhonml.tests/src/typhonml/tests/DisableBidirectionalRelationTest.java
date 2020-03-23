/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.DisableBidirectionalRelation;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Disable Bidirectional Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DisableBidirectionalRelationTest extends ChangeOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DisableBidirectionalRelationTest.class);
	}

	/**
	 * Constructs a new Disable Bidirectional Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableBidirectionalRelationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Disable Bidirectional Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DisableBidirectionalRelation getFixture() {
		return (DisableBidirectionalRelation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createDisableBidirectionalRelation());
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

} //DisableBidirectionalRelationTest
