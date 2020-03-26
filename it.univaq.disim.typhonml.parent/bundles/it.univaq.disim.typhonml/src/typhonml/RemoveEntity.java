/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.RemoveEntity#getEntityToRemove <em>Entity To Remove</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getRemoveEntity()
 * @model
 * @generated
 */
public interface RemoveEntity extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Entity To Remove</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity To Remove</em>' reference.
	 * @see #setEntityToRemove(Entity)
	 * @see typhonml.TyphonmlPackage#getRemoveEntity_EntityToRemove()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntityToRemove();

	/**
	 * Sets the value of the '{@link typhonml.RemoveEntity#getEntityToRemove <em>Entity To Remove</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity To Remove</em>' reference.
	 * @see #getEntityToRemove()
	 * @generated
	 */
	void setEntityToRemove(Entity value);

} // RemoveEntity
