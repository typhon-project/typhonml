/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.DataTypeItem#getType <em>Type</em>}</li>
 *   <li>{@link typhonml.DataTypeItem#getImplementation <em>Implementation</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getDataTypeItem()
 * @model
 * @generated
 */
public interface DataTypeItem extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see typhonml.TyphonmlPackage#getDataTypeItem_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link typhonml.DataTypeItem#getType <em>Type</em>}' reference.
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
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(DataTypeImplementationPackage)
	 * @see typhonml.TyphonmlPackage#getDataTypeItem_Implementation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataTypeImplementationPackage getImplementation();

	/**
	 * Sets the value of the '{@link typhonml.DataTypeItem#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(DataTypeImplementationPackage value);

} // DataTypeItem