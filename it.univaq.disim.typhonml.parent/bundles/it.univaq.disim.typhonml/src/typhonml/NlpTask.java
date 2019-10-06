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
 *   <li>{@link typhonml.NlpTask#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getNlpTask()
 * @model
 * @generated
 */
public interface NlpTask extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link typhonml.NlpTaskType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see typhonml.NlpTaskType
	 * @see #setType(NlpTaskType)
	 * @see typhonml.TyphonmlPackage#getNlpTask_Type()
	 * @model
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
