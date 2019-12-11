/**
 */
package typhonmlreq.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import typhonmlreq.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TyphonmlreqFactoryImpl extends EFactoryImpl implements TyphonmlreqFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TyphonmlreqFactory init() {
		try {
			TyphonmlreqFactory theTyphonmlreqFactory = (TyphonmlreqFactory)EPackage.Registry.INSTANCE.getEFactory(TyphonmlreqPackage.eNS_URI);
			if (theTyphonmlreqFactory != null) {
				return theTyphonmlreqFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TyphonmlreqFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TyphonmlreqFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TyphonmlreqPackage.MODEL_REQ: return createModelReq();
			case TyphonmlreqPackage.DB_TYPE: return createDBType();
			case TyphonmlreqPackage.FREQUIREMENT: return createFRequirement();
			case TyphonmlreqPackage.NF_REQUIREMENT: return createNFRequirement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelReq createModelReq() {
		ModelReqImpl modelReq = new ModelReqImpl();
		return modelReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DBType createDBType() {
		DBTypeImpl dbType = new DBTypeImpl();
		return dbType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FRequirement createFRequirement() {
		FRequirementImpl fRequirement = new FRequirementImpl();
		return fRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NFRequirement createNFRequirement() {
		NFRequirementImpl nfRequirement = new NFRequirementImpl();
		return nfRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TyphonmlreqPackage getTyphonmlreqPackage() {
		return (TyphonmlreqPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TyphonmlreqPackage getPackage() {
		return TyphonmlreqPackage.eINSTANCE;
	}

} //TyphonmlreqFactoryImpl
