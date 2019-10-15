/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.RemoveGraphEdge;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Remove Graph Edge</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoveGraphEdgeTest extends ChangeOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RemoveGraphEdgeTest.class);
	}

	/**
	 * Constructs a new Remove Graph Edge test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveGraphEdgeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Remove Graph Edge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RemoveGraphEdge getFixture() {
		return (RemoveGraphEdge)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createRemoveGraphEdge());
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

} //RemoveGraphEdgeTest
