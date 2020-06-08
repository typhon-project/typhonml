/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.Collection#getEntity <em>Entity</em>}</li>
 *   <li>{@link typhonml.Collection#getIndexSpec <em>Index Spec</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see typhonml.TyphonmlPackage#getCollection_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link typhonml.Collection#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Index Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Spec</em>' containment reference.
	 * @see #setIndexSpec(IndexSpec)
	 * @see typhonml.TyphonmlPackage#getCollection_IndexSpec()
	 * @model containment="true"
	 * @generated
	 */
	IndexSpec getIndexSpec();

	/**
	 * Sets the value of the '{@link typhonml.Collection#getIndexSpec <em>Index Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Spec</em>' containment reference.
	 * @see #getIndexSpec()
	 * @generated
	 */
	void setIndexSpec(IndexSpec value);

} // Collection
