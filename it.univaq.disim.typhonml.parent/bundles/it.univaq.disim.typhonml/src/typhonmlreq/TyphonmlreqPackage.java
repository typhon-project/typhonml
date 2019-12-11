/**
 */
package typhonmlreq;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see typhonmlreq.TyphonmlreqFactory
 * @model kind="package"
 * @generated
 */
public interface TyphonmlreqPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "typhonmlreq";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.typhon.dsls.typhonml.req";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "typhonmlreq";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TyphonmlreqPackage eINSTANCE = typhonmlreq.impl.TyphonmlreqPackageImpl.init();

	/**
	 * The meta object id for the '{@link typhonmlreq.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonmlreq.impl.NamedElementImpl
	 * @see typhonmlreq.impl.TyphonmlreqPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__IMPORTED_NAMESPACE = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link typhonmlreq.impl.ModelReqImpl <em>Model Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonmlreq.impl.ModelReqImpl
	 * @see typhonmlreq.impl.TyphonmlreqPackageImpl#getModelReq()
	 * @generated
	 */
	int MODEL_REQ = 1;

	/**
	 * The feature id for the '<em><b>Db Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REQ__DB_TYPES = 0;

	/**
	 * The number of structural features of the '<em>Model Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REQ_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REQ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link typhonmlreq.impl.DBTypeImpl <em>DB Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonmlreq.impl.DBTypeImpl
	 * @see typhonmlreq.impl.TyphonmlreqPackageImpl#getDBType()
	 * @generated
	 */
	int DB_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TYPE__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Frequirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TYPE__FREQUIREMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nfrequirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TYPE__NFREQUIREMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DB Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DB Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonmlreq.impl.FRequirementImpl <em>FRequirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonmlreq.impl.FRequirementImpl
	 * @see typhonmlreq.impl.TyphonmlreqPackageImpl#getFRequirement()
	 * @generated
	 */
	int FREQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUIREMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUIREMENT__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUIREMENT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FRequirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUIREMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FRequirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUIREMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonmlreq.impl.NFRequirementImpl <em>NF Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonmlreq.impl.NFRequirementImpl
	 * @see typhonmlreq.impl.TyphonmlreqPackageImpl#getNFRequirement()
	 * @generated
	 */
	int NF_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NF_REQUIREMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NF_REQUIREMENT__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NF_REQUIREMENT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NF Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NF_REQUIREMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>NF Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NF_REQUIREMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link typhonmlreq.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see typhonmlreq.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link typhonmlreq.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see typhonmlreq.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link typhonmlreq.NamedElement#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see typhonmlreq.NamedElement#getImportedNamespace()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link typhonmlreq.ModelReq <em>Model Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Req</em>'.
	 * @see typhonmlreq.ModelReq
	 * @generated
	 */
	EClass getModelReq();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonmlreq.ModelReq#getDbTypes <em>Db Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Db Types</em>'.
	 * @see typhonmlreq.ModelReq#getDbTypes()
	 * @see #getModelReq()
	 * @generated
	 */
	EReference getModelReq_DbTypes();

	/**
	 * Returns the meta object for class '{@link typhonmlreq.DBType <em>DB Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Type</em>'.
	 * @see typhonmlreq.DBType
	 * @generated
	 */
	EClass getDBType();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonmlreq.DBType#getFrequirements <em>Frequirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frequirements</em>'.
	 * @see typhonmlreq.DBType#getFrequirements()
	 * @see #getDBType()
	 * @generated
	 */
	EReference getDBType_Frequirements();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonmlreq.DBType#getNfrequirements <em>Nfrequirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nfrequirements</em>'.
	 * @see typhonmlreq.DBType#getNfrequirements()
	 * @see #getDBType()
	 * @generated
	 */
	EReference getDBType_Nfrequirements();

	/**
	 * Returns the meta object for class '{@link typhonmlreq.FRequirement <em>FRequirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FRequirement</em>'.
	 * @see typhonmlreq.FRequirement
	 * @generated
	 */
	EClass getFRequirement();

	/**
	 * Returns the meta object for the attribute '{@link typhonmlreq.FRequirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see typhonmlreq.FRequirement#getDescription()
	 * @see #getFRequirement()
	 * @generated
	 */
	EAttribute getFRequirement_Description();

	/**
	 * Returns the meta object for class '{@link typhonmlreq.NFRequirement <em>NF Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NF Requirement</em>'.
	 * @see typhonmlreq.NFRequirement
	 * @generated
	 */
	EClass getNFRequirement();

	/**
	 * Returns the meta object for the attribute '{@link typhonmlreq.NFRequirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see typhonmlreq.NFRequirement#getDescription()
	 * @see #getNFRequirement()
	 * @generated
	 */
	EAttribute getNFRequirement_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TyphonmlreqFactory getTyphonmlreqFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link typhonmlreq.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonmlreq.impl.NamedElementImpl
		 * @see typhonmlreq.impl.TyphonmlreqPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__IMPORTED_NAMESPACE = eINSTANCE.getNamedElement_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link typhonmlreq.impl.ModelReqImpl <em>Model Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonmlreq.impl.ModelReqImpl
		 * @see typhonmlreq.impl.TyphonmlreqPackageImpl#getModelReq()
		 * @generated
		 */
		EClass MODEL_REQ = eINSTANCE.getModelReq();

		/**
		 * The meta object literal for the '<em><b>Db Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REQ__DB_TYPES = eINSTANCE.getModelReq_DbTypes();

		/**
		 * The meta object literal for the '{@link typhonmlreq.impl.DBTypeImpl <em>DB Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonmlreq.impl.DBTypeImpl
		 * @see typhonmlreq.impl.TyphonmlreqPackageImpl#getDBType()
		 * @generated
		 */
		EClass DB_TYPE = eINSTANCE.getDBType();

		/**
		 * The meta object literal for the '<em><b>Frequirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_TYPE__FREQUIREMENTS = eINSTANCE.getDBType_Frequirements();

		/**
		 * The meta object literal for the '<em><b>Nfrequirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_TYPE__NFREQUIREMENTS = eINSTANCE.getDBType_Nfrequirements();

		/**
		 * The meta object literal for the '{@link typhonmlreq.impl.FRequirementImpl <em>FRequirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonmlreq.impl.FRequirementImpl
		 * @see typhonmlreq.impl.TyphonmlreqPackageImpl#getFRequirement()
		 * @generated
		 */
		EClass FREQUIREMENT = eINSTANCE.getFRequirement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUIREMENT__DESCRIPTION = eINSTANCE.getFRequirement_Description();

		/**
		 * The meta object literal for the '{@link typhonmlreq.impl.NFRequirementImpl <em>NF Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonmlreq.impl.NFRequirementImpl
		 * @see typhonmlreq.impl.TyphonmlreqPackageImpl#getNFRequirement()
		 * @generated
		 */
		EClass NF_REQUIREMENT = eINSTANCE.getNFRequirement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NF_REQUIREMENT__DESCRIPTION = eINSTANCE.getNFRequirement_Description();

	}

} //TyphonmlreqPackage
