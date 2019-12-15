/**
 */
package typhonml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see typhonml.TyphonmlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface TyphonmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "typhonml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.typhon.dsls.typhonml.sirius";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "typhonml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TyphonmlPackage eINSTANCE = typhonml.impl.TyphonmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link typhonml.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.ModelImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Databases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DATABASES = 0;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DATA_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Change Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CHANGE_OPERATORS = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.NamedElementImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

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
	 * The meta object id for the '{@link typhonml.impl.ChangeOperatorImpl <em>Change Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.ChangeOperatorImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getChangeOperator()
	 * @generated
	 */
	int CHANGE_OPERATOR = 2;

	/**
	 * The number of structural features of the '<em>Change Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Change Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.DataTypeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.EntityImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IMPORTED_NAMESPACE = DATA_TYPE__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fretext Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FRETEXT_ATTRIBUTES = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__RELATIONS = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Functional Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FUNCTIONAL_TAGS = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nfunctional Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NFUNCTIONAL_TAGS = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Collections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_COLLECTIONS = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_TABLES = DATA_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Key Value Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_KEY_VALUE_ELEMENTS = DATA_TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Graph Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_GRAPH_NODES = DATA_TYPE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Columns</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_COLUMNS = DATA_TYPE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link typhonml.impl.AddEntityImpl <em>Add Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.AddEntityImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getAddEntity()
	 * @generated
	 */
	int ADD_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY__IMPORTED_NAMESPACE = ENTITY__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY__ATTRIBUTES = ENTITY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Fretext Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY__FRETEXT_ATTRIBUTES = ENTITY__FRETEXT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY__RELATIONS = ENTITY__RELATIONS;

	/**
	 * The feature id for the '<em><b>Functional Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY__FUNCTIONAL_TAGS = ENTITY__FUNCTIONAL_TAGS;

	/**
	 * The feature id for the '<em><b>Nfunctional Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY__NFUNCTIONAL_TAGS = ENTITY__NFUNCTIONAL_TAGS;

	/**
	 * The number of structural features of the '<em>Add Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Collections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY___GET_COLLECTIONS = ENTITY___GET_COLLECTIONS;

	/**
	 * The operation id for the '<em>Get Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY___GET_TABLES = ENTITY___GET_TABLES;

	/**
	 * The operation id for the '<em>Get Key Value Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY___GET_KEY_VALUE_ELEMENTS = ENTITY___GET_KEY_VALUE_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Graph Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY___GET_GRAPH_NODES = ENTITY___GET_GRAPH_NODES;

	/**
	 * The operation id for the '<em>Get Columns</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY___GET_COLUMNS = ENTITY___GET_COLUMNS;

	/**
	 * The number of operations of the '<em>Add Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.RemoveEntityImpl <em>Remove Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RemoveEntityImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRemoveEntity()
	 * @generated
	 */
	int REMOVE_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Entity To Remove</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ENTITY__ENTITY_TO_REMOVE = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ENTITY_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ENTITY_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.SplitEntityImpl <em>Split Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.SplitEntityImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getSplitEntity()
	 * @generated
	 */
	int SPLIT_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Entity To Be Split</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ENTITY__ENTITY_TO_BE_SPLIT = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First New Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ENTITY__FIRST_NEW_ENTITY = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Second New Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ENTITY__SECOND_NEW_ENTITY = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Split Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ENTITY_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Split Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ENTITY_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.MigrateEntityImpl <em>Migrate Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.MigrateEntityImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getMigrateEntity()
	 * @generated
	 */
	int MIGRATE_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATE_ENTITY__ENTITY = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATE_ENTITY__NEW_DATABASE = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Migrate Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATE_ENTITY_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Migrate Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATE_ENTITY_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.MergeEntityImpl <em>Merge Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.MergeEntityImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getMergeEntity()
	 * @generated
	 */
	int MERGE_ENTITY = 7;

	/**
	 * The feature id for the '<em><b>First Entity To Merge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ENTITY__FIRST_ENTITY_TO_MERGE = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Entity To Merge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ENTITY__SECOND_ENTITY_TO_MERGE = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ENTITY__NEW_ENTITY_NAME = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Merge Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ENTITY_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Merge Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_ENTITY_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RelationImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__CARDINALITY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OPPOSITE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__IS_CONTAINMENT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.AddRelationImpl <em>Add Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.AddRelationImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getAddRelation()
	 * @generated
	 */
	int ADD_RELATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_RELATION__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_RELATION__IMPORTED_NAMESPACE = RELATION__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_RELATION__TYPE = RELATION__TYPE;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_RELATION__CARDINALITY = RELATION__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_RELATION__OPPOSITE = RELATION__OPPOSITE;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_RELATION__IS_CONTAINMENT = RELATION__IS_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Owner Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_RELATION__OWNER_ENTITY = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_RELATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.RemoveRelationImpl <em>Remove Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RemoveRelationImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRemoveRelation()
	 * @generated
	 */
	int REMOVE_RELATION = 9;

	/**
	 * The feature id for the '<em><b>Relation To Remove</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RELATION__RELATION_TO_REMOVE = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RELATION_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RELATION_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.RenameRelationImpl <em>Rename Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RenameRelationImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRenameRelation()
	 * @generated
	 */
	int RENAME_RELATION = 10;

	/**
	 * The feature id for the '<em><b>Relation To Rename</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_RELATION__RELATION_TO_RENAME = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Relation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_RELATION__NEW_RELATION_NAME = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rename Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_RELATION_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rename Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_RELATION_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.EnableRelationContainmentImpl <em>Enable Relation Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.EnableRelationContainmentImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getEnableRelationContainment()
	 * @generated
	 */
	int ENABLE_RELATION_CONTAINMENT = 11;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_RELATION_CONTAINMENT__RELATION = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enable Relation Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_RELATION_CONTAINMENT_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enable Relation Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_RELATION_CONTAINMENT_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.DisableRelationContainmentImpl <em>Disable Relation Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.DisableRelationContainmentImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getDisableRelationContainment()
	 * @generated
	 */
	int DISABLE_RELATION_CONTAINMENT = 12;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_RELATION_CONTAINMENT__RELATION = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disable Relation Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_RELATION_CONTAINMENT_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Disable Relation Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_RELATION_CONTAINMENT_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.EnableBidirectionalRelationImpl <em>Enable Bidirectional Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.EnableBidirectionalRelationImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getEnableBidirectionalRelation()
	 * @generated
	 */
	int ENABLE_BIDIRECTIONAL_RELATION = 13;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_BIDIRECTIONAL_RELATION__RELATION = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enable Bidirectional Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_BIDIRECTIONAL_RELATION_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enable Bidirectional Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_BIDIRECTIONAL_RELATION_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.DisableBidirectionalRelationImpl <em>Disable Bidirectional Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.DisableBidirectionalRelationImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getDisableBidirectionalRelation()
	 * @generated
	 */
	int DISABLE_BIDIRECTIONAL_RELATION = 14;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_BIDIRECTIONAL_RELATION__RELATION = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disable Bidirectional Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_BIDIRECTIONAL_RELATION_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Disable Bidirectional Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLE_BIDIRECTIONAL_RELATION_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.ChangeRelationCardinalityImpl <em>Change Relation Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.ChangeRelationCardinalityImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getChangeRelationCardinality()
	 * @generated
	 */
	int CHANGE_RELATION_CARDINALITY = 15;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RELATION_CARDINALITY__RELATION = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RELATION_CARDINALITY__NEW_CARDINALITY = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Relation Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RELATION_CARDINALITY_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Change Relation Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RELATION_CARDINALITY_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.AttributeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.AddAttributeImpl <em>Add Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.AddAttributeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getAddAttribute()
	 * @generated
	 */
	int ADD_ATTRIBUTE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE__IMPORTED_NAMESPACE = ATTRIBUTE__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE__TYPE = ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Owner Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE__OWNER_ENTITY = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.ChangeAttributeTypeImpl <em>Change Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.ChangeAttributeTypeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getChangeAttributeType()
	 * @generated
	 */
	int CHANGE_ATTRIBUTE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Attribute To Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_TYPE__ATTRIBUTE_TO_CHANGE = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_TYPE__NEW_TYPE = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_TYPE_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Change Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_TYPE_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.RemoveAttributeImpl <em>Remove Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RemoveAttributeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRemoveAttribute()
	 * @generated
	 */
	int REMOVE_ATTRIBUTE = 18;

	/**
	 * The feature id for the '<em><b>Attribute To Remove</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE__ATTRIBUTE_TO_REMOVE = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.RenameAttributeImpl <em>Rename Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RenameAttributeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRenameAttribute()
	 * @generated
	 */
	int RENAME_ATTRIBUTE = 19;

	/**
	 * The feature id for the '<em><b>Attribute To Rename</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ATTRIBUTE__ATTRIBUTE_TO_RENAME = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ATTRIBUTE__NEW_NAME = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rename Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ATTRIBUTE_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rename Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ATTRIBUTE_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.RenameTableImpl <em>Rename Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RenameTableImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRenameTable()
	 * @generated
	 */
	int RENAME_TABLE = 20;

	/**
	 * The feature id for the '<em><b>Table To Rename</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_TABLE__TABLE_TO_RENAME = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_TABLE__NEW_NAME = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rename Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_TABLE_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rename Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_TABLE_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.AddIndexImpl <em>Add Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.AddIndexImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getAddIndex()
	 * @generated
	 */
	int ADD_INDEX = 21;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INDEX__TABLE = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INDEX__ATTRIBUTES = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INDEX_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Add Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INDEX_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.DropIndexImpl <em>Drop Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.DropIndexImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getDropIndex()
	 * @generated
	 */
	int DROP_INDEX = 22;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX__TABLE = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drop Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Drop Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.AddAttributesToIndexImpl <em>Add Attributes To Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.AddAttributesToIndexImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getAddAttributesToIndex()
	 * @generated
	 */
	int ADD_ATTRIBUTES_TO_INDEX = 23;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTES_TO_INDEX__TABLE = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTES_TO_INDEX__ATTRIBUTES = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Attributes To Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTES_TO_INDEX_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Add Attributes To Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTES_TO_INDEX_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.RemoveAttributesToIndexImpl <em>Remove Attributes To Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RemoveAttributesToIndexImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRemoveAttributesToIndex()
	 * @generated
	 */
	int REMOVE_ATTRIBUTES_TO_INDEX = 24;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTES_TO_INDEX__TABLE = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTES_TO_INDEX__ATTRIBUTES = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove Attributes To Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTES_TO_INDEX_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Remove Attributes To Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTES_TO_INDEX_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.RenameCollectionImpl <em>Rename Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RenameCollectionImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRenameCollection()
	 * @generated
	 */
	int RENAME_COLLECTION = 25;

	/**
	 * The feature id for the '<em><b>Collection To Rename</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLLECTION__COLLECTION_TO_RENAME = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLLECTION__NEW_NAME = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rename Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLLECTION_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rename Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLLECTION_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.AddCollectionIndexImpl <em>Add Collection Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.AddCollectionIndexImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getAddCollectionIndex()
	 * @generated
	 */
	int ADD_COLLECTION_INDEX = 26;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLLECTION_INDEX__COLLECTION = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLLECTION_INDEX__ATTRIBUTES = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Collection Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLLECTION_INDEX_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Add Collection Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLLECTION_INDEX_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.DropCollectionIndexImpl <em>Drop Collection Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.DropCollectionIndexImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getDropCollectionIndex()
	 * @generated
	 */
	int DROP_COLLECTION_INDEX = 27;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_COLLECTION_INDEX__COLLECTION = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drop Collection Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_COLLECTION_INDEX_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Drop Collection Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_COLLECTION_INDEX_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.GraphAttributeImpl <em>Graph Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.GraphAttributeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getGraphAttribute()
	 * @generated
	 */
	int GRAPH_ATTRIBUTE = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ATTRIBUTE__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ATTRIBUTE__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Graph Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Graph Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ATTRIBUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.AddGraphAttributeImpl <em>Add Graph Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.AddGraphAttributeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getAddGraphAttribute()
	 * @generated
	 */
	int ADD_GRAPH_ATTRIBUTE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_ATTRIBUTE__NAME = GRAPH_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_ATTRIBUTE__IMPORTED_NAMESPACE = GRAPH_ATTRIBUTE__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_ATTRIBUTE__VALUE = GRAPH_ATTRIBUTE__VALUE;

	/**
	 * The number of structural features of the '<em>Add Graph Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_ATTRIBUTE_FEATURE_COUNT = GRAPH_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add Graph Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_ATTRIBUTE_OPERATION_COUNT = GRAPH_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.RemoveGraphAttributeImpl <em>Remove Graph Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RemoveGraphAttributeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRemoveGraphAttribute()
	 * @generated
	 */
	int REMOVE_GRAPH_ATTRIBUTE = 29;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_GRAPH_ATTRIBUTE__NODE = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Graph Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_GRAPH_ATTRIBUTE_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove Graph Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_GRAPH_ATTRIBUTE_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.GraphEdgeImpl <em>Graph Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.GraphEdgeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getGraphEdge()
	 * @generated
	 */
	int GRAPH_EDGE = 55;

	/**
	 * The meta object id for the '{@link typhonml.impl.AddGraphEdgeImpl <em>Add Graph Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.AddGraphEdgeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getAddGraphEdge()
	 * @generated
	 */
	int ADD_GRAPH_EDGE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_EDGE__NAME = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_EDGE__IMPORTED_NAMESPACE = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_EDGE__FROM = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_EDGE__TO = CHANGE_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_EDGE__LABELS = CHANGE_OPERATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Add Graph Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_EDGE_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Add Graph Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_EDGE_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.RemoveGraphEdgeImpl <em>Remove Graph Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RemoveGraphEdgeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRemoveGraphEdge()
	 * @generated
	 */
	int REMOVE_GRAPH_EDGE = 31;

	/**
	 * The feature id for the '<em><b>Graph Edge To Remove</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_GRAPH_EDGE__GRAPH_EDGE_TO_REMOVE = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Graph Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_GRAPH_EDGE_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove Graph Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_GRAPH_EDGE_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.RenabeGraphEdgeLabelImpl <em>Renabe Graph Edge Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RenabeGraphEdgeLabelImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRenabeGraphEdgeLabel()
	 * @generated
	 */
	int RENABE_GRAPH_EDGE_LABEL = 32;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENABE_GRAPH_EDGE_LABEL__EDGE = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENABE_GRAPH_EDGE_LABEL__NEW_NAME = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Renabe Graph Edge Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENABE_GRAPH_EDGE_LABEL_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Renabe Graph Edge Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENABE_GRAPH_EDGE_LABEL_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.DatabaseImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.PrimitiveDataTypeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__IMPORTED_NAMESPACE = DATA_TYPE__IMPORTED_NAMESPACE;

	/**
	 * The number of structural features of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.CustomDataTypeImpl <em>Custom Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.CustomDataTypeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getCustomDataType()
	 * @generated
	 */
	int CUSTOM_DATA_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DATA_TYPE__IMPORTED_NAMESPACE = DATA_TYPE__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DATA_TYPE__ELEMENTS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Custom Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.DataTypeItemImpl <em>Data Type Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.DataTypeItemImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getDataTypeItem()
	 * @generated
	 */
	int DATA_TYPE_ITEM = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ITEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ITEM__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ITEM__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ITEM__IMPLEMENTATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Type Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ITEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Type Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ITEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.FreeTextImpl <em>Free Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.FreeTextImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getFreeText()
	 * @generated
	 */
	int FREE_TEXT = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__TASKS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Free Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Free Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.NlpTaskImpl <em>Nlp Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.NlpTaskImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getNlpTask()
	 * @generated
	 */
	int NLP_TASK = 39;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NLP_TASK__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Nlp Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NLP_TASK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nlp Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NLP_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.DataTypeImplementationPackageImpl <em>Data Type Implementation Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.DataTypeImplementationPackageImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getDataTypeImplementationPackage()
	 * @generated
	 */
	int DATA_TYPE_IMPLEMENTATION_PACKAGE = 40;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_IMPLEMENTATION_PACKAGE__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Data Type Implementation Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_IMPLEMENTATION_PACKAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Type Implementation Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_IMPLEMENTATION_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.RelationalDBImpl <em>Relational DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RelationalDBImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRelationalDB()
	 * @generated
	 */
	int RELATIONAL_DB = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__NAME = DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__IMPORTED_NAMESPACE = DATABASE__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__TABLES = DATABASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relational DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB_FEATURE_COUNT = DATABASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relational DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB_OPERATION_COUNT = DATABASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.TableImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Index Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__INDEX_SPEC = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID_SPEC = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DB = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ENTITY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.IndexSpecImpl <em>Index Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.IndexSpecImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getIndexSpec()
	 * @generated
	 */
	int INDEX_SPEC = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_SPEC__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_SPEC__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_SPEC__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_SPEC__REFERENCES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_SPEC__TABLE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Index Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_SPEC_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Index Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_SPEC_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.IdSpecImpl <em>Id Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.IdSpecImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getIdSpec()
	 * @generated
	 */
	int ID_SPEC = 47;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SPEC__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SPEC__TABLE = 1;

	/**
	 * The number of structural features of the '<em>Id Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SPEC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Id Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.DocumentDBImpl <em>Document DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.DocumentDBImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getDocumentDB()
	 * @generated
	 */
	int DOCUMENT_DB = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DB__NAME = DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DB__IMPORTED_NAMESPACE = DATABASE__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DB__COLLECTIONS = DATABASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Document DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DB_FEATURE_COUNT = DATABASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Document DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DB_OPERATION_COUNT = DATABASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.CollectionImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__ENTITY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.KeyValueDBImpl <em>Key Value DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.KeyValueDBImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getKeyValueDB()
	 * @generated
	 */
	int KEY_VALUE_DB = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_DB__NAME = DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_DB__IMPORTED_NAMESPACE = DATABASE__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_DB__ELEMENTS = DATABASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Key Value DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_DB_FEATURE_COUNT = DATABASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Key Value DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_DB_OPERATION_COUNT = DATABASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.KeyValueElementImpl <em>Key Value Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.KeyValueElementImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getKeyValueElement()
	 * @generated
	 */
	int KEY_VALUE_ELEMENT = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_ELEMENT__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_ELEMENT__KEY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_ELEMENT__VALUES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_ELEMENT__ENTITY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Key Value Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Key Value Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.GraphDBImpl <em>Graph DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.GraphDBImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getGraphDB()
	 * @generated
	 */
	int GRAPH_DB = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_DB__NAME = DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_DB__IMPORTED_NAMESPACE = DATABASE__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_DB__NODES = DATABASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_DB__EDGES = DATABASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Graph DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_DB_FEATURE_COUNT = DATABASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Graph DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_DB_OPERATION_COUNT = DATABASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.GraphNodeImpl <em>Graph Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.GraphNodeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getGraphNode()
	 * @generated
	 */
	int GRAPH_NODE = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__ENTITY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Graph Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Graph Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_EDGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_EDGE__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_EDGE__FROM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_EDGE__TO = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_EDGE__LABELS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Graph Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_EDGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Graph Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_EDGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.GraphEdgeLabelImpl <em>Graph Edge Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.GraphEdgeLabelImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getGraphEdgeLabel()
	 * @generated
	 */
	int GRAPH_EDGE_LABEL = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_EDGE_LABEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_EDGE_LABEL__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_EDGE_LABEL__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Graph Edge Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_EDGE_LABEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Graph Edge Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_EDGE_LABEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.ColumnDBImpl <em>Column DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.ColumnDBImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getColumnDB()
	 * @generated
	 */
	int COLUMN_DB = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DB__NAME = DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DB__IMPORTED_NAMESPACE = DATABASE__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DB__COLUMNS = DATABASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Column DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DB_FEATURE_COUNT = DATABASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Column DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DB_OPERATION_COUNT = DATABASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.ColumnImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ENTITY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.RenameEntityImpl <em>Rename Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RenameEntityImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRenameEntity()
	 * @generated
	 */
	int RENAME_ENTITY = 59;

	/**
	 * The feature id for the '<em><b>Entity To Rename</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ENTITY__ENTITY_TO_RENAME = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ENTITY__NEW_ENTITY_NAME = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rename Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ENTITY_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rename Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ENTITY_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.ChangeRelationContainementImpl <em>Change Relation Containement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.ChangeRelationContainementImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getChangeRelationContainement()
	 * @generated
	 */
	int CHANGE_RELATION_CONTAINEMENT = 60;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RELATION_CONTAINEMENT__RELATION = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RELATION_CONTAINEMENT__NEW_CONTAINMENT = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Relation Containement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RELATION_CONTAINEMENT_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Change Relation Containement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RELATION_CONTAINEMENT_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.SplitEntityVerticalImpl <em>Split Entity Vertical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.SplitEntityVerticalImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getSplitEntityVertical()
	 * @generated
	 */
	int SPLIT_ENTITY_VERTICAL = 61;

	/**
	 * The feature id for the '<em><b>Entity1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ENTITY_VERTICAL__ENTITY1 = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity2name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ENTITY_VERTICAL__ENTITY2NAME = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ENTITY_VERTICAL__ATTRIBUTE_LIST = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relation List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ENTITY_VERTICAL__RELATION_LIST = CHANGE_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Split Entity Vertical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ENTITY_VERTICAL_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Split Entity Vertical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ENTITY_VERTICAL_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.SplitEntityHorizontalImpl <em>Split Entity Horizontal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.SplitEntityHorizontalImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getSplitEntityHorizontal()
	 * @generated
	 */
	int SPLIT_ENTITY_HORIZONTAL = 62;

	/**
	 * The feature id for the '<em><b>Entity1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ENTITY_HORIZONTAL__ENTITY1 = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity2name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ENTITY_HORIZONTAL__ENTITY2NAME = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ENTITY_HORIZONTAL__ATTRIBUTE = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ENTITY_HORIZONTAL__EXPRESSION = CHANGE_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Split Entity Horizontal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ENTITY_HORIZONTAL_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Split Entity Horizontal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_ENTITY_HORIZONTAL_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.FunctionalTagImpl <em>Functional Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.FunctionalTagImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getFunctionalTag()
	 * @generated
	 */
	int FUNCTIONAL_TAG = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_TAG__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_TAG__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The number of structural features of the '<em>Functional Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_TAG_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Functional Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_TAG_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.NFunctionalTagImpl <em>NFunctional Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.NFunctionalTagImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getNFunctionalTag()
	 * @generated
	 */
	int NFUNCTIONAL_TAG = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFUNCTIONAL_TAG__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFUNCTIONAL_TAG__IMPORTED_NAMESPACE = NAMED_ELEMENT__IMPORTED_NAMESPACE;

	/**
	 * The number of structural features of the '<em>NFunctional Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFUNCTIONAL_TAG_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NFunctional Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFUNCTIONAL_TAG_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.Cardinality <em>Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.Cardinality
	 * @see typhonml.impl.TyphonmlPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 65;

	/**
	 * The meta object id for the '{@link typhonml.NlpTaskType <em>Nlp Task Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.NlpTaskType
	 * @see typhonml.impl.TyphonmlPackageImpl#getNlpTaskType()
	 * @generated
	 */
	int NLP_TASK_TYPE = 66;


	/**
	 * Returns the meta object for class '{@link typhonml.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see typhonml.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.Model#getDatabases <em>Databases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Databases</em>'.
	 * @see typhonml.Model#getDatabases()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Databases();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.Model#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see typhonml.Model#getDataTypes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_DataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.Model#getChangeOperators <em>Change Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Operators</em>'.
	 * @see typhonml.Model#getChangeOperators()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ChangeOperators();

	/**
	 * Returns the meta object for class '{@link typhonml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see typhonml.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see typhonml.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.NamedElement#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see typhonml.NamedElement#getImportedNamespace()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link typhonml.ChangeOperator <em>Change Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Operator</em>'.
	 * @see typhonml.ChangeOperator
	 * @generated
	 */
	EClass getChangeOperator();

	/**
	 * Returns the meta object for class '{@link typhonml.AddEntity <em>Add Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Entity</em>'.
	 * @see typhonml.AddEntity
	 * @generated
	 */
	EClass getAddEntity();

	/**
	 * Returns the meta object for class '{@link typhonml.RemoveEntity <em>Remove Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Entity</em>'.
	 * @see typhonml.RemoveEntity
	 * @generated
	 */
	EClass getRemoveEntity();

	/**
	 * Returns the meta object for the reference '{@link typhonml.RemoveEntity#getEntityToRemove <em>Entity To Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity To Remove</em>'.
	 * @see typhonml.RemoveEntity#getEntityToRemove()
	 * @see #getRemoveEntity()
	 * @generated
	 */
	EReference getRemoveEntity_EntityToRemove();

	/**
	 * Returns the meta object for class '{@link typhonml.SplitEntity <em>Split Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Entity</em>'.
	 * @see typhonml.SplitEntity
	 * @generated
	 */
	EClass getSplitEntity();

	/**
	 * Returns the meta object for the reference '{@link typhonml.SplitEntity#getEntityToBeSplit <em>Entity To Be Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity To Be Split</em>'.
	 * @see typhonml.SplitEntity#getEntityToBeSplit()
	 * @see #getSplitEntity()
	 * @generated
	 */
	EReference getSplitEntity_EntityToBeSplit();

	/**
	 * Returns the meta object for the containment reference '{@link typhonml.SplitEntity#getFirstNewEntity <em>First New Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First New Entity</em>'.
	 * @see typhonml.SplitEntity#getFirstNewEntity()
	 * @see #getSplitEntity()
	 * @generated
	 */
	EReference getSplitEntity_FirstNewEntity();

	/**
	 * Returns the meta object for the containment reference '{@link typhonml.SplitEntity#getSecondNewEntity <em>Second New Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second New Entity</em>'.
	 * @see typhonml.SplitEntity#getSecondNewEntity()
	 * @see #getSplitEntity()
	 * @generated
	 */
	EReference getSplitEntity_SecondNewEntity();

	/**
	 * Returns the meta object for class '{@link typhonml.MigrateEntity <em>Migrate Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Migrate Entity</em>'.
	 * @see typhonml.MigrateEntity
	 * @generated
	 */
	EClass getMigrateEntity();

	/**
	 * Returns the meta object for the reference '{@link typhonml.MigrateEntity#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see typhonml.MigrateEntity#getEntity()
	 * @see #getMigrateEntity()
	 * @generated
	 */
	EReference getMigrateEntity_Entity();

	/**
	 * Returns the meta object for the reference '{@link typhonml.MigrateEntity#getNewDatabase <em>New Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Database</em>'.
	 * @see typhonml.MigrateEntity#getNewDatabase()
	 * @see #getMigrateEntity()
	 * @generated
	 */
	EReference getMigrateEntity_NewDatabase();

	/**
	 * Returns the meta object for class '{@link typhonml.MergeEntity <em>Merge Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Entity</em>'.
	 * @see typhonml.MergeEntity
	 * @generated
	 */
	EClass getMergeEntity();

	/**
	 * Returns the meta object for the reference '{@link typhonml.MergeEntity#getFirstEntityToMerge <em>First Entity To Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Entity To Merge</em>'.
	 * @see typhonml.MergeEntity#getFirstEntityToMerge()
	 * @see #getMergeEntity()
	 * @generated
	 */
	EReference getMergeEntity_FirstEntityToMerge();

	/**
	 * Returns the meta object for the reference '{@link typhonml.MergeEntity#getSecondEntityToMerge <em>Second Entity To Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second Entity To Merge</em>'.
	 * @see typhonml.MergeEntity#getSecondEntityToMerge()
	 * @see #getMergeEntity()
	 * @generated
	 */
	EReference getMergeEntity_SecondEntityToMerge();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.MergeEntity#getNewEntityName <em>New Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Entity Name</em>'.
	 * @see typhonml.MergeEntity#getNewEntityName()
	 * @see #getMergeEntity()
	 * @generated
	 */
	EAttribute getMergeEntity_NewEntityName();

	/**
	 * Returns the meta object for class '{@link typhonml.AddRelation <em>Add Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Relation</em>'.
	 * @see typhonml.AddRelation
	 * @generated
	 */
	EClass getAddRelation();

	/**
	 * Returns the meta object for the reference '{@link typhonml.AddRelation#getOwnerEntity <em>Owner Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Entity</em>'.
	 * @see typhonml.AddRelation#getOwnerEntity()
	 * @see #getAddRelation()
	 * @generated
	 */
	EReference getAddRelation_OwnerEntity();

	/**
	 * Returns the meta object for class '{@link typhonml.RemoveRelation <em>Remove Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Relation</em>'.
	 * @see typhonml.RemoveRelation
	 * @generated
	 */
	EClass getRemoveRelation();

	/**
	 * Returns the meta object for the reference '{@link typhonml.RemoveRelation#getRelationToRemove <em>Relation To Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation To Remove</em>'.
	 * @see typhonml.RemoveRelation#getRelationToRemove()
	 * @see #getRemoveRelation()
	 * @generated
	 */
	EReference getRemoveRelation_RelationToRemove();

	/**
	 * Returns the meta object for class '{@link typhonml.RenameRelation <em>Rename Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Relation</em>'.
	 * @see typhonml.RenameRelation
	 * @generated
	 */
	EClass getRenameRelation();

	/**
	 * Returns the meta object for the reference '{@link typhonml.RenameRelation#getRelationToRename <em>Relation To Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation To Rename</em>'.
	 * @see typhonml.RenameRelation#getRelationToRename()
	 * @see #getRenameRelation()
	 * @generated
	 */
	EReference getRenameRelation_RelationToRename();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.RenameRelation#getNewRelationName <em>New Relation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Relation Name</em>'.
	 * @see typhonml.RenameRelation#getNewRelationName()
	 * @see #getRenameRelation()
	 * @generated
	 */
	EAttribute getRenameRelation_NewRelationName();

	/**
	 * Returns the meta object for class '{@link typhonml.EnableRelationContainment <em>Enable Relation Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enable Relation Containment</em>'.
	 * @see typhonml.EnableRelationContainment
	 * @generated
	 */
	EClass getEnableRelationContainment();

	/**
	 * Returns the meta object for the reference '{@link typhonml.EnableRelationContainment#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see typhonml.EnableRelationContainment#getRelation()
	 * @see #getEnableRelationContainment()
	 * @generated
	 */
	EReference getEnableRelationContainment_Relation();

	/**
	 * Returns the meta object for class '{@link typhonml.DisableRelationContainment <em>Disable Relation Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disable Relation Containment</em>'.
	 * @see typhonml.DisableRelationContainment
	 * @generated
	 */
	EClass getDisableRelationContainment();

	/**
	 * Returns the meta object for the reference '{@link typhonml.DisableRelationContainment#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see typhonml.DisableRelationContainment#getRelation()
	 * @see #getDisableRelationContainment()
	 * @generated
	 */
	EReference getDisableRelationContainment_Relation();

	/**
	 * Returns the meta object for class '{@link typhonml.EnableBidirectionalRelation <em>Enable Bidirectional Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enable Bidirectional Relation</em>'.
	 * @see typhonml.EnableBidirectionalRelation
	 * @generated
	 */
	EClass getEnableBidirectionalRelation();

	/**
	 * Returns the meta object for the reference '{@link typhonml.EnableBidirectionalRelation#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see typhonml.EnableBidirectionalRelation#getRelation()
	 * @see #getEnableBidirectionalRelation()
	 * @generated
	 */
	EReference getEnableBidirectionalRelation_Relation();

	/**
	 * Returns the meta object for class '{@link typhonml.DisableBidirectionalRelation <em>Disable Bidirectional Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disable Bidirectional Relation</em>'.
	 * @see typhonml.DisableBidirectionalRelation
	 * @generated
	 */
	EClass getDisableBidirectionalRelation();

	/**
	 * Returns the meta object for the reference '{@link typhonml.DisableBidirectionalRelation#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see typhonml.DisableBidirectionalRelation#getRelation()
	 * @see #getDisableBidirectionalRelation()
	 * @generated
	 */
	EReference getDisableBidirectionalRelation_Relation();

	/**
	 * Returns the meta object for class '{@link typhonml.ChangeRelationCardinality <em>Change Relation Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Relation Cardinality</em>'.
	 * @see typhonml.ChangeRelationCardinality
	 * @generated
	 */
	EClass getChangeRelationCardinality();

	/**
	 * Returns the meta object for the reference '{@link typhonml.ChangeRelationCardinality#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see typhonml.ChangeRelationCardinality#getRelation()
	 * @see #getChangeRelationCardinality()
	 * @generated
	 */
	EReference getChangeRelationCardinality_Relation();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.ChangeRelationCardinality#getNewCardinality <em>New Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Cardinality</em>'.
	 * @see typhonml.ChangeRelationCardinality#getNewCardinality()
	 * @see #getChangeRelationCardinality()
	 * @generated
	 */
	EAttribute getChangeRelationCardinality_NewCardinality();

	/**
	 * Returns the meta object for class '{@link typhonml.AddAttribute <em>Add Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Attribute</em>'.
	 * @see typhonml.AddAttribute
	 * @generated
	 */
	EClass getAddAttribute();

	/**
	 * Returns the meta object for the reference '{@link typhonml.AddAttribute#getOwnerEntity <em>Owner Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Entity</em>'.
	 * @see typhonml.AddAttribute#getOwnerEntity()
	 * @see #getAddAttribute()
	 * @generated
	 */
	EReference getAddAttribute_OwnerEntity();

	/**
	 * Returns the meta object for class '{@link typhonml.ChangeAttributeType <em>Change Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Attribute Type</em>'.
	 * @see typhonml.ChangeAttributeType
	 * @generated
	 */
	EClass getChangeAttributeType();

	/**
	 * Returns the meta object for the reference '{@link typhonml.ChangeAttributeType#getAttributeToChange <em>Attribute To Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute To Change</em>'.
	 * @see typhonml.ChangeAttributeType#getAttributeToChange()
	 * @see #getChangeAttributeType()
	 * @generated
	 */
	EReference getChangeAttributeType_AttributeToChange();

	/**
	 * Returns the meta object for the reference '{@link typhonml.ChangeAttributeType#getNewType <em>New Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Type</em>'.
	 * @see typhonml.ChangeAttributeType#getNewType()
	 * @see #getChangeAttributeType()
	 * @generated
	 */
	EReference getChangeAttributeType_NewType();

	/**
	 * Returns the meta object for class '{@link typhonml.RemoveAttribute <em>Remove Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Attribute</em>'.
	 * @see typhonml.RemoveAttribute
	 * @generated
	 */
	EClass getRemoveAttribute();

	/**
	 * Returns the meta object for the reference '{@link typhonml.RemoveAttribute#getAttributeToRemove <em>Attribute To Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute To Remove</em>'.
	 * @see typhonml.RemoveAttribute#getAttributeToRemove()
	 * @see #getRemoveAttribute()
	 * @generated
	 */
	EReference getRemoveAttribute_AttributeToRemove();

	/**
	 * Returns the meta object for class '{@link typhonml.RenameAttribute <em>Rename Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Attribute</em>'.
	 * @see typhonml.RenameAttribute
	 * @generated
	 */
	EClass getRenameAttribute();

	/**
	 * Returns the meta object for the reference '{@link typhonml.RenameAttribute#getAttributeToRename <em>Attribute To Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute To Rename</em>'.
	 * @see typhonml.RenameAttribute#getAttributeToRename()
	 * @see #getRenameAttribute()
	 * @generated
	 */
	EReference getRenameAttribute_AttributeToRename();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.RenameAttribute#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see typhonml.RenameAttribute#getNewName()
	 * @see #getRenameAttribute()
	 * @generated
	 */
	EAttribute getRenameAttribute_NewName();

	/**
	 * Returns the meta object for class '{@link typhonml.RenameTable <em>Rename Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Table</em>'.
	 * @see typhonml.RenameTable
	 * @generated
	 */
	EClass getRenameTable();

	/**
	 * Returns the meta object for the reference '{@link typhonml.RenameTable#getTableToRename <em>Table To Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table To Rename</em>'.
	 * @see typhonml.RenameTable#getTableToRename()
	 * @see #getRenameTable()
	 * @generated
	 */
	EReference getRenameTable_TableToRename();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.RenameTable#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see typhonml.RenameTable#getNewName()
	 * @see #getRenameTable()
	 * @generated
	 */
	EAttribute getRenameTable_NewName();

	/**
	 * Returns the meta object for class '{@link typhonml.AddIndex <em>Add Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Index</em>'.
	 * @see typhonml.AddIndex
	 * @generated
	 */
	EClass getAddIndex();

	/**
	 * Returns the meta object for the reference '{@link typhonml.AddIndex#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see typhonml.AddIndex#getTable()
	 * @see #getAddIndex()
	 * @generated
	 */
	EReference getAddIndex_Table();

	/**
	 * Returns the meta object for the reference list '{@link typhonml.AddIndex#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see typhonml.AddIndex#getAttributes()
	 * @see #getAddIndex()
	 * @generated
	 */
	EReference getAddIndex_Attributes();

	/**
	 * Returns the meta object for class '{@link typhonml.DropIndex <em>Drop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Index</em>'.
	 * @see typhonml.DropIndex
	 * @generated
	 */
	EClass getDropIndex();

	/**
	 * Returns the meta object for the reference '{@link typhonml.DropIndex#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see typhonml.DropIndex#getTable()
	 * @see #getDropIndex()
	 * @generated
	 */
	EReference getDropIndex_Table();

	/**
	 * Returns the meta object for class '{@link typhonml.AddAttributesToIndex <em>Add Attributes To Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Attributes To Index</em>'.
	 * @see typhonml.AddAttributesToIndex
	 * @generated
	 */
	EClass getAddAttributesToIndex();

	/**
	 * Returns the meta object for the reference '{@link typhonml.AddAttributesToIndex#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see typhonml.AddAttributesToIndex#getTable()
	 * @see #getAddAttributesToIndex()
	 * @generated
	 */
	EReference getAddAttributesToIndex_Table();

	/**
	 * Returns the meta object for the reference list '{@link typhonml.AddAttributesToIndex#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see typhonml.AddAttributesToIndex#getAttributes()
	 * @see #getAddAttributesToIndex()
	 * @generated
	 */
	EReference getAddAttributesToIndex_Attributes();

	/**
	 * Returns the meta object for class '{@link typhonml.RemoveAttributesToIndex <em>Remove Attributes To Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Attributes To Index</em>'.
	 * @see typhonml.RemoveAttributesToIndex
	 * @generated
	 */
	EClass getRemoveAttributesToIndex();

	/**
	 * Returns the meta object for the reference '{@link typhonml.RemoveAttributesToIndex#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see typhonml.RemoveAttributesToIndex#getTable()
	 * @see #getRemoveAttributesToIndex()
	 * @generated
	 */
	EReference getRemoveAttributesToIndex_Table();

	/**
	 * Returns the meta object for the reference list '{@link typhonml.RemoveAttributesToIndex#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see typhonml.RemoveAttributesToIndex#getAttributes()
	 * @see #getRemoveAttributesToIndex()
	 * @generated
	 */
	EReference getRemoveAttributesToIndex_Attributes();

	/**
	 * Returns the meta object for class '{@link typhonml.RenameCollection <em>Rename Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Collection</em>'.
	 * @see typhonml.RenameCollection
	 * @generated
	 */
	EClass getRenameCollection();

	/**
	 * Returns the meta object for the reference '{@link typhonml.RenameCollection#getCollectionToRename <em>Collection To Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collection To Rename</em>'.
	 * @see typhonml.RenameCollection#getCollectionToRename()
	 * @see #getRenameCollection()
	 * @generated
	 */
	EReference getRenameCollection_CollectionToRename();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.RenameCollection#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see typhonml.RenameCollection#getNewName()
	 * @see #getRenameCollection()
	 * @generated
	 */
	EAttribute getRenameCollection_NewName();

	/**
	 * Returns the meta object for class '{@link typhonml.AddCollectionIndex <em>Add Collection Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Collection Index</em>'.
	 * @see typhonml.AddCollectionIndex
	 * @generated
	 */
	EClass getAddCollectionIndex();

	/**
	 * Returns the meta object for the reference '{@link typhonml.AddCollectionIndex#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collection</em>'.
	 * @see typhonml.AddCollectionIndex#getCollection()
	 * @see #getAddCollectionIndex()
	 * @generated
	 */
	EReference getAddCollectionIndex_Collection();

	/**
	 * Returns the meta object for the reference list '{@link typhonml.AddCollectionIndex#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see typhonml.AddCollectionIndex#getAttributes()
	 * @see #getAddCollectionIndex()
	 * @generated
	 */
	EReference getAddCollectionIndex_Attributes();

	/**
	 * Returns the meta object for class '{@link typhonml.DropCollectionIndex <em>Drop Collection Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Collection Index</em>'.
	 * @see typhonml.DropCollectionIndex
	 * @generated
	 */
	EClass getDropCollectionIndex();

	/**
	 * Returns the meta object for the reference '{@link typhonml.DropCollectionIndex#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collection</em>'.
	 * @see typhonml.DropCollectionIndex#getCollection()
	 * @see #getDropCollectionIndex()
	 * @generated
	 */
	EReference getDropCollectionIndex_Collection();

	/**
	 * Returns the meta object for class '{@link typhonml.AddGraphAttribute <em>Add Graph Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Graph Attribute</em>'.
	 * @see typhonml.AddGraphAttribute
	 * @generated
	 */
	EClass getAddGraphAttribute();

	/**
	 * Returns the meta object for class '{@link typhonml.RemoveGraphAttribute <em>Remove Graph Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Graph Attribute</em>'.
	 * @see typhonml.RemoveGraphAttribute
	 * @generated
	 */
	EClass getRemoveGraphAttribute();

	/**
	 * Returns the meta object for the reference '{@link typhonml.RemoveGraphAttribute#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see typhonml.RemoveGraphAttribute#getNode()
	 * @see #getRemoveGraphAttribute()
	 * @generated
	 */
	EReference getRemoveGraphAttribute_Node();

	/**
	 * Returns the meta object for class '{@link typhonml.AddGraphEdge <em>Add Graph Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Graph Edge</em>'.
	 * @see typhonml.AddGraphEdge
	 * @generated
	 */
	EClass getAddGraphEdge();

	/**
	 * Returns the meta object for class '{@link typhonml.RemoveGraphEdge <em>Remove Graph Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Graph Edge</em>'.
	 * @see typhonml.RemoveGraphEdge
	 * @generated
	 */
	EClass getRemoveGraphEdge();

	/**
	 * Returns the meta object for the reference '{@link typhonml.RemoveGraphEdge#getGraphEdgeToRemove <em>Graph Edge To Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph Edge To Remove</em>'.
	 * @see typhonml.RemoveGraphEdge#getGraphEdgeToRemove()
	 * @see #getRemoveGraphEdge()
	 * @generated
	 */
	EReference getRemoveGraphEdge_GraphEdgeToRemove();

	/**
	 * Returns the meta object for class '{@link typhonml.RenabeGraphEdgeLabel <em>Renabe Graph Edge Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Renabe Graph Edge Label</em>'.
	 * @see typhonml.RenabeGraphEdgeLabel
	 * @generated
	 */
	EClass getRenabeGraphEdgeLabel();

	/**
	 * Returns the meta object for the reference '{@link typhonml.RenabeGraphEdgeLabel#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edge</em>'.
	 * @see typhonml.RenabeGraphEdgeLabel#getEdge()
	 * @see #getRenabeGraphEdgeLabel()
	 * @generated
	 */
	EReference getRenabeGraphEdgeLabel_Edge();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.RenabeGraphEdgeLabel#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see typhonml.RenabeGraphEdgeLabel#getNewName()
	 * @see #getRenabeGraphEdgeLabel()
	 * @generated
	 */
	EAttribute getRenabeGraphEdgeLabel_NewName();

	/**
	 * Returns the meta object for class '{@link typhonml.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see typhonml.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for class '{@link typhonml.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see typhonml.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link typhonml.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Type</em>'.
	 * @see typhonml.PrimitiveDataType
	 * @generated
	 */
	EClass getPrimitiveDataType();

	/**
	 * Returns the meta object for class '{@link typhonml.CustomDataType <em>Custom Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Data Type</em>'.
	 * @see typhonml.CustomDataType
	 * @generated
	 */
	EClass getCustomDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.CustomDataType#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see typhonml.CustomDataType#getElements()
	 * @see #getCustomDataType()
	 * @generated
	 */
	EReference getCustomDataType_Elements();

	/**
	 * Returns the meta object for class '{@link typhonml.DataTypeItem <em>Data Type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Item</em>'.
	 * @see typhonml.DataTypeItem
	 * @generated
	 */
	EClass getDataTypeItem();

	/**
	 * Returns the meta object for the reference '{@link typhonml.DataTypeItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see typhonml.DataTypeItem#getType()
	 * @see #getDataTypeItem()
	 * @generated
	 */
	EReference getDataTypeItem_Type();

	/**
	 * Returns the meta object for the containment reference '{@link typhonml.DataTypeItem#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation</em>'.
	 * @see typhonml.DataTypeItem#getImplementation()
	 * @see #getDataTypeItem()
	 * @generated
	 */
	EReference getDataTypeItem_Implementation();

	/**
	 * Returns the meta object for class '{@link typhonml.FreeText <em>Free Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Text</em>'.
	 * @see typhonml.FreeText
	 * @generated
	 */
	EClass getFreeText();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.FreeText#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see typhonml.FreeText#getTasks()
	 * @see #getFreeText()
	 * @generated
	 */
	EReference getFreeText_Tasks();

	/**
	 * Returns the meta object for class '{@link typhonml.NlpTask <em>Nlp Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nlp Task</em>'.
	 * @see typhonml.NlpTask
	 * @generated
	 */
	EClass getNlpTask();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.NlpTask#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see typhonml.NlpTask#getType()
	 * @see #getNlpTask()
	 * @generated
	 */
	EAttribute getNlpTask_Type();

	/**
	 * Returns the meta object for class '{@link typhonml.DataTypeImplementationPackage <em>Data Type Implementation Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Implementation Package</em>'.
	 * @see typhonml.DataTypeImplementationPackage
	 * @generated
	 */
	EClass getDataTypeImplementationPackage();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.DataTypeImplementationPackage#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see typhonml.DataTypeImplementationPackage#getLocation()
	 * @see #getDataTypeImplementationPackage()
	 * @generated
	 */
	EAttribute getDataTypeImplementationPackage_Location();

	/**
	 * Returns the meta object for class '{@link typhonml.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see typhonml.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see typhonml.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.Entity#getFretextAttributes <em>Fretext Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fretext Attributes</em>'.
	 * @see typhonml.Entity#getFretextAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_FretextAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.Entity#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see typhonml.Entity#getRelations()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Relations();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.Entity#getFunctionalTags <em>Functional Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functional Tags</em>'.
	 * @see typhonml.Entity#getFunctionalTags()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_FunctionalTags();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.Entity#getNfunctionalTags <em>Nfunctional Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nfunctional Tags</em>'.
	 * @see typhonml.Entity#getNfunctionalTags()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_NfunctionalTags();

	/**
	 * Returns the meta object for the '{@link typhonml.Entity#getCollections() <em>Get Collections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Collections</em>' operation.
	 * @see typhonml.Entity#getCollections()
	 * @generated
	 */
	EOperation getEntity__GetCollections();

	/**
	 * Returns the meta object for the '{@link typhonml.Entity#getTables() <em>Get Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tables</em>' operation.
	 * @see typhonml.Entity#getTables()
	 * @generated
	 */
	EOperation getEntity__GetTables();

	/**
	 * Returns the meta object for the '{@link typhonml.Entity#getKeyValueElements() <em>Get Key Value Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Key Value Elements</em>' operation.
	 * @see typhonml.Entity#getKeyValueElements()
	 * @generated
	 */
	EOperation getEntity__GetKeyValueElements();

	/**
	 * Returns the meta object for the '{@link typhonml.Entity#getGraphNodes() <em>Get Graph Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Graph Nodes</em>' operation.
	 * @see typhonml.Entity#getGraphNodes()
	 * @generated
	 */
	EOperation getEntity__GetGraphNodes();

	/**
	 * Returns the meta object for the '{@link typhonml.Entity#getColumns() <em>Get Columns</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Columns</em>' operation.
	 * @see typhonml.Entity#getColumns()
	 * @generated
	 */
	EOperation getEntity__GetColumns();

	/**
	 * Returns the meta object for class '{@link typhonml.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see typhonml.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link typhonml.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see typhonml.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link typhonml.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see typhonml.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link typhonml.Relation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see typhonml.Relation#getType()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Type();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.Relation#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see typhonml.Relation#getCardinality()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link typhonml.Relation#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see typhonml.Relation#getOpposite()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Opposite();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.Relation#getIsContainment <em>Is Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Containment</em>'.
	 * @see typhonml.Relation#getIsContainment()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_IsContainment();

	/**
	 * Returns the meta object for class '{@link typhonml.RelationalDB <em>Relational DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational DB</em>'.
	 * @see typhonml.RelationalDB
	 * @generated
	 */
	EClass getRelationalDB();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.RelationalDB#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see typhonml.RelationalDB#getTables()
	 * @see #getRelationalDB()
	 * @generated
	 */
	EReference getRelationalDB_Tables();

	/**
	 * Returns the meta object for class '{@link typhonml.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see typhonml.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference '{@link typhonml.Table#getIndexSpec <em>Index Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index Spec</em>'.
	 * @see typhonml.Table#getIndexSpec()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_IndexSpec();

	/**
	 * Returns the meta object for the containment reference '{@link typhonml.Table#getIdSpec <em>Id Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Spec</em>'.
	 * @see typhonml.Table#getIdSpec()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_IdSpec();

	/**
	 * Returns the meta object for the reference '{@link typhonml.Table#getDb <em>Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Db</em>'.
	 * @see typhonml.Table#getDb()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Db();

	/**
	 * Returns the meta object for the reference '{@link typhonml.Table#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see typhonml.Table#getEntity()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Entity();

	/**
	 * Returns the meta object for class '{@link typhonml.IndexSpec <em>Index Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Spec</em>'.
	 * @see typhonml.IndexSpec
	 * @generated
	 */
	EClass getIndexSpec();

	/**
	 * Returns the meta object for the reference list '{@link typhonml.IndexSpec#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see typhonml.IndexSpec#getAttributes()
	 * @see #getIndexSpec()
	 * @generated
	 */
	EReference getIndexSpec_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link typhonml.IndexSpec#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see typhonml.IndexSpec#getReferences()
	 * @see #getIndexSpec()
	 * @generated
	 */
	EReference getIndexSpec_References();

	/**
	 * Returns the meta object for the container reference '{@link typhonml.IndexSpec#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see typhonml.IndexSpec#getTable()
	 * @see #getIndexSpec()
	 * @generated
	 */
	EReference getIndexSpec_Table();

	/**
	 * Returns the meta object for class '{@link typhonml.IdSpec <em>Id Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Spec</em>'.
	 * @see typhonml.IdSpec
	 * @generated
	 */
	EClass getIdSpec();

	/**
	 * Returns the meta object for the reference list '{@link typhonml.IdSpec#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see typhonml.IdSpec#getAttributes()
	 * @see #getIdSpec()
	 * @generated
	 */
	EReference getIdSpec_Attributes();

	/**
	 * Returns the meta object for the container reference '{@link typhonml.IdSpec#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see typhonml.IdSpec#getTable()
	 * @see #getIdSpec()
	 * @generated
	 */
	EReference getIdSpec_Table();

	/**
	 * Returns the meta object for class '{@link typhonml.DocumentDB <em>Document DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document DB</em>'.
	 * @see typhonml.DocumentDB
	 * @generated
	 */
	EClass getDocumentDB();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.DocumentDB#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collections</em>'.
	 * @see typhonml.DocumentDB#getCollections()
	 * @see #getDocumentDB()
	 * @generated
	 */
	EReference getDocumentDB_Collections();

	/**
	 * Returns the meta object for class '{@link typhonml.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see typhonml.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for the reference '{@link typhonml.Collection#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see typhonml.Collection#getEntity()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Entity();

	/**
	 * Returns the meta object for class '{@link typhonml.KeyValueDB <em>Key Value DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value DB</em>'.
	 * @see typhonml.KeyValueDB
	 * @generated
	 */
	EClass getKeyValueDB();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.KeyValueDB#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see typhonml.KeyValueDB#getElements()
	 * @see #getKeyValueDB()
	 * @generated
	 */
	EReference getKeyValueDB_Elements();

	/**
	 * Returns the meta object for class '{@link typhonml.KeyValueElement <em>Key Value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Element</em>'.
	 * @see typhonml.KeyValueElement
	 * @generated
	 */
	EClass getKeyValueElement();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.KeyValueElement#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see typhonml.KeyValueElement#getKey()
	 * @see #getKeyValueElement()
	 * @generated
	 */
	EAttribute getKeyValueElement_Key();

	/**
	 * Returns the meta object for the reference list '{@link typhonml.KeyValueElement#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see typhonml.KeyValueElement#getValues()
	 * @see #getKeyValueElement()
	 * @generated
	 */
	EReference getKeyValueElement_Values();

	/**
	 * Returns the meta object for the reference '{@link typhonml.KeyValueElement#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see typhonml.KeyValueElement#getEntity()
	 * @see #getKeyValueElement()
	 * @generated
	 */
	EReference getKeyValueElement_Entity();

	/**
	 * Returns the meta object for class '{@link typhonml.GraphDB <em>Graph DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph DB</em>'.
	 * @see typhonml.GraphDB
	 * @generated
	 */
	EClass getGraphDB();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.GraphDB#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see typhonml.GraphDB#getNodes()
	 * @see #getGraphDB()
	 * @generated
	 */
	EReference getGraphDB_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.GraphDB#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see typhonml.GraphDB#getEdges()
	 * @see #getGraphDB()
	 * @generated
	 */
	EReference getGraphDB_Edges();

	/**
	 * Returns the meta object for class '{@link typhonml.GraphNode <em>Graph Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Node</em>'.
	 * @see typhonml.GraphNode
	 * @generated
	 */
	EClass getGraphNode();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.GraphNode#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see typhonml.GraphNode#getAttributes()
	 * @see #getGraphNode()
	 * @generated
	 */
	EReference getGraphNode_Attributes();

	/**
	 * Returns the meta object for the reference '{@link typhonml.GraphNode#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see typhonml.GraphNode#getEntity()
	 * @see #getGraphNode()
	 * @generated
	 */
	EReference getGraphNode_Entity();

	/**
	 * Returns the meta object for class '{@link typhonml.GraphAttribute <em>Graph Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Attribute</em>'.
	 * @see typhonml.GraphAttribute
	 * @generated
	 */
	EClass getGraphAttribute();

	/**
	 * Returns the meta object for the reference '{@link typhonml.GraphAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see typhonml.GraphAttribute#getValue()
	 * @see #getGraphAttribute()
	 * @generated
	 */
	EReference getGraphAttribute_Value();

	/**
	 * Returns the meta object for class '{@link typhonml.GraphEdge <em>Graph Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Edge</em>'.
	 * @see typhonml.GraphEdge
	 * @generated
	 */
	EClass getGraphEdge();

	/**
	 * Returns the meta object for the reference '{@link typhonml.GraphEdge#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see typhonml.GraphEdge#getFrom()
	 * @see #getGraphEdge()
	 * @generated
	 */
	EReference getGraphEdge_From();

	/**
	 * Returns the meta object for the reference '{@link typhonml.GraphEdge#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see typhonml.GraphEdge#getTo()
	 * @see #getGraphEdge()
	 * @generated
	 */
	EReference getGraphEdge_To();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.GraphEdge#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see typhonml.GraphEdge#getLabels()
	 * @see #getGraphEdge()
	 * @generated
	 */
	EReference getGraphEdge_Labels();

	/**
	 * Returns the meta object for class '{@link typhonml.GraphEdgeLabel <em>Graph Edge Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Edge Label</em>'.
	 * @see typhonml.GraphEdgeLabel
	 * @generated
	 */
	EClass getGraphEdgeLabel();

	/**
	 * Returns the meta object for the reference '{@link typhonml.GraphEdgeLabel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see typhonml.GraphEdgeLabel#getType()
	 * @see #getGraphEdgeLabel()
	 * @generated
	 */
	EReference getGraphEdgeLabel_Type();

	/**
	 * Returns the meta object for class '{@link typhonml.ColumnDB <em>Column DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column DB</em>'.
	 * @see typhonml.ColumnDB
	 * @generated
	 */
	EClass getColumnDB();

	/**
	 * Returns the meta object for the containment reference list '{@link typhonml.ColumnDB#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see typhonml.ColumnDB#getColumns()
	 * @see #getColumnDB()
	 * @generated
	 */
	EReference getColumnDB_Columns();

	/**
	 * Returns the meta object for class '{@link typhonml.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see typhonml.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the reference list '{@link typhonml.Column#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see typhonml.Column#getAttributes()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Attributes();

	/**
	 * Returns the meta object for the reference '{@link typhonml.Column#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see typhonml.Column#getEntity()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Entity();

	/**
	 * Returns the meta object for class '{@link typhonml.RenameEntity <em>Rename Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Entity</em>'.
	 * @see typhonml.RenameEntity
	 * @generated
	 */
	EClass getRenameEntity();

	/**
	 * Returns the meta object for the reference '{@link typhonml.RenameEntity#getEntityToRename <em>Entity To Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity To Rename</em>'.
	 * @see typhonml.RenameEntity#getEntityToRename()
	 * @see #getRenameEntity()
	 * @generated
	 */
	EReference getRenameEntity_EntityToRename();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.RenameEntity#getNewEntityName <em>New Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Entity Name</em>'.
	 * @see typhonml.RenameEntity#getNewEntityName()
	 * @see #getRenameEntity()
	 * @generated
	 */
	EAttribute getRenameEntity_NewEntityName();

	/**
	 * Returns the meta object for class '{@link typhonml.ChangeRelationContainement <em>Change Relation Containement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Relation Containement</em>'.
	 * @see typhonml.ChangeRelationContainement
	 * @generated
	 */
	EClass getChangeRelationContainement();

	/**
	 * Returns the meta object for the reference '{@link typhonml.ChangeRelationContainement#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see typhonml.ChangeRelationContainement#getRelation()
	 * @see #getChangeRelationContainement()
	 * @generated
	 */
	EReference getChangeRelationContainement_Relation();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.ChangeRelationContainement#getNewContainment <em>New Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Containment</em>'.
	 * @see typhonml.ChangeRelationContainement#getNewContainment()
	 * @see #getChangeRelationContainement()
	 * @generated
	 */
	EAttribute getChangeRelationContainement_NewContainment();

	/**
	 * Returns the meta object for class '{@link typhonml.SplitEntityVertical <em>Split Entity Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Entity Vertical</em>'.
	 * @see typhonml.SplitEntityVertical
	 * @generated
	 */
	EClass getSplitEntityVertical();

	/**
	 * Returns the meta object for the reference '{@link typhonml.SplitEntityVertical#getEntity1 <em>Entity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity1</em>'.
	 * @see typhonml.SplitEntityVertical#getEntity1()
	 * @see #getSplitEntityVertical()
	 * @generated
	 */
	EReference getSplitEntityVertical_Entity1();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.SplitEntityVertical#getEntity2name <em>Entity2name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity2name</em>'.
	 * @see typhonml.SplitEntityVertical#getEntity2name()
	 * @see #getSplitEntityVertical()
	 * @generated
	 */
	EAttribute getSplitEntityVertical_Entity2name();

	/**
	 * Returns the meta object for the reference list '{@link typhonml.SplitEntityVertical#getAttributeList <em>Attribute List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute List</em>'.
	 * @see typhonml.SplitEntityVertical#getAttributeList()
	 * @see #getSplitEntityVertical()
	 * @generated
	 */
	EReference getSplitEntityVertical_AttributeList();

	/**
	 * Returns the meta object for the reference list '{@link typhonml.SplitEntityVertical#getRelationList <em>Relation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relation List</em>'.
	 * @see typhonml.SplitEntityVertical#getRelationList()
	 * @see #getSplitEntityVertical()
	 * @generated
	 */
	EReference getSplitEntityVertical_RelationList();

	/**
	 * Returns the meta object for class '{@link typhonml.SplitEntityHorizontal <em>Split Entity Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Entity Horizontal</em>'.
	 * @see typhonml.SplitEntityHorizontal
	 * @generated
	 */
	EClass getSplitEntityHorizontal();

	/**
	 * Returns the meta object for the reference '{@link typhonml.SplitEntityHorizontal#getEntity1 <em>Entity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity1</em>'.
	 * @see typhonml.SplitEntityHorizontal#getEntity1()
	 * @see #getSplitEntityHorizontal()
	 * @generated
	 */
	EReference getSplitEntityHorizontal_Entity1();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.SplitEntityHorizontal#getEntity2name <em>Entity2name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity2name</em>'.
	 * @see typhonml.SplitEntityHorizontal#getEntity2name()
	 * @see #getSplitEntityHorizontal()
	 * @generated
	 */
	EAttribute getSplitEntityHorizontal_Entity2name();

	/**
	 * Returns the meta object for the reference '{@link typhonml.SplitEntityHorizontal#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see typhonml.SplitEntityHorizontal#getAttribute()
	 * @see #getSplitEntityHorizontal()
	 * @generated
	 */
	EReference getSplitEntityHorizontal_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.SplitEntityHorizontal#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see typhonml.SplitEntityHorizontal#getExpression()
	 * @see #getSplitEntityHorizontal()
	 * @generated
	 */
	EAttribute getSplitEntityHorizontal_Expression();

	/**
	 * Returns the meta object for class '{@link typhonml.FunctionalTag <em>Functional Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Tag</em>'.
	 * @see typhonml.FunctionalTag
	 * @generated
	 */
	EClass getFunctionalTag();

	/**
	 * Returns the meta object for class '{@link typhonml.NFunctionalTag <em>NFunctional Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFunctional Tag</em>'.
	 * @see typhonml.NFunctionalTag
	 * @generated
	 */
	EClass getNFunctionalTag();

	/**
	 * Returns the meta object for enum '{@link typhonml.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinality</em>'.
	 * @see typhonml.Cardinality
	 * @generated
	 */
	EEnum getCardinality();

	/**
	 * Returns the meta object for enum '{@link typhonml.NlpTaskType <em>Nlp Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nlp Task Type</em>'.
	 * @see typhonml.NlpTaskType
	 * @generated
	 */
	EEnum getNlpTaskType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TyphonmlFactory getTyphonmlFactory();

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
		 * The meta object literal for the '{@link typhonml.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.ModelImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Databases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DATABASES = eINSTANCE.getModel_Databases();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DATA_TYPES = eINSTANCE.getModel_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Change Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CHANGE_OPERATORS = eINSTANCE.getModel_ChangeOperators();

		/**
		 * The meta object literal for the '{@link typhonml.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.NamedElementImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link typhonml.impl.ChangeOperatorImpl <em>Change Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.ChangeOperatorImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getChangeOperator()
		 * @generated
		 */
		EClass CHANGE_OPERATOR = eINSTANCE.getChangeOperator();

		/**
		 * The meta object literal for the '{@link typhonml.impl.AddEntityImpl <em>Add Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.AddEntityImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getAddEntity()
		 * @generated
		 */
		EClass ADD_ENTITY = eINSTANCE.getAddEntity();

		/**
		 * The meta object literal for the '{@link typhonml.impl.RemoveEntityImpl <em>Remove Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.RemoveEntityImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getRemoveEntity()
		 * @generated
		 */
		EClass REMOVE_ENTITY = eINSTANCE.getRemoveEntity();

		/**
		 * The meta object literal for the '<em><b>Entity To Remove</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_ENTITY__ENTITY_TO_REMOVE = eINSTANCE.getRemoveEntity_EntityToRemove();

		/**
		 * The meta object literal for the '{@link typhonml.impl.SplitEntityImpl <em>Split Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.SplitEntityImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getSplitEntity()
		 * @generated
		 */
		EClass SPLIT_ENTITY = eINSTANCE.getSplitEntity();

		/**
		 * The meta object literal for the '<em><b>Entity To Be Split</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_ENTITY__ENTITY_TO_BE_SPLIT = eINSTANCE.getSplitEntity_EntityToBeSplit();

		/**
		 * The meta object literal for the '<em><b>First New Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_ENTITY__FIRST_NEW_ENTITY = eINSTANCE.getSplitEntity_FirstNewEntity();

		/**
		 * The meta object literal for the '<em><b>Second New Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_ENTITY__SECOND_NEW_ENTITY = eINSTANCE.getSplitEntity_SecondNewEntity();

		/**
		 * The meta object literal for the '{@link typhonml.impl.MigrateEntityImpl <em>Migrate Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.MigrateEntityImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getMigrateEntity()
		 * @generated
		 */
		EClass MIGRATE_ENTITY = eINSTANCE.getMigrateEntity();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATE_ENTITY__ENTITY = eINSTANCE.getMigrateEntity_Entity();

		/**
		 * The meta object literal for the '<em><b>New Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATE_ENTITY__NEW_DATABASE = eINSTANCE.getMigrateEntity_NewDatabase();

		/**
		 * The meta object literal for the '{@link typhonml.impl.MergeEntityImpl <em>Merge Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.MergeEntityImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getMergeEntity()
		 * @generated
		 */
		EClass MERGE_ENTITY = eINSTANCE.getMergeEntity();

		/**
		 * The meta object literal for the '<em><b>First Entity To Merge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_ENTITY__FIRST_ENTITY_TO_MERGE = eINSTANCE.getMergeEntity_FirstEntityToMerge();

		/**
		 * The meta object literal for the '<em><b>Second Entity To Merge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_ENTITY__SECOND_ENTITY_TO_MERGE = eINSTANCE.getMergeEntity_SecondEntityToMerge();

		/**
		 * The meta object literal for the '<em><b>New Entity Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_ENTITY__NEW_ENTITY_NAME = eINSTANCE.getMergeEntity_NewEntityName();

		/**
		 * The meta object literal for the '{@link typhonml.impl.AddRelationImpl <em>Add Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.AddRelationImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getAddRelation()
		 * @generated
		 */
		EClass ADD_RELATION = eINSTANCE.getAddRelation();

		/**
		 * The meta object literal for the '<em><b>Owner Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_RELATION__OWNER_ENTITY = eINSTANCE.getAddRelation_OwnerEntity();

		/**
		 * The meta object literal for the '{@link typhonml.impl.RemoveRelationImpl <em>Remove Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.RemoveRelationImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getRemoveRelation()
		 * @generated
		 */
		EClass REMOVE_RELATION = eINSTANCE.getRemoveRelation();

		/**
		 * The meta object literal for the '<em><b>Relation To Remove</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_RELATION__RELATION_TO_REMOVE = eINSTANCE.getRemoveRelation_RelationToRemove();

		/**
		 * The meta object literal for the '{@link typhonml.impl.RenameRelationImpl <em>Rename Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.RenameRelationImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getRenameRelation()
		 * @generated
		 */
		EClass RENAME_RELATION = eINSTANCE.getRenameRelation();

		/**
		 * The meta object literal for the '<em><b>Relation To Rename</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAME_RELATION__RELATION_TO_RENAME = eINSTANCE.getRenameRelation_RelationToRename();

		/**
		 * The meta object literal for the '<em><b>New Relation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_RELATION__NEW_RELATION_NAME = eINSTANCE.getRenameRelation_NewRelationName();

		/**
		 * The meta object literal for the '{@link typhonml.impl.EnableRelationContainmentImpl <em>Enable Relation Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.EnableRelationContainmentImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getEnableRelationContainment()
		 * @generated
		 */
		EClass ENABLE_RELATION_CONTAINMENT = eINSTANCE.getEnableRelationContainment();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENABLE_RELATION_CONTAINMENT__RELATION = eINSTANCE.getEnableRelationContainment_Relation();

		/**
		 * The meta object literal for the '{@link typhonml.impl.DisableRelationContainmentImpl <em>Disable Relation Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.DisableRelationContainmentImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getDisableRelationContainment()
		 * @generated
		 */
		EClass DISABLE_RELATION_CONTAINMENT = eINSTANCE.getDisableRelationContainment();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISABLE_RELATION_CONTAINMENT__RELATION = eINSTANCE.getDisableRelationContainment_Relation();

		/**
		 * The meta object literal for the '{@link typhonml.impl.EnableBidirectionalRelationImpl <em>Enable Bidirectional Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.EnableBidirectionalRelationImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getEnableBidirectionalRelation()
		 * @generated
		 */
		EClass ENABLE_BIDIRECTIONAL_RELATION = eINSTANCE.getEnableBidirectionalRelation();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENABLE_BIDIRECTIONAL_RELATION__RELATION = eINSTANCE.getEnableBidirectionalRelation_Relation();

		/**
		 * The meta object literal for the '{@link typhonml.impl.DisableBidirectionalRelationImpl <em>Disable Bidirectional Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.DisableBidirectionalRelationImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getDisableBidirectionalRelation()
		 * @generated
		 */
		EClass DISABLE_BIDIRECTIONAL_RELATION = eINSTANCE.getDisableBidirectionalRelation();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISABLE_BIDIRECTIONAL_RELATION__RELATION = eINSTANCE.getDisableBidirectionalRelation_Relation();

		/**
		 * The meta object literal for the '{@link typhonml.impl.ChangeRelationCardinalityImpl <em>Change Relation Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.ChangeRelationCardinalityImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getChangeRelationCardinality()
		 * @generated
		 */
		EClass CHANGE_RELATION_CARDINALITY = eINSTANCE.getChangeRelationCardinality();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_RELATION_CARDINALITY__RELATION = eINSTANCE.getChangeRelationCardinality_Relation();

		/**
		 * The meta object literal for the '<em><b>New Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_RELATION_CARDINALITY__NEW_CARDINALITY = eINSTANCE.getChangeRelationCardinality_NewCardinality();

		/**
		 * The meta object literal for the '{@link typhonml.impl.AddAttributeImpl <em>Add Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.AddAttributeImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getAddAttribute()
		 * @generated
		 */
		EClass ADD_ATTRIBUTE = eINSTANCE.getAddAttribute();

		/**
		 * The meta object literal for the '<em><b>Owner Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_ATTRIBUTE__OWNER_ENTITY = eINSTANCE.getAddAttribute_OwnerEntity();

		/**
		 * The meta object literal for the '{@link typhonml.impl.ChangeAttributeTypeImpl <em>Change Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.ChangeAttributeTypeImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getChangeAttributeType()
		 * @generated
		 */
		EClass CHANGE_ATTRIBUTE_TYPE = eINSTANCE.getChangeAttributeType();

		/**
		 * The meta object literal for the '<em><b>Attribute To Change</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_ATTRIBUTE_TYPE__ATTRIBUTE_TO_CHANGE = eINSTANCE.getChangeAttributeType_AttributeToChange();

		/**
		 * The meta object literal for the '<em><b>New Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_ATTRIBUTE_TYPE__NEW_TYPE = eINSTANCE.getChangeAttributeType_NewType();

		/**
		 * The meta object literal for the '{@link typhonml.impl.RemoveAttributeImpl <em>Remove Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.RemoveAttributeImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getRemoveAttribute()
		 * @generated
		 */
		EClass REMOVE_ATTRIBUTE = eINSTANCE.getRemoveAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute To Remove</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_ATTRIBUTE__ATTRIBUTE_TO_REMOVE = eINSTANCE.getRemoveAttribute_AttributeToRemove();

		/**
		 * The meta object literal for the '{@link typhonml.impl.RenameAttributeImpl <em>Rename Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.RenameAttributeImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getRenameAttribute()
		 * @generated
		 */
		EClass RENAME_ATTRIBUTE = eINSTANCE.getRenameAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute To Rename</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAME_ATTRIBUTE__ATTRIBUTE_TO_RENAME = eINSTANCE.getRenameAttribute_AttributeToRename();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_ATTRIBUTE__NEW_NAME = eINSTANCE.getRenameAttribute_NewName();

		/**
		 * The meta object literal for the '{@link typhonml.impl.RenameTableImpl <em>Rename Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.RenameTableImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getRenameTable()
		 * @generated
		 */
		EClass RENAME_TABLE = eINSTANCE.getRenameTable();

		/**
		 * The meta object literal for the '<em><b>Table To Rename</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAME_TABLE__TABLE_TO_RENAME = eINSTANCE.getRenameTable_TableToRename();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_TABLE__NEW_NAME = eINSTANCE.getRenameTable_NewName();

		/**
		 * The meta object literal for the '{@link typhonml.impl.AddIndexImpl <em>Add Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.AddIndexImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getAddIndex()
		 * @generated
		 */
		EClass ADD_INDEX = eINSTANCE.getAddIndex();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_INDEX__TABLE = eINSTANCE.getAddIndex_Table();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_INDEX__ATTRIBUTES = eINSTANCE.getAddIndex_Attributes();

		/**
		 * The meta object literal for the '{@link typhonml.impl.DropIndexImpl <em>Drop Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.DropIndexImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getDropIndex()
		 * @generated
		 */
		EClass DROP_INDEX = eINSTANCE.getDropIndex();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP_INDEX__TABLE = eINSTANCE.getDropIndex_Table();

		/**
		 * The meta object literal for the '{@link typhonml.impl.AddAttributesToIndexImpl <em>Add Attributes To Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.AddAttributesToIndexImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getAddAttributesToIndex()
		 * @generated
		 */
		EClass ADD_ATTRIBUTES_TO_INDEX = eINSTANCE.getAddAttributesToIndex();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_ATTRIBUTES_TO_INDEX__TABLE = eINSTANCE.getAddAttributesToIndex_Table();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_ATTRIBUTES_TO_INDEX__ATTRIBUTES = eINSTANCE.getAddAttributesToIndex_Attributes();

		/**
		 * The meta object literal for the '{@link typhonml.impl.RemoveAttributesToIndexImpl <em>Remove Attributes To Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.RemoveAttributesToIndexImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getRemoveAttributesToIndex()
		 * @generated
		 */
		EClass REMOVE_ATTRIBUTES_TO_INDEX = eINSTANCE.getRemoveAttributesToIndex();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_ATTRIBUTES_TO_INDEX__TABLE = eINSTANCE.getRemoveAttributesToIndex_Table();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_ATTRIBUTES_TO_INDEX__ATTRIBUTES = eINSTANCE.getRemoveAttributesToIndex_Attributes();

		/**
		 * The meta object literal for the '{@link typhonml.impl.RenameCollectionImpl <em>Rename Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.RenameCollectionImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getRenameCollection()
		 * @generated
		 */
		EClass RENAME_COLLECTION = eINSTANCE.getRenameCollection();

		/**
		 * The meta object literal for the '<em><b>Collection To Rename</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAME_COLLECTION__COLLECTION_TO_RENAME = eINSTANCE.getRenameCollection_CollectionToRename();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_COLLECTION__NEW_NAME = eINSTANCE.getRenameCollection_NewName();

		/**
		 * The meta object literal for the '{@link typhonml.impl.AddCollectionIndexImpl <em>Add Collection Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.AddCollectionIndexImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getAddCollectionIndex()
		 * @generated
		 */
		EClass ADD_COLLECTION_INDEX = eINSTANCE.getAddCollectionIndex();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_COLLECTION_INDEX__COLLECTION = eINSTANCE.getAddCollectionIndex_Collection();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_COLLECTION_INDEX__ATTRIBUTES = eINSTANCE.getAddCollectionIndex_Attributes();

		/**
		 * The meta object literal for the '{@link typhonml.impl.DropCollectionIndexImpl <em>Drop Collection Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.DropCollectionIndexImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getDropCollectionIndex()
		 * @generated
		 */
		EClass DROP_COLLECTION_INDEX = eINSTANCE.getDropCollectionIndex();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP_COLLECTION_INDEX__COLLECTION = eINSTANCE.getDropCollectionIndex_Collection();

		/**
		 * The meta object literal for the '{@link typhonml.impl.AddGraphAttributeImpl <em>Add Graph Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.AddGraphAttributeImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getAddGraphAttribute()
		 * @generated
		 */
		EClass ADD_GRAPH_ATTRIBUTE = eINSTANCE.getAddGraphAttribute();

		/**
		 * The meta object literal for the '{@link typhonml.impl.RemoveGraphAttributeImpl <em>Remove Graph Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.RemoveGraphAttributeImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getRemoveGraphAttribute()
		 * @generated
		 */
		EClass REMOVE_GRAPH_ATTRIBUTE = eINSTANCE.getRemoveGraphAttribute();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_GRAPH_ATTRIBUTE__NODE = eINSTANCE.getRemoveGraphAttribute_Node();

		/**
		 * The meta object literal for the '{@link typhonml.impl.AddGraphEdgeImpl <em>Add Graph Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.AddGraphEdgeImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getAddGraphEdge()
		 * @generated
		 */
		EClass ADD_GRAPH_EDGE = eINSTANCE.getAddGraphEdge();

		/**
		 * The meta object literal for the '{@link typhonml.impl.RemoveGraphEdgeImpl <em>Remove Graph Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.RemoveGraphEdgeImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getRemoveGraphEdge()
		 * @generated
		 */
		EClass REMOVE_GRAPH_EDGE = eINSTANCE.getRemoveGraphEdge();

		/**
		 * The meta object literal for the '<em><b>Graph Edge To Remove</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_GRAPH_EDGE__GRAPH_EDGE_TO_REMOVE = eINSTANCE.getRemoveGraphEdge_GraphEdgeToRemove();

		/**
		 * The meta object literal for the '{@link typhonml.impl.RenabeGraphEdgeLabelImpl <em>Renabe Graph Edge Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.RenabeGraphEdgeLabelImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getRenabeGraphEdgeLabel()
		 * @generated
		 */
		EClass RENABE_GRAPH_EDGE_LABEL = eINSTANCE.getRenabeGraphEdgeLabel();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENABE_GRAPH_EDGE_LABEL__EDGE = eINSTANCE.getRenabeGraphEdgeLabel_Edge();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENABE_GRAPH_EDGE_LABEL__NEW_NAME = eINSTANCE.getRenabeGraphEdgeLabel_NewName();

		/**
		 * The meta object literal for the '{@link typhonml.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.DatabaseImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '{@link typhonml.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.DataTypeImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link typhonml.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.PrimitiveDataTypeImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

		/**
		 * The meta object literal for the '{@link typhonml.impl.CustomDataTypeImpl <em>Custom Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.CustomDataTypeImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getCustomDataType()
		 * @generated
		 */
		EClass CUSTOM_DATA_TYPE = eINSTANCE.getCustomDataType();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_DATA_TYPE__ELEMENTS = eINSTANCE.getCustomDataType_Elements();

		/**
		 * The meta object literal for the '{@link typhonml.impl.DataTypeItemImpl <em>Data Type Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.DataTypeItemImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getDataTypeItem()
		 * @generated
		 */
		EClass DATA_TYPE_ITEM = eINSTANCE.getDataTypeItem();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_ITEM__TYPE = eINSTANCE.getDataTypeItem_Type();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_ITEM__IMPLEMENTATION = eINSTANCE.getDataTypeItem_Implementation();

		/**
		 * The meta object literal for the '{@link typhonml.impl.FreeTextImpl <em>Free Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.FreeTextImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getFreeText()
		 * @generated
		 */
		EClass FREE_TEXT = eINSTANCE.getFreeText();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREE_TEXT__TASKS = eINSTANCE.getFreeText_Tasks();

		/**
		 * The meta object literal for the '{@link typhonml.impl.NlpTaskImpl <em>Nlp Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.NlpTaskImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getNlpTask()
		 * @generated
		 */
		EClass NLP_TASK = eINSTANCE.getNlpTask();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NLP_TASK__TYPE = eINSTANCE.getNlpTask_Type();

		/**
		 * The meta object literal for the '{@link typhonml.impl.DataTypeImplementationPackageImpl <em>Data Type Implementation Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.DataTypeImplementationPackageImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getDataTypeImplementationPackage()
		 * @generated
		 */
		EClass DATA_TYPE_IMPLEMENTATION_PACKAGE = eINSTANCE.getDataTypeImplementationPackage();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_IMPLEMENTATION_PACKAGE__LOCATION = eINSTANCE.getDataTypeImplementationPackage_Location();

		/**
		 * The meta object literal for the '{@link typhonml.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.EntityImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Fretext Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__FRETEXT_ATTRIBUTES = eINSTANCE.getEntity_FretextAttributes();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__RELATIONS = eINSTANCE.getEntity_Relations();

		/**
		 * The meta object literal for the '<em><b>Functional Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__FUNCTIONAL_TAGS = eINSTANCE.getEntity_FunctionalTags();

		/**
		 * The meta object literal for the '<em><b>Nfunctional Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__NFUNCTIONAL_TAGS = eINSTANCE.getEntity_NfunctionalTags();

		/**
		 * The meta object literal for the '<em><b>Get Collections</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___GET_COLLECTIONS = eINSTANCE.getEntity__GetCollections();

		/**
		 * The meta object literal for the '<em><b>Get Tables</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___GET_TABLES = eINSTANCE.getEntity__GetTables();

		/**
		 * The meta object literal for the '<em><b>Get Key Value Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___GET_KEY_VALUE_ELEMENTS = eINSTANCE.getEntity__GetKeyValueElements();

		/**
		 * The meta object literal for the '<em><b>Get Graph Nodes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___GET_GRAPH_NODES = eINSTANCE.getEntity__GetGraphNodes();

		/**
		 * The meta object literal for the '<em><b>Get Columns</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___GET_COLUMNS = eINSTANCE.getEntity__GetColumns();

		/**
		 * The meta object literal for the '{@link typhonml.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.AttributeImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link typhonml.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.RelationImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TYPE = eINSTANCE.getRelation_Type();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__CARDINALITY = eINSTANCE.getRelation_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__OPPOSITE = eINSTANCE.getRelation_Opposite();

		/**
		 * The meta object literal for the '<em><b>Is Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__IS_CONTAINMENT = eINSTANCE.getRelation_IsContainment();

		/**
		 * The meta object literal for the '{@link typhonml.impl.RelationalDBImpl <em>Relational DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.RelationalDBImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getRelationalDB()
		 * @generated
		 */
		EClass RELATIONAL_DB = eINSTANCE.getRelationalDB();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_DB__TABLES = eINSTANCE.getRelationalDB_Tables();

		/**
		 * The meta object literal for the '{@link typhonml.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.TableImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Index Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__INDEX_SPEC = eINSTANCE.getTable_IndexSpec();

		/**
		 * The meta object literal for the '<em><b>Id Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ID_SPEC = eINSTANCE.getTable_IdSpec();

		/**
		 * The meta object literal for the '<em><b>Db</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__DB = eINSTANCE.getTable_Db();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ENTITY = eINSTANCE.getTable_Entity();

		/**
		 * The meta object literal for the '{@link typhonml.impl.IndexSpecImpl <em>Index Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.IndexSpecImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getIndexSpec()
		 * @generated
		 */
		EClass INDEX_SPEC = eINSTANCE.getIndexSpec();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_SPEC__ATTRIBUTES = eINSTANCE.getIndexSpec_Attributes();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_SPEC__REFERENCES = eINSTANCE.getIndexSpec_References();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_SPEC__TABLE = eINSTANCE.getIndexSpec_Table();

		/**
		 * The meta object literal for the '{@link typhonml.impl.IdSpecImpl <em>Id Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.IdSpecImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getIdSpec()
		 * @generated
		 */
		EClass ID_SPEC = eINSTANCE.getIdSpec();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_SPEC__ATTRIBUTES = eINSTANCE.getIdSpec_Attributes();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_SPEC__TABLE = eINSTANCE.getIdSpec_Table();

		/**
		 * The meta object literal for the '{@link typhonml.impl.DocumentDBImpl <em>Document DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.DocumentDBImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getDocumentDB()
		 * @generated
		 */
		EClass DOCUMENT_DB = eINSTANCE.getDocumentDB();

		/**
		 * The meta object literal for the '<em><b>Collections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_DB__COLLECTIONS = eINSTANCE.getDocumentDB_Collections();

		/**
		 * The meta object literal for the '{@link typhonml.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.CollectionImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__ENTITY = eINSTANCE.getCollection_Entity();

		/**
		 * The meta object literal for the '{@link typhonml.impl.KeyValueDBImpl <em>Key Value DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.KeyValueDBImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getKeyValueDB()
		 * @generated
		 */
		EClass KEY_VALUE_DB = eINSTANCE.getKeyValueDB();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE_DB__ELEMENTS = eINSTANCE.getKeyValueDB_Elements();

		/**
		 * The meta object literal for the '{@link typhonml.impl.KeyValueElementImpl <em>Key Value Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.KeyValueElementImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getKeyValueElement()
		 * @generated
		 */
		EClass KEY_VALUE_ELEMENT = eINSTANCE.getKeyValueElement();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_ELEMENT__KEY = eINSTANCE.getKeyValueElement_Key();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE_ELEMENT__VALUES = eINSTANCE.getKeyValueElement_Values();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE_ELEMENT__ENTITY = eINSTANCE.getKeyValueElement_Entity();

		/**
		 * The meta object literal for the '{@link typhonml.impl.GraphDBImpl <em>Graph DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.GraphDBImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getGraphDB()
		 * @generated
		 */
		EClass GRAPH_DB = eINSTANCE.getGraphDB();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_DB__NODES = eINSTANCE.getGraphDB_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_DB__EDGES = eINSTANCE.getGraphDB_Edges();

		/**
		 * The meta object literal for the '{@link typhonml.impl.GraphNodeImpl <em>Graph Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.GraphNodeImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getGraphNode()
		 * @generated
		 */
		EClass GRAPH_NODE = eINSTANCE.getGraphNode();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_NODE__ATTRIBUTES = eINSTANCE.getGraphNode_Attributes();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_NODE__ENTITY = eINSTANCE.getGraphNode_Entity();

		/**
		 * The meta object literal for the '{@link typhonml.impl.GraphAttributeImpl <em>Graph Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.GraphAttributeImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getGraphAttribute()
		 * @generated
		 */
		EClass GRAPH_ATTRIBUTE = eINSTANCE.getGraphAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_ATTRIBUTE__VALUE = eINSTANCE.getGraphAttribute_Value();

		/**
		 * The meta object literal for the '{@link typhonml.impl.GraphEdgeImpl <em>Graph Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.GraphEdgeImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getGraphEdge()
		 * @generated
		 */
		EClass GRAPH_EDGE = eINSTANCE.getGraphEdge();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_EDGE__FROM = eINSTANCE.getGraphEdge_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_EDGE__TO = eINSTANCE.getGraphEdge_To();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_EDGE__LABELS = eINSTANCE.getGraphEdge_Labels();

		/**
		 * The meta object literal for the '{@link typhonml.impl.GraphEdgeLabelImpl <em>Graph Edge Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.GraphEdgeLabelImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getGraphEdgeLabel()
		 * @generated
		 */
		EClass GRAPH_EDGE_LABEL = eINSTANCE.getGraphEdgeLabel();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_EDGE_LABEL__TYPE = eINSTANCE.getGraphEdgeLabel_Type();

		/**
		 * The meta object literal for the '{@link typhonml.impl.ColumnDBImpl <em>Column DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.ColumnDBImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getColumnDB()
		 * @generated
		 */
		EClass COLUMN_DB = eINSTANCE.getColumnDB();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_DB__COLUMNS = eINSTANCE.getColumnDB_Columns();

		/**
		 * The meta object literal for the '{@link typhonml.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.ColumnImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__ATTRIBUTES = eINSTANCE.getColumn_Attributes();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__ENTITY = eINSTANCE.getColumn_Entity();

		/**
		 * The meta object literal for the '{@link typhonml.impl.RenameEntityImpl <em>Rename Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.RenameEntityImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getRenameEntity()
		 * @generated
		 */
		EClass RENAME_ENTITY = eINSTANCE.getRenameEntity();

		/**
		 * The meta object literal for the '<em><b>Entity To Rename</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAME_ENTITY__ENTITY_TO_RENAME = eINSTANCE.getRenameEntity_EntityToRename();

		/**
		 * The meta object literal for the '<em><b>New Entity Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_ENTITY__NEW_ENTITY_NAME = eINSTANCE.getRenameEntity_NewEntityName();

		/**
		 * The meta object literal for the '{@link typhonml.impl.ChangeRelationContainementImpl <em>Change Relation Containement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.ChangeRelationContainementImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getChangeRelationContainement()
		 * @generated
		 */
		EClass CHANGE_RELATION_CONTAINEMENT = eINSTANCE.getChangeRelationContainement();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_RELATION_CONTAINEMENT__RELATION = eINSTANCE.getChangeRelationContainement_Relation();

		/**
		 * The meta object literal for the '<em><b>New Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_RELATION_CONTAINEMENT__NEW_CONTAINMENT = eINSTANCE.getChangeRelationContainement_NewContainment();

		/**
		 * The meta object literal for the '{@link typhonml.impl.SplitEntityVerticalImpl <em>Split Entity Vertical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.SplitEntityVerticalImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getSplitEntityVertical()
		 * @generated
		 */
		EClass SPLIT_ENTITY_VERTICAL = eINSTANCE.getSplitEntityVertical();

		/**
		 * The meta object literal for the '<em><b>Entity1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_ENTITY_VERTICAL__ENTITY1 = eINSTANCE.getSplitEntityVertical_Entity1();

		/**
		 * The meta object literal for the '<em><b>Entity2name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLIT_ENTITY_VERTICAL__ENTITY2NAME = eINSTANCE.getSplitEntityVertical_Entity2name();

		/**
		 * The meta object literal for the '<em><b>Attribute List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_ENTITY_VERTICAL__ATTRIBUTE_LIST = eINSTANCE.getSplitEntityVertical_AttributeList();

		/**
		 * The meta object literal for the '<em><b>Relation List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_ENTITY_VERTICAL__RELATION_LIST = eINSTANCE.getSplitEntityVertical_RelationList();

		/**
		 * The meta object literal for the '{@link typhonml.impl.SplitEntityHorizontalImpl <em>Split Entity Horizontal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.SplitEntityHorizontalImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getSplitEntityHorizontal()
		 * @generated
		 */
		EClass SPLIT_ENTITY_HORIZONTAL = eINSTANCE.getSplitEntityHorizontal();

		/**
		 * The meta object literal for the '<em><b>Entity1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_ENTITY_HORIZONTAL__ENTITY1 = eINSTANCE.getSplitEntityHorizontal_Entity1();

		/**
		 * The meta object literal for the '<em><b>Entity2name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLIT_ENTITY_HORIZONTAL__ENTITY2NAME = eINSTANCE.getSplitEntityHorizontal_Entity2name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_ENTITY_HORIZONTAL__ATTRIBUTE = eINSTANCE.getSplitEntityHorizontal_Attribute();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLIT_ENTITY_HORIZONTAL__EXPRESSION = eINSTANCE.getSplitEntityHorizontal_Expression();

		/**
		 * The meta object literal for the '{@link typhonml.impl.FunctionalTagImpl <em>Functional Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.FunctionalTagImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getFunctionalTag()
		 * @generated
		 */
		EClass FUNCTIONAL_TAG = eINSTANCE.getFunctionalTag();

		/**
		 * The meta object literal for the '{@link typhonml.impl.NFunctionalTagImpl <em>NFunctional Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.NFunctionalTagImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getNFunctionalTag()
		 * @generated
		 */
		EClass NFUNCTIONAL_TAG = eINSTANCE.getNFunctionalTag();

		/**
		 * The meta object literal for the '{@link typhonml.Cardinality <em>Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.Cardinality
		 * @see typhonml.impl.TyphonmlPackageImpl#getCardinality()
		 * @generated
		 */
		EEnum CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '{@link typhonml.NlpTaskType <em>Nlp Task Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.NlpTaskType
		 * @see typhonml.impl.TyphonmlPackageImpl#getNlpTaskType()
		 * @generated
		 */
		EEnum NLP_TASK_TYPE = eINSTANCE.getNlpTaskType();

	}

} //TyphonmlPackage
