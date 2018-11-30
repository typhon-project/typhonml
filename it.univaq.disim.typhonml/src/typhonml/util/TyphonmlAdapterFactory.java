/**
 */
package typhonml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import typhonml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see typhonml.TyphonmlPackage
 * @generated
 */
public class TyphonmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TyphonmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TyphonmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TyphonmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TyphonmlSwitch<Adapter> modelSwitch =
		new TyphonmlSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter casePrimitiveDataType(PrimitiveDataType object) {
				return createPrimitiveDataTypeAdapter();
			}
			@Override
			public Adapter caseCustomDataType(CustomDataType object) {
				return createCustomDataTypeAdapter();
			}
			@Override
			public Adapter caseDataTypeItem(DataTypeItem object) {
				return createDataTypeItemAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseRelationalDB(RelationalDB object) {
				return createRelationalDBAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseIndexSpec(IndexSpec object) {
				return createIndexSpecAdapter();
			}
			@Override
			public Adapter caseIdSpec(IdSpec object) {
				return createIdSpecAdapter();
			}
			@Override
			public Adapter caseDocumentDB(DocumentDB object) {
				return createDocumentDBAdapter();
			}
			@Override
			public Adapter caseCollection(Collection object) {
				return createCollectionAdapter();
			}
			@Override
			public Adapter caseKeyValueDB(KeyValueDB object) {
				return createKeyValueDBAdapter();
			}
			@Override
			public Adapter caseKeyValueElement(KeyValueElement object) {
				return createKeyValueElementAdapter();
			}
			@Override
			public Adapter caseGraphDB(GraphDB object) {
				return createGraphDBAdapter();
			}
			@Override
			public Adapter caseGraphNode(GraphNode object) {
				return createGraphNodeAdapter();
			}
			@Override
			public Adapter caseGraphAttribute(GraphAttribute object) {
				return createGraphAttributeAdapter();
			}
			@Override
			public Adapter caseGraphEdge(GraphEdge object) {
				return createGraphEdgeAdapter();
			}
			@Override
			public Adapter caseGraphEdgeLabel(GraphEdgeLabel object) {
				return createGraphEdgeLabelAdapter();
			}
			@Override
			public Adapter caseColumnDB(ColumnDB object) {
				return createColumnDBAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseGenericList(GenericList object) {
				return createGenericListAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link typhonml.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.PrimitiveDataType
	 * @generated
	 */
	public Adapter createPrimitiveDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.CustomDataType <em>Custom Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.CustomDataType
	 * @generated
	 */
	public Adapter createCustomDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.DataTypeItem <em>Data Type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.DataTypeItem
	 * @generated
	 */
	public Adapter createDataTypeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.RelationalDB <em>Relational DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.RelationalDB
	 * @generated
	 */
	public Adapter createRelationalDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.IndexSpec <em>Index Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.IndexSpec
	 * @generated
	 */
	public Adapter createIndexSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.IdSpec <em>Id Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.IdSpec
	 * @generated
	 */
	public Adapter createIdSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.DocumentDB <em>Document DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.DocumentDB
	 * @generated
	 */
	public Adapter createDocumentDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.Collection
	 * @generated
	 */
	public Adapter createCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.KeyValueDB <em>Key Value DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.KeyValueDB
	 * @generated
	 */
	public Adapter createKeyValueDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.KeyValueElement <em>Key Value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.KeyValueElement
	 * @generated
	 */
	public Adapter createKeyValueElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.GraphDB <em>Graph DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.GraphDB
	 * @generated
	 */
	public Adapter createGraphDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.GraphNode <em>Graph Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.GraphNode
	 * @generated
	 */
	public Adapter createGraphNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.GraphAttribute <em>Graph Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.GraphAttribute
	 * @generated
	 */
	public Adapter createGraphAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.GraphEdge <em>Graph Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.GraphEdge
	 * @generated
	 */
	public Adapter createGraphEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.GraphEdgeLabel <em>Graph Edge Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.GraphEdgeLabel
	 * @generated
	 */
	public Adapter createGraphEdgeLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.ColumnDB <em>Column DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.ColumnDB
	 * @generated
	 */
	public Adapter createColumnDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.GenericList <em>Generic List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.GenericList
	 * @generated
	 */
	public Adapter createGenericListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TyphonmlAdapterFactory
