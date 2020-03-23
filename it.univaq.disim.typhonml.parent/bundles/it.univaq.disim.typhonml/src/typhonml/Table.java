/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.Table#getIndexSpec <em>Index Spec</em>}</li>
 *   <li>{@link typhonml.Table#getIdSpec <em>Id Spec</em>}</li>
 *   <li>{@link typhonml.Table#getDb <em>Db</em>}</li>
 *   <li>{@link typhonml.Table#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Index Spec</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link typhonml.IndexSpec#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Spec</em>' containment reference.
	 * @see #setIndexSpec(IndexSpec)
	 * @see typhonml.TyphonmlPackage#getTable_IndexSpec()
	 * @see typhonml.IndexSpec#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	IndexSpec getIndexSpec();

	/**
	 * Sets the value of the '{@link typhonml.Table#getIndexSpec <em>Index Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Spec</em>' containment reference.
	 * @see #getIndexSpec()
	 * @generated
	 */
	void setIndexSpec(IndexSpec value);

	/**
	 * Returns the value of the '<em><b>Id Spec</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link typhonml.IdSpec#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Spec</em>' containment reference.
	 * @see #setIdSpec(IdSpec)
	 * @see typhonml.TyphonmlPackage#getTable_IdSpec()
	 * @see typhonml.IdSpec#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	IdSpec getIdSpec();

	/**
	 * Sets the value of the '{@link typhonml.Table#getIdSpec <em>Id Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Spec</em>' containment reference.
	 * @see #getIdSpec()
	 * @generated
	 */
	void setIdSpec(IdSpec value);

	/**
	 * Returns the value of the '<em><b>Db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db</em>' reference.
	 * @see #setDb(Database)
	 * @see typhonml.TyphonmlPackage#getTable_Db()
	 * @model
	 * @generated
	 */
	Database getDb();

	/**
	 * Sets the value of the '{@link typhonml.Table#getDb <em>Db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db</em>' reference.
	 * @see #getDb()
	 * @generated
	 */
	void setDb(Database value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see typhonml.TyphonmlPackage#getTable_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link typhonml.Table#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // Table
