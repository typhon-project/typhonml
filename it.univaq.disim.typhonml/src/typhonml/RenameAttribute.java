/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rename Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.RenameAttribute#getAttributeToRemove <em>Attribute To Remove</em>}</li>
 *   <li>{@link typhonml.RenameAttribute#getNewName <em>New Name</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getRenameAttribute()
 * @model
 * @generated
 */
public interface RenameAttribute extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Attribute To Remove</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute To Remove</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute To Remove</em>' reference.
	 * @see #setAttributeToRemove(Attribute)
	 * @see typhonml.TyphonmlPackage#getRenameAttribute_AttributeToRemove()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttributeToRemove();

	/**
	 * Sets the value of the '{@link typhonml.RenameAttribute#getAttributeToRemove <em>Attribute To Remove</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute To Remove</em>' reference.
	 * @see #getAttributeToRemove()
	 * @generated
	 */
	void setAttributeToRemove(Attribute value);

	/**
	 * Returns the value of the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name</em>' attribute.
	 * @see #setNewName(String)
	 * @see typhonml.TyphonmlPackage#getRenameAttribute_NewName()
	 * @model
	 * @generated
	 */
	String getNewName();

	/**
	 * Sets the value of the '{@link typhonml.RenameAttribute#getNewName <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name</em>' attribute.
	 * @see #getNewName()
	 * @generated
	 */
	void setNewName(String value);

} // RenameAttribute
