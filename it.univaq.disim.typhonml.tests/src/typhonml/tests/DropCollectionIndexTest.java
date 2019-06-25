/**
 */
package typhonml.tests;

import junit.textui.TestRunner;

import typhonml.DropCollectionIndex;
import typhonml.TyphonmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Drop Collection Index</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DropCollectionIndexTest extends ChangeOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DropCollectionIndexTest.class);
	}

	/**
	 * Constructs a new Drop Collection Index test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropCollectionIndexTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Drop Collection Index test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DropCollectionIndex getFixture() {
		return (DropCollectionIndex)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TyphonmlFactory.eINSTANCE.createDropCollectionIndex());
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

} //DropCollectionIndexTest
