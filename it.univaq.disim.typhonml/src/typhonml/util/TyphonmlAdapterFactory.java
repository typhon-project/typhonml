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
			public Adapter caseChangeOperator(ChangeOperator object) {
				return createChangeOperatorAdapter();
			}
			@Override
			public Adapter caseAddEntity(AddEntity object) {
				return createAddEntityAdapter();
			}
			@Override
			public Adapter caseRemoveEntity(RemoveEntity object) {
				return createRemoveEntityAdapter();
			}
			@Override
			public Adapter caseSplitEntity(SplitEntity object) {
				return createSplitEntityAdapter();
			}
			@Override
			public Adapter caseMigrateEntity(MigrateEntity object) {
				return createMigrateEntityAdapter();
			}
			@Override
			public Adapter caseMergeEntity(MergeEntity object) {
				return createMergeEntityAdapter();
			}
			@Override
			public Adapter caseAddRelation(AddRelation object) {
				return createAddRelationAdapter();
			}
			@Override
			public Adapter caseRemoveRelation(RemoveRelation object) {
				return createRemoveRelationAdapter();
			}
			@Override
			public Adapter caseRenameRelation(RenameRelation object) {
				return createRenameRelationAdapter();
			}
			@Override
			public Adapter caseEnableRelationContainment(EnableRelationContainment object) {
				return createEnableRelationContainmentAdapter();
			}
			@Override
			public Adapter caseDisableRelationContainment(DisableRelationContainment object) {
				return createDisableRelationContainmentAdapter();
			}
			@Override
			public Adapter caseEnableBidirectionalRelation(EnableBidirectionalRelation object) {
				return createEnableBidirectionalRelationAdapter();
			}
			@Override
			public Adapter caseDisableBidirectionalRelation(DisableBidirectionalRelation object) {
				return createDisableBidirectionalRelationAdapter();
			}
			@Override
			public Adapter caseChangeRelationCardinality(ChangeRelationCardinality object) {
				return createChangeRelationCardinalityAdapter();
			}
			@Override
			public Adapter caseAddAttribute(AddAttribute object) {
				return createAddAttributeAdapter();
			}
			@Override
			public Adapter caseChangeAttributeType(ChangeAttributeType object) {
				return createChangeAttributeTypeAdapter();
			}
			@Override
			public Adapter caseRemoveAttribute(RemoveAttribute object) {
				return createRemoveAttributeAdapter();
			}
			@Override
			public Adapter caseRenameAttribute(RenameAttribute object) {
				return createRenameAttributeAdapter();
			}
			@Override
			public Adapter caseRenameTable(RenameTable object) {
				return createRenameTableAdapter();
			}
			@Override
			public Adapter caseAddIdentifier(AddIdentifier object) {
				return createAddIdentifierAdapter();
			}
			@Override
			public Adapter caseAddAttributesToIdenfifier(AddAttributesToIdenfifier object) {
				return createAddAttributesToIdenfifierAdapter();
			}
			@Override
			public Adapter caseRemoveIdentifier(RemoveIdentifier object) {
				return createRemoveIdentifierAdapter();
			}
			@Override
			public Adapter caseRemoveAttributesToIdenfifier(RemoveAttributesToIdenfifier object) {
				return createRemoveAttributesToIdenfifierAdapter();
			}
			@Override
			public Adapter caseRenameIdentifier(RenameIdentifier object) {
				return createRenameIdentifierAdapter();
			}
			@Override
			public Adapter caseAddIndex(AddIndex object) {
				return createAddIndexAdapter();
			}
			@Override
			public Adapter caseDropIndex(DropIndex object) {
				return createDropIndexAdapter();
			}
			@Override
			public Adapter caseAddGraphAttribute(AddGraphAttribute object) {
				return createAddGraphAttributeAdapter();
			}
			@Override
			public Adapter caseRemoveGraphAttribute(RemoveGraphAttribute object) {
				return createRemoveGraphAttributeAdapter();
			}
			@Override
			public Adapter caseAddGraphEdge(AddGraphEdge object) {
				return createAddGraphEdgeAdapter();
			}
			@Override
			public Adapter caseRemoveGraphEdge(RemoveGraphEdge object) {
				return createRemoveGraphEdgeAdapter();
			}
			@Override
			public Adapter caseRenabeGraphEdgeLabel(RenabeGraphEdgeLabel object) {
				return createRenabeGraphEdgeLabelAdapter();
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
			public Adapter caseFreeText(FreeText object) {
				return createFreeTextAdapter();
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
			public Adapter caseDataTypeImplementationPackage(DataTypeImplementationPackage object) {
				return createDataTypeImplementationPackageAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseEntityIdentifier(EntityIdentifier object) {
				return createEntityIdentifierAdapter();
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
	 * Creates a new adapter for an object of class '{@link typhonml.ChangeOperator <em>Change Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.ChangeOperator
	 * @generated
	 */
	public Adapter createChangeOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.AddEntity <em>Add Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.AddEntity
	 * @generated
	 */
	public Adapter createAddEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.RemoveEntity <em>Remove Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.RemoveEntity
	 * @generated
	 */
	public Adapter createRemoveEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.SplitEntity <em>Split Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.SplitEntity
	 * @generated
	 */
	public Adapter createSplitEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.MigrateEntity <em>Migrate Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.MigrateEntity
	 * @generated
	 */
	public Adapter createMigrateEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.MergeEntity <em>Merge Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.MergeEntity
	 * @generated
	 */
	public Adapter createMergeEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.AddRelation <em>Add Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.AddRelation
	 * @generated
	 */
	public Adapter createAddRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.RemoveRelation <em>Remove Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.RemoveRelation
	 * @generated
	 */
	public Adapter createRemoveRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.RenameRelation <em>Rename Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.RenameRelation
	 * @generated
	 */
	public Adapter createRenameRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.EnableRelationContainment <em>Enable Relation Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.EnableRelationContainment
	 * @generated
	 */
	public Adapter createEnableRelationContainmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.DisableRelationContainment <em>Disable Relation Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.DisableRelationContainment
	 * @generated
	 */
	public Adapter createDisableRelationContainmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.EnableBidirectionalRelation <em>Enable Bidirectional Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.EnableBidirectionalRelation
	 * @generated
	 */
	public Adapter createEnableBidirectionalRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.DisableBidirectionalRelation <em>Disable Bidirectional Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.DisableBidirectionalRelation
	 * @generated
	 */
	public Adapter createDisableBidirectionalRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.ChangeRelationCardinality <em>Change Relation Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.ChangeRelationCardinality
	 * @generated
	 */
	public Adapter createChangeRelationCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.AddAttribute <em>Add Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.AddAttribute
	 * @generated
	 */
	public Adapter createAddAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.ChangeAttributeType <em>Change Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.ChangeAttributeType
	 * @generated
	 */
	public Adapter createChangeAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.RemoveAttribute <em>Remove Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.RemoveAttribute
	 * @generated
	 */
	public Adapter createRemoveAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.RenameAttribute <em>Rename Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.RenameAttribute
	 * @generated
	 */
	public Adapter createRenameAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.RenameTable <em>Rename Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.RenameTable
	 * @generated
	 */
	public Adapter createRenameTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.AddIdentifier <em>Add Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.AddIdentifier
	 * @generated
	 */
	public Adapter createAddIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.AddAttributesToIdenfifier <em>Add Attributes To Idenfifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.AddAttributesToIdenfifier
	 * @generated
	 */
	public Adapter createAddAttributesToIdenfifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.RemoveIdentifier <em>Remove Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.RemoveIdentifier
	 * @generated
	 */
	public Adapter createRemoveIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.RemoveAttributesToIdenfifier <em>Remove Attributes To Idenfifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.RemoveAttributesToIdenfifier
	 * @generated
	 */
	public Adapter createRemoveAttributesToIdenfifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.RenameIdentifier <em>Rename Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.RenameIdentifier
	 * @generated
	 */
	public Adapter createRenameIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.AddIndex <em>Add Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.AddIndex
	 * @generated
	 */
	public Adapter createAddIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.DropIndex <em>Drop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.DropIndex
	 * @generated
	 */
	public Adapter createDropIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.AddGraphAttribute <em>Add Graph Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.AddGraphAttribute
	 * @generated
	 */
	public Adapter createAddGraphAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.RemoveGraphAttribute <em>Remove Graph Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.RemoveGraphAttribute
	 * @generated
	 */
	public Adapter createRemoveGraphAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.AddGraphEdge <em>Add Graph Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.AddGraphEdge
	 * @generated
	 */
	public Adapter createAddGraphEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.RemoveGraphEdge <em>Remove Graph Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.RemoveGraphEdge
	 * @generated
	 */
	public Adapter createRemoveGraphEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.RenabeGraphEdgeLabel <em>Renabe Graph Edge Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.RenabeGraphEdgeLabel
	 * @generated
	 */
	public Adapter createRenabeGraphEdgeLabelAdapter() {
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
	 * Creates a new adapter for an object of class '{@link typhonml.FreeText <em>Free Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.FreeText
	 * @generated
	 */
	public Adapter createFreeTextAdapter() {
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
	 * Creates a new adapter for an object of class '{@link typhonml.DataTypeImplementationPackage <em>Data Type Implementation Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.DataTypeImplementationPackage
	 * @generated
	 */
	public Adapter createDataTypeImplementationPackageAdapter() {
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
	 * Creates a new adapter for an object of class '{@link typhonml.EntityIdentifier <em>Entity Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.EntityIdentifier
	 * @generated
	 */
	public Adapter createEntityIdentifierAdapter() {
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