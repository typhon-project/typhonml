/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Relation Containement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.ChangeRelationContainement#getRelation <em>Relation</em>}</li>
 *   <li>{@link typhonml.ChangeRelationContainement#getNewContainment <em>New Containment</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getChangeRelationContainement()
 * @model
 * @generated
 */
public interface ChangeRelationContainement extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(Relation)
	 * @see typhonml.TyphonmlPackage#getChangeRelationContainement_Relation()
	 * @model required="true"
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link typhonml.ChangeRelationContainement#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);

	/**
	 * Returns the value of the '<em><b>New Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Containment</em>' attribute.
	 * @see #setNewContainment(Boolean)
	 * @see typhonml.TyphonmlPackage#getChangeRelationContainement_NewContainment()
	 * @model required="true"
	 * @generated
	 */
	Boolean getNewContainment();

	/**
	 * Sets the value of the '{@link typhonml.ChangeRelationContainement#getNewContainment <em>New Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Containment</em>' attribute.
	 * @see #getNewContainment()
	 * @generated
	 */
	void setNewContainment(Boolean value);

} // ChangeRelationContainement
