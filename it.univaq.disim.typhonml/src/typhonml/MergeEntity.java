/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.MergeEntity#getFirstEntityToMerge <em>First Entity To Merge</em>}</li>
 *   <li>{@link typhonml.MergeEntity#getSecondEntityToMerge <em>Second Entity To Merge</em>}</li>
 *   <li>{@link typhonml.MergeEntity#getNewEntityName <em>New Entity Name</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getMergeEntity()
 * @model
 * @generated
 */
public interface MergeEntity extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>First Entity To Merge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Entity To Merge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Entity To Merge</em>' reference.
	 * @see #setFirstEntityToMerge(Entity)
	 * @see typhonml.TyphonmlPackage#getMergeEntity_FirstEntityToMerge()
	 * @model required="true"
	 * @generated
	 */
	Entity getFirstEntityToMerge();

	/**
	 * Sets the value of the '{@link typhonml.MergeEntity#getFirstEntityToMerge <em>First Entity To Merge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Entity To Merge</em>' reference.
	 * @see #getFirstEntityToMerge()
	 * @generated
	 */
	void setFirstEntityToMerge(Entity value);

	/**
	 * Returns the value of the '<em><b>Second Entity To Merge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Entity To Merge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Entity To Merge</em>' reference.
	 * @see #setSecondEntityToMerge(Entity)
	 * @see typhonml.TyphonmlPackage#getMergeEntity_SecondEntityToMerge()
	 * @model required="true"
	 * @generated
	 */
	Entity getSecondEntityToMerge();

	/**
	 * Sets the value of the '{@link typhonml.MergeEntity#getSecondEntityToMerge <em>Second Entity To Merge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Entity To Merge</em>' reference.
	 * @see #getSecondEntityToMerge()
	 * @generated
	 */
	void setSecondEntityToMerge(Entity value);

	/**
	 * Returns the value of the '<em><b>New Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Entity Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Entity Name</em>' attribute.
	 * @see #setNewEntityName(String)
	 * @see typhonml.TyphonmlPackage#getMergeEntity_NewEntityName()
	 * @model
	 * @generated
	 */
	String getNewEntityName();

	/**
	 * Sets the value of the '{@link typhonml.MergeEntity#getNewEntityName <em>New Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Entity Name</em>' attribute.
	 * @see #getNewEntityName()
	 * @generated
	 */
	void setNewEntityName(String value);

} // MergeEntity
