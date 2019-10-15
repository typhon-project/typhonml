/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Renabe Graph Edge Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.RenabeGraphEdgeLabel#getEdge <em>Edge</em>}</li>
 *   <li>{@link typhonml.RenabeGraphEdgeLabel#getNewName <em>New Name</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getRenabeGraphEdgeLabel()
 * @model
 * @generated
 */
public interface RenabeGraphEdgeLabel extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' reference.
	 * @see #setEdge(GraphEdge)
	 * @see typhonml.TyphonmlPackage#getRenabeGraphEdgeLabel_Edge()
	 * @model required="true"
	 * @generated
	 */
	GraphEdge getEdge();

	/**
	 * Sets the value of the '{@link typhonml.RenabeGraphEdgeLabel#getEdge <em>Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge</em>' reference.
	 * @see #getEdge()
	 * @generated
	 */
	void setEdge(GraphEdge value);

	/**
	 * Returns the value of the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name</em>' attribute.
	 * @see #setNewName(String)
	 * @see typhonml.TyphonmlPackage#getRenabeGraphEdgeLabel_NewName()
	 * @model
	 * @generated
	 */
	String getNewName();

	/**
	 * Sets the value of the '{@link typhonml.RenabeGraphEdgeLabel#getNewName <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name</em>' attribute.
	 * @see #getNewName()
	 * @generated
	 */
	void setNewName(String value);

} // RenabeGraphEdgeLabel
