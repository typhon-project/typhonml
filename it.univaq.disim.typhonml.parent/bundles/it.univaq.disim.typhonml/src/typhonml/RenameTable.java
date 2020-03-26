/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rename Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.RenameTable#getTableToRename <em>Table To Rename</em>}</li>
 *   <li>{@link typhonml.RenameTable#getNewName <em>New Name</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getRenameTable()
 * @model
 * @generated
 */
public interface RenameTable extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Table To Rename</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table To Rename</em>' reference.
	 * @see #setTableToRename(Table)
	 * @see typhonml.TyphonmlPackage#getRenameTable_TableToRename()
	 * @model required="true"
	 * @generated
	 */
	Table getTableToRename();

	/**
	 * Sets the value of the '{@link typhonml.RenameTable#getTableToRename <em>Table To Rename</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table To Rename</em>' reference.
	 * @see #getTableToRename()
	 * @generated
	 */
	void setTableToRename(Table value);

	/**
	 * Returns the value of the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name</em>' attribute.
	 * @see #setNewName(String)
	 * @see typhonml.TyphonmlPackage#getRenameTable_NewName()
	 * @model
	 * @generated
	 */
	String getNewName();

	/**
	 * Sets the value of the '{@link typhonml.RenameTable#getNewName <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name</em>' attribute.
	 * @see #getNewName()
	 * @generated
	 */
	void setNewName(String value);

} // RenameTable
