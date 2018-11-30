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
	 * Returns a new object of class '<em>Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Data Type</em>'.
	 * @generated
	 */
	PrimitiveDataType createPrimitiveDataType();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TyphonmlPackage getTyphonmlPackage();

} //TyphonmlFactory
