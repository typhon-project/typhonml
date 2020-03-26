/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.RemoveAttribute#getAttributeToRemove <em>Attribute To Remove</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getRemoveAttribute()
 * @model
 * @generated
 */
public interface RemoveAttribute extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Attribute To Remove</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute To Remove</em>' reference.
	 * @see #setAttributeToRemove(Attribute)
	 * @see typhonml.TyphonmlPackage#getRemoveAttribute_AttributeToRemove()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttributeToRemove();

	/**
	 * Sets the value of the '{@link typhonml.RemoveAttribute#getAttributeToRemove <em>Attribute To Remove</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute To Remove</em>' reference.
	 * @see #getAttributeToRemove()
	 * @generated
	 */
	void setAttributeToRemove(Attribute value);

} // RemoveAttribute
