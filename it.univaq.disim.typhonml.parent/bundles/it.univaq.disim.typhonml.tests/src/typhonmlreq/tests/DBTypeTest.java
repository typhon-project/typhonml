/**
 */
package typhonmlreq.tests;

import junit.textui.TestRunner;

import typhonmlreq.DBType;
import typhonmlreq.TyphonmlreqFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>DB Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DBTypeTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DBTypeTest.class);
	}

	/**
	 * Constructs a new DB Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this DB Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DBType getFixture() {
		return (DBType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlreqFactory.eINSTANCE.createDBType());
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

} //DBTypeTest
