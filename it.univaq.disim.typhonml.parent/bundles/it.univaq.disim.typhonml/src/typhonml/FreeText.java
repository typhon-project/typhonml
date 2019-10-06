/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

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
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getFreeText()
 * @model
 * @generated
 */
public interface FreeText extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.NlpTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getFreeText_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<NlpTask> getTasks();

} // FreeText
