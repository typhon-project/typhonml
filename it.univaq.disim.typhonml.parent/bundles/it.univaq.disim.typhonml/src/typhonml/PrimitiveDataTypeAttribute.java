/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Data Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.PrimitiveDataTypeAttribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getPrimitiveDataTypeAttribute()
 * @model
 * @generated
 */
public interface PrimitiveDataTypeAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link typhonml.PrimitiveDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see typhonml.PrimitiveDataType
	 * @see #setType(PrimitiveDataType)
	 * @see typhonml.TyphonmlPackage#getPrimitiveDataTypeAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveDataType getType();

	/**
	 * Sets the value of the '{@link typhonml.PrimitiveDataTypeAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see typhonml.PrimitiveDataType
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveDataType value);

} // PrimitiveDataTypeAttribute
