/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.AddAttribute#getOwnerEntity <em>Owner Entity</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getAddAttribute()
 * @model abstract="true"
 * @generated
 */
public interface AddAttribute extends Attribute, ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Owner Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Entity</em>' reference.
	 * @see #setOwnerEntity(Entity)
	 * @see typhonml.TyphonmlPackage#getAddAttribute_OwnerEntity()
	 * @model required="true"
	 * @generated
	 */
	Entity getOwnerEntity();

	/**
	 * Sets the value of the '{@link typhonml.AddAttribute#getOwnerEntity <em>Owner Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Entity</em>' reference.
	 * @see #getOwnerEntity()
	 * @generated
	 */
	void setOwnerEntity(Entity value);

} // AddAttribute
