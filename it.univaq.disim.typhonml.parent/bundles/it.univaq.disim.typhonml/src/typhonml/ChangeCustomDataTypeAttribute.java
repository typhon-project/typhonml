/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Custom Data Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.ChangeCustomDataTypeAttribute#getNewType <em>New Type</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getChangeCustomDataTypeAttribute()
 * @model
 * @generated
 */
public interface ChangeCustomDataTypeAttribute extends ChangeAttributeType {
	/**
	 * Returns the value of the '<em><b>New Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Type</em>' reference.
	 * @see #setNewType(CustomDataType)
	 * @see typhonml.TyphonmlPackage#getChangeCustomDataTypeAttribute_NewType()
	 * @model required="true"
	 * @generated
	 */
	CustomDataType getNewType();

	/**
	 * Sets the value of the '{@link typhonml.ChangeCustomDataTypeAttribute#getNewType <em>New Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Type</em>' reference.
	 * @see #getNewType()
	 * @generated
	 */
	void setNewType(CustomDataType value);

} // ChangeCustomDataTypeAttribute
