/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rename Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.RenameEntity#getEntityToRename <em>Entity To Rename</em>}</li>
 *   <li>{@link typhonml.RenameEntity#getNewEntityName <em>New Entity Name</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getRenameEntity()
 * @model
 * @generated
 */
public interface RenameEntity extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Entity To Rename</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity To Rename</em>' reference.
	 * @see #setEntityToRename(Entity)
	 * @see typhonml.TyphonmlPackage#getRenameEntity_EntityToRename()
	 * @model
	 * @generated
	 */
	Entity getEntityToRename();

	/**
	 * Sets the value of the '{@link typhonml.RenameEntity#getEntityToRename <em>Entity To Rename</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity To Rename</em>' reference.
	 * @see #getEntityToRename()
	 * @generated
	 */
	void setEntityToRename(Entity value);

	/**
	 * Returns the value of the '<em><b>New Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Entity Name</em>' attribute.
	 * @see #setNewEntityName(String)
	 * @see typhonml.TyphonmlPackage#getRenameEntity_NewEntityName()
	 * @model
	 * @generated
	 */
	String getNewEntityName();

	/**
	 * Sets the value of the '{@link typhonml.RenameEntity#getNewEntityName <em>New Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Entity Name</em>' attribute.
	 * @see #getNewEntityName()
	 * @generated
	 */
	void setNewEntityName(String value);

} // RenameEntity
