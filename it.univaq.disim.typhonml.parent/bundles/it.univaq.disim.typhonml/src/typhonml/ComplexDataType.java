/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.ComplexDataType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getComplexDataType()
 * @model
 * @generated
 */
public interface ComplexDataType extends SuperDataType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(CustomDataType)
	 * @see typhonml.TyphonmlPackage#getComplexDataType_Type()
	 * @model required="true"
	 * @generated
	 */
	CustomDataType getType();

	/**
	 * Sets the value of the '{@link typhonml.ComplexDataType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CustomDataType value);

} // ComplexDataType
