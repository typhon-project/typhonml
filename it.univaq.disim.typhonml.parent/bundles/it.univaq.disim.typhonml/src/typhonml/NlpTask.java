/**
 */
package typhonml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nlp Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.NlpTask#getWorkflowName <em>Workflow Name</em>}</li>
 *   <li>{@link typhonml.NlpTask#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getNlpTask()
 * @model
 * @generated
 */
public interface NlpTask extends EObject {
	/**
	 * Returns the value of the '<em><b>Workflow Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow Name</em>' attribute.
	 * @see #setWorkflowName(String)
	 * @see typhonml.TyphonmlPackage#getNlpTask_WorkflowName()
	 * @model required="true"
	 * @generated
	 */
	String getWorkflowName();

	/**
	 * Sets the value of the '{@link typhonml.NlpTask#getWorkflowName <em>Workflow Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow Name</em>' attribute.
	 * @see #getWorkflowName()
	 * @generated
	 */
	void setWorkflowName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link typhonml.NlpTaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see typhonml.NlpTaskType
	 * @see #setType(NlpTaskType)
	 * @see typhonml.TyphonmlPackage#getNlpTask_Type()
	 * @model required="true"
	 * @generated
	 */
	NlpTaskType getType();

	/**
	 * Sets the value of the '{@link typhonml.NlpTask#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see typhonml.NlpTaskType
	 * @see #getType()
	 * @generated
	 */
	void setType(NlpTaskType value);

} // NlpTask
