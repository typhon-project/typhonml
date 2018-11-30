/**
 */
package typhonml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import typhonml.IdSpec;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Id Spec</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdSpecTest extends TestCase {

	/**
	 * The fixture for this Id Spec test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdSpec fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IdSpecTest.class);
	}

	/**
	 * Constructs a new Id Spec test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdSpecTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Id Spec test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IdSpec fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Id Spec test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdSpec getFixture() {
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
		setFixture(TyphonmlFactory.eINSTANCE.createIdSpec());
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

} //IdSpecTest
