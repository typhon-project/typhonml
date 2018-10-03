/**
 */
package org.typhon.dsls.sirius.typhonml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.Table#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.Table#getIndexSpec <em>Index Spec</em>}</li>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.Table#getIdSpec <em>Id Spec</em>}</li>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.Table#getDb <em>Db</em>}</li>
 * </ul>
 *
 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends NamedElement {
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
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getTable_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link org.typhon.dsls.sirius.typhonml.Table#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Index Spec</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.typhon.dsls.sirius.typhonml.IndexSpec#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Spec</em>' containment reference.
	 * @see #setIndexSpec(IndexSpec)
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getTable_IndexSpec()
	 * @see org.typhon.dsls.sirius.typhonml.IndexSpec#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	IndexSpec getIndexSpec();

	/**
	 * Sets the value of the '{@link org.typhon.dsls.sirius.typhonml.Table#getIndexSpec <em>Index Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Spec</em>' containment reference.
	 * @see #getIndexSpec()
	 * @generated
	 */
	void setIndexSpec(IndexSpec value);

	/**
	 * Returns the value of the '<em><b>Id Spec</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.typhon.dsls.sirius.typhonml.IdSpec#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Spec</em>' containment reference.
	 * @see #setIdSpec(IdSpec)
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getTable_IdSpec()
	 * @see org.typhon.dsls.sirius.typhonml.IdSpec#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	IdSpec getIdSpec();

	/**
	 * Sets the value of the '{@link org.typhon.dsls.sirius.typhonml.Table#getIdSpec <em>Id Spec</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Db</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db</em>' reference.
	 * @see #setDb(Database)
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getTable_Db()
	 * @model
	 * @generated
	 */
	Database getDb();

	/**
	 * Sets the value of the '{@link org.typhon.dsls.sirius.typhonml.Table#getDb <em>Db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db</em>' reference.
	 * @see #getDb()
	 * @generated
	 */
	void setDb(Database value);

} // Table
