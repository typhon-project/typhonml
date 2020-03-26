/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rename Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.RenameCollection#getCollectionToRename <em>Collection To Rename</em>}</li>
 *   <li>{@link typhonml.RenameCollection#getNewName <em>New Name</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getRenameCollection()
 * @model
 * @generated
 */
public interface RenameCollection extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Collection To Rename</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection To Rename</em>' reference.
	 * @see #setCollectionToRename(Collection)
	 * @see typhonml.TyphonmlPackage#getRenameCollection_CollectionToRename()
	 * @model required="true"
	 * @generated
	 */
	Collection getCollectionToRename();

	/**
	 * Sets the value of the '{@link typhonml.RenameCollection#getCollectionToRename <em>Collection To Rename</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection To Rename</em>' reference.
	 * @see #getCollectionToRename()
	 * @generated
	 */
	void setCollectionToRename(Collection value);

	/**
	 * Returns the value of the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name</em>' attribute.
	 * @see #setNewName(String)
	 * @see typhonml.TyphonmlPackage#getRenameCollection_NewName()
	 * @model
	 * @generated
	 */
	String getNewName();

	/**
	 * Sets the value of the '{@link typhonml.RenameCollection#getNewName <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name</em>' attribute.
	 * @see #getNewName()
	 * @generated
	 */
	void setNewName(String value);

} // RenameCollection
