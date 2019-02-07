/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.RemoveAttributesToIdenfifier;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Remove Attributes To Idenfifier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoveAttributesToIdenfifierTest extends ChangeOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RemoveAttributesToIdenfifierTest.class);
	}

	/**
	 * Constructs a new Remove Attributes To Idenfifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveAttributesToIdenfifierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Remove Attributes To Idenfifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RemoveAttributesToIdenfifier getFixture() {
		return (RemoveAttributesToIdenfifier)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createRemoveAttributesToIdenfifier());
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

} //RemoveAttributesToIdenfifierTest
