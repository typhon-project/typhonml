/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Id Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.IdSpec#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link typhonml.IdSpec#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getIdSpec()
 * @model
 * @generated
 */
public interface IdSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link typhonml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see typhonml.TyphonmlPackage#getIdSpec_Attributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link typhonml.Table#getIdSpec <em>Id Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(Table)
	 * @see typhonml.TyphonmlPackage#getIdSpec_Table()
	 * @see typhonml.Table#getIdSpec
	 * @model opposite="idSpec" required="true" transient="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link typhonml.IdSpec#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

} // IdSpec
