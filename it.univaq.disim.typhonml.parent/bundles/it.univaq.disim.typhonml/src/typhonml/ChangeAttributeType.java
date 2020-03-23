/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.ChangeAttributeType#getAttributeToChange <em>Attribute To Change</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getChangeAttributeType()
 * @model abstract="true"
 * @generated
 */
public interface ChangeAttributeType extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Attribute To Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute To Change</em>' reference.
	 * @see #setAttributeToChange(Attribute)
	 * @see typhonml.TyphonmlPackage#getChangeAttributeType_AttributeToChange()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttributeToChange();

	/**
	 * Sets the value of the '{@link typhonml.ChangeAttributeType#getAttributeToChange <em>Attribute To Change</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute To Change</em>' reference.
	 * @see #getAttributeToChange()
	 * @generated
	 */
	void setAttributeToChange(Attribute value);

} // ChangeAttributeType
