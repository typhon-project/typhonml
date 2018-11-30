/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.KeyValueDB;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Key Value DB</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KeyValueDBTest extends DatabaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KeyValueDBTest.class);
	}

	/**
	 * Constructs a new Key Value DB test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueDBTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Key Value DB test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected KeyValueDB getFixture() {
		return (KeyValueDB)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createKeyValueDB());
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

} //KeyValueDBTest
