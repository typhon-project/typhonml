/**
 */
package org.typhon.dsls.sirius.typhonml;

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
 *   <li>{@link org.typhon.dsls.sirius.typhonml.GraphDB#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.GraphDB#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getGraphDB()
 * @model
 * @generated
 */
public interface GraphDB extends Database {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.typhon.dsls.sirius.typhonml.GraphNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getGraphDB_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.typhon.dsls.sirius.typhonml.GraphEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getGraphDB_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphEdge> getEdges();

} // GraphDB
