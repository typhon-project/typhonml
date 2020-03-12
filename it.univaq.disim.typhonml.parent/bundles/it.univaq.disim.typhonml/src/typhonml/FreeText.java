/**
 */
package typhonml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.FreeText#getTasks <em>Tasks</em>}</li>
 *   <li>{@link typhonml.FreeText#getWorkflowName <em>Workflow Name</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getFreeText()
 * @model
 * @generated
 */
public interface FreeText extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference.
	 * @see #setTasks(NlpTask)
	 * @see typhonml.TyphonmlPackage#getFreeText_Tasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NlpTask getTasks();

	/**
	 * Sets the value of the '{@link typhonml.FreeText#getTasks <em>Tasks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tasks</em>' containment reference.
	 * @see #getTasks()
	 * @generated
	 */
	void setTasks(NlpTask value);

	/**
	 * Returns the value of the '<em><b>Workflow Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow Name</em>' attribute.
	 * @see #setWorkflowName(String)
	 * @see typhonml.TyphonmlPackage#getFreeText_WorkflowName()
	 * @model
	 * @generated
	 */
	String getWorkflowName();

	/**
	 * Sets the value of the '{@link typhonml.FreeText#getWorkflowName <em>Workflow Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow Name</em>' attribute.
	 * @see #getWorkflowName()
	 * @generated
	 */
	void setWorkflowName(String value);

} // FreeText
