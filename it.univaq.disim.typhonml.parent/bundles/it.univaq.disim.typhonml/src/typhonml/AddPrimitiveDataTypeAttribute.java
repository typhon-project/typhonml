/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Primitive Data Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.AddPrimitiveDataTypeAttribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getAddPrimitiveDataTypeAttribute()
 * @model
 * @generated
 */
public interface AddPrimitiveDataTypeAttribute extends AddAttribute {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(DataType)
	 * @see typhonml.TyphonmlPackage#getAddPrimitiveDataTypeAttribute_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link typhonml.AddPrimitiveDataTypeAttribute#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // AddPrimitiveDataTypeAttribute
