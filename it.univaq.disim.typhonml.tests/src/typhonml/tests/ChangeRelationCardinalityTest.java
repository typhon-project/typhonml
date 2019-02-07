/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.ChangeRelationCardinality;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Change Relation Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChangeRelationCardinalityTest extends ChangeOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChangeRelationCardinalityTest.class);
	}

	/**
	 * Constructs a new Change Relation Cardinality test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeRelationCardinalityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Change Relation Cardinality test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChangeRelationCardinality getFixture() {
		return (ChangeRelationCardinality)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createChangeRelationCardinality());
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

} //ChangeRelationCardinalityTest
