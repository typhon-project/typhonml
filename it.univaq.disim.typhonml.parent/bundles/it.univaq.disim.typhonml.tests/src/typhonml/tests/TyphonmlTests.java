/**
 */
package typhonml.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>typhonml</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TyphonmlTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new TyphonmlTests("typhonml Tests");
		suite.addTestSuite(AddEntityTest.class);
		suite.addTestSuite(EntityTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TyphonmlTests(String name) {
		super(name);
	}

} //TyphonmlTests