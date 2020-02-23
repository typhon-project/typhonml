/**
 */
package typhonmlreq;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see typhonmlreq.TyphonmlreqPackage
 * @generated
 */
public interface TyphonmlreqFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TyphonmlreqFactory eINSTANCE = typhonmlreq.impl.TyphonmlreqFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Req</em>'.
	 * @generated
	 */
	ModelReq createModelReq();

	/**
	 * Returns a new object of class '<em>DB Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Type</em>'.
	 * @generated
	 */
	DBType createDBType();

	/**
	 * Returns a new object of class '<em>FRequirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FRequirement</em>'.
	 * @generated
	 */
	FRequirement createFRequirement();

	/**
	 * Returns a new object of class '<em>NF Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NF Requirement</em>'.
	 * @generated
	 */
	NFRequirement createNFRequirement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TyphonmlreqPackage getTyphonmlreqPackage();

} //TyphonmlreqFactory
