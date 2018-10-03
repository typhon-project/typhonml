/**
 */
package org.typhon.dsls.sirius.typhonml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.GraphAttribute#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getGraphAttribute()
 * @model
 * @generated
 */
public interface GraphAttribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Attribute)
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getGraphAttribute_Value()
	 * @model
	 * @generated
	 */
	Attribute getValue();

	/**
	 * Sets the value of the '{@link org.typhon.dsls.sirius.typhonml.GraphAttribute#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Attribute value);

} // GraphAttribute
