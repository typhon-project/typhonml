/**
 */
package typhonml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see typhonml.TyphonmlPackage
 * @generated
 */
public interface TyphonmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TyphonmlFactory eINSTANCE = typhonml.impl.TyphonmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Add Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Entity</em>'.
	 * @generated
	 */
	AddEntity createAddEntity();

	/**
	 * Returns a new object of class '<em>Remove Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Entity</em>'.
	 * @generated
	 */
	RemoveEntity createRemoveEntity();

	/**
	 * Returns a new object of class '<em>Split Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Split Entity</em>'.
	 * @generated
	 */
	SplitEntity createSplitEntity();

	/**
	 * Returns a new object of class '<em>Migrate Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Migrate Entity</em>'.
	 * @generated
	 */
	MigrateEntity createMigrateEntity();

	/**
	 * Returns a new object of class '<em>Merge Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Entity</em>'.
	 * @generated
	 */
	MergeEntity createMergeEntity();

	/**
	 * Returns a new object of class '<em>Add Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Relation</em>'.
	 * @generated
	 */
	AddRelation createAddRelation();

	/**
	 * Returns a new object of class '<em>Remove Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Relation</em>'.
	 * @generated
	 */
	RemoveRelation createRemoveRelation();

	/**
	 * Returns a new object of class '<em>Rename Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Relation</em>'.
	 * @generated
	 */
	RenameRelation createRenameRelation();

	/**
	 * Returns a new object of class '<em>Enable Relation Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enable Relation Containment</em>'.
	 * @generated
	 */
	EnableRelationContainment createEnableRelationContainment();

	/**
	 * Returns a new object of class '<em>Disable Relation Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disable Relation Containment</em>'.
	 * @generated
	 */
	DisableRelationContainment createDisableRelationContainment();

	/**
	 * Returns a new object of class '<em>Enable Bidirectional Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enable Bidirectional Relation</em>'.
	 * @generated
	 */
	EnableBidirectionalRelation createEnableBidirectionalRelation();

	/**
	 * Returns a new object of class '<em>Disable Bidirectional Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disable Bidirectional Relation</em>'.
	 * @generated
	 */
	DisableBidirectionalRelation createDisableBidirectionalRelation();

	/**
	 * Returns a new object of class '<em>Change Relation Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Relation Cardinality</em>'.
	 * @generated
	 */
	ChangeRelationCardinality createChangeRelationCardinality();

	/**
	 * Returns a new object of class '<em>Add Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Attribute</em>'.
	 * @generated
	 */
	AddAttribute createAddAttribute();

	/**
	 * Returns a new object of class '<em>Change Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Attribute Type</em>'.
	 * @generated
	 */
	ChangeAttributeType createChangeAttributeType();

	/**
	 * Returns a new object of class '<em>Remove Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Attribute</em>'.
	 * @generated
	 */
	RemoveAttribute createRemoveAttribute();

	/**
	 * Returns a new object of class '<em>Rename Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Attribute</em>'.
	 * @generated
	 */
	RenameAttribute createRenameAttribute();

	/**
	 * Returns a new object of class '<em>Rename Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Table</em>'.
	 * @generated
	 */
	RenameTable createRenameTable();

	/**
	 * Returns a new object of class '<em>Add Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Index</em>'.
	 * @generated
	 */
	AddIndex createAddIndex();

	/**
	 * Returns a new object of class '<em>Drop Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Index</em>'.
	 * @generated
	 */
	DropIndex createDropIndex();

	/**
	 * Returns a new object of class '<em>Add Attributes To Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Attributes To Index</em>'.
	 * @generated
	 */
	AddAttributesToIndex createAddAttributesToIndex();

	/**
	 * Returns a new object of class '<em>Remove Attributes To Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Attributes To Index</em>'.
	 * @generated
	 */
	RemoveAttributesToIndex createRemoveAttributesToIndex();

	/**
	 * Returns a new object of class '<em>Rename Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Collection</em>'.
	 * @generated
	 */
	RenameCollection createRenameCollection();

	/**
	 * Returns a new object of class '<em>Add Collection Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Collection Index</em>'.
	 * @generated
	 */
	AddCollectionIndex createAddCollectionIndex();

	/**
	 * Returns a new object of class '<em>Drop Collection Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Collection Index</em>'.
	 * @generated
	 */
	DropCollectionIndex createDropCollectionIndex();

	/**
	 * Returns a new object of class '<em>Add Graph Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Graph Attribute</em>'.
	 * @generated
	 */
	AddGraphAttribute createAddGraphAttribute();

	/**
	 * Returns a new object of class '<em>Remove Graph Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Graph Attribute</em>'.
	 * @generated
	 */
	RemoveGraphAttribute createRemoveGraphAttribute();

	/**
	 * Returns a new object of class '<em>Add Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Graph Edge</em>'.
	 * @generated
	 */
	AddGraphEdge createAddGraphEdge();

	/**
	 * Returns a new object of class '<em>Remove Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Graph Edge</em>'.
	 * @generated
	 */
	RemoveGraphEdge createRemoveGraphEdge();

	/**
	 * Returns a new object of class '<em>Renabe Graph Edge Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Renabe Graph Edge Label</em>'.
	 * @generated
	 */
	RenabeGraphEdgeLabel createRenabeGraphEdgeLabel();

	/**
	 * Returns a new object of class '<em>Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Data Type</em>'.
	 * @generated
	 */
	PrimitiveDataType createPrimitiveDataType();

	/**
	 * Returns a new object of class '<em>Free Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Free Text</em>'.
	 * @generated
	 */
	FreeText createFreeText();

	/**
	 * Returns a new object of class '<em>Nlp Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nlp Task</em>'.
	 * @generated
	 */
	NlpTask createNlpTask();

	/**
	 * Returns a new object of class '<em>Custom Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Data Type</em>'.
	 * @generated
	 */
	CustomDataType createCustomDataType();

	/**
	 * Returns a new object of class '<em>Data Type Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type Item</em>'.
	 * @generated
	 */
	DataTypeItem createDataTypeItem();

	/**
	 * Returns a new object of class '<em>Data Type Implementation Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type Implementation Package</em>'.
	 * @generated
	 */
	DataTypeImplementationPackage createDataTypeImplementationPackage();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation</em>'.
	 * @generated
	 */
	Relation createRelation();

	/**
	 * Returns a new object of class '<em>Relational DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational DB</em>'.
	 * @generated
	 */
	RelationalDB createRelationalDB();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Index Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Spec</em>'.
	 * @generated
	 */
	IndexSpec createIndexSpec();

	/**
	 * Returns a new object of class '<em>Id Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Spec</em>'.
	 * @generated
	 */
	IdSpec createIdSpec();

	/**
	 * Returns a new object of class '<em>Document DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document DB</em>'.
	 * @generated
	 */
	DocumentDB createDocumentDB();

	/**
	 * Returns a new object of class '<em>Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection</em>'.
	 * @generated
	 */
	Collection createCollection();

	/**
	 * Returns a new object of class '<em>Key Value DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value DB</em>'.
	 * @generated
	 */
	KeyValueDB createKeyValueDB();

	/**
	 * Returns a new object of class '<em>Key Value Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value Element</em>'.
	 * @generated
	 */
	KeyValueElement createKeyValueElement();

	/**
	 * Returns a new object of class '<em>Graph DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph DB</em>'.
	 * @generated
	 */
	GraphDB createGraphDB();

	/**
	 * Returns a new object of class '<em>Graph Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph Node</em>'.
	 * @generated
	 */
	GraphNode createGraphNode();

	/**
	 * Returns a new object of class '<em>Graph Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph Attribute</em>'.
	 * @generated
	 */
	GraphAttribute createGraphAttribute();

	/**
	 * Returns a new object of class '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph Edge</em>'.
	 * @generated
	 */
	GraphEdge createGraphEdge();

	/**
	 * Returns a new object of class '<em>Graph Edge Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph Edge Label</em>'.
	 * @generated
	 */
	GraphEdgeLabel createGraphEdgeLabel();

	/**
	 * Returns a new object of class '<em>Column DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column DB</em>'.
	 * @generated
	 */
	ColumnDB createColumnDB();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns a new object of class '<em>Generic List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic List</em>'.
	 * @generated
	 */
	GenericList createGenericList();

	/**
	 * Returns a new object of class '<em>Rename Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Entity</em>'.
	 * @generated
	 */
	RenameEntity createRenameEntity();

	/**
	 * Returns a new object of class '<em>Change Relation Containement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Relation Containement</em>'.
	 * @generated
	 */
	ChangeRelationContainement createChangeRelationContainement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TyphonmlPackage getTyphonmlPackage();

} //TyphonmlFactory
