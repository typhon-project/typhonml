/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Migrate Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.MigrateEntity#getEntity <em>Entity</em>}</li>
 *   <li>{@link typhonml.MigrateEntity#getNewDatabase <em>New Database</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getMigrateEntity()
 * @model
 * @generated
 */
public interface MigrateEntity extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see typhonml.TyphonmlPackage#getMigrateEntity_Entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link typhonml.MigrateEntity#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>New Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Database</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Database</em>' reference.
	 * @see #setNewDatabase(Database)
	 * @see typhonml.TyphonmlPackage#getMigrateEntity_NewDatabase()
	 * @model required="true"
	 * @generated
	 */
	Database getNewDatabase();

	/**
	 * Sets the value of the '{@link typhonml.MigrateEntity#getNewDatabase <em>New Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Database</em>' reference.
	 * @see #getNewDatabase()
	 * @generated
	 */
	void setNewDatabase(Database value);

} // MigrateEntity
