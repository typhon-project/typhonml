/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Data Type Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.CustomDataTypeItem#getType <em>Type</em>}</li>
 *   <li>{@link typhonml.CustomDataTypeItem#getImplementation <em>Implementation</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getCustomDataTypeItem()
 * @model
 * @generated
 */
public interface CustomDataTypeItem extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see typhonml.TyphonmlPackage#getCustomDataTypeItem_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link typhonml.CustomDataTypeItem#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(CustomDataTypeImplementationPackage)
	 * @see typhonml.TyphonmlPackage#getCustomDataTypeItem_Implementation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CustomDataTypeImplementationPackage getImplementation();

	/**
	 * Sets the value of the '{@link typhonml.CustomDataTypeItem#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(CustomDataTypeImplementationPackage value);

} // CustomDataTypeItem
