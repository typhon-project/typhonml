/**
 */
package typhonml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import typhonml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TyphonmlFactoryImpl extends EFactoryImpl implements TyphonmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TyphonmlFactory init() {
		try {
			TyphonmlFactory theTyphonmlFactory = (TyphonmlFactory)EPackage.Registry.INSTANCE.getEFactory(TyphonmlPackage.eNS_URI);
			if (theTyphonmlFactory != null) {
				return theTyphonmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TyphonmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TyphonmlFactoryImpl() {
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
			case TyphonmlPackage.MODEL: return createModel();
			case TyphonmlPackage.ADD_ENTITY: return createAddEntity();
			case TyphonmlPackage.REMOVE_ENTITY: return createRemoveEntity();
			case TyphonmlPackage.SPLIT_ENTITY: return createSplitEntity();
			case TyphonmlPackage.MIGRATE_ENTITY: return createMigrateEntity();
			case TyphonmlPackage.MERGE_ENTITY: return createMergeEntity();
			case TyphonmlPackage.ADD_RELATION: return createAddRelation();
			case TyphonmlPackage.REMOVE_RELATION: return createRemoveRelation();
			case TyphonmlPackage.RENAME_RELATION: return createRenameRelation();
			case TyphonmlPackage.ENABLE_RELATION_CONTAINMENT: return createEnableRelationContainment();
			case TyphonmlPackage.DISABLE_RELATION_CONTAINMENT: return createDisableRelationContainment();
			case TyphonmlPackage.ENABLE_BIDIRECTIONAL_RELATION: return createEnableBidirectionalRelation();
			case TyphonmlPackage.DISABLE_BIDIRECTIONAL_RELATION: return createDisableBidirectionalRelation();
			case TyphonmlPackage.CHANGE_RELATION_CARDINALITY: return createChangeRelationCardinality();
			case TyphonmlPackage.ADD_ATTRIBUTE: return createAddAttribute();
			case TyphonmlPackage.CHANGE_ATTRIBUTE_TYPE: return createChangeAttributeType();
			case TyphonmlPackage.REMOVE_ATTRIBUTE: return createRemoveAttribute();
			case TyphonmlPackage.RENAME_ATTRIBUTE: return createRenameAttribute();
			case TyphonmlPackage.RENAME_TABLE: return createRenameTable();
			case TyphonmlPackage.ADD_IDENTIFIER: return createAddIdentifier();
			case TyphonmlPackage.ADD_ATTRIBUTES_TO_IDENFIFIER: return createAddAttributesToIdenfifier();
			case TyphonmlPackage.REMOVE_IDENTIFIER: return createRemoveIdentifier();
			case TyphonmlPackage.REMOVE_ATTRIBUTES_TO_IDENFIFIER: return createRemoveAttributesToIdenfifier();
			case TyphonmlPackage.RENAME_IDENTIFIER: return createRenameIdentifier();
			case TyphonmlPackage.ADD_INDEX: return createAddIndex();
			case TyphonmlPackage.DROP_INDEX: return createDropIndex();
			case TyphonmlPackage.ADD_GRAPH_ATTRIBUTE: return createAddGraphAttribute();
			case TyphonmlPackage.REMOVE_GRAPH_ATTRIBUTE: return createRemoveGraphAttribute();
			case TyphonmlPackage.ADD_GRAPH_EDGE: return createAddGraphEdge();
			case TyphonmlPackage.REMOVE_GRAPH_EDGE: return createRemoveGraphEdge();
			case TyphonmlPackage.RENABE_GRAPH_EDGE_LABEL: return createRenabeGraphEdgeLabel();
			case TyphonmlPackage.PRIMITIVE_DATA_TYPE: return createPrimitiveDataType();
			case TyphonmlPackage.FREE_TEXT: return createFreeText();
			case TyphonmlPackage.CUSTOM_DATA_TYPE: return createCustomDataType();
			case TyphonmlPackage.DATA_TYPE_ITEM: return createDataTypeItem();
			case TyphonmlPackage.DATA_TYPE_IMPLEMENTATION_PACKAGE: return createDataTypeImplementationPackage();
			case TyphonmlPackage.ENTITY: return createEntity();
			case TyphonmlPackage.ENTITY_IDENTIFIER: return createEntityIdentifier();
			case TyphonmlPackage.ATTRIBUTE: return createAttribute();
			case TyphonmlPackage.RELATION: return createRelation();
			case TyphonmlPackage.RELATIONAL_DB: return createRelationalDB();
			case TyphonmlPackage.TABLE: return createTable();
			case TyphonmlPackage.INDEX_SPEC: return createIndexSpec();
			case TyphonmlPackage.ID_SPEC: return createIdSpec();
			case TyphonmlPackage.DOCUMENT_DB: return createDocumentDB();
			case TyphonmlPackage.COLLECTION: return createCollection();
			case TyphonmlPackage.KEY_VALUE_DB: return createKeyValueDB();
			case TyphonmlPackage.KEY_VALUE_ELEMENT: return createKeyValueElement();
			case TyphonmlPackage.GRAPH_DB: return createGraphDB();
			case TyphonmlPackage.GRAPH_NODE: return createGraphNode();
			case TyphonmlPackage.GRAPH_ATTRIBUTE: return createGraphAttribute();
			case TyphonmlPackage.GRAPH_EDGE: return createGraphEdge();
			case TyphonmlPackage.GRAPH_EDGE_LABEL: return createGraphEdgeLabel();
			case TyphonmlPackage.COLUMN_DB: return createColumnDB();
			case TyphonmlPackage.COLUMN: return createColumn();
			case TyphonmlPackage.GENERIC_LIST: return createGenericList();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TyphonmlPackage.CARDINALITY:
				return createCardinalityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TyphonmlPackage.CARDINALITY:
				return convertCardinalityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddEntity createAddEntity() {
		AddEntityImpl addEntity = new AddEntityImpl();
		return addEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveEntity createRemoveEntity() {
		RemoveEntityImpl removeEntity = new RemoveEntityImpl();
		return removeEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitEntity createSplitEntity() {
		SplitEntityImpl splitEntity = new SplitEntityImpl();
		return splitEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigrateEntity createMigrateEntity() {
		MigrateEntityImpl migrateEntity = new MigrateEntityImpl();
		return migrateEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeEntity createMergeEntity() {
		MergeEntityImpl mergeEntity = new MergeEntityImpl();
		return mergeEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddRelation createAddRelation() {
		AddRelationImpl addRelation = new AddRelationImpl();
		return addRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveRelation createRemoveRelation() {
		RemoveRelationImpl removeRelation = new RemoveRelationImpl();
		return removeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameRelation createRenameRelation() {
		RenameRelationImpl renameRelation = new RenameRelationImpl();
		return renameRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableRelationContainment createEnableRelationContainment() {
		EnableRelationContainmentImpl enableRelationContainment = new EnableRelationContainmentImpl();
		return enableRelationContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableRelationContainment createDisableRelationContainment() {
		DisableRelationContainmentImpl disableRelationContainment = new DisableRelationContainmentImpl();
		return disableRelationContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableBidirectionalRelation createEnableBidirectionalRelation() {
		EnableBidirectionalRelationImpl enableBidirectionalRelation = new EnableBidirectionalRelationImpl();
		return enableBidirectionalRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableBidirectionalRelation createDisableBidirectionalRelation() {
		DisableBidirectionalRelationImpl disableBidirectionalRelation = new DisableBidirectionalRelationImpl();
		return disableBidirectionalRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeRelationCardinality createChangeRelationCardinality() {
		ChangeRelationCardinalityImpl changeRelationCardinality = new ChangeRelationCardinalityImpl();
		return changeRelationCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAttribute createAddAttribute() {
		AddAttributeImpl addAttribute = new AddAttributeImpl();
		return addAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeAttributeType createChangeAttributeType() {
		ChangeAttributeTypeImpl changeAttributeType = new ChangeAttributeTypeImpl();
		return changeAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveAttribute createRemoveAttribute() {
		RemoveAttributeImpl removeAttribute = new RemoveAttributeImpl();
		return removeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameAttribute createRenameAttribute() {
		RenameAttributeImpl renameAttribute = new RenameAttributeImpl();
		return renameAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameTable createRenameTable() {
		RenameTableImpl renameTable = new RenameTableImpl();
		return renameTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddIdentifier createAddIdentifier() {
		AddIdentifierImpl addIdentifier = new AddIdentifierImpl();
		return addIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAttributesToIdenfifier createAddAttributesToIdenfifier() {
		AddAttributesToIdenfifierImpl addAttributesToIdenfifier = new AddAttributesToIdenfifierImpl();
		return addAttributesToIdenfifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveIdentifier createRemoveIdentifier() {
		RemoveIdentifierImpl removeIdentifier = new RemoveIdentifierImpl();
		return removeIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveAttributesToIdenfifier createRemoveAttributesToIdenfifier() {
		RemoveAttributesToIdenfifierImpl removeAttributesToIdenfifier = new RemoveAttributesToIdenfifierImpl();
		return removeAttributesToIdenfifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameIdentifier createRenameIdentifier() {
		RenameIdentifierImpl renameIdentifier = new RenameIdentifierImpl();
		return renameIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddIndex createAddIndex() {
		AddIndexImpl addIndex = new AddIndexImpl();
		return addIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropIndex createDropIndex() {
		DropIndexImpl dropIndex = new DropIndexImpl();
		return dropIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddGraphAttribute createAddGraphAttribute() {
		AddGraphAttributeImpl addGraphAttribute = new AddGraphAttributeImpl();
		return addGraphAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveGraphAttribute createRemoveGraphAttribute() {
		RemoveGraphAttributeImpl removeGraphAttribute = new RemoveGraphAttributeImpl();
		return removeGraphAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddGraphEdge createAddGraphEdge() {
		AddGraphEdgeImpl addGraphEdge = new AddGraphEdgeImpl();
		return addGraphEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveGraphEdge createRemoveGraphEdge() {
		RemoveGraphEdgeImpl removeGraphEdge = new RemoveGraphEdgeImpl();
		return removeGraphEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenabeGraphEdgeLabel createRenabeGraphEdgeLabel() {
		RenabeGraphEdgeLabelImpl renabeGraphEdgeLabel = new RenabeGraphEdgeLabelImpl();
		return renabeGraphEdgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataType createPrimitiveDataType() {
		PrimitiveDataTypeImpl primitiveDataType = new PrimitiveDataTypeImpl();
		return primitiveDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeText createFreeText() {
		FreeTextImpl freeText = new FreeTextImpl();
		return freeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomDataType createCustomDataType() {
		CustomDataTypeImpl customDataType = new CustomDataTypeImpl();
		return customDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeItem createDataTypeItem() {
		DataTypeItemImpl dataTypeItem = new DataTypeItemImpl();
		return dataTypeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeImplementationPackage createDataTypeImplementationPackage() {
		DataTypeImplementationPackageImpl dataTypeImplementationPackage = new DataTypeImplementationPackageImpl();
		return dataTypeImplementationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityIdentifier createEntityIdentifier() {
		EntityIdentifierImpl entityIdentifier = new EntityIdentifierImpl();
		return entityIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalDB createRelationalDB() {
		RelationalDBImpl relationalDB = new RelationalDBImpl();
		return relationalDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexSpec createIndexSpec() {
		IndexSpecImpl indexSpec = new IndexSpecImpl();
		return indexSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdSpec createIdSpec() {
		IdSpecImpl idSpec = new IdSpecImpl();
		return idSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentDB createDocumentDB() {
		DocumentDBImpl documentDB = new DocumentDBImpl();
		return documentDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection createCollection() {
		CollectionImpl collection = new CollectionImpl();
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueDB createKeyValueDB() {
		KeyValueDBImpl keyValueDB = new KeyValueDBImpl();
		return keyValueDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueElement createKeyValueElement() {
		KeyValueElementImpl keyValueElement = new KeyValueElementImpl();
		return keyValueElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphDB createGraphDB() {
		GraphDBImpl graphDB = new GraphDBImpl();
		return graphDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphNode createGraphNode() {
		GraphNodeImpl graphNode = new GraphNodeImpl();
		return graphNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphAttribute createGraphAttribute() {
		GraphAttributeImpl graphAttribute = new GraphAttributeImpl();
		return graphAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphEdge createGraphEdge() {
		GraphEdgeImpl graphEdge = new GraphEdgeImpl();
		return graphEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphEdgeLabel createGraphEdgeLabel() {
		GraphEdgeLabelImpl graphEdgeLabel = new GraphEdgeLabelImpl();
		return graphEdgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnDB createColumnDB() {
		ColumnDBImpl columnDB = new ColumnDBImpl();
		return columnDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericList createGenericList() {
		GenericListImpl genericList = new GenericListImpl();
		return genericList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality createCardinalityFromString(EDataType eDataType, String initialValue) {
		Cardinality result = Cardinality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TyphonmlPackage getTyphonmlPackage() {
		return (TyphonmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TyphonmlPackage getPackage() {
		return TyphonmlPackage.eINSTANCE;
	}

} //TyphonmlFactoryImpl
