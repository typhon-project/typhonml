/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disable Relation Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.DisableRelationContainment#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getDisableRelationContainment()
 * @model
 * @generated
 */
public interface DisableRelationContainment extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(Relation)
	 * @see typhonml.TyphonmlPackage#getDisableRelationContainment_Relation()
	 * @model required="true"
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link typhonml.DisableRelationContainment#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);

} // DisableRelationContainment
