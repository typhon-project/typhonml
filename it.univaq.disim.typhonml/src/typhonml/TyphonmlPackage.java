/**
 */
package typhonml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

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
	 * The meta object id for the '{@link typhonml.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.DatabaseImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 2;

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
	 * The meta object id for the '{@link typhonml.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.DataTypeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 3;

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
	 * The meta object id for the '{@link typhonml.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.PrimitiveDataTypeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 4;

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
	int CUSTOM_DATA_TYPE = 5;

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
	int DATA_TYPE_ITEM = 6;

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
	 * The number of structural features of the '<em>Data Type Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ITEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Type Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ITEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.EntityImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 7;

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
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__RELATIONS = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__GENERIC_LIST = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.AttributeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 8;

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
	 * The meta object id for the '{@link typhonml.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RelationImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 9;

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
	 * The meta object id for the '{@link typhonml.impl.RelationalDBImpl <em>Relational DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RelationalDBImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRelationalDB()
	 * @generated
	 */
	int RELATIONAL_DB = 10;

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
	int TABLE = 11;

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
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ENTITY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__INDEX_SPEC = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID_SPEC = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DB = NAMED_ELEMENT_FEATURE_COUNT + 3;

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
	int INDEX_SPEC = 12;

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
	int ID_SPEC = 13;

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
	int DOCUMENT_DB = 14;

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
	 * The meta object id for the '{@link typhonml.impl.GenericListImpl <em>Generic List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.GenericListImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getGenericList()
	 * @generated
	 */
	int GENERIC_LIST = 25;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LIST__ENTITY = 0;

	/**
	 * The number of structural features of the '<em>Generic List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Generic List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.CollectionImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 15;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__ENTITY = GENERIC_LIST__ENTITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__NAME = GENERIC_LIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__IMPORTED_NAMESPACE = GENERIC_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = GENERIC_LIST_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_COUNT = GENERIC_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.KeyValueDBImpl <em>Key Value DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.KeyValueDBImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getKeyValueDB()
	 * @generated
	 */
	int KEY_VALUE_DB = 16;

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
	int KEY_VALUE_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_ELEMENT__ENTITY = GENERIC_LIST__ENTITY;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_ELEMENT__KEY = GENERIC_LIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_ELEMENT__VALUES = GENERIC_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Key Value Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_ELEMENT_FEATURE_COUNT = GENERIC_LIST_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Key Value Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_ELEMENT_OPERATION_COUNT = GENERIC_LIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typhonml.impl.GraphDBImpl <em>Graph DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.GraphDBImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getGraphDB()
	 * @generated
	 */
	int GRAPH_DB = 18;

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
	int GRAPH_NODE = 19;

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
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__ENTITY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link typhonml.impl.GraphAttributeImpl <em>Graph Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.GraphAttributeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getGraphAttribute()
	 * @generated
	 */
	int GRAPH_ATTRIBUTE = 20;

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
	 * The meta object id for the '{@link typhonml.impl.GraphEdgeImpl <em>Graph Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.GraphEdgeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getGraphEdge()
	 * @generated
	 */
	int GRAPH_EDGE = 21;

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
	int GRAPH_EDGE_LABEL = 22;

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
	int COLUMN_DB = 23;

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
	int COLUMN = 24;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ATTRIBUTES = 0;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link typhonml.Cardinality <em>Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.Cardinality
	 * @see typhonml.impl.TyphonmlPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 26;


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
	 * Returns the meta object for the reference '{@link typhonml.Entity#getGenericList <em>Generic List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generic List</em>'.
	 * @see typhonml.Entity#getGenericList()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_GenericList();

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
	 * Returns the meta object for class '{@link typhonml.GenericList <em>Generic List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic List</em>'.
	 * @see typhonml.GenericList
	 * @generated
	 */
	EClass getGenericList();

	/**
	 * Returns the meta object for the reference '{@link typhonml.GenericList#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see typhonml.GenericList#getEntity()
	 * @see #getGenericList()
	 * @generated
	 */
	EReference getGenericList_Entity();

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
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__RELATIONS = eINSTANCE.getEntity_Relations();

		/**
		 * The meta object literal for the '<em><b>Generic List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__GENERIC_LIST = eINSTANCE.getEntity_GenericList();

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
		 * The meta object literal for the '{@link typhonml.impl.GenericListImpl <em>Generic List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.GenericListImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getGenericList()
		 * @generated
		 */
		EClass GENERIC_LIST = eINSTANCE.getGenericList();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_LIST__ENTITY = eINSTANCE.getGenericList_Entity();

		/**
		 * The meta object literal for the '{@link typhonml.Cardinality <em>Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.Cardinality
		 * @see typhonml.impl.TyphonmlPackageImpl#getCardinality()
		 * @generated
		 */
		EEnum CARDINALITY = eINSTANCE.getCardinality();

	}

} //TyphonmlPackage
