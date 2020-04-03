/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

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
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getFreetextType()
 * @model
 * @generated
 */
public interface FreetextType extends DataType {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.NlpTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getFreetextType_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<NlpTask> getTasks();

} // FreetextType
