/**
 */
package org.typhon.dsls.sirius.typhonml;

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
 * @see org.typhon.dsls.sirius.typhonml.TyphonmlFactory
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
	String eNS_URI = "org.typhon.dsls.typhonml.sirius";

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
	TyphonmlPackage eINSTANCE = org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.ModelImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getModel()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.NamedElementImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getNamedElement()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.DatabaseImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getDatabase()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.DataTypeImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getDataType()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.PrimitiveDataTypeImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getPrimitiveDataType()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.CustomDataTypeImpl <em>Custom Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.CustomDataTypeImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getCustomDataType()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.DataTypeItemImpl <em>Data Type Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.DataTypeItemImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getDataTypeItem()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.EntityImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getEntity()
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
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.AttributeImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getAttribute()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.RelationImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getRelation()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.RelationalDBImpl <em>Relational DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.RelationalDBImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getRelationalDB()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.TableImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getTable()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.IndexSpecImpl <em>Index Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.IndexSpecImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getIndexSpec()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.IdSpecImpl <em>Id Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.IdSpecImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getIdSpec()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.DocumentDBImpl <em>Document DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.DocumentDBImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getDocumentDB()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.CollectionImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 15;

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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.KeyValueDBImpl <em>Key Value DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.KeyValueDBImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getKeyValueDB()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.KeyValueElementImpl <em>Key Value Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.KeyValueElementImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getKeyValueElement()
	 * @generated
	 */
	int KEY_VALUE_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_ELEMENT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_ELEMENT__ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_ELEMENT__VALUES = 2;

	/**
	 * The number of structural features of the '<em>Key Value Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Key Value Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.GraphDBImpl <em>Graph DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.GraphDBImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getGraphDB()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.GraphNodeImpl <em>Graph Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.GraphNodeImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getGraphNode()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.GraphAttributeImpl <em>Graph Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.GraphAttributeImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getGraphAttribute()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.GraphEdgeImpl <em>Graph Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.GraphEdgeImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getGraphEdge()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.GraphEdgeLabelImpl <em>Graph Edge Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.GraphEdgeLabelImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getGraphEdgeLabel()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.ColumnDBImpl <em>Column DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.ColumnDBImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getColumnDB()
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
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.impl.ColumnImpl
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 24;

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
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.typhon.dsls.sirius.typhonml.Cardinality <em>Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.typhon.dsls.sirius.typhonml.Cardinality
	 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 25;

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.typhon.dsls.sirius.typhonml.Model#getDatabases <em>Databases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Databases</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Model#getDatabases()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Databases();

	/**
	 * Returns the meta object for the containment reference list '{@link org.typhon.dsls.sirius.typhonml.Model#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Model#getDataTypes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_DataTypes();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.typhon.dsls.sirius.typhonml.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.typhon.dsls.sirius.typhonml.NamedElement#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.NamedElement#getImportedNamespace()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Type</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.PrimitiveDataType
	 * @generated
	 */
	EClass getPrimitiveDataType();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.CustomDataType <em>Custom Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Data Type</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.CustomDataType
	 * @generated
	 */
	EClass getCustomDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.typhon.dsls.sirius.typhonml.CustomDataType#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.CustomDataType#getElements()
	 * @see #getCustomDataType()
	 * @generated
	 */
	EReference getCustomDataType_Elements();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.DataTypeItem <em>Data Type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Item</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.DataTypeItem
	 * @generated
	 */
	EClass getDataTypeItem();

	/**
	 * Returns the meta object for the reference '{@link org.typhon.dsls.sirius.typhonml.DataTypeItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.DataTypeItem#getType()
	 * @see #getDataTypeItem()
	 * @generated
	 */
	EReference getDataTypeItem_Type();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.typhon.dsls.sirius.typhonml.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.typhon.dsls.sirius.typhonml.Entity#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Entity#getRelations()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Relations();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.typhon.dsls.sirius.typhonml.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link org.typhon.dsls.sirius.typhonml.Relation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Relation#getType()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.typhon.dsls.sirius.typhonml.Relation#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Relation#getCardinality()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link org.typhon.dsls.sirius.typhonml.Relation#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Relation#getOpposite()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Opposite();

	/**
	 * Returns the meta object for the attribute '{@link org.typhon.dsls.sirius.typhonml.Relation#getIsContainment <em>Is Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Containment</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Relation#getIsContainment()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_IsContainment();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.RelationalDB <em>Relational DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational DB</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.RelationalDB
	 * @generated
	 */
	EClass getRelationalDB();

	/**
	 * Returns the meta object for the containment reference list '{@link org.typhon.dsls.sirius.typhonml.RelationalDB#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.RelationalDB#getTables()
	 * @see #getRelationalDB()
	 * @generated
	 */
	EReference getRelationalDB_Tables();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the reference '{@link org.typhon.dsls.sirius.typhonml.Table#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Table#getEntity()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link org.typhon.dsls.sirius.typhonml.Table#getIndexSpec <em>Index Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index Spec</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Table#getIndexSpec()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_IndexSpec();

	/**
	 * Returns the meta object for the containment reference '{@link org.typhon.dsls.sirius.typhonml.Table#getIdSpec <em>Id Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Spec</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Table#getIdSpec()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_IdSpec();

	/**
	 * Returns the meta object for the reference '{@link org.typhon.dsls.sirius.typhonml.Table#getDb <em>Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Db</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Table#getDb()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Db();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.IndexSpec <em>Index Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Spec</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.IndexSpec
	 * @generated
	 */
	EClass getIndexSpec();

	/**
	 * Returns the meta object for the reference list '{@link org.typhon.dsls.sirius.typhonml.IndexSpec#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.IndexSpec#getAttributes()
	 * @see #getIndexSpec()
	 * @generated
	 */
	EReference getIndexSpec_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link org.typhon.dsls.sirius.typhonml.IndexSpec#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.IndexSpec#getReferences()
	 * @see #getIndexSpec()
	 * @generated
	 */
	EReference getIndexSpec_References();

	/**
	 * Returns the meta object for the container reference '{@link org.typhon.dsls.sirius.typhonml.IndexSpec#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.IndexSpec#getTable()
	 * @see #getIndexSpec()
	 * @generated
	 */
	EReference getIndexSpec_Table();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.IdSpec <em>Id Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Spec</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.IdSpec
	 * @generated
	 */
	EClass getIdSpec();

	/**
	 * Returns the meta object for the reference list '{@link org.typhon.dsls.sirius.typhonml.IdSpec#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.IdSpec#getAttributes()
	 * @see #getIdSpec()
	 * @generated
	 */
	EReference getIdSpec_Attributes();

	/**
	 * Returns the meta object for the container reference '{@link org.typhon.dsls.sirius.typhonml.IdSpec#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.IdSpec#getTable()
	 * @see #getIdSpec()
	 * @generated
	 */
	EReference getIdSpec_Table();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.DocumentDB <em>Document DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document DB</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.DocumentDB
	 * @generated
	 */
	EClass getDocumentDB();

	/**
	 * Returns the meta object for the containment reference list '{@link org.typhon.dsls.sirius.typhonml.DocumentDB#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collections</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.DocumentDB#getCollections()
	 * @see #getDocumentDB()
	 * @generated
	 */
	EReference getDocumentDB_Collections();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for the reference '{@link org.typhon.dsls.sirius.typhonml.Collection#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Collection#getEntity()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Entity();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.KeyValueDB <em>Key Value DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value DB</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.KeyValueDB
	 * @generated
	 */
	EClass getKeyValueDB();

	/**
	 * Returns the meta object for the containment reference list '{@link org.typhon.dsls.sirius.typhonml.KeyValueDB#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.KeyValueDB#getElements()
	 * @see #getKeyValueDB()
	 * @generated
	 */
	EReference getKeyValueDB_Elements();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.KeyValueElement <em>Key Value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Element</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.KeyValueElement
	 * @generated
	 */
	EClass getKeyValueElement();

	/**
	 * Returns the meta object for the attribute '{@link org.typhon.dsls.sirius.typhonml.KeyValueElement#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.KeyValueElement#getKey()
	 * @see #getKeyValueElement()
	 * @generated
	 */
	EAttribute getKeyValueElement_Key();

	/**
	 * Returns the meta object for the reference '{@link org.typhon.dsls.sirius.typhonml.KeyValueElement#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.KeyValueElement#getEntity()
	 * @see #getKeyValueElement()
	 * @generated
	 */
	EReference getKeyValueElement_Entity();

	/**
	 * Returns the meta object for the reference list '{@link org.typhon.dsls.sirius.typhonml.KeyValueElement#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.KeyValueElement#getValues()
	 * @see #getKeyValueElement()
	 * @generated
	 */
	EReference getKeyValueElement_Values();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.GraphDB <em>Graph DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph DB</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.GraphDB
	 * @generated
	 */
	EClass getGraphDB();

	/**
	 * Returns the meta object for the containment reference list '{@link org.typhon.dsls.sirius.typhonml.GraphDB#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.GraphDB#getNodes()
	 * @see #getGraphDB()
	 * @generated
	 */
	EReference getGraphDB_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.typhon.dsls.sirius.typhonml.GraphDB#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.GraphDB#getEdges()
	 * @see #getGraphDB()
	 * @generated
	 */
	EReference getGraphDB_Edges();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.GraphNode <em>Graph Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Node</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.GraphNode
	 * @generated
	 */
	EClass getGraphNode();

	/**
	 * Returns the meta object for the reference '{@link org.typhon.dsls.sirius.typhonml.GraphNode#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.GraphNode#getEntity()
	 * @see #getGraphNode()
	 * @generated
	 */
	EReference getGraphNode_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.typhon.dsls.sirius.typhonml.GraphNode#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.GraphNode#getAttributes()
	 * @see #getGraphNode()
	 * @generated
	 */
	EReference getGraphNode_Attributes();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.GraphAttribute <em>Graph Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Attribute</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.GraphAttribute
	 * @generated
	 */
	EClass getGraphAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.typhon.dsls.sirius.typhonml.GraphAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.GraphAttribute#getValue()
	 * @see #getGraphAttribute()
	 * @generated
	 */
	EReference getGraphAttribute_Value();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.GraphEdge <em>Graph Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Edge</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.GraphEdge
	 * @generated
	 */
	EClass getGraphEdge();

	/**
	 * Returns the meta object for the reference '{@link org.typhon.dsls.sirius.typhonml.GraphEdge#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.GraphEdge#getFrom()
	 * @see #getGraphEdge()
	 * @generated
	 */
	EReference getGraphEdge_From();

	/**
	 * Returns the meta object for the reference '{@link org.typhon.dsls.sirius.typhonml.GraphEdge#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.GraphEdge#getTo()
	 * @see #getGraphEdge()
	 * @generated
	 */
	EReference getGraphEdge_To();

	/**
	 * Returns the meta object for the containment reference list '{@link org.typhon.dsls.sirius.typhonml.GraphEdge#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.GraphEdge#getLabels()
	 * @see #getGraphEdge()
	 * @generated
	 */
	EReference getGraphEdge_Labels();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.GraphEdgeLabel <em>Graph Edge Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Edge Label</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.GraphEdgeLabel
	 * @generated
	 */
	EClass getGraphEdgeLabel();

	/**
	 * Returns the meta object for the reference '{@link org.typhon.dsls.sirius.typhonml.GraphEdgeLabel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.GraphEdgeLabel#getType()
	 * @see #getGraphEdgeLabel()
	 * @generated
	 */
	EReference getGraphEdgeLabel_Type();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.ColumnDB <em>Column DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column DB</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.ColumnDB
	 * @generated
	 */
	EClass getColumnDB();

	/**
	 * Returns the meta object for the containment reference list '{@link org.typhon.dsls.sirius.typhonml.ColumnDB#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.ColumnDB#getColumns()
	 * @see #getColumnDB()
	 * @generated
	 */
	EReference getColumnDB_Columns();

	/**
	 * Returns the meta object for class '{@link org.typhon.dsls.sirius.typhonml.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the reference list '{@link org.typhon.dsls.sirius.typhonml.Column#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Column#getAttributes()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Attributes();

	/**
	 * Returns the meta object for enum '{@link org.typhon.dsls.sirius.typhonml.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinality</em>'.
	 * @see org.typhon.dsls.sirius.typhonml.Cardinality
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.ModelImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getModel()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.NamedElementImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.DatabaseImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.DataTypeImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.PrimitiveDataTypeImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

		/**
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.CustomDataTypeImpl <em>Custom Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.CustomDataTypeImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getCustomDataType()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.DataTypeItemImpl <em>Data Type Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.DataTypeItemImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getDataTypeItem()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.EntityImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getEntity()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.AttributeImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getAttribute()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.RelationImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getRelation()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.RelationalDBImpl <em>Relational DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.RelationalDBImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getRelationalDB()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.TableImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ENTITY = eINSTANCE.getTable_Entity();

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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.IndexSpecImpl <em>Index Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.IndexSpecImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getIndexSpec()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.IdSpecImpl <em>Id Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.IdSpecImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getIdSpec()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.DocumentDBImpl <em>Document DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.DocumentDBImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getDocumentDB()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.CollectionImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getCollection()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.KeyValueDBImpl <em>Key Value DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.KeyValueDBImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getKeyValueDB()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.KeyValueElementImpl <em>Key Value Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.KeyValueElementImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getKeyValueElement()
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
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE_ELEMENT__ENTITY = eINSTANCE.getKeyValueElement_Entity();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE_ELEMENT__VALUES = eINSTANCE.getKeyValueElement_Values();

		/**
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.GraphDBImpl <em>Graph DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.GraphDBImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getGraphDB()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.GraphNodeImpl <em>Graph Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.GraphNodeImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getGraphNode()
		 * @generated
		 */
		EClass GRAPH_NODE = eINSTANCE.getGraphNode();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_NODE__ENTITY = eINSTANCE.getGraphNode_Entity();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_NODE__ATTRIBUTES = eINSTANCE.getGraphNode_Attributes();

		/**
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.GraphAttributeImpl <em>Graph Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.GraphAttributeImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getGraphAttribute()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.GraphEdgeImpl <em>Graph Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.GraphEdgeImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getGraphEdge()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.GraphEdgeLabelImpl <em>Graph Edge Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.GraphEdgeLabelImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getGraphEdgeLabel()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.ColumnDBImpl <em>Column DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.ColumnDBImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getColumnDB()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.impl.ColumnImpl
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getColumn()
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
		 * The meta object literal for the '{@link org.typhon.dsls.sirius.typhonml.Cardinality <em>Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.typhon.dsls.sirius.typhonml.Cardinality
		 * @see org.typhon.dsls.sirius.typhonml.impl.TyphonmlPackageImpl#getCardinality()
		 * @generated
		 */
		EEnum CARDINALITY = eINSTANCE.getCardinality();

	}

} //TyphonmlPackage
