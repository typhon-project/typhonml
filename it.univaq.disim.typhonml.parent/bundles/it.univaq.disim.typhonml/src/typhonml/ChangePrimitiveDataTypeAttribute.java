/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Primitive Data Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.ChangePrimitiveDataTypeAttribute#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link typhonml.ChangePrimitiveDataTypeAttribute#getNewType <em>New Type</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getChangePrimitiveDataTypeAttribute()
 * @model
 * @generated
 */
public interface ChangePrimitiveDataTypeAttribute extends ChangeAttributeType {
	/**
	 * Returns the value of the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Size</em>' attribute.
	 * @see #setMaxSize(int)
	 * @see typhonml.TyphonmlPackage#getChangePrimitiveDataTypeAttribute_MaxSize()
	 * @model
	 * @generated
	 */
	int getMaxSize();

	/**
	 * Sets the value of the '{@link typhonml.ChangePrimitiveDataTypeAttribute#getMaxSize <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Size</em>' attribute.
	 * @see #getMaxSize()
	 * @generated
	 */
	void setMaxSize(int value);

	/**
	 * Returns the value of the '<em><b>New Type</b></em>' attribute.
	 * The literals are from the enumeration {@link typhonml.PrimitiveDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Type</em>' attribute.
	 * @see typhonml.PrimitiveDataType
	 * @see #setNewType(PrimitiveDataType)
	 * @see typhonml.TyphonmlPackage#getChangePrimitiveDataTypeAttribute_NewType()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveDataType getNewType();

	/**
	 * Sets the value of the '{@link typhonml.ChangePrimitiveDataTypeAttribute#getNewType <em>New Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Type</em>' attribute.
	 * @see typhonml.PrimitiveDataType
	 * @see #getNewType()
	 * @generated
	 */
	void setNewType(PrimitiveDataType value);

} // ChangePrimitiveDataTypeAttribute
