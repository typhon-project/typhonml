/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.EnableBidirectionalRelation;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enable Bidirectional Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnableBidirectionalRelationTest extends ChangeOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnableBidirectionalRelationTest.class);
	}

	/**
	 * Constructs a new Enable Bidirectional Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableBidirectionalRelationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Enable Bidirectional Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EnableBidirectionalRelation getFixture() {
		return (EnableBidirectionalRelation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createEnableBidirectionalRelation());
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

} //EnableBidirectionalRelationTest
