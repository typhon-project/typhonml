/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rename Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.RenameRelation#getRelationToRename <em>Relation To Rename</em>}</li>
 *   <li>{@link typhonml.RenameRelation#getNewRelationName <em>New Relation Name</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getRenameRelation()
 * @model
 * @generated
 */
public interface RenameRelation extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Relation To Rename</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation To Rename</em>' reference.
	 * @see #setRelationToRename(Relation)
	 * @see typhonml.TyphonmlPackage#getRenameRelation_RelationToRename()
	 * @model required="true"
	 * @generated
	 */
	Relation getRelationToRename();

	/**
	 * Sets the value of the '{@link typhonml.RenameRelation#getRelationToRename <em>Relation To Rename</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation To Rename</em>' reference.
	 * @see #getRelationToRename()
	 * @generated
	 */
	void setRelationToRename(Relation value);

	/**
	 * Returns the value of the '<em><b>New Relation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Relation Name</em>' attribute.
	 * @see #setNewRelationName(String)
	 * @see typhonml.TyphonmlPackage#getRenameRelation_NewRelationName()
	 * @model
	 * @generated
	 */
	String getNewRelationName();

	/**
	 * Sets the value of the '{@link typhonml.RenameRelation#getNewRelationName <em>New Relation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Relation Name</em>' attribute.
	 * @see #getNewRelationName()
	 * @generated
	 */
	void setNewRelationName(String value);

} // RenameRelation
