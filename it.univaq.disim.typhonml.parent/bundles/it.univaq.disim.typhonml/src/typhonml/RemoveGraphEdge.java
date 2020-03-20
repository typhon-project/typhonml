/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Graph Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.RemoveGraphEdge#getGraphEdgeToRemove <em>Graph Edge To Remove</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getRemoveGraphEdge()
 * @model
 * @generated
 */
public interface RemoveGraphEdge extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Graph Edge To Remove</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Edge To Remove</em>' reference.
	 * @see #setGraphEdgeToRemove(GraphEdge)
	 * @see typhonml.TyphonmlPackage#getRemoveGraphEdge_GraphEdgeToRemove()
	 * @model required="true"
	 * @generated
	 */
	GraphEdge getGraphEdgeToRemove();

	/**
	 * Sets the value of the '{@link typhonml.RemoveGraphEdge#getGraphEdgeToRemove <em>Graph Edge To Remove</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Edge To Remove</em>' reference.
	 * @see #getGraphEdgeToRemove()
	 * @generated
	 */
	void setGraphEdgeToRemove(GraphEdge value);

} // RemoveGraphEdge
