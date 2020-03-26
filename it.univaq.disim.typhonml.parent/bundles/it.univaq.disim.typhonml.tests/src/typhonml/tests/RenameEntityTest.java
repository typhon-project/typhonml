/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.RenameEntity;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rename Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RenameEntityTest extends ChangeOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RenameEntityTest.class);
	}

	/**
	 * Constructs a new Rename Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rename Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RenameEntity getFixture() {
		return (RenameEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createRenameEntity());
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

} //RenameEntityTest
