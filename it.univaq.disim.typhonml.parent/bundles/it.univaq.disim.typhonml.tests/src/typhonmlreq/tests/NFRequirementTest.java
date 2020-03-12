/**
 */
package typhonmlreq.tests;

import junit.textui.TestRunner;

import typhonmlreq.NFRequirement;
import typhonmlreq.TyphonmlreqFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>NF Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NFRequirementTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NFRequirementTest.class);
	}

	/**
	 * Constructs a new NF Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFRequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this NF Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NFRequirement getFixture() {
		return (NFRequirement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlreqFactory.eINSTANCE.createNFRequirement());
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

} //NFRequirementTest
