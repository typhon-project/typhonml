/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.GraphEdgeLabel;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Graph Edge Label</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphEdgeLabelTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GraphEdgeLabelTest.class);
	}

	/**
	 * Constructs a new Graph Edge Label test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphEdgeLabelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Graph Edge Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GraphEdgeLabel getFixture() {
		return (GraphEdgeLabel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createGraphEdgeLabel());
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

} //GraphEdgeLabelTest
