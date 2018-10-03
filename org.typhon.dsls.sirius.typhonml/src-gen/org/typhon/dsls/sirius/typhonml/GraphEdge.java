/**
 */
package org.typhon.dsls.sirius.typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.GraphEdge#getFrom <em>From</em>}</li>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.GraphEdge#getTo <em>To</em>}</li>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.GraphEdge#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getGraphEdge()
 * @model
 * @generated
 */
public interface GraphEdge extends NamedElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(GraphNode)
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getGraphEdge_From()
	 * @model
	 * @generated
	 */
	GraphNode getFrom();

	/**
	 * Sets the value of the '{@link org.typhon.dsls.sirius.typhonml.GraphEdge#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(GraphNode value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(GraphNode)
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getGraphEdge_To()
	 * @model
	 * @generated
	 */
	GraphNode getTo();

	/**
	 * Sets the value of the '{@link org.typhon.dsls.sirius.typhonml.GraphEdge#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(GraphNode value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link org.typhon.dsls.sirius.typhonml.GraphEdgeLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getGraphEdge_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphEdgeLabel> getLabels();

} // GraphEdge
