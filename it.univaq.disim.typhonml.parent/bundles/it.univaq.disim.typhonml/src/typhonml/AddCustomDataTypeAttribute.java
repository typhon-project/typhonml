/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Custom Data Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.AddCustomDataTypeAttribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getAddCustomDataTypeAttribute()
 * @model
 * @generated
 */
public interface AddCustomDataTypeAttribute extends AddAttribute {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(CustomDataType)
	 * @see typhonml.TyphonmlPackage#getAddCustomDataTypeAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	CustomDataType getType();

	/**
	 * Sets the value of the '{@link typhonml.AddCustomDataTypeAttribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CustomDataType value);
} // AddCustomDataTypeAttribute
