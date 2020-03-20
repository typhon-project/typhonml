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
			case TyphonmlPackage.INT_TYPE: return createIntType();
			case TyphonmlPackage.BIGINT_TYPE: return createBigintType();
			case TyphonmlPackage.STRING_TYPE: return createStringType();
			case TyphonmlPackage.TEXT_TYPE: return createTextType();
			case TyphonmlPackage.POINT_TYPE: return createPointType();
			case TyphonmlPackage.POLYGON_TYPE: return createPolygonType();
			case TyphonmlPackage.BOOL_TYPE: return createBoolType();
			case TyphonmlPackage.FLOAT_TYPE: return createFloatType();
			case TyphonmlPackage.BLOB_TYPE: return createBlobType();
			case TyphonmlPackage.FREETEXT_TYPE: return createFreetextType();
			case TyphonmlPackage.NLP_TASK: return createNlpTask();
			case TyphonmlPackage.DATE_TYPE: return createDateType();
			case TyphonmlPackage.DATETIME_TYPE: return createDatetimeType();
			case TyphonmlPackage.CUSTOM_DATA_TYPE: return createCustomDataType();
			case TyphonmlPackage.CUSTOM_DATA_TYPE_ITEM: return createCustomDataTypeItem();
			case TyphonmlPackage.CUSTOM_DATA_TYPE_IMPLEMENTATION_PACKAGE: return createCustomDataTypeImplementationPackage();
			case TyphonmlPackage.FUNCTIONAL_TAG: return createFunctionalTag();
			case TyphonmlPackage.NFUNCTIONAL_TAG: return createNFunctionalTag();
			case TyphonmlPackage.ENTITY: return createEntity();
			case TyphonmlPackage.ATTRIBUTE: return createAttribute();
			case TyphonmlPackage.CUSTOM_ATTRIBUTE: return createCustomAttribute();
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
			case TyphonmlPackage.ADD_ENTITY: return createAddEntity();
			case TyphonmlPackage.RENAME_ENTITY: return createRenameEntity();
			case TyphonmlPackage.REMOVE_ENTITY: return createRemoveEntity();
			case TyphonmlPackage.REMOVE_ATTRIBUTE: return createRemoveAttribute();
			case TyphonmlPackage.RENAME_ATTRIBUTE: return createRenameAttribute();
			case TyphonmlPackage.CHANGE_RELATION_CONTAINEMENT: return createChangeRelationContainement();
			case TyphonmlPackage.ADD_RELATION: return createAddRelation();
			case TyphonmlPackage.REMOVE_RELATION: return createRemoveRelation();
			case TyphonmlPackage.RENAME_RELATION: return createRenameRelation();
			case TyphonmlPackage.ENABLE_RELATION_CONTAINMENT: return createEnableRelationContainment();
			case TyphonmlPackage.DISABLE_RELATION_CONTAINMENT: return createDisableRelationContainment();
			case TyphonmlPackage.ENABLE_BIDIRECTIONAL_RELATION: return createEnableBidirectionalRelation();
			case TyphonmlPackage.DISABLE_BIDIRECTIONAL_RELATION: return createDisableBidirectionalRelation();
			case TyphonmlPackage.CHANGE_RELATION_CARDINALITY: return createChangeRelationCardinality();
			case TyphonmlPackage.SPLIT_ENTITY: return createSplitEntity();
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL: return createSplitEntityVertical();
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL: return createSplitEntityHorizontal();
			case TyphonmlPackage.MIGRATE_ENTITY: return createMigrateEntity();
			case TyphonmlPackage.MERGE_ENTITY: return createMergeEntity();
			case TyphonmlPackage.RENAME_TABLE: return createRenameTable();
			case TyphonmlPackage.ADD_INDEX: return createAddIndex();
			case TyphonmlPackage.DROP_INDEX: return createDropIndex();
			case TyphonmlPackage.ADD_ATTRIBUTES_TO_INDEX: return createAddAttributesToIndex();
			case TyphonmlPackage.REMOVE_ATTRIBUTES_TO_INDEX: return createRemoveAttributesToIndex();
			case TyphonmlPackage.RENAME_COLLECTION: return createRenameCollection();
			case TyphonmlPackage.ADD_COLLECTION_INDEX: return createAddCollectionIndex();
			case TyphonmlPackage.DROP_COLLECTION_INDEX: return createDropCollectionIndex();
			case TyphonmlPackage.ADD_GRAPH_ATTRIBUTE: return createAddGraphAttribute();
			case TyphonmlPackage.REMOVE_GRAPH_ATTRIBUTE: return createRemoveGraphAttribute();
			case TyphonmlPackage.ADD_GRAPH_EDGE: return createAddGraphEdge();
			case TyphonmlPackage.REMOVE_GRAPH_EDGE: return createRemoveGraphEdge();
			case TyphonmlPackage.RENABE_GRAPH_EDGE_LABEL: return createRenabeGraphEdgeLabel();
			case TyphonmlPackage.ADD_CUSTOM_DATA_TYPE_ATTRIBUTE: return createAddCustomDataTypeAttribute();
			case TyphonmlPackage.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE: return createChangePrimitiveDataTypeAttribute();
			case TyphonmlPackage.CHANGE_CUSTOM_DATA_TYPE_ATTRIBUTE: return createChangeCustomDataTypeAttribute();
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
			case TyphonmlPackage.NLP_TASK_TYPE:
				return createNlpTaskTypeFromString(eDataType, initialValue);
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
			case TyphonmlPackage.NLP_TASK_TYPE:
				return convertNlpTaskTypeToString(eDataType, instanceValue);
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
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntType createIntType() {
		IntTypeImpl intType = new IntTypeImpl();
		return intType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigintType createBigintType() {
		BigintTypeImpl bigintType = new BigintTypeImpl();
		return bigintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextType createTextType() {
		TextTypeImpl textType = new TextTypeImpl();
		return textType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType createPointType() {
		PointTypeImpl pointType = new PointTypeImpl();
		return pointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolygonType createPolygonType() {
		PolygonTypeImpl polygonType = new PolygonTypeImpl();
		return polygonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoolType createBoolType() {
		BoolTypeImpl boolType = new BoolTypeImpl();
		return boolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloatType createFloatType() {
		FloatTypeImpl floatType = new FloatTypeImpl();
		return floatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlobType createBlobType() {
		BlobTypeImpl blobType = new BlobTypeImpl();
		return blobType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreetextType createFreetextType() {
		FreetextTypeImpl freetextType = new FreetextTypeImpl();
		return freetextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NlpTask createNlpTask() {
		NlpTaskImpl nlpTask = new NlpTaskImpl();
		return nlpTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateType createDateType() {
		DateTypeImpl dateType = new DateTypeImpl();
		return dateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatetimeType createDatetimeType() {
		DatetimeTypeImpl datetimeType = new DatetimeTypeImpl();
		return datetimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomDataType createCustomDataType() {
		CustomDataTypeImpl customDataType = new CustomDataTypeImpl();
		return customDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomDataTypeItem createCustomDataTypeItem() {
		CustomDataTypeItemImpl customDataTypeItem = new CustomDataTypeItemImpl();
		return customDataTypeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomDataTypeImplementationPackage createCustomDataTypeImplementationPackage() {
		CustomDataTypeImplementationPackageImpl customDataTypeImplementationPackage = new CustomDataTypeImplementationPackageImpl();
		return customDataTypeImplementationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalTag createFunctionalTag() {
		FunctionalTagImpl functionalTag = new FunctionalTagImpl();
		return functionalTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NFunctionalTag createNFunctionalTag() {
		NFunctionalTagImpl nFunctionalTag = new NFunctionalTagImpl();
		return nFunctionalTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomAttribute createCustomAttribute() {
		CustomAttributeImpl customAttribute = new CustomAttributeImpl();
		return customAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationalDB createRelationalDB() {
		RelationalDBImpl relationalDB = new RelationalDBImpl();
		return relationalDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexSpec createIndexSpec() {
		IndexSpecImpl indexSpec = new IndexSpecImpl();
		return indexSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdSpec createIdSpec() {
		IdSpecImpl idSpec = new IdSpecImpl();
		return idSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentDB createDocumentDB() {
		DocumentDBImpl documentDB = new DocumentDBImpl();
		return documentDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection createCollection() {
		CollectionImpl collection = new CollectionImpl();
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValueDB createKeyValueDB() {
		KeyValueDBImpl keyValueDB = new KeyValueDBImpl();
		return keyValueDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValueElement createKeyValueElement() {
		KeyValueElementImpl keyValueElement = new KeyValueElementImpl();
		return keyValueElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphDB createGraphDB() {
		GraphDBImpl graphDB = new GraphDBImpl();
		return graphDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphNode createGraphNode() {
		GraphNodeImpl graphNode = new GraphNodeImpl();
		return graphNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphAttribute createGraphAttribute() {
		GraphAttributeImpl graphAttribute = new GraphAttributeImpl();
		return graphAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphEdge createGraphEdge() {
		GraphEdgeImpl graphEdge = new GraphEdgeImpl();
		return graphEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphEdgeLabel createGraphEdgeLabel() {
		GraphEdgeLabelImpl graphEdgeLabel = new GraphEdgeLabelImpl();
		return graphEdgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnDB createColumnDB() {
		ColumnDBImpl columnDB = new ColumnDBImpl();
		return columnDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddEntity createAddEntity() {
		AddEntityImpl addEntity = new AddEntityImpl();
		return addEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenameEntity createRenameEntity() {
		RenameEntityImpl renameEntity = new RenameEntityImpl();
		return renameEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveEntity createRemoveEntity() {
		RemoveEntityImpl removeEntity = new RemoveEntityImpl();
		return removeEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveAttribute createRemoveAttribute() {
		RemoveAttributeImpl removeAttribute = new RemoveAttributeImpl();
		return removeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenameAttribute createRenameAttribute() {
		RenameAttributeImpl renameAttribute = new RenameAttributeImpl();
		return renameAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeRelationContainement createChangeRelationContainement() {
		ChangeRelationContainementImpl changeRelationContainement = new ChangeRelationContainementImpl();
		return changeRelationContainement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddRelation createAddRelation() {
		AddRelationImpl addRelation = new AddRelationImpl();
		return addRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveRelation createRemoveRelation() {
		RemoveRelationImpl removeRelation = new RemoveRelationImpl();
		return removeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenameRelation createRenameRelation() {
		RenameRelationImpl renameRelation = new RenameRelationImpl();
		return renameRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnableRelationContainment createEnableRelationContainment() {
		EnableRelationContainmentImpl enableRelationContainment = new EnableRelationContainmentImpl();
		return enableRelationContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisableRelationContainment createDisableRelationContainment() {
		DisableRelationContainmentImpl disableRelationContainment = new DisableRelationContainmentImpl();
		return disableRelationContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnableBidirectionalRelation createEnableBidirectionalRelation() {
		EnableBidirectionalRelationImpl enableBidirectionalRelation = new EnableBidirectionalRelationImpl();
		return enableBidirectionalRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisableBidirectionalRelation createDisableBidirectionalRelation() {
		DisableBidirectionalRelationImpl disableBidirectionalRelation = new DisableBidirectionalRelationImpl();
		return disableBidirectionalRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeRelationCardinality createChangeRelationCardinality() {
		ChangeRelationCardinalityImpl changeRelationCardinality = new ChangeRelationCardinalityImpl();
		return changeRelationCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SplitEntity createSplitEntity() {
		SplitEntityImpl splitEntity = new SplitEntityImpl();
		return splitEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SplitEntityVertical createSplitEntityVertical() {
		SplitEntityVerticalImpl splitEntityVertical = new SplitEntityVerticalImpl();
		return splitEntityVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SplitEntityHorizontal createSplitEntityHorizontal() {
		SplitEntityHorizontalImpl splitEntityHorizontal = new SplitEntityHorizontalImpl();
		return splitEntityHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MigrateEntity createMigrateEntity() {
		MigrateEntityImpl migrateEntity = new MigrateEntityImpl();
		return migrateEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergeEntity createMergeEntity() {
		MergeEntityImpl mergeEntity = new MergeEntityImpl();
		return mergeEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenameTable createRenameTable() {
		RenameTableImpl renameTable = new RenameTableImpl();
		return renameTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddIndex createAddIndex() {
		AddIndexImpl addIndex = new AddIndexImpl();
		return addIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DropIndex createDropIndex() {
		DropIndexImpl dropIndex = new DropIndexImpl();
		return dropIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddAttributesToIndex createAddAttributesToIndex() {
		AddAttributesToIndexImpl addAttributesToIndex = new AddAttributesToIndexImpl();
		return addAttributesToIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveAttributesToIndex createRemoveAttributesToIndex() {
		RemoveAttributesToIndexImpl removeAttributesToIndex = new RemoveAttributesToIndexImpl();
		return removeAttributesToIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenameCollection createRenameCollection() {
		RenameCollectionImpl renameCollection = new RenameCollectionImpl();
		return renameCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddCollectionIndex createAddCollectionIndex() {
		AddCollectionIndexImpl addCollectionIndex = new AddCollectionIndexImpl();
		return addCollectionIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DropCollectionIndex createDropCollectionIndex() {
		DropCollectionIndexImpl dropCollectionIndex = new DropCollectionIndexImpl();
		return dropCollectionIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddGraphAttribute createAddGraphAttribute() {
		AddGraphAttributeImpl addGraphAttribute = new AddGraphAttributeImpl();
		return addGraphAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveGraphAttribute createRemoveGraphAttribute() {
		RemoveGraphAttributeImpl removeGraphAttribute = new RemoveGraphAttributeImpl();
		return removeGraphAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddGraphEdge createAddGraphEdge() {
		AddGraphEdgeImpl addGraphEdge = new AddGraphEdgeImpl();
		return addGraphEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RemoveGraphEdge createRemoveGraphEdge() {
		RemoveGraphEdgeImpl removeGraphEdge = new RemoveGraphEdgeImpl();
		return removeGraphEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenabeGraphEdgeLabel createRenabeGraphEdgeLabel() {
		RenabeGraphEdgeLabelImpl renabeGraphEdgeLabel = new RenabeGraphEdgeLabelImpl();
		return renabeGraphEdgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddCustomDataTypeAttribute createAddCustomDataTypeAttribute() {
		AddCustomDataTypeAttributeImpl addCustomDataTypeAttribute = new AddCustomDataTypeAttributeImpl();
		return addCustomDataTypeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangePrimitiveDataTypeAttribute createChangePrimitiveDataTypeAttribute() {
		ChangePrimitiveDataTypeAttributeImpl changePrimitiveDataTypeAttribute = new ChangePrimitiveDataTypeAttributeImpl();
		return changePrimitiveDataTypeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeCustomDataTypeAttribute createChangeCustomDataTypeAttribute() {
		ChangeCustomDataTypeAttributeImpl changeCustomDataTypeAttribute = new ChangeCustomDataTypeAttributeImpl();
		return changeCustomDataTypeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NlpTaskType createNlpTaskTypeFromString(EDataType eDataType, String initialValue) {
		NlpTaskType result = NlpTaskType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNlpTaskTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	@Override
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
