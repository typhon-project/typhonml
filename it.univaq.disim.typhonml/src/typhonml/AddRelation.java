/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.AddRelation#getOwnerEntity <em>Owner Entity</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getAddRelation()
 * @model
 * @generated
 */
public interface AddRelation extends Relation, ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Owner Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Entity</em>' reference.
	 * @see #setOwnerEntity(Entity)
	 * @see typhonml.TyphonmlPackage#getAddRelation_OwnerEntity()
	 * @model required="true"
	 * @generated
	 */
	Entity getOwnerEntity();

	/**
	 * Sets the value of the '{@link typhonml.AddRelation#getOwnerEntity <em>Owner Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Entity</em>' reference.
	 * @see #getOwnerEntity()
	 * @generated
	 */
	void setOwnerEntity(Entity value);

} // AddRelation
