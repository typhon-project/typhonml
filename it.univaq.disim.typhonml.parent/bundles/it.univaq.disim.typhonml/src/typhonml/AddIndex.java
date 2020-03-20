/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.AddIndex#getTable <em>Table</em>}</li>
 *   <li>{@link typhonml.AddIndex#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getAddIndex()
 * @model
 * @generated
 */
public interface AddIndex extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(Table)
	 * @see typhonml.TyphonmlPackage#getAddIndex_Table()
	 * @model required="true"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link typhonml.AddIndex#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link typhonml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see typhonml.TyphonmlPackage#getAddIndex_Attributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // AddIndex
