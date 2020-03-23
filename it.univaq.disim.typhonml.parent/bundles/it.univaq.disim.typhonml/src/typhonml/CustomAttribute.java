/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.CustomAttribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getCustomAttribute()
 * @model
 * @generated
 */
public interface CustomAttribute extends EntityAttribute {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(CustomDataType)
	 * @see typhonml.TyphonmlPackage#getCustomAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	CustomDataType getType();

	/**
	 * Sets the value of the '{@link typhonml.CustomAttribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CustomDataType value);

} // CustomAttribute
