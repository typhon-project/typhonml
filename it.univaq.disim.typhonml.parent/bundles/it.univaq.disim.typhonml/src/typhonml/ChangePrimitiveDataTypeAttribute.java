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
	 * @model required="true"
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
	 * Returns the value of the '<em><b>New Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Type</em>' containment reference.
	 * @see #setNewType(DataType)
	 * @see typhonml.TyphonmlPackage#getChangePrimitiveDataTypeAttribute_NewType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataType getNewType();

	/**
	 * Sets the value of the '{@link typhonml.ChangePrimitiveDataTypeAttribute#getNewType <em>New Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Type</em>' containment reference.
	 * @see #getNewType()
	 * @generated
	 */
	void setNewType(DataType value);

} // ChangePrimitiveDataTypeAttribute
