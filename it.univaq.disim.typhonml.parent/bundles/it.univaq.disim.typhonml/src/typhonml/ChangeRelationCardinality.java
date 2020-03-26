/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Relation Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.ChangeRelationCardinality#getRelation <em>Relation</em>}</li>
 *   <li>{@link typhonml.ChangeRelationCardinality#getNewCardinality <em>New Cardinality</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getChangeRelationCardinality()
 * @model
 * @generated
 */
public interface ChangeRelationCardinality extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(Relation)
	 * @see typhonml.TyphonmlPackage#getChangeRelationCardinality_Relation()
	 * @model required="true"
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link typhonml.ChangeRelationCardinality#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);

	/**
	 * Returns the value of the '<em><b>New Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link typhonml.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Cardinality</em>' attribute.
	 * @see typhonml.Cardinality
	 * @see #setNewCardinality(Cardinality)
	 * @see typhonml.TyphonmlPackage#getChangeRelationCardinality_NewCardinality()
	 * @model required="true"
	 * @generated
	 */
	Cardinality getNewCardinality();

	/**
	 * Sets the value of the '{@link typhonml.ChangeRelationCardinality#getNewCardinality <em>New Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Cardinality</em>' attribute.
	 * @see typhonml.Cardinality
	 * @see #getNewCardinality()
	 * @generated
	 */
	void setNewCardinality(Cardinality value);

} // ChangeRelationCardinality
