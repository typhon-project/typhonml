/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.GraphAttribute#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getGraphAttribute()
 * @model
 * @generated
 */
public interface GraphAttribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Attribute)
	 * @see typhonml.TyphonmlPackage#getGraphAttribute_Value()
	 * @model
	 * @generated
	 */
	Attribute getValue();

	/**
	 * Sets the value of the '{@link typhonml.GraphAttribute#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Attribute value);

} // GraphAttribute
