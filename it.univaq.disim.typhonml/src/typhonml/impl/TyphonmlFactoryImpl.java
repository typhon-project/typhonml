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
			case TyphonmlPackage.PRIMITIVE_DATA_TYPE: return createPrimitiveDataType();
			case TyphonmlPackage.CUSTOM_DATA_TYPE: return createCustomDataType();
			case TyphonmlPackage.DATA_TYPE_ITEM: return createDataTypeItem();
			case TyphonmlPackage.ENTITY: return createEntity();
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
	public PrimitiveDataType createPrimitiveDataType() {
		PrimitiveDataTypeImpl primitiveDataType = new PrimitiveDataTypeImpl();
		return primitiveDataType;
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
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
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
