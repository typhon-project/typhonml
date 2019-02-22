/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.RemoveIdentifier#getEntityIdentifier <em>Entity Identifier</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getRemoveIdentifier()
 * @model
 * @generated
 */
public interface RemoveIdentifier extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Entity Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Identifier</em>' reference.
	 * @see #setEntityIdentifier(EntityIdentifier)
	 * @see typhonml.TyphonmlPackage#getRemoveIdentifier_EntityIdentifier()
	 * @model required="true"
	 * @generated
	 */
	EntityIdentifier getEntityIdentifier();

	/**
	 * Sets the value of the '{@link typhonml.RemoveIdentifier#getEntityIdentifier <em>Entity Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Identifier</em>' reference.
	 * @see #getEntityIdentifier()
	 * @generated
	 */
	void setEntityIdentifier(EntityIdentifier value);

} // RemoveIdentifier
