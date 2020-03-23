/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Graph Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.RemoveGraphAttribute#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getRemoveGraphAttribute()
 * @model
 * @generated
 */
public interface RemoveGraphAttribute extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(GraphNode)
	 * @see typhonml.TyphonmlPackage#getRemoveGraphAttribute_Node()
	 * @model required="true"
	 * @generated
	 */
	GraphNode getNode();

	/**
	 * Sets the value of the '{@link typhonml.RemoveGraphAttribute#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(GraphNode value);

} // RemoveGraphAttribute
