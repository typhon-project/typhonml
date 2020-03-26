/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.RenameAttribute;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rename Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RenameAttributeTest extends ChangeOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RenameAttributeTest.class);
	}

	/**
	 * Constructs a new Rename Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rename Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RenameAttribute getFixture() {
		return (RenameAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createRenameAttribute());
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

} //RenameAttributeTest
