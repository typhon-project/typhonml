/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Freetext Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.FreetextType#getTasks <em>Tasks</em>}</li>
 *   <li>{@link typhonml.FreetextType#getWorkflowName <em>Workflow Name</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getFreetextType()
 * @model
 * @generated
 */
public interface FreetextType extends PrimitiveDataType {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference.
	 * @see #setTasks(NlpTask)
	 * @see typhonml.TyphonmlPackage#getFreetextType_Tasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NlpTask getTasks();

	/**
	 * Sets the value of the '{@link typhonml.FreetextType#getTasks <em>Tasks</em>}' containment reference.
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
	 * @see typhonml.TyphonmlPackage#getFreetextType_WorkflowName()
	 * @model
	 * @generated
	 */
	String getWorkflowName();

	/**
	 * Sets the value of the '{@link typhonml.FreetextType#getWorkflowName <em>Workflow Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow Name</em>' attribute.
	 * @see #getWorkflowName()
	 * @generated
	 */
	void setWorkflowName(String value);

} // FreetextType
