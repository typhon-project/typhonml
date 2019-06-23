/**
 */
package typhonml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import typhonml.NlpTask;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Nlp Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NlpTaskTest extends TestCase {

	/**
	 * The fixture for this Nlp Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NlpTask fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NlpTaskTest.class);
	}

	/**
	 * Constructs a new Nlp Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NlpTaskTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Nlp Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NlpTask fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Nlp Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NlpTask getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createNlpTask());
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

} //NlpTaskTest
