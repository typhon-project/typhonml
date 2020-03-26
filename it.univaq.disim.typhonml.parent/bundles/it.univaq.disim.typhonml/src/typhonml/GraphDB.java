/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.GraphDB#getNodes <em>Nodes</em>}</li>
 *   <li>{@link typhonml.GraphDB#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getGraphDB()
 * @model
 * @generated
 */
public interface GraphDB extends Database {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.GraphNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getGraphDB_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.GraphEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getGraphDB_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphEdge> getEdges();

} // GraphDB
