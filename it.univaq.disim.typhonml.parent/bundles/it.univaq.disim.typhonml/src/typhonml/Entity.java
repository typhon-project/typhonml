/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link typhonml.Entity#getRelations <em>Relations</em>}</li>
 *   <li>{@link typhonml.Entity#getFunctionalTags <em>Functional Tags</em>}</li>
 *   <li>{@link typhonml.Entity#getNfunctionalTags <em>Nfunctional Tags</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='EmptyEntity EntytiNotMapped'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot EmptyEntity='attributes-&gt;size() + relations-&gt;size() &gt; 0' EntytiNotMapped='\n\t\t\t(typhonml::Table.allInstances()-&gt;select(e | e.entity = self)-&gt;size() +\n\t\t\ttyphonml::Collection.allInstances()-&gt;select(e | e.entity = self)-&gt;size() + \t\t\t\n\t\t\ttyphonml::GraphEdge.allInstances()-&gt;select(e | e.entity = self)-&gt;size() + \n\t\t\ttyphonml::KeyValueElement.allInstances()-&gt;select(e | e.entity = self)-&gt;size() +\n\t\t\ttyphonml::KeyValueElement.allInstances()-&gt;select(e | e.entity = self)-&gt;size() +\n\t\t\ttyphonml::Column.allInstances()-&gt;select(e | e.entity = self)-&gt;size() +\n\t\t\ttyphonml::KeyValueElement.allInstances()-&gt;select(e | e.entity = self)-&gt;size())&gt;0'"
 * @generated
 */
public interface Entity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.EntityAttributeKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityAttributeKind> getAttributes();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getEntity_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Functional Tags</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.FunctionalTag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Tags</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getEntity_FunctionalTags()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalTag> getFunctionalTags();

	/**
	 * Returns the value of the '<em><b>Nfunctional Tags</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.NFunctionalTag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nfunctional Tags</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getEntity_NfunctionalTags()
	 * @model containment="true"
	 * @generated
	 */
	EList<NFunctionalTag> getNfunctionalTags();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='typhonml::Collection.allInstances()-&gt;select(e|e.entity = self)'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Collection> getCollections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='typhonml::Table.allInstances()-&gt;select(e|e.entity = self)'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='typhonml::KeyValueElement.allInstances()-&gt;select(e|e.entity = self)'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<KeyValueElement> getKeyValueElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='typhonml::GraphNode.allInstances()-&gt;select(e|e.entity = self)'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<GraphNode> getGraphNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='typhonml::Column.allInstances()-&gt;select(e|e.entity = self)'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Column> getColumns();

} // Entity
