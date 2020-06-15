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
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseIntType(IntType object) {
				return createIntTypeAdapter();
			}
			@Override
			public Adapter caseBigintType(BigintType object) {
				return createBigintTypeAdapter();
			}
			@Override
			public Adapter caseStringType(StringType object) {
				return createStringTypeAdapter();
			}
			@Override
			public Adapter caseTextType(TextType object) {
				return createTextTypeAdapter();
			}
			@Override
			public Adapter casePointType(PointType object) {
				return createPointTypeAdapter();
			}
			@Override
			public Adapter casePolygonType(PolygonType object) {
				return createPolygonTypeAdapter();
			}
			@Override
			public Adapter caseBoolType(BoolType object) {
				return createBoolTypeAdapter();
			}
			@Override
			public Adapter caseFloatType(FloatType object) {
				return createFloatTypeAdapter();
			}
			@Override
			public Adapter caseBlobType(BlobType object) {
				return createBlobTypeAdapter();
			}
			@Override
			public Adapter caseFreetextType(FreetextType object) {
				return createFreetextTypeAdapter();
			}
			@Override
			public Adapter caseNlpTask(NlpTask object) {
				return createNlpTaskAdapter();
			}
			@Override
			public Adapter caseDateType(DateType object) {
				return createDateTypeAdapter();
			}
			@Override
			public Adapter caseDatetimeType(DatetimeType object) {
				return createDatetimeTypeAdapter();
			}
			@Override
			public Adapter caseCustomDataType(CustomDataType object) {
				return createCustomDataTypeAdapter();
			}
			@Override
			public Adapter caseSuperDataType(SuperDataType object) {
				return createSuperDataTypeAdapter();
			}
			@Override
			public Adapter caseComplexDataType(ComplexDataType object) {
				return createComplexDataTypeAdapter();
			}
			@Override
			public Adapter caseSimpleDataType(SimpleDataType object) {
				return createSimpleDataTypeAdapter();
			}
			@Override
			public Adapter caseCustomDataTypeImplementationPackage(CustomDataTypeImplementationPackage object) {
				return createCustomDataTypeImplementationPackageAdapter();
			}
			@Override
			public Adapter caseFunctionalTag(FunctionalTag object) {
				return createFunctionalTagAdapter();
			}
			@Override
			public Adapter caseNFunctionalTag(NFunctionalTag object) {
				return createNFunctionalTagAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseEntityAttributeKind(EntityAttributeKind object) {
				return createEntityAttributeKindAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseCustomAttribute(CustomAttribute object) {
				return createCustomAttributeAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
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
			public Adapter caseChangeOperator(ChangeOperator object) {
				return createChangeOperatorAdapter();
			}
			@Override
			public Adapter caseAddEntity(AddEntity object) {
				return createAddEntityAdapter();
			}
			@Override
			public Adapter caseRenameEntity(RenameEntity object) {
				return createRenameEntityAdapter();
			}
			@Override
			public Adapter caseRemoveEntity(RemoveEntity object) {
				return createRemoveEntityAdapter();
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
			public Adapter caseChangeRelationContainement(ChangeRelationContainement object) {
				return createChangeRelationContainementAdapter();
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
			public Adapter caseSplitEntity(SplitEntity object) {
				return createSplitEntityAdapter();
			}
			@Override
			public Adapter caseSplitEntityVertical(SplitEntityVertical object) {
				return createSplitEntityVerticalAdapter();
			}
			@Override
			public Adapter caseSplitEntityHorizontal(SplitEntityHorizontal object) {
				return createSplitEntityHorizontalAdapter();
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
			public Adapter caseRenameTable(RenameTable object) {
				return createRenameTableAdapter();
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
			public Adapter caseAddAttributesToIndex(AddAttributesToIndex object) {
				return createAddAttributesToIndexAdapter();
			}
			@Override
			public Adapter caseRemoveAttributesToIndex(RemoveAttributesToIndex object) {
				return createRemoveAttributesToIndexAdapter();
			}
			@Override
			public Adapter caseRenameCollection(RenameCollection object) {
				return createRenameCollectionAdapter();
			}
			@Override
			public Adapter caseAddCollectionIndex(AddCollectionIndex object) {
				return createAddCollectionIndexAdapter();
			}
			@Override
			public Adapter caseDropCollectionIndex(DropCollectionIndex object) {
				return createDropCollectionIndexAdapter();
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
			public Adapter caseChangePrimitiveDataTypeAttribute(ChangePrimitiveDataTypeAttribute object) {
				return createChangePrimitiveDataTypeAttributeAdapter();
			}
			@Override
			public Adapter caseChangeCustomDataTypeAttribute(ChangeCustomDataTypeAttribute object) {
				return createChangeCustomDataTypeAttributeAdapter();
			}
			@Override
			public Adapter caseAddCustomDataType(AddCustomDataType object) {
				return createAddCustomDataTypeAdapter();
			}
			@Override
			public Adapter caseAddPrimitiveDataTypeAttribute(AddPrimitiveDataTypeAttribute object) {
				return createAddPrimitiveDataTypeAttributeAdapter();
			}
			@Override
			public Adapter caseAddCustomDataTypeAttribute(AddCustomDataTypeAttribute object) {
				return createAddCustomDataTypeAttributeAdapter();
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
	 * Creates a new adapter for an object of class '{@link typhonml.IntType <em>Int Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.IntType
	 * @generated
	 */
	public Adapter createIntTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.BigintType <em>Bigint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.BigintType
	 * @generated
	 */
	public Adapter createBigintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.StringType
	 * @generated
	 */
	public Adapter createStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.TextType <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.TextType
	 * @generated
	 */
	public Adapter createTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.PointType
	 * @generated
	 */
	public Adapter createPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.PolygonType <em>Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.PolygonType
	 * @generated
	 */
	public Adapter createPolygonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.BoolType <em>Bool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.BoolType
	 * @generated
	 */
	public Adapter createBoolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.FloatType
	 * @generated
	 */
	public Adapter createFloatTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.BlobType <em>Blob Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.BlobType
	 * @generated
	 */
	public Adapter createBlobTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.FreetextType <em>Freetext Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.FreetextType
	 * @generated
	 */
	public Adapter createFreetextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.NlpTask <em>Nlp Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.NlpTask
	 * @generated
	 */
	public Adapter createNlpTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.DateType
	 * @generated
	 */
	public Adapter createDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.DatetimeType <em>Datetime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.DatetimeType
	 * @generated
	 */
	public Adapter createDatetimeTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link typhonml.SuperDataType <em>Super Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.SuperDataType
	 * @generated
	 */
	public Adapter createSuperDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.ComplexDataType <em>Complex Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.ComplexDataType
	 * @generated
	 */
	public Adapter createComplexDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.SimpleDataType <em>Simple Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.SimpleDataType
	 * @generated
	 */
	public Adapter createSimpleDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.CustomDataTypeImplementationPackage <em>Custom Data Type Implementation Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.CustomDataTypeImplementationPackage
	 * @generated
	 */
	public Adapter createCustomDataTypeImplementationPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.FunctionalTag <em>Functional Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.FunctionalTag
	 * @generated
	 */
	public Adapter createFunctionalTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.NFunctionalTag <em>NFunctional Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.NFunctionalTag
	 * @generated
	 */
	public Adapter createNFunctionalTagAdapter() {
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
	 * Creates a new adapter for an object of class '{@link typhonml.EntityAttributeKind <em>Entity Attribute Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.EntityAttributeKind
	 * @generated
	 */
	public Adapter createEntityAttributeKindAdapter() {
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
	 * Creates a new adapter for an object of class '{@link typhonml.CustomAttribute <em>Custom Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.CustomAttribute
	 * @generated
	 */
	public Adapter createCustomAttributeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link typhonml.RenameEntity <em>Rename Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.RenameEntity
	 * @generated
	 */
	public Adapter createRenameEntityAdapter() {
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
	 * Creates a new adapter for an object of class '{@link typhonml.ChangeRelationContainement <em>Change Relation Containement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.ChangeRelationContainement
	 * @generated
	 */
	public Adapter createChangeRelationContainementAdapter() {
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
	 * Creates a new adapter for an object of class '{@link typhonml.SplitEntityVertical <em>Split Entity Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.SplitEntityVertical
	 * @generated
	 */
	public Adapter createSplitEntityVerticalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.SplitEntityHorizontal <em>Split Entity Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.SplitEntityHorizontal
	 * @generated
	 */
	public Adapter createSplitEntityHorizontalAdapter() {
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
	 * Creates a new adapter for an object of class '{@link typhonml.AddAttributesToIndex <em>Add Attributes To Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.AddAttributesToIndex
	 * @generated
	 */
	public Adapter createAddAttributesToIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.RemoveAttributesToIndex <em>Remove Attributes To Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.RemoveAttributesToIndex
	 * @generated
	 */
	public Adapter createRemoveAttributesToIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.RenameCollection <em>Rename Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.RenameCollection
	 * @generated
	 */
	public Adapter createRenameCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.AddCollectionIndex <em>Add Collection Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.AddCollectionIndex
	 * @generated
	 */
	public Adapter createAddCollectionIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.DropCollectionIndex <em>Drop Collection Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.DropCollectionIndex
	 * @generated
	 */
	public Adapter createDropCollectionIndexAdapter() {
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
	 * Creates a new adapter for an object of class '{@link typhonml.AddCustomDataTypeAttribute <em>Add Custom Data Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.AddCustomDataTypeAttribute
	 * @generated
	 */
	public Adapter createAddCustomDataTypeAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.ChangePrimitiveDataTypeAttribute <em>Change Primitive Data Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.ChangePrimitiveDataTypeAttribute
	 * @generated
	 */
	public Adapter createChangePrimitiveDataTypeAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.ChangeCustomDataTypeAttribute <em>Change Custom Data Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.ChangeCustomDataTypeAttribute
	 * @generated
	 */
	public Adapter createChangeCustomDataTypeAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.AddCustomDataType <em>Add Custom Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.AddCustomDataType
	 * @generated
	 */
	public Adapter createAddCustomDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link typhonml.AddPrimitiveDataTypeAttribute <em>Add Primitive Data Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see typhonml.AddPrimitiveDataTypeAttribute
	 * @generated
	 */
	public Adapter createAddPrimitiveDataTypeAttributeAdapter() {
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
