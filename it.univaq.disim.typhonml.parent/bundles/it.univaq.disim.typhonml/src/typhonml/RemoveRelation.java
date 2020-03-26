/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.RemoveRelation#getRelationToRemove <em>Relation To Remove</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getRemoveRelation()
 * @model
 * @generated
 */
public interface RemoveRelation extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Relation To Remove</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation To Remove</em>' reference.
	 * @see #setRelationToRemove(Relation)
	 * @see typhonml.TyphonmlPackage#getRemoveRelation_RelationToRemove()
	 * @model required="true"
	 * @generated
	 */
	Relation getRelationToRemove();

	/**
	 * Sets the value of the '{@link typhonml.RemoveRelation#getRelationToRemove <em>Relation To Remove</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation To Remove</em>' reference.
	 * @see #getRelationToRemove()
	 * @generated
	 */
	void setRelationToRemove(Relation value);

} // RemoveRelation
