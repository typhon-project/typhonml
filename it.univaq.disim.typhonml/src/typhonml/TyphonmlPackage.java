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
	 * The meta object id for the '{@link typhonml.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.DatabaseImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 33;

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
	 * The meta object id for the '{@link typhonml.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.PrimitiveDataTypeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 35;

	/**
	 * The meta object id for the '{@link typhonml.impl.FreeTextImpl <em>Free Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.FreeTextImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getFreeText()
	 * @generated
	 */
	int FREE_TEXT = 36;

	/**
	 * The meta object id for the '{@link typhonml.impl.CustomDataTypeImpl <em>Custom Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.CustomDataTypeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getCustomDataType()
	 * @generated
	 */
	int CUSTOM_DATA_TYPE = 37;

	/**
	 * The meta object id for the '{@link typhonml.impl.DataTypeItemImpl <em>Data Type Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.DataTypeItemImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getDataTypeItem()
	 * @generated
	 */
	int DATA_TYPE_ITEM = 38;

	/**
	 * The meta object id for the '{@link typhonml.impl.DataTypeImplementationPackageImpl <em>Data Type Implementation Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.DataTypeImplementationPackageImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getDataTypeImplementationPackage()
	 * @generated
	 */
	int DATA_TYPE_IMPLEMENTATION_PACKAGE = 39;

	/**
	 * The meta object id for the '{@link typhonml.impl.EntityIdentifierImpl <em>Entity Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.EntityIdentifierImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getEntityIdentifier()
	 * @generated
	 */
	int ENTITY_IDENTIFIER = 41;

	/**
	 * The meta object id for the '{@link typhonml.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.EntityImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 40;

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
	 * The feature id for the '<em><b>Identifer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IDENTIFER = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generic List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__GENERIC_LIST = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY__RELATIONS = ENTITY__RELATIONS;

	/**
	 * The feature id for the '<em><b>Identifer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY__IDENTIFER = ENTITY__IDENTIFER;

	/**
	 * The feature id for the '<em><b>Generic List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY__GENERIC_LIST = ENTITY__GENERIC_LIST;

	/**
	 * The number of structural features of the '<em>Add Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link typhonml.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.AttributeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 42;

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
	 * The meta object id for the '{@link typhonml.impl.ChangeAttributeTypeImpl <em>Change Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.ChangeAttributeTypeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getChangeAttributeType()
	 * @generated
	 */
	int CHANGE_ATTRIBUTE_TYPE = 17;

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
	 * The meta object id for the '{@link typhonml.impl.RenameAttributeImpl <em>Rename Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RenameAttributeImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRenameAttribute()
	 * @generated
	 */
	int RENAME_ATTRIBUTE = 19;

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
	 * The meta object id for the '{@link typhonml.impl.AddIdentifierImpl <em>Add Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.AddIdentifierImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getAddIdentifier()
	 * @generated
	 */
	int ADD_IDENTIFIER = 21;

	/**
	 * The meta object id for the '{@link typhonml.impl.AddAttributesToIdenfifierImpl <em>Add Attributes To Idenfifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.AddAttributesToIdenfifierImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getAddAttributesToIdenfifier()
	 * @generated
	 */
	int ADD_ATTRIBUTES_TO_IDENFIFIER = 22;

	/**
	 * The meta object id for the '{@link typhonml.impl.RemoveIdentifierImpl <em>Remove Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RemoveIdentifierImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRemoveIdentifier()
	 * @generated
	 */
	int REMOVE_IDENTIFIER = 23;

	/**
	 * The meta object id for the '{@link typhonml.impl.RemoveAttributesToIdenfifierImpl <em>Remove Attributes To Idenfifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RemoveAttributesToIdenfifierImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRemoveAttributesToIdenfifier()
	 * @generated
	 */
	int REMOVE_ATTRIBUTES_TO_IDENFIFIER = 24;

	/**
	 * The meta object id for the '{@link typhonml.impl.RenameIdentifierImpl <em>Rename Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RenameIdentifierImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRenameIdentifier()
	 * @generated
	 */
	int RENAME_IDENTIFIER = 25;

	/**
	 * The meta object id for the '{@link typhonml.impl.AddIndexImpl <em>Add Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.AddIndexImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getAddIndex()
	 * @generated
	 */
	int ADD_INDEX = 26;

	/**
	 * The meta object id for the '{@link typhonml.impl.DropIndexImpl <em>Drop Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.DropIndexImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getDropIndex()
	 * @generated
	 */
	int DROP_INDEX = 27;

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
	 * The number of structural features of the '<em>Add Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Add Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Attribute To Remove</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ATTRIBUTE__ATTRIBUTE_TO_REMOVE = CHANGE_OPERATOR_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_IDENTIFIER__ENTITY = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_IDENTIFIER__NAME = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_IDENTIFIER_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Add Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_IDENTIFIER_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTES_TO_IDENFIFIER__IDENTIFIER = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTES_TO_IDENFIFIER__ATTRIBUTES = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Attributes To Idenfifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTES_TO_IDENFIFIER_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Add Attributes To Idenfifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTES_TO_IDENFIFIER_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_IDENTIFIER__ENTITY = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_IDENTIFIER_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_IDENTIFIER_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTES_TO_IDENFIFIER__IDENTIFIER = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTES_TO_IDENFIFIER__ATTRIBUTES = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove Attributes To Idenfifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTES_TO_IDENFIFIER_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Remove Attributes To Idenfifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTES_TO_IDENFIFIER_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_IDENTIFIER__IDENTIFIER = CHANGE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_IDENTIFIER__NEW_NAME = CHANGE_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rename Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_IDENTIFIER_FEATURE_COUNT = CHANGE_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rename Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_IDENTIFIER_OPERATION_COUNT = CHANGE_OPERATOR_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link typhonml.impl.RelationalDBImpl <em>Relational DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.RelationalDBImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getRelationalDB()
	 * @generated
	 */
	int RELATIONAL_DB = 44;

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
	 * The meta object id for the '{@link typhonml.impl.IndexSpecImpl <em>Index Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.IndexSpecImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getIndexSpec()
	 * @generated
	 */
	int INDEX_SPEC = 46;

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
	 * The meta object id for the '{@link typhonml.impl.DocumentDBImpl <em>Document DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.DocumentDBImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getDocumentDB()
	 * @generated
	 */
	int DOCUMENT_DB = 48;

	/**
	 * The meta object id for the '{@link typhonml.impl.GenericListImpl <em>Generic List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.GenericListImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getGenericList()
	 * @generated
	 */
	int GENERIC_LIST = 59;

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
	 * The meta object id for the '{@link typhonml.impl.KeyValueDBImpl <em>Key Value DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.KeyValueDBImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getKeyValueDB()
	 * @generated
	 */
	int KEY_VALUE_DB = 50;

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
	 * The meta object id for the '{@link typhonml.impl.GraphDBImpl <em>Graph DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typhonml.impl.GraphDBImpl
	 * @see typhonml.impl.TyphonmlPackageImpl#getGraphDB()
	 * @generated
	 */
	int GRAPH_DB = 52;

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
	int ADD_GRAPH_EDGE__NAME = GRAPH_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_EDGE__IMPORTED_NAMESPACE = GRAPH_EDGE__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_EDGE__FROM = GRAPH_EDGE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_EDGE__TO = GRAPH_EDGE__TO;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_EDGE__LABELS = GRAPH_EDGE__LABELS;

	/**
	 * The number of structural features of the '<em>Add Graph Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_EDGE_FEATURE_COUNT = GRAPH_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add Graph Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_GRAPH_EDGE_OPERATION_COUNT = GRAPH_EDGE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__NAME = PRIMITIVE_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__IMPORTED_NAMESPACE = PRIMITIVE_DATA_TYPE__IMPORTED_NAMESPACE;

	/**
	 * The number of structural features of the '<em>Free Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_FEATURE_COUNT = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Free Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_OPERATION_COUNT = PRIMITIVE_DATA_TYPE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_IDENTIFIER__ATTRIBUTES = 0;

	/**
	 * The number of structural features of the '<em>Entity Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_IDENTIFIER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entity Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_IDENTIFIER_OPERATION_COUNT = 0;

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
	int CARDINALITY = 60;


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
	 * Returns the meta object for the reference '{@link typhonml.RenameAttribute#getAttributeToRemove <em>Attribute To Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute To Remove</em>'.
	 * @see typhonml.RenameAttribute#getAttributeToRemove()
	 * @see #getRenameAttribute()
	 * @generated
	 */
	EReference getRenameAttribute_AttributeToRemove();

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
	 * Returns the meta object for class '{@link typhonml.AddIdentifier <em>Add Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Identifier</em>'.
	 * @see typhonml.AddIdentifier
	 * @generated
	 */
	EClass getAddIdentifier();

	/**
	 * Returns the meta object for the reference '{@link typhonml.AddIdentifier#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see typhonml.AddIdentifier#getEntity()
	 * @see #getAddIdentifier()
	 * @generated
	 */
	EReference getAddIdentifier_Entity();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.AddIdentifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see typhonml.AddIdentifier#getName()
	 * @see #getAddIdentifier()
	 * @generated
	 */
	EAttribute getAddIdentifier_Name();

	/**
	 * Returns the meta object for class '{@link typhonml.AddAttributesToIdenfifier <em>Add Attributes To Idenfifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Attributes To Idenfifier</em>'.
	 * @see typhonml.AddAttributesToIdenfifier
	 * @generated
	 */
	EClass getAddAttributesToIdenfifier();

	/**
	 * Returns the meta object for the reference '{@link typhonml.AddAttributesToIdenfifier#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifier</em>'.
	 * @see typhonml.AddAttributesToIdenfifier#getIdentifier()
	 * @see #getAddAttributesToIdenfifier()
	 * @generated
	 */
	EReference getAddAttributesToIdenfifier_Identifier();

	/**
	 * Returns the meta object for the reference list '{@link typhonml.AddAttributesToIdenfifier#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see typhonml.AddAttributesToIdenfifier#getAttributes()
	 * @see #getAddAttributesToIdenfifier()
	 * @generated
	 */
	EReference getAddAttributesToIdenfifier_Attributes();

	/**
	 * Returns the meta object for class '{@link typhonml.RemoveIdentifier <em>Remove Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Identifier</em>'.
	 * @see typhonml.RemoveIdentifier
	 * @generated
	 */
	EClass getRemoveIdentifier();

	/**
	 * Returns the meta object for the reference '{@link typhonml.RemoveIdentifier#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see typhonml.RemoveIdentifier#getEntity()
	 * @see #getRemoveIdentifier()
	 * @generated
	 */
	EReference getRemoveIdentifier_Entity();

	/**
	 * Returns the meta object for class '{@link typhonml.RemoveAttributesToIdenfifier <em>Remove Attributes To Idenfifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Attributes To Idenfifier</em>'.
	 * @see typhonml.RemoveAttributesToIdenfifier
	 * @generated
	 */
	EClass getRemoveAttributesToIdenfifier();

	/**
	 * Returns the meta object for the reference '{@link typhonml.RemoveAttributesToIdenfifier#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifier</em>'.
	 * @see typhonml.RemoveAttributesToIdenfifier#getIdentifier()
	 * @see #getRemoveAttributesToIdenfifier()
	 * @generated
	 */
	EReference getRemoveAttributesToIdenfifier_Identifier();

	/**
	 * Returns the meta object for the reference list '{@link typhonml.RemoveAttributesToIdenfifier#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see typhonml.RemoveAttributesToIdenfifier#getAttributes()
	 * @see #getRemoveAttributesToIdenfifier()
	 * @generated
	 */
	EReference getRemoveAttributesToIdenfifier_Attributes();

	/**
	 * Returns the meta object for class '{@link typhonml.RenameIdentifier <em>Rename Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Identifier</em>'.
	 * @see typhonml.RenameIdentifier
	 * @generated
	 */
	EClass getRenameIdentifier();

	/**
	 * Returns the meta object for the reference '{@link typhonml.RenameIdentifier#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifier</em>'.
	 * @see typhonml.RenameIdentifier#getIdentifier()
	 * @see #getRenameIdentifier()
	 * @generated
	 */
	EReference getRenameIdentifier_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link typhonml.RenameIdentifier#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see typhonml.RenameIdentifier#getNewName()
	 * @see #getRenameIdentifier()
	 * @generated
	 */
	EAttribute getRenameIdentifier_NewName();

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
	 * Returns the meta object for class '{@link typhonml.FreeText <em>Free Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Text</em>'.
	 * @see typhonml.FreeText
	 * @generated
	 */
	EClass getFreeText();

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
	 * Returns the meta object for the containment reference '{@link typhonml.Entity#getIdentifer <em>Identifer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifer</em>'.
	 * @see typhonml.Entity#getIdentifer()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Identifer();

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
	 * Returns the meta object for class '{@link typhonml.EntityIdentifier <em>Entity Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Identifier</em>'.
	 * @see typhonml.EntityIdentifier
	 * @generated
	 */
	EClass getEntityIdentifier();

	/**
	 * Returns the meta object for the reference list '{@link typhonml.EntityIdentifier#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see typhonml.EntityIdentifier#getAttributes()
	 * @see #getEntityIdentifier()
	 * @generated
	 */
	EReference getEntityIdentifier_Attributes();

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
		 * The meta object literal for the '<em><b>Attribute To Remove</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAME_ATTRIBUTE__ATTRIBUTE_TO_REMOVE = eINSTANCE.getRenameAttribute_AttributeToRemove();

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
		 * The meta object literal for the '{@link typhonml.impl.AddIdentifierImpl <em>Add Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.AddIdentifierImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getAddIdentifier()
		 * @generated
		 */
		EClass ADD_IDENTIFIER = eINSTANCE.getAddIdentifier();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_IDENTIFIER__ENTITY = eINSTANCE.getAddIdentifier_Entity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_IDENTIFIER__NAME = eINSTANCE.getAddIdentifier_Name();

		/**
		 * The meta object literal for the '{@link typhonml.impl.AddAttributesToIdenfifierImpl <em>Add Attributes To Idenfifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.AddAttributesToIdenfifierImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getAddAttributesToIdenfifier()
		 * @generated
		 */
		EClass ADD_ATTRIBUTES_TO_IDENFIFIER = eINSTANCE.getAddAttributesToIdenfifier();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_ATTRIBUTES_TO_IDENFIFIER__IDENTIFIER = eINSTANCE.getAddAttributesToIdenfifier_Identifier();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_ATTRIBUTES_TO_IDENFIFIER__ATTRIBUTES = eINSTANCE.getAddAttributesToIdenfifier_Attributes();

		/**
		 * The meta object literal for the '{@link typhonml.impl.RemoveIdentifierImpl <em>Remove Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.RemoveIdentifierImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getRemoveIdentifier()
		 * @generated
		 */
		EClass REMOVE_IDENTIFIER = eINSTANCE.getRemoveIdentifier();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_IDENTIFIER__ENTITY = eINSTANCE.getRemoveIdentifier_Entity();

		/**
		 * The meta object literal for the '{@link typhonml.impl.RemoveAttributesToIdenfifierImpl <em>Remove Attributes To Idenfifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.RemoveAttributesToIdenfifierImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getRemoveAttributesToIdenfifier()
		 * @generated
		 */
		EClass REMOVE_ATTRIBUTES_TO_IDENFIFIER = eINSTANCE.getRemoveAttributesToIdenfifier();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_ATTRIBUTES_TO_IDENFIFIER__IDENTIFIER = eINSTANCE.getRemoveAttributesToIdenfifier_Identifier();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_ATTRIBUTES_TO_IDENFIFIER__ATTRIBUTES = eINSTANCE.getRemoveAttributesToIdenfifier_Attributes();

		/**
		 * The meta object literal for the '{@link typhonml.impl.RenameIdentifierImpl <em>Rename Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.RenameIdentifierImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getRenameIdentifier()
		 * @generated
		 */
		EClass RENAME_IDENTIFIER = eINSTANCE.getRenameIdentifier();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAME_IDENTIFIER__IDENTIFIER = eINSTANCE.getRenameIdentifier_Identifier();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_IDENTIFIER__NEW_NAME = eINSTANCE.getRenameIdentifier_NewName();

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
		 * The meta object literal for the '{@link typhonml.impl.FreeTextImpl <em>Free Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.FreeTextImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getFreeText()
		 * @generated
		 */
		EClass FREE_TEXT = eINSTANCE.getFreeText();

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
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__RELATIONS = eINSTANCE.getEntity_Relations();

		/**
		 * The meta object literal for the '<em><b>Identifer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__IDENTIFER = eINSTANCE.getEntity_Identifer();

		/**
		 * The meta object literal for the '<em><b>Generic List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__GENERIC_LIST = eINSTANCE.getEntity_GenericList();

		/**
		 * The meta object literal for the '{@link typhonml.impl.EntityIdentifierImpl <em>Entity Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typhonml.impl.EntityIdentifierImpl
		 * @see typhonml.impl.TyphonmlPackageImpl#getEntityIdentifier()
		 * @generated
		 */
		EClass ENTITY_IDENTIFIER = eINSTANCE.getEntityIdentifier();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_IDENTIFIER__ATTRIBUTES = eINSTANCE.getEntityIdentifier_Attributes();

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
